package androidx.compose.ui.text;

import android.graphics.RectF;
import android.text.Layout;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {
    public final i0 a;
    public final n b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    public j0(i0 i0Var, n nVar, long j) {
        this.a = i0Var;
        this.b = nVar;
        this.c = j;
        ArrayList arrayList = nVar.h;
        float fD = 0.0f;
        this.d = arrayList.isEmpty() ? 0.0f : ((p) arrayList.get(0)).a.d.d(0);
        if (!arrayList.isEmpty()) {
            p pVar = (p) kotlin.collections.o.S(arrayList);
            androidx.compose.ui.text.android.l lVar = pVar.a.d;
            fD = lVar.d(lVar.g - 1) + pVar.f;
        }
        this.e = fD;
        this.f = nVar.g;
    }

    public final androidx.compose.ui.text.style.j a(int i) {
        n nVar = this.b;
        nVar.k(i);
        int length = ((g) nVar.a.y).y.length();
        ArrayList arrayList = nVar.h;
        p pVar = (p) arrayList.get(i == length ? com.google.common.base.c.k(arrayList) : d0.d(i, arrayList));
        return pVar.a.d.f.isRtlCharAt(pVar.d(i)) ? androidx.compose.ui.text.style.j.y : androidx.compose.ui.text.style.j.e;
    }

    public final androidx.compose.ui.geometry.c b(int i) {
        float fI;
        float fI2;
        float fH;
        float fH2;
        n nVar = this.b;
        nVar.j(i);
        ArrayList arrayList = nVar.h;
        p pVar = (p) arrayList.get(d0.d(i, arrayList));
        a aVar = pVar.a;
        int iD = pVar.d(i);
        CharSequence charSequence = aVar.e;
        if (iD < 0 || iD >= charSequence.length()) {
            StringBuilder sbV = androidx.privacysandbox.ads.adservices.java.internal.a.v("offset(", iD, ") is out of bounds [0,");
            sbV.append(charSequence.length());
            sbV.append(')');
            androidx.compose.ui.text.internal.a.a(sbV.toString());
        }
        androidx.compose.ui.text.android.l lVar = aVar.d;
        Layout layout = lVar.f;
        int lineForOffset = layout.getLineForOffset(iD);
        float fG = lVar.g(lineForOffset);
        float fE = lVar.e(lineForOffset);
        boolean z = layout.getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iD);
        if (!z || zIsRtlCharAt) {
            if (z && zIsRtlCharAt) {
                fH = lVar.i(iD, false);
                fH2 = lVar.i(iD + 1, true);
            } else if (zIsRtlCharAt) {
                fH = lVar.h(iD, false);
                fH2 = lVar.h(iD + 1, true);
            } else {
                fI = lVar.i(iD, false);
                fI2 = lVar.i(iD + 1, true);
            }
            float f = fH;
            fI = fH2;
            fI2 = f;
        } else {
            fI = lVar.h(iD, false);
            fI2 = lVar.h(iD + 1, true);
        }
        RectF rectF = new RectF(fI, fG, fI2, fE);
        return pVar.a(new androidx.compose.ui.geometry.c(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final androidx.compose.ui.geometry.c c(int i) {
        n nVar = this.b;
        nVar.k(i);
        int length = ((g) nVar.a.y).y.length();
        ArrayList arrayList = nVar.h;
        p pVar = (p) arrayList.get(i == length ? com.google.common.base.c.k(arrayList) : d0.d(i, arrayList));
        a aVar = pVar.a;
        int iD = pVar.d(i);
        CharSequence charSequence = aVar.e;
        androidx.compose.ui.text.android.l lVar = aVar.d;
        if (iD < 0 || iD > charSequence.length()) {
            StringBuilder sbV = androidx.privacysandbox.ads.adservices.java.internal.a.v("offset(", iD, ") is out of bounds [0,");
            sbV.append(charSequence.length());
            sbV.append(']');
            androidx.compose.ui.text.internal.a.a(sbV.toString());
        }
        float fH = lVar.h(iD, false);
        int lineForOffset = lVar.f.getLineForOffset(iD);
        return pVar.a(new androidx.compose.ui.geometry.c(fH, lVar.g(lineForOffset), fH, lVar.e(lineForOffset)));
    }

    public final float d(int i) {
        n nVar = this.b;
        nVar.l(i);
        ArrayList arrayList = nVar.h;
        p pVar = (p) arrayList.get(d0.e(i, arrayList));
        a aVar = pVar.a;
        int i2 = i - pVar.d;
        androidx.compose.ui.text.android.l lVar = aVar.d;
        return lVar.f.getLineLeft(i2) + (i2 == lVar.g + (-1) ? lVar.j : 0.0f);
    }

    public final float e(int i) {
        n nVar = this.b;
        nVar.l(i);
        ArrayList arrayList = nVar.h;
        p pVar = (p) arrayList.get(d0.e(i, arrayList));
        a aVar = pVar.a;
        int i2 = i - pVar.d;
        androidx.compose.ui.text.android.l lVar = aVar.d;
        return lVar.f.getLineRight(i2) + (i2 == lVar.g + (-1) ? lVar.k : 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return kotlin.jvm.internal.l.a(this.a, j0Var.a) && this.b.equals(j0Var.b) && androidx.compose.ui.unit.l.a(this.c, j0Var.c) && this.d == j0Var.d && this.e == j0Var.e && kotlin.jvm.internal.l.a(this.f, j0Var.f);
    }

    public final int f(int i) {
        n nVar = this.b;
        nVar.l(i);
        ArrayList arrayList = nVar.h;
        p pVar = (p) arrayList.get(d0.e(i, arrayList));
        a aVar = pVar.a;
        return aVar.d.f.getLineStart(i - pVar.d) + pVar.b;
    }

    public final androidx.compose.ui.text.style.j g(int i) {
        n nVar = this.b;
        nVar.k(i);
        int length = ((g) nVar.a.y).y.length();
        ArrayList arrayList = nVar.h;
        p pVar = (p) arrayList.get(i == length ? com.google.common.base.c.k(arrayList) : d0.d(i, arrayList));
        a aVar = pVar.a;
        int iD = pVar.d(i);
        androidx.compose.ui.text.android.l lVar = aVar.d;
        return lVar.f.getParagraphDirection(lVar.f.getLineForOffset(iD)) == 1 ? androidx.compose.ui.text.style.j.e : androidx.compose.ui.text.style.j.y;
    }

    public final androidx.compose.ui.graphics.j h(int i, int i2) {
        n nVar = this.b;
        g gVar = (g) nVar.a.y;
        if (i < 0 || i > i2 || i2 > gVar.y.length()) {
            StringBuilder sbW = androidx.privacysandbox.ads.adservices.java.internal.a.w("Start(", ") or End(", i, ") is out of range [0..", i2);
            sbW.append(gVar.y.length());
            sbW.append("), or start > end!");
            androidx.compose.ui.text.internal.a.a(sbW.toString());
        }
        if (i == i2) {
            return androidx.compose.ui.graphics.l.a();
        }
        androidx.compose.ui.graphics.j jVarA = androidx.compose.ui.graphics.l.a();
        d0.g(nVar.h, d0.b(i, i2), new androidx.compose.foundation.layout.n0(i, i2, 2, jVarA));
        return jVarA;
    }

    public final int hashCode() {
        return this.f.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.a(this.e, androidx.privacysandbox.ads.adservices.java.internal.a.a(this.d, androidx.privacysandbox.ads.adservices.java.internal.a.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31), 31);
    }

    public final long i(int i) {
        int iN;
        int iA;
        int iA2;
        n nVar = this.b;
        nVar.k(i);
        int length = ((g) nVar.a.y).y.length();
        ArrayList arrayList = nVar.h;
        p pVar = (p) arrayList.get(i == length ? com.google.common.base.c.k(arrayList) : d0.d(i, arrayList));
        a aVar = pVar.a;
        int iD = pVar.d(i);
        androidx.compose.ui.text.android.selection.e eVarJ = aVar.d.j();
        if (eVarJ.y(eVarJ.N(iD))) {
            eVarJ.i(iD);
            iN = iD;
            while (iN != -1 && (!eVarJ.y(iN) || eVarJ.u(iN))) {
                iN = eVarJ.N(iN);
            }
        } else {
            eVarJ.i(iD);
            if (eVarJ.x(iD)) {
                iN = (!eVarJ.v(iD) || eVarJ.t(iD)) ? eVarJ.N(iD) : iD;
            } else {
                iN = eVarJ.t(iD) ? eVarJ.N(iD) : -1;
            }
        }
        if (iN == -1) {
            iN = iD;
        }
        if (eVarJ.u(eVarJ.A(iD))) {
            eVarJ.i(iD);
            iA = iD;
            while (iA != -1 && (eVarJ.y(iA) || !eVarJ.u(iA))) {
                iA = eVarJ.A(iA);
            }
        } else {
            eVarJ.i(iD);
            if (eVarJ.t(iD)) {
                if (!eVarJ.v(iD) || eVarJ.x(iD)) {
                    iA2 = eVarJ.A(iD);
                    iA = iA2;
                } else {
                    iA = iD;
                }
            } else if (eVarJ.x(iD)) {
                iA2 = eVarJ.A(iD);
                iA = iA2;
            } else {
                iA = -1;
            }
        }
        if (iA != -1) {
            iD = iA;
        }
        return pVar.b(d0.b(iN, iD), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + ((Object) androidx.compose.ui.unit.l.b(this.c)) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ')';
    }
}
