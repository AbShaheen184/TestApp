package okhttp3;

import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x {
    public int A;
    public int B;
    public int C;
    public long D;
    public com.google.android.material.internal.b E;
    public okhttp3.internal.concurrent.d F;
    public com.google.android.material.internal.b b;
    public net.luminis.tls.engine.impl.c e;
    public boolean f;
    public boolean g;
    public b h;
    public boolean i;
    public boolean j;
    public n k;
    public f l;
    public o m;
    public ProxySelector n;
    public b o;
    public SocketFactory p;
    public SSLSocketFactory q;
    public X509TrustManager r;
    public List s;
    public List t;
    public okhttp3.internal.tls.c u;
    public i v;
    public com.google.android.material.resources.b w;
    public int x;
    public int y;
    public int z;
    public com.google.firebase.messaging.o a = new com.google.firebase.messaging.o(23);
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();

    public x() {
        TimeZone timeZone = okhttp3.internal.g.a;
        this.e = new net.luminis.tls.engine.impl.c(11);
        this.f = true;
        this.g = true;
        b bVar = b.e;
        this.h = bVar;
        this.i = true;
        this.j = true;
        this.k = n.u;
        this.m = o.v;
        this.o = bVar;
        SocketFactory socketFactory = SocketFactory.getDefault();
        socketFactory.getClass();
        this.p = socketFactory;
        this.s = y.H;
        this.t = y.G;
        this.u = okhttp3.internal.tls.c.a;
        this.v = i.c;
        this.y = 10000;
        this.z = 10000;
        this.A = 10000;
        this.C = 60000;
        this.D = 1024L;
    }

    public final void a(long j) {
        TimeUnit.SECONDS.getClass();
        this.y = okhttp3.internal.g.b("timeout", j);
    }

    public final void b(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(list);
        z zVar = z.H2_PRIOR_KNOWLEDGE;
        if (!arrayList.contains(zVar) && !arrayList.contains(z.HTTP_1_1)) {
            net.luminis.tls.engine.impl.c.n(arrayList, "protocols must contain h2_prior_knowledge or http/1.1: ");
            return;
        }
        if (arrayList.contains(zVar) && arrayList.size() > 1) {
            net.luminis.tls.engine.impl.c.n(arrayList, "protocols containing h2_prior_knowledge cannot use other protocols: ");
            return;
        }
        if (arrayList.contains(z.HTTP_1_0)) {
            net.luminis.tls.engine.impl.c.n(arrayList, "protocols must not contain http/1.0: ");
            return;
        }
        if (arrayList.contains(null)) {
            net.luminis.tls.engine.impl.c.o("protocols must not contain null");
            return;
        }
        arrayList.remove(z.SPDY_3);
        if (!arrayList.equals(this.t)) {
            this.E = null;
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        listUnmodifiableList.getClass();
        this.t = listUnmodifiableList;
    }

    public final void c(long j) {
        TimeUnit.SECONDS.getClass();
        this.z = okhttp3.internal.g.b("timeout", j);
    }
}
