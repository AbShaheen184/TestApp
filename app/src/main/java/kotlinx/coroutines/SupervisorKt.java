package kotlinx.coroutines;

import kotlin.coroutines.d;
import kotlin.jvm.functions.p;
import kotlinx.coroutines.intrinsics.UndispatchedKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class SupervisorKt {
    public static final CompletableJob SupervisorJob(Job job) {
        return new SupervisorJobImpl(job);
    }

    public static /* synthetic */ CompletableJob SupervisorJob$default(Job job, int i, Object obj) {
        if ((i & 1) != 0) {
            job = null;
        }
        return SupervisorJob(job);
    }

    public static final <R> Object supervisorScope(p pVar, d<? super R> dVar) {
        SupervisorCoroutine supervisorCoroutine = new SupervisorCoroutine(dVar.getContext(), dVar);
        return UndispatchedKt.startUndispatchedOrReturn(supervisorCoroutine, supervisorCoroutine, pVar);
    }

    /* JADX INFO: renamed from: SupervisorJob$default, reason: collision with other method in class */
    public static /* synthetic */ Job m25SupervisorJob$default(Job job, int i, Object obj) {
        if ((i & 1) != 0) {
            job = null;
        }
        return SupervisorJob(job);
    }
}
