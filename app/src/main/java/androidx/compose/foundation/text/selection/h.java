package androidx.compose.foundation.text.selection;

import androidx.appcompat.widget.c2;
import androidx.compose.material3.o2;
import androidx.compose.material3.p3;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements kotlin.jvm.functions.q {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ Object z;

    public /* synthetic */ h(String str, boolean z) {
        this.y = z;
        this.z = str;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.e) {
            case 0:
                final kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) this.z;
                androidx.compose.ui.r rVar = (androidx.compose.ui.r) obj;
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj2;
                ((Integer) obj3).getClass();
                rVar2.b0(-196777734);
                final long j = ((j1) rVar2.j(k1.a)).a;
                boolean zE = rVar2.e(j) | rVar2.f(aVar);
                final boolean z = this.y;
                boolean zG = zE | rVar2.g(z);
                Object objQ = rVar2.Q();
                if (zG || objQ == androidx.compose.runtime.m.a) {
                    objQ = new kotlin.jvm.functions.l() { // from class: androidx.compose.foundation.text.selection.i
                        @Override // kotlin.jvm.functions.l
                        public final Object invoke(Object obj4) {
                            androidx.compose.ui.draw.d dVar = (androidx.compose.ui.draw.d) obj4;
                            final androidx.compose.ui.graphics.g gVarK = _COROUTINE.b.k(dVar, Float.intBitsToFloat((int) (dVar.e.d() >> 32)) / 2.0f);
                            final androidx.compose.ui.graphics.m mVar = new androidx.compose.ui.graphics.m(j, 5);
                            final kotlin.jvm.functions.a aVar2 = aVar;
                            final boolean z2 = z;
                            return dVar.b(new kotlin.jvm.functions.l() { // from class: androidx.compose.foundation.text.selection.a
                                @Override // kotlin.jvm.functions.l
                                public final Object invoke(Object obj5) {
                                    androidx.compose.ui.node.h0 h0Var = (androidx.compose.ui.node.h0) obj5;
                                    h0Var.b();
                                    androidx.compose.ui.graphics.drawscope.b bVar = h0Var.e;
                                    if (((Boolean) aVar2.invoke()).booleanValue()) {
                                        boolean z3 = z2;
                                        androidx.compose.ui.graphics.g gVar = gVarK;
                                        androidx.compose.ui.graphics.m mVar2 = mVar;
                                        if (z3) {
                                            long jI0 = bVar.i0();
                                            c2 c2Var = bVar.y;
                                            long jH = c2Var.H();
                                            c2Var.w().f();
                                            try {
                                                ((com.google.firebase.platforminfo.c) c2Var.y).n(-1.0f, 1.0f, jI0);
                                                bVar.f(gVar, mVar2);
                                            } finally {
                                                androidx.privacysandbox.ads.adservices.java.internal.a.B(c2Var, jH);
                                            }
                                        } else {
                                            bVar.f(gVar, mVar2);
                                        }
                                    }
                                    return kotlin.y.a;
                                }
                            });
                        }
                    };
                    rVar2.l0(objQ);
                }
                androidx.compose.ui.r rVarD = androidx.compose.ui.draw.h.d(rVar, (kotlin.jvm.functions.l) objQ);
                rVar2.p(false);
                return rVarD;
            default:
                String str = (String) this.z;
                androidx.compose.runtime.r rVar3 = (androidx.compose.runtime.r) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.layout.u0) obj).getClass();
                if (rVar3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    boolean z2 = this.y;
                    if (z2) {
                        rVar3.b0(1516335711);
                        long j2 = com.app.mlounge.ui.theme.b.f;
                        androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                        o2.a(androidx.compose.foundation.layout.w0.l(oVar, 18), j2, 2, 0L, 0, 0.0f, rVar3, 438, 56);
                        androidx.compose.foundation.layout.b.d(rVar3, androidx.compose.foundation.layout.w0.p(oVar, 8));
                        rVar3.p(false);
                    } else {
                        rVar3.b0(1516552897);
                        rVar3.p(false);
                    }
                    if (z2) {
                        str = "Loading...";
                    }
                    p3.b(str, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar3, 0, 0, 262142);
                } else {
                    rVar3.W();
                }
                return kotlin.y.a;
        }
    }

    public /* synthetic */ h(kotlin.jvm.functions.a aVar, boolean z) {
        this.z = aVar;
        this.y = z;
    }
}
