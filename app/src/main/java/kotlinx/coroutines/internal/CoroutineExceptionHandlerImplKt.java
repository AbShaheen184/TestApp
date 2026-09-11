package kotlinx.coroutines.internal;

import java.util.Collection;
import java.util.ServiceLoader;
import kotlin.sequences.k;
import kotlinx.coroutines.CoroutineExceptionHandler;
import net.luminis.tls.engine.impl.c;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class CoroutineExceptionHandlerImplKt {
    private static final Collection<CoroutineExceptionHandler> platformExceptionHandlers = k.r(k.n(ServiceLoader.load(CoroutineExceptionHandler.class, CoroutineExceptionHandler.class.getClassLoader()).iterator()));

    public static final void ensurePlatformExceptionHandlerLoaded(CoroutineExceptionHandler coroutineExceptionHandler) {
        if (platformExceptionHandlers.contains(coroutineExceptionHandler)) {
            return;
        }
        c.r("Exception handler was not found via a ServiceLoader");
    }

    public static final Collection<CoroutineExceptionHandler> getPlatformExceptionHandlers() {
        return platformExceptionHandlers;
    }

    public static final void propagateExceptionFinalResort(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
