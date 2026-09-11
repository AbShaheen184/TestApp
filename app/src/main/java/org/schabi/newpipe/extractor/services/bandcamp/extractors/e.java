package org.schabi.newpipe.extractor.services.bandcamp.extractors;

import java.util.List;
import org.jsoup.nodes.j;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements org.schabi.newpipe.extractor.playlist.d {
    public final j a;

    public e(j jVar) {
        this.a = jVar;
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
    public final long d() {
        return -1L;
    }

    @Override // org.schabi.newpipe.extractor.playlist.d
    public final String e() {
        return this.a.V("by-artist").d().replace("by ", "");
    }

    @Override // org.schabi.newpipe.extractor.d
    public final String getName() {
        return this.a.V("release-title").d();
    }

    @Override // org.schabi.newpipe.extractor.d
    public final String getUrl() {
        return this.a.V("album-link").b("abs:href");
    }

    @Override // org.schabi.newpipe.extractor.d
    public final List o() {
        return b.c(this.a.V("album-art").b("src"));
    }
}
