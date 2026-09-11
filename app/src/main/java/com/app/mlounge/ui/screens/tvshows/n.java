package com.app.mlounge.ui.screens.tvshows;

import androidx.compose.material3.p3;
import com.app.mlounge.data.remote.model.TmdbSeason;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements kotlin.jvm.functions.p {
    public final /* synthetic */ TmdbSeason e;
    public final /* synthetic */ boolean y;

    public n(TmdbSeason tmdbSeason, boolean z) {
        this.e = tmdbSeason;
        this.y = z;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            TmdbSeason tmdbSeason = this.e;
            String strD = tmdbSeason.d();
            if (strD == null) {
                strD = androidx.privacysandbox.ads.adservices.java.internal.a.l(tmdbSeason.e(), "S");
            }
            p3.b(strD, androidx.compose.foundation.layout.b.p(androidx.compose.ui.o.b, 12, 8), this.y ? com.app.mlounge.ui.theme.b.f : com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar, 48, 0, 262136);
        } else {
            rVar.W();
        }
        return y.a;
    }
}
