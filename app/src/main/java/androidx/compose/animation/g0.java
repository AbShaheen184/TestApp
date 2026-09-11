package androidx.compose.animation;

import androidx.compose.animation.core.e2;
import androidx.compose.animation.core.i2;
import androidx.compose.animation.core.j2;
import androidx.compose.animation.core.l2;
import androidx.compose.animation.core.n1;
import androidx.compose.animation.core.x1;
import androidx.compose.runtime.o2;
import androidx.compose.runtime.q1;
import com.app.mlounge.emulator.LibretroCore;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {
    public static final void a(e2 e2Var, kotlin.jvm.functions.l lVar, androidx.compose.ui.r rVar, x0 x0Var, y0 y0Var, kotlin.jvm.functions.p pVar, androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.r rVar2, int i) {
        Object obj;
        e2 e2Var2;
        boolean z;
        x1 x1Var;
        x1 x1Var2;
        boolean z2;
        x1 x1VarB;
        y0 y0Var2;
        x0 x0Var2;
        androidx.compose.runtime.internal.f fVar2 = fVar;
        rVar2.c0(1912839215);
        int i2 = (rVar2.f(e2Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= rVar2.h(lVar) ? 32 : 16;
        }
        int i3 = i2 | (rVar2.f(rVar) ? LibretroCore.SCREEN_WIDTH : 128);
        if ((i & 3072) == 0) {
            i3 |= rVar2.f(x0Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            i3 |= rVar2.f(y0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= rVar2.h(pVar) ? 131072 : Parser.ARGC_LIMIT;
        }
        int i4 = i3 | 1572864;
        if ((12582912 & i) == 0) {
            i4 |= rVar2.h(fVar2) ? 8388608 : 4194304;
        }
        int i5 = i4;
        if (rVar2.T(i5 & 1, (4793491 & i5) != 4793490)) {
            androidx.compose.runtime.h1 h1Var = e2Var.d;
            j2 j2Var = e2Var.a;
            if (((Boolean) lVar.invoke(h1Var.getValue())).booleanValue() || ((Boolean) lVar.invoke(j2Var.n())).booleanValue() || e2Var.g() || e2Var.d()) {
                rVar2.b0(-232413539);
                int i6 = i5 & 14;
                int i7 = i6 | 48;
                int i8 = i7 & 14;
                boolean z3 = ((i8 ^ 6) > 4 && rVar2.f(e2Var)) || (i7 & 6) == 4;
                Object objQ = rVar2.Q();
                boolean z4 = z3;
                Object obj2 = androidx.compose.runtime.m.a;
                if (z4 || objQ == obj2) {
                    objQ = j2Var.n();
                    rVar2.l0(objQ);
                }
                if (e2Var.g()) {
                    objQ = j2Var.n();
                }
                rVar2.b0(1844425648);
                m0 m0VarD = d(e2Var, lVar, objQ, rVar2);
                rVar2.p(false);
                Object value = e2Var.d.getValue();
                rVar2.b0(1844425648);
                m0 m0VarD2 = d(e2Var, lVar, value, rVar2);
                rVar2.p(false);
                int i9 = i8 | 3072;
                n1 n1Var = i2.a;
                int i10 = (i9 & 14) ^ 6;
                boolean z5 = (i10 > 4 && rVar2.f(e2Var)) || (i9 & 6) == 4;
                Object objQ2 = rVar2.Q();
                if (z5 || objQ2 == obj2) {
                    objQ2 = new e2(new androidx.compose.animation.core.p0(m0VarD), e2Var, androidx.privacysandbox.ads.adservices.java.internal.a.u(new StringBuilder(), e2Var.c, " > EnterExitTransition"));
                    rVar2.l0(objQ2);
                }
                e2 e2Var3 = (e2) objQ2;
                boolean zF = ((i10 > 4 && rVar2.f(e2Var)) || (i9 & 6) == 4) | rVar2.f(e2Var3);
                Object objQ3 = rVar2.Q();
                if (zF || objQ3 == obj2) {
                    objQ3 = new androidx.activity.compose.h(5, e2Var, e2Var3);
                    rVar2.l0(objQ3);
                }
                androidx.compose.runtime.j0.b(e2Var3, (kotlin.jvm.functions.l) objQ3, rVar2);
                if (e2Var.g()) {
                    e2Var3.k(m0VarD, m0VarD2);
                } else {
                    e2Var3.p(m0VarD2);
                    e2Var3.k.setValue(Boolean.FALSE);
                }
                Object objV = androidx.compose.runtime.s.v(pVar, rVar2);
                j2 j2Var2 = e2Var3.a;
                j2 j2Var3 = e2Var3.a;
                androidx.compose.runtime.h1 h1Var2 = e2Var3.d;
                Object objInvoke = pVar.invoke(j2Var2.n(), h1Var2.getValue());
                boolean zF2 = rVar2.f(e2Var3) | rVar2.f(objV);
                Object objQ4 = rVar2.Q();
                kotlin.coroutines.d dVar = null;
                if (zF2 || objQ4 == obj2) {
                    objQ4 = new b0(e2Var3, objV, dVar, 0);
                    rVar2.l0(objQ4);
                }
                kotlin.jvm.functions.p pVar2 = (kotlin.jvm.functions.p) objQ4;
                Object objQ5 = rVar2.Q();
                if (objQ5 == obj2) {
                    objQ5 = androidx.compose.runtime.s.r(objInvoke);
                    rVar2.l0(objQ5);
                }
                androidx.compose.runtime.y0 y0Var3 = (androidx.compose.runtime.y0) objQ5;
                boolean zH = rVar2.h(pVar2);
                Object objQ6 = rVar2.Q();
                if (zH || objQ6 == obj2) {
                    objQ6 = new o2(pVar2, y0Var3, dVar, 0);
                    rVar2.l0(objQ6);
                }
                androidx.compose.runtime.j0.c(rVar2, kotlin.y.a, (kotlin.jvm.functions.p) objQ6);
                Object objN = j2Var3.n();
                m0 m0Var = m0.z;
                if (objN == m0Var && h1Var2.getValue() == m0Var && ((Boolean) y0Var3.getValue()).booleanValue()) {
                    rVar2.b0(-272333293);
                    rVar2.p(false);
                    fVar2 = fVar;
                    z = false;
                } else {
                    rVar2.b0(-231383533);
                    boolean z6 = i6 == 4;
                    Object objQ7 = rVar2.Q();
                    if (z6 || objQ7 == obj2) {
                        objQ7 = new i0();
                        rVar2.l0(objQ7);
                    }
                    i0 i0Var = (i0) objQ7;
                    l2 l2Var = s0.a;
                    Object objQ8 = rVar2.Q();
                    if (objQ8 == obj2) {
                        objQ8 = q0.y;
                        rVar2.l0(objQ8);
                    }
                    kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) objQ8;
                    boolean zF3 = rVar2.f(e2Var3);
                    Object objQ9 = rVar2.Q();
                    if (zF3 || objQ9 == obj2) {
                        objQ9 = androidx.compose.runtime.s.r(x0Var);
                        rVar2.l0(objQ9);
                    }
                    androidx.compose.runtime.y0 y0Var4 = (androidx.compose.runtime.y0) objQ9;
                    Object objN2 = j2Var3.n();
                    Object value2 = h1Var2.getValue();
                    m0 m0Var2 = m0.y;
                    if (objN2 == value2 && j2Var3.n() == m0Var2) {
                        if (e2Var3.g()) {
                            y0Var4.setValue(x0Var);
                        } else {
                            y0Var4.setValue(x0.b);
                        }
                    } else if (h1Var2.getValue() == m0Var2) {
                        y0Var4.setValue(((x0) y0Var4.getValue()).a(x0Var));
                    }
                    x0 x0Var3 = (x0) y0Var4.getValue();
                    boolean zF4 = rVar2.f(e2Var3);
                    Object objQ10 = rVar2.Q();
                    if (zF4 || objQ10 == obj2) {
                        objQ10 = androidx.compose.runtime.s.r(y0Var);
                        rVar2.l0(objQ10);
                    }
                    androidx.compose.runtime.y0 y0Var5 = (androidx.compose.runtime.y0) objQ10;
                    if (j2Var3.n() == h1Var2.getValue() && j2Var3.n() == m0Var2) {
                        if (e2Var3.g()) {
                            y0Var5.setValue(y0Var);
                        } else {
                            y0Var5.setValue(y0.b);
                        }
                    } else if (h1Var2.getValue() != m0Var2) {
                        y0Var5.setValue(((y0) y0Var5.getValue()).a(y0Var));
                    }
                    y0 y0Var6 = (y0) y0Var5.getValue();
                    h1 h1Var3 = x0Var3.a;
                    h1 h1Var4 = y0Var6.a;
                    boolean z7 = (h1Var3.b == null && h1Var4.b == null) ? false : true;
                    rVar2.b0(133898448);
                    rVar2.p(false);
                    if (z7) {
                        rVar2.b0(133990239);
                        l2 l2Var2 = androidx.compose.animation.core.e.q;
                        Object objQ11 = rVar2.Q();
                        if (objQ11 == obj2) {
                            objQ11 = "Built-in shrink/expand";
                            rVar2.l0("Built-in shrink/expand");
                        }
                        obj = obj2;
                        e2Var2 = e2Var3;
                        z = false;
                        x1 x1VarB2 = i2.b(e2Var2, l2Var2, (String) objQ11, rVar2, 384, 0);
                        rVar2.p(false);
                        x1Var = x1VarB2;
                    } else {
                        obj = obj2;
                        e2Var2 = e2Var3;
                        z = false;
                        rVar2.b0(134101063);
                        rVar2.p(false);
                        x1Var = null;
                    }
                    if (z7) {
                        rVar2.b0(134174689);
                        l2 l2Var3 = androidx.compose.animation.core.e.p;
                        Object objQ12 = rVar2.Q();
                        if (objQ12 == obj) {
                            objQ12 = "Built-in InterruptionHandlingOffset";
                            rVar2.l0("Built-in InterruptionHandlingOffset");
                        }
                        x1 x1VarB3 = i2.b(e2Var2, l2Var3, (String) objQ12, rVar2, 384, 0);
                        rVar2.p(z);
                        x1Var2 = x1VarB3;
                    } else {
                        rVar2.b0(134345095);
                        rVar2.p(z);
                        x1Var2 = null;
                    }
                    boolean z8 = !z7;
                    float[] fArr = androidx.compose.ui.graphics.colorspace.d.a;
                    rVar2.b0(135150476);
                    rVar2.p(z);
                    l2 l2Var4 = androidx.compose.animation.core.e.j;
                    if ((h1Var3.a == null && h1Var4.a == null) ? z : true) {
                        rVar2.b0(-703879421);
                        Object objQ13 = rVar2.Q();
                        if (objQ13 == obj) {
                            objQ13 = "Built-in alpha";
                            rVar2.l0("Built-in alpha");
                        }
                        String str = (String) objQ13;
                        z2 = z8;
                        x1VarB = i2.b(e2Var2, l2Var4, str, rVar2, 384, 0);
                        rVar2.p(z);
                    } else {
                        z2 = z8;
                        rVar2.b0(-703709976);
                        rVar2.p(z);
                        x1VarB = null;
                    }
                    rVar2.b0(-703472888);
                    rVar2.p(z);
                    rVar2.b0(-703222904);
                    rVar2.p(z);
                    x1 x1Var3 = null;
                    boolean zH2 = rVar2.h(x1VarB) | rVar2.f(x0Var3) | rVar2.f(y0Var6) | rVar2.h(null) | rVar2.f(e2Var2) | rVar2.h(null);
                    Object objQ14 = rVar2.Q();
                    if (zH2 || objQ14 == obj) {
                        y0Var2 = y0Var6;
                        x0Var2 = x0Var3;
                        objQ14 = new o0(x1VarB, x1Var3, e2Var2, x0Var2, y0Var2, x1Var3);
                        rVar2.l0(objQ14);
                    } else {
                        y0Var2 = y0Var6;
                        x0Var2 = x0Var3;
                    }
                    o0 o0Var = (o0) objQ14;
                    boolean zG = rVar2.g(z2) | rVar2.f(aVar);
                    Object objQ15 = rVar2.Q();
                    if (zG || objQ15 == obj) {
                        objQ15 = new r0(aVar, z2);
                        rVar2.l0(objQ15);
                    }
                    androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarD = androidx.compose.ui.graphics.a0.o(oVar, (kotlin.jvm.functions.l) objQ15).d(new n0(e2Var2, x1Var, x1Var2, x0Var2, y0Var2, aVar, o0Var)).d(oVar);
                    rVar2.b0(-7432681);
                    rVar2.p(z);
                    androidx.compose.ui.r rVarD2 = rVar.d(rVarD.d(oVar));
                    Object objQ16 = rVar2.Q();
                    if (objQ16 == obj) {
                        objQ16 = new x(i0Var);
                        rVar2.l0(objQ16);
                    }
                    x xVar = (x) objQ16;
                    int iHashCode = Long.hashCode(rVar2.T);
                    androidx.compose.runtime.internal.j jVarL = rVar2.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, rVarD2);
                    androidx.compose.ui.node.g.b.getClass();
                    kotlin.jvm.functions.a aVar2 = androidx.compose.ui.node.f.b;
                    rVar2.e0();
                    if (rVar2.S) {
                        rVar2.k(aVar2);
                    } else {
                        rVar2.o0();
                    }
                    androidx.compose.runtime.s.x(rVar2, xVar, androidx.compose.ui.node.f.e);
                    androidx.compose.runtime.s.x(rVar2, jVarL, androidx.compose.ui.node.f.d);
                    androidx.compose.runtime.s.p(rVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
                    androidx.compose.runtime.s.t(rVar2, androidx.compose.ui.node.f.g);
                    androidx.compose.runtime.s.x(rVar2, rVarC, androidx.compose.ui.node.f.c);
                    fVar2 = fVar;
                    fVar2.invoke(i0Var, rVar2, Integer.valueOf((i5 >> 18) & Token.ASSIGN_MOD));
                    rVar2.p(true);
                    rVar2.p(z);
                }
                rVar2.p(z);
            } else {
                rVar2.b0(-272333293);
                rVar2.p(false);
            }
        } else {
            rVar2.W();
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new y(e2Var, lVar, rVar, x0Var, y0Var, pVar, fVar2, i);
        }
    }

    public static final void b(boolean z, androidx.compose.ui.r rVar, x0 x0Var, y0 y0Var, String str, androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.r rVar2, int i) {
        String str2;
        rVar2.c0(-1448730565);
        int i2 = i | (rVar2.g(z) ? 4 : 2) | (rVar2.f(x0Var) ? LibretroCore.SCREEN_WIDTH : 128) | (rVar2.f(y0Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | 24576;
        if (rVar2.T(i2 & 1, (74899 & i2) != 74898)) {
            e2 e2VarE = i2.e(Boolean.valueOf(z), "AnimatedVisibility", rVar2, (i2 & 14) | 48, 0);
            Object objQ = rVar2.Q();
            if (objQ == androidx.compose.runtime.m.a) {
                objQ = c0.z;
                rVar2.l0(objQ);
            }
            int i3 = i2 << 3;
            c(e2VarE, (kotlin.jvm.functions.l) objQ, rVar, x0Var, y0Var, fVar, rVar2, (i3 & 57344) | (i3 & 7168) | 432 | 196608);
            str2 = "AnimatedVisibility";
        } else {
            rVar2.W();
            str2 = str;
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new d0(z, rVar, x0Var, y0Var, str2, fVar, i);
        }
    }

    public static final void c(e2 e2Var, kotlin.jvm.functions.l lVar, androidx.compose.ui.r rVar, x0 x0Var, y0 y0Var, androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.r rVar2, int i) {
        rVar2.c0(1706321816);
        int i2 = (rVar2.f(e2Var) ? 4 : 2) | i;
        if ((i & 384) == 0) {
            i2 |= rVar2.f(rVar) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= rVar2.f(x0Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            i2 |= rVar2.f(y0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= rVar2.h(fVar) ? 131072 : Parser.ARGC_LIMIT;
        }
        if (rVar2.T(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objQ = rVar2.Q();
            androidx.compose.runtime.f fVar2 = androidx.compose.runtime.m.a;
            if (z || objQ == fVar2) {
                objQ = new f0(lVar, e2Var);
                rVar2.l0(objQ);
            }
            androidx.compose.ui.r rVarJ = androidx.compose.ui.layout.a0.j(rVar, (kotlin.jvm.functions.q) objQ);
            Object objQ2 = rVar2.Q();
            if (objQ2 == fVar2) {
                objQ2 = l.A;
                rVar2.l0(objQ2);
            }
            a(e2Var, lVar, rVarJ, x0Var, y0Var, (kotlin.jvm.functions.p) objQ2, fVar, rVar2, i3 | 196656 | (i2 & 7168) | (57344 & i2) | ((i2 << 6) & 29360128));
        } else {
            rVar2.W();
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new k(e2Var, lVar, rVar, x0Var, y0Var, fVar, i);
        }
    }

    public static final m0 d(e2 e2Var, kotlin.jvm.functions.l lVar, Object obj, androidx.compose.runtime.r rVar) {
        rVar.X(-422486745, e2Var, null, 0);
        boolean zG = e2Var.g();
        j2 j2Var = e2Var.a;
        m0 m0Var = m0.e;
        m0 m0Var2 = m0.z;
        m0 m0Var3 = m0.y;
        if (zG) {
            rVar.b0(-212166497);
            rVar.p(false);
            if (((Boolean) lVar.invoke(obj)).booleanValue()) {
                m0Var = m0Var3;
            } else if (((Boolean) lVar.invoke(j2Var.n())).booleanValue()) {
                m0Var = m0Var2;
            }
        } else {
            rVar.b0(-211892364);
            Object objQ = rVar.Q();
            if (objQ == androidx.compose.runtime.m.a) {
                objQ = androidx.compose.runtime.s.r(Boolean.FALSE);
                rVar.l0(objQ);
            }
            androidx.compose.runtime.y0 y0Var = (androidx.compose.runtime.y0) objQ;
            if (((Boolean) lVar.invoke(j2Var.n())).booleanValue()) {
                y0Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) lVar.invoke(obj)).booleanValue()) {
                m0Var = m0Var3;
            } else if (((Boolean) y0Var.getValue()).booleanValue()) {
                m0Var = m0Var2;
            }
            rVar.p(false);
        }
        rVar.p(false);
        return m0Var;
    }
}
