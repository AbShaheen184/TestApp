package com.app.mlounge.ui.screens.anime;

import com.app.mlounge.data.remote.model.HiAnimeItem;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ HiAnimeItem y;
    public final /* synthetic */ kotlin.jvm.functions.l z;

    public /* synthetic */ j(HiAnimeItem hiAnimeItem, kotlin.jvm.functions.l lVar, int i) {
        this.e = i;
        this.y = hiAnimeItem;
        this.z = lVar;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                String strB = this.y.b();
                if (strB != null) {
                    this.z.invoke(strB);
                }
                break;
            case 1:
                String strB2 = this.y.b();
                if (strB2 != null) {
                    this.z.invoke(strB2);
                }
                break;
            default:
                String strB3 = this.y.b();
                if (strB3 != null) {
                    this.z.invoke(strB3);
                }
                break;
        }
        return y.a;
    }
}
