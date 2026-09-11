package com.app.mlounge.ui.screens.watchlist;

import androidx.compose.material3.j1;
import androidx.compose.material3.p3;
import androidx.compose.runtime.internal.f;
import androidx.compose.runtime.r;
import androidx.compose.runtime.s;
import com.app.mlounge.ui.viewmodel.y1;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements p {
    public final /* synthetic */ int e;
    public final /* synthetic */ Enum y;
    public final /* synthetic */ Object z;

    public /* synthetic */ a(y1 y1Var, l lVar, int i) {
        this.e = 1;
        this.y = y1Var;
        this.z = lVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                y1 y1Var = (y1) this.y;
                y1 y1Var2 = (y1) this.z;
                r rVar = (r) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.b(y1Var.e, null, y1Var == y1Var2 ? com.app.mlounge.ui.theme.b.f : com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar, 0, 0, 262138);
                } else {
                    rVar.W();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                _COROUTINE.a.e((y1) this.y, (l) this.z, (r) obj, s.A(1));
                break;
            default:
                com.app.mlounge.ui.theme.c cVar = (com.app.mlounge.ui.theme.c) this.y;
                f fVar = (f) this.z;
                r rVar2 = (r) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (rVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    j1.b(com.app.mlounge.ui.theme.d.a, null, com.app.mlounge.ui.theme.e.a(cVar.y), fVar, rVar2, 6);
                } else {
                    rVar2.W();
                }
                break;
        }
        return y.a;
    }

    public /* synthetic */ a(Enum r1, Object obj, int i) {
        this.e = i;
        this.y = r1;
        this.z = obj;
    }
}
