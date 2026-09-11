package androidx.compose.ui.draw;

import androidx.compose.ui.node.h0;
import androidx.compose.ui.node.h1;
import androidx.compose.ui.q;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends q implements h1, a, androidx.compose.ui.node.m {
    public final d L;
    public boolean M;
    public kotlin.jvm.functions.l N;

    public c(d dVar, kotlin.jvm.functions.l lVar) {
        this.L = dVar;
        this.N = lVar;
        dVar.e = this;
    }

    @Override // androidx.compose.ui.q
    public final void F0() {
        L0();
    }

    @Override // androidx.compose.ui.node.m
    public final void J() {
        L0();
    }

    public final void L0() {
        this.M = false;
        this.L.y = null;
        androidx.compose.ui.node.k.j(this);
    }

    @Override // androidx.compose.ui.node.i
    public final void N() {
        L0();
    }

    @Override // androidx.compose.ui.node.m
    public final void W(h0 h0Var) {
        boolean z = this.M;
        d dVar = this.L;
        if (!z) {
            dVar.y = null;
            androidx.compose.ui.node.k.p(this, new b(0, this, dVar));
            if (dVar.y == null) {
                throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.a("DrawResult not defined, did you forget to call onDraw?");
            }
            this.M = true;
        }
        i iVar = dVar.y;
        iVar.getClass();
        iVar.a.invoke(h0Var);
    }

    @Override // androidx.compose.ui.draw.a
    public final androidx.compose.ui.unit.c a() {
        return androidx.compose.ui.node.k.t(this).W;
    }

    @Override // androidx.compose.ui.node.i, androidx.compose.ui.node.r1
    public final void b() {
        L0();
    }

    @Override // androidx.compose.ui.draw.a
    public final long d() {
        return coil3.network.g.x(androidx.compose.ui.node.k.r(this, 4).z);
    }

    @Override // androidx.compose.ui.node.h1
    public final void e0() {
        L0();
    }

    @Override // androidx.compose.ui.draw.a
    public final androidx.compose.ui.unit.m getLayoutDirection() {
        return androidx.compose.ui.node.k.t(this).X;
    }

    @Override // androidx.compose.ui.q
    public final void E0() {
    }
}
