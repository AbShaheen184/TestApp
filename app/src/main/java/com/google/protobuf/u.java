package com.google.protobuf;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends w {
    public final byte[] c;
    public final int d;
    public int e;

    public u(byte[] bArr, int i) {
        if (((bArr.length - i) | i) < 0) {
            Locale locale = Locale.US;
            net.luminis.tls.engine.impl.c.o(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("Array range is invalid. Buffer.length=", bArr.length, ", offset=0, length=", i));
            throw null;
        }
        this.c = bArr;
        this.e = 0;
        this.d = i;
    }

    public final int A() {
        return this.d - this.e;
    }

    public final void B(byte[] bArr, int i, int i2) throws androidx.datastore.preferences.protobuf.i {
        try {
            System.arraycopy(bArr, i, this.c, this.e, i2);
            this.e += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new androidx.datastore.preferences.protobuf.i(this.e, this.d, i2, e);
        }
    }

    @Override // com.google.protobuf.f
    public final void a(byte[] bArr, int i, int i2) throws androidx.datastore.preferences.protobuf.i {
        B(bArr, i, i2);
    }

    @Override // com.google.protobuf.w
    public final void h(byte b) throws androidx.datastore.preferences.protobuf.i {
        int i = this.e;
        try {
            int i2 = i + 1;
            try {
                this.c[i] = b;
                this.e = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new androidx.datastore.preferences.protobuf.i(i, this.d, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    @Override // com.google.protobuf.w
    public final void i(int i, boolean z) throws androidx.datastore.preferences.protobuf.i {
        v(i, 0);
        h(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.protobuf.w
    public final void j(byte[] bArr, int i) throws androidx.datastore.preferences.protobuf.i {
        x(i);
        B(bArr, 0, i);
    }

    @Override // com.google.protobuf.w
    public final void k(int i, ByteString byteString) throws androidx.datastore.preferences.protobuf.i {
        v(i, 2);
        l(byteString);
    }

    @Override // com.google.protobuf.w
    public final void l(ByteString byteString) throws androidx.datastore.preferences.protobuf.i {
        x(byteString.size());
        byteString.writeTo(this);
    }

    @Override // com.google.protobuf.w
    public final void m(int i, int i2) throws androidx.datastore.preferences.protobuf.i {
        v(i, 5);
        n(i2);
    }

    @Override // com.google.protobuf.w
    public final void n(int i) throws androidx.datastore.preferences.protobuf.i {
        int i2 = this.e;
        try {
            byte[] bArr = this.c;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.e = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new androidx.datastore.preferences.protobuf.i(i2, this.d, 4, e);
        }
    }

    @Override // com.google.protobuf.w
    public final void o(int i, long j) throws androidx.datastore.preferences.protobuf.i {
        v(i, 1);
        p(j);
    }

    @Override // com.google.protobuf.w
    public final void p(long j) throws androidx.datastore.preferences.protobuf.i {
        int i = this.e;
        try {
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
        } catch (IndexOutOfBoundsException e) {
            throw new androidx.datastore.preferences.protobuf.i(i, this.d, 8, e);
        }
    }

    @Override // com.google.protobuf.w
    public final void q(int i, int i2) throws androidx.datastore.preferences.protobuf.i {
        v(i, 0);
        r(i2);
    }

    @Override // com.google.protobuf.w
    public final void r(int i) throws androidx.datastore.preferences.protobuf.i {
        if (i >= 0) {
            x(i);
        } else {
            z(i);
        }
    }

    @Override // com.google.protobuf.w
    public final void s(l1 l1Var) throws androidx.datastore.preferences.protobuf.i {
        x(l1Var.getSerializedSize());
        l1Var.writeTo(this);
    }

    @Override // com.google.protobuf.w
    public final void t(int i, String str) throws androidx.datastore.preferences.protobuf.i {
        v(i, 2);
        u(str);
    }

    @Override // com.google.protobuf.w
    public final void u(String str) throws androidx.datastore.preferences.protobuf.i {
        int i = this.e;
        try {
            int iF = w.f(str.length() * 3);
            int iF2 = w.f(str.length());
            byte[] bArr = this.c;
            if (iF2 != iF) {
                x(o2.a(str));
                int i2 = this.e;
                this.e = o2.a.h(str, bArr, i2, bArr.length - i2);
                return;
            }
            int i3 = i + iF2;
            this.e = i3;
            int iH = o2.a.h(str, bArr, i3, bArr.length - i3);
            this.e = i;
            x((iH - i) - iF2);
            this.e = iH;
        } catch (IndexOutOfBoundsException e) {
            throw new androidx.datastore.preferences.protobuf.i(e);
        }
    }

    @Override // com.google.protobuf.w
    public final void v(int i, int i2) throws androidx.datastore.preferences.protobuf.i {
        x((i << 3) | i2);
    }

    @Override // com.google.protobuf.w
    public final void w(int i, int i2) throws androidx.datastore.preferences.protobuf.i {
        v(i, 0);
        x(i2);
    }

    @Override // com.google.protobuf.w
    public final void x(int i) throws androidx.datastore.preferences.protobuf.i {
        int i2;
        int i3 = this.e;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.c;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.e = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new androidx.datastore.preferences.protobuf.i(i2, this.d, 1, e);
                }
            }
            throw new androidx.datastore.preferences.protobuf.i(i2, this.d, 1, e);
        }
    }

    @Override // com.google.protobuf.w
    public final void y(int i, long j) throws androidx.datastore.preferences.protobuf.i {
        v(i, 0);
        z(j);
    }

    @Override // com.google.protobuf.w
    public final void z(long j) throws androidx.datastore.preferences.protobuf.i {
        int i;
        int i2 = this.e;
        boolean z = w.b;
        byte[] bArr = this.c;
        if (!z || A() < 10) {
            while ((j & (-128)) != 0) {
                i = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i2 = i;
                } catch (IndexOutOfBoundsException e) {
                    throw new androidx.datastore.preferences.protobuf.i(i, this.d, 1, e);
                }
            }
            i = i2 + 1;
            bArr[i2] = (byte) j;
        } else {
            while ((j & (-128)) != 0) {
                l2.k(bArr, i2, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            l2.k(bArr, i2, (byte) j);
        }
        this.e = i;
    }
}
