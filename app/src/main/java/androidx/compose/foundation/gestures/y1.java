package androidx.compose.foundation.gestures;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 extends kotlin.coroutines.jvm.internal.c {
    public int A;
    public long e;
    public /* synthetic */ Object y;
    public final /* synthetic */ z1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(z1 z1Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.z = z1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.m(0L, 0L, this);
    }
}
