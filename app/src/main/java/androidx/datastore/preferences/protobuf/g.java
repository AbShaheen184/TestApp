package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends androidx.core.view.w0 {
    public final byte[] A;
    public int B;
    public int C;
    public int D;
    public final int E;
    public int F;
    public int G = Integer.MAX_VALUE;

    public g(byte[] bArr, int i, int i2, boolean z) {
        this.A = bArr;
        this.B = i2 + i;
        this.D = i;
        this.E = i;
    }

    @Override // androidx.core.view.w0
    public final int A() {
        return R();
    }

    @Override // androidx.core.view.w0
    public final long B() {
        return S();
    }

    @Override // androidx.core.view.w0
    public final int C() {
        return P();
    }

    @Override // androidx.core.view.w0
    public final long D() {
        return Q();
    }

    @Override // androidx.core.view.w0
    public final int E() {
        int iR = R();
        return (-(iR & 1)) ^ (iR >>> 1);
    }

    @Override // androidx.core.view.w0
    public final long F() {
        long jS = S();
        return (-(jS & 1)) ^ (jS >>> 1);
    }

    @Override // androidx.core.view.w0
    public final String G() throws x {
        int iR = R();
        if (iR > 0) {
            int i = this.B;
            int i2 = this.D;
            if (iR <= i - i2) {
                String str = new String(this.A, i2, iR, v.a);
                this.D += iR;
                return str;
            }
        }
        if (iR == 0) {
            return "";
        }
        if (iR < 0) {
            throw x.d();
        }
        throw x.e();
    }

    @Override // androidx.core.view.w0
    public final String H() throws x {
        int iR = R();
        if (iR > 0) {
            int i = this.B;
            int i2 = this.D;
            if (iR <= i - i2) {
                String strJ = j1.a.j(this.A, i2, iR);
                this.D += iR;
                return strJ;
            }
        }
        if (iR == 0) {
            return "";
        }
        if (iR <= 0) {
            throw x.d();
        }
        throw x.e();
    }

    @Override // androidx.core.view.w0
    public final int I() throws x {
        if (l()) {
            this.F = 0;
            return 0;
        }
        int iR = R();
        this.F = iR;
        if ((iR >>> 3) != 0) {
            return iR;
        }
        throw new x("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.core.view.w0
    public final int J() {
        return R();
    }

    @Override // androidx.core.view.w0
    public final long K() {
        return S();
    }

    @Override // androidx.core.view.w0
    public final boolean L(int i) throws x {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                V(8);
                return true;
            }
            if (i2 == 2) {
                V(R());
                return true;
            }
            if (i2 == 3) {
                M();
                a(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw x.b();
            }
            V(4);
            return true;
        }
        int i4 = this.B - this.D;
        byte[] bArr = this.A;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.D;
                this.D = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw x.c();
        }
        while (i3 < 10) {
            int i6 = this.D;
            if (i6 == this.B) {
                throw x.e();
            }
            this.D = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw x.c();
        return true;
    }

    public final int P() throws x {
        int i = this.D;
        if (this.B - i < 4) {
            throw x.e();
        }
        this.D = i + 4;
        byte[] bArr = this.A;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long Q() throws x {
        int i = this.D;
        if (this.B - i < 8) {
            throw x.e();
        }
        this.D = i + 8;
        byte[] bArr = this.A;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public final int R() {
        int i;
        int i2 = this.D;
        int i3 = this.B;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.A;
            byte b = bArr[i2];
            if (b >= 0) {
                this.D = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.D = i5;
                return i;
            }
        }
        return (int) T();
    }

    public final long S() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.D;
        int i2 = this.B;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.A;
            byte b = bArr[i];
            if (b >= 0) {
                this.D = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (((long) bArr[i8]) << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (((long) bArr[i8]) << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (((long) bArr[i4]) << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.D = i4;
                return j;
            }
        }
        return T();
    }

    public final long T() throws x {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.D;
            if (i2 == this.B) {
                throw x.e();
            }
            this.D = i2 + 1;
            byte b = this.A[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw x.c();
    }

    public final void U() {
        int i = this.B + this.C;
        this.B = i;
        int i2 = i - this.E;
        int i3 = this.G;
        if (i2 <= i3) {
            this.C = 0;
            return;
        }
        int i4 = i2 - i3;
        this.C = i4;
        this.B = i - i4;
    }

    public final void V(int i) throws x {
        if (i >= 0) {
            int i2 = this.B;
            int i3 = this.D;
            if (i <= i2 - i3) {
                this.D = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw x.e();
        }
        throw x.d();
    }

    @Override // androidx.core.view.w0
    public final void a(int i) throws x {
        if (this.F != i) {
            throw new x("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.core.view.w0
    public final int k() {
        return this.D - this.E;
    }

    @Override // androidx.core.view.w0
    public final boolean l() {
        return this.D == this.B;
    }

    @Override // androidx.core.view.w0
    public final void r(int i) {
        this.G = i;
        U();
    }

    @Override // androidx.core.view.w0
    public final int s(int i) {
        if (i < 0) {
            throw x.d();
        }
        int iK = k() + i;
        if (iK < 0) {
            throw new x("Failed to parse the message.");
        }
        int i2 = this.G;
        if (iK > i2) {
            throw x.e();
        }
        this.G = iK;
        U();
        return i2;
    }

    @Override // androidx.core.view.w0
    public final boolean t() {
        return S() != 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // androidx.core.view.w0
    public final f u() throws x {
        byte[] bArrCopyOfRange;
        int iR = R();
        byte[] bArr = this.A;
        if (iR > 0) {
            int i = this.B;
            int i2 = this.D;
            if (iR <= i - i2) {
                f fVarD = f.d(bArr, i2, iR);
                this.D += iR;
                return fVarD;
            }
        }
        if (iR == 0) {
            return f.z;
        }
        if (iR > 0) {
            int i3 = this.B;
            int i4 = this.D;
            if (iR <= i3 - i4) {
                int i5 = iR + i4;
                this.D = i5;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
            } else {
                if (iR <= 0) {
                    throw x.e();
                }
                if (iR == 0) {
                    throw x.d();
                }
                bArrCopyOfRange = v.b;
            }
        } else {
            if (iR <= 0) {
                throw x.e();
            }
            if (iR == 0) {
                throw x.d();
            }
            bArrCopyOfRange = v.b;
        }
        f fVar = f.z;
        return new f(bArrCopyOfRange);
    }

    @Override // androidx.core.view.w0
    public final double v() {
        return Double.longBitsToDouble(Q());
    }

    @Override // androidx.core.view.w0
    public final int w() {
        return R();
    }

    @Override // androidx.core.view.w0
    public final int x() {
        return P();
    }

    @Override // androidx.core.view.w0
    public final long y() {
        return Q();
    }

    @Override // androidx.core.view.w0
    public final float z() {
        return Float.intBitsToFloat(P());
    }
}
