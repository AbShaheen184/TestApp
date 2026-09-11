package com.app.mlounge.ui.components;

import androidx.compose.foundation.layout.r0;
import androidx.compose.foundation.layout.t0;
import androidx.compose.foundation.layout.w0;
import androidx.compose.material3.f1;
import androidx.compose.material3.p3;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.datastore.preferences.protobuf.h1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean y;

    public /* synthetic */ p(int i, boolean z) {
        this.e = 4;
        this.y = z;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.b(this.y ? "Enter PIN" : "PIN", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar, 0, 0, 262142);
                } else {
                    rVar.W();
                }
                break;
            case 1:
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (rVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.b("18+", androidx.compose.foundation.layout.b.p(androidx.compose.ui.o.b, 12, 8), this.y ? com.app.mlounge.ui.theme.b.j : com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar2.j(u3.a)).n, rVar2, 54, 0, 131064);
                } else {
                    rVar2.W();
                }
                break;
            case 2:
                androidx.compose.runtime.r rVar3 = (androidx.compose.runtime.r) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (rVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarP = androidx.compose.foundation.layout.b.p(oVar, 12, 8);
                    t0 t0VarA = r0.a(androidx.compose.foundation.layout.h.g(4), androidx.compose.ui.c.H, rVar3, 54);
                    int iHashCode = Long.hashCode(rVar3.T);
                    androidx.compose.runtime.internal.j jVarL = rVar3.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar3, rVarP);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
                    rVar3.e0();
                    if (rVar3.S) {
                        rVar3.k(yVar);
                    } else {
                        rVar3.o0();
                    }
                    androidx.compose.runtime.s.x(rVar3, t0VarA, androidx.compose.ui.node.f.e);
                    androidx.compose.runtime.s.x(rVar3, jVarL, androidx.compose.ui.node.f.d);
                    androidx.compose.runtime.s.p(rVar3, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
                    androidx.compose.runtime.s.t(rVar3, androidx.compose.ui.node.f.g);
                    androidx.compose.runtime.s.x(rVar3, rVarC, androidx.compose.ui.node.f.c);
                    boolean z = this.y;
                    f1.b(z ? com.google.android.gms.dynamite.g.p() : h1.n(), null, w0.l(oVar, 14), z ? androidx.compose.ui.graphics.a0.d(4293467747L) : com.app.mlounge.ui.theme.b.m, rVar3, 432, 0);
                    p3.b("Favourites", null, z ? androidx.compose.ui.graphics.a0.d(4293467747L) : com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar3.j(u3.a)).n, rVar3, 6, 0, 131066);
                    rVar3.p(true);
                } else {
                    rVar3.W();
                }
                break;
            case 3:
                androidx.compose.runtime.r rVar4 = (androidx.compose.runtime.r) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (rVar4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean z2 = this.y;
                    p3.b(z2 ? "Connected" : "Not Connected", androidx.compose.foundation.layout.b.p(androidx.compose.ui.o.b, 8, 4), z2 ? com.app.mlounge.ui.theme.b.h : com.app.mlounge.ui.theme.b.n, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar4.j(u3.a)).o, rVar4, 48, 0, 131064);
                } else {
                    rVar4.W();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.services.n.l(this.y, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(1));
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ p(boolean z, int i, byte b) {
        this.e = i;
        this.y = z;
    }
}
