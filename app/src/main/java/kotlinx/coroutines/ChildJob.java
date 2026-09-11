package kotlinx.coroutines;

import kotlin.c;
import kotlin.coroutines.g;
import kotlin.coroutines.h;
import kotlin.coroutines.i;
import kotlin.jvm.functions.p;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@InternalCoroutinesApi
@c
public interface ChildJob extends Job {
    @Override // kotlinx.coroutines.Job, kotlin.coroutines.i
    /* synthetic */ Object fold(Object obj, p pVar);

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.i
    /* synthetic */ g get(h hVar);

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.g
    /* synthetic */ h getKey();

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.i
    /* synthetic */ i minusKey(h hVar);

    @InternalCoroutinesApi
    void parentCancelled(ParentJob parentJob);

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.i
    /* synthetic */ i plus(i iVar);

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class DefaultImpls {
        public static <R> R fold(ChildJob childJob, R r, p pVar) {
            return (R) Job.DefaultImpls.fold(childJob, r, pVar);
        }

        public static <E extends g> E get(ChildJob childJob, h hVar) {
            return (E) Job.DefaultImpls.get(childJob, hVar);
        }

        public static i minusKey(ChildJob childJob, h hVar) {
            return Job.DefaultImpls.minusKey(childJob, hVar);
        }

        public static i plus(ChildJob childJob, i iVar) {
            return Job.DefaultImpls.plus(childJob, iVar);
        }

        @c
        public static Job plus(ChildJob childJob, Job job) {
            return Job.DefaultImpls.plus((Job) childJob, job);
        }
    }
}
