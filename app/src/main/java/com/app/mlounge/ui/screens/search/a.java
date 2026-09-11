package com.app.mlounge.ui.screens.search;

import androidx.compose.material3.f1;
import androidx.compose.material3.p3;
import androidx.compose.runtime.r;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.graphics.vector.h0;
import androidx.compose.ui.o;
import androidx.datastore.preferences.protobuf.h1;
import com.app.mlounge.data.remote.model.ChqStream;
import com.app.mlounge.data.remote.model.EpornerVideo;
import com.app.mlounge.data.remote.model.Game;
import com.app.mlounge.data.remote.model.HiAnimeItem;
import com.app.mlounge.data.remote.model.IptvChannel;
import com.app.mlounge.data.remote.model.MusicAlbum;
import com.app.mlounge.data.remote.model.MusicArtist;
import com.app.mlounge.data.remote.model.MusicTrack;
import com.app.mlounge.data.remote.model.TmdbCastMember;
import com.app.mlounge.data.remote.model.TmdbMovie;
import com.app.mlounge.data.remote.model.TmdbSeason;
import com.app.mlounge.data.remote.model.TmdbTvShow;
import kotlin.jvm.functions.p;
import kotlin.y;
import org.jsoup.helper.n;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements p {
    public final /* synthetic */ int e;

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        y yVar = y.a;
        switch (i) {
            case 0:
                r rVar = (r) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    f1.b(com.google.android.gms.dynamite.g.r(), null, null, com.app.mlounge.ui.theme.b.m, rVar, 3120, 4);
                } else {
                    rVar.W();
                }
                return yVar;
            case 1:
                r rVar2 = (r) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (rVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    androidx.compose.ui.graphics.vector.f fVarB = android.support.v4.media.session.b.e;
                    if (fVarB == null) {
                        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Clear", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i2 = h0.a;
                        p0 p0Var = new p0(t.b);
                        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
                        gVar.o(19.0f, 6.41f);
                        gVar.m(17.59f, 5.0f);
                        gVar.m(12.0f, 10.59f);
                        gVar.m(6.41f, 5.0f);
                        gVar.m(5.0f, 6.41f);
                        gVar.m(10.59f, 12.0f);
                        gVar.m(5.0f, 17.59f);
                        gVar.m(6.41f, 19.0f);
                        gVar.m(12.0f, 13.41f);
                        gVar.m(17.59f, 19.0f);
                        gVar.m(19.0f, 17.59f);
                        gVar.m(13.41f, 12.0f);
                        gVar.f();
                        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.a, 0, p0Var);
                        fVarB = eVar.b();
                        android.support.v4.media.session.b.e = fVarB;
                    }
                    f1.b(fVarB, "Clear", null, com.app.mlounge.ui.theme.b.m, rVar2, 3120, 4);
                } else {
                    rVar2.W();
                }
                return yVar;
            case 2:
                int iIntValue3 = ((Integer) obj).intValue();
                TmdbMovie tmdbMovie = (TmdbMovie) obj2;
                tmdbMovie.getClass();
                return androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("movie_", tmdbMovie.a(), "_", iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj).intValue();
                TmdbTvShow tmdbTvShow = (TmdbTvShow) obj2;
                tmdbTvShow.getClass();
                return androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("tv_", tmdbTvShow.b(), "_", iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj).intValue();
                HiAnimeItem hiAnimeItem = (HiAnimeItem) obj2;
                hiAnimeItem.getClass();
                return "anime_" + hiAnimeItem.b() + "_" + iIntValue5;
            case 5:
                int iIntValue6 = ((Integer) obj).intValue();
                Game game = (Game) obj2;
                game.getClass();
                return "game_" + game.c() + "_" + iIntValue6;
            case 6:
                int iIntValue7 = ((Integer) obj).intValue();
                IptvChannel iptvChannel = (IptvChannel) obj2;
                iptvChannel.getClass();
                StringBuilder sbO = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.o("ch_", iptvChannel.c(), "_", iptvChannel.d(), "_");
                sbO.append(iIntValue7);
                return sbO.toString();
            case 7:
                int iIntValue8 = ((Integer) obj).intValue();
                EpornerVideo epornerVideo = (EpornerVideo) obj2;
                epornerVideo.getClass();
                return "adult_" + epornerVideo.b() + "_" + iIntValue8;
            case 8:
                int iIntValue9 = ((Integer) obj).intValue();
                obj2.getClass();
                if (obj2 instanceof MusicAlbum) {
                    return "album_" + ((MusicAlbum) obj2).d() + "_" + iIntValue9;
                }
                if (obj2 instanceof MusicArtist) {
                    return "artist_" + ((MusicArtist) obj2).c() + "_" + iIntValue9;
                }
                if (obj2 instanceof MusicTrack) {
                    return "track_" + ((MusicTrack) obj2).d() + "_" + iIntValue9;
                }
                return obj2.hashCode() + "_" + iIntValue9;
            case 9:
                r rVar3 = (r) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (rVar3.T(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    p3.b("Username", null, com.app.mlounge.ui.theme.b.n, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar3, 390, 0, 262138);
                } else {
                    rVar3.W();
                }
                return yVar;
            case 10:
                r rVar4 = (r) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (rVar4.T(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    p3.b("Password", null, com.app.mlounge.ui.theme.b.n, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar4, 390, 0, 262138);
                } else {
                    rVar4.W();
                }
                return yVar;
            case 11:
                r rVar5 = (r) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (rVar5.T(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    p3.b("System File Manager Required", null, t.d, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar5, 390, 0, 262138);
                } else {
                    rVar5.W();
                }
                return yVar;
            case 12:
                r rVar6 = (r) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (rVar6.T(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    p3.b("New Folder", null, t.d, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar6, 390, 0, 262138);
                } else {
                    rVar6.W();
                }
                return yVar;
            case 13:
                r rVar7 = (r) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (rVar7.T(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    p3.b("Folder name", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar7, 6, 0, 262142);
                } else {
                    rVar7.W();
                }
                return yVar;
            case 14:
                r rVar8 = (r) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (rVar8.T(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    p3.b("Permission Required", null, t.d, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar8, 390, 0, 262138);
                } else {
                    rVar8.W();
                }
                return yVar;
            case 15:
                r rVar9 = (r) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (rVar9.T(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    p3.b("CinemaHQ needs permission to manage files on your storage to browse and save downloads. Please enable 'Allow access to manage all files' in the next screen.", null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar9, 6, 0, 262138);
                } else {
                    rVar9.W();
                }
                return yVar;
            case 16:
                r rVar10 = (r) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (rVar10.T(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    p3.b("Aspect Ratio", null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar10, 6, 0, 262138);
                } else {
                    rVar10.W();
                }
                return yVar;
            case 17:
                r rVar11 = (r) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (rVar11.T(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    p3.b("Controls Opacity", null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar11, 6, 0, 262138);
                } else {
                    rVar11.W();
                }
                return yVar;
            case 18:
                r rVar12 = (r) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (rVar12.T(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    p3.b("Select Player", null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar12, 6, 0, 262138);
                } else {
                    rVar12.W();
                }
                return yVar;
            case 19:
                r rVar13 = (r) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                if (rVar13.T(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    p3.b("Custom Player", null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar13, 6, 0, 262138);
                } else {
                    rVar13.W();
                }
                return yVar;
            case 20:
                r rVar14 = (r) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                if (rVar14.T(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    p3.b("Select Download Manager", null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar14, 6, 0, 262138);
                } else {
                    rVar14.W();
                }
                return yVar;
            case 21:
                r rVar15 = (r) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                if (rVar15.T(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    androidx.compose.ui.graphics.vector.f fVarB2 = h1.c;
                    if (fVarB2 == null) {
                        androidx.compose.ui.graphics.vector.e eVar2 = new androidx.compose.ui.graphics.vector.e("Filled.CreateNewFolder", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i3 = h0.a;
                        p0 p0Var2 = new p0(t.b);
                        androidx.compose.ui.graphics.vector.g gVar2 = new androidx.compose.ui.graphics.vector.g(0);
                        gVar2.o(20.0f, 6.0f);
                        gVar2.l(-8.0f);
                        gVar2.n(-2.0f, -2.0f);
                        gVar2.m(4.0f, 4.0f);
                        gVar2.h(-1.11f, 0.0f, -1.99f, 0.89f, -1.99f, 2.0f);
                        gVar2.m(2.0f, 18.0f);
                        gVar2.h(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
                        gVar2.l(16.0f);
                        gVar2.h(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
                        gVar2.m(22.0f, 8.0f);
                        gVar2.h(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
                        gVar2.f();
                        gVar2.o(19.0f, 14.0f);
                        gVar2.l(-3.0f);
                        gVar2.s(3.0f);
                        gVar2.l(-2.0f);
                        gVar2.s(-3.0f);
                        gVar2.l(-3.0f);
                        gVar2.s(-2.0f);
                        gVar2.l(3.0f);
                        gVar2.m(14.0f, 9.0f);
                        gVar2.l(2.0f);
                        gVar2.s(3.0f);
                        gVar2.l(3.0f);
                        gVar2.s(2.0f);
                        gVar2.f();
                        androidx.compose.ui.graphics.vector.e.a(eVar2, gVar2.a, 0, p0Var2);
                        fVarB2 = eVar2.b();
                        h1.c = fVarB2;
                    }
                    f1.b(fVarB2, "New Folder", null, com.app.mlounge.ui.theme.b.f, rVar15, 48, 4);
                } else {
                    rVar15.W();
                }
                return yVar;
            case 22:
                r rVar16 = (r) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                if (rVar16.T(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    f1.b(androidx.room.r.l(), "Close", null, t.d, rVar16, 3120, 4);
                } else {
                    rVar16.W();
                }
                return yVar;
            case 23:
                r rVar17 = (r) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                if (rVar17.T(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    f1.b(n.p(), "Back", null, t.d, rVar17, 3120, 4);
                } else {
                    rVar17.W();
                }
                return yVar;
            case 24:
                r rVar18 = (r) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                if (rVar18.T(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    p3.b("Retry", androidx.compose.foundation.layout.b.p(o.b, 24, 10), t.d, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar18, 438, 0, 262136);
                } else {
                    rVar18.W();
                }
                return yVar;
            case 25:
                int iIntValue26 = ((Integer) obj).intValue();
                ChqStream chqStream = (ChqStream) obj2;
                chqStream.getClass();
                String strM = chqStream.m();
                String strG = chqStream.g();
                if (strG == null) {
                    strG = "";
                }
                String strH = chqStream.h();
                String str = strH != null ? strH : "";
                StringBuilder sb = new StringBuilder();
                sb.append(iIntValue26);
                sb.append("_");
                sb.append(strM);
                sb.append("|");
                sb.append(strG);
                return androidx.privacysandbox.ads.adservices.java.internal.a.u(sb, "|", str);
            case 26:
                r rVar19 = (r) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                if (rVar19.T(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    f1.b(n.p(), "Back", null, t.d, rVar19, 3120, 4);
                } else {
                    rVar19.W();
                }
                return yVar;
            case 27:
                int iIntValue28 = ((Integer) obj).intValue();
                TmdbSeason tmdbSeason = (TmdbSeason) obj2;
                tmdbSeason.getClass();
                return iIntValue28 + "_" + tmdbSeason.c();
            case 28:
                int iIntValue29 = ((Integer) obj).intValue();
                TmdbTvShow tmdbTvShow2 = (TmdbTvShow) obj2;
                tmdbTvShow2.getClass();
                return iIntValue29 + "_" + tmdbTvShow2.b();
            default:
                int iIntValue30 = ((Integer) obj).intValue();
                TmdbCastMember tmdbCastMember = (TmdbCastMember) obj2;
                tmdbCastMember.getClass();
                return iIntValue30 + "_" + tmdbCastMember.b();
        }
    }
}
