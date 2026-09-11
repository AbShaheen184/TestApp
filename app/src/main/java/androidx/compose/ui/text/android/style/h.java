package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements LineHeightSpan {
    public final boolean A;
    public final float B;
    public final int C;
    public int D = Integer.MIN_VALUE;
    public int E = Integer.MIN_VALUE;
    public int F = Integer.MIN_VALUE;
    public int G = Integer.MIN_VALUE;
    public int H;
    public int I;
    public final float e;
    public final int y;
    public final boolean z;

    public h(float f, int i, boolean z, boolean z2, float f2, int i2) {
        this.e = f;
        this.y = i;
        this.z = z;
        this.A = z2;
        this.B = f2;
        this.C = i2;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            androidx.compose.ui.text.internal.a.b("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        double dCeil;
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        if (i5 - i6 <= 0) {
            return;
        }
        boolean z = i == 0;
        boolean z2 = i2 == this.y;
        int i7 = this.C;
        boolean z3 = this.A;
        boolean z4 = this.z;
        if (z && z2 && z4 && z3 && i7 != 2) {
            return;
        }
        if (this.D == Integer.MIN_VALUE) {
            int i8 = i5 - i6;
            int iCeil = (int) Math.ceil(this.e);
            int i9 = iCeil - i8;
            if (i7 != 1 || i9 > 0) {
                float fAbs = this.B;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                if (i9 <= 0) {
                    dCeil = Math.ceil(i9 * fAbs);
                } else {
                    dCeil = Math.ceil((1.0f - fAbs) * i9);
                }
                int i10 = (int) dCeil;
                int i11 = fontMetricsInt.descent;
                int i12 = i10 + i11;
                this.F = i12;
                int i13 = i12 - iCeil;
                this.E = i13;
                if (i7 == 0 || i9 >= 0) {
                    if (z4) {
                        i13 = fontMetricsInt.ascent;
                    }
                    this.D = i13;
                    if (z3) {
                        i12 = i11;
                    }
                    this.G = i12;
                    this.H = fontMetricsInt.ascent - i13;
                    this.I = i12 - i11;
                } else if (i7 == 2) {
                    int i14 = fontMetricsInt.ascent;
                    this.D = z4 ? Math.max(i14, i13) : Math.min(i14, i13);
                    int i15 = fontMetricsInt.descent;
                    int i16 = this.F;
                    this.G = z3 ? Math.min(i15, i16) : Math.max(i15, i16);
                    this.H = 0;
                    this.I = 0;
                }
            } else {
                int i17 = fontMetricsInt.ascent;
                this.E = i17;
                int i18 = fontMetricsInt.descent;
                this.F = i18;
                this.D = i17;
                this.G = i18;
                this.H = 0;
                this.I = 0;
            }
        }
        fontMetricsInt.ascent = z ? this.D : this.E;
        fontMetricsInt.descent = z2 ? this.G : this.F;
    }
}
