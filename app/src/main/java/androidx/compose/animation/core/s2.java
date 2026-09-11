package androidx.compose.animation.core;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s2 implements o2 {
    public final z A;
    public int[] B = n2.a;
    public float[] C;
    public s D;
    public s E;
    public s F;
    public s G;
    public float[] H;
    public float[] I;
    public com.google.firebase.platforminfo.c J;
    public final androidx.collection.y e;
    public final androidx.collection.z y;
    public final int z;

    public s2(androidx.collection.y yVar, androidx.collection.z zVar, int i, z zVar2) {
        this.e = yVar;
        this.y = zVar;
        this.z = i;
        this.A = zVar2;
        float[] fArr = n2.b;
        this.C = fArr;
        this.H = fArr;
        this.I = fArr;
        this.J = n2.c;
    }

    public final int c(int i) {
        int i2;
        androidx.collection.y yVar = this.e;
        int i3 = yVar.b;
        if (i3 <= 0) {
            com.google.gson.b.n("");
            return 0;
        }
        int i4 = i3 - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = yVar.a[i2];
                if (i6 >= i) {
                    if (i6 <= i) {
                        break;
                    }
                    i4 = i2 - 1;
                } else {
                    i5 = i2 + 1;
                }
            } else {
                i2 = -(i5 + 1);
                break;
            }
        }
        return i2 < -1 ? -(i2 + 2) : i2;
    }

    public final float d(int i, int i2, boolean z) {
        z zVar;
        float f;
        androidx.collection.y yVar = this.e;
        if (i >= yVar.b - 1) {
            f = i2;
        } else {
            int iC = yVar.c(i);
            int iC2 = yVar.c(i + 1);
            if (i2 == iC) {
                f = iC;
            } else {
                int i3 = iC2 - iC;
                r2 r2Var = (r2) this.y.b(iC);
                if (r2Var == null || (zVar = r2Var.b) == null) {
                    zVar = this.A;
                }
                float f2 = i3;
                float fA = zVar.a((i2 - iC) / f2);
                if (z) {
                    return fA;
                }
                f = (f2 * fA) + iC;
            }
        }
        return f / 1000;
    }

    public final void e(s sVar, s sVar2, s sVar3) {
        float[] fArr;
        boolean z = this.J != n2.c;
        s sVar4 = this.D;
        androidx.collection.z zVar = this.y;
        androidx.collection.y yVar = this.e;
        if (sVar4 == null) {
            this.D = sVar.c();
            this.E = sVar3.c();
            int i = yVar.b;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = yVar.c(i2) / 1000;
            }
            this.C = fArr2;
            int i3 = yVar.b;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = 0;
            }
            this.B = iArr;
        }
        if (z) {
            if (this.J != n2.c && kotlin.jvm.internal.l.a(this.F, sVar) && kotlin.jvm.internal.l.a(this.G, sVar2)) {
                return;
            }
            this.F = sVar;
            this.G = sVar2;
            int iB = sVar.b() + (sVar.b() % 2);
            this.H = new float[iB];
            this.I = new float[iB];
            int i5 = yVar.b;
            float[][] fArr3 = new float[i5][];
            for (int i6 = 0; i6 < i5; i6++) {
                int iC = yVar.c(i6);
                r2 r2Var = (r2) zVar.b(iC);
                if (iC == 0 && r2Var == null) {
                    fArr = new float[iB];
                    for (int i7 = 0; i7 < iB; i7++) {
                        fArr[i7] = sVar.a(i7);
                    }
                } else if (iC == this.z && r2Var == null) {
                    fArr = new float[iB];
                    for (int i8 = 0; i8 < iB; i8++) {
                        fArr[i8] = sVar2.a(i8);
                    }
                } else {
                    r2Var.getClass();
                    s sVar5 = r2Var.a;
                    float[] fArr4 = new float[iB];
                    for (int i9 = 0; i9 < iB; i9++) {
                        fArr4[i9] = sVar5.a(i9);
                    }
                    fArr = fArr4;
                }
                fArr3[i6] = fArr;
            }
            this.J = new com.google.firebase.platforminfo.c(this.B, this.C, fArr3);
        }
    }

    @Override // androidx.compose.animation.core.m2
    public final s i(long j, s sVar, s sVar2, s sVar3) {
        int[] iArr = n2.a;
        int i = 0;
        long j2 = (j / 1000000) - ((long) 0);
        long j3 = this.z;
        if (j2 < 0) {
            j2 = 0;
        }
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 < 0) {
            return sVar3;
        }
        e(sVar, sVar2, sVar3);
        s sVar4 = this.E;
        sVar4.getClass();
        if (this.J != n2.c) {
            int i2 = (int) j4;
            float fD = d(c(i2), i2, false);
            float[] fArr = this.I;
            u[][] uVarArr = (u[][]) this.J.e;
            float f = uVarArr[0][0].a;
            float f2 = uVarArr[uVarArr.length - 1][0].b;
            if (fD < f) {
                fD = f;
            }
            if (fD <= f2) {
                f2 = fD;
            }
            int length = fArr.length;
            boolean z = false;
            for (u[] uVarArr2 : uVarArr) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < length - 1) {
                    u uVar = uVarArr2[i4];
                    if (f2 <= uVar.b) {
                        if (uVar.p) {
                            fArr[i3] = uVar.q;
                            fArr[i3 + 1] = uVar.r;
                        } else {
                            uVar.c(f2);
                            fArr[i3] = uVar.a();
                            fArr[i3 + 1] = uVar.b();
                        }
                        z = true;
                    }
                    i3 += 2;
                    i4++;
                }
                if (z) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i < length2) {
                sVar4.e(i, fArr[i]);
                i++;
            }
        } else {
            s sVarT = t((j4 - 1) * 1000000, sVar, sVar2, sVar3);
            s sVarT2 = t(j4 * 1000000, sVar, sVar2, sVar3);
            int iB = sVarT.b();
            while (i < iB) {
                sVar4.e(i, (sVarT.a(i) - sVarT2.a(i)) * 1000.0f);
                i++;
            }
        }
        return sVar4;
    }

    @Override // androidx.compose.animation.core.o2
    public final int p() {
        return 0;
    }

    @Override // androidx.compose.animation.core.m2
    public final s t(long j, s sVar, s sVar2, s sVar3) {
        s sVar4;
        s sVar5;
        float f;
        s sVar6 = sVar;
        s sVar7 = sVar2;
        int[] iArr = n2.a;
        int i = 0;
        long j2 = (j / 1000000) - ((long) 0);
        int i2 = this.z;
        long j3 = i2;
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 <= j3) {
            j3 = j2;
        }
        int i3 = (int) j3;
        androidx.collection.z zVar = this.y;
        r2 r2Var = (r2) zVar.b(i3);
        if (r2Var != null) {
            return r2Var.a;
        }
        if (i3 >= i2) {
            return sVar7;
        }
        if (i3 <= 0) {
            return sVar6;
        }
        e(sVar6, sVar7, sVar3);
        s sVar8 = this.D;
        sVar8.getClass();
        boolean z = true;
        if (this.J != n2.c) {
            float fD = d(c(i3), i3, false);
            float[] fArr = this.H;
            u[][] uVarArr = (u[][]) this.J.e;
            int length = uVarArr.length - 1;
            float f2 = uVarArr[0][0].a;
            float f3 = uVarArr[length][0].b;
            int length2 = fArr.length;
            if (fD < f2 || fD > f3) {
                if (fD > f3) {
                    f2 = f3;
                } else {
                    length = 0;
                }
                float f4 = fD - f2;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length2 - 1) {
                    u uVar = uVarArr[length][i5];
                    boolean z2 = uVar.p;
                    float f5 = uVar.r;
                    float f6 = uVar.q;
                    if (z2) {
                        float f7 = uVar.a;
                        float f8 = uVar.k;
                        f = f4;
                        float f9 = uVar.c;
                        fArr[i4] = (f6 * f) + ((uVar.e - f9) * (f2 - f7) * f8) + f9;
                        float f10 = uVar.d;
                        fArr[i4 + 1] = (f * f5) + ((uVar.f - f10) * (f2 - f7) * f8) + f10;
                    } else {
                        f = f4;
                        uVar.c(f2);
                        fArr[i4] = (uVar.a() * f) + (uVar.n * uVar.h) + f6;
                        fArr[i4 + 1] = (uVar.b() * f) + (uVar.o * uVar.i) + f5;
                    }
                    i4 += 2;
                    i5++;
                    f4 = f;
                }
            } else {
                int length3 = uVarArr.length;
                int i6 = 0;
                boolean z3 = false;
                while (i6 < length3) {
                    int i7 = i;
                    int i8 = i7;
                    while (i7 < length2 - 1) {
                        u uVar2 = uVarArr[i6][i8];
                        if (fD <= uVar2.b) {
                            if (uVar2.p) {
                                float f11 = uVar2.a;
                                float f12 = uVar2.k;
                                float f13 = uVar2.c;
                                fArr[i7] = ((uVar2.e - f13) * (fD - f11) * f12) + f13;
                                float f14 = uVar2.d;
                                fArr[i7 + 1] = ((uVar2.f - f14) * (fD - f11) * f12) + f14;
                            } else {
                                uVar2.c(fD);
                                fArr[i7] = (uVar2.n * uVar2.h) + uVar2.q;
                                fArr[i7 + 1] = (uVar2.o * uVar2.i) + uVar2.r;
                            }
                            z3 = z;
                        } else {
                            z = z;
                        }
                        i7 += 2;
                        i8++;
                        z = z;
                    }
                    boolean z4 = z;
                    if (z3) {
                        break;
                    }
                    i6++;
                    z = z4;
                    i = 0;
                }
            }
            int length4 = fArr.length;
            for (int i9 = 0; i9 < length4; i9++) {
                sVar8.e(i9, fArr[i9]);
            }
        } else {
            int iC = c(i3);
            float fD2 = d(iC, i3, true);
            androidx.collection.y yVar = this.e;
            r2 r2Var2 = (r2) zVar.b(yVar.c(iC));
            if (r2Var2 != null && (sVar5 = r2Var2.a) != null) {
                sVar6 = sVar5;
            }
            r2 r2Var3 = (r2) zVar.b(yVar.c(iC + 1));
            if (r2Var3 != null && (sVar4 = r2Var3.a) != null) {
                sVar7 = sVar4;
            }
            int iB = sVar8.b();
            for (int i10 = 0; i10 < iB; i10++) {
                sVar8.e(i10, (sVar7.a(i10) * fD2) + ((1 - fD2) * sVar6.a(i10)));
            }
        }
        return sVar8;
    }

    @Override // androidx.compose.animation.core.o2
    public final int u() {
        return this.z;
    }
}
