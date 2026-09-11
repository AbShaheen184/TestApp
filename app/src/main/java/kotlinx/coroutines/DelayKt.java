package kotlinx.coroutines;

import com.google.gson.b;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.i;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class DelayKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.DelayKt$awaitCancellation$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.DelayKt", f = "Delay.kt", l = {160}, m = "awaitCancellation")
    public static final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DelayKt.awaitCancellation(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object awaitCancellation(d<?> dVar) {
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
            anonymousClass1.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(com.google.android.material.shape.e.g(anonymousClass1), 1);
            cancellableContinuationImpl.initCancellability();
            Object result = cancellableContinuationImpl.getResult();
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (result == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
        }
        b.b();
        return null;
    }

    public static final Object delay(long j, d<? super y> dVar) {
        y yVar = y.a;
        if (j <= 0) {
            return yVar;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(com.google.android.material.shape.e.g(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        if (j < Long.MAX_VALUE) {
            getDelay(cancellableContinuationImpl.getContext()).mo87scheduleResumeAfterDelay(j, cancellableContinuationImpl);
        }
        Object result = cancellableContinuationImpl.getResult();
        return result == kotlin.coroutines.intrinsics.a.e ? result : yVar;
    }

    /* JADX INFO: renamed from: delay-VtjQ1oo, reason: not valid java name */
    public static final Object m17delayVtjQ1oo(long j, d<? super y> dVar) {
        Object objDelay = delay(m18toDelayMillisLRDsOJo(j), dVar);
        return objDelay == kotlin.coroutines.intrinsics.a.e ? objDelay : y.a;
    }

    public static final Delay getDelay(i iVar) {
        g gVar = iVar.get(kotlin.coroutines.e.e);
        Delay delay = gVar instanceof Delay ? (Delay) gVar : null;
        return delay == null ? DefaultExecutorKt.getDefaultDelay() : delay;
    }

    /* JADX INFO: renamed from: toDelayMillis-LRDsOJo, reason: not valid java name */
    public static final long m18toDelayMillisLRDsOJo(long j) {
        kotlin.time.g gVar = kotlin.time.a.y;
        boolean z = j > 0;
        if (z) {
            return kotlin.time.a.f(kotlin.time.a.i(j, com.google.common.base.b.v(999999L, kotlin.time.c.NANOSECONDS)));
        }
        if (!z) {
            return 0L;
        }
        coil3.g.a();
        return 0L;
    }
}
