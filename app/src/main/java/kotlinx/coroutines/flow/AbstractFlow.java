package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.e;
import kotlin.y;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.flow.internal.SafeCollector;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalCoroutinesApi
public abstract class AbstractFlow<T> implements Flow<T>, CancellableFlow<T> {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.AbstractFlow$collect$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {226}, m = "collect")
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ AbstractFlow<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractFlow<T> abstractFlow, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(dVar);
            this.this$0 = abstractFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.collect(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector<? super T> flowCollector, kotlin.coroutines.d<? super y> dVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Throwable th;
        SafeCollector safeCollector;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(this, dVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(this, dVar);
        }
        Object obj = anonymousClass1.result;
        int i2 = anonymousClass1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            safeCollector = (SafeCollector) anonymousClass1.L$0;
            try {
                kotlin.a.e(obj);
                safeCollector.releaseIntercepted();
                return y.a;
            } catch (Throwable th2) {
                th = th2;
                safeCollector.releaseIntercepted();
                throw th;
            }
        }
        kotlin.a.e(obj);
        SafeCollector safeCollector2 = new SafeCollector(flowCollector, anonymousClass1.getContext());
        try {
            anonymousClass1.L$0 = safeCollector2;
            anonymousClass1.label = 1;
            Object objCollectSafely = collectSafely(safeCollector2, anonymousClass1);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objCollectSafely == aVar) {
                return aVar;
            }
            safeCollector = safeCollector2;
            safeCollector.releaseIntercepted();
            return y.a;
        } catch (Throwable th3) {
            th = th3;
            safeCollector = safeCollector2;
            safeCollector.releaseIntercepted();
            throw th;
        }
    }

    public abstract Object collectSafely(FlowCollector<? super T> flowCollector, kotlin.coroutines.d<? super y> dVar);
}
