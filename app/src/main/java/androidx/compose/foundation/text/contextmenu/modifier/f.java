package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.ui.layout.x;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements androidx.compose.foundation.text.contextmenu.provider.e {
    public final long e;
    public final /* synthetic */ g y;

    public f(g gVar, long j) {
        this.y = gVar;
        this.e = j;
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.e
    public final androidx.compose.foundation.text.contextmenu.data.c M() {
        return h.b(this.y);
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.e
    public final androidx.compose.ui.geometry.c h0(x xVar) {
        return com.google.android.gms.dynamite.g.c(m0(xVar), 0L);
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.e
    public final long m0(x xVar) {
        x xVar2 = (x) this.y.O.getValue();
        if (xVar2 != null) {
            return xVar.i(xVar2, this.e);
        }
        androidx.compose.foundation.internal.b.d("Tried to open context menu before the anchor was placed.");
        com.google.gson.b.b();
        return 0L;
    }
}
