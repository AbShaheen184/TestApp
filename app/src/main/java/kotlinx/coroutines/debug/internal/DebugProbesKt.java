package kotlinx.coroutines.debug.internal;

import kotlin.coroutines.d;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class DebugProbesKt {
    public static final <T> d<T> probeCoroutineCreated(d<? super T> dVar) {
        return DebugProbesImpl.INSTANCE.probeCoroutineCreated$kotlinx_coroutines_core(dVar);
    }

    public static final void probeCoroutineResumed(d<?> dVar) {
        DebugProbesImpl.INSTANCE.probeCoroutineResumed$kotlinx_coroutines_core(dVar);
    }

    public static final void probeCoroutineSuspended(d<?> dVar) {
        DebugProbesImpl.INSTANCE.probeCoroutineSuspended$kotlinx_coroutines_core(dVar);
    }
}
