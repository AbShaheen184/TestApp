package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class FlowExceptions_commonKt {
    public static final int checkIndexOverflow(int i) {
        if (i >= 0) {
            return i;
        }
        throw new ArithmeticException("Index overflow has happened");
    }

    public static final void checkOwnership(AbortFlowException abortFlowException, Object obj) {
        if (abortFlowException.owner != obj) {
            throw abortFlowException;
        }
    }
}
