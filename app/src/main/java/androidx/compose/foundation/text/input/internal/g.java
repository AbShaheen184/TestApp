package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.r0;
import androidx.compose.ui.platform.k2;
import androidx.compose.ui.platform.m1;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ i y;

    public /* synthetic */ g(i iVar, int i) {
        this.e = i;
        this.y = iVar;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        k2 k2Var;
        switch (this.e) {
            case 0:
                androidx.compose.ui.node.k.q(this.y);
                return y.a;
            case 1:
                this.y.U.h(true);
                return Boolean.TRUE;
            case 2:
                this.y.U.d(true);
                return Boolean.TRUE;
            case 3:
                this.y.U.f();
                return Boolean.TRUE;
            case 4:
                androidx.compose.ui.node.k.q(this.y);
                return y.a;
            case 5:
                this.y.U.p();
                return Boolean.TRUE;
            case 6:
                i iVar = this.y;
                iVar.P.w.y.r.b(iVar.V.e);
                return Boolean.TRUE;
            default:
                i iVar2 = this.y;
                r0 r0Var = iVar2.P;
                androidx.compose.ui.focus.y yVar = iVar2.W;
                boolean z = iVar2.Q;
                if (!r0Var.b()) {
                    androidx.compose.ui.focus.y.a(yVar);
                } else if (!z && (k2Var = r0Var.c) != null) {
                    ((m1) k2Var).b();
                }
                return Boolean.TRUE;
        }
    }
}
