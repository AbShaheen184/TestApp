package com.app.mlounge.ui.screens.sources;

import androidx.compose.foundation.lazy.d;
import androidx.compose.runtime.m;
import com.app.mlounge.data.remote.model.ChqStream;
import com.app.mlounge.ui.screens.downloads.e;
import com.app.mlounge.ui.viewmodel.r1;
import java.util.List;
import kotlin.jvm.functions.r;
import kotlin.y;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements r {
    public final /* synthetic */ List e;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ r1 z;

    public c(List list, boolean z, r1 r1Var) {
        this.e = list;
        this.y = z;
        this.z = r1Var;
    }

    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        d dVar = (d) obj;
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
            ChqStream chqStream = (ChqStream) this.e.get(iIntValue);
            rVar.b0(1199800362);
            r1 r1Var = this.z;
            boolean zH = rVar.h(r1Var) | rVar.h(chqStream);
            Object objQ = rVar.Q();
            if (zH || objQ == m.a) {
                objQ = new e(8, r1Var, chqStream);
                rVar.l0(objQ);
            }
            a.b(chqStream, this.y, (kotlin.jvm.functions.a) objQ, rVar, 0);
            rVar.p(false);
        } else {
            rVar.W();
        }
        return y.a;
    }
}
