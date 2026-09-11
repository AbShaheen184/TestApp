package kotlinx.coroutines.selects;

import kotlin.coroutines.d;
import kotlin.jvm.functions.l;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class SelectOldKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void resumeUndispatched(CancellableContinuation<? super T> cancellableContinuation, T t) {
        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) cancellableContinuation.getContext().get(CoroutineDispatcher.Key);
        if (coroutineDispatcher != null) {
            cancellableContinuation.resumeUndispatched(coroutineDispatcher, t);
        } else {
            cancellableContinuation.resumeWith(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resumeUndispatchedWithException(CancellableContinuation<?> cancellableContinuation, Throwable th) {
        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) cancellableContinuation.getContext().get(CoroutineDispatcher.Key);
        if (coroutineDispatcher != null) {
            cancellableContinuation.resumeUndispatchedWithException(coroutineDispatcher, th);
        } else {
            cancellableContinuation.resumeWith(kotlin.a.b(th));
        }
    }

    public static final <R> Object selectOld(l lVar, d<? super R> dVar) {
        SelectBuilderImpl selectBuilderImpl = new SelectBuilderImpl(dVar);
        try {
            lVar.invoke(selectBuilderImpl);
        } catch (Throwable th) {
            selectBuilderImpl.handleBuilderException(th);
        }
        Object result = selectBuilderImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.a.e) {
            dVar.getClass();
        }
        return result;
    }

    private static final <R> Object selectOld$$forInline(l lVar, d<? super R> dVar) {
        SelectBuilderImpl selectBuilderImpl = new SelectBuilderImpl(dVar);
        try {
            lVar.invoke(selectBuilderImpl);
        } catch (Throwable th) {
            selectBuilderImpl.handleBuilderException(th);
        }
        Object result = selectBuilderImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.a.e) {
            dVar.getClass();
        }
        return result;
    }

    public static final <R> Object selectUnbiasedOld(l lVar, d<? super R> dVar) {
        UnbiasedSelectBuilderImpl unbiasedSelectBuilderImpl = new UnbiasedSelectBuilderImpl(dVar);
        try {
            lVar.invoke(unbiasedSelectBuilderImpl);
        } catch (Throwable th) {
            unbiasedSelectBuilderImpl.handleBuilderException(th);
        }
        Object objInitSelectResult = unbiasedSelectBuilderImpl.initSelectResult();
        if (objInitSelectResult == kotlin.coroutines.intrinsics.a.e) {
            dVar.getClass();
        }
        return objInitSelectResult;
    }

    private static final <R> Object selectUnbiasedOld$$forInline(l lVar, d<? super R> dVar) {
        UnbiasedSelectBuilderImpl unbiasedSelectBuilderImpl = new UnbiasedSelectBuilderImpl(dVar);
        try {
            lVar.invoke(unbiasedSelectBuilderImpl);
        } catch (Throwable th) {
            unbiasedSelectBuilderImpl.handleBuilderException(th);
        }
        Object objInitSelectResult = unbiasedSelectBuilderImpl.initSelectResult();
        if (objInitSelectResult == kotlin.coroutines.intrinsics.a.e) {
            dVar.getClass();
        }
        return objInitSelectResult;
    }
}
