package com.google.protobuf;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 {
    public static final f2 f = new f2(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;

    public f2(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static f2 e(f2 f2Var, f2 f2Var2) {
        int i = f2Var.a + f2Var2.a;
        int[] iArrCopyOf = Arrays.copyOf(f2Var.b, i);
        System.arraycopy(f2Var2.b, 0, iArrCopyOf, f2Var.a, f2Var2.a);
        Object[] objArrCopyOf = Arrays.copyOf(f2Var.c, i);
        System.arraycopy(f2Var2.c, 0, objArrCopyOf, f2Var.a, f2Var2.a);
        return new f2(i, iArrCopyOf, objArrCopyOf, true);
    }

    public final void a() {
        if (this.e) {
            return;
        }
        androidx.transition.k.n();
    }

    public final void b(int i) {
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

    public final int c() {
        int iE;
        int iG;
        int iE2;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.c[i3]).getClass();
                    iE2 = w.e(i5) + 8;
                } else if (i6 == 2) {
                    iE2 = w.b(i5, (ByteString) this.c[i3]);
                } else if (i6 == 3) {
                    iE = w.e(i5) * 2;
                    iG = ((f2) this.c[i3]).c();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(x0.c());
                    }
                    ((Integer) this.c[i3]).getClass();
                    iE2 = w.e(i5) + 4;
                }
                i2 = iE2 + i2;
            } else {
                long jLongValue = ((Long) this.c[i3]).longValue();
                iE = w.e(i5);
                iG = w.g(jLongValue);
            }
            i2 = iG + iE + i2;
        }
        this.d = i2;
        return i2;
    }

    public final boolean d(int i, t tVar) throws w0 {
        int iZ;
        a();
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            f(i, Long.valueOf(tVar.r()));
            return true;
        }
        if (i3 == 1) {
            f(i, Long.valueOf(tVar.o()));
            return true;
        }
        if (i3 == 2) {
            f(i, tVar.k());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                if (tVar.b == 0) {
                    tVar.a(0);
                }
                return false;
            }
            if (i3 != 5) {
                throw x0.c();
            }
            f(i, Integer.valueOf(tVar.n()));
            return true;
        }
        f2 f2Var = new f2();
        do {
            iZ = tVar.z();
            if (iZ == 0) {
                break;
            }
        } while (f2Var.d(iZ, tVar));
        tVar.a((i2 << 3) | 4);
        f(i, f2Var);
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f2)) {
            return false;
        }
        f2 f2Var = (f2) obj;
        int i = this.a;
        if (i == f2Var.a) {
            int[] iArr = this.b;
            int[] iArr2 = f2Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.c;
            Object[] objArr2 = f2Var.c;
            int i3 = this.a;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final void f(int i, Object obj) {
        a();
        b(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void g(f1 f1Var) {
        if (this.a == 0) {
            return;
        }
        for (int i = 0; i < this.a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            w wVar = (w) f1Var.a;
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                wVar.y(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                wVar.o(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                wVar.k(i3, (ByteString) obj);
            } else if (i4 == 3) {
                wVar.v(i3, 3);
                ((f2) obj).g(f1Var);
                wVar.v(i3, 4);
            } else {
                if (i4 != 5) {
                    net.luminis.tls.engine.impl.c.k(x0.c());
                    return;
                }
                wVar.m(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.c;
        int i6 = this.a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public f2() {
        this(0, new int[8], new Object[8], true);
    }
}
