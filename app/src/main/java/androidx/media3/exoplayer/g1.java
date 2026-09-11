package androidx.media3.exoplayer;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends androidx.media3.common.v0 {
    public static final /* synthetic */ int k = 0;
    public final int b;
    public final androidx.media3.exoplayer.source.z0 c;
    public final int d;
    public final int e;
    public final int[] f;
    public final int[] g;
    public final androidx.media3.common.v0[] h;
    public final Object[] i;
    public final HashMap j;

    public g1(androidx.media3.common.v0[] v0VarArr, Object[] objArr, androidx.media3.exoplayer.source.z0 z0Var) {
        this.c = z0Var;
        this.b = z0Var.b.length;
        int length = v0VarArr.length;
        this.h = v0VarArr;
        this.f = new int[length];
        this.g = new int[length];
        this.i = objArr;
        this.j = new HashMap();
        int length2 = v0VarArr.length;
        int i = 0;
        int iO = 0;
        int iH = 0;
        int i2 = 0;
        while (i < length2) {
            androidx.media3.common.v0 v0Var = v0VarArr[i];
            this.h[i2] = v0Var;
            this.g[i2] = iO;
            this.f[i2] = iH;
            iO += v0Var.o();
            iH += this.h[i2].h();
            this.j.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.d = iO;
        this.e = iH;
    }

    @Override // androidx.media3.common.v0
    public final int a(boolean z) {
        if (this.b != 0) {
            int iQ = 0;
            if (z) {
                int[] iArr = this.c.b;
                iQ = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                androidx.media3.common.v0[] v0VarArr = this.h;
                if (!v0VarArr[iQ].p()) {
                    return v0VarArr[iQ].a(z) + this.g[iQ];
                }
                iQ = q(iQ, z);
            } while (iQ != -1);
        }
        return -1;
    }

    @Override // androidx.media3.common.v0
    public final int b(Object obj) {
        int iB;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.j.get(obj2);
            int iIntValue = num == null ? -1 : num.intValue();
            if (iIntValue != -1 && (iB = this.h[iIntValue].b(obj3)) != -1) {
                return this.f[iIntValue] + iB;
            }
        }
        return -1;
    }

    @Override // androidx.media3.common.v0
    public final int c(boolean z) {
        int iR;
        int i = this.b;
        if (i != 0) {
            if (z) {
                int[] iArr = this.c.b;
                iR = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
            } else {
                iR = i - 1;
            }
            do {
                androidx.media3.common.v0[] v0VarArr = this.h;
                if (!v0VarArr[iR].p()) {
                    return v0VarArr[iR].c(z) + this.g[iR];
                }
                iR = r(iR, z);
            } while (iR != -1);
        }
        return -1;
    }

    @Override // androidx.media3.common.v0
    public final int e(int i, int i2, boolean z) {
        int[] iArr = this.g;
        int iE = androidx.media3.common.util.j0.e(iArr, i + 1, false, false);
        int i3 = iArr[iE];
        androidx.media3.common.v0[] v0VarArr = this.h;
        int iE2 = v0VarArr[iE].e(i - i3, i2 != 2 ? i2 : 0, z);
        if (iE2 != -1) {
            return i3 + iE2;
        }
        int iQ = q(iE, z);
        while (iQ != -1 && v0VarArr[iQ].p()) {
            iQ = q(iQ, z);
        }
        if (iQ != -1) {
            return v0VarArr[iQ].a(z) + iArr[iQ];
        }
        if (i2 == 2) {
            return a(z);
        }
        return -1;
    }

    @Override // androidx.media3.common.v0
    public final androidx.media3.common.t0 f(int i, androidx.media3.common.t0 t0Var, boolean z) {
        int[] iArr = this.f;
        int iE = androidx.media3.common.util.j0.e(iArr, i + 1, false, false);
        int i2 = this.g[iE];
        this.h[iE].f(i - iArr[iE], t0Var, z);
        t0Var.c += i2;
        if (z) {
            Object obj = this.i[iE];
            Object obj2 = t0Var.b;
            obj2.getClass();
            t0Var.b = Pair.create(obj, obj2);
        }
        return t0Var;
    }

    @Override // androidx.media3.common.v0
    public final androidx.media3.common.t0 g(Object obj, androidx.media3.common.t0 t0Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.j.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i = this.g[iIntValue];
        this.h[iIntValue].g(obj3, t0Var);
        t0Var.c += i;
        t0Var.b = obj;
        return t0Var;
    }

    @Override // androidx.media3.common.v0
    public final int h() {
        return this.e;
    }

    @Override // androidx.media3.common.v0
    public final int k(int i, int i2, boolean z) {
        int[] iArr = this.g;
        int iE = androidx.media3.common.util.j0.e(iArr, i + 1, false, false);
        int i3 = iArr[iE];
        androidx.media3.common.v0[] v0VarArr = this.h;
        int iK = v0VarArr[iE].k(i - i3, i2 != 2 ? i2 : 0, z);
        if (iK != -1) {
            return i3 + iK;
        }
        int iR = r(iE, z);
        while (iR != -1 && v0VarArr[iR].p()) {
            iR = r(iR, z);
        }
        if (iR != -1) {
            return v0VarArr[iR].c(z) + iArr[iR];
        }
        if (i2 == 2) {
            return c(z);
        }
        return -1;
    }

    @Override // androidx.media3.common.v0
    public final Object l(int i) {
        int[] iArr = this.f;
        int iE = androidx.media3.common.util.j0.e(iArr, i + 1, false, false);
        return Pair.create(this.i[iE], this.h[iE].l(i - iArr[iE]));
    }

    @Override // androidx.media3.common.v0
    public final androidx.media3.common.u0 m(int i, androidx.media3.common.u0 u0Var, long j) {
        int[] iArr = this.g;
        int iE = androidx.media3.common.util.j0.e(iArr, i + 1, false, false);
        int i2 = iArr[iE];
        int i3 = this.f[iE];
        this.h[iE].m(i - i2, u0Var, j);
        Object objCreate = this.i[iE];
        if (!androidx.media3.common.u0.q.equals(u0Var.a)) {
            objCreate = Pair.create(objCreate, u0Var.a);
        }
        u0Var.a = objCreate;
        u0Var.n += i3;
        u0Var.o += i3;
        return u0Var;
    }

    @Override // androidx.media3.common.v0
    public final int o() {
        return this.d;
    }

    public final int q(int i, boolean z) {
        if (!z) {
            if (i < this.b - 1) {
                return i + 1;
            }
            return -1;
        }
        androidx.media3.exoplayer.source.z0 z0Var = this.c;
        int i2 = z0Var.c[i] + 1;
        int[] iArr = z0Var.b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    public final int r(int i, boolean z) {
        if (!z) {
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }
        androidx.media3.exoplayer.source.z0 z0Var = this.c;
        int i2 = z0Var.c[i] - 1;
        if (i2 >= 0) {
            return z0Var.b[i2];
        }
        return -1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g1(ArrayList arrayList, androidx.media3.exoplayer.source.z0 z0Var) {
        androidx.media3.common.v0[] v0VarArr = new androidx.media3.common.v0[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            v0VarArr[i2] = ((s0) it.next()).b();
            i2++;
        }
        Object[] objArr = new Object[arrayList.size()];
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((s0) it2.next()).a();
            i++;
        }
        this(v0VarArr, objArr, z0Var);
    }
}
