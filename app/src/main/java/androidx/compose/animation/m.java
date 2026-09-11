package androidx.compose.animation;

import androidx.compose.animation.core.e2;
import androidx.compose.animation.core.i2;
import androidx.compose.animation.core.j2;
import androidx.compose.animation.core.x1;
import androidx.compose.runtime.q1;
import com.app.mlounge.emulator.LibretroCore;
import java.util.ListIterator;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        long j = Integer.MIN_VALUE;
        a = (j & 4294967295L) | (j << 32);
    }

    public static final void a(e2 e2Var, androidx.compose.ui.r rVar, kotlin.jvm.functions.l lVar, androidx.compose.ui.e eVar, kotlin.jvm.functions.l lVar2, androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.r rVar2, int i) {
        int i2;
        kotlin.jvm.functions.l lVar3;
        androidx.compose.runtime.r rVar3;
        j2 j2Var;
        v vVar;
        x1 x1VarB;
        androidx.compose.runtime.r rVar4;
        kotlin.jvm.functions.l lVar4 = lVar;
        rVar2.c0(511725103);
        if ((i & 6) == 0) {
            i2 = (rVar2.f(e2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rVar2.f(rVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= rVar2.h(lVar4) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= rVar2.f(eVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            i2 |= rVar2.h(lVar2) ? 16384 : 8192;
        }
        androidx.compose.runtime.internal.f fVar2 = fVar;
        if ((196608 & i) == 0) {
            i2 |= rVar2.h(fVar2) ? 131072 : Parser.ARGC_LIMIT;
        }
        if (rVar2.T(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objQ = rVar2.Q();
            androidx.compose.runtime.f fVar3 = androidx.compose.runtime.m.a;
            if (z || objQ == fVar3) {
                objQ = new v(e2Var, eVar);
                rVar2.l0(objQ);
            }
            v vVar2 = (v) objQ;
            boolean z2 = i3 == 4;
            Object objQ2 = rVar2.Q();
            Object obj = objQ2;
            if (z2 || objQ2 == fVar3) {
                Object[] objArr = {e2Var.a.n()};
                androidx.compose.runtime.snapshots.q qVar = new androidx.compose.runtime.snapshots.q();
                qVar.addAll(kotlin.collections.n.V(objArr));
                rVar2.l0(qVar);
                obj = qVar;
            }
            androidx.compose.runtime.snapshots.q qVar2 = (androidx.compose.runtime.snapshots.q) obj;
            boolean z3 = i3 == 4;
            Object objQ3 = rVar2.Q();
            if (z3 || objQ3 == fVar3) {
                long[] jArr = androidx.collection.w0.a;
                objQ3 = new androidx.collection.o0();
                rVar2.l0(objQ3);
            }
            androidx.collection.o0 o0Var = (androidx.collection.o0) objQ3;
            j2 j2Var2 = e2Var.a;
            androidx.compose.runtime.h1 h1Var = e2Var.d;
            if (!qVar2.contains(j2Var2.n())) {
                qVar2.clear();
                qVar2.add(j2Var2.n());
            }
            if (kotlin.jvm.internal.l.a(j2Var2.n(), h1Var.getValue())) {
                if (qVar2.size() != 1 || !kotlin.jvm.internal.l.a(qVar2.get(0), j2Var2.n())) {
                    qVar2.clear();
                    qVar2.add(j2Var2.n());
                }
                if (o0Var.e != 1 || o0Var.c(j2Var2.n())) {
                    o0Var.a();
                }
                vVar2.b = eVar;
            }
            if (kotlin.jvm.internal.l.a(j2Var2.n(), h1Var.getValue()) || qVar2.contains(h1Var.getValue())) {
                j2Var = j2Var2;
            } else {
                ListIterator listIterator = qVar2.listIterator();
                int i4 = 0;
                while (true) {
                    androidx.compose.runtime.snapshots.u uVar = (androidx.compose.runtime.snapshots.u) listIterator;
                    j2Var = j2Var2;
                    if (!uVar.hasNext()) {
                        i4 = -1;
                        break;
                    } else {
                        if (kotlin.jvm.internal.l.a(lVar2.invoke(uVar.next()), lVar2.invoke(h1Var.getValue()))) {
                            break;
                        }
                        i4++;
                        j2Var2 = j2Var;
                    }
                }
                if (i4 == -1) {
                    qVar2.add(h1Var.getValue());
                } else {
                    qVar2.set(i4, h1Var.getValue());
                }
            }
            if (o0Var.c(h1Var.getValue()) && o0Var.c(j2Var.n())) {
                rVar2.b0(1925931827);
                rVar2.p(false);
                lVar3 = lVar4;
            } else {
                rVar2.b0(1966410449);
                o0Var.a();
                int size = qVar2.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj2 = qVar2.get(i5);
                    o0Var.m(obj2, androidx.compose.runtime.internal.k.c(-23915175, new j(e2Var, obj2, lVar4, vVar2, qVar2, fVar2), rVar2));
                    i5++;
                    lVar4 = lVar4;
                    fVar2 = fVar;
                }
                lVar3 = lVar4;
                rVar2.p(false);
            }
            boolean zF = rVar2.f(e2Var.f()) | rVar2.f(vVar2);
            Object objQ4 = rVar2.Q();
            if (zF || objQ4 == fVar3) {
                objQ4 = (l0) lVar3.invoke(vVar2);
                rVar2.l0(objQ4);
            }
            l0 l0Var = (l0) objQ4;
            e2 e2Var2 = vVar2.a;
            boolean zF2 = rVar2.f(vVar2);
            Object objQ5 = rVar2.Q();
            if (zF2 || objQ5 == fVar3) {
                objQ5 = androidx.compose.runtime.s.r(Boolean.FALSE);
                rVar2.l0(objQ5);
            }
            androidx.compose.runtime.y0 y0Var = (androidx.compose.runtime.y0) objQ5;
            androidx.compose.runtime.y0 y0VarV = androidx.compose.runtime.s.v(l0Var.d, rVar2);
            if (kotlin.jvm.internal.l.a(e2Var2.a.n(), e2Var2.d.getValue())) {
                y0Var.setValue(Boolean.FALSE);
            } else if (y0VarV.getValue() != null) {
                y0Var.setValue(Boolean.TRUE);
            }
            boolean zBooleanValue = ((Boolean) y0Var.getValue()).booleanValue();
            androidx.compose.ui.r rVar5 = androidx.compose.ui.o.b;
            if (zBooleanValue) {
                rVar2.b0(1353077497);
                vVar = vVar2;
                androidx.compose.runtime.r rVar6 = rVar2;
                x1VarB = i2.b(vVar2.a, androidx.compose.animation.core.e.q, null, rVar6, 0, 2);
                boolean zF3 = rVar6.f(x1VarB);
                Object objQ6 = rVar6.Q();
                if (zF3 || objQ6 == fVar3) {
                    objQ6 = androidx.compose.ui.draw.h.b(rVar5);
                    rVar6.l0(objQ6);
                }
                rVar5 = (androidx.compose.ui.r) objQ6;
                rVar6.p(false);
                rVar4 = rVar6;
            } else {
                androidx.compose.runtime.r rVar7 = rVar2;
                vVar = vVar2;
                rVar7.b0(1353343539);
                rVar7.p(false);
                x1VarB = null;
                rVar4 = rVar7;
            }
            androidx.compose.ui.r rVarD = rVar.d(rVar5.d(new r(x1VarB, y0VarV, vVar)));
            Object objQ7 = rVar4.Q();
            if (objQ7 == fVar3) {
                objQ7 = new o(vVar);
                rVar4.l0(objQ7);
            }
            o oVar = (o) objQ7;
            int iHashCode = Long.hashCode(rVar4.T);
            androidx.compose.runtime.internal.j jVarL = rVar4.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar4, rVarD);
            androidx.compose.ui.node.g.b.getClass();
            androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
            rVar4.e0();
            if (rVar4.S) {
                rVar4.k(yVar);
            } else {
                rVar4.o0();
            }
            androidx.compose.runtime.s.x(rVar4, oVar, androidx.compose.ui.node.f.e);
            androidx.compose.runtime.s.x(rVar4, jVarL, androidx.compose.ui.node.f.d);
            androidx.compose.runtime.s.p(rVar4, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
            androidx.compose.runtime.s.t(rVar4, androidx.compose.ui.node.f.g);
            androidx.compose.runtime.s.x(rVar4, rVarC, androidx.compose.ui.node.f.c);
            rVar4.b0(-860173498);
            int size2 = qVar2.size();
            int i6 = 0;
            while (i6 < size2) {
                androidx.compose.runtime.snapshots.q qVar3 = qVar2;
                Object obj3 = qVar3.get(i6);
                rVar4.X(-2026002954, lVar2.invoke(obj3), null, 0);
                kotlin.jvm.functions.p pVar = (kotlin.jvm.functions.p) o0Var.g(obj3);
                if (pVar == null) {
                    rVar4.b0(1618454323);
                } else {
                    rVar4.b0(-2026001778);
                    pVar.invoke(rVar4, 0);
                }
                rVar4.p(false);
                rVar4.p(false);
                i6++;
                qVar2 = qVar3;
            }
            rVar4.p(false);
            rVar4.p(true);
            rVar3 = rVar4;
        } else {
            lVar3 = lVar4;
            androidx.compose.runtime.r rVar8 = rVar2;
            rVar8.W();
            rVar3 = rVar8;
        }
        q1 q1VarT = rVar3.t();
        if (q1VarT != null) {
            q1VarT.d = new k(e2Var, rVar, lVar3, eVar, lVar2, fVar, i);
        }
    }
}
