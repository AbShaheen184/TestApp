package androidx.compose.animation;

import androidx.compose.animation.core.k1;
import androidx.compose.animation.core.l2;
import java.util.LinkedHashMap;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s0 {
    public static final l2 a = new l2(c0.B, c0.C);
    public static final k1 b = androidx.compose.animation.core.e.m(0.0f, 400.0f, null, 5);
    public static final k1 c;
    public static final k1 d;

    static {
        androidx.compose.animation.core.e.m(0.0f, 400.0f, null, 5);
        long j = 1;
        long j2 = (j & 4294967295L) | (j << 32);
        c = androidx.compose.animation.core.e.m(0.0f, 400.0f, new androidx.compose.ui.unit.j(j2), 1);
        d = androidx.compose.animation.core.e.m(0.0f, 400.0f, new androidx.compose.ui.unit.l(j2), 1);
    }

    public static x0 a(k1 k1Var, androidx.compose.ui.h hVar) {
        androidx.compose.ui.j jVar;
        if (hVar.equals(androidx.compose.ui.c.J)) {
            jVar = androidx.compose.ui.c.A;
        } else {
            jVar = hVar.equals(androidx.compose.ui.c.L) ? androidx.compose.ui.c.C : androidx.compose.ui.c.B;
        }
        return new x0(new h1((z0) null, new k0(jVar, new c0(1, 6), k1Var), (g0) null, (LinkedHashMap) null, Token.EXPORT));
    }

    public static x0 b(androidx.compose.animation.core.b0 b0Var, int i) {
        if ((i & 1) != 0) {
            b0Var = androidx.compose.animation.core.e.m(0.0f, 400.0f, null, 5);
        }
        return new x0(new h1(new z0(b0Var), (k0) null, (g0) null, (LinkedHashMap) null, Token.ELSE));
    }

    public static y0 c(androidx.compose.animation.core.b0 b0Var, int i) {
        if ((i & 1) != 0) {
            b0Var = androidx.compose.animation.core.e.m(0.0f, 400.0f, null, 5);
        }
        return new y0(new h1(new z0(b0Var), (k0) null, (g0) null, (LinkedHashMap) null, Token.ELSE));
    }

    public static y0 d(k1 k1Var, androidx.compose.ui.h hVar) {
        androidx.compose.ui.j jVar;
        if (hVar.equals(androidx.compose.ui.c.J)) {
            jVar = androidx.compose.ui.c.A;
        } else {
            jVar = hVar.equals(androidx.compose.ui.c.L) ? androidx.compose.ui.c.C : androidx.compose.ui.c.B;
        }
        return new y0(new h1((z0) null, new k0(jVar, new c0(1, 7), k1Var), (g0) null, (LinkedHashMap) null, Token.EXPORT));
    }
}
