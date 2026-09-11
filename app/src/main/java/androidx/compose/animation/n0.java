package androidx.compose.animation;

import androidx.compose.animation.core.e2;
import androidx.compose.animation.core.x1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class n0 extends androidx.compose.ui.node.w0 {
    public final e2 b;
    public final x1 c;
    public final x1 d;
    public final x0 e;
    public final y0 f;
    public final kotlin.jvm.functions.a g;
    public final o0 h;

    public n0(e2 e2Var, x1 x1Var, x1 x1Var2, x0 x0Var, y0 y0Var, kotlin.jvm.functions.a aVar, o0 o0Var) {
        this.b = e2Var;
        this.c = x1Var;
        this.d = x1Var2;
        this.e = x0Var;
        this.f = y0Var;
        this.g = aVar;
        this.h = o0Var;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        return new w0(this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return n0Var.b.equals(this.b) && kotlin.jvm.internal.l.a(n0Var.c, this.c) && kotlin.jvm.internal.l.a(n0Var.d, this.d) && n0Var.e.equals(this.e) && kotlin.jvm.internal.l.a(n0Var.f, this.f) && n0Var.g == this.g && kotlin.jvm.internal.l.a(n0Var.h, this.h);
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(androidx.compose.ui.q qVar) {
        w0 w0Var = (w0) qVar;
        w0Var.L = this.b;
        w0Var.M = this.c;
        w0Var.N = this.d;
        w0Var.O = this.e;
        w0Var.P = this.f;
        w0Var.Q = this.g;
        w0Var.R = this.h;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        x1 x1Var = this.c;
        int iHashCode2 = (iHashCode + (x1Var != null ? x1Var.hashCode() : 0)) * 31;
        x1 x1Var2 = this.d;
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.a.hashCode() + ((this.e.a.hashCode() + ((iHashCode2 + (x1Var2 != null ? x1Var2.hashCode() : 0)) * 961)) * 31)) * 31)) * 31);
    }
}
