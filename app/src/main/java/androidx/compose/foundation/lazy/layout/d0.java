package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.layout.m1;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements androidx.compose.ui.layout.s0 {
    public final androidx.collection.z A;
    public final x e;
    public final m1 y;
    public final y z;

    public d0(x xVar, m1 m1Var) {
        this.e = xVar;
        this.y = m1Var;
        this.z = (y) xVar.b.invoke();
        androidx.collection.o.a();
        this.A = new androidx.collection.z();
    }

    @Override // androidx.compose.ui.unit.c
    public final long G(float f) {
        return this.y.G(f);
    }

    @Override // androidx.compose.ui.unit.c
    public final float L(int i) {
        return this.y.L(i);
    }

    @Override // androidx.compose.ui.unit.c
    public final float O(float f) {
        return this.y.O(f);
    }

    @Override // androidx.compose.ui.unit.c
    public final float T() {
        return this.y.T();
    }

    @Override // androidx.compose.ui.layout.s
    public final boolean U() {
        return this.y.U();
    }

    @Override // androidx.compose.ui.unit.c
    public final float V(float f) {
        return this.y.V(f);
    }

    @Override // androidx.compose.ui.unit.c
    public final float a() {
        return this.y.a();
    }

    @Override // androidx.compose.ui.layout.s0
    public final androidx.compose.ui.layout.r0 f0(int i, int i2, Map map, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2) {
        return this.y.f0(i, i2, map, lVar, lVar2);
    }

    @Override // androidx.compose.ui.unit.c
    public final int g0(float f) {
        return this.y.g0(f);
    }

    @Override // androidx.compose.ui.layout.s
    public final androidx.compose.ui.unit.m getLayoutDirection() {
        return this.y.getLayoutDirection();
    }

    @Override // androidx.compose.ui.unit.c
    public final long k0(long j) {
        return this.y.k0(j);
    }

    @Override // androidx.compose.ui.unit.c
    public final long n(float f) {
        return this.y.n(f);
    }

    @Override // androidx.compose.ui.unit.c
    public final long o(long j) {
        return this.y.o(j);
    }

    @Override // androidx.compose.ui.layout.s0
    public final androidx.compose.ui.layout.r0 q(int i, int i2, Map map, kotlin.jvm.functions.l lVar) {
        return this.y.q(i, i2, map, lVar);
    }

    @Override // androidx.compose.ui.unit.c
    public final float s0(long j) {
        return this.y.s0(j);
    }

    @Override // androidx.compose.ui.unit.c
    public final float t(long j) {
        return this.y.t(j);
    }
}
