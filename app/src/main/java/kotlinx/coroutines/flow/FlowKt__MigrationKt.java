package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.q;
import kotlin.jvm.functions.r;
import kotlin.jvm.functions.s;
import kotlin.jvm.functions.t;
import kotlin.y;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class FlowKt__MigrationKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__MigrationKt$delayEach$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayEach$1", f = "Migration.kt", l = {423}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements p {
        final /* synthetic */ long $timeMillis;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$timeMillis = j;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass1(this.$timeMillis, dVar);
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(T t, kotlin.coroutines.d<? super y> dVar) {
            return ((AnonymousClass1) create(t, dVar)).invokeSuspend(y.a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                kotlin.a.e(obj);
                long j = this.$timeMillis;
                this.label = 1;
                Object objDelay = DelayKt.delay(j, this);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objDelay == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
            }
            return y.a;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__MigrationKt$delayFlow$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayFlow$1", f = "Migration.kt", l = {411}, m = "invokeSuspend")
    public static final class C00531 extends i implements p {
        final /* synthetic */ long $timeMillis;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00531(long j, kotlin.coroutines.d<? super C00531> dVar) {
            super(2, dVar);
            this.$timeMillis = j;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C00531(this.$timeMillis, dVar);
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(FlowCollector<? super T> flowCollector, kotlin.coroutines.d<? super y> dVar) {
            return ((C00531) create(flowCollector, dVar)).invokeSuspend(y.a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                kotlin.a.e(obj);
                long j = this.$timeMillis;
                this.label = 1;
                Object objDelay = DelayKt.delay(j, this);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objDelay == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
            }
            return y.a;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2", f = "Migration.kt", l = {302}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements q {
        final /* synthetic */ T $fallback;
        final /* synthetic */ l $predicate;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(l lVar, T t, kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(3, dVar);
            this.$predicate = lVar;
            this.$fallback = t;
        }

        @Override // kotlin.jvm.functions.q
        public final Object invoke(FlowCollector<? super T> flowCollector, Throwable th, kotlin.coroutines.d<? super y> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$predicate, this.$fallback, dVar);
            anonymousClass2.L$0 = flowCollector;
            anonymousClass2.L$1 = th;
            return anonymousClass2.invokeSuspend(y.a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                kotlin.a.e(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Throwable th = (Throwable) this.L$1;
                if (!((Boolean) this.$predicate.invoke(th)).booleanValue()) {
                    throw th;
                }
                T t = this.$fallback;
                this.L$0 = null;
                this.label = 1;
                Object objEmit = flowCollector.emit(t, this);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objEmit == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
            }
            return y.a;
        }
    }

    @kotlin.c
    public static final <T> Flow<T> cache(Flow<? extends T> flow) {
        throw com.google.android.datatransport.runtime.backends.c.p();
    }

    @kotlin.c
    public static final <T1, T2, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, q qVar) {
        return FlowKt.combine(flow, flow2, qVar);
    }

    @kotlin.c
    public static final <T, R> Flow<R> compose(Flow<? extends T> flow, l lVar) {
        throw com.google.android.datatransport.runtime.backends.c.p();
    }

    @kotlin.c
    public static final <T, R> Flow<R> concatMap(Flow<? extends T> flow, l lVar) {
        throw com.google.android.datatransport.runtime.backends.c.p();
    }

    @kotlin.c
    public static final <T> Flow<T> concatWith(Flow<? extends T> flow, T t) {
        throw com.google.android.datatransport.runtime.backends.c.p();
    }

    @kotlin.c
    public static final <T> Flow<T> delayEach(Flow<? extends T> flow, long j) {
        return FlowKt.onEach(flow, new AnonymousClass1(j, null));
    }

    @kotlin.c
    public static final <T> Flow<T> delayFlow(Flow<? extends T> flow, long j) {
        return FlowKt.onStart(flow, new C00531(j, null));
    }

    @kotlin.c
    public static final <T, R> Flow<R> flatMap(Flow<? extends T> flow, p pVar) {
        throw com.google.android.datatransport.runtime.backends.c.p();
    }

    @kotlin.c
    public static final <T> Flow<T> flatten(Flow<? extends Flow<? extends T>> flow) {
        throw com.google.android.datatransport.runtime.backends.c.p();
    }

    @kotlin.c
    public static final <T> void forEach(Flow<? extends T> flow, p pVar) {
        throw com.google.android.datatransport.runtime.backends.c.p();
    }

    @kotlin.c
    public static final <T> Flow<T> merge(Flow<? extends Flow<? extends T>> flow) {
        throw com.google.android.datatransport.runtime.backends.c.p();
    }

    public static final Void noImpl() {
        throw new UnsupportedOperationException("Not implemented, should not be called");
    }

    @kotlin.c
    public static final <T> Flow<T> observeOn(Flow<? extends T> flow, kotlin.coroutines.i iVar) {
        throw com.google.android.datatransport.runtime.backends.c.p();
    }

    @kotlin.c
    public static final <T> Flow<T> onErrorResume(Flow<? extends T> flow, Flow<? extends T> flow2) {
        throw com.google.android.datatransport.runtime.backends.c.p();
    }

    @kotlin.c
    public static final <T> Flow<T> onErrorResumeNext(Flow<? extends T> flow, Flow<? extends T> flow2) {
        throw com.google.android.datatransport.runtime.backends.c.p();
    }

    @kotlin.c
    public static final <T> Flow<T> onErrorReturn(Flow<? extends T> flow, T t, l lVar) {
        return FlowKt.m60catch(flow, new AnonymousClass2(lVar, t, null));
    }

    public static /* synthetic */ Flow onErrorReturn$default(Flow flow, Object obj, l lVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            lVar = new c(1);
        }
        return FlowKt.onErrorReturn(flow, obj, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onErrorReturn$lambda$0$FlowKt__MigrationKt(Throwable th) {
        return true;
    }

    @kotlin.c
    public static final <T> Flow<T> publish(Flow<? extends T> flow) {
        throw com.google.android.datatransport.runtime.backends.c.p();
    }

    @kotlin.c
    public static final <T> Flow<T> publishOn(Flow<? extends T> flow, kotlin.coroutines.i iVar) {
        throw com.google.android.datatransport.runtime.backends.c.p();
    }

    @kotlin.c
    public static final <T> Flow<T> replay(Flow<? extends T> flow) {
        throw com.google.android.datatransport.runtime.backends.c.p();
    }

    @kotlin.c
    public static final <T, R> Flow<R> scanFold(Flow<? extends T> flow, R r, q qVar) {
        throw com.google.android.datatransport.runtime.backends.c.p();
    }

    @kotlin.c
    public static final <T> Flow<T> scanReduce(Flow<? extends T> flow, q qVar) {
        return FlowKt.runningReduce(flow, qVar);
    }

    @kotlin.c
    public static final <T> Flow<T> skip(Flow<? extends T> flow, int i) {
        throw com.google.android.datatransport.runtime.backends.c.p();
    }

    @kotlin.c
    public static final <T> Flow<T> startWith(Flow<? extends T> flow, T t) {
        throw com.google.android.datatransport.runtime.backends.c.p();
    }

    @kotlin.c
    public static final <T> void subscribe(Flow<? extends T> flow) {
        throw com.google.android.datatransport.runtime.backends.c.p();
    }

    @kotlin.c
    public static final <T> Flow<T> subscribeOn(Flow<? extends T> flow, kotlin.coroutines.i iVar) {
        throw com.google.android.datatransport.runtime.backends.c.p();
    }

    @kotlin.c
    public static final <T, R> Flow<R> switchMap(Flow<? extends T> flow, p pVar) {
        return FlowKt.transformLatest(flow, new FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1(pVar, null));
    }

    @kotlin.c
    public static final <T1, T2, T3, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, r rVar) {
        return FlowKt.combine(flow, flow2, flow3, rVar);
    }

    @kotlin.c
    public static final <T> Flow<T> concatWith(Flow<? extends T> flow, Flow<? extends T> flow2) {
        throw com.google.android.datatransport.runtime.backends.c.p();
    }

    @kotlin.c
    public static final <T> Flow<T> publish(Flow<? extends T> flow, int i) {
        throw com.google.android.datatransport.runtime.backends.c.p();
    }

    @kotlin.c
    public static final <T> Flow<T> replay(Flow<? extends T> flow, int i) {
        throw com.google.android.datatransport.runtime.backends.c.p();
    }

    @kotlin.c
    public static final <T> Flow<T> startWith(Flow<? extends T> flow, Flow<? extends T> flow2) {
        throw com.google.android.datatransport.runtime.backends.c.p();
    }

    @kotlin.c
    public static final <T> void subscribe(Flow<? extends T> flow, p pVar) {
        throw com.google.android.datatransport.runtime.backends.c.p();
    }

    @kotlin.c
    public static final <T1, T2, T3, T4, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, s sVar) {
        return FlowKt.combine(flow, flow2, flow3, flow4, sVar);
    }

    @kotlin.c
    public static final <T1, T2, T3, T4, T5, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Flow<? extends T5> flow5, t tVar) {
        return FlowKt.combine(flow, flow2, flow3, flow4, flow5, tVar);
    }

    @kotlin.c
    public static final <T> void subscribe(Flow<? extends T> flow, p pVar, p pVar2) {
        throw com.google.android.datatransport.runtime.backends.c.p();
    }

    @kotlin.c
    public static final <T> Flow<T> onErrorReturn(Flow<? extends T> flow, T t) {
        throw com.google.android.datatransport.runtime.backends.c.p();
    }
}
