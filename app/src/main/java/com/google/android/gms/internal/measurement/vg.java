package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class vg {
    public static final long d;
    public static final vg e;
    public final int a;
    public final int b;
    public final int c;

    static {
        long jCharAt = 0;
        for (int i = 0; i < 7; i++) {
            jCharAt |= (((long) i) + 1) << ((int) (((long) (" #(+,-0".charAt(i) - ' ')) * 3));
        }
        d = jCharAt;
        e = new vg(0, -1, -1);
    }

    public vg(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static int e(int i, int i2, String str) {
        if (i == i2) {
            throw androidx.compose.ui.res.e.b("missing precision", i - 1, str);
        }
        int i3 = 0;
        for (int i4 = i; i4 < i2; i4++) {
            char cCharAt = (char) (str.charAt(i4) - '0');
            if (cCharAt >= '\n') {
                throw androidx.compose.ui.res.e.b("invalid precision character", i4, str);
            }
            i3 = (i3 * 10) + cCharAt;
            if (i3 > 999999) {
                throw androidx.compose.ui.res.e.a("precision too large", i, str, i2);
            }
        }
        if (i3 != 0) {
            return i3;
        }
        if (i2 == i + 1) {
            return 0;
        }
        throw androidx.compose.ui.res.e.a("invalid precision", i, str, i2);
    }

    public final boolean a() {
        return this == e;
    }

    public final boolean b(int i, boolean z) {
        int i2;
        if (a()) {
            return true;
        }
        int i3 = ~i;
        int i4 = this.a;
        if ((i3 & i4) != 0) {
            return false;
        }
        if ((!z && this.c != -1) || (i4 & 9) == 9 || (i2 = i4 & 96) == 96) {
            return false;
        }
        return i2 == 0 || this.b != -1;
    }

    public final boolean c() {
        return (this.a & 128) != 0;
    }

    public final void d(StringBuilder sb) {
        if (a()) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = this.a & (-129);
            int i3 = 1 << i;
            if (i3 > i2) {
                break;
            }
            if ((i2 & i3) != 0) {
                sb.append(" #(+,-0".charAt(i));
            }
            i++;
        }
        int i4 = this.b;
        if (i4 != -1) {
            sb.append(i4);
        }
        int i5 = this.c;
        if (i5 != -1) {
            sb.append('.');
            sb.append(i5);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vg) {
            vg vgVar = (vg) obj;
            if (vgVar.a == this.a && vgVar.b == this.b && vgVar.c == this.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }
}
