package okhttp3.internal.platform.android;

import com.google.android.gms.measurement.internal.c0;
import com.google.android.gms.measurement.internal.f0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class e implements n {
    public static final c0 e = new c0(17);
    public final Class a;
    public final Method b;
    public final Method c;
    public final Method d;

    public e(Class cls) throws NoSuchMethodException {
        this.a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        declaredMethod.getClass();
        this.b = declaredMethod;
        cls.getMethod("setHostname", String.class);
        this.c = cls.getMethod("getAlpnSelectedProtocol", null);
        this.d = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // okhttp3.internal.platform.android.n
    public final boolean a() {
        boolean z = okhttp3.internal.platform.c.e;
        return okhttp3.internal.platform.c.e;
    }

    @Override // okhttp3.internal.platform.android.n
    public final boolean b(SSLSocket sSLSocket) {
        return this.a.isInstance(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.n
    public final String c(SSLSocket sSLSocket) {
        if (this.a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.c.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, kotlin.text.a.a);
                }
            } catch (IllegalAccessException e2) {
                net.luminis.tls.engine.impl.c.m(e2);
                return null;
            } catch (InvocationTargetException e3) {
                Throwable cause = e3.getCause();
                if (!(cause instanceof NullPointerException) || !kotlin.jvm.internal.l.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    net.luminis.tls.engine.impl.c.m(e3);
                    return null;
                }
            }
        }
        return null;
    }

    @Override // okhttp3.internal.platform.android.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (this.a.isInstance(sSLSocket)) {
            try {
                this.b.invoke(sSLSocket, Boolean.TRUE);
                Method method = this.d;
                okhttp3.internal.platform.e eVar = okhttp3.internal.platform.e.a;
                method.invoke(sSLSocket, f0.f(list));
            } catch (IllegalAccessException e2) {
                net.luminis.tls.engine.impl.c.m(e2);
            } catch (InvocationTargetException e3) {
                net.luminis.tls.engine.impl.c.m(e3);
            }
        }
    }
}
