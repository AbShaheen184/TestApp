package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.r0;
import androidx.compose.foundation.text.selection.c1;
import androidx.compose.ui.node.w0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class p extends w0 {
    public final t b;
    public final r0 c;
    public final c1 d;

    public p(t tVar, r0 r0Var, c1 c1Var) {
        this.b = tVar;
        this.c = r0Var;
        this.d = c1Var;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        return new q(this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.l.a(this.b, pVar.b) && this.c.equals(pVar.c) && this.d.equals(pVar.d);
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(androidx.compose.ui.q qVar) {
        q qVar2 = (q) qVar;
        if (qVar2.K) {
            ((c) qVar2.L).d();
            qVar2.L.i(qVar2);
        }
        t tVar = this.b;
        qVar2.L = tVar;
        if (qVar2.K) {
            if (tVar.a != null) {
                androidx.compose.foundation.internal.b.c("Expected textInputModifierNode to be null");
            }
            tVar.a = qVar2;
        }
        qVar2.M = this.c;
        qVar2.N = this.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.b + ", legacyTextFieldState=" + this.c + ", textFieldSelectionManager=" + this.d + ')';
    }
}
