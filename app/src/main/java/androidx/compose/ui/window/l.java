package androidx.compose.ui.window;

import androidx.compose.ui.layout.q0;
import androidx.compose.ui.layout.r0;
import androidx.compose.ui.layout.s0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements q0 {
    public final /* synthetic */ z a;
    public final /* synthetic */ androidx.compose.ui.unit.m b;

    public l(z zVar, androidx.compose.ui.unit.m mVar) {
        this.a = zVar;
        this.b = mVar;
    }

    @Override // androidx.compose.ui.layout.q0
    public final r0 a(s0 s0Var, List list, long j) {
        this.a.setParentLayoutDirection(this.b);
        return s0Var.q(0, 0, kotlin.collections.v.e, d.B);
    }
}
