package com.app.mlounge.ui.viewmodel;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 extends androidx.lifecycle.q0 {
    public final MutableStateFlow A;
    public final StateFlow B;
    public final MutableStateFlow C;
    public final StateFlow D;
    public final StateFlow E;
    public final Flow F;
    public final Flow G;
    public final MutableStateFlow H;
    public final StateFlow I;
    public final MutableStateFlow J;
    public final StateFlow K;
    public final MutableStateFlow L;
    public final StateFlow M;
    public final MutableStateFlow N;
    public final StateFlow O;
    public final MutableStateFlow P;
    public final StateFlow Q;
    public final MutableStateFlow R;
    public final StateFlow S;
    public int T;
    public int U;
    public final com.app.mlounge.data.repository.j0 b;
    public final com.app.mlounge.data.repository.x c;
    public final StateFlow d;
    public final StateFlow e;
    public final StateFlow f;
    public final StateFlow g;
    public final MutableStateFlow h;
    public final StateFlow i;
    public final androidx.compose.runtime.e1 j;
    public final androidx.compose.runtime.e1 k;
    public final androidx.compose.runtime.e1 l;
    public final MutableStateFlow m;
    public final StateFlow n;
    public final MutableStateFlow o;
    public final StateFlow p;
    public final MutableStateFlow q;
    public final StateFlow r;
    public final MutableStateFlow s;
    public final StateFlow t;
    public final MutableStateFlow u;
    public final StateFlow v;
    public final MutableStateFlow w;
    public final StateFlow x;
    public final MutableStateFlow y;
    public final StateFlow z;

    public x1(com.app.mlounge.data.repository.j0 j0Var, com.app.mlounge.data.repository.r rVar, com.app.mlounge.data.repository.x xVar, com.app.mlounge.data.local.prefs.y1 y1Var, com.app.mlounge.data.repository.m0 m0Var, com.app.mlounge.data.repository.q0 q0Var) {
        j0Var.getClass();
        rVar.getClass();
        xVar.getClass();
        y1Var.getClass();
        m0Var.getClass();
        q0Var.getClass();
        this.b = j0Var;
        this.c = xVar;
        com.app.mlounge.data.repository.l0 l0Var = m0Var.a;
        androidx.lifecycle.viewmodel.internal.a aVarG = androidx.lifecycle.l0.g(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        SharingStarted sharingStartedWhileSubscribed$default = SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null);
        kotlin.collections.v vVar = kotlin.collections.v.e;
        this.d = FlowKt.stateIn(l0Var, aVarG, sharingStartedWhileSubscribed$default, vVar);
        Flow flow = q0Var.a;
        androidx.lifecycle.viewmodel.internal.a aVarG2 = androidx.lifecycle.l0.g(this);
        SharingStarted sharingStartedWhileSubscribed$default2 = SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null);
        kotlin.collections.w wVar = kotlin.collections.w.e;
        this.e = FlowKt.stateIn(flow, aVarG2, sharingStartedWhileSubscribed$default2, wVar);
        this.f = FlowKt.stateIn(q0Var.b, androidx.lifecycle.l0.g(this), SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), wVar);
        this.g = FlowKt.stateIn(q0Var.c, androidx.lifecycle.l0.g(this), SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), vVar);
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(vVar);
        this.h = MutableStateFlow;
        this.i = FlowKt.asStateFlow(MutableStateFlow);
        this.j = new androidx.compose.runtime.e1(0);
        this.k = new androidx.compose.runtime.e1(0);
        this.l = new androidx.compose.runtime.e1(0);
        kotlin.collections.u uVar = kotlin.collections.u.e;
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(uVar);
        this.m = MutableStateFlow2;
        this.n = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow MutableStateFlow3 = StateFlowKt.MutableStateFlow(uVar);
        this.o = MutableStateFlow3;
        this.p = FlowKt.asStateFlow(MutableStateFlow3);
        Boolean bool = Boolean.FALSE;
        MutableStateFlow MutableStateFlow4 = StateFlowKt.MutableStateFlow(bool);
        this.q = MutableStateFlow4;
        this.r = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow MutableStateFlow5 = StateFlowKt.MutableStateFlow(bool);
        this.s = MutableStateFlow5;
        this.t = FlowKt.asStateFlow(MutableStateFlow5);
        kotlin.coroutines.d dVar = null;
        MutableStateFlow MutableStateFlow6 = StateFlowKt.MutableStateFlow(null);
        this.u = MutableStateFlow6;
        this.v = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow MutableStateFlow7 = StateFlowKt.MutableStateFlow(null);
        this.w = MutableStateFlow7;
        this.x = FlowKt.asStateFlow(MutableStateFlow7);
        MutableStateFlow MutableStateFlow8 = StateFlowKt.MutableStateFlow("popularity.desc");
        this.y = MutableStateFlow8;
        this.z = FlowKt.asStateFlow(MutableStateFlow8);
        MutableStateFlow MutableStateFlow9 = StateFlowKt.MutableStateFlow(null);
        this.A = MutableStateFlow9;
        this.B = FlowKt.asStateFlow(MutableStateFlow9);
        MutableStateFlow MutableStateFlow10 = StateFlowKt.MutableStateFlow(bool);
        this.C = MutableStateFlow10;
        this.D = FlowKt.asStateFlow(MutableStateFlow10);
        this.E = FlowKt.stateIn(FlowKt.combine(y1Var.c, y1Var.e, new e(3, 3, null)), androidx.lifecycle.l0.g(this), companion.getEagerly(), bool);
        this.F = y1Var.T;
        this.G = FlowKt.distinctUntilChanged(new com.app.mlounge.data.local.prefs.x1(y1Var.p, 4));
        MutableStateFlow MutableStateFlow11 = StateFlowKt.MutableStateFlow(null);
        this.H = MutableStateFlow11;
        this.I = FlowKt.asStateFlow(MutableStateFlow11);
        MutableStateFlow MutableStateFlow12 = StateFlowKt.MutableStateFlow(bool);
        this.J = MutableStateFlow12;
        this.K = FlowKt.asStateFlow(MutableStateFlow12);
        MutableStateFlow MutableStateFlow13 = StateFlowKt.MutableStateFlow(null);
        this.L = MutableStateFlow13;
        this.M = FlowKt.asStateFlow(MutableStateFlow13);
        MutableStateFlow MutableStateFlow14 = StateFlowKt.MutableStateFlow(null);
        this.N = MutableStateFlow14;
        this.O = FlowKt.asStateFlow(MutableStateFlow14);
        MutableStateFlow MutableStateFlow15 = StateFlowKt.MutableStateFlow(uVar);
        this.P = MutableStateFlow15;
        this.Q = FlowKt.asStateFlow(MutableStateFlow15);
        MutableStateFlow MutableStateFlow16 = StateFlowKt.MutableStateFlow(bool);
        this.R = MutableStateFlow16;
        this.S = FlowKt.asStateFlow(MutableStateFlow16);
        this.T = 1;
        this.U = 1;
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(this), null, null, new androidx.room.coroutines.f(this, dVar, 29), 3, null);
        f();
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(this), null, null, new androidx.room.coroutines.f(this, dVar, 28), 3, null);
    }

    public static final boolean e(x1 x1Var) {
        return ((Boolean) x1Var.C.getValue()).booleanValue() && ((Boolean) x1Var.E.getValue()).booleanValue();
    }

    public final void f() {
        if (((Boolean) this.q.getValue()).booleanValue()) {
            return;
        }
        this.T = 1;
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(this), null, null, new com.app.mlounge.ui.screens.tvshows.l(this, (kotlin.coroutines.d) null, 2), 3, null);
    }
}
