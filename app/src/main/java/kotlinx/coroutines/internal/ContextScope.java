package kotlinx.coroutines.internal;

import kotlin.coroutines.i;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class ContextScope implements CoroutineScope {
    private final i coroutineContext;

    public ContextScope(i iVar) {
        this.coroutineContext = iVar;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public i getCoroutineContext() {
        return this.coroutineContext;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
