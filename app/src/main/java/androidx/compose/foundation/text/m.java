package androidx.compose.foundation.text;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ androidx.compose.foundation.text.selection.c1 y;

    public /* synthetic */ m(androidx.compose.foundation.text.selection.c1 c1Var, int i) {
        this.e = i;
        this.y = c1Var;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0127  */
    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        androidx.compose.ui.geometry.c cVar;
        androidx.compose.ui.layout.x xVarC;
        char c;
        float fIntBitsToFloat;
        androidx.compose.ui.layout.x xVarC2;
        androidx.compose.ui.layout.x xVarC3;
        androidx.compose.ui.layout.x xVarC4;
        androidx.compose.ui.layout.x xVarC5;
        int i = this.e;
        androidx.compose.foundation.text.selection.c1 c1Var = this.y;
        switch (i) {
            case 0:
                return new androidx.activity.compose.d(c1Var, 4);
            case 1:
                c1Var.r();
                return kotlin.y.a;
            default:
                androidx.compose.ui.layout.x xVar = (androidx.compose.ui.layout.x) obj;
                r0 r0Var = c1Var.d;
                androidx.compose.ui.geometry.c cVar2 = androidx.compose.ui.geometry.c.e;
                if (r0Var == null) {
                    cVar = cVar2;
                } else {
                    if (r0Var.p) {
                        r0Var = null;
                    }
                    if (r0Var != null) {
                        androidx.compose.ui.text.input.q qVar = c1Var.b;
                        long j = c1Var.n().b;
                        int i2 = androidx.compose.ui.text.l0.c;
                        int iV = qVar.v((int) (j >> 32));
                        int iV2 = c1Var.b.v((int) (c1Var.n().b & 4294967295L));
                        r0 r0Var2 = c1Var.d;
                        long jW = 0;
                        long jW2 = (r0Var2 == null || (xVarC5 = r0Var2.c()) == null) ? 0L : xVarC5.W(c1Var.l(true));
                        r0 r0Var3 = c1Var.d;
                        if (r0Var3 != null && (xVarC4 = r0Var3.c()) != null) {
                            jW = xVarC4.W(c1Var.l(false));
                        }
                        r0 r0Var4 = c1Var.d;
                        float fIntBitsToFloat2 = 0.0f;
                        if (r0Var4 == null || (xVarC3 = r0Var4.c()) == null) {
                            c = ' ';
                            fIntBitsToFloat = 0.0f;
                        } else {
                            k1 k1VarD = r0Var.d();
                            c = ' ';
                            fIntBitsToFloat = Float.intBitsToFloat((int) (xVarC3.W((((long) Float.floatToRawIntBits(k1VarD != null ? k1VarD.a.c(iV).b : 0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32)) & 4294967295L));
                        }
                        r0 r0Var5 = c1Var.d;
                        if (r0Var5 != null && (xVarC2 = r0Var5.c()) != null) {
                            k1 k1VarD2 = r0Var.d();
                            fIntBitsToFloat2 = Float.intBitsToFloat((int) (xVarC2.W((((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(k1VarD2 != null ? k1VarD2.a.c(iV2).b : 0.0f)) & 4294967295L)) & 4294967295L));
                        }
                        int i3 = (int) (jW2 >> c);
                        int i4 = (int) (jW >> c);
                        cVar = new androidx.compose.ui.geometry.c(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), (r0Var.a.g.a() * 25) + Math.max(Float.intBitsToFloat((int) (jW2 & 4294967295L)), Float.intBitsToFloat((int) (jW & 4294967295L))));
                    } else {
                        cVar = cVar2;
                    }
                }
                r0 r0Var6 = c1Var.d;
                if (r0Var6 == null || (xVarC = r0Var6.c()) == null) {
                    return null;
                }
                return (xVarC.l() && xVar.l()) ? com.google.android.gms.dynamite.g.c(xVar.i(androidx.compose.ui.layout.a0.g(xVarC), cVar.d()), cVar.c()) : cVar2;
        }
    }
}
