package androidx.compose.ui.graphics;

import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements androidx.compose.ui.graphics.colorspace.i, androidx.compose.ui.text.input.g0 {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    public static /* bridge */ /* synthetic */ AutofillId e(Object obj) {
        return (AutofillId) obj;
    }

    public static /* bridge */ /* synthetic */ ContentCaptureSession f(Object obj) {
        return (ContentCaptureSession) obj;
    }

    @Override // androidx.compose.ui.graphics.colorspace.i
    public double a(double d) {
        switch (this.a) {
            case 13:
                double d2 = d < 0.0d ? -d : d;
                return Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case 14:
                double d3 = d < 0.0d ? -d : d;
                return Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : d3 * 0.07739938080495357d, d);
            case 15:
                float[] fArr = androidx.compose.ui.graphics.colorspace.d.a;
                return androidx.compose.ui.graphics.colorspace.d.b(androidx.compose.ui.graphics.colorspace.d.c, d);
            case 16:
                float[] fArr2 = androidx.compose.ui.graphics.colorspace.d.a;
                return androidx.compose.ui.graphics.colorspace.d.a(androidx.compose.ui.graphics.colorspace.d.c, d);
            case 17:
                float[] fArr3 = androidx.compose.ui.graphics.colorspace.d.a;
                return androidx.compose.ui.graphics.colorspace.d.d(androidx.compose.ui.graphics.colorspace.d.d, d);
            case 18:
                float[] fArr4 = androidx.compose.ui.graphics.colorspace.d.a;
                return androidx.compose.ui.graphics.colorspace.d.c(androidx.compose.ui.graphics.colorspace.d.d, d);
            default:
                return d;
        }
    }

    @Override // androidx.compose.ui.text.input.g0
    public androidx.compose.ui.text.input.e0 b(androidx.compose.ui.text.g gVar) {
        return new androidx.compose.ui.text.input.e0(gVar, androidx.compose.ui.text.input.p.a);
    }
}
