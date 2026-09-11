package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {
    public int a;
    public int b;
    public androidx.compose.foundation.text.selection.w c;

    public static int b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static r f(byte[] bArr, int i, int i2, boolean z) {
        r rVar = new r(bArr, i, i2, z);
        try {
            rVar.i(i2);
            return rVar;
        } catch (x0 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static t g(InputStream inputStream) {
        return inputStream == null ? f(u0.a, 0, 0, false) : new s(inputStream);
    }

    public static int s(InputStream inputStream, int i) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int i4 = inputStream.read();
            if (i4 == -1) {
                throw x0.g();
            }
            i2 |= (i4 & 127) << i3;
            if ((i4 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int i5 = inputStream.read();
            if (i5 == -1) {
                throw x0.g();
            }
            if ((i5 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw x0.d();
    }

    public abstract int A();

    public abstract long B();

    public abstract boolean C(int i);

    public final void D() {
        boolean zC;
        do {
            int iZ = z();
            if (iZ == 0) {
                return;
            }
            int i = this.a;
            int i2 = this.b;
            if (i + i2 >= 100) {
                throw new x0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.b = i2 + 1;
            zC = C(iZ);
            this.b--;
        } while (zC);
    }

    public abstract void a(int i);

    public abstract int d();

    public abstract boolean e();

    public abstract void h(int i);

    public abstract int i(int i);

    public abstract boolean j();

    public abstract ByteString k();

    public abstract double l();

    public abstract int m();

    public abstract int n();

    public abstract long o();

    public abstract float p();

    public abstract int q();

    public abstract long r();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract String x();

    public abstract String y();

    public abstract int z();
}
