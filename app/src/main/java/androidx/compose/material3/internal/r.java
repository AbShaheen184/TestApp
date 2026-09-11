package androidx.compose.material3.internal;

import androidx.compose.foundation.layout.m0;
import androidx.compose.material3.c2;
import androidx.compose.material3.n3;
import androidx.compose.runtime.y0;
import androidx.compose.ui.layout.q0;
import org.mozilla.javascript.ES6Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements kotlin.jvm.functions.p {
    public final /* synthetic */ androidx.compose.runtime.internal.f A;
    public final /* synthetic */ y0 e;
    public final /* synthetic */ n3 y;
    public final /* synthetic */ m0 z;

    public r(y0 y0Var, n3 n3Var, m0 m0Var, androidx.compose.runtime.internal.f fVar) {
        this.e = y0Var;
        this.y = n3Var;
        this.z = m0Var;
        this.A = fVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            androidx.compose.ui.r rVarK = androidx.compose.ui.layout.a0.k(androidx.compose.ui.o.b, "Container");
            q qVar = new q(this.e, y0.class, ES6Iterator.VALUE_PROPERTY, "getValue()Ljava/lang/Object;", 0);
            androidx.compose.ui.d dVarD = z.d(this.y);
            float f = c2.a;
            androidx.compose.ui.r rVarE = androidx.compose.ui.draw.h.e(rVarK, new androidx.compose.animation.core.a(9, qVar, this.z, dVarD));
            q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, true);
            int iHashCode = Long.hashCode(rVar.T);
            androidx.compose.runtime.internal.j jVarL = rVar.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar, rVarE);
            androidx.compose.ui.node.g.b.getClass();
            androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
            rVar.e0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.o0();
            }
            androidx.compose.runtime.s.x(rVar, q0VarD, androidx.compose.ui.node.f.e);
            androidx.compose.runtime.s.x(rVar, jVarL, androidx.compose.ui.node.f.d);
            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.f.f;
            if (rVar.S || !kotlin.jvm.internal.l.a(rVar.Q(), Integer.valueOf(iHashCode))) {
                androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode, rVar, iHashCode, eVar);
            }
            androidx.compose.runtime.s.x(rVar, rVarC, androidx.compose.ui.node.f.c);
            this.A.invoke(rVar, 0);
            rVar.p(true);
        } else {
            rVar.W();
        }
        return kotlin.y.a;
    }
}
