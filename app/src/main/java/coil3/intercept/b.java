package coil3.intercept;

import coil3.fetch.k;
import coil3.request.n;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends kotlin.coroutines.jvm.internal.c {
    public Object A;
    public n B;
    public coil3.f C;
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ f F;
    public int G;
    public k e;
    public coil3.d y;
    public coil3.request.g z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.F = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return f.a(this.F, null, null, null, null, null, null, this);
    }
}
