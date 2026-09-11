package org.schabi.newpipe.extractor.services.youtube.extractors;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements org.schabi.newpipe.extractor.playlist.d {
    public final com.grack.nanojson.c a;
    public final com.grack.nanojson.c b;

    public i(com.grack.nanojson.c cVar, com.grack.nanojson.b bVar, String str) {
        this.a = cVar;
        this.b = bVar.b("music_albums".equals(str) ? 2 : 0);
    }

    @Override // org.schabi.newpipe.extractor.playlist.d
    public final String b() {
        Iterator<E> it = this.a.e("menu").e("menuRenderer").a("items").iterator();
        while (it.hasNext()) {
            com.grack.nanojson.c cVarE = ((com.grack.nanojson.c) it.next()).e("menuNavigationItemRenderer");
            if (cVarE.e("icon").f("iconType", "").equals("ARTIST")) {
                return org.schabi.newpipe.extractor.services.youtube.i.q(cVarE.e("navigationEndpoint"));
            }
        }
        com.grack.nanojson.c cVar = this.b;
        if (cVar.containsKey("navigationEndpoint")) {
            return org.schabi.newpipe.extractor.services.youtube.i.q(cVar.e("navigationEndpoint"));
        }
        return null;
    }

    @Override // org.schabi.newpipe.extractor.playlist.d
    public final boolean c() {
        return false;
    }

    @Override // org.schabi.newpipe.extractor.playlist.d
    public final long d() {
        return -1L;
    }

    @Override // org.schabi.newpipe.extractor.playlist.d
    public final String e() throws org.schabi.newpipe.extractor.exceptions.f {
        String strF = this.b.f("text", null);
        if (!org.schabi.newpipe.extractor.utils.f.h(strF)) {
            return strF;
        }
        org.mozilla.javascript.typedarrays.c.b("Could not get uploader name");
        return null;
    }

    @Override // org.schabi.newpipe.extractor.d
    public final String getName() throws org.schabi.newpipe.extractor.exceptions.f {
        String strN = org.schabi.newpipe.extractor.services.youtube.i.n(this.a.a("flexColumns").b(0).e("musicResponsiveListItemFlexColumnRenderer").e("text"), false);
        if (!org.schabi.newpipe.extractor.utils.f.h(strN)) {
            return strN;
        }
        org.mozilla.javascript.typedarrays.c.b("Could not get name");
        return null;
    }

    @Override // org.schabi.newpipe.extractor.d
    public final String getUrl() throws org.schabi.newpipe.extractor.exceptions.f {
        com.grack.nanojson.c cVar = this.a;
        String strF = cVar.e("menu").e("menuRenderer").a("items").b(4).e("toggleMenuServiceItemRenderer").e("toggledServiceEndpoint").e("likeEndpoint").e("target").f("playlistId", null);
        if (org.schabi.newpipe.extractor.utils.f.h(strF)) {
            strF = cVar.e("overlay").e("musicItemThumbnailOverlayRenderer").e("content").e("musicPlayButtonRenderer").e("playNavigationEndpoint").e("watchPlaylistEndpoint").f("playlistId", null);
        }
        if (!org.schabi.newpipe.extractor.utils.f.h(strF)) {
            return androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("https://music.youtube.com/playlist?list=", strF);
        }
        org.mozilla.javascript.typedarrays.c.b("Could not get URL");
        return null;
    }

    @Override // org.schabi.newpipe.extractor.d
    public final List o() throws org.schabi.newpipe.extractor.exceptions.f {
        try {
            return org.schabi.newpipe.extractor.services.youtube.i.k(this.a.e("thumbnail").e("musicThumbnailRenderer").e("thumbnail").a("thumbnails"));
        } catch (Exception e) {
            org.mozilla.javascript.typedarrays.c.d("Could not get thumbnails", e);
            return null;
        }
    }
}
