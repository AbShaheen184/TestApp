package androidx.compose.material3;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s3 extends androidx.compose.ui.q implements androidx.compose.ui.node.v {
    public androidx.compose.foundation.interaction.k L;
    public boolean M;
    public androidx.compose.animation.core.k1 N;
    public boolean O;
    public androidx.compose.animation.core.d P;
    public androidx.compose.animation.core.d Q;
    public float R;
    public float S;

    @Override // androidx.compose.ui.q
    public final boolean A0() {
        return false;
    }

    @Override // androidx.compose.ui.q
    public final void D0() {
        BuildersKt__Builders_commonKt.launch$default(z0(), null, null, new androidx.compose.animation.core.c1(this, null, 11), 3, null);
    }

    @Override // androidx.compose.ui.node.v
    public final androidx.compose.ui.layout.r0 c(androidx.compose.ui.layout.s0 s0Var, androidx.compose.ui.layout.p0 p0Var, long j) {
        float f;
        boolean z = (p0Var.b(androidx.compose.ui.unit.a.h(j)) == 0 || p0Var.B(androidx.compose.ui.unit.a.g(j)) == 0) ? false : true;
        if (this.O) {
            f = androidx.compose.material3.tokens.x.n;
        } else {
            f = (z || this.M) ? j3.a : j3.b;
        }
        float fV = s0Var.V(f);
        androidx.compose.animation.core.d dVar = this.Q;
        int iFloatValue = (int) (dVar != null ? ((Number) dVar.d()).floatValue() : fV);
        if (!((iFloatValue >= 0) & (iFloatValue >= 0))) {
            androidx.compose.ui.unit.i.a("width and height must be >= 0");
        }
        androidx.compose.ui.layout.c1 c1VarF = p0Var.F(androidx.compose.ui.unit.b.h(iFloatValue, iFloatValue, iFloatValue, iFloatValue));
        float fV2 = s0Var.V((j3.d - s0Var.O(fV)) / 2.0f);
        float fV3 = s0Var.V((j3.c - j3.a) - j3.e);
        boolean z2 = this.O;
        if (z2 && this.M) {
            fV2 = fV3 - s0Var.V(androidx.compose.material3.tokens.x.s);
        } else if (z2 && !this.M) {
            fV2 = s0Var.V(androidx.compose.material3.tokens.x.s);
        } else if (this.M) {
            fV2 = fV3;
        }
        androidx.compose.animation.core.d dVar2 = this.Q;
        kotlin.coroutines.d dVar3 = null;
        Float f2 = dVar2 != null ? (Float) dVar2.e.getValue() : null;
        if (f2 == null || f2.floatValue() != fV) {
            BuildersKt__Builders_commonKt.launch$default(z0(), null, null, new r3(this, fV, dVar3, 0), 3, null);
        }
        androidx.compose.animation.core.d dVar4 = this.P;
        Float f3 = dVar4 != null ? (Float) dVar4.e.getValue() : null;
        if (f3 == null || f3.floatValue() != fV2) {
            BuildersKt__Builders_commonKt.launch$default(z0(), null, null, new r3(this, fV2, dVar3, 1), 3, null);
        }
        if (Float.isNaN(this.S) && Float.isNaN(this.R)) {
            this.S = fV;
            this.R = fV2;
        }
        return s0Var.q(iFloatValue, iFloatValue, kotlin.collections.v.e, new androidx.compose.foundation.gestures.z2(c1VarF, this, fV2));
    }
}
