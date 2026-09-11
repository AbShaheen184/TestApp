package org.jsoup.nodes;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends ArrayList {
    public boolean e;

    public i(int i) {
        super(i);
        this.e = true;
    }

    public final void b() {
        ((ArrayList) this).modCount++;
    }

    public final int c() {
        return ((ArrayList) this).modCount;
    }
}
