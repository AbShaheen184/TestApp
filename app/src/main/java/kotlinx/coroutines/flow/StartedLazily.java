package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.v;
import kotlin.y;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class StartedLazily implements SharingStarted {
    @Override // kotlinx.coroutines.flow.SharingStarted
    public Flow<SharingCommand> command(StateFlow<Integer> stateFlow) {
        return FlowKt.flow(new AnonymousClass1(stateFlow, null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.StartedLazily$command$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", l = {Token.TYPEOFNAME}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements p {
        final /* synthetic */ StateFlow<Integer> $subscriptionCount;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StateFlow<Integer> stateFlow, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$subscriptionCount = stateFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$subscriptionCount, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(FlowCollector<? super SharingCommand> flowCollector, kotlin.coroutines.d<? super y> dVar) {
            return ((AnonymousClass1) create(flowCollector, dVar)).invokeSuspend(y.a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                kotlin.a.e(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                v vVar = new v();
                StateFlow<Integer> stateFlow = this.$subscriptionCount;
                C00021 c00021 = new C00021(vVar, flowCollector);
                this.label = 1;
                Object objCollect = stateFlow.collect(c00021, this);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objCollect == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
            }
            com.google.gson.b.b();
            return null;
        }

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.StartedLazily$command$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
        public static final class C00021<T> implements FlowCollector {
            final /* synthetic */ FlowCollector<SharingCommand> $$this$flow;
            final /* synthetic */ v $started;

            /* JADX WARN: Multi-variable type inference failed */
            public C00021(v vVar, FlowCollector<? super SharingCommand> flowCollector) {
                this.$started = vVar;
                this.$$this$flow = flowCollector;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            public final Object emit(int i, kotlin.coroutines.d<? super y> dVar) {
                StartedLazily$command$1$1$emit$1 startedLazily$command$1$1$emit$1;
                if (dVar instanceof StartedLazily$command$1$1$emit$1) {
                    startedLazily$command$1$1$emit$1 = (StartedLazily$command$1$1$emit$1) dVar;
                    int i2 = startedLazily$command$1$1$emit$1.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        startedLazily$command$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
                    } else {
                        startedLazily$command$1$1$emit$1 = new StartedLazily$command$1$1$emit$1(this, dVar);
                    }
                } else {
                    startedLazily$command$1$1$emit$1 = new StartedLazily$command$1$1$emit$1(this, dVar);
                }
                Object obj = startedLazily$command$1$1$emit$1.result;
                int i3 = startedLazily$command$1$1$emit$1.label;
                y yVar = y.a;
                if (i3 == 0) {
                    kotlin.a.e(obj);
                    if (i > 0) {
                        v vVar = this.$started;
                        if (!vVar.e) {
                            vVar.e = true;
                            FlowCollector<SharingCommand> flowCollector = this.$$this$flow;
                            SharingCommand sharingCommand = SharingCommand.START;
                            startedLazily$command$1$1$emit$1.label = 1;
                            Object objEmit = flowCollector.emit(sharingCommand, startedLazily$command$1$1$emit$1);
                            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                            if (objEmit == aVar) {
                                return aVar;
                            }
                        }
                    }
                } else {
                    if (i3 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                return yVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.d dVar) {
                return emit(((Number) obj).intValue(), (kotlin.coroutines.d<? super y>) dVar);
            }
        }
    }
}
