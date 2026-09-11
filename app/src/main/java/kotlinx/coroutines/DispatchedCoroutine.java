package kotlinx.coroutines;

import com.google.android.material.shape.e;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.jvm.functions.l;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import kotlinx.coroutines.internal.ScopeCoroutine;
import net.luminis.tls.engine.impl.c;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class DispatchedCoroutine<T> extends ScopeCoroutine<T> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater _decision$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(DispatchedCoroutine.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public DispatchedCoroutine(i iVar, d<? super T> dVar) {
        super(iVar, dVar);
    }

    private final /* synthetic */ int get_decision$volatile() {
        return this._decision$volatile;
    }

    private final /* synthetic */ void loop$atomicfu$ATOMIC_FIELD_UPDATER$Int(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, Object obj, l lVar) {
        while (true) {
            lVar.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    private final /* synthetic */ void set_decision$volatile(int i) {
        this._decision$volatile = i;
    }

    private final boolean tryResume() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _decision$volatile$FU;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                c.r("Already resumed");
                return false;
            }
        } while (!_decision$volatile$FU.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean trySuspend() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _decision$volatile$FU;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                c.r("Already suspended");
                return false;
            }
        } while (!_decision$volatile$FU.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.JobSupport
    public void afterCompletion(Object obj) {
        afterResume(obj);
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.AbstractCoroutine
    public void afterResume(Object obj) {
        if (tryResume()) {
            return;
        }
        DispatchedContinuationKt.resumeCancellableWith(e.g(this.uCont), CompletionStateKt.recoverResult(obj, this.uCont));
    }

    public final Object getResult$kotlinx_coroutines_core() throws Throwable {
        if (trySuspend()) {
            return kotlin.coroutines.intrinsics.a.e;
        }
        Object objUnboxState = JobSupportKt.unboxState(getState$kotlinx_coroutines_core());
        if (objUnboxState instanceof CompletedExceptionally) {
            throw ((CompletedExceptionally) objUnboxState).cause;
        }
        return objUnboxState;
    }
}
