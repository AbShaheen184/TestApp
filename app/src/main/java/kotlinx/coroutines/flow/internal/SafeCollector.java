package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.i;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.j;
import kotlin.coroutines.jvm.internal.c;
import kotlin.jvm.functions.q;
import kotlin.jvm.internal.l;
import kotlin.m;
import kotlin.y;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class SafeCollector<T> extends c implements FlowCollector<T> {
    public final i collectContext;
    public final int collectContextSize;
    public final FlowCollector<T> collector;
    private d<? super y> completion_;
    private i lastEmissionContext;

    /* JADX WARN: Multi-variable type inference failed */
    public SafeCollector(FlowCollector<? super T> flowCollector, i iVar) {
        super(NoOpContinuation.INSTANCE, j.e);
        this.collector = flowCollector;
        this.collectContext = iVar;
        this.collectContextSize = ((Number) iVar.fold(0, new com.app.mlounge.ui.screens.watchlist.c(7))).intValue();
    }

    private final void checkContext(i iVar, i iVar2, T t) {
        if (iVar2 instanceof DownstreamExceptionContext) {
            exceptionTransparencyViolated((DownstreamExceptionContext) iVar2, t);
        }
        SafeCollector_commonKt.checkContext(this, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int collectContextSize$lambda$0(int i, g gVar) {
        return i + 1;
    }

    private final Object emit(d<? super y> dVar, T t) {
        i context = dVar.getContext();
        JobKt.ensureActive(context);
        i iVar = this.lastEmissionContext;
        if (iVar != context) {
            checkContext(context, iVar, t);
            this.lastEmissionContext = context;
        }
        this.completion_ = dVar;
        q qVar = SafeCollectorKt.emitFun;
        FlowCollector<T> flowCollector = this.collector;
        flowCollector.getClass();
        Object objInvoke = qVar.invoke(flowCollector, t, this);
        if (!l.a(objInvoke, a.e)) {
            this.completion_ = null;
        }
        return objInvoke;
    }

    private final void exceptionTransparencyViolated(DownstreamExceptionContext downstreamExceptionContext, Object obj) {
        throw new IllegalStateException(kotlin.text.l.D("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + downstreamExceptionContext.e + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // kotlin.coroutines.jvm.internal.a, kotlin.coroutines.jvm.internal.d
    public kotlin.coroutines.jvm.internal.d getCallerFrame() {
        d<? super y> dVar = this.completion_;
        if (dVar instanceof kotlin.coroutines.jvm.internal.d) {
            return (kotlin.coroutines.jvm.internal.d) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.c, kotlin.coroutines.d
    public i getContext() {
        i iVar = this.lastEmissionContext;
        return iVar == null ? j.e : iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a, kotlin.coroutines.jvm.internal.d
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public Object invokeSuspend(Object obj) {
        Throwable thA = m.a(obj);
        if (thA != null) {
            this.lastEmissionContext = new DownstreamExceptionContext(thA, getContext());
        }
        d<? super y> dVar = this.completion_;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return a.e;
    }

    @Override // kotlin.coroutines.jvm.internal.c, kotlin.coroutines.jvm.internal.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, d<? super y> dVar) {
        try {
            Object objEmit = emit(dVar, t);
            a aVar = a.e;
            if (objEmit == aVar) {
                dVar.getClass();
            }
            return objEmit == aVar ? objEmit : y.a;
        } catch (Throwable th) {
            this.lastEmissionContext = new DownstreamExceptionContext(th, dVar.getContext());
            throw th;
        }
    }
}
