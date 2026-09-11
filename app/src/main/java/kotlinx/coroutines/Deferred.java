package kotlinx.coroutines;

import kotlin.c;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.h;
import kotlin.coroutines.i;
import kotlin.jvm.functions.p;
import kotlinx.coroutines.selects.SelectClause1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface Deferred<T> extends Job {
    Object await(d<? super T> dVar);

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.i
    /* synthetic */ Object fold(Object obj, p pVar);

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.i
    /* synthetic */ g get(h hVar);

    @ExperimentalCoroutinesApi
    T getCompleted();

    @ExperimentalCoroutinesApi
    Throwable getCompletionExceptionOrNull();

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.g
    /* synthetic */ h getKey();

    SelectClause1<T> getOnAwait();

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.i
    /* synthetic */ i minusKey(h hVar);

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.i
    /* synthetic */ i plus(i iVar);

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class DefaultImpls {
        public static <T, R> R fold(Deferred<? extends T> deferred, R r, p pVar) {
            return (R) Job.DefaultImpls.fold(deferred, r, pVar);
        }

        public static <T, E extends g> E get(Deferred<? extends T> deferred, h hVar) {
            return (E) Job.DefaultImpls.get(deferred, hVar);
        }

        public static <T> i minusKey(Deferred<? extends T> deferred, h hVar) {
            return Job.DefaultImpls.minusKey(deferred, hVar);
        }

        public static <T> i plus(Deferred<? extends T> deferred, i iVar) {
            return Job.DefaultImpls.plus(deferred, iVar);
        }

        @c
        public static <T> Job plus(Deferred<? extends T> deferred, Job job) {
            return Job.DefaultImpls.plus((Job) deferred, job);
        }
    }
}
