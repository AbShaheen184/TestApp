package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s2 {
    public static final s2 f = new s2(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public s2(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static s2 a() {
        return new s2(0, new int[8], new Object[8], true);
    }

    public final void b(s5 s5Var) {
        z0 z0Var = (z0) s5Var.y;
        if (this.a != 0) {
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    z0Var.h(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    z0Var.i(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    z0Var.l(i4, (t0) obj);
                } else if (i3 == 3) {
                    z0Var.d(i4, 3);
                    ((s2) obj).b(s5Var);
                    z0Var.d(i4, 4);
                } else {
                    if (i3 != 5) {
                        net.luminis.tls.engine.impl.c.k(new s1());
                        return;
                    }
                    z0Var.g(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int c() {
        int iA;
        int iB;
        int iA2;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iN = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = this.b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        int i6 = i4 << 3;
                        t0 t0Var = (t0) this.c[i2];
                        int iA3 = z0.a(i6);
                        int iC = t0Var.c();
                        iN = com.google.android.datatransport.runtime.backends.c.n(iC, iC, iA3, iN);
                    } else if (i5 == 3) {
                        int iA4 = z0.a(i4 << 3);
                        iA = iA4 + iA4;
                        iB = ((s2) this.c[i2]).c();
                    } else {
                        if (i5 != 5) {
                            throw new IllegalStateException(new s1());
                        }
                        ((Integer) this.c[i2]).getClass();
                        iA2 = z0.a(i4 << 3) + 4;
                    }
                } else {
                    ((Long) this.c[i2]).getClass();
                    iA2 = z0.a(i4 << 3) + 8;
                }
                iN = iA2 + iN;
            } else {
                int i7 = i4 << 3;
                long jLongValue = ((Long) this.c[i2]).longValue();
                iA = z0.a(i7);
                iB = z0.b(jLongValue);
            }
            iN = iB + iA + iN;
        }
        this.d = iN;
        return iN;
    }

    public final void d(int i, Object obj) {
        if (!this.e) {
            androidx.transition.k.n();
            return;
        }
        e(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void e(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof s2)) {
            s2 s2Var = (s2) obj;
            int i = this.a;
            if (i == s2Var.a) {
                int[] iArr = this.b;
                int[] iArr2 = s2Var.b;
                for (int i2 = 0; i2 < i; i2++) {
                    if (iArr[i2] == iArr2[i2]) {
                    }
                }
                Object[] objArr = this.c;
                Object[] objArr2 = s2Var.c;
                int i3 = this.a;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (objArr[i4].equals(objArr2[i4])) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = i + 527;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.c;
        int i6 = this.a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
