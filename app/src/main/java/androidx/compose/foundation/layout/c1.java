package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class c1 extends androidx.compose.ui.node.w0 {
    public final z b;
    public final kotlin.jvm.functions.p c;
    public final Object d;

    public c1(z zVar, kotlin.jvm.functions.p pVar, Object obj) {
        this.b = zVar;
        this.c = pVar;
        this.d = obj;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        e1 e1Var = new e1();
        e1Var.L = this.b;
        e1Var.M = this.c;
        return e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c1.class != obj.getClass()) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return this.b == c1Var.b && this.d.equals(c1Var.d);
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(androidx.compose.ui.q qVar) {
        e1 e1Var = (e1) qVar;
        e1Var.L = this.b;
        e1Var.M = this.c;
    }

    public final int hashCode() {
        return this.d.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.f(this.b.hashCode() * 31, 31, false);
    }
}
