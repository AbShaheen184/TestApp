package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.k1;
import androidx.compose.ui.layout.r0;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements r0 {
    public final u a;
    public final int b;
    public final boolean c;
    public final float d;
    public final r0 e;
    public final float f;
    public final boolean g;
    public final CoroutineScope h;
    public final androidx.compose.ui.unit.c i;
    public final long j;
    public final Object k;
    public final int l;
    public final int m;
    public final int n;
    public final k1 o;
    public final int p;
    public final int q;

    public t(u uVar, int i, boolean z, float f, r0 r0Var, float f2, boolean z2, CoroutineScope coroutineScope, androidx.compose.ui.unit.c cVar, long j, List list, int i2, int i3, int i4, k1 k1Var, int i5, int i6) {
        this.a = uVar;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = r0Var;
        this.f = f2;
        this.g = z2;
        this.h = coroutineScope;
        this.i = cVar;
        this.j = j;
        this.k = list;
        this.l = i2;
        this.m = i3;
        this.n = i4;
        this.o = k1Var;
        this.p = i5;
        this.q = i6;
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

    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final t f(int i, boolean z) {
        u uVar;
        if (this.g) {
            return null;
        }
        ?? r15 = this.k;
        if (r15.isEmpty() || (uVar = this.a) == null) {
            return null;
        }
        int i2 = uVar.n;
        int i3 = this.b - i;
        if (i3 < 0 || i3 >= i2) {
            return null;
        }
        u uVar2 = (u) kotlin.collections.o.K(r15);
        u uVar3 = (u) kotlin.collections.o.S(r15);
        if (uVar2.p || uVar3.p) {
            return null;
        }
        int i4 = uVar2.l;
        int i5 = this.m;
        int i6 = this.l;
        if (i < 0) {
            if (Math.min((i4 + uVar2.n) - i6, (uVar3.l + uVar3.n) - i5) <= (-i)) {
                return null;
            }
        } else if (Math.min(i6 - i4, i5 - uVar3.l) <= i) {
            return null;
        }
        int size = r15.size();
        for (int i7 = 0; i7 < size; i7++) {
            u uVar4 = (u) r15.get(i7);
            boolean z2 = uVar4.c;
            int[] iArr = uVar4.r;
            if (!uVar4.p) {
                uVar4.l += i;
                int length = iArr.length;
                for (int i8 = 0; i8 < length; i8++) {
                    int i9 = i8 & 1;
                    if ((z2 && i9 != 0) || (!z2 && i9 == 0)) {
                        iArr[i8] = iArr[i8] + i;
                    }
                }
                if (z) {
                    int size2 = uVar4.b.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        uVar4.k.a(i10, uVar4.i);
                    }
                }
            }
        }
        return new t(this.a, i3, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, r15, this.l, this.m, this.n, this.o, this.p, this.q);
    }

    public final long g() {
        r0 r0Var = this.e;
        return (((long) r0Var.b()) << 32) | (((long) r0Var.a()) & 4294967295L);
    }
}
