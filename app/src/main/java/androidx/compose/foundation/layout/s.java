package androidx.compose.foundation.layout;

import androidx.compose.animation.core.n1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements androidx.compose.ui.layout.q0 {
    public final androidx.compose.ui.j a;
    public final boolean b;

    public s(androidx.compose.ui.j jVar, boolean z) {
        this.a = jVar;
        this.b = z;
    }

    @Override // androidx.compose.ui.layout.q0
    public final androidx.compose.ui.layout.r0 a(final androidx.compose.ui.layout.s0 s0Var, List list, long j) {
        boolean zIsEmpty = list.isEmpty();
        kotlin.collections.v vVar = kotlin.collections.v.e;
        if (zIsEmpty) {
            return s0Var.q(androidx.compose.ui.unit.a.j(j), androidx.compose.ui.unit.a.i(j), vVar, new n1(23));
        }
        long j2 = this.b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            final androidx.compose.ui.layout.p0 p0Var = (androidx.compose.ui.layout.p0) list.get(0);
            p0Var.K();
            final androidx.compose.ui.layout.c1 c1VarF = p0Var.F(j2);
            final int iMax = Math.max(androidx.compose.ui.unit.a.j(j), c1VarF.e);
            final int iMax2 = Math.max(androidx.compose.ui.unit.a.i(j), c1VarF.y);
            return s0Var.q(iMax, iMax2, vVar, new kotlin.jvm.functions.l() { // from class: androidx.compose.foundation.layout.q
                @Override // kotlin.jvm.functions.l
                public final Object invoke(Object obj) {
                    p.b((androidx.compose.ui.layout.b1) obj, c1VarF, p0Var, s0Var.getLayoutDirection(), iMax, iMax2, this.a);
                    return kotlin.y.a;
                }
            });
        }
        androidx.compose.ui.layout.c1[] c1VarArr = new androidx.compose.ui.layout.c1[list.size()];
        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
        xVar.e = androidx.compose.ui.unit.a.j(j);
        kotlin.jvm.internal.x xVar2 = new kotlin.jvm.internal.x();
        xVar2.e = androidx.compose.ui.unit.a.i(j);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.layout.p0 p0Var2 = (androidx.compose.ui.layout.p0) list.get(i);
            p0Var2.K();
            androidx.compose.ui.layout.c1 c1VarF2 = p0Var2.F(j2);
            c1VarArr[i] = c1VarF2;
            xVar.e = Math.max(xVar.e, c1VarF2.e);
            xVar2.e = Math.max(xVar2.e, c1VarF2.y);
        }
        return s0Var.q(xVar.e, xVar2.e, vVar, new r(c1VarArr, list, s0Var, xVar, xVar2, this, 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.a.equals(sVar.a) && this.b == sVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.a + ", propagateMinConstraints=" + this.b + ')';
    }
}
