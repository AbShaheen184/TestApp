package com.app.mlounge.data.repository;

import android.content.Context;
import com.app.mlounge.data.anime.AnikotoScraper;
import com.app.mlounge.data.local.prefs.y1;
import com.app.mlounge.data.providers.c2;
import com.app.mlounge.data.providers.e1;
import com.app.mlounge.data.providers.f2;
import com.app.mlounge.data.providers.l1;
import com.app.mlounge.data.providers.o1;
import com.app.mlounge.data.providers.r1;
import com.app.mlounge.data.providers.u0;
import com.app.mlounge.data.providers.u1;
import com.app.mlounge.data.providers.z1;
import com.app.mlounge.data.remote.api.ChqApi;
import com.app.mlounge.data.remote.debrid.AllDebridManager;
import com.app.mlounge.data.remote.debrid.PremiumizeManager;
import com.app.mlounge.data.remote.debrid.RealDebridManager;
import com.app.mlounge.data.remote.debrid.TorBoxManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r {
    public static final List M = com.google.common.base.c.q(new kotlin.k("ntv", "CHQ TV"), new kotlin.k(com.app.mlounge.data.iptv.l.SLUG, "My IPTV"), new kotlin.k("plutotv", "Pluto TV"), new kotlin.k("roku", "Roku TV"), new kotlin.k("xumo", "Xumo TV"), new kotlin.k("tubi", "Tubi TV"), new kotlin.k("yupptv", "Yupp TV"), new kotlin.k("uslocal", "US Local"), new kotlin.k("samsungtv", "Samsung TV+"), new kotlin.k("lgtv", "LG TV"), new kotlin.k("iptvorg", "IPTVOrg"), new kotlin.k("earthcam", "EarthCam"));
    public final kotlin.o A;
    public final kotlin.o B;
    public final kotlin.o C;
    public final kotlin.o D;
    public final kotlin.o E;
    public final List F;
    public final List G;
    public final List H;
    public final List I;
    public final kotlin.o J;
    public final kotlin.o K;
    public final kotlin.o L;
    public final ChqApi a;
    public final com.app.mlounge.data.providers.s b;
    public final com.app.mlounge.data.providers.q c;
    public final e1 d;
    public final com.app.mlounge.data.providers.v e;
    public final y1 f;
    public final PremiumizeManager g;
    public final TorBoxManager h;
    public final AllDebridManager i;
    public final RealDebridManager j;
    public final AnikotoScraper k;
    public final j0 l;
    public final okhttp3.y m;
    public final l1 n;
    public final Semaphore o;
    public final kotlin.o p;
    public final kotlin.o q;
    public final kotlin.o r;
    public final kotlin.o s;
    public final kotlin.o t;
    public final kotlin.o u;
    public final kotlin.o v;
    public final kotlin.o w;
    public final kotlin.o x;
    public final kotlin.o y;
    public final kotlin.o z;

    public r(ChqApi chqApi, com.app.mlounge.data.providers.s sVar, com.app.mlounge.data.providers.q qVar, e1 e1Var, com.app.mlounge.data.providers.v vVar, y1 y1Var, PremiumizeManager premiumizeManager, TorBoxManager torBoxManager, AllDebridManager allDebridManager, RealDebridManager realDebridManager, AnikotoScraper anikotoScraper, j0 j0Var, okhttp3.y yVar, l1 l1Var, Context context) {
        chqApi.getClass();
        sVar.getClass();
        qVar.getClass();
        e1Var.getClass();
        vVar.getClass();
        y1Var.getClass();
        premiumizeManager.getClass();
        torBoxManager.getClass();
        allDebridManager.getClass();
        realDebridManager.getClass();
        anikotoScraper.getClass();
        j0Var.getClass();
        yVar.getClass();
        l1Var.getClass();
        this.a = chqApi;
        this.b = sVar;
        this.c = qVar;
        this.d = e1Var;
        this.e = vVar;
        this.f = y1Var;
        this.g = premiumizeManager;
        this.h = torBoxManager;
        this.i = allDebridManager;
        this.j = realDebridManager;
        this.k = anikotoScraper;
        this.l = j0Var;
        this.m = yVar;
        this.n = l1Var;
        this.o = SemaphoreKt.Semaphore$default(4, 0, 2, null);
        final int i = 0;
        this.p = new kotlin.o(new kotlin.jvm.functions.a(this) { // from class: com.app.mlounge.data.repository.b
            public final /* synthetic */ r y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i) {
                    case 0:
                        r rVar = this.y;
                        return new com.app.mlounge.data.providers.b0(rVar.m, rVar.n);
                    case 1:
                        return new u1(this.y.m);
                    case 2:
                        return new f2(this.y.m);
                    case 3:
                        r rVar2 = this.y;
                        return new com.app.mlounge.data.providers.y(rVar2.m, rVar2.n);
                    case 4:
                        r rVar3 = this.y;
                        return new com.app.mlounge.data.providers.n0(rVar3.m, rVar3.n);
                    case 5:
                        return new c2(this.y.m);
                    case 6:
                        return new z1(this.y.m);
                    case 7:
                        r rVar4 = this.y;
                        return new com.app.mlounge.data.providers.f(rVar4.m, rVar4.n);
                    case 8:
                        r rVar5 = this.y;
                        return new r1(rVar5.m, rVar5.n);
                    case 9:
                        r rVar6 = this.y;
                        return new com.app.mlounge.data.providers.k(rVar6.m, rVar6.n, rVar6.f);
                    case 10:
                        r rVar7 = this.y;
                        return new o1(rVar7.m, rVar7.n);
                    case 11:
                        r rVar8 = this.y;
                        return new com.app.mlounge.data.providers.n(rVar8.m, rVar8.n, rVar8.f);
                    case 12:
                        r rVar9 = this.y;
                        return new com.app.mlounge.data.providers.c(rVar9.m, rVar9.n);
                    case 13:
                        r rVar10 = this.y;
                        return new com.app.mlounge.data.providers.e0(rVar10.m, rVar10.n);
                    case 14:
                        return new u0(this.y.m);
                    case 15:
                        return new com.app.mlounge.data.providers.j0(this.y.m);
                    case 16:
                        r rVar11 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("4KHDHub", rVar11.e), new kotlin.k("Castle", (com.app.mlounge.data.providers.f) rVar11.w.getValue()), new kotlin.k("FshareTV", (com.app.mlounge.data.providers.y) rVar11.s.getValue()), new kotlin.k("HDHub", (com.app.mlounge.data.providers.b0) rVar11.p.getValue()), new kotlin.k("MovieBlast", (com.app.mlounge.data.providers.n0) rVar11.t.getValue()), new kotlin.k("Movies111", (u0) rVar11.D.getValue()), new kotlin.k("VidApi", (u1) rVar11.q.getValue()), new kotlin.k("VidNest", (z1) rVar11.v.getValue()), new kotlin.k("Vidrock", (c2) rVar11.u.getValue()), new kotlin.k("VixSrc", (f2) rVar11.r.getValue()), new kotlin.k("Holly", (com.app.mlounge.data.providers.j0) rVar11.E.getValue()));
                    case 17:
                        r rVar12 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("Torrentio", (r1) rVar12.x.getValue()), new kotlin.k("Comet", (com.app.mlounge.data.providers.k) rVar12.y.getValue()), new kotlin.k("TorrentClaw", (o1) rVar12.z.getValue()), new kotlin.k("EasyNews", (com.app.mlounge.data.providers.n) rVar12.A.getValue()));
                    default:
                        r rVar13 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("AniZone", (com.app.mlounge.data.providers.c) rVar13.B.getValue()), new kotlin.k("HiAnime", (com.app.mlounge.data.providers.e0) rVar13.C.getValue()));
                }
            }
        });
        final int i2 = 1;
        this.q = new kotlin.o(new kotlin.jvm.functions.a(this) { // from class: com.app.mlounge.data.repository.b
            public final /* synthetic */ r y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        r rVar = this.y;
                        return new com.app.mlounge.data.providers.b0(rVar.m, rVar.n);
                    case 1:
                        return new u1(this.y.m);
                    case 2:
                        return new f2(this.y.m);
                    case 3:
                        r rVar2 = this.y;
                        return new com.app.mlounge.data.providers.y(rVar2.m, rVar2.n);
                    case 4:
                        r rVar3 = this.y;
                        return new com.app.mlounge.data.providers.n0(rVar3.m, rVar3.n);
                    case 5:
                        return new c2(this.y.m);
                    case 6:
                        return new z1(this.y.m);
                    case 7:
                        r rVar4 = this.y;
                        return new com.app.mlounge.data.providers.f(rVar4.m, rVar4.n);
                    case 8:
                        r rVar5 = this.y;
                        return new r1(rVar5.m, rVar5.n);
                    case 9:
                        r rVar6 = this.y;
                        return new com.app.mlounge.data.providers.k(rVar6.m, rVar6.n, rVar6.f);
                    case 10:
                        r rVar7 = this.y;
                        return new o1(rVar7.m, rVar7.n);
                    case 11:
                        r rVar8 = this.y;
                        return new com.app.mlounge.data.providers.n(rVar8.m, rVar8.n, rVar8.f);
                    case 12:
                        r rVar9 = this.y;
                        return new com.app.mlounge.data.providers.c(rVar9.m, rVar9.n);
                    case 13:
                        r rVar10 = this.y;
                        return new com.app.mlounge.data.providers.e0(rVar10.m, rVar10.n);
                    case 14:
                        return new u0(this.y.m);
                    case 15:
                        return new com.app.mlounge.data.providers.j0(this.y.m);
                    case 16:
                        r rVar11 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("4KHDHub", rVar11.e), new kotlin.k("Castle", (com.app.mlounge.data.providers.f) rVar11.w.getValue()), new kotlin.k("FshareTV", (com.app.mlounge.data.providers.y) rVar11.s.getValue()), new kotlin.k("HDHub", (com.app.mlounge.data.providers.b0) rVar11.p.getValue()), new kotlin.k("MovieBlast", (com.app.mlounge.data.providers.n0) rVar11.t.getValue()), new kotlin.k("Movies111", (u0) rVar11.D.getValue()), new kotlin.k("VidApi", (u1) rVar11.q.getValue()), new kotlin.k("VidNest", (z1) rVar11.v.getValue()), new kotlin.k("Vidrock", (c2) rVar11.u.getValue()), new kotlin.k("VixSrc", (f2) rVar11.r.getValue()), new kotlin.k("Holly", (com.app.mlounge.data.providers.j0) rVar11.E.getValue()));
                    case 17:
                        r rVar12 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("Torrentio", (r1) rVar12.x.getValue()), new kotlin.k("Comet", (com.app.mlounge.data.providers.k) rVar12.y.getValue()), new kotlin.k("TorrentClaw", (o1) rVar12.z.getValue()), new kotlin.k("EasyNews", (com.app.mlounge.data.providers.n) rVar12.A.getValue()));
                    default:
                        r rVar13 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("AniZone", (com.app.mlounge.data.providers.c) rVar13.B.getValue()), new kotlin.k("HiAnime", (com.app.mlounge.data.providers.e0) rVar13.C.getValue()));
                }
            }
        });
        final int i3 = 2;
        this.r = new kotlin.o(new kotlin.jvm.functions.a(this) { // from class: com.app.mlounge.data.repository.b
            public final /* synthetic */ r y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        r rVar = this.y;
                        return new com.app.mlounge.data.providers.b0(rVar.m, rVar.n);
                    case 1:
                        return new u1(this.y.m);
                    case 2:
                        return new f2(this.y.m);
                    case 3:
                        r rVar2 = this.y;
                        return new com.app.mlounge.data.providers.y(rVar2.m, rVar2.n);
                    case 4:
                        r rVar3 = this.y;
                        return new com.app.mlounge.data.providers.n0(rVar3.m, rVar3.n);
                    case 5:
                        return new c2(this.y.m);
                    case 6:
                        return new z1(this.y.m);
                    case 7:
                        r rVar4 = this.y;
                        return new com.app.mlounge.data.providers.f(rVar4.m, rVar4.n);
                    case 8:
                        r rVar5 = this.y;
                        return new r1(rVar5.m, rVar5.n);
                    case 9:
                        r rVar6 = this.y;
                        return new com.app.mlounge.data.providers.k(rVar6.m, rVar6.n, rVar6.f);
                    case 10:
                        r rVar7 = this.y;
                        return new o1(rVar7.m, rVar7.n);
                    case 11:
                        r rVar8 = this.y;
                        return new com.app.mlounge.data.providers.n(rVar8.m, rVar8.n, rVar8.f);
                    case 12:
                        r rVar9 = this.y;
                        return new com.app.mlounge.data.providers.c(rVar9.m, rVar9.n);
                    case 13:
                        r rVar10 = this.y;
                        return new com.app.mlounge.data.providers.e0(rVar10.m, rVar10.n);
                    case 14:
                        return new u0(this.y.m);
                    case 15:
                        return new com.app.mlounge.data.providers.j0(this.y.m);
                    case 16:
                        r rVar11 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("4KHDHub", rVar11.e), new kotlin.k("Castle", (com.app.mlounge.data.providers.f) rVar11.w.getValue()), new kotlin.k("FshareTV", (com.app.mlounge.data.providers.y) rVar11.s.getValue()), new kotlin.k("HDHub", (com.app.mlounge.data.providers.b0) rVar11.p.getValue()), new kotlin.k("MovieBlast", (com.app.mlounge.data.providers.n0) rVar11.t.getValue()), new kotlin.k("Movies111", (u0) rVar11.D.getValue()), new kotlin.k("VidApi", (u1) rVar11.q.getValue()), new kotlin.k("VidNest", (z1) rVar11.v.getValue()), new kotlin.k("Vidrock", (c2) rVar11.u.getValue()), new kotlin.k("VixSrc", (f2) rVar11.r.getValue()), new kotlin.k("Holly", (com.app.mlounge.data.providers.j0) rVar11.E.getValue()));
                    case 17:
                        r rVar12 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("Torrentio", (r1) rVar12.x.getValue()), new kotlin.k("Comet", (com.app.mlounge.data.providers.k) rVar12.y.getValue()), new kotlin.k("TorrentClaw", (o1) rVar12.z.getValue()), new kotlin.k("EasyNews", (com.app.mlounge.data.providers.n) rVar12.A.getValue()));
                    default:
                        r rVar13 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("AniZone", (com.app.mlounge.data.providers.c) rVar13.B.getValue()), new kotlin.k("HiAnime", (com.app.mlounge.data.providers.e0) rVar13.C.getValue()));
                }
            }
        });
        final int i4 = 3;
        this.s = new kotlin.o(new kotlin.jvm.functions.a(this) { // from class: com.app.mlounge.data.repository.b
            public final /* synthetic */ r y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        r rVar = this.y;
                        return new com.app.mlounge.data.providers.b0(rVar.m, rVar.n);
                    case 1:
                        return new u1(this.y.m);
                    case 2:
                        return new f2(this.y.m);
                    case 3:
                        r rVar2 = this.y;
                        return new com.app.mlounge.data.providers.y(rVar2.m, rVar2.n);
                    case 4:
                        r rVar3 = this.y;
                        return new com.app.mlounge.data.providers.n0(rVar3.m, rVar3.n);
                    case 5:
                        return new c2(this.y.m);
                    case 6:
                        return new z1(this.y.m);
                    case 7:
                        r rVar4 = this.y;
                        return new com.app.mlounge.data.providers.f(rVar4.m, rVar4.n);
                    case 8:
                        r rVar5 = this.y;
                        return new r1(rVar5.m, rVar5.n);
                    case 9:
                        r rVar6 = this.y;
                        return new com.app.mlounge.data.providers.k(rVar6.m, rVar6.n, rVar6.f);
                    case 10:
                        r rVar7 = this.y;
                        return new o1(rVar7.m, rVar7.n);
                    case 11:
                        r rVar8 = this.y;
                        return new com.app.mlounge.data.providers.n(rVar8.m, rVar8.n, rVar8.f);
                    case 12:
                        r rVar9 = this.y;
                        return new com.app.mlounge.data.providers.c(rVar9.m, rVar9.n);
                    case 13:
                        r rVar10 = this.y;
                        return new com.app.mlounge.data.providers.e0(rVar10.m, rVar10.n);
                    case 14:
                        return new u0(this.y.m);
                    case 15:
                        return new com.app.mlounge.data.providers.j0(this.y.m);
                    case 16:
                        r rVar11 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("4KHDHub", rVar11.e), new kotlin.k("Castle", (com.app.mlounge.data.providers.f) rVar11.w.getValue()), new kotlin.k("FshareTV", (com.app.mlounge.data.providers.y) rVar11.s.getValue()), new kotlin.k("HDHub", (com.app.mlounge.data.providers.b0) rVar11.p.getValue()), new kotlin.k("MovieBlast", (com.app.mlounge.data.providers.n0) rVar11.t.getValue()), new kotlin.k("Movies111", (u0) rVar11.D.getValue()), new kotlin.k("VidApi", (u1) rVar11.q.getValue()), new kotlin.k("VidNest", (z1) rVar11.v.getValue()), new kotlin.k("Vidrock", (c2) rVar11.u.getValue()), new kotlin.k("VixSrc", (f2) rVar11.r.getValue()), new kotlin.k("Holly", (com.app.mlounge.data.providers.j0) rVar11.E.getValue()));
                    case 17:
                        r rVar12 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("Torrentio", (r1) rVar12.x.getValue()), new kotlin.k("Comet", (com.app.mlounge.data.providers.k) rVar12.y.getValue()), new kotlin.k("TorrentClaw", (o1) rVar12.z.getValue()), new kotlin.k("EasyNews", (com.app.mlounge.data.providers.n) rVar12.A.getValue()));
                    default:
                        r rVar13 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("AniZone", (com.app.mlounge.data.providers.c) rVar13.B.getValue()), new kotlin.k("HiAnime", (com.app.mlounge.data.providers.e0) rVar13.C.getValue()));
                }
            }
        });
        final int i5 = 4;
        this.t = new kotlin.o(new kotlin.jvm.functions.a(this) { // from class: com.app.mlounge.data.repository.b
            public final /* synthetic */ r y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        r rVar = this.y;
                        return new com.app.mlounge.data.providers.b0(rVar.m, rVar.n);
                    case 1:
                        return new u1(this.y.m);
                    case 2:
                        return new f2(this.y.m);
                    case 3:
                        r rVar2 = this.y;
                        return new com.app.mlounge.data.providers.y(rVar2.m, rVar2.n);
                    case 4:
                        r rVar3 = this.y;
                        return new com.app.mlounge.data.providers.n0(rVar3.m, rVar3.n);
                    case 5:
                        return new c2(this.y.m);
                    case 6:
                        return new z1(this.y.m);
                    case 7:
                        r rVar4 = this.y;
                        return new com.app.mlounge.data.providers.f(rVar4.m, rVar4.n);
                    case 8:
                        r rVar5 = this.y;
                        return new r1(rVar5.m, rVar5.n);
                    case 9:
                        r rVar6 = this.y;
                        return new com.app.mlounge.data.providers.k(rVar6.m, rVar6.n, rVar6.f);
                    case 10:
                        r rVar7 = this.y;
                        return new o1(rVar7.m, rVar7.n);
                    case 11:
                        r rVar8 = this.y;
                        return new com.app.mlounge.data.providers.n(rVar8.m, rVar8.n, rVar8.f);
                    case 12:
                        r rVar9 = this.y;
                        return new com.app.mlounge.data.providers.c(rVar9.m, rVar9.n);
                    case 13:
                        r rVar10 = this.y;
                        return new com.app.mlounge.data.providers.e0(rVar10.m, rVar10.n);
                    case 14:
                        return new u0(this.y.m);
                    case 15:
                        return new com.app.mlounge.data.providers.j0(this.y.m);
                    case 16:
                        r rVar11 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("4KHDHub", rVar11.e), new kotlin.k("Castle", (com.app.mlounge.data.providers.f) rVar11.w.getValue()), new kotlin.k("FshareTV", (com.app.mlounge.data.providers.y) rVar11.s.getValue()), new kotlin.k("HDHub", (com.app.mlounge.data.providers.b0) rVar11.p.getValue()), new kotlin.k("MovieBlast", (com.app.mlounge.data.providers.n0) rVar11.t.getValue()), new kotlin.k("Movies111", (u0) rVar11.D.getValue()), new kotlin.k("VidApi", (u1) rVar11.q.getValue()), new kotlin.k("VidNest", (z1) rVar11.v.getValue()), new kotlin.k("Vidrock", (c2) rVar11.u.getValue()), new kotlin.k("VixSrc", (f2) rVar11.r.getValue()), new kotlin.k("Holly", (com.app.mlounge.data.providers.j0) rVar11.E.getValue()));
                    case 17:
                        r rVar12 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("Torrentio", (r1) rVar12.x.getValue()), new kotlin.k("Comet", (com.app.mlounge.data.providers.k) rVar12.y.getValue()), new kotlin.k("TorrentClaw", (o1) rVar12.z.getValue()), new kotlin.k("EasyNews", (com.app.mlounge.data.providers.n) rVar12.A.getValue()));
                    default:
                        r rVar13 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("AniZone", (com.app.mlounge.data.providers.c) rVar13.B.getValue()), new kotlin.k("HiAnime", (com.app.mlounge.data.providers.e0) rVar13.C.getValue()));
                }
            }
        });
        final int i6 = 5;
        this.u = new kotlin.o(new kotlin.jvm.functions.a(this) { // from class: com.app.mlounge.data.repository.b
            public final /* synthetic */ r y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        r rVar = this.y;
                        return new com.app.mlounge.data.providers.b0(rVar.m, rVar.n);
                    case 1:
                        return new u1(this.y.m);
                    case 2:
                        return new f2(this.y.m);
                    case 3:
                        r rVar2 = this.y;
                        return new com.app.mlounge.data.providers.y(rVar2.m, rVar2.n);
                    case 4:
                        r rVar3 = this.y;
                        return new com.app.mlounge.data.providers.n0(rVar3.m, rVar3.n);
                    case 5:
                        return new c2(this.y.m);
                    case 6:
                        return new z1(this.y.m);
                    case 7:
                        r rVar4 = this.y;
                        return new com.app.mlounge.data.providers.f(rVar4.m, rVar4.n);
                    case 8:
                        r rVar5 = this.y;
                        return new r1(rVar5.m, rVar5.n);
                    case 9:
                        r rVar6 = this.y;
                        return new com.app.mlounge.data.providers.k(rVar6.m, rVar6.n, rVar6.f);
                    case 10:
                        r rVar7 = this.y;
                        return new o1(rVar7.m, rVar7.n);
                    case 11:
                        r rVar8 = this.y;
                        return new com.app.mlounge.data.providers.n(rVar8.m, rVar8.n, rVar8.f);
                    case 12:
                        r rVar9 = this.y;
                        return new com.app.mlounge.data.providers.c(rVar9.m, rVar9.n);
                    case 13:
                        r rVar10 = this.y;
                        return new com.app.mlounge.data.providers.e0(rVar10.m, rVar10.n);
                    case 14:
                        return new u0(this.y.m);
                    case 15:
                        return new com.app.mlounge.data.providers.j0(this.y.m);
                    case 16:
                        r rVar11 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("4KHDHub", rVar11.e), new kotlin.k("Castle", (com.app.mlounge.data.providers.f) rVar11.w.getValue()), new kotlin.k("FshareTV", (com.app.mlounge.data.providers.y) rVar11.s.getValue()), new kotlin.k("HDHub", (com.app.mlounge.data.providers.b0) rVar11.p.getValue()), new kotlin.k("MovieBlast", (com.app.mlounge.data.providers.n0) rVar11.t.getValue()), new kotlin.k("Movies111", (u0) rVar11.D.getValue()), new kotlin.k("VidApi", (u1) rVar11.q.getValue()), new kotlin.k("VidNest", (z1) rVar11.v.getValue()), new kotlin.k("Vidrock", (c2) rVar11.u.getValue()), new kotlin.k("VixSrc", (f2) rVar11.r.getValue()), new kotlin.k("Holly", (com.app.mlounge.data.providers.j0) rVar11.E.getValue()));
                    case 17:
                        r rVar12 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("Torrentio", (r1) rVar12.x.getValue()), new kotlin.k("Comet", (com.app.mlounge.data.providers.k) rVar12.y.getValue()), new kotlin.k("TorrentClaw", (o1) rVar12.z.getValue()), new kotlin.k("EasyNews", (com.app.mlounge.data.providers.n) rVar12.A.getValue()));
                    default:
                        r rVar13 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("AniZone", (com.app.mlounge.data.providers.c) rVar13.B.getValue()), new kotlin.k("HiAnime", (com.app.mlounge.data.providers.e0) rVar13.C.getValue()));
                }
            }
        });
        final int i7 = 6;
        this.v = new kotlin.o(new kotlin.jvm.functions.a(this) { // from class: com.app.mlounge.data.repository.b
            public final /* synthetic */ r y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        r rVar = this.y;
                        return new com.app.mlounge.data.providers.b0(rVar.m, rVar.n);
                    case 1:
                        return new u1(this.y.m);
                    case 2:
                        return new f2(this.y.m);
                    case 3:
                        r rVar2 = this.y;
                        return new com.app.mlounge.data.providers.y(rVar2.m, rVar2.n);
                    case 4:
                        r rVar3 = this.y;
                        return new com.app.mlounge.data.providers.n0(rVar3.m, rVar3.n);
                    case 5:
                        return new c2(this.y.m);
                    case 6:
                        return new z1(this.y.m);
                    case 7:
                        r rVar4 = this.y;
                        return new com.app.mlounge.data.providers.f(rVar4.m, rVar4.n);
                    case 8:
                        r rVar5 = this.y;
                        return new r1(rVar5.m, rVar5.n);
                    case 9:
                        r rVar6 = this.y;
                        return new com.app.mlounge.data.providers.k(rVar6.m, rVar6.n, rVar6.f);
                    case 10:
                        r rVar7 = this.y;
                        return new o1(rVar7.m, rVar7.n);
                    case 11:
                        r rVar8 = this.y;
                        return new com.app.mlounge.data.providers.n(rVar8.m, rVar8.n, rVar8.f);
                    case 12:
                        r rVar9 = this.y;
                        return new com.app.mlounge.data.providers.c(rVar9.m, rVar9.n);
                    case 13:
                        r rVar10 = this.y;
                        return new com.app.mlounge.data.providers.e0(rVar10.m, rVar10.n);
                    case 14:
                        return new u0(this.y.m);
                    case 15:
                        return new com.app.mlounge.data.providers.j0(this.y.m);
                    case 16:
                        r rVar11 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("4KHDHub", rVar11.e), new kotlin.k("Castle", (com.app.mlounge.data.providers.f) rVar11.w.getValue()), new kotlin.k("FshareTV", (com.app.mlounge.data.providers.y) rVar11.s.getValue()), new kotlin.k("HDHub", (com.app.mlounge.data.providers.b0) rVar11.p.getValue()), new kotlin.k("MovieBlast", (com.app.mlounge.data.providers.n0) rVar11.t.getValue()), new kotlin.k("Movies111", (u0) rVar11.D.getValue()), new kotlin.k("VidApi", (u1) rVar11.q.getValue()), new kotlin.k("VidNest", (z1) rVar11.v.getValue()), new kotlin.k("Vidrock", (c2) rVar11.u.getValue()), new kotlin.k("VixSrc", (f2) rVar11.r.getValue()), new kotlin.k("Holly", (com.app.mlounge.data.providers.j0) rVar11.E.getValue()));
                    case 17:
                        r rVar12 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("Torrentio", (r1) rVar12.x.getValue()), new kotlin.k("Comet", (com.app.mlounge.data.providers.k) rVar12.y.getValue()), new kotlin.k("TorrentClaw", (o1) rVar12.z.getValue()), new kotlin.k("EasyNews", (com.app.mlounge.data.providers.n) rVar12.A.getValue()));
                    default:
                        r rVar13 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("AniZone", (com.app.mlounge.data.providers.c) rVar13.B.getValue()), new kotlin.k("HiAnime", (com.app.mlounge.data.providers.e0) rVar13.C.getValue()));
                }
            }
        });
        final int i8 = 7;
        this.w = new kotlin.o(new kotlin.jvm.functions.a(this) { // from class: com.app.mlounge.data.repository.b
            public final /* synthetic */ r y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i8) {
                    case 0:
                        r rVar = this.y;
                        return new com.app.mlounge.data.providers.b0(rVar.m, rVar.n);
                    case 1:
                        return new u1(this.y.m);
                    case 2:
                        return new f2(this.y.m);
                    case 3:
                        r rVar2 = this.y;
                        return new com.app.mlounge.data.providers.y(rVar2.m, rVar2.n);
                    case 4:
                        r rVar3 = this.y;
                        return new com.app.mlounge.data.providers.n0(rVar3.m, rVar3.n);
                    case 5:
                        return new c2(this.y.m);
                    case 6:
                        return new z1(this.y.m);
                    case 7:
                        r rVar4 = this.y;
                        return new com.app.mlounge.data.providers.f(rVar4.m, rVar4.n);
                    case 8:
                        r rVar5 = this.y;
                        return new r1(rVar5.m, rVar5.n);
                    case 9:
                        r rVar6 = this.y;
                        return new com.app.mlounge.data.providers.k(rVar6.m, rVar6.n, rVar6.f);
                    case 10:
                        r rVar7 = this.y;
                        return new o1(rVar7.m, rVar7.n);
                    case 11:
                        r rVar8 = this.y;
                        return new com.app.mlounge.data.providers.n(rVar8.m, rVar8.n, rVar8.f);
                    case 12:
                        r rVar9 = this.y;
                        return new com.app.mlounge.data.providers.c(rVar9.m, rVar9.n);
                    case 13:
                        r rVar10 = this.y;
                        return new com.app.mlounge.data.providers.e0(rVar10.m, rVar10.n);
                    case 14:
                        return new u0(this.y.m);
                    case 15:
                        return new com.app.mlounge.data.providers.j0(this.y.m);
                    case 16:
                        r rVar11 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("4KHDHub", rVar11.e), new kotlin.k("Castle", (com.app.mlounge.data.providers.f) rVar11.w.getValue()), new kotlin.k("FshareTV", (com.app.mlounge.data.providers.y) rVar11.s.getValue()), new kotlin.k("HDHub", (com.app.mlounge.data.providers.b0) rVar11.p.getValue()), new kotlin.k("MovieBlast", (com.app.mlounge.data.providers.n0) rVar11.t.getValue()), new kotlin.k("Movies111", (u0) rVar11.D.getValue()), new kotlin.k("VidApi", (u1) rVar11.q.getValue()), new kotlin.k("VidNest", (z1) rVar11.v.getValue()), new kotlin.k("Vidrock", (c2) rVar11.u.getValue()), new kotlin.k("VixSrc", (f2) rVar11.r.getValue()), new kotlin.k("Holly", (com.app.mlounge.data.providers.j0) rVar11.E.getValue()));
                    case 17:
                        r rVar12 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("Torrentio", (r1) rVar12.x.getValue()), new kotlin.k("Comet", (com.app.mlounge.data.providers.k) rVar12.y.getValue()), new kotlin.k("TorrentClaw", (o1) rVar12.z.getValue()), new kotlin.k("EasyNews", (com.app.mlounge.data.providers.n) rVar12.A.getValue()));
                    default:
                        r rVar13 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("AniZone", (com.app.mlounge.data.providers.c) rVar13.B.getValue()), new kotlin.k("HiAnime", (com.app.mlounge.data.providers.e0) rVar13.C.getValue()));
                }
            }
        });
        final int i9 = 8;
        this.x = new kotlin.o(new kotlin.jvm.functions.a(this) { // from class: com.app.mlounge.data.repository.b
            public final /* synthetic */ r y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        r rVar = this.y;
                        return new com.app.mlounge.data.providers.b0(rVar.m, rVar.n);
                    case 1:
                        return new u1(this.y.m);
                    case 2:
                        return new f2(this.y.m);
                    case 3:
                        r rVar2 = this.y;
                        return new com.app.mlounge.data.providers.y(rVar2.m, rVar2.n);
                    case 4:
                        r rVar3 = this.y;
                        return new com.app.mlounge.data.providers.n0(rVar3.m, rVar3.n);
                    case 5:
                        return new c2(this.y.m);
                    case 6:
                        return new z1(this.y.m);
                    case 7:
                        r rVar4 = this.y;
                        return new com.app.mlounge.data.providers.f(rVar4.m, rVar4.n);
                    case 8:
                        r rVar5 = this.y;
                        return new r1(rVar5.m, rVar5.n);
                    case 9:
                        r rVar6 = this.y;
                        return new com.app.mlounge.data.providers.k(rVar6.m, rVar6.n, rVar6.f);
                    case 10:
                        r rVar7 = this.y;
                        return new o1(rVar7.m, rVar7.n);
                    case 11:
                        r rVar8 = this.y;
                        return new com.app.mlounge.data.providers.n(rVar8.m, rVar8.n, rVar8.f);
                    case 12:
                        r rVar9 = this.y;
                        return new com.app.mlounge.data.providers.c(rVar9.m, rVar9.n);
                    case 13:
                        r rVar10 = this.y;
                        return new com.app.mlounge.data.providers.e0(rVar10.m, rVar10.n);
                    case 14:
                        return new u0(this.y.m);
                    case 15:
                        return new com.app.mlounge.data.providers.j0(this.y.m);
                    case 16:
                        r rVar11 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("4KHDHub", rVar11.e), new kotlin.k("Castle", (com.app.mlounge.data.providers.f) rVar11.w.getValue()), new kotlin.k("FshareTV", (com.app.mlounge.data.providers.y) rVar11.s.getValue()), new kotlin.k("HDHub", (com.app.mlounge.data.providers.b0) rVar11.p.getValue()), new kotlin.k("MovieBlast", (com.app.mlounge.data.providers.n0) rVar11.t.getValue()), new kotlin.k("Movies111", (u0) rVar11.D.getValue()), new kotlin.k("VidApi", (u1) rVar11.q.getValue()), new kotlin.k("VidNest", (z1) rVar11.v.getValue()), new kotlin.k("Vidrock", (c2) rVar11.u.getValue()), new kotlin.k("VixSrc", (f2) rVar11.r.getValue()), new kotlin.k("Holly", (com.app.mlounge.data.providers.j0) rVar11.E.getValue()));
                    case 17:
                        r rVar12 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("Torrentio", (r1) rVar12.x.getValue()), new kotlin.k("Comet", (com.app.mlounge.data.providers.k) rVar12.y.getValue()), new kotlin.k("TorrentClaw", (o1) rVar12.z.getValue()), new kotlin.k("EasyNews", (com.app.mlounge.data.providers.n) rVar12.A.getValue()));
                    default:
                        r rVar13 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("AniZone", (com.app.mlounge.data.providers.c) rVar13.B.getValue()), new kotlin.k("HiAnime", (com.app.mlounge.data.providers.e0) rVar13.C.getValue()));
                }
            }
        });
        final int i10 = 9;
        this.y = new kotlin.o(new kotlin.jvm.functions.a(this) { // from class: com.app.mlounge.data.repository.b
            public final /* synthetic */ r y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        r rVar = this.y;
                        return new com.app.mlounge.data.providers.b0(rVar.m, rVar.n);
                    case 1:
                        return new u1(this.y.m);
                    case 2:
                        return new f2(this.y.m);
                    case 3:
                        r rVar2 = this.y;
                        return new com.app.mlounge.data.providers.y(rVar2.m, rVar2.n);
                    case 4:
                        r rVar3 = this.y;
                        return new com.app.mlounge.data.providers.n0(rVar3.m, rVar3.n);
                    case 5:
                        return new c2(this.y.m);
                    case 6:
                        return new z1(this.y.m);
                    case 7:
                        r rVar4 = this.y;
                        return new com.app.mlounge.data.providers.f(rVar4.m, rVar4.n);
                    case 8:
                        r rVar5 = this.y;
                        return new r1(rVar5.m, rVar5.n);
                    case 9:
                        r rVar6 = this.y;
                        return new com.app.mlounge.data.providers.k(rVar6.m, rVar6.n, rVar6.f);
                    case 10:
                        r rVar7 = this.y;
                        return new o1(rVar7.m, rVar7.n);
                    case 11:
                        r rVar8 = this.y;
                        return new com.app.mlounge.data.providers.n(rVar8.m, rVar8.n, rVar8.f);
                    case 12:
                        r rVar9 = this.y;
                        return new com.app.mlounge.data.providers.c(rVar9.m, rVar9.n);
                    case 13:
                        r rVar10 = this.y;
                        return new com.app.mlounge.data.providers.e0(rVar10.m, rVar10.n);
                    case 14:
                        return new u0(this.y.m);
                    case 15:
                        return new com.app.mlounge.data.providers.j0(this.y.m);
                    case 16:
                        r rVar11 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("4KHDHub", rVar11.e), new kotlin.k("Castle", (com.app.mlounge.data.providers.f) rVar11.w.getValue()), new kotlin.k("FshareTV", (com.app.mlounge.data.providers.y) rVar11.s.getValue()), new kotlin.k("HDHub", (com.app.mlounge.data.providers.b0) rVar11.p.getValue()), new kotlin.k("MovieBlast", (com.app.mlounge.data.providers.n0) rVar11.t.getValue()), new kotlin.k("Movies111", (u0) rVar11.D.getValue()), new kotlin.k("VidApi", (u1) rVar11.q.getValue()), new kotlin.k("VidNest", (z1) rVar11.v.getValue()), new kotlin.k("Vidrock", (c2) rVar11.u.getValue()), new kotlin.k("VixSrc", (f2) rVar11.r.getValue()), new kotlin.k("Holly", (com.app.mlounge.data.providers.j0) rVar11.E.getValue()));
                    case 17:
                        r rVar12 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("Torrentio", (r1) rVar12.x.getValue()), new kotlin.k("Comet", (com.app.mlounge.data.providers.k) rVar12.y.getValue()), new kotlin.k("TorrentClaw", (o1) rVar12.z.getValue()), new kotlin.k("EasyNews", (com.app.mlounge.data.providers.n) rVar12.A.getValue()));
                    default:
                        r rVar13 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("AniZone", (com.app.mlounge.data.providers.c) rVar13.B.getValue()), new kotlin.k("HiAnime", (com.app.mlounge.data.providers.e0) rVar13.C.getValue()));
                }
            }
        });
        final int i11 = 10;
        this.z = new kotlin.o(new kotlin.jvm.functions.a(this) { // from class: com.app.mlounge.data.repository.b
            public final /* synthetic */ r y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        r rVar = this.y;
                        return new com.app.mlounge.data.providers.b0(rVar.m, rVar.n);
                    case 1:
                        return new u1(this.y.m);
                    case 2:
                        return new f2(this.y.m);
                    case 3:
                        r rVar2 = this.y;
                        return new com.app.mlounge.data.providers.y(rVar2.m, rVar2.n);
                    case 4:
                        r rVar3 = this.y;
                        return new com.app.mlounge.data.providers.n0(rVar3.m, rVar3.n);
                    case 5:
                        return new c2(this.y.m);
                    case 6:
                        return new z1(this.y.m);
                    case 7:
                        r rVar4 = this.y;
                        return new com.app.mlounge.data.providers.f(rVar4.m, rVar4.n);
                    case 8:
                        r rVar5 = this.y;
                        return new r1(rVar5.m, rVar5.n);
                    case 9:
                        r rVar6 = this.y;
                        return new com.app.mlounge.data.providers.k(rVar6.m, rVar6.n, rVar6.f);
                    case 10:
                        r rVar7 = this.y;
                        return new o1(rVar7.m, rVar7.n);
                    case 11:
                        r rVar8 = this.y;
                        return new com.app.mlounge.data.providers.n(rVar8.m, rVar8.n, rVar8.f);
                    case 12:
                        r rVar9 = this.y;
                        return new com.app.mlounge.data.providers.c(rVar9.m, rVar9.n);
                    case 13:
                        r rVar10 = this.y;
                        return new com.app.mlounge.data.providers.e0(rVar10.m, rVar10.n);
                    case 14:
                        return new u0(this.y.m);
                    case 15:
                        return new com.app.mlounge.data.providers.j0(this.y.m);
                    case 16:
                        r rVar11 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("4KHDHub", rVar11.e), new kotlin.k("Castle", (com.app.mlounge.data.providers.f) rVar11.w.getValue()), new kotlin.k("FshareTV", (com.app.mlounge.data.providers.y) rVar11.s.getValue()), new kotlin.k("HDHub", (com.app.mlounge.data.providers.b0) rVar11.p.getValue()), new kotlin.k("MovieBlast", (com.app.mlounge.data.providers.n0) rVar11.t.getValue()), new kotlin.k("Movies111", (u0) rVar11.D.getValue()), new kotlin.k("VidApi", (u1) rVar11.q.getValue()), new kotlin.k("VidNest", (z1) rVar11.v.getValue()), new kotlin.k("Vidrock", (c2) rVar11.u.getValue()), new kotlin.k("VixSrc", (f2) rVar11.r.getValue()), new kotlin.k("Holly", (com.app.mlounge.data.providers.j0) rVar11.E.getValue()));
                    case 17:
                        r rVar12 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("Torrentio", (r1) rVar12.x.getValue()), new kotlin.k("Comet", (com.app.mlounge.data.providers.k) rVar12.y.getValue()), new kotlin.k("TorrentClaw", (o1) rVar12.z.getValue()), new kotlin.k("EasyNews", (com.app.mlounge.data.providers.n) rVar12.A.getValue()));
                    default:
                        r rVar13 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("AniZone", (com.app.mlounge.data.providers.c) rVar13.B.getValue()), new kotlin.k("HiAnime", (com.app.mlounge.data.providers.e0) rVar13.C.getValue()));
                }
            }
        });
        final int i12 = 11;
        this.A = new kotlin.o(new kotlin.jvm.functions.a(this) { // from class: com.app.mlounge.data.repository.b
            public final /* synthetic */ r y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        r rVar = this.y;
                        return new com.app.mlounge.data.providers.b0(rVar.m, rVar.n);
                    case 1:
                        return new u1(this.y.m);
                    case 2:
                        return new f2(this.y.m);
                    case 3:
                        r rVar2 = this.y;
                        return new com.app.mlounge.data.providers.y(rVar2.m, rVar2.n);
                    case 4:
                        r rVar3 = this.y;
                        return new com.app.mlounge.data.providers.n0(rVar3.m, rVar3.n);
                    case 5:
                        return new c2(this.y.m);
                    case 6:
                        return new z1(this.y.m);
                    case 7:
                        r rVar4 = this.y;
                        return new com.app.mlounge.data.providers.f(rVar4.m, rVar4.n);
                    case 8:
                        r rVar5 = this.y;
                        return new r1(rVar5.m, rVar5.n);
                    case 9:
                        r rVar6 = this.y;
                        return new com.app.mlounge.data.providers.k(rVar6.m, rVar6.n, rVar6.f);
                    case 10:
                        r rVar7 = this.y;
                        return new o1(rVar7.m, rVar7.n);
                    case 11:
                        r rVar8 = this.y;
                        return new com.app.mlounge.data.providers.n(rVar8.m, rVar8.n, rVar8.f);
                    case 12:
                        r rVar9 = this.y;
                        return new com.app.mlounge.data.providers.c(rVar9.m, rVar9.n);
                    case 13:
                        r rVar10 = this.y;
                        return new com.app.mlounge.data.providers.e0(rVar10.m, rVar10.n);
                    case 14:
                        return new u0(this.y.m);
                    case 15:
                        return new com.app.mlounge.data.providers.j0(this.y.m);
                    case 16:
                        r rVar11 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("4KHDHub", rVar11.e), new kotlin.k("Castle", (com.app.mlounge.data.providers.f) rVar11.w.getValue()), new kotlin.k("FshareTV", (com.app.mlounge.data.providers.y) rVar11.s.getValue()), new kotlin.k("HDHub", (com.app.mlounge.data.providers.b0) rVar11.p.getValue()), new kotlin.k("MovieBlast", (com.app.mlounge.data.providers.n0) rVar11.t.getValue()), new kotlin.k("Movies111", (u0) rVar11.D.getValue()), new kotlin.k("VidApi", (u1) rVar11.q.getValue()), new kotlin.k("VidNest", (z1) rVar11.v.getValue()), new kotlin.k("Vidrock", (c2) rVar11.u.getValue()), new kotlin.k("VixSrc", (f2) rVar11.r.getValue()), new kotlin.k("Holly", (com.app.mlounge.data.providers.j0) rVar11.E.getValue()));
                    case 17:
                        r rVar12 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("Torrentio", (r1) rVar12.x.getValue()), new kotlin.k("Comet", (com.app.mlounge.data.providers.k) rVar12.y.getValue()), new kotlin.k("TorrentClaw", (o1) rVar12.z.getValue()), new kotlin.k("EasyNews", (com.app.mlounge.data.providers.n) rVar12.A.getValue()));
                    default:
                        r rVar13 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("AniZone", (com.app.mlounge.data.providers.c) rVar13.B.getValue()), new kotlin.k("HiAnime", (com.app.mlounge.data.providers.e0) rVar13.C.getValue()));
                }
            }
        });
        final int i13 = 12;
        this.B = new kotlin.o(new kotlin.jvm.functions.a(this) { // from class: com.app.mlounge.data.repository.b
            public final /* synthetic */ r y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        r rVar = this.y;
                        return new com.app.mlounge.data.providers.b0(rVar.m, rVar.n);
                    case 1:
                        return new u1(this.y.m);
                    case 2:
                        return new f2(this.y.m);
                    case 3:
                        r rVar2 = this.y;
                        return new com.app.mlounge.data.providers.y(rVar2.m, rVar2.n);
                    case 4:
                        r rVar3 = this.y;
                        return new com.app.mlounge.data.providers.n0(rVar3.m, rVar3.n);
                    case 5:
                        return new c2(this.y.m);
                    case 6:
                        return new z1(this.y.m);
                    case 7:
                        r rVar4 = this.y;
                        return new com.app.mlounge.data.providers.f(rVar4.m, rVar4.n);
                    case 8:
                        r rVar5 = this.y;
                        return new r1(rVar5.m, rVar5.n);
                    case 9:
                        r rVar6 = this.y;
                        return new com.app.mlounge.data.providers.k(rVar6.m, rVar6.n, rVar6.f);
                    case 10:
                        r rVar7 = this.y;
                        return new o1(rVar7.m, rVar7.n);
                    case 11:
                        r rVar8 = this.y;
                        return new com.app.mlounge.data.providers.n(rVar8.m, rVar8.n, rVar8.f);
                    case 12:
                        r rVar9 = this.y;
                        return new com.app.mlounge.data.providers.c(rVar9.m, rVar9.n);
                    case 13:
                        r rVar10 = this.y;
                        return new com.app.mlounge.data.providers.e0(rVar10.m, rVar10.n);
                    case 14:
                        return new u0(this.y.m);
                    case 15:
                        return new com.app.mlounge.data.providers.j0(this.y.m);
                    case 16:
                        r rVar11 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("4KHDHub", rVar11.e), new kotlin.k("Castle", (com.app.mlounge.data.providers.f) rVar11.w.getValue()), new kotlin.k("FshareTV", (com.app.mlounge.data.providers.y) rVar11.s.getValue()), new kotlin.k("HDHub", (com.app.mlounge.data.providers.b0) rVar11.p.getValue()), new kotlin.k("MovieBlast", (com.app.mlounge.data.providers.n0) rVar11.t.getValue()), new kotlin.k("Movies111", (u0) rVar11.D.getValue()), new kotlin.k("VidApi", (u1) rVar11.q.getValue()), new kotlin.k("VidNest", (z1) rVar11.v.getValue()), new kotlin.k("Vidrock", (c2) rVar11.u.getValue()), new kotlin.k("VixSrc", (f2) rVar11.r.getValue()), new kotlin.k("Holly", (com.app.mlounge.data.providers.j0) rVar11.E.getValue()));
                    case 17:
                        r rVar12 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("Torrentio", (r1) rVar12.x.getValue()), new kotlin.k("Comet", (com.app.mlounge.data.providers.k) rVar12.y.getValue()), new kotlin.k("TorrentClaw", (o1) rVar12.z.getValue()), new kotlin.k("EasyNews", (com.app.mlounge.data.providers.n) rVar12.A.getValue()));
                    default:
                        r rVar13 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("AniZone", (com.app.mlounge.data.providers.c) rVar13.B.getValue()), new kotlin.k("HiAnime", (com.app.mlounge.data.providers.e0) rVar13.C.getValue()));
                }
            }
        });
        final int i14 = 13;
        this.C = new kotlin.o(new kotlin.jvm.functions.a(this) { // from class: com.app.mlounge.data.repository.b
            public final /* synthetic */ r y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        r rVar = this.y;
                        return new com.app.mlounge.data.providers.b0(rVar.m, rVar.n);
                    case 1:
                        return new u1(this.y.m);
                    case 2:
                        return new f2(this.y.m);
                    case 3:
                        r rVar2 = this.y;
                        return new com.app.mlounge.data.providers.y(rVar2.m, rVar2.n);
                    case 4:
                        r rVar3 = this.y;
                        return new com.app.mlounge.data.providers.n0(rVar3.m, rVar3.n);
                    case 5:
                        return new c2(this.y.m);
                    case 6:
                        return new z1(this.y.m);
                    case 7:
                        r rVar4 = this.y;
                        return new com.app.mlounge.data.providers.f(rVar4.m, rVar4.n);
                    case 8:
                        r rVar5 = this.y;
                        return new r1(rVar5.m, rVar5.n);
                    case 9:
                        r rVar6 = this.y;
                        return new com.app.mlounge.data.providers.k(rVar6.m, rVar6.n, rVar6.f);
                    case 10:
                        r rVar7 = this.y;
                        return new o1(rVar7.m, rVar7.n);
                    case 11:
                        r rVar8 = this.y;
                        return new com.app.mlounge.data.providers.n(rVar8.m, rVar8.n, rVar8.f);
                    case 12:
                        r rVar9 = this.y;
                        return new com.app.mlounge.data.providers.c(rVar9.m, rVar9.n);
                    case 13:
                        r rVar10 = this.y;
                        return new com.app.mlounge.data.providers.e0(rVar10.m, rVar10.n);
                    case 14:
                        return new u0(this.y.m);
                    case 15:
                        return new com.app.mlounge.data.providers.j0(this.y.m);
                    case 16:
                        r rVar11 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("4KHDHub", rVar11.e), new kotlin.k("Castle", (com.app.mlounge.data.providers.f) rVar11.w.getValue()), new kotlin.k("FshareTV", (com.app.mlounge.data.providers.y) rVar11.s.getValue()), new kotlin.k("HDHub", (com.app.mlounge.data.providers.b0) rVar11.p.getValue()), new kotlin.k("MovieBlast", (com.app.mlounge.data.providers.n0) rVar11.t.getValue()), new kotlin.k("Movies111", (u0) rVar11.D.getValue()), new kotlin.k("VidApi", (u1) rVar11.q.getValue()), new kotlin.k("VidNest", (z1) rVar11.v.getValue()), new kotlin.k("Vidrock", (c2) rVar11.u.getValue()), new kotlin.k("VixSrc", (f2) rVar11.r.getValue()), new kotlin.k("Holly", (com.app.mlounge.data.providers.j0) rVar11.E.getValue()));
                    case 17:
                        r rVar12 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("Torrentio", (r1) rVar12.x.getValue()), new kotlin.k("Comet", (com.app.mlounge.data.providers.k) rVar12.y.getValue()), new kotlin.k("TorrentClaw", (o1) rVar12.z.getValue()), new kotlin.k("EasyNews", (com.app.mlounge.data.providers.n) rVar12.A.getValue()));
                    default:
                        r rVar13 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("AniZone", (com.app.mlounge.data.providers.c) rVar13.B.getValue()), new kotlin.k("HiAnime", (com.app.mlounge.data.providers.e0) rVar13.C.getValue()));
                }
            }
        });
        final int i15 = 14;
        this.D = new kotlin.o(new kotlin.jvm.functions.a(this) { // from class: com.app.mlounge.data.repository.b
            public final /* synthetic */ r y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        r rVar = this.y;
                        return new com.app.mlounge.data.providers.b0(rVar.m, rVar.n);
                    case 1:
                        return new u1(this.y.m);
                    case 2:
                        return new f2(this.y.m);
                    case 3:
                        r rVar2 = this.y;
                        return new com.app.mlounge.data.providers.y(rVar2.m, rVar2.n);
                    case 4:
                        r rVar3 = this.y;
                        return new com.app.mlounge.data.providers.n0(rVar3.m, rVar3.n);
                    case 5:
                        return new c2(this.y.m);
                    case 6:
                        return new z1(this.y.m);
                    case 7:
                        r rVar4 = this.y;
                        return new com.app.mlounge.data.providers.f(rVar4.m, rVar4.n);
                    case 8:
                        r rVar5 = this.y;
                        return new r1(rVar5.m, rVar5.n);
                    case 9:
                        r rVar6 = this.y;
                        return new com.app.mlounge.data.providers.k(rVar6.m, rVar6.n, rVar6.f);
                    case 10:
                        r rVar7 = this.y;
                        return new o1(rVar7.m, rVar7.n);
                    case 11:
                        r rVar8 = this.y;
                        return new com.app.mlounge.data.providers.n(rVar8.m, rVar8.n, rVar8.f);
                    case 12:
                        r rVar9 = this.y;
                        return new com.app.mlounge.data.providers.c(rVar9.m, rVar9.n);
                    case 13:
                        r rVar10 = this.y;
                        return new com.app.mlounge.data.providers.e0(rVar10.m, rVar10.n);
                    case 14:
                        return new u0(this.y.m);
                    case 15:
                        return new com.app.mlounge.data.providers.j0(this.y.m);
                    case 16:
                        r rVar11 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("4KHDHub", rVar11.e), new kotlin.k("Castle", (com.app.mlounge.data.providers.f) rVar11.w.getValue()), new kotlin.k("FshareTV", (com.app.mlounge.data.providers.y) rVar11.s.getValue()), new kotlin.k("HDHub", (com.app.mlounge.data.providers.b0) rVar11.p.getValue()), new kotlin.k("MovieBlast", (com.app.mlounge.data.providers.n0) rVar11.t.getValue()), new kotlin.k("Movies111", (u0) rVar11.D.getValue()), new kotlin.k("VidApi", (u1) rVar11.q.getValue()), new kotlin.k("VidNest", (z1) rVar11.v.getValue()), new kotlin.k("Vidrock", (c2) rVar11.u.getValue()), new kotlin.k("VixSrc", (f2) rVar11.r.getValue()), new kotlin.k("Holly", (com.app.mlounge.data.providers.j0) rVar11.E.getValue()));
                    case 17:
                        r rVar12 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("Torrentio", (r1) rVar12.x.getValue()), new kotlin.k("Comet", (com.app.mlounge.data.providers.k) rVar12.y.getValue()), new kotlin.k("TorrentClaw", (o1) rVar12.z.getValue()), new kotlin.k("EasyNews", (com.app.mlounge.data.providers.n) rVar12.A.getValue()));
                    default:
                        r rVar13 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("AniZone", (com.app.mlounge.data.providers.c) rVar13.B.getValue()), new kotlin.k("HiAnime", (com.app.mlounge.data.providers.e0) rVar13.C.getValue()));
                }
            }
        });
        final int i16 = 15;
        this.E = new kotlin.o(new kotlin.jvm.functions.a(this) { // from class: com.app.mlounge.data.repository.b
            public final /* synthetic */ r y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        r rVar = this.y;
                        return new com.app.mlounge.data.providers.b0(rVar.m, rVar.n);
                    case 1:
                        return new u1(this.y.m);
                    case 2:
                        return new f2(this.y.m);
                    case 3:
                        r rVar2 = this.y;
                        return new com.app.mlounge.data.providers.y(rVar2.m, rVar2.n);
                    case 4:
                        r rVar3 = this.y;
                        return new com.app.mlounge.data.providers.n0(rVar3.m, rVar3.n);
                    case 5:
                        return new c2(this.y.m);
                    case 6:
                        return new z1(this.y.m);
                    case 7:
                        r rVar4 = this.y;
                        return new com.app.mlounge.data.providers.f(rVar4.m, rVar4.n);
                    case 8:
                        r rVar5 = this.y;
                        return new r1(rVar5.m, rVar5.n);
                    case 9:
                        r rVar6 = this.y;
                        return new com.app.mlounge.data.providers.k(rVar6.m, rVar6.n, rVar6.f);
                    case 10:
                        r rVar7 = this.y;
                        return new o1(rVar7.m, rVar7.n);
                    case 11:
                        r rVar8 = this.y;
                        return new com.app.mlounge.data.providers.n(rVar8.m, rVar8.n, rVar8.f);
                    case 12:
                        r rVar9 = this.y;
                        return new com.app.mlounge.data.providers.c(rVar9.m, rVar9.n);
                    case 13:
                        r rVar10 = this.y;
                        return new com.app.mlounge.data.providers.e0(rVar10.m, rVar10.n);
                    case 14:
                        return new u0(this.y.m);
                    case 15:
                        return new com.app.mlounge.data.providers.j0(this.y.m);
                    case 16:
                        r rVar11 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("4KHDHub", rVar11.e), new kotlin.k("Castle", (com.app.mlounge.data.providers.f) rVar11.w.getValue()), new kotlin.k("FshareTV", (com.app.mlounge.data.providers.y) rVar11.s.getValue()), new kotlin.k("HDHub", (com.app.mlounge.data.providers.b0) rVar11.p.getValue()), new kotlin.k("MovieBlast", (com.app.mlounge.data.providers.n0) rVar11.t.getValue()), new kotlin.k("Movies111", (u0) rVar11.D.getValue()), new kotlin.k("VidApi", (u1) rVar11.q.getValue()), new kotlin.k("VidNest", (z1) rVar11.v.getValue()), new kotlin.k("Vidrock", (c2) rVar11.u.getValue()), new kotlin.k("VixSrc", (f2) rVar11.r.getValue()), new kotlin.k("Holly", (com.app.mlounge.data.providers.j0) rVar11.E.getValue()));
                    case 17:
                        r rVar12 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("Torrentio", (r1) rVar12.x.getValue()), new kotlin.k("Comet", (com.app.mlounge.data.providers.k) rVar12.y.getValue()), new kotlin.k("TorrentClaw", (o1) rVar12.z.getValue()), new kotlin.k("EasyNews", (com.app.mlounge.data.providers.n) rVar12.A.getValue()));
                    default:
                        r rVar13 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("AniZone", (com.app.mlounge.data.providers.c) rVar13.B.getValue()), new kotlin.k("HiAnime", (com.app.mlounge.data.providers.e0) rVar13.C.getValue()));
                }
            }
        });
        this.F = com.google.common.base.c.q("4KHDHub", "Castle", "FshareTV", "HDHub", "Holly", "MovieBlast", "Movies111", "VidApi", "VidNest", "Vidrock", "VixSrc", "Torrentio", "Comet", "TorrentClaw", "EasyNews");
        this.G = com.google.common.base.c.q("4KHDHub", "Castle", "FshareTV", "HDHub", "Holly", "MovieBlast", "Movies111", "VidApi", "VidNest", "Vidrock", "VixSrc");
        this.H = com.google.common.base.c.q("Torrentio", "Comet", "TorrentClaw");
        this.I = com.google.common.base.c.q("AniZone", "HiAnime");
        final int i17 = 16;
        this.J = new kotlin.o(new kotlin.jvm.functions.a(this) { // from class: com.app.mlounge.data.repository.b
            public final /* synthetic */ r y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        r rVar = this.y;
                        return new com.app.mlounge.data.providers.b0(rVar.m, rVar.n);
                    case 1:
                        return new u1(this.y.m);
                    case 2:
                        return new f2(this.y.m);
                    case 3:
                        r rVar2 = this.y;
                        return new com.app.mlounge.data.providers.y(rVar2.m, rVar2.n);
                    case 4:
                        r rVar3 = this.y;
                        return new com.app.mlounge.data.providers.n0(rVar3.m, rVar3.n);
                    case 5:
                        return new c2(this.y.m);
                    case 6:
                        return new z1(this.y.m);
                    case 7:
                        r rVar4 = this.y;
                        return new com.app.mlounge.data.providers.f(rVar4.m, rVar4.n);
                    case 8:
                        r rVar5 = this.y;
                        return new r1(rVar5.m, rVar5.n);
                    case 9:
                        r rVar6 = this.y;
                        return new com.app.mlounge.data.providers.k(rVar6.m, rVar6.n, rVar6.f);
                    case 10:
                        r rVar7 = this.y;
                        return new o1(rVar7.m, rVar7.n);
                    case 11:
                        r rVar8 = this.y;
                        return new com.app.mlounge.data.providers.n(rVar8.m, rVar8.n, rVar8.f);
                    case 12:
                        r rVar9 = this.y;
                        return new com.app.mlounge.data.providers.c(rVar9.m, rVar9.n);
                    case 13:
                        r rVar10 = this.y;
                        return new com.app.mlounge.data.providers.e0(rVar10.m, rVar10.n);
                    case 14:
                        return new u0(this.y.m);
                    case 15:
                        return new com.app.mlounge.data.providers.j0(this.y.m);
                    case 16:
                        r rVar11 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("4KHDHub", rVar11.e), new kotlin.k("Castle", (com.app.mlounge.data.providers.f) rVar11.w.getValue()), new kotlin.k("FshareTV", (com.app.mlounge.data.providers.y) rVar11.s.getValue()), new kotlin.k("HDHub", (com.app.mlounge.data.providers.b0) rVar11.p.getValue()), new kotlin.k("MovieBlast", (com.app.mlounge.data.providers.n0) rVar11.t.getValue()), new kotlin.k("Movies111", (u0) rVar11.D.getValue()), new kotlin.k("VidApi", (u1) rVar11.q.getValue()), new kotlin.k("VidNest", (z1) rVar11.v.getValue()), new kotlin.k("Vidrock", (c2) rVar11.u.getValue()), new kotlin.k("VixSrc", (f2) rVar11.r.getValue()), new kotlin.k("Holly", (com.app.mlounge.data.providers.j0) rVar11.E.getValue()));
                    case 17:
                        r rVar12 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("Torrentio", (r1) rVar12.x.getValue()), new kotlin.k("Comet", (com.app.mlounge.data.providers.k) rVar12.y.getValue()), new kotlin.k("TorrentClaw", (o1) rVar12.z.getValue()), new kotlin.k("EasyNews", (com.app.mlounge.data.providers.n) rVar12.A.getValue()));
                    default:
                        r rVar13 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("AniZone", (com.app.mlounge.data.providers.c) rVar13.B.getValue()), new kotlin.k("HiAnime", (com.app.mlounge.data.providers.e0) rVar13.C.getValue()));
                }
            }
        });
        final int i18 = 17;
        this.K = new kotlin.o(new kotlin.jvm.functions.a(this) { // from class: com.app.mlounge.data.repository.b
            public final /* synthetic */ r y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i18) {
                    case 0:
                        r rVar = this.y;
                        return new com.app.mlounge.data.providers.b0(rVar.m, rVar.n);
                    case 1:
                        return new u1(this.y.m);
                    case 2:
                        return new f2(this.y.m);
                    case 3:
                        r rVar2 = this.y;
                        return new com.app.mlounge.data.providers.y(rVar2.m, rVar2.n);
                    case 4:
                        r rVar3 = this.y;
                        return new com.app.mlounge.data.providers.n0(rVar3.m, rVar3.n);
                    case 5:
                        return new c2(this.y.m);
                    case 6:
                        return new z1(this.y.m);
                    case 7:
                        r rVar4 = this.y;
                        return new com.app.mlounge.data.providers.f(rVar4.m, rVar4.n);
                    case 8:
                        r rVar5 = this.y;
                        return new r1(rVar5.m, rVar5.n);
                    case 9:
                        r rVar6 = this.y;
                        return new com.app.mlounge.data.providers.k(rVar6.m, rVar6.n, rVar6.f);
                    case 10:
                        r rVar7 = this.y;
                        return new o1(rVar7.m, rVar7.n);
                    case 11:
                        r rVar8 = this.y;
                        return new com.app.mlounge.data.providers.n(rVar8.m, rVar8.n, rVar8.f);
                    case 12:
                        r rVar9 = this.y;
                        return new com.app.mlounge.data.providers.c(rVar9.m, rVar9.n);
                    case 13:
                        r rVar10 = this.y;
                        return new com.app.mlounge.data.providers.e0(rVar10.m, rVar10.n);
                    case 14:
                        return new u0(this.y.m);
                    case 15:
                        return new com.app.mlounge.data.providers.j0(this.y.m);
                    case 16:
                        r rVar11 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("4KHDHub", rVar11.e), new kotlin.k("Castle", (com.app.mlounge.data.providers.f) rVar11.w.getValue()), new kotlin.k("FshareTV", (com.app.mlounge.data.providers.y) rVar11.s.getValue()), new kotlin.k("HDHub", (com.app.mlounge.data.providers.b0) rVar11.p.getValue()), new kotlin.k("MovieBlast", (com.app.mlounge.data.providers.n0) rVar11.t.getValue()), new kotlin.k("Movies111", (u0) rVar11.D.getValue()), new kotlin.k("VidApi", (u1) rVar11.q.getValue()), new kotlin.k("VidNest", (z1) rVar11.v.getValue()), new kotlin.k("Vidrock", (c2) rVar11.u.getValue()), new kotlin.k("VixSrc", (f2) rVar11.r.getValue()), new kotlin.k("Holly", (com.app.mlounge.data.providers.j0) rVar11.E.getValue()));
                    case 17:
                        r rVar12 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("Torrentio", (r1) rVar12.x.getValue()), new kotlin.k("Comet", (com.app.mlounge.data.providers.k) rVar12.y.getValue()), new kotlin.k("TorrentClaw", (o1) rVar12.z.getValue()), new kotlin.k("EasyNews", (com.app.mlounge.data.providers.n) rVar12.A.getValue()));
                    default:
                        r rVar13 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("AniZone", (com.app.mlounge.data.providers.c) rVar13.B.getValue()), new kotlin.k("HiAnime", (com.app.mlounge.data.providers.e0) rVar13.C.getValue()));
                }
            }
        });
        final int i19 = 18;
        this.L = new kotlin.o(new kotlin.jvm.functions.a(this) { // from class: com.app.mlounge.data.repository.b
            public final /* synthetic */ r y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i19) {
                    case 0:
                        r rVar = this.y;
                        return new com.app.mlounge.data.providers.b0(rVar.m, rVar.n);
                    case 1:
                        return new u1(this.y.m);
                    case 2:
                        return new f2(this.y.m);
                    case 3:
                        r rVar2 = this.y;
                        return new com.app.mlounge.data.providers.y(rVar2.m, rVar2.n);
                    case 4:
                        r rVar3 = this.y;
                        return new com.app.mlounge.data.providers.n0(rVar3.m, rVar3.n);
                    case 5:
                        return new c2(this.y.m);
                    case 6:
                        return new z1(this.y.m);
                    case 7:
                        r rVar4 = this.y;
                        return new com.app.mlounge.data.providers.f(rVar4.m, rVar4.n);
                    case 8:
                        r rVar5 = this.y;
                        return new r1(rVar5.m, rVar5.n);
                    case 9:
                        r rVar6 = this.y;
                        return new com.app.mlounge.data.providers.k(rVar6.m, rVar6.n, rVar6.f);
                    case 10:
                        r rVar7 = this.y;
                        return new o1(rVar7.m, rVar7.n);
                    case 11:
                        r rVar8 = this.y;
                        return new com.app.mlounge.data.providers.n(rVar8.m, rVar8.n, rVar8.f);
                    case 12:
                        r rVar9 = this.y;
                        return new com.app.mlounge.data.providers.c(rVar9.m, rVar9.n);
                    case 13:
                        r rVar10 = this.y;
                        return new com.app.mlounge.data.providers.e0(rVar10.m, rVar10.n);
                    case 14:
                        return new u0(this.y.m);
                    case 15:
                        return new com.app.mlounge.data.providers.j0(this.y.m);
                    case 16:
                        r rVar11 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("4KHDHub", rVar11.e), new kotlin.k("Castle", (com.app.mlounge.data.providers.f) rVar11.w.getValue()), new kotlin.k("FshareTV", (com.app.mlounge.data.providers.y) rVar11.s.getValue()), new kotlin.k("HDHub", (com.app.mlounge.data.providers.b0) rVar11.p.getValue()), new kotlin.k("MovieBlast", (com.app.mlounge.data.providers.n0) rVar11.t.getValue()), new kotlin.k("Movies111", (u0) rVar11.D.getValue()), new kotlin.k("VidApi", (u1) rVar11.q.getValue()), new kotlin.k("VidNest", (z1) rVar11.v.getValue()), new kotlin.k("Vidrock", (c2) rVar11.u.getValue()), new kotlin.k("VixSrc", (f2) rVar11.r.getValue()), new kotlin.k("Holly", (com.app.mlounge.data.providers.j0) rVar11.E.getValue()));
                    case 17:
                        r rVar12 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("Torrentio", (r1) rVar12.x.getValue()), new kotlin.k("Comet", (com.app.mlounge.data.providers.k) rVar12.y.getValue()), new kotlin.k("TorrentClaw", (o1) rVar12.z.getValue()), new kotlin.k("EasyNews", (com.app.mlounge.data.providers.n) rVar12.A.getValue()));
                    default:
                        r rVar13 = this.y;
                        return kotlin.collections.a0.v(new kotlin.k("AniZone", (com.app.mlounge.data.providers.c) rVar13.B.getValue()), new kotlin.k("HiAnime", (com.app.mlounge.data.providers.e0) rVar13.C.getValue()));
                }
            }
        });
    }

    public static final List a(r rVar, String str, boolean z, boolean z2) {
        rVar.getClass();
        if (str.equals("anime")) {
            return kotlin.collections.o.k0(((Map) rVar.L.getValue()).values());
        }
        ArrayList arrayListL0 = kotlin.collections.o.l0(((Map) rVar.J.getValue()).values());
        arrayListL0.add((com.app.mlounge.data.providers.c) rVar.B.getValue());
        arrayListL0.add((com.app.mlounge.data.providers.e0) rVar.C.getValue());
        if (z) {
            Collection collectionValues = ((Map) rVar.K.getValue()).values();
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionValues) {
                if (!kotlin.jvm.internal.l.a(((com.app.mlounge.data.providers.k0) obj).getName(), "EasyNews")) {
                    arrayList.add(obj);
                }
            }
            arrayListL0.addAll(arrayList);
        }
        if (z2) {
            arrayListL0.add((com.app.mlounge.data.providers.n) rVar.A.getValue());
        }
        return arrayListL0;
    }

    public static Object d(r rVar, a aVar, String str, int i, kotlin.coroutines.jvm.internal.c cVar) {
        rVar.getClass();
        return BuildersKt.withContext(Dispatchers.getIO(), new p(i, aVar, rVar, str, (kotlin.coroutines.d) null), cVar);
    }

    public static Object e(r rVar, String str, int i, kotlin.coroutines.jvm.internal.c cVar) {
        rVar.getClass();
        return BuildersKt.withContext(Dispatchers.getIO(), new f(i, rVar, str, null), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0086  */
    /* JADX WARN: Code duplicated, block: B:36:0x0098 A[PHI: r1 r9
  0x0098: PHI (r1v6 java.util.List) = (r1v5 java.util.List), (r1v9 java.util.List) binds: [B:34:0x0095, B:17:0x003a] A[DONT_GENERATE, DONT_INLINE]
  0x0098: PHI (r9v16 java.lang.Object) = (r9v14 java.lang.Object), (r9v1 java.lang.Object) binds: [B:34:0x0095, B:17:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(kotlin.coroutines.jvm.internal.c cVar) {
        g gVar;
        List list;
        List list2;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i = gVar.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                gVar.A = i - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object objE = gVar.y;
        int i2 = gVar.A;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (i2 == 0) {
            kotlin.a.e(objE);
            ArrayList arrayList = new ArrayList();
            gVar.e = arrayList;
            gVar.A = 1;
            Object objE2 = this.j.e(gVar);
            if (objE2 != aVar) {
                list = arrayList;
                objE = objE2;
            }
            return aVar;
        }
        if (i2 == 1) {
            list = gVar.e;
            kotlin.a.e(objE);
        } else {
            if (i2 == 2) {
                list = gVar.e;
                kotlin.a.e(objE);
                if (((Boolean) objE).booleanValue()) {
                    list.add(com.app.mlounge.ui.viewmodel.l.ALL_DEBRID);
                }
                gVar.e = list;
                gVar.A = 3;
                objE = this.g.d(gVar);
                if (objE != aVar) {
                    if (((Boolean) objE).booleanValue()) {
                        list.add(com.app.mlounge.ui.viewmodel.l.PREMIUMIZE);
                    }
                    gVar.e = list;
                    gVar.A = 4;
                    objE = this.h.e(gVar);
                    if (objE != aVar) {
                        list2 = list;
                    }
                }
                return aVar;
            }
            if (i2 == 3) {
                list = gVar.e;
                kotlin.a.e(objE);
                if (((Boolean) objE).booleanValue()) {
                    list.add(com.app.mlounge.ui.viewmodel.l.PREMIUMIZE);
                }
                gVar.e = list;
                gVar.A = 4;
                objE = this.h.e(gVar);
                if (objE != aVar) {
                    list2 = list;
                }
                return aVar;
            }
            if (i2 != 4) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list2 = gVar.e;
            kotlin.a.e(objE);
        }
        if (((Boolean) objE).booleanValue()) {
            list2.add(com.app.mlounge.ui.viewmodel.l.TORBOX);
        }
        return list2;
        if (((Boolean) objE).booleanValue()) {
            list.add(com.app.mlounge.ui.viewmodel.l.REAL_DEBRID);
        }
        gVar.e = list;
        gVar.A = 2;
        objE = this.i.e(gVar);
        if (objE != aVar) {
            if (((Boolean) objE).booleanValue()) {
                list.add(com.app.mlounge.ui.viewmodel.l.ALL_DEBRID);
            }
            gVar.e = list;
            gVar.A = 3;
            objE = this.g.d(gVar);
            if (objE != aVar) {
                if (((Boolean) objE).booleanValue()) {
                    list.add(com.app.mlounge.ui.viewmodel.l.PREMIUMIZE);
                }
                gVar.e = list;
                gVar.A = 4;
                objE = this.h.e(gVar);
                if (objE != aVar) {
                    list2 = list;
                    if (((Boolean) objE).booleanValue()) {
                        list2.add(com.app.mlounge.ui.viewmodel.l.TORBOX);
                    }
                    return list2;
                }
            }
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    /* JADX WARN: Code duplicated, block: B:36:0x007f  */
    /* JADX WARN: Code duplicated, block: B:39:0x008a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(kotlin.coroutines.jvm.internal.c cVar) {
        n nVar;
        Object objE;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i = nVar.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                nVar.z = i - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object objD = nVar.e;
        int i2 = nVar.z;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (i2 == 0) {
            kotlin.a.e(objD);
            nVar.z = 1;
            objD = this.g.d(nVar);
            if (objD != aVar) {
            }
            return aVar;
        }
        if (i2 == 1) {
            kotlin.a.e(objD);
        } else {
            if (i2 == 2) {
                kotlin.a.e(objD);
                if (!((Boolean) objD).booleanValue()) {
                    nVar.z = 3;
                    objD = this.i.e(nVar);
                    if (objD != aVar) {
                    }
                    return aVar;
                }
                return Boolean.TRUE;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    kotlin.a.e(objD);
                    return objD;
                }
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(objD);
        }
        if (!((Boolean) objD).booleanValue()) {
            nVar.z = 4;
            objE = this.j.e(nVar);
            if (objE != aVar) {
                return aVar;
            }
            return objE;
        }
        return Boolean.TRUE;
        if (!((Boolean) objD).booleanValue()) {
            nVar.z = 2;
            objD = this.h.e(nVar);
            if (objD != aVar) {
                if (!((Boolean) objD).booleanValue()) {
                    nVar.z = 3;
                    objD = this.i.e(nVar);
                    if (objD != aVar) {
                        if (!((Boolean) objD).booleanValue()) {
                            nVar.z = 4;
                            objE = this.j.e(nVar);
                            if (objE != aVar) {
                                return objE;
                            }
                        }
                    }
                }
            }
            return aVar;
        }
        return Boolean.TRUE;
    }

    public final Object f(String str, String str2, int i, kotlin.coroutines.jvm.internal.c cVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new p(i, this, str, str2, (kotlin.coroutines.d) null), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01aa A[PHI: r11 r12 r13
  0x01aa: PHI (r11v8 java.lang.String) = (r11v25 java.lang.String), (r11v26 java.lang.String) binds: [B:98:0x01a7, B:15:0x0035] A[DONT_GENERATE, DONT_INLINE]
  0x01aa: PHI (r12v6 com.app.mlounge.data.remote.model.ChqStream) = (r12v21 com.app.mlounge.data.remote.model.ChqStream), (r12v22 com.app.mlounge.data.remote.model.ChqStream) binds: [B:98:0x01a7, B:15:0x0035] A[DONT_GENERATE, DONT_INLINE]
  0x01aa: PHI (r13v16 java.lang.Object) = (r13v11 java.lang.Object), (r13v1 java.lang.Object) binds: [B:98:0x01a7, B:15:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:102:0x01b2 A[Catch: Exception -> 0x01c6, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x01c6, blocks: (B:13:0x0031, B:102:0x01b2), top: B:111:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x01c5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:75:0x0131 A[Catch: Exception -> 0x0145, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0145, blocks: (B:25:0x0064, B:75:0x0131), top: B:111:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0144 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:79:0x0145 A[PHI: r11 r12
  0x0145: PHI (r11v1 java.lang.String) = (r11v0 com.app.mlounge.data.remote.model.ChqStream), (r11v16 ??) binds: [B:109:0x0145, B:74:0x012f] A[DONT_GENERATE, DONT_INLINE]
  0x0145: PHI (r12v1 com.app.mlounge.data.remote.model.ChqStream) = (r12v0 com.app.mlounge.ui.viewmodel.l), (r12v13 ??) binds: [B:109:0x0145, B:74:0x012f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:82:0x0154 A[PHI: r11 r12 r13
  0x0154: PHI (r11v3 ??) = (r11v29 ??), (r11v30 ??) binds: [B:80:0x0150, B:23:0x0057] A[DONT_GENERATE, DONT_INLINE]
  0x0154: PHI (r12v3 ??) = (r12v25 ??), (r12v26 ??) binds: [B:80:0x0150, B:23:0x0057] A[DONT_GENERATE, DONT_INLINE]
  0x0154: PHI (r13v6 java.lang.Object) = (r13v3 java.lang.Object), (r13v1 java.lang.Object) binds: [B:80:0x0150, B:23:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x015c A[Catch: Exception -> 0x0170, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0170, blocks: (B:21:0x0053, B:84:0x015c), top: B:111:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x016f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:88:0x0170 A[PHI: r11 r12
  0x0170: PHI (r11v2 java.lang.String) = (r11v0 com.app.mlounge.data.remote.model.ChqStream), (r11v3 ??) binds: [B:108:0x0170, B:83:0x015a] A[DONT_GENERATE, DONT_INLINE]
  0x0170: PHI (r12v2 com.app.mlounge.data.remote.model.ChqStream) = (r12v0 com.app.mlounge.ui.viewmodel.l), (r12v3 ??) binds: [B:108:0x0170, B:83:0x015a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x017f A[PHI: r11 r12 r13
  0x017f: PHI (r11v6 ??) = (r11v27 ??), (r11v28 ??) binds: [B:89:0x017c, B:19:0x0046] A[DONT_GENERATE, DONT_INLINE]
  0x017f: PHI (r12v5 ??) = (r12v23 ??), (r12v24 ??) binds: [B:89:0x017c, B:19:0x0046] A[DONT_GENERATE, DONT_INLINE]
  0x017f: PHI (r13v12 java.lang.Object) = (r13v5 java.lang.Object), (r13v1 java.lang.Object) binds: [B:89:0x017c, B:19:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x0187 A[Catch: Exception -> 0x019b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x019b, blocks: (B:17:0x0042, B:93:0x0187), top: B:111:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x019a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:97:0x019b A[PHI: r11 r12
  0x019b: PHI (r11v5 java.lang.String) = (r11v0 com.app.mlounge.data.remote.model.ChqStream), (r11v6 ??) binds: [B:107:0x019b, B:92:0x0185] A[DONT_GENERATE, DONT_INLINE]
  0x019b: PHI (r12v4 com.app.mlounge.data.remote.model.ChqStream) = (r12v0 com.app.mlounge.ui.viewmodel.l), (r12v5 ??) binds: [B:107:0x019b, B:92:0x0185] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a7, code lost:
    
        if (r13 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cb, code lost:
    
        if (r13 == r7) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e5, code lost:
    
        if (r13 == r7) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fa, code lost:
    
        if (r13 == r7) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x010f, code lost:
    
        if (r13 == r7) goto L104;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v13, types: [com.app.mlounge.data.remote.model.ChqStream] */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v3, types: [com.app.mlounge.data.remote.model.ChqStream] */
    /* JADX WARN: Type inference failed for: r12v5, types: [com.app.mlounge.data.remote.model.ChqStream] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(com.app.mlounge.data.remote.model.ChqStream r11, com.app.mlounge.ui.viewmodel.l r12, kotlin.coroutines.jvm.internal.c r13) {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.repository.r.g(com.app.mlounge.data.remote.model.ChqStream, com.app.mlounge.ui.viewmodel.l, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }
}
