package androidx.compose.foundation.text;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 {
    public final androidx.compose.ui.text.g a;
    public final androidx.compose.ui.text.m0 b;
    public final boolean e;
    public final androidx.compose.ui.unit.c g;
    public final androidx.compose.ui.text.font.d h;
    public androidx.compose.runtime.internal.c j;
    public androidx.compose.ui.unit.m k;
    public final int c = Integer.MAX_VALUE;
    public final int d = 1;
    public final int f = 1;
    public final List i = kotlin.collections.u.e;

    public w0(androidx.compose.ui.text.g gVar, androidx.compose.ui.text.m0 m0Var, boolean z, androidx.compose.ui.unit.c cVar, androidx.compose.ui.text.font.d dVar, int i) {
        this.a = gVar;
        this.b = m0Var;
        this.e = z;
        this.g = cVar;
        this.h = dVar;
    }

    public final void a(androidx.compose.ui.unit.m mVar) {
        androidx.compose.runtime.internal.c cVar = this.j;
        if (cVar == null || mVar != this.k || cVar.a()) {
            this.k = mVar;
            cVar = new androidx.compose.runtime.internal.c(this.a, androidx.compose.ui.text.d0.h(this.b, mVar), this.i, this.g, this.h);
        }
        this.j = cVar;
    }
}
