package androidx.compose.ui.text.android.selection;

import android.text.TextPaint;
import okhttp3.internal.platform.android.g;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends g {
    public final CharSequence H;
    public final TextPaint I;

    public b(CharSequence charSequence, TextPaint textPaint) {
        this.H = charSequence;
        this.I = textPaint;
    }

    @Override // okhttp3.internal.platform.android.g
    public final int A(int i) {
        CharSequence charSequence = this.H;
        return this.I.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    @Override // okhttp3.internal.platform.android.g
    public final int E(int i) {
        CharSequence charSequence = this.H;
        return this.I.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }
}
