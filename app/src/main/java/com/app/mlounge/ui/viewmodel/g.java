package com.app.mlounge.ui.viewmodel;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends androidx.lifecycle.q0 {
    public final StateFlow A;
    public final MutableStateFlow B;
    public final StateFlow C;
    public final androidx.compose.runtime.e1 D;
    public final androidx.compose.runtime.e1 E;
    public final androidx.compose.runtime.e1 F;
    public int G;
    public boolean H;
    public Job I;
    public final com.app.mlounge.data.repository.r b;
    public final com.app.mlounge.data.repository.x c;
    public final StateFlow d;
    public final StateFlow e;
    public final MutableStateFlow f;
    public final StateFlow g;
    public final MutableStateFlow h;
    public final StateFlow i;
    public final MutableStateFlow j;
    public final StateFlow k;
    public final MutableStateFlow l;
    public final StateFlow m;
    public final MutableStateFlow n;
    public final StateFlow o;
    public final MutableStateFlow p;
    public final StateFlow q;
    public final MutableStateFlow r;
    public final StateFlow s;
    public final MutableStateFlow t;
    public final StateFlow u;
    public final MutableStateFlow v;
    public final StateFlow w;
    public final MutableStateFlow x;
    public final StateFlow y;
    public final MutableStateFlow z;

    public g(com.app.mlounge.data.repository.r rVar, com.app.mlounge.data.repository.x xVar, com.app.mlounge.data.repository.m0 m0Var, com.app.mlounge.data.repository.q0 q0Var) {
        rVar.getClass();
        xVar.getClass();
        m0Var.getClass();
        q0Var.getClass();
        this.b = rVar;
        this.c = xVar;
        com.app.mlounge.data.repository.l0 l0Var = m0Var.a;
        androidx.lifecycle.viewmodel.internal.a aVarG = androidx.lifecycle.l0.g(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        this.d = FlowKt.stateIn(l0Var, aVarG, SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), kotlin.collections.v.e);
        this.e = FlowKt.stateIn(q0Var.a, androidx.lifecycle.l0.g(this), SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), kotlin.collections.w.e);
        kotlin.collections.u uVar = kotlin.collections.u.e;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(uVar);
        this.f = MutableStateFlow;
        this.g = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(uVar);
        this.h = MutableStateFlow2;
        this.i = FlowKt.asStateFlow(MutableStateFlow2);
        Boolean bool = Boolean.FALSE;
        MutableStateFlow MutableStateFlow3 = StateFlowKt.MutableStateFlow(bool);
        this.j = MutableStateFlow3;
        this.k = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow MutableStateFlow4 = StateFlowKt.MutableStateFlow(bool);
        this.l = MutableStateFlow4;
        this.m = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow MutableStateFlow5 = StateFlowKt.MutableStateFlow(null);
        this.n = MutableStateFlow5;
        this.o = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow MutableStateFlow6 = StateFlowKt.MutableStateFlow("Action");
        this.p = MutableStateFlow6;
        this.q = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow MutableStateFlow7 = StateFlowKt.MutableStateFlow("tv");
        this.r = MutableStateFlow7;
        this.s = FlowKt.asStateFlow(MutableStateFlow7);
        MutableStateFlow MutableStateFlow8 = StateFlowKt.MutableStateFlow(null);
        this.t = MutableStateFlow8;
        this.u = FlowKt.asStateFlow(MutableStateFlow8);
        MutableStateFlow MutableStateFlow9 = StateFlowKt.MutableStateFlow(bool);
        this.v = MutableStateFlow9;
        this.w = FlowKt.asStateFlow(MutableStateFlow9);
        MutableStateFlow MutableStateFlow10 = StateFlowKt.MutableStateFlow(uVar);
        this.x = MutableStateFlow10;
        this.y = FlowKt.asStateFlow(MutableStateFlow10);
        MutableStateFlow MutableStateFlow11 = StateFlowKt.MutableStateFlow(uVar);
        this.z = MutableStateFlow11;
        this.A = FlowKt.asStateFlow(MutableStateFlow11);
        MutableStateFlow MutableStateFlow12 = StateFlowKt.MutableStateFlow(bool);
        this.B = MutableStateFlow12;
        this.C = FlowKt.asStateFlow(MutableStateFlow12);
        this.D = new androidx.compose.runtime.e1(0);
        this.E = new androidx.compose.runtime.e1(0);
        this.F = new androidx.compose.runtime.e1(0);
        this.G = 1;
        this.H = true;
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(this), null, null, new f(this, null, 1), 3, null);
        e();
    }

    public final void e() {
        Job job = this.I;
        kotlin.coroutines.d dVar = null;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.G = 1;
        this.f.setValue(kotlin.collections.u.e);
        this.n.setValue(null);
        this.I = BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(this), null, null, new f(this, dVar, 0), 3, null);
    }
}
