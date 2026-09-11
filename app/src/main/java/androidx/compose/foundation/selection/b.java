package androidx.compose.foundation.selection;

import androidx.compose.foundation.a1;
import androidx.compose.foundation.d1;
import androidx.compose.foundation.interaction.k;
import androidx.compose.runtime.m;
import androidx.compose.runtime.r;
import androidx.compose.ui.o;
import androidx.compose.ui.semantics.h;
import kotlin.jvm.functions.q;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements q {
    public final /* synthetic */ h A;
    public final /* synthetic */ kotlin.jvm.functions.a B;
    public final /* synthetic */ d1 e;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ boolean z;

    public b(d1 d1Var, boolean z, boolean z2, h hVar, kotlin.jvm.functions.a aVar) {
        this.e = d1Var;
        this.y = z;
        this.z = z2;
        this.A = hVar;
        this.B = aVar;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        r rVar = (r) obj2;
        ((Number) obj3).intValue();
        rVar.b0(-1525724089);
        Object objQ = rVar.Q();
        if (objQ == m.a) {
            objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
        }
        k kVar = (k) objQ;
        androidx.compose.ui.r rVarD = a1.a(o.b, kVar, this.e).d(new a(this.y, kVar, null, this.z, this.A, this.B));
        rVar.p(false);
        return rVarD;
    }
}
