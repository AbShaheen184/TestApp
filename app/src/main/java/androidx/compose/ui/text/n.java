package androidx.compose.ui.text;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import androidx.compose.ui.graphics.p0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n {
    public final androidx.compose.runtime.internal.c a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final ArrayList g;
    public final ArrayList h;

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public n(androidx.compose.runtime.internal.c cVar, long j, int i, int i2) {
        boolean z;
        int i3;
        int iG;
        int i4;
        this.a = cVar;
        this.b = i;
        if (androidx.compose.ui.unit.a.j(j) != 0 || androidx.compose.ui.unit.a.i(j) != 0) {
            androidx.compose.ui.text.internal.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) cVar.B;
        int size = arrayList2.size();
        float f = 0.0f;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i5 >= size) {
                z = false;
                break;
            }
            q qVar = (q) arrayList2.get(i5);
            androidx.compose.ui.text.platform.d dVar = qVar.a;
            int iH = androidx.compose.ui.unit.a.h(j);
            if (androidx.compose.ui.unit.a.c(j)) {
                i3 = i5;
                iG = androidx.compose.ui.unit.a.g(j) - ((int) Math.ceil(f));
                if (iG < 0) {
                    iG = 0;
                }
            } else {
                i3 = i5;
                iG = androidx.compose.ui.unit.a.g(j);
            }
            a aVar = new a(dVar, this.b - i6, i2, androidx.compose.ui.unit.b.b(iH, iG, 5));
            float fB = aVar.b() + f;
            androidx.compose.ui.text.android.l lVar = aVar.d;
            int i7 = i6 + lVar.g;
            arrayList.add(new p(aVar, qVar.b, qVar.c, i6, i7, f, fB));
            if (!lVar.d) {
                if (i7 == this.b) {
                    i4 = i3;
                    if (i4 != com.google.common.base.c.k((ArrayList) this.a.B)) {
                    }
                } else {
                    i4 = i3;
                }
                i5 = i4 + 1;
                i6 = i7;
                f = fB;
            }
            z = true;
            i6 = i7;
            f = fB;
            break;
        }
        this.e = f;
        this.f = i6;
        this.c = z;
        this.h = arrayList;
        this.d = androidx.compose.ui.unit.a.h(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i8 = 0; i8 < size2; i8++) {
            p pVar = (p) arrayList.get(i8);
            ?? r7 = pVar.a.f;
            ArrayList arrayList4 = new ArrayList(r7.size());
            int size3 = r7.size();
            for (int i9 = 0; i9 < size3; i9++) {
                androidx.compose.ui.geometry.c cVar2 = (androidx.compose.ui.geometry.c) r7.get(i9);
                arrayList4.add(cVar2 != null ? pVar.a(cVar2) : null);
            }
            kotlin.collections.o.C(arrayList3, arrayList4);
        }
        if (arrayList3.size() < ((List) this.a.z).size()) {
            int size4 = ((List) this.a.z).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i10 = 0; i10 < size4; i10++) {
                arrayList5.add(null);
            }
            arrayList3 = kotlin.collections.o.X(arrayList3, arrayList5);
        }
        this.g = arrayList3;
    }

    public static void i(n nVar, androidx.compose.ui.graphics.r rVar, androidx.compose.ui.graphics.p pVar, float f, androidx.compose.ui.graphics.m0 m0Var, androidx.compose.ui.text.style.l lVar, androidx.compose.ui.graphics.drawscope.e eVar) {
        rVar.f();
        ArrayList arrayList = nVar.h;
        if (arrayList.size() <= 1 || (pVar instanceof p0)) {
            androidx.compose.ui.text.platform.k.b(nVar, rVar, pVar, f, m0Var, lVar, eVar);
        } else {
            if (!(pVar instanceof androidx.compose.ui.graphics.l0)) {
                coil3.g.a();
                return;
            }
            int size = arrayList.size();
            float fMax = 0.0f;
            float fB = 0.0f;
            for (int i = 0; i < size; i++) {
                p pVar2 = (p) arrayList.get(i);
                fB += pVar2.a.b();
                fMax = Math.max(fMax, pVar2.a.d());
            }
            Shader shaderB = ((androidx.compose.ui.graphics.l0) pVar).b((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fB)) & 4294967295L));
            Matrix matrix = new Matrix();
            shaderB.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                a aVar = ((p) arrayList.get(i2)).a;
                aVar.g(rVar, new androidx.compose.ui.graphics.q(shaderB), f, m0Var, lVar, eVar);
                rVar.p(0.0f, aVar.b());
                matrix.setTranslate(0.0f, -aVar.b());
                shaderB.setLocalMatrix(matrix);
            }
        }
        rVar.q();
    }

    public final void a(long j, float[] fArr) {
        j(l0.f(j));
        k(l0.e(j));
        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
        xVar.e = 0;
        d0.g(this.h, j, new androidx.compose.foundation.x(j, fArr, xVar, new kotlin.jvm.internal.w()));
    }

    public final float b(int i) {
        l(i);
        ArrayList arrayList = this.h;
        p pVar = (p) arrayList.get(d0.e(i, arrayList));
        a aVar = pVar.a;
        return aVar.d.e(i - pVar.d) + pVar.f;
    }

    public final int c(int i, boolean z) {
        int iF;
        l(i);
        ArrayList arrayList = this.h;
        p pVar = (p) arrayList.get(d0.e(i, arrayList));
        a aVar = pVar.a;
        int i2 = i - pVar.d;
        androidx.compose.ui.text.android.l lVar = aVar.d;
        if (z) {
            Layout layout = lVar.f;
            ThreadLocal threadLocal = androidx.compose.ui.text.android.m.a;
            if (layout.getEllipsisCount(i2) <= 0 || lVar.b != TextUtils.TruncateAt.END) {
                androidx.compose.runtime.internal.c cVarC = lVar.c();
                Layout layout2 = (Layout) cVarC.e;
                iF = cVarC.A(layout2.getLineEnd(i2), layout2.getLineStart(i2));
            } else {
                iF = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else {
            iF = lVar.f(i2);
        }
        return iF + pVar.b;
    }

    public final int d(int i) {
        int iD;
        int length = ((g) this.a.y).y.length();
        ArrayList arrayList = this.h;
        if (i >= length) {
            iD = com.google.common.base.c.k(arrayList);
        } else {
            iD = i < 0 ? 0 : d0.d(i, arrayList);
        }
        p pVar = (p) arrayList.get(iD);
        return pVar.a.d.f.getLineForOffset(pVar.d(i)) + pVar.d;
    }

    public final int e(float f) {
        ArrayList arrayList = this.h;
        p pVar = (p) arrayList.get(d0.f(arrayList, f));
        int i = pVar.c - pVar.b;
        int i2 = pVar.d;
        if (i == 0) {
            return i2;
        }
        a aVar = pVar.a;
        float f2 = f - pVar.f;
        androidx.compose.ui.text.android.l lVar = aVar.d;
        return lVar.f.getLineForVertical(((int) f2) - lVar.h) + i2;
    }

    public final float f(int i) {
        l(i);
        ArrayList arrayList = this.h;
        p pVar = (p) arrayList.get(d0.e(i, arrayList));
        a aVar = pVar.a;
        return aVar.d.g(i - pVar.d) + pVar.f;
    }

    public final int g(long j) {
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.h;
        p pVar = (p) arrayList.get(d0.f(arrayList, fIntBitsToFloat));
        int i2 = pVar.c;
        int i3 = pVar.b;
        if (i2 - i3 == 0) {
            return i3;
        }
        a aVar = pVar.a;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i) - pVar.f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32);
        androidx.compose.ui.text.android.l lVar = aVar.d;
        int lineForVertical = lVar.f.getLineForVertical(((int) Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits))) - lVar.h);
        return lVar.f.getOffsetForHorizontal(lineForVertical, (lVar.b(lineForVertical) * (-1)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))) + i3;
    }

    public final long h(androidx.compose.ui.geometry.c cVar, int i, androidx.compose.ui.graphics.a aVar) {
        long jB;
        long j;
        float f = cVar.b;
        ArrayList arrayList = this.h;
        int iF = d0.f(arrayList, f);
        float f2 = ((p) arrayList.get(iF)).g;
        float f3 = cVar.d;
        if (f2 >= f3 || iF == com.google.common.base.c.k(arrayList)) {
            p pVar = (p) arrayList.get(iF);
            return pVar.b(pVar.a.c(pVar.c(cVar), i, aVar), true);
        }
        int iF2 = d0.f(arrayList, f3);
        long jB2 = l0.b;
        while (true) {
            jB = l0.b;
            if (!l0.b(jB2, jB) || iF > iF2) {
                break;
            }
            p pVar2 = (p) arrayList.get(iF);
            jB2 = pVar2.b(pVar2.a.c(pVar2.c(cVar), i, aVar), true);
            iF++;
        }
        if (l0.b(jB2, jB)) {
            return jB;
        }
        while (true) {
            j = l0.b;
            if (!l0.b(jB, j) || iF > iF2) {
                break;
            }
            p pVar3 = (p) arrayList.get(iF2);
            jB = pVar3.b(pVar3.a.c(pVar3.c(cVar), i, aVar), true);
            iF2--;
        }
        return l0.b(jB, j) ? jB2 : d0.b((int) (jB2 >> 32), (int) (4294967295L & jB));
    }

    public final void j(int i) {
        g gVar = (g) this.a.y;
        if (i < 0 || i >= gVar.y.length()) {
            StringBuilder sbV = androidx.privacysandbox.ads.adservices.java.internal.a.v("offset(", i, ") is out of bounds [0, ");
            sbV.append(gVar.y.length());
            sbV.append(')');
            androidx.compose.ui.text.internal.a.a(sbV.toString());
        }
    }

    public final void k(int i) {
        g gVar = (g) this.a.y;
        if (i < 0 || i > gVar.y.length()) {
            StringBuilder sbV = androidx.privacysandbox.ads.adservices.java.internal.a.v("offset(", i, ") is out of bounds [0, ");
            sbV.append(gVar.y.length());
            sbV.append(']');
            androidx.compose.ui.text.internal.a.a(sbV.toString());
        }
    }

    public final void l(int i) {
        boolean z = false;
        int i2 = this.f;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        androidx.compose.ui.text.internal.a.a("lineIndex(" + i + ") is out of bounds [0, " + i2 + ')');
    }
}
