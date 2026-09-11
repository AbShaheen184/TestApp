package kotlinx.coroutines.tasks;

import androidx.compose.ui.text.font.e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.l;
import com.google.android.gms.tasks.a;
import com.google.android.gms.tasks.i;
import com.google.android.gms.tasks.j;
import com.google.android.gms.tasks.q;
import java.util.concurrent.CancellationException;
import kotlin.c;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.h;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.ChildHandle;
import kotlinx.coroutines.ChildJob;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.selects.SelectClause0;
import kotlinx.coroutines.selects.SelectClause1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TasksKt {
    public static final <T> Deferred<T> asDeferred(i iVar) {
        return asDeferredImpl(iVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> Deferred<T> asDeferredImpl(i iVar, a aVar) {
        final CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        if (iVar.g()) {
            Exception excE = iVar.e();
            if (excE != null) {
                completableDeferredCompletableDeferred$default.completeExceptionally(excE);
            } else if (((q) iVar).d) {
                Job.DefaultImpls.cancel$default((Job) completableDeferredCompletableDeferred$default, (CancellationException) null, 1, (Object) null);
            } else {
                completableDeferredCompletableDeferred$default.complete(iVar.f());
            }
        } else {
            iVar.a(DirectExecutor.INSTANCE, new l(completableDeferredCompletableDeferred$default, 13));
        }
        if (aVar != null) {
            completableDeferredCompletableDeferred$default.invokeOnCompletion(new e(aVar, 25));
        }
        return new Deferred<T>() { // from class: kotlinx.coroutines.tasks.TasksKt.asDeferredImpl.3
            @Override // kotlinx.coroutines.Job
            @InternalCoroutinesApi
            public ChildHandle attachChild(ChildJob childJob) {
                return completableDeferredCompletableDeferred$default.attachChild(childJob);
            }

            @Override // kotlinx.coroutines.Deferred
            public Object await(d<? super T> dVar) {
                return completableDeferredCompletableDeferred$default.await(dVar);
            }

            @Override // kotlinx.coroutines.Job
            @c
            public /* synthetic */ boolean cancel(Throwable th) {
                return completableDeferredCompletableDeferred$default.cancel(th);
            }

            @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, kotlin.coroutines.i
            public <R> R fold(R r, p pVar) {
                return (R) completableDeferredCompletableDeferred$default.fold(r, pVar);
            }

            @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, kotlin.coroutines.i
            public <E extends g> E get(h hVar) {
                return (E) completableDeferredCompletableDeferred$default.get(hVar);
            }

            @Override // kotlinx.coroutines.Job
            @InternalCoroutinesApi
            public CancellationException getCancellationException() {
                return completableDeferredCompletableDeferred$default.getCancellationException();
            }

            @Override // kotlinx.coroutines.Job
            public kotlin.sequences.h getChildren() {
                return completableDeferredCompletableDeferred$default.getChildren();
            }

            @Override // kotlinx.coroutines.Deferred
            @ExperimentalCoroutinesApi
            public T getCompleted() {
                return completableDeferredCompletableDeferred$default.getCompleted();
            }

            @Override // kotlinx.coroutines.Deferred
            @ExperimentalCoroutinesApi
            public Throwable getCompletionExceptionOrNull() {
                return completableDeferredCompletableDeferred$default.getCompletionExceptionOrNull();
            }

            @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, kotlin.coroutines.g
            public h getKey() {
                return completableDeferredCompletableDeferred$default.getKey();
            }

            @Override // kotlinx.coroutines.Deferred
            public SelectClause1<T> getOnAwait() {
                return completableDeferredCompletableDeferred$default.getOnAwait();
            }

            @Override // kotlinx.coroutines.Job
            public SelectClause0 getOnJoin() {
                return completableDeferredCompletableDeferred$default.getOnJoin();
            }

            @Override // kotlinx.coroutines.Job
            public Job getParent() {
                return completableDeferredCompletableDeferred$default.getParent();
            }

            @Override // kotlinx.coroutines.Job
            public DisposableHandle invokeOnCompletion(kotlin.jvm.functions.l lVar) {
                return completableDeferredCompletableDeferred$default.invokeOnCompletion(lVar);
            }

            @Override // kotlinx.coroutines.Job
            public boolean isActive() {
                return completableDeferredCompletableDeferred$default.isActive();
            }

            @Override // kotlinx.coroutines.Job
            public boolean isCancelled() {
                return completableDeferredCompletableDeferred$default.isCancelled();
            }

            @Override // kotlinx.coroutines.Job
            public boolean isCompleted() {
                return completableDeferredCompletableDeferred$default.isCompleted();
            }

            @Override // kotlinx.coroutines.Job
            public Object join(d<? super y> dVar) {
                return completableDeferredCompletableDeferred$default.join(dVar);
            }

            @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, kotlin.coroutines.i
            public kotlin.coroutines.i minusKey(h hVar) {
                return completableDeferredCompletableDeferred$default.minusKey(hVar);
            }

            @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, kotlin.coroutines.i
            public kotlin.coroutines.i plus(kotlin.coroutines.i iVar2) {
                return completableDeferredCompletableDeferred$default.plus(iVar2);
            }

            @Override // kotlinx.coroutines.Job
            public boolean start() {
                return completableDeferredCompletableDeferred$default.start();
            }

            @Override // kotlinx.coroutines.Job
            public void cancel(CancellationException cancellationException) {
                completableDeferredCompletableDeferred$default.cancel(cancellationException);
            }

            @Override // kotlinx.coroutines.Job
            @InternalCoroutinesApi
            public DisposableHandle invokeOnCompletion(boolean z, boolean z2, kotlin.jvm.functions.l lVar) {
                return completableDeferredCompletableDeferred$default.invokeOnCompletion(z, z2, lVar);
            }

            @Override // kotlinx.coroutines.Job
            @c
            public Job plus(Job job) {
                return completableDeferredCompletableDeferred$default.plus(job);
            }

            @Override // kotlinx.coroutines.Job
            @c
            public /* synthetic */ void cancel() {
                completableDeferredCompletableDeferred$default.cancel();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asDeferredImpl$lambda$1(CompletableDeferred completableDeferred, i iVar) {
        Exception excE = iVar.e();
        if (excE != null) {
            completableDeferred.completeExceptionally(excE);
        } else if (((q) iVar).d) {
            Job.DefaultImpls.cancel$default((Job) completableDeferred, (CancellationException) null, 1, (Object) null);
        } else {
            completableDeferred.complete(iVar.f());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y asDeferredImpl$lambda$2(a aVar, Throwable th) {
        ((q) aVar.a.y).l(null);
        return y.a;
    }

    public static final <T> i asTask(Deferred<? extends T> deferred) {
        a aVar = new a();
        j jVar = new j(aVar.a);
        deferred.invokeOnCompletion(new androidx.compose.animation.core.a(20, aVar, deferred, jVar));
        return jVar.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y asTask$lambda$0(a aVar, Deferred deferred, j jVar, Throwable th) {
        boolean z = th instanceof CancellationException;
        y yVar = y.a;
        if (z) {
            ((q) aVar.a.y).l(null);
            return yVar;
        }
        Throwable completionExceptionOrNull = deferred.getCompletionExceptionOrNull();
        if (completionExceptionOrNull == null) {
            jVar.b(deferred.getCompleted());
            return yVar;
        }
        Exception gVar = completionExceptionOrNull instanceof Exception ? (Exception) completionExceptionOrNull : null;
        if (gVar == null) {
            gVar = new com.google.android.gms.tasks.g(completionExceptionOrNull);
        }
        jVar.a(gVar);
        return yVar;
    }

    public static final <T> Object await(i iVar, d<? super T> dVar) {
        return awaitImpl(iVar, null, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Object awaitImpl(i iVar, final a aVar, d<? super T> dVar) throws Exception {
        if (!iVar.g()) {
            final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(com.google.android.material.shape.e.g(dVar), 1);
            cancellableContinuationImpl.initCancellability();
            iVar.a(DirectExecutor.INSTANCE, new com.google.android.gms.tasks.d() { // from class: kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$1
                @Override // com.google.android.gms.tasks.d
                public final void onComplete(i iVar2) {
                    Exception excE = iVar2.e();
                    if (excE != null) {
                        cancellableContinuationImpl.resumeWith(new kotlin.l(excE));
                        return;
                    }
                    boolean z = ((q) iVar2).d;
                    CancellableContinuation<T> cancellableContinuation = cancellableContinuationImpl;
                    if (z) {
                        CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuation, null, 1, null);
                    } else {
                        cancellableContinuation.resumeWith(iVar2.f());
                    }
                }
            });
            if (aVar != null) {
                cancellableContinuationImpl.invokeOnCancellation(new kotlin.jvm.functions.l() { // from class: kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$2
                    public final void invoke(Throwable th) {
                        ((q) aVar.a.y).l(null);
                    }

                    @Override // kotlin.jvm.functions.l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Throwable) obj);
                        return y.a;
                    }
                });
            }
            return cancellableContinuationImpl.getResult();
        }
        Exception excE = iVar.e();
        if (excE != null) {
            throw excE;
        }
        if (!((q) iVar).d) {
            return iVar.f();
        }
        throw new CancellationException("Task " + iVar + " was cancelled normally.");
    }

    @ExperimentalCoroutinesApi
    public static final <T> Deferred<T> asDeferred(i iVar, a aVar) {
        return asDeferredImpl(iVar, aVar);
    }

    @ExperimentalCoroutinesApi
    public static final <T> Object await(i iVar, a aVar, d<? super T> dVar) {
        return awaitImpl(iVar, aVar, dVar);
    }
}
