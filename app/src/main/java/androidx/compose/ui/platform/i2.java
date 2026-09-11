package androidx.compose.ui.platform;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i2 implements androidx.compose.ui.node.n1 {
    public final int e;
    public final List y;
    public Float z = null;
    public Float A = null;
    public androidx.compose.ui.semantics.i B = null;
    public androidx.compose.ui.semantics.i C = null;

    public i2(int i, ArrayList arrayList) {
        this.e = i;
        this.y = arrayList;
    }

    @Override // androidx.compose.ui.node.n1
    public final boolean p() {
        return this.y.contains(this);
    }
}
