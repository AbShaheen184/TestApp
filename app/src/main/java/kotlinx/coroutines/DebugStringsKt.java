package kotlinx.coroutines;

import kotlin.coroutines.d;
import kotlin.l;
import kotlin.m;
import kotlinx.coroutines.internal.DispatchedContinuation;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class DebugStringsKt {
    public static final String getClassSimpleName(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String getHexAddress(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String toDebugString(d<?> dVar) {
        Object lVar;
        if (dVar instanceof DispatchedContinuation) {
            return ((DispatchedContinuation) dVar).toString();
        }
        try {
            lVar = dVar + '@' + getHexAddress(dVar);
        } catch (Throwable th) {
            lVar = new l(th);
        }
        if (m.a(lVar) != null) {
            lVar = dVar.getClass().getName() + '@' + getHexAddress(dVar);
        }
        return (String) lVar;
    }
}
