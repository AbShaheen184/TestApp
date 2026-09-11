package kotlinx.coroutines.flow;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.q;
import kotlin.jvm.functions.r;
import kotlin.jvm.internal.z;
import kotlin.y;
import kotlinx.coroutines.Job;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class FlowKt__ErrorsKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", l = {Token.USE_STACK}, m = "catchImpl")
    public static final class AnonymousClass1<T> extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.catchImpl(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class AnonymousClass2<T> implements FlowCollector {
        final /* synthetic */ FlowCollector<T> $collector;
        final /* synthetic */ z $fromDownstream;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(FlowCollector<? super T> flowCollector, z zVar) {
            this.$collector = flowCollector;
            this.$fromDownstream = zVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(T t, kotlin.coroutines.d<? super y> dVar) throws Throwable {
            FlowKt__ErrorsKt$catchImpl$2$emit$1 flowKt__ErrorsKt$catchImpl$2$emit$1;
            AnonymousClass2<T> anonymousClass2;
            if (dVar instanceof FlowKt__ErrorsKt$catchImpl$2$emit$1) {
                flowKt__ErrorsKt$catchImpl$2$emit$1 = (FlowKt__ErrorsKt$catchImpl$2$emit$1) dVar;
                int i = flowKt__ErrorsKt$catchImpl$2$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    flowKt__ErrorsKt$catchImpl$2$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    flowKt__ErrorsKt$catchImpl$2$emit$1 = new FlowKt__ErrorsKt$catchImpl$2$emit$1(this, dVar);
                }
            } else {
                flowKt__ErrorsKt$catchImpl$2$emit$1 = new FlowKt__ErrorsKt$catchImpl$2$emit$1(this, dVar);
            }
            Object obj = flowKt__ErrorsKt$catchImpl$2$emit$1.result;
            int i2 = flowKt__ErrorsKt$catchImpl$2$emit$1.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                anonymousClass2 = (AnonymousClass2) flowKt__ErrorsKt$catchImpl$2$emit$1.L$0;
                try {
                    kotlin.a.e(obj);
                    return y.a;
                } catch (Throwable th) {
                    th = th;
                    anonymousClass2.$fromDownstream.e = th;
                    throw th;
                }
            }
            kotlin.a.e(obj);
            try {
                FlowCollector<T> flowCollector = this.$collector;
                flowKt__ErrorsKt$catchImpl$2$emit$1.L$0 = this;
                flowKt__ErrorsKt$catchImpl$2$emit$1.label = 1;
                Object objEmit = flowCollector.emit(t, flowKt__ErrorsKt$catchImpl$2$emit$1);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objEmit == aVar) {
                    return aVar;
                }
                return y.a;
            } catch (Throwable th2) {
                th = th2;
                anonymousClass2 = this;
                anonymousClass2.$fromDownstream.e = th;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1", f = "Errors.kt", l = {}, m = "invokeSuspend")
    public static final class C00481 extends i implements p {
        int label;

        public C00481(kotlin.coroutines.d<? super C00481> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C00481(dVar);
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(Throwable th, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((C00481) create(th, dVar)).invokeSuspend(y.a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                kotlin.a.e(obj);
                return Boolean.TRUE;
            }
            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public static final <T> Flow<T> m71catch(Flow<? extends T> flow, q qVar) {
        return new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(flow, qVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object catchImpl(Flow<? extends T> flow, FlowCollector<? super T> flowCollector, kotlin.coroutines.d<? super Throwable> dVar) throws Throwable {
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
            z zVar2 = new z();
            try {
                FlowCollector<? super Object> anonymousClass2 = new AnonymousClass2<>(flowCollector, zVar2);
                anonymousClass1.L$0 = zVar2;
                anonymousClass1.label = 1;
                Object objCollect = flow.collect(anonymousClass2, anonymousClass1);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objCollect == aVar) {
                    return aVar;
                }
                return null;
            } catch (Throwable th) {
                th = th;
                zVar = zVar2;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zVar = (z) anonymousClass1.L$0;
            try {
                kotlin.a.e(obj);
                return null;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        Throwable th3 = (Throwable) zVar.e;
        if (isSameExceptionAs$FlowKt__ErrorsKt(th, th3) || isCancellationCause$FlowKt__ErrorsKt(th, anonymousClass1.getContext())) {
            throw th;
        }
        if (th3 == null) {
            return th;
        }
        if (th instanceof CancellationException) {
            kotlin.a.a(th3, th);
            throw th3;
        }
        kotlin.a.a(th, th3);
        throw th;
    }

    private static final boolean isCancellationCause$FlowKt__ErrorsKt(Throwable th, kotlin.coroutines.i iVar) {
        Job job = (Job) iVar.get(Job.Key);
        if (job == null || !job.isCancelled()) {
            return false;
        }
        return isSameExceptionAs$FlowKt__ErrorsKt(th, job.getCancellationException());
    }

    private static final boolean isSameExceptionAs$FlowKt__ErrorsKt(Throwable th, Throwable th2) {
        return th2 != null && th2.equals(th);
    }

    public static final <T> Flow<T> retry(Flow<? extends T> flow, long j, p pVar) {
        if (j > 0) {
            return FlowKt.retryWhen(flow, new AnonymousClass3(j, pVar, null));
        }
        net.luminis.tls.engine.impl.c.p(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.g("Expected positive amount of retries, but had ", j));
        return null;
    }

    public static /* synthetic */ Flow retry$default(Flow flow, long j, p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            j = Long.MAX_VALUE;
        }
        if ((i & 2) != 0) {
            pVar = new C00481(null);
        }
        return FlowKt.retry(flow, j, pVar);
    }

    public static final <T> Flow<T> retryWhen(Flow<? extends T> flow, r rVar) {
        return new FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1(flow, rVar);
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3", f = "Errors.kt", l = {Token.SEMI}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends i implements r {
        final /* synthetic */ p $predicate;
        final /* synthetic */ long $retries;
        /* synthetic */ long J$0;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(long j, p pVar, kotlin.coroutines.d<? super AnonymousClass3> dVar) {
            super(4, dVar);
            this.$retries = j;
            this.$predicate = pVar;
        }

        @Override // kotlin.jvm.functions.r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((FlowCollector) obj, (Throwable) obj2, ((Number) obj3).longValue(), (kotlin.coroutines.d<? super Boolean>) obj4);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0037  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                kotlin.a.e(obj);
                Throwable th = (Throwable) this.L$0;
                if (this.J$0 < this.$retries) {
                    p pVar = this.$predicate;
                    this.label = 1;
                    obj = pVar.invoke(th, this);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return Boolean.valueOf(z);
            }
            if (i != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
            boolean z = ((Boolean) obj).booleanValue();
            return Boolean.valueOf(z);
        }

        public final Object invoke(FlowCollector<? super T> flowCollector, Throwable th, long j, kotlin.coroutines.d<? super Boolean> dVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$retries, this.$predicate, dVar);
            anonymousClass3.L$0 = th;
            anonymousClass3.J$0 = j;
            return anonymousClass3.invokeSuspend(y.a);
        }
    }
}
