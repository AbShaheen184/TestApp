package org.schabi.newpipe.extractor.services.youtube.extractors;

import com.appsalt.internal.x0;
import com.google.common.util.concurrent.g0;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeParseException;
import j$.util.Base64;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.Stack;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.mozilla.javascript.ES6Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends org.schabi.newpipe.extractor.f {
    public com.grack.nanojson.c e;
    public com.grack.nanojson.c f;
    public com.grack.nanojson.c g;
    public com.grack.nanojson.c h;
    public com.grack.nanojson.c i;
    public com.grack.nanojson.c j;
    public com.grack.nanojson.c k;
    public com.grack.nanojson.c l;
    public com.grack.nanojson.b m;
    public int n;
    public String o;
    public String p;
    public int q;

    public static String a0(String str, String str2, List list) {
        String strConcat = str.concat("ManifestUrl");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            org.schabi.newpipe.extractor.utils.c cVar = (org.schabi.newpipe.extractor.utils.c) it.next();
            Serializable serializable = cVar.e;
            if (serializable != null) {
                String strF = ((com.grack.nanojson.c) serializable).f(strConcat, null);
                if (!org.schabi.newpipe.extractor.utils.f.h(strF)) {
                    Serializable serializable2 = cVar.y;
                    if (serializable2 == null) {
                        return androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.i(strF, "?", str2);
                    }
                    return strF + "?pot=" + ((String) serializable2) + "&" + str2;
                }
            }
        }
        return "";
    }

    public static boolean e0(com.grack.nanojson.c cVar, String str) {
        return !str.equals(cVar.e("videoDetails").f("videoId", null));
    }

    public static long f0(com.grack.nanojson.b bVar) throws org.schabi.newpipe.extractor.exceptions.f {
        String strF = null;
        com.grack.nanojson.c cVar = (com.grack.nanojson.c) bVar.c().map(new org.schabi.newpipe.extractor.services.youtube.b(25)).filter(new com.grack.nanojson.a(26)).findFirst().orElse(null);
        if (cVar != null) {
            String strF2 = cVar.e("accessibilityData").e("accessibilityData").f("label", null);
            if (strF2 == null) {
                strF2 = cVar.e("accessibility").f("label", null);
            }
            strF = strF2 == null ? cVar.e("defaultText").e("accessibility").e("accessibilityData").f("label", null) : strF2;
            if (strF != null && strF.toLowerCase().contains("no likes")) {
                return 0L;
            }
        }
        if (strF == null) {
            org.mozilla.javascript.typedarrays.c.b("Could not get like count from accessibility data");
            return 0L;
        }
        try {
            Pattern pattern = org.schabi.newpipe.extractor.utils.f.a;
            return Long.parseLong(strF.replaceAll("\\D+", ""));
        } catch (NumberFormatException e) {
            throw new org.schabi.newpipe.extractor.exceptions.f(androidx.privacysandbox.ads.adservices.java.internal.a.q("Could not parse \"", strF, "\" as a long"), e);
        }
    }

    public static long g0(com.grack.nanojson.b bVar) throws org.schabi.newpipe.extractor.exceptions.f {
        com.grack.nanojson.c cVar = (com.grack.nanojson.c) bVar.c().map(new org.schabi.newpipe.extractor.services.youtube.b(24)).filter(new com.grack.nanojson.a(25)).findFirst().orElse(null);
        if (cVar == null) {
            org.mozilla.javascript.typedarrays.c.b("Could not find buttonViewModel object");
            return 0L;
        }
        String strF = cVar.f("accessibilityText", null);
        if (strF == null) {
            org.mozilla.javascript.typedarrays.c.b("Could not find buttonViewModel's accessibilityText string");
            return 0L;
        }
        try {
            Pattern pattern = org.schabi.newpipe.extractor.utils.f.a;
            return Long.parseLong(strF.replaceAll("\\D+", ""));
        } catch (NumberFormatException e) {
            throw new org.schabi.newpipe.extractor.exceptions.f(androidx.privacysandbox.ads.adservices.java.internal.a.q("Could not parse \"", strF, "\" as a long"), e);
        }
    }

    public static Optional h0(String str, String str2) {
        try {
            return Optional.of(LocalDate.parse(str, DateTimeFormatter.ofPattern(str2, Locale.ENGLISH)));
        } catch (DateTimeParseException unused) {
            return Optional.empty();
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void A() throws org.schabi.newpipe.extractor.exceptions.f {
        if (!this.f.containsKey("engagementPanels")) {
            List list = Collections.EMPTY_LIST;
            return;
        }
        com.grack.nanojson.b bVar = (com.grack.nanojson.b) this.f.a("engagementPanels").c().filter(new x(0)).map(new org.schabi.newpipe.extractor.services.youtube.b(27)).findFirst().orElse(null);
        if (bVar == null) {
            List list2 = Collections.EMPTY_LIST;
            return;
        }
        long jR = r();
        ArrayList arrayList = new ArrayList();
        for (com.grack.nanojson.c cVar : bVar.c().map(new org.schabi.newpipe.extractor.services.youtube.b(28))) {
            int iC = cVar.e("onTap").e("watchEndpoint").c("startTimeSeconds", -1);
            if (iC == -1) {
                org.mozilla.javascript.typedarrays.c.b("Could not get stream segment start time.");
                return;
            }
            if (iC > jR) {
                return;
            }
            if (org.schabi.newpipe.extractor.utils.f.h(org.schabi.newpipe.extractor.services.youtube.i.n(cVar.e("title"), false))) {
                org.mozilla.javascript.typedarrays.c.b("Could not get stream segment title.");
                return;
            }
            org.schabi.newpipe.extractor.stream.d dVar = new org.schabi.newpipe.extractor.stream.d();
            String str = this.b.y;
            if (cVar.containsKey("thumbnail")) {
                com.grack.nanojson.b bVarA = cVar.e("thumbnail").a("thumbnails");
                if (!bVarA.isEmpty()) {
                    org.schabi.newpipe.extractor.services.youtube.i.e(bVarA.b(bVarA.size() - 1).f("url", null));
                }
            }
            arrayList.add(dVar);
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final int B() {
        a();
        return this.q;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void F() {
        a();
        ArrayList arrayList = new ArrayList();
        com.grack.nanojson.b bVarA = this.l.a("captionTracks");
        for (int i = 0; i < bVarA.size(); i++) {
            String strF = bVarA.b(i).f("languageCode", null);
            String strF2 = bVarA.b(i).f("baseUrl", null);
            String strF3 = bVarA.b(i).f("vssId", null);
            if (strF != null && strF2 != null && strF3 != null) {
                boolean zStartsWith = strF3.startsWith("a.");
                String strC = androidx.constraintlayout.core.g.c(strF2.replaceAll("&fmt=[^&]*", "").replaceAll("&tlang=[^&]*", ""), "&fmt=ttml");
                org.schabi.newpipe.extractor.i iVar = org.schabi.newpipe.extractor.i.TTML;
                iVar.getClass();
                strF.concat(".".concat("ttml"));
                arrayList.add(new org.schabi.newpipe.extractor.stream.i(strC, true, iVar, strF, zStartsWith));
            }
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List H() {
        return org.schabi.newpipe.extractor.utils.a.g(this.e.e("videoDetails").a("keywords"));
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String I() {
        String strN;
        String strF = this.k.f("uploadDate", "");
        if (strF.isEmpty()) {
            strF = this.k.f("publishDate", "");
        }
        if (!strF.isEmpty()) {
            return strF;
        }
        com.grack.nanojson.c cVarE = this.k.e("liveBroadcastDetails");
        String strF2 = cVarE.f("endTimestamp", "");
        if (strF2.isEmpty()) {
            strF2 = cVarE.f("startTimestamp", "");
        }
        if (!strF2.isEmpty()) {
            return strF2;
        }
        a();
        if (this.q == 4 || (strN = org.schabi.newpipe.extractor.services.youtube.i.n(c0().e("dateText"), false)) == null) {
            return null;
        }
        if (strN.startsWith("Premiered on ")) {
            return strN.substring(13);
        }
        return strN.startsWith("Premiered ") ? strN.substring(10) : strN;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List J() throws org.schabi.newpipe.extractor.exceptions.f {
        a();
        try {
            return org.schabi.newpipe.extractor.services.youtube.i.k(this.m);
        } catch (Exception unused) {
            org.mozilla.javascript.typedarrays.c.b("Could not get thumbnails");
            return null;
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void L() throws org.schabi.newpipe.extractor.exceptions.f {
        M("((#|&|\\?)t=\\d*h?\\d*m?\\d+s?)");
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void N() {
        String strI = I();
        try {
            try {
                org.schabi.newpipe.extractor.localization.b.b(strI);
            } catch (org.schabi.newpipe.extractor.exceptions.f unused) {
                LocalDateTime localDateTimeNow = LocalDateTime.now();
                org.schabi.newpipe.extractor.timeago.b bVar = (org.schabi.newpipe.extractor.timeago.b) org.schabi.newpipe.extractor.timeago.a.a.get("en");
                (bVar == null ? null : new g0(22, bVar, localDateTimeNow, false)).x(strI);
            }
        } catch (org.schabi.newpipe.extractor.exceptions.f unused2) {
            Optional optionalH0 = h0(strI, "MMM dd, yyyy");
            if (!optionalH0.isPresent()) {
                optionalH0 = h0(strI, "dd MMM yyyy");
                Objects.requireNonNull(optionalH0);
            }
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List O() throws org.schabi.newpipe.extractor.exceptions.f {
        a();
        com.grack.nanojson.c cVarE = d0().e("owner").e("videoOwnerRenderer");
        List listK = cVarE.containsKey("avatarStack") ? org.schabi.newpipe.extractor.services.youtube.i.k(cVarE.e("avatarStack").e("avatarStackViewModel").a("avatars").b(0).e("avatarViewModel").e("image").a("sources")) : org.schabi.newpipe.extractor.services.youtube.i.k(cVarE.e("thumbnail").a("thumbnails"));
        if (!listK.isEmpty() || this.n != 0) {
            return listK;
        }
        org.mozilla.javascript.typedarrays.c.b("Could not get uploader avatars");
        return null;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String P() throws org.schabi.newpipe.extractor.exceptions.f {
        a();
        String strF = this.e.e("videoDetails").f("author", null);
        if (!org.schabi.newpipe.extractor.utils.f.h(strF)) {
            return strF;
        }
        org.mozilla.javascript.typedarrays.c.b("Could not get uploader name");
        return null;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void Q() throws org.schabi.newpipe.extractor.exceptions.f {
        com.grack.nanojson.c cVarE;
        String strN;
        com.grack.nanojson.c cVar = (com.grack.nanojson.c) org.schabi.newpipe.extractor.utils.a.e(this.j, "owner.videoOwnerRenderer", com.grack.nanojson.c.class);
        if (cVar.containsKey("subscriberCountText")) {
            strN = org.schabi.newpipe.extractor.services.youtube.i.n(cVar.e("subscriberCountText"), false);
        } else {
            com.grack.nanojson.c cVarE2 = cVar.e("navigationEndpoint");
            String str = org.schabi.newpipe.extractor.services.youtube.i.a;
            try {
                cVarE = ((com.grack.nanojson.b) org.schabi.newpipe.extractor.utils.a.e(cVarE2, "showDialogCommand.panelLoadingStrategy.inlineContent.dialogViewModel.customContent.listViewModel.listItems", com.grack.nanojson.b.class)).b(0).e("listItemViewModel");
            } catch (org.schabi.newpipe.extractor.exceptions.f unused) {
                cVarE = null;
            }
            strN = cVarE.e("subtitle").f("content", null).split("•")[1];
        }
        if (org.schabi.newpipe.extractor.utils.f.h(strN)) {
            return;
        }
        try {
            org.schabi.newpipe.extractor.utils.f.k(strN);
        } catch (NumberFormatException e) {
            org.mozilla.javascript.typedarrays.c.d("Could not get uploader subscriber count", e);
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String R() throws org.schabi.newpipe.extractor.exceptions.f {
        a();
        String strF = this.e.e("videoDetails").f("channelId", null);
        if (org.schabi.newpipe.extractor.utils.f.h(strF)) {
            org.mozilla.javascript.typedarrays.c.b("Could not get uploader url");
            return null;
        }
        return org.schabi.newpipe.extractor.services.youtube.linkHandler.a.b.m("channel/" + strF);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List T() {
        a();
        return Z(3, "adaptiveFormats", "video-only", new v(this, true));
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List U() {
        a();
        return Z(2, "formats", "video", new v(this, false));
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void V() throws org.schabi.newpipe.extractor.exceptions.f {
        String strN = org.schabi.newpipe.extractor.services.youtube.i.n(c0().e("viewCount").e("videoViewCountRenderer").e("viewCount"), false);
        if (org.schabi.newpipe.extractor.utils.f.h(strN)) {
            strN = this.e.e("videoDetails").f("viewCount", null);
            if (org.schabi.newpipe.extractor.utils.f.h(strN)) {
                org.mozilla.javascript.typedarrays.c.b("Could not get view count");
                return;
            }
        }
        if (strN.toLowerCase().contains("no views")) {
            return;
        }
        Long.parseLong(strN.replaceAll("\\D+", ""));
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void W() {
        com.grack.nanojson.c cVarE;
        com.grack.nanojson.c cVarE2 = d0().e("owner").e("videoOwnerRenderer");
        if (cVarE2.containsKey("badges")) {
            org.schabi.newpipe.extractor.services.youtube.i.w(cVarE2.a("badges"));
            return;
        }
        com.grack.nanojson.c cVarE3 = cVarE2.e("navigationEndpoint");
        String str = org.schabi.newpipe.extractor.services.youtube.i.a;
        try {
            cVarE = ((com.grack.nanojson.b) org.schabi.newpipe.extractor.utils.a.e(cVarE3, "showDialogCommand.panelLoadingStrategy.inlineContent.dialogViewModel.customContent.listViewModel.listItems", com.grack.nanojson.b.class)).b(0).e("listItemViewModel");
        } catch (org.schabi.newpipe.extractor.exceptions.f unused) {
            cVarE = null;
        }
        if (cVarE == null) {
            return;
        }
        cVarE.e("title").a("attachmentRuns").c().anyMatch(new com.grack.nanojson.a(11));
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void X(com.app.mlounge.data.music.e eVar) throws org.schabi.newpipe.extractor.exceptions.d {
        String str = this.b.z;
        org.schabi.newpipe.extractor.localization.c cVarC = this.a.c();
        org.schabi.newpipe.extractor.localization.a aVarK = k();
        Random random = org.schabi.newpipe.extractor.services.youtube.i.g;
        String strD = org.schabi.newpipe.extractor.utils.a.d(16, random);
        this.p = strD;
        com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar = new com.google.android.datatransport.runtime.scheduling.jobscheduling.c("ANDROID", "21.03.36");
        g0 g0Var = new g0(23, cVar, new androidx.appcompat.widget.o(36, "MOBILE", null, null, "Android", "16"), false);
        Map mapH = com.google.common.base.i.h("com.google.android.youtube/21.03.36 (Linux; U; Android 15; " + cVarC.a() + ") gzip");
        cVar.A = org.schabi.newpipe.extractor.services.youtube.i.t(g0Var, cVarC, aVarK, mapH, "https://youtubei.googleapis.com/youtubei/v1/");
        g0 g0VarA = org.schabi.newpipe.extractor.services.youtube.i.A(cVarC, aVarK, g0Var);
        g0VarA.v("playerRequest");
        com.google.common.base.i.a(g0VarA, str, strD);
        g0VarA.p();
        g0VarA.G("disablePlayerResponse", false);
        com.grack.nanojson.c cVarE = org.schabi.newpipe.extractor.utils.a.m(org.schabi.newpipe.extractor.services.youtube.i.s(com.google.android.material.textfield.p.a.x(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.j("https://youtubei.googleapis.com/youtubei/v1/reel/reel_item_watch?prettyPrint=false&t=", org.schabi.newpipe.extractor.utils.a.d(12, random), "&id=", str, "&$fields=playerResponse"), mapH, com.google.android.material.resources.c.p((com.grack.nanojson.c) g0VarA.z).getBytes(StandardCharsets.UTF_8), cVarC))).e("playerResponse");
        this.e = cVarE;
        com.grack.nanojson.c cVarE2 = cVarE.e("playabilityStatus");
        String strF = cVarE2.f("status", null);
        if (strF != null && !strF.equalsIgnoreCase("ok")) {
            String strF2 = cVarE2.f("reason", null);
            if (strF2 != null) {
                if (strF.equalsIgnoreCase("login_required")) {
                    if (strF2.contains("inappropriate for some users")) {
                        throw new org.schabi.newpipe.extractor.exceptions.a("This age-restricted video cannot be watched anonymously");
                    }
                    if (strF2.contains("private")) {
                        throw new org.schabi.newpipe.extractor.exceptions.a("This video is private");
                    }
                    if (strF2.contains("a bot")) {
                        throw new org.schabi.newpipe.extractor.exceptions.b(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.j("YouTube probably temporarily blocked anonymous watch access with this IP , got error ", strF, ": \"", strF2, "\""));
                    }
                }
                if (strF.equalsIgnoreCase("unplayable") || strF.equalsIgnoreCase("error")) {
                    if (strF2.contains("Music Premium")) {
                        throw new org.schabi.newpipe.extractor.exceptions.a("This video is a YouTube Music Premium video");
                    }
                    if (strF2.contains("payment")) {
                        throw new org.schabi.newpipe.extractor.exceptions.a("This video is a paid video");
                    }
                    if (strF2.contains("members")) {
                        throw new org.schabi.newpipe.extractor.exceptions.a("This video is only available for members of the channel of this video");
                    }
                    if (strF2.contains("country")) {
                        throw new org.schabi.newpipe.extractor.exceptions.a("This video is not available in client's country.");
                    }
                    if (strF2.contains("closed") || strF2.contains("terminated")) {
                        throw new org.schabi.newpipe.extractor.exceptions.a(strF2);
                    }
                }
            }
            throw new org.schabi.newpipe.extractor.exceptions.b(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.j("Got error ", strF, ": \"", strF2, "\""));
        }
        if (e0(this.e, str)) {
            throw new org.schabi.newpipe.extractor.exceptions.d("ANDROID player response is not valid");
        }
        this.h = this.e.e("streamingData");
        this.l = this.e.e("captions").e("playerCaptionsTracklistRenderer");
        if (this.e.e("playabilityStatus").containsKey("liveStreamability")) {
            this.q = 4;
        } else if (this.e.e("videoDetails").b("isPostLiveDvr")) {
            this.q = 6;
        } else {
            this.q = 2;
        }
        try {
            String strD2 = org.schabi.newpipe.extractor.utils.a.d(16, random);
            this.o = strD2;
            com.grack.nanojson.c cVarI = com.google.common.base.i.i(aVarK, cVarC, str, strD2);
            if (!e0(cVarI, str)) {
                this.g = cVarI.e("streamingData");
                if (org.schabi.newpipe.extractor.utils.f.j(this.l)) {
                    this.l = cVarI.e("captions").e("playerCaptionsTracklistRenderer");
                }
            }
        } catch (Exception unused) {
        }
        try {
            com.grack.nanojson.c cVarJ = com.google.common.base.i.j(cVarC, aVarK, str);
            if (!e0(cVarJ, str)) {
                this.k = cVarJ.e("microformat").e("playerMicroformatRenderer");
                com.grack.nanojson.c cVarE3 = cVarJ.e("videoDetails").e("thumbnail");
                if (cVarE3.containsKey("thumbnails")) {
                    this.m = cVarE3.a("thumbnails");
                } else {
                    this.m = this.e.e("videoDetails").e("thumbnail").a("thumbnails");
                }
            }
        } catch (Exception unused2) {
            this.k = new com.grack.nanojson.c();
            this.m = this.e.e("videoDetails").e("thumbnail").a("thumbnails");
        }
        g0 g0VarZ = org.schabi.newpipe.extractor.services.youtube.i.z(cVarC, aVarK);
        g0VarZ.F(str, "videoId");
        g0VarZ.G("contentCheckOk", true);
        g0VarZ.G("racyCheckOk", true);
        this.f = org.schabi.newpipe.extractor.services.youtube.i.l(ES6Iterator.NEXT_METHOD, com.google.android.material.resources.c.p((com.grack.nanojson.c) g0VarZ.z).getBytes(StandardCharsets.UTF_8), cVarC);
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0225  */
    public final a Y(String str, com.grack.nanojson.c cVar, org.schabi.newpipe.extractor.services.youtube.a aVar, int i, String str2, String str3) throws Exception {
        String strReplace;
        String strJ;
        boolean z;
        int i2;
        if (cVar.containsKey("url")) {
            strReplace = cVar.f("url", null);
        } else {
            String strF = cVar.f("cipher", cVar.f("signatureCipher", null));
            if (org.schabi.newpipe.extractor.utils.f.h(strF)) {
                return null;
            }
            Map map = (Map) Arrays.stream(strF.split("&")).map(new z(14)).filter(new x(10)).collect(Collectors.toMap(new z(15), new z(16), new org.jsoup.internal.i(1)));
            String str4 = (String) map.getOrDefault("s", "");
            org.schabi.newpipe.extractor.exceptions.f fVar = org.schabi.newpipe.extractor.services.youtube.h.g;
            if (fVar != null) {
                throw fVar;
            }
            org.schabi.newpipe.extractor.services.youtube.h.a(str);
            if (org.schabi.newpipe.extractor.services.youtube.h.c == null) {
                try {
                    org.schabi.newpipe.extractor.services.youtube.h.c = org.schabi.newpipe.extractor.services.youtube.k.a(org.schabi.newpipe.extractor.services.youtube.h.b);
                } catch (org.schabi.newpipe.extractor.exceptions.f e) {
                    org.schabi.newpipe.extractor.services.youtube.h.g = e;
                    throw e;
                } catch (Exception e2) {
                    org.schabi.newpipe.extractor.services.youtube.h.g = new org.schabi.newpipe.extractor.exceptions.f("Could not get signature parameter deobfuscation JavaScript function", e2);
                    throw e2;
                }
            }
            try {
                String strL = org.schabi.newpipe.extractor.utils.a.l(org.schabi.newpipe.extractor.services.youtube.h.c, "deobfuscate", str4);
                if (strL == null) {
                    strL = "";
                }
                strReplace = ((String) map.get("url")) + "&" + ((String) map.get("sp")) + "=" + strL;
            } catch (Exception e3) {
                org.mozilla.javascript.typedarrays.c.d("Could not run signature parameter deobfuscation JavaScript function", e3);
                return null;
            }
        }
        HashMap map2 = org.schabi.newpipe.extractor.services.youtube.h.a;
        Pattern pattern = org.schabi.newpipe.extractor.services.youtube.l.a;
        if (strReplace.contains("&n=") || strReplace.contains("?n=")) {
            try {
                strJ = org.schabi.newpipe.extractor.utils.a.j(org.schabi.newpipe.extractor.services.youtube.l.a, strReplace, 1);
            } catch (org.schabi.newpipe.extractor.utils.d unused) {
                strJ = null;
            }
        } else {
            strJ = null;
        }
        if (strJ != null) {
            HashMap map3 = org.schabi.newpipe.extractor.services.youtube.h.a;
            String str5 = (String) map3.get(strJ);
            if (str5 != null) {
                strReplace = strReplace.replace(strJ, str5);
            } else {
                org.schabi.newpipe.extractor.services.youtube.h.a(str);
                org.schabi.newpipe.extractor.exceptions.f fVar2 = org.schabi.newpipe.extractor.services.youtube.h.f;
                if (fVar2 != null) {
                    throw fVar2;
                }
                if (org.schabi.newpipe.extractor.services.youtube.h.e == null) {
                    try {
                        String strB = org.schabi.newpipe.extractor.services.youtube.l.b(org.schabi.newpipe.extractor.services.youtube.h.b);
                        org.schabi.newpipe.extractor.services.youtube.h.d = strB;
                        org.schabi.newpipe.extractor.services.youtube.h.e = org.schabi.newpipe.extractor.services.youtube.l.a(org.schabi.newpipe.extractor.services.youtube.h.b, strB);
                    } catch (org.schabi.newpipe.extractor.exceptions.f e4) {
                        org.schabi.newpipe.extractor.services.youtube.h.f = e4;
                        throw e4;
                    } catch (Exception e5) {
                        org.schabi.newpipe.extractor.services.youtube.h.f = new org.schabi.newpipe.extractor.exceptions.f("Could not get throttling parameter deobfuscation JavaScript function", e5);
                        throw e5;
                    }
                }
                try {
                    String strL2 = org.schabi.newpipe.extractor.utils.a.l(org.schabi.newpipe.extractor.services.youtube.h.e, org.schabi.newpipe.extractor.services.youtube.h.d, strJ);
                    if (org.schabi.newpipe.extractor.utils.f.h(strL2)) {
                        throw new IllegalStateException("Extracted n-parameter is empty");
                    }
                    map3.put(strJ, strL2);
                    strReplace = strReplace.replace(strJ, strL2);
                } catch (Exception e6) {
                    org.mozilla.javascript.typedarrays.c.d("Could not run throttling parameter deobfuscation JavaScript function", e6);
                    return null;
                }
            }
        }
        String strI = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.i(strReplace, "&cpn=", str2);
        if (str3 != null) {
            strI = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.i(strI, "&pot=", str3);
        }
        com.grack.nanojson.c cVarE = cVar.e("initRange");
        com.grack.nanojson.c cVarE2 = cVar.e("indexRange");
        String strF2 = cVar.f("mimeType", "");
        if (strF2.contains("codecs")) {
            String str6 = strF2.split("\"")[1];
        }
        aVar.B = cVar.c("bitrate", 0);
        cVar.c("width", 0);
        cVar.c("height", 0);
        Integer.parseInt(cVarE.f("start", "-1"));
        Integer.parseInt(cVarE.f("end", "-1"));
        Integer.parseInt(cVarE2.f("start", "-1"));
        Integer.parseInt(cVarE2.f("end", "-1"));
        cVar.f("quality", null);
        cVar.b("isDrc");
        Long.parseLong(cVar.f("lastModified", "-1"));
        aVar.F = cVar.f("xtags", null);
        int i3 = this.q;
        if (i3 == 4 || i3 == 6) {
            cVar.c("targetDurationSec", 0);
        }
        if (i == 2 || i == 3) {
            z = true;
            cVar.c("fps", 0);
        } else if (i == 1) {
            Integer.parseInt(cVar.f("audioSampleRate", null));
            cVar.c("audioChannels", 2);
            String strF3 = cVar.e("audioTrack").f("id", null);
            if (org.schabi.newpipe.extractor.utils.f.h(strF3)) {
                z = true;
            } else {
                aVar.C = strF3;
                int iIndexOf = strF3.indexOf(".");
                z = true;
                if (iIndexOf != -1) {
                    org.schabi.newpipe.extractor.utils.a.c(strF3.substring(0, iIndexOf)).ifPresent(new x0(aVar, 9));
                }
                String str7 = aVar.F;
                String str8 = org.schabi.newpipe.extractor.services.youtube.i.a;
                if (str7 == null) {
                    i2 = 0;
                } else {
                    try {
                        String str9 = (String) org.schabi.newpipe.extractor.services.youtube.protos.video.b.c(Base64.getUrlDecoder().decode(str7)).b().stream().filter(new com.grack.nanojson.a(10)).findFirst().map(new org.schabi.newpipe.extractor.services.youtube.b(9)).orElse(null);
                        if (str9 != null) {
                            switch (str9) {
                                case "descriptive":
                                    i2 = 3;
                                    break;
                                case "dubbed":
                                case "dubbed-auto":
                                    i2 = 2;
                                    break;
                                case "secondary":
                                    i2 = 4;
                                    break;
                                case "original":
                                    i2 = 1;
                                    break;
                                default:
                                    i2 = 0;
                                    break;
                            }
                        } else {
                            i2 = 0;
                        }
                    } catch (com.google.protobuf.x0 unused2) {
                    }
                }
                aVar.H = i2;
            }
            aVar.D = cVar.e("audioTrack").f("displayName", null);
        } else {
            z = true;
        }
        Long.parseLong(cVar.f("contentLength", String.valueOf(-1L)));
        Long.parseLong(cVar.f("approxDurationMs", String.valueOf(-1L)));
        a aVar2 = new a(strI, aVar);
        int i4 = this.q;
        if (i4 == 2) {
            aVar2.z = !cVar.f("type", "").equalsIgnoreCase("FORMAT_STREAM_TYPE_OTF");
        } else {
            aVar2.z = i4 != 6 ? z : false;
        }
        return aVar2;
    }

    public final ArrayList Z(final int i, final String str, String str2, Function function) throws org.schabi.newpipe.extractor.exceptions.f {
        try {
            final String str3 = this.b.z;
            ArrayList arrayList = new ArrayList();
            Stream.of((Object[]) new org.schabi.newpipe.extractor.utils.c[]{new org.schabi.newpipe.extractor.utils.c(this.h, new org.schabi.newpipe.extractor.utils.c(this.p, null)), new org.schabi.newpipe.extractor.utils.c(this.g, new org.schabi.newpipe.extractor.utils.c(this.o, null)), new org.schabi.newpipe.extractor.utils.c(null, new org.schabi.newpipe.extractor.utils.c(null, null))}).flatMap(new Function() { // from class: org.schabi.newpipe.extractor.services.youtube.extractors.w
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    org.schabi.newpipe.extractor.utils.c cVar = (org.schabi.newpipe.extractor.utils.c) obj;
                    com.grack.nanojson.c cVar2 = (com.grack.nanojson.c) cVar.e;
                    org.schabi.newpipe.extractor.utils.c cVar3 = (org.schabi.newpipe.extractor.utils.c) cVar.y;
                    final String str4 = (String) cVar3.e;
                    final String str5 = (String) cVar3.y;
                    if (cVar2 != null) {
                        String str6 = str;
                        if (cVar2.containsKey(str6)) {
                            Stream streamC = cVar2.a(str6).c();
                            final y yVar = this.a;
                            final int i2 = i;
                            final String str7 = str3;
                            return streamC.map(new Function() { // from class: org.schabi.newpipe.extractor.services.youtube.extractors.u
                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    y yVar2 = yVar;
                                    String str8 = str7;
                                    String str9 = str4;
                                    String str10 = str5;
                                    com.grack.nanojson.c cVar4 = (com.grack.nanojson.c) obj2;
                                    try {
                                        int iC = cVar4.c("itag", 0);
                                        org.schabi.newpipe.extractor.services.youtube.a[] aVarArr = org.schabi.newpipe.extractor.services.youtube.a.I;
                                        for (int i3 = 0; i3 < 57; i3++) {
                                            org.schabi.newpipe.extractor.services.youtube.a aVar = aVarArr[i3];
                                            if (iC == aVar.y) {
                                                org.schabi.newpipe.extractor.services.youtube.a aVar2 = new org.schabi.newpipe.extractor.services.youtube.a(aVar);
                                                int i4 = aVar2.G;
                                                if (i4 == i2) {
                                                    return yVar2.Y(str8, cVar4, aVar2, i4, str9, str10);
                                                }
                                                return null;
                                            }
                                        }
                                        throw new org.schabi.newpipe.extractor.exceptions.f(androidx.privacysandbox.ads.adservices.java.internal.a.p("itag ", iC, " is not supported"));
                                    } catch (org.schabi.newpipe.extractor.exceptions.d unused) {
                                        return null;
                                    }
                                }
                            }).filter(new com.grack.nanojson.a(28));
                        }
                    }
                    return Stream.empty();
                }
            }).map(function).forEachOrdered(new net.luminis.quic.send.f(1, arrayList));
            return arrayList;
        } catch (Exception e) {
            throw new org.schabi.newpipe.extractor.exceptions.f(androidx.privacysandbox.ads.adservices.java.internal.a.q("Could not get ", str2, " streams"), e);
        }
    }

    public final com.grack.nanojson.c b0(String str) {
        return (com.grack.nanojson.c) this.f.e("contents").e("twoColumnWatchNextResults").e("results").e("results").a("contents").c().filter(new org.schabi.newpipe.extractor.h(str, 5)).map(new org.schabi.newpipe.extractor.services.bandcamp.extractors.a(str, 6)).findFirst().orElse(new com.grack.nanojson.c());
    }

    @Override // org.schabi.newpipe.extractor.f
    public final int c() {
        int i = this.n;
        if (i != -1) {
            return i;
        }
        int i2 = d0().e("metadataRowContainer").e("metadataRowContainerRenderer").a("rows").c().flatMap(new org.schabi.newpipe.extractor.services.youtube.b(29)).flatMap(new org.schabi.newpipe.extractor.services.youtube.b(22)).map(new org.schabi.newpipe.extractor.services.youtube.b(23)).anyMatch(new com.grack.nanojson.a(24)) ? 18 : 0;
        this.n = i2;
        return i2;
    }

    public final com.grack.nanojson.c c0() {
        com.grack.nanojson.c cVar = this.i;
        if (cVar != null) {
            return cVar;
        }
        com.grack.nanojson.c cVarB0 = b0("videoPrimaryInfoRenderer");
        this.i = cVarB0;
        return cVarB0;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List d() {
        a();
        return Z(1, "adaptiveFormats", "audio", new net.luminis.quic.crypto.e(this, 3));
    }

    public final com.grack.nanojson.c d0() {
        com.grack.nanojson.c cVar = this.j;
        if (cVar != null) {
            return cVar;
        }
        com.grack.nanojson.c cVarB0 = b0("videoSecondaryInfoRenderer");
        this.j = cVarB0;
        return cVarB0;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void f() {
        this.k.f("category", "");
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String g() {
        a();
        Object[] objArr = {new org.schabi.newpipe.extractor.utils.c(this.h, null)};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        return a0("dash", "mpd_version=7", androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.p(obj, arrayList, obj, arrayList));
    }

    @Override // org.schabi.newpipe.extractor.f
    public final org.schabi.newpipe.extractor.stream.c h() {
        String strF;
        String strReplace;
        ArrayList arrayList;
        int i;
        a();
        final int i2 = 1;
        String strN = org.schabi.newpipe.extractor.services.youtube.i.n(d0().e("description"), true);
        if (!org.schabi.newpipe.extractor.utils.f.h(strN)) {
            return new org.schabi.newpipe.extractor.stream.c(strN, 1);
        }
        com.grack.nanojson.c cVarE = d0().e("attributedDescription");
        Pattern pattern = org.schabi.newpipe.extractor.services.youtube.f.a;
        final int i3 = 0;
        if (org.schabi.newpipe.extractor.utils.f.j(cVarE) || (strF = cVarE.f("content", null)) == null) {
            strReplace = null;
        } else {
            final ArrayList arrayList2 = new ArrayList();
            final ArrayList arrayList3 = new ArrayList();
            cVarE.a("commandRuns").c().forEach(new Consumer() { // from class: org.schabi.newpipe.extractor.services.youtube.d
                /* JADX WARN: Code duplicated, block: B:21:0x0053  */
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    String strQ;
                    com.grack.nanojson.c cVar = (com.grack.nanojson.c) obj;
                    switch (i2) {
                        case 0:
                            int iC = cVar.c("startIndex", -1);
                            int iC2 = cVar.c("length", 0);
                            if (iC >= 0 && iC2 >= 1) {
                                int i4 = iC2 + iC;
                                boolean zContainsKey = cVar.containsKey("strikethrough");
                                ArrayList arrayList4 = arrayList2;
                                ArrayList arrayList5 = arrayList3;
                                if (zContainsKey) {
                                    arrayList4.add(new e(iC, "<s>", "</s>", null));
                                    arrayList5.add(new e(i4, "<s>", "</s>", null));
                                }
                                if (cVar.b("italic")) {
                                    arrayList4.add(new e(iC, "<i>", "</i>", null));
                                    arrayList5.add(new e(i4, "<i>", "</i>", null));
                                }
                                if (cVar.containsKey("weightLabel") && !"FONT_WEIGHT_NORMAL".equals(cVar.f("weightLabel", null))) {
                                    arrayList4.add(new e(iC, "<b>", "</b>", null));
                                    arrayList5.add(new e(i4, "<b>", "</b>", null));
                                    break;
                                }
                            }
                            break;
                        default:
                            com.grack.nanojson.c cVarE2 = cVar.e("onTap").e("innertubeCommand");
                            int iC3 = cVar.c("startIndex", -1);
                            boolean z = false;
                            int iC4 = cVar.c("length", 0);
                            if (iC3 >= 0 && iC4 >= 1 && (strQ = i.q(cVarE2)) != null) {
                                try {
                                    URL url = new URL(strQ);
                                    if (i.x(url)) {
                                        z = true;
                                    } else {
                                        String host = url.getHost();
                                        if (host.equalsIgnoreCase("www.youtube-nocookie.com") || host.equalsIgnoreCase("youtu.be")) {
                                            z = true;
                                        }
                                    }
                                } catch (MalformedURLException unused) {
                                }
                                String strQ2 = androidx.privacysandbox.ads.adservices.java.internal.a.q("<a href=\"", org.jsoup.nodes.l.d(strQ), "\">");
                                String strReplaceFirst = cVar.e("onTapOptions").e("accessibilityInfo").f("accessibilityLabel", "").replaceFirst(" Channel Link", "");
                                Function bVar = (z || strReplaceFirst.isEmpty() || strReplaceFirst.startsWith("YouTube: ")) ? new b(6) : new org.schabi.newpipe.extractor.services.bandcamp.extractors.a(strReplaceFirst, 4);
                                arrayList2.add(new e(iC3, strQ2, "</a>", bVar));
                                arrayList3.add(new e(iC3 + iC4, strQ2, "</a>", bVar));
                                break;
                            }
                            break;
                    }
                }
            });
            cVarE.a("styleRuns").c().forEach(new Consumer() { // from class: org.schabi.newpipe.extractor.services.youtube.d
                /* JADX WARN: Code duplicated, block: B:21:0x0053  */
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    String strQ;
                    com.grack.nanojson.c cVar = (com.grack.nanojson.c) obj;
                    switch (i3) {
                        case 0:
                            int iC = cVar.c("startIndex", -1);
                            int iC2 = cVar.c("length", 0);
                            if (iC >= 0 && iC2 >= 1) {
                                int i4 = iC2 + iC;
                                boolean zContainsKey = cVar.containsKey("strikethrough");
                                ArrayList arrayList4 = arrayList2;
                                ArrayList arrayList5 = arrayList3;
                                if (zContainsKey) {
                                    arrayList4.add(new e(iC, "<s>", "</s>", null));
                                    arrayList5.add(new e(i4, "<s>", "</s>", null));
                                }
                                if (cVar.b("italic")) {
                                    arrayList4.add(new e(iC, "<i>", "</i>", null));
                                    arrayList5.add(new e(i4, "<i>", "</i>", null));
                                }
                                if (cVar.containsKey("weightLabel") && !"FONT_WEIGHT_NORMAL".equals(cVar.f("weightLabel", null))) {
                                    arrayList4.add(new e(iC, "<b>", "</b>", null));
                                    arrayList5.add(new e(i4, "<b>", "</b>", null));
                                    break;
                                }
                            }
                            break;
                        default:
                            com.grack.nanojson.c cVarE2 = cVar.e("onTap").e("innertubeCommand");
                            int iC3 = cVar.c("startIndex", -1);
                            boolean z = false;
                            int iC4 = cVar.c("length", 0);
                            if (iC3 >= 0 && iC4 >= 1 && (strQ = i.q(cVarE2)) != null) {
                                try {
                                    URL url = new URL(strQ);
                                    if (i.x(url)) {
                                        z = true;
                                    } else {
                                        String host = url.getHost();
                                        if (host.equalsIgnoreCase("www.youtube-nocookie.com") || host.equalsIgnoreCase("youtu.be")) {
                                            z = true;
                                        }
                                    }
                                } catch (MalformedURLException unused) {
                                }
                                String strQ2 = androidx.privacysandbox.ads.adservices.java.internal.a.q("<a href=\"", org.jsoup.nodes.l.d(strQ), "\">");
                                String strReplaceFirst = cVar.e("onTapOptions").e("accessibilityInfo").f("accessibilityLabel", "").replaceFirst(" Channel Link", "");
                                Function bVar = (z || strReplaceFirst.isEmpty() || strReplaceFirst.startsWith("YouTube: ")) ? new b(6) : new org.schabi.newpipe.extractor.services.bandcamp.extractors.a(strReplaceFirst, 4);
                                arrayList2.add(new e(iC3, strQ2, "</a>", bVar));
                                arrayList3.add(new e(iC3 + iC4, strQ2, "</a>", bVar));
                                break;
                            }
                            break;
                    }
                }
            });
            Collections.sort(arrayList2, Comparator.comparingInt(new org.jsoup.select.a(1)));
            Collections.sort(arrayList3, Comparator.comparingInt(new org.jsoup.select.a(2)));
            String strReplace2 = strF.replace((char) 160, ' ');
            Stack stack = new Stack();
            Stack stack2 = new Stack();
            StringBuilder sb = new StringBuilder();
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (i4 < arrayList3.size()) {
                int iMin = i6 < arrayList2.size() ? Math.min(((org.schabi.newpipe.extractor.services.youtube.e) arrayList3.get(i4)).c, ((org.schabi.newpipe.extractor.services.youtube.e) arrayList2.get(i6)).c) : ((org.schabi.newpipe.extractor.services.youtube.e) arrayList3.get(i4)).c;
                sb.append(org.jsoup.nodes.l.d(strReplace2.substring(i5, iMin)));
                if (((org.schabi.newpipe.extractor.services.youtube.e) arrayList3.get(i4)).c == iMin) {
                    org.schabi.newpipe.extractor.services.youtube.e eVar = (org.schabi.newpipe.extractor.services.youtube.e) arrayList3.get(i4);
                    i4++;
                    while (true) {
                        if (stack.empty()) {
                            arrayList = arrayList3;
                            break;
                        }
                        org.schabi.newpipe.extractor.services.youtube.e eVar2 = (org.schabi.newpipe.extractor.services.youtube.e) stack.pop();
                        String str = eVar2.a;
                        String str2 = eVar2.b;
                        Function function = eVar2.d;
                        arrayList = arrayList3;
                        if (str.equals(eVar.a)) {
                            if (function != null && (i = eVar2.e) >= 0) {
                                sb.replace(i, sb.length(), (String) function.apply(sb.substring(eVar2.e)));
                            }
                            sb.append(str2);
                            break;
                        }
                        sb.append(str2);
                        stack2.push(eVar2);
                        arrayList3 = arrayList;
                    }
                    while (!stack2.empty()) {
                        org.schabi.newpipe.extractor.services.youtube.e eVar3 = (org.schabi.newpipe.extractor.services.youtube.e) stack2.pop();
                        sb.append(eVar3.a);
                        stack.push(eVar3);
                    }
                } else {
                    arrayList = arrayList3;
                    org.schabi.newpipe.extractor.services.youtube.e eVar4 = (org.schabi.newpipe.extractor.services.youtube.e) arrayList2.get(i6);
                    sb.append(eVar4.a);
                    eVar4.e = sb.length();
                    stack.push(eVar4);
                    i6++;
                }
                i5 = iMin;
                arrayList3 = arrayList;
            }
            sb.append(org.jsoup.nodes.l.d(strReplace2.substring(i5)));
            strReplace = sb.toString().replace("\n", "<br>").replace("  ", " &nbsp;");
        }
        if (!org.schabi.newpipe.extractor.utils.f.h(strReplace)) {
            return new org.schabi.newpipe.extractor.stream.c(strReplace, 1);
        }
        String strF2 = this.e.e("videoDetails").f("shortDescription", null);
        if (strF2 == null) {
            strF2 = org.schabi.newpipe.extractor.services.youtube.i.n(this.k.e("description"), false);
        }
        return new org.schabi.newpipe.extractor.stream.c(strF2, 3);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String j() {
        try {
            return org.schabi.newpipe.extractor.services.youtube.i.n(this.e.e("playabilityStatus").e("errorScreen").e("playerErrorMessageRenderer").e("reason"), false);
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void l() throws org.schabi.newpipe.extractor.exceptions.d {
        String str = "playerLiveStoryboardSpecRenderer";
        try {
            com.grack.nanojson.c cVarE = this.e.e("storyboards");
            if (!cVarE.containsKey("playerLiveStoryboardSpecRenderer")) {
                str = "playerStoryboardSpecRenderer";
            }
            String strF = cVarE.e(str).f("spec", null);
            if (strF == null) {
                List list = Collections.EMPTY_LIST;
                return;
            }
            String[] strArrSplit = strF.split("\\|");
            String str2 = strArrSplit[0];
            ArrayList arrayList = new ArrayList(strArrSplit.length - 1);
            for (int i = 1; i < strArrSplit.length; i++) {
                String[] strArrSplit2 = strArrSplit[i].split("#");
                if (strArrSplit2.length == 8 && Integer.parseInt(strArrSplit2[5]) != 0) {
                    int i2 = Integer.parseInt(strArrSplit2[2]);
                    int i3 = Integer.parseInt(strArrSplit2[3]);
                    int i4 = Integer.parseInt(strArrSplit2[4]);
                    String str3 = str2.replace("$L", String.valueOf(i - 1)).replace("$N", strArrSplit2[6]) + "&sigh=" + strArrSplit2[7];
                    if (str3.contains("$M")) {
                        int iCeil = (int) Math.ceil(((double) i2) / ((double) (i3 * i4)));
                        ArrayList arrayList2 = new ArrayList(iCeil);
                        for (int i5 = 0; i5 < iCeil; i5++) {
                            arrayList2.add(str3.replace("$M", String.valueOf(i5)));
                        }
                    } else {
                        Collections.singletonList(str3);
                    }
                    Integer.parseInt(strArrSplit2[0]);
                    Integer.parseInt(strArrSplit2[1]);
                    Integer.parseInt(strArrSplit2[5]);
                    arrayList.add(new org.schabi.newpipe.extractor.stream.d());
                }
            }
        } catch (Exception e) {
            throw new org.schabi.newpipe.extractor.exceptions.d("Could not get frames", e);
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String m() {
        a();
        Object[] objArr = {new org.schabi.newpipe.extractor.utils.c(this.g, null), new org.schabi.newpipe.extractor.utils.c(null, null), new org.schabi.newpipe.extractor.utils.c(this.h, null)};
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        return a0("hls", "", Collections.unmodifiableList(arrayList));
    }

    @Override // org.schabi.newpipe.extractor.f
    public final long r() throws org.schabi.newpipe.extractor.exceptions.f {
        a();
        String str = null;
        try {
            return Long.parseLong(this.e.e("videoDetails").f("lengthSeconds", null));
        } catch (Exception unused) {
            Iterator it = Arrays.asList(this.h, null).iterator();
            while (it.hasNext()) {
                com.grack.nanojson.b bVarA = ((com.grack.nanojson.c) it.next()).a("adaptiveFormats");
                if (!bVarA.isEmpty()) {
                    try {
                        return Math.round(Long.parseLong(bVarA.b(0).f("approxDurationMs", str)) / 1000.0f);
                    } catch (NumberFormatException unused2) {
                        continue;
                    }
                }
            }
            org.mozilla.javascript.typedarrays.c.b("Could not get duration");
            return 0L;
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void s() {
        com.grack.nanojson.c cVarE = d0().e("metadataRowContainer").e("metadataRowContainerRenderer").a("rows").b(0).e("metadataRowRenderer");
        if (org.schabi.newpipe.extractor.services.youtube.i.n(cVarE.a("contents").b(0), false) != null) {
            "Licence".equals(org.schabi.newpipe.extractor.services.youtube.i.n(cVarE.e("title"), false));
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void t() throws org.schabi.newpipe.extractor.exceptions.f {
        a();
        if (this.e.e("videoDetails").b("allowRatings")) {
            com.grack.nanojson.b bVarA = c0().e("videoActions").e("menuRenderer").a("topLevelButtons");
            try {
                try {
                    g0(bVarA);
                } catch (org.schabi.newpipe.extractor.exceptions.f unused) {
                    f0(bVarA);
                }
            } catch (org.schabi.newpipe.extractor.exceptions.f e) {
                org.mozilla.javascript.typedarrays.c.d("Could not get like count", e);
            }
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List u() {
        return kotlin.collections.a0.q(this.f.e("contents").e("twoColumnWatchNextResults").e("results").e("results").a("contents"));
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String v() throws org.schabi.newpipe.extractor.exceptions.f {
        a();
        String strF = this.e.e("videoDetails").f("title", null);
        if (!org.schabi.newpipe.extractor.utils.f.h(strF)) {
            return strF;
        }
        String strN = org.schabi.newpipe.extractor.services.youtube.i.n(c0().e("title"), false);
        if (!org.schabi.newpipe.extractor.utils.f.h(strN)) {
            return strN;
        }
        org.mozilla.javascript.typedarrays.c.b("Could not get name");
        return null;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void y() {
        if (this.k.b("isUnlisted")) {
            return;
        }
        c0().a("badges").c().anyMatch(new com.grack.nanojson.a(29));
    }

    @Override // org.schabi.newpipe.extractor.f
    public final androidx.emoji2.text.g z() throws org.schabi.newpipe.extractor.exceptions.f {
        a();
        if (c() != 0) {
            return null;
        }
        try {
            org.schabi.newpipe.extractor.j jVar = new org.schabi.newpipe.extractor.j(this.a.y);
            this.f.e("contents").e("twoColumnWatchNextResults").e("secondaryResults").e("secondaryResults").a("results").c().map(new g(K(), 1)).filter(new com.grack.nanojson.a(27)).forEach(new x0(jVar, 8));
            return jVar;
        } catch (Exception e) {
            org.mozilla.javascript.typedarrays.c.d("Could not get related videos", e);
            return null;
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void q() {
    }
}
