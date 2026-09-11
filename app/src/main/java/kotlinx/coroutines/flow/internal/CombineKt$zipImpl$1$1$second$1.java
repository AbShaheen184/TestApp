package kotlinx.coroutines.flow.internal;

import kotlin.a;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import net.luminis.tls.engine.impl.c;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1", f = "Combine.kt", l = {Token.REF_NS_MEMBER}, m = "invokeSuspend")
public final class CombineKt$zipImpl$1$1$second$1 extends i implements p {
    final /* synthetic */ Flow<T2> $flow2;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class AnonymousClass1<T> implements FlowCollector {
        final /* synthetic */ ProducerScope<Object> $$this$produce;

        public AnonymousClass1(ProducerScope<Object> producerScope) {
            this.$$this$produce = producerScope;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(T2 t2, d<? super y> dVar) {
            CombineKt$zipImpl$1$1$second$1$1$emit$1 combineKt$zipImpl$1$1$second$1$1$emit$1;
            Object obj;
            if (dVar instanceof CombineKt$zipImpl$1$1$second$1$1$emit$1) {
                combineKt$zipImpl$1$1$second$1$1$emit$1 = (CombineKt$zipImpl$1$1$second$1$1$emit$1) dVar;
                int i = combineKt$zipImpl$1$1$second$1$1$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    combineKt$zipImpl$1$1$second$1$1$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    combineKt$zipImpl$1$1$second$1$1$emit$1 = new CombineKt$zipImpl$1$1$second$1$1$emit$1(this, dVar);
                }
            } else {
                combineKt$zipImpl$1$1$second$1$1$emit$1 = new CombineKt$zipImpl$1$1$second$1$1$emit$1(this, dVar);
            }
            Object obj2 = combineKt$zipImpl$1$1$second$1$1$emit$1.result;
            int i2 = combineKt$zipImpl$1$1$second$1$1$emit$1.label;
            if (i2 == 0) {
                a.e(obj2);
                SendChannel<Object> channel = this.$$this$produce.getChannel();
                if (t2 == 0) {
                    obj = t2;
                    obj = NullSurrogateKt.NULL;
                }
                obj = t2;
                combineKt$zipImpl$1$1$second$1$1$emit$1.label = 1;
                Object objSend = channel.send(obj, combineKt$zipImpl$1$1$second$1$1$emit$1);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objSend == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                a.e(obj2);
            }
            return y.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombineKt$zipImpl$1$1$second$1(Flow<? extends T2> flow, d<? super CombineKt$zipImpl$1$1$second$1> dVar) {
        super(2, dVar);
        this.$flow2 = flow;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        CombineKt$zipImpl$1$1$second$1 combineKt$zipImpl$1$1$second$1 = new CombineKt$zipImpl$1$1$second$1(this.$flow2, dVar);
        combineKt$zipImpl$1$1$second$1.L$0 = obj;
        return combineKt$zipImpl$1$1$second$1;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(ProducerScope<Object> producerScope, d<? super y> dVar) {
        return ((CombineKt$zipImpl$1$1$second$1) create(producerScope, dVar)).invokeSuspend(y.a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.d to kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1 for r3v1 'this'  kotlin.coroutines.d
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.label
            r1 = 1
            if (r0 == 0) goto L12
            if (r0 != r1) goto Lb
            kotlin.a.e(r4)
            goto L2b
        Lb:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r4)
            r4 = 0
            return r4
        L12:
            kotlin.a.e(r4)
            java.lang.Object r4 = r3.L$0
            kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
            kotlinx.coroutines.flow.Flow<T2> r0 = r3.$flow2
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1 r2 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1
            r2.<init>(r4)
            r3.label = r1
            java.lang.Object r4 = r0.collect(r2, r3)
            kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.e
            if (r4 != r0) goto L2b
            return r0
        L2b:
            kotlin.y r4 = kotlin.y.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
