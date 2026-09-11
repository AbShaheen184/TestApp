package androidx.compose.foundation.text.contextmenu.internal;

import android.view.View;
import androidx.compose.foundation.gestures.w1;
import androidx.compose.runtime.h1;
import androidx.compose.runtime.j0;
import androidx.compose.runtime.q1;
import androidx.compose.runtime.y0;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.node.y;
import androidx.compose.ui.platform.m0;
import androidx.compose.ui.window.d0;
import com.app.mlounge.emulator.LibretroCore;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static final androidx.compose.runtime.internal.f a = new androidx.compose.runtime.internal.f(636288403, false, new androidx.compose.foundation.text.contextmenu.a(1));
    public static final androidx.compose.runtime.internal.f b = new androidx.compose.runtime.internal.f(-1357803046, false, new androidx.compose.foundation.text.contextmenu.a(2));

    public static final void a(androidx.compose.ui.r rVar, androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.r rVar2, int i) {
        int i2;
        androidx.compose.ui.r rVar3;
        androidx.compose.runtime.internal.f fVar2;
        rVar2.c0(790527681);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (rVar2.f(rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rVar2.h(fVar) ? 32 : 16;
        }
        if (rVar2.T(i2 & 1, (i2 & 19) != 18)) {
            Object objQ = rVar2.Q();
            androidx.compose.runtime.f fVar3 = androidx.compose.runtime.m.a;
            if (objQ == fVar3) {
                h1 h1Var = new h1(null, androidx.compose.runtime.f.A);
                rVar2.l0(h1Var);
                objQ = h1Var;
            }
            y0 y0Var = (y0) objQ;
            Object objQ2 = rVar2.Q();
            if (objQ2 == fVar3) {
                objQ2 = new androidx.compose.foundation.lazy.n(y0Var, 5);
                rVar2.l0(objQ2);
            }
            kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) objQ2;
            d0 d0Var = n.a;
            androidx.compose.foundation.text.contextmenu.provider.c cVarH = okhttp3.internal.platform.android.g.h(b, rVar2, 6);
            rVar3 = rVar;
            fVar2 = fVar;
            androidx.compose.runtime.s.b(new androidx.appcompat.widget.r[]{androidx.compose.foundation.text.contextmenu.provider.g.b.a(e(aVar, rVar2, 2)), androidx.compose.foundation.text.contextmenu.provider.g.a.a(cVarH)}, androidx.compose.runtime.internal.k.c(1070596993, new q(rVar3, y0Var, fVar2, cVarH, aVar, 0), rVar2), rVar2, 56);
        } else {
            rVar3 = rVar;
            fVar2 = fVar;
            rVar2.W();
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new j(rVar3, fVar2, i, i3);
        }
    }

    public static final void b(androidx.compose.ui.r rVar, androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.r rVar2, int i) {
        int i2;
        rVar2.c0(155925518);
        if ((i & 6) == 0) {
            i2 = (rVar2.f(rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rVar2.h(fVar) ? 32 : 16;
        }
        if (rVar2.T(i2 & 1, (i2 & 19) != 18)) {
            boolean z = rVar2.j(androidx.compose.foundation.text.contextmenu.provider.g.a) != null;
            boolean z2 = rVar2.j(androidx.compose.foundation.text.contextmenu.provider.g.b) != null;
            if (z && z2) {
                rVar2.b0(-1977187922);
                q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, true);
                int iHashCode = Long.hashCode(rVar2.T);
                androidx.compose.runtime.internal.j jVarL = rVar2.l();
                androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, rVar);
                androidx.compose.ui.node.g.b.getClass();
                y yVar = androidx.compose.ui.node.f.b;
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
                fVar.invoke(rVar2, Integer.valueOf((i2 >> 3) & 14));
                rVar2.p(true);
                rVar2.p(false);
            } else if (z) {
                rVar2.b0(-1976997706);
                c(rVar, fVar, rVar2, i2 & Token.ELSE);
                rVar2.p(false);
            } else if (z2) {
                rVar2.b0(-1976846922);
                n.d(rVar, fVar, rVar2, i2 & Token.ELSE);
                rVar2.p(false);
            } else {
                rVar2.b0(-1976716505);
                a(rVar, fVar, rVar2, i2 & Token.ELSE);
                rVar2.p(false);
            }
        } else {
            rVar2.W();
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new j(rVar, fVar, i, 3);
        }
    }

    public static final void c(androidx.compose.ui.r rVar, androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.r rVar2, int i) {
        int i2;
        rVar2.c0(2064964257);
        if ((i & 6) == 0) {
            i2 = (rVar2.f(rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rVar2.h(fVar) ? 32 : 16;
        }
        if (rVar2.T(i2 & 1, (i2 & 19) != 18)) {
            d(rVar, fVar, rVar2, ((i2 << 3) & 896) | (i2 & 14) | 48);
        } else {
            rVar2.W();
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new j(rVar, fVar, i, 0);
        }
    }

    public static final void d(androidx.compose.ui.r rVar, androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.r rVar2, int i) {
        int i2;
        rVar2.c0(771959668);
        if ((i & 6) == 0) {
            i2 = (rVar2.f(rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rVar2.h(null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= rVar2.h(fVar) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if (rVar2.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            Object objQ = rVar2.Q();
            androidx.compose.runtime.f fVar2 = androidx.compose.runtime.m.a;
            if (objQ == fVar2) {
                h1 h1Var = new h1(null, androidx.compose.runtime.f.A);
                rVar2.l0(h1Var);
                objQ = h1Var;
            }
            y0 y0Var = (y0) objQ;
            Object objQ2 = rVar2.Q();
            if (objQ2 == fVar2) {
                objQ2 = new androidx.compose.foundation.lazy.n(y0Var, 4);
                rVar2.l0(objQ2);
            }
            androidx.compose.runtime.s.a(androidx.compose.foundation.text.contextmenu.provider.g.b.a(e((kotlin.jvm.functions.a) objQ2, rVar2, 0)), androidx.compose.runtime.internal.k.c(-291176396, new w1(2, rVar, y0Var, fVar), rVar2), rVar2, 56);
        } else {
            rVar2.W();
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new j(rVar, fVar, i, 1);
        }
    }

    public static final i e(kotlin.jvm.functions.a aVar, androidx.compose.runtime.r rVar, int i) {
        View view = (View) rVar.j(m0.f);
        boolean zF = rVar.f(view);
        Object objQ = rVar.Q();
        Object obj = androidx.compose.runtime.m.a;
        if (zF || objQ == obj) {
            objQ = new i(view, null, aVar);
            rVar.l0(objQ);
        }
        i iVar = (i) objQ;
        boolean zH = rVar.h(iVar);
        Object objQ2 = rVar.Q();
        if (zH || objQ2 == obj) {
            objQ2 = new a(iVar, 3);
            rVar.l0(objQ2);
        }
        j0.b(iVar, (kotlin.jvm.functions.l) objQ2, rVar);
        return iVar;
    }
}
