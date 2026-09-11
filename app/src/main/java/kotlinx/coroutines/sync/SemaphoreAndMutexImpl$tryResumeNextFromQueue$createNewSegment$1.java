package kotlinx.coroutines.sync;

import kotlin.jvm.functions.p;
import kotlin.jvm.internal.j;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 extends j implements p {
    public static final SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 INSTANCE = new SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1();

    public SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1() {
        super(2, SemaphoreKt.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
    }

    @Override // kotlin.jvm.functions.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).longValue(), (SemaphoreSegment) obj2);
    }

    public final SemaphoreSegment invoke(long j, SemaphoreSegment semaphoreSegment) {
        return SemaphoreKt.createSegment(j, semaphoreSegment);
    }
}
