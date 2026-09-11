package com.app.mlounge.ui.screens.movies;

import androidx.compose.foundation.layout.r0;
import androidx.compose.foundation.layout.t0;
import androidx.compose.foundation.layout.w0;
import androidx.compose.material3.f1;
import androidx.compose.material3.o2;
import androidx.compose.material3.p3;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.runtime.r;
import androidx.compose.runtime.s;
import androidx.compose.ui.node.y;
import androidx.compose.ui.o;
import com.app.mlounge.data.remote.model.ChqStream;
import com.app.mlounge.ui.screens.services.n;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e = 2;
    public final /* synthetic */ Object y;
    public final /* synthetic */ boolean z;

    public /* synthetic */ c(ChqStream chqStream, boolean z, kotlin.jvm.functions.a aVar, int i) {
        this.A = chqStream;
        this.z = z;
        this.y = aVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        o oVar;
        switch (this.e) {
            case 0:
                androidx.compose.ui.graphics.vector.f fVar = (androidx.compose.ui.graphics.vector.f) this.A;
                String str = (String) this.y;
                r rVar = (r) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    float f = 12;
                    o oVar2 = o.b;
                    androidx.compose.ui.r rVarP = androidx.compose.foundation.layout.b.p(oVar2, f, f);
                    t0 t0VarA = r0.a(androidx.compose.foundation.layout.h.d, androidx.compose.ui.c.H, rVar, 54);
                    int iHashCode = Long.hashCode(rVar.T);
                    androidx.compose.runtime.internal.j jVarL = rVar.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar, rVarP);
                    androidx.compose.ui.node.g.b.getClass();
                    y yVar = androidx.compose.ui.node.f.b;
                    rVar.e0();
                    if (rVar.S) {
                        rVar.k(yVar);
                    } else {
                        rVar.o0();
                    }
                    s.x(rVar, t0VarA, androidx.compose.ui.node.f.e);
                    s.x(rVar, jVarL, androidx.compose.ui.node.f.d);
                    s.p(rVar, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
                    s.t(rVar, androidx.compose.ui.node.f.g);
                    s.x(rVar, rVarC, androidx.compose.ui.node.f.c);
                    if (this.z) {
                        rVar.b0(-1407407818);
                        o2.a(w0.l(oVar2, 16), com.app.mlounge.ui.theme.b.l, 2, 0L, 0, 0.0f, rVar, 390, 56);
                        rVar = rVar;
                        rVar.p(false);
                        oVar = oVar2;
                    } else {
                        oVar = oVar2;
                        rVar.b0(-1407182386);
                        f1.b(fVar, null, w0.l(oVar, 16), com.app.mlounge.ui.theme.b.l, rVar, 432, 0);
                        rVar.p(false);
                    }
                    androidx.compose.foundation.layout.b.d(rVar, w0.p(oVar, 6));
                    r rVar2 = rVar;
                    p3.b(str, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 1, 0, ((t3) rVar.j(u3.a)).o, rVar2, 0, 24576, 114682);
                    rVar2.p(true);
                } else {
                    rVar.W();
                }
                return kotlin.y.a;
            case 1:
                ((Integer) obj2).getClass();
                n.c((String) this.y, this.z, (l) this.A, (r) obj, s.A(7));
                break;
            default:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.sources.a.b((ChqStream) this.A, this.z, (kotlin.jvm.functions.a) this.y, (r) obj, s.A(1));
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ c(String str, boolean z, l lVar, int i) {
        this.y = str;
        this.z = z;
        this.A = lVar;
    }

    public /* synthetic */ c(boolean z, androidx.compose.ui.graphics.vector.f fVar, String str) {
        this.z = z;
        this.A = fVar;
        this.y = str;
    }
}
