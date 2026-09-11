package com.app.mlounge.ui.screens.tvshows;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ List y;
    public final /* synthetic */ kotlin.jvm.functions.p z;

    public /* synthetic */ r(kotlin.jvm.functions.p pVar, List list, int i) {
        this.e = i;
        this.z = pVar;
        this.y = list;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                return ((com.app.mlounge.ui.screens.search.a) this.z).invoke(Integer.valueOf(iIntValue), this.y.get(iIntValue));
            default:
                int iIntValue2 = ((Number) obj).intValue();
                return ((com.app.mlounge.ui.screens.watchlist.c) this.z).invoke(Integer.valueOf(iIntValue2), this.y.get(iIntValue2));
        }
    }
}
