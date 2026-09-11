package androidx.compose.ui.platform;

import android.view.View;
import com.app.mlounge.R;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d3 extends kotlin.jvm.internal.m implements kotlin.jvm.functions.p {
    public final /* synthetic */ kotlin.jvm.functions.p A;
    public final /* synthetic */ int y;
    public final /* synthetic */ e3 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d3(e3 e3Var, kotlin.jvm.functions.p pVar, int i) {
        super(2);
        this.y = i;
        this.z = e3Var;
        this.A = pVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.y) {
            case 0:
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    m0.a(this.z.e, this.A, rVar, 0);
                } else {
                    rVar.W();
                }
                break;
            default:
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (rVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e3 e3Var = this.z;
                    u uVar = e3Var.e;
                    Object tag = uVar.getTag(R.id.inspection_slot_table_set);
                    kotlin.coroutines.d dVar = null;
                    Set set = (!(tag instanceof Set) || ((tag instanceof kotlin.jvm.internal.markers.a) && !(tag instanceof kotlin.jvm.internal.markers.e))) ? null : (Set) tag;
                    if (set == null) {
                        Object parent = uVar.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                        set = (!(tag2 instanceof Set) || ((tag2 instanceof kotlin.jvm.internal.markers.a) && !(tag2 instanceof kotlin.jvm.internal.markers.e))) ? null : (Set) tag2;
                    }
                    if (set != null) {
                        set.add(rVar2.z());
                        rVar2.q = true;
                        rVar2.C = true;
                        rVar2.c.c();
                        rVar2.H.c();
                        androidx.compose.runtime.i2 i2Var = rVar2.I;
                        androidx.compose.runtime.f2 f2Var = i2Var.a;
                        i2Var.e = f2Var.G;
                        i2Var.f = f2Var.H;
                    }
                    boolean zH = rVar2.h(e3Var);
                    Object objQ = rVar2.Q();
                    androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
                    if (zH || objQ == fVar) {
                        objQ = new c3(e3Var, dVar, 0);
                        rVar2.l0(objQ);
                    }
                    androidx.compose.runtime.j0.c(rVar2, uVar, (kotlin.jvm.functions.p) objQ);
                    boolean zH2 = rVar2.h(e3Var);
                    Object objQ2 = rVar2.Q();
                    if (zH2 || objQ2 == fVar) {
                        objQ2 = new c3(e3Var, dVar, 1);
                        rVar2.l0(objQ2);
                    }
                    androidx.compose.runtime.j0.c(rVar2, uVar, (kotlin.jvm.functions.p) objQ2);
                    androidx.compose.runtime.s.a(androidx.compose.runtime.tooling.g.a.a(set), androidx.compose.runtime.internal.k.c(-280240369, new d3(e3Var, this.A, 0), rVar2), rVar2, 56);
                } else {
                    rVar2.W();
                }
                break;
        }
        return kotlin.y.a;
    }
}
