package androidx.compose.material3;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c3 implements kotlin.jvm.functions.p {
    public final /* synthetic */ float A;
    public final /* synthetic */ androidx.compose.foundation.a0 B;
    public final /* synthetic */ float C;
    public final /* synthetic */ androidx.compose.runtime.internal.f D;
    public final /* synthetic */ androidx.compose.ui.r e;
    public final /* synthetic */ androidx.compose.ui.graphics.n0 y;
    public final /* synthetic */ long z;

    public c3(androidx.compose.ui.r rVar, androidx.compose.ui.graphics.n0 n0Var, long j, float f, androidx.compose.foundation.a0 a0Var, float f2, androidx.compose.runtime.internal.f fVar) {
        this.e = rVar;
        this.y = n0Var;
        this.z = j;
        this.A = f;
        this.B = a0Var;
        this.C = f2;
        this.D = fVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
        int iIntValue = ((Number) obj2).intValue();
        boolean zT = rVar.T(iIntValue & 1, (iIntValue & 3) != 2);
        kotlin.y yVar = kotlin.y.a;
        if (!zT) {
            rVar.W();
            return yVar;
        }
        androidx.compose.ui.r rVarC = f3.c(this.e, this.y, f3.d(this.z, this.A, rVar), this.B, ((androidx.compose.ui.unit.c) rVar.j(androidx.compose.ui.platform.l1.h)).V(this.C));
        Object objQ = rVar.Q();
        androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
        if (objQ == fVar) {
            objQ = new androidx.compose.foundation.lazy.i(24);
            rVar.l0(objQ);
        }
        androidx.compose.ui.r rVarA = androidx.compose.ui.semantics.n.a(rVarC, false, (kotlin.jvm.functions.l) objQ);
        Object objQ2 = rVar.Q();
        if (objQ2 == fVar) {
            objQ2 = b3.a;
            rVar.l0(objQ2);
        }
        androidx.compose.ui.r rVarA2 = androidx.compose.ui.input.pointer.h0.a(rVarA, yVar, (PointerInputEventHandler) objQ2);
        androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, true);
        int iHashCode = Long.hashCode(rVar.T);
        androidx.compose.runtime.internal.j jVarL = rVar.l();
        androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar, rVarA2);
        androidx.compose.ui.node.g.b.getClass();
        androidx.compose.ui.node.y yVar2 = androidx.compose.ui.node.f.b;
        rVar.e0();
        if (rVar.S) {
            rVar.k(yVar2);
        } else {
            rVar.o0();
        }
        androidx.compose.runtime.s.x(rVar, q0VarD, androidx.compose.ui.node.f.e);
        androidx.compose.runtime.s.x(rVar, jVarL, androidx.compose.ui.node.f.d);
        androidx.compose.ui.node.e eVar = androidx.compose.ui.node.f.f;
        if (rVar.S || !kotlin.jvm.internal.l.a(rVar.Q(), Integer.valueOf(iHashCode))) {
            androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode, rVar, iHashCode, eVar);
        }
        androidx.compose.runtime.s.x(rVar, rVarC2, androidx.compose.ui.node.f.c);
        this.D.invoke(rVar, 0);
        rVar.p(true);
        return yVar;
    }
}
