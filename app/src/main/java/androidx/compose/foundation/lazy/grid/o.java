package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.e0;
import androidx.compose.ui.layout.b1;
import androidx.compose.ui.layout.c1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements e0 {
    public final int a;
    public final Object b;
    public final int c;
    public final androidx.compose.ui.unit.m d;
    public final List e;
    public final long f;
    public final Object g;
    public final androidx.compose.foundation.lazy.layout.v h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public int m = Integer.MIN_VALUE;
    public final long n;
    public long o;
    public int p;
    public int q;
    public boolean r;

    public o(int i, Object obj, int i2, int i3, androidx.compose.ui.unit.m mVar, int i4, int i5, List list, long j, Object obj2, androidx.compose.foundation.lazy.layout.v vVar, long j2, int i6, int i7) {
        this.a = i;
        this.b = obj;
        this.c = i2;
        this.d = mVar;
        this.e = list;
        this.f = j;
        this.g = obj2;
        this.h = vVar;
        this.i = i6;
        this.j = i7;
        int size = list.size();
        int iMax = 0;
        for (int i8 = 0; i8 < size; i8++) {
            iMax = Math.max(iMax, ((c1) list.get(i8)).y);
        }
        this.k = iMax;
        int i9 = i3 + iMax;
        this.l = i9 >= 0 ? i9 : 0;
        this.n = (((long) this.c) << 32) | (((long) iMax) & 4294967295L);
        this.o = 0L;
        this.p = -1;
        this.q = -1;
    }

    @Override // androidx.compose.foundation.lazy.layout.e0
    public final int a() {
        return this.e.size();
    }

    @Override // androidx.compose.foundation.lazy.layout.e0
    public final int b() {
        return this.l;
    }

    @Override // androidx.compose.foundation.lazy.layout.e0
    public final int c() {
        return this.j;
    }

    @Override // androidx.compose.foundation.lazy.layout.e0
    public final Object d(int i) {
        return ((c1) this.e.get(i)).K();
    }

    @Override // androidx.compose.foundation.lazy.layout.e0
    public final boolean e() {
        return true;
    }

    @Override // androidx.compose.foundation.lazy.layout.e0
    public final void f() {
        this.r = true;
    }

    @Override // androidx.compose.foundation.lazy.layout.e0
    public final void g(int i, int i2, int i3) {
        k(i, 0, i2, i3, -1, -1);
    }

    @Override // androidx.compose.foundation.lazy.layout.e0
    public final int getIndex() {
        return this.a;
    }

    @Override // androidx.compose.foundation.lazy.layout.e0
    public final Object getKey() {
        return this.b;
    }

    @Override // androidx.compose.foundation.lazy.layout.e0
    public final long h(int i) {
        return this.o;
    }

    @Override // androidx.compose.foundation.lazy.layout.e0
    public final int i() {
        return this.i;
    }

    public final void j(b1 b1Var) {
        if (this.m == Integer.MIN_VALUE) {
            androidx.compose.foundation.internal.b.a("position() should be called first");
        }
        List list = this.e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            c1 c1Var = (c1) list.get(i);
            int i2 = c1Var.y;
            long j = this.o;
            this.h.a(i, this.b);
            b1.s(b1Var, c1Var, androidx.compose.ui.unit.j.c(j, this.f));
        }
    }

    public final void k(int i, int i2, int i3, int i4, int i5, int i6) {
        this.m = i4;
        if (this.d == androidx.compose.ui.unit.m.y) {
            i2 = (i3 - i2) - this.c;
        }
        this.o = (((long) i2) << 32) | (((long) i) & 4294967295L);
        this.p = i5;
        this.q = i6;
    }
}
