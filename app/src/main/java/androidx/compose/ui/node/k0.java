package androidx.compose.ui.node;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements androidx.compose.ui.unit.c {
    public final /* synthetic */ n0 A;
    public boolean e;
    public long y = 9223372034707292159L;
    public long z = 0;

    public k0(n0 n0Var) {
        this.A = n0Var;
    }

    @Override // androidx.compose.ui.unit.c
    public final float T() {
        return this.A.T();
    }

    @Override // androidx.compose.ui.unit.c
    public final float a() {
        return this.A.a();
    }

    public final void b(androidx.compose.ui.layout.p pVar, float f) {
        n0 n0Var = this.A;
        androidx.appcompat.widget.o oVar = n0Var.J;
        if (oVar == null) {
            oVar = new androidx.appcompat.widget.o();
            n0Var.J = oVar;
        }
        int iR = kotlin.collections.n.R(pVar, (androidx.compose.ui.layout.p[]) oVar.b);
        if (iR >= 0) {
            float[] fArr = (float[]) oVar.c;
            if (fArr[iR] != f) {
                fArr[iR] = f;
                ((byte[]) oVar.d)[iR] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) oVar.d;
                if (bArr[iR] == 2) {
                    bArr[iR] = 0;
                    return;
                }
                return;
            }
        }
        int i = oVar.a;
        androidx.compose.ui.layout.p[] pVarArr = (androidx.compose.ui.layout.p[]) oVar.b;
        if (i == pVarArr.length) {
            int i2 = i * 2;
            oVar.b = (androidx.compose.ui.layout.p[]) Arrays.copyOf(pVarArr, i2);
            oVar.c = Arrays.copyOf((float[]) oVar.c, i2);
            oVar.d = Arrays.copyOf((byte[]) oVar.d, i2);
        }
        ((androidx.compose.ui.layout.p[]) oVar.b)[i] = pVar;
        ((byte[]) oVar.d)[i] = 3;
        ((float[]) oVar.c)[i] = f;
        oVar.a++;
    }
}
