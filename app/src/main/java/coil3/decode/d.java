package coil3.decode;

import kotlinx.coroutines.sync.Semaphore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends kotlin.coroutines.jvm.internal.c {
    public int A;
    public Semaphore e;
    public /* synthetic */ Object y;
    public final /* synthetic */ e z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.z = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.a(this);
    }
}
