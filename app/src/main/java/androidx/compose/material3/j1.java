package androidx.compose.material3;

import com.app.mlounge.emulator.LibretroCore;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j1 {
    public static final androidx.compose.runtime.u2 a;

    static {
        kotlin.a.d(new androidx.activity.compose.b(21));
        a = new androidx.compose.runtime.u2(new androidx.activity.compose.b(22));
    }

    public static final void a(n0 n0Var, t1 t1Var, z2 z2Var, t3 t3Var, androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.r rVar, int i) {
        int i2;
        rVar.c0(904511636);
        if ((i & 6) == 0) {
            i2 = (rVar.f(n0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rVar.f(t1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= rVar.f(z2Var) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= rVar.f(t3Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            i2 |= rVar.h(fVar) ? 16384 : 8192;
        }
        if (rVar.T(i2 & 1, (i2 & 9363) != 9362)) {
            rVar.Y();
            if ((i & 1) != 0 && !rVar.C()) {
                rVar.W();
            }
            rVar.q();
            v2 v2VarA = u2.a(false, 0.0f, 7);
            long j = n0Var.a;
            boolean zE = rVar.e(j);
            Object objQ = rVar.Q();
            if (zE || objQ == androidx.compose.runtime.m.a) {
                objQ = new androidx.compose.foundation.text.selection.j1(j, androidx.compose.ui.graphics.t.b(0.4f, j));
                rVar.l0(objQ);
            }
            androidx.compose.runtime.s.b(new androidx.appcompat.widget.r[]{o0.a.a(n0Var), a.a(t1Var), androidx.compose.foundation.a1.a.a(v2VarA), a3.a.a(z2Var), androidx.compose.foundation.text.selection.k1.a.a((androidx.compose.foundation.text.selection.j1) objQ), u3.a.a(t3Var)}, androidx.compose.runtime.internal.k.c(-1750539308, new y(1, t3Var, fVar), rVar), rVar, 56);
        } else {
            rVar.W();
        }
        androidx.compose.runtime.q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.animation.core.g2(n0Var, t1Var, z2Var, t3Var, fVar, i, 1);
        }
    }

    public static final void b(n0 n0Var, z2 z2Var, t3 t3Var, androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.r rVar, int i) {
        n0 n0Var2;
        androidx.compose.runtime.r rVar2;
        androidx.compose.runtime.internal.f fVar2;
        t3 t3Var2;
        z2 z2Var2;
        rVar.c0(-449719819);
        int i2 = i | 16 | (rVar.f(t3Var) ? LibretroCore.SCREEN_WIDTH : 128) | (rVar.h(fVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (rVar.T(i2 & 1, (i2 & 1171) != 1170)) {
            rVar.Y();
            if ((i & 1) == 0 || rVar.C()) {
                z2Var = (z2) rVar.j(a3.a);
            } else {
                rVar.W();
            }
            int i3 = i2 & (-113);
            z2 z2Var3 = z2Var;
            rVar.q();
            int i4 = i3 << 3;
            n0Var2 = n0Var;
            rVar2 = rVar;
            a(n0Var2, (t1) rVar.j(a), z2Var3, t3Var, fVar, rVar2, (i4 & 7168) | 6 | (i4 & 57344));
            t3Var2 = t3Var;
            fVar2 = fVar;
            z2Var2 = z2Var3;
        } else {
            n0Var2 = n0Var;
            rVar2 = rVar;
            fVar2 = fVar;
            t3Var2 = t3Var;
            rVar2.W();
            z2Var2 = z2Var;
        }
        androidx.compose.runtime.q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.foundation.text.contextmenu.provider.d(n0Var2, z2Var2, t3Var2, fVar2, i);
        }
    }
}
