package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.activity.w;
import androidx.compose.foundation.text.input.internal.o;
import androidx.compose.foundation.text.m;
import androidx.compose.foundation.text.selection.v0;
import androidx.compose.foundation.text.selection.w0;
import androidx.compose.runtime.e0;
import androidx.compose.runtime.s;
import androidx.compose.ui.layout.x;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends androidx.compose.ui.node.j implements androidx.compose.ui.node.h, androidx.compose.foundation.text.contextmenu.provider.e {
    public o N;
    public v0 O;
    public w0 P;
    public m Q;
    public Job R;
    public final e0 S = s.k(new w(this, 13));
    public androidx.compose.ui.geometry.c T = androidx.compose.ui.geometry.c.e;

    public j(o oVar, v0 v0Var, w0 w0Var, m mVar) {
        this.N = oVar;
        this.O = v0Var;
        this.P = w0Var;
        this.Q = mVar;
    }

    @Override // androidx.compose.ui.q
    public final void D0() {
        o oVar = this.N;
        oVar.z = k.z;
        oVar.y = this;
    }

    @Override // androidx.compose.ui.q
    public final void E0() {
        o oVar = this.N;
        oVar.z = k.y;
        oVar.y = null;
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.e
    public final androidx.compose.foundation.text.contextmenu.data.c M() {
        return (androidx.compose.foundation.text.contextmenu.data.c) this.S.getValue();
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.e
    public final androidx.compose.ui.geometry.c h0(x xVar) {
        if (!this.K) {
            return this.T;
        }
        androidx.compose.ui.geometry.c cVar = (androidx.compose.ui.geometry.c) this.Q.invoke(xVar);
        if (cVar == null) {
            return this.T;
        }
        this.T = cVar;
        return cVar;
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.e
    public final long m0(x xVar) {
        return h0(xVar).d();
    }
}
