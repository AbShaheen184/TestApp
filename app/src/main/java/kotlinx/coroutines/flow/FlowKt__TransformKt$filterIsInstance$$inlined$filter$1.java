package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.l;
import kotlin.y;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class FlowKt__TransformKt$filterIsInstance$$inlined$filter$1 implements Flow<Object> {
    final /* synthetic */ Flow $this_unsafeTransform$inlined;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class AnonymousClass2<T> implements FlowCollector {
        final /* synthetic */ FlowCollector $this_unsafeFlow;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2$1, reason: invalid class name */
        @e(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2", f = "Transform.kt", l = {Token.TRUE}, m = "emit")
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

        public AnonymousClass2(FlowCollector flowCollector) {
            this.$this_unsafeFlow = flowCollector;
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
                l.e();
                throw null;
            }
            if (i2 == 1) {
                kotlin.a.e(obj2);
                return y.a;
            }
            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }

        public final Object emit$$forInline(Object obj, kotlin.coroutines.d dVar) {
            new AnonymousClass1(dVar);
            l.e();
            throw null;
        }
    }

    public FlowKt__TransformKt$filterIsInstance$$inlined$filter$1(Flow flow) {
        this.$this_unsafeTransform$inlined = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super Object> flowCollector, kotlin.coroutines.d dVar) {
        l.e();
        throw null;
    }

    public Object collect$$forInline(FlowCollector flowCollector, kotlin.coroutines.d dVar) {
        new kotlin.coroutines.jvm.internal.c(dVar) { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1.1
            int label;
            /* synthetic */ Object result;

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return FlowKt__TransformKt$filterIsInstance$$inlined$filter$1.this.collect(null, this);
            }
        };
        l.e();
        throw null;
    }
}
