package kotlinx.coroutines.future;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import kotlin.coroutines.i;
import kotlin.y;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class CompletableFutureCoroutine<T> extends AbstractCoroutine<T> implements BiFunction<T, Throwable, y> {
    private final CompletableFuture<T> future;

    public CompletableFutureCoroutine(i iVar, CompletableFuture<T> completableFuture) {
        super(iVar, true, true);
        this.future = completableFuture;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.BiFunction
    public /* bridge */ /* synthetic */ y apply(Object obj, Throwable th) {
        apply2(obj, th);
        return y.a;
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public void onCancelled(Throwable th, boolean z) {
        this.future.completeExceptionally(th);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public void onCompleted(T t) {
        this.future.complete(t);
    }

    /* JADX INFO: renamed from: apply, reason: avoid collision after fix types in other method */
    public void apply2(T t, Throwable th) {
        Job.DefaultImpls.cancel$default((Job) this, (CancellationException) null, 1, (Object) null);
    }
}
