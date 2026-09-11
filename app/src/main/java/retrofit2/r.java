package retrofit2;

import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends t {
    public final /* synthetic */ int d;
    public final f e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(q0 q0Var, okhttp3.y yVar, m mVar, f fVar, int i) {
        super(q0Var, yVar, mVar);
        this.d = i;
        this.e = fVar;
    }

    @Override // retrofit2.t
    public final Object a(z zVar, Object[] objArr) {
        switch (this.d) {
            case 0:
                return this.e.h(zVar);
            default:
                d dVar = (d) this.e.h(zVar);
                kotlin.coroutines.d dVar2 = (kotlin.coroutines.d) objArr[objArr.length - 1];
                try {
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(com.google.android.material.shape.e.g(dVar2), 1);
                    cancellableContinuationImpl.initCancellability();
                    cancellableContinuationImpl.invokeOnCancellation(new v(dVar, 2));
                    dVar.w(new coil3.network.okhttp.internal.e(cancellableContinuationImpl, 2));
                    return cancellableContinuationImpl.getResult();
                } catch (Exception e) {
                    z0.p(e, dVar2);
                    return kotlin.coroutines.intrinsics.a.e;
                }
        }
    }
}
