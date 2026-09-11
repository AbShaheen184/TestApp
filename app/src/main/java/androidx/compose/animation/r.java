package androidx.compose.animation;

import androidx.compose.animation.core.x1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class r<S> extends androidx.compose.ui.node.w0 {
    public final x1 b;
    public final androidx.compose.runtime.y0 c;
    public final v d;

    public r(x1 x1Var, androidx.compose.runtime.y0 y0Var, v vVar) {
        this.b = x1Var;
        this.c = y0Var;
        this.d = vVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        u uVar = new u();
        uVar.L = this.b;
        uVar.M = this.c;
        uVar.N = this.d;
        uVar.O = m.a;
        return uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return kotlin.jvm.internal.l.a(rVar.b, this.b) && rVar.c.equals(this.c);
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(androidx.compose.ui.q qVar) {
        u uVar = (u) qVar;
        uVar.L = this.b;
        uVar.M = this.c;
        uVar.N = this.d;
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        x1 x1Var = this.b;
        return this.c.hashCode() + ((iHashCode + (x1Var != null ? x1Var.hashCode() : 0)) * 31);
    }
}
