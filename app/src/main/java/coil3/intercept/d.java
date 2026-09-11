package coil3.intercept;

import coil3.request.n;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends kotlin.coroutines.jvm.internal.c {
    public n A;
    public coil3.f B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ f E;
    public int F;
    public coil3.d e;
    public coil3.request.g y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.E = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.c(null, null, null, null, null, this);
    }
}
