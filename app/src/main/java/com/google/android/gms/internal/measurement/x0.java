package com.google.android.gms.internal.measurement;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends z0 {
    public final byte[] c;
    public final int d;
    public int e;

    public x0(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            Locale locale = Locale.US;
            net.luminis.tls.engine.impl.c.o(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("Array range is invalid. Buffer.length=", length, ", offset=0, length=", i));
            throw null;
        }
        this.c = bArr;
        this.e = 0;
        this.d = i;
    }

    @Override // com.google.android.gms.internal.measurement.z0
    public final void c(byte[] bArr, int i, int i2) throws androidx.datastore.preferences.protobuf.i {
        w(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.z0
    public final void d(int i, int i2) throws androidx.datastore.preferences.protobuf.i {
        r((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.measurement.z0
    public final void e(int i, int i2) throws androidx.datastore.preferences.protobuf.i {
        r(i << 3);
        q(i2);
    }

    @Override // com.google.android.gms.internal.measurement.z0
    public final void f(int i, int i2) throws androidx.datastore.preferences.protobuf.i {
        r(i << 3);
        r(i2);
    }

    @Override // com.google.android.gms.internal.measurement.z0
    public final void g(int i, int i2) throws androidx.datastore.preferences.protobuf.i {
        r((i << 3) | 5);
        s(i2);
    }

    @Override // com.google.android.gms.internal.measurement.z0
    public final void h(int i, long j) throws androidx.datastore.preferences.protobuf.i {
        r(i << 3);
        t(j);
    }

    @Override // com.google.android.gms.internal.measurement.z0
    public final void i(int i, long j) throws androidx.datastore.preferences.protobuf.i {
        r((i << 3) | 1);
        u(j);
    }

    @Override // com.google.android.gms.internal.measurement.z0
    public final void j(int i, boolean z) throws androidx.datastore.preferences.protobuf.i {
        r(i << 3);
        p(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.z0
    public final void k(int i, String str) throws androidx.datastore.preferences.protobuf.i {
        r((i << 3) | 2);
        v(str);
    }

    @Override // com.google.android.gms.internal.measurement.z0
    public final void l(int i, t0 t0Var) throws androidx.datastore.preferences.protobuf.i {
        r((i << 3) | 2);
        m(t0Var);
    }

    @Override // com.google.android.gms.internal.measurement.z0
    public final void m(t0 t0Var) throws androidx.datastore.preferences.protobuf.i {
        r(t0Var.c());
        t0Var.f(this);
    }

    @Override // com.google.android.gms.internal.measurement.z0
    public final void n(byte[] bArr, int i) throws androidx.datastore.preferences.protobuf.i {
        r(i);
        w(bArr, 0, i);
    }

    @Override // com.google.android.gms.internal.measurement.z0
    public final void o(m0 m0Var) throws androidx.datastore.preferences.protobuf.i {
        i1 i1Var = (i1) m0Var;
        r(i1Var.n());
        i1Var.f(this);
    }

    @Override // com.google.android.gms.internal.measurement.z0
    public final void p(byte b) throws androidx.datastore.preferences.protobuf.i {
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

    @Override // com.google.android.gms.internal.measurement.z0
    public final void q(int i) throws androidx.datastore.preferences.protobuf.i {
        if (i >= 0) {
            r(i);
        } else {
            t(i);
        }
    }

    @Override // com.google.android.gms.internal.measurement.z0
    public final void r(int i) throws androidx.datastore.preferences.protobuf.i {
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

    @Override // com.google.android.gms.internal.measurement.z0
    public final void s(int i) throws androidx.datastore.preferences.protobuf.i {
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

    @Override // com.google.android.gms.internal.measurement.z0
    public final void t(long j) throws androidx.datastore.preferences.protobuf.i {
        int i;
        int i2 = this.e;
        byte[] bArr = this.c;
        int i3 = this.d;
        if (!z0.b || i3 - i2 < 10) {
            while ((j & (-128)) != 0) {
                int i4 = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i2 = i4;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    i = i4;
                    throw new androidx.datastore.preferences.protobuf.i(i, i3, 1, e);
                }
            }
            i = i2 + 1;
            try {
                bArr[i2] = (byte) j;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                throw new androidx.datastore.preferences.protobuf.i(i, i3, 1, e);
            }
        } else {
            while ((j & (-128)) != 0) {
                x2.k(bArr, i2, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            x2.k(bArr, i2, (byte) j);
        }
        this.e = i;
    }

    @Override // com.google.android.gms.internal.measurement.z0
    public final void u(long j) throws androidx.datastore.preferences.protobuf.i {
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

    @Override // com.google.android.gms.internal.measurement.z0
    public final void v(String str) throws androidx.datastore.preferences.protobuf.i {
        int i = this.e;
        try {
            int iA = z0.a(str.length() * 3);
            int iA2 = z0.a(str.length());
            byte[] bArr = this.c;
            if (iA2 != iA) {
                r(z2.b(str));
                int i2 = this.e;
                this.e = z2.c(str, bArr, i2, bArr.length - i2);
            } else {
                int i3 = i + iA2;
                this.e = i3;
                int iC = z2.c(str, bArr, i3, bArr.length - i3);
                this.e = i;
                r((iC - i) - iA2);
                this.e = iC;
            }
        } catch (IndexOutOfBoundsException e) {
            throw new androidx.datastore.preferences.protobuf.i(e);
        }
    }

    public final void w(byte[] bArr, int i, int i2) throws androidx.datastore.preferences.protobuf.i {
        try {
            System.arraycopy(bArr, i, this.c, this.e, i2);
            this.e += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new androidx.datastore.preferences.protobuf.i(this.e, this.d, i2, e);
        }
    }

    public final int x() {
        return this.d - this.e;
    }
}
