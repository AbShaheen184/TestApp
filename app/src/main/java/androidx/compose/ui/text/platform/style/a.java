package androidx.compose.ui.text.platform.style;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.ui.graphics.drawscope.e;
import androidx.compose.ui.graphics.drawscope.g;
import androidx.compose.ui.graphics.drawscope.h;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends CharacterStyle implements UpdateAppearance {
    public final e e;

    public a(e eVar) {
        this.e = eVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        if (textPaint != null) {
            g gVar = g.a;
            e eVar = this.e;
            if (l.a(eVar, gVar)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(eVar instanceof h)) {
                coil3.g.a();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            h hVar = (h) eVar;
            textPaint.setStrokeWidth(hVar.a);
            textPaint.setStrokeMiter(hVar.b);
            int i = hVar.d;
            if (i == 0) {
                join = Paint.Join.MITER;
            } else if (i == 1) {
                join = Paint.Join.ROUND;
            } else {
                join = i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER;
            }
            textPaint.setStrokeJoin(join);
            int i2 = hVar.c;
            if (i2 == 0) {
                cap = Paint.Cap.BUTT;
            } else if (i2 == 1) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
            }
            textPaint.setStrokeCap(cap);
            textPaint.setPathEffect(null);
        }
    }
}
