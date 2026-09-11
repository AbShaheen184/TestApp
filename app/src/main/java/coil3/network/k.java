package coil3.network;

import kotlin.jvm.internal.z;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends kotlin.coroutines.jvm.internal.c {
    public final /* synthetic */ n A;
    public int B;
    public z e;
    public z y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, kotlin.coroutines.d dVar) {
        super(dVar);
        this.A = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return n.b(this.A, this);
    }
}
