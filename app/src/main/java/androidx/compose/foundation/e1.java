package androidx.compose.foundation;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends androidx.compose.ui.node.w0 {
    public final androidx.compose.foundation.text.selection.h1 b;
    public final androidx.compose.foundation.text.selection.f1 c;
    public final s1 d;

    public e1(androidx.compose.foundation.text.selection.h1 h1Var, androidx.compose.foundation.text.selection.f1 f1Var, s1 s1Var) {
        this.b = h1Var;
        this.c = f1Var;
        this.d = s1Var;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        return new g1(this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(androidx.compose.ui.q qVar) {
        g1 g1Var = (g1) qVar;
        g1Var.getClass();
        s1 s1Var = g1Var.N;
        View view = g1Var.O;
        androidx.compose.ui.unit.c cVar = g1Var.P;
        g1Var.L = this.b;
        g1Var.M = this.c;
        s1 s1Var2 = this.d;
        g1Var.N = s1Var2;
        View viewV = androidx.compose.ui.node.k.v(g1Var);
        androidx.compose.ui.unit.c cVar2 = androidx.compose.ui.node.k.t(g1Var).W;
        if (g1Var.Q != null) {
            androidx.compose.ui.semantics.w wVar = h1.a;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(Float.NaN)) && !s1Var2.a()) || !androidx.compose.ui.unit.f.d(Float.NaN, Float.NaN) || !androidx.compose.ui.unit.f.d(Float.NaN, Float.NaN) || !s1Var2.equals(s1Var) || !viewV.equals(view) || !kotlin.jvm.internal.l.a(cVar2, cVar)) {
                g1Var.M0();
            }
        }
        g1Var.N0();
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.f(androidx.privacysandbox.ads.adservices.java.internal.a.a(Float.NaN, androidx.privacysandbox.ads.adservices.java.internal.a.a(Float.NaN, androidx.privacysandbox.ads.adservices.java.internal.a.c(androidx.privacysandbox.ads.adservices.java.internal.a.f(androidx.privacysandbox.ads.adservices.java.internal.a.a(Float.NaN, this.b.hashCode() * 961, 31), 31, true), 31, 9205357640488583168L), 31), 31), 31, true)) * 31);
    }
}
