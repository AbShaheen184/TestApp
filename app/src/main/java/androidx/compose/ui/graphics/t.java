package androidx.compose.ui.graphics;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t {
    public static final long b = a0.d(4278190080L);
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final long h;
    public static final long i;
    public static final /* synthetic */ int j = 0;
    public final long a;

    static {
        a0.d(4282664004L);
        c = a0.d(4287137928L);
        a0.d(4291611852L);
        d = a0.d(4294967295L);
        e = a0.d(4294901760L);
        a0.d(4278255360L);
        f = a0.d(4278190335L);
        g = a0.d(4294967040L);
        a0.d(4278255615L);
        a0.d(4294902015L);
        h = a0.c(0);
        i = a0.b(0.0f, 0.0f, 0.0f, 0.0f, androidx.compose.ui.graphics.colorspace.d.u);
    }

    public /* synthetic */ t(long j2) {
        this.a = j2;
    }

    public static final long a(long j2, androidx.compose.ui.graphics.colorspace.c cVar) {
        androidx.compose.ui.graphics.colorspace.g gVarE;
        androidx.compose.ui.graphics.colorspace.c cVarF = f(j2);
        int i2 = cVarF.c;
        int i3 = cVar.c;
        if ((i2 | i3) < 0) {
            gVarE = androidx.compose.ui.graphics.colorspace.j.e(cVarF, cVar);
        } else {
            androidx.collection.z zVar = androidx.compose.ui.graphics.colorspace.h.a;
            int i4 = i2 | (i3 << 6);
            Object objB = zVar.b(i4);
            if (objB == null) {
                objB = androidx.compose.ui.graphics.colorspace.j.e(cVarF, cVar);
                zVar.h(i4, objB);
            }
            gVarE = (androidx.compose.ui.graphics.colorspace.g) objB;
        }
        return gVarE.a(j2);
    }

    public static long b(float f2, long j2) {
        return a0.b(h(j2), g(j2), e(j2), f2, f(j2));
    }

    public static final boolean c(long j2, long j3) {
        return j2 == j3;
    }

    public static final float d(long j2) {
        float f2;
        float f3;
        if ((63 & j2) == 0) {
            f2 = (float) kotlin.a.f((j2 >>> 56) & 255);
            f3 = 255.0f;
        } else {
            f2 = (float) kotlin.a.f((j2 >>> 6) & 1023);
            f3 = 1023.0f;
        }
        return f2 / f3;
    }

    public static final float e(long j2) {
        int i2;
        int i3;
        int i4;
        if ((63 & j2) == 0) {
            return ((float) kotlin.a.f((j2 >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 16) & 65535);
        int i5 = Short.MIN_VALUE & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + Token.ASSIGN_MOD;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - x.a;
                return i5 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final androidx.compose.ui.graphics.colorspace.c f(long j2) {
        float[] fArr = androidx.compose.ui.graphics.colorspace.d.a;
        return androidx.compose.ui.graphics.colorspace.d.y[(int) (j2 & 63)];
    }

    public static final float g(long j2) {
        int i2;
        int i3;
        int i4;
        if ((63 & j2) == 0) {
            return ((float) kotlin.a.f((j2 >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 32) & 65535);
        int i5 = Short.MIN_VALUE & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + Token.ASSIGN_MOD;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - x.a;
                return i5 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final float h(long j2) {
        int i2;
        int i3;
        int i4;
        if ((63 & j2) == 0) {
            return ((float) kotlin.a.f((j2 >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 48) & 65535);
        int i5 = Short.MIN_VALUE & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + Token.ASSIGN_MOD;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - x.a;
                return i5 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static String i(long j2) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(h(j2));
        sb.append(", ");
        sb.append(g(j2));
        sb.append(", ");
        sb.append(e(j2));
        sb.append(", ");
        sb.append(d(j2));
        sb.append(", ");
        return androidx.privacysandbox.ads.adservices.java.internal.a.t(sb, f(j2).a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return this.a == ((t) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return i(this.a);
    }
}
