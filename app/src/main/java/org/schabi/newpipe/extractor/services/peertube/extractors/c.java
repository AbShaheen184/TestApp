package org.schabi.newpipe.extractor.services.peertube.extractors;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements org.schabi.newpipe.extractor.playlist.d {
    public final com.grack.nanojson.c a;
    public final com.grack.nanojson.c b;
    public final String c;

    public c(com.grack.nanojson.c cVar, String str) {
        this.a = cVar;
        this.b = cVar.e("uploader");
        this.c = str;
    }

    @Override // org.schabi.newpipe.extractor.playlist.d
    public final void a() {
        if (org.schabi.newpipe.extractor.utils.f.h(this.a.f("description", null))) {
            org.schabi.newpipe.extractor.stream.c cVar = org.schabi.newpipe.extractor.stream.c.z;
        }
    }

    @Override // org.schabi.newpipe.extractor.playlist.d
    public final String b() {
        return this.b.f("url", null);
    }

    @Override // org.schabi.newpipe.extractor.playlist.d
    public final boolean c() {
        return false;
    }

    @Override // org.schabi.newpipe.extractor.playlist.d
    public final long d() {
        return this.a.c("videosLength", 0);
    }

    @Override // org.schabi.newpipe.extractor.playlist.d
    public final String e() {
        return this.b.f("displayName", null);
    }

    @Override // org.schabi.newpipe.extractor.d
    public final String getName() {
        return this.a.f("displayName", null);
    }

    @Override // org.schabi.newpipe.extractor.d
    public final String getUrl() {
        return this.a.f("url", null);
    }

    @Override // org.schabi.newpipe.extractor.d
    public final List o() {
        return androidx.compose.ui.text.android.d.f(this.a, this.c);
    }
}
