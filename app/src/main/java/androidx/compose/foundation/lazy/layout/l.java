package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.k1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class l extends androidx.compose.ui.node.w0 {
    public final q b;
    public final com.google.firebase.platforminfo.c c;
    public final k1 d;

    public l(q qVar, com.google.firebase.platforminfo.c cVar, k1 k1Var) {
        this.b = qVar;
        this.c = cVar;
        this.d = k1Var;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        p pVar = new p();
        pVar.L = this.b;
        pVar.M = this.c;
        pVar.N = this.d;
        return pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.jvm.internal.l.a(this.b, lVar.b) && kotlin.jvm.internal.l.a(this.c, lVar.c) && this.d == lVar.d;
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(androidx.compose.ui.q qVar) {
        p pVar = (p) qVar;
        pVar.L = this.b;
        pVar.M = this.c;
        pVar.N = this.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.f((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, false);
    }
}
