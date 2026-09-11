package androidx.compose.foundation.gestures;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends kotlin.coroutines.jvm.internal.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ j1 B;
    public int C;
    public m2 e;
    public kotlin.jvm.internal.w y;
    public float z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(j1 j1Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.B = j1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return j1.a(this.B, null, null, 0.0f, 0.0f, this);
    }
}
