package androidx.compose.foundation;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends kotlin.coroutines.jvm.internal.c {
    public int A;
    public long e;
    public /* synthetic */ Object y;
    public final /* synthetic */ n z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.z = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.b(0L, null, this);
    }
}
