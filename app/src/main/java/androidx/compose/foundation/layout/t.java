package androidx.compose.foundation.layout;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {
    public static final v a = new v(h.c, androidx.compose.ui.c.J);

    public static final v a(g gVar, androidx.compose.ui.h hVar, androidx.compose.runtime.r rVar, int i) {
        if (kotlin.jvm.internal.l.a(gVar, h.c) && hVar.equals(androidx.compose.ui.c.J)) {
            rVar.b0(-1446604504);
            rVar.p(false);
            return a;
        }
        rVar.b0(-1446550657);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && rVar.f(gVar)) || (i & 6) == 4;
        if ((((i & Token.ASSIGN_MOD) ^ 48) <= 32 || !rVar.f(hVar)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objQ = rVar.Q();
        if (z3 || objQ == androidx.compose.runtime.m.a) {
            objQ = new v(gVar, hVar);
            rVar.l0(objQ);
        }
        v vVar = (v) objQ;
        rVar.p(false);
        return vVar;
    }
}
