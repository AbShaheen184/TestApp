package androidx.constraintlayout.core;

import androidx.appcompat.widget.c2;
import androidx.compose.foundation.text.input.internal.o;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static boolean p = false;
    public static int q = 1000;
    public final f c;
    public b[] f;
    public final c2 l;
    public b o;
    public boolean a = false;
    public int b = 0;
    public int d = 32;
    public int e = 32;
    public boolean g = false;
    public boolean[] h = new boolean[32];
    public int i = 1;
    public int j = 0;
    public int k = 32;
    public h[] m = new h[q];
    public int n = 0;

    public c() {
        this.f = null;
        this.f = new b[32];
        s();
        c2 c2Var = new c2(11, false);
        c2Var.y = new d();
        c2Var.z = new d();
        c2Var.A = new h[32];
        this.l = c2Var;
        f fVar = new f(c2Var);
        fVar.f = new h[128];
        fVar.g = new h[128];
        fVar.h = 0;
        fVar.i = new o(fVar);
        this.c = fVar;
        this.o = new b(c2Var);
    }

    public static int n(Object obj) {
        h hVar = ((androidx.constraintlayout.core.widgets.c) obj).i;
        if (hVar != null) {
            return (int) (hVar.B + 0.5f);
        }
        return 0;
    }

    public final h a(int i) {
        d dVar = (d) this.l.z;
        int i2 = dVar.b;
        Object obj = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            Object[] objArr = dVar.a;
            Object obj2 = objArr[i3];
            objArr[i3] = null;
            dVar.b = i3;
            obj = obj2;
        }
        h hVar = (h) obj;
        if (hVar == null) {
            hVar = new h(i);
            hVar.I = i;
        } else {
            hVar.e();
            hVar.I = i;
        }
        int i4 = this.n;
        int i5 = q;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            q = i6;
            this.m = (h[]) Arrays.copyOf(this.m, i6);
        }
        h[] hVarArr = this.m;
        int i7 = this.n;
        this.n = i7 + 1;
        hVarArr[i7] = hVar;
        return hVar;
    }

    public final void b(h hVar, h hVar2, int i, float f, h hVar3, h hVar4, int i2, int i3) {
        b bVarL = l();
        if (hVar2 == hVar3) {
            bVarL.d.g(hVar, 1.0f);
            bVarL.d.g(hVar4, 1.0f);
            bVarL.d.g(hVar2, -2.0f);
        } else {
            a aVar = bVarL.d;
            if (f == 0.5f) {
                aVar.g(hVar, 1.0f);
                bVarL.d.g(hVar2, -1.0f);
                bVarL.d.g(hVar3, -1.0f);
                bVarL.d.g(hVar4, 1.0f);
                if (i > 0 || i2 > 0) {
                    bVarL.b = (-i) + i2;
                }
            } else if (f <= 0.0f) {
                aVar.g(hVar, -1.0f);
                bVarL.d.g(hVar2, 1.0f);
                bVarL.b = i;
            } else if (f >= 1.0f) {
                aVar.g(hVar4, -1.0f);
                bVarL.d.g(hVar3, 1.0f);
                bVarL.b = -i2;
            } else {
                float f2 = 1.0f - f;
                aVar.g(hVar, f2 * 1.0f);
                bVarL.d.g(hVar2, f2 * (-1.0f));
                bVarL.d.g(hVar3, (-1.0f) * f);
                bVarL.d.g(hVar4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    bVarL.b = (i2 * f) + ((-i) * f2);
                }
            }
        }
        if (i3 != 8) {
            bVarL.a(this, i3);
        }
        c(bVarL);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f8  */
    public final void c(b bVar) {
        boolean z;
        boolean z2;
        h hVarF;
        if (this.j + 1 >= this.k || this.i + 1 >= this.e) {
            o();
        }
        if (bVar.e) {
            z = false;
        } else {
            ArrayList arrayList = bVar.c;
            if (this.f.length != 0) {
                boolean z3 = false;
                while (!z3) {
                    int iD = bVar.d.d();
                    for (int i = 0; i < iD; i++) {
                        h hVarE = bVar.d.e(i);
                        if (hVarE.z != -1 || hVarE.C) {
                            arrayList.add(hVarE);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            h hVar = (h) arrayList.get(i2);
                            if (hVar.C) {
                                bVar.h(this, hVar, true);
                            } else {
                                bVar.i(this, this.f[hVar.z], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z3 = true;
                    }
                }
                if (bVar.a != null && bVar.d.d() == 0) {
                    bVar.e = true;
                    this.a = true;
                }
            }
            if (bVar.e()) {
                return;
            }
            float f = bVar.b;
            float f2 = 0.0f;
            if (f < 0.0f) {
                bVar.b = f * (-1.0f);
                a aVar = bVar.d;
                int i3 = aVar.h;
                for (int i4 = 0; i3 != -1 && i4 < aVar.a; i4++) {
                    float[] fArr = aVar.g;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = aVar.f[i3];
                }
            }
            int iD2 = bVar.d.d();
            float f3 = 0.0f;
            float f4 = 0.0f;
            h hVar2 = null;
            h hVar3 = null;
            int i5 = 0;
            boolean z4 = false;
            boolean z5 = false;
            while (i5 < iD2) {
                float f5 = bVar.d.f(i5);
                h hVarE2 = bVar.d.e(i5);
                float f6 = f2;
                if (hVarE2.I == 1) {
                    if (hVar2 == null) {
                        if (hVarE2.H <= 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        hVar2 = hVarE2;
                        f3 = f5;
                    } else {
                        if (f3 > f5) {
                            if (hVarE2.H > 1) {
                                z4 = false;
                            }
                            hVar2 = hVarE2;
                            f3 = f5;
                        } else if (z4 || hVarE2.H > 1) {
                        }
                        z4 = true;
                        hVar2 = hVarE2;
                        f3 = f5;
                    }
                } else if (hVar2 == null && f5 < f6) {
                    if (hVar3 == null) {
                        if (hVarE2.H <= 1) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        hVar3 = hVarE2;
                        f4 = f5;
                    } else {
                        if (f4 > f5) {
                            if (hVarE2.H > 1) {
                                z5 = false;
                            }
                            hVar3 = hVarE2;
                            f4 = f5;
                        } else if (z5 || hVarE2.H > 1) {
                        }
                        z5 = true;
                        hVar3 = hVarE2;
                        f4 = f5;
                    }
                }
                i5++;
                f2 = f6;
            }
            float f7 = f2;
            if (hVar2 == null) {
                hVar2 = hVar3;
            }
            if (hVar2 == null) {
                z2 = true;
            } else {
                bVar.g(hVar2);
                z2 = false;
            }
            if (bVar.d.d() == 0) {
                bVar.e = true;
            }
            if (z2) {
                if (this.i + 1 >= this.e) {
                    o();
                }
                h hVarA = a(3);
                int i6 = this.b + 1;
                this.b = i6;
                this.i++;
                hVarA.y = i6;
                c2 c2Var = this.l;
                ((h[]) c2Var.A)[i6] = hVarA;
                bVar.a = hVarA;
                int i7 = this.j;
                h(bVar);
                if (this.j == i7 + 1) {
                    b bVar2 = this.o;
                    bVar2.a = null;
                    bVar2.d.b();
                    for (int i8 = 0; i8 < bVar.d.d(); i8++) {
                        bVar2.d.a(bVar.d.e(i8), bVar.d.f(i8), true);
                    }
                    r(this.o);
                    if (hVarA.z == -1) {
                        if (bVar.a == hVarA && (hVarF = bVar.f(null, hVarA)) != null) {
                            bVar.g(hVarF);
                        }
                        if (!bVar.e) {
                            bVar.a.g(this, bVar);
                        }
                        ((d) c2Var.y).b(bVar);
                        this.j--;
                    }
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            h hVar4 = bVar.a;
            if (hVar4 == null) {
                return;
            }
            if (hVar4.I != 1 && bVar.b < f7) {
                return;
            }
        }
        if (z) {
            return;
        }
        h(bVar);
    }

    public final void d(h hVar, int i) {
        int i2 = hVar.z;
        if (i2 == -1) {
            hVar.f(this, i);
            for (int i3 = 0; i3 < this.b + 1; i3++) {
                h hVar2 = ((h[]) this.l.A)[i3];
            }
            return;
        }
        if (i2 == -1) {
            b bVarL = l();
            bVarL.a = hVar;
            float f = i;
            hVar.B = f;
            bVarL.b = f;
            bVarL.e = true;
            c(bVarL);
            return;
        }
        b bVar = this.f[i2];
        if (bVar.e) {
            bVar.b = i;
            return;
        }
        if (bVar.d.d() == 0) {
            bVar.e = true;
            bVar.b = i;
            return;
        }
        b bVarL2 = l();
        if (i < 0) {
            bVarL2.b = i * (-1);
            bVarL2.d.g(hVar, 1.0f);
        } else {
            bVarL2.b = i;
            bVarL2.d.g(hVar, -1.0f);
        }
        c(bVarL2);
    }

    public final void e(h hVar, h hVar2, int i, int i2) {
        if (i2 == 8 && hVar2.C && hVar.z == -1) {
            hVar.f(this, hVar2.B + i);
            return;
        }
        b bVarL = l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            bVarL.b = i;
        }
        a aVar = bVarL.d;
        if (z) {
            aVar.g(hVar, 1.0f);
            bVarL.d.g(hVar2, -1.0f);
        } else {
            aVar.g(hVar, -1.0f);
            bVarL.d.g(hVar2, 1.0f);
        }
        if (i2 != 8) {
            bVarL.a(this, i2);
        }
        c(bVarL);
    }

    public final void f(h hVar, h hVar2, int i, int i2) {
        b bVarL = l();
        h hVarM = m();
        hVarM.A = 0;
        bVarL.b(hVar, hVar2, hVarM, i);
        if (i2 != 8) {
            bVarL.d.g(j(i2), (int) (bVarL.d.c(hVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void g(h hVar, h hVar2, int i, int i2) {
        b bVarL = l();
        h hVarM = m();
        hVarM.A = 0;
        bVarL.c(hVar, hVar2, hVarM, i);
        if (i2 != 8) {
            bVarL.d.g(j(i2), (int) (bVarL.d.c(hVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void h(b bVar) {
        int i;
        if (bVar.e) {
            bVar.a.f(this, bVar.b);
        } else {
            b[] bVarArr = this.f;
            int i2 = this.j;
            bVarArr[i2] = bVar;
            h hVar = bVar.a;
            hVar.z = i2;
            this.j = i2 + 1;
            hVar.g(this, bVar);
        }
        if (this.a) {
            int i3 = 0;
            while (i3 < this.j) {
                if (this.f[i3] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f[i3];
                if (bVar2 != null && bVar2.e) {
                    bVar2.a.f(this, bVar2.b);
                    ((d) this.l.y).b(bVar2);
                    this.f[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.j;
                        if (i4 >= i) {
                            break;
                        }
                        b[] bVarArr2 = this.f;
                        int i6 = i4 - 1;
                        b bVar3 = bVarArr2[i4];
                        bVarArr2[i6] = bVar3;
                        h hVar2 = bVar3.a;
                        if (hVar2.z == i4) {
                            hVar2.z = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f[i5] = null;
                    }
                    this.j = i - 1;
                    i3--;
                }
                i3++;
            }
            this.a = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.j; i++) {
            b bVar = this.f[i];
            bVar.a.B = bVar.b;
        }
    }

    public final h j(int i) {
        if (this.i + 1 >= this.e) {
            o();
        }
        h hVarA = a(4);
        float[] fArr = hVarA.E;
        int i2 = this.b + 1;
        this.b = i2;
        this.i++;
        hVarA.y = i2;
        hVarA.A = i;
        ((h[]) this.l.A)[i2] = hVarA;
        f fVar = this.c;
        fVar.i.y = hVarA;
        Arrays.fill(fArr, 0.0f);
        fArr[hVarA.A] = 1.0f;
        fVar.j(hVarA);
        return hVarA;
    }

    public final h k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.e) {
            o();
        }
        if (!(obj instanceof androidx.constraintlayout.core.widgets.c)) {
            return null;
        }
        androidx.constraintlayout.core.widgets.c cVar = (androidx.constraintlayout.core.widgets.c) obj;
        h hVar = cVar.i;
        if (hVar == null) {
            cVar.k();
            hVar = cVar.i;
        }
        int i = hVar.y;
        c2 c2Var = this.l;
        if (i != -1 && i <= this.b && ((h[]) c2Var.A)[i] != null) {
            return hVar;
        }
        if (i != -1) {
            hVar.e();
        }
        int i2 = this.b + 1;
        this.b = i2;
        this.i++;
        hVar.y = i2;
        hVar.I = 1;
        ((h[]) c2Var.A)[i2] = hVar;
        return hVar;
    }

    public final b l() {
        Object obj;
        c2 c2Var = this.l;
        d dVar = (d) c2Var.y;
        int i = dVar.b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = dVar.a;
            obj = objArr[i2];
            objArr[i2] = null;
            dVar.b = i2;
        } else {
            obj = null;
        }
        b bVar = (b) obj;
        if (bVar == null) {
            return new b(c2Var);
        }
        bVar.a = null;
        bVar.d.b();
        bVar.b = 0.0f;
        bVar.e = false;
        return bVar;
    }

    public final h m() {
        if (this.i + 1 >= this.e) {
            o();
        }
        h hVarA = a(3);
        int i = this.b + 1;
        this.b = i;
        this.i++;
        hVarA.y = i;
        ((h[]) this.l.A)[i] = hVarA;
        return hVarA;
    }

    public final void o() {
        int i = this.d * 2;
        this.d = i;
        this.f = (b[]) Arrays.copyOf(this.f, i);
        c2 c2Var = this.l;
        c2Var.A = (h[]) Arrays.copyOf((h[]) c2Var.A, this.d);
        int i2 = this.d;
        this.h = new boolean[i2];
        this.e = i2;
        this.k = i2;
    }

    public final void p() {
        f fVar = this.c;
        if (fVar.e()) {
            i();
            return;
        }
        if (!this.g) {
            q(fVar);
            return;
        }
        for (int i = 0; i < this.j; i++) {
            if (!this.f[i].e) {
                q(fVar);
                return;
            }
        }
        i();
    }

    public final void q(f fVar) {
        for (int i = 0; i < this.j; i++) {
            b bVar = this.f[i];
            int i2 = 1;
            if (bVar.a.I != 1) {
                float f = 0.0f;
                if (bVar.b < 0.0f) {
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        i3 += i2;
                        float f2 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.j) {
                            b bVar2 = this.f[i6];
                            if (bVar2.a.I != i2 && !bVar2.e && bVar2.b < f) {
                                int iD = bVar2.d.d();
                                int i8 = 0;
                                while (i8 < iD) {
                                    h hVarE = bVar2.d.e(i8);
                                    float fC = bVar2.d.c(hVarE);
                                    if (fC > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = hVarE.D[i9] / fC;
                                            if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = hVarE.y;
                                                i4 = i6;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i6++;
                            f = 0.0f;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            b bVar3 = this.f[i4];
                            bVar3.a.z = -1;
                            bVar3.g(((h[]) this.l.A)[i5]);
                            h hVar = bVar3.a;
                            hVar.z = i4;
                            hVar.g(this, bVar3);
                        } else {
                            z = true;
                        }
                        if (i3 > this.i / 2) {
                            z = true;
                        }
                        f = 0.0f;
                        i2 = 1;
                    }
                    break;
                }
            }
        }
        r(fVar);
        i();
    }

    public final void r(b bVar) {
        boolean z;
        int i = 0;
        for (int i2 = 0; i2 < this.i; i2++) {
            this.h[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            int i4 = 1;
            i3++;
            if (i3 >= this.i * 2) {
                return;
            }
            h hVar = bVar.a;
            if (hVar != null) {
                this.h[hVar.y] = true;
            }
            h hVarD = bVar.d(this.h);
            if (hVarD != null) {
                boolean[] zArr = this.h;
                int i5 = hVarD.y;
                if (zArr[i5]) {
                    return;
                } else {
                    zArr[i5] = true;
                }
            }
            if (hVarD != null) {
                float f = Float.MAX_VALUE;
                int i6 = i;
                int i7 = -1;
                while (i6 < this.j) {
                    b bVar2 = this.f[i6];
                    if (bVar2.a.I != i4 && !bVar2.e) {
                        a aVar = bVar2.d;
                        int i8 = aVar.h;
                        if (i8 == -1) {
                            z = false;
                            break;
                        }
                        int i9 = 0;
                        while (true) {
                            if (i8 == -1 || i9 >= aVar.a) {
                                z = false;
                                break;
                            } else if (aVar.e[i8] == hVarD.y) {
                                z = true;
                                break;
                            } else {
                                i8 = aVar.f[i8];
                                i9++;
                            }
                        }
                        if (z) {
                            float fC = bVar2.d.c(hVarD);
                            if (fC < 0.0f) {
                                float f2 = (-bVar2.b) / fC;
                                if (f2 < f) {
                                    f = f2;
                                    i7 = i6;
                                }
                            }
                        }
                    }
                    i6++;
                    i4 = 1;
                }
                if (i7 > -1) {
                    b bVar3 = this.f[i7];
                    bVar3.a.z = -1;
                    bVar3.g(hVarD);
                    h hVar2 = bVar3.a;
                    hVar2.z = i7;
                    hVar2.g(this, bVar3);
                }
            } else {
                z2 = true;
            }
            i = 0;
        }
    }

    public final void s() {
        for (int i = 0; i < this.j; i++) {
            b bVar = this.f[i];
            if (bVar != null) {
                ((d) this.l.y).b(bVar);
            }
            this.f[i] = null;
        }
    }

    public final void t() {
        c2 c2Var;
        int i = 0;
        while (true) {
            c2Var = this.l;
            h[] hVarArr = (h[]) c2Var.A;
            if (i >= hVarArr.length) {
                break;
            }
            h hVar = hVarArr[i];
            if (hVar != null) {
                hVar.e();
            }
            i++;
        }
        d dVar = (d) c2Var.z;
        h[] hVarArr2 = this.m;
        int length = this.n;
        dVar.getClass();
        if (length > hVarArr2.length) {
            length = hVarArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            h hVar2 = hVarArr2[i2];
            int i3 = dVar.b;
            Object[] objArr = dVar.a;
            if (i3 < objArr.length) {
                objArr[i3] = hVar2;
                dVar.b = i3 + 1;
            }
        }
        this.n = 0;
        Arrays.fill((h[]) c2Var.A, (Object) null);
        this.b = 0;
        f fVar = this.c;
        fVar.h = 0;
        fVar.b = 0.0f;
        this.i = 1;
        for (int i4 = 0; i4 < this.j; i4++) {
            b bVar = this.f[i4];
        }
        s();
        this.j = 0;
        this.o = new b(c2Var);
    }
}
