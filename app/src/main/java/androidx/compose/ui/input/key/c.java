package androidx.compose.ui.input.key;

import android.view.KeyEvent;
import androidx.compose.ui.r;
import kotlin.jvm.functions.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final long a(int i) {
        long j = (((long) i) << 32) | (((long) 0) & 4294967295L);
        int i2 = a.F;
        return j;
    }

    public static final long b(KeyEvent keyEvent) {
        return a(keyEvent.getKeyCode());
    }

    public static final int c(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final r d(r rVar, l lVar) {
        return rVar.d(new d(lVar, null));
    }

    public static final r e(r rVar, l lVar) {
        return rVar.d(new d(null, lVar));
    }
}
