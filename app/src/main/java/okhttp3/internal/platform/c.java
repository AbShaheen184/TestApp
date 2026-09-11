package okhttp3.internal.platform;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.n;
import okhttp3.internal.platform.android.h;
import okhttp3.internal.platform.android.k;
import okhttp3.internal.platform.android.m;
import okhttp3.internal.platform.android.o;
import okhttp3.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends e implements d {
    public static final boolean e;
    public Context c;
    public final ArrayList d;

    static {
        e = Build.VERSION.SDK_INT < 29;
    }

    public c() {
        o oVar;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            oVar = new o(cls);
        } catch (Exception e2) {
            CopyOnWriteArraySet copyOnWriteArraySet = okhttp3.internal.platform.android.c.a;
            okhttp3.internal.platform.android.c.a(y.class.getName(), 5, "unable to load android socket classes", e2);
            oVar = null;
        }
        ArrayList arrayListN = n.N(new okhttp3.internal.platform.android.n[]{oVar, new m(okhttp3.internal.platform.android.e.e), new m(k.a), new m(h.a)});
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
        okhttp3.internal.tls.d bVar;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        okhttp3.internal.platform.android.b bVar2 = x509TrustManagerExtensions != null ? new okhttp3.internal.platform.android.b(x509TrustManager, x509TrustManagerExtensions) : null;
        if (bVar2 != null) {
            return bVar2;
        }
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            bVar = new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused2) {
            X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
            bVar = new okhttp3.internal.tls.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
        }
        return new okhttp3.internal.tls.a(bVar);
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
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        inetSocketAddress.getClass();
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            throw new IOException("Exception in connect", e2);
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
    public final boolean h(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // okhttp3.internal.platform.e
    public final void i(int i, String str, Throwable th) {
        if (i == 5) {
            Log.w("OkHttp", str, th);
        } else {
            Log.i("OkHttp", str, th);
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
