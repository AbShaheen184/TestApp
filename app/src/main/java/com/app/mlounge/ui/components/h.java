package com.app.mlounge.ui.components;

import androidx.compose.material3.t2;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ kotlin.jvm.functions.a y;

    public /* synthetic */ h(int i, kotlin.jvm.functions.a aVar) {
        this.e = i;
        this.y = aVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((Integer) obj2).getClass();
                b0.e(this.y, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(7));
                break;
            case 1:
                ((Integer) obj2).getClass();
                b0.g(this.y, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(55));
                break;
            case 2:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.services.n.g(this.y, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(1));
                break;
            case 3:
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    t2.h(this.y, null, false, null, null, null, null, com.app.mlounge.ui.screens.settings.b.e, rVar, 805306368, 510);
                } else {
                    rVar.W();
                }
                return kotlin.y.a;
            case 4:
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (rVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    t2.h(this.y, null, false, null, null, null, null, com.app.mlounge.ui.screens.settings.b.g, rVar2, 805306368, 510);
                } else {
                    rVar2.W();
                }
                return kotlin.y.a;
            case 5:
                androidx.compose.runtime.r rVar3 = (androidx.compose.runtime.r) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (rVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    Object objQ = rVar3.Q();
                    if (objQ == androidx.compose.runtime.m.a) {
                        objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar3);
                    }
                    androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
                    t2.h(this.y, androidx.compose.foundation.s.g(androidx.compose.ui.o.b, 2, ((Boolean) android.support.v4.media.session.b.g(kVar, rVar3, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(8)), false, null, null, null, kVar, com.app.mlounge.ui.screens.settings.b.k, rVar3, 905969664, 252);
                } else {
                    rVar3.W();
                }
                return kotlin.y.a;
            case 6:
                androidx.compose.runtime.r rVar4 = (androidx.compose.runtime.r) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (rVar4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    Object objQ2 = rVar4.Q();
                    if (objQ2 == androidx.compose.runtime.m.a) {
                        objQ2 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar4);
                    }
                    androidx.compose.foundation.interaction.k kVar2 = (androidx.compose.foundation.interaction.k) objQ2;
                    t2.h(this.y, androidx.compose.foundation.s.g(androidx.compose.ui.o.b, 2, ((Boolean) android.support.v4.media.session.b.g(kVar2, rVar4, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(8)), false, null, null, null, kVar2, com.app.mlounge.ui.screens.settings.b.i, rVar4, 905969664, 252);
                } else {
                    rVar4.W();
                }
                return kotlin.y.a;
            default:
                androidx.compose.runtime.r rVar5 = (androidx.compose.runtime.r) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (rVar5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    Object objQ3 = rVar5.Q();
                    if (objQ3 == androidx.compose.runtime.m.a) {
                        objQ3 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar5);
                    }
                    androidx.compose.foundation.interaction.k kVar3 = (androidx.compose.foundation.interaction.k) objQ3;
                    t2.h(this.y, androidx.compose.foundation.s.g(androidx.compose.ui.o.b, 2, ((Boolean) android.support.v4.media.session.b.g(kVar3, rVar5, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(8)), false, null, null, null, kVar3, com.app.mlounge.ui.screens.settings.b.m, rVar5, 905969664, 252);
                } else {
                    rVar5.W();
                }
                return kotlin.y.a;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ h(kotlin.jvm.functions.a aVar, int i, int i2) {
        this.e = i2;
        this.y = aVar;
    }
}
