package androidx.compose.foundation.contextmenu;

import androidx.compose.runtime.q1;
import androidx.compose.runtime.r;
import androidx.compose.runtime.snapshots.q;
import kotlin.jvm.functions.p;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public final q a = new q();

    public static void b(g gVar, p pVar, androidx.compose.runtime.internal.f fVar, kotlin.jvm.functions.a aVar, int i) {
        if ((i & 8) != 0) {
            fVar = null;
        }
        gVar.a.add(new androidx.compose.runtime.internal.f(-1789283891, true, new e(pVar, gVar, fVar, aVar)));
    }

    public final void a(d dVar, r rVar, int i) {
        rVar.c0(-798501095);
        int i2 = (rVar.f(dVar) ? 4 : 2) | i | (rVar.f(this) ? 32 : 16);
        if (rVar.T(i2 & 1, (i2 & 19) != 18)) {
            q qVar = this.a;
            int size = qVar.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((kotlin.jvm.functions.q) qVar.get(i3)).invoke(dVar, rVar, Integer.valueOf(i2 & 14));
            }
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new f(this, dVar, i, 0);
        }
    }
}
