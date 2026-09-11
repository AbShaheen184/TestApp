package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.g;
import kotlin.coroutines.h;
import kotlin.coroutines.i;
import kotlin.jvm.functions.p;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class DownstreamExceptionContext implements i {
    private final /* synthetic */ i $$delegate_0;
    public final Throwable e;

    public DownstreamExceptionContext(Throwable th, i iVar) {
        this.$$delegate_0 = iVar;
        this.e = th;
    }

    @Override // kotlin.coroutines.i
    public <R> R fold(R r, p pVar) {
        return (R) this.$$delegate_0.fold(r, pVar);
    }

    @Override // kotlin.coroutines.i
    public <E extends g> E get(h hVar) {
        return (E) this.$$delegate_0.get(hVar);
    }

    @Override // kotlin.coroutines.i
    public i minusKey(h hVar) {
        return this.$$delegate_0.minusKey(hVar);
    }

    @Override // kotlin.coroutines.i
    public i plus(i iVar) {
        return this.$$delegate_0.plus(iVar);
    }
}
