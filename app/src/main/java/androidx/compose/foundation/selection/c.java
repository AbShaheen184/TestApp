package androidx.compose.foundation.selection;

import androidx.compose.foundation.a1;
import androidx.compose.foundation.interaction.k;
import androidx.compose.material3.v2;
import androidx.compose.ui.o;
import androidx.compose.ui.r;
import androidx.compose.ui.semantics.h;
import kotlin.jvm.functions.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final r a(r rVar, boolean z, k kVar, v2 v2Var, boolean z2, h hVar, kotlin.jvm.functions.a aVar) {
        r rVarD;
        if (v2Var != null) {
            rVarD = new a(z, kVar, v2Var, z2, hVar, aVar);
        } else if (v2Var == null) {
            rVarD = new a(z, kVar, null, z2, hVar, aVar);
        } else {
            o oVar = o.b;
            rVarD = kVar != null ? a1.a(oVar, kVar, v2Var).d(new a(z, kVar, null, z2, hVar, aVar)) : androidx.compose.ui.a.a(oVar, new b(v2Var, z, z2, hVar, aVar));
        }
        return rVar.d(rVarD);
    }

    public static final r b(r rVar, boolean z, k kVar, boolean z2, h hVar, l lVar) {
        return rVar.d(new e(z, kVar, z2, hVar, lVar));
    }
}
