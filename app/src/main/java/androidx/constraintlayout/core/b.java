package androidx.constraintlayout.core;

import androidx.appcompat.widget.c2;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class b {
    public final a d;
    public h a = null;
    public float b = 0.0f;
    public final ArrayList c = new ArrayList();
    public boolean e = false;

    public b(c2 c2Var) {
        this.d = new a(this, c2Var);
    }

    public final void a(c cVar, int i) {
        this.d.g(cVar.j(i), 1.0f);
        this.d.g(cVar.j(i), -1.0f);
    }

    public final void b(h hVar, h hVar2, h hVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        a aVar = this.d;
        if (z) {
            aVar.g(hVar, 1.0f);
            this.d.g(hVar2, -1.0f);
            this.d.g(hVar3, -1.0f);
        } else {
            aVar.g(hVar, -1.0f);
            this.d.g(hVar2, 1.0f);
            this.d.g(hVar3, 1.0f);
        }
    }

    public final void c(h hVar, h hVar2, h hVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        a aVar = this.d;
        if (z) {
            aVar.g(hVar, 1.0f);
            this.d.g(hVar2, -1.0f);
            this.d.g(hVar3, 1.0f);
        } else {
            aVar.g(hVar, -1.0f);
            this.d.g(hVar2, 1.0f);
            this.d.g(hVar3, -1.0f);
        }
    }

    public h d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.d.d() == 0;
    }

    public final h f(boolean[] zArr, h hVar) {
        int i;
        int iD = this.d.d();
        h hVar2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < iD; i2++) {
            float f2 = this.d.f(i2);
            if (f2 < 0.0f) {
                h hVarE = this.d.e(i2);
                if ((zArr == null || !zArr[hVarE.y]) && hVarE != hVar && (((i = hVarE.I) == 3 || i == 4) && f2 < f)) {
                    f = f2;
                    hVar2 = hVarE;
                }
            }
        }
        return hVar2;
    }

    public final void g(h hVar) {
        h hVar2 = this.a;
        if (hVar2 != null) {
            this.d.g(hVar2, -1.0f);
            this.a.z = -1;
            this.a = null;
        }
        float fH = this.d.h(hVar, true) * (-1.0f);
        this.a = hVar;
        if (fH == 1.0f) {
            return;
        }
        this.b /= fH;
        a aVar = this.d;
        int i = aVar.h;
        for (int i2 = 0; i != -1 && i2 < aVar.a; i2++) {
            float[] fArr = aVar.g;
            fArr[i] = fArr[i] / fH;
            i = aVar.f[i];
        }
    }

    public final void h(c cVar, h hVar, boolean z) {
        if (hVar.C) {
            float fC = this.d.c(hVar);
            this.b = (hVar.B * fC) + this.b;
            this.d.h(hVar, z);
            if (z) {
                hVar.d(this);
            }
            if (this.d.d() == 0) {
                this.e = true;
                cVar.a = true;
            }
        }
    }

    public void i(c cVar, b bVar, boolean z) {
        a aVar = this.d;
        aVar.getClass();
        float fC = aVar.c(bVar.a);
        aVar.h(bVar.a, z);
        a aVar2 = bVar.d;
        int iD = aVar2.d();
        for (int i = 0; i < iD; i++) {
            h hVarE = aVar2.e(i);
            aVar.a(hVarE, aVar2.c(hVarE) * fC, z);
        }
        this.b = (bVar.b * fC) + this.b;
        if (z) {
            bVar.a.d(this);
        }
        if (this.a == null || this.d.d() != 0) {
            return;
        }
        this.e = true;
        cVar.a = true;
    }

    public String toString() {
        boolean z;
        String strConcat = (this.a == null ? "0" : "" + this.a).concat(" = ");
        if (this.b != 0.0f) {
            StringBuilder sbN = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.n(strConcat);
            sbN.append(this.b);
            strConcat = sbN.toString();
            z = true;
        } else {
            z = false;
        }
        int iD = this.d.d();
        for (int i = 0; i < iD; i++) {
            h hVarE = this.d.e(i);
            if (hVarE != null) {
                float f = this.d.f(i);
                if (f != 0.0f) {
                    String string = hVarE.toString();
                    if (z) {
                        if (f > 0.0f) {
                            strConcat = g.c(strConcat, " + ");
                        } else {
                            strConcat = g.c(strConcat, " - ");
                            f *= -1.0f;
                        }
                    } else if (f < 0.0f) {
                        strConcat = g.c(strConcat, "- ");
                        f *= -1.0f;
                    }
                    strConcat = f == 1.0f ? g.c(strConcat, string) : strConcat + f + " " + string;
                    z = true;
                }
            }
        }
        return !z ? g.c(strConcat, "0.0") : strConcat;
    }
}
