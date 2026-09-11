package kotlinx.coroutines.sync;

import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.SystemPropsKt__SystemProps_commonKt;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class SemaphoreKt {
    private static final int MAX_SPIN_CYCLES = SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, (Object) null);
    private static final Symbol PERMIT = new Symbol("PERMIT");
    private static final Symbol TAKEN = new Symbol("TAKEN");
    private static final Symbol BROKEN = new Symbol("BROKEN");
    private static final Symbol CANCELLED = new Symbol("CANCELLED");
    private static final int SEGMENT_SIZE = SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, (Object) null);

    /* JADX INFO: renamed from: kotlinx.coroutines.sync.SemaphoreKt$withPermit$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.sync.SemaphoreKt", f = "Semaphore.kt", l = {Token.EXP}, m = "withPermit")
    public static final class AnonymousClass1<T> extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SemaphoreKt.withPermit(null, null, this);
        }
    }

    public static final Semaphore Semaphore(int i, int i2) {
        return new SemaphoreImpl(i, i2);
    }

    public static /* synthetic */ Semaphore Semaphore$default(int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return Semaphore(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SemaphoreSegment createSegment(long j, SemaphoreSegment semaphoreSegment) {
        return new SemaphoreSegment(j, semaphoreSegment, 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object withPermit(Semaphore semaphore, kotlin.jvm.functions.a aVar, d<? super T> dVar) {
        AnonymousClass1 anonymousClass1;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(dVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(dVar);
        }
        Object obj = anonymousClass1.result;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            kotlin.a.e(obj);
            anonymousClass1.L$0 = semaphore;
            anonymousClass1.L$1 = aVar;
            anonymousClass1.label = 1;
            Object objAcquire = semaphore.acquire(anonymousClass1);
            kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
            if (objAcquire == aVar2) {
                return aVar2;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = (kotlin.jvm.functions.a) anonymousClass1.L$1;
            semaphore = (Semaphore) anonymousClass1.L$0;
            kotlin.a.e(obj);
        }
        try {
            return aVar.invoke();
        } finally {
            semaphore.release();
        }
    }

    private static final <T> Object withPermit$$forInline(Semaphore semaphore, kotlin.jvm.functions.a aVar, d<? super T> dVar) {
        semaphore.acquire(dVar);
        try {
            return aVar.invoke();
        } finally {
            semaphore.release();
        }
    }
}
