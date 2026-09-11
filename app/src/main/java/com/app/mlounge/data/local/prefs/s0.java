package com.app.mlounge.data.local.prefs;

import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements Flow {
    public final /* synthetic */ int e;
    public final /* synthetic */ Flow y;

    public /* synthetic */ s0(Flow flow, int i) {
        this.e = i;
        this.y = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                Object objCollect = this.y.collect(new p0(flowCollector, 2), dVar);
                return objCollect == kotlin.coroutines.intrinsics.a.e ? objCollect : kotlin.y.a;
            case 1:
                Object objCollect2 = this.y.collect(new p0(flowCollector, 3), dVar);
                return objCollect2 == kotlin.coroutines.intrinsics.a.e ? objCollect2 : kotlin.y.a;
            case 2:
                Object objCollect3 = this.y.collect(new p0(flowCollector, 4), dVar);
                return objCollect3 == kotlin.coroutines.intrinsics.a.e ? objCollect3 : kotlin.y.a;
            case 3:
                Object objCollect4 = this.y.collect(new p0(flowCollector, 5), dVar);
                return objCollect4 == kotlin.coroutines.intrinsics.a.e ? objCollect4 : kotlin.y.a;
            case 4:
                Object objCollect5 = this.y.collect(new p0(flowCollector, 6), dVar);
                return objCollect5 == kotlin.coroutines.intrinsics.a.e ? objCollect5 : kotlin.y.a;
            case 5:
                Object objCollect6 = this.y.collect(new androidx.datastore.core.n(flowCollector, 26), dVar);
                return objCollect6 == kotlin.coroutines.intrinsics.a.e ? objCollect6 : kotlin.y.a;
            case 6:
                Object objCollect7 = this.y.collect(new p0(flowCollector, 8), dVar);
                return objCollect7 == kotlin.coroutines.intrinsics.a.e ? objCollect7 : kotlin.y.a;
            case 7:
                Object objCollect8 = this.y.collect(new p0(flowCollector, 9), dVar);
                return objCollect8 == kotlin.coroutines.intrinsics.a.e ? objCollect8 : kotlin.y.a;
            case 8:
                Object objCollect9 = this.y.collect(new p0(flowCollector, 10), dVar);
                return objCollect9 == kotlin.coroutines.intrinsics.a.e ? objCollect9 : kotlin.y.a;
            case 9:
                Object objCollect10 = this.y.collect(new p0(flowCollector, 11), dVar);
                return objCollect10 == kotlin.coroutines.intrinsics.a.e ? objCollect10 : kotlin.y.a;
            case 10:
                Object objCollect11 = this.y.collect(new p0(flowCollector, 12), dVar);
                return objCollect11 == kotlin.coroutines.intrinsics.a.e ? objCollect11 : kotlin.y.a;
            case 11:
                Object objCollect12 = this.y.collect(new p0(flowCollector, 13), dVar);
                return objCollect12 == kotlin.coroutines.intrinsics.a.e ? objCollect12 : kotlin.y.a;
            case 12:
                Object objCollect13 = this.y.collect(new p0(flowCollector, 14), dVar);
                return objCollect13 == kotlin.coroutines.intrinsics.a.e ? objCollect13 : kotlin.y.a;
            case 13:
                Object objCollect14 = this.y.collect(new p0(flowCollector, 15), dVar);
                return objCollect14 == kotlin.coroutines.intrinsics.a.e ? objCollect14 : kotlin.y.a;
            case 14:
                Object objCollect15 = this.y.collect(new p0(flowCollector, 16), dVar);
                return objCollect15 == kotlin.coroutines.intrinsics.a.e ? objCollect15 : kotlin.y.a;
            case 15:
                Object objCollect16 = this.y.collect(new p0(flowCollector, 17), dVar);
                return objCollect16 == kotlin.coroutines.intrinsics.a.e ? objCollect16 : kotlin.y.a;
            case 16:
                Object objCollect17 = this.y.collect(new p0(flowCollector, 7), dVar);
                return objCollect17 == kotlin.coroutines.intrinsics.a.e ? objCollect17 : kotlin.y.a;
            case 17:
                Object objCollect18 = this.y.collect(new p0(flowCollector, 19), dVar);
                return objCollect18 == kotlin.coroutines.intrinsics.a.e ? objCollect18 : kotlin.y.a;
            case 18:
                Object objCollect19 = this.y.collect(new p0(flowCollector, 20), dVar);
                return objCollect19 == kotlin.coroutines.intrinsics.a.e ? objCollect19 : kotlin.y.a;
            case 19:
                Object objCollect20 = this.y.collect(new p0(flowCollector, 21), dVar);
                return objCollect20 == kotlin.coroutines.intrinsics.a.e ? objCollect20 : kotlin.y.a;
            case 20:
                Object objCollect21 = this.y.collect(new p0(flowCollector, 22), dVar);
                return objCollect21 == kotlin.coroutines.intrinsics.a.e ? objCollect21 : kotlin.y.a;
            case 21:
                Object objCollect22 = this.y.collect(new p0(flowCollector, 23), dVar);
                return objCollect22 == kotlin.coroutines.intrinsics.a.e ? objCollect22 : kotlin.y.a;
            case 22:
                Object objCollect23 = this.y.collect(new p0(flowCollector, 24), dVar);
                return objCollect23 == kotlin.coroutines.intrinsics.a.e ? objCollect23 : kotlin.y.a;
            case 23:
                Object objCollect24 = this.y.collect(new p0(flowCollector, 25), dVar);
                return objCollect24 == kotlin.coroutines.intrinsics.a.e ? objCollect24 : kotlin.y.a;
            case 24:
                Object objCollect25 = this.y.collect(new p0(flowCollector, 26), dVar);
                return objCollect25 == kotlin.coroutines.intrinsics.a.e ? objCollect25 : kotlin.y.a;
            case 25:
                Object objCollect26 = this.y.collect(new p0(flowCollector, 27), dVar);
                return objCollect26 == kotlin.coroutines.intrinsics.a.e ? objCollect26 : kotlin.y.a;
            case 26:
                Object objCollect27 = this.y.collect(new p0(flowCollector, 18), dVar);
                return objCollect27 == kotlin.coroutines.intrinsics.a.e ? objCollect27 : kotlin.y.a;
            case 27:
                Object objCollect28 = this.y.collect(new p0(flowCollector, 28), dVar);
                return objCollect28 == kotlin.coroutines.intrinsics.a.e ? objCollect28 : kotlin.y.a;
            case 28:
                Object objCollect29 = this.y.collect(new p0(flowCollector, 29), dVar);
                return objCollect29 == kotlin.coroutines.intrinsics.a.e ? objCollect29 : kotlin.y.a;
            default:
                Object objCollect30 = this.y.collect(new v1(flowCollector, 0), dVar);
                return objCollect30 == kotlin.coroutines.intrinsics.a.e ? objCollect30 : kotlin.y.a;
        }
    }
}
