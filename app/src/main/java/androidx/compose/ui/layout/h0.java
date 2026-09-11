package androidx.compose.ui.layout;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements m1 {
    public final /* synthetic */ m0 A;
    public androidx.compose.ui.unit.m e = androidx.compose.ui.unit.m.y;
    public float y;
    public float z;

    public h0(m0 m0Var) {
        this.A = m0Var;
    }

    @Override // androidx.compose.ui.unit.c
    public final float T() {
        return this.z;
    }

    @Override // androidx.compose.ui.layout.s
    public final boolean U() {
        androidx.compose.ui.node.b0 b0Var = this.A.e.e0.d;
        return b0Var == androidx.compose.ui.node.b0.A || b0Var == androidx.compose.ui.node.b0.y;
    }

    @Override // androidx.compose.ui.unit.c
    public final float a() {
        return this.y;
    }

    @Override // androidx.compose.ui.layout.s0
    public final r0 f0(int i, int i2, Map map, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            androidx.compose.ui.internal.a.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new g0(i, i2, map, lVar, this, this.A, lVar2);
    }

    @Override // androidx.compose.ui.layout.s
    public final androidx.compose.ui.unit.m getLayoutDirection() {
        return this.e;
    }

    @Override // androidx.compose.ui.layout.m1
    public final List j(Object obj, kotlin.jvm.functions.p pVar) {
        m0 m0Var = this.A;
        m0Var.g();
        androidx.compose.ui.node.f0 f0Var = m0Var.e;
        androidx.compose.ui.node.b0 b0Var = f0Var.e0.d;
        androidx.compose.ui.node.b0 b0Var2 = androidx.compose.ui.node.b0.z;
        androidx.compose.ui.node.b0 b0Var3 = androidx.compose.ui.node.b0.e;
        if (b0Var != b0Var3 && b0Var != b0Var2 && b0Var != androidx.compose.ui.node.b0.y && b0Var != androidx.compose.ui.node.b0.A) {
            androidx.compose.ui.internal.a.b("subcompose can only be used inside the measure or layout blocks");
        }
        androidx.collection.o0 o0Var = m0Var.D;
        Object objG = o0Var.g(obj);
        if (objG == null) {
            objG = (androidx.compose.ui.node.f0) m0Var.G.k(obj);
            if (objG != null) {
                if (m0Var.L <= 0) {
                    androidx.compose.ui.internal.a.b("Check failed.");
                }
                m0Var.L--;
            } else {
                objG = m0Var.l(obj);
                if (objG == null) {
                    int i = m0Var.A;
                    androidx.compose.ui.node.f0 f0Var2 = new androidx.compose.ui.node.f0(2);
                    f0Var.O = true;
                    f0Var.B(i, f0Var2);
                    f0Var.O = false;
                    objG = f0Var2;
                }
            }
            o0Var.m(obj, objG);
        }
        androidx.compose.ui.node.f0 f0Var3 = (androidx.compose.ui.node.f0) objG;
        if (kotlin.collections.o.N(m0Var.A, f0Var.o()) != f0Var3) {
            int i2 = ((androidx.compose.runtime.collection.b) ((androidx.collection.h0) f0Var.o()).y).i(f0Var3);
            if (i2 < m0Var.A) {
                androidx.compose.ui.internal.a.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i3 = m0Var.A;
            if (i3 != i2) {
                m0Var.i(i2, i3);
            }
        }
        m0Var.A++;
        m0Var.k(f0Var3, obj, false, pVar);
        return (b0Var == b0Var3 || b0Var == b0Var2) ? f0Var3.m() : f0Var3.l();
    }
}
