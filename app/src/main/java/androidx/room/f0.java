package androidx.room;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends kotlin.coroutines.jvm.internal.c {
    public int A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ i0 D;
    public int E;
    public m e;
    public String y;
    public String[] z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(i0 i0Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.D = i0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return i0.d(this.D, null, 0, this);
    }
}
