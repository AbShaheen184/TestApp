package androidx.compose.foundation.layout;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r0 {
    public static final t0 a = new t0(h.a, androidx.compose.ui.c.G);

    public static final t0 a(e eVar, androidx.compose.ui.i iVar, androidx.compose.runtime.r rVar, int i) {
        if (kotlin.jvm.internal.l.a(eVar, h.a) && kotlin.jvm.internal.l.a(iVar, androidx.compose.ui.c.G)) {
            rVar.b0(-1073830487);
            rVar.p(false);
            return a;
        }
        rVar.b0(-1073779616);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && rVar.f(eVar)) || (i & 6) == 4;
        if ((((i & Token.ASSIGN_MOD) ^ 48) <= 32 || !rVar.f(iVar)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objQ = rVar.Q();
        if (z3 || objQ == androidx.compose.runtime.m.a) {
            objQ = new t0(eVar, iVar);
            rVar.l0(objQ);
        }
        t0 t0Var = (t0) objQ;
        rVar.p(false);
        return t0Var;
    }
}
