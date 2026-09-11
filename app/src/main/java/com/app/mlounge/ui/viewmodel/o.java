package com.app.mlounge.ui.viewmodel;

import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements Flow {
    public final /* synthetic */ int e;
    public final /* synthetic */ Flow y;
    public final /* synthetic */ androidx.lifecycle.q0 z;

    public /* synthetic */ o(Flow flow, androidx.lifecycle.q0 q0Var, int i) {
        this.e = i;
        this.y = flow;
        this.z = q0Var;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                Object objCollect = this.y.collect(new androidx.compose.foundation.interaction.f(8, flowCollector, (p) this.z), dVar);
                return objCollect == kotlin.coroutines.intrinsics.a.e ? objCollect : kotlin.y.a;
            default:
                Object objCollect2 = this.y.collect(new androidx.compose.foundation.interaction.f(9, flowCollector, (r1) this.z), dVar);
                return objCollect2 == kotlin.coroutines.intrinsics.a.e ? objCollect2 : kotlin.y.a;
        }
    }
}
