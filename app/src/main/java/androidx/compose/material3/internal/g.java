package androidx.compose.material3.internal;

import androidx.compose.material3.p3;
import androidx.compose.material3.q0;
import androidx.compose.runtime.q1;
import androidx.compose.ui.layout.p0;
import androidx.compose.ui.text.m0;
import com.app.mlounge.emulator.LibretroCore;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final androidx.compose.ui.text.w a = new androidx.compose.ui.text.w(null, new androidx.compose.ui.text.u());

    public static final void a(long j, m0 m0Var, kotlin.jvm.functions.p pVar, androidx.compose.runtime.r rVar, int i) {
        rVar.c0(-684938728);
        int i2 = (rVar.e(j) ? 4 : 2) | i | (rVar.f(m0Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= rVar.h(pVar) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if (rVar.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            androidx.compose.runtime.b0 b0Var = p3.a;
            androidx.compose.runtime.s.b(new androidx.appcompat.widget.r[]{q0.a.a(new androidx.compose.ui.graphics.t(j)), b0Var.a(((m0) rVar.j(b0Var)).d(m0Var))}, pVar, rVar, ((i2 >> 3) & Token.ASSIGN_MOD) | 8);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new n(j, m0Var, pVar, i, 0);
        }
    }

    public static androidx.compose.ui.r b(androidx.compose.ui.r rVar) {
        return rVar.d(new f(new androidx.compose.foundation.lazy.i(22)));
    }

    public static final Object c(p0 p0Var) {
        Object objK = p0Var.K();
        androidx.compose.ui.layout.b0 b0Var = objK instanceof androidx.compose.ui.layout.b0 ? (androidx.compose.ui.layout.b0) objK : null;
        if (b0Var != null) {
            return b0Var.L;
        }
        return null;
    }

    public static final int d(int i, int i2) {
        if (i == Integer.MAX_VALUE) {
            return i;
        }
        int i3 = i - i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }
}
