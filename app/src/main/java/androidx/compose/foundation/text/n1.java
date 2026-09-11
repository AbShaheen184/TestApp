package androidx.compose.foundation.text;

import androidx.compose.foundation.w1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 implements androidx.compose.ui.layout.c0 {
    public final i1 b;
    public final int c;
    public final androidx.compose.ui.text.input.e0 d;
    public final kotlin.jvm.functions.a e;

    public n1(i1 i1Var, int i, androidx.compose.ui.text.input.e0 e0Var, kotlin.jvm.functions.a aVar) {
        this.b = i1Var;
        this.c = i;
        this.d = e0Var;
        this.e = aVar;
    }

    @Override // androidx.compose.ui.layout.c0
    public final androidx.compose.ui.layout.r0 c(androidx.compose.ui.layout.s0 s0Var, androidx.compose.ui.layout.p0 p0Var, long j) {
        androidx.compose.ui.layout.c1 c1VarF = p0Var.F(androidx.compose.ui.unit.a.a(j, 0, 0, 0, Integer.MAX_VALUE, 7));
        int iMin = Math.min(c1VarF.y, androidx.compose.ui.unit.a.g(j));
        return s0Var.q(c1VarF.e, iMin, kotlin.collections.v.e, new w1(this, c1VarF, iMin));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return this.b.equals(n1Var.b) && this.c == n1Var.c && this.d.equals(n1Var.d) && kotlin.jvm.internal.l.a(this.e, n1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.b(this.c, this.b.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.b + ", cursorOffset=" + this.c + ", transformedText=" + this.d + ", textLayoutResultProvider=" + this.e + ')';
    }
}
