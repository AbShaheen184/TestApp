package androidx.compose.foundation.text;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements androidx.compose.ui.layout.c0 {
    public final i1 b;
    public final int c;
    public final androidx.compose.ui.text.input.e0 d;
    public final kotlin.jvm.functions.a e;

    public i0(i1 i1Var, int i, androidx.compose.ui.text.input.e0 e0Var, kotlin.jvm.functions.a aVar) {
        this.b = i1Var;
        this.c = i;
        this.d = e0Var;
        this.e = aVar;
    }

    @Override // androidx.compose.ui.layout.c0
    public final androidx.compose.ui.layout.r0 c(androidx.compose.ui.layout.s0 s0Var, androidx.compose.ui.layout.p0 p0Var, long j) {
        long j2;
        if (p0Var.B(androidx.compose.ui.unit.a.g(j)) < androidx.compose.ui.unit.a.h(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = androidx.compose.ui.unit.a.a(j2, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        androidx.compose.ui.layout.c1 c1VarF = p0Var.F(j);
        int iMin = Math.min(c1VarF.e, androidx.compose.ui.unit.a.h(j2));
        return s0Var.q(iMin, c1VarF.y, kotlin.collections.v.e, new androidx.compose.foundation.layout.s0(this, s0Var, c1VarF, iMin, 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.b.equals(i0Var.b) && this.c == i0Var.c && this.d.equals(i0Var.d) && kotlin.jvm.internal.l.a(this.e, i0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.b(this.c, this.b.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.b + ", cursorOffset=" + this.c + ", transformedText=" + this.d + ", textLayoutResultProvider=" + this.e + ')';
    }
}
