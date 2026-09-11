package androidx.compose.ui.text.platform.style;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.activity.w;
import androidx.compose.runtime.e0;
import androidx.compose.runtime.h1;
import androidx.compose.runtime.s;
import androidx.compose.ui.geometry.e;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.text.platform.k;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends CharacterStyle implements UpdateAppearance {
    public final l0 e;
    public final float y;
    public final h1 z = s.r(new e(9205357640488583168L));
    public final e0 A = s.k(new w(this, 22));

    public b(l0 l0Var, float f) {
        this.e = l0Var;
        this.y = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        k.c(textPaint, this.y);
        textPaint.setShader((Shader) this.A.getValue());
    }
}
