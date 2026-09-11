package androidx.compose.foundation.selection;

import androidx.activity.w;
import androidx.compose.foundation.d0;
import androidx.compose.foundation.interaction.k;
import androidx.compose.ui.autofill.n;
import androidx.compose.ui.semantics.h;
import androidx.compose.ui.semantics.t;
import androidx.compose.ui.semantics.v;
import androidx.compose.ui.semantics.x;
import kotlin.jvm.functions.l;
import kotlin.reflect.j;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends d0 {
    public boolean k0;
    public l l0;
    public final w m0;

    public g(boolean z, k kVar, boolean z2, h hVar, l lVar) {
        super(kVar, null, false, z2, null, hVar, new f(lVar, z, 0));
        this.k0 = z;
        this.l0 = lVar;
        this.m0 = new w(this, 7);
    }

    @Override // androidx.compose.foundation.j
    public final void O0(x xVar) {
        v.e(xVar, this.k0 ? androidx.compose.ui.state.a.e : androidx.compose.ui.state.a.y);
        androidx.compose.ui.semantics.w wVar = t.r;
        j[] jVarArr = v.a;
        j jVar = jVarArr[9];
        xVar.b(wVar, n.b);
        androidx.compose.ui.autofill.g gVarH = androidx.media3.common.audio.h.h(this.k0);
        if (gVarH != null) {
            androidx.compose.ui.semantics.w wVar2 = t.s;
            j jVar2 = jVarArr[10];
            xVar.b(wVar2, gVarH);
        }
        v.b(xVar, new androidx.activity.compose.g(xVar, 15));
    }
}
