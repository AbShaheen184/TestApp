package androidx.compose.foundation.lazy.layout;

import androidx.appcompat.widget.c2;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {
    public final kotlin.jvm.functions.l a;
    public b1 c;
    public int f;
    public final c2 b = new c2(1);
    public int d = -1;
    public int e = -1;

    public m0(kotlin.jvm.functions.l lVar) {
        this.a = lVar;
    }

    public final l0 a(int i, long j, boolean z, kotlin.jvm.functions.l lVar) {
        b1 b1Var = this.c;
        if (b1Var == null) {
            return i.a;
        }
        c1 c1Var = (c1) b1Var.A;
        boolean z2 = c1Var instanceof c;
        a1 a1Var = new a1(b1Var, i, this.b, lVar);
        a1Var.d = new androidx.compose.ui.unit.a(j);
        if (!z2) {
            c1Var.a(a1Var);
        } else if (z) {
            c cVar = (c) c1Var;
            cVar.y.add(new f1(1, a1Var));
            if (!cVar.z) {
                cVar.z = true;
                cVar.e.post(cVar);
            }
        } else {
            c cVar2 = (c) c1Var;
            cVar2.y.add(new f1(0, a1Var));
            if (!cVar2.z) {
                cVar2.z = true;
                cVar2.e.post(cVar2);
            }
        }
        androidx.compose.ui.platform.coreshims.b.C("compose:lazy:schedule_prefetch:index", i);
        return a1Var;
    }
}
