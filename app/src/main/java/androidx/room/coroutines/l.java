package androidx.room.coroutines;

import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Flow {
    public final /* synthetic */ Flow e;
    public final /* synthetic */ androidx.room.q y;
    public final /* synthetic */ kotlin.jvm.functions.l z;

    public l(Flow flow, androidx.room.q qVar, kotlin.jvm.functions.l lVar) {
        this.e = flow;
        this.y = qVar;
        this.z = lVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, kotlin.coroutines.d dVar) {
        Object objCollect = this.e.collect(new androidx.compose.animation.a0(2, flowCollector, this.y, this.z), dVar);
        return objCollect == kotlin.coroutines.intrinsics.a.e ? objCollect : kotlin.y.a;
    }
}
