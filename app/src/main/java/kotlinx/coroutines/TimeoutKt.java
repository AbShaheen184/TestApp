package kotlinx.coroutines;

import com.google.common.base.b;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.z;
import kotlin.time.g;
import kotlinx.coroutines.intrinsics.UndispatchedKt;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TimeoutKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", l = {Token.ASSIGN_BITXOR}, m = "withTimeoutOrNull")
    public static final class AnonymousClass1<T> extends c {
        long J$0;
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
            return TimeoutKt.withTimeoutOrNull(0L, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Instruction removed from duplicated block: B:9:0x0018, please report this as an issue */
    public static final TimeoutCancellationException TimeoutCancellationException(long j, Delay delay, Job job) {
        String strM19timeoutMessageLRDsOJo;
        DelayWithTimeoutDiagnostics delayWithTimeoutDiagnostics = delay instanceof DelayWithTimeoutDiagnostics ? (DelayWithTimeoutDiagnostics) delay : null;
        if (delayWithTimeoutDiagnostics != null) {
            g gVar = kotlin.time.a.y;
            strM19timeoutMessageLRDsOJo = delayWithTimeoutDiagnostics.m19timeoutMessageLRDsOJo(b.v(j, kotlin.time.c.MILLISECONDS));
            if (strM19timeoutMessageLRDsOJo == null) {
                strM19timeoutMessageLRDsOJo = "Timed out waiting for " + j + " ms";
            }
        } else {
            strM19timeoutMessageLRDsOJo = "Timed out waiting for " + j + " ms";
        }
        return new TimeoutCancellationException(strM19timeoutMessageLRDsOJo, job);
    }

    private static final <U, T extends U> Object setupTimeout(TimeoutCoroutine<U, ? super T> timeoutCoroutine, p pVar) {
        JobKt.disposeOnCompletion(timeoutCoroutine, DelayKt.getDelay(timeoutCoroutine.uCont.getContext()).invokeOnTimeout(timeoutCoroutine.time, timeoutCoroutine, timeoutCoroutine.getContext()));
        return UndispatchedKt.startUndispatchedOrReturnIgnoreTimeout(timeoutCoroutine, timeoutCoroutine, pVar);
    }

    public static final <T> Object withTimeout(long j, p pVar, d<? super T> dVar) {
        if (j <= 0) {
            throw new TimeoutCancellationException("Timed out immediately");
        }
        Object obj = setupTimeout(new TimeoutCoroutine(j, dVar), pVar);
        if (obj == kotlin.coroutines.intrinsics.a.e) {
            dVar.getClass();
        }
        return obj;
    }

    /* JADX INFO: renamed from: withTimeout-KLykuaI, reason: not valid java name */
    public static final <T> Object m26withTimeoutKLykuaI(long j, p pVar, d<? super T> dVar) {
        return withTimeout(DelayKt.m18toDelayMillisLRDsOJo(j), pVar, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object withTimeoutOrNull(long j, p pVar, d<? super T> dVar) {
        AnonymousClass1 anonymousClass1;
        z zVar;
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
            if (j <= 0) {
                return null;
            }
            z zVar2 = new z();
            try {
                anonymousClass1.L$0 = pVar;
                anonymousClass1.L$1 = zVar2;
                anonymousClass1.J$0 = j;
                anonymousClass1.label = 1;
                TimeoutCoroutine timeoutCoroutine = new TimeoutCoroutine(j, anonymousClass1);
                zVar2.e = timeoutCoroutine;
                Object obj2 = setupTimeout(timeoutCoroutine, pVar);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                return obj2 == aVar ? aVar : obj2;
            } catch (TimeoutCancellationException e) {
                e = e;
                zVar = zVar2;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zVar = (z) anonymousClass1.L$1;
            try {
                kotlin.a.e(obj);
                return obj;
            } catch (TimeoutCancellationException e2) {
                e = e2;
            }
        }
        if (e.coroutine == zVar.e) {
            return null;
        }
        throw e;
    }

    /* JADX INFO: renamed from: withTimeoutOrNull-KLykuaI, reason: not valid java name */
    public static final <T> Object m27withTimeoutOrNullKLykuaI(long j, p pVar, d<? super T> dVar) {
        return withTimeoutOrNull(DelayKt.m18toDelayMillisLRDsOJo(j), pVar, dVar);
    }
}
