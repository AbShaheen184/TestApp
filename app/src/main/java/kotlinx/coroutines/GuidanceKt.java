package kotlinx.coroutines;

import kotlin.c;
import kotlin.coroutines.i;
import kotlin.coroutines.j;
import kotlin.jvm.functions.p;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class GuidanceKt {
    @c
    public static final <T> Deferred<T> async(i iVar, CoroutineStart coroutineStart, p pVar) {
        throw new UnsupportedOperationException("Should never be called, was introduced to help with incomplete code");
    }

    public static /* synthetic */ Deferred async$default(i iVar, CoroutineStart coroutineStart, p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            iVar = j.e;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return async(iVar, coroutineStart, pVar);
    }

    @c
    public static final Job launch(i iVar, CoroutineStart coroutineStart, p pVar) {
        throw new UnsupportedOperationException("Should never be called, was introduced to help with incomplete code");
    }

    public static /* synthetic */ Job launch$default(i iVar, CoroutineStart coroutineStart, p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            iVar = j.e;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return launch(iVar, coroutineStart, pVar);
    }
}
