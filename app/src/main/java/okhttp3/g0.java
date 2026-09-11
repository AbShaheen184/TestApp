package okhttp3;

import androidx.compose.foundation.lazy.layout.b1;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements Closeable {
    public final int A;
    public final q B;
    public final r C;
    public final j0 D;
    public final okio.g0 E;
    public final g0 F;
    public final g0 G;
    public final g0 H;
    public final long I;
    public final long J;
    public final b1 K;
    public final m0 L;
    public g M;
    public final boolean N;
    public final b0 e;
    public final z y;
    public final String z;

    public g0(b0 b0Var, z zVar, String str, int i, q qVar, r rVar, j0 j0Var, okio.g0 g0Var, g0 g0Var2, g0 g0Var3, g0 g0Var4, long j, long j2, b1 b1Var, m0 m0Var) {
        b0Var.getClass();
        zVar.getClass();
        str.getClass();
        j0Var.getClass();
        m0Var.getClass();
        this.e = b0Var;
        this.y = zVar;
        this.z = str;
        this.A = i;
        this.B = qVar;
        this.C = rVar;
        this.D = j0Var;
        this.E = g0Var;
        this.F = g0Var2;
        this.G = g0Var3;
        this.H = g0Var4;
        this.I = j;
        this.J = j2;
        this.K = b1Var;
        this.L = m0Var;
        boolean z = false;
        if (200 <= i && i < 300) {
            z = true;
        }
        this.N = z;
    }

    public static String g(String str, g0 g0Var) {
        g0Var.getClass();
        String strB = g0Var.C.b(str);
        if (strB == null) {
            return null;
        }
        return strB;
    }

    public final g a() {
        g gVar = this.M;
        if (gVar != null) {
            return gVar;
        }
        int i = g.n;
        g gVarY = kotlin.collections.a0.y(this.C);
        this.M = gVarY;
        return gVarY;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.D.close();
    }

    public final f0 m() {
        f0 f0Var = new f0();
        f0Var.c = -1;
        f0Var.g = j0.y;
        f0Var.o = m0.w;
        f0Var.a = this.e;
        f0Var.b = this.y;
        f0Var.c = this.A;
        f0Var.d = this.z;
        f0Var.e = this.B;
        f0Var.f = this.C.d();
        f0Var.g = this.D;
        f0Var.h = this.E;
        f0Var.i = this.F;
        f0Var.j = this.G;
        f0Var.k = this.H;
        f0Var.l = this.I;
        f0Var.m = this.J;
        f0Var.n = this.K;
        f0Var.o = this.L;
        return f0Var;
    }

    public final String toString() {
        return "Response{protocol=" + this.y + ", code=" + this.A + ", message=" + this.z + ", url=" + this.e.a + '}';
    }

    public final b0 w() {
        return this.e;
    }
}
