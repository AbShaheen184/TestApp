package com.app.mlounge;

import com.app.mlounge.data.iptv.c0;
import com.app.mlounge.data.local.AppDatabase;
import com.app.mlounge.data.local.prefs.y1;
import com.app.mlounge.data.remote.api.NtvApi;
import com.app.mlounge.data.remote.debrid.AllDebridManager;
import com.app.mlounge.data.remote.debrid.PremiumizeManager;
import com.app.mlounge.data.remote.debrid.RealDebridManager;
import com.app.mlounge.data.remote.debrid.TorBoxManager;
import com.app.mlounge.data.remote.trakt.TraktManager;
import com.app.mlounge.data.remote.trakt.TraktSyncManager;
import com.app.mlounge.data.repository.j0;
import com.app.mlounge.data.repository.m0;
import com.app.mlounge.data.repository.q0;
import com.app.mlounge.data.repository.x;
import com.app.mlounge.ui.screens.player.z0;
import com.app.mlounge.ui.viewmodel.a0;
import com.app.mlounge.ui.viewmodel.e0;
import com.app.mlounge.ui.viewmodel.e1;
import com.app.mlounge.ui.viewmodel.h0;
import com.app.mlounge.ui.viewmodel.i0;
import com.app.mlounge.ui.viewmodel.k1;
import com.app.mlounge.ui.viewmodel.r1;
import com.app.mlounge.ui.viewmodel.s;
import com.app.mlounge.ui.viewmodel.t;
import com.app.mlounge.ui.viewmodel.x1;
import com.app.mlounge.ui.viewmodel.y0;
import com.app.mlounge.ui.viewmodel.z1;
import okhttp3.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements dagger.internal.d {
    public final h a;
    public final j b;
    public final int c;

    public i(h hVar, j jVar, int i) {
        this.a = hVar;
        this.b = jVar;
        this.c = i;
    }

    @Override // javax.inject.a
    public final Object get() {
        h hVar = this.a;
        int i = this.c;
        switch (i) {
            case 0:
                return new com.app.mlounge.ui.viewmodel.c((com.app.mlounge.data.repository.r) hVar.G.get(), (x) hVar.L.get(), (y1) hVar.f.get(), (com.app.mlounge.data.local.prefs.a) hVar.N.get());
            case 1:
                return new com.app.mlounge.ui.viewmodel.g((com.app.mlounge.data.repository.r) hVar.G.get(), (x) hVar.L.get(), (m0) hVar.O.get(), (q0) hVar.P.get());
            case 2:
                return new com.app.mlounge.ui.viewmodel.k((y1) hVar.f.get(), (com.app.mlounge.data.iptv.l) hVar.Q.get());
            case 3:
                return new com.app.mlounge.ui.viewmodel.p((com.app.mlounge.data.download.h) hVar.l.get(), (y1) hVar.f.get());
            case 4:
                com.app.mlounge.data.repository.r rVar = (com.app.mlounge.data.repository.r) hVar.G.get();
                AppDatabase appDatabase = (AppDatabase) hVar.k.get();
                appDatabase.getClass();
                com.app.mlounge.data.local.dao.i iVarL = appDatabase.l();
                com.google.android.material.sidesheet.b.g(iVarL);
                return new s(rVar, iVarL, hVar.a.a);
            case 5:
                return new t((x) hVar.L.get(), (m0) hVar.O.get(), (q0) hVar.P.get());
            case 6:
                return new a0(hVar.a.a, (com.app.mlounge.data.repository.r) hVar.G.get(), (x) hVar.L.get(), (NtvApi) hVar.S.get(), (com.app.mlounge.data.remote.ntv.l) hVar.H.get(), (c0) hVar.m.get(), (com.app.mlounge.data.iptv.l) hVar.Q.get(), hVar.a(), (y1) hVar.f.get());
            case 7:
                return new e0((j0) hVar.F.get(), (com.app.mlounge.data.repository.r) hVar.G.get(), (x) hVar.L.get(), (y1) hVar.f.get(), (com.app.mlounge.data.music.h) hVar.T.get(), (m0) hVar.O.get(), (q0) hVar.P.get());
            case 8:
                return new h0(hVar.a.a, (com.app.mlounge.data.repository.a0) hVar.V.get(), (com.app.mlounge.data.download.h) hVar.l.get(), (y1) hVar.f.get());
            case 9:
                return new i0((j0) hVar.F.get());
            case 10:
                return new z0(hVar.b(), (com.app.mlounge.data.repository.r) hVar.G.get(), (y1) hVar.f.get(), com.google.android.material.shape.e.e(hVar.a.a));
            case 11:
                return new y0((j0) hVar.F.get(), (com.app.mlounge.data.repository.r) hVar.G.get(), (com.app.mlounge.data.repository.a0) hVar.V.get(), (c0) hVar.m.get(), (com.app.mlounge.data.iptv.l) hVar.Q.get(), hVar.a(), (NtvApi) hVar.S.get(), (y1) hVar.f.get());
            case 12:
                return new e1((y1) hVar.f.get(), (PremiumizeManager) hVar.g.get(), (TorBoxManager) hVar.j.get(), (AllDebridManager) hVar.y.get(), (RealDebridManager) hVar.B.get(), (TraktManager) hVar.K.get(), (TraktSyncManager) hVar.M.get());
            case 13:
                return new k1((y1) hVar.f.get(), (com.app.mlounge.data.repository.r) hVar.G.get(), (y) hVar.c.get());
            case 14:
                return new r1(hVar.a.a, (com.app.mlounge.data.repository.r) hVar.G.get(), (y1) hVar.f.get(), (com.app.mlounge.data.download.h) hVar.l.get(), (y) hVar.c.get(), this.b.a);
            case 15:
                return new x1((j0) hVar.F.get(), (com.app.mlounge.data.repository.r) hVar.G.get(), (x) hVar.L.get(), (y1) hVar.f.get(), (m0) hVar.O.get(), (q0) hVar.P.get());
            case 16:
                return new z1((x) hVar.L.get(), (m0) hVar.O.get(), (j0) hVar.F.get(), (q0) hVar.P.get());
            default:
                throw new AssertionError(i);
        }
    }
}
