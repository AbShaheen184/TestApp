package com.app.mlounge.ui;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements kotlin.jvm.functions.r {
    public final /* synthetic */ int e;
    public final /* synthetic */ kotlin.jvm.functions.r y;

    public /* synthetic */ k(int i, kotlin.jvm.functions.r rVar) {
        this.e = i;
        this.y = rVar;
    }

    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.e) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                this.y.invoke(str, str2, (Map) obj3, (String) obj4);
                break;
            case 1:
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj3;
                ((Integer) obj4).getClass();
                ((androidx.compose.animation.p) obj).getClass();
                ((androidx.navigation.i) obj2).getClass();
                kotlin.jvm.functions.r rVar2 = this.y;
                boolean zF = rVar.f(rVar2);
                Object objQ = rVar.Q();
                if (zF || objQ == androidx.compose.runtime.m.a) {
                    objQ = new k(0, rVar2);
                    rVar.l0(objQ);
                }
                com.app.mlounge.ui.screens.livetv.a.c((kotlin.jvm.functions.r) objQ, null, rVar, 0);
                break;
            default:
                String str3 = (String) obj;
                String str4 = (String) obj2;
                str3.getClass();
                str4.getClass();
                this.y.invoke(str3, str4, (Map) obj3, (String) obj4);
                break;
        }
        return kotlin.y.a;
    }
}
