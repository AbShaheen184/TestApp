package com.google.protobuf;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends t {
    public final byte[] d;
    public int e;
    public int f;
    public int g;
    public final int h;
    public int i;
    public int j = Integer.MAX_VALUE;

    public r(byte[] bArr, int i, int i2, boolean z) {
        this.d = bArr;
        this.e = i2 + i;
        this.g = i;
        this.h = i;
    }

    @Override // com.google.protobuf.t
    public final int A() {
        return H();
    }

    @Override // com.google.protobuf.t
    public final long B() {
        return J();
    }

    @Override // com.google.protobuf.t
    public final boolean C(int i) throws x0 {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                M(8);
                return true;
            }
            if (i2 == 2) {
                M(H());
                return true;
            }
            if (i2 == 3) {
                D();
                a(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                if (this.b == 0) {
                    a(0);
                }
                return false;
            }
            if (i2 != 5) {
                throw x0.c();
            }
            M(4);
            return true;
        }
        int i4 = this.e - this.g;
        byte[] bArr = this.d;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.g;
                this.g = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw x0.d();
        }
        while (i3 < 10) {
            int i6 = this.g;
            if (i6 == this.e) {
                throw x0.g();
            }
            this.g = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw x0.d();
        return true;
    }

    public final int E() throws x0 {
        int i = this.g;
        if (this.e - i < 4) {
            throw x0.g();
        }
        this.g = i + 4;
        byte[] bArr = this.d;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long F() throws x0 {
        int i = this.g;
        if (this.e - i < 8) {
            throw x0.g();
        }
        this.g = i + 8;
        byte[] bArr = this.d;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public final int G() {
        return I();
    }

    public final int H() {
        return I();
    }

    public final int I() {
        int i;
        int i2 = this.g;
        int i3 = this.e;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.d;
            byte b = bArr[i2];
            if (b >= 0) {
                this.g = i4;
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
                this.g = i5;
                return i;
            }
        }
        return (int) K();
    }

    public final long J() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.g;
        int i2 = this.e;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.d;
            byte b = bArr[i];
            if (b >= 0) {
                this.g = i3;
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
                                j2 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                if (j7 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (((long) bArr[i8]) << 42);
                                    if (j6 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (((long) bArr[i4]) << 49);
                                        if (j7 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            j6 = j7 ^ (((long) bArr[i8]) << 56);
                                            if (j6 >= 0) {
                                                j2 = 71499008037633920L;
                                            } else {
                                                int i10 = i + 10;
                                                long j8 = (((long) bArr[i4]) << 63) ^ j6;
                                                if (j8 >= 0) {
                                                    j = j8 ^ (-9151873028817141888L);
                                                    i4 = i10;
                                                }
                                            }
                                        }
                                    }
                                }
                                j4 = j3 ^ j7;
                            }
                            j = j2 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.g = i4;
                return j;
            }
        }
        return K();
    }

    public final long K() throws x0 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.g;
            if (i2 == this.e) {
                throw x0.g();
            }
            this.g = i2 + 1;
            byte b = this.d[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw x0.d();
    }

    public final void L() {
        int i = this.e + this.f;
        this.e = i;
        int i2 = i - this.h;
        int i3 = this.j;
        if (i2 <= i3) {
            this.f = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f = i4;
        this.e = i - i4;
    }

    public final void M(int i) throws x0 {
        if (i >= 0) {
            int i2 = this.e;
            int i3 = this.g;
            if (i <= i2 - i3) {
                this.g = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw x0.g();
        }
        throw x0.e();
    }

    @Override // com.google.protobuf.t
    public final void a(int i) throws x0 {
        if (this.i != i) {
            throw new x0("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.protobuf.t
    public final int d() {
        return this.g - this.h;
    }

    @Override // com.google.protobuf.t
    public final boolean e() {
        return this.g == this.e;
    }

    @Override // com.google.protobuf.t
    public final void h(int i) {
        this.j = i;
        L();
    }

    @Override // com.google.protobuf.t
    public final int i(int i) throws x0 {
        if (i < 0) {
            throw x0.e();
        }
        int iD = d() + i;
        if (iD < 0) {
            throw new x0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i2 = this.j;
        if (iD > i2) {
            throw x0.g();
        }
        this.j = iD;
        L();
        return i2;
    }

    @Override // com.google.protobuf.t
    public final boolean j() {
        return J() != 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0030 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0032 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0040  */
    @Override // com.google.protobuf.t
    public final ByteString k() throws x0 {
        byte[] bArrCopyOfRange;
        int iH = H();
        byte[] bArr = this.d;
        if (iH > 0) {
            int i = this.e;
            int i2 = this.g;
            if (iH <= i - i2) {
                ByteString byteStringCopyFrom = ByteString.copyFrom(bArr, i2, iH, false);
                this.g += iH;
                return byteStringCopyFrom;
            }
        }
        if (iH == 0) {
            return ByteString.EMPTY;
        }
        if (iH > 0) {
            int i3 = this.e;
            int i4 = this.g;
            if (iH <= i3 - i4) {
                int i5 = iH + i4;
                this.g = i5;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
            } else {
                if (iH <= 0) {
                    throw x0.g();
                }
                if (iH == 0) {
                    throw x0.e();
                }
                bArrCopyOfRange = u0.a;
            }
        } else {
            if (iH <= 0) {
                throw x0.g();
            }
            if (iH == 0) {
                throw x0.e();
            }
            bArrCopyOfRange = u0.a;
        }
        return ByteString.wrap(bArrCopyOfRange, false);
    }

    @Override // com.google.protobuf.t
    public final double l() {
        return Double.longBitsToDouble(F());
    }

    @Override // com.google.protobuf.t
    public final int m() {
        return G();
    }

    @Override // com.google.protobuf.t
    public final int n() {
        return E();
    }

    @Override // com.google.protobuf.t
    public final long o() {
        return F();
    }

    @Override // com.google.protobuf.t
    public final float p() {
        return Float.intBitsToFloat(E());
    }

    @Override // com.google.protobuf.t
    public final int q() {
        return G();
    }

    @Override // com.google.protobuf.t
    public final long r() {
        return J();
    }

    @Override // com.google.protobuf.t
    public final int t() {
        return E();
    }

    @Override // com.google.protobuf.t
    public final long u() {
        return F();
    }

    @Override // com.google.protobuf.t
    public final int v() {
        return t.b(H());
    }

    @Override // com.google.protobuf.t
    public final long w() {
        return t.c(J());
    }

    @Override // com.google.protobuf.t
    public final String x() throws x0 {
        int iH = H();
        if (iH > 0) {
            int i = this.e;
            int i2 = this.g;
            if (iH <= i - i2) {
                String str = new String(this.d, i2, iH, StandardCharsets.UTF_8);
                this.g += iH;
                return str;
            }
        }
        if (iH == 0) {
            return "";
        }
        if (iH < 0) {
            throw x0.e();
        }
        throw x0.g();
    }

    @Override // com.google.protobuf.t
    public final String y() throws x0 {
        int iH = H();
        String strG = "";
        if (iH > 0) {
            int i = this.e;
            int i2 = this.g;
            if (iH <= i - i2) {
                if (iH == 0) {
                    com.google.android.material.resources.b bVar = o2.a;
                } else {
                    strG = o2.a.g(this.d, i2, iH);
                }
                this.g += iH;
                return strG;
            }
        }
        if (iH == 0) {
            return "";
        }
        if (iH <= 0) {
            throw x0.e();
        }
        throw x0.g();
    }

    @Override // com.google.protobuf.t
    public final int z() throws x0 {
        if (e()) {
            this.i = 0;
            return 0;
        }
        int iH = H();
        this.i = iH;
        if ((iH >>> 3) != 0) {
            return iH;
        }
        throw x0.a();
    }
}
