package androidx.compose.foundation.text.selection;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {
    public final androidx.compose.ui.text.g a;
    public final long b;
    public final androidx.compose.ui.text.j0 c;
    public final androidx.compose.ui.text.input.q d;
    public final i1 e;
    public long f;
    public final androidx.compose.ui.text.g g;
    public final androidx.compose.ui.text.input.x h;
    public final androidx.compose.foundation.text.k1 i;

    public t0(androidx.compose.ui.text.input.x xVar, androidx.compose.ui.text.input.q qVar, androidx.compose.foundation.text.k1 k1Var, i1 i1Var) {
        androidx.compose.ui.text.g gVar = xVar.a;
        long j = xVar.b;
        androidx.compose.ui.text.j0 j0Var = k1Var != null ? k1Var.a : null;
        this.a = gVar;
        this.b = j;
        this.c = j0Var;
        this.d = qVar;
        this.e = i1Var;
        this.f = j;
        this.g = gVar;
        this.h = xVar;
        this.i = k1Var;
    }

    public final List a(kotlin.jvm.functions.l lVar) {
        if (!androidx.compose.ui.text.l0.c(this.f)) {
            return com.google.common.base.c.q(new androidx.compose.ui.text.input.a("", 0), new androidx.compose.ui.text.input.w(androidx.compose.ui.text.l0.f(this.f), androidx.compose.ui.text.l0.f(this.f)));
        }
        androidx.compose.ui.text.input.g gVar = (androidx.compose.ui.text.input.g) lVar.invoke(this);
        if (gVar != null) {
            return com.google.common.base.c.p(gVar);
        }
        return null;
    }

    public final Integer b() {
        androidx.compose.ui.text.j0 j0Var = this.c;
        if (j0Var == null) {
            return null;
        }
        androidx.compose.ui.text.n nVar = j0Var.b;
        int iE = androidx.compose.ui.text.l0.e(this.f);
        androidx.compose.ui.text.input.q qVar = this.d;
        return Integer.valueOf(qVar.j(nVar.c(nVar.d(qVar.v(iE)), true)));
    }

    public final Integer c() {
        androidx.compose.ui.text.j0 j0Var = this.c;
        if (j0Var == null) {
            return null;
        }
        int iF = androidx.compose.ui.text.l0.f(this.f);
        androidx.compose.ui.text.input.q qVar = this.d;
        return Integer.valueOf(qVar.j(j0Var.f(j0Var.b.d(qVar.v(iF)))));
    }

    public final Integer d() {
        int length;
        androidx.compose.ui.text.j0 j0Var = this.c;
        if (j0Var == null) {
            return null;
        }
        int iR = r();
        while (true) {
            androidx.compose.ui.text.g gVar = this.a;
            if (iR < gVar.y.length()) {
                int length2 = this.g.y.length() - 1;
                if (iR <= length2) {
                    length2 = iR;
                }
                long jI = j0Var.i(length2);
                int i = androidx.compose.ui.text.l0.c;
                int i2 = (int) (jI & 4294967295L);
                if (i2 > iR) {
                    length = this.d.j(i2);
                    break;
                }
                iR++;
            } else {
                length = gVar.y.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer e() {
        int iJ;
        androidx.compose.ui.text.j0 j0Var = this.c;
        if (j0Var == null) {
            return null;
        }
        for (int iR = r(); iR > 0; iR--) {
            int length = this.g.y.length() - 1;
            if (iR <= length) {
                length = iR;
            }
            long jI = j0Var.i(length);
            int i = androidx.compose.ui.text.l0.c;
            int i2 = (int) (jI >> 32);
            if (i2 < iR) {
                iJ = this.d.j(i2);
                return Integer.valueOf(iJ);
            }
        }
        iJ = 0;
        return Integer.valueOf(iJ);
    }

    public final boolean f() {
        androidx.compose.ui.text.j0 j0Var = this.c;
        return (j0Var != null ? j0Var.g(r()) : null) != androidx.compose.ui.text.style.j.y;
    }

    public final int g(androidx.compose.ui.text.j0 j0Var, int i) {
        int iR = r();
        i1 i1Var = this.e;
        if (i1Var.a == null) {
            i1Var.a = Float.valueOf(j0Var.c(iR).a);
        }
        androidx.compose.ui.text.n nVar = j0Var.b;
        int iD = nVar.d(iR) + i;
        if (iD < 0) {
            return 0;
        }
        if (iD >= nVar.f) {
            return this.g.y.length();
        }
        float fB = nVar.b(iD) - 1;
        Float f = i1Var.a;
        f.getClass();
        float fFloatValue = f.floatValue();
        if ((f() && fFloatValue >= j0Var.e(iD)) || (!f() && fFloatValue <= j0Var.d(iD))) {
            return nVar.c(iD, true);
        }
        return this.d.j(nVar.g((((long) Float.floatToRawIntBits(fB)) & 4294967295L) | (Float.floatToRawIntBits(f.floatValue()) << 32)));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    public final int h(androidx.compose.foundation.text.k1 k1Var, int i) {
        androidx.compose.ui.geometry.c cVarS;
        androidx.compose.ui.layout.x xVar = k1Var.b;
        androidx.compose.ui.text.j0 j0Var = k1Var.a;
        if (xVar == null) {
            cVarS = androidx.compose.ui.geometry.c.e;
        } else {
            androidx.compose.ui.layout.x xVar2 = k1Var.c;
            cVarS = xVar2 != null ? xVar2.s(xVar, true) : null;
            if (cVarS == null) {
                cVarS = androidx.compose.ui.geometry.c.e;
            }
        }
        long j = this.h.b;
        int i2 = androidx.compose.ui.text.l0.c;
        int i3 = (int) (j & 4294967295L);
        androidx.compose.ui.text.input.q qVar = this.d;
        androidx.compose.ui.geometry.c cVarC = j0Var.c(qVar.v(i3));
        float f = cVarC.a;
        return qVar.j(j0Var.b.g((((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (cVarS.c() & 4294967295L)) * i) + cVarC.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)));
    }

    public final void i() {
        i1 i1Var = this.e;
        i1Var.a = null;
        androidx.compose.ui.text.g gVar = this.g;
        if (gVar.y.length() > 0) {
            if (f()) {
                k();
                return;
            }
            i1Var.a = null;
            if (gVar.y.length() > 0) {
                String str = gVar.y;
                long j = this.f;
                int i = androidx.compose.ui.text.l0.c;
                int iL = androidx.compose.foundation.text.n0.l((int) (j & 4294967295L), str);
                if (iL != -1) {
                    q(iL, iL);
                }
            }
        }
    }

    public final void j() {
        this.e.a = null;
        androidx.compose.ui.text.g gVar = this.g;
        String str = gVar.y;
        String str2 = gVar.y;
        if (str.length() > 0) {
            int iM = androidx.compose.foundation.text.n0.m(str2, androidx.compose.ui.text.l0.e(this.f));
            if (iM == androidx.compose.ui.text.l0.e(this.f) && iM != str2.length()) {
                iM = androidx.compose.foundation.text.n0.m(str2, iM + 1);
            }
            q(iM, iM);
        }
    }

    public final void k() {
        this.e.a = null;
        androidx.compose.ui.text.g gVar = this.g;
        if (gVar.y.length() > 0) {
            String str = gVar.y;
            long j = this.f;
            int i = androidx.compose.ui.text.l0.c;
            int iO = androidx.compose.foundation.text.n0.o((int) (j & 4294967295L), str);
            if (iO != -1) {
                q(iO, iO);
            }
        }
    }

    public final void l() {
        this.e.a = null;
        androidx.compose.ui.text.g gVar = this.g;
        String str = gVar.y;
        String str2 = gVar.y;
        if (str.length() > 0) {
            int iN = androidx.compose.foundation.text.n0.n(str2, androidx.compose.ui.text.l0.f(this.f));
            if (iN == androidx.compose.ui.text.l0.f(this.f) && iN != 0) {
                iN = androidx.compose.foundation.text.n0.n(str2, iN - 1);
            }
            q(iN, iN);
        }
    }

    public final void m() {
        i1 i1Var = this.e;
        i1Var.a = null;
        androidx.compose.ui.text.g gVar = this.g;
        if (gVar.y.length() > 0) {
            if (!f()) {
                k();
                return;
            }
            i1Var.a = null;
            if (gVar.y.length() > 0) {
                String str = gVar.y;
                long j = this.f;
                int i = androidx.compose.ui.text.l0.c;
                int iL = androidx.compose.foundation.text.n0.l((int) (j & 4294967295L), str);
                if (iL != -1) {
                    q(iL, iL);
                }
            }
        }
    }

    public final void n() {
        Integer numB;
        this.e.a = null;
        if (this.g.y.length() <= 0 || (numB = b()) == null) {
            return;
        }
        int iIntValue = numB.intValue();
        q(iIntValue, iIntValue);
    }

    public final void o() {
        Integer numC;
        this.e.a = null;
        if (this.g.y.length() <= 0 || (numC = c()) == null) {
            return;
        }
        int iIntValue = numC.intValue();
        q(iIntValue, iIntValue);
    }

    public final void p() {
        if (this.g.y.length() > 0) {
            int i = androidx.compose.ui.text.l0.c;
            this.f = androidx.compose.ui.text.d0.b((int) (this.b >> 32), (int) (this.f & 4294967295L));
        }
    }

    public final void q(int i, int i2) {
        this.f = androidx.compose.ui.text.d0.b(i, i2);
    }

    public final int r() {
        long j = this.f;
        int i = androidx.compose.ui.text.l0.c;
        return this.d.v((int) (j & 4294967295L));
    }
}
