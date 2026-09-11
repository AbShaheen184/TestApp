package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 {
    public static final a1 f = new a1(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public a1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public final void a(int i) {
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

    public final int b() {
        int iH;
        int iJ;
        int iH2;
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
                    iH2 = j.h(i5) + 8;
                } else if (i6 == 2) {
                    iH2 = j.f(i5, (f) this.c[i3]);
                } else if (i6 == 3) {
                    iH = j.h(i5) * 2;
                    iJ = ((a1) this.c[i3]).b();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(x.b());
                    }
                    ((Integer) this.c[i3]).getClass();
                    iH2 = j.h(i5) + 4;
                }
                i2 = iH2 + i2;
            } else {
                long jLongValue = ((Long) this.c[i3]).longValue();
                iH = j.h(i5);
                iJ = j.j(jLongValue);
            }
            i2 = iJ + iH + i2;
        }
        this.d = i2;
        return i2;
    }

    public final void c(int i, Object obj) {
        if (!this.e) {
            androidx.transition.k.n();
            return;
        }
        a(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void d(d0 d0Var) {
        if (this.a == 0) {
            return;
        }
        d0Var.getClass();
        j jVar = (j) d0Var.a;
        for (int i = 0; i < this.a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                jVar.E(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                jVar.t(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                jVar.p(i3, (f) obj);
            } else if (i4 == 3) {
                jVar.B(i3, 3);
                ((a1) obj).d(d0Var);
                jVar.B(i3, 4);
            } else {
                if (i4 != 5) {
                    net.luminis.tls.engine.impl.c.k(x.b());
                    return;
                }
                jVar.r(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        int i = this.a;
        if (i == a1Var.a) {
            int[] iArr = this.b;
            int[] iArr2 = a1Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.c;
            Object[] objArr2 = a1Var.c;
            int i3 = this.a;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
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
}
