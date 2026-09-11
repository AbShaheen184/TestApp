package org.schabi.newpipe.extractor.services.youtube.extractors;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements org.schabi.newpipe.extractor.channel.c {
    public final com.grack.nanojson.c a;

    public j(com.grack.nanojson.c cVar) {
        this.a = cVar;
    }

    @Override // org.schabi.newpipe.extractor.channel.c
    public final String a() {
        return null;
    }

    @Override // org.schabi.newpipe.extractor.channel.c
    public final long d() {
        return -1L;
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
        String strQ = org.schabi.newpipe.extractor.services.youtube.i.q(this.a.e("navigationEndpoint"));
        if (!org.schabi.newpipe.extractor.utils.f.h(strQ)) {
            return strQ;
        }
        org.mozilla.javascript.typedarrays.c.b("Could not get URL");
        return null;
    }

    @Override // org.schabi.newpipe.extractor.channel.c
    public final boolean i() {
        return true;
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

    @Override // org.schabi.newpipe.extractor.channel.c
    public final long q() throws org.schabi.newpipe.extractor.exceptions.f {
        com.grack.nanojson.b bVarA = this.a.a("flexColumns");
        com.grack.nanojson.b bVarA2 = bVarA.b(bVarA.size() - 1).e("musicResponsiveListItemFlexColumnRenderer").e("text").a("runs");
        String strF = bVarA2.b(bVarA2.size() - 1).f("text", null);
        if (org.schabi.newpipe.extractor.utils.f.h(strF)) {
            org.mozilla.javascript.typedarrays.c.b("Could not get subscriber count");
            return 0L;
        }
        try {
            return org.schabi.newpipe.extractor.utils.f.k(strF);
        } catch (org.schabi.newpipe.extractor.utils.d unused) {
            return 0L;
        }
    }
}
