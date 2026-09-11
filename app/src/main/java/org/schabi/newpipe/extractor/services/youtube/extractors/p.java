package org.schabi.newpipe.extractor.services.youtube.extractors;

import androidx.core.view.w0;
import com.google.common.util.concurrent.g0;
import j$.net.URLEncoder;
import j$.util.Base64;
import java.net.MalformedURLException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends org.schabi.newpipe.extractor.playlist.a {
    public com.grack.nanojson.c e;
    public com.grack.nanojson.c f;
    public com.grack.nanojson.c g;
    public com.grack.nanojson.c h;
    public com.grack.nanojson.c i;
    public boolean j;

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public final List J() throws org.schabi.newpipe.extractor.exceptions.f {
        com.grack.nanojson.b bVarA = this.j ? d0().e("playlistHeaderBanner").e("heroPlaylistThumbnailRenderer").e("thumbnail").a("thumbnails") : this.g.e("thumbnailRenderer").e("playlistVideoThumbnailRenderer").e("thumbnail").a("thumbnails");
        if (!org.schabi.newpipe.extractor.utils.f.i(bVarA)) {
            return org.schabi.newpipe.extractor.services.youtube.i.k(bVarA);
        }
        com.grack.nanojson.b bVarA2 = this.e.e("microformat").e("microformatDataRenderer").e("thumbnail").a("thumbnails");
        if (!org.schabi.newpipe.extractor.utils.f.i(bVarA2)) {
            return org.schabi.newpipe.extractor.services.youtube.i.k(bVarA2);
        }
        org.mozilla.javascript.typedarrays.c.b("Could not get playlist thumbnails");
        return null;
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public final List O() throws org.schabi.newpipe.extractor.exceptions.f {
        if (this.j) {
            return Collections.EMPTY_LIST;
        }
        try {
            return org.schabi.newpipe.extractor.services.youtube.i.k(f0().e("thumbnail").a("thumbnails"));
        } catch (Exception e) {
            org.mozilla.javascript.typedarrays.c.d("Could not get playlist uploader avatars", e);
            return null;
        }
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public final String P() throws org.schabi.newpipe.extractor.exceptions.f {
        try {
            return org.schabi.newpipe.extractor.services.youtube.i.n(this.j ? d0().e("ownerText") : f0().e("title"), false);
        } catch (Exception e) {
            org.mozilla.javascript.typedarrays.c.d("Could not get playlist uploader name", e);
            return null;
        }
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public final String R() throws org.schabi.newpipe.extractor.exceptions.f {
        try {
            return org.schabi.newpipe.extractor.services.youtube.i.q(this.j ? d0().e("ownerText").a("runs").b(0).e("navigationEndpoint") : f0().e("navigationEndpoint"));
        } catch (Exception e) {
            org.mozilla.javascript.typedarrays.c.d("Could not get playlist uploader url", e);
            return null;
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void X(com.app.mlounge.data.music.e eVar) throws org.schabi.newpipe.extractor.exceptions.f {
        String strQ;
        String str = this.b.z;
        org.schabi.newpipe.extractor.localization.c cVarC = this.a.c();
        g0 g0VarZ = org.schabi.newpipe.extractor.services.youtube.i.z(cVarC, k());
        g0VarZ.F("VL" + str, "browseId");
        g0VarZ.F("wgYCCAA%3D", "params");
        byte[] bytes = com.google.android.material.resources.c.p((com.grack.nanojson.c) g0VarZ.z).getBytes(StandardCharsets.UTF_8);
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{"$fields=sidebar,header,microformat,alerts"}[0];
        List listP = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.p(obj, arrayList, obj, arrayList);
        HashMap mapU = org.schabi.newpipe.extractor.services.youtube.i.u();
        if (listP.isEmpty()) {
            strQ = "?prettyPrint=false";
        } else {
            StringBuilder sb = new StringBuilder();
            Iterator it = listP.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    } else {
                        sb.append((CharSequence) "&");
                    }
                }
            }
            strQ = androidx.privacysandbox.ads.adservices.java.internal.a.q("?", sb.toString(), "&prettyPrint=false");
        }
        com.grack.nanojson.c cVarM = org.schabi.newpipe.extractor.utils.a.m(org.schabi.newpipe.extractor.services.youtube.i.s(com.google.android.material.textfield.p.a.x("https://www.youtube.com/youtubei/v1/browse".concat(strQ), mapU, bytes, cVarC)));
        this.e = cVarM;
        org.schabi.newpipe.extractor.services.youtube.i.a(cVarM);
        this.j = this.e.containsKey("header") && !this.e.containsKey("sidebar");
        org.schabi.newpipe.extractor.services.youtube.protos.playlist.c cVarC2 = org.schabi.newpipe.extractor.services.youtube.protos.playlist.d.c();
        org.schabi.newpipe.extractor.services.youtube.protos.playlist.a aVarE = org.schabi.newpipe.extractor.services.youtube.protos.playlist.b.e();
        aVarE.c();
        org.schabi.newpipe.extractor.services.youtube.protos.playlist.b.b((org.schabi.newpipe.extractor.services.youtube.protos.playlist.b) aVarE.y, "VL" + str);
        aVarE.c();
        org.schabi.newpipe.extractor.services.youtube.protos.playlist.b.d((org.schabi.newpipe.extractor.services.youtube.protos.playlist.b) aVarE.y, str);
        aVarE.c();
        org.schabi.newpipe.extractor.services.youtube.protos.playlist.b.c((org.schabi.newpipe.extractor.services.youtube.protos.playlist.b) aVarE.y);
        org.schabi.newpipe.extractor.services.youtube.protos.playlist.b bVar = (org.schabi.newpipe.extractor.services.youtube.protos.playlist.b) aVarE.a();
        cVarC2.c();
        org.schabi.newpipe.extractor.services.youtube.protos.playlist.d.b((org.schabi.newpipe.extractor.services.youtube.protos.playlist.d) cVarC2.y, bVar);
        org.schabi.newpipe.extractor.services.youtube.protos.playlist.d dVar = (org.schabi.newpipe.extractor.services.youtube.protos.playlist.d) cVarC2.a();
        g0 g0VarZ2 = org.schabi.newpipe.extractor.services.youtube.i.z(cVarC, k());
        String strEncodeToString = Base64.getUrlEncoder().encodeToString(dVar.toByteArray());
        Charset charset = StandardCharsets.UTF_8;
        g0VarZ2.F(URLEncoder.encode(strEncodeToString, charset), "continuation");
        this.f = org.schabi.newpipe.extractor.services.youtube.i.l("browse", com.google.android.material.resources.c.p((com.grack.nanojson.c) g0VarZ2.z).getBytes(charset), cVarC);
    }

    @Override // org.schabi.newpipe.extractor.playlist.a
    public final void Z() throws org.schabi.newpipe.extractor.exceptions.f {
        String str = this.b.y;
        String str2 = org.schabi.newpipe.extractor.services.youtube.i.a;
        try {
            org.schabi.newpipe.extractor.services.youtube.i.c(org.schabi.newpipe.extractor.utils.f.d(org.schabi.newpipe.extractor.utils.f.m(str), "list"));
        } catch (MalformedURLException e) {
            org.mozilla.javascript.typedarrays.c.d("Could not extract playlist type from malformed url", e);
        }
    }

    @Override // org.schabi.newpipe.extractor.playlist.a
    public final long b0() {
        String strN;
        String strN2;
        if (this.j) {
            String strN3 = org.schabi.newpipe.extractor.services.youtube.i.n(d0().e("numVideosText"), false);
            if (strN3 != null) {
                try {
                    return Long.parseLong(strN3.replaceAll("\\D+", ""));
                } catch (NumberFormatException unused) {
                }
            }
            String strN4 = org.schabi.newpipe.extractor.services.youtube.i.n(d0().a("byline").b(0).e("text"), false);
            if (strN4 != null) {
                try {
                    return Long.parseLong(strN4.replaceAll("\\D+", ""));
                } catch (NumberFormatException unused2) {
                }
            }
        }
        com.grack.nanojson.b bVarA = (this.j ? d0() : e0()).a("briefStats");
        if (!bVarA.isEmpty() && (strN2 = org.schabi.newpipe.extractor.services.youtube.i.n(bVarA.b(0), false)) != null) {
            return Long.parseLong(strN2.replaceAll("\\D+", ""));
        }
        com.grack.nanojson.b bVarA2 = (this.j ? d0() : e0()).a("stats");
        if (bVarA2.isEmpty() || (strN = org.schabi.newpipe.extractor.services.youtube.i.n(bVarA2.b(0), false)) == null) {
            return -1L;
        }
        return Long.parseLong(strN.replaceAll("\\D+", ""));
    }

    public final com.grack.nanojson.c d0() {
        if (this.i == null) {
            this.i = this.e.e("header").e("playlistHeaderRenderer");
        }
        return this.i;
    }

    public final com.grack.nanojson.c e0() {
        if (this.g == null) {
            this.g = (com.grack.nanojson.c) this.e.e("sidebar").e("playlistSidebarRenderer").a("items").c().filter(new com.grack.nanojson.a(22)).map(new org.schabi.newpipe.extractor.services.youtube.b(21)).findFirst().orElseThrow(new org.jsoup.internal.c(16));
        }
        return this.g;
    }

    public final com.grack.nanojson.c f0() {
        if (this.h == null) {
            this.h = (com.grack.nanojson.c) this.e.e("sidebar").e("playlistSidebarRenderer").a("items").c().filter(new com.grack.nanojson.a(21)).map(new org.schabi.newpipe.extractor.services.youtube.b(20)).findFirst().orElseThrow(new org.jsoup.internal.c(15));
        }
        return this.h;
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public final org.schabi.newpipe.extractor.stream.c h() {
        return new org.schabi.newpipe.extractor.stream.c(org.schabi.newpipe.extractor.services.youtube.i.n(e0().e("description"), true), 1);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final org.schabi.newpipe.extractor.e p() {
        String strF;
        w0 w0Var = this.a;
        final org.schabi.newpipe.extractor.channel.d dVar = new org.schabi.newpipe.extractor.channel.d(w0Var.y, 2);
        com.grack.nanojson.b bVarA = this.f.a("onResponseReceivedActions").b(0).e("reloadContinuationItemsCommand").a("continuationItems");
        if (bVarA.isEmpty()) {
            bVarA = this.f.a("onResponseReceivedActions").b(0).e("appendContinuationItemsAction").a("continuationItems");
        }
        com.grack.nanojson.b bVar = bVarA;
        final boolean zAnyMatch = d0().e("onDescriptionTap").e("commandExecutorCommand").a("commands").c().anyMatch(new com.grack.nanojson.a(20));
        final g0 g0VarK = K();
        bVar.c().forEach(new Consumer(this) { // from class: org.schabi.newpipe.extractor.services.youtube.extractors.m
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                com.grack.nanojson.c cVar = (com.grack.nanojson.c) obj;
                boolean zContainsKey = cVar.containsKey("playlistVideoRenderer");
                org.schabi.newpipe.extractor.channel.d dVar2 = dVar;
                g0 g0Var = g0VarK;
                boolean z = zAnyMatch;
                p pVar = this;
                if (zContainsKey) {
                    dVar2.A(new n(cVar.e("playlistVideoRenderer"), g0Var, z, pVar));
                    return;
                }
                if (!cVar.containsKey("richItemRenderer")) {
                    if (cVar.containsKey("lockupViewModel")) {
                        dVar2.A(new o(cVar.e("lockupViewModel"), g0Var, z, pVar));
                        return;
                    }
                    return;
                }
                com.grack.nanojson.c cVarE = cVar.e("richItemRenderer");
                if (cVarE.containsKey("content")) {
                    com.grack.nanojson.c cVarE2 = cVarE.e("content");
                    if (cVarE2.containsKey("reelItemRenderer")) {
                        dVar2.A(new r(cVarE2.e("reelItemRenderer")));
                    }
                }
            }
        });
        org.schabi.newpipe.extractor.k kVar = null;
        if (!org.schabi.newpipe.extractor.utils.f.i(bVar)) {
            com.grack.nanojson.c cVarB = bVar.b(bVar.size() - 1);
            if (cVarB.containsKey("continuationItemRenderer")) {
                com.grack.nanojson.c cVarE = cVarB.e("continuationItemRenderer").e("continuationEndpoint");
                if (cVarE.containsKey("commandExecutorCommand")) {
                    cVarE = (com.grack.nanojson.c) cVarE.e("commandExecutorCommand").a("commands").c().filter(new com.grack.nanojson.a(23)).findFirst().orElse(new com.grack.nanojson.c());
                }
                strF = cVarE.e("continuationCommand").f("token", null);
            } else if (cVarB.containsKey("continuationItemViewModel")) {
                strF = cVarB.e("continuationItemViewModel").e("continuationCommand").e("innertubeCommand").e("continuationCommand").f("token", null);
            }
            if (!org.schabi.newpipe.extractor.utils.f.h(strF)) {
                g0 g0VarZ = org.schabi.newpipe.extractor.services.youtube.i.z(w0Var.c(), k());
                g0VarZ.F(strF, "continuation");
                com.google.android.material.resources.c.p((com.grack.nanojson.c) g0VarZ.z).getBytes(StandardCharsets.UTF_8);
                kVar = new org.schabi.newpipe.extractor.k("https://www.youtube.com/youtubei/v1/browse?prettyPrint=false", String.valueOf(zAnyMatch), null);
            }
        }
        return new org.schabi.newpipe.extractor.e(dVar, kVar);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String v() {
        String strN = org.schabi.newpipe.extractor.services.youtube.i.n(e0().e("title"), false);
        return !org.schabi.newpipe.extractor.utils.f.h(strN) ? strN : this.e.e("microformat").e("microformatDataRenderer").f("title", null);
    }
}
