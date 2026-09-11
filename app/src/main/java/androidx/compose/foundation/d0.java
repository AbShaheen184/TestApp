package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.gestures.x2;
import androidx.compose.ui.platform.p2;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class d0 extends j {
    public androidx.compose.ui.input.pointer.v j0;

    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, java.util.List] */
    @Override // androidx.compose.foundation.j, androidx.compose.ui.node.r1
    public final void D(androidx.compose.ui.input.pointer.m mVar, androidx.compose.ui.input.pointer.n nVar, long j) {
        super.D(mVar, nVar, j);
        if (nVar != androidx.compose.ui.input.pointer.n.y) {
            if (nVar != androidx.compose.ui.input.pointer.n.z || this.j0 == null) {
                return;
            }
            ?? r12 = mVar.a;
            int size = r12.size();
            for (int i = 0; i < size; i++) {
                androidx.compose.ui.input.pointer.v vVar = (androidx.compose.ui.input.pointer.v) r12.get(i);
                if (vVar.b() && !vVar.equals(this.j0)) {
                    this.j0 = null;
                    S0(false);
                    return;
                }
            }
            return;
        }
        androidx.compose.ui.input.pointer.v vVar2 = this.j0;
        if (vVar2 == null) {
            if (x2.e(mVar, true)) {
                androidx.compose.ui.input.pointer.v vVar3 = (androidx.compose.ui.input.pointer.v) mVar.a.get(0);
                vVar3.a();
                this.j0 = vVar3;
                if (this.S) {
                    U0(vVar3.c, false);
                    return;
                }
                return;
            }
            return;
        }
        ?? r13 = mVar.a;
        int size2 = r13.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!androidx.compose.ui.input.pointer.u.c((androidx.compose.ui.input.pointer.v) r13.get(i2))) {
                long jK0 = androidx.compose.ui.node.k.t(this).W.k0(((p2) androidx.compose.ui.node.k.h(this, androidx.compose.ui.platform.l1.s)).d());
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jK0 >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jK0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
                int size3 = r13.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    androidx.compose.ui.input.pointer.v vVar4 = (androidx.compose.ui.input.pointer.v) r13.get(i3);
                    if (vVar4.b() || androidx.compose.ui.input.pointer.u.f(vVar4, j, jFloatToRawIntBits)) {
                        this.j0 = null;
                        S0(false);
                        return;
                    }
                }
                return;
            }
        }
        ((androidx.compose.ui.input.pointer.v) r13.get(0)).a();
        if (this.S) {
            T0(vVar2.c, false);
            this.T.invoke();
        }
        this.j0 = null;
    }

    @Override // androidx.compose.foundation.j, androidx.compose.ui.node.r1
    public final void E() {
        super.E();
        if (this.j0 != null) {
            this.j0 = null;
            S0(false);
        }
    }

    @Override // androidx.compose.foundation.j
    public final androidx.compose.ui.input.pointer.l0 P0() {
        return null;
    }

    @Override // androidx.compose.foundation.j
    public final boolean X0(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.foundation.j
    public final void Y0(KeyEvent keyEvent) {
        this.T.invoke();
    }
}
