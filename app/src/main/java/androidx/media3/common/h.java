package androidx.media3.common;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final h h = new h(1, 2, 3, null, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    public final int e;
    public final int f;
    public int g;

    static {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.A(0, 1, 2, 3, 4);
        androidx.media3.common.util.j0.K(5);
    }

    public h(int i, int i2, int i3, byte[] bArr, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = bArr;
        this.e = i4;
        this.f = i5;
    }

    public static String a(int i) {
        if (i == -1) {
            return "Unset color range";
        }
        if (i != 1) {
            return i != 2 ? androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "Undefined color range ") : "Limited range";
        }
        return "Full range";
    }

    public static String b(int i) {
        if (i == -1) {
            return "Unset color space";
        }
        if (i == 6) {
            return "BT2020";
        }
        if (i != 1) {
            return i != 2 ? androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "Undefined color space ") : "BT601";
        }
        return "BT709";
    }

    public static String c(int i) {
        if (i == -1) {
            return "Unset color transfer";
        }
        if (i == 10) {
            return "Gamma 2.2";
        }
        if (i == 1) {
            return "Linear";
        }
        if (i == 2) {
            return "sRGB";
        }
        if (i == 3) {
            return "SDR SMPTE 170M";
        }
        if (i != 6) {
            return i != 7 ? androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "Undefined color transfer ") : "HLG";
        }
        return "ST2084 PQ";
    }

    public static boolean e(h hVar) {
        if (hVar == null) {
            return true;
        }
        int i = hVar.a;
        if (i != -1 && i != 1 && i != 2) {
            return false;
        }
        int i2 = hVar.b;
        if (i2 != -1 && i2 != 2) {
            return false;
        }
        int i3 = hVar.c;
        if ((i3 != -1 && i3 != 3) || hVar.d != null) {
            return false;
        }
        int i4 = hVar.f;
        if (i4 != -1 && i4 != 8) {
            return false;
        }
        int i5 = hVar.e;
        return i5 == -1 || i5 == 8;
    }

    public static int f(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int g(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean d() {
        return (this.a == -1 || this.b == -1 || this.c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (this.a == hVar.a && this.b == hVar.b && this.c == hVar.c && Arrays.equals(this.d, hVar.d) && this.e == hVar.e && this.f == hVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.g == 0) {
            this.g = ((((Arrays.hashCode(this.d) + ((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31)) * 31) + this.e) * 31) + this.f;
        }
        return this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(b(this.a));
        sb.append(", ");
        sb.append(a(this.b));
        sb.append(", ");
        sb.append(c(this.c));
        sb.append(", ");
        sb.append(this.d != null);
        sb.append(", ");
        int i = this.e;
        sb.append(i != -1 ? androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.d(i, "bit Luma") : "NA");
        sb.append(", ");
        int i2 = this.f;
        return androidx.privacysandbox.ads.adservices.java.internal.a.u(sb, i2 != -1 ? androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.d(i2, "bit Chroma") : "NA", ")");
    }
}
