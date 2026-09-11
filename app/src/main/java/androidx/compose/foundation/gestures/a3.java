package androidx.compose.foundation.gestures;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a3 extends kotlin.coroutines.jvm.internal.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ b3 B;
    public int C;
    public kotlin.d e;
    public kotlin.jvm.functions.a y;
    public float z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(b3 b3Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.B = b3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.a(null, null, this);
    }
}
