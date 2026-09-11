package kotlinx.coroutines;

import kotlin.coroutines.i;
import kotlin.jvm.functions.p;
import kotlinx.coroutines.internal.CoroutineExceptionHandlerImpl_commonKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class CoroutineExceptionHandlerKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class AnonymousClass1 extends kotlin.coroutines.a implements CoroutineExceptionHandler {
        final /* synthetic */ p $handler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(p pVar, CoroutineExceptionHandler.Key key) {
            super(key);
            this.$handler = pVar;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(i iVar, Throwable th) {
            this.$handler.invoke(iVar, th);
        }
    }

    public static final CoroutineExceptionHandler CoroutineExceptionHandler(p pVar) {
        return new AnonymousClass1(pVar, CoroutineExceptionHandler.Key);
    }

    @InternalCoroutinesApi
    public static final void handleCoroutineException(i iVar, Throwable th) {
        if (th instanceof DispatchException) {
            th = ((DispatchException) th).getCause();
        }
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) iVar.get(CoroutineExceptionHandler.Key);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(iVar, th);
            } else {
                CoroutineExceptionHandlerImpl_commonKt.handleUncaughtCoroutineException(iVar, th);
            }
        } catch (Throwable th2) {
            CoroutineExceptionHandlerImpl_commonKt.handleUncaughtCoroutineException(iVar, handlerException(th, th2));
        }
    }

    public static final Throwable handlerException(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        kotlin.a.a(runtimeException, th);
        return runtimeException;
    }
}
