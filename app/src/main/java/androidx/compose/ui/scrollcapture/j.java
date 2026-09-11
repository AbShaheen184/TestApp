package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.node.d1;
import androidx.compose.ui.semantics.p;
import androidx.compose.ui.unit.k;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public final p a;
    public final int b;
    public final k c;
    public final d1 d;

    public j(p pVar, int i, k kVar, d1 d1Var) {
        this.a = pVar;
        this.b = i;
        this.c = kVar;
        this.d = d1Var;
    }

    public final String toString() {
        return "ScrollCaptureCandidate(node=" + this.a + ", depth=" + this.b + ", viewportBoundsInWindow=" + this.c + ", coordinates=" + this.d + ')';
    }
}
