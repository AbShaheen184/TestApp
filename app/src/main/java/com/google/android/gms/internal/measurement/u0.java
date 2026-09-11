package com.google.android.gms.internal.measurement;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends w0 {
    public final byte[] d;
    public int f;
    public int h;
    public int i = Integer.MAX_VALUE;
    public int e = 0;
    public int g = 0;

    public /* synthetic */ u0(byte[] bArr) {
        this.d = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.w0
    public final int A() {
        return M();
    }

    @Override // com.google.android.gms.internal.measurement.w0
    public final int B() {
        return M();
    }

    @Override // com.google.android.gms.internal.measurement.w0
    public final int C() {
        return J();
    }

    @Override // com.google.android.gms.internal.measurement.w0
    public final long D() {
        return K();
    }

    @Override // com.google.android.gms.internal.measurement.w0
    public final int E() {
        return w0.j(M());
    }

    @Override // com.google.android.gms.internal.measurement.w0
    public final long F() {
        return w0.k(H());
    }

    @Override // com.google.android.gms.internal.measurement.w0
    public final int G() {
        return M();
    }

    @Override // com.google.android.gms.internal.measurement.w0
    public final long H() {
        long j;
        long j2;
        long j3;
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
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            long j4 = (-2080896) ^ i9;
                            i4 = i8;
                            j = j4;
                        } else {
                            i6 = i + 5;
                            long j5 = ((long) i9) ^ (((long) bArr[i8]) << 28);
                            if (j5 >= 0) {
                                j2 = 266354560;
                            } else {
                                int i10 = i + 6;
                                long j6 = j5 ^ (((long) bArr[i6]) << 35);
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i6 = i + 7;
                                    j5 = j6 ^ (((long) bArr[i10]) << 42);
                                    if (j5 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i10 = i + 8;
                                        j6 = j5 ^ (((long) bArr[i6]) << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i6 = i + 9;
                                            j5 = j6 ^ (((long) bArr[i10]) << 56);
                                            if (j5 >= 0) {
                                                j2 = 71499008037633920L;
                                            } else {
                                                int i11 = i + 10;
                                                long j7 = j5 ^ (((long) bArr[i6]) << 63);
                                                if (j7 >= 0) {
                                                    j = j7 ^ (-9151873028817141888L);
                                                    i4 = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = j6 ^ j3;
                                i4 = i10;
                            }
                            j = j5 ^ j2;
                        }
                    }
                    i4 = i6;
                }
                this.g = i4;
                return j;
            }
        }
        return I();
    }

    public final long I() throws t1 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.g;
            if (i2 == this.e) {
                androidx.transition.k.q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0L;
            }
            this.g = i2 + 1;
            byte b = this.d[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        androidx.transition.k.q("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    public final int J() throws t1 {
        int i = this.g;
        if (this.e - i < 4) {
            androidx.transition.k.q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.g = i + 4;
        byte[] bArr = this.d;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public final long K() throws t1 {
        int i = this.g;
        if (this.e - i < 8) {
            androidx.transition.k.q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0L;
        }
        this.g = i + 8;
        byte[] bArr = this.d;
        long j = bArr[i];
        long j2 = (((long) bArr[i + 1]) & 255) << 8;
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        return ((((long) bArr[i + 6]) & 255) << 48) | (j & 255) | j2 | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public final byte[] L(int i) throws t1 {
        if (i > 0) {
            int i2 = this.e;
            int i3 = this.g;
            if (i <= i2 - i3) {
                int i4 = i + i3;
                this.g = i4;
                return Arrays.copyOfRange(this.d, i3, i4);
            }
        }
        if (i > 0) {
            androidx.transition.k.q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
        if (i == 0) {
            return p1.a;
        }
        androidx.transition.k.q("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return null;
    }

    public final int M() {
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
        return (int) I();
    }

    @Override // com.google.android.gms.internal.measurement.w0
    public final int a(int i) throws t1 {
        if (i < 0) {
            androidx.transition.k.q("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        int i2 = i + this.g;
        if (i2 < 0) {
            androidx.transition.k.q("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return 0;
        }
        int i3 = this.i;
        if (i2 > i3) {
            androidx.transition.k.q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.i = i2;
        int i4 = this.e + this.f;
        this.e = i4;
        if (i4 <= i2) {
            this.f = 0;
            return i3;
        }
        int i5 = i4 - i2;
        this.f = i5;
        this.e = i4 - i5;
        return i3;
    }

    @Override // com.google.android.gms.internal.measurement.w0
    public final void b(int i) {
        this.i = i;
        int i2 = this.e + this.f;
        this.e = i2;
        if (i2 <= i) {
            this.f = 0;
            return;
        }
        int i3 = i2 - i;
        this.f = i3;
        this.e = i2 - i3;
    }

    @Override // com.google.android.gms.internal.measurement.w0
    public final int c() {
        int i = this.i;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - this.g;
    }

    @Override // com.google.android.gms.internal.measurement.w0
    public final boolean d() {
        return this.g == this.e;
    }

    @Override // com.google.android.gms.internal.measurement.w0
    public final int e() {
        return this.g;
    }

    @Override // com.google.android.gms.internal.measurement.w0
    public final int f(byte[] bArr, int i, int i2) {
        if ((bArr.length - i) - i2 < 0 || (i | i2) < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        int iMin = Math.min(i2, this.e - this.g);
        if (iMin == 0) {
            return -1;
        }
        System.arraycopy(this.d, this.g, bArr, i, iMin);
        this.g += iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.measurement.w0
    public final void g(int i) throws t1 {
        if (i >= 0) {
            int i2 = this.e;
            int i3 = this.g;
            if (i <= i2 - i3) {
                this.g = i3 + i;
                return;
            }
        }
        if (i < 0) {
            androidx.transition.k.q("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else {
            androidx.transition.k.q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.w0
    public final int l() throws t1 {
        if (d()) {
            this.h = 0;
            return 0;
        }
        int iM = M();
        this.h = iM;
        if ((iM >>> 3) != 0) {
            return iM;
        }
        androidx.transition.k.q("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.w0
    public final void m(int i) throws t1 {
        if (this.h == i) {
            return;
        }
        androidx.transition.k.q("Protocol message end-group tag did not match expected tag.");
    }

    @Override // com.google.android.gms.internal.measurement.w0
    public final boolean n(int i) throws t1 {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                g(8);
                return true;
            }
            if (i2 == 2) {
                g(M());
                return true;
            }
            if (i2 == 3) {
                i();
                m(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                if (this.b == 0) {
                    m(0);
                }
                return false;
            }
            if (i2 == 5) {
                g(4);
                return true;
            }
            androidx.transition.k.p();
            return false;
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
            androidx.transition.k.q("CodedInputStream encountered a malformed varint.");
            return false;
        }
        while (i3 < 10) {
            int i6 = this.g;
            if (i6 == this.e) {
                androidx.transition.k.q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return false;
            }
            this.g = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        androidx.transition.k.q("CodedInputStream encountered a malformed varint.");
        return false;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.w0
    public final double o() {
        return Double.longBitsToDouble(K());
    }

    @Override // com.google.android.gms.internal.measurement.w0
    public final float p() {
        return Float.intBitsToFloat(J());
    }

    @Override // com.google.android.gms.internal.measurement.w0
    public final long q() {
        return H();
    }

    @Override // com.google.android.gms.internal.measurement.w0
    public final long r() {
        return H();
    }

    @Override // com.google.android.gms.internal.measurement.w0
    public final int s() {
        return M();
    }

    @Override // com.google.android.gms.internal.measurement.w0
    public final long t() {
        return K();
    }

    @Override // com.google.android.gms.internal.measurement.w0
    public final int u() {
        return J();
    }

    @Override // com.google.android.gms.internal.measurement.w0
    public final boolean v() {
        return H() != 0;
    }

    @Override // com.google.android.gms.internal.measurement.w0
    public final String w() throws t1 {
        int iM = M();
        if (iM > 0) {
            int i = this.e;
            int i2 = this.g;
            if (iM <= i - i2) {
                String str = new String(this.d, i2, iM, StandardCharsets.UTF_8);
                this.g += iM;
                return str;
            }
        }
        if (iM == 0) {
            return "";
        }
        if (iM < 0) {
            androidx.transition.k.q("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        androidx.transition.k.q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.w0
    public final String x() throws t1 {
        int iM = M();
        if (iM > 0) {
            int i = this.e;
            int i2 = this.g;
            if (iM <= i - i2) {
                String strD = z2.d(this.d, i2, iM);
                this.g += iM;
                return strD;
            }
        }
        if (iM == 0) {
            return "";
        }
        if (iM <= 0) {
            androidx.transition.k.q("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        androidx.transition.k.q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.w0
    public final s0 y() throws t1 {
        int iM = M();
        if (iM > 0) {
            int i = this.e;
            int i2 = this.g;
            if (iM <= i - i2) {
                s0 s0VarK = t0.k(this.d, i2, iM);
                this.g += iM;
                return s0VarK;
            }
        }
        if (iM == 0) {
            return t0.y;
        }
        byte[] bArrL = L(iM);
        s0 s0Var = t0.y;
        return bArrL.length == 0 ? t0.y : new s0(bArrL);
    }

    @Override // com.google.android.gms.internal.measurement.w0
    public final byte[] z() {
        return L(M());
    }
}
