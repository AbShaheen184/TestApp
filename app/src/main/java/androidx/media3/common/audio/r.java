package androidx.media3.common.audio;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;
    public final int g;
    public final int h;
    public final p i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public double q;

    public r(int i, int i2, float f, float f2, int i3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = i / i3;
        this.f = i / 400;
        int i4 = i / 65;
        this.g = i4;
        this.h = i4 * 2;
        this.i = z ? new o(this) : new q(this);
    }

    public final void a(int i, int i2) {
        p pVar = this.i;
        pVar.h(i2);
        Object objE = pVar.e();
        int i3 = this.b;
        System.arraycopy(objE, i * i3, pVar.f(), this.k * i3, i3 * i2);
        this.k += i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        float f;
        int iQ;
        double d;
        int i;
        int iRound;
        int i2;
        int iRound2;
        int i3;
        int i4;
        long j;
        long j2;
        int i5 = this.k;
        float f2 = this.c;
        float f3 = this.d;
        double d2 = f2 / f3;
        float f4 = this.e * f3;
        int i6 = this.a;
        int i7 = 1;
        p pVar = this.i;
        int i8 = this.b;
        if (d2 > 1.0000100135803223d || d2 < 0.9999899864196777d) {
            int i9 = this.j;
            int i10 = this.h;
            if (i9 >= i10) {
                int i11 = 0;
                while (true) {
                    int i12 = this.o;
                    if (i12 > 0) {
                        int iMin = Math.min(i10, i12);
                        a(i11, iMin);
                        this.o -= iMin;
                        i11 += iMin;
                        f = f4;
                        d = d2;
                        i2 = i7;
                        i = i10;
                    } else {
                        int i13 = i6 > 4000 ? i6 / 4000 : i7;
                        int i14 = this.g;
                        int i15 = this.f;
                        if (i8 == i7 && i13 == i7) {
                            iQ = pVar.c(i11, i15, i14);
                            f = f4;
                        } else {
                            pVar.b(i11, i13);
                            f = f4;
                            int iQ2 = pVar.q(i15 / i13, i14 / i13);
                            if (i13 != i7) {
                                int i16 = iQ2 * i13;
                                int i17 = i13 * 4;
                                int i18 = i16 - i17;
                                int i19 = i16 + i17;
                                if (i18 >= i15) {
                                    i15 = i18;
                                }
                                if (i19 <= i14) {
                                    i14 = i19;
                                }
                                if (i8 == i7) {
                                    iQ = pVar.c(i11, i15, i14);
                                } else {
                                    pVar.b(i11, i7);
                                    iQ = pVar.q(i15, i14);
                                }
                            } else {
                                iQ = iQ2;
                            }
                        }
                        int i20 = pVar.i() ? this.p : iQ;
                        pVar.d();
                        this.p = iQ;
                        double d3 = this.q;
                        if (d2 > 1.0d) {
                            if (d2 >= 2.0d) {
                                double d4 = (((double) i20) / (d2 - 1.0d)) + d3;
                                iRound2 = (int) Math.round(d4);
                                d = d2;
                                this.q = d4 - ((double) iRound2);
                                pVar = pVar;
                            } else {
                                d = d2;
                                double d5 = (((2.0d - d) * ((double) i20)) / (d - 1.0d)) + d3;
                                int iRound3 = (int) Math.round(d5);
                                this.o = iRound3;
                                this.q = d5 - ((double) iRound3);
                                iRound2 = i20;
                            }
                            pVar.h(iRound2);
                            int i21 = i10;
                            int i22 = iRound2;
                            pVar.k(i22, this.b, this.k, i11, i11 + i20);
                            this.k += i22;
                            i11 = i20 + i22 + i11;
                            i = i21;
                            i2 = i7;
                        } else {
                            d = d2;
                            int i23 = i7;
                            i = i10;
                            if (d < 0.5d) {
                                double d6 = ((((double) i20) * d) / (1.0d - d)) + d3;
                                iRound = (int) Math.round(d6);
                                this.q = d6 - ((double) iRound);
                            } else {
                                double d7 = ((((2.0d * d) - 1.0d) * ((double) i20)) / (1.0d - d)) + d3;
                                int iRound4 = (int) Math.round(d7);
                                this.o = iRound4;
                                this.q = d7 - ((double) iRound4);
                                iRound = i20;
                            }
                            int i24 = i20 + iRound;
                            pVar.h(i24);
                            i2 = i23;
                            System.arraycopy(pVar.e(), i11 * i8, pVar.f(), this.k * i8, i20 * i8);
                            int i25 = i11;
                            pVar.k(iRound, this.b, this.k + i20, i20 + i11, i25);
                            this.k += i24;
                            i11 = i25 + iRound;
                        }
                    }
                    if (i11 + i > i9) {
                        break;
                    }
                    i10 = i;
                    f4 = f;
                    i7 = i2;
                    d2 = d;
                }
                int i26 = this.j - i11;
                System.arraycopy(pVar.e(), i11 * i8, pVar.e(), 0, i26 * i8);
                this.j = i26;
            }
            if (f != 1.0f || this.k == i5) {
            }
            long j3 = (long) (i6 / f);
            long j4 = i6;
            while (j3 != 0 && j4 != 0 && j3 % 2 == 0 && j4 % 2 == 0) {
                j3 /= 2;
                j4 /= 2;
            }
            int i27 = this.k - i5;
            pVar.m(i27);
            System.arraycopy(pVar.f(), i5 * i8, pVar.j(), this.l * i8, i27 * i8);
            this.k = i5;
            this.l += i27;
            int i28 = 0;
            while (true) {
                i3 = this.l - 1;
                if (i28 >= i3) {
                    break;
                }
                while (true) {
                    i4 = this.m + 1;
                    j = i4;
                    long j5 = j * j3;
                    j2 = this.n;
                    if (j5 <= j2 * j4) {
                        break;
                    }
                    int i29 = i2;
                    pVar.h(i29);
                    pVar.g(j4, j3, i28);
                    this.n += i29;
                    this.k += i29;
                }
                int i30 = i2;
                this.m = i4;
                if (j == j4) {
                    this.m = 0;
                    com.google.android.material.motion.a.q(j2 == j3 ? i30 : 0);
                    this.n = 0;
                }
                i28++;
                i2 = i30;
            }
            if (i3 == 0) {
                return;
            }
            System.arraycopy(pVar.j(), i3 * i8, pVar.j(), 0, (this.l - i3) * i8);
            this.l -= i3;
            return;
        }
        a(0, this.j);
        this.j = 0;
        f = f4;
        i2 = 1;
        if (f != 1.0f) {
        }
    }
}
