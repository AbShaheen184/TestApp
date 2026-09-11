package kotlinx.coroutines;

import com.google.gson.b;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.c;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.i;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.j;
import kotlin.sequences.h;
import kotlin.y;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class JobKt__JobKt {
    public static final CompletableJob Job(Job job) {
        return new JobImpl(job);
    }

    public static /* synthetic */ CompletableJob Job$default(Job job, int i, Object obj) {
        if ((i & 1) != 0) {
            job = null;
        }
        return JobKt.Job(job);
    }

    @c
    public static final /* synthetic */ boolean cancel(i iVar, Throwable th) {
        g gVar = iVar.get(Job.Key);
        JobSupport jobSupport = gVar instanceof JobSupport ? (JobSupport) gVar : null;
        if (jobSupport == null) {
            return false;
        }
        jobSupport.cancelInternal(orCancellation$JobKt__JobKt(th, jobSupport));
        return true;
    }

    public static /* synthetic */ boolean cancel$default(i iVar, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        return cancel(iVar, th);
    }

    public static final Object cancelAndJoin(Job job, d<? super y> dVar) {
        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        Object objJoin = job.join(dVar);
        return objJoin == kotlin.coroutines.intrinsics.a.e ? objJoin : y.a;
    }

    @c
    public static final /* synthetic */ void cancelChildren(i iVar, Throwable th) {
        Job job = (Job) iVar.get(Job.Key);
        if (job == null) {
            return;
        }
        for (Job job2 : job.getChildren()) {
            JobSupport jobSupport = job2 instanceof JobSupport ? (JobSupport) job2 : null;
            if (jobSupport != null) {
                jobSupport.cancelInternal(orCancellation$JobKt__JobKt(th, job));
            }
        }
    }

    public static /* synthetic */ void cancelChildren$default(Job job, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        JobKt.cancelChildren(job, cancellationException);
    }

    public static final DisposableHandle disposeOnCompletion(Job job, DisposableHandle disposableHandle) {
        return invokeOnCompletion$default(job, false, new DisposeOnCompletion(disposableHandle), 1, null);
    }

    public static final void ensureActive(i iVar) {
        Job job = (Job) iVar.get(Job.Key);
        if (job != null) {
            JobKt.ensureActive(job);
        }
    }

    public static final Job getJob(i iVar) {
        Job job = (Job) iVar.get(Job.Key);
        if (job != null) {
            return job;
        }
        b.u(iVar, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static final DisposableHandle invokeOnCompletion(Job job, boolean z, JobNode jobNode) {
        return job instanceof JobSupport ? ((JobSupport) job).invokeOnCompletionInternal$kotlinx_coroutines_core(z, jobNode) : job.invokeOnCompletion(jobNode.getOnCancelling(), z, new AnonymousClass1(jobNode));
    }

    public static /* synthetic */ DisposableHandle invokeOnCompletion$default(Job job, boolean z, JobNode jobNode, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return JobKt.invokeOnCompletion(job, z, jobNode);
    }

    public static final boolean isActive(i iVar) {
        Job job = (Job) iVar.get(Job.Key);
        if (job != null) {
            return job.isActive();
        }
        return true;
    }

    private static final Throwable orCancellation$JobKt__JobKt(Throwable th, Job job) {
        return th == null ? new JobCancellationException("Job was cancelled", null, job) : th;
    }

    @c
    /* JADX INFO: renamed from: Job, reason: collision with other method in class */
    public static final /* synthetic */ Job m22Job(Job job) {
        return JobKt.Job(job);
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.JobKt__JobKt$invokeOnCompletion$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public /* synthetic */ class AnonymousClass1 extends j implements l {
        public AnonymousClass1(Object obj) {
            super(1, 0, JobNode.class, obj, "invoke", "invoke(Ljava/lang/Throwable;)V");
        }

        @Override // kotlin.jvm.functions.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return y.a;
        }

        public final void invoke(Throwable th) {
            ((JobNode) this.receiver).invoke(th);
        }
    }

    public static /* synthetic */ void cancelChildren$default(Job job, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        cancelChildren(job, th);
    }

    /* JADX INFO: renamed from: Job$default, reason: collision with other method in class */
    public static /* synthetic */ Job m23Job$default(Job job, int i, Object obj) {
        if ((i & 1) != 0) {
            job = null;
        }
        return m22Job(job);
    }

    public static /* synthetic */ void cancel$default(Job job, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        JobKt.cancel(job, str, th);
    }

    public static /* synthetic */ void cancelChildren$default(i iVar, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        JobKt.cancelChildren(iVar, cancellationException);
    }

    public static /* synthetic */ void cancel$default(i iVar, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        JobKt.cancel(iVar, cancellationException);
    }

    public static /* synthetic */ void cancelChildren$default(i iVar, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        cancelChildren(iVar, th);
    }

    public static final void ensureActive(Job job) {
        if (!job.isActive()) {
            throw job.getCancellationException();
        }
    }

    public static final void cancel(Job job, String str, Throwable th) {
        job.cancel(ExceptionsKt.CancellationException(str, th));
    }

    public static final void cancel(i iVar, CancellationException cancellationException) {
        Job job = (Job) iVar.get(Job.Key);
        if (job != null) {
            job.cancel(cancellationException);
        }
    }

    @c
    public static final /* synthetic */ void cancelChildren(Job job, Throwable th) {
        for (Job job2 : job.getChildren()) {
            JobSupport jobSupport = job2 instanceof JobSupport ? (JobSupport) job2 : null;
            if (jobSupport != null) {
                jobSupport.cancelInternal(orCancellation$JobKt__JobKt(th, job));
            }
        }
    }

    public static final void cancelChildren(i iVar, CancellationException cancellationException) {
        h children;
        Job job = (Job) iVar.get(Job.Key);
        if (job == null || (children = job.getChildren()) == null) {
            return;
        }
        Iterator it = children.iterator();
        while (it.hasNext()) {
            ((Job) it.next()).cancel(cancellationException);
        }
    }

    public static final void cancelChildren(Job job, CancellationException cancellationException) {
        Iterator it = job.getChildren().iterator();
        while (it.hasNext()) {
            ((Job) it.next()).cancel(cancellationException);
        }
    }
}
