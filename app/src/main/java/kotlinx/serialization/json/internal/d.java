package kotlinx.serialization.json.internal;

import androidx.compose.foundation.gestures.z1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends z1 {
    public final boolean z;

    public d(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVar, boolean z) {
        super(lVar);
        this.z = z;
    }

    @Override // androidx.compose.foundation.gestures.z1
    public final void l(String str) {
        str.getClass();
        if (this.z) {
            super.l(str);
        } else {
            ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l) this.y).p(str);
        }
    }
}
