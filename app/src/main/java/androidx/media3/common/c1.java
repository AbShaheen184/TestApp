package androidx.media3.common;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 {
    public static final c1 b;
    public final com.google.common.collect.h0 a;

    static {
        com.google.common.collect.e0 e0Var = com.google.common.collect.h0.y;
        b = new c1(com.google.common.collect.a1.B);
        androidx.media3.common.util.j0.K(0);
    }

    public c1(com.google.common.collect.a1 a1Var) {
        this.a = com.google.common.collect.h0.o(a1Var);
    }

    public final boolean a(int i) {
        int i2 = 0;
        while (true) {
            com.google.common.collect.h0 h0Var = this.a;
            if (i2 >= h0Var.size()) {
                return false;
            }
            b1 b1Var = (b1) h0Var.get(i2);
            for (boolean z : b1Var.e) {
                if (z) {
                    if (b1Var.b.c != i) {
                        break;
                    }
                    return true;
                }
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c1.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((c1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
