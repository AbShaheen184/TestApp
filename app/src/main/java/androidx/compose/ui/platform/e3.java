package androidx.compose.ui.platform;

import com.app.mlounge.R;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e3 implements androidx.compose.runtime.u, androidx.lifecycle.t {
    public androidx.lifecycle.p A;
    public kotlin.jvm.functions.p B = j1.a;
    public final u e;
    public final androidx.compose.runtime.y y;
    public boolean z;

    public e3(u uVar, androidx.compose.runtime.y yVar) {
        this.e = uVar;
        this.y = yVar;
    }

    public final void b() {
        if (!this.z) {
            this.z = true;
            this.e.getView().setTag(R.id.wrapped_composition_tag, null);
            androidx.lifecycle.p pVar = this.A;
            if (pVar != null) {
                pVar.b(this);
            }
        }
        this.y.m();
    }

    public final void c(kotlin.jvm.functions.p pVar) {
        this.e.setOnViewTreeOwnersAvailable(new androidx.compose.animation.c(10, this, pVar));
    }

    @Override // androidx.lifecycle.t
    public final void g(androidx.lifecycle.v vVar, androidx.lifecycle.n nVar) {
        if (nVar == androidx.lifecycle.n.ON_DESTROY) {
            b();
        } else {
            if (nVar != androidx.lifecycle.n.ON_CREATE || this.z) {
                return;
            }
            c(this.B);
        }
    }
}
