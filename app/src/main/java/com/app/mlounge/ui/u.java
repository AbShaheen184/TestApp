package com.app.mlounge.ui;

import android.content.Context;
import androidx.compose.runtime.t2;
import androidx.compose.runtime.y0;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements kotlin.jvm.functions.r {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ androidx.navigation.y y;
    public final /* synthetic */ y0 z;

    public /* synthetic */ u(Context context, androidx.navigation.y yVar, y0 y0Var, y0 y0Var2) {
        this.A = context;
        this.y = yVar;
        this.z = y0Var;
        this.B = y0Var2;
    }

    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.e) {
            case 0:
                Context context = (Context) this.A;
                androidx.navigation.y yVar = this.y;
                t2 t2Var = (t2) this.B;
                String str = (String) obj;
                String str2 = (String) obj2;
                Map map = (Map) obj3;
                String str3 = (String) obj4;
                str.getClass();
                str2.getClass();
                y0 y0Var = this.z;
                if (!h0.b(y0Var)) {
                    y0Var.setValue(Boolean.TRUE);
                    try {
                        String str4 = (String) t2Var.getValue();
                        if (str4 == null || kotlin.text.k.d0(str4)) {
                            h0.f(yVar, str, str2, (936 & 8) != 0 ? null : map, "live", (936 & 32) != 0 ? null : str3, 0, 0, 0, "");
                        } else {
                            h0.d(context, str, str2, map, str4, 0L);
                            y0Var.setValue(Boolean.FALSE);
                        }
                    } catch (Exception unused) {
                        y0Var.setValue(Boolean.FALSE);
                    }
                    break;
                }
                return kotlin.y.a;
            default:
                String str5 = (String) this.A;
                androidx.navigation.y yVar2 = this.y;
                String str6 = (String) this.B;
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                int iIntValue3 = ((Integer) obj3).intValue();
                String str7 = (String) obj4;
                str7.getClass();
                y0 y0Var2 = this.z;
                if (!h0.b(y0Var2)) {
                    y0Var2.setValue(Boolean.TRUE);
                    try {
                        String strV0 = kotlin.text.k.v0(kotlin.text.k.v0(str7, " - "), " S");
                        String str8 = str5.equals("anime") ? strV0 + " - Episode " + iIntValue3 : strV0 + " S" + iIntValue2 + "E" + iIntValue3;
                        com.app.mlounge.ui.navigation.s sVar = com.app.mlounge.ui.navigation.s.g;
                        String strX0 = str5.equals("anime") ? kotlin.text.k.x0(str6, "-ep-") : String.valueOf(iIntValue);
                        sVar.getClass();
                        yVar2.a(com.app.mlounge.ui.navigation.s.a(str5, strX0, str8, iIntValue2, "play", iIntValue3), new l(yVar2, 0));
                    } finally {
                        y0Var2.setValue(Boolean.FALSE);
                    }
                }
                return kotlin.y.a;
        }
    }

    public /* synthetic */ u(String str, androidx.navigation.y yVar, String str2, y0 y0Var) {
        this.A = str;
        this.y = yVar;
        this.B = str2;
        this.z = y0Var;
    }
}
