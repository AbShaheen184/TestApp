package okhttp3.internal.platform;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import android.util.Log;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.n;
import okhttp3.internal.platform.android.h;
import okhttp3.internal.platform.android.k;
import okhttp3.internal.platform.android.m;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends e implements d {
    public static final boolean e;
    public Context c;
    public final ArrayList d;

    static {
        e = Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        ArrayList arrayListN = n.N(new okhttp3.internal.platform.android.n[]{Build.VERSION.SDK_INT >= 29 ? new okhttp3.internal.platform.android.a() : null, new m(okhttp3.internal.platform.android.e.e), new m(k.a), new m(h.a)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListN) {
            if (((okhttp3.internal.platform.android.n) obj).a()) {
                arrayList.add(obj);
            }
        }
        this.d = arrayList;
    }

    @Override // okhttp3.internal.platform.d
    public final void a(Context context) {
        this.c = context;
    }

    @Override // okhttp3.internal.platform.d
    public final Context b() {
        return this.c;
    }

    @Override // okhttp3.internal.platform.e
    public final com.google.android.material.resources.b c(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        okhttp3.internal.platform.android.b bVar = x509TrustManagerExtensions != null ? new okhttp3.internal.platform.android.b(x509TrustManager, x509TrustManagerExtensions) : null;
        if (bVar != null) {
            return bVar;
        }
        StrictMode.noteSlowCall("buildTrustRootIndex");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new okhttp3.internal.tls.a(new okhttp3.internal.tls.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length)));
    }

    @Override // okhttp3.internal.platform.e
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object next;
        list.getClass();
        Iterator it = this.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((okhttp3.internal.platform.android.n) next).b(sSLSocket));
        okhttp3.internal.platform.android.n nVar = (okhttp3.internal.platform.android.n) next;
        if (nVar != null) {
            nVar.d(sSLSocket, str, list);
        }
    }

    @Override // okhttp3.internal.platform.e
    public final String f(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((okhttp3.internal.platform.android.n) next).b(sSLSocket));
        okhttp3.internal.platform.android.n nVar = (okhttp3.internal.platform.android.n) next;
        if (nVar != null) {
            return nVar.c(sSLSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.e
    public final Object g() {
        if (Build.VERSION.SDK_INT < 30) {
            return super.g();
        }
        CloseGuard closeGuard = new CloseGuard();
        closeGuard.open("response.body().close()");
        return closeGuard;
    }

    @Override // okhttp3.internal.platform.e
    public final boolean h(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // okhttp3.internal.platform.e
    public final void i(int i, String str, Throwable th) {
        if (i == 5) {
            boolean z = c.e;
            Log.w("OkHttp", str, th);
        } else {
            boolean z2 = c.e;
            Log.i("OkHttp", str, th);
        }
    }

    @Override // okhttp3.internal.platform.e
    public final void j(Object obj, String str) {
        if (Build.VERSION.SDK_INT < 30) {
            super.j(obj, str);
        } else {
            obj.getClass();
            ((CloseGuard) obj).warnIfOpen();
        }
    }

    @Override // okhttp3.internal.platform.e
    public final SSLContext k() throws NoSuchAlgorithmException {
        StrictMode.noteSlowCall("newSSLContext");
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.getClass();
        return sSLContext;
    }
}
