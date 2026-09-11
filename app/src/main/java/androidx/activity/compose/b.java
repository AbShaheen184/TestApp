package androidx.activity.compose;

import androidx.compose.animation.core.n1;
import androidx.compose.foundation.a1;
import androidx.compose.foundation.b2;
import androidx.compose.foundation.gestures.f0;
import androidx.compose.foundation.n0;
import androidx.compose.foundation.o1;
import androidx.compose.foundation.text.selection.k1;
import androidx.compose.material3.i1;
import androidx.compose.material3.j1;
import androidx.compose.material3.o0;
import androidx.compose.material3.s0;
import androidx.compose.material3.s2;
import androidx.compose.material3.t1;
import androidx.compose.material3.t3;
import androidx.compose.material3.tokens.c0;
import androidx.compose.material3.z2;
import androidx.compose.runtime.b0;
import androidx.compose.runtime.u2;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.p0;
import java.util.UUID;
import kotlin.y;
import kotlinx.coroutines.Dispatchers;
import org.mozilla.javascript.Parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;

    public /* synthetic */ b(int i) {
        this.e = i;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                return UUID.randomUUID().toString();
            case 1:
                return y.a;
            case 2:
                b0 b0Var = r.a;
                return null;
            case 3:
                b0 b0Var2 = s.a;
                return null;
            case 4:
                return Integer.valueOf(kotlin.random.d.e.g(2147418112) + Parser.ARGC_LIMIT);
            case 5:
                androidx.compose.runtime.snapshots.t tVar = new androidx.compose.runtime.snapshots.t(new n1(2));
                tVar.e();
                return tVar;
            case 6:
                b0 b0Var3 = a1.a;
                return n0.a;
            case 7:
                return new o1();
            case 8:
                return new b2(0);
            case 9:
                float f = f0.a;
                return Boolean.TRUE;
            case 10:
                return new p0(a0.c(1308617531));
            case 11:
                u2 u2Var = androidx.compose.foundation.text.k.a;
                return null;
            case 12:
                b0 b0Var4 = androidx.compose.foundation.text.contextmenu.provider.g.a;
                return null;
            case 13:
                return Dispatchers.getIO();
            case 14:
                b0 b0Var5 = androidx.compose.foundation.text.selection.n0.a;
                return null;
            case 15:
                return k1.b;
            case 16:
                float f2 = androidx.compose.material3.j.a;
                return s0.a;
            case 17:
                long j = androidx.compose.material3.tokens.e.z;
                return new androidx.compose.material3.n0(j, androidx.compose.material3.tokens.e.j, androidx.compose.material3.tokens.e.A, androidx.compose.material3.tokens.e.k, androidx.compose.material3.tokens.e.e, androidx.compose.material3.tokens.e.E, androidx.compose.material3.tokens.e.n, androidx.compose.material3.tokens.e.F, androidx.compose.material3.tokens.e.o, androidx.compose.material3.tokens.e.R, androidx.compose.material3.tokens.e.t, androidx.compose.material3.tokens.e.S, androidx.compose.material3.tokens.e.u, androidx.compose.material3.tokens.e.a, androidx.compose.material3.tokens.e.g, androidx.compose.material3.tokens.e.I, androidx.compose.material3.tokens.e.r, androidx.compose.material3.tokens.e.Q, androidx.compose.material3.tokens.e.s, j, androidx.compose.material3.tokens.e.f, androidx.compose.material3.tokens.e.d, androidx.compose.material3.tokens.e.b, androidx.compose.material3.tokens.e.h, androidx.compose.material3.tokens.e.c, androidx.compose.material3.tokens.e.i, androidx.compose.material3.tokens.e.x, androidx.compose.material3.tokens.e.y, androidx.compose.material3.tokens.e.D, androidx.compose.material3.tokens.e.J, androidx.compose.material3.tokens.e.P, androidx.compose.material3.tokens.e.K, androidx.compose.material3.tokens.e.L, androidx.compose.material3.tokens.e.M, androidx.compose.material3.tokens.e.N, androidx.compose.material3.tokens.e.O, androidx.compose.material3.tokens.e.B, androidx.compose.material3.tokens.e.C, androidx.compose.material3.tokens.e.l, androidx.compose.material3.tokens.e.m, androidx.compose.material3.tokens.e.G, androidx.compose.material3.tokens.e.H, androidx.compose.material3.tokens.e.p, androidx.compose.material3.tokens.e.q, androidx.compose.material3.tokens.e.T, androidx.compose.material3.tokens.e.U, androidx.compose.material3.tokens.e.v, androidx.compose.material3.tokens.e.w);
            case 18:
                u2 u2Var2 = o0.a;
                return Boolean.TRUE;
            case 19:
                androidx.compose.ui.layout.n nVar = i1.a;
                return Boolean.TRUE;
            case 20:
                return new androidx.compose.ui.unit.f(48);
            case 21:
                u2 u2Var3 = j1.a;
                return Boolean.FALSE;
            case 22:
                return t1.a;
            case 23:
                return new s2();
            case 24:
                return new z2();
            case 25:
                return new androidx.compose.ui.unit.f(0);
            case 26:
                return c0.a;
            case 27:
                return new t3(null, null, null, null, null, null, null, null, null, null, null, null, 32767);
            case 28:
                androidx.compose.runtime.t.b("Unexpected call to default provider");
                throw new androidx.compose.ui.res.e(10);
            default:
                u2 u2Var4 = androidx.compose.runtime.retain.b.a;
                return androidx.compose.runtime.retain.a.e;
        }
    }
}
