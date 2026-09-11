package com.caverock.androidsvg;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements e {
    public List a;

    @Override // com.caverock.androidsvg.e
    public final boolean a(x0 x0Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (androidx.media3.common.audio.e.g((n) it.next(), x0Var)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return coil3.compose.internal.f.f(new StringBuilder("not("), this.a, ")");
    }
}
