package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.coroutines.j;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class NoOpContinuation implements d<Object> {
    public static final NoOpContinuation INSTANCE = new NoOpContinuation();
    private static final i context = j.e;

    private NoOpContinuation() {
    }

    @Override // kotlin.coroutines.d
    public i getContext() {
        return context;
    }

    @Override // kotlin.coroutines.d
    public void resumeWith(Object obj) {
    }
}
