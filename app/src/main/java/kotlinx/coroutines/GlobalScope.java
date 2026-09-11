package kotlinx.coroutines;

import kotlin.coroutines.i;
import kotlin.coroutines.j;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@DelicateCoroutinesApi
public final class GlobalScope implements CoroutineScope {
    public static final GlobalScope INSTANCE = new GlobalScope();

    private GlobalScope() {
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public i getCoroutineContext() {
        return j.e;
    }
}
