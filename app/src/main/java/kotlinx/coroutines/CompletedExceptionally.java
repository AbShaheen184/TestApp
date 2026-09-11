package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.f;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class CompletedExceptionally {
    private static final /* synthetic */ AtomicIntegerFieldUpdater _handled$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(CompletedExceptionally.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;
    public final Throwable cause;

    public /* synthetic */ CompletedExceptionally(Throwable th, boolean z, int i, f fVar) {
        this(th, (i & 2) != 0 ? false : z);
    }

    private final /* synthetic */ int get_handled$volatile() {
        return this._handled$volatile;
    }

    private final /* synthetic */ void set_handled$volatile(int i) {
        this._handled$volatile = i;
    }

    public final boolean getHandled() {
        return _handled$volatile$FU.get(this) == 1;
    }

    public final boolean makeHandled() {
        return _handled$volatile$FU.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return DebugStringsKt.getClassSimpleName(this) + '[' + this.cause + ']';
    }

    public CompletedExceptionally(Throwable th, boolean z) {
        this.cause = th;
        this._handled$volatile = z ? 1 : 0;
    }
}
