package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.DisplayMetrics;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {
    public static k0 a;
    public static final j0 b = new j0();
    public static Method c;
    public static Method d;
    public static boolean e;

    public static final androidx.compose.ui.geometry.c A(RectF rectF) {
        return new androidx.compose.ui.geometry.c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static String B(int i) {
        if (i == 0) {
            return "Clear";
        }
        if (i == 1) {
            return "Src";
        }
        if (i == 2) {
            return "Dst";
        }
        if (i == 3) {
            return "SrcOver";
        }
        if (i == 4) {
            return "DstOver";
        }
        if (i == 5) {
            return "SrcIn";
        }
        if (i == 6) {
            return "DstIn";
        }
        if (i == 7) {
            return "SrcOut";
        }
        if (i == 8) {
            return "DstOut";
        }
        if (i == 9) {
            return "SrcAtop";
        }
        if (i == 10) {
            return "DstAtop";
        }
        if (i == 11) {
            return "Xor";
        }
        if (i == 12) {
            return "Plus";
        }
        if (i == 13) {
            return "Modulate";
        }
        if (i == 14) {
            return "Screen";
        }
        if (i == 15) {
            return "Overlay";
        }
        if (i == 16) {
            return "Darken";
        }
        if (i == 17) {
            return "Lighten";
        }
        if (i == 18) {
            return "ColorDodge";
        }
        if (i == 19) {
            return "ColorBurn";
        }
        if (i == 20) {
            return "HardLight";
        }
        if (i == 21) {
            return "Softlight";
        }
        if (i == 22) {
            return "Difference";
        }
        if (i == 23) {
            return "Exclusion";
        }
        if (i == 24) {
            return "Multiply";
        }
        if (i == 25) {
            return "Hue";
        }
        if (i == 26) {
            return "Saturation";
        }
        if (i == 27) {
            return "Color";
        }
        return i == 28 ? "Luminosity" : "Unknown";
    }

    public static final int C(float f, float[] fArr, int i) {
        float f2 = f >= 0.0f ? f : 0.0f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (Math.abs(f2 - f) > 1.05E-6f) {
            f2 = Float.NaN;
        }
        fArr[i] = f2;
        return !Float.isNaN(f2) ? 1 : 0;
    }

    public static final c a(g gVar) {
        Canvas canvas = d.a;
        c cVar = new c();
        cVar.a = new Canvas(h.a(gVar));
        return cVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0147  */
    /* JADX WARN: Code duplicated, block: B:106:0x015e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0165  */
    /* JADX WARN: Code duplicated, block: B:113:0x0172 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0174  */
    /* JADX WARN: Code duplicated, block: B:116:0x0179  */
    /* JADX WARN: Code duplicated, block: B:118:0x017d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0181 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0185  */
    /* JADX WARN: Code duplicated, block: B:123:0x018e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0193  */
    /* JADX WARN: Code duplicated, block: B:126:0x0195  */
    /* JADX WARN: Code duplicated, block: B:128:0x019b  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:135:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:80:0x0103  */
    /* JADX WARN: Code duplicated, block: B:83:0x0111 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0113  */
    /* JADX WARN: Code duplicated, block: B:85:0x0116  */
    /* JADX WARN: Code duplicated, block: B:87:0x0119  */
    /* JADX WARN: Code duplicated, block: B:89:0x011d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0121 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0123 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0125  */
    /* JADX WARN: Code duplicated, block: B:94:0x012e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0134  */
    /* JADX WARN: Code duplicated, block: B:97:0x0137  */
    /* JADX WARN: Code duplicated, block: B:99:0x013d  */
    public static final long b(float f, float f2, float f3, float f4, androidx.compose.ui.graphics.colorspace.c cVar) {
        int i;
        int i2;
        int i3;
        float fB;
        float fA;
        int iFloatToRawIntBits;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        float fB2;
        float fA2;
        int iFloatToRawIntBits2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        float f5;
        if (cVar.c()) {
            float f6 = f4 < 0.0f ? 0.0f : f4;
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            int i20 = ((int) ((f6 * 255.0f) + 0.5f)) << 24;
            float f7 = f < 0.0f ? 0.0f : f;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i21 = i20 | (((int) ((f7 * 255.0f) + 0.5f)) << 16);
            float f8 = f2 < 0.0f ? 0.0f : f2;
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i22 = i21 | (((int) ((f8 * 255.0f) + 0.5f)) << 8);
            f5 = f3 >= 0.0f ? f3 : 0.0f;
            long j = ((long) (i22 | ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 255.0f) + 0.5f)))) << 32;
            int i23 = t.j;
            return j;
        }
        long j2 = cVar.b;
        int i24 = androidx.compose.ui.graphics.colorspace.b.e;
        if (((int) (j2 >> 32)) != 3) {
            d0.a("Color only works with ColorSpaces with 3 components");
        }
        int i25 = cVar.c;
        if (i25 == -1) {
            d0.a("Unknown color space, please use a color space in ColorSpaces");
        }
        int i26 = 0;
        float fB3 = cVar.b(0);
        float fA3 = cVar.a(0);
        if (f >= fB3) {
            fB3 = f;
        }
        if (fB3 <= fA3) {
            fA3 = fB3;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(fA3);
        int i27 = iFloatToRawIntBits3 >>> 31;
        int i28 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i29 = iFloatToRawIntBits3 & 8388607;
        if (i28 == 255) {
            i2 = i29 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i28 - 112;
            if (i >= 31) {
                i2 = 0;
                i = 49;
            } else {
                if (i > 0) {
                    int i30 = i29 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i3 = (((i << 10) | i30) + 1) | (i27 << 15);
                    } else {
                        i2 = i30;
                    }
                    short s = (short) i3;
                    fB = cVar.b(1);
                    fA = cVar.a(1);
                    if (f2 >= fB) {
                        fB = f2;
                    }
                    if (fB <= fA) {
                        fA = fB;
                    }
                    iFloatToRawIntBits = Float.floatToRawIntBits(fA);
                    i4 = iFloatToRawIntBits >>> 31;
                    i5 = (iFloatToRawIntBits >>> 23) & 255;
                    i6 = iFloatToRawIntBits & 8388607;
                    if (i5 == 255) {
                        if (i6 != 0) {
                            i9 = 512;
                        } else {
                            i9 = 0;
                        }
                        i7 = 31;
                    } else {
                        i7 = i5 - 112;
                        if (i7 >= 31) {
                            i9 = 0;
                            i7 = 49;
                        } else {
                            if (i7 <= 0) {
                                i8 = i6 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i10 = (((i7 << 10) | i8) + 1) | (i4 << 15);
                                } else {
                                    i9 = i8;
                                }
                                short s2 = (short) i10;
                                fB2 = cVar.b(2);
                                fA2 = cVar.a(2);
                                if (f3 >= fB2) {
                                    fB2 = f3;
                                }
                                if (fB2 <= fA2) {
                                    fA2 = fB2;
                                }
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                                i12 = iFloatToRawIntBits2 >>> 31;
                                i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i14 = 8388607 & iFloatToRawIntBits2;
                                if (i13 == 255) {
                                    i17 = i14 != 0 ? 512 : 0;
                                    i26 = 31;
                                } else {
                                    i15 = i13 - 112;
                                    if (i15 >= 31) {
                                        i17 = 0;
                                        i26 = 49;
                                    } else {
                                        if (i15 <= 0) {
                                            i16 = i14 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i18 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                                            } else {
                                                i17 = i16;
                                                i26 = i15;
                                            }
                                            short s3 = (short) i18;
                                            f5 = f4 >= 0.0f ? f4 : 0.0f;
                                            long j3 = (((long) i25) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((65535 & ((long) s3)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                            int i31 = t.j;
                                            return j3;
                                        }
                                        if (i15 >= -10) {
                                            i19 = (i14 | 8388608) >> (1 - i15);
                                            if ((i19 & 4096) != 0) {
                                                i19 += 8192;
                                            }
                                            i17 = i19 >> 13;
                                        } else {
                                            i17 = 0;
                                        }
                                    }
                                }
                                i18 = i17 | (i12 << 15) | (i26 << 10);
                                short s4 = (short) i18;
                                if (f4 >= 0.0f) {
                                }
                                long j4 = (((long) i25) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((65535 & ((long) s4)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i32 = t.j;
                                return j4;
                            }
                            if (i7 >= -10) {
                                i11 = (i6 | 8388608) >> (1 - i7);
                                if ((i11 & 4096) != 0) {
                                    i11 += 8192;
                                }
                                i9 = i11 >> 13;
                                i7 = 0;
                            } else {
                                i9 = 0;
                                i7 = 0;
                            }
                        }
                    }
                    i10 = i9 | (i4 << 15) | (i7 << 10);
                    short s5 = (short) i10;
                    fB2 = cVar.b(2);
                    fA2 = cVar.a(2);
                    if (f3 >= fB2) {
                        fB2 = f3;
                    }
                    if (fB2 <= fA2) {
                        fA2 = fB2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                    i12 = iFloatToRawIntBits2 >>> 31;
                    i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i14 = 8388607 & iFloatToRawIntBits2;
                    if (i13 == 255) {
                        i17 = i14 != 0 ? 512 : 0;
                        i26 = 31;
                    } else {
                        i15 = i13 - 112;
                        if (i15 >= 31) {
                            i17 = 0;
                            i26 = 49;
                        } else {
                            if (i15 <= 0) {
                                i16 = i14 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i18 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                                } else {
                                    i17 = i16;
                                    i26 = i15;
                                }
                                short s6 = (short) i18;
                                if (f4 >= 0.0f) {
                                }
                                long j5 = (((long) i25) & 63) | ((((long) s) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((65535 & ((long) s6)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i33 = t.j;
                                return j5;
                            }
                            if (i15 >= -10) {
                                i19 = (i14 | 8388608) >> (1 - i15);
                                if ((i19 & 4096) != 0) {
                                    i19 += 8192;
                                }
                                i17 = i19 >> 13;
                            } else {
                                i17 = 0;
                            }
                        }
                    }
                    i18 = i17 | (i12 << 15) | (i26 << 10);
                    short s7 = (short) i18;
                    if (f4 >= 0.0f) {
                    }
                    long j6 = (((long) i25) & 63) | ((((long) s) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((65535 & ((long) s7)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i34 = t.j;
                    return j6;
                }
                if (i >= -10) {
                    int i35 = (i29 | 8388608) >> (1 - i);
                    if ((i35 & 4096) != 0) {
                        i35 += 8192;
                    }
                    i2 = i35 >> 13;
                    i = 0;
                } else {
                    i2 = 0;
                    i = 0;
                }
            }
        }
        i3 = i2 | (i27 << 15) | (i << 10);
        short s8 = (short) i3;
        fB = cVar.b(1);
        fA = cVar.a(1);
        if (f2 >= fB) {
            fB = f2;
        }
        if (fB <= fA) {
            fA = fB;
        }
        iFloatToRawIntBits = Float.floatToRawIntBits(fA);
        i4 = iFloatToRawIntBits >>> 31;
        i5 = (iFloatToRawIntBits >>> 23) & 255;
        i6 = iFloatToRawIntBits & 8388607;
        if (i5 == 255) {
            if (i6 != 0) {
                i9 = 512;
            } else {
                i9 = 0;
            }
            i7 = 31;
        } else {
            i7 = i5 - 112;
            if (i7 >= 31) {
                i9 = 0;
                i7 = 49;
            } else {
                if (i7 <= 0) {
                    i8 = i6 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i10 = (((i7 << 10) | i8) + 1) | (i4 << 15);
                    } else {
                        i9 = i8;
                    }
                    short s9 = (short) i10;
                    fB2 = cVar.b(2);
                    fA2 = cVar.a(2);
                    if (f3 >= fB2) {
                        fB2 = f3;
                    }
                    if (fB2 <= fA2) {
                        fA2 = fB2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                    i12 = iFloatToRawIntBits2 >>> 31;
                    i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i14 = 8388607 & iFloatToRawIntBits2;
                    if (i13 == 255) {
                        i17 = i14 != 0 ? 512 : 0;
                        i26 = 31;
                    } else {
                        i15 = i13 - 112;
                        if (i15 >= 31) {
                            i17 = 0;
                            i26 = 49;
                        } else {
                            if (i15 <= 0) {
                                i16 = i14 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i18 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                                } else {
                                    i17 = i16;
                                    i26 = i15;
                                }
                                short s10 = (short) i18;
                                if (f4 >= 0.0f) {
                                }
                                long j7 = (((long) i25) & 63) | ((((long) s8) & 65535) << 48) | ((((long) s9) & 65535) << 32) | ((65535 & ((long) s10)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i36 = t.j;
                                return j7;
                            }
                            if (i15 >= -10) {
                                i19 = (i14 | 8388608) >> (1 - i15);
                                if ((i19 & 4096) != 0) {
                                    i19 += 8192;
                                }
                                i17 = i19 >> 13;
                            } else {
                                i17 = 0;
                            }
                        }
                    }
                    i18 = i17 | (i12 << 15) | (i26 << 10);
                    short s11 = (short) i18;
                    if (f4 >= 0.0f) {
                    }
                    long j8 = (((long) i25) & 63) | ((((long) s8) & 65535) << 48) | ((((long) s9) & 65535) << 32) | ((65535 & ((long) s11)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i37 = t.j;
                    return j8;
                }
                if (i7 >= -10) {
                    i11 = (i6 | 8388608) >> (1 - i7);
                    if ((i11 & 4096) != 0) {
                        i11 += 8192;
                    }
                    i9 = i11 >> 13;
                    i7 = 0;
                } else {
                    i9 = 0;
                    i7 = 0;
                }
            }
        }
        i10 = i9 | (i4 << 15) | (i7 << 10);
        short s12 = (short) i10;
        fB2 = cVar.b(2);
        fA2 = cVar.a(2);
        if (f3 >= fB2) {
            fB2 = f3;
        }
        if (fB2 <= fA2) {
            fA2 = fB2;
        }
        iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
        i12 = iFloatToRawIntBits2 >>> 31;
        i13 = (iFloatToRawIntBits2 >>> 23) & 255;
        i14 = 8388607 & iFloatToRawIntBits2;
        if (i13 == 255) {
            i17 = i14 != 0 ? 512 : 0;
            i26 = 31;
        } else {
            i15 = i13 - 112;
            if (i15 >= 31) {
                i17 = 0;
                i26 = 49;
            } else {
                if (i15 <= 0) {
                    i16 = i14 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i18 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                    } else {
                        i17 = i16;
                        i26 = i15;
                    }
                    short s13 = (short) i18;
                    if (f4 >= 0.0f) {
                    }
                    long j9 = (((long) i25) & 63) | ((((long) s8) & 65535) << 48) | ((((long) s12) & 65535) << 32) | ((65535 & ((long) s13)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i38 = t.j;
                    return j9;
                }
                if (i15 >= -10) {
                    i19 = (i14 | 8388608) >> (1 - i15);
                    if ((i19 & 4096) != 0) {
                        i19 += 8192;
                    }
                    i17 = i19 >> 13;
                } else {
                    i17 = 0;
                }
            }
        }
        i18 = i17 | (i12 << 15) | (i26 << 10);
        short s14 = (short) i18;
        if (f4 >= 0.0f) {
        }
        long j10 = (((long) i25) & 63) | ((((long) s8) & 65535) << 48) | ((((long) s12) & 65535) << 32) | ((65535 & ((long) s14)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
        int i39 = t.j;
        return j10;
    }

    public static final long c(int i) {
        long j = ((long) i) << 32;
        int i2 = t.j;
        return j;
    }

    public static final long d(long j) {
        long j2 = j << 32;
        int i = t.j;
        return j2;
    }

    public static long e(int i, int i2, int i3) {
        return c(((i & 255) << 16) | (-16777216) | ((i2 & 255) << 8) | (i3 & 255));
    }

    public static g f(int i, int i2, int i3) {
        Bitmap bitmapCreateBitmap;
        androidx.compose.ui.graphics.colorspace.q qVar = androidx.compose.ui.graphics.colorspace.d.e;
        Bitmap.Config configC = h.c(i3);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmapCreateBitmap = h.b(i, i2, i3, qVar);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, configC);
            bitmapCreateBitmap.setHasAlpha(true);
        }
        return new g(bitmapCreateBitmap);
    }

    public static final com.google.android.gms.cloudmessaging.n g() {
        return new com.google.android.gms.cloudmessaging.n(new Paint(7));
    }

    public static final long h(float f, float f2) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        int i = q0.c;
        return jFloatToRawIntBits;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0095  */
    /* JADX WARN: Code duplicated, block: B:32:0x0097  */
    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    /* JADX WARN: Code duplicated, block: B:36:0x009e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:65:0x0100  */
    /* JADX WARN: Code duplicated, block: B:66:0x0102  */
    /* JADX WARN: Code duplicated, block: B:68:0x0108  */
    /* JADX WARN: Code duplicated, block: B:70:0x0112  */
    public static final long i(float f, float f2, float f3, float f4, androidx.compose.ui.graphics.colorspace.c cVar) {
        int i;
        int i2;
        int i3;
        int iFloatToRawIntBits;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int iFloatToRawIntBits2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        if (cVar.c()) {
            long j = ((long) ((((((int) ((f4 * 255.0f) + 0.5f)) << 24) | (((int) ((f * 255.0f) + 0.5f)) << 16)) | (((int) ((f2 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f3) + 0.5f)))) << 32;
            int i18 = t.j;
            return j;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(f);
        int i19 = iFloatToRawIntBits3 >>> 31;
        int i20 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i21 = iFloatToRawIntBits3 & 8388607;
        int i22 = 49;
        int i23 = 0;
        if (i20 == 255) {
            i2 = i21 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i20 - 112;
            if (i >= 31) {
                i = 49;
                i2 = 0;
            } else {
                if (i > 0) {
                    int i24 = i21 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i3 = (((i << 10) | i24) + 1) | (i19 << 15);
                    } else {
                        i2 = i24;
                    }
                    short s = (short) i3;
                    iFloatToRawIntBits = Float.floatToRawIntBits(f2);
                    i4 = iFloatToRawIntBits >>> 31;
                    i5 = (iFloatToRawIntBits >>> 23) & 255;
                    i6 = iFloatToRawIntBits & 8388607;
                    if (i5 == 255) {
                        if (i6 != 0) {
                            i9 = 512;
                        } else {
                            i9 = 0;
                        }
                        i7 = 31;
                    } else {
                        i7 = i5 - 112;
                        if (i7 >= 31) {
                            i7 = 49;
                            i9 = 0;
                        } else {
                            if (i7 <= 0) {
                                i8 = i6 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i10 = (((i7 << 10) | i8) + 1) | (i4 << 15);
                                } else {
                                    i9 = i8;
                                }
                                short s2 = (short) i10;
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
                                i12 = iFloatToRawIntBits2 >>> 31;
                                i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i14 = 8388607 & iFloatToRawIntBits2;
                                if (i13 == 255) {
                                    i15 = i13 - 112;
                                    if (i15 < 31) {
                                        if (i15 <= 0) {
                                            i23 = i14 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i16 = (((i15 << 10) | i23) + 1) | (i12 << 15);
                                            } else {
                                                i22 = i15;
                                            }
                                        } else if (i15 >= -10) {
                                            i17 = (i14 | 8388608) >> (1 - i15);
                                            if ((i17 & 4096) != 0) {
                                                i17 += 8192;
                                            }
                                            i22 = 0;
                                            i23 = i17 >> 13;
                                        } else {
                                            i22 = 0;
                                        }
                                    }
                                    long jMax = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.c) & 63);
                                    int i25 = t.j;
                                    return jMax;
                                }
                                i23 = i14 == 0 ? 0 : 512;
                                i22 = 31;
                                i16 = (i12 << 15) | (i22 << 10) | i23;
                                long jMax2 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.c) & 63);
                                int i26 = t.j;
                                return jMax2;
                            }
                            if (i7 >= -10) {
                                i11 = (i6 | 8388608) >> (1 - i7);
                                if ((i11 & 4096) != 0) {
                                    i11 += 8192;
                                }
                                i9 = i11 >> 13;
                                i7 = 0;
                            } else {
                                i9 = 0;
                                i7 = 0;
                            }
                        }
                    }
                    i10 = i9 | (i4 << 15) | (i7 << 10);
                    short s3 = (short) i10;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
                    i12 = iFloatToRawIntBits2 >>> 31;
                    i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i14 = 8388607 & iFloatToRawIntBits2;
                    if (i13 == 255) {
                        i15 = i13 - 112;
                        if (i15 < 31) {
                            if (i15 <= 0) {
                                i23 = i14 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i16 = (((i15 << 10) | i23) + 1) | (i12 << 15);
                                } else {
                                    i22 = i15;
                                }
                            } else if (i15 >= -10) {
                                i17 = (i14 | 8388608) >> (1 - i15);
                                if ((i17 & 4096) != 0) {
                                    i17 += 8192;
                                }
                                i22 = 0;
                                i23 = i17 >> 13;
                            } else {
                                i22 = 0;
                            }
                        }
                        long jMax3 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s3) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.c) & 63);
                        int i27 = t.j;
                        return jMax3;
                    }
                    i23 = i14 == 0 ? 0 : 512;
                    i22 = 31;
                    i16 = (i12 << 15) | (i22 << 10) | i23;
                    long jMax4 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s3) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.c) & 63);
                    int i28 = t.j;
                    return jMax4;
                }
                if (i >= -10) {
                    int i29 = (i21 | 8388608) >> (1 - i);
                    if ((i29 & 4096) != 0) {
                        i29 += 8192;
                    }
                    i2 = i29 >> 13;
                    i = 0;
                } else {
                    i2 = 0;
                    i = 0;
                }
            }
        }
        i3 = i2 | (i19 << 15) | (i << 10);
        short s4 = (short) i3;
        iFloatToRawIntBits = Float.floatToRawIntBits(f2);
        i4 = iFloatToRawIntBits >>> 31;
        i5 = (iFloatToRawIntBits >>> 23) & 255;
        i6 = iFloatToRawIntBits & 8388607;
        if (i5 == 255) {
            if (i6 != 0) {
                i9 = 512;
            } else {
                i9 = 0;
            }
            i7 = 31;
        } else {
            i7 = i5 - 112;
            if (i7 >= 31) {
                i7 = 49;
                i9 = 0;
            } else {
                if (i7 <= 0) {
                    i8 = i6 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i10 = (((i7 << 10) | i8) + 1) | (i4 << 15);
                    } else {
                        i9 = i8;
                    }
                    short s5 = (short) i10;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
                    i12 = iFloatToRawIntBits2 >>> 31;
                    i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i14 = 8388607 & iFloatToRawIntBits2;
                    if (i13 == 255) {
                        i15 = i13 - 112;
                        if (i15 < 31) {
                            if (i15 <= 0) {
                                i23 = i14 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i16 = (((i15 << 10) | i23) + 1) | (i12 << 15);
                                } else {
                                    i22 = i15;
                                }
                            } else if (i15 >= -10) {
                                i17 = (i14 | 8388608) >> (1 - i15);
                                if ((i17 & 4096) != 0) {
                                    i17 += 8192;
                                }
                                i22 = 0;
                                i23 = i17 >> 13;
                            } else {
                                i22 = 0;
                            }
                        }
                        long jMax5 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s4) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.c) & 63);
                        int i210 = t.j;
                        return jMax5;
                    }
                    i23 = i14 == 0 ? 0 : 512;
                    i22 = 31;
                    i16 = (i12 << 15) | (i22 << 10) | i23;
                    long jMax6 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s4) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.c) & 63);
                    int i211 = t.j;
                    return jMax6;
                }
                if (i7 >= -10) {
                    i11 = (i6 | 8388608) >> (1 - i7);
                    if ((i11 & 4096) != 0) {
                        i11 += 8192;
                    }
                    i9 = i11 >> 13;
                    i7 = 0;
                } else {
                    i9 = 0;
                    i7 = 0;
                }
            }
        }
        i10 = i9 | (i4 << 15) | (i7 << 10);
        short s6 = (short) i10;
        iFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
        i12 = iFloatToRawIntBits2 >>> 31;
        i13 = (iFloatToRawIntBits2 >>> 23) & 255;
        i14 = 8388607 & iFloatToRawIntBits2;
        if (i13 == 255) {
            i15 = i13 - 112;
            if (i15 < 31) {
                if (i15 <= 0) {
                    i23 = i14 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i16 = (((i15 << 10) | i23) + 1) | (i12 << 15);
                    } else {
                        i22 = i15;
                    }
                } else if (i15 >= -10) {
                    i17 = (i14 | 8388608) >> (1 - i15);
                    if ((i17 & 4096) != 0) {
                        i17 += 8192;
                    }
                    i22 = 0;
                    i23 = i17 >> 13;
                } else {
                    i22 = 0;
                }
            }
            long jMax7 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s4) & 65535) << 48) | ((((long) s6) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.c) & 63);
            int i212 = t.j;
            return jMax7;
        }
        i23 = i14 == 0 ? 0 : 512;
        i22 = 31;
        i16 = (i12 << 15) | (i22 << 10) | i23;
        long jMax8 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s4) & 65535) << 48) | ((((long) s6) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.c) & 63);
        int i213 = t.j;
        return jMax8;
    }

    public static final long j(long j, long j2) {
        float f;
        float f2;
        long jA = t.a(j, t.f(j2));
        float fD = t.d(j2);
        float fD2 = t.d(jA);
        float f3 = 1.0f - fD2;
        float f4 = (fD * f3) + fD2;
        float fH = t.h(jA);
        float fH2 = t.h(j2);
        float f5 = 0.0f;
        if (f4 == 0.0f) {
            f = 0.0f;
        } else {
            f = (((fH2 * fD) * f3) + (fH * fD2)) / f4;
        }
        float fG = t.g(jA);
        float fG2 = t.g(j2);
        if (f4 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((fG2 * fD) * f3) + (fG * fD2)) / f4;
        }
        float fE = t.e(jA);
        float fE2 = t.e(j2);
        if (f4 != 0.0f) {
            f5 = (((fE2 * fD) * f3) + (fE * fD2)) / f4;
        }
        return i(f, f2, f5, f4, t.f(j2));
    }

    public static void k(androidx.compose.ui.graphics.drawscope.d dVar, a0 a0Var, long j) {
        if (a0Var instanceof h0) {
            androidx.compose.ui.geometry.c cVar = ((h0) a0Var).f;
            dVar.y0(3, j, (((long) Float.floatToRawIntBits(cVar.a)) << 32) | (((long) Float.floatToRawIntBits(cVar.b)) & 4294967295L), v(cVar));
            return;
        }
        boolean z = a0Var instanceof i0;
        androidx.compose.ui.graphics.drawscope.g gVar = androidx.compose.ui.graphics.drawscope.g.a;
        if (!z) {
            if (a0Var instanceof g0) {
                dVar.d0(((g0) a0Var).f, j, gVar);
                return;
            } else {
                coil3.g.a();
                return;
            }
        }
        i0 i0Var = (i0) a0Var;
        j jVar = i0Var.g;
        if (jVar != null) {
            dVar.d0(jVar, j, gVar);
            return;
        }
        androidx.compose.ui.geometry.d dVar2 = i0Var.f;
        float f = dVar2.b;
        float f2 = dVar2.a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar2.h >> 32));
        dVar.r(j, (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), (((long) Float.floatToRawIntBits(dVar2.c - f2)) << 32) | (((long) Float.floatToRawIntBits(dVar2.d - f)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), gVar);
    }

    public static void l(Canvas canvas, boolean z) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            b.a(canvas, z);
            return;
        }
        if (!e) {
            try {
                if (i == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    c = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    d = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    c = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    d = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = c;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = d;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            e = true;
        }
        if (z) {
            try {
                Method method4 = c;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z || (method = d) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static long n() {
        return t.d;
    }

    public static final androidx.compose.ui.r o(androidx.compose.ui.r rVar, kotlin.jvm.functions.l lVar) {
        return rVar.d(new n(lVar));
    }

    public static final androidx.compose.ui.r p(androidx.compose.ui.r rVar, float f, float f2, long j, n0 n0Var, boolean z, long j2, long j3) {
        return rVar.d(new z(f, f2, j, n0Var, z, j2, j3));
    }

    public static androidx.compose.ui.r q(androidx.compose.ui.r rVar, float f, n0 n0Var, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        long j = q0.b;
        if ((i & 2048) != 0) {
            n0Var = b;
        }
        long j2 = b0.a;
        return p(rVar, f2, 0.0f, j, n0Var, true, j2, j2);
    }

    public static final boolean r(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static final long s(long j, long j2, float f) {
        androidx.compose.ui.graphics.colorspace.l lVar = androidx.compose.ui.graphics.colorspace.d.x;
        long jA = t.a(j, lVar);
        long jA2 = t.a(j2, lVar);
        float fD = t.d(jA);
        float fH = t.h(jA);
        float fG = t.g(jA);
        float fE = t.e(jA);
        float fD2 = t.d(jA2);
        float fH2 = t.h(jA2);
        float fG2 = t.g(jA2);
        float fE2 = t.e(jA2);
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        return t.a(i(com.google.firebase.b.A(fH, fH2, f), com.google.firebase.b.A(fG, fG2, f), com.google.firebase.b.A(fE, fE2, f), com.google.firebase.b.A(fD, fD2, f), lVar), t.f(j2));
    }

    public static final void t(Matrix matrix, float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[12];
        float f11 = fArr[13];
        float f12 = fArr[15];
        fArr[0] = f;
        fArr[1] = f5;
        fArr[2] = f10;
        fArr[3] = f2;
        fArr[4] = f6;
        fArr[5] = f11;
        fArr[6] = f4;
        fArr[7] = f8;
        fArr[8] = f12;
        matrix.setValues(fArr);
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
        fArr[8] = f9;
    }

    public static final void u(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        fArr[0] = f;
        fArr[1] = f4;
        fArr[2] = 0.0f;
        fArr[3] = f7;
        fArr[4] = f2;
        fArr[5] = f5;
        fArr[6] = 0.0f;
        fArr[7] = f8;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f3;
        fArr[13] = f6;
        fArr[14] = 0.0f;
        fArr[15] = f9;
    }

    public static final long v(androidx.compose.ui.geometry.c cVar) {
        float f = cVar.c - cVar.a;
        return (((long) Float.floatToRawIntBits(cVar.d - cVar.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final Rect w(androidx.compose.ui.unit.k kVar) {
        return new Rect(kVar.a, kVar.b, kVar.c, kVar.d);
    }

    public static final RectF x(androidx.compose.ui.geometry.c cVar) {
        return new RectF(cVar.a, cVar.b, cVar.c, cVar.d);
    }

    public static final int y(long j) {
        float[] fArr = androidx.compose.ui.graphics.colorspace.d.a;
        return (int) (t.a(j, androidx.compose.ui.graphics.colorspace.d.e) >>> 32);
    }

    public static final androidx.compose.ui.geometry.c z(Rect rect) {
        return new androidx.compose.ui.geometry.c(rect.left, rect.top, rect.right, rect.bottom);
    }

    public abstract androidx.compose.ui.geometry.c m();
}
