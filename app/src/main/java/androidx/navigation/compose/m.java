package androidx.navigation.compose;

import androidx.compose.material3.y;
import androidx.compose.runtime.j0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements kotlin.jvm.functions.p {
    public final /* synthetic */ androidx.compose.runtime.snapshots.q A;
    public final /* synthetic */ n B;
    public final /* synthetic */ androidx.navigation.i e;
    public final /* synthetic */ o y;
    public final /* synthetic */ androidx.compose.runtime.saveable.d z;

    public m(androidx.navigation.i iVar, o oVar, androidx.compose.runtime.saveable.e eVar, androidx.compose.runtime.snapshots.q qVar, n nVar) {
        this.e = iVar;
        this.y = oVar;
        this.z = eVar;
        this.A = qVar;
        this.B = nVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && rVar.F()) {
            rVar.W();
        } else {
            androidx.navigation.i iVar = this.e;
            boolean zH = rVar.h(iVar);
            o oVar = this.y;
            boolean zH2 = zH | rVar.h(oVar);
            Object objQ = rVar.Q();
            if (zH2 || objQ == androidx.compose.runtime.m.a) {
                objQ = new androidx.compose.animation.core.a(13, this.A, iVar, oVar);
                rVar.l0(objQ);
            }
            j0.b(iVar, (kotlin.jvm.functions.l) objQ, rVar);
            android.support.v4.media.session.b.b(iVar, this.z, androidx.compose.runtime.internal.k.c(-497631156, new y(3, this.B, iVar), rVar), rVar, 384);
        }
        return kotlin.y.a;
    }
}
