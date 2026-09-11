package kotlinx.coroutines;

import com.app.mlounge.ui.screens.watchlist.c;
import kotlin.coroutines.e;
import kotlin.coroutines.g;
import kotlin.coroutines.i;
import kotlin.coroutines.j;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.z;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class CoroutineContextKt {
    private static final String DEBUG_THREAD_NAME_SEPARATOR = " @";

    private static final i foldCopies(i iVar, i iVar2, boolean z) {
        boolean zHasCopyableElements = hasCopyableElements(iVar);
        boolean zHasCopyableElements2 = hasCopyableElements(iVar2);
        if (!zHasCopyableElements && !zHasCopyableElements2) {
            return iVar.plus(iVar2);
        }
        z zVar = new z();
        zVar.e = iVar2;
        androidx.activity.compose.i iVar3 = new androidx.activity.compose.i(zVar, z, 5);
        j jVar = j.e;
        i iVar4 = (i) iVar.fold(jVar, iVar3);
        if (zHasCopyableElements2) {
            zVar.e = ((i) zVar.e).fold(jVar, new c(4));
        }
        return iVar4.plus((i) zVar.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i foldCopies$lambda$1(z zVar, boolean z, i iVar, g gVar) {
        if (!(gVar instanceof CopyableThreadContextElement)) {
            return iVar.plus(gVar);
        }
        g gVar2 = ((i) zVar.e).get(gVar.getKey());
        if (gVar2 == null) {
            return iVar.plus(z ? ((CopyableThreadContextElement) gVar).copyForChild() : (CopyableThreadContextElement) gVar);
        }
        zVar.e = ((i) zVar.e).minusKey(gVar.getKey());
        return iVar.plus(((CopyableThreadContextElement) gVar).mergeForChild(gVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i foldCopies$lambda$2(i iVar, g gVar) {
        return gVar instanceof CopyableThreadContextElement ? iVar.plus(((CopyableThreadContextElement) gVar).copyForChild()) : iVar.plus(gVar);
    }

    public static final String getCoroutineName(i iVar) {
        return null;
    }

    private static final boolean hasCopyableElements(i iVar) {
        return ((Boolean) iVar.fold(Boolean.FALSE, new c(3))).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasCopyableElements$lambda$0(boolean z, g gVar) {
        return z || (gVar instanceof CopyableThreadContextElement);
    }

    @ExperimentalCoroutinesApi
    public static final i newCoroutineContext(CoroutineScope coroutineScope, i iVar) {
        i iVarFoldCopies = foldCopies(coroutineScope.getCoroutineContext(), iVar, true);
        return (iVarFoldCopies == Dispatchers.getDefault() || iVarFoldCopies.get(e.e) != null) ? iVarFoldCopies : iVarFoldCopies.plus(Dispatchers.getDefault());
    }

    public static final UndispatchedCoroutine<?> undispatchedCompletion(d dVar) {
        while (!(dVar instanceof DispatchedCoroutine) && (dVar = dVar.getCallerFrame()) != null) {
            if (dVar instanceof UndispatchedCoroutine) {
                return (UndispatchedCoroutine) dVar;
            }
        }
        return null;
    }

    public static final UndispatchedCoroutine<?> updateUndispatchedCompletion(kotlin.coroutines.d<?> dVar, i iVar, Object obj) {
        if (!(dVar instanceof d) || iVar.get(UndispatchedMarker.INSTANCE) == null) {
            return null;
        }
        UndispatchedCoroutine<?> undispatchedCoroutineUndispatchedCompletion = undispatchedCompletion((d) dVar);
        if (undispatchedCoroutineUndispatchedCompletion != null) {
            undispatchedCoroutineUndispatchedCompletion.saveThreadContext(iVar, obj);
        }
        return undispatchedCoroutineUndispatchedCompletion;
    }

    public static final <T> T withContinuationContext(kotlin.coroutines.d<?> dVar, Object obj, kotlin.jvm.functions.a aVar) {
        boolean zClearThreadContext;
        i context = dVar.getContext();
        Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(context, obj);
        UndispatchedCoroutine<?> undispatchedCoroutineUpdateUndispatchedCompletion = objUpdateThreadContext != ThreadContextKt.NO_THREAD_ELEMENTS ? updateUndispatchedCompletion(dVar, context, objUpdateThreadContext) : null;
        try {
            T t = (T) aVar.invoke();
            if (undispatchedCoroutineUpdateUndispatchedCompletion != null) {
                if (!zClearThreadContext) {
                    return t;
                }
            }
            return t;
        } finally {
            if (undispatchedCoroutineUpdateUndispatchedCompletion == null || undispatchedCoroutineUpdateUndispatchedCompletion.clearThreadContext()) {
                ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
            }
        }
    }

    public static final <T> T withCoroutineContext(i iVar, Object obj, kotlin.jvm.functions.a aVar) {
        Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(iVar, obj);
        try {
            return (T) aVar.invoke();
        } finally {
            ThreadContextKt.restoreThreadContext(iVar, objUpdateThreadContext);
        }
    }

    @InternalCoroutinesApi
    public static final i newCoroutineContext(i iVar, i iVar2) {
        return !hasCopyableElements(iVar2) ? iVar.plus(iVar2) : foldCopies(iVar, iVar2, false);
    }
}
