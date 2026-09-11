package androidx.media3.common;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 {
    public static final f1 d = new f1(0, 0);
    public final int a;
    public final int b;
    public final float c;

    static {
        androidx.media3.common.util.j0.K(0);
        androidx.media3.common.util.j0.K(1);
        androidx.media3.common.util.j0.K(3);
    }

    public f1(float f, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f1) {
            f1 f1Var = (f1) obj;
            if (this.a == f1Var.a && this.b == f1Var.b && this.c == f1Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.c) + ((((217 + this.a) * 31) + this.b) * 31);
    }

    public f1(int i, int i2) {
        this(1.0f, i, i2);
    }
}
