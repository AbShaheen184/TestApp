package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.k1;
import androidx.compose.ui.layout.r0;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements r0 {
    public final p a;
    public final int b;
    public final boolean c;
    public final float d;
    public final r0 e;
    public final float f;
    public final boolean g;
    public final CoroutineScope h;
    public final androidx.compose.ui.unit.c i;
    public final int j;
    public final kotlin.jvm.functions.l k;
    public final kotlin.jvm.functions.l l;
    public final Object m;
    public final int n;
    public final int o;
    public final int p;
    public final k1 q;
    public final int r;
    public final int s;

    public n(p pVar, int i, boolean z, float f, r0 r0Var, float f2, boolean z2, CoroutineScope coroutineScope, androidx.compose.ui.unit.c cVar, int i2, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2, List list, int i3, int i4, int i5, k1 k1Var, int i6, int i7) {
        this.a = pVar;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = r0Var;
        this.f = f2;
        this.g = z2;
        this.h = coroutineScope;
        this.i = cVar;
        this.j = i2;
        this.k = lVar;
        this.l = lVar2;
        this.m = list;
        this.n = i3;
        this.o = i4;
        this.p = i5;
        this.q = k1Var;
        this.r = i6;
        this.s = i7;
    }

    @Override // androidx.compose.ui.layout.r0
    public final int a() {
        return this.e.a();
    }

    @Override // androidx.compose.ui.layout.r0
    public final int b() {
        return this.e.b();
    }

    @Override // androidx.compose.ui.layout.r0
    public final Map c() {
        return this.e.c();
    }

    @Override // androidx.compose.ui.layout.r0
    public final void d() {
        this.e.d();
    }

    @Override // androidx.compose.ui.layout.r0
    public final kotlin.jvm.functions.l e() {
        return this.e.e();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final n f(int i, boolean z) {
        p pVar;
        int i2;
        if (this.g) {
            return null;
        }
        ?? r2 = this.m;
        if (r2.isEmpty() || (pVar = this.a) == null) {
            return null;
        }
        int i3 = pVar.g;
        int i4 = this.b - i;
        if (i4 < 0 || i4 >= i3) {
            return null;
        }
        o oVar = (o) kotlin.collections.o.K(r2);
        o oVar2 = (o) kotlin.collections.o.S(r2);
        if (oVar.r || oVar2.r) {
            return null;
        }
        int i5 = this.o;
        int i6 = this.n;
        k1 k1Var = this.q;
        if (i < 0) {
            if (Math.min((_COROUTINE.b.A(oVar, k1Var) + oVar.l) - i6, (_COROUTINE.b.A(oVar2, k1Var) + oVar2.l) - i5) <= (-i)) {
                return null;
            }
        } else if (Math.min(i6 - _COROUTINE.b.A(oVar, k1Var), i5 - _COROUTINE.b.A(oVar2, k1Var)) <= i) {
            return null;
        }
        int size = r2.size();
        int i7 = 0;
        while (i7 < size) {
            o oVar3 = (o) r2.get(i7);
            oVar3.getClass();
            if (oVar3.r) {
                i2 = i4;
            } else {
                long j = oVar3.o;
                i2 = i4;
                oVar3.o = (((long) ((int) (j >> 32))) << 32) | (((long) (((int) (j & 4294967295L)) + i)) & 4294967295L);
                if (z) {
                    int size2 = oVar3.e.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        oVar3.h.a(i8, oVar3.b);
                    }
                }
            }
            i7++;
            i4 = i2;
        }
        return new n(this.a, i4, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, r2, this.n, this.o, this.p, k1Var, this.r, this.s);
    }

    public final long g() {
        r0 r0Var = this.e;
        return (((long) r0Var.b()) << 32) | (((long) r0Var.a()) & 4294967295L);
    }
}
