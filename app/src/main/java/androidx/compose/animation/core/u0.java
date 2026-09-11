package androidx.compose.animation.core;

import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {
    public final AtomicReference a = new AtomicReference(null);
    public final Mutex b = MutexKt.Mutex$default(false, 1, null);

    public static Object a(u0 u0Var, kotlin.jvm.functions.l lVar, kotlin.coroutines.d dVar) {
        u0Var.getClass();
        return CoroutineScopeKt.coroutineScope(new t0(u0Var, lVar, null), dVar);
    }
}
