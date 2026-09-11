package androidx.compose.foundation.text;

import androidx.compose.material3.p3;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ long y;
    public final /* synthetic */ Object z;

    public /* synthetic */ a(long j, kotlin.jvm.functions.p pVar, int i) {
        this.e = 1;
        this.y = j;
        this.z = pVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                androidx.compose.ui.r rVar = (androidx.compose.ui.r) this.z;
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (rVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    long j = this.y;
                    if (j != 9205357640488583168L) {
                        rVar2.b0(-1244013944);
                        androidx.compose.ui.r rVarK = androidx.compose.foundation.layout.w0.k(rVar, androidx.compose.ui.unit.h.b(j), androidx.compose.ui.unit.h.a(j), 0.0f, 0.0f, 12);
                        androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.y, false);
                        int iHashCode = Long.hashCode(rVar2.T);
                        androidx.compose.runtime.internal.j jVarL = rVar2.l();
                        androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, rVarK);
                        androidx.compose.ui.node.g.b.getClass();
                        androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
                        rVar2.e0();
                        if (rVar2.S) {
                            rVar2.k(yVar);
                        } else {
                            rVar2.o0();
                        }
                        androidx.compose.runtime.s.x(rVar2, q0VarD, androidx.compose.ui.node.f.e);
                        androidx.compose.runtime.s.x(rVar2, jVarL, androidx.compose.ui.node.f.d);
                        androidx.compose.runtime.s.p(rVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
                        androidx.compose.runtime.s.t(rVar2, androidx.compose.ui.node.f.g);
                        androidx.compose.runtime.s.x(rVar2, rVarC, androidx.compose.ui.node.f.c);
                        d.b(null, rVar2, 0, 1);
                        rVar2.p(true);
                        rVar2.p(false);
                    } else {
                        rVar2.b0(-1243644858);
                        d.b(rVar, rVar2, 0, 0);
                        rVar2.p(false);
                    }
                } else {
                    rVar2.W();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                androidx.compose.material3.internal.z.c(this.y, (kotlin.jvm.functions.p) this.z, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(1));
                break;
            default:
                String str = (String) this.z;
                androidx.compose.runtime.r rVar3 = (androidx.compose.runtime.r) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (rVar3.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.b(str, androidx.compose.foundation.layout.b.p(androidx.compose.ui.o.b, 24, 12), androidx.compose.ui.graphics.t.c(this.y, com.app.mlounge.ui.theme.b.f) ? androidx.compose.ui.graphics.t.d : com.app.mlounge.ui.theme.b.m, 0L, androidx.compose.ui.text.font.l.C, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar3.j(u3.a)).k, rVar3, 1572912, 0, 131000);
                } else {
                    rVar3.W();
                }
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ a(long j, Object obj, int i) {
        this.e = i;
        this.y = j;
        this.z = obj;
    }
}
