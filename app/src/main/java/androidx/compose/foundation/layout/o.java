package androidx.compose.foundation.layout;

import androidx.compose.animation.core.n1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements androidx.compose.ui.layout.q0 {
    public static final o b = new o(0);
    public static final o c = new o(1);
    public final /* synthetic */ int a;

    public /* synthetic */ o(int i) {
        this.a = i;
    }

    @Override // androidx.compose.ui.layout.q0
    public final androidx.compose.ui.layout.r0 a(androidx.compose.ui.layout.s0 s0Var, List list, long j) {
        switch (this.a) {
            case 0:
                return s0Var.q(androidx.compose.ui.unit.a.j(j), androidx.compose.ui.unit.a.i(j), kotlin.collections.v.e, new n1(23));
            default:
                return s0Var.q(androidx.compose.ui.unit.a.f(j) ? androidx.compose.ui.unit.a.h(j) : 0, androidx.compose.ui.unit.a.e(j) ? androidx.compose.ui.unit.a.g(j) : 0, kotlin.collections.v.e, new n1(23));
        }
    }
}
