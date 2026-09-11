package kotlinx.coroutines.flow.internal;

import com.google.android.material.shape.e;
import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.coroutines.jvm.internal.a;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.c0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class ChannelFlowKt {
    public static final <T> ChannelFlow<T> asChannelFlow(Flow<? extends T> flow) {
        ChannelFlow<T> channelFlow = flow instanceof ChannelFlow ? (ChannelFlow) flow : null;
        if (channelFlow == null) {
            return new ChannelFlowOperatorImpl(flow, null, 0, null, 14, null);
        }
        return channelFlow;
    }

    public static final <T, V> Object withContextUndispatched(i iVar, V v, Object obj, p pVar, d<? super T> dVar) {
        Object objInvoke;
        Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(iVar, obj);
        try {
            StackFrameContinuation stackFrameContinuation = new StackFrameContinuation(dVar, iVar);
            if (pVar instanceof a) {
                c0.c(2, pVar);
                objInvoke = pVar.invoke(v, stackFrameContinuation);
            } else {
                objInvoke = e.k(pVar, v, stackFrameContinuation);
            }
            ThreadContextKt.restoreThreadContext(iVar, objUpdateThreadContext);
            if (objInvoke == kotlin.coroutines.intrinsics.a.e) {
                dVar.getClass();
            }
            return objInvoke;
        } catch (Throwable th) {
            ThreadContextKt.restoreThreadContext(iVar, objUpdateThreadContext);
            throw th;
        }
    }

    public static /* synthetic */ Object withContextUndispatched$default(i iVar, Object obj, Object obj2, p pVar, d dVar, int i, Object obj3) {
        if ((i & 4) != 0) {
            obj2 = ThreadContextKt.threadContextElements(iVar);
        }
        return withContextUndispatched(iVar, obj, obj2, pVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> FlowCollector<T> withUndispatchedContextCollector(FlowCollector<? super T> flowCollector, i iVar) {
        return ((flowCollector instanceof SendingCollector) || (flowCollector instanceof NopCollector)) ? flowCollector : new UndispatchedContextCollector(flowCollector, iVar);
    }
}
