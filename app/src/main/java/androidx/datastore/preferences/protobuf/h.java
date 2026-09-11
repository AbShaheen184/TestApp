package androidx.datastore.preferences.protobuf;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends androidx.core.view.w0 {
    public final FileInputStream A;
    public final byte[] B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H = Integer.MAX_VALUE;

    public h(FileInputStream fileInputStream) {
        Charset charset = v.a;
        this.A = fileInputStream;
        this.B = new byte[4096];
        this.C = 0;
        this.E = 0;
        this.G = 0;
    }

    @Override // androidx.core.view.w0
    public final int A() {
        return U();
    }

    @Override // androidx.core.view.w0
    public final long B() {
        return V();
    }

    @Override // androidx.core.view.w0
    public final int C() {
        return S();
    }

    @Override // androidx.core.view.w0
    public final long D() {
        return T();
    }

    @Override // androidx.core.view.w0
    public final int E() {
        int iU = U();
        return (-(iU & 1)) ^ (iU >>> 1);
    }

    @Override // androidx.core.view.w0
    public final long F() {
        long jV = V();
        return (-(jV & 1)) ^ (jV >>> 1);
    }

    @Override // androidx.core.view.w0
    public final String G() throws x {
        int iU = U();
        byte[] bArr = this.B;
        if (iU > 0) {
            int i = this.C;
            int i2 = this.E;
            if (iU <= i - i2) {
                String str = new String(bArr, i2, iU, v.a);
                this.E += iU;
                return str;
            }
        }
        if (iU == 0) {
            return "";
        }
        if (iU < 0) {
            throw x.d();
        }
        if (iU > this.C) {
            return new String(P(iU), v.a);
        }
        Y(iU);
        String str2 = new String(bArr, this.E, iU, v.a);
        this.E += iU;
        return str2;
    }

    @Override // androidx.core.view.w0
    public final String H() throws IOException {
        int iU = U();
        int i = this.E;
        int i2 = this.C;
        int i3 = i2 - i;
        byte[] bArrP = this.B;
        if (iU <= i3 && iU > 0) {
            this.E = i + iU;
        } else {
            if (iU == 0) {
                return "";
            }
            if (iU < 0) {
                throw x.d();
            }
            i = 0;
            if (iU <= i2) {
                Y(iU);
                this.E = iU;
            } else {
                bArrP = P(iU);
            }
        }
        return j1.a.j(bArrP, i, iU);
    }

    @Override // androidx.core.view.w0
    public final int I() throws x {
        if (l()) {
            this.F = 0;
            return 0;
        }
        int iU = U();
        this.F = iU;
        if ((iU >>> 3) != 0) {
            return iU;
        }
        throw new x("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.core.view.w0
    public final int J() {
        return U();
    }

    @Override // androidx.core.view.w0
    public final long K() {
        return V();
    }

    @Override // androidx.core.view.w0
    public final boolean L(int i) throws x {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                Z(8);
                return true;
            }
            if (i2 == 2) {
                Z(U());
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
            Z(4);
            return true;
        }
        int i4 = this.C - this.E;
        byte[] bArr = this.B;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.E;
                this.E = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw x.c();
        }
        while (i3 < 10) {
            if (this.E == this.C) {
                Y(1);
            }
            int i6 = this.E;
            this.E = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw x.c();
        return true;
    }

    public final byte[] P(int i) throws IOException {
        byte[] bArrQ = Q(i);
        if (bArrQ != null) {
            return bArrQ;
        }
        int i2 = this.E;
        int i3 = this.C;
        int length = i3 - i2;
        this.G += i3;
        this.E = 0;
        this.C = 0;
        ArrayList<byte[]> arrayListR = R(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.B, i2, bArr, 0, length);
        for (byte[] bArr2 : arrayListR) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] Q(int i) throws IOException {
        if (i == 0) {
            return v.b;
        }
        if (i < 0) {
            throw x.d();
        }
        int i2 = this.G;
        int i3 = this.E;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw new x("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.H;
        if (i4 > i5) {
            Z((i5 - i2) - i3);
            throw x.e();
        }
        int i6 = this.C - i3;
        int i7 = i - i6;
        FileInputStream fileInputStream = this.A;
        if (i7 >= 4096) {
            try {
                if (i7 > fileInputStream.available()) {
                    return null;
                }
            } catch (x e) {
                e.e = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.B, this.E, bArr, 0, i6);
        this.G += this.C;
        this.E = 0;
        this.C = 0;
        while (i6 < i) {
            try {
                int i8 = fileInputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw x.e();
                }
                this.G += i8;
                i6 += i8;
            } catch (x e2) {
                e2.e = true;
                throw e2;
            }
        }
        return bArr;
    }

    public final ArrayList R(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.A.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw x.e();
                }
                this.G += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int S() throws x {
        int i = this.E;
        if (this.C - i < 4) {
            Y(4);
            i = this.E;
        }
        this.E = i + 4;
        byte[] bArr = this.B;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long T() throws x {
        int i = this.E;
        if (this.C - i < 8) {
            Y(8);
            i = this.E;
        }
        this.E = i + 8;
        byte[] bArr = this.B;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public final int U() {
        int i;
        int i2 = this.E;
        int i3 = this.C;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.B;
            byte b = bArr[i2];
            if (b >= 0) {
                this.E = i4;
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
                this.E = i5;
                return i;
            }
        }
        return (int) W();
    }

    public final long V() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.E;
        int i2 = this.C;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.B;
            byte b = bArr[i];
            if (b >= 0) {
                this.E = i3;
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
                this.E = i4;
                return j;
            }
        }
        return W();
    }

    public final long W() throws x {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.E == this.C) {
                Y(1);
            }
            int i2 = this.E;
            this.E = i2 + 1;
            byte b = this.B[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw x.c();
    }

    public final void X() {
        int i = this.C + this.D;
        this.C = i;
        int i2 = this.G + i;
        int i3 = this.H;
        if (i2 <= i3) {
            this.D = 0;
            return;
        }
        int i4 = i2 - i3;
        this.D = i4;
        this.C = i - i4;
    }

    public final void Y(int i) throws x {
        if (a0(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.G) - this.E) {
            throw x.e();
        }
        throw new x("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void Z(int i) throws x {
        int i2 = this.C;
        int i3 = this.E;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.E = i3 + i;
            return;
        }
        FileInputStream fileInputStream = this.A;
        if (i < 0) {
            throw x.d();
        }
        int i5 = this.G;
        int i6 = i5 + i3;
        int i7 = i6 + i;
        int i8 = this.H;
        if (i7 > i8) {
            Z((i8 - i5) - i3);
            throw x.e();
        }
        this.G = i6;
        this.C = 0;
        this.E = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long jSkip = fileInputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } catch (x e) {
                    e.e = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.G += i4;
                X();
                throw th;
            }
        }
        this.G += i4;
        X();
        if (i4 >= i) {
            return;
        }
        int i9 = this.C;
        int i10 = i9 - this.E;
        this.E = i9;
        Y(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.C;
            if (i11 <= i12) {
                this.E = i11;
                return;
            } else {
                i10 += i12;
                this.E = i12;
                Y(1);
            }
        }
    }

    @Override // androidx.core.view.w0
    public final void a(int i) throws x {
        if (this.F != i) {
            throw new x("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final boolean a0(int i) throws IOException {
        FileInputStream fileInputStream = this.A;
        int i2 = this.E;
        int i3 = i2 + i;
        int i4 = this.C;
        if (i3 <= i4) {
            net.luminis.tls.engine.impl.c.r(androidx.privacysandbox.ads.adservices.java.internal.a.p("refillBuffer() called when ", i, " bytes were already available in buffer"));
            return false;
        }
        int i5 = this.G;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.H) {
            byte[] bArr = this.B;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.G += i2;
                this.C -= i2;
                this.E = 0;
            }
            int i6 = this.C;
            try {
                int i7 = fileInputStream.read(bArr, i6, Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.G) - i6));
                if (i7 == 0 || i7 < -1 || i7 > bArr.length) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
                }
                if (i7 > 0) {
                    this.C += i7;
                    X();
                    if (this.C >= i) {
                        return true;
                    }
                    return a0(i);
                }
            } catch (x e) {
                e.e = true;
                throw e;
            }
        }
        return false;
    }

    @Override // androidx.core.view.w0
    public final int k() {
        return this.G + this.E;
    }

    @Override // androidx.core.view.w0
    public final boolean l() {
        return this.E == this.C && !a0(1);
    }

    @Override // androidx.core.view.w0
    public final void r(int i) {
        this.H = i;
        X();
    }

    @Override // androidx.core.view.w0
    public final int s(int i) throws x {
        if (i < 0) {
            throw x.d();
        }
        int i2 = this.G + this.E + i;
        if (i2 < 0) {
            throw new x("Failed to parse the message.");
        }
        int i3 = this.H;
        if (i2 > i3) {
            throw x.e();
        }
        this.H = i2;
        X();
        return i3;
    }

    @Override // androidx.core.view.w0
    public final boolean t() {
        return V() != 0;
    }

    @Override // androidx.core.view.w0
    public final f u() throws IOException {
        int iU = U();
        int i = this.C;
        int i2 = this.E;
        int i3 = i - i2;
        byte[] bArr = this.B;
        if (iU <= i3 && iU > 0) {
            f fVarD = f.d(bArr, i2, iU);
            this.E += iU;
            return fVarD;
        }
        if (iU == 0) {
            return f.z;
        }
        if (iU < 0) {
            throw x.d();
        }
        byte[] bArrQ = Q(iU);
        if (bArrQ != null) {
            return f.d(bArrQ, 0, bArrQ.length);
        }
        int i4 = this.E;
        int i5 = this.C;
        int length = i5 - i4;
        this.G += i5;
        this.E = 0;
        this.C = 0;
        ArrayList<byte[]> arrayListR = R(iU - length);
        byte[] bArr2 = new byte[iU];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        for (byte[] bArr3 : arrayListR) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        f fVar = f.z;
        return new f(bArr2);
    }

    @Override // androidx.core.view.w0
    public final double v() {
        return Double.longBitsToDouble(T());
    }

    @Override // androidx.core.view.w0
    public final int w() {
        return U();
    }

    @Override // androidx.core.view.w0
    public final int x() {
        return S();
    }

    @Override // androidx.core.view.w0
    public final long y() {
        return T();
    }

    @Override // androidx.core.view.w0
    public final float z() {
        return Float.intBitsToFloat(S());
    }
}
