package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.input.pointer.e0;
import androidx.compose.ui.node.l;
import androidx.compose.ui.o;
import androidx.compose.ui.r;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final l a;

    static {
        float f = 40;
        float f2 = 10;
        a = new l(f2, f, f2, f);
    }

    public static final r a(boolean z, boolean z2, kotlin.jvm.functions.a aVar) {
        r e0Var = o.b;
        if (!z || !e.a) {
            return e0Var;
        }
        if (z2) {
            e0Var = new e0(a);
        }
        return e0Var.d(new a(aVar));
    }
}
