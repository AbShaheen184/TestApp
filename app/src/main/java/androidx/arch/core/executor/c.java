package androidx.arch.core.executor;

import com.google.firebase.crashlytics.internal.common.t;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements ThreadFactory {
    public final /* synthetic */ int a;
    public final Number b;

    public c() {
        this.a = 0;
        this.b = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) this.b).getAndIncrement());
                return thread;
            default:
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(new t(runnable, 0));
                threadNewThread.setName("awaitEvenIfOnMainThread task continuation executor" + ((AtomicLong) this.b).getAndIncrement());
                return threadNewThread;
        }
    }

    public c(AtomicLong atomicLong) {
        this.a = 1;
        this.b = atomicLong;
    }
}
