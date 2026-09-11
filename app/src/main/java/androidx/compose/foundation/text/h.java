package androidx.compose.foundation.text;

import androidx.compose.runtime.q1;
import com.app.mlounge.emulator.LibretroCore;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final /* synthetic */ int a = 0;

    static {
        float f = 40;
        _COROUTINE.b.b(f, f);
    }

    public static final void a(final String str, final kotlin.jvm.functions.l lVar, final androidx.compose.ui.r rVar, final boolean z, final boolean z2, final androidx.compose.ui.text.m0 m0Var, final q0 q0Var, final p0 p0Var, final boolean z3, final int i, final int i2, final androidx.compose.ui.text.input.g0 g0Var, kotlin.jvm.functions.l lVar2, final androidx.compose.foundation.interaction.k kVar, final androidx.compose.ui.graphics.p0 p0Var2, final androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.r rVar2, final int i3) {
        final kotlin.jvm.functions.l lVar3;
        kotlin.jvm.functions.l lVar4;
        androidx.compose.ui.text.input.j jVar;
        int i4;
        rVar2.c0(2026950908);
        int i5 = i3 | (rVar2.f(str) ? 4 : 2) | (rVar2.h(lVar) ? 32 : 16) | (rVar2.f(rVar) ? LibretroCore.SCREEN_WIDTH : 128);
        boolean zG = rVar2.g(z);
        int i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        int i7 = i5 | (zG ? 2048 : 1024) | (rVar2.g(z2) ? 16384 : 8192) | (rVar2.f(m0Var) ? 131072 : Parser.ARGC_LIMIT) | (rVar2.f(q0Var) ? 1048576 : 524288) | (rVar2.f(p0Var) ? 8388608 : 4194304) | (rVar2.g(z3) ? 67108864 : 33554432) | (rVar2.d(i) ? 536870912 : 268435456);
        int i8 = 196608 | (rVar2.d(i2) ? 4 : 2) | (rVar2.f(g0Var) ? 32 : 16) | 384;
        if (rVar2.f(kVar)) {
            i6 = 2048;
        }
        int i9 = i8 | i6 | (rVar2.f(p0Var2) ? 16384 : 8192);
        if (rVar2.T(i7 & 1, ((306783379 & i7) == 306783378 && (i9 & 74899) == 74898) ? false : true)) {
            rVar2.Y();
            int i10 = i3 & 1;
            Object obj = androidx.compose.runtime.m.a;
            if (i10 == 0 || rVar2.C()) {
                Object objQ = rVar2.Q();
                if (objQ == obj) {
                    objQ = new androidx.compose.foundation.lazy.i(6);
                    rVar2.l0(objQ);
                }
                lVar4 = (kotlin.jvm.functions.l) objQ;
            } else {
                rVar2.W();
                lVar4 = lVar2;
            }
            rVar2.q();
            Object objQ2 = rVar2.Q();
            if (objQ2 == obj) {
                objQ2 = androidx.compose.runtime.s.r(new androidx.compose.ui.text.input.x(6, 0L, str));
                rVar2.l0(objQ2);
            }
            androidx.compose.runtime.y0 y0Var = (androidx.compose.runtime.y0) objQ2;
            androidx.compose.ui.text.input.x xVar = (androidx.compose.ui.text.input.x) y0Var.getValue();
            androidx.compose.ui.text.input.x xVar2 = new androidx.compose.ui.text.input.x(new androidx.compose.ui.text.g(str), xVar.b, xVar.c);
            boolean zF = rVar2.f(xVar2);
            Object objQ3 = rVar2.Q();
            if (zF || objQ3 == obj) {
                objQ3 = new androidx.activity.compose.f(7, xVar2, y0Var);
                rVar2.l0(objQ3);
            }
            androidx.compose.runtime.j0.e((kotlin.jvm.functions.a) objQ3, rVar2);
            boolean z4 = (i7 & 14) == 4;
            Object objQ4 = rVar2.Q();
            if (z4 || objQ4 == obj) {
                objQ4 = androidx.compose.runtime.s.r(str);
                rVar2.l0(objQ4);
            }
            Object obj2 = (androidx.compose.runtime.y0) objQ4;
            q0Var.getClass();
            int i11 = q0Var.a;
            androidx.compose.ui.text.input.l lVar5 = new androidx.compose.ui.text.input.l(i11);
            if (i11 == 0) {
                lVar5 = null;
            }
            int i12 = lVar5 != null ? lVar5.a : 1;
            int i13 = q0Var.b;
            androidx.compose.ui.text.input.j jVar2 = new androidx.compose.ui.text.input.j(i13);
            if (i13 == -1) {
                jVar = null;
            }
            if (jVar != null) {
                jVar = jVar2;
                i4 = jVar.a;
            } else {
                jVar = jVar2;
                i4 = 1;
            }
            androidx.compose.ui.text.input.k kVar2 = new androidx.compose.ui.text.input.k(z3, 0, true, i12, i4, androidx.compose.ui.text.intl.b.z);
            boolean z5 = !z3;
            lVar3 = lVar4;
            int i14 = z3 ? 1 : i2;
            int i15 = z3 ? 1 : i;
            boolean zF2 = ((i7 & Token.ASSIGN_MOD) == 32) | rVar2.f(obj2);
            Object objQ5 = rVar2.Q();
            if (zF2 || objQ5 == obj) {
                objQ5 = new androidx.compose.animation.core.a(2, lVar, y0Var, obj2);
                rVar2.l0(objQ5);
            }
            int i16 = i9 << 9;
            n0.d(xVar2, (kotlin.jvm.functions.l) objQ5, rVar, m0Var, g0Var, lVar3, kVar, p0Var2, z5, i15, i14, kVar2, p0Var, z, z2, fVar, rVar2, (i7 & 896) | ((i7 >> 6) & 7168) | (i16 & 57344) | 196608 | (3670016 & i16) | (i16 & 29360128), ((i7 >> 15) & 896) | (i7 & 7168) | (i7 & 57344) | 196608);
        } else {
            rVar2.W();
            lVar3 = lVar2;
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new kotlin.jvm.functions.p(str, lVar, rVar, z, z2, m0Var, q0Var, p0Var, z3, i, i2, g0Var, lVar3, kVar, p0Var2, fVar, i3) { // from class: androidx.compose.foundation.text.g
                public final /* synthetic */ boolean A;
                public final /* synthetic */ boolean B;
                public final /* synthetic */ androidx.compose.ui.text.m0 C;
                public final /* synthetic */ q0 D;
                public final /* synthetic */ p0 E;
                public final /* synthetic */ boolean F;
                public final /* synthetic */ int G;
                public final /* synthetic */ int H;
                public final /* synthetic */ androidx.compose.ui.text.input.g0 I;
                public final /* synthetic */ kotlin.jvm.functions.l J;
                public final /* synthetic */ androidx.compose.foundation.interaction.k K;
                public final /* synthetic */ androidx.compose.ui.graphics.p0 L;
                public final /* synthetic */ androidx.compose.runtime.internal.f M;
                public final /* synthetic */ String e;
                public final /* synthetic */ kotlin.jvm.functions.l y;
                public final /* synthetic */ androidx.compose.ui.r z;

                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iA = androidx.compose.runtime.s.A(1);
                    h.a(this.e, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, (androidx.compose.runtime.r) obj3, iA);
                    return kotlin.y.a;
                }
            };
        }
    }
}
