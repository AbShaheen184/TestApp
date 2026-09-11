package kotlinx.coroutines.internal;

import androidx.compose.ui.res.e;
import kotlin.c;
import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.jvm.internal.f;
import kotlin.y;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class MissingMainCoroutineDispatcher extends MainCoroutineDispatcher implements Delay {
    private final Throwable cause;
    private final String errorHint;

    public /* synthetic */ MissingMainCoroutineDispatcher(Throwable th, String str, int i, f fVar) {
        this(th, (i & 2) != 0 ? null : str);
    }

    private final Void missing() {
        if (this.cause != null) {
            String str = this.errorHint;
            throw new IllegalStateException("Module with the Main dispatcher had failed to initialize".concat(str != null ? ". ".concat(str) : ""), this.cause);
        }
        MainDispatchersKt.throwMissingMainDispatcherException();
        throw new e(10);
    }

    @Override // kotlinx.coroutines.Delay
    @c
    public Object delay(long j, d<? super y> dVar) {
        return Delay.DefaultImpls.delay(this, j, dVar);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch, reason: merged with bridge method [inline-methods] */
    public Void mo86dispatch(i iVar, Runnable runnable) {
        missing();
        throw new e(10);
    }

    @Override // kotlinx.coroutines.Delay
    public DisposableHandle invokeOnTimeout(long j, Runnable runnable, i iVar) {
        missing();
        throw new e(10);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(i iVar) {
        missing();
        throw new e(10);
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher
    public CoroutineDispatcher limitedParallelism(int i, String str) {
        missing();
        throw new e(10);
    }

    public Void scheduleResumeAfterDelay(long j, CancellableContinuation<? super y> cancellableContinuation) {
        missing();
        throw new e(10);
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dispatchers.Main[missing");
        if (this.cause != null) {
            str = ", cause=" + this.cause;
        } else {
            str = "";
        }
        return androidx.privacysandbox.ads.adservices.java.internal.a.t(sb, str, ']');
    }

    public MissingMainCoroutineDispatcher(Throwable th, String str) {
        this.cause = th;
        this.errorHint = str;
    }

    @Override // kotlinx.coroutines.Delay
    /* JADX INFO: renamed from: scheduleResumeAfterDelay, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ void mo87scheduleResumeAfterDelay(long j, CancellableContinuation cancellableContinuation) {
        scheduleResumeAfterDelay(j, (CancellableContinuation<? super y>) cancellableContinuation);
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher
    public MainCoroutineDispatcher getImmediate() {
        return this;
    }
}
