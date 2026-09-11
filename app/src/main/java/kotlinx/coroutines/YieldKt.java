package kotlinx.coroutines;

import com.google.android.material.shape.e;
import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.y;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.DispatchedContinuationKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class YieldKt {
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    public static final Object yield(d<? super y> dVar) {
        Object obj;
        i context = dVar.getContext();
        JobKt.ensureActive(context);
        d dVarG = e.g(dVar);
        DispatchedContinuation dispatchedContinuation = dVarG instanceof DispatchedContinuation ? (DispatchedContinuation) dVarG : null;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        y yVar = y.a;
        if (dispatchedContinuation != null) {
            if (DispatchedContinuationKt.safeIsDispatchNeeded(dispatchedContinuation.dispatcher, context)) {
                dispatchedContinuation.dispatchYield$kotlinx_coroutines_core(context, yVar);
            } else {
                YieldContext yieldContext = new YieldContext();
                dispatchedContinuation.dispatchYield$kotlinx_coroutines_core(context.plus(yieldContext), yVar);
                if (yieldContext.dispatcherWasUnconfined && !DispatchedContinuationKt.yieldUndispatched(dispatchedContinuation)) {
                    obj = yVar;
                }
            }
            obj = aVar;
        } else {
            obj = yVar;
        }
        return obj == aVar ? obj : yVar;
    }
}
