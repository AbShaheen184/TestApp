package kotlinx.coroutines;

import kotlin.coroutines.d;
import kotlin.coroutines.e;
import kotlin.coroutines.i;
import kotlin.coroutines.j;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.l;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.intrinsics.CancellableKt;
import kotlinx.coroutines.intrinsics.UndispatchedKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class BuildersKt__Builders_commonKt {
    private static final int RESUMED = 2;
    private static final int SUSPENDED = 1;
    private static final int UNDECIDED = 0;

    public static final <T> Deferred<T> async(CoroutineScope coroutineScope, i iVar, CoroutineStart coroutineStart, p pVar) {
        i iVarNewCoroutineContext = CoroutineContextKt.newCoroutineContext(coroutineScope, iVar);
        DeferredCoroutine lazyDeferredCoroutine = coroutineStart.isLazy() ? new LazyDeferredCoroutine(iVarNewCoroutineContext, pVar) : new DeferredCoroutine(iVarNewCoroutineContext, true);
        ((AbstractCoroutine) lazyDeferredCoroutine).start(coroutineStart, lazyDeferredCoroutine, pVar);
        return (Deferred<T>) lazyDeferredCoroutine;
    }

    public static /* synthetic */ Deferred async$default(CoroutineScope coroutineScope, i iVar, CoroutineStart coroutineStart, p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            iVar = j.e;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return BuildersKt.async(coroutineScope, iVar, coroutineStart, pVar);
    }

    public static final <T> Object invoke(CoroutineDispatcher coroutineDispatcher, p pVar, d<? super T> dVar) {
        return BuildersKt.withContext(coroutineDispatcher, pVar, dVar);
    }

    public static final Job launch(CoroutineScope coroutineScope, i iVar, CoroutineStart coroutineStart, p pVar) {
        i iVarNewCoroutineContext = CoroutineContextKt.newCoroutineContext(coroutineScope, iVar);
        AbstractCoroutine lazyStandaloneCoroutine = coroutineStart.isLazy() ? new LazyStandaloneCoroutine(iVarNewCoroutineContext, pVar) : new StandaloneCoroutine(iVarNewCoroutineContext, true);
        lazyStandaloneCoroutine.start(coroutineStart, lazyStandaloneCoroutine, pVar);
        return lazyStandaloneCoroutine;
    }

    public static /* synthetic */ Job launch$default(CoroutineScope coroutineScope, i iVar, CoroutineStart coroutineStart, p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            iVar = j.e;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return BuildersKt.launch(coroutineScope, iVar, coroutineStart, pVar);
    }

    public static final <T> Object withContext(i iVar, p pVar, d<? super T> dVar) {
        i context = dVar.getContext();
        i iVarNewCoroutineContext = CoroutineContextKt.newCoroutineContext(context, iVar);
        JobKt.ensureActive(iVarNewCoroutineContext);
        if (iVarNewCoroutineContext == context) {
            ScopeCoroutine scopeCoroutine = new ScopeCoroutine(iVarNewCoroutineContext, dVar);
            return UndispatchedKt.startUndispatchedOrReturn(scopeCoroutine, scopeCoroutine, pVar);
        }
        e eVar = e.e;
        if (!l.a(iVarNewCoroutineContext.get(eVar), context.get(eVar))) {
            DispatchedCoroutine dispatchedCoroutine = new DispatchedCoroutine(iVarNewCoroutineContext, dVar);
            CancellableKt.startCoroutineCancellable(pVar, dispatchedCoroutine, dispatchedCoroutine);
            return dispatchedCoroutine.getResult$kotlinx_coroutines_core();
        }
        UndispatchedCoroutine undispatchedCoroutine = new UndispatchedCoroutine(iVarNewCoroutineContext, dVar);
        i context2 = undispatchedCoroutine.getContext();
        Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(context2, null);
        try {
            return UndispatchedKt.startUndispatchedOrReturn(undispatchedCoroutine, undispatchedCoroutine, pVar);
        } finally {
            ThreadContextKt.restoreThreadContext(context2, objUpdateThreadContext);
        }
    }
}
