package com.caverock.androidsvg;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n {
    public ArrayList a = null;
    public int b = 0;

    public final void a() {
        this.b += 1000;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            sb.append((o) it.next());
            sb.append(' ');
        }
        sb.append('[');
        return androidx.privacysandbox.ads.adservices.java.internal.a.s(sb, this.b, ']');
    }
}
