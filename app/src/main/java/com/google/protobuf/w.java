package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w extends f {
    public static final boolean b = l2.e;
    public f1 a;

    public static int b(int i, ByteString byteString) {
        int iE = e(i);
        int size = byteString.size();
        return f(size) + size + iE;
    }

    public static int c(int i) {
        return f((i >> 31) ^ (i << 1));
    }

    public static int d(long j) {
        return g((j >> 63) ^ (j << 1));
    }

    public static int e(int i) {
        return f(i << 3);
    }

    public static int f(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int g(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public abstract void h(byte b2);

    public abstract void i(int i, boolean z);

    public abstract void j(byte[] bArr, int i);

    public abstract void k(int i, ByteString byteString);

    public abstract void l(ByteString byteString);

    public abstract void m(int i, int i2);

    public abstract void n(int i);

    public abstract void o(int i, long j);

    public abstract void p(long j);

    public abstract void q(int i, int i2);

    public abstract void r(int i);

    public abstract void s(l1 l1Var);

    public abstract void t(int i, String str);

    public abstract void u(String str);

    public abstract void v(int i, int i2);

    public abstract void w(int i, int i2);

    public abstract void x(int i);

    public abstract void y(int i, long j);

    public abstract void z(long j);
}
