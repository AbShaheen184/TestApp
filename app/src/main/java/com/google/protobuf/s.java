package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends t {
    public final InputStream d;
    public final byte[] e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k = Integer.MAX_VALUE;

    public s(InputStream inputStream) {
        byte[] bArr = u0.a;
        if (inputStream == null) {
            com.google.gson.b.h("input");
            throw null;
        }
        this.d = inputStream;
        this.e = new byte[4096];
        this.f = 0;
        this.h = 0;
        this.j = 0;
    }

    @Override // com.google.protobuf.t
    public final int A() {
        return J();
    }

    @Override // com.google.protobuf.t
    public final long B() {
        return K();
    }

    @Override // com.google.protobuf.t
    public final boolean C(int i) throws x0 {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                O(8);
                return true;
            }
            if (i2 == 2) {
                O(J());
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
            O(4);
            return true;
        }
        int i4 = this.f - this.h;
        byte[] bArr = this.e;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.h;
                this.h = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw x0.d();
        }
        while (i3 < 10) {
            if (this.h == this.f) {
                N(1);
            }
            int i6 = this.h;
            this.h = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw x0.d();
        return true;
    }

    public final byte[] E(int i) throws IOException {
        byte[] bArrF = F(i);
        if (bArrF != null) {
            return bArrF;
        }
        int i2 = this.h;
        int i3 = this.f;
        int length = i3 - i2;
        this.j += i3;
        this.h = 0;
        this.f = 0;
        ArrayList<byte[]> arrayListG = G(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.e, i2, bArr, 0, length);
        for (byte[] bArr2 : arrayListG) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] F(int i) throws IOException {
        if (i == 0) {
            return u0.a;
        }
        if (i < 0) {
            throw x0.e();
        }
        int i2 = this.j;
        int i3 = this.h;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw new x0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i5 = this.k;
        if (i4 > i5) {
            O((i5 - i2) - i3);
            throw x0.g();
        }
        int i6 = this.f - i3;
        int i7 = i - i6;
        InputStream inputStream = this.d;
        if (i7 >= 4096) {
            try {
                if (i7 > inputStream.available()) {
                    return null;
                }
            } catch (x0 e) {
                e.e = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.e, this.h, bArr, 0, i6);
        this.j += this.f;
        this.h = 0;
        this.f = 0;
        while (i6 < i) {
            try {
                int i8 = inputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw x0.g();
                }
                this.j += i8;
                i6 += i8;
            } catch (x0 e2) {
                e2.e = true;
                throw e2;
            }
        }
        return bArr;
    }

    public final ArrayList G(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                try {
                    int i3 = this.d.read(bArr, i2, iMin - i2);
                    if (i3 == -1) {
                        throw x0.g();
                    }
                    this.j += i3;
                    i2 += i3;
                } catch (x0 e) {
                    e.e = true;
                    throw e;
                }
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int H() throws x0 {
        int i = this.h;
        if (this.f - i < 4) {
            N(4);
            i = this.h;
        }
        this.h = i + 4;
        byte[] bArr = this.e;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long I() throws x0 {
        int i = this.h;
        if (this.f - i < 8) {
            N(8);
            i = this.h;
        }
        this.h = i + 8;
        byte[] bArr = this.e;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public final int J() {
        int i;
        int i2 = this.h;
        int i3 = this.f;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.e;
            byte b = bArr[i2];
            if (b >= 0) {
                this.h = i4;
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
                this.h = i5;
                return i;
            }
        }
        return (int) L();
    }

    public final long K() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.h;
        int i2 = this.f;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.e;
            byte b = bArr[i];
            if (b >= 0) {
                this.h = i3;
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
                this.h = i4;
                return j;
            }
        }
        return L();
    }

    public final long L() throws x0 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.h == this.f) {
                N(1);
            }
            int i2 = this.h;
            this.h = i2 + 1;
            byte b = this.e[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw x0.d();
    }

    public final void M() {
        int i = this.f + this.g;
        this.f = i;
        int i2 = this.j + i;
        int i3 = this.k;
        if (i2 <= i3) {
            this.g = 0;
            return;
        }
        int i4 = i2 - i3;
        this.g = i4;
        this.f = i - i4;
    }

    public final void N(int i) throws x0 {
        if (P(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.j) - this.h) {
            throw x0.g();
        }
        throw new x0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    public final void O(int i) throws x0 {
        int i2 = this.f;
        int i3 = this.h;
        if (i <= i2 - i3 && i >= 0) {
            this.h = i3 + i;
            return;
        }
        InputStream inputStream = this.d;
        if (i < 0) {
            throw x0.e();
        }
        int i4 = this.j;
        int i5 = i4 + i3;
        int i6 = i5 + i;
        int i7 = this.k;
        if (i6 > i7) {
            O((i7 - i4) - i3);
            throw x0.g();
        }
        this.j = i5;
        int i8 = i2 - i3;
        this.f = 0;
        this.h = 0;
        while (i8 < i) {
            long j = i - i8;
            try {
                try {
                    long jSkip = inputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i8 += (int) jSkip;
                    }
                } catch (x0 e) {
                    e.e = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.j += i8;
                M();
                throw th;
            }
        }
        this.j += i8;
        M();
        if (i8 >= i) {
            return;
        }
        int i9 = this.f;
        int i10 = i9 - this.h;
        this.h = i9;
        N(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.f;
            if (i11 <= i12) {
                this.h = i11;
                return;
            } else {
                i10 += i12;
                this.h = i12;
                N(1);
            }
        }
    }

    public final boolean P(int i) throws IOException {
        InputStream inputStream = this.d;
        int i2 = this.h;
        int i3 = i2 + i;
        int i4 = this.f;
        if (i3 <= i4) {
            net.luminis.tls.engine.impl.c.r(androidx.privacysandbox.ads.adservices.java.internal.a.p("refillBuffer() called when ", i, " bytes were already available in buffer"));
            return false;
        }
        int i5 = this.j;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.k) {
            byte[] bArr = this.e;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.j += i2;
                this.f -= i2;
                this.h = 0;
            }
            int i6 = this.f;
            try {
                int i7 = inputStream.read(bArr, i6, Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.j) - i6));
                if (i7 == 0 || i7 < -1 || i7 > bArr.length) {
                    throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
                }
                if (i7 > 0) {
                    this.f += i7;
                    M();
                    if (this.f >= i || P(i)) {
                        return true;
                    }
                }
            } catch (x0 e) {
                e.e = true;
                throw e;
            }
        }
        return false;
    }

    @Override // com.google.protobuf.t
    public final void a(int i) throws x0 {
        if (this.i != i) {
            throw new x0("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.protobuf.t
    public final int d() {
        return this.j + this.h;
    }

    @Override // com.google.protobuf.t
    public final boolean e() {
        return this.h == this.f && !P(1);
    }

    @Override // com.google.protobuf.t
    public final void h(int i) {
        this.k = i;
        M();
    }

    @Override // com.google.protobuf.t
    public final int i(int i) throws x0 {
        if (i < 0) {
            throw x0.e();
        }
        int i2 = this.j + this.h + i;
        if (i2 < 0) {
            throw new x0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i3 = this.k;
        if (i2 > i3) {
            throw x0.g();
        }
        this.k = i2;
        M();
        return i3;
    }

    @Override // com.google.protobuf.t
    public final boolean j() {
        return K() != 0;
    }

    @Override // com.google.protobuf.t
    public final ByteString k() throws IOException {
        int iJ = J();
        int i = this.f;
        int i2 = this.h;
        int i3 = i - i2;
        byte[] bArr = this.e;
        if (iJ <= i3 && iJ > 0) {
            ByteString byteStringCopyFrom = ByteString.copyFrom(bArr, i2, iJ, false);
            this.h += iJ;
            return byteStringCopyFrom;
        }
        if (iJ == 0) {
            return ByteString.EMPTY;
        }
        if (iJ < 0) {
            throw x0.e();
        }
        byte[] bArrF = F(iJ);
        if (bArrF != null) {
            return ByteString.copyFrom(bArrF, 0, bArrF.length, false);
        }
        int i4 = this.h;
        int i5 = this.f;
        int length = i5 - i4;
        this.j += i5;
        this.h = 0;
        this.f = 0;
        ArrayList<byte[]> arrayListG = G(iJ - length);
        byte[] bArr2 = new byte[iJ];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        for (byte[] bArr3 : arrayListG) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        return ByteString.wrap(bArr2);
    }

    @Override // com.google.protobuf.t
    public final double l() {
        return Double.longBitsToDouble(I());
    }

    @Override // com.google.protobuf.t
    public final int m() {
        return J();
    }

    @Override // com.google.protobuf.t
    public final int n() {
        return H();
    }

    @Override // com.google.protobuf.t
    public final long o() {
        return I();
    }

    @Override // com.google.protobuf.t
    public final float p() {
        return Float.intBitsToFloat(H());
    }

    @Override // com.google.protobuf.t
    public final int q() {
        return J();
    }

    @Override // com.google.protobuf.t
    public final long r() {
        return K();
    }

    @Override // com.google.protobuf.t
    public final int t() {
        return H();
    }

    @Override // com.google.protobuf.t
    public final long u() {
        return I();
    }

    @Override // com.google.protobuf.t
    public final int v() {
        return t.b(J());
    }

    @Override // com.google.protobuf.t
    public final long w() {
        return t.c(K());
    }

    @Override // com.google.protobuf.t
    public final String x() throws x0 {
        int iJ = J();
        byte[] bArr = this.e;
        if (iJ > 0) {
            int i = this.f;
            int i2 = this.h;
            if (iJ <= i - i2) {
                String str = new String(bArr, i2, iJ, StandardCharsets.UTF_8);
                this.h += iJ;
                return str;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ < 0) {
            throw x0.e();
        }
        if (iJ > this.f) {
            return new String(E(iJ), StandardCharsets.UTF_8);
        }
        N(iJ);
        String str2 = new String(bArr, this.h, iJ, StandardCharsets.UTF_8);
        this.h += iJ;
        return str2;
    }

    @Override // com.google.protobuf.t
    public final String y() throws IOException {
        int iJ = J();
        int i = this.h;
        int i2 = this.f;
        int i3 = i2 - i;
        byte[] bArrE = this.e;
        if (iJ <= i3 && iJ > 0) {
            this.h = i + iJ;
        } else {
            if (iJ == 0) {
                return "";
            }
            if (iJ < 0) {
                throw x0.e();
            }
            i = 0;
            if (iJ <= i2) {
                N(iJ);
                this.h = iJ;
            } else {
                bArrE = E(iJ);
            }
        }
        if (iJ != 0) {
            return o2.a.g(bArrE, i, iJ);
        }
        com.google.android.material.resources.b bVar = o2.a;
        return "";
    }

    @Override // com.google.protobuf.t
    public final int z() throws x0 {
        if (e()) {
            this.i = 0;
            return 0;
        }
        int iJ = J();
        this.i = iJ;
        if ((iJ >>> 3) != 0) {
            return iJ;
        }
        throw x0.a();
    }
}
