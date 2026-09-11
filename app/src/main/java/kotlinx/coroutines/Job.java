package kotlinx.coroutines;

import com.google.gson.b;
import java.util.concurrent.CancellationException;
import kotlin.c;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.h;
import kotlin.coroutines.i;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.selects.SelectClause0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface Job extends g {
    public static final Key Key = Key.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class Key implements h {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }

    @InternalCoroutinesApi
    ChildHandle attachChild(ChildJob childJob);

    @c
    /* synthetic */ void cancel();

    void cancel(CancellationException cancellationException);

    @c
    /* synthetic */ boolean cancel(Throwable th);

    @Override // kotlin.coroutines.i
    /* synthetic */ Object fold(Object obj, p pVar);

    @Override // kotlin.coroutines.i
    /* synthetic */ g get(h hVar);

    @InternalCoroutinesApi
    CancellationException getCancellationException();

    kotlin.sequences.h getChildren();

    @Override // kotlin.coroutines.g
    /* synthetic */ h getKey();

    SelectClause0 getOnJoin();

    Job getParent();

    DisposableHandle invokeOnCompletion(l lVar);

    @InternalCoroutinesApi
    DisposableHandle invokeOnCompletion(boolean z, boolean z2, l lVar);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    Object join(d<? super y> dVar);

    @Override // kotlin.coroutines.i
    /* synthetic */ i minusKey(h hVar);

    @Override // kotlin.coroutines.i
    /* synthetic */ i plus(i iVar);

    @c
    Job plus(Job job);

    boolean start();

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class DefaultImpls {
        public static /* synthetic */ boolean cancel$default(Job job, Throwable th, int i, Object obj) {
            if (obj != null) {
                b.r("Super calls with default arguments not supported in this target, function: cancel");
                return false;
            }
            if ((i & 1) != 0) {
                th = null;
            }
            return job.cancel(th);
        }

        public static <R> R fold(Job job, R r, p pVar) {
            return (R) com.google.android.material.resources.g.d(job, r, pVar);
        }

        public static <E extends g> E get(Job job, h hVar) {
            return (E) com.google.android.material.resources.g.f(job, hVar);
        }

        public static /* synthetic */ DisposableHandle invokeOnCompletion$default(Job job, boolean z, boolean z2, l lVar, int i, Object obj) {
            if (obj != null) {
                b.r("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
                return null;
            }
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = true;
            }
            return job.invokeOnCompletion(z, z2, lVar);
        }

        public static i minusKey(Job job, h hVar) {
            return com.google.android.material.resources.g.h(job, hVar);
        }

        public static i plus(Job job, i iVar) {
            return com.google.android.material.resources.g.k(iVar, job);
        }

        @c
        public static Job plus(Job job, Job job2) {
            return job2;
        }

        public static /* synthetic */ void cancel$default(Job job, CancellationException cancellationException, int i, Object obj) {
            if (obj != null) {
                b.r("Super calls with default arguments not supported in this target, function: cancel");
                return;
            }
            if ((i & 1) != 0) {
                cancellationException = null;
            }
            job.cancel(cancellationException);
        }

        @ExperimentalCoroutinesApi
        public static /* synthetic */ void getParent$annotations() {
        }
    }
}
