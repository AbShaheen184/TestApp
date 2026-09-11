package androidx.compose.foundation.text;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 {
    public final androidx.compose.ui.text.j0 a;
    public androidx.compose.ui.layout.x b = null;
    public androidx.compose.ui.layout.x c;

    public k1(androidx.compose.ui.text.j0 j0Var, androidx.compose.ui.layout.x xVar) {
        this.a = j0Var;
        this.c = xVar;
    }

    public final long a(long j) {
        androidx.compose.ui.geometry.c cVarS;
        androidx.compose.ui.layout.x xVar = this.b;
        androidx.compose.ui.geometry.c cVar = androidx.compose.ui.geometry.c.e;
        if (xVar != null) {
            if (xVar.l()) {
                androidx.compose.ui.layout.x xVar2 = this.c;
                cVarS = xVar2 != null ? xVar2.s(xVar, true) : null;
            } else {
                cVarS = cVar;
            }
            if (cVarS != null) {
                cVar = cVarS;
            }
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float fIntBitsToFloat2 = cVar.a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            fIntBitsToFloat2 = cVar.c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat5 = cVar.b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
            fIntBitsToFloat5 = cVar.d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }

    public final int b(long j, boolean z) {
        if (z) {
            j = a(j);
        }
        return this.a.b.g(d(j));
    }

    public final boolean c(long j) {
        long jD = d(a(j));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jD));
        androidx.compose.ui.text.j0 j0Var = this.a;
        int iE = j0Var.b.e(fIntBitsToFloat);
        int i = (int) (jD >> 32);
        return Float.intBitsToFloat(i) >= j0Var.d(iE) && Float.intBitsToFloat(i) <= j0Var.e(iE);
    }

    public final long d(long j) {
        androidx.compose.ui.layout.x xVar;
        androidx.compose.ui.layout.x xVar2 = this.b;
        if (xVar2 == null) {
            return j;
        }
        if (!xVar2.l()) {
            xVar2 = null;
        }
        if (xVar2 == null || (xVar = this.c) == null) {
            return j;
        }
        androidx.compose.ui.layout.x xVar3 = xVar.l() ? xVar : null;
        return xVar3 == null ? j : xVar2.i(xVar3, j);
    }

    public final long e(long j) {
        androidx.compose.ui.layout.x xVar;
        androidx.compose.ui.layout.x xVar2 = this.b;
        if (xVar2 == null) {
            return j;
        }
        if (!xVar2.l()) {
            xVar2 = null;
        }
        if (xVar2 == null || (xVar = this.c) == null) {
            return j;
        }
        androidx.compose.ui.layout.x xVar3 = xVar.l() ? xVar : null;
        return xVar3 == null ? j : xVar3.i(xVar2, j);
    }
}
