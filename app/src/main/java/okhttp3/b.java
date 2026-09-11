package okhttp3;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements n, o, m0 {
    public static final b e = new b();

    public static final k a(b bVar, String str) {
        k kVar = new k(str);
        k.d.put(str, kVar);
        return kVar;
    }

    public static final void b(List list, StringBuilder sb) {
        kotlin.ranges.b bVarO = com.google.android.material.resources.c.o(com.google.android.material.resources.c.r(0, list.size()), 2);
        int i = bVarO.e;
        int i2 = bVarO.y;
        int i3 = bVarO.z;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return;
        }
        while (true) {
            String str = (String) list.get(i);
            String str2 = (String) list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
            if (i == i2) {
                return;
            } else {
                i += i3;
            }
        }
    }

    public static d0 c(String str, u uVar) {
        str.getClass();
        kotlin.k kVarB = com.google.android.material.resources.g.b(uVar);
        Charset charset = (Charset) kVarB.e;
        u uVar2 = (u) kVarB.y;
        byte[] bytes = str.getBytes(charset);
        bytes.getClass();
        int length = bytes.length;
        okhttp3.internal.e.a(bytes.length, 0, length);
        return new d0(uVar2, length, bytes);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static l0 e(String str) {
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return l0.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return l0.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return l0.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return l0.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return l0.SSL_3_0;
        }
        net.luminis.tls.engine.impl.c.o("Unexpected TLS version: ".concat(str));
        return null;
    }

    public static z i(String str) throws IOException {
        if (str.equals("http/1.0")) {
            return z.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return z.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return z.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return z.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return z.SPDY_3;
        }
        if (str.equals("quic")) {
            return z.QUIC;
        }
        if (kotlin.text.r.O(str, "h3", false)) {
            return z.HTTP_3;
        }
        net.luminis.tls.engine.impl.c.t("Unexpected protocol: ".concat(str));
        return null;
    }

    public synchronized k d(String str) {
        k kVar;
        String strConcat;
        try {
            str.getClass();
            LinkedHashMap linkedHashMap = k.d;
            kVar = (k) linkedHashMap.get(str);
            if (kVar == null) {
                if (kotlin.text.r.O(str, "TLS_", false)) {
                    strConcat = "SSL_".concat(str.substring(4));
                } else {
                    strConcat = kotlin.text.r.O(str, "SSL_", false) ? "TLS_".concat(str.substring(4)) : str;
                }
                kVar = (k) linkedHashMap.get(strConcat);
                if (kVar == null) {
                    kVar = new k(str);
                }
                linkedHashMap.put(str, kVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return kVar;
    }

    @Override // okhttp3.o
    public List f(String str) throws UnknownHostException {
        str.getClass();
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            allByName.getClass();
            return kotlin.collections.n.V(allByName);
        } catch (NullPointerException e2) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
            unknownHostException.initCause(e2);
            throw unknownHostException;
        }
    }

    @Override // okhttp3.n
    public void g(s sVar, List list) {
        sVar.getClass();
    }

    @Override // okhttp3.n
    public List h(s sVar) {
        sVar.getClass();
        return kotlin.collections.u.e;
    }
}
