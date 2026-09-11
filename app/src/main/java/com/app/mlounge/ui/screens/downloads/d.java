package com.app.mlounge.ui.screens.downloads;

import androidx.compose.runtime.y0;
import androidx.compose.ui.focus.y;
import com.app.mlounge.data.download.h;
import com.app.mlounge.data.remote.model.MatchSource;
import com.app.mlounge.data.remote.model.SportsMatch;
import com.app.mlounge.data.remote.model.TmdbEpisode;
import com.app.mlounge.ui.viewmodel.a0;
import com.app.mlounge.ui.viewmodel.p;
import com.app.mlounge.ui.viewmodel.x1;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.o;
import kotlin.collections.u;
import kotlin.jvm.functions.r;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements kotlin.jvm.functions.a {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e;
    public final /* synthetic */ y0 y;
    public final /* synthetic */ Object z;

    public d(x1 x1Var, TmdbEpisode tmdbEpisode, y0 y0Var, y0 y0Var2) {
        this.e = 2;
        this.z = x1Var;
        this.A = tmdbEpisode;
        this.y = y0Var;
        this.B = y0Var2;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                p pVar = (p) this.z;
                long j = ((com.app.mlounge.data.local.entity.a) this.A).a;
                h hVar = pVar.b;
                ConcurrentHashMap concurrentHashMap = hVar.f;
                Job job = (Job) concurrentHashMap.get(Long.valueOf(j));
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                concurrentHashMap.remove(Long.valueOf(j));
                BuildersKt__Builders_commonKt.launch$default(hVar.e, null, null, new com.app.mlounge.data.download.b(hVar, j, null, 1), 3, null);
                if (((List) this.y.getValue()).size() > 1) {
                    try {
                        y.a((y) this.B);
                        break;
                    } catch (Exception unused) {
                    }
                }
                break;
            case 1:
                SportsMatch sportsMatch = (SportsMatch) this.z;
                List listF = sportsMatch.f();
                if (listF == null) {
                    listF = u.e;
                }
                if (!listF.isEmpty()) {
                    if (listF.size() == 1) {
                        MatchSource matchSource = (MatchSource) o.K(listF);
                        if (matchSource.a() != null) {
                            ((a0) this.A).j(sportsMatch, matchSource.a(), matchSource.c(), new com.app.mlounge.ui.screens.livetv.h(0, (r) this.B));
                        }
                    } else {
                        this.y.setValue(sportsMatch);
                    }
                }
                break;
            default:
                x1 x1Var = (x1) this.z;
                TmdbEpisode tmdbEpisode = (TmdbEpisode) this.A;
                x1Var.j.h(tmdbEpisode.a());
                this.y.setValue(tmdbEpisode);
                ((y0) this.B).setValue(Boolean.TRUE);
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, y0 y0Var, int i) {
        this.e = i;
        this.z = obj;
        this.A = obj2;
        this.B = obj3;
        this.y = y0Var;
    }
}
