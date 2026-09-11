package org.schabi.newpipe.extractor.services.youtube.extractors;

import androidx.core.view.w0;
import com.google.common.util.concurrent.g0;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends org.schabi.newpipe.extractor.playlist.a {
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public com.grack.nanojson.c i;

    public s(org.schabi.newpipe.extractor.services.youtube.j jVar, org.schabi.newpipe.extractor.linkhandler.e eVar) {
        super(jVar, eVar);
        List list = eVar.A;
        String str = org.schabi.newpipe.extractor.utils.f.i(list) ? null : (String) list.get(0);
        this.e = str;
        this.f = str == null || "all".equals(str) || "videos".equals(str);
        this.g = str == null || "all".equals(str) || "channels".equals(str);
        this.h = str == null || "all".equals(str) || "playlists".equals(str);
    }

    public static org.schabi.newpipe.extractor.k e0(com.grack.nanojson.c cVar) {
        if (org.schabi.newpipe.extractor.utils.f.j(cVar)) {
            return null;
        }
        return new org.schabi.newpipe.extractor.k("https://www.youtube.com/youtubei/v1/search?prettyPrint=false", cVar.e("continuationEndpoint").e("continuationCommand").f("token", null), null);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void X(com.app.mlounge.data.music.e eVar) {
        String str = Y().z;
        org.schabi.newpipe.extractor.localization.c cVarC = this.a.c();
        String str2 = this.e;
        String str3 = "8AEB";
        if (!org.schabi.newpipe.extractor.utils.f.h(str2)) {
            str2.getClass();
            switch (str2) {
                case "playlists":
                    str3 = "EgIQA_ABAQ%3D%3D";
                    break;
                case "music_playlists":
                case "music_artists":
                case "music_albums":
                case "music_songs":
                case "music_videos":
                    str3 = "";
                    break;
                case "videos":
                    str3 = "EgIQAfABAQ%3D%3D";
                    break;
                case "channels":
                    str3 = "EgIQAvABAQ%3D%3D";
                    break;
            }
        }
        g0 g0VarZ = org.schabi.newpipe.extractor.services.youtube.i.z(cVarC, k());
        g0VarZ.F(str, "query");
        if (!org.schabi.newpipe.extractor.utils.f.h(str3)) {
            g0VarZ.F(str3, "params");
        }
        this.i = org.schabi.newpipe.extractor.services.youtube.i.l("search", com.google.android.material.resources.c.p((com.grack.nanojson.c) g0VarZ.z).getBytes(StandardCharsets.UTF_8), cVarC);
    }

    @Override // org.schabi.newpipe.extractor.playlist.a
    public final String a0() {
        com.grack.nanojson.c cVarE = this.i.e("contents").e("twoColumnSearchResultsRenderer").e("primaryContents").e("sectionListRenderer").a("contents").b(0).e("itemSectionRenderer");
        com.grack.nanojson.c cVarE2 = cVarE.a("contents").b(0).e("didYouMeanRenderer");
        if (!cVarE2.isEmpty()) {
            return (String) org.schabi.newpipe.extractor.utils.a.e(cVarE2, "correctedQueryEndpoint.searchEndpoint.query", String.class);
        }
        String strN = org.schabi.newpipe.extractor.services.youtube.i.n(cVarE.a("contents").b(0).e("showingResultsForRenderer").e("correctedQuery"), false);
        return strN != null ? strN : "";
    }

    @Override // org.schabi.newpipe.extractor.playlist.a
    public final boolean c0() {
        return !this.i.e("contents").e("twoColumnSearchResultsRenderer").e("primaryContents").e("sectionListRenderer").a("contents").b(0).e("itemSectionRenderer").a("contents").b(0).e("showingResultsForRenderer").isEmpty();
    }

    public final void d0(org.schabi.newpipe.extractor.j jVar, com.grack.nanojson.b bVar) throws org.schabi.newpipe.extractor.search.a {
        g0 g0VarK = K();
        Iterator<E> it = bVar.iterator();
        while (it.hasNext()) {
            com.grack.nanojson.c cVar = (com.grack.nanojson.c) it.next();
            if (cVar.containsKey("backgroundPromoRenderer")) {
                throw new org.schabi.newpipe.extractor.search.a(org.schabi.newpipe.extractor.services.youtube.i.n(cVar.e("backgroundPromoRenderer").e("bodyText"), false));
            }
            boolean zContainsKey = cVar.containsKey("videoRenderer");
            boolean z = this.f;
            if (zContainsKey && z) {
                jVar.b(new a0(cVar.e("videoRenderer"), g0VarK));
            } else if (cVar.containsKey("channelRenderer") && this.g) {
                jVar.b(new d(cVar.e("channelRenderer")));
            } else {
                boolean zContainsKey2 = cVar.containsKey("playlistRenderer");
                boolean z2 = this.h;
                if (zContainsKey2 && z2) {
                    jVar.b(new q(cVar.e("playlistRenderer")));
                } else if (cVar.containsKey("showRenderer") && z2) {
                    jVar.b(new t(cVar.e("showRenderer")));
                } else if (cVar.containsKey("lockupViewModel")) {
                    com.grack.nanojson.c cVarE = cVar.e("lockupViewModel");
                    String strF = cVarE.f("contentType", null);
                    if (("LOCKUP_CONTENT_TYPE_PLAYLIST".equals(strF) || "LOCKUP_CONTENT_TYPE_PODCAST".equals(strF)) && z2) {
                        jVar.b(new f(cVarE));
                    } else if ("LOCKUP_CONTENT_TYPE_VIDEO".equals(strF) && z) {
                        jVar.b(new c0(cVarE, g0VarK));
                    }
                }
            }
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final org.schabi.newpipe.extractor.e p() throws org.schabi.newpipe.extractor.search.a {
        org.schabi.newpipe.extractor.j jVar = new org.schabi.newpipe.extractor.j(this.a.y);
        org.schabi.newpipe.extractor.k kVarE0 = null;
        for (com.grack.nanojson.c cVar : this.i.e("contents").e("twoColumnSearchResultsRenderer").e("primaryContents").e("sectionListRenderer").a("contents")) {
            if (cVar.containsKey("itemSectionRenderer")) {
                d0(jVar, cVar.e("itemSectionRenderer").a("contents"));
            } else if (cVar.containsKey("continuationItemRenderer")) {
                kVarE0 = e0(cVar.e("continuationItemRenderer"));
            }
        }
        return new org.schabi.newpipe.extractor.e(jVar, kVarE0);
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public final List u() {
        return kotlin.collections.a0.q(this.i.e("contents").e("twoColumnSearchResultsRenderer").e("primaryContents").e("sectionListRenderer").a("contents"));
    }

    @Override // org.schabi.newpipe.extractor.f
    public final org.schabi.newpipe.extractor.e x(org.schabi.newpipe.extractor.k kVar) throws org.schabi.newpipe.extractor.search.a {
        if (kVar == null || org.schabi.newpipe.extractor.utils.f.h(kVar.e)) {
            net.luminis.tls.engine.impl.c.o("Page doesn't contain an URL");
            return null;
        }
        w0 w0Var = this.a;
        org.schabi.newpipe.extractor.localization.c cVarC = w0Var.c();
        org.schabi.newpipe.extractor.j jVar = new org.schabi.newpipe.extractor.j(w0Var.y);
        g0 g0VarZ = org.schabi.newpipe.extractor.services.youtube.i.z(cVarC, k());
        g0VarZ.F(kVar.y, "continuation");
        com.grack.nanojson.b bVarA = org.schabi.newpipe.extractor.services.youtube.i.l("search", com.google.android.material.resources.c.p((com.grack.nanojson.c) g0VarZ.z).getBytes(StandardCharsets.UTF_8), cVarC).a("onResponseReceivedCommands").b(0).e("appendContinuationItemsAction").a("continuationItems");
        d0(jVar, bVarA.b(0).e("itemSectionRenderer").a("contents"));
        return new org.schabi.newpipe.extractor.e(jVar, e0(bVarA.b(1).e("continuationItemRenderer")));
    }
}
