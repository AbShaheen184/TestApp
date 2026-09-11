package androidx.compose.foundation;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e2 extends androidx.compose.ui.node.w0 {
    public final b2 b;
    public final boolean c;

    public e2(b2 b2Var, boolean z) {
        this.b = b2Var;
        this.c = z;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        y1 y1Var = new y1();
        y1Var.L = this.b;
        y1Var.M = this.c;
        return y1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e2)) {
            return false;
        }
        e2 e2Var = (e2) obj;
        return kotlin.jvm.internal.l.a(this.b, e2Var.b) && this.c == e2Var.c;
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(androidx.compose.ui.q qVar) {
        y1 y1Var = (y1) qVar;
        y1Var.L = this.b;
        y1Var.M = this.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + androidx.privacysandbox.ads.adservices.java.internal.a.f(this.b.hashCode() * 31, 31, false);
    }
}
