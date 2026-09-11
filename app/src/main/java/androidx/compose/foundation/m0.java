package androidx.compose.foundation;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends androidx.compose.ui.q implements androidx.compose.ui.node.m {
    public final androidx.compose.foundation.interaction.k L;
    public boolean M;
    public boolean N;
    public boolean O;

    public m0(androidx.compose.foundation.interaction.k kVar) {
        this.L = kVar;
    }

    @Override // androidx.compose.ui.q
    public final void D0() {
        BuildersKt__Builders_commonKt.launch$default(z0(), null, null, new androidx.compose.animation.core.c1(this, null, 2), 3, null);
    }

    @Override // androidx.compose.ui.node.m
    public final void W(androidx.compose.ui.node.h0 h0Var) {
        h0Var.b();
        androidx.compose.ui.graphics.drawscope.b bVar = h0Var.e;
        if (this.M) {
            androidx.compose.ui.graphics.drawscope.d.p0(h0Var, androidx.compose.ui.graphics.t.b(0.3f, androidx.compose.ui.graphics.t.b), 0L, bVar.d(), Token.FUNCTION);
        } else if (this.N || this.O) {
            androidx.compose.ui.graphics.drawscope.d.p0(h0Var, androidx.compose.ui.graphics.t.b(0.1f, androidx.compose.ui.graphics.t.b), 0L, bVar.d(), Token.FUNCTION);
        }
    }
}
