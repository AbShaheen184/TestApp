package org.schabi.newpipe.extractor.services.peertube.extractors;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements org.schabi.newpipe.extractor.channel.c {
    public final com.grack.nanojson.c a;
    public final String b;

    public a(com.grack.nanojson.c cVar, String str) {
        this.a = cVar;
        this.b = str;
    }

    @Override // org.schabi.newpipe.extractor.channel.c
    public final String a() {
        return this.a.f("description", null);
    }

    @Override // org.schabi.newpipe.extractor.channel.c
    public final long d() {
        return -1L;
    }

    @Override // org.schabi.newpipe.extractor.d
    public final String getName() {
        return this.a.f("displayName", null);
    }

    @Override // org.schabi.newpipe.extractor.d
    public final String getUrl() {
        return this.a.f("url", null);
    }

    @Override // org.schabi.newpipe.extractor.channel.c
    public final boolean i() {
        return false;
    }

    @Override // org.schabi.newpipe.extractor.d
    public final List o() {
        return androidx.compose.ui.text.android.d.c(this.a, this.b, "avatars", "avatar");
    }

    @Override // org.schabi.newpipe.extractor.channel.c
    public final long q() {
        return this.a.c("followersCount", 0);
    }
}
