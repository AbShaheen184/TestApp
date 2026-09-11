package org.schabi.newpipe.extractor.services.youtube.extractors;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements org.schabi.newpipe.extractor.stream.h {
    public final com.grack.nanojson.c a;

    public r(com.grack.nanojson.c cVar) {
        this.a = cVar;
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final String b() {
        return null;
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final boolean c() {
        return false;
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final String e() {
        return null;
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final long f() throws org.schabi.newpipe.extractor.exceptions.f {
        String strN = org.schabi.newpipe.extractor.services.youtube.i.n(this.a.e("viewCountText"), false);
        if (org.schabi.newpipe.extractor.utils.f.h(strN)) {
            org.mozilla.javascript.typedarrays.c.b("Could not get short view count");
            return 0L;
        }
        if (strN.toLowerCase().contains("no views")) {
            return 0L;
        }
        return org.schabi.newpipe.extractor.utils.f.k(strN);
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final boolean g() {
        return false;
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final long getDuration() {
        return -1L;
    }

    @Override // org.schabi.newpipe.extractor.d
    public final String getName() {
        return org.schabi.newpipe.extractor.services.youtube.i.n(this.a.e("headline"), false);
    }

    @Override // org.schabi.newpipe.extractor.d
    public final String getUrl() throws org.schabi.newpipe.extractor.exceptions.f {
        try {
            return org.schabi.newpipe.extractor.services.youtube.linkHandler.c.c.m(this.a.f("videoId", null));
        } catch (Exception e) {
            org.mozilla.javascript.typedarrays.c.d("Could not get URL", e);
            return null;
        }
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
    public final List o() {
        return org.schabi.newpipe.extractor.services.youtube.i.p(this.a);
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final int p() {
        return 2;
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final void l() {
    }
}
