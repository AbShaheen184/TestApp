package androidx.compose.material3;

import com.app.mlounge.emulator.LibretroCore;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static final float a = 280;
    public static final float b = 560;
    public static final float c = 8;
    public static final float d = 12;
    public static final androidx.compose.foundation.layout.m0 e;
    public static final androidx.compose.foundation.layout.m0 f;
    public static final androidx.compose.foundation.layout.m0 g;
    public static final androidx.compose.runtime.b0 h;

    static {
        float f2 = 24;
        e = new androidx.compose.foundation.layout.m0(f2, f2, f2, f2);
        float f3 = 16;
        androidx.compose.foundation.layout.b.c(f3);
        f = androidx.compose.foundation.layout.b.c(f3);
        g = androidx.compose.foundation.layout.b.c(f2);
        h = new androidx.compose.runtime.b0(new androidx.activity.compose.b(16));
    }

    public static final void a(final androidx.compose.runtime.internal.f fVar, androidx.compose.ui.r rVar, final kotlin.jvm.functions.p pVar, final kotlin.jvm.functions.p pVar2, final androidx.compose.ui.graphics.n0 n0Var, final long j, final float f2, final long j2, final long j3, final long j4, final long j5, androidx.compose.runtime.r rVar2, final int i) {
        final androidx.compose.ui.r rVar3;
        rVar2.c0(1378716401);
        int i2 = i | 48 | (rVar2.h(null) ? LibretroCore.SCREEN_WIDTH : 128) | (rVar2.h(pVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (rVar2.h(pVar2) ? 16384 : 8192) | (rVar2.f(n0Var) ? 131072 : Parser.ARGC_LIMIT) | (rVar2.e(j) ? 1048576 : 524288) | (rVar2.c(f2) ? 8388608 : 4194304) | (rVar2.e(j2) ? 67108864 : 33554432) | (rVar2.e(j3) ? 536870912 : 268435456);
        if (rVar2.T(i2 & 1, ((i2 & 306783379) == 306783378 && (((rVar2.e(j4) ? (char) 4 : (char) 2) | (rVar2.e(j5) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            androidx.compose.runtime.internal.f fVarC = androidx.compose.runtime.internal.k.c(-652798794, new f(pVar, pVar2, j3, j4, j5, j2, fVar), rVar2);
            int i3 = i2 >> 12;
            int i4 = (i3 & 896) | (i3 & Token.ASSIGN_MOD) | 12582918 | ((i2 >> 9) & 57344);
            androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
            f3.a(oVar, n0Var, j, 0L, f2, 0.0f, fVarC, rVar2, i4, Token.ASSIGN_LOGICAL_AND);
            rVar3 = oVar;
        } else {
            rVar2.W();
            rVar3 = rVar;
        }
        androidx.compose.runtime.q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new kotlin.jvm.functions.p(rVar3, pVar, pVar2, n0Var, j, f2, j2, j3, j4, j5, i) { // from class: androidx.compose.material3.c
                public final /* synthetic */ kotlin.jvm.functions.p A;
                public final /* synthetic */ androidx.compose.ui.graphics.n0 B;
                public final /* synthetic */ long C;
                public final /* synthetic */ float D;
                public final /* synthetic */ long E;
                public final /* synthetic */ long F;
                public final /* synthetic */ long G;
                public final /* synthetic */ long H;
                public final /* synthetic */ androidx.compose.ui.r y;
                public final /* synthetic */ kotlin.jvm.functions.p z;

                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = androidx.compose.runtime.s.A(7);
                    j.a(this.e, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, (androidx.compose.runtime.r) obj, iA);
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void b(androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.r rVar, int i) {
        rVar.c0(-917637668);
        if (rVar.T(i & 1, (i & Token.EXPR_VOID) != 146)) {
            Object objQ = rVar.Q();
            if (objQ == androidx.compose.runtime.m.a) {
                objQ = new g();
                rVar.l0(objQ);
            }
            androidx.compose.ui.layout.q0 q0Var = (androidx.compose.ui.layout.q0) objQ;
            int iHashCode = Long.hashCode(rVar.T);
            androidx.compose.runtime.internal.j jVarL = rVar.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar, androidx.compose.ui.o.b);
            androidx.compose.ui.node.g.b.getClass();
            androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
            rVar.e0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.o0();
            }
            androidx.compose.runtime.s.x(rVar, q0Var, androidx.compose.ui.node.f.e);
            androidx.compose.runtime.s.x(rVar, jVarL, androidx.compose.ui.node.f.d);
            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.f.f;
            if (rVar.S || !kotlin.jvm.internal.l.a(rVar.Q(), Integer.valueOf(iHashCode))) {
                androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode, rVar, iHashCode, eVar);
            }
            androidx.compose.runtime.s.x(rVar, rVarC, androidx.compose.ui.node.f.c);
            fVar.invoke(rVar, 6);
            rVar.p(true);
        } else {
            rVar.W();
        }
        androidx.compose.runtime.q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.foundation.lazy.layout.x0(fVar, i, 1);
        }
    }

    public static final void c(final kotlin.jvm.functions.a aVar, final androidx.compose.runtime.internal.f fVar, final androidx.compose.ui.r rVar, final kotlin.jvm.functions.p pVar, final kotlin.jvm.functions.p pVar2, final kotlin.jvm.functions.p pVar3, final androidx.compose.ui.graphics.n0 n0Var, final long j, final long j2, final long j3, final long j4, final float f2, final androidx.compose.ui.window.w wVar, androidx.compose.runtime.r rVar2, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.internal.f fVar2;
        kotlin.jvm.functions.p pVar4;
        int i4;
        rVar2.c0(-867616355);
        if ((i & 6) == 0) {
            i3 = (rVar2.h(aVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            fVar2 = fVar;
            i3 |= rVar2.h(fVar2) ? 32 : 16;
        } else {
            fVar2 = fVar;
        }
        if ((i & 384) == 0) {
            i3 |= rVar2.f(rVar) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i & 3072) == 0) {
            pVar4 = pVar;
            i3 |= rVar2.h(pVar4) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        } else {
            pVar4 = pVar;
        }
        if ((i & 24576) == 0) {
            i3 |= rVar2.h(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= rVar2.h(pVar2) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((i & 1572864) == 0) {
            i3 |= rVar2.h(pVar3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= rVar2.f(n0Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= rVar2.e(j) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= rVar2.e(j2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (rVar2.e(j3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= rVar2.e(j4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= rVar2.c(f2) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= rVar2.f(wVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        int i5 = i4;
        if (rVar2.T(i3 & 1, ((i3 & 306783379) == 306783378 && (i5 & 1171) == 1170) ? false : true)) {
            d(aVar, rVar, wVar, androidx.compose.runtime.internal.k.c(527420759, new i(pVar2, pVar3, n0Var, j, f2, j2, j3, j4, pVar4, fVar2), rVar2), rVar2, (i3 & 14) | 3072 | ((i3 >> 3) & Token.ASSIGN_MOD) | ((i5 >> 3) & 896));
        } else {
            rVar2.W();
        }
        androidx.compose.runtime.q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.b
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = androidx.compose.runtime.s.A(i | 1);
                    int iA2 = androidx.compose.runtime.s.A(i2);
                    j.c(aVar, fVar, rVar, pVar, pVar2, pVar3, n0Var, j, j2, j3, j4, f2, wVar, (androidx.compose.runtime.r) obj, iA, iA2);
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void d(kotlin.jvm.functions.a aVar, androidx.compose.ui.r rVar, androidx.compose.ui.window.w wVar, androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.r rVar2, int i) {
        int i2;
        rVar2.c0(24925658);
        if ((i & 6) == 0) {
            i2 = (rVar2.h(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rVar2.f(rVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= rVar2.f(wVar) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= rVar2.h(fVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if (rVar2.T(i2 & 1, (i2 & 1171) != 1170)) {
            ((s0) rVar2.j(h)).a(new com.google.firebase.messaging.o(aVar, rVar, wVar, fVar, 3), rVar2, 0);
        } else {
            rVar2.W();
        }
        androidx.compose.runtime.q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new d(aVar, rVar, wVar, fVar, i, 0);
        }
    }
}
