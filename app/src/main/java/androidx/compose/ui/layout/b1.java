package androidx.compose.ui.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b1 implements androidx.compose.ui.unit.c {
    public boolean e;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(b1 b1Var, c1 c1Var) {
        b1Var.getClass();
        if (c1Var instanceof androidx.compose.ui.node.x0) {
            ((androidx.compose.ui.node.x0) c1Var).N(b1Var.e);
        }
    }

    public static void i(b1 b1Var, c1 c1Var, int i, int i2) {
        b1Var.getClass();
        b(b1Var, c1Var);
        c1Var.h0(androidx.compose.ui.unit.j.c((((long) i2) & 4294967295L) | (((long) i) << 32), c1Var.B), 0.0f, null);
    }

    public static void k(b1 b1Var, c1 c1Var, long j) {
        b1Var.getClass();
        b(b1Var, c1Var);
        c1Var.h0(androidx.compose.ui.unit.j.c(j, c1Var.B), 0.0f, null);
    }

    public static void l(b1 b1Var, c1 c1Var, int i, int i2) {
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (b1Var.f() == androidx.compose.ui.unit.m.e || b1Var.g() == 0) {
            b(b1Var, c1Var);
            c1Var.h0(androidx.compose.ui.unit.j.c(j, c1Var.B), 0.0f, null);
        } else {
            int iG = (b1Var.g() - c1Var.e) - ((int) (j >> 32));
            b(b1Var, c1Var);
            c1Var.h0(androidx.compose.ui.unit.j.c((((long) iG) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), c1Var.B), 0.0f, null);
        }
    }

    public static void m(b1 b1Var, c1 c1Var, int i, int i2) {
        int i3 = e1.b;
        d1 d1Var = d1.z;
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (b1Var.f() == androidx.compose.ui.unit.m.e || b1Var.g() == 0) {
            b(b1Var, c1Var);
            c1Var.h0(androidx.compose.ui.unit.j.c(j, c1Var.B), 0.0f, d1Var);
        } else {
            int iG = (b1Var.g() - c1Var.e) - ((int) (j >> 32));
            b(b1Var, c1Var);
            c1Var.h0(androidx.compose.ui.unit.j.c((((long) iG) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), c1Var.B), 0.0f, d1Var);
        }
    }

    public static void p(b1 b1Var, c1 c1Var, kotlin.jvm.functions.l lVar) {
        b1Var.getClass();
        long j = 0;
        b(b1Var, c1Var);
        c1Var.h0(androidx.compose.ui.unit.j.c((j & 4294967295L) | (j << 32), c1Var.B), 0.0f, lVar);
    }

    public static void s(b1 b1Var, c1 c1Var, long j) {
        int i = e1.b;
        d1 d1Var = d1.z;
        b1Var.getClass();
        b(b1Var, c1Var);
        c1Var.h0(androidx.compose.ui.unit.j.c(j, c1Var.B), 0.0f, d1Var);
    }

    public float c(p pVar) {
        return Float.NaN;
    }

    public abstract androidx.compose.ui.unit.m f();

    public abstract int g();
}
