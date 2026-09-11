package androidx.compose.material3;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a2 implements kotlin.jvm.functions.q {
    public final /* synthetic */ androidx.compose.ui.text.input.g0 A;
    public final /* synthetic */ androidx.compose.foundation.interaction.k B;
    public final /* synthetic */ kotlin.jvm.functions.p C;
    public final /* synthetic */ kotlin.jvm.functions.p D;
    public final /* synthetic */ kotlin.jvm.functions.p E;
    public final /* synthetic */ kotlin.jvm.functions.p F;
    public final /* synthetic */ k3 G;
    public final /* synthetic */ androidx.compose.ui.graphics.n0 H;
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ boolean z;

    public a2(String str, boolean z, boolean z2, androidx.compose.ui.text.input.g0 g0Var, androidx.compose.foundation.interaction.k kVar, kotlin.jvm.functions.p pVar, kotlin.jvm.functions.p pVar2, kotlin.jvm.functions.p pVar3, kotlin.jvm.functions.p pVar4, k3 k3Var, androidx.compose.ui.graphics.n0 n0Var) {
        this.e = str;
        this.y = z;
        this.z = z2;
        this.A = g0Var;
        this.B = kVar;
        this.C = pVar;
        this.D = pVar2;
        this.E = pVar3;
        this.F = pVar4;
        this.G = k3Var;
        this.H = n0Var;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        kotlin.jvm.functions.p pVar = (kotlin.jvm.functions.p) obj;
        androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= rVar.h(pVar) ? 4 : 2;
        }
        if (rVar.T(iIntValue & 1, (iIntValue & 19) != 18)) {
            int i = iIntValue;
            w1 w1Var = w1.a;
            androidx.compose.ui.graphics.n0 n0Var = this.H;
            boolean z = this.y;
            androidx.compose.foundation.interaction.k kVar = this.B;
            k3 k3Var = this.G;
            w1Var.b(this.e, pVar, z, this.z, this.A, kVar, this.C, this.D, this.E, this.F, k3Var, null, androidx.compose.runtime.internal.k.c(-656940872, new z1(z, kVar, k3Var, n0Var), rVar), rVar, (i << 3) & Token.ASSIGN_MOD);
        } else {
            rVar.W();
        }
        return kotlin.y.a;
    }
}
