package io.hopmonsdk.seed;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.media3.exoplayer.u;
import io.hopmonsdk.util.LogUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class SeedDiscovery {
    private static final long CACHE_TTL_MS = 300000;
    private static final int CONNECT_TIMEOUT_MS = 10000;
    private static final String DOH_URL_TEMPLATE = "https://cloudflare-dns.com/dns-query?name=%s&type=A";
    private static final int READ_TIMEOUT_MS = 10000;
    private static final String SEEDS_PATH = "/v1/seeds";
    public static final String TAG = "SeedDiscovery";
    private List<String> cachedApiIps;
    private List<String> cachedSeedIps;
    private long lastRefreshMs;
    private String lastSuccessfulApiIp;
    private String lastSuccessfulSeedIp;
    private final List<String> seedFqdns;
    private final ExecutorService bgExecutor = Executors.newSingleThreadExecutor();
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    int testPort = -1;
    String dohBaseUrl = "https://cloudflare-dns.com";
    private final Object cacheLock = new Object();

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public interface StringCallback {
        void onFailure(String str);

        void onSuccess(String str);
    }

    public SeedDiscovery(List<String> list) {
        List<String> list2 = Collections.EMPTY_LIST;
        this.cachedSeedIps = list2;
        this.cachedApiIps = list2;
        this.lastRefreshMs = 0L;
        this.seedFqdns = new ArrayList(list);
    }

    private static void applyTrustAll(HttpsURLConnection httpsURLConnection) throws NoSuchAlgorithmException, KeyManagementException {
        TrustManager[] trustManagerArr = {new X509TrustManager() { // from class: io.hopmonsdk.seed.SeedDiscovery.1
            @Override // javax.net.ssl.X509TrustManager
            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
            }
        }};
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, trustManagerArr, new SecureRandom());
        httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
        httpsURLConnection.setHostnameVerifier(new b());
    }

    private String buildUrl(String str, String str2) {
        if (this.testPort <= 0) {
            return androidx.privacysandbox.ads.adservices.java.internal.a.q("https://", str, str2);
        }
        return androidx.privacysandbox.ads.adservices.java.internal.a.m(this.testPort, str2, androidx.privacysandbox.ads.adservices.java.internal.a.x("http://", str, ":"));
    }

    private List<String> dohResolve(String str) {
        JSONArray jSONArrayOptJSONArray;
        ArrayList arrayList = new ArrayList();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.dohBaseUrl + "/dns-query?name=" + str + "&type=A").openConnection();
            httpURLConnection.setRequestProperty("accept", "application/dns-json");
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setRequestMethod("GET");
            if (httpURLConnection.getResponseCode() != 200) {
                httpURLConnection.disconnect();
                return arrayList;
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
            }
            bufferedReader.close();
            httpURLConnection.disconnect();
            JSONObject jSONObject = new JSONObject(sb.toString());
            if (jSONObject.optInt("Status", -1) == 0 && (jSONArrayOptJSONArray = jSONObject.optJSONArray("Answer")) != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                    if (jSONObject2.optInt("type", 0) == 1) {
                        String strTrim = jSONObject2.optString("data", "").trim();
                        if (isValidIpv4(strTrim)) {
                            arrayList.add(strTrim);
                        }
                    }
                }
            }
            return arrayList;
        } catch (Exception e) {
            LogUtils.e(TAG, "DoH resolution failed for %s: %s", str, e.getMessage());
            return arrayList;
        }
    }

    private void execute(String str, boolean z, StringCallback stringCallback) {
        this.bgExecutor.execute(new u(this, str, z, stringCallback));
    }

    private List<String> fetchApiIpsFromSeed(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            HttpURLConnection httpURLConnectionOpenSmartConnection = openSmartConnection(buildUrl(str, SEEDS_PATH));
            httpURLConnectionOpenSmartConnection.setConnectTimeout(10000);
            httpURLConnectionOpenSmartConnection.setReadTimeout(10000);
            httpURLConnectionOpenSmartConnection.setRequestMethod("GET");
            int responseCode = httpURLConnectionOpenSmartConnection.getResponseCode();
            if (responseCode != 200) {
                LogUtils.w(TAG, "Seed %s /v1/seeds returned HTTP %d", str, Integer.valueOf(responseCode));
                httpURLConnectionOpenSmartConnection.disconnect();
                return arrayList;
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnectionOpenSmartConnection.getInputStream()));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    httpURLConnectionOpenSmartConnection.disconnect();
                    LogUtils.d(TAG, "Seed %s returned %d API IPs", str, Integer.valueOf(arrayList.size()));
                    return arrayList;
                }
                String strTrim = line.trim();
                if (isValidIpv4(strTrim)) {
                    arrayList.add(strTrim);
                }
            }
        } catch (Exception e) {
            LogUtils.e(TAG, "Failed to fetch API IPs from seed %s: %s", str, e.getMessage());
            return arrayList;
        }
    }

    private List<String> forceRefresh() {
        ArrayList<String> arrayList = new ArrayList();
        for (String str : this.seedFqdns) {
            List<String> listDohResolve = dohResolve(str);
            LogUtils.d(TAG, "DoH %s -> %s", str, listDohResolve);
            arrayList.addAll(listDohResolve);
        }
        if (arrayList.isEmpty()) {
            LogUtils.e(TAG, "DoH resolved no seed IPs for %s", this.seedFqdns);
            return Collections.EMPTY_LIST;
        }
        synchronized (this.cacheLock) {
            this.cachedSeedIps = new ArrayList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : arrayList) {
            List<String> listFetchApiIpsFromSeed = fetchApiIpsFromSeed(str2);
            if (!listFetchApiIpsFromSeed.isEmpty()) {
                this.lastSuccessfulSeedIp = str2;
                arrayList2.addAll(listFetchApiIpsFromSeed);
                break;
            }
        }
        if (arrayList2.isEmpty()) {
            LogUtils.e(TAG, "No API IPs returned by any seed server", new Object[0]);
            return Collections.EMPTY_LIST;
        }
        Collections.shuffle(arrayList2);
        synchronized (this.cacheLock) {
            this.cachedApiIps = new ArrayList(arrayList2);
            this.lastRefreshMs = System.currentTimeMillis();
        }
        LogUtils.d(TAG, "API IP cache refreshed: %s", arrayList2);
        return new ArrayList(arrayList2);
    }

    private List<String> getOrRefreshApiIps() {
        return isCacheFresh() ? getCachedApiIps() : forceRefresh();
    }

    private static boolean isValidIpv4(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("^(\\d{1,3}\\.){3}\\d{1,3}$");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$applyTrustAll$1(String str, SSLSession sSLSession) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$execute$0(String str, boolean z, StringCallback stringCallback) {
        String str2;
        String strTryRequest;
        List<String> orRefreshApiIps = getOrRefreshApiIps();
        if (!orRefreshApiIps.isEmpty() && (strTryRequest = tryRequest(orRefreshApiIps, str, z)) != null) {
            postSuccess(stringCallback, strTryRequest);
            return;
        }
        LogUtils.w(TAG, "All API IPs failed, forcing cache refresh...", new Object[0]);
        List<String> listForceRefresh = forceRefresh();
        if (listForceRefresh.isEmpty()) {
            str2 = "All API IPs failed and seed refresh returned no IPs";
        } else {
            String strTryRequest2 = tryRequest(listForceRefresh, str, z);
            if (strTryRequest2 != null) {
                postSuccess(stringCallback, strTryRequest2);
                return;
            }
            str2 = "All API IPs failed after seed refresh";
        }
        postFailure(stringCallback, str2);
    }

    private static HttpURLConnection openSmartConnection(String str) throws NoSuchAlgorithmException, KeyManagementException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        if (httpURLConnection instanceof HttpsURLConnection) {
            applyTrustAll((HttpsURLConnection) httpURLConnection);
        }
        return httpURLConnection;
    }

    private void postFailure(StringCallback stringCallback, String str) {
        this.mainHandler.post(new a(stringCallback, str, 0));
    }

    private void postSuccess(StringCallback stringCallback, String str) {
        this.mainHandler.post(new a(stringCallback, str, 1));
    }

    private String tryRequest(List<String> list, String str, boolean z) {
        for (String str2 : list) {
            try {
                String strBuildUrl = buildUrl(str2, str);
                LogUtils.d(TAG, "%s %s", z ? "POST" : "GET", strBuildUrl);
                HttpURLConnection httpURLConnectionOpenSmartConnection = openSmartConnection(strBuildUrl);
                httpURLConnectionOpenSmartConnection.setConnectTimeout(10000);
                httpURLConnectionOpenSmartConnection.setReadTimeout(10000);
                httpURLConnectionOpenSmartConnection.setRequestMethod(z ? "POST" : "GET");
                if (z) {
                    httpURLConnectionOpenSmartConnection.setDoOutput(true);
                    httpURLConnectionOpenSmartConnection.getOutputStream().close();
                }
                int responseCode = httpURLConnectionOpenSmartConnection.getResponseCode();
                if (responseCode >= 500) {
                    LogUtils.w(TAG, "API IP %s returned HTTP %d, trying next", str2, Integer.valueOf(responseCode));
                    httpURLConnectionOpenSmartConnection.disconnect();
                } else {
                    if (responseCode != 200) {
                        LogUtils.w(TAG, "API IP %s returned HTTP %d (no retry)", str2, Integer.valueOf(responseCode));
                        httpURLConnectionOpenSmartConnection.disconnect();
                        return null;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnectionOpenSmartConnection.getInputStream()));
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                    }
                    bufferedReader.close();
                    httpURLConnectionOpenSmartConnection.disconnect();
                    String strTrim = sb.toString().trim();
                    if (!strTrim.isEmpty()) {
                        this.lastSuccessfulApiIp = str2;
                        LogUtils.d(TAG, "Success from API IP %s", str2);
                        return strTrim;
                    }
                    LogUtils.w(TAG, "API IP %s returned empty body, trying next", str2);
                }
            } catch (Exception e) {
                LogUtils.e(TAG, "Request to %s failed: %s", str2, e.getMessage());
            }
        }
        return null;
    }

    public void executeGet(String str, StringCallback stringCallback) {
        execute(str, false, stringCallback);
    }

    public void executePost(String str, StringCallback stringCallback) {
        execute(str, true, stringCallback);
    }

    public List<String> getCachedApiIps() {
        ArrayList arrayList;
        synchronized (this.cacheLock) {
            arrayList = new ArrayList(this.cachedApiIps);
        }
        return arrayList;
    }

    public String getLastSuccessfulApiIp() {
        return this.lastSuccessfulApiIp;
    }

    public String getLastSuccessfulSeedIp() {
        return this.lastSuccessfulSeedIp;
    }

    public boolean isCacheFresh() {
        boolean z;
        synchronized (this.cacheLock) {
            try {
                z = !this.cachedApiIps.isEmpty() && System.currentTimeMillis() - this.lastRefreshMs < CACHE_TTL_MS;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
