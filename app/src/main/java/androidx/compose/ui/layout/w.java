package androidx.compose.ui.layout;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements s0, s {
    public final /* synthetic */ s e;
    public final androidx.compose.ui.unit.m y;

    public w(s sVar, androidx.compose.ui.unit.m mVar) {
        this.e = sVar;
        this.y = mVar;
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
        return this.e.O(f);
    }

    @Override // androidx.compose.ui.unit.c
    public final float T() {
        return this.e.T();
    }

    @Override // androidx.compose.ui.layout.s
    public final boolean U() {
        return this.e.U();
    }

    @Override // androidx.compose.ui.unit.c
    public final float V(float f) {
        return this.e.V(f);
    }

    @Override // androidx.compose.ui.unit.c
    public final float a() {
        return this.e.a();
    }

    @Override // androidx.compose.ui.layout.s0
    public final r0 f0(int i, int i2, Map map, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            androidx.compose.ui.internal.a.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new v(i, i2, map, lVar);
    }

    @Override // androidx.compose.ui.unit.c
    public final int g0(float f) {
        return this.e.g0(f);
    }

    @Override // androidx.compose.ui.layout.s
    public final androidx.compose.ui.unit.m getLayoutDirection() {
        return this.y;
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

    @Override // androidx.compose.ui.unit.c
    public final float s0(long j) {
        return this.e.s0(j);
    }

    @Override // androidx.compose.ui.unit.c
    public final float t(long j) {
        return this.e.t(j);
    }
}
