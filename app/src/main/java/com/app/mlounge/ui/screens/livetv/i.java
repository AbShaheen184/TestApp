package com.app.mlounge.ui.screens.livetv;

import androidx.compose.runtime.m;
import androidx.compose.runtime.y0;
import com.app.mlounge.data.remote.model.SportsMatch;
import com.app.mlounge.ui.viewmodel.a0;
import java.util.List;
import kotlin.jvm.functions.r;
import kotlin.y;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements r {
    public final /* synthetic */ y0 A;
    public final /* synthetic */ List e;
    public final /* synthetic */ a0 y;
    public final /* synthetic */ r z;

    public i(List list, a0 a0Var, r rVar, y0 y0Var) {
        this.e = list;
        this.y = a0Var;
        this.z = rVar;
        this.A = y0Var;
    }

    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        androidx.compose.foundation.lazy.d dVar = (androidx.compose.foundation.lazy.d) obj;
        int iIntValue = ((Number) obj2).intValue();
        androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (rVar.f(dVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= rVar.d(iIntValue) ? 32 : 16;
        }
        if (rVar.T(i & 1, (i & Token.EXPR_VOID) != 146)) {
            SportsMatch sportsMatch = (SportsMatch) this.e.get(iIntValue);
            rVar.b0(-1902921886);
            boolean zH = rVar.h(sportsMatch);
            a0 a0Var = this.y;
            boolean zH2 = zH | rVar.h(a0Var);
            r rVar2 = this.z;
            boolean zF = zH2 | rVar.f(rVar2);
            Object objQ = rVar.Q();
            if (zF || objQ == m.a) {
                com.app.mlounge.ui.screens.downloads.d dVar2 = new com.app.mlounge.ui.screens.downloads.d(sportsMatch, a0Var, rVar2, this.A, 1);
                rVar.l0(dVar2);
                objQ = dVar2;
            }
            a.e(sportsMatch, (kotlin.jvm.functions.a) objQ, rVar, SportsMatch.$stable);
            rVar.p(false);
        } else {
            rVar.W();
        }
        return y.a;
    }
}
