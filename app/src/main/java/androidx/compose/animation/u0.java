package androidx.compose.animation;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends kotlin.jvm.internal.m implements kotlin.jvm.functions.l {
    public final /* synthetic */ long A;
    public final /* synthetic */ int y;
    public final /* synthetic */ w0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(w0 w0Var, long j, int i) {
        super(1);
        this.y = i;
        this.z = w0Var;
        this.A = j;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0067  */
    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        kotlin.jvm.functions.l lVar;
        kotlin.jvm.functions.l lVar2;
        long jB;
        int iOrdinal;
        switch (this.y) {
            case 0:
                int iOrdinal2 = ((m0) obj).ordinal();
                w0 w0Var = this.z;
                long j = this.A;
                if (iOrdinal2 == 0) {
                    k0 k0Var = w0Var.O.a.b;
                    if (k0Var != null && (lVar = k0Var.b) != null) {
                        j = ((androidx.compose.ui.unit.l) lVar.invoke(new androidx.compose.ui.unit.l(j))).a;
                    }
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        coil3.g.a();
                        return null;
                    }
                    k0 k0Var2 = w0Var.P.a.b;
                    if (k0Var2 != null && (lVar2 = k0Var2.b) != null) {
                        j = ((androidx.compose.ui.unit.l) lVar2.invoke(new androidx.compose.ui.unit.l(j))).a;
                    }
                }
                return new androidx.compose.ui.unit.l(j);
            default:
                m0 m0Var = (m0) obj;
                w0 w0Var2 = this.z;
                if (w0Var2.T == null || w0Var2.L0() == null || kotlin.jvm.internal.l.a(w0Var2.T, w0Var2.L0()) || (iOrdinal = m0Var.ordinal()) == 0 || iOrdinal == 1) {
                    jB = 0;
                } else {
                    if (iOrdinal != 2) {
                        coil3.g.a();
                        return null;
                    }
                    k0 k0Var3 = w0Var2.P.a.b;
                    if (k0Var3 != null) {
                        kotlin.jvm.functions.l lVar3 = k0Var3.b;
                        long j2 = this.A;
                        long j3 = ((androidx.compose.ui.unit.l) lVar3.invoke(new androidx.compose.ui.unit.l(j2))).a;
                        androidx.compose.ui.e eVarL0 = w0Var2.L0();
                        eVarL0.getClass();
                        androidx.compose.ui.unit.m mVar = androidx.compose.ui.unit.m.e;
                        long jA = eVarL0.a(j2, j3, mVar);
                        androidx.compose.ui.e eVar = w0Var2.T;
                        eVar.getClass();
                        jB = androidx.compose.ui.unit.j.b(jA, eVar.a(j2, j3, mVar));
                    } else {
                        jB = 0;
                    }
                }
                return new androidx.compose.ui.unit.j(jB);
        }
    }
}
