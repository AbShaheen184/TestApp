package kotlinx.coroutines.internal;

import kotlin.coroutines.i;
import kotlin.jvm.functions.l;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class OnUndeliveredElementKt {
    public static final <E> void callUndeliveredElement(l lVar, E e, i iVar) {
        UndeliveredElementException undeliveredElementExceptionCallUndeliveredElementCatchingException = callUndeliveredElementCatchingException(lVar, e, null);
        if (undeliveredElementExceptionCallUndeliveredElementCatchingException != null) {
            CoroutineExceptionHandlerKt.handleCoroutineException(iVar, undeliveredElementExceptionCallUndeliveredElementCatchingException);
        }
    }

    public static final <E> UndeliveredElementException callUndeliveredElementCatchingException(l lVar, E e, UndeliveredElementException undeliveredElementException) {
        try {
            lVar.invoke(e);
            return undeliveredElementException;
        } catch (Throwable th) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th) {
                return new UndeliveredElementException(androidx.privacysandbox.ads.adservices.java.internal.a.o(e, "Exception in undelivered element handler for "), th);
            }
            kotlin.a.a(undeliveredElementException, th);
            return undeliveredElementException;
        }
    }

    public static /* synthetic */ UndeliveredElementException callUndeliveredElementCatchingException$default(l lVar, Object obj, UndeliveredElementException undeliveredElementException, int i, Object obj2) {
        if ((i & 2) != 0) {
            undeliveredElementException = null;
        }
        return callUndeliveredElementCatchingException(lVar, obj, undeliveredElementException);
    }
}
