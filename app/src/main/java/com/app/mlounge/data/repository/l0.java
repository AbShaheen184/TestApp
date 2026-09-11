package com.app.mlounge.data.repository;

import com.app.mlounge.data.local.prefs.v1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements Flow {
    public final /* synthetic */ int e;
    public final /* synthetic */ androidx.room.coroutines.l y;

    public /* synthetic */ l0(androidx.room.coroutines.l lVar, int i) {
        this.e = i;
        this.y = lVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                Object objCollect = this.y.collect(new v1(flowCollector, 2), dVar);
                return objCollect == kotlin.coroutines.intrinsics.a.e ? objCollect : kotlin.y.a;
            default:
                Object objCollect2 = this.y.collect(new v1(flowCollector, 3), dVar);
                return objCollect2 == kotlin.coroutines.intrinsics.a.e ? objCollect2 : kotlin.y.a;
        }
    }
}
