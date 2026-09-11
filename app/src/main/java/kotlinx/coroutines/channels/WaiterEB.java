package kotlinx.coroutines.channels;

import kotlinx.coroutines.Waiter;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class WaiterEB {
    public final Waiter waiter;

    public WaiterEB(Waiter waiter) {
        this.waiter = waiter;
    }

    public String toString() {
        return "WaiterEB(" + this.waiter + ')';
    }
}
