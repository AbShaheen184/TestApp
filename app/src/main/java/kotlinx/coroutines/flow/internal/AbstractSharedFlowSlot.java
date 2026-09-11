package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.d;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractSharedFlowSlot<F> {
    public abstract boolean allocateLocked(F f);

    public abstract d<y>[] freeLocked(F f);
}
