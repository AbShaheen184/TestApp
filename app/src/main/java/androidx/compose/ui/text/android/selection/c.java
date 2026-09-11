package androidx.compose.ui.text.android.selection;

import java.text.BreakIterator;
import okhttp3.internal.platform.android.g;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends g {
    public final BreakIterator H;

    public c(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.H = characterInstance;
    }

    @Override // okhttp3.internal.platform.android.g
    public final int A(int i) {
        return this.H.following(i);
    }

    @Override // okhttp3.internal.platform.android.g
    public final int E(int i) {
        return this.H.preceding(i);
    }
}
