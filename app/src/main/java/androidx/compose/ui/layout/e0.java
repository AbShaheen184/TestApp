package androidx.compose.ui.layout;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements m1, s0 {
    public final /* synthetic */ h0 e;
    public final /* synthetic */ m0 y;

    public e0(m0 m0Var) {
        this.y = m0Var;
        this.e = m0Var.E;
    }

    @Override // androidx.compose.ui.unit.c
    public final long G(float f) {
        return this.e.G(f);
    }

    @Override // androidx.compose.ui.unit.c
    public final float L(int i) {
        return this.e.L(i);
    }

    @Override // androidx.compose.ui.unit.c
    public final float O(float f) {
        return f / this.e.a();
    }

    @Override // androidx.compose.ui.unit.c
    public final float T() {
        return this.e.z;
    }

    @Override // androidx.compose.ui.layout.s
    public final boolean U() {
        return this.e.U();
    }

    @Override // androidx.compose.ui.unit.c
    public final float V(float f) {
        return this.e.a() * f;
    }

    @Override // androidx.compose.ui.unit.c
    public final float a() {
        return this.e.y;
    }

    @Override // androidx.compose.ui.layout.s0
    public final r0 f0(int i, int i2, Map map, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2) {
        return this.e.f0(i, i2, map, lVar, lVar2);
    }

    @Override // androidx.compose.ui.unit.c
    public final int g0(float f) {
        return this.e.g0(f);
    }

    @Override // androidx.compose.ui.layout.s
    public final androidx.compose.ui.unit.m getLayoutDirection() {
        return this.e.e;
    }

    @Override // androidx.compose.ui.layout.m1
    public final List j(Object obj, kotlin.jvm.functions.p pVar) {
        m0 m0Var = this.y;
        androidx.collection.o0 o0Var = m0Var.G;
        androidx.collection.o0 o0Var2 = m0Var.I;
        androidx.compose.ui.node.f0 f0Var = m0Var.e;
        androidx.collection.o0 o0Var3 = m0Var.D;
        androidx.compose.ui.node.f0 f0Var2 = (androidx.compose.ui.node.f0) o0Var3.g(obj);
        if (f0Var2 != null && ((androidx.compose.runtime.collection.b) ((androidx.collection.h0) f0Var.o()).y).i(f0Var2) < m0Var.A) {
            return f0Var2.m();
        }
        androidx.compose.runtime.collection.b bVar = m0Var.J;
        if (bVar.z < m0Var.B) {
            androidx.compose.ui.internal.a.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        androidx.compose.ui.node.f0 f0Var3 = (androidx.compose.ui.node.f0) o0Var3.g(obj);
        int i = bVar.z;
        int i2 = m0Var.B;
        if (i == i2) {
            bVar.b(obj);
        } else {
            Object[] objArr = bVar.e;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
        }
        m0Var.B++;
        boolean zB = o0Var.b(obj);
        if (zB || f0Var3 != null) {
            if (!zB && f0Var3 != null) {
                m0Var.i(((androidx.compose.runtime.collection.b) ((androidx.collection.h0) f0Var.o()).y).i(f0Var3), ((androidx.compose.runtime.collection.b) ((androidx.collection.h0) f0Var.o()).y).z);
                m0Var.L++;
                o0Var3.k(obj);
                o0Var.m(obj, f0Var3);
                o0Var2.m(obj, m0Var.e(obj));
                if (f0Var.H()) {
                    m0Var.g();
                }
            }
            androidx.compose.ui.node.f0 f0Var4 = (androidx.compose.ui.node.f0) o0Var.g(obj);
            f0 f0Var5 = f0Var4 != null ? (f0) m0Var.C.g(f0Var4) : null;
            if (f0Var5 != null && f0Var5.d) {
                m0Var.k(f0Var4, obj, false, pVar);
            }
            if ((f0Var5 != null ? f0Var5.f : null) != null) {
                m0Var.c(f0Var5, true);
            }
        } else {
            if (f0Var.H()) {
                m0Var.g();
                if (!o0Var3.c(obj)) {
                    o0Var2.k(obj);
                    Object objG = o0Var.g(obj);
                    if (objG == null) {
                        objG = m0Var.l(obj);
                        if (objG != null) {
                            m0Var.i(((androidx.compose.runtime.collection.b) ((androidx.collection.h0) f0Var.o()).y).i(objG), ((androidx.compose.runtime.collection.b) ((androidx.collection.h0) f0Var.o()).y).z);
                            m0Var.L++;
                        } else {
                            int i3 = ((androidx.compose.runtime.collection.b) ((androidx.collection.h0) f0Var.o()).y).z;
                            androidx.compose.ui.node.f0 f0Var6 = new androidx.compose.ui.node.f0(2);
                            f0Var.O = true;
                            f0Var.B(i3, f0Var6);
                            f0Var.O = false;
                            m0Var.L++;
                            objG = f0Var6;
                        }
                        o0Var.m(obj, objG);
                    }
                    m0Var.k((androidx.compose.ui.node.f0) objG, obj, false, pVar);
                }
            }
            o0Var2.m(obj, m0Var.e(obj));
        }
        androidx.compose.ui.node.f0 f0Var7 = (androidx.compose.ui.node.f0) o0Var.g(obj);
        if (f0Var7 == null) {
            return kotlin.collections.u.e;
        }
        List listM0 = f0Var7.e0.p.m0();
        androidx.collection.h0 h0Var = (androidx.collection.h0) listM0;
        int i4 = ((androidx.compose.runtime.collection.b) h0Var.y).z;
        for (int i5 = 0; i5 < i4; i5++) {
            ((androidx.compose.ui.node.v0) h0Var.get(i5)).C.b = true;
        }
        return listM0;
    }

    @Override // androidx.compose.ui.unit.c
    public final long k0(long j) {
        return this.e.k0(j);
    }

    @Override // androidx.compose.ui.unit.c
    public final long n(float f) {
        return this.e.n(f);
    }

    @Override // androidx.compose.ui.unit.c
    public final long o(long j) {
        return this.e.o(j);
    }

    @Override // androidx.compose.ui.layout.s0
    public final r0 q(int i, int i2, Map map, kotlin.jvm.functions.l lVar) {
        return this.e.f0(i, i2, map, null, lVar);
    }

    @Override // androidx.compose.ui.unit.c
    public final float s0(long j) {
        return this.e.s0(j);
    }

    @Override // androidx.compose.ui.unit.c
    public final float t(long j) {
        return this.e.t(j);
    }
}
