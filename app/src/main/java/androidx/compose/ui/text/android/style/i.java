package androidx.compose.ui.text.android.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends ReplacementSpan {
    public boolean A;
    public Paint.FontMetricsInt e;
    public int y;
    public int z;

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.e;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        l.f("fontMetrics");
        throw null;
    }

    public final int b() {
        if (!this.A) {
            androidx.compose.ui.text.internal.a.b("PlaceholderSpan is not laid out yet.");
        }
        return this.z;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        this.A = true;
        paint.getTextSize();
        this.e = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            androidx.compose.ui.text.internal.a.a("Invalid fontMetrics: line height can not be negative.");
        }
        this.y = (int) Math.ceil(0.0f);
        this.z = (int) Math.ceil(0.0f);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            if (fontMetricsInt.ascent > (-b())) {
                fontMetricsInt.ascent = -b();
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        if (!this.A) {
            androidx.compose.ui.text.internal.a.b("PlaceholderSpan is not laid out yet.");
        }
        return this.y;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}
