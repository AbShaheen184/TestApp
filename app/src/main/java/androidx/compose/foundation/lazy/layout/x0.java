package androidx.compose.foundation.lazy.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x0 implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ androidx.compose.runtime.internal.f y;

    public /* synthetic */ x0(androidx.compose.runtime.internal.f fVar, int i, int i2) {
        this.e = i2;
        switch (i2) {
            case 1:
                float f = androidx.compose.material3.j.a;
                float f2 = androidx.compose.material3.j.a;
                break;
        }
        this.y = fVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        kotlin.y yVar = kotlin.y.a;
        androidx.compose.runtime.internal.f fVar = this.y;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                m.c(fVar, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(7));
                break;
            case 1:
                float f = androidx.compose.material3.j.a;
                float f2 = androidx.compose.material3.j.a;
                ((Integer) obj2).getClass();
                androidx.compose.material3.j.b(fVar, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(439));
                break;
            default:
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    rVar.W();
                } else {
                    androidx.compose.foundation.layout.v vVarA = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, rVar, 0);
                    int iHashCode = Long.hashCode(rVar.T);
                    androidx.compose.runtime.internal.j jVarL = rVar.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar, androidx.compose.ui.o.b);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar2 = androidx.compose.ui.node.f.b;
                    rVar.e0();
                    if (rVar.S) {
                        rVar.k(yVar2);
                    } else {
                        rVar.o0();
                    }
                    androidx.compose.runtime.s.x(rVar, vVarA, androidx.compose.ui.node.f.e);
                    androidx.compose.runtime.s.x(rVar, jVarL, androidx.compose.ui.node.f.d);
                    androidx.compose.runtime.s.p(rVar, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
                    androidx.compose.runtime.s.t(rVar, androidx.compose.ui.node.f.g);
                    androidx.compose.runtime.s.x(rVar, rVarC, androidx.compose.ui.node.f.c);
                    fVar.invoke(androidx.compose.foundation.layout.w.a, rVar, 6);
                    rVar.p(true);
                }
                break;
        }
        return yVar;
    }

    public /* synthetic */ x0(androidx.compose.runtime.internal.f fVar) {
        this.e = 2;
        this.y = fVar;
    }
}
