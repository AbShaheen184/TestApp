package com.google.common.base;

import androidx.compose.ui.platform.t1;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements Iterable {
    public final /* synthetic */ String e;
    public final /* synthetic */ t1 y;

    public r(t1 t1Var, String str) {
        this.e = str;
        this.y = t1Var;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        t1 t1Var = this.y;
        return ((s) t1Var.e).a(t1Var, this.e);
    }

    public final String toString() {
        androidx.media3.container.a aVar = new androidx.media3.container.a(", ");
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        aVar.b(sb, iterator());
        sb.append(']');
        return sb.toString();
    }
}
