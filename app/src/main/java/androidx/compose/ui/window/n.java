package androidx.compose.ui.window;

import androidx.compose.runtime.y0;
import androidx.compose.ui.layout.q0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.m implements kotlin.jvm.functions.p {
    public final /* synthetic */ y0 A;
    public final /* synthetic */ int y;
    public final /* synthetic */ z z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(z zVar, y0 y0Var, int i) {
        super(2);
        this.y = i;
        this.z = zVar;
        this.A = y0Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        int i = this.y;
        kotlin.y yVar = kotlin.y.a;
        y0 y0Var = this.A;
        z zVar = this.z;
        int i2 = 0;
        switch (i) {
            case 0:
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    rVar.W();
                } else {
                    Object objQ = rVar.Q();
                    androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
                    if (objQ == fVar) {
                        objQ = d.C;
                        rVar.l0(objQ);
                    }
                    androidx.compose.ui.r rVarA = androidx.compose.ui.semantics.n.a(androidx.compose.ui.o.b, false, (kotlin.jvm.functions.l) objQ);
                    boolean zH = rVar.h(zVar);
                    Object objQ2 = rVar.Q();
                    if (zH || objQ2 == fVar) {
                        objQ2 = new k(zVar, 1);
                        rVar.l0(objQ2);
                    }
                    androidx.compose.ui.r rVarM = androidx.compose.ui.layout.a0.m(rVarA, (kotlin.jvm.functions.l) objQ2);
                    float f = zVar.getCanCalculatePosition() ? 1.0f : 0.0f;
                    if (f != 1.0f) {
                        rVarM = androidx.compose.ui.graphics.a0.q(rVarM, f, null, 520187);
                    }
                    androidx.compose.runtime.b0 b0Var = o.a;
                    kotlin.jvm.functions.p pVar = (kotlin.jvm.functions.p) y0Var.getValue();
                    Object objQ3 = rVar.Q();
                    if (objQ3 == fVar) {
                        objQ3 = f.c;
                        rVar.l0(objQ3);
                    }
                    q0 q0Var = (q0) objQ3;
                    int iHashCode = Long.hashCode(rVar.T);
                    androidx.compose.runtime.internal.j jVarL = rVar.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar, rVarM);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar2 = androidx.compose.ui.node.f.b;
                    rVar.e0();
                    if (rVar.S) {
                        rVar.k(yVar2);
                    } else {
                        rVar.o0();
                    }
                    androidx.compose.runtime.s.x(rVar, q0Var, androidx.compose.ui.node.f.e);
                    androidx.compose.runtime.s.x(rVar, jVarL, androidx.compose.ui.node.f.d);
                    androidx.compose.runtime.s.p(rVar, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
                    androidx.compose.runtime.s.t(rVar, androidx.compose.ui.node.f.g);
                    androidx.compose.runtime.s.x(rVar, rVarC, androidx.compose.ui.node.f.c);
                    pVar.invoke(rVar, 0);
                    rVar.p(true);
                }
                break;
            default:
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!rVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    rVar2.W();
                } else {
                    androidx.compose.runtime.s.a(o.b.a(Boolean.TRUE), androidx.compose.runtime.internal.k.c(1022273628, new n(zVar, y0Var, i2), rVar2), rVar2, 56);
                }
                break;
        }
        return yVar;
    }
}
