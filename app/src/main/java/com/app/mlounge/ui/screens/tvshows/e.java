package com.app.mlounge.ui.screens.tvshows;

import androidx.compose.foundation.text.c0;
import com.app.mlounge.ui.viewmodel.x1;
import java.util.List;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements kotlin.jvm.functions.l {
    public final /* synthetic */ x1 A;
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ List y;
    public final /* synthetic */ kotlin.jvm.functions.l z;

    public /* synthetic */ e(List list, x1 x1Var, kotlin.jvm.functions.l lVar) {
        this.y = list;
        this.A = x1Var;
        this.z = lVar;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        androidx.compose.foundation.lazy.k kVar = (androidx.compose.foundation.lazy.k) obj;
        switch (this.e) {
            case 0:
                kVar.getClass();
                com.app.mlounge.ui.screens.search.a aVar = new com.app.mlounge.ui.screens.search.a(28);
                List list = this.y;
                kVar.q(list.size(), new c0(28, aVar, list), new com.app.mlounge.ui.screens.adult.g(23, list), new androidx.compose.runtime.internal.f(2039820996, true, new p(list, this.A, this.z)));
                break;
            default:
                kVar.getClass();
                com.app.mlounge.ui.screens.search.a aVar2 = new com.app.mlounge.ui.screens.search.a(29);
                List list2 = this.y;
                kVar.q(list2.size(), new r(aVar2, list2, 0), new com.app.mlounge.ui.screens.adult.g(24, list2), new androidx.compose.runtime.internal.f(2039820996, true, new p(list2, this.z, this.A)));
                break;
        }
        return y.a;
    }

    public /* synthetic */ e(List list, kotlin.jvm.functions.l lVar, x1 x1Var) {
        this.y = list;
        this.z = lVar;
        this.A = x1Var;
    }
}
