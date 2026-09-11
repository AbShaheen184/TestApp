package com.app.mlounge.ui.components;

import androidx.compose.foundation.layout.r0;
import androidx.compose.foundation.layout.t0;
import androidx.compose.foundation.layout.w0;
import androidx.compose.material3.f1;
import androidx.compose.material3.p3;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m0 implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ String y;
    public final /* synthetic */ String z;

    public /* synthetic */ m0(String str, String str2, int i) {
        this.e = 1;
        this.y = str;
        this.z = str2;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    androidx.compose.ui.text.m0 m0Var = ((t3) rVar.j(u3.a)).n;
                    String str = this.y;
                    String str2 = this.z;
                    p3.b(str2, androidx.compose.foundation.layout.b.p(androidx.compose.ui.o.b, 12, 8), kotlin.jvm.internal.l.a(str, str2) ? com.app.mlounge.ui.theme.b.f : com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, rVar, 48, 0, 131064);
                } else {
                    rVar.W();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.games.a.e(this.y, this.z, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(7));
                break;
            default:
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (rVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarP = androidx.compose.foundation.layout.b.p(oVar, 12, 8);
                    t0 t0VarA = r0.a(androidx.compose.foundation.layout.h.g(4), androidx.compose.ui.c.H, rVar2, 54);
                    int iHashCode = Long.hashCode(rVar2.T);
                    androidx.compose.runtime.internal.j jVarL = rVar2.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, rVarP);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
                    rVar2.e0();
                    if (rVar2.S) {
                        rVar2.k(yVar);
                    } else {
                        rVar2.o0();
                    }
                    androidx.compose.runtime.s.x(rVar2, t0VarA, androidx.compose.ui.node.f.e);
                    androidx.compose.runtime.s.x(rVar2, jVarL, androidx.compose.ui.node.f.d);
                    androidx.compose.runtime.s.p(rVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
                    androidx.compose.runtime.s.t(rVar2, androidx.compose.ui.node.f.g);
                    androidx.compose.runtime.s.x(rVar2, rVarC, androidx.compose.ui.node.f.c);
                    androidx.compose.ui.text.m0 m0Var2 = ((t3) rVar2.j(u3.a)).n;
                    String str3 = this.y;
                    p3.b(this.z, null, str3 != null ? com.app.mlounge.ui.theme.b.f : com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var2, rVar2, 0, 0, 131066);
                    f1.b(coil3.network.g.n(), null, w0.l(oVar, 16), str3 != null ? com.app.mlounge.ui.theme.b.f : com.app.mlounge.ui.theme.b.m, rVar2, 432, 0);
                    rVar2.p(true);
                } else {
                    rVar2.W();
                }
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ m0(String str, String str2, int i, byte b) {
        this.e = i;
        this.y = str;
        this.z = str2;
    }
}
