package org.schabi.newpipe.extractor.services.youtube.extractors;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements org.schabi.newpipe.extractor.playlist.d {
    public final com.grack.nanojson.c a;
    public final com.grack.nanojson.c b;
    public final com.grack.nanojson.c c;
    public final com.grack.nanojson.c d;
    public final int e;

    public f(com.grack.nanojson.c cVar) {
        this.a = cVar;
        this.b = cVar.e("contentImage").e("collectionThumbnailViewModel").e("primaryThumbnail").e("thumbnailViewModel");
        com.grack.nanojson.c cVarE = cVar.e("metadata").e("lockupMetadataViewModel");
        this.c = cVarE;
        this.d = cVarE.e("metadata").e("contentMetadataViewModel").a("metadataRows").b(0);
        try {
            this.e = org.schabi.newpipe.extractor.services.youtube.i.c(s());
        } catch (org.schabi.newpipe.extractor.exceptions.f unused) {
            this.e = 1;
        }
    }

    @Override // org.schabi.newpipe.extractor.playlist.d
    public final String b() {
        if (this.e != 1) {
            return null;
        }
        return org.schabi.newpipe.extractor.services.youtube.i.q(this.d.a("metadataParts").b(0).e("text").a("commandRuns").b(0).e("onTap").e("innertubeCommand"));
    }

    @Override // org.schabi.newpipe.extractor.playlist.d
    public final boolean c() {
        if (this.e != 1) {
            return false;
        }
        com.grack.nanojson.b bVarA = this.d.a("metadataParts").b(0).e("text").a("attachmentRuns");
        String str = org.schabi.newpipe.extractor.services.youtube.i.a;
        return bVarA.c().anyMatch(new com.grack.nanojson.a(11));
    }

    @Override // org.schabi.newpipe.extractor.playlist.d
    public final long d() throws org.schabi.newpipe.extractor.exceptions.f {
        if (this.e != 1) {
            return -2L;
        }
        try {
            String strF = ((com.grack.nanojson.c) ((com.grack.nanojson.c) this.b.a("overlays").c().filter(new com.grack.nanojson.a(15)).findFirst().orElseThrow(new org.jsoup.internal.c(13))).e("thumbnailOverlayBadgeViewModel").a("thumbnailBadges").c().filter(new com.grack.nanojson.a(16)).findFirst().orElseThrow(new org.jsoup.internal.c(14))).e("thumbnailBadgeViewModel").f("text", null);
            Pattern pattern = org.schabi.newpipe.extractor.utils.f.a;
            return Long.parseLong(strF.replaceAll("\\D+", ""));
        } catch (Exception e) {
            org.mozilla.javascript.typedarrays.c.d("Could not get playlist stream count", e);
            return 0L;
        }
    }

    @Override // org.schabi.newpipe.extractor.playlist.d
    public final String e() {
        return this.d.a("metadataParts").b(0).e("text").f("content", null);
    }

    @Override // org.schabi.newpipe.extractor.d
    public final String getName() {
        return this.c.e("title").f("content", null);
    }

    @Override // org.schabi.newpipe.extractor.d
    public final String getUrl() {
        if (this.e == 1) {
            try {
                String strS = s();
                new ArrayList(0);
                return "https://www.youtube.com/playlist?list=" + strS;
            } catch (Exception unused) {
            }
        }
        return org.schabi.newpipe.extractor.services.youtube.i.q(this.a.e("rendererContext").e("commandContext").e("onTap").e("innertubeCommand"));
    }

    @Override // org.schabi.newpipe.extractor.d
    public final List o() {
        return org.schabi.newpipe.extractor.services.youtube.i.k(this.b.e("image").a("sources"));
    }

    public final String s() throws org.schabi.newpipe.extractor.exceptions.f {
        com.grack.nanojson.c cVar = this.a;
        String strF = cVar.f("contentId", null);
        if (org.schabi.newpipe.extractor.utils.f.h(strF)) {
            strF = cVar.e("rendererContext").e("commandContext").e("watchEndpoint").f("playlistId", null);
        }
        if (!org.schabi.newpipe.extractor.utils.f.h(strF)) {
            return strF;
        }
        org.mozilla.javascript.typedarrays.c.b("Could not get playlist ID");
        return null;
    }

    @Override // org.schabi.newpipe.extractor.playlist.d
    public final void j() {
    }
}
