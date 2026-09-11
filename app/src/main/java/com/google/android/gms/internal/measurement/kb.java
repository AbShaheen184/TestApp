package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class kb {
    public static final kb b;
    public final com.google.common.collect.m0 a;

    static {
        int i = com.google.common.collect.m0.C;
        b = new kb(com.google.common.collect.i1.E);
    }

    public kb(com.google.common.collect.m0 m0Var) {
        this.a = m0Var;
    }

    public static kb a(w0 w0Var) throws t1 {
        String strW;
        long j;
        jb jbVar;
        int iG = w0Var.G();
        if (iG < 0) {
            androidx.transition.k.q("Negative number of flags");
            return null;
        }
        int i = com.google.common.collect.m0.C;
        com.google.common.collect.l0 l0Var = new com.google.common.collect.l0();
        long j2 = 0;
        for (int i2 = 0; i2 < iG; i2++) {
            long jH = w0Var.H();
            int i3 = (int) jH;
            long j3 = jH >>> 3;
            if (j3 == 0) {
                j = 0;
                strW = w0Var.w();
            } else {
                long j4 = j3 + j2;
                if (j4 > 2305843009213693951L) {
                    androidx.transition.k.q("Flag name larger than max size");
                    return null;
                }
                strW = null;
                j = j4;
            }
            int i4 = i3 & 7;
            if (i4 == 0 || i4 == 1) {
                jbVar = new jb(j, strW, i4, 0L, null);
            } else if (i4 == 2) {
                jbVar = new jb(j, strW, i4, w0Var.H(), null);
            } else if (i4 == 3) {
                jbVar = new jb(j, strW, i4, Double.doubleToRawLongBits(w0Var.o()), null);
            } else if (i4 == 4) {
                jbVar = new jb(j, strW, i4, 0L, w0Var.w());
            } else {
                if (i4 != 5) {
                    androidx.transition.k.q(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.e(i4, "Unrecognized flag type ", new StringBuilder(String.valueOf(i4).length() + 23)));
                    return null;
                }
                jbVar = new jb(j, strW, i4, 0L, w0Var.z());
            }
            long j5 = jbVar.e;
            if (j5 != 0) {
                j2 = j5;
            }
            l0Var.b(jbVar);
        }
        return new kb(l0Var.h());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kb)) {
            return false;
        }
        return this.a.equals(((kb) obj).a);
    }

    public final int hashCode() {
        com.google.common.collect.m0 m0Var = this.a;
        m0Var.getClass();
        return com.google.common.collect.q.m(m0Var);
    }
}
