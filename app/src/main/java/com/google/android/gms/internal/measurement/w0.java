package com.google.android.gms.internal.measurement;

import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w0 {
    public int a;
    public int b;
    public androidx.compose.foundation.text.selection.w c;

    public static w0 h(InputStream inputStream, int i) {
        if (i <= 0) {
            net.luminis.tls.engine.impl.c.o("bufferSize must be > 0");
            return null;
        }
        if (inputStream != null) {
            return new v0(inputStream, i);
        }
        u0 u0Var = new u0(p1.a);
        try {
            u0Var.a(0);
            return u0Var;
        } catch (t1 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int j(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long k(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public abstract int A();

    public abstract int B();

    public abstract int C();

    public abstract long D();

    public abstract int E();

    public abstract long F();

    public abstract int G();

    public abstract long H();

    public abstract int a(int i);

    public abstract void b(int i);

    public abstract int c();

    public abstract boolean d();

    public abstract int e();

    public abstract int f(byte[] bArr, int i, int i2);

    public abstract void g(int i);

    public final void i() {
        boolean zN;
        do {
            int iL = l();
            if (iL == 0) {
                return;
            }
            int i = this.a;
            int i2 = this.b;
            if (i + i2 >= 100) {
                androidx.transition.k.q("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                return;
            } else {
                this.b = i2 + 1;
                zN = n(iL);
                this.b--;
            }
        } while (zN);
    }

    public abstract int l();

    public abstract void m(int i);

    public abstract boolean n(int i);

    public abstract double o();

    public abstract float p();

    public abstract long q();

    public abstract long r();

    public abstract int s();

    public abstract long t();

    public abstract int u();

    public abstract boolean v();

    public abstract String w();

    public abstract String x();

    public abstract s0 y();

    public abstract byte[] z();
}
