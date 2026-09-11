package androidx.room.coroutines;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends kotlin.coroutines.jvm.internal.c {
    public final /* synthetic */ androidx.compose.animation.a0 A;
    public /* synthetic */ Object e;
    public int y;
    public FlowCollector z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(androidx.compose.animation.a0 a0Var, kotlin.coroutines.d dVar) {
        super(dVar);
        this.A = a0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.y |= Integer.MIN_VALUE;
        return this.A.emit(null, this);
    }
}
