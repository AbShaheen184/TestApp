package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 implements kotlin.jvm.functions.p {
    public final /* synthetic */ androidx.compose.ui.r e;
    public final /* synthetic */ androidx.compose.foundation.b2 y;
    public final /* synthetic */ androidx.compose.runtime.internal.f z;

    public o1(androidx.compose.ui.r rVar, androidx.compose.foundation.b2 b2Var, androidx.compose.runtime.internal.f fVar) {
        this.e = rVar;
        this.y = b2Var;
        this.z = fVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            androidx.compose.ui.r rVarP = androidx.compose.foundation.s.p(androidx.compose.foundation.layout.b.t(androidx.compose.foundation.layout.b.q(this.e, 0.0f, q1.d, 1)), this.y, true);
            androidx.compose.foundation.layout.v vVarA = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, rVar, 0);
            int iHashCode = Long.hashCode(rVar.T);
            androidx.compose.runtime.internal.j jVarL = rVar.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar, rVarP);
            androidx.compose.ui.node.g.b.getClass();
            androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
            rVar.e0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.o0();
            }
            androidx.compose.runtime.s.x(rVar, vVarA, androidx.compose.ui.node.f.e);
            androidx.compose.runtime.s.x(rVar, jVarL, androidx.compose.ui.node.f.d);
            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.f.f;
            if (rVar.S || !kotlin.jvm.internal.l.a(rVar.Q(), Integer.valueOf(iHashCode))) {
                androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode, rVar, iHashCode, eVar);
            }
            androidx.compose.runtime.s.x(rVar, rVarC, androidx.compose.ui.node.f.c);
            this.z.invoke(androidx.compose.foundation.layout.w.a, rVar, 6);
            rVar.p(true);
        } else {
            rVar.W();
        }
        return kotlin.y.a;
    }
}
