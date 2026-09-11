package androidx.compose.foundation;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends androidx.compose.ui.node.w0 {
    public final float b;
    public final androidx.compose.ui.graphics.p0 c;
    public final androidx.compose.ui.graphics.n0 d;

    public z(float f, androidx.compose.ui.graphics.p0 p0Var, androidx.compose.ui.graphics.n0 n0Var) {
        this.b = f;
        this.c = p0Var;
        this.d = n0Var;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        return new y(this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return androidx.compose.ui.unit.f.d(this.b, zVar.b) && this.c.equals(zVar.c) && kotlin.jvm.internal.l.a(this.d, zVar.d);
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(androidx.compose.ui.q qVar) {
        y yVar = (y) qVar;
        float f = yVar.O;
        androidx.compose.ui.draw.c cVar = yVar.R;
        float f2 = this.b;
        if (!androidx.compose.ui.unit.f.d(f, f2)) {
            yVar.O = f2;
            cVar.L0();
        }
        androidx.compose.ui.graphics.p0 p0Var = yVar.P;
        androidx.compose.ui.graphics.p0 p0Var2 = this.c;
        if (!kotlin.jvm.internal.l.a(p0Var, p0Var2)) {
            yVar.P = p0Var2;
            cVar.L0();
        }
        androidx.compose.ui.graphics.n0 n0Var = yVar.Q;
        androidx.compose.ui.graphics.n0 n0Var2 = this.d;
        if (kotlin.jvm.internal.l.a(n0Var, n0Var2)) {
            return;
        }
        yVar.Q = n0Var2;
        cVar.L0();
        androidx.compose.ui.node.k.l(yVar);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (Float.hashCode(this.b) * 31)) * 31);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) androidx.compose.ui.unit.f.e(this.b)) + ", brush=" + this.c + ", shape=" + this.d + ')';
    }
}
