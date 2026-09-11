package com.app.mlounge.ui.screens.player;

import androidx.compose.material3.p3;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ String y;
    public final /* synthetic */ androidx.compose.runtime.y0 z;

    public /* synthetic */ h(String str, androidx.compose.runtime.y0 y0Var, int i) {
        this.e = i;
        this.y = str;
        this.z = y0Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String str = this.y;
                    p3.b(i0.s(str), null, androidx.compose.ui.graphics.t.d, 0L, kotlin.jvm.internal.l.a((String) this.z.getValue(), str) ? androidx.compose.ui.text.font.l.C : androidx.compose.ui.text.font.l.z, 0L, null, 0L, 0, false, 0, 0, null, rVar, 384, 0, 262074);
                } else {
                    rVar.W();
                }
                break;
            default:
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (rVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    androidx.compose.ui.text.m0 m0Var = ((t3) rVar2.j(u3.a)).o;
                    String str2 = (String) this.z.getValue();
                    String str3 = this.y;
                    p3.b(str3, androidx.compose.foundation.layout.b.p(androidx.compose.ui.o.b, 10, 6), kotlin.jvm.internal.l.a(str2, str3) ? com.app.mlounge.ui.theme.b.f : com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, rVar2, 48, 0, 131064);
                } else {
                    rVar2.W();
                }
                break;
        }
        return kotlin.y.a;
    }
}
