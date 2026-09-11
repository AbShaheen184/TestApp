package com.app.mlounge.ui.viewmodel;

import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends androidx.lifecycle.q0 {
    public static final List G = com.google.common.base.c.q(new kotlin.k(com.app.mlounge.data.repository.a.e, "XVideos"), new kotlin.k(com.app.mlounge.data.repository.a.y, "EPorner"));
    public final Flow A;
    public final Flow B;
    public final MutableStateFlow C;
    public final StateFlow D;
    public int E;
    public boolean F;
    public final com.app.mlounge.data.repository.r b;
    public final com.app.mlounge.data.repository.x c;
    public final com.app.mlounge.data.local.prefs.a d;
    public final MutableStateFlow e;
    public final StateFlow f;
    public final MutableStateFlow g;
    public final StateFlow h;
    public final MutableStateFlow i;
    public final StateFlow j;
    public final MutableStateFlow k;
    public final StateFlow l;
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

    public c(com.app.mlounge.data.repository.r rVar, com.app.mlounge.data.repository.x xVar, com.app.mlounge.data.local.prefs.y1 y1Var, com.app.mlounge.data.local.prefs.a aVar) {
        rVar.getClass();
        xVar.getClass();
        y1Var.getClass();
        aVar.getClass();
        this.b = rVar;
        this.c = xVar;
        this.d = aVar;
        kotlin.collections.u uVar = kotlin.collections.u.e;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(uVar);
        this.e = MutableStateFlow;
        this.f = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(uVar);
        this.g = MutableStateFlow2;
        this.h = FlowKt.asStateFlow(MutableStateFlow2);
        Boolean bool = Boolean.FALSE;
        MutableStateFlow MutableStateFlow3 = StateFlowKt.MutableStateFlow(bool);
        this.i = MutableStateFlow3;
        this.j = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow MutableStateFlow4 = StateFlowKt.MutableStateFlow(bool);
        this.k = MutableStateFlow4;
        this.l = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow MutableStateFlow5 = StateFlowKt.MutableStateFlow(null);
        this.m = MutableStateFlow5;
        this.n = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow MutableStateFlow6 = StateFlowKt.MutableStateFlow(com.app.mlounge.data.repository.a.e);
        this.o = MutableStateFlow6;
        this.p = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow MutableStateFlow7 = StateFlowKt.MutableStateFlow(null);
        this.q = MutableStateFlow7;
        this.r = FlowKt.asStateFlow(MutableStateFlow7);
        MutableStateFlow MutableStateFlow8 = StateFlowKt.MutableStateFlow(null);
        this.s = MutableStateFlow8;
        this.t = FlowKt.asStateFlow(MutableStateFlow8);
        MutableStateFlow MutableStateFlow9 = StateFlowKt.MutableStateFlow(bool);
        this.u = MutableStateFlow9;
        this.v = FlowKt.asStateFlow(MutableStateFlow9);
        MutableStateFlow MutableStateFlow10 = StateFlowKt.MutableStateFlow(kotlin.collections.v.e);
        this.w = MutableStateFlow10;
        this.x = FlowKt.asStateFlow(MutableStateFlow10);
        MutableStateFlow MutableStateFlow11 = StateFlowKt.MutableStateFlow(bool);
        this.y = MutableStateFlow11;
        this.z = FlowKt.asStateFlow(MutableStateFlow11);
        this.A = y1Var.c;
        this.B = y1Var.d;
        MutableStateFlow MutableStateFlow12 = StateFlowKt.MutableStateFlow(bool);
        this.C = MutableStateFlow12;
        this.D = FlowKt.asStateFlow(MutableStateFlow12);
        this.E = 1;
        this.F = true;
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(this), null, null, new androidx.room.coroutines.f(this, (com.app.mlounge.data.repository.a) MutableStateFlow6.getValue(), null, 20), 3, null);
    }

    public final void e() {
        this.E = 1;
        this.F = true;
        String str = (String) this.q.getValue();
        if (str == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(this), null, null, new b(this, (com.app.mlounge.data.repository.a) this.o.getValue(), str, null, 1), 3, null);
    }
}
