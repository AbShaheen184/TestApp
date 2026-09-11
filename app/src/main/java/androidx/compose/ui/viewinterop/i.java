package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.q1;
import androidx.compose.ui.focus.d0;
import androidx.compose.ui.node.f0;
import androidx.compose.ui.platform.l1;
import androidx.compose.ui.platform.m0;
import com.app.mlounge.emulator.LibretroCore;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static final com.google.android.material.shape.g a = new com.google.android.material.shape.g();

    public static final void a(kotlin.jvm.functions.l lVar, androidx.compose.ui.r rVar, kotlin.jvm.functions.l lVar2, androidx.compose.runtime.r rVar2, int i) {
        int i2;
        androidx.savedstate.g gVar;
        Object obj = b.C;
        rVar2.c0(-180024211);
        if ((i & 6) == 0) {
            i2 = (rVar2.h(lVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rVar2.f(rVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= rVar2.h(obj) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            i3 |= rVar2.h(lVar2) ? 16384 : 8192;
        }
        if (rVar2.T(i3 & 1, (i3 & 9363) != 9362)) {
            int iHashCode = Long.hashCode(rVar2.T);
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, rVar.d(o.b).d(d0.b).d(t.b).d(r.b));
            androidx.compose.ui.unit.c cVar = (androidx.compose.ui.unit.c) rVar2.j(l1.h);
            androidx.compose.ui.unit.m mVar = (androidx.compose.ui.unit.m) rVar2.j(l1.n);
            androidx.compose.runtime.internal.j jVarL = rVar2.l();
            androidx.lifecycle.v vVar = (androidx.lifecycle.v) rVar2.j(androidx.lifecycle.compose.c.a);
            androidx.savedstate.g gVar2 = (androidx.savedstate.g) rVar2.j(androidx.savedstate.compose.a.a);
            rVar2.b0(1314774735);
            int i4 = i3 & 14;
            int iHashCode2 = Long.hashCode(rVar2.T);
            Context context = (Context) rVar2.j(m0.b);
            androidx.compose.runtime.p pVarU = androidx.compose.runtime.s.u(rVar2);
            androidx.compose.runtime.saveable.h hVar = (androidx.compose.runtime.saveable.h) rVar2.j(androidx.compose.runtime.saveable.j.a);
            View view = (View) rVar2.j(m0.f);
            boolean zH = rVar2.h(context) | ((((i4 & 14) ^ 6) > 4 && rVar2.f(lVar)) || (i4 & 6) == 4) | rVar2.h(pVarU) | rVar2.h(hVar) | rVar2.d(iHashCode2) | rVar2.h(view);
            Object objQ = rVar2.Q();
            if (zH || objQ == androidx.compose.runtime.m.a) {
                gVar = gVar2;
                Object lVar3 = new l(context, lVar, pVarU, hVar, iHashCode2, view);
                rVar2.l0(lVar3);
                objQ = lVar3;
            } else {
                gVar = gVar2;
            }
            kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) objQ;
            rVar2.X(Token.IF, null, null, 1);
            rVar2.r = true;
            if (rVar2.S) {
                rVar2.k(aVar);
            } else {
                rVar2.o0();
            }
            androidx.compose.ui.node.g.b.getClass();
            androidx.compose.runtime.s.x(rVar2, jVarL, androidx.compose.ui.node.f.d);
            androidx.compose.runtime.s.x(rVar2, rVarC, k.B);
            androidx.compose.runtime.s.x(rVar2, cVar, k.C);
            androidx.compose.runtime.s.x(rVar2, vVar, k.D);
            androidx.compose.runtime.s.x(rVar2, gVar, k.E);
            androidx.compose.runtime.s.x(rVar2, mVar, k.F);
            androidx.compose.runtime.s.p(rVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
            androidx.compose.runtime.s.x(rVar2, lVar2, k.z);
            androidx.compose.runtime.s.x(rVar2, obj, k.A);
            rVar2.p(true);
            rVar2.p(false);
        } else {
            rVar2.W();
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new j(lVar, rVar, lVar2, i);
        }
    }

    public static final void b(kotlin.jvm.functions.l lVar, androidx.compose.ui.r rVar, kotlin.jvm.functions.l lVar2, androidx.compose.runtime.r rVar2, int i, int i2) {
        int i3;
        b bVar = b.C;
        rVar2.c0(-1783766393);
        int i4 = (rVar2.h(lVar) ? 4 : 2) | i;
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
        } else {
            i3 = i4 | (rVar2.h(lVar2) ? LibretroCore.SCREEN_WIDTH : 128);
        }
        if (rVar2.T(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            if (i5 != 0) {
                lVar2 = bVar;
            }
            a(lVar, rVar, lVar2, rVar2, (i3 & 14) | 3120 | ((i3 << 6) & 57344));
        } else {
            rVar2.W();
        }
        kotlin.jvm.functions.l lVar3 = lVar2;
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new j(lVar, rVar, lVar3, i, i2);
        }
    }

    public static final View c(androidx.compose.ui.q qVar) {
        v vVar = androidx.compose.ui.node.k.t(qVar.e).M;
        View interopView = vVar != null ? vVar.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        net.luminis.tls.engine.impl.c.r("Could not fetch interop view");
        return null;
    }

    public static final void d(v vVar, f0 f0Var) {
        long jW = ((androidx.compose.ui.node.r) f0Var.d0.d).W(0L);
        int iRound = Math.round(Float.intBitsToFloat((int) (jW >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jW & 4294967295L)));
        vVar.layout(iRound, iRound2, vVar.getMeasuredWidth() + iRound, vVar.getMeasuredHeight() + iRound2);
    }

    public static final v e(f0 f0Var) {
        v vVar = f0Var.M;
        if (vVar != null) {
            return vVar;
        }
        throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.a("Required value was null.");
    }
}
