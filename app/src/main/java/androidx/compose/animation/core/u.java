package androidx.compose.animation.core;

import java.util.Arrays;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public float h;
    public float i;
    public final float[] j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;
    public final float o;
    public final boolean p;
    public final float q;
    public final float r;

    public u(int i, float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z;
        int i2;
        float f7;
        float f8;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        float f9 = f5 - f3;
        float f10 = f6 - f4;
        float f11 = 0.0f;
        int i3 = 1;
        boolean z2 = i == 1 || (i == 4 ? f10 > 0.0f : !(i != 5 || f10 >= 0.0f));
        float f12 = z2 ? -1.0f : 1.0f;
        this.m = f12;
        float f13 = 1 / (f2 - f);
        this.k = f13;
        float[] fArr = new float[Token.ASSIGN_LOGICAL_OR];
        this.j = fArr;
        boolean z3 = i == 3;
        if (z3 || Math.abs(f9) < 0.001f || Math.abs(f10) < 0.001f) {
            float fHypot = (float) Math.hypot(f10, f9);
            this.g = fHypot;
            this.l = fHypot * f13;
            this.q = f9 * f13;
            this.r = f10 * f13;
            this.n = Float.NaN;
            this.o = Float.NaN;
            z = true;
        } else {
            this.n = f9 * f12;
            this.o = f10 * (-f12);
            this.q = z2 ? f5 : f3;
            this.r = z2 ? f4 : f6;
            float f14 = f5 - f3;
            float f15 = f4 - f6;
            float[] fArr2 = e.i;
            int i4 = 90;
            float f16 = 90;
            float f17 = f15;
            float fHypot2 = 0.0f;
            float f18 = 0.0f;
            int i5 = 1;
            while (true) {
                i2 = i3;
                f7 = f11;
                double radians = (float) Math.toRadians((((double) i5) * 90.0d) / ((double) i4));
                float fSin = ((float) Math.sin(radians)) * f14;
                float fCos = ((float) Math.cos(radians)) * f15;
                float f19 = fSin - f18;
                f8 = f16;
                fHypot2 += (float) Math.hypot(f19, fCos - f17);
                fArr2[i5] = fHypot2;
                i4 = 90;
                if (i5 == 90) {
                    break;
                }
                i5++;
                f17 = fCos;
                f16 = f8;
                f11 = f7;
                f18 = fSin;
                i3 = i2;
            }
            this.g = fHypot2;
            int i6 = i2;
            while (true) {
                fArr2[i6] = fArr2[i6] / fHypot2;
                if (i6 == 90) {
                    break;
                } else {
                    i6++;
                }
            }
            int length = fArr.length;
            for (int i7 = 0; i7 < length; i7++) {
                float f20 = i7 / 100.0f;
                int iBinarySearch = Arrays.binarySearch(fArr2, 0, 91, f20);
                if (iBinarySearch >= 0) {
                    fArr[i7] = iBinarySearch / f8;
                } else if (iBinarySearch == -1) {
                    fArr[i7] = f7;
                } else {
                    int i8 = -iBinarySearch;
                    int i9 = i8 - 2;
                    float f21 = i9;
                    float f22 = fArr2[i9];
                    fArr[i7] = (((f20 - f22) / (fArr2[i8 - 1] - f22)) + f21) / f8;
                }
            }
            this.l = this.g * this.k;
            z = z3;
        }
        this.p = z;
    }

    public final float a() {
        float f = this.n * this.i;
        return f * this.m * (this.l / ((float) Math.hypot(f, (-this.o) * this.h)));
    }

    public final float b() {
        float f = this.n * this.i;
        float f2 = (-this.o) * this.h;
        return f2 * this.m * (this.l / ((float) Math.hypot(f, f2)));
    }

    public final void c(float f) {
        float f2 = (this.m == -1.0f ? this.b - f : f - this.a) * this.k;
        float f3 = 0.0f;
        if (f2 > 0.0f) {
            f3 = 1.0f;
            if (f2 < 1.0f) {
                float f4 = f2 * 100;
                int i = (int) f4;
                float[] fArr = this.j;
                float f5 = fArr[i];
                f3 = ((fArr[i + 1] - f5) * (f4 - i)) + f5;
            }
        }
        double d = f3 * 1.5707964f;
        this.h = (float) Math.sin(d);
        this.i = (float) Math.cos(d);
    }
}
