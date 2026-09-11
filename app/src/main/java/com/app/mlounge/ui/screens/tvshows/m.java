package com.app.mlounge.ui.screens.tvshows;

import androidx.lifecycle.l0;
import com.app.mlounge.data.remote.model.TmdbSeason;
import com.app.mlounge.ui.viewmodel.x1;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements kotlin.jvm.functions.a {
    public final /* synthetic */ x1 e;
    public final /* synthetic */ int y;
    public final /* synthetic */ TmdbSeason z;

    public m(x1 x1Var, int i, TmdbSeason tmdbSeason) {
        this.e = x1Var;
        this.y = i;
        this.z = tmdbSeason;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        TmdbSeason tmdbSeason = this.z;
        tmdbSeason.getClass();
        x1 x1Var = this.e;
        x1Var.L.setValue(tmdbSeason);
        BuildersKt__Builders_commonKt.launch$default(l0.g(x1Var), null, null, new com.app.mlounge.data.repository.p(x1Var, this.y, tmdbSeason, null), 3, null);
        return y.a;
    }
}
