package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import android.util.DisplayMetrics;
import java.util.function.DoubleUnaryOperator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final Bitmap a(g gVar) {
        if (gVar instanceof g) {
            return gVar.a;
        }
        com.google.gson.b.r("Unable to obtain android.graphics.Bitmap");
        return null;
    }

    public static final Bitmap b(int i, int i2, int i3, androidx.compose.ui.graphics.colorspace.c cVar) {
        ColorSpace rgb;
        ColorSpace colorSpaceA;
        ColorSpace colorSpace;
        Bitmap.Config configC = c(i3);
        if (kotlin.jvm.internal.l.a(cVar, androidx.compose.ui.graphics.colorspace.d.e)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (kotlin.jvm.internal.l.a(cVar, androidx.compose.ui.graphics.colorspace.d.q)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (kotlin.jvm.internal.l.a(cVar, androidx.compose.ui.graphics.colorspace.d.r)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (kotlin.jvm.internal.l.a(cVar, androidx.compose.ui.graphics.colorspace.d.o)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (kotlin.jvm.internal.l.a(cVar, androidx.compose.ui.graphics.colorspace.d.j)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (kotlin.jvm.internal.l.a(cVar, androidx.compose.ui.graphics.colorspace.d.i)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (kotlin.jvm.internal.l.a(cVar, androidx.compose.ui.graphics.colorspace.d.t)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (kotlin.jvm.internal.l.a(cVar, androidx.compose.ui.graphics.colorspace.d.s)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (kotlin.jvm.internal.l.a(cVar, androidx.compose.ui.graphics.colorspace.d.k)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (kotlin.jvm.internal.l.a(cVar, androidx.compose.ui.graphics.colorspace.d.l)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (kotlin.jvm.internal.l.a(cVar, androidx.compose.ui.graphics.colorspace.d.g)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (kotlin.jvm.internal.l.a(cVar, androidx.compose.ui.graphics.colorspace.d.h)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (kotlin.jvm.internal.l.a(cVar, androidx.compose.ui.graphics.colorspace.d.f)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (kotlin.jvm.internal.l.a(cVar, androidx.compose.ui.graphics.colorspace.d.m)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else {
            if (!kotlin.jvm.internal.l.a(cVar, androidx.compose.ui.graphics.colorspace.d.p)) {
                if (kotlin.jvm.internal.l.a(cVar, androidx.compose.ui.graphics.colorspace.d.n)) {
                    colorSpace = ColorSpace.get(ColorSpace.Named.SMPTE_C);
                } else if (Build.VERSION.SDK_INT >= 34 && (colorSpaceA = w.a(cVar)) != null) {
                    rgb = colorSpaceA;
                    configC = configC;
                } else if (cVar instanceof androidx.compose.ui.graphics.colorspace.q) {
                    String str = cVar.a;
                    androidx.compose.ui.graphics.colorspace.q qVar = (androidx.compose.ui.graphics.colorspace.q) cVar;
                    float[] fArrA = qVar.d.a();
                    androidx.compose.ui.graphics.colorspace.r rVar = qVar.g;
                    ColorSpace.Rgb.TransferParameters transferParameters = rVar != null ? new ColorSpace.Rgb.TransferParameters(rVar.b, rVar.c, rVar.d, rVar.e, rVar.f, rVar.g, rVar.a) : null;
                    if (transferParameters != null) {
                        rgb = new ColorSpace.Rgb(str, qVar.h, fArrA, transferParameters);
                    } else {
                        float[] fArr = qVar.h;
                        final androidx.compose.ui.graphics.colorspace.p pVar = qVar.l;
                        final int i4 = 0;
                        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.v
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d) {
                                switch (i4) {
                                    case 0:
                                        break;
                                }
                                return ((Number) pVar.invoke(Double.valueOf(d))).doubleValue();
                            }
                        };
                        final androidx.compose.ui.graphics.colorspace.p pVar2 = qVar.o;
                        final int i5 = 1;
                        rgb = new ColorSpace.Rgb(str, fArr, fArrA, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.v
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d) {
                                switch (i5) {
                                    case 0:
                                        break;
                                }
                                return ((Number) pVar2.invoke(Double.valueOf(d))).doubleValue();
                            }
                        }, qVar.e, qVar.f);
                    }
                } else {
                    configC = configC;
                    rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                }
                return Bitmap.createBitmap((DisplayMetrics) null, i, i2, configC, true, rgb);
            }
            colorSpace = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        rgb = colorSpace;
        configC = configC;
        return Bitmap.createBitmap((DisplayMetrics) null, i, i2, configC, true, rgb);
    }

    public static final Bitmap.Config c(int i) {
        if (i == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26 || i != 3) {
            return (i2 < 26 || i != 4) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.HARDWARE;
        }
        return Bitmap.Config.RGBA_F16;
    }

    public static final int d(Bitmap.Config config) {
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || config != Bitmap.Config.RGBA_F16) {
            return (i < 26 || config != Bitmap.Config.HARDWARE) ? 0 : 4;
        }
        return 3;
    }
}
