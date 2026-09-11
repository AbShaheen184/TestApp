package androidx.compose.foundation.text.selection;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 implements androidx.compose.foundation.text.x0 {
    public final /* synthetic */ c1 a;
    public final /* synthetic */ boolean b;

    public z0(c1 c1Var, boolean z) {
        this.a = c1Var;
        this.b = z;
    }

    @Override // androidx.compose.foundation.text.x0
    public final void b() {
        c1 c1Var = this.a;
        c1Var.r.setValue(null);
        c1Var.s.setValue(null);
        c1Var.t(true);
    }

    @Override // androidx.compose.foundation.text.x0
    public final void c() {
        c1 c1Var = this.a;
        c1Var.r.setValue(null);
        c1Var.s.setValue(null);
        c1Var.t(true);
    }

    @Override // androidx.compose.foundation.text.x0
    public final void d() {
        androidx.compose.foundation.text.k1 k1VarD;
        boolean z = this.b;
        androidx.compose.foundation.text.f0 f0Var = z ? androidx.compose.foundation.text.f0.y : androidx.compose.foundation.text.f0.z;
        c1 c1Var = this.a;
        c1Var.r.setValue(f0Var);
        long jA = j0.a(c1Var.l(z));
        androidx.compose.foundation.text.r0 r0Var = c1Var.d;
        if (r0Var == null || (k1VarD = r0Var.d()) == null) {
            return;
        }
        long jE = k1VarD.e(jA);
        c1Var.o = jE;
        c1Var.s.setValue(new androidx.compose.ui.geometry.b(jE));
        c1Var.q = 0L;
        c1Var.t = -1;
        androidx.compose.foundation.text.r0 r0Var2 = c1Var.d;
        if (r0Var2 != null) {
            r0Var2.q.setValue(Boolean.TRUE);
        }
        c1Var.t(false);
    }

    @Override // androidx.compose.foundation.text.x0
    public final void e(long j) {
        c1 c1Var = this.a;
        long jE = androidx.compose.ui.geometry.b.e(c1Var.q, j);
        c1Var.q = jE;
        c1Var.s.setValue(new androidx.compose.ui.geometry.b(androidx.compose.ui.geometry.b.e(c1Var.o, jE)));
        androidx.compose.ui.text.input.x xVarN = c1Var.n();
        androidx.compose.ui.geometry.b bVarI = c1Var.i();
        bVarI.getClass();
        c1.c(c1Var, xVarN, bVarI.a, false, this.b, a0.g, true);
        c1Var.t(false);
    }

    @Override // androidx.compose.foundation.text.x0
    public final void onCancel() {
    }

    @Override // androidx.compose.foundation.text.x0
    public final void a(long j, androidx.collection.g gVar) {
    }
}
