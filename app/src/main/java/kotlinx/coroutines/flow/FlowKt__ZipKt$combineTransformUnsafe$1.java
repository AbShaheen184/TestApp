package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.q;
import kotlin.jvm.internal.l;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1", f = "Zip.kt", l = {269}, m = "invokeSuspend")
public final class FlowKt__ZipKt$combineTransformUnsafe$1 extends i implements p {
    final /* synthetic */ Flow<T>[] $flows;
    final /* synthetic */ q $transform;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combineTransformUnsafe$1(Flow<? extends T>[] flowArr, q qVar, kotlin.coroutines.d<? super FlowKt__ZipKt$combineTransformUnsafe$1> dVar) {
        super(2, dVar);
        this.$flows = flowArr;
        this.$transform = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
        FlowKt__ZipKt$combineTransformUnsafe$1 flowKt__ZipKt$combineTransformUnsafe$1 = new FlowKt__ZipKt$combineTransformUnsafe$1(this.$flows, this.$transform, dVar);
        flowKt__ZipKt$combineTransformUnsafe$1.L$0 = obj;
        return flowKt__ZipKt$combineTransformUnsafe$1;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(FlowCollector<? super R> flowCollector, kotlin.coroutines.d<? super y> dVar) {
        return ((FlowKt__ZipKt$combineTransformUnsafe$1) create(flowCollector, dVar)).invokeSuspend(y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.a.e(obj);
                return y.a;
            }
            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.a.e(obj);
        kotlin.jvm.functions.a unused = new kotlin.jvm.functions.a() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
            @Override // kotlin.jvm.functions.a
            public final Void invoke() {
                return null;
            }
        };
        l.e();
        throw null;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        kotlin.jvm.functions.a unused = new kotlin.jvm.functions.a() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
            @Override // kotlin.jvm.functions.a
            public final Void invoke() {
                return null;
            }
        };
        l.e();
        throw null;
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1$1", f = "Zip.kt", l = {269}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements q {
        final /* synthetic */ q $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(q qVar, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(3, dVar);
            this.$transform = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                kotlin.a.e(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Object[] objArr = (Object[]) this.L$1;
                q qVar = this.$transform;
                this.L$0 = null;
                this.label = 1;
                Object objInvoke = qVar.invoke(flowCollector, objArr, this);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objInvoke == aVar) {
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

        public final Object invokeSuspend$$forInline(Object obj) {
            this.$transform.invoke((FlowCollector) this.L$0, (Object[]) this.L$1, this);
            return y.a;
        }

        @Override // kotlin.jvm.functions.q
        public final Object invoke(FlowCollector<? super R> flowCollector, T[] tArr, kotlin.coroutines.d<? super y> dVar) {
            l.e();
            throw null;
        }
    }
}
