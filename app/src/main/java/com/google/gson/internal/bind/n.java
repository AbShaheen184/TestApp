package com.google.gson.internal.bind;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends com.google.gson.stream.a {
    public static final m Q = new m();
    public static final Object R = new Object();
    public Object[] M;
    public int N;
    public String[] O;
    public int[] P;

    public final Object A0() {
        return this.M[this.N - 1];
    }

    public final Object B0() {
        Object[] objArr = this.M;
        int i = this.N - 1;
        this.N = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void C0(Object obj) {
        int i = this.N;
        Object[] objArr = this.M;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.M = Arrays.copyOf(objArr, i2);
            this.P = Arrays.copyOf(this.P, i2);
            this.O = (String[]) Arrays.copyOf(this.O, i2);
        }
        Object[] objArr2 = this.M;
        int i3 = this.N;
        this.N = i3 + 1;
        objArr2[i3] = obj;
    }

    @Override // com.google.gson.stream.a
    public final void L() {
        w0(4);
        this.O[this.N - 1] = null;
        B0();
        B0();
        int i = this.N;
        if (i > 0) {
            int[] iArr = this.P;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.a
    public final String X() {
        return x0(false);
    }

    @Override // com.google.gson.stream.a
    public final String Z() {
        return x0(true);
    }

    @Override // com.google.gson.stream.a
    public final void a() {
        w0(1);
        C0(((com.google.gson.g) A0()).e.iterator());
        this.P[this.N - 1] = 0;
    }

    @Override // com.google.gson.stream.a
    public final boolean a0() {
        int iN0 = n0();
        return (iN0 == 4 || iN0 == 2 || iN0 == 10) ? false : true;
    }

    @Override // com.google.gson.stream.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.M = new Object[]{R};
        this.N = 1;
    }

    @Override // com.google.gson.stream.a
    public final boolean d0() {
        w0(8);
        boolean zB = ((com.google.gson.l) B0()).b();
        int i = this.N;
        if (i > 0) {
            int[] iArr = this.P;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return zB;
    }

    @Override // com.google.gson.stream.a
    public final double e0() throws com.google.gson.stream.c {
        int iN0 = n0();
        if (iN0 != 7 && iN0 != 6) {
            com.google.gson.b.i("Expected ", com.google.android.datatransport.runtime.backends.c.x(7), " but was ", com.google.android.datatransport.runtime.backends.c.x(iN0), y0());
            return 0.0d;
        }
        double dJ = ((com.google.gson.l) A0()).j();
        if (this.L != 1 && (Double.isNaN(dJ) || Double.isInfinite(dJ))) {
            throw new com.google.gson.stream.c("JSON forbids NaN and infinities: " + dJ);
        }
        B0();
        int i = this.N;
        if (i > 0) {
            int[] iArr = this.P;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return dJ;
    }

    @Override // com.google.gson.stream.a
    public final int f0() {
        int iN0 = n0();
        if (iN0 != 7 && iN0 != 6) {
            com.google.gson.b.i("Expected ", com.google.android.datatransport.runtime.backends.c.x(7), " but was ", com.google.android.datatransport.runtime.backends.c.x(iN0), y0());
            return 0;
        }
        int iC = ((com.google.gson.l) A0()).c();
        B0();
        int i = this.N;
        if (i > 0) {
            int[] iArr = this.P;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return iC;
    }

    @Override // com.google.gson.stream.a
    public final void g() {
        w0(3);
        C0(((com.google.gson.internal.l) ((com.google.gson.k) A0()).e.entrySet()).iterator());
    }

    @Override // com.google.gson.stream.a
    public final long g0() {
        int iN0 = n0();
        if (iN0 != 7 && iN0 != 6) {
            com.google.gson.b.i("Expected ", com.google.android.datatransport.runtime.backends.c.x(7), " but was ", com.google.android.datatransport.runtime.backends.c.x(iN0), y0());
            return 0L;
        }
        long jF = ((com.google.gson.l) A0()).f();
        B0();
        int i = this.N;
        if (i > 0) {
            int[] iArr = this.P;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return jF;
    }

    @Override // com.google.gson.stream.a
    public final String h0() {
        return z0(false);
    }

    @Override // com.google.gson.stream.a
    public final void j0() {
        w0(9);
        B0();
        int i = this.N;
        if (i > 0) {
            int[] iArr = this.P;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.a
    public final String l0() {
        int iN0 = n0();
        if (iN0 != 6 && iN0 != 7) {
            com.google.gson.b.i("Expected ", com.google.android.datatransport.runtime.backends.c.x(6), " but was ", com.google.android.datatransport.runtime.backends.c.x(iN0), y0());
            return null;
        }
        String strH = ((com.google.gson.l) B0()).h();
        int i = this.N;
        if (i > 0) {
            int[] iArr = this.P;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return strH;
    }

    @Override // com.google.gson.stream.a
    public final int n0() {
        if (this.N == 0) {
            return 10;
        }
        Object objA0 = A0();
        if (objA0 instanceof Iterator) {
            boolean z = this.M[this.N - 2] instanceof com.google.gson.k;
            Iterator it = (Iterator) objA0;
            if (!it.hasNext()) {
                return z ? 4 : 2;
            }
            if (z) {
                return 5;
            }
            C0(it.next());
            return n0();
        }
        if (objA0 instanceof com.google.gson.k) {
            return 3;
        }
        if (objA0 instanceof com.google.gson.g) {
            return 1;
        }
        if (objA0 instanceof com.google.gson.l) {
            Serializable serializable = ((com.google.gson.l) objA0).e;
            if (serializable instanceof String) {
                return 6;
            }
            if (serializable instanceof Boolean) {
                return 8;
            }
            if (serializable instanceof Number) {
                return 7;
            }
            throw new AssertionError();
        }
        if (objA0 instanceof com.google.gson.j) {
            return 9;
        }
        if (objA0 == R) {
            net.luminis.tls.engine.impl.c.r("JsonReader is closed");
            return 0;
        }
        throw new com.google.gson.stream.c("Custom JsonElement subclass " + objA0.getClass().getName() + " is not supported");
    }

    @Override // com.google.gson.stream.a
    public final void t0() {
        int iE = androidx.constraintlayout.core.g.e(n0());
        if (iE == 1) {
            z();
            return;
        }
        if (iE != 9) {
            if (iE == 3) {
                L();
                return;
            }
            if (iE == 4) {
                z0(true);
                return;
            }
            B0();
            int i = this.N;
            if (i > 0) {
                int[] iArr = this.P;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
        }
    }

    @Override // com.google.gson.stream.a
    public final String toString() {
        return n.class.getSimpleName().concat(y0());
    }

    public final void w0(int i) {
        if (n0() == i) {
            return;
        }
        com.google.gson.b.i("Expected ", com.google.android.datatransport.runtime.backends.c.x(i), " but was ", com.google.android.datatransport.runtime.backends.c.x(n0()), y0());
    }

    public final String x0(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.N;
            if (i >= i2) {
                return sb.toString();
            }
            Object[] objArr = this.M;
            Object obj = objArr[i];
            if (obj instanceof com.google.gson.g) {
                i++;
                if (i < i2 && (objArr[i] instanceof Iterator)) {
                    int i3 = this.P[i];
                    if (z && i3 > 0 && (i == i2 - 1 || i == i2 - 2)) {
                        i3--;
                    }
                    sb.append('[');
                    sb.append(i3);
                    sb.append(']');
                }
            } else if ((obj instanceof com.google.gson.k) && (i = i + 1) < i2 && (objArr[i] instanceof Iterator)) {
                sb.append('.');
                String str = this.O[i];
                if (str != null) {
                    sb.append(str);
                }
            }
            i++;
        }
    }

    public final String y0() {
        return " at path ".concat(x0(false));
    }

    @Override // com.google.gson.stream.a
    public final void z() {
        w0(2);
        B0();
        B0();
        int i = this.N;
        if (i > 0) {
            int[] iArr = this.P;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public final String z0(boolean z) {
        w0(5);
        Map.Entry entry = (Map.Entry) ((Iterator) A0()).next();
        String str = (String) entry.getKey();
        this.O[this.N - 1] = z ? "<skipped>" : str;
        C0(entry.getValue());
        return str;
    }
}
