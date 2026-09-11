package com.app.mlounge.ui;

import androidx.compose.foundation.layout.w0;
import androidx.compose.material3.f3;
import androidx.compose.material3.o2;
import androidx.compose.material3.p3;
import androidx.compose.material3.t2;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.runtime.u2;
import androidx.compose.ui.text.m0;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ String y;
    public final /* synthetic */ kotlin.jvm.functions.a z;

    public /* synthetic */ v(String str, kotlin.jvm.functions.a aVar, int i) {
        this.e = i;
        this.y = str;
        this.z = aVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    f3.a(null, androidx.compose.foundation.shape.e.a(16), com.app.mlounge.ui.theme.b.b, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-1937432935, new v(this.y, this.z, 2), rVar), rVar, 12582912, Token.DOT);
                } else {
                    rVar.W();
                }
                return kotlin.y.a;
            case 1:
                ((Integer) obj2).getClass();
                h0.c(this.y, this.z, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(49));
                break;
            case 2:
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (rVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarO = androidx.compose.foundation.layout.b.o(oVar, 24);
                    androidx.compose.foundation.layout.v vVarA = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.K, rVar2, 48);
                    int iHashCode = Long.hashCode(rVar2.T);
                    androidx.compose.runtime.internal.j jVarL = rVar2.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, rVarO);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
                    rVar2.e0();
                    if (rVar2.S) {
                        rVar2.k(yVar);
                    } else {
                        rVar2.o0();
                    }
                    androidx.compose.runtime.s.x(rVar2, vVarA, androidx.compose.ui.node.f.e);
                    androidx.compose.runtime.s.x(rVar2, jVarL, androidx.compose.ui.node.f.d);
                    androidx.compose.runtime.s.p(rVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
                    androidx.compose.runtime.s.t(rVar2, androidx.compose.ui.node.f.g);
                    androidx.compose.runtime.s.x(rVar2, rVarC, androidx.compose.ui.node.f.c);
                    o2.a(null, com.app.mlounge.ui.theme.b.f, 0.0f, 0L, 0, 0.0f, rVar2, 0, 61);
                    float f = 16;
                    androidx.compose.foundation.layout.b.d(rVar2, w0.f(oVar, f));
                    u2 u2Var = u3.a;
                    m0 m0Var = ((t3) rVar2.j(u2Var)).h;
                    long j = androidx.compose.ui.graphics.t.d;
                    p3.b("One-Click Play", null, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, rVar2, 390, 0, 131066);
                    p3.b(this.y, null, androidx.compose.ui.graphics.t.b(0.7f, j), 0L, null, 0L, new androidx.compose.ui.text.style.k(3), 0L, 0, false, 0, 0, ((t3) rVar2.j(u2Var)).l, rVar2, 384, 0, 130042);
                    androidx.compose.foundation.layout.b.d(rVar2, w0.f(oVar, f));
                    t2.h(this.z, null, false, null, null, null, null, a.e, rVar2, 805306368, 510);
                    rVar2.p(true);
                } else {
                    rVar2.W();
                }
                return kotlin.y.a;
            default:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.player.i0.e(this.y, this.z, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(7));
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ v(String str, kotlin.jvm.functions.a aVar, int i, int i2) {
        this.e = i2;
        this.y = str;
        this.z = aVar;
    }
}
