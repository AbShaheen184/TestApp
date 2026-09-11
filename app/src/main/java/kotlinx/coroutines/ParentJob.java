package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.c;
import kotlin.coroutines.g;
import kotlin.coroutines.h;
import kotlin.coroutines.i;
import kotlin.jvm.functions.p;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@InternalCoroutinesApi
@c
public interface ParentJob extends Job {
    @Override // kotlinx.coroutines.Job, kotlin.coroutines.i
    /* synthetic */ Object fold(Object obj, p pVar);

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.i
    /* synthetic */ g get(h hVar);

    @InternalCoroutinesApi
    CancellationException getChildJobCancellationCause();

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.g
    /* synthetic */ h getKey();

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.i
    /* synthetic */ i minusKey(h hVar);

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.i
    /* synthetic */ i plus(i iVar);

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class DefaultImpls {
        public static <R> R fold(ParentJob parentJob, R r, p pVar) {
            return (R) Job.DefaultImpls.fold(parentJob, r, pVar);
        }

        public static <E extends g> E get(ParentJob parentJob, h hVar) {
            return (E) Job.DefaultImpls.get(parentJob, hVar);
        }

        public static i minusKey(ParentJob parentJob, h hVar) {
            return Job.DefaultImpls.minusKey(parentJob, hVar);
        }

        public static i plus(ParentJob parentJob, i iVar) {
            return Job.DefaultImpls.plus(parentJob, iVar);
        }

        @c
        public static Job plus(ParentJob parentJob, Job job) {
            return Job.DefaultImpls.plus((Job) parentJob, job);
        }
    }
}
