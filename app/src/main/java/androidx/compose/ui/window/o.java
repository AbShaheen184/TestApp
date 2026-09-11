package androidx.compose.ui.window;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.runtime.j0;
import androidx.compose.runtime.q1;
import androidx.compose.runtime.y0;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.platform.l1;
import androidx.compose.ui.platform.m0;
import com.app.mlounge.emulator.LibretroCore;
import java.util.UUID;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public static final androidx.compose.runtime.b0 a = new androidx.compose.runtime.b0(e.B);
    public static final androidx.compose.runtime.b0 b = new androidx.compose.runtime.b0(e.A);

    /* JADX WARN: Code duplicated, block: B:102:0x0228  */
    /* JADX WARN: Code duplicated, block: B:103:0x022c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0253  */
    /* JADX WARN: Code duplicated, block: B:108:0x025d  */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x00af  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:54:0x010c  */
    /* JADX WARN: Code duplicated, block: B:55:0x010e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0117  */
    /* JADX WARN: Code duplicated, block: B:59:0x0119  */
    /* JADX WARN: Code duplicated, block: B:65:0x0136  */
    /* JADX WARN: Code duplicated, block: B:68:0x0152  */
    /* JADX WARN: Code duplicated, block: B:69:0x0154  */
    /* JADX WARN: Code duplicated, block: B:72:0x015c  */
    /* JADX WARN: Code duplicated, block: B:73:0x015e  */
    /* JADX WARN: Code duplicated, block: B:79:0x017b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0198  */
    /* JADX WARN: Code duplicated, block: B:83:0x019a  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:95:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:99:0x0202  */
    public static final void a(c0 c0Var, kotlin.jvm.functions.a aVar, d0 d0Var, androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.r rVar, int i, int i2) {
        int i3;
        kotlin.jvm.functions.a aVar2;
        d0 d0Var2;
        int i4;
        boolean z;
        kotlin.jvm.functions.a aVar3;
        q1 q1VarT;
        kotlin.jvm.functions.a aVar4;
        View view;
        androidx.compose.ui.unit.c cVar;
        String str;
        androidx.compose.ui.unit.m mVar;
        androidx.compose.runtime.p pVarU;
        y0 y0VarV;
        Object objQ;
        Object obj;
        UUID uuid;
        boolean zBooleanValue;
        Object objQ2;
        String str2;
        kotlin.coroutines.d dVar;
        boolean z2;
        z zVar;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        boolean zF;
        Object objQ3;
        z zVar2;
        boolean z5;
        boolean z6;
        boolean zF2;
        Object objQ4;
        boolean z7;
        boolean z8;
        Object objQ5;
        boolean zH;
        Object objQ6;
        boolean zH2;
        Object objQ7;
        boolean zH3;
        Object objQ8;
        kotlin.jvm.functions.a aVar5;
        int i7;
        int i8;
        c0 c0Var2 = c0Var;
        rVar.c0(-1772091631);
        if ((i & 6) == 0) {
            i3 = (rVar.f(c0Var2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 48) == 0) {
                aVar2 = aVar;
                i3 |= rVar.h(aVar2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                d0Var2 = d0Var;
                if (rVar.f(d0Var2)) {
                    i8 = LibretroCore.SCREEN_WIDTH;
                } else {
                    i8 = 128;
                }
                i3 |= i8;
            } else {
                d0Var2 = d0Var;
            }
            if ((i & 3072) == 0) {
                if (rVar.h(fVar)) {
                    i7 = 2048;
                } else {
                    i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i7;
            }
            i4 = i3;
            if ((i4 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (rVar.T(i4 & 1, z)) {
                if (i9 != 0) {
                    aVar4 = null;
                } else {
                    aVar4 = aVar2;
                }
                view = (View) rVar.j(m0.f);
                cVar = (androidx.compose.ui.unit.c) rVar.j(l1.h);
                str = (String) rVar.j(a);
                mVar = (androidx.compose.ui.unit.m) rVar.j(l1.n);
                pVarU = androidx.compose.runtime.s.u(rVar);
                y0VarV = androidx.compose.runtime.s.v(fVar, rVar);
                Object[] objArr = new Object[0];
                objQ = rVar.Q();
                obj = androidx.compose.runtime.m.a;
                if (objQ == obj) {
                    objQ = e.C;
                    rVar.l0(objQ);
                }
                uuid = (UUID) androidx.compose.runtime.saveable.n.e(objArr, (kotlin.jvm.functions.a) objQ, rVar);
                zBooleanValue = ((Boolean) rVar.j(b)).booleanValue();
                objQ2 = rVar.Q();
                if (objQ2 == obj) {
                    str2 = str;
                    dVar = null;
                    z2 = false;
                    z zVar3 = new z(aVar4, d0Var2, str2, view, cVar, c0Var2, uuid, zBooleanValue);
                    c0Var2 = c0Var2;
                    zVar3.j(pVarU, new androidx.compose.runtime.internal.f(-297523940, true, new n(zVar3, y0VarV, 1)));
                    rVar.l0(zVar3);
                    objQ2 = zVar3;
                } else {
                    str2 = str;
                    dVar = null;
                    z2 = false;
                }
                zVar = (z) objQ2;
                boolean zH4 = rVar.h(zVar);
                i5 = i4 & Token.ASSIGN_MOD;
                if (i5 == 32) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                boolean z9 = zH4 | z3;
                i6 = i4 & 896;
                if (i6 == 256) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                zF = z9 | z4 | rVar.f(str2) | rVar.d(mVar.ordinal());
                objQ3 = rVar.Q();
                if (!zF || objQ3 == obj) {
                    zVar2 = zVar;
                    Object hVar = new h(zVar2, aVar4, d0Var, str2, mVar);
                    rVar.l0(hVar);
                    objQ3 = hVar;
                } else {
                    zVar2 = zVar;
                }
                j0.b(zVar2, (kotlin.jvm.functions.l) objQ3, rVar);
                boolean zH5 = rVar.h(zVar2);
                if (i5 == 32) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                boolean z10 = zH5 | z5;
                if (i6 == 256) {
                    z6 = true;
                } else {
                    z6 = z2;
                }
                zF2 = z10 | z6 | rVar.f(str2) | rVar.d(mVar.ordinal());
                objQ4 = rVar.Q();
                if (zF2 || objQ4 == obj) {
                    Object iVar = new i(zVar2, aVar4, d0Var, str2, mVar);
                    rVar.l0(iVar);
                    objQ4 = iVar;
                }
                j0.e((kotlin.jvm.functions.a) objQ4, rVar);
                boolean zH6 = rVar.h(zVar2);
                if ((i4 & 14) == 4) {
                    z7 = true;
                } else {
                    z7 = z2;
                }
                z8 = zH6 | z7;
                objQ5 = rVar.Q();
                if (z8 || objQ5 == obj) {
                    objQ5 = new androidx.compose.animation.c(12, zVar2, c0Var2);
                    rVar.l0(objQ5);
                }
                j0.b(c0Var2, (kotlin.jvm.functions.l) objQ5, rVar);
                zH = rVar.h(zVar2);
                objQ6 = rVar.Q();
                if (zH || objQ6 == obj) {
                    objQ6 = new androidx.activity.compose.p(zVar2, dVar, 21);
                    rVar.l0(objQ6);
                }
                j0.c(rVar, zVar2, (kotlin.jvm.functions.p) objQ6);
                zH2 = rVar.h(zVar2);
                objQ7 = rVar.Q();
                if (zH2 || objQ7 == obj) {
                    objQ7 = new k(zVar2, 0);
                    rVar.l0(objQ7);
                }
                androidx.compose.ui.r rVarL = androidx.compose.ui.layout.a0.l(androidx.compose.ui.o.b, (kotlin.jvm.functions.l) objQ7);
                zH3 = rVar.h(zVar2) | rVar.d(mVar.ordinal());
                objQ8 = rVar.Q();
                if (zH3 || objQ8 == obj) {
                    objQ8 = new l(zVar2, mVar);
                    rVar.l0(objQ8);
                }
                q0 q0Var = (q0) objQ8;
                int iHashCode = Long.hashCode(rVar.T);
                androidx.compose.runtime.internal.j jVarL = rVar.l();
                androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar, rVarL);
                androidx.compose.ui.node.g.b.getClass();
                aVar5 = androidx.compose.ui.node.f.b;
                rVar.e0();
                if (rVar.S) {
                    rVar.k(aVar5);
                } else {
                    rVar.o0();
                }
                androidx.compose.runtime.s.x(rVar, q0Var, androidx.compose.ui.node.f.e);
                androidx.compose.runtime.s.x(rVar, jVarL, androidx.compose.ui.node.f.d);
                androidx.compose.runtime.s.p(rVar, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
                androidx.compose.runtime.s.t(rVar, androidx.compose.ui.node.f.g);
                androidx.compose.runtime.s.x(rVar, rVarC, androidx.compose.ui.node.f.c);
                rVar.p(true);
                aVar3 = aVar4;
            } else {
                rVar.W();
                aVar3 = aVar2;
            }
            q1VarT = rVar.t();
            if (q1VarT != null) {
                q1VarT.d = new m(c0Var2, aVar3, d0Var, fVar, i, i2);
            }
        }
        i3 |= 48;
        aVar2 = aVar;
        if ((i & 384) == 0) {
            d0Var2 = d0Var;
            if (rVar.f(d0Var2)) {
                i8 = LibretroCore.SCREEN_WIDTH;
            } else {
                i8 = 128;
            }
            i3 |= i8;
        } else {
            d0Var2 = d0Var;
        }
        if ((i & 3072) == 0) {
            if (rVar.h(fVar)) {
                i7 = 2048;
            } else {
                i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            i3 |= i7;
        }
        i4 = i3;
        if ((i4 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rVar.T(i4 & 1, z)) {
            if (i9 != 0) {
                aVar4 = null;
            } else {
                aVar4 = aVar2;
            }
            view = (View) rVar.j(m0.f);
            cVar = (androidx.compose.ui.unit.c) rVar.j(l1.h);
            str = (String) rVar.j(a);
            mVar = (androidx.compose.ui.unit.m) rVar.j(l1.n);
            pVarU = androidx.compose.runtime.s.u(rVar);
            y0VarV = androidx.compose.runtime.s.v(fVar, rVar);
            Object[] objArr2 = new Object[0];
            objQ = rVar.Q();
            obj = androidx.compose.runtime.m.a;
            if (objQ == obj) {
                objQ = e.C;
                rVar.l0(objQ);
            }
            uuid = (UUID) androidx.compose.runtime.saveable.n.e(objArr2, (kotlin.jvm.functions.a) objQ, rVar);
            zBooleanValue = ((Boolean) rVar.j(b)).booleanValue();
            objQ2 = rVar.Q();
            if (objQ2 == obj) {
                str2 = str;
                dVar = null;
                z2 = false;
                z zVar4 = new z(aVar4, d0Var2, str2, view, cVar, c0Var2, uuid, zBooleanValue);
                c0Var2 = c0Var2;
                zVar4.j(pVarU, new androidx.compose.runtime.internal.f(-297523940, true, new n(zVar4, y0VarV, 1)));
                rVar.l0(zVar4);
                objQ2 = zVar4;
            } else {
                str2 = str;
                dVar = null;
                z2 = false;
            }
            zVar = (z) objQ2;
            boolean zH7 = rVar.h(zVar);
            i5 = i4 & Token.ASSIGN_MOD;
            if (i5 == 32) {
                z3 = true;
            } else {
                z3 = z2;
            }
            boolean z11 = zH7 | z3;
            i6 = i4 & 896;
            if (i6 == 256) {
                z4 = true;
            } else {
                z4 = z2;
            }
            zF = z11 | z4 | rVar.f(str2) | rVar.d(mVar.ordinal());
            objQ3 = rVar.Q();
            if (zF) {
                zVar2 = zVar;
                Object hVar2 = new h(zVar2, aVar4, d0Var, str2, mVar);
                rVar.l0(hVar2);
                objQ3 = hVar2;
            } else {
                zVar2 = zVar;
                Object hVar3 = new h(zVar2, aVar4, d0Var, str2, mVar);
                rVar.l0(hVar3);
                objQ3 = hVar3;
            }
            j0.b(zVar2, (kotlin.jvm.functions.l) objQ3, rVar);
            boolean zH8 = rVar.h(zVar2);
            if (i5 == 32) {
                z5 = true;
            } else {
                z5 = z2;
            }
            boolean z12 = zH8 | z5;
            if (i6 == 256) {
                z6 = true;
            } else {
                z6 = z2;
            }
            zF2 = z12 | z6 | rVar.f(str2) | rVar.d(mVar.ordinal());
            objQ4 = rVar.Q();
            if (zF2) {
                Object iVar2 = new i(zVar2, aVar4, d0Var, str2, mVar);
                rVar.l0(iVar2);
                objQ4 = iVar2;
            } else {
                Object iVar3 = new i(zVar2, aVar4, d0Var, str2, mVar);
                rVar.l0(iVar3);
                objQ4 = iVar3;
            }
            j0.e((kotlin.jvm.functions.a) objQ4, rVar);
            boolean zH9 = rVar.h(zVar2);
            if ((i4 & 14) == 4) {
                z7 = true;
            } else {
                z7 = z2;
            }
            z8 = zH9 | z7;
            objQ5 = rVar.Q();
            if (z8) {
                objQ5 = new androidx.compose.animation.c(12, zVar2, c0Var2);
                rVar.l0(objQ5);
            } else {
                objQ5 = new androidx.compose.animation.c(12, zVar2, c0Var2);
                rVar.l0(objQ5);
            }
            j0.b(c0Var2, (kotlin.jvm.functions.l) objQ5, rVar);
            zH = rVar.h(zVar2);
            objQ6 = rVar.Q();
            if (zH) {
                objQ6 = new androidx.activity.compose.p(zVar2, dVar, 21);
                rVar.l0(objQ6);
            } else {
                objQ6 = new androidx.activity.compose.p(zVar2, dVar, 21);
                rVar.l0(objQ6);
            }
            j0.c(rVar, zVar2, (kotlin.jvm.functions.p) objQ6);
            zH2 = rVar.h(zVar2);
            objQ7 = rVar.Q();
            if (zH2) {
                objQ7 = new k(zVar2, 0);
                rVar.l0(objQ7);
            } else {
                objQ7 = new k(zVar2, 0);
                rVar.l0(objQ7);
            }
            androidx.compose.ui.r rVarL2 = androidx.compose.ui.layout.a0.l(androidx.compose.ui.o.b, (kotlin.jvm.functions.l) objQ7);
            zH3 = rVar.h(zVar2) | rVar.d(mVar.ordinal());
            objQ8 = rVar.Q();
            if (zH3) {
                objQ8 = new l(zVar2, mVar);
                rVar.l0(objQ8);
            } else {
                objQ8 = new l(zVar2, mVar);
                rVar.l0(objQ8);
            }
            q0 q0Var2 = (q0) objQ8;
            int iHashCode2 = Long.hashCode(rVar.T);
            androidx.compose.runtime.internal.j jVarL2 = rVar.l();
            androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar, rVarL2);
            androidx.compose.ui.node.g.b.getClass();
            aVar5 = androidx.compose.ui.node.f.b;
            rVar.e0();
            if (rVar.S) {
                rVar.k(aVar5);
            } else {
                rVar.o0();
            }
            androidx.compose.runtime.s.x(rVar, q0Var2, androidx.compose.ui.node.f.e);
            androidx.compose.runtime.s.x(rVar, jVarL2, androidx.compose.ui.node.f.d);
            androidx.compose.runtime.s.p(rVar, Integer.valueOf(iHashCode2), androidx.compose.ui.node.f.f);
            androidx.compose.runtime.s.t(rVar, androidx.compose.ui.node.f.g);
            androidx.compose.runtime.s.x(rVar, rVarC2, androidx.compose.ui.node.f.c);
            rVar.p(true);
            aVar3 = aVar4;
        } else {
            rVar.W();
            aVar3 = aVar2;
        }
        q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new m(c0Var2, aVar3, d0Var, fVar, i, i2);
        }
    }

    public static final boolean b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
