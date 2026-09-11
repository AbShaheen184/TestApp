package com.app.mlounge.ui.screens.livetv;

import java.util.Map;
import kotlin.jvm.functions.q;
import kotlin.jvm.functions.r;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements q {
    public final /* synthetic */ int e;
    public final /* synthetic */ r y;

    public /* synthetic */ h(int i, r rVar) {
        this.e = i;
        this.y = rVar;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.e) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                Map map = (Map) obj3;
                str.getClass();
                str2.getClass();
                map.getClass();
                this.y.invoke(str, str2, map, "hls");
                break;
            case 1:
                String str3 = (String) obj;
                String str4 = (String) obj2;
                Map map2 = (Map) obj3;
                str3.getClass();
                str4.getClass();
                map2.getClass();
                this.y.invoke(str3, str4, map2, "hls");
                break;
            default:
                String str5 = (String) obj;
                String str6 = (String) obj2;
                Map map3 = (Map) obj3;
                str5.getClass();
                str6.getClass();
                map3.getClass();
                this.y.invoke(str5, str6, map3, "hls");
                break;
        }
        return y.a;
    }
}
