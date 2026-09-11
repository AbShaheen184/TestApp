package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.platform.k2;
import androidx.compose.ui.platform.l1;
import androidx.compose.ui.platform.m1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t implements androidx.compose.ui.text.input.s {
    public q a;

    @Override // androidx.compose.ui.text.input.s
    public final void c() {
        k2 k2Var;
        q qVar = this.a;
        if (qVar == null || (k2Var = (k2) androidx.compose.ui.node.k.h(qVar, l1.p)) == null) {
            return;
        }
        ((m1) k2Var).b();
    }

    @Override // androidx.compose.ui.text.input.s
    public final void e() {
        k2 k2Var;
        q qVar = this.a;
        if (qVar == null || (k2Var = (k2) androidx.compose.ui.node.k.h(qVar, l1.p)) == null) {
            return;
        }
        ((m1) k2Var).a();
    }

    public final void i(q qVar) {
        if (!(this.a == qVar)) {
            androidx.compose.foundation.internal.b.c("Expected textInputModifierNode to be " + qVar + " but was " + this.a);
        }
        this.a = null;
    }
}
