package org.schabi.newpipe.extractor.services.youtube.extractors;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements org.schabi.newpipe.extractor.playlist.d {
    public final com.grack.nanojson.c a;

    public q(com.grack.nanojson.c cVar) {
        this.a = cVar;
    }

    @Override // org.schabi.newpipe.extractor.playlist.d
    public final String b() throws org.schabi.newpipe.extractor.exceptions.f {
        try {
            return org.schabi.newpipe.extractor.services.youtube.i.r(this.a.e("longBylineText"));
        } catch (Exception e) {
            org.mozilla.javascript.typedarrays.c.d("Could not get uploader url", e);
            return null;
        }
    }

    @Override // org.schabi.newpipe.extractor.playlist.d
    public final boolean c() throws org.schabi.newpipe.extractor.exceptions.f {
        try {
            return org.schabi.newpipe.extractor.services.youtube.i.w(this.a.a("ownerBadges"));
        } catch (Exception e) {
            org.mozilla.javascript.typedarrays.c.d("Could not get uploader verification info", e);
            return false;
        }
    }

    @Override // org.schabi.newpipe.extractor.playlist.d
    public final long d() throws org.schabi.newpipe.extractor.exceptions.f {
        com.grack.nanojson.c cVar = this.a;
        String strF = cVar.f("videoCount", null);
        if (strF == null) {
            strF = org.schabi.newpipe.extractor.services.youtube.i.n(cVar.e("videoCountText"), false);
        }
        if (strF == null) {
            strF = org.schabi.newpipe.extractor.services.youtube.i.n(cVar.e("videoCountShortText"), false);
        }
        if (strF == null) {
            org.mozilla.javascript.typedarrays.c.b("Could not get stream count");
            return 0L;
        }
        try {
            Pattern pattern = org.schabi.newpipe.extractor.utils.f.a;
            return Long.parseLong(strF.replaceAll("\\D+", ""));
        } catch (Exception e) {
            org.mozilla.javascript.typedarrays.c.d("Could not get stream count", e);
            return 0L;
        }
    }

    @Override // org.schabi.newpipe.extractor.playlist.d
    public final String e() throws org.schabi.newpipe.extractor.exceptions.f {
        try {
            return org.schabi.newpipe.extractor.services.youtube.i.n(this.a.e("longBylineText"), false);
        } catch (Exception e) {
            org.mozilla.javascript.typedarrays.c.d("Could not get uploader name", e);
            return null;
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
            String strF = this.a.f("playlistId", null);
            new ArrayList(0);
            return "https://www.youtube.com/playlist?list=" + strF;
        } catch (Exception e) {
            org.mozilla.javascript.typedarrays.c.d("Could not get url", e);
            return null;
        }
    }

    @Override // org.schabi.newpipe.extractor.d
    public final List o() throws org.schabi.newpipe.extractor.exceptions.f {
        com.grack.nanojson.c cVar = this.a;
        try {
            com.grack.nanojson.b bVarA = cVar.a("thumbnails").b(0).a("thumbnails");
            if (bVarA.isEmpty()) {
                bVarA = cVar.e("thumbnail").a("thumbnails");
            }
            return org.schabi.newpipe.extractor.services.youtube.i.k(bVarA);
        } catch (Exception e) {
            org.mozilla.javascript.typedarrays.c.d("Could not get thumbnails", e);
            return null;
        }
    }
}
