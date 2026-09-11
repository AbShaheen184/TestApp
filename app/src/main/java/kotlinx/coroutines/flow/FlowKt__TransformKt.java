package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.collections.x;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.q;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.z;
import kotlin.y;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class FlowKt__TransformKt {
    @ExperimentalCoroutinesApi
    public static final <T> Flow<List<T>> chunked(Flow<? extends T> flow, int i) {
        if (i >= 1) {
            return new FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1(flow, i);
        }
        net.luminis.tls.engine.impl.c.p(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "Expected positive chunk size, but got "));
        return null;
    }

    public static final <T> Flow<T> filter(Flow<? extends T> flow, p pVar) {
        return new FlowKt__TransformKt$filter$$inlined$unsafeTransform$1(flow, pVar);
    }

    public static final <R> Flow<R> filterIsInstance(final Flow<?> flow, final kotlin.reflect.c cVar) {
        return (Flow<R>) new Flow<Object>() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ kotlin.reflect.c $klass$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2$2$1, reason: invalid class name */
                @e(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2$2", f = "Transform.kt", l = {Token.TRUE}, m = "emit")
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.c {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, kotlin.reflect.c cVar) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$klass$inlined = cVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, kotlin.coroutines.d dVar) {
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
                    Object obj2 = anonymousClass1.result;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        kotlin.a.e(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        if (((kotlin.jvm.internal.e) this.$klass$inlined).d(obj)) {
                            anonymousClass1.label = 1;
                            Object objEmit = flowCollector.emit(obj, anonymousClass1);
                            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                            if (objEmit == aVar) {
                                return aVar;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj2);
                    }
                    return y.a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Object> flowCollector, kotlin.coroutines.d dVar) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector, cVar), dVar);
                return objCollect == kotlin.coroutines.intrinsics.a.e ? objCollect : y.a;
            }
        };
    }

    public static final <T> Flow<T> filterNot(Flow<? extends T> flow, p pVar) {
        return new FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1(flow, pVar);
    }

    public static final <T> Flow<T> filterNotNull(final Flow<? extends T> flow) {
        return new Flow<T>() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
                @e(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {Token.TRUE}, m = "emit")
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(T t, kotlin.coroutines.d<? super y> dVar) {
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
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        if (t != null) {
                            anonymousClass1.label = 1;
                            Object objEmit = flowCollector.emit(t, anonymousClass1);
                            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                            if (objEmit == aVar) {
                                return aVar;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj);
                    }
                    return y.a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, kotlin.coroutines.d dVar) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector), dVar);
                return objCollect == kotlin.coroutines.intrinsics.a.e ? objCollect : y.a;
            }
        };
    }

    public static final <T, R> Flow<R> map(Flow<? extends T> flow, p pVar) {
        return new FlowKt__TransformKt$map$$inlined$unsafeTransform$1(flow, pVar);
    }

    public static final <T, R> Flow<R> mapNotNull(Flow<? extends T> flow, p pVar) {
        return new FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1(flow, pVar);
    }

    public static final <T> Flow<T> onEach(final Flow<? extends T> flow, final p pVar) {
        return new Flow<T>() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ p $action$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
                @e(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {Token.TRUE, Token.SHEQ}, m = "emit")
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.c {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, p pVar) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$action$inlined = pVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
                
                    if (r6.emit(r1, r0) == r4) goto L22;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(T r6, kotlin.coroutines.d<? super kotlin.y> r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        int r1 = r0.label
                        r2 = 2
                        r3 = 1
                        kotlin.coroutines.intrinsics.a r4 = kotlin.coroutines.intrinsics.a.e
                        if (r1 == 0) goto L3b
                        if (r1 == r3) goto L31
                        if (r1 != r2) goto L2a
                        kotlin.a.e(r7)
                        goto L5f
                    L2a:
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        net.luminis.tls.engine.impl.c.r(r6)
                        r6 = 0
                        return r6
                    L31:
                        java.lang.Object r6 = r0.L$1
                        kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
                        java.lang.Object r1 = r0.L$0
                        kotlin.a.e(r7)
                        goto L51
                    L3b:
                        kotlin.a.e(r7)
                        kotlinx.coroutines.flow.FlowCollector r7 = r5.$this_unsafeFlow
                        kotlin.jvm.functions.p r1 = r5.$action$inlined
                        r0.L$0 = r6
                        r0.L$1 = r7
                        r0.label = r3
                        java.lang.Object r1 = r1.invoke(r6, r0)
                        if (r1 != r4) goto L4f
                        goto L5e
                    L4f:
                        r1 = r6
                        r6 = r7
                    L51:
                        r7 = 0
                        r0.L$0 = r7
                        r0.L$1 = r7
                        r0.label = r2
                        java.lang.Object r6 = r6.emit(r1, r0)
                        if (r6 != r4) goto L5f
                    L5e:
                        return r4
                    L5f:
                        kotlin.y r6 = kotlin.y.a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, kotlin.coroutines.d dVar) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector, pVar), dVar);
                return objCollect == kotlin.coroutines.intrinsics.a.e ? objCollect : y.a;
            }
        };
    }

    public static final <T, R> Flow<R> runningFold(Flow<? extends T> flow, R r, q qVar) {
        return new FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1(r, flow, qVar);
    }

    public static final <T> Flow<T> runningReduce(final Flow<? extends T> flow, final q qVar) {
        return new Flow<T>() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super T> flowCollector, kotlin.coroutines.d<? super y> dVar) {
                z zVar = new z();
                zVar.e = NullSurrogateKt.NULL;
                Object objCollect = flow.collect(new FlowKt__TransformKt$runningReduce$1$1(zVar, qVar, flowCollector), dVar);
                return objCollect == kotlin.coroutines.intrinsics.a.e ? objCollect : y.a;
            }
        };
    }

    public static final <T, R> Flow<R> scan(Flow<? extends T> flow, R r, q qVar) {
        return FlowKt.runningFold(flow, r, qVar);
    }

    public static final <T> Flow<x> withIndex(final Flow<? extends T> flow) {
        return new Flow<x>() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super x> flowCollector, kotlin.coroutines.d<? super y> dVar) {
                Object objCollect = flow.collect(new FlowKt__TransformKt$withIndex$1$1(flowCollector, new kotlin.jvm.internal.x()), dVar);
                return objCollect == kotlin.coroutines.intrinsics.a.e ? objCollect : y.a;
            }
        };
    }

    public static final <R> Flow<R> filterIsInstance(Flow<?> flow) {
        l.e();
        throw null;
    }
}
