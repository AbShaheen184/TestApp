package androidx.compose.ui.focus;

import androidx.collection.j0;
import androidx.collection.p0;
import androidx.collection.x0;
import androidx.compose.foundation.r0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public final p a;
    public final androidx.compose.ui.platform.u b;
    public final p0 c;
    public final p0 d;
    public boolean e;

    public i(p pVar, androidx.compose.ui.platform.u uVar) {
        this.a = pVar;
        this.b = uVar;
        p0 p0Var = x0.a;
        this.c = new p0();
        this.d = new p0();
    }

    public final void a() {
        if (this.e) {
            return;
        }
        r0 r0Var = new r0(0, this, i.class, "invalidateNodes", "invalidateNodes()V", 0, 2);
        j0 j0Var = this.b.U0;
        if (j0Var.g(r0Var) < 0) {
            j0Var.a(r0Var);
        }
        this.e = true;
    }
}
