package okhttp3;

import androidx.compose.foundation.lazy.layout.b1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {
    public b0 a;
    public z b;
    public String d;
    public q e;
    public okio.g0 h;
    public g0 i;
    public g0 j;
    public g0 k;
    public long l;
    public long m;
    public b1 n;
    public int c = -1;
    public j0 g = j0.y;
    public m0 o = m0.w;
    public com.caverock.androidsvg.m f = new com.caverock.androidsvg.m(1);

    public static void b(String str, g0 g0Var) {
        if (g0Var != null) {
            if (g0Var.F != null) {
                net.luminis.tls.engine.impl.c.p(str.concat(".networkResponse != null"));
            } else if (g0Var.G != null) {
                net.luminis.tls.engine.impl.c.p(str.concat(".cacheResponse != null"));
            } else {
                if (g0Var.H == null) {
                    return;
                }
                net.luminis.tls.engine.impl.c.p(str.concat(".priorResponse != null"));
            }
        }
    }

    public final g0 a() {
        int i = this.c;
        if (i < 0) {
            net.luminis.tls.engine.impl.c.b(this.c, "code < 0: ");
            return null;
        }
        b0 b0Var = this.a;
        if (b0Var == null) {
            net.luminis.tls.engine.impl.c.r("request == null");
            return null;
        }
        z zVar = this.b;
        if (zVar == null) {
            net.luminis.tls.engine.impl.c.r("protocol == null");
            return null;
        }
        String str = this.d;
        if (str != null) {
            return new g0(b0Var, zVar, str, i, this.e, this.f.f(), this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
        }
        net.luminis.tls.engine.impl.c.r("message == null");
        return null;
    }
}
