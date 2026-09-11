package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends w {
    public final byte[] c;
    public final int d;
    public int e;
    public final OutputStream f;

    public v(OutputStream outputStream, int i) {
        if (outputStream == null) {
            com.google.gson.b.h("out");
            throw null;
        }
        this.f = outputStream;
        if (i < 0) {
            net.luminis.tls.engine.impl.c.o("bufferSize must be >= 0");
            throw null;
        }
        byte[] bArr = new byte[Math.max(i, 20)];
        this.c = bArr;
        this.d = bArr.length;
    }

    public final void A(int i) {
        int i2 = this.e;
        byte[] bArr = this.c;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.e = i2 + 4;
    }

    public final void B(long j) {
        int i = this.e;
        byte[] bArr = this.c;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
        this.e = i + 8;
    }

    public final void C(int i, int i2) {
        D((i << 3) | i2);
    }

    public final void D(int i) {
        boolean z = w.b;
        byte[] bArr = this.c;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.e;
                if (i2 == 0) {
                    this.e = i3 + 1;
                    l2.k(bArr, i3, (byte) i);
                    return;
                } else {
                    this.e = i3 + 1;
                    l2.k(bArr, i3, (byte) (i | 128));
                    i >>>= 7;
                }
            }
        } else {
            while (true) {
                int i4 = i & (-128);
                int i5 = this.e;
                if (i4 == 0) {
                    this.e = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                } else {
                    this.e = i5 + 1;
                    bArr[i5] = (byte) (i | 128);
                    i >>>= 7;
                }
            }
        }
    }

    public final void E(long j) {
        boolean z = w.b;
        byte[] bArr = this.c;
        if (z) {
            while (true) {
                long j2 = j & (-128);
                int i = this.e;
                if (j2 == 0) {
                    this.e = i + 1;
                    l2.k(bArr, i, (byte) j);
                    return;
                } else {
                    this.e = i + 1;
                    l2.k(bArr, i, (byte) (((int) j) | 128));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                long j3 = j & (-128);
                int i2 = this.e;
                if (j3 == 0) {
                    this.e = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    this.e = i2 + 1;
                    bArr[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                }
            }
        }
    }

    public final void F() {
        this.f.write(this.c, 0, this.e);
        this.e = 0;
    }

    public final void G(int i) {
        if (this.d - this.e < i) {
            F();
        }
    }

    public final void H(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.e;
        int i4 = this.d;
        int i5 = i4 - i3;
        byte[] bArr2 = this.c;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.e += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.e = i4;
        F();
        if (i7 > i4) {
            this.f.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.e = i7;
        }
    }

    @Override // com.google.protobuf.f
    public final void a(byte[] bArr, int i, int i2) throws IOException {
        H(bArr, i, i2);
    }

    @Override // com.google.protobuf.w
    public final void h(byte b) {
        if (this.e == this.d) {
            F();
        }
        int i = this.e;
        this.c[i] = b;
        this.e = i + 1;
    }

    @Override // com.google.protobuf.w
    public final void i(int i, boolean z) {
        G(11);
        C(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.e;
        this.c[i2] = b;
        this.e = i2 + 1;
    }

    @Override // com.google.protobuf.w
    public final void j(byte[] bArr, int i) throws IOException {
        x(i);
        H(bArr, 0, i);
    }

    @Override // com.google.protobuf.w
    public final void k(int i, ByteString byteString) {
        v(i, 2);
        l(byteString);
    }

    @Override // com.google.protobuf.w
    public final void l(ByteString byteString) {
        x(byteString.size());
        byteString.writeTo(this);
    }

    @Override // com.google.protobuf.w
    public final void m(int i, int i2) {
        G(14);
        C(i, 5);
        A(i2);
    }

    @Override // com.google.protobuf.w
    public final void n(int i) {
        G(4);
        A(i);
    }

    @Override // com.google.protobuf.w
    public final void o(int i, long j) {
        G(18);
        C(i, 1);
        B(j);
    }

    @Override // com.google.protobuf.w
    public final void p(long j) {
        G(8);
        B(j);
    }

    @Override // com.google.protobuf.w
    public final void q(int i, int i2) {
        G(20);
        C(i, 0);
        if (i2 >= 0) {
            D(i2);
        } else {
            E(i2);
        }
    }

    @Override // com.google.protobuf.w
    public final void r(int i) {
        if (i >= 0) {
            x(i);
        } else {
            z(i);
        }
    }

    @Override // com.google.protobuf.w
    public final void s(l1 l1Var) {
        x(l1Var.getSerializedSize());
        l1Var.writeTo(this);
    }

    @Override // com.google.protobuf.w
    public final void t(int i, String str) throws IOException {
        v(i, 2);
        u(str);
    }

    @Override // com.google.protobuf.w
    public final void u(String str) throws IOException {
        int length = str.length() * 3;
        int iF = w.f(length);
        int i = iF + length;
        int i2 = this.d;
        if (i > i2) {
            byte[] bArr = new byte[length];
            int iH = o2.a.h(str, bArr, 0, length);
            x(iH);
            H(bArr, 0, iH);
            return;
        }
        if (i > i2 - this.e) {
            F();
        }
        int iF2 = w.f(str.length());
        int i3 = this.e;
        byte[] bArr2 = this.c;
        try {
            if (iF2 == iF) {
                int i4 = i3 + iF2;
                this.e = i4;
                int iH2 = o2.a.h(str, bArr2, i4, i2 - i4);
                this.e = i3;
                D((iH2 - i3) - iF2);
                this.e = iH2;
            } else {
                int iA = o2.a(str);
                D(iA);
                this.e = o2.a.h(str, bArr2, this.e, iA);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new androidx.datastore.preferences.protobuf.i(e);
        }
    }

    @Override // com.google.protobuf.w
    public final void v(int i, int i2) {
        x((i << 3) | i2);
    }

    @Override // com.google.protobuf.w
    public final void w(int i, int i2) {
        G(20);
        C(i, 0);
        D(i2);
    }

    @Override // com.google.protobuf.w
    public final void x(int i) {
        G(5);
        D(i);
    }

    @Override // com.google.protobuf.w
    public final void y(int i, long j) {
        G(20);
        C(i, 0);
        E(j);
    }

    @Override // com.google.protobuf.w
    public final void z(long j) {
        G(10);
        E(j);
    }
}
