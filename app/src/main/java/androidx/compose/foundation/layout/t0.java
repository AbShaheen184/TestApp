package androidx.compose.foundation.layout;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements androidx.compose.ui.layout.q0, p0 {
    public final e a;
    public final androidx.compose.ui.i b;

    public t0(e eVar, androidx.compose.ui.i iVar) {
        this.a = eVar;
        this.b = iVar;
    }

    @Override // androidx.compose.ui.layout.q0
    public final androidx.compose.ui.layout.r0 a(androidx.compose.ui.layout.s0 s0Var, List list, long j) {
        return b.m(this, androidx.compose.ui.unit.a.j(j), androidx.compose.ui.unit.a.i(j), androidx.compose.ui.unit.a.h(j), androidx.compose.ui.unit.a.g(j), s0Var.g0(this.a.a()), s0Var, list, new androidx.compose.ui.layout.c1[list.size()], list.size());
    }

    @Override // androidx.compose.ui.layout.q0
    public final int b(androidx.compose.ui.layout.s sVar, List list, int i) {
        int iG0 = sVar.g0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            androidx.compose.ui.layout.p0 p0Var = (androidx.compose.ui.layout.p0) list.get(i3);
            float fK = b.k(b.j(p0Var));
            int iB = p0Var.B(i);
            if (fK == 0.0f) {
                i2 += iB;
            } else if (fK > 0.0f) {
                f += fK;
                iMax = Math.max(iMax, Math.round(iB / fK));
            }
        }
        return ((list.size() - 1) * iG0) + Math.round(iMax * f) + i2;
    }

    @Override // androidx.compose.foundation.layout.p0
    public final void c(int i, androidx.compose.ui.layout.s0 s0Var, int[] iArr, int[] iArr2) {
        this.a.c(s0Var, i, iArr, s0Var.getLayoutDirection(), iArr2);
    }

    @Override // androidx.compose.foundation.layout.p0
    public final long d(int i, int i2, int i3, boolean z) {
        return !z ? androidx.compose.ui.unit.b.a(i, i2, 0, i3) : org.jsoup.helper.n.o(i, i2, 0, i3);
    }

    @Override // androidx.compose.ui.layout.q0
    public final int e(androidx.compose.ui.layout.s sVar, List list, int i) {
        int iG0 = sVar.g0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iG0, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            androidx.compose.ui.layout.p0 p0Var = (androidx.compose.ui.layout.p0) list.get(i2);
            float fK = b.k(b.j(p0Var));
            if (fK == 0.0f) {
                int iMin2 = Math.min(p0Var.B(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, p0Var.Z(iMin2));
            } else if (fK > 0.0f) {
                f += fK;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            androidx.compose.ui.layout.p0 p0Var2 = (androidx.compose.ui.layout.p0) list.get(i3);
            float fK2 = b.k(b.j(p0Var2));
            if (fK2 > 0.0f) {
                iMax = Math.max(iMax, p0Var2.Z(iRound != Integer.MAX_VALUE ? Math.round(iRound * fK2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return kotlin.jvm.internal.l.a(this.a, t0Var.a) && kotlin.jvm.internal.l.a(this.b, t0Var.b);
    }

    @Override // androidx.compose.foundation.layout.p0
    public final int f(androidx.compose.ui.layout.c1 c1Var) {
        return c1Var.e;
    }

    @Override // androidx.compose.ui.layout.q0
    public final int g(androidx.compose.ui.layout.s sVar, List list, int i) {
        int iG0 = sVar.g0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            androidx.compose.ui.layout.p0 p0Var = (androidx.compose.ui.layout.p0) list.get(i3);
            float fK = b.k(b.j(p0Var));
            int iV = p0Var.v(i);
            if (fK == 0.0f) {
                i2 += iV;
            } else if (fK > 0.0f) {
                f += fK;
                iMax = Math.max(iMax, Math.round(iV / fK));
            }
        }
        return ((list.size() - 1) * iG0) + Math.round(iMax * f) + i2;
    }

    @Override // androidx.compose.ui.layout.q0
    public final int h(androidx.compose.ui.layout.s sVar, List list, int i) {
        int iG0 = sVar.g0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iG0, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            androidx.compose.ui.layout.p0 p0Var = (androidx.compose.ui.layout.p0) list.get(i2);
            float fK = b.k(b.j(p0Var));
            if (fK == 0.0f) {
                int iMin2 = Math.min(p0Var.B(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, p0Var.b(iMin2));
            } else if (fK > 0.0f) {
                f += fK;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            androidx.compose.ui.layout.p0 p0Var2 = (androidx.compose.ui.layout.p0) list.get(i3);
            float fK2 = b.k(b.j(p0Var2));
            if (fK2 > 0.0f) {
                iMax = Math.max(iMax, p0Var2.b(iRound != Integer.MAX_VALUE ? Math.round(iRound * fK2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // androidx.compose.foundation.layout.p0
    public final int i(androidx.compose.ui.layout.c1 c1Var) {
        return c1Var.y;
    }

    @Override // androidx.compose.foundation.layout.p0
    public final androidx.compose.ui.layout.r0 j(androidx.compose.ui.layout.c1[] c1VarArr, androidx.compose.ui.layout.s0 s0Var, int[] iArr, int i, int i2) {
        return s0Var.q(i, i2, kotlin.collections.v.e, new s0(c1VarArr, this, i2, iArr));
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.a + ", verticalAlignment=" + this.b + ')';
    }
}
