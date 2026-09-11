package androidx.compose.foundation.gestures;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends kotlin.coroutines.jvm.internal.c {
    public final /* synthetic */ f2 A;
    public int B;
    public v e;
    public androidx.compose.foundation.interaction.b y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(f2 f2Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.A = f2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return f2.P0(this.A, null, this);
    }
}
