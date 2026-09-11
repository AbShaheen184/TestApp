package com.app.mlounge.ui.screens.anime;

import android.content.Context;
import androidx.compose.runtime.y0;
import androidx.lifecycle.l0;
import androidx.lifecycle.q0;
import com.app.mlounge.data.remote.api.TmdbMovieDetailResponse;
import com.app.mlounge.data.remote.model.HiAnimeDetailData;
import com.app.mlounge.data.remote.model.HiAnimeEpisode;
import com.app.mlounge.data.remote.model.HiAnimeInfo;
import com.app.mlounge.data.remote.model.MatchSource;
import com.app.mlounge.data.remote.model.SportsMatch;
import com.app.mlounge.ui.viewmodel.a0;
import com.app.mlounge.ui.viewmodel.e0;
import java.util.List;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.r;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements kotlin.jvm.functions.a {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ kotlin.d z;

    public /* synthetic */ b(MatchSource matchSource, a0 a0Var, SportsMatch sportsMatch, y0 y0Var, r rVar) {
        this.e = 1;
        this.A = matchSource;
        this.B = a0Var;
        this.C = sportsMatch;
        this.y = y0Var;
        this.z = rVar;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        String strA;
        switch (this.e) {
            case 0:
                y0 y0Var = (y0) this.y;
                com.app.mlounge.ui.viewmodel.g gVar = (com.app.mlounge.ui.viewmodel.g) this.A;
                HiAnimeDetailData hiAnimeDetailData = (HiAnimeDetailData) this.B;
                r rVar = (r) this.z;
                HiAnimeInfo hiAnimeInfo = (HiAnimeInfo) this.C;
                HiAnimeEpisode hiAnimeEpisode = (HiAnimeEpisode) kotlin.collections.o.M((List) y0Var.getValue());
                if (hiAnimeEpisode != null && (strA = hiAnimeEpisode.a()) != null) {
                    String strC = hiAnimeEpisode.c();
                    if (strC == null) {
                        strC = "Episode 1";
                    }
                    String str = strC;
                    Integer numB = hiAnimeEpisode.b();
                    int iIntValue = numB != null ? numB.intValue() : 1;
                    gVar.D.h(iIntValue);
                    BuildersKt__Builders_commonKt.launch$default(l0.g(gVar), null, null, new com.app.mlounge.ui.screens.adult.e(hiAnimeDetailData, gVar, str, null, 7), 3, null);
                    rVar.invoke("anime", strA, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.i(hiAnimeInfo.c(), " - ", str), Integer.valueOf(iIntValue));
                }
                break;
            case 1:
                MatchSource matchSource = (MatchSource) this.A;
                a0 a0Var = (a0) this.B;
                SportsMatch sportsMatch = (SportsMatch) this.C;
                y0 y0Var2 = (y0) this.y;
                r rVar2 = (r) this.z;
                y0Var2.setValue(null);
                if (matchSource.a() != null) {
                    a0Var.j(sportsMatch, matchSource.a(), matchSource.c(), new com.app.mlounge.ui.c(2, rVar2));
                }
                break;
            default:
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.y, null, null, new androidx.compose.animation.core.f((e0) this.A, (TmdbMovieDetailResponse) this.B, (p) this.z, (Context) this.C, null, 14), 3, null);
                break;
        }
        return y.a;
    }

    public /* synthetic */ b(Object obj, q0 q0Var, Object obj2, kotlin.d dVar, Object obj3, int i) {
        this.e = i;
        this.y = obj;
        this.A = q0Var;
        this.B = obj2;
        this.z = dVar;
        this.C = obj3;
    }
}
