package androidx.compose.ui.input.key;

import android.view.KeyEvent;
import androidx.compose.ui.q;
import kotlin.jvm.functions.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends q implements e {
    public l L;
    public l M;

    @Override // androidx.compose.ui.input.key.e
    public final boolean g(KeyEvent keyEvent) {
        l lVar = this.M;
        if (lVar != null) {
            return ((Boolean) lVar.invoke(new b(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.input.key.e
    public final boolean x(KeyEvent keyEvent) {
        l lVar = this.L;
        if (lVar != null) {
            return ((Boolean) lVar.invoke(new b(keyEvent))).booleanValue();
        }
        return false;
    }
}
