package androidx.media3.common;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v0 {
    public static final s0 a = new s0();

    static {
        androidx.media3.common.util.j0.K(0);
        androidx.media3.common.util.j0.K(1);
        androidx.media3.common.util.j0.K(2);
    }

    public int a(boolean z) {
        return p() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i, t0 t0Var, u0 u0Var, int i2, boolean z) {
        int i3 = f(i, t0Var, false).c;
        if (m(i3, u0Var, 0L).o != i) {
            return i + 1;
        }
        int iE = e(i3, i2, z);
        if (iE == -1) {
            return -1;
        }
        return m(iE, u0Var, 0L).n;
    }

    public int e(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == c(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == c(z) ? a(z) : i + 1;
        }
        org.mozilla.javascript.c.a();
        return 0;
    }

    public boolean equals(Object obj) {
        int iC;
        if (this != obj) {
            if (obj instanceof v0) {
                v0 v0Var = (v0) obj;
                if (v0Var.o() == o() && v0Var.h() == h()) {
                    u0 u0Var = new u0();
                    t0 t0Var = new t0();
                    u0 u0Var2 = new u0();
                    t0 t0Var2 = new t0();
                    for (int i = 0; i < o(); i++) {
                        if (m(i, u0Var, 0L).equals(v0Var.m(i, u0Var2, 0L))) {
                        }
                    }
                    for (int i2 = 0; i2 < h(); i2++) {
                        if (f(i2, t0Var, true).equals(v0Var.f(i2, t0Var2, true))) {
                        }
                    }
                    int iA = a(true);
                    if (iA == v0Var.a(true) && (iC = c(true)) == v0Var.c(true)) {
                        while (iA != iC) {
                            int iE = e(iA, 0, true);
                            if (iE == v0Var.e(iA, 0, true)) {
                                iA = iE;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract t0 f(int i, t0 t0Var, boolean z);

    public t0 g(Object obj, t0 t0Var) {
        return f(b(obj), t0Var, true);
    }

    public abstract int h();

    public int hashCode() {
        u0 u0Var = new u0();
        t0 t0Var = new t0();
        int iO = o() + 217;
        for (int i = 0; i < o(); i++) {
            iO = (iO * 31) + m(i, u0Var, 0L).hashCode();
        }
        int iH = h() + (iO * 31);
        for (int i2 = 0; i2 < h(); i2++) {
            iH = (iH * 31) + f(i2, t0Var, true).hashCode();
        }
        int iA = a(true);
        while (iA != -1) {
            iH = (iH * 31) + iA;
            iA = e(iA, 0, true);
        }
        return iH;
    }

    public final Pair i(u0 u0Var, t0 t0Var, int i, long j) {
        Pair pairJ = j(u0Var, t0Var, i, j, 0L);
        pairJ.getClass();
        return pairJ;
    }

    public final Pair j(u0 u0Var, t0 t0Var, int i, long j, long j2) {
        com.google.android.material.motion.a.j(i, o());
        m(i, u0Var, j2);
        if (j == -9223372036854775807L) {
            j = u0Var.l;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = u0Var.n;
        f(i2, t0Var, false);
        while (i2 < u0Var.o && t0Var.e != j) {
            int i3 = i2 + 1;
            if (f(i3, t0Var, false).e > j) {
                break;
            }
            i2 = i3;
        }
        f(i2, t0Var, true);
        long jMin = j - t0Var.e;
        long j3 = t0Var.d;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(jMin, j3 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = t0Var.b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public int k(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == a(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == a(z) ? c(z) : i - 1;
        }
        org.mozilla.javascript.c.a();
        return 0;
    }

    public abstract Object l(int i);

    public abstract u0 m(int i, u0 u0Var, long j);

    public final void n(int i, u0 u0Var) {
        m(i, u0Var, 0L);
    }

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}
