package org.schabi.newpipe.extractor.services.youtube.extractors;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements org.schabi.newpipe.extractor.playlist.d {
    public final com.grack.nanojson.c a;
    public final com.grack.nanojson.c b;
    public final com.grack.nanojson.c c;

    public t(com.grack.nanojson.c cVar) {
        this.a = cVar;
        this.b = cVar.e("shortBylineText");
        this.c = cVar.e("longBylineText");
    }

    @Override // org.schabi.newpipe.extractor.playlist.d
    public final String b() throws org.schabi.newpipe.extractor.exceptions.f {
        String strR = org.schabi.newpipe.extractor.services.youtube.i.r(this.c);
        if (strR != null) {
            return strR;
        }
        String strR2 = org.schabi.newpipe.extractor.services.youtube.i.r(this.b);
        if (strR2 != null) {
            return strR2;
        }
        org.mozilla.javascript.typedarrays.c.b("Could not get uploader URL");
        return null;
    }

    @Override // org.schabi.newpipe.extractor.playlist.d
    public final boolean c() {
        return false;
    }

    @Override // org.schabi.newpipe.extractor.playlist.d
    public final long d() throws org.schabi.newpipe.extractor.exceptions.f {
        String strN = org.schabi.newpipe.extractor.services.youtube.i.n(this.a.e("thumbnailOverlays").e("thumbnailOverlayBottomPanelRenderer").e("text"), false);
        if (strN == null) {
            org.mozilla.javascript.typedarrays.c.b("Could not get stream count");
            return 0L;
        }
        try {
            return Long.parseLong(strN.replaceAll("\\D+", ""));
        } catch (NumberFormatException e) {
            org.mozilla.javascript.typedarrays.c.d("Could not convert stream count to a long", e);
            return 0L;
        }
    }

    @Override // org.schabi.newpipe.extractor.playlist.d
    public final String e() throws org.schabi.newpipe.extractor.exceptions.f {
        String strN = org.schabi.newpipe.extractor.services.youtube.i.n(this.c, false);
        if (!org.schabi.newpipe.extractor.utils.f.h(strN)) {
            return strN;
        }
        String strN2 = org.schabi.newpipe.extractor.services.youtube.i.n(this.b, false);
        if (!org.schabi.newpipe.extractor.utils.f.h(strN2)) {
            return strN2;
        }
        org.mozilla.javascript.typedarrays.c.b("Could not get uploader name");
        return null;
    }

    @Override // org.schabi.newpipe.extractor.d
    public final String getName() {
        return this.a.f("title", null);
    }

    @Override // org.schabi.newpipe.extractor.d
    public final String getUrl() {
        return org.schabi.newpipe.extractor.services.youtube.i.q(this.a.e("navigationEndpoint"));
    }

    @Override // org.schabi.newpipe.extractor.d
    public final List o() {
        return org.schabi.newpipe.extractor.services.youtube.i.p(this.a.e("thumbnailRenderer").e("showCustomThumbnailRenderer"));
    }
}
