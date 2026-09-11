package kotlinx.coroutines;

import kotlin.jvm.functions.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface CancelHandler extends NotCompleted {

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class UserSupplied implements CancelHandler {
        private final l handler;

        public UserSupplied(l lVar) {
            this.handler = lVar;
        }

        @Override // kotlinx.coroutines.CancelHandler
        public void invoke(Throwable th) {
            this.handler.invoke(th);
        }

        public String toString() {
            return "CancelHandler.UserSupplied[" + DebugStringsKt.getClassSimpleName(this.handler) + '@' + DebugStringsKt.getHexAddress(this) + ']';
        }
    }

    void invoke(Throwable th);
}
