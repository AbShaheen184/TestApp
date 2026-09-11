package com.app.mlounge.ui.screens.search;

import androidx.compose.material3.p3;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.runtime.r;
import androidx.compose.runtime.y0;
import androidx.compose.ui.o;
import kotlin.jvm.functions.p;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements p {
    public final /* synthetic */ y0 A;
    public final /* synthetic */ int e;
    public final /* synthetic */ int y;
    public final /* synthetic */ String z;

    public /* synthetic */ c(int i, String str, y0 y0Var, int i2) {
        this.e = i2;
        this.y = i;
        this.z = str;
        this.A = y0Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                r rVar = (r) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.b(this.z, androidx.compose.foundation.layout.b.p(o.b, 12, 8), ((Number) this.A.getValue()).intValue() == this.y ? com.app.mlounge.ui.theme.b.f : com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar.j(u3.a)).n, rVar, 48, 0, 131064);
                } else {
                    rVar.W();
                }
                break;
            default:
                r rVar2 = (r) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (rVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.b(this.z, androidx.compose.foundation.layout.b.p(o.b, 10, 6), ((Number) this.A.getValue()).intValue() == this.y ? com.app.mlounge.ui.theme.b.f : com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar2.j(u3.a)).o, rVar2, 48, 0, 131064);
                } else {
                    rVar2.W();
                }
                break;
        }
        return y.a;
    }
}
