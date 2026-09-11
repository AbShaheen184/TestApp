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
public final class k extends androidx.lifecycle.q0 {
    public final MutableStateFlow A;
    public final StateFlow B;
    public final com.app.mlounge.data.local.prefs.y1 b;
    public final com.app.mlounge.data.iptv.l c;
    public final StateFlow d;
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
    public final StateFlow q;
    public final StateFlow r;
    public final StateFlow s;
    public final StateFlow t;
    public final StateFlow u;
    public final StateFlow v;
    public final MutableStateFlow w;
    public final StateFlow x;
    public final MutableStateFlow y;
    public final StateFlow z;

    public k(com.app.mlounge.data.local.prefs.y1 y1Var, com.app.mlounge.data.iptv.l lVar) {
        y1Var.getClass();
        lVar.getClass();
        this.b = y1Var;
        this.c = lVar;
        Flow flow = y1Var.V;
        androidx.lifecycle.viewmodel.internal.a aVarG = androidx.lifecycle.l0.g(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        this.d = FlowKt.stateIn(flow, aVarG, SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), "m3u");
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow("");
        this.e = MutableStateFlow;
        this.f = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow("");
        this.g = MutableStateFlow2;
        this.h = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow MutableStateFlow3 = StateFlowKt.MutableStateFlow("");
        this.i = MutableStateFlow3;
        this.j = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow MutableStateFlow4 = StateFlowKt.MutableStateFlow("");
        this.k = MutableStateFlow4;
        this.l = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow MutableStateFlow5 = StateFlowKt.MutableStateFlow("");
        this.m = MutableStateFlow5;
        this.n = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow MutableStateFlow6 = StateFlowKt.MutableStateFlow("");
        this.o = MutableStateFlow6;
        this.p = FlowKt.asStateFlow(MutableStateFlow6);
        this.q = FlowKt.stateIn(y1Var.c0, androidx.lifecycle.l0.g(this), SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), 0);
        this.r = FlowKt.stateIn(y1Var.d0, androidx.lifecycle.l0.g(this), SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), 0L);
        Flow flow2 = y1Var.e0;
        androidx.lifecycle.viewmodel.internal.a aVarG2 = androidx.lifecycle.l0.g(this);
        SharingStarted sharingStartedWhileSubscribed$default = SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null);
        Boolean bool = Boolean.FALSE;
        this.s = FlowKt.stateIn(flow2, aVarG2, sharingStartedWhileSubscribed$default, bool);
        this.t = FlowKt.stateIn(y1Var.f0, androidx.lifecycle.l0.g(this), SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), "");
        this.u = FlowKt.stateIn(y1Var.g0, androidx.lifecycle.l0.g(this), SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), "");
        this.v = FlowKt.stateIn(y1Var.h0, androidx.lifecycle.l0.g(this), SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), Boolean.TRUE);
        MutableStateFlow MutableStateFlow7 = StateFlowKt.MutableStateFlow(bool);
        this.w = MutableStateFlow7;
        this.x = FlowKt.asStateFlow(MutableStateFlow7);
        MutableStateFlow MutableStateFlow8 = StateFlowKt.MutableStateFlow("");
        this.y = MutableStateFlow8;
        this.z = FlowKt.asStateFlow(MutableStateFlow8);
        MutableStateFlow MutableStateFlow9 = StateFlowKt.MutableStateFlow(null);
        this.A = MutableStateFlow9;
        this.B = FlowKt.asStateFlow(MutableStateFlow9);
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(this), null, null, new androidx.room.coroutines.f(this, (kotlin.coroutines.d) null, 23), 3, null);
    }

    public final void h(String str) {
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(this), null, null, new j(this, str, null, 4), 3, null);
    }
}
