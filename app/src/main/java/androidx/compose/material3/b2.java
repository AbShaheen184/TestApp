package androidx.compose.material3;

import android.content.Context;
import com.app.mlounge.R;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b2 implements kotlin.jvm.functions.p {
    public final /* synthetic */ String A;
    public final /* synthetic */ kotlin.jvm.functions.l B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ androidx.compose.ui.text.m0 E;
    public final /* synthetic */ androidx.compose.foundation.text.q0 F;
    public final /* synthetic */ androidx.compose.foundation.text.p0 G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;
    public final /* synthetic */ androidx.compose.ui.text.input.g0 K;
    public final /* synthetic */ androidx.compose.foundation.interaction.k L;
    public final /* synthetic */ kotlin.jvm.functions.p M;
    public final /* synthetic */ kotlin.jvm.functions.p N;
    public final /* synthetic */ kotlin.jvm.functions.p O;
    public final /* synthetic */ androidx.compose.ui.graphics.n0 P;
    public final /* synthetic */ androidx.compose.ui.r e;
    public final /* synthetic */ kotlin.jvm.functions.p y;
    public final /* synthetic */ k3 z;

    public b2(androidx.compose.ui.r rVar, kotlin.jvm.functions.p pVar, k3 k3Var, String str, kotlin.jvm.functions.l lVar, boolean z, boolean z2, androidx.compose.ui.text.m0 m0Var, androidx.compose.foundation.text.q0 q0Var, androidx.compose.foundation.text.p0 p0Var, boolean z3, int i, int i2, androidx.compose.ui.text.input.g0 g0Var, androidx.compose.foundation.interaction.k kVar, kotlin.jvm.functions.p pVar2, kotlin.jvm.functions.p pVar3, kotlin.jvm.functions.p pVar4, androidx.compose.ui.graphics.n0 n0Var) {
        this.e = rVar;
        this.y = pVar;
        this.z = k3Var;
        this.A = str;
        this.B = lVar;
        this.C = z;
        this.D = z2;
        this.E = m0Var;
        this.F = q0Var;
        this.G = p0Var;
        this.H = z3;
        this.I = i;
        this.J = i2;
        this.K = g0Var;
        this.L = kVar;
        this.M = pVar2;
        this.N = pVar3;
        this.O = pVar4;
        this.P = n0Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            kotlin.jvm.functions.p pVar = this.y;
            androidx.compose.ui.r rVarS = androidx.compose.ui.o.b;
            if (pVar != null) {
                rVar.b0(-903490605);
                Object objQ = rVar.Q();
                if (objQ == androidx.compose.runtime.m.a) {
                    objQ = new androidx.compose.foundation.lazy.i(22);
                    rVar.l0(objQ);
                }
                rVarS = androidx.compose.foundation.layout.b.s(androidx.compose.ui.semantics.n.a(rVarS, true, (kotlin.jvm.functions.l) objQ), 0.0f, androidx.compose.material3.internal.z.e(rVar), 0.0f, 0.0f, 13);
                rVar.p(false);
            } else {
                rVar.b0(-903106918);
                rVar.p(false);
            }
            androidx.compose.ui.r rVarD = this.e.d(rVarS);
            rVar.j(androidx.compose.ui.platform.m0.a);
            ((Context) rVar.j(androidx.compose.ui.platform.m0.b)).getResources().getString(R.string.default_error_message);
            float f = androidx.compose.material3.internal.z.a;
            androidx.compose.ui.r rVarA = androidx.compose.foundation.layout.w0.a(rVarD, w1.c, w1.b);
            k3 k3Var = this.z;
            androidx.compose.ui.graphics.p0 p0Var = new androidx.compose.ui.graphics.p0(k3Var.i);
            kotlin.jvm.functions.p pVar2 = this.O;
            androidx.compose.ui.graphics.n0 n0Var = this.P;
            String str = this.A;
            boolean z = this.C;
            boolean z2 = this.H;
            androidx.compose.ui.text.input.g0 g0Var = this.K;
            androidx.compose.foundation.interaction.k kVar = this.L;
            androidx.compose.foundation.text.h.a(str, this.B, rVarA, z, this.D, this.E, this.F, this.G, z2, this.I, this.J, g0Var, null, kVar, p0Var, androidx.compose.runtime.internal.k.c(-1189274459, new a2(str, z, z2, g0Var, kVar, this.y, this.M, this.N, pVar2, k3Var, n0Var), rVar), rVar, 0);
        } else {
            rVar.W();
        }
        return kotlin.y.a;
    }
}
