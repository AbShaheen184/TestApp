package org.schabi.newpipe.extractor.services.youtube.extractors;

import com.google.common.util.concurrent.g0;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class a0 implements org.schabi.newpipe.extractor.stream.h {
    public static final Pattern e = Pattern.compile("([\\d,]+) views$");
    public final com.grack.nanojson.c a;
    public final g0 b;
    public int c;
    public Boolean d;

    public a0(com.grack.nanojson.c cVar, g0 g0Var) {
        this.a = cVar;
        this.b = g0Var;
    }

    public static long u(String str, boolean z) {
        if (str.toLowerCase().contains("no views")) {
            return 0L;
        }
        if (str.toLowerCase().contains("recommended")) {
            return -1L;
        }
        if (z) {
            return org.schabi.newpipe.extractor.utils.f.k(str);
        }
        Pattern pattern = org.schabi.newpipe.extractor.utils.f.a;
        return Long.parseLong(str.replaceAll("\\D+", ""));
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public String b() throws org.schabi.newpipe.extractor.exceptions.f {
        com.grack.nanojson.c cVar = this.a;
        String strQ = org.schabi.newpipe.extractor.services.youtube.i.q(cVar.e("longBylineText").a("runs").b(0).e("navigationEndpoint"));
        if (!org.schabi.newpipe.extractor.utils.f.h(strQ)) {
            return strQ;
        }
        String strQ2 = org.schabi.newpipe.extractor.services.youtube.i.q(cVar.e("ownerText").a("runs").b(0).e("navigationEndpoint"));
        if (!org.schabi.newpipe.extractor.utils.f.h(strQ2)) {
            return strQ2;
        }
        String strQ3 = org.schabi.newpipe.extractor.services.youtube.i.q(cVar.e("shortBylineText").a("runs").b(0).e("navigationEndpoint"));
        if (!org.schabi.newpipe.extractor.utils.f.h(strQ3)) {
            return strQ3;
        }
        org.mozilla.javascript.typedarrays.c.b("Could not get uploader url");
        return null;
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final boolean c() {
        return org.schabi.newpipe.extractor.services.youtube.i.w(this.a.a("ownerBadges"));
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public String e() throws org.schabi.newpipe.extractor.exceptions.f {
        com.grack.nanojson.c cVar = this.a;
        String strN = org.schabi.newpipe.extractor.services.youtube.i.n(cVar.e("longBylineText"), false);
        if (!org.schabi.newpipe.extractor.utils.f.h(strN)) {
            return strN;
        }
        String strN2 = org.schabi.newpipe.extractor.services.youtube.i.n(cVar.e("ownerText"), false);
        if (!org.schabi.newpipe.extractor.utils.f.h(strN2)) {
            return strN2;
        }
        String strN3 = org.schabi.newpipe.extractor.services.youtube.i.n(cVar.e("shortBylineText"), false);
        if (!org.schabi.newpipe.extractor.utils.f.h(strN3)) {
            return strN3;
        }
        org.mozilla.javascript.typedarrays.c.b("Could not get uploader name");
        return null;
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final long f() {
        if (w() || v()) {
            return -1L;
        }
        com.grack.nanojson.c cVar = this.a;
        String strN = org.schabi.newpipe.extractor.services.youtube.i.n(cVar.e("viewCountText"), false);
        if (!org.schabi.newpipe.extractor.utils.f.h(strN)) {
            try {
                return u(strN, false);
            } catch (Exception unused) {
            }
        }
        if (p() != 4) {
            try {
                return t();
            } catch (Exception unused2) {
            }
        }
        if (cVar.containsKey("videoInfo")) {
            try {
                return u(cVar.e("videoInfo").a("runs").b(0).f("text", ""), true);
            } catch (Exception unused3) {
            }
        }
        if (!cVar.containsKey("shortViewCountText")) {
            return -1L;
        }
        try {
            String strN2 = org.schabi.newpipe.extractor.services.youtube.i.n(cVar.e("shortViewCountText"), false);
            if (org.schabi.newpipe.extractor.utils.f.h(strN2)) {
                return -1L;
            }
            return u(strN2, true);
        } catch (Exception unused4) {
            return -1L;
        }
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final boolean g() {
        return w() || getName().equals("[Private video]") || getName().equals("[Deleted video]");
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final long getDuration() throws org.schabi.newpipe.extractor.exceptions.f {
        if (p() == 4) {
            return -1L;
        }
        com.grack.nanojson.c cVar = this.a;
        String strN = org.schabi.newpipe.extractor.services.youtube.i.n(cVar.e("lengthText"), false);
        if (org.schabi.newpipe.extractor.utils.f.h(strN)) {
            strN = cVar.f("lengthSeconds", null);
            if (org.schabi.newpipe.extractor.utils.f.h(strN)) {
                Iterator it = ((List) cVar.a("thumbnailOverlays").c().filter(new x(2)).map(new z(1)).filter(new x(3)).collect(Collectors.toList())).iterator();
                while (it.hasNext()) {
                    try {
                        return org.schabi.newpipe.extractor.services.youtube.i.y((String) it.next());
                    } catch (org.schabi.newpipe.extractor.exceptions.f unused) {
                    }
                }
            }
            if (org.schabi.newpipe.extractor.utils.f.h(strN)) {
                if (v()) {
                    return -1L;
                }
                org.mozilla.javascript.typedarrays.c.b("Could not get duration");
                return 0L;
            }
        }
        return org.schabi.newpipe.extractor.services.youtube.i.y(strN);
    }

    @Override // org.schabi.newpipe.extractor.d
    public final String getName() throws org.schabi.newpipe.extractor.exceptions.f {
        com.grack.nanojson.c cVarE = this.a.e("title");
        String strN = org.schabi.newpipe.extractor.services.youtube.i.n(cVarE, false);
        if (!org.schabi.newpipe.extractor.utils.f.h(strN)) {
            return strN;
        }
        if (!org.schabi.newpipe.extractor.utils.f.j(cVarE) && !cVarE.containsKey("runs")) {
            return "";
        }
        org.mozilla.javascript.typedarrays.c.b("Could not get name");
        return null;
    }

    @Override // org.schabi.newpipe.extractor.d
    public final String getUrl() throws org.schabi.newpipe.extractor.exceptions.f {
        try {
            return org.schabi.newpipe.extractor.services.youtube.linkHandler.c.c.m(this.a.f("videoId", null));
        } catch (Exception e2) {
            org.mozilla.javascript.typedarrays.c.d("Could not get url", e2);
            return null;
        }
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final void h() {
        com.grack.nanojson.c cVar = this.a;
        if (cVar.containsKey("channelThumbnailSupportedRenderers")) {
            org.schabi.newpipe.extractor.services.youtube.i.k((com.grack.nanojson.b) org.schabi.newpipe.extractor.utils.a.e(cVar, "channelThumbnailSupportedRenderers.channelThumbnailWithLinkRenderer.thumbnail.thumbnails", com.grack.nanojson.b.class));
        } else if (cVar.containsKey("channelThumbnail")) {
            org.schabi.newpipe.extractor.services.youtube.i.k((com.grack.nanojson.b) org.schabi.newpipe.extractor.utils.a.e(cVar, "channelThumbnail.thumbnails", com.grack.nanojson.b.class));
        } else {
            List list = Collections.EMPTY_LIST;
        }
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final void k() {
        if (v() || this.a.a("badges").c().map(new z(0)).anyMatch(new x(1))) {
            return;
        }
        w();
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final void l() throws org.schabi.newpipe.extractor.exceptions.f {
        com.grack.nanojson.c cVar = this.a;
        try {
            String strF = cVar.e("navigationEndpoint").e("commandMetadata").e("webCommandMetadata").f("webPageType", null);
            boolean zContainsKey = !org.schabi.newpipe.extractor.utils.f.h(strF) && strF.equals("WEB_PAGE_TYPE_SHORTS");
            if (!zContainsKey) {
                zContainsKey = cVar.e("navigationEndpoint").containsKey("reelWatchEndpoint");
            }
            if (zContainsKey || !cVar.containsKey("thumbnailOverlays")) {
                return;
            }
            cVar.a("thumbnailOverlays").c().filter(new x(4)).map(new z(2)).anyMatch(new x(5));
        } catch (Exception e2) {
            org.mozilla.javascript.typedarrays.c.d("Could not determine if this is short-form content", e2);
        }
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final String m() {
        if (p() != 4) {
            if (v()) {
                return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm").format(LocalDateTime.ofInstant(s(), ZoneId.systemDefault()));
            }
            com.grack.nanojson.c cVar = this.a;
            String strN = org.schabi.newpipe.extractor.services.youtube.i.n(cVar.e("publishedTimeText"), false);
            if (org.schabi.newpipe.extractor.utils.f.h(strN) && cVar.containsKey("videoInfo")) {
                strN = cVar.e("videoInfo").a("runs").b(2).f("text", null);
            }
            if (!org.schabi.newpipe.extractor.utils.f.h(strN)) {
                return strN;
            }
        }
        return null;
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final org.schabi.newpipe.extractor.localization.b n() throws org.schabi.newpipe.extractor.exceptions.f {
        g0 g0Var = this.b;
        if (p() == 4) {
            return null;
        }
        if (v()) {
            return new org.schabi.newpipe.extractor.localization.b(s(), false);
        }
        String strM = m();
        if (org.schabi.newpipe.extractor.utils.f.h(strM)) {
            return null;
        }
        try {
            return g0Var.x(strM);
        } catch (org.schabi.newpipe.extractor.exceptions.f e2) {
            org.mozilla.javascript.typedarrays.c.d("Could not get upload date", e2);
            return null;
        }
    }

    @Override // org.schabi.newpipe.extractor.d
    public final List o() {
        return org.schabi.newpipe.extractor.services.youtube.i.p(this.a);
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final int p() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        com.grack.nanojson.c cVar = this.a;
        for (Object obj : cVar.a("badges")) {
            if (obj instanceof com.grack.nanojson.c) {
                com.grack.nanojson.c cVarE = ((com.grack.nanojson.c) obj).e("metadataBadgeRenderer");
                if (cVarE.f("style", "").equals("BADGE_STYLE_TYPE_LIVE_NOW") || cVarE.f("label", "").equals("LIVE NOW")) {
                    this.c = 4;
                    return 4;
                }
            }
        }
        for (Object obj2 : cVar.a("thumbnailOverlays")) {
            if ((obj2 instanceof com.grack.nanojson.c) && ((com.grack.nanojson.c) obj2).e("thumbnailOverlayTimeStatusRenderer").f("style", "").equalsIgnoreCase("LIVE")) {
                this.c = 4;
                return 4;
            }
        }
        this.c = 2;
        return 2;
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final void r() {
        com.grack.nanojson.c cVar = this.a;
        if (cVar.containsKey("detailedMetadataSnippets")) {
            org.schabi.newpipe.extractor.services.youtube.i.n(cVar.a("detailedMetadataSnippets").b(0).e("snippetText"), false);
        } else if (cVar.containsKey("descriptionSnippet")) {
            org.schabi.newpipe.extractor.services.youtube.i.n(cVar.e("descriptionSnippet"), false);
        }
    }

    public final Instant s() throws org.schabi.newpipe.extractor.exceptions.f {
        String strF = this.a.e("upcomingEventData").f("startTime", null);
        try {
            return Instant.ofEpochSecond(Long.parseLong(strF));
        } catch (Exception e2) {
            org.mozilla.javascript.typedarrays.c.d(androidx.privacysandbox.ads.adservices.java.internal.a.q("Could not parse date from premiere: \"", strF, "\""), e2);
            return null;
        }
    }

    public final long t() throws org.schabi.newpipe.extractor.utils.d {
        String strF = this.a.e("title").e("accessibility").e("accessibilityData").f("label", "");
        if (strF.toLowerCase().endsWith("no views")) {
            return 0L;
        }
        String strJ = org.schabi.newpipe.extractor.utils.a.j(e, strF, 1);
        Pattern pattern = org.schabi.newpipe.extractor.utils.f.a;
        return Long.parseLong(strJ.replaceAll("\\D+", ""));
    }

    public final boolean v() {
        if (this.d == null) {
            this.d = Boolean.valueOf(this.a.containsKey("upcomingEventData"));
        }
        return this.d.booleanValue();
    }

    public final boolean w() {
        Iterator<E> it = this.a.a("badges").iterator();
        while (it.hasNext()) {
            if (((com.grack.nanojson.c) it.next()).e("metadataBadgeRenderer").f("label", "").equals("Premium")) {
                return true;
            }
        }
        return false;
    }
}
