package okhttp3.internal.platform;

import android.os.Build;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import okhttp3.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static volatile e a;
    public static final Logger b;

    static {
        try {
            for (Map.Entry entry : okhttp3.internal.platform.android.c.b.entrySet()) {
                okhttp3.internal.platform.android.c.b((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (RuntimeException e) {
            System.err.println("Possibly running android unit test without robolectric");
            e.printStackTrace();
        } catch (UnsatisfiedLinkError e2) {
            System.err.println("Possibly running android unit test without robolectric");
            e2.printStackTrace();
        }
        e aVar = a.e ? new a() : null;
        if (aVar == null) {
            aVar = c.e ? new c() : null;
        }
        if (aVar == null) {
            net.luminis.tls.engine.impl.c.l(Build.VERSION.SDK_INT, "Expected Android API level 21+ but was ");
        } else {
            a = aVar;
            b = Logger.getLogger(y.class.getName());
        }
    }

    public abstract com.google.android.material.resources.b c(X509TrustManager x509TrustManager);

    public abstract void d(SSLSocket sSLSocket, String str, List list);

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        inetSocketAddress.getClass();
        socket.connect(inetSocketAddress, i);
    }

    public abstract String f(SSLSocket sSLSocket);

    public Object g() {
        if (b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public abstract boolean h(String str);

    public abstract void i(int i, String str, Throwable th);

    public void j(Object obj, String str) {
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(5, str, (Throwable) obj);
    }

    public abstract SSLContext k();

    public final String toString() {
        return getClass().getSimpleName();
    }
}
