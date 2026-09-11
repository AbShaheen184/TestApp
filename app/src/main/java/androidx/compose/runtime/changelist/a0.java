package androidx.compose.runtime.changelist;

import androidx.compose.runtime.i2;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends j0 {
    public static final a0 c = new a0(0, 0, 3);

    @Override // androidx.compose.runtime.changelist.j0
    public final void a(androidx.compose.foundation.text.selection.w wVar, androidx.compose.runtime.c cVar, i2 i2Var, androidx.compose.runtime.internal.l lVar, k0 k0Var) {
        if (i2Var.n != 0) {
            androidx.compose.runtime.t.a("Cannot reset when inserting");
        }
        i2Var.G();
        i2Var.t = 0;
        i2Var.u = i2Var.o() - i2Var.h;
        i2Var.i = 0;
        i2Var.j = 0;
        i2Var.o = 0;
    }
}
