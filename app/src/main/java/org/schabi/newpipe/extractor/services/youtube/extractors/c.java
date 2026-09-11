package org.schabi.newpipe.extractor.services.youtube.extractors;

import com.google.common.util.concurrent.g0;
import j$.util.stream.DesugarCollectors;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends org.schabi.newpipe.extractor.f {
    public com.grack.nanojson.c e;
    public org.schabi.newpipe.extractor.services.youtube.c f;
    public String g;
    public com.grack.nanojson.c h;

    @Override // org.schabi.newpipe.extractor.f
    public final List H() {
        a();
        return this.h != null ? Collections.EMPTY_LIST : (List) this.e.e("microformat").e("microformatDataRenderer").a("tags").stream().filter(new com.grack.nanojson.a(14)).map(new org.schabi.newpipe.extractor.services.youtube.b(16)).collect(DesugarCollectors.toUnmodifiableList());
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String S() {
        try {
            return org.schabi.newpipe.extractor.services.youtube.linkHandler.a.b.m("channel/" + o());
        } catch (org.schabi.newpipe.extractor.exceptions.f unused) {
            return this.b.y;
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void X(com.app.mlounge.data.music.e eVar) throws org.schabi.newpipe.extractor.exceptions.d {
        String[] strArr;
        String str;
        String[] strArr2;
        com.grack.nanojson.c cVar;
        org.schabi.newpipe.extractor.services.youtube.c cVar2;
        org.schabi.newpipe.extractor.services.youtube.c cVar3;
        c cVar4 = this;
        String str2 = cVar4.b.z;
        String[] strArrSplit = str2.split("/");
        int i = 0;
        if (strArrSplit[0].startsWith("UC")) {
            str = strArrSplit[0];
        } else {
            if (strArrSplit[0].equals("channel")) {
                strArr = strArrSplit;
            } else {
                String strConcat = "https://www.youtube.com/".concat(str2);
                com.grack.nanojson.c cVar5 = new com.grack.nanojson.c();
                int i2 = 0;
                String str3 = "";
                while (true) {
                    strArr2 = strArrSplit;
                    if (strConcat == null || i2 >= 3) {
                        break;
                    }
                    org.schabi.newpipe.extractor.localization.a aVar = org.schabi.newpipe.extractor.localization.a.y;
                    org.schabi.newpipe.extractor.localization.c cVar6 = org.schabi.newpipe.extractor.localization.c.z;
                    g0 g0VarZ = org.schabi.newpipe.extractor.services.youtube.i.z(cVar6, aVar);
                    g0VarZ.F(strConcat, "url");
                    com.grack.nanojson.c cVarL = org.schabi.newpipe.extractor.services.youtube.i.l("navigation/resolve_url", com.google.android.material.resources.c.p((com.grack.nanojson.c) g0VarZ.z).getBytes(StandardCharsets.UTF_8), cVar6);
                    com.google.common.base.c.d(cVarL);
                    com.grack.nanojson.c cVarE = cVarL.e("endpoint");
                    String strF = cVarE.e("commandMetadata").e("webCommandMetadata").f("webPageType", null);
                    strConcat = "WEB_PAGE_TYPE_UNKNOWN".equals(strF) ? cVarE.e("urlEndpoint").f("url", null) : null;
                    i2++;
                    cVar5 = cVarE;
                    str3 = strF;
                    strArrSplit = strArr2;
                }
                String strF2 = cVar5.e("browseEndpoint").f("browseId", "");
                if ((!"WEB_PAGE_TYPE_BROWSE".equalsIgnoreCase(str3) && !"WEB_PAGE_TYPE_CHANNEL".equalsIgnoreCase(str3)) || strF2.isEmpty()) {
                    strArr = strArr2;
                    if (strArr.length < 2) {
                        throw new org.schabi.newpipe.extractor.exceptions.d("Failed to resolve channelId for ".concat(str2));
                    }
                } else {
                    if (!strF2.startsWith("UC")) {
                        throw new org.schabi.newpipe.extractor.exceptions.d("Redirected id is not pointing to a channel");
                    }
                    str = strF2;
                }
                cVar4 = this;
            }
            str = strArr[1];
            cVar4 = this;
        }
        org.schabi.newpipe.extractor.localization.c cVarC = cVar4.a.c();
        org.schabi.newpipe.extractor.localization.a aVarK = cVar4.k();
        int i3 = 0;
        while (true) {
            if (i3 >= 3) {
                cVar = null;
                break;
            }
            g0 g0VarZ2 = org.schabi.newpipe.extractor.services.youtube.i.z(cVarC, aVarK);
            g0VarZ2.F(str, "browseId");
            org.schabi.newpipe.extractor.localization.a aVar2 = aVarK;
            int i4 = i3;
            g0VarZ2.F("EgZ2aWRlb3PyBgQKAjoA", "params");
            com.grack.nanojson.c cVarL2 = org.schabi.newpipe.extractor.services.youtube.i.l("browse", com.google.android.material.resources.c.p((com.grack.nanojson.c) g0VarZ2.z).getBytes(StandardCharsets.UTF_8), cVarC);
            com.google.common.base.c.d(cVarL2);
            com.grack.nanojson.c cVarE2 = cVarL2.a("onResponseReceivedActions").b(i).e("navigateAction").e("endpoint");
            String strF3 = cVarE2.e("commandMetadata").e("webCommandMetadata").f("webPageType", null);
            String strF4 = cVarE2.e("browseEndpoint").f("browseId", "");
            if ((!"WEB_PAGE_TYPE_BROWSE".equalsIgnoreCase(strF3) && !"WEB_PAGE_TYPE_CHANNEL".equalsIgnoreCase(strF3)) || strF4.isEmpty()) {
                cVar = cVarL2;
                break;
            } else {
                if (!strF4.startsWith("UC")) {
                    throw new org.schabi.newpipe.extractor.exceptions.d("Redirected id is not pointing to a channel");
                }
                i3 = i4 + 1;
                str = strF4;
                aVarK = aVar2;
                i = 0;
            }
        }
        if (cVar == null) {
            throw new org.schabi.newpipe.extractor.exceptions.d("Got no channel response after 3 redirects");
        }
        org.schabi.newpipe.extractor.services.youtube.i.a(cVar);
        this.e = cVar;
        com.grack.nanojson.c cVarE3 = cVar.e("header");
        if (cVarE3.containsKey("c4TabbedHeaderRenderer")) {
            cVar3 = (org.schabi.newpipe.extractor.services.youtube.c) Optional.of(cVarE3.e("c4TabbedHeaderRenderer")).map(new org.schabi.newpipe.extractor.services.youtube.b(0)).orElse(null);
        } else {
            if (!cVarE3.containsKey("carouselHeaderRenderer")) {
                if (cVarE3.containsKey("pageHeaderRenderer")) {
                    cVar3 = (org.schabi.newpipe.extractor.services.youtube.c) Optional.of(cVarE3.e("pageHeaderRenderer")).map(new org.schabi.newpipe.extractor.services.youtube.b(3)).orElse(null);
                } else {
                    cVar2 = cVarE3.containsKey("interactiveTabbedHeaderRenderer") ? (org.schabi.newpipe.extractor.services.youtube.c) Optional.of(cVarE3.e("interactiveTabbedHeaderRenderer")).map(new org.schabi.newpipe.extractor.services.youtube.b(4)).orElse(null) : null;
                }
                this.f = cVar2;
                this.g = str;
                this.h = (com.grack.nanojson.c) this.e.e("contents").e("twoColumnBrowseResultsRenderer").a("tabs").c().flatMap(new org.schabi.newpipe.extractor.services.youtube.b(5)).filter(new com.grack.nanojson.a(5)).map(new androidx.media3.exoplayer.audio.f(28)).findFirst().orElse(null);
            }
            cVar3 = (org.schabi.newpipe.extractor.services.youtube.c) cVarE3.e("carouselHeaderRenderer").a("contents").c().filter(new com.grack.nanojson.a(6)).findFirst().map(new org.schabi.newpipe.extractor.services.youtube.b(1)).map(new org.schabi.newpipe.extractor.services.youtube.b(2)).orElse(null);
        }
        cVar2 = cVar3;
        this.f = cVar2;
        this.g = str;
        this.h = (com.grack.nanojson.c) this.e.e("contents").e("twoColumnBrowseResultsRenderer").a("tabs").c().flatMap(new org.schabi.newpipe.extractor.services.youtube.b(5)).filter(new com.grack.nanojson.a(5)).map(new androidx.media3.exoplayer.audio.f(28)).findFirst().orElse(null);
    }

    public final List Y() {
        a();
        com.grack.nanojson.c cVar = this.h;
        return cVar != null ? (List) Optional.ofNullable(cVar.e("avatar").a("thumbnails")).map(new org.schabi.newpipe.extractor.services.youtube.b(15)).orElseThrow(new org.jsoup.internal.c(12)) : (List) Optional.ofNullable(this.f).map(new org.schabi.newpipe.extractor.services.youtube.b(12)).map(new org.schabi.newpipe.extractor.services.youtube.b(15)).orElseThrow(new org.jsoup.internal.c(11));
    }

    public final String Z() throws org.schabi.newpipe.extractor.exceptions.f {
        a();
        if (this.h != null) {
            return null;
        }
        try {
            org.schabi.newpipe.extractor.services.youtube.c cVar = this.f;
            return (cVar == null || cVar.y != 2) ? this.e.e("metadata").e("channelMetadataRenderer").f("description", null) : org.schabi.newpipe.extractor.services.youtube.i.n(cVar.e.e("description"), false);
        } catch (Exception e) {
            org.mozilla.javascript.typedarrays.c.d("Could not get channel description", e);
            return null;
        }
    }

    public final long a0() throws org.schabi.newpipe.extractor.exceptions.f {
        org.schabi.newpipe.extractor.services.youtube.c cVar;
        int i;
        a();
        if (this.h != null || (cVar = this.f) == null || (i = cVar.y) == 2) {
            return -1L;
        }
        com.grack.nanojson.c cVar2 = cVar.e;
        com.grack.nanojson.c cVarE = null;
        if (i != 4) {
            if (cVar2.containsKey("subscriberCountText")) {
                cVarE = cVar2.e("subscriberCountText");
            } else if (cVar2.containsKey("subtitle")) {
                cVarE = cVar2.e("subtitle");
            }
            if (cVarE == null) {
                return -1L;
            }
            try {
                return org.schabi.newpipe.extractor.utils.f.k(org.schabi.newpipe.extractor.services.youtube.i.n(cVarE, false));
            } catch (NumberFormatException e) {
                org.mozilla.javascript.typedarrays.c.d("Could not get subscriber count", e);
                return 0L;
            }
        }
        com.grack.nanojson.c cVarE2 = cVar2.e("content").e("pageHeaderViewModel").e("metadata");
        if (!cVarE2.containsKey("contentMetadataViewModel")) {
            return -1L;
        }
        com.grack.nanojson.b bVarA = cVarE2.e("contentMetadataViewModel").a("metadataRows");
        com.grack.nanojson.b bVarA2 = bVarA.b(Math.max(0, bVarA.size() - 1)).a("metadataParts");
        if (bVarA2.size() < 2) {
            return -1L;
        }
        try {
            return org.schabi.newpipe.extractor.utils.f.k(bVarA2.b(0).e("text").f("content", null));
        } catch (NumberFormatException e2) {
            org.mozilla.javascript.typedarrays.c.d("Could not get subscriber count", e2);
            return 0L;
        }
    }

    public final List b0() throws org.schabi.newpipe.extractor.exceptions.f {
        a();
        if (this.h != null) {
            ArrayList arrayList = new ArrayList();
            b bVar = new b(this, arrayList, S());
            bVar.accept("videos");
            bVar.accept("shorts");
            bVar.accept("livestreams");
            return Collections.unmodifiableList(arrayList);
        }
        com.grack.nanojson.b bVarA = this.e.e("contents").e("twoColumnBrowseResultsRenderer").a("tabs");
        ArrayList arrayList2 = new ArrayList();
        org.schabi.newpipe.extractor.services.soundcloud.extractors.a aVar = new org.schabi.newpipe.extractor.services.soundcloud.extractors.a(2, this, arrayList2);
        String strV = v();
        String strS = S();
        bVarA.c().filter(new com.grack.nanojson.a(13)).map(new org.schabi.newpipe.extractor.services.youtube.b(13)).forEach(new b(this, arrayList2, strV, o(), strS, aVar));
        return Collections.unmodifiableList(arrayList2);
    }

    public final boolean c0() throws org.schabi.newpipe.extractor.exceptions.f {
        a();
        if (this.h != null) {
            return false;
        }
        org.schabi.newpipe.extractor.services.youtube.c cVar = this.f;
        if (cVar == null) {
            org.mozilla.javascript.typedarrays.c.b("Could not get channel verified status, no channel header has been extracted");
            return false;
        }
        int i = cVar.y;
        com.grack.nanojson.c cVar2 = cVar.e;
        int iE = androidx.constraintlayout.core.g.e(i);
        if (iE == 1) {
            return cVar2.containsKey("autoGenerated");
        }
        if (iE != 2) {
            if (iE != 3) {
                return org.schabi.newpipe.extractor.services.youtube.i.w(cVar2.a("badges"));
            }
            com.grack.nanojson.c cVarE = cVar2.e("content").e("pageHeaderViewModel");
            com.grack.nanojson.b bVarA = cVarE.e("title").e("dynamicTextViewModel").e("text").a("attachmentRuns");
            String str = org.schabi.newpipe.extractor.services.youtube.i.a;
            boolean zAnyMatch = bVarA.c().anyMatch(new com.grack.nanojson.a(11));
            if (zAnyMatch || !cVarE.e("image").containsKey("contentPreviewImageViewModel")) {
                return zAnyMatch;
            }
        }
        return true;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String o() throws org.schabi.newpipe.extractor.exceptions.f {
        a();
        org.schabi.newpipe.extractor.services.youtube.c cVar = this.f;
        com.grack.nanojson.c cVar2 = this.e;
        String str = this.g;
        if (cVar != null) {
            com.grack.nanojson.c cVar3 = cVar.e;
            int iE = androidx.constraintlayout.core.g.e(cVar.y);
            if (iE == 0) {
                String strF = cVar3.e("header").e("c4TabbedHeaderRenderer").f("channelId", "");
                if (!org.schabi.newpipe.extractor.utils.f.h(strF)) {
                    return strF;
                }
                String strF2 = cVar3.e("navigationEndpoint").e("browseEndpoint").f("browseId", null);
                if (!org.schabi.newpipe.extractor.utils.f.h(strF2)) {
                    return strF2;
                }
            } else if (iE == 2) {
                String strF3 = ((com.grack.nanojson.c) cVar3.e("header").e("carouselHeaderRenderer").a("contents").c().filter(new com.grack.nanojson.a(4)).findFirst().orElse(new com.grack.nanojson.c())).e("topicChannelDetailsRenderer").e("navigationEndpoint").e("browseEndpoint").f("browseId", null);
                if (!org.schabi.newpipe.extractor.utils.f.h(strF3)) {
                    return strF3;
                }
            }
        }
        String strF4 = cVar2.e("metadata").e("channelMetadataRenderer").f("externalChannelId", null);
        if (!org.schabi.newpipe.extractor.utils.f.h(strF4)) {
            return strF4;
        }
        if (!org.schabi.newpipe.extractor.utils.f.h(str)) {
            return str;
        }
        org.mozilla.javascript.typedarrays.c.b("Could not get channel ID");
        return null;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String v() throws org.schabi.newpipe.extractor.exceptions.f {
        a();
        org.schabi.newpipe.extractor.services.youtube.c cVar = this.f;
        com.grack.nanojson.c cVar2 = this.h;
        com.grack.nanojson.c cVar3 = this.e;
        if (cVar2 != null) {
            String strF = cVar2.f("channelTitle", null);
            if (!org.schabi.newpipe.extractor.utils.f.h(strF)) {
                return strF;
            }
            org.mozilla.javascript.typedarrays.c.b("Could not get channel name");
            return null;
        }
        String strF2 = cVar3.e("metadata").e("channelMetadataRenderer").f("title", null);
        if (!org.schabi.newpipe.extractor.utils.f.h(strF2)) {
            return strF2;
        }
        Optional map = Optional.ofNullable(cVar).map(new androidx.media3.exoplayer.audio.f(29));
        if (!map.isPresent()) {
            map = Optional.ofNullable(cVar3.e("microformat").e("microformatDataRenderer").f("title", null));
            Objects.requireNonNull(map);
        }
        return (String) map.orElseThrow(new org.jsoup.internal.c(10));
    }
}
