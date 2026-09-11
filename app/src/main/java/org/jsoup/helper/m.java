package org.jsoup.helper;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URISyntaxException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    public final d a;
    public final e b;
    public HttpURLConnection c;

    public m(d dVar, e eVar) {
        this.a = dVar;
        this.b = eVar;
    }

    public static HttpURLConnection a(d dVar) throws ProtocolException, MalformedURLException {
        String str;
        HashSet hashSet;
        HashSet hashSet2;
        dVar.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) dVar.e().openConnection();
        HashSet hashSet3 = null;
        switch (dVar.b) {
            case 1:
                str = "GET";
                break;
            case 2:
                str = "POST";
                break;
            case 3:
                str = "PUT";
                break;
            case 4:
                str = "DELETE";
                break;
            case 5:
                str = "PATCH";
                break;
            case 6:
                str = "HEAD";
                break;
            case 7:
                str = "OPTIONS";
                break;
            case 8:
                str = "TRACE";
                break;
            default:
                throw null;
        }
        httpURLConnection.setRequestMethod(str);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setConnectTimeout(dVar.f);
        httpURLConnection.setReadTimeout(dVar.f / 2);
        if (httpURLConnection instanceof HttpsURLConnection) {
        }
        if (com.google.android.datatransport.runtime.backends.c.j(dVar.b)) {
            httpURLConnection.setDoOutput(true);
        }
        Map map = a.a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry : dVar.d.entrySet()) {
            linkedHashSet.add(((String) entry.getKey()) + "=" + ((String) entry.getValue()));
        }
        try {
            for (Map.Entry<String, List<String>> entry2 : dVar.n.get(dVar.a.toURI(), a.a).entrySet()) {
                List<String> value = entry2.getValue();
                if (value != null && value.size() != 0) {
                    String key = entry2.getKey();
                    if ("Cookie".equals(key)) {
                        hashSet = hashSet3;
                        hashSet2 = linkedHashSet;
                    } else if ("Cookie2".equals(key)) {
                        hashSet2 = new HashSet();
                        hashSet = hashSet2;
                    }
                    hashSet2.addAll(value);
                    hashSet3 = hashSet;
                }
            }
            if (linkedHashSet.size() > 0) {
                httpURLConnection.addRequestProperty("Cookie", org.jsoup.internal.k.j(linkedHashSet, "; "));
            }
            if (hashSet3 != null && hashSet3.size() > 0) {
                httpURLConnection.addRequestProperty("Cookie2", org.jsoup.internal.k.j(hashSet3, "; "));
            }
            for (Map.Entry entry3 : dVar.c.entrySet()) {
                Iterator it = ((List) entry3.getValue()).iterator();
                while (it.hasNext()) {
                    httpURLConnection.addRequestProperty((String) entry3.getKey(), (String) it.next());
                }
            }
            return httpURLConnection;
        } catch (URISyntaxException e) {
            MalformedURLException malformedURLException = new MalformedURLException(e.getMessage());
            malformedURLException.initCause(e);
            throw malformedURLException;
        }
    }

    public final e b() throws IOException {
        d dVar = this.a;
        try {
            HttpURLConnection httpURLConnectionA = a(dVar);
            this.c = httpURLConnectionA;
            httpURLConnectionA.connect();
            if (this.c.getDoOutput()) {
                try {
                    OutputStream outputStream = this.c.getOutputStream();
                    try {
                        e.j(dVar, outputStream);
                        if (outputStream != null) {
                            outputStream.close();
                        }
                    } catch (Throwable th) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    this.c.disconnect();
                    throw e;
                }
            }
            e eVar = new e(dVar);
            eVar.i = this;
            eVar.b = com.google.android.datatransport.runtime.backends.c.z(this.c.getRequestMethod());
            eVar.a = this.c.getURL();
            eVar.f = this.c.getResponseCode();
            this.c.getResponseMessage();
            eVar.k = this.c.getContentType();
            eVar.l = this.c.getContentLength();
            HttpURLConnection httpURLConnection = this.c;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i = 0;
            while (true) {
                String headerFieldKey = httpURLConnection.getHeaderFieldKey(i);
                String headerField = httpURLConnection.getHeaderField(i);
                if (headerFieldKey == null && headerField == null) {
                    eVar.h(linkedHashMap, this.b);
                    return eVar;
                }
                i++;
                if (headerFieldKey != null && headerField != null) {
                    ((List) linkedHashMap.computeIfAbsent(headerFieldKey, new androidx.media3.exoplayer.audio.f(4))).add(headerField);
                }
            }
        } catch (IOException e2) {
            HttpURLConnection httpURLConnection2 = this.c;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
                this.c = null;
            }
            throw e2;
        }
    }
}
