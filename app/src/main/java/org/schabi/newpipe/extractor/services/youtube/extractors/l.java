package org.schabi.newpipe.extractor.services.youtube.extractors;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements org.schabi.newpipe.extractor.stream.h {
    public final com.grack.nanojson.c a;
    public final com.grack.nanojson.b b;
    public final String c;

    public l(com.grack.nanojson.c cVar, com.grack.nanojson.b bVar, String str) {
        this.a = cVar;
        this.b = bVar;
        this.c = str;
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final String b() throws org.schabi.newpipe.extractor.exceptions.f {
        boolean zEquals = this.c.equals("music_videos");
        com.grack.nanojson.c cVar = this.a;
        if (zEquals) {
            Iterator<E> it = cVar.e("menu").e("menuRenderer").a("items").iterator();
            while (it.hasNext()) {
                com.grack.nanojson.c cVarE = ((com.grack.nanojson.c) it.next()).e("menuNavigationItemRenderer");
                if (cVarE.e("icon").f("iconType", "").equals("ARTIST")) {
                    return org.schabi.newpipe.extractor.services.youtube.i.q(cVarE.e("navigationEndpoint"));
                }
            }
            return null;
        }
        com.grack.nanojson.c cVarB = cVar.a("flexColumns").b(1).e("musicResponsiveListItemFlexColumnRenderer").e("text").a("runs").b(0);
        if (!cVarB.containsKey("navigationEndpoint")) {
            return null;
        }
        String strQ = org.schabi.newpipe.extractor.services.youtube.i.q(cVarB.e("navigationEndpoint"));
        if (!org.schabi.newpipe.extractor.utils.f.h(strQ)) {
            return strQ;
        }
        org.mozilla.javascript.typedarrays.c.b("Could not get uploader URL");
        return null;
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final boolean c() {
        return false;
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final String e() throws org.schabi.newpipe.extractor.exceptions.f {
        String strF = this.b.b(0).f("text", null);
        if (!org.schabi.newpipe.extractor.utils.f.h(strF)) {
            return strF;
        }
        org.mozilla.javascript.typedarrays.c.b("Could not get uploader name");
        return null;
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final long f() throws org.schabi.newpipe.extractor.exceptions.f {
        if (this.c.equals("music_songs")) {
            return -1L;
        }
        com.grack.nanojson.b bVar = this.b;
        String strF = bVar.b(bVar.size() - 3).f("text", null);
        if (org.schabi.newpipe.extractor.utils.f.h(strF)) {
            org.mozilla.javascript.typedarrays.c.b("Could not get view count");
            return 0L;
        }
        try {
            return org.schabi.newpipe.extractor.utils.f.k(strF);
        } catch (org.schabi.newpipe.extractor.utils.d unused) {
            return 0L;
        }
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final boolean g() {
        return false;
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final long getDuration() throws org.schabi.newpipe.extractor.exceptions.f {
        com.grack.nanojson.b bVar = this.b;
        String strF = bVar.b(bVar.size() - 1).f("text", null);
        if (!org.schabi.newpipe.extractor.utils.f.h(strF)) {
            return org.schabi.newpipe.extractor.services.youtube.i.y(strF);
        }
        org.mozilla.javascript.typedarrays.c.b("Could not get duration");
        return 0L;
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
        String strF = this.a.e("playlistItemData").f("videoId", null);
        if (!org.schabi.newpipe.extractor.utils.f.h(strF)) {
            return androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("https://music.youtube.com/watch?v=", strF);
        }
        org.mozilla.javascript.typedarrays.c.b("Could not get URL");
        return null;
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final String m() {
        return null;
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final org.schabi.newpipe.extractor.localization.b n() {
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

    @Override // org.schabi.newpipe.extractor.stream.h
    public final int p() {
        return 2;
    }
}
