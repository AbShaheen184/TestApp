package androidx.lifecycle;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt__JobKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements t, CoroutineScope {
    public final p e;
    public final kotlin.coroutines.i y;

    public q(p pVar, kotlin.coroutines.i iVar) {
        iVar.getClass();
        this.e = pVar;
        this.y = iVar;
        if (((x) pVar).d == o.e) {
            JobKt__JobKt.cancel$default(iVar, (CancellationException) null, 1, (Object) null);
        }
    }

    @Override // androidx.lifecycle.t
    public final void g(v vVar, n nVar) {
        p pVar = this.e;
        if (((x) pVar).d.compareTo(o.e) <= 0) {
            pVar.b(this);
            JobKt__JobKt.cancel$default(this.y, (CancellationException) null, 1, (Object) null);
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final kotlin.coroutines.i getCoroutineContext() {
        return this.y;
    }
}
