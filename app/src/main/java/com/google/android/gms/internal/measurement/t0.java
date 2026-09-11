package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t0 implements Iterable, Serializable {
    public static final s0 y = new s0(p1.a);
    public int e;

    static {
        int i = o0.a;
    }

    public static s0 j(byte[] bArr, int i, int i2) {
        try {
            return k(bArr, i, i2);
        } catch (t1 e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static s0 k(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return y;
        }
        n(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new s0(bArr2);
    }

    public static int n(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i2).length());
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(i3).length());
        sb3.append("End index: ");
        sb3.append(i2);
        sb3.append(" >= ");
        sb3.append(i3);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    public static /* synthetic */ boolean o(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = i + i3;
        n(i, i4, bArr.length);
        n(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public abstract byte b(int i);

    public abstract int c();

    public abstract r0 d(int i, int i2);

    public abstract void e(byte[] bArr, int i);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        int iC = c();
        if (iC != t0Var.c()) {
            return false;
        }
        if (iC == 0) {
            return true;
        }
        int i = this.e;
        int i2 = t0Var.e;
        if (i == 0 || i2 == 0 || i == i2) {
            return h(t0Var);
        }
        return false;
    }

    public abstract void f(z0 z0Var);

    public abstract boolean h(t0 t0Var);

    public final int hashCode() {
        int i = this.e;
        if (i == 0) {
            int iC = c();
            i = i(iC, iC);
            if (i == 0) {
                i = 1;
            }
            this.e = i;
        }
        return i;
    }

    public abstract int i(int i, int i2);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.c(this);
    }

    public final byte[] l() {
        int iC = c();
        if (iC == 0) {
            return p1.a;
        }
        byte[] bArr = new byte[iC];
        e(bArr, iC);
        return bArr;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iC = c();
        String strD = c() <= 50 ? ka.d(l()) : ka.d(d(0, 47).l()).concat("...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iC);
        sb.append(" contents=\"");
        return androidx.privacysandbox.ads.adservices.java.internal.a.u(sb, strD, "\">");
    }
}
