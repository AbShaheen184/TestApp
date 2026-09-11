package androidx.compose.foundation;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 {
    public final AtomicReference a = new AtomicReference(null);
    public final Mutex b = MutexKt.Mutex$default(false, 1, null);

    public static final void a(n1 n1Var, k1 k1Var) {
        AtomicReference atomicReference = n1Var.a;
        while (true) {
            k1 k1Var2 = (k1) atomicReference.get();
            if (k1Var2 != null && k1Var.a.compareTo(k1Var2.a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            do {
                if (atomicReference.compareAndSet(k1Var2, k1Var)) {
                    if (k1Var2 != null) {
                        k1Var2.b.cancel((CancellationException) new j1("Mutation interrupted", 0));
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == k1Var2);
        }
    }
}
