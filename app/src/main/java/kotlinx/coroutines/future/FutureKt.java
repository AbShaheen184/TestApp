package kotlinx.coroutines.future;

import androidx.compose.animation.core.g0;
import androidx.datastore.core.t0;
import com.google.android.material.shape.e;
import com.google.gson.b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.function.BiFunction;
import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.coroutines.j;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class FutureKt {
    public static final <T> CompletableFuture<T> asCompletableFuture(Deferred<? extends T> deferred) {
        CompletableFuture<T> completableFuture = new CompletableFuture<>();
        setupCancellation(deferred, completableFuture);
        deferred.invokeOnCompletion(new t0(22, completableFuture, deferred));
        return completableFuture;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y asCompletableFuture$lambda$1(CompletableFuture completableFuture, Deferred deferred, Throwable th) {
        try {
            completableFuture.complete(deferred.getCompleted());
        } catch (Throwable th2) {
            completableFuture.completeExceptionally(th2);
        }
        return y.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y asCompletableFuture$lambda$2(CompletableFuture completableFuture, Throwable th) {
        y yVar = y.a;
        if (th == null) {
            completableFuture.complete(yVar);
        } else {
            completableFuture.completeExceptionally(th);
        }
        return yVar;
    }

    public static final <T> Deferred<T> asDeferred(CompletionStage<T> completionStage) {
        Throwable cause;
        CompletableFuture<T> completableFuture = completionStage.toCompletableFuture();
        if (!completableFuture.isDone()) {
            CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            completionStage.handle(new a(new g0(completableDeferredCompletableDeferred$default, 28), 0));
            JobKt__JobKt.invokeOnCompletion$default(completableDeferredCompletableDeferred$default, false, new CancelFutureOnCompletion(completableFuture), 1, null);
            return completableDeferredCompletableDeferred$default;
        }
        try {
            return CompletableDeferredKt.CompletableDeferred(completableFuture.get());
        } catch (Throwable th) {
            th = th;
            ExecutionException executionException = th instanceof ExecutionException ? (ExecutionException) th : null;
            if (executionException != null && (cause = executionException.getCause()) != null) {
                th = cause;
            }
            CompletableDeferred completableDeferredCompletableDeferred$default2 = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            completableDeferredCompletableDeferred$default2.completeExceptionally(th);
            return completableDeferredCompletableDeferred$default2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object asDeferred$lambda$5(CompletableDeferred completableDeferred, Object obj, Throwable th) {
        boolean zCompleteExceptionally;
        Throwable cause;
        try {
            if (th == null) {
                zCompleteExceptionally = completableDeferred.complete(obj);
            } else {
                CompletionException completionException = th instanceof CompletionException ? (CompletionException) th : null;
                if (completionException != null && (cause = completionException.getCause()) != null) {
                    th = cause;
                }
                zCompleteExceptionally = completableDeferred.completeExceptionally(th);
            }
            return Boolean.valueOf(zCompleteExceptionally);
        } catch (Throwable th2) {
            CoroutineExceptionHandlerKt.handleCoroutineException(j.e, th2);
            return y.a;
        }
    }

    public static final <T> Object await(CompletionStage<T> completionStage, d<? super T> dVar) throws Throwable {
        final CompletableFuture<T> completableFuture = completionStage.toCompletableFuture();
        if (completableFuture.isDone()) {
            try {
                return completableFuture.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    throw e;
                }
                throw cause;
            }
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(e.g(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        final ContinuationHandler continuationHandler = new ContinuationHandler(cancellableContinuationImpl);
        completionStage.handle(continuationHandler);
        cancellableContinuationImpl.invokeOnCancellation(new l() { // from class: kotlinx.coroutines.future.FutureKt$await$2$1
            public final void invoke(Throwable th) {
                completableFuture.cancel(false);
                continuationHandler.cont = null;
            }

            @Override // kotlin.jvm.functions.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return y.a;
            }
        });
        return cancellableContinuationImpl.getResult();
    }

    public static final <T> CompletableFuture<T> future(CoroutineScope coroutineScope, i iVar, CoroutineStart coroutineStart, p pVar) {
        if (coroutineStart.isLazy()) {
            b.e(coroutineStart, " start is not supported");
            return null;
        }
        i iVarNewCoroutineContext = CoroutineContextKt.newCoroutineContext(coroutineScope, iVar);
        CompletableFuture<T> completableFuture = new CompletableFuture<>();
        CompletableFutureCoroutine completableFutureCoroutine = new CompletableFutureCoroutine(iVarNewCoroutineContext, completableFuture);
        completableFuture.handle((BiFunction) completableFutureCoroutine);
        completableFutureCoroutine.start(coroutineStart, completableFutureCoroutine, pVar);
        return completableFuture;
    }

    public static /* synthetic */ CompletableFuture future$default(CoroutineScope coroutineScope, i iVar, CoroutineStart coroutineStart, p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            iVar = j.e;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return future(coroutineScope, iVar, coroutineStart, pVar);
    }

    private static final void setupCancellation(final Job job, CompletableFuture<?> completableFuture) {
        completableFuture.handle((BiFunction<? super Object, Throwable, ? extends U>) new a(new p() { // from class: kotlinx.coroutines.future.FutureKt.setupCancellation.1
            public final void invoke(Object obj, Throwable th) {
                Job job2 = job;
                CancellationException CancellationException = null;
                if (th != null) {
                    CancellationException = th instanceof CancellationException ? (CancellationException) th : null;
                    if (CancellationException == null) {
                        CancellationException = ExceptionsKt.CancellationException("CompletableFuture was completed exceptionally", th);
                    }
                }
                job2.cancel(CancellationException);
            }

            @Override // kotlin.jvm.functions.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke(obj, (Throwable) obj2);
                return y.a;
            }
        }, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y setupCancellation$lambda$3(p pVar, Object obj, Throwable th) {
        return (y) pVar.invoke(obj, th);
    }

    public static final CompletableFuture<y> asCompletableFuture(Job job) {
        CompletableFuture<y> completableFuture = new CompletableFuture<>();
        setupCancellation(job, completableFuture);
        job.invokeOnCompletion(new androidx.compose.ui.text.font.e(completableFuture, 24));
        return completableFuture;
    }
}
