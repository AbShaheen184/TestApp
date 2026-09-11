package androidx.compose.foundation.text;

import androidx.compose.runtime.q1;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final float a;
    public static final float b;

    static {
        float f = 25;
        a = f;
        b = (f * 2.0f) / 2.4142137f;
    }

    public static final void a(androidx.compose.foundation.text.selection.m mVar, androidx.compose.ui.r rVar, long j, androidx.compose.runtime.r rVar2, int i) {
        int i2;
        rVar2.c0(1776202187);
        int i3 = (rVar2.f(mVar) ? 4 : 2) | i | (rVar2.f(rVar) ? 32 : 16) | 128;
        if (rVar2.T(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            rVar2.Y();
            if ((i & 1) == 0 || rVar2.C()) {
                i2 = i3 & (-897);
                j = 9205357640488583168L;
            } else {
                rVar2.W();
                i2 = i3 & (-897);
            }
            rVar2.q();
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            Object objQ = rVar2.Q();
            if (z || objQ == androidx.compose.runtime.m.a) {
                objQ = new androidx.activity.compose.g(mVar, 16);
                rVar2.l0(objQ);
            }
            _COROUTINE.b.c(mVar, androidx.compose.ui.c.y, androidx.compose.runtime.internal.k.c(-1653527038, new a(j, androidx.compose.ui.semantics.n.a(rVar, false, (kotlin.jvm.functions.l) objQ), 0), rVar2), rVar2, i4 | 432);
        } else {
            rVar2.W();
        }
        long j2 = j;
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new b(mVar, rVar, j2, i);
        }
    }

    public static final void b(androidx.compose.ui.r rVar, androidx.compose.runtime.r rVar2, int i, int i2) {
        int i3;
        rVar2.c0(694251107);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (rVar2.f(rVar) ? 4 : 2) | i;
        }
        if (rVar2.T(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                rVar = androidx.compose.ui.o.b;
            }
            androidx.compose.foundation.layout.b.d(rVar2, androidx.compose.ui.a.a(androidx.compose.foundation.layout.w0.m(rVar, b, a), new androidx.compose.foundation.contextmenu.b(1)));
        } else {
            rVar2.W();
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.foundation.layout.n(rVar, i, i2);
        }
    }
}
