package androidx.compose.foundation;

import android.view.View;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends androidx.compose.ui.q implements androidx.compose.ui.node.n, androidx.compose.ui.node.m, androidx.compose.ui.node.u1, androidx.compose.ui.node.h1 {
    public androidx.compose.foundation.text.selection.h1 L;
    public androidx.compose.foundation.text.selection.f1 M;
    public s1 N;
    public View O;
    public androidx.compose.ui.unit.c P;
    public r1 Q;
    public androidx.compose.runtime.e0 S;
    public androidx.compose.ui.unit.l U;
    public Channel V;
    public final androidx.compose.runtime.h1 R = new androidx.compose.runtime.h1(null, androidx.compose.runtime.f.A);
    public long T = 9205357640488583168L;

    public g1(androidx.compose.foundation.text.selection.h1 h1Var, androidx.compose.foundation.text.selection.f1 f1Var, s1 s1Var) {
        this.L = h1Var;
        this.M = f1Var;
        this.N = s1Var;
    }

    @Override // androidx.compose.ui.q
    public final void D0() {
        e0();
        this.V = ChannelKt.Channel$default(0, null, null, 7, null);
        BuildersKt__Builders_commonKt.launch$default(z0(), null, CoroutineStart.UNDISPATCHED, new androidx.compose.animation.core.c1(this, null, 4), 1, null);
    }

    @Override // androidx.compose.ui.q
    public final void E0() {
        r1 r1Var = this.Q;
        if (r1Var != null) {
            ((t1) r1Var).b();
        }
        this.Q = null;
    }

    public final long L0() {
        if (this.S == null) {
            this.S = androidx.compose.runtime.s.k(new f1(this, 2));
        }
        androidx.compose.runtime.e0 e0Var = this.S;
        if (e0Var != null) {
            return ((androidx.compose.ui.geometry.b) e0Var.getValue()).a;
        }
        return 9205357640488583168L;
    }

    public final void M0() {
        r1 r1Var = this.Q;
        if (r1Var != null) {
            ((t1) r1Var).b();
        }
        View viewV = this.O;
        if (viewV == null) {
            viewV = androidx.compose.ui.node.k.v(this);
        }
        this.O = viewV;
        androidx.compose.ui.unit.c cVar = this.P;
        if (cVar == null) {
            cVar = androidx.compose.ui.node.k.t(this).W;
        }
        this.P = cVar;
        this.Q = this.N.b(viewV, cVar);
        O0();
    }

    public final void N0() {
        androidx.compose.ui.unit.c cVar = this.P;
        if (cVar == null) {
            cVar = androidx.compose.ui.node.k.t(this).W;
            this.P = cVar;
        }
        long j = ((androidx.compose.ui.geometry.b) this.L.invoke(cVar)).a;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & L0()) == 9205357640488583168L) {
            this.T = 9205357640488583168L;
            r1 r1Var = this.Q;
            if (r1Var != null) {
                ((t1) r1Var).b();
                return;
            }
            return;
        }
        this.T = androidx.compose.ui.geometry.b.e(L0(), j);
        if (this.Q == null) {
            M0();
        }
        r1 r1Var2 = this.Q;
        if (r1Var2 != null) {
            r1Var2.a(this.T, 9205357640488583168L);
        }
        O0();
    }

    public final void O0() {
        androidx.compose.ui.unit.c cVar;
        r1 r1Var = this.Q;
        if (r1Var == null || (cVar = this.P) == null) {
            return;
        }
        t1 t1Var = (t1) r1Var;
        long jC = t1Var.c();
        androidx.compose.ui.unit.l lVar = this.U;
        if (lVar != null && jC == lVar.a) {
            return;
        }
        this.M.invoke(new androidx.compose.ui.unit.h(cVar.o(coil3.network.g.x(t1Var.c()))));
        this.U = new androidx.compose.ui.unit.l(t1Var.c());
    }

    @Override // androidx.compose.ui.node.m
    public final void W(androidx.compose.ui.node.h0 h0Var) {
        h0Var.b();
        Channel channel = this.V;
        if (channel != null) {
            ChannelResult.m42boximpl(channel.mo28trySendJP2dKIU(kotlin.y.a));
        }
    }

    @Override // androidx.compose.ui.node.h1
    public final void e0() {
        androidx.compose.ui.node.k.p(this, new f1(this, 0));
    }

    @Override // androidx.compose.ui.node.u1
    public final void l0(androidx.compose.ui.semantics.x xVar) {
        xVar.b(h1.a, new f1(this, 1));
    }

    @Override // androidx.compose.ui.node.n
    public final void u0(androidx.compose.ui.node.d1 d1Var) {
        this.R.setValue(d1Var);
    }
}
