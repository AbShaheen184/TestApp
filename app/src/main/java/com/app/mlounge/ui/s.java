package com.app.mlounge.ui;

import androidx.compose.runtime.y0;
import com.app.mlounge.R;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Token;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements kotlin.jvm.functions.r {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ s(int i, Object obj, Object obj2) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
    }

    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) throws XmlPullParserException, IOException {
        switch (this.e) {
            case 0:
                androidx.navigation.y yVar = (androidx.navigation.y) this.y;
                final kotlin.jvm.functions.w wVar = (kotlin.jvm.functions.w) this.z;
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj3;
                ((Integer) obj4).getClass();
                ((androidx.compose.animation.p) obj).getClass();
                ((androidx.navigation.i) obj2).getClass();
                boolean zH = rVar.h(yVar);
                Object objQ = rVar.Q();
                androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
                if (zH || objQ == fVar) {
                    objQ = new androidx.navigation.k(yVar, 9);
                    rVar.l0(objQ);
                }
                kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) objQ;
                boolean zF = rVar.f(wVar);
                Object objQ2 = rVar.Q();
                if (zF || objQ2 == fVar) {
                    objQ2 = new kotlin.jvm.functions.w() { // from class: com.app.mlounge.ui.y
                        @Override // kotlin.jvm.functions.w
                        public final Object b(Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13) {
                            String str = (String) obj5;
                            String str2 = (String) obj6;
                            Integer num = (Integer) obj9;
                            num.intValue();
                            String str3 = (String) obj10;
                            Integer num2 = (Integer) obj11;
                            num2.intValue();
                            Integer num3 = (Integer) obj12;
                            num3.intValue();
                            String str4 = (String) obj13;
                            str.getClass();
                            str2.getClass();
                            str3.getClass();
                            str4.getClass();
                            wVar.b(str, str2, (Map) obj7, str3, (String) obj8, num, num2, num3, str4);
                            return kotlin.y.a;
                        }
                    };
                    rVar.l0(objQ2);
                }
                com.app.mlounge.ui.screens.sources.a.c(aVar, (kotlin.jvm.functions.w) objQ2, null, rVar, 0);
                break;
            default:
                kotlin.jvm.functions.p pVar = (kotlin.jvm.functions.p) this.y;
                y0 y0Var = (y0) this.z;
                int iIntValue = ((Integer) obj2).intValue();
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((androidx.compose.foundation.lazy.grid.j) obj).getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= rVar2.d(iIntValue) ? 32 : 16;
                }
                if (rVar2.T(iIntValue2 & 1, (iIntValue2 & Token.TARGET) != 144)) {
                    com.app.mlounge.data.local.entity.b bVar = (com.app.mlounge.data.local.entity.b) ((List) y0Var.getValue()).get(iIntValue);
                    String str = bVar.c;
                    if (str == null) {
                        str = "Unknown";
                    }
                    String str2 = bVar.d;
                    String str3 = bVar.e;
                    String strY0 = str3 != null ? kotlin.text.k.y0(4, str3) : null;
                    androidx.compose.ui.graphics.painter.b bVarQ = androidx.room.r.q(R.drawable.ic_menu_games, rVar2);
                    boolean zF2 = rVar2.f(pVar) | rVar2.f(bVar);
                    Object objQ3 = rVar2.Q();
                    if (zF2 || objQ3 == androidx.compose.runtime.m.a) {
                        objQ3 = new androidx.activity.compose.f(28, pVar, bVar);
                        rVar2.l0(objQ3);
                    }
                    com.app.mlounge.ui.components.b0.h(str, str2, (kotlin.jvm.functions.a) objQ3, null, null, strY0, null, null, bVarQ, 0.0f, false, false, 0.0f, null, rVar2, 134217728, 0, 16088);
                } else {
                    rVar2.W();
                }
                break;
        }
        return kotlin.y.a;
    }
}
