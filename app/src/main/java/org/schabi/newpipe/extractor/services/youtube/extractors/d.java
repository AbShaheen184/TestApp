package org.schabi.newpipe.extractor.services.youtube.extractors;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements org.schabi.newpipe.extractor.channel.c {
    public final com.grack.nanojson.c a;
    public final boolean b;

    public d(com.grack.nanojson.c cVar) {
        this.a = cVar;
        String strN = org.schabi.newpipe.extractor.services.youtube.i.n(cVar.e("subscriberCountText"), false);
        this.b = strN != null ? strN.startsWith("@") : false;
    }

    @Override // org.schabi.newpipe.extractor.channel.c
    public final String a() throws org.schabi.newpipe.extractor.exceptions.f {
        com.grack.nanojson.c cVar = this.a;
        try {
            if (cVar.containsKey("descriptionSnippet")) {
                return org.schabi.newpipe.extractor.services.youtube.i.n(cVar.e("descriptionSnippet"), false);
            }
            return null;
        } catch (Exception e) {
            org.mozilla.javascript.typedarrays.c.d("Could not get description", e);
            return null;
        }
    }

    @Override // org.schabi.newpipe.extractor.channel.c
    public final long d() throws org.schabi.newpipe.extractor.exceptions.f {
        com.grack.nanojson.c cVar = this.a;
        try {
            if (!this.b && cVar.containsKey("videoCountText")) {
                return Long.parseLong(org.schabi.newpipe.extractor.services.youtube.i.n(cVar.e("videoCountText"), false).replaceAll("\\D+", ""));
            }
            return -1L;
        } catch (Exception e) {
            org.mozilla.javascript.typedarrays.c.d("Could not get stream count", e);
            return 0L;
        }
    }

    @Override // org.schabi.newpipe.extractor.d
    public final String getName() throws org.schabi.newpipe.extractor.exceptions.f {
        try {
            return org.schabi.newpipe.extractor.services.youtube.i.n(this.a.e("title"), false);
        } catch (Exception e) {
            org.mozilla.javascript.typedarrays.c.d("Could not get name", e);
            return null;
        }
    }

    @Override // org.schabi.newpipe.extractor.d
    public final String getUrl() throws org.schabi.newpipe.extractor.exceptions.f {
        try {
            return org.schabi.newpipe.extractor.services.youtube.linkHandler.a.b.m("channel/" + this.a.f("channelId", null));
        } catch (Exception e) {
            org.mozilla.javascript.typedarrays.c.d("Could not get url", e);
            return null;
        }
    }

    @Override // org.schabi.newpipe.extractor.channel.c
    public final boolean i() {
        return org.schabi.newpipe.extractor.services.youtube.i.w(this.a.a("ownerBadges"));
    }

    @Override // org.schabi.newpipe.extractor.d
    public final List o() throws org.schabi.newpipe.extractor.exceptions.f {
        try {
            return org.schabi.newpipe.extractor.services.youtube.i.p(this.a);
        } catch (Exception e) {
            org.mozilla.javascript.typedarrays.c.d("Could not get thumbnails", e);
            return null;
        }
    }

    @Override // org.schabi.newpipe.extractor.channel.c
    public final long q() throws org.schabi.newpipe.extractor.exceptions.f {
        com.grack.nanojson.c cVar = this.a;
        try {
            if (!cVar.containsKey("subscriberCountText")) {
                return -1L;
            }
            if (!this.b) {
                return org.schabi.newpipe.extractor.utils.f.k(org.schabi.newpipe.extractor.services.youtube.i.n(cVar.e("subscriberCountText"), false));
            }
            if (cVar.containsKey("videoCountText")) {
                return org.schabi.newpipe.extractor.utils.f.k(org.schabi.newpipe.extractor.services.youtube.i.n(cVar.e("videoCountText"), false));
            }
            return -1L;
        } catch (Exception e) {
            org.mozilla.javascript.typedarrays.c.d("Could not get subscriber count", e);
            return 0L;
        }
    }
}
