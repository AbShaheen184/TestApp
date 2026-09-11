package org.schabi.newpipe.extractor.services.youtube.extractors;

import java.net.MalformedURLException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements org.schabi.newpipe.extractor.playlist.d {
    public final com.grack.nanojson.c a;

    public e(com.grack.nanojson.c cVar) {
        this.a = cVar;
    }

    @Override // org.schabi.newpipe.extractor.playlist.d
    public final String b() {
        return null;
    }

    @Override // org.schabi.newpipe.extractor.playlist.d
    public final boolean c() {
        return false;
    }

    @Override // org.schabi.newpipe.extractor.playlist.d
    public final long d() throws org.schabi.newpipe.extractor.exceptions.f {
        String strN = org.schabi.newpipe.extractor.services.youtube.i.n(this.a.e("videoCountShortText"), false);
        if (strN != null) {
            try {
                return Integer.parseInt(strN);
            } catch (NumberFormatException unused) {
                return -2L;
            }
        }
        org.mozilla.javascript.typedarrays.c.b("Could not extract item count for playlist/mix info item");
        return 0L;
    }

    @Override // org.schabi.newpipe.extractor.playlist.d
    public final String e() {
        return org.schabi.newpipe.extractor.services.youtube.i.n(this.a.e("longBylineText"), false);
    }

    @Override // org.schabi.newpipe.extractor.d
    public final String getName() throws org.schabi.newpipe.extractor.exceptions.f {
        String strN = org.schabi.newpipe.extractor.services.youtube.i.n(this.a.e("title"), false);
        if (!org.schabi.newpipe.extractor.utils.f.h(strN)) {
            return strN;
        }
        org.mozilla.javascript.typedarrays.c.b("Could not get name");
        return null;
    }

    @Override // org.schabi.newpipe.extractor.d
    public final String getUrl() throws org.schabi.newpipe.extractor.exceptions.f {
        String strF = this.a.f("shareUrl", null);
        if (!org.schabi.newpipe.extractor.utils.f.h(strF)) {
            return strF;
        }
        org.mozilla.javascript.typedarrays.c.b("Could not get url");
        return null;
    }

    @Override // org.schabi.newpipe.extractor.playlist.d
    public final void j() throws org.schabi.newpipe.extractor.exceptions.f {
        String url = getUrl();
        String str = org.schabi.newpipe.extractor.services.youtube.i.a;
        try {
            org.schabi.newpipe.extractor.services.youtube.i.c(org.schabi.newpipe.extractor.utils.f.d(org.schabi.newpipe.extractor.utils.f.m(url), "list"));
        } catch (MalformedURLException e) {
            org.mozilla.javascript.typedarrays.c.d("Could not extract playlist type from malformed url", e);
        }
    }

    @Override // org.schabi.newpipe.extractor.d
    public final List o() {
        return org.schabi.newpipe.extractor.services.youtube.i.p(this.a);
    }
}
