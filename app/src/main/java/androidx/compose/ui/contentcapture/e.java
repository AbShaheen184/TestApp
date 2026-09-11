package androidx.compose.ui.contentcapture;

import androidx.compose.runtime.e2;
import androidx.compose.runtime.r;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.compose.ui.graphics.k0;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.c1;
import androidx.compose.ui.node.d1;
import androidx.compose.ui.node.i0;
import androidx.compose.ui.node.o1;
import androidx.compose.ui.platform.j2;
import androidx.compose.ui.platform.m0;
import androidx.compose.ui.platform.u;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.m;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends m implements p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(u uVar, p pVar, int i) {
        super(2);
        this.y = 3;
        this.z = uVar;
        this.A = pVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        int i = this.y;
        y yVar = y.a;
        Object obj3 = this.A;
        Object obj4 = this.z;
        switch (i) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                androidx.compose.ui.semantics.p pVar = (androidx.compose.ui.semantics.p) obj2;
                f fVar = (f) obj3;
                if (!((j2) obj4).b.b(pVar.g)) {
                    fVar.j(iIntValue, pVar);
                    fVar.E.mo28trySendJP2dKIU(yVar);
                }
                break;
            case 1:
                r rVar = (r) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!rVar.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    rVar.W();
                } else {
                    Boolean bool = (Boolean) ((f0) obj4).g.getValue();
                    boolean zBooleanValue = bool.booleanValue();
                    p pVar2 = (p) obj3;
                    rVar.d0(bool);
                    boolean zG = rVar.g(zBooleanValue);
                    if (zBooleanValue) {
                        pVar2.invoke(rVar, 0);
                    } else {
                        if (rVar.l != 0) {
                            t.a("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!rVar.S) {
                            if (zG) {
                                e2 e2Var = rVar.G;
                                int i2 = e2Var.g;
                                int i3 = e2Var.h;
                                androidx.compose.runtime.changelist.b bVar = rVar.M;
                                bVar.getClass();
                                bVar.d(false);
                                bVar.b.l.J(androidx.compose.runtime.changelist.i.c);
                                s.c(i2, rVar.s, i3);
                                rVar.G.t();
                            } else {
                                rVar.V();
                            }
                        }
                    }
                    if (rVar.y && rVar.G.i == rVar.z) {
                        rVar.z = -1;
                        rVar.y = false;
                    }
                    rVar.p(false);
                }
                break;
            case 2:
                androidx.compose.ui.graphics.r rVar2 = (androidx.compose.ui.graphics.r) obj;
                androidx.compose.ui.graphics.layer.b bVar2 = (androidx.compose.ui.graphics.layer.b) obj2;
                d1 d1Var = (d1) obj4;
                androidx.compose.ui.node.f0 f0Var = d1Var.L;
                if (!f0Var.I()) {
                    d1Var.h0 = true;
                } else {
                    d1Var.e0 = rVar2;
                    d1Var.d0 = bVar2;
                    o1 snapshotObserver = ((u) i0.a(f0Var)).getSnapshotObserver();
                    k0 k0Var = d1.j0;
                    snapshotObserver.a.d(d1Var, androidx.compose.ui.node.d.B, (c1) obj3);
                    d1Var.h0 = false;
                }
                break;
            default:
                ((Number) obj2).intValue();
                m0.a((u) obj4, (p) obj3, (r) obj, s.A(1));
                break;
        }
        return yVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, Object obj, Object obj2) {
        super(2);
        this.y = i;
        this.z = obj;
        this.A = obj2;
    }
}
