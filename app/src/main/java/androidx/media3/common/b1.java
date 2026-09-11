package androidx.media3.common;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {
    public final int a;
    public final w0 b;
    public final boolean c;
    public final int[] d;
    public final boolean[] e;

    static {
        androidx.media3.common.util.j0.K(0);
        androidx.media3.common.util.j0.K(1);
        androidx.media3.common.util.j0.K(3);
        androidx.media3.common.util.j0.K(4);
    }

    public b1(w0 w0Var, boolean z, int[] iArr, boolean[] zArr) {
        int i = w0Var.a;
        this.a = i;
        boolean z2 = false;
        com.google.android.material.motion.a.f(i == iArr.length && i == zArr.length);
        this.b = w0Var;
        if (z && i > 1) {
            z2 = true;
        }
        this.c = z2;
        this.d = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }

    public final r a(int i) {
        return this.b.d[i];
    }

    public final boolean b(int i) {
        return this.d[i] == 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b1.class == obj.getClass()) {
            b1 b1Var = (b1) obj;
            if (this.c == b1Var.c && this.b.equals(b1Var.b) && Arrays.equals(this.d, b1Var.d) && Arrays.equals(this.e, b1Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + (((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31)) * 31);
    }
}
