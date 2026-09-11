package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.q;
import kotlin.jvm.functions.s;
import kotlin.y;
import kotlinx.coroutines.flow.internal.CombineKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3", f = "Zip.kt", l = {269}, m = "invokeSuspend")
public final class FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3 extends i implements p {
    final /* synthetic */ Flow[] $flows;
    final /* synthetic */ s $transform$inlined;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3$1", f = "Zip.kt", l = {270}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements q {
        final /* synthetic */ s $transform$inlined;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(kotlin.coroutines.d dVar, s sVar) {
            super(3, dVar);
            this.$transform$inlined = sVar;
        }

        @Override // kotlin.jvm.functions.q
        public final Object invoke(FlowCollector<? super R> flowCollector, Object[] objArr, kotlin.coroutines.d<? super y> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dVar, this.$transform$inlined);
            anonymousClass1.L$0 = flowCollector;
            anonymousClass1.L$1 = objArr;
            return anonymousClass1.invokeSuspend(y.a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                kotlin.a.e(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Object[] objArr = (Object[]) this.L$1;
                s sVar = this.$transform$inlined;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                Object obj4 = objArr[2];
                this.label = 1;
                Object objC = sVar.c(flowCollector, obj2, obj3, obj4, this);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objC == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3(Flow[] flowArr, kotlin.coroutines.d dVar, s sVar) {
        super(2, dVar);
        this.$flows = flowArr;
        this.$transform$inlined = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
        FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3 flowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3 = new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3(this.$flows, dVar, this.$transform$inlined);
        flowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3.L$0 = obj;
        return flowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(FlowCollector<? super R> flowCollector, kotlin.coroutines.d<? super y> dVar) {
        return ((FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3) create(flowCollector, dVar)).invokeSuspend(y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            kotlin.a.e(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow[] flowArr = this.$flows;
            kotlin.jvm.functions.a aVar = new kotlin.jvm.functions.a() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
                @Override // kotlin.jvm.functions.a
                public final Void invoke() {
                    return null;
                }
            };
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.$transform$inlined);
            this.label = 1;
            Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr, aVar, anonymousClass1, this);
            kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
            if (objCombineInternal == aVar2) {
                return aVar2;
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
