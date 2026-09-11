package androidx.compose.ui.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends b1 {
    public final /* synthetic */ int y;
    public final Object z;

    public /* synthetic */ n0(Object obj, int i) {
        this.y = i;
        this.z = obj;
    }

    @Override // androidx.compose.ui.unit.c
    public final float T() {
        switch (this.y) {
            case 0:
                return ((androidx.compose.ui.node.n0) this.z).T();
            default:
                return ((androidx.compose.ui.platform.u) this.z).getDensity().T();
        }
    }

    @Override // androidx.compose.ui.unit.c
    public final float a() {
        switch (this.y) {
            case 0:
                return ((androidx.compose.ui.node.n0) this.z).a();
            default:
                return ((androidx.compose.ui.platform.u) this.z).getDensity().a();
        }
    }

    @Override // androidx.compose.ui.layout.b1
    public float c(p pVar) {
        float fIntBitsToFloat;
        int iR;
        switch (this.y) {
            case 0:
                kotlin.jvm.functions.p pVar2 = pVar.a;
                if (pVar2 != null) {
                    return ((Number) pVar2.invoke(this, Float.valueOf(Float.NaN))).floatValue();
                }
                androidx.compose.ui.node.n0 n0Var = (androidx.compose.ui.node.n0) this.z;
                if (n0Var.H) {
                    return Float.NaN;
                }
                androidx.compose.ui.node.n0 n0Var2 = n0Var;
                while (true) {
                    androidx.appcompat.widget.o oVar = n0Var2.J;
                    float f = (oVar == null || (iR = kotlin.collections.n.R(pVar, (p[]) oVar.b)) < 0) ? Float.NaN : ((float[]) oVar.c)[iR];
                    if (!Float.isNaN(f)) {
                        n0Var2.m0(n0Var.A0(), pVar);
                        x xVarW0 = n0Var2.w0();
                        x xVarW1 = n0Var.w0();
                        switch (pVar.b) {
                            case 0:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (xVarW1.i(xVarW0, (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (((long) Float.floatToRawIntBits(((int) (xVarW0.u() >> 32)) / 2.0f)) << 32)) & 4294967295L));
                                break;
                            default:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (xVarW1.i(xVarW0, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(((int) (xVarW0.u() & 4294967295L)) / 2.0f)) & 4294967295L)) >> 32));
                                break;
                        }
                        return fIntBitsToFloat;
                    }
                    androidx.compose.ui.node.n0 n0VarC0 = n0Var2.C0();
                    if (n0VarC0 == null) {
                        n0Var2.m0(n0Var.A0(), pVar);
                        return Float.NaN;
                    }
                    n0Var2 = n0VarC0;
                }
                break;
            default:
                return super.c(pVar);
        }
    }

    @Override // androidx.compose.ui.layout.b1
    public final androidx.compose.ui.unit.m f() {
        switch (this.y) {
            case 0:
                return ((androidx.compose.ui.node.n0) this.z).getLayoutDirection();
            default:
                return ((androidx.compose.ui.platform.u) this.z).getLayoutDirection();
        }
    }

    @Override // androidx.compose.ui.layout.b1
    public final int g() {
        switch (this.y) {
            case 0:
                return ((androidx.compose.ui.node.n0) this.z).c0();
            default:
                return ((androidx.compose.ui.platform.u) this.z).getRoot().e0.p.e;
        }
    }
}
