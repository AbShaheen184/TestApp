package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.d;
import kotlin.jvm.functions.q;
import kotlin.jvm.internal.j;
import kotlin.y;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class SafeCollectorKt$emitFun$1 extends j implements q {
    public static final SafeCollectorKt$emitFun$1 INSTANCE = new SafeCollectorKt$emitFun$1();

    public SafeCollectorKt$emitFun$1() {
        super(3, FlowCollector.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(FlowCollector<Object> flowCollector, Object obj, d<? super y> dVar) {
        return flowCollector.emit(obj, dVar);
    }
}
