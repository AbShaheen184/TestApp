package com.app.mlounge.ui.screens.anime;

import androidx.lifecycle.l0;
import com.app.mlounge.data.remote.model.HiAnimeDetailData;
import com.app.mlounge.data.remote.model.HiAnimeEpisode;
import com.app.mlounge.data.remote.model.HiAnimeInfo;
import kotlin.jvm.functions.r;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements kotlin.jvm.functions.a {
    public final /* synthetic */ r A;
    public final /* synthetic */ HiAnimeInfo B;
    public final /* synthetic */ HiAnimeEpisode e;
    public final /* synthetic */ com.app.mlounge.ui.viewmodel.g y;
    public final /* synthetic */ HiAnimeDetailData z;

    public h(HiAnimeEpisode hiAnimeEpisode, com.app.mlounge.ui.viewmodel.g gVar, HiAnimeDetailData hiAnimeDetailData, r rVar, HiAnimeInfo hiAnimeInfo) {
        this.e = hiAnimeEpisode;
        this.y = gVar;
        this.z = hiAnimeDetailData;
        this.A = rVar;
        this.B = hiAnimeInfo;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        HiAnimeEpisode hiAnimeEpisode = this.e;
        String strA = hiAnimeEpisode.a();
        if (strA != null) {
            String strC = hiAnimeEpisode.c();
            if (strC == null) {
                strC = "Episode " + hiAnimeEpisode.b();
            }
            String str = strC;
            Integer numB = hiAnimeEpisode.b();
            int iIntValue = numB != null ? numB.intValue() : 0;
            com.app.mlounge.ui.viewmodel.g gVar = this.y;
            gVar.D.h(iIntValue);
            BuildersKt__Builders_commonKt.launch$default(l0.g(gVar), null, null, new com.app.mlounge.ui.screens.adult.e(this.z, gVar, str, null, 7), 3, null);
            this.A.invoke("anime", strA, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.i(this.B.c(), " - ", str), Integer.valueOf(iIntValue));
        }
        return y.a;
    }
}
