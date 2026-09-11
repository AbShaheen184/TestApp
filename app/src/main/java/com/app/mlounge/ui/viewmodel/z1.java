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
public final class z1 extends androidx.lifecycle.q0 {
    public final com.app.mlounge.data.repository.x b;
    public final com.app.mlounge.data.repository.j0 c;
    public final StateFlow d;
    public final StateFlow e;
    public final StateFlow f;
    public final StateFlow g;
    public final MutableStateFlow h;
    public final StateFlow i;
    public final androidx.compose.runtime.e1 j;
    public final androidx.compose.runtime.e1 k;
    public final androidx.compose.runtime.e1 l;
    public final StateFlow m;
    public final MutableStateFlow n;
    public final StateFlow o;
    public final StateFlow p;

    public z1(com.app.mlounge.data.repository.x xVar, com.app.mlounge.data.repository.m0 m0Var, com.app.mlounge.data.repository.j0 j0Var, com.app.mlounge.data.repository.q0 q0Var) {
        xVar.getClass();
        m0Var.getClass();
        j0Var.getClass();
        q0Var.getClass();
        this.b = xVar;
        this.c = j0Var;
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
        kotlin.coroutines.d dVar = null;
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(this), null, null, new w1(this, dVar, 1), 3, null);
        androidx.room.coroutines.l lVarI = androidx.datastore.preferences.protobuf.h1.i(xVar.a.a, new String[]{"watchlist"}, new androidx.room.z(14));
        androidx.lifecycle.viewmodel.internal.a aVarG3 = androidx.lifecycle.l0.g(this);
        SharingStarted sharingStartedWhileSubscribed$default3 = SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null);
        kotlin.collections.u uVar = kotlin.collections.u.e;
        StateFlow stateFlowStateIn = FlowKt.stateIn(lVarI, aVarG3, sharingStartedWhileSubscribed$default3, uVar);
        this.m = stateFlowStateIn;
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(y1.ADDED_DESC);
        this.n = MutableStateFlow2;
        this.o = FlowKt.asStateFlow(MutableStateFlow2);
        this.p = FlowKt.stateIn(FlowKt.combine(stateFlowStateIn, MutableStateFlow2, new androidx.datastore.preferences.i(3, 1, dVar)), androidx.lifecycle.l0.g(this), SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), uVar);
    }
}
