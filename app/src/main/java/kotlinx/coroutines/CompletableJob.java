package kotlinx.coroutines;

import kotlin.c;
import kotlin.coroutines.g;
import kotlin.coroutines.h;
import kotlin.coroutines.i;
import kotlin.jvm.functions.p;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface CompletableJob extends Job {
    boolean complete();

    boolean completeExceptionally(Throwable th);

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.i
    /* synthetic */ Object fold(Object obj, p pVar);

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.i
    /* synthetic */ g get(h hVar);

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.g
    /* synthetic */ h getKey();

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.i
    /* synthetic */ i minusKey(h hVar);

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.i
    /* synthetic */ i plus(i iVar);

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class DefaultImpls {
        public static <R> R fold(CompletableJob completableJob, R r, p pVar) {
            return (R) Job.DefaultImpls.fold(completableJob, r, pVar);
        }

        public static <E extends g> E get(CompletableJob completableJob, h hVar) {
            return (E) Job.DefaultImpls.get(completableJob, hVar);
        }

        public static i minusKey(CompletableJob completableJob, h hVar) {
            return Job.DefaultImpls.minusKey(completableJob, hVar);
        }

        public static i plus(CompletableJob completableJob, i iVar) {
            return Job.DefaultImpls.plus(completableJob, iVar);
        }

        @c
        public static Job plus(CompletableJob completableJob, Job job) {
            return Job.DefaultImpls.plus((Job) completableJob, job);
        }
    }
}
