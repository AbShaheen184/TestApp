package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.e0;
import androidx.compose.ui.layout.b1;
import androidx.compose.ui.layout.c1;
import androidx.compose.ui.layout.d1;
import androidx.compose.ui.layout.e1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements e0 {
    public final int a;
    public final List b;
    public final boolean c;
    public final androidx.compose.ui.d d;
    public final androidx.compose.ui.i e;
    public final androidx.compose.ui.unit.m f;
    public final int g;
    public final long h;
    public final Object i;
    public final Object j;
    public final androidx.compose.foundation.lazy.layout.v k;
    public int l;
    public final int m;
    public final int n;
    public final int o;
    public boolean p;
    public int q = Integer.MIN_VALUE;
    public final int[] r;

    public u(int i, List list, boolean z, androidx.compose.ui.d dVar, androidx.compose.ui.i iVar, androidx.compose.ui.unit.m mVar, int i2, int i3, int i4, long j, Object obj, Object obj2, androidx.compose.foundation.lazy.layout.v vVar, long j2) {
        this.a = i;
        this.b = list;
        this.c = z;
        this.d = dVar;
        this.e = iVar;
        this.f = mVar;
        this.g = i4;
        this.h = j;
        this.i = obj;
        this.j = obj2;
        this.k = vVar;
        int size = list.size();
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < size; i6++) {
            c1 c1Var = (c1) list.get(i6);
            boolean z2 = this.c;
            i5 += z2 ? c1Var.y : c1Var.e;
            iMax = Math.max(iMax, !z2 ? c1Var.y : c1Var.e);
        }
        this.m = i5;
        int i7 = i5 + this.g;
        this.n = i7 >= 0 ? i7 : 0;
        this.o = iMax;
        this.r = new int[this.b.size() * 2];
    }

    @Override // androidx.compose.foundation.lazy.layout.e0
    public final int a() {
        return this.b.size();
    }

    @Override // androidx.compose.foundation.lazy.layout.e0
    public final int b() {
        return this.n;
    }

    @Override // androidx.compose.foundation.lazy.layout.e0
    public final int c() {
        return 1;
    }

    @Override // androidx.compose.foundation.lazy.layout.e0
    public final Object d(int i) {
        return ((c1) this.b.get(i)).K();
    }

    @Override // androidx.compose.foundation.lazy.layout.e0
    public final boolean e() {
        return this.c;
    }

    @Override // androidx.compose.foundation.lazy.layout.e0
    public final void f() {
        this.p = true;
    }

    @Override // androidx.compose.foundation.lazy.layout.e0
    public final void g(int i, int i2, int i3) {
        k(i, i2, i3);
    }

    @Override // androidx.compose.foundation.lazy.layout.e0
    public final int getIndex() {
        return this.a;
    }

    @Override // androidx.compose.foundation.lazy.layout.e0
    public final Object getKey() {
        return this.i;
    }

    @Override // androidx.compose.foundation.lazy.layout.e0
    public final long h(int i) {
        if (i == 0 && this.b.size() == 0) {
            int i2 = this.l;
            if (this.c) {
                return (4294967295L & ((long) i2)) | (((long) 0) << 32);
            }
            return (4294967295L & ((long) 0)) | (((long) i2) << 32);
        }
        int i3 = i * 2;
        int[] iArr = this.r;
        int i4 = iArr[i3];
        return (4294967295L & ((long) iArr[i3 + 1])) | (((long) i4) << 32);
    }

    @Override // androidx.compose.foundation.lazy.layout.e0
    public final int i() {
        return 0;
    }

    public final void j(b1 b1Var) {
        if (this.q == Integer.MIN_VALUE) {
            androidx.compose.foundation.internal.b.a("position() should be called first");
        }
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            c1 c1Var = (c1) list.get(i);
            boolean z = this.c;
            if (z) {
                int i2 = c1Var.y;
            } else {
                int i3 = c1Var.e;
            }
            long jH = h(i);
            this.k.a(i, this.i);
            long jC = androidx.compose.ui.unit.j.c(jH, this.h);
            if (z) {
                b1.s(b1Var, c1Var, jC);
            } else {
                int i4 = e1.b;
                d1 d1Var = d1.z;
                if (b1Var.f() == androidx.compose.ui.unit.m.e || b1Var.g() == 0) {
                    b1.b(b1Var, c1Var);
                    c1Var.h0(androidx.compose.ui.unit.j.c(jC, c1Var.B), 0.0f, d1Var);
                } else {
                    int iG = (b1Var.g() - c1Var.e) - ((int) (jC >> 32));
                    b1.b(b1Var, c1Var);
                    c1Var.h0(androidx.compose.ui.unit.j.c((((long) iG) << 32) | (4294967295L & ((long) ((int) (jC & 4294967295L)))), c1Var.B), 0.0f, d1Var);
                }
            }
        }
    }

    public final void k(int i, int i2, int i3) {
        int i4;
        this.l = i;
        boolean z = this.c;
        this.q = z ? i3 : i2;
        List list = this.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            c1 c1Var = (c1) list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.r;
            if (z) {
                androidx.compose.ui.d dVar = this.d;
                if (dVar == null) {
                    androidx.compose.foundation.internal.b.b("null horizontalAlignment when isVertical == true");
                    com.google.gson.b.b();
                    return;
                } else {
                    iArr[i6] = dVar.a(c1Var.e, i2, this.f);
                    iArr[i6 + 1] = i;
                    i4 = c1Var.y;
                }
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                androidx.compose.ui.i iVar = this.e;
                if (iVar == null) {
                    androidx.compose.foundation.internal.b.b("null verticalAlignment when isVertical == false");
                    com.google.gson.b.b();
                    return;
                } else {
                    iArr[i7] = iVar.a(c1Var.y, i3);
                    i4 = c1Var.e;
                }
            }
            i += i4;
        }
    }
}
