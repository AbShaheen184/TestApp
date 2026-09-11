package org.schabi.newpipe.extractor.services.youtube.extractors;

import androidx.core.view.w0;
import com.app.mlounge.emulator.LibretroCore;
import com.appsalt.internal.x0;
import com.google.common.util.concurrent.g0;
import j$.util.stream.DesugarCollectors;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends org.schabi.newpipe.extractor.playlist.a {
    public static final List h;
    public com.grack.nanojson.c e;
    public com.grack.nanojson.c f;
    public String g;

    static {
        Object[] objArr = {new org.schabi.newpipe.extractor.utils.b(90, "default.jpg", 120, 3), new org.schabi.newpipe.extractor.utils.b(180, "mqdefault.jpg", 320, 2), new org.schabi.newpipe.extractor.utils.b(360, "hqdefault.jpg", LibretroCore.PSP_SCREEN_WIDTH, 2)};
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        h = Collections.unmodifiableList(arrayList);
    }

    public static List d0(String str) {
        return (List) h.stream().map(new org.schabi.newpipe.extractor.services.bandcamp.extractors.a(androidx.privacysandbox.ads.adservices.java.internal.a.q("https://i.ytimg.com/vi/", str, "/"), 5)).collect(DesugarCollectors.toUnmodifiableList());
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public final List J() throws org.schabi.newpipe.extractor.exceptions.f {
        try {
            return d0(org.schabi.newpipe.extractor.services.youtube.i.d(this.f.f("playlistId", null)));
        } catch (Exception e) {
            try {
                return d0(this.e.e("currentVideoEndpoint").e("watchEndpoint").f("videoId", null));
            } catch (Exception unused) {
                org.mozilla.javascript.typedarrays.c.d("Could not get playlist thumbnails", e);
                return null;
            }
        }
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public final List O() {
        return Collections.EMPTY_LIST;
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public final String P() {
        return "YouTube";
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public final String R() {
        return "";
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void X(com.app.mlounge.data.music.e eVar) throws org.schabi.newpipe.extractor.exceptions.f, MalformedURLException {
        org.schabi.newpipe.extractor.localization.c cVarC = this.a.c();
        org.schabi.newpipe.extractor.linkhandler.a aVar = this.b;
        URL urlM = org.schabi.newpipe.extractor.utils.f.m(aVar.y);
        String str = aVar.z;
        String strD = org.schabi.newpipe.extractor.utils.f.d(urlM, "v");
        String strD2 = org.schabi.newpipe.extractor.utils.f.d(urlM, "index");
        g0 g0VarZ = org.schabi.newpipe.extractor.services.youtube.i.z(cVarC, k());
        g0VarZ.F(str, "playlistId");
        if (strD != null) {
            g0VarZ.F(strD, "videoId");
        }
        if (strD2 != null) {
            g0VarZ.F(Integer.valueOf(Integer.parseInt(strD2)), "playlistIndex");
        }
        byte[] bytes = com.google.android.material.resources.c.p((com.grack.nanojson.c) g0VarZ.z).getBytes(StandardCharsets.UTF_8);
        androidx.fragment.app.h hVarX = this.d.x("https://www.youtube.com/youtubei/v1/next?prettyPrint=false", org.schabi.newpipe.extractor.services.youtube.i.u(), bytes, cVarC);
        com.grack.nanojson.c cVarM = org.schabi.newpipe.extractor.utils.a.m(org.schabi.newpipe.extractor.services.youtube.i.s(hVarX));
        this.e = cVarM;
        com.grack.nanojson.c cVarE = cVarM.e("contents").e("twoColumnWatchNextResults").e("playlist").e("playlist");
        this.f = cVarE;
        if (org.schabi.newpipe.extractor.utils.f.j(cVarE)) {
            throw new org.schabi.newpipe.extractor.exceptions.b("Consent is required in some countries to view Mix playlists", new org.schabi.newpipe.extractor.exceptions.d("Could not get playlistData"));
        }
        List<String> list = (List) ((Map) hVarX.A).get("set-cookie");
        String strSubstring = "";
        if (list != null) {
            for (String str2 : list) {
                int iIndexOf = str2.indexOf("VISITOR_INFO1_LIVE");
                if (iIndexOf != -1) {
                    strSubstring = str2.substring(iIndexOf + 19, str2.indexOf(";", iIndexOf));
                }
            }
        }
        this.g = strSubstring;
    }

    @Override // org.schabi.newpipe.extractor.playlist.a
    public final void Z() throws org.schabi.newpipe.extractor.exceptions.f {
        org.schabi.newpipe.extractor.services.youtube.i.c(this.f.f("playlistId", null));
    }

    @Override // org.schabi.newpipe.extractor.playlist.a
    public final long b0() {
        return -2L;
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public final org.schabi.newpipe.extractor.stream.c h() {
        return org.schabi.newpipe.extractor.stream.c.z;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final org.schabi.newpipe.extractor.e p() throws org.schabi.newpipe.extractor.exceptions.d {
        w0 w0Var = this.a;
        org.schabi.newpipe.extractor.channel.d dVar = new org.schabi.newpipe.extractor.channel.d(w0Var.y, 2);
        new com.grack.nanojson.b(this.f.a("contents")).c().map(new g(K(), 0)).forEachOrdered(new x0(dVar, 7));
        new HashMap().put("VISITOR_INFO1_LIVE", this.g);
        com.grack.nanojson.c cVar = this.f;
        com.grack.nanojson.c cVar2 = (com.grack.nanojson.c) cVar.a("contents").get(cVar.a("contents").size() - 1);
        if (cVar2 == null) {
            throw new org.schabi.newpipe.extractor.exceptions.d("Could not extract next page url");
        }
        cVar2.e("playlistPanelVideoRenderer");
        com.grack.nanojson.c cVarE = cVar2.e("playlistPanelVideoRenderer").e("navigationEndpoint").e("watchEndpoint");
        String strF = cVarE.f("playlistId", null);
        String strF2 = cVarE.f("videoId", null);
        int iC = cVarE.c("index", 0);
        String strF3 = cVarE.f("params", null);
        g0 g0VarZ = org.schabi.newpipe.extractor.services.youtube.i.z(w0Var.c(), k());
        g0VarZ.F(strF2, "videoId");
        g0VarZ.F(strF, "playlistId");
        g0VarZ.F(Integer.valueOf(iC), "playlistIndex");
        g0VarZ.F(strF3, "params");
        com.google.android.material.resources.c.p((com.grack.nanojson.c) g0VarZ.z).getBytes(StandardCharsets.UTF_8);
        return new org.schabi.newpipe.extractor.e(dVar, new org.schabi.newpipe.extractor.k("https://www.youtube.com/youtubei/v1/next?prettyPrint=false", null, null));
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String v() throws org.schabi.newpipe.extractor.exceptions.f {
        com.grack.nanojson.c cVar = this.f;
        String str = org.schabi.newpipe.extractor.services.youtube.i.a;
        String strF = cVar.get("title") instanceof String ? cVar.f("title", null) : org.schabi.newpipe.extractor.services.youtube.i.n(cVar.e("title"), false);
        if (!org.schabi.newpipe.extractor.utils.f.h(strF)) {
            return strF;
        }
        org.mozilla.javascript.typedarrays.c.b("Could not get playlist name");
        return null;
    }
}
