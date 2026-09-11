package com.app.mlounge.data.local.prefs;

import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 implements Flow {
    public final /* synthetic */ int e;
    public final /* synthetic */ Flow y;

    public /* synthetic */ x1(Flow flow, int i) {
        this.e = i;
        this.y = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                Object objCollect = this.y.collect(new v1(flowCollector, 1), dVar);
                return objCollect == kotlin.coroutines.intrinsics.a.e ? objCollect : kotlin.y.a;
            case 1:
                Object objCollect2 = this.y.collect(new v1(flowCollector, 4), dVar);
                return objCollect2 == kotlin.coroutines.intrinsics.a.e ? objCollect2 : kotlin.y.a;
            case 2:
                Object objCollect3 = this.y.collect(new v1(flowCollector, 5), dVar);
                return objCollect3 == kotlin.coroutines.intrinsics.a.e ? objCollect3 : kotlin.y.a;
            case 3:
                Object objCollect4 = this.y.collect(new v1(flowCollector, 6), dVar);
                return objCollect4 == kotlin.coroutines.intrinsics.a.e ? objCollect4 : kotlin.y.a;
            default:
                Object objCollect5 = this.y.collect(new v1(flowCollector, 7), dVar);
                return objCollect5 == kotlin.coroutines.intrinsics.a.e ? objCollect5 : kotlin.y.a;
        }
    }
}
