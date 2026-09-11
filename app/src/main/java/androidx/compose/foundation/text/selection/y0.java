package androidx.compose.foundation.text.selection;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 implements androidx.compose.foundation.text.x0 {
    public final /* synthetic */ c1 a;

    public y0(c1 c1Var) {
        this.a = c1Var;
    }

    @Override // androidx.compose.foundation.text.x0
    public final void a(long j, androidx.collection.g gVar) {
        androidx.compose.foundation.text.k1 k1VarD;
        c1 c1Var = this.a;
        long jA = j0.a(c1Var.l(true));
        androidx.compose.foundation.text.r0 r0Var = c1Var.d;
        if (r0Var == null || (k1VarD = r0Var.d()) == null) {
            return;
        }
        long jE = k1VarD.e(jA);
        c1Var.o = jE;
        c1Var.s.setValue(new androidx.compose.ui.geometry.b(jE));
        c1Var.q = 0L;
        c1Var.r.setValue(androidx.compose.foundation.text.f0.e);
        c1Var.t(false);
    }

    @Override // androidx.compose.foundation.text.x0
    public final void b() {
        c1 c1Var = this.a;
        c1Var.r.setValue(null);
        c1Var.s.setValue(null);
    }

    @Override // androidx.compose.foundation.text.x0
    public final void c() {
        c1 c1Var = this.a;
        c1Var.r.setValue(null);
        c1Var.s.setValue(null);
    }

    @Override // androidx.compose.foundation.text.x0
    public final void e(long j) {
        androidx.compose.foundation.text.k1 k1VarD;
        androidx.compose.ui.hapticfeedback.a aVar;
        c1 c1Var = this.a;
        c1Var.q = androidx.compose.ui.geometry.b.e(c1Var.q, j);
        androidx.compose.foundation.text.r0 r0Var = c1Var.d;
        if (r0Var == null || (k1VarD = r0Var.d()) == null) {
            return;
        }
        c1Var.s.setValue(new androidx.compose.ui.geometry.b(androidx.compose.ui.geometry.b.e(c1Var.o, c1Var.q)));
        androidx.compose.ui.text.input.q qVar = c1Var.b;
        androidx.compose.ui.geometry.b bVarI = c1Var.i();
        bVarI.getClass();
        int iJ = qVar.j(k1VarD.b(bVarI.a, true));
        long jB = androidx.compose.ui.text.d0.b(iJ, iJ);
        if (androidx.compose.ui.text.l0.b(jB, c1Var.n().b)) {
            return;
        }
        androidx.compose.foundation.text.r0 r0Var2 = c1Var.d;
        if ((r0Var2 == null || ((Boolean) r0Var2.q.getValue()).booleanValue()) && (aVar = c1Var.k) != null) {
            aVar.a(9);
        }
        c1Var.c.invoke(c1.e(c1Var.n().a, jB));
        c1Var.w = new androidx.compose.ui.text.l0(jB);
    }

    @Override // androidx.compose.foundation.text.x0
    public final void d() {
    }

    @Override // androidx.compose.foundation.text.x0
    public final void onCancel() {
    }
}
