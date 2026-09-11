package androidx.compose.material3;

import org.mozilla.javascript.Context;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class z1 implements kotlin.jvm.functions.p {
    public final /* synthetic */ androidx.compose.ui.graphics.n0 A;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ androidx.compose.foundation.interaction.k y;
    public final /* synthetic */ k3 z;

    public z1(boolean z, androidx.compose.foundation.interaction.k kVar, k3 k3Var, androidx.compose.ui.graphics.n0 n0Var) {
        this.e = z;
        this.y = kVar;
        this.z = k3Var;
        this.A = n0Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            w1.a.a(this.e, this.y, null, this.z, this.A, 0.0f, 0.0f, rVar, 100663296, Context.VERSION_ES6);
        } else {
            rVar.W();
        }
        return kotlin.y.a;
    }
}
