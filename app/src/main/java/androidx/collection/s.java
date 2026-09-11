package androidx.collection;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements Cloneable {
    public /* synthetic */ int A;
    public /* synthetic */ boolean e;
    public /* synthetic */ long[] y;
    public /* synthetic */ Object[] z;

    public s(int i) {
        if (i == 0) {
            this.y = androidx.collection.internal.a.b;
            this.z = androidx.collection.internal.a.c;
            return;
        }
        int i2 = i * 8;
        for (int i3 = 4; i3 < 32; i3++) {
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
        }
        int i5 = i2 / 8;
        this.y = new long[i5];
        this.z = new Object[i5];
    }

    public final void a() {
        int i = this.A;
        Object[] objArr = this.z;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.A = 0;
        this.e = false;
    }

    public final Object b(long j) {
        Object obj;
        int iB = androidx.collection.internal.a.b(this.y, this.A, j);
        if (iB < 0 || (obj = this.z[iB]) == t.a) {
            return null;
        }
        return obj;
    }

    public final int c(long j) {
        if (this.e) {
            int i = this.A;
            long[] jArr = this.y;
            Object[] objArr = this.z;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != t.a) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.e = false;
            this.A = i2;
        }
        return androidx.collection.internal.a.b(this.y, this.A, j);
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        s sVar = (s) objClone;
        sVar.y = (long[]) this.y.clone();
        sVar.z = (Object[]) this.z.clone();
        return sVar;
    }

    public final long d(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.A)) {
            net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "Expected index to be within 0..size()-1, but was "));
            return 0L;
        }
        if (this.e) {
            long[] jArr = this.y;
            Object[] objArr = this.z;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != t.a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.e = false;
            this.A = i3;
        }
        return this.y[i];
    }

    public final void e(long j, Object obj) {
        Object obj2 = t.a;
        int iB = androidx.collection.internal.a.b(this.y, this.A, j);
        if (iB >= 0) {
            this.z[iB] = obj;
            return;
        }
        int i = ~iB;
        int i2 = this.A;
        if (i < i2) {
            Object[] objArr = this.z;
            if (objArr[i] == obj2) {
                this.y[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.e) {
            long[] jArr = this.y;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.z;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.e = false;
                this.A = i3;
                i = ~androidx.collection.internal.a.b(this.y, i3, j);
            }
        }
        int i5 = this.A;
        if (i5 >= this.y.length) {
            int i6 = (i5 + 1) * 8;
            for (int i7 = 4; i7 < 32; i7++) {
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
            }
            int i9 = i6 / 8;
            this.y = Arrays.copyOf(this.y, i9);
            this.z = Arrays.copyOf(this.z, i9);
        }
        int i10 = this.A;
        if (i10 - i != 0) {
            long[] jArr2 = this.y;
            int i11 = i + 1;
            kotlin.collections.n.F(jArr2, jArr2, i11, i, i10);
            Object[] objArr3 = this.z;
            kotlin.collections.n.D(i11, i, this.A, objArr3, objArr3);
        }
        this.y[i] = j;
        this.z[i] = obj;
        this.A++;
    }

    public final void f(long j) {
        int iB = androidx.collection.internal.a.b(this.y, this.A, j);
        if (iB >= 0) {
            Object[] objArr = this.z;
            Object obj = objArr[iB];
            Object obj2 = t.a;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.e = true;
            }
        }
    }

    public final int g() {
        if (this.e) {
            int i = this.A;
            long[] jArr = this.y;
            Object[] objArr = this.z;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != t.a) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.e = false;
            this.A = i2;
        }
        return this.A;
    }

    public final Object h(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.A)) {
            net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        if (this.e) {
            long[] jArr = this.y;
            Object[] objArr = this.z;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != t.a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.e = false;
            this.A = i3;
        }
        return this.z[i];
    }

    public final String toString() {
        if (g() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.A * 28);
        sb.append('{');
        int i = this.A;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(d(i2));
            sb.append('=');
            Object objH = h(i2);
            if (objH != sb) {
                sb.append(objH);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ s(Object obj) {
        this(10);
    }
}
