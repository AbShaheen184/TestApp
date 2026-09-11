package androidx.room;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends kotlin.coroutines.jvm.internal.c {
    public int A;
    public int B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ i0 E;
    public int F;
    public m e;
    public String y;
    public String[] z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(i0 i0Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.E = i0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return i0.c(this.E, null, 0, this);
    }
}
