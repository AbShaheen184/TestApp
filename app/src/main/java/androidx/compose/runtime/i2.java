package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i2 {
    public final f2 a;
    public int[] b;
    public Object[] c;
    public ArrayList d;
    public HashMap e;
    public androidx.collection.z f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final o0 p;
    public final o0 q;
    public final o0 r;
    public androidx.collection.z s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public androidx.collection.y x;

    public i2(f2 f2Var) {
        this.a = f2Var;
        int[] iArr = f2Var.e;
        this.b = iArr;
        Object[] objArr = f2Var.z;
        this.c = objArr;
        this.d = f2Var.F;
        this.e = f2Var.G;
        this.f = f2Var.H;
        int i = f2Var.y;
        this.g = i;
        this.h = (iArr.length / 5) - i;
        int i2 = f2Var.A;
        this.k = i2;
        this.l = objArr.length - i2;
        this.m = i;
        this.p = new o0();
        this.q = new o0();
        this.r = new o0();
        this.u = i;
        this.v = -1;
    }

    public static int i(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public static void z(i2 i2Var) {
        int i = i2Var.v;
        int iR = i2Var.r(i);
        int[] iArr = i2Var.b;
        int i2 = (iR * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | 134217728;
        iArr[i2] = i4;
        if ((67108864 & i4) != 0) {
            return;
        }
        i2Var.T(i2Var.E(i, iArr));
    }

    public final void A(f2 f2Var, int i) {
        if (this.n <= 0) {
            t.a("Check failed");
        }
        boolean z = false;
        byte b = 0;
        byte b2 = 0;
        if (i == 0 && this.t == 0 && this.a.y == 0) {
            int[] iArr = f2Var.e;
            int i2 = iArr[(i * 5) + 3];
            int i3 = f2Var.y;
            if (i2 == i3) {
                int[] iArr2 = this.b;
                Object[] objArr = this.c;
                ArrayList arrayList = this.d;
                HashMap map = this.e;
                androidx.collection.z zVar = this.f;
                Object[] objArr2 = f2Var.z;
                int i4 = f2Var.A;
                HashMap map2 = f2Var.G;
                androidx.collection.z zVar2 = f2Var.H;
                this.b = iArr;
                this.c = objArr2;
                this.d = f2Var.F;
                this.g = i3;
                this.h = (iArr.length / 5) - i3;
                this.k = i4;
                this.l = objArr2.length - i4;
                this.m = i3;
                this.e = map2;
                this.f = zVar2;
                f2Var.e = iArr2;
                f2Var.y = b2 == true ? 1 : 0;
                f2Var.z = objArr;
                f2Var.A = b == true ? 1 : 0;
                f2Var.F = arrayList;
                f2Var.G = map;
                f2Var.H = zVar;
                return;
            }
        }
        i2 i2VarE = f2Var.e();
        try {
            s.q(i2VarE, i, this, true, true, false);
            boolean z2 = true;
        } finally {
            i2VarE.e(z);
        }
    }

    public final void B(int i) {
        a aVar;
        int i2;
        a aVar2;
        int i3;
        int i4;
        int i5 = this.h;
        int i6 = this.g;
        if (i6 != i) {
            if (!this.d.isEmpty()) {
                int iO = o() - this.h;
                ArrayList arrayList = this.d;
                if (i6 < i) {
                    for (int iA = h2.a(arrayList, i6, iO); iA < this.d.size() && (i3 = (aVar2 = (a) this.d.get(iA)).a) < 0 && (i4 = i3 + iO) < i; iA++) {
                        aVar2.a = i4;
                    }
                } else {
                    for (int iA2 = h2.a(arrayList, i, iO); iA2 < this.d.size() && (i2 = (aVar = (a) this.d.get(iA2)).a) >= 0; iA2++) {
                        aVar.a = -(iO - i2);
                    }
                }
            }
            if (i5 > 0) {
                int[] iArr = this.b;
                int i7 = i * 5;
                int i8 = i5 * 5;
                int i9 = i6 * 5;
                if (i < i6) {
                    kotlin.collections.n.C(i8 + i7, i7, i9, iArr, iArr);
                } else {
                    kotlin.collections.n.C(i9, i9 + i8, i7 + i8, iArr, iArr);
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int iO2 = o();
            if (i6 >= iO2) {
                t.a("Check failed");
            }
            while (i6 < iO2) {
                int i10 = (i6 * 5) + 2;
                int i11 = this.b[i10];
                int iP = i11 > -2 ? i11 : (p() + i11) - (-2);
                if (iP >= i) {
                    iP = -((p() - iP) - (-2));
                }
                if (iP != i11) {
                    this.b[i10] = iP;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.g = i;
    }

    public final void C(int i, int i2) {
        int i3 = this.l;
        int i4 = this.k;
        int i5 = this.m;
        if (i4 != i) {
            Object[] objArr = this.c;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int iMin = Math.min(i2 + 1, p());
        if (i5 != iMin) {
            int length = this.c.length - i3;
            if (iMin < i5) {
                int iR = r(iMin);
                int iR2 = r(i5);
                int i7 = this.g;
                while (iR < iR2) {
                    int i8 = (iR * 5) + 4;
                    int i9 = this.b[i8];
                    if (i9 < 0) {
                        t.a("Unexpected anchor value, expected a positive anchor");
                    }
                    this.b[i8] = -((length - i9) + 1);
                    iR++;
                    if (iR == i7) {
                        iR += this.h;
                    }
                }
            } else {
                int iR3 = r(i5);
                int iR4 = r(iMin);
                while (iR3 < iR4) {
                    int i10 = (iR3 * 5) + 4;
                    int i11 = this.b[i10];
                    if (i11 >= 0) {
                        t.a("Unexpected anchor value, expected a negative anchor");
                    }
                    this.b[i10] = i11 + length + 1;
                    iR3++;
                    if (iR3 == this.g) {
                        iR3 += this.h;
                    }
                }
            }
            this.m = iMin;
        }
        this.k = i;
    }

    public final Object D(int i) {
        int iR = r(i);
        int[] iArr = this.b;
        if ((iArr[(iR * 5) + 1] & 1073741824) != 0) {
            return this.c[h(g(iR, iArr))];
        }
        return null;
    }

    public final int E(int i, int[] iArr) {
        int i2 = iArr[(r(i) * 5) + 2];
        return i2 > -2 ? i2 : (p() + i2) - (-2);
    }

    public final Object F(Object obj) {
        if (this.n > 0) {
            x(1, this.v);
        }
        Object[] objArr = this.c;
        int i = this.i;
        this.i = i + 1;
        Object obj2 = objArr[h(i)];
        if (this.i > this.j) {
            t.a("Writing to an invalid slot");
        }
        this.c[h(this.i - 1)] = obj;
        return obj2;
    }

    public final void G() {
        int i;
        androidx.collection.y yVar = this.x;
        if (yVar != null) {
            while (yVar.b != 0) {
                int iZ = s.z(yVar);
                int iR = r(iZ);
                int iU = iZ + 1;
                int iU2 = u(iZ) + iZ;
                while (true) {
                    if (iU >= iU2) {
                        i = 0;
                        break;
                    } else {
                        if ((this.b[(r(iU) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        iU += u(iU);
                    }
                }
                int[] iArr = this.b;
                int i2 = (iR * 5) + 1;
                int i3 = iArr[i2];
                if (((67108864 & i3) != 0 ? 1 : 0) != i) {
                    iArr[i2] = (i << 26) | ((-67108865) & i3);
                    int iE = E(iZ, iArr);
                    if (iE >= 0) {
                        s.d(yVar, iE);
                    }
                }
            }
        }
    }

    public final boolean H() {
        if (this.n != 0) {
            t.a("Cannot remove group while inserting");
        }
        int i = this.t;
        int i2 = this.i;
        int iG = g(r(i), this.b);
        int iL = L();
        O(this.v);
        androidx.collection.y yVar = this.x;
        if (yVar != null) {
            while (true) {
                int i3 = yVar.b;
                if (i3 == 0) {
                    break;
                }
                if (i3 == 0) {
                    androidx.transition.k.m("IntList is empty.");
                    return false;
                }
                if (yVar.a[0] < i) {
                    break;
                }
                s.z(yVar);
            }
        }
        boolean zI = I(i, this.t - i);
        J(iG, this.i - iG, i - 1);
        this.t = i;
        this.i = i2;
        this.o -= iL;
        return zI;
    }

    public final boolean I(int i, int i2) {
        boolean z = false;
        if (i2 > 0) {
            ArrayList arrayList = this.d;
            B(i);
            if (!arrayList.isEmpty()) {
                HashMap map = this.e;
                int i3 = i + i2;
                int iA = h2.a(this.d, i3, o() - this.h);
                if (iA >= this.d.size()) {
                    iA--;
                }
                int i4 = iA + 1;
                int i5 = 0;
                while (iA >= 0) {
                    a aVar = (a) this.d.get(iA);
                    int iC = c(aVar);
                    if (iC < i) {
                        break;
                    }
                    if (iC < i3) {
                        aVar.a = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i5 == 0) {
                            i5 = iA + 1;
                        }
                        i4 = iA;
                    }
                    iA--;
                }
                z = i4 < i5;
                if (z) {
                    this.d.subList(i4, i5).clear();
                }
            }
            this.g = i;
            this.h += i2;
            int i6 = this.m;
            if (i6 > i) {
                this.m = Math.max(i, i6 - i2);
            }
            int i7 = this.u;
            if (i7 >= this.g) {
                this.u = i7 - i2;
            }
            int i8 = this.v;
            if (i8 >= 0 && (this.b[(r(i8) * 5) + 1] & 67108864) != 0) {
                T(i8);
            }
        }
        return z;
    }

    public final void J(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.l;
            int i5 = i + i2;
            C(i5, i3);
            this.k = i;
            this.l = i4 + i2;
            Arrays.fill(this.c, i, i5, (Object) null);
            int i6 = this.j;
            if (i6 >= i) {
                this.j = i6 - i2;
            }
        }
    }

    public final Object K(int i, int i2, Object obj) {
        int iN = N(r(i), this.b);
        int iG = g(r(i + 1), this.b);
        int i3 = iN + i2;
        if (i3 < iN || i3 >= iG) {
            t.a("Write to an invalid slot index " + i2 + " for group " + i);
        }
        int iH = h(i3);
        Object[] objArr = this.c;
        Object obj2 = objArr[iH];
        objArr[iH] = obj;
        return obj2;
    }

    public final int L() {
        int iR = r(this.t);
        int i = this.t;
        int[] iArr = this.b;
        int i2 = iR * 5;
        int i3 = iArr[i2 + 3] + i;
        this.t = i3;
        this.i = g(r(i3), iArr);
        int i4 = this.b[i2 + 1];
        if ((1073741824 & i4) != 0) {
            return 1;
        }
        return i4 & 67108863;
    }

    public final void M() {
        int i = this.u;
        this.t = i;
        this.i = g(r(i), this.b);
    }

    public final int N(int i, int[] iArr) {
        if (i >= o()) {
            return this.c.length - this.l;
        }
        int iB = h2.b(i, iArr);
        return iB < 0 ? (this.c.length - this.l) + iB + 1 : iB;
    }

    public final n0 O(int i) {
        a aVarR;
        HashMap map = this.e;
        if (map == null || (aVarR = R(i)) == null) {
            return null;
        }
        return (n0) map.get(aVarR);
    }

    public final void P() {
        if (this.n != 0) {
            t.a("Key must be supplied when inserting");
        }
        f fVar = m.a;
        Q(0, fVar, fVar, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(int i, Object obj, Object obj2, boolean z) {
        int i2;
        int i3 = this.v;
        byte b = this.n > 0;
        this.r.c(this.o);
        f fVar = m.a;
        if (b == true) {
            int i4 = this.t;
            int iG = g(r(i4), this.b);
            w(1);
            this.i = iG;
            this.j = iG;
            int iR = r(i4);
            int i5 = obj != fVar ? 1 : 0;
            int i6 = (z || obj2 == fVar) ? 0 : 1;
            int i7 = i(iG, this.k, this.l, this.c.length);
            if (i7 >= 0 && this.m < i4) {
                i7 = -(((this.c.length - this.l) - i7) + 1);
            }
            int[] iArr = this.b;
            int i8 = this.v;
            int i9 = iR * 5;
            iArr[i9] = i;
            iArr[i9 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i9 + 2] = i8;
            iArr[i9 + 3] = 0;
            iArr[i9 + 4] = i7;
            int i10 = (z ? 1 : 0) + i5 + i6;
            if (i10 > 0) {
                x(i10, i4);
                Object[] objArr = this.c;
                int i11 = this.i;
                if (z) {
                    objArr[i11] = obj2;
                    i11++;
                }
                if (i5 != 0) {
                    objArr[i11] = obj;
                    i11++;
                }
                if (i6 != 0) {
                    objArr[i11] = obj2;
                    i11++;
                }
                this.i = i11;
            }
            this.o = 0;
            i2 = i4 + 1;
            this.v = i4;
            this.t = i2;
            if (i3 >= 0) {
                O(i3);
            }
        } else {
            this.p.c(i3);
            this.q.c((o() - this.h) - this.u);
            int i12 = this.t;
            int iR2 = r(i12);
            if (!kotlin.jvm.internal.l.a(obj2, fVar)) {
                if (z) {
                    U(this.t, obj2);
                } else {
                    S(obj2);
                }
            }
            this.i = N(iR2, this.b);
            this.j = g(r(this.t + 1), this.b);
            int[] iArr2 = this.b;
            int i13 = iR2 * 5;
            this.o = iArr2[i13 + 1] & 67108863;
            this.v = i12;
            this.t = i12 + 1;
            i2 = i12 + iArr2[i13 + 3];
        }
        this.u = i2;
    }

    public final a R(int i) {
        ArrayList arrayList;
        int iD;
        if (i < 0 || i >= p() || (iD = h2.d((arrayList = this.d), i, p())) < 0) {
            return null;
        }
        return (a) arrayList.get(iD);
    }

    public final void S(Object obj) {
        int iR = r(this.t);
        int i = (iR * 5) + 1;
        if ((this.b[i] & 268435456) == 0) {
            t.a("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.c;
        int[] iArr = this.b;
        objArr[h(Integer.bitCount(iArr[i] >> 29) + g(iR, iArr))] = obj;
    }

    public final void T(int i) {
        if (i >= 0) {
            androidx.collection.y yVar = this.x;
            if (yVar == null) {
                yVar = new androidx.collection.y();
                this.x = yVar;
            }
            s.d(yVar, i);
        }
    }

    public final void U(int i, Object obj) {
        int iR = r(i);
        int[] iArr = this.b;
        if (iR >= iArr.length || (iArr[(iR * 5) + 1] & 1073741824) == 0) {
            t.a("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.c[h(g(iR, this.b))] = obj;
    }

    public final void a(int i) {
        if (i < 0) {
            t.a("Cannot seek backwards");
        }
        if (this.n > 0) {
            n1.b("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.t + i;
        if (i2 < this.v || i2 > this.u) {
            t.a("Cannot seek outside the current group (" + this.v + '-' + this.u + ')');
        }
        this.t = i2;
        int iG = g(r(i2), this.b);
        this.i = iG;
        this.j = iG;
    }

    public final a b(int i) {
        ArrayList arrayList = this.d;
        int iD = h2.d(arrayList, i, p());
        if (iD >= 0) {
            return (a) arrayList.get(iD);
        }
        if (i > this.g) {
            i = -(p() - i);
        }
        a aVar = new a(i);
        arrayList.add(-(iD + 1), aVar);
        return aVar;
    }

    public final int c(a aVar) {
        int i = aVar.a;
        return i < 0 ? p() + i : i;
    }

    public final void d() {
        int i = this.n;
        this.n = i + 1;
        if (i == 0) {
            this.q.c((o() - this.h) - this.u);
        }
    }

    public final void e(boolean z) {
        this.w = true;
        if (z && this.p.b == 0) {
            B(p());
            C(this.c.length - this.l, this.g);
            int i = this.k;
            Arrays.fill(this.c, i, this.l + i, (Object) null);
            G();
        }
        int[] iArr = this.b;
        int i2 = this.g;
        Object[] objArr = this.c;
        int i3 = this.k;
        ArrayList arrayList = this.d;
        HashMap map = this.e;
        androidx.collection.z zVar = this.f;
        f2 f2Var = this.a;
        if (!f2Var.D) {
            n1.a("Unexpected writer close()");
        }
        f2Var.D = false;
        f2Var.e = iArr;
        f2Var.y = i2;
        f2Var.z = objArr;
        f2Var.A = i3;
        f2Var.F = arrayList;
        f2Var.G = map;
        f2Var.H = zVar;
    }

    public final int f(int i) {
        return g(r(i), this.b);
    }

    public final int g(int i, int[] iArr) {
        if (i >= o()) {
            return this.c.length - this.l;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.c.length - this.l) + i2 + 1 : i2;
    }

    public final int h(int i) {
        return (this.l * (i < this.k ? 0 : 1)) + i;
    }

    public final void j() {
        androidx.collection.j0 j0Var;
        boolean z = this.n > 0;
        int i = this.t;
        int i2 = this.u;
        int i3 = this.v;
        int iR = r(i3);
        int i4 = this.o;
        int i5 = i - i3;
        int i6 = iR * 5;
        int i7 = i6 + 1;
        boolean z2 = (this.b[i7] & 1073741824) != 0;
        o0 o0Var = this.r;
        if (z) {
            androidx.collection.z zVar = this.s;
            if (zVar != null && (j0Var = (androidx.collection.j0) zVar.b(i3)) != null) {
                Object[] objArr = j0Var.a;
                int i8 = j0Var.b;
                for (int i9 = 0; i9 < i8; i9++) {
                    F(objArr[i9]);
                }
            }
            int[] iArr = this.b;
            iArr[i6 + 3] = i5;
            h2.c(iArr, iR, i4);
            int iB = o0Var.b();
            if (z2) {
                i4 = 1;
            }
            this.o = iB + i4;
            int iE = E(i3, this.b);
            this.v = iE;
            int iP = iE < 0 ? p() : r(iE + 1);
            int iG = iP >= 0 ? g(iP, this.b) : 0;
            this.i = iG;
            this.j = iG;
            return;
        }
        if (i != i2) {
            t.a("Expected to be at the end of a group");
        }
        int[] iArr2 = this.b;
        int i10 = i6 + 3;
        int i11 = iArr2[i10];
        int i12 = iArr2[i7] & 67108863;
        iArr2[i10] = i5;
        h2.c(iArr2, iR, i4);
        int iB2 = this.p.b();
        this.u = (o() - this.h) - this.q.b();
        this.v = iB2;
        int iE2 = E(i3, this.b);
        int iB3 = o0Var.b();
        this.o = iB3;
        if (iE2 == iB2) {
            this.o = iB3 + (z2 ? 0 : i4 - i12);
            return;
        }
        int i13 = i5 - i11;
        int i14 = z2 ? 0 : i4 - i12;
        if (i13 != 0 || i14 != 0) {
            while (iE2 != 0 && iE2 != iB2 && (i14 != 0 || i13 != 0)) {
                int iR2 = r(iE2);
                if (i13 != 0) {
                    int[] iArr3 = this.b;
                    int i15 = (iR2 * 5) + 3;
                    iArr3[i15] = iArr3[i15] + i13;
                }
                if (i14 != 0) {
                    int[] iArr4 = this.b;
                    h2.c(iArr4, iR2, (iArr4[(iR2 * 5) + 1] & 67108863) + i14);
                }
                int[] iArr5 = this.b;
                if ((iArr5[(iR2 * 5) + 1] & 1073741824) != 0) {
                    i14 = 0;
                }
                iE2 = E(iE2, iArr5);
            }
        }
        this.o += i14;
    }

    public final void k() {
        if (this.n <= 0) {
            n1.b("Unbalanced begin/end insert");
        }
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            if (this.r.b != this.p.b) {
                t.a("startGroup/endGroup mismatch while inserting");
            }
            this.u = (o() - this.h) - this.q.b();
        }
    }

    public final void l(int i) {
        boolean z = false;
        if (!(this.n <= 0)) {
            t.a("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.v;
        if (i2 != i) {
            if (i >= i2 && i < this.u) {
                z = true;
            }
            if (!z) {
                t.a("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.t;
            int i4 = this.i;
            int i5 = this.j;
            this.t = i;
            P();
            this.t = i3;
            this.i = i4;
            this.j = i5;
        }
    }

    public final void m(int i, int i2, int i3) {
        if (i >= this.g) {
            i = -((p() - i) + 2);
        }
        while (i3 < i2) {
            this.b[(r(i3) * 5) + 2] = i;
            int i4 = this.b[(r(i3) * 5) + 3] + i3;
            m(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    public final void n(int i, kotlin.jvm.functions.p pVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        int iE = E(i, this.b);
        int iP = p();
        int iU = u(i) + i;
        androidx.collection.a0 a0Var = null;
        int i6 = i;
        androidx.collection.y yVar = null;
        while (i6 < iU) {
            int iF = f(i6);
            int i7 = i6 + 1;
            int iF2 = f(i7);
            while (iF < iF2) {
                Object obj = this.c[h(iF)];
                if (!(obj instanceof a2) || (i5 = ((a2) obj).b) < 0) {
                    i4 = iE;
                    pVar.invoke(Integer.valueOf(iF), obj);
                } else {
                    int iU2 = u(i6) + i6;
                    int i8 = i7;
                    int i9 = 0;
                    while (i8 < iU2 && i9 < i5) {
                        int iR = r(i8);
                        int i10 = iE;
                        int[] iArr = this.b;
                        int i11 = iR * 5;
                        i8 = iArr[i11 + 3] + i8;
                        if (i8 < iU2 && (iArr[i11 + 1] & 536870912) == 0) {
                            i9++;
                        }
                        iE = i10;
                    }
                    i4 = iE;
                    if (a0Var == null) {
                        int[] iArr2 = androidx.collection.p.a;
                        a0Var = new androidx.collection.a0();
                    }
                    if (yVar == null) {
                        yVar = new androidx.collection.y();
                    }
                    a0Var.a(i8);
                    yVar.a(i8);
                    yVar.a(iF);
                }
                iF++;
                iE = i4;
            }
            int i12 = iE;
            iE = i7 < iP ? E(i7, this.b) : -1;
            if (iE != i6) {
                int i13 = i6;
                int iE2 = i12;
                while (true) {
                    if (yVar == null || a0Var == null || !a0Var.e(i13)) {
                        i2 = iP;
                    } else {
                        int i14 = yVar.b;
                        int i15 = i14 / 2;
                        int i16 = 0;
                        int i17 = 0;
                        while (i16 < i15) {
                            int i18 = i16 * 2;
                            int i19 = iP;
                            int iC = yVar.c(i18);
                            if (iC == i13) {
                                int iC2 = yVar.c(i18 + 1);
                                pVar.invoke(Integer.valueOf(iC2), this.c[h(iC2)]);
                            } else if (i18 != i17) {
                                int i20 = i17 + 1;
                                yVar.e(i17, iC);
                                i17 += 2;
                                yVar.e(i20, yVar.c(i18 + 1));
                            } else {
                                i17 += 2;
                            }
                            i16++;
                            pVar = pVar;
                            iP = i19;
                        }
                        i2 = iP;
                        if (i17 != i14) {
                            if (i17 < 0 || i17 > (i3 = yVar.b) || i14 < 0 || i14 > i3) {
                                com.google.gson.b.n("Index must be between 0 and size");
                                return;
                            }
                            if (i14 < i17) {
                                net.luminis.tls.engine.impl.c.o("The end index must be < start index");
                                return;
                            } else if (i14 != i17) {
                                if (i14 < i3) {
                                    int[] iArr3 = yVar.a;
                                    kotlin.collections.n.C(i17, i14, i3, iArr3, iArr3);
                                }
                                yVar.b -= i14 - i17;
                            }
                        }
                    }
                    if (i13 == i || iE2 == iE) {
                        break;
                    }
                    i13 = iE2;
                    iP = i2;
                    iE2 = E(iE2, this.b);
                    pVar = pVar;
                }
            } else {
                i2 = iP;
            }
            i6 = i7;
            iP = i2;
        }
    }

    public final int o() {
        return this.b.length / 5;
    }

    public final int p() {
        return o() - this.h;
    }

    public final Object q(int i) {
        int iR = r(i);
        int[] iArr = this.b;
        int i2 = (iR * 5) + 1;
        if ((iArr[i2] & 268435456) == 0) {
            return m.a;
        }
        return this.c[Integer.bitCount(iArr[i2] >> 29) + g(iR, iArr)];
    }

    public final int r(int i) {
        return (this.h * (i < this.g ? 0 : 1)) + i;
    }

    public final int s(int i) {
        return this.b[r(i) * 5];
    }

    public final Object t(int i) {
        int iR = r(i);
        int[] iArr = this.b;
        int i2 = iR * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.c[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    public final String toString() {
        return "SlotWriter(current = " + this.t + " end=" + this.u + " size = " + p() + " gap=" + this.g + '-' + (this.g + this.h) + ')';
    }

    public final int u(int i) {
        return this.b[(r(i) * 5) + 3];
    }

    public final boolean v(int i, int i2) {
        int iO;
        int iU;
        if (i2 == this.v) {
            iO = this.u;
        } else {
            o0 o0Var = this.p;
            if (i2 > o0Var.a(0)) {
                iU = u(i2);
            } else {
                int[] iArr = o0Var.a;
                int iMin = Math.min(iArr.length, o0Var.b);
                int i3 = 0;
                while (true) {
                    if (i3 >= iMin) {
                        i3 = -1;
                        break;
                    }
                    if (iArr[i3] == i2) {
                        break;
                    }
                    i3++;
                }
                if (i3 < 0) {
                    iU = u(i2);
                } else {
                    iO = (o() - this.h) - this.q.a[i3];
                }
            }
            iO = iU + i2;
        }
        return i > i2 && i < iO;
    }

    public final void w(int i) {
        if (i > 0) {
            int i2 = this.t;
            B(i2);
            int i3 = this.g;
            int i4 = this.h;
            int[] iArr = this.b;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[iMax * 5];
                int i6 = iMax - i5;
                kotlin.collections.n.C(0, 0, i3 * 5, iArr, iArr2);
                kotlin.collections.n.C((i3 + i6) * 5, (i4 + i3) * 5, length * 5, iArr, iArr2);
                this.b = iArr2;
                i4 = i6;
            }
            int i7 = this.u;
            if (i7 >= i3) {
                this.u = i7 + i;
            }
            int i8 = i3 + i;
            this.g = i8;
            this.h = i4 - i;
            int i9 = i(i5 > 0 ? f(i2 + i) : 0, this.m >= i3 ? this.k : 0, this.l, this.c.length);
            for (int i10 = i3; i10 < i8; i10++) {
                this.b[(i10 * 5) + 4] = i9;
            }
            int i11 = this.m;
            if (i11 >= i3) {
                this.m = i11 + i;
            }
        }
    }

    public final void x(int i, int i2) {
        if (i > 0) {
            C(this.i, i2);
            int i3 = this.k;
            int i4 = this.l;
            if (i4 < i) {
                Object[] objArr = this.c;
                int length = objArr.length;
                int i5 = length - i4;
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i6 = 0; i6 < iMax; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = iMax - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.c = objArr2;
                i4 = i7;
            }
            int i9 = this.j;
            if (i9 >= i3) {
                this.j = i9 + i;
            }
            this.k = i3 + i;
            this.l = i4 - i;
        }
    }

    public final boolean y(int i) {
        return (this.b[(r(i) * 5) + 1] & 1073741824) != 0;
    }
}
