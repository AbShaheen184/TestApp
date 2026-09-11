package com.app.mlounge.ui.screens.anime;

import androidx.compose.foundation.layout.w0;
import androidx.compose.material3.f1;
import androidx.compose.material3.p3;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.runtime.r;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.graphics.vector.h0;
import com.app.mlounge.data.remote.model.IptvChannel;
import com.app.mlounge.data.remote.model.SportsMatch;
import com.app.mlounge.data.remote.model.TmdbCastMember;
import com.app.mlounge.data.remote.model.TmdbMovie;
import kotlin.jvm.functions.p;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements p {
    public final /* synthetic */ int e;

    public /* synthetic */ n(int i) {
        this.e = i;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
        y yVar = y.a;
        switch (i) {
            case 0:
                r rVar = (r) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    f1.b(org.jsoup.helper.n.p(), "Back", null, t.d, rVar, 3120, 4);
                } else {
                    rVar.W();
                }
                return yVar;
            case 1:
                r rVar2 = (r) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (rVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    androidx.compose.ui.graphics.vector.f fVarB = org.jsoup.helper.n.f;
                    if (fVarB == null) {
                        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Refresh", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i2 = h0.a;
                        p0 p0Var = new p0(t.b);
                        androidx.compose.ui.graphics.vector.g gVarH = androidx.privacysandbox.ads.adservices.java.internal.a.h(17.65f, 6.35f);
                        gVarH.g(16.2f, 4.9f, 14.21f, 4.0f, 12.0f, 4.0f);
                        gVarH.h(-4.42f, 0.0f, -7.99f, 3.58f, -7.99f, 8.0f);
                        gVarH.q(3.57f, 8.0f, 7.99f, 8.0f);
                        gVarH.h(3.73f, 0.0f, 6.84f, -2.55f, 7.73f, -6.0f);
                        gVarH.l(-2.08f);
                        gVarH.h(-0.82f, 2.33f, -3.04f, 4.0f, -5.65f, 4.0f);
                        gVarH.h(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
                        gVarH.q(2.69f, -6.0f, 6.0f, -6.0f);
                        gVarH.h(1.66f, 0.0f, 3.14f, 0.69f, 4.22f, 1.78f);
                        gVarH.m(13.0f, 11.0f);
                        gVarH.l(7.0f);
                        gVarH.r(4.0f);
                        gVarH.n(-2.35f, 2.35f);
                        gVarH.f();
                        androidx.compose.ui.graphics.vector.e.a(eVar, gVarH.a, 0, p0Var);
                        fVarB = eVar.b();
                        org.jsoup.helper.n.f = fVarB;
                    }
                    f1.b(fVarB, "Retry", w0.l(oVar, 20), com.app.mlounge.ui.theme.b.f, rVar2, 3504, 0);
                } else {
                    rVar2.W();
                }
                return yVar;
            case 2:
                r rVar3 = (r) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (rVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    f1.b(com.google.android.gms.dynamite.g.o(), "Delete", w0.l(oVar, 20), a0.d(4294198070L), rVar3, 3504, 0);
                } else {
                    rVar3.W();
                }
                return yVar;
            case 3:
                r rVar4 = (r) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (rVar4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    f1.b(kotlin.math.a.w(), "Play", w0.l(oVar, 20), com.app.mlounge.ui.theme.b.f, rVar4, 3504, 0);
                } else {
                    rVar4.W();
                }
                return yVar;
            case 4:
                r rVar5 = (r) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (rVar5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    f1.b(com.google.android.gms.dynamite.g.o(), "Delete", w0.l(oVar, 20), a0.d(4294198070L), rVar5, 3504, 0);
                } else {
                    rVar5.W();
                }
                return yVar;
            case 5:
                r rVar6 = (r) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (rVar6.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    p3.b("Delete Download", null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar6, 390, 0, 262138);
                } else {
                    rVar6.W();
                }
                return yVar;
            case 6:
                r rVar7 = (r) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (rVar7.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    f1.b(com.google.firebase.b.q(), "Pause", w0.l(oVar, 20), a0.d(4294944550L), rVar7, 3504, 0);
                } else {
                    rVar7.W();
                }
                return yVar;
            case 7:
                r rVar8 = (r) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (rVar8.T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    f1.b(androidx.room.r.l(), "Cancel", w0.l(oVar, 20), com.app.mlounge.ui.theme.b.m, rVar8, 3504, 0);
                } else {
                    rVar8.W();
                }
                return yVar;
            case 8:
                r rVar9 = (r) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (rVar9.T(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    f1.b(androidx.room.r.l(), "Cancel", w0.l(oVar, 20), com.app.mlounge.ui.theme.b.m, rVar9, 3504, 0);
                } else {
                    rVar9.W();
                }
                return yVar;
            case 9:
                r rVar10 = (r) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (rVar10.T(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    f1.b(kotlin.math.a.w(), "Resume", w0.l(oVar, 20), com.app.mlounge.ui.theme.b.f, rVar10, 3504, 0);
                } else {
                    rVar10.W();
                }
                return yVar;
            case 10:
                r rVar11 = (r) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (rVar11.T(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    f1.b(com.google.android.gms.dynamite.g.o(), "Delete", w0.l(oVar, 20), a0.d(4294198070L), rVar11, 3504, 0);
                } else {
                    rVar11.W();
                }
                return yVar;
            case 11:
                r rVar12 = (r) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (rVar12.T(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    f1.b(org.jsoup.helper.n.p(), "Back", null, t.d, rVar12, 3120, 4);
                } else {
                    rVar12.W();
                }
                return yVar;
            case 12:
                ((Integer) obj).intValue();
                com.app.mlounge.data.local.entity.c cVar = (com.app.mlounge.data.local.entity.c) obj2;
                cVar.getClass();
                return cVar.a;
            case 13:
                r rVar13 = (r) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (!rVar13.T(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    rVar13.W();
                }
                return yVar;
            case 14:
                r rVar14 = (r) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (rVar14.T(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    p3.b("Choose Source", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar14, 6, 0, 262142);
                } else {
                    rVar14.W();
                }
                return yVar;
            case 15:
                r rVar15 = (r) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (!rVar15.T(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    rVar15.W();
                }
                return yVar;
            case 16:
                r rVar16 = (r) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (rVar16.T(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    p3.b("Resolving Stream", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar16, 6, 0, 262142);
                } else {
                    rVar16.W();
                }
                return yVar;
            case 17:
                int iIntValue17 = ((Integer) obj).intValue();
                IptvChannel iptvChannel = (IptvChannel) obj2;
                iptvChannel.getClass();
                return iIntValue17 + "_" + iptvChannel.c() + "_" + iptvChannel.d();
            case 18:
                int iIntValue18 = ((Integer) obj).intValue();
                SportsMatch sportsMatch = (SportsMatch) obj2;
                sportsMatch.getClass();
                return "sport_" + iIntValue18 + "_" + sportsMatch.c();
            case 19:
                int iIntValue19 = ((Integer) obj).intValue();
                IptvChannel iptvChannel2 = (IptvChannel) obj2;
                iptvChannel2.getClass();
                String strC = iptvChannel2.c();
                String strE = iptvChannel2.e();
                String strD = iptvChannel2.d();
                StringBuilder sb = new StringBuilder();
                sb.append(iIntValue19);
                sb.append("_");
                sb.append(strC);
                sb.append("_");
                sb.append(strE);
                return androidx.privacysandbox.ads.adservices.java.internal.a.u(sb, "_", strD);
            case 20:
                r rVar17 = (r) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                if (rVar17.T(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    f1.b(org.jsoup.helper.n.p(), "Back", null, t.d, rVar17, 3120, 4);
                } else {
                    rVar17.W();
                }
                return yVar;
            case 21:
                int iIntValue21 = ((Integer) obj).intValue();
                TmdbMovie tmdbMovie = (TmdbMovie) obj2;
                tmdbMovie.getClass();
                return iIntValue21 + "_" + tmdbMovie.a();
            case 22:
                int iIntValue22 = ((Integer) obj).intValue();
                TmdbCastMember tmdbCastMember = (TmdbCastMember) obj2;
                tmdbCastMember.getClass();
                return iIntValue22 + "_" + tmdbCastMember.b();
            case 23:
                r rVar18 = (r) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                if (rVar18.T(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    f1.b(org.jsoup.helper.n.p(), "Back", null, t.d, rVar18, 3120, 4);
                } else {
                    rVar18.W();
                }
                return yVar;
            case 24:
                r rVar19 = (r) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                if (rVar19.T(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    f1.b(okhttp3.internal.platform.android.g.t(), "Play", w0.l(oVar, 20), com.app.mlounge.ui.theme.b.f, rVar19, 3504, 0);
                } else {
                    rVar19.W();
                }
                return yVar;
            case 25:
                r rVar20 = (r) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                if (rVar20.T(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    f1.b(_COROUTINE.a.w(), "Download", w0.l(oVar, 20), com.app.mlounge.ui.theme.b.m, rVar20, 3504, 0);
                } else {
                    rVar20.W();
                }
                return yVar;
            case 26:
                r rVar21 = (r) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                if (rVar21.T(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    f1.b(org.jsoup.helper.n.p(), "Back", null, t.d, rVar21, 3120, 4);
                } else {
                    rVar21.W();
                }
                return yVar;
            case 27:
                r rVar22 = (r) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                if (rVar22.T(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    f1.b(org.jsoup.helper.n.p(), "Back", null, t.d, rVar22, 3120, 4);
                } else {
                    rVar22.W();
                }
                return yVar;
            case 28:
                r rVar23 = (r) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                if (rVar23.T(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    p3.b("Next Episode ▶", androidx.compose.foundation.layout.b.p(oVar, 20, 12), t.d, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar23.j(u3.a)).m, rVar23, 438, 0, 131064);
                } else {
                    rVar23.W();
                }
                return yVar;
            default:
                r rVar24 = (r) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                if (rVar24.T(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    p3.b("Search all content", null, com.app.mlounge.ui.theme.b.n, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar24, 390, 0, 262138);
                } else {
                    rVar24.W();
                }
                return yVar;
        }
    }
}
