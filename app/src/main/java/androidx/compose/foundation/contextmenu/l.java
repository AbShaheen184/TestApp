package androidx.compose.foundation.contextmenu;

import androidx.compose.foundation.layout.h0;
import androidx.compose.foundation.layout.r0;
import androidx.compose.foundation.layout.t0;
import androidx.compose.foundation.layout.v;
import androidx.compose.foundation.layout.w;
import androidx.compose.foundation.layout.w0;
import androidx.compose.foundation.s;
import androidx.compose.foundation.text.n0;
import androidx.compose.runtime.b0;
import androidx.compose.runtime.m;
import androidx.compose.runtime.q1;
import androidx.compose.ui.draw.p;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.node.y;
import androidx.compose.ui.r;
import androidx.compose.ui.text.m0;
import androidx.compose.ui.window.o;
import com.app.mlounge.emulator.LibretroCore;
import kotlin.jvm.functions.q;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static final d a;

    static {
        b0 b0Var = o.a;
        long j = t.d;
        long j2 = t.b;
        a = new d(j, j2, j2, t.b(0.38f, j2), t.b(0.38f, j2));
    }

    public static final void a(d dVar, r rVar, androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.r rVar2, int i) {
        int i2;
        rVar2.c0(-527864079);
        if ((i & 6) == 0) {
            i2 = (rVar2.f(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rVar2.f(rVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= rVar2.h(fVar) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if (rVar2.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            float f = h.d;
            androidx.compose.foundation.shape.d dVarA = androidx.compose.foundation.shape.e.a(h.e);
            float f2 = 0;
            boolean z = androidx.compose.ui.unit.f.a(f, f2) > 0;
            long j = androidx.compose.ui.graphics.b0.a;
            r rVarP = s.p(androidx.compose.foundation.layout.b.q(androidx.compose.foundation.layout.b.t(s.f((androidx.compose.ui.unit.f.a(f, f2) > 0 || z) ? rVar.d(new p(dVarA, z, j, j)) : rVar, dVar.a, a0.b)), 0.0f, h.i, 1), s.o(rVar2), true);
            int i3 = (i2 << 3) & 7168;
            v vVarA = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, rVar2, 0);
            int iHashCode = Long.hashCode(rVar2.T);
            androidx.compose.runtime.internal.j jVarL = rVar2.l();
            r rVarC = androidx.compose.ui.a.c(rVar2, rVarP);
            androidx.compose.ui.node.g.b.getClass();
            y yVar = androidx.compose.ui.node.f.b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.o0();
            }
            androidx.compose.runtime.s.x(rVar2, vVarA, androidx.compose.ui.node.f.e);
            androidx.compose.runtime.s.x(rVar2, jVarL, androidx.compose.ui.node.f.d);
            androidx.compose.runtime.s.p(rVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
            androidx.compose.runtime.s.t(rVar2, androidx.compose.ui.node.f.g);
            androidx.compose.runtime.s.x(rVar2, rVarC, androidx.compose.ui.node.f.c);
            fVar.invoke(w.a, rVar2, Integer.valueOf(((i3 >> 6) & Token.ASSIGN_MOD) | 6));
            rVar2.p(true);
        } else {
            rVar2.W();
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new j(dVar, rVar, fVar, i);
        }
    }

    public static final void b(r rVar, d dVar, kotlin.jvm.functions.l lVar, androidx.compose.runtime.r rVar2, int i, int i2) {
        int i3;
        int i4;
        rVar2.c0(-625529233);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else {
            i3 = (rVar2.f(rVar) ? 4 : 2) | i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (rVar2.f(dVar) ? 32 : 16);
        }
        int i7 = i4 | (rVar2.h(lVar) ? LibretroCore.SCREEN_WIDTH : 128);
        if (rVar2.T(i7 & 1, (i7 & Token.EXPR_VOID) != 146)) {
            if (i5 != 0) {
                rVar = androidx.compose.ui.o.b;
            }
            if (i6 != 0) {
                dVar = a;
            }
            a(dVar, rVar, androidx.compose.runtime.internal.k.c(-250345048, new i(0, lVar, dVar), rVar2), rVar2, ((i7 << 3) & Token.ASSIGN_MOD) | ((i7 >> 3) & 14) | 384);
        } else {
            rVar2.W();
        }
        r rVar3 = rVar;
        d dVar2 = dVar;
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new j(rVar3, dVar2, lVar, i, i2);
        }
    }

    public static final void c(String str, boolean z, d dVar, r rVar, q qVar, kotlin.jvm.functions.a aVar, androidx.compose.runtime.r rVar2, int i) {
        int i2;
        rVar2.c0(-2001167027);
        if ((i & 6) == 0) {
            i2 = (rVar2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rVar2.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= rVar2.f(dVar) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= rVar2.f(rVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            i2 |= rVar2.h(qVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= rVar2.h(aVar) ? 131072 : Parser.ARGC_LIMIT;
        }
        if (rVar2.T(i2 & 1, (74899 & i2) != 74898)) {
            androidx.compose.ui.i iVar = h.f;
            androidx.compose.foundation.layout.a aVar2 = androidx.compose.foundation.layout.h.a;
            float f = h.h;
            androidx.compose.foundation.layout.f fVarG = androidx.compose.foundation.layout.h.g(f);
            boolean z2 = ((i2 & Token.ASSIGN_MOD) == 32) | ((458752 & i2) == 131072);
            Object objQ = rVar2.Q();
            if (z2 || objQ == m.a) {
                objQ = new k(z, aVar, 0);
                rVar2.l0(objQ);
            }
            r rVarD = w0.d(s.j(rVar, z, str, (kotlin.jvm.functions.a) objQ, 12), 1.0f);
            float f2 = h.a;
            float f3 = h.b;
            float f4 = h.c;
            r rVarQ = androidx.compose.foundation.layout.b.q(w0.n(rVarD, f2, f4, f3, f4), f, 0.0f, 2);
            t0 t0VarA = r0.a(fVarG, iVar, rVar2, 54);
            int iHashCode = Long.hashCode(rVar2.T);
            androidx.compose.runtime.internal.j jVarL = rVar2.l();
            r rVarC = androidx.compose.ui.a.c(rVar2, rVarQ);
            androidx.compose.ui.node.g.b.getClass();
            y yVar = androidx.compose.ui.node.f.b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.o0();
            }
            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.f.e;
            androidx.compose.runtime.s.x(rVar2, t0VarA, eVar);
            androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.f.d;
            androidx.compose.runtime.s.x(rVar2, jVarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.f.f;
            androidx.compose.runtime.s.p(rVar2, numValueOf, eVar3);
            androidx.compose.ui.node.d dVar2 = androidx.compose.ui.node.f.g;
            androidx.compose.runtime.s.t(rVar2, dVar2);
            androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.f.c;
            androidx.compose.runtime.s.x(rVar2, rVarC, eVar4);
            if (qVar == null) {
                rVar2.b0(-1597947094);
                rVar2.p(false);
            } else {
                rVar2.b0(-1597947093);
                float f5 = h.j;
                r rVarK = w0.k(androidx.compose.ui.o.b, f5, 0.0f, f5, f5, 2);
                q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
                int iHashCode2 = Long.hashCode(rVar2.T);
                androidx.compose.runtime.internal.j jVarL2 = rVar2.l();
                r rVarC2 = androidx.compose.ui.a.c(rVar2, rVarK);
                rVar2.e0();
                if (rVar2.S) {
                    rVar2.k(yVar);
                } else {
                    rVar2.o0();
                }
                androidx.compose.runtime.s.x(rVar2, q0VarD, eVar);
                androidx.compose.runtime.s.x(rVar2, jVarL2, eVar2);
                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, rVar2, eVar3, rVar2, dVar2);
                androidx.compose.runtime.s.x(rVar2, rVarC2, eVar4);
                qVar.invoke(new t(z ? dVar.c : dVar.e), rVar2, 0);
                rVar2.p(true);
                rVar2.p(false);
            }
            m0 m0Var = new m0(z ? dVar.b : dVar.d, h.m, h.n, h.p, h.g, h.o, 16613240);
            if (1.0f <= 0.0d) {
                androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
            }
            n0.a(str, new h0(1.0f, true), m0Var, 0, false, 1, 0, rVar2, (i2 & 14) | 1572864, 952);
            rVar2.p(true);
        } else {
            rVar2.W();
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.material3.l(str, z, dVar, rVar, qVar, aVar, i);
        }
    }
}
