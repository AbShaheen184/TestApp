package androidx.compose.ui.graphics;

import androidx.compose.ui.node.d1;
import androidx.compose.ui.node.w0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class n extends w0 {
    public final kotlin.jvm.functions.l b;

    public n(kotlin.jvm.functions.l lVar) {
        this.b = lVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        return new o(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            return this.b == ((n) obj).b;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(androidx.compose.ui.q qVar) {
        d1 d1Var;
        o oVar = (o) qVar;
        kotlin.jvm.functions.l lVar = this.b;
        oVar.L = lVar;
        if (oVar.e.K && (d1Var = androidx.compose.ui.node.k.r(oVar, 2).M) != null) {
            d1Var.r1(lVar, true);
        }
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
