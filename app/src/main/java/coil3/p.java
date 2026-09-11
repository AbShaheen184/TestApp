package coil3;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends kotlin.coroutines.jvm.internal.c {
    public k A;
    public /* synthetic */ Object B;
    public final /* synthetic */ q C;
    public int D;
    public coil3.request.o e;
    public coil3.request.g y;
    public f z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.C = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.a(null, 0, this);
    }
}
