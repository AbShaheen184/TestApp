package kotlinx.coroutines;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.luminis.tls.engine.impl.c;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class ThreadPoolDispatcherKt__ThreadPoolDispatcherKt {
    @DelicateCoroutinesApi
    public static final ExecutorCoroutineDispatcher newFixedThreadPoolContext(final int i, final String str) {
        if (i >= 1) {
            final AtomicInteger atomicInteger = new AtomicInteger();
            return ExecutorsKt.from(Executors.unconfigurableExecutorService(Executors.newScheduledThreadPool(i, new ThreadFactory() { // from class: kotlinx.coroutines.a
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    return ThreadPoolDispatcherKt__ThreadPoolDispatcherKt.newFixedThreadPoolContext$lambda$2$ThreadPoolDispatcherKt__ThreadPoolDispatcherKt(i, str, atomicInteger, runnable);
                }
            })));
        }
        c.p(androidx.privacysandbox.ads.adservices.java.internal.a.p("Expected at least one thread, but ", i, " specified"));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread newFixedThreadPoolContext$lambda$2$ThreadPoolDispatcherKt__ThreadPoolDispatcherKt(int i, String str, AtomicInteger atomicInteger, Runnable runnable) {
        if (i != 1) {
            str = str + '-' + atomicInteger.incrementAndGet();
        }
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(true);
        return thread;
    }
}
