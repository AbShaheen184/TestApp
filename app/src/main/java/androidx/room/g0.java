package androidx.room;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends kotlin.coroutines.jvm.internal.c {
    public int A;
    public androidx.media3.common.util.b e;
    public /* synthetic */ Object y;
    public final /* synthetic */ i0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(i0 i0Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.z = i0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.e(this);
    }
}
