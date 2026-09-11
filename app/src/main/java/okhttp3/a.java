package okhttp3;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final o a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final i e;
    public final b f;
    public final ProxySelector g;
    public final s h;
    public final List i;
    public final List j;

    public a(String str, int i, o oVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, i iVar, b bVar, List list, List list2, ProxySelector proxySelector) {
        str.getClass();
        oVar.getClass();
        socketFactory.getClass();
        bVar.getClass();
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.a = oVar;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = iVar;
        this.f = bVar;
        this.g = proxySelector;
        com.google.android.material.shape.a0 a0Var = new com.google.android.material.shape.a0(1);
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            a0Var.c = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                net.luminis.tls.engine.impl.c.o("unexpected scheme: ".concat(str2));
                throw null;
            }
            a0Var.c = "https";
        }
        String strB = okhttp3.internal.d.b(okhttp3.internal.url.a.d(0, str, 0, 7));
        if (strB == null) {
            net.luminis.tls.engine.impl.c.o("unexpected host: ".concat(str));
            throw null;
        }
        a0Var.f = strB;
        if (1 > i || i >= 65536) {
            net.luminis.tls.engine.impl.c.p(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "unexpected port: "));
            throw null;
        }
        a0Var.b = i;
        this.h = a0Var.c();
        this.i = okhttp3.internal.g.j(list);
        this.j = okhttp3.internal.g.j(list2);
    }

    public final boolean a(a aVar) {
        aVar.getClass();
        return kotlin.jvm.internal.l.a(this.a, aVar.a) && kotlin.jvm.internal.l.a(this.f, aVar.f) && kotlin.jvm.internal.l.a(this.i, aVar.i) && kotlin.jvm.internal.l.a(this.j, aVar.j) && kotlin.jvm.internal.l.a(this.g, aVar.g) && kotlin.jvm.internal.l.a(this.c, aVar.c) && kotlin.jvm.internal.l.a(this.d, aVar.d) && kotlin.jvm.internal.l.a(this.e, aVar.e) && this.h.e == aVar.h.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.l.a(this.h, aVar.h) && a(aVar);
    }

    public final int hashCode() {
        return Objects.hashCode(this.e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((this.g.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.f.hashCode() + ((this.a.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.e(527, 31, this.h.i)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        s sVar = this.h;
        sb.append(sVar.d);
        sb.append(':');
        sb.append(sVar.e);
        sb.append(", ");
        sb.append("proxySelector=" + this.g);
        sb.append('}');
        return sb.toString();
    }
}
