package androidx.compose.foundation.lazy.layout;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends androidx.compose.ui.q implements androidx.compose.ui.node.m {
    public v L;

    @Override // androidx.compose.ui.q
    public final void D0() {
        this.L.getClass();
    }

    @Override // androidx.compose.ui.q
    public final void E0() {
        v vVar = this.L;
        vVar.d();
        vVar.b = null;
    }

    @Override // androidx.compose.ui.node.m
    public final void W(androidx.compose.ui.node.h0 h0Var) {
        ArrayList arrayList = this.L.h;
        if (arrayList.size() <= 0) {
            h0Var.b();
        } else {
            androidx.privacysandbox.ads.adservices.java.internal.a.C(arrayList.get(0));
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && kotlin.jvm.internal.l.a(this.L, ((t) obj).L);
    }

    public final int hashCode() {
        return this.L.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.L + ')';
    }
}
