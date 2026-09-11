package androidx.compose.foundation.text;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {
    public final r0 a;
    public final androidx.compose.foundation.text.selection.c1 b;
    public final androidx.compose.ui.text.input.x c;
    public final boolean d;
    public final boolean e;
    public final androidx.compose.foundation.text.selection.i1 f;
    public final androidx.compose.ui.text.input.q g;
    public final l1 h;
    public final d0 i;
    public final k0 j;
    public final kotlin.jvm.functions.l k;
    public final int l;

    public b1(r0 r0Var, androidx.compose.foundation.text.selection.c1 c1Var, androidx.compose.ui.text.input.x xVar, boolean z, boolean z2, androidx.compose.foundation.text.selection.i1 i1Var, androidx.compose.ui.text.input.q qVar, l1 l1Var, d0 d0Var, kotlin.jvm.functions.l lVar, int i) {
        k0 k0Var = n0.a;
        this.a = r0Var;
        this.b = c1Var;
        this.c = xVar;
        this.d = z;
        this.e = z2;
        this.f = i1Var;
        this.g = qVar;
        this.h = l1Var;
        this.i = d0Var;
        this.j = k0Var;
        this.k = lVar;
        this.l = i;
    }

    public final void a(List list) {
        androidx.compose.foundation.text.input.internal.o oVar = this.a.d;
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(0, new androidx.compose.ui.text.input.i());
        this.k.invoke(oVar.j(arrayList));
    }
}
