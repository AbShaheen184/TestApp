package com.app.mlounge.ui.viewmodel;

import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends androidx.lifecycle.q0 {
    public final com.app.mlounge.data.repository.j0 b;
    public final MutableStateFlow c;
    public final StateFlow d;
    public final MutableStateFlow e;
    public final StateFlow f;
    public final MutableStateFlow g;
    public final StateFlow h;
    public final MutableStateFlow i;
    public final StateFlow j;

    public i0(com.app.mlounge.data.repository.j0 j0Var) {
        j0Var.getClass();
        this.b = j0Var;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.c = MutableStateFlow;
        this.d = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(kotlin.collections.u.e);
        this.e = MutableStateFlow2;
        this.f = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow MutableStateFlow3 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.g = MutableStateFlow3;
        this.h = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this.i = MutableStateFlow4;
        this.j = FlowKt.asStateFlow(MutableStateFlow4);
    }
}
