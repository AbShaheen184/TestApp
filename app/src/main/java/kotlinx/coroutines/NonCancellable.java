package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.c;
import kotlin.coroutines.d;
import kotlin.jvm.functions.l;
import kotlin.sequences.e;
import kotlin.sequences.h;
import kotlin.y;
import kotlinx.coroutines.selects.SelectClause0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class NonCancellable extends kotlin.coroutines.a implements Job {
    public static final NonCancellable INSTANCE = new NonCancellable();
    private static final String message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited";

    private NonCancellable() {
        super(Job.Key);
    }

    @Override // kotlinx.coroutines.Job
    @c
    public ChildHandle attachChild(ChildJob childJob) {
        return NonDisposableHandle.INSTANCE;
    }

    @Override // kotlinx.coroutines.Job
    @c
    public /* synthetic */ void cancel() {
        cancel((CancellationException) null);
    }

    @Override // kotlinx.coroutines.Job
    @c
    public CancellationException getCancellationException() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // kotlinx.coroutines.Job
    public h getChildren() {
        return e.a;
    }

    @Override // kotlinx.coroutines.Job
    public SelectClause0 getOnJoin() {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.Job
    public Job getParent() {
        return null;
    }

    @Override // kotlinx.coroutines.Job
    @c
    public DisposableHandle invokeOnCompletion(l lVar) {
        return NonDisposableHandle.INSTANCE;
    }

    @Override // kotlinx.coroutines.Job
    public boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.Job
    public boolean isCancelled() {
        return false;
    }

    @Override // kotlinx.coroutines.Job
    public boolean isCompleted() {
        return false;
    }

    @Override // kotlinx.coroutines.Job
    @c
    public Object join(d<? super y> dVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.Job
    @c
    public Job plus(Job job) {
        return Job.DefaultImpls.plus((Job) this, job);
    }

    @Override // kotlinx.coroutines.Job
    @c
    public boolean start() {
        return false;
    }

    public String toString() {
        return "NonCancellable";
    }

    @Override // kotlinx.coroutines.Job
    @c
    public DisposableHandle invokeOnCompletion(boolean z, boolean z2, l lVar) {
        return NonDisposableHandle.INSTANCE;
    }

    @Override // kotlinx.coroutines.Job
    @c
    public /* synthetic */ boolean cancel(Throwable th) {
        return false;
    }

    @Override // kotlinx.coroutines.Job
    @c
    public void cancel(CancellationException cancellationException) {
    }

    @c
    public static /* synthetic */ void getChildren$annotations() {
    }

    @c
    public static /* synthetic */ void getOnJoin$annotations() {
    }

    @c
    public static /* synthetic */ void getParent$annotations() {
    }

    @c
    public static /* synthetic */ void isActive$annotations() {
    }

    @c
    public static /* synthetic */ void isCancelled$annotations() {
    }

    @c
    public static /* synthetic */ void isCompleted$annotations() {
    }
}
