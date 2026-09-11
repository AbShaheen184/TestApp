package androidx.compose.foundation.text.selection;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 implements androidx.compose.foundation.text.x0 {
    public androidx.compose.ui.text.l0 b;
    public final /* synthetic */ c1 d;
    public boolean a = true;
    public androidx.collection.g c = a0.d;

    public a1(c1 c1Var) {
        this.d = c1Var;
    }

    @Override // androidx.compose.foundation.text.x0
    public final void a(long j, androidx.collection.g gVar) {
        long j2;
        androidx.compose.foundation.text.k1 k1VarD;
        androidx.compose.foundation.text.k1 k1VarD2;
        c1 c1Var = this.d;
        androidx.compose.runtime.h1 h1Var = c1Var.r;
        if (c1Var.k() && ((androidx.compose.foundation.text.f0) h1Var.getValue()) == null) {
            h1Var.setValue(androidx.compose.foundation.text.f0.z);
            c1Var.t = -1;
            this.a = true;
            this.c = gVar;
            c1Var.o();
            androidx.compose.foundation.text.r0 r0Var = c1Var.d;
            if (r0Var == null || (k1VarD2 = r0Var.d()) == null || !k1VarD2.c(j)) {
                j2 = j;
                androidx.compose.foundation.text.r0 r0Var2 = c1Var.d;
                if (r0Var2 != null && (k1VarD = r0Var2.d()) != null) {
                    int iJ = c1Var.b.j(k1VarD.b(j2, true));
                    androidx.compose.ui.text.input.x xVarE = c1.e(c1Var.n().a, androidx.compose.ui.text.d0.b(iJ, iJ));
                    c1Var.h(false);
                    androidx.compose.ui.hapticfeedback.a aVar = c1Var.k;
                    if (aVar != null) {
                        aVar.a(9);
                    }
                    c1Var.c.invoke(xVarE);
                    c1Var.w = new androidx.compose.ui.text.l0(xVarE.b);
                }
                this.a = false;
            } else {
                if (c1Var.n().a.y.length() == 0) {
                    return;
                }
                c1Var.h(false);
                long jC = c1.c(c1Var, androidx.compose.ui.text.input.x.a(c1Var.n(), null, androidx.compose.ui.text.l0.b, 5), j, true, false, this.c, true);
                j2 = j;
                c1Var.p = new androidx.compose.ui.text.l0(jC);
                this.b = new androidx.compose.ui.text.l0(jC);
            }
            c1Var.q(androidx.compose.foundation.text.g0.e);
            c1Var.o = j2;
            c1Var.s.setValue(new androidx.compose.ui.geometry.b(j2));
            c1Var.q = 0L;
        }
    }

    @Override // androidx.compose.foundation.text.x0
    public final void b() {
        f();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0092  */
    /* JADX WARN: Code duplicated, block: B:24:0x0099  */
    @Override // androidx.compose.foundation.text.x0
    public final void e(long j) {
        androidx.compose.foundation.text.k1 k1VarD;
        androidx.compose.ui.text.l0 l0Var;
        int iB;
        long jC;
        c1 c1Var = this.d;
        if (!c1Var.k() || c1Var.n().a.y.length() == 0) {
            return;
        }
        c1Var.q = androidx.compose.ui.geometry.b.e(c1Var.q, j);
        androidx.compose.foundation.text.r0 r0Var = c1Var.d;
        if (r0Var != null && (k1VarD = r0Var.d()) != null) {
            c1Var.s.setValue(new androidx.compose.ui.geometry.b(androidx.compose.ui.geometry.b.e(c1Var.o, c1Var.q)));
            if (c1Var.p == null) {
                androidx.compose.ui.geometry.b bVarI = c1Var.i();
                bVarI.getClass();
                if (k1VarD.c(bVarI.a)) {
                    l0Var = c1Var.p;
                    if (l0Var != null) {
                        iB = (int) (l0Var.a >> 32);
                    } else {
                        iB = k1VarD.b(c1Var.o, false);
                    }
                    androidx.compose.ui.geometry.b bVarI2 = c1Var.i();
                    bVarI2.getClass();
                    int iB2 = k1VarD.b(bVarI2.a, false);
                    if (c1Var.p != null && iB == iB2) {
                        return;
                    }
                    androidx.compose.ui.text.input.x xVarN = c1Var.n();
                    androidx.compose.ui.geometry.b bVarI3 = c1Var.i();
                    bVarI3.getClass();
                    jC = c1.c(c1Var, xVarN, bVarI3.a, false, false, this.c, true);
                } else {
                    int iJ = c1Var.b.j(k1VarD.b(c1Var.o, true));
                    androidx.compose.ui.text.input.q qVar = c1Var.b;
                    androidx.compose.ui.geometry.b bVarI4 = c1Var.i();
                    bVarI4.getClass();
                    androidx.collection.g gVar = iJ == qVar.j(k1VarD.b(bVarI4.a, true)) ? a0.d : a0.e;
                    androidx.compose.ui.text.input.x xVarN2 = c1Var.n();
                    androidx.compose.ui.geometry.b bVarI5 = c1Var.i();
                    bVarI5.getClass();
                    jC = c1.c(c1Var, xVarN2, bVarI5.a, false, false, gVar, true);
                }
            } else {
                l0Var = c1Var.p;
                if (l0Var != null) {
                    iB = (int) (l0Var.a >> 32);
                } else {
                    iB = k1VarD.b(c1Var.o, false);
                }
                androidx.compose.ui.geometry.b bVarI6 = c1Var.i();
                bVarI6.getClass();
                int iB3 = k1VarD.b(bVarI6.a, false);
                if (c1Var.p != null) {
                }
                androidx.compose.ui.text.input.x xVarN3 = c1Var.n();
                androidx.compose.ui.geometry.b bVarI7 = c1Var.i();
                bVarI7.getClass();
                jC = c1.c(c1Var, xVarN3, bVarI7.a, false, false, this.c, true);
            }
            this.b = new androidx.compose.ui.text.l0(jC);
            if (!androidx.compose.ui.text.l0.a(jC, c1Var.p)) {
                this.a = false;
            }
        }
        c1Var.t(false);
    }

    public final void f() {
        c1 c1Var = this.d;
        c1Var.r.setValue(null);
        c1Var.s.setValue(null);
        this.c = a0.d;
        c1Var.t(true);
        androidx.compose.ui.text.l0 l0Var = this.b;
        boolean zC = androidx.compose.ui.text.l0.c(l0Var != null ? l0Var.a : c1Var.n().b);
        c1Var.q(zC ? androidx.compose.foundation.text.g0.z : androidx.compose.foundation.text.g0.y);
        androidx.compose.foundation.text.r0 r0Var = c1Var.d;
        if (r0Var != null) {
            r0Var.m.setValue(Boolean.valueOf(!zC && okhttp3.internal.platform.android.g.y(c1Var, true)));
        }
        androidx.compose.foundation.text.r0 r0Var2 = c1Var.d;
        if (r0Var2 != null) {
            r0Var2.n.setValue(Boolean.valueOf(!zC && okhttp3.internal.platform.android.g.y(c1Var, false)));
        }
        androidx.compose.foundation.text.r0 r0Var3 = c1Var.d;
        if (r0Var3 != null) {
            r0Var3.o.setValue(Boolean.valueOf(zC && okhttp3.internal.platform.android.g.y(c1Var, true)));
        }
        if (this.a) {
            c1.b(c1Var, c1Var.p);
        }
        c1Var.p = null;
    }

    @Override // androidx.compose.foundation.text.x0
    public final void onCancel() {
        f();
    }

    @Override // androidx.compose.foundation.text.x0
    public final void c() {
    }

    @Override // androidx.compose.foundation.text.x0
    public final void d() {
    }
}
