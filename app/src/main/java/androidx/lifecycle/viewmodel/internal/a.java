package androidx.lifecycle.viewmodel.internal;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.i;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt__JobKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements AutoCloseable, CoroutineScope {
    public final i e;

    public a(i iVar) {
        iVar.getClass();
        this.e = iVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        JobKt__JobKt.cancel$default(this.e, (CancellationException) null, 1, (Object) null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final i getCoroutineContext() {
        return this.e;
    }
}
