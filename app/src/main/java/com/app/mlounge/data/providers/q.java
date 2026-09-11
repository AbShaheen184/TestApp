package com.app.mlounge.data.providers;

import com.app.mlounge.data.remote.model.EpornerResolveResponse;
import com.app.mlounge.data.remote.model.EpornerSearchDetails;
import com.app.mlounge.data.remote.model.EpornerSourceDetail;
import com.app.mlounge.data.remote.model.EpornerThumb;
import com.app.mlounge.data.remote.model.EpornerVideo;
import com.app.mlounge.data.remote.model.EpornerVideoDetail;
import com.app.mlounge.emulator.LibretroCore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    public static final int $stable = 8;
    private static final String API_BASE = "https://www.eporner.com/api/v2";
    private static final String SITE = "https://www.eporner.com";
    private static final String TAG = "EpornerApi";
    private static final String UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:125.0) Gecko/20100101 Firefox/125.0";
    private final okhttp3.y client;
    private final p cookieJar;
    private final com.google.gson.f gson;
    private final Map<String, String> headers;
    public static final o Companion = new o();
    private static final List<String> CATEGORIES = com.google.common.base.c.q("4K Ultra HD", "60 FPS", "Amateur", "Anal", "Asian", "ASMR", "BBW", "BDSM", "Big Ass", "Big Dick", "Big Tits", "Bisexual", "Blonde", "Blowjob", "Bondage", "Brunette", "Bukkake", "Creampie", "Cumshot", "Double Penetration", "Ebony", "Fat", "Fetish", "Fisting", "Footjob", "For Women", "Gay", "German", "Gonzo", "Group sex", "Hairy", "Handjob", "Hardcore", "HD Porn", "Hentai", "Indian", "Interracial", "Japanese", "Latina", "Lesbian", "Lingerie", "Massage", "Masturbation", "Mature", "MILF", "Office", "Old/Young", "Orgasm", "Orgy", "Outdoor", "Parody", "Party", "POV", "Public", "Pussy licking", "Reality", "Redhead", "Shemale", "Sleep", "Small Tits", "Squirt", "Striptease", "Students", "Swinger", "Teen", "Threesome", "Toys", "Uncategorized", "Uniform", "Vintage", "VR Porn", "Webcam");
    private static final Map<String, String> CATEGORY_SLUG = kotlin.collections.a0.v(new kotlin.k("4K Ultra HD", "4k"), new kotlin.k("60 FPS", "60-fps"), new kotlin.k("HD Porn", "hd-porn"), new kotlin.k("Old/Young", "old-young"), new kotlin.k("Group sex", "group-sex"), new kotlin.k("Pussy licking", "pussy-licking"), new kotlin.k("VR Porn", "vr-porn"));

    public q(okhttp3.y yVar) {
        p pVar = new p();
        this.cookieJar = pVar;
        okhttp3.x xVarA = yVar.a();
        xVarA.k = pVar;
        this.client = new okhttp3.y(xVarA);
        this.gson = new com.google.gson.f();
        this.headers = kotlin.collections.a0.v(new kotlin.k("User-Agent", UA), new kotlin.k("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,application/json;q=0.8,*/*;q=0.7"), new kotlin.k("Accept-Language", "en-US,en;q=0.5"), new kotlin.k("Referer", "https://www.eporner.com/"));
    }

    public final String b(String str, String str2, Map map) {
        okhttp3.a0 a0Var = new okhttp3.a0();
        a0Var.d(str);
        for (Map.Entry<String, String> entry : this.headers.entrySet()) {
            a0Var.a(entry.getKey(), entry.getValue());
        }
        if (map != null) {
            for (Map.Entry entry2 : map.entrySet()) {
                a0Var.a((String) entry2.getKey(), (String) entry2.getValue());
            }
        }
        if (str2 != null) {
            a0Var.a("Referer", str2);
        }
        okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
        try {
            okhttp3.y yVar = this.client;
            yVar.getClass();
            okhttp3.g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
            try {
                String strZ = g0VarE.D.z();
                if (g0VarE.N) {
                    g0VarE.close();
                    return strZ;
                }
                kotlin.o oVar = com.app.mlounge.util.a.a;
                com.app.mlounge.util.a.f(TAG, "HTTP " + g0VarE.A + " for " + str + " — " + kotlin.text.k.y0(LibretroCore.SCREEN_WIDTH, strZ));
                g0VarE.close();
                return null;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    com.google.common.base.b.d(g0VarE, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            kotlin.o oVar2 = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.b(TAG, "Fetch failed for ".concat(str), e);
            return null;
        }
        kotlin.o oVar3 = com.app.mlounge.util.a.a;
        com.app.mlounge.util.a.b(TAG, "Fetch failed for ".concat(str), e);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00eb A[Catch: Exception -> 0x00da, TryCatch #1 {Exception -> 0x00da, blocks: (B:53:0x00c2, B:55:0x00ca, B:57:0x00d2, B:63:0x00e5, B:65:0x00eb, B:67:0x00f6, B:69:0x00fc, B:71:0x0107, B:73:0x0111, B:75:0x0119, B:76:0x0124, B:78:0x012a, B:80:0x013c, B:82:0x0144, B:86:0x0155, B:88:0x015b, B:90:0x0168, B:92:0x016e, B:94:0x0179, B:98:0x018b), top: B:105:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fc A[Catch: Exception -> 0x00da, TryCatch #1 {Exception -> 0x00da, blocks: (B:53:0x00c2, B:55:0x00ca, B:57:0x00d2, B:63:0x00e5, B:65:0x00eb, B:67:0x00f6, B:69:0x00fc, B:71:0x0107, B:73:0x0111, B:75:0x0119, B:76:0x0124, B:78:0x012a, B:80:0x013c, B:82:0x0144, B:86:0x0155, B:88:0x015b, B:90:0x0168, B:92:0x016e, B:94:0x0179, B:98:0x018b), top: B:105:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0105  */
    /* JADX WARN: Code duplicated, block: B:88:0x015b A[Catch: Exception -> 0x00da, TryCatch #1 {Exception -> 0x00da, blocks: (B:53:0x00c2, B:55:0x00ca, B:57:0x00d2, B:63:0x00e5, B:65:0x00eb, B:67:0x00f6, B:69:0x00fc, B:71:0x0107, B:73:0x0111, B:75:0x0119, B:76:0x0124, B:78:0x012a, B:80:0x013c, B:82:0x0144, B:86:0x0155, B:88:0x015b, B:90:0x0168, B:92:0x016e, B:94:0x0179, B:98:0x018b), top: B:105:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0166  */
    /* JADX WARN: Code duplicated, block: B:92:0x016e A[Catch: Exception -> 0x00da, TryCatch #1 {Exception -> 0x00da, blocks: (B:53:0x00c2, B:55:0x00ca, B:57:0x00d2, B:63:0x00e5, B:65:0x00eb, B:67:0x00f6, B:69:0x00fc, B:71:0x0107, B:73:0x0111, B:75:0x0119, B:76:0x0124, B:78:0x012a, B:80:0x013c, B:82:0x0144, B:86:0x0155, B:88:0x015b, B:90:0x0168, B:92:0x016e, B:94:0x0179, B:98:0x018b), top: B:105:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0177  */
    public final EpornerVideoDetail c(String str) {
        EpornerVideoDetail epornerVideoDetail;
        String strH;
        String strH2;
        String strH3;
        EpornerThumb epornerThumb;
        String str2;
        com.google.gson.h hVarL;
        Integer numValueOf;
        com.google.gson.h hVarL2;
        Integer numValueOf2;
        ArrayList arrayList;
        Iterator it;
        com.google.gson.h hVarL3;
        Integer numValueOf3;
        com.google.gson.h hVarL4;
        Integer numValueOf4;
        String strJ0 = str;
        if (kotlin.text.r.O(strJ0, "eporner_", false)) {
            strJ0 = kotlin.text.k.j0(strJ0, "eporner_");
        }
        String strQ = androidx.privacysandbox.ads.adservices.java.internal.a.q("https://www.eporner.com/api/v2/video/id/?id=", strJ0, "&thumbsize=big&format=json");
        kotlin.o oVar = com.app.mlounge.util.a.a;
        String strB = b(strQ, null, null);
        if (strB != null) {
            try {
                com.google.gson.k kVar = (com.google.gson.k) this.gson.d(com.google.gson.k.class, strB);
                if (kVar != null) {
                    com.google.gson.k kVarO = kVar.o("video");
                    if (kVarO != null) {
                        kVar = kVarO;
                    }
                    com.google.gson.h hVarL5 = kVar.l("id");
                    if (hVarL5 != null && (strH = hVarL5.h()) != null) {
                        com.google.gson.h hVarL6 = kVar.l("title");
                        if (hVarL6 == null || (strH2 = hVarL6.h()) == null) {
                            strH2 = "";
                        }
                        com.google.gson.h hVarL7 = kVar.l("keywords");
                        String strH4 = hVarL7 != null ? hVarL7.h() : null;
                        com.google.gson.h hVarL8 = kVar.l("views");
                        Long lValueOf = hVarL8 != null ? Long.valueOf(hVarL8.f()) : null;
                        com.google.gson.h hVarL9 = kVar.l("rate");
                        String strH5 = hVarL9 != null ? hVarL9.h() : null;
                        com.google.gson.h hVarL10 = kVar.l("added");
                        String strH6 = hVarL10 != null ? hVarL10.h() : null;
                        com.google.gson.h hVarL11 = kVar.l("length_min");
                        if (hVarL11 == null || (strH3 = hVarL11.h()) == null) {
                            strH3 = "";
                        }
                        com.google.gson.k kVarO2 = kVar.o("default_thumb");
                        epornerVideoDetail = null;
                        if (kVarO2 != null) {
                            try {
                                com.google.gson.h hVarL12 = kVarO2.l("src");
                                if (hVarL12 != null) {
                                    str2 = strH2;
                                    String strH7 = hVarL12.h();
                                    String strM = strH7 != null ? kotlin.text.r.M(strH7, "\\/", "/", false) : null;
                                    hVarL = kVarO2.l("width");
                                    if (hVarL != null) {
                                        numValueOf = Integer.valueOf(hVarL.c());
                                    } else {
                                        numValueOf = null;
                                    }
                                    hVarL2 = kVarO2.l("height");
                                    if (hVarL2 != null) {
                                        numValueOf2 = Integer.valueOf(hVarL2.c());
                                    } else {
                                        numValueOf2 = null;
                                    }
                                    epornerThumb = new EpornerThumb(strM, numValueOf, numValueOf2);
                                } else {
                                    str2 = strH2;
                                }
                                hVarL = kVarO2.l("width");
                                if (hVarL != null) {
                                    numValueOf = Integer.valueOf(hVarL.c());
                                } else {
                                    numValueOf = null;
                                }
                                hVarL2 = kVarO2.l("height");
                                if (hVarL2 != null) {
                                    numValueOf2 = Integer.valueOf(hVarL2.c());
                                } else {
                                    numValueOf2 = null;
                                }
                                epornerThumb = new EpornerThumb(strM, numValueOf, numValueOf2);
                            } catch (Exception e) {
                                e = e;
                                com.app.mlounge.util.a.b(TAG, "parseDetailResponse failed", e);
                                return epornerVideoDetail;
                            }
                        } else {
                            str2 = strH2;
                            strH4 = strH4;
                            epornerThumb = null;
                        }
                        com.google.gson.g gVarN = kVar.n("thumbs");
                        if (gVarN != null) {
                            ArrayList arrayList2 = new ArrayList();
                            for (Iterator it2 = gVarN.e.iterator(); it2.hasNext(); it2 = it) {
                                com.google.gson.k kVarE = ((com.google.gson.h) it2.next()).e();
                                com.google.gson.h hVarL13 = kVarE.l("src");
                                if (hVarL13 != null) {
                                    it = it2;
                                    String strH8 = hVarL13.h();
                                    String strM2 = strH8 != null ? kotlin.text.r.M(strH8, "\\/", "/", false) : null;
                                    hVarL3 = kVarE.l("width");
                                    if (hVarL3 != null) {
                                        numValueOf3 = Integer.valueOf(hVarL3.c());
                                    } else {
                                        numValueOf3 = null;
                                    }
                                    hVarL4 = kVarE.l("height");
                                    if (hVarL4 != null) {
                                        numValueOf4 = Integer.valueOf(hVarL4.c());
                                    } else {
                                        numValueOf4 = null;
                                    }
                                    arrayList2.add(new EpornerThumb(strM2, numValueOf3, numValueOf4));
                                    epornerThumb = epornerThumb;
                                } else {
                                    it = it2;
                                }
                                hVarL3 = kVarE.l("width");
                                if (hVarL3 != null) {
                                    numValueOf3 = Integer.valueOf(hVarL3.c());
                                } else {
                                    numValueOf3 = null;
                                }
                                hVarL4 = kVarE.l("height");
                                if (hVarL4 != null) {
                                    numValueOf4 = Integer.valueOf(hVarL4.c());
                                } else {
                                    numValueOf4 = null;
                                }
                                arrayList2.add(new EpornerThumb(strM2, numValueOf3, numValueOf4));
                                epornerThumb = epornerThumb;
                            }
                            arrayList = arrayList2;
                        } else {
                            arrayList = null;
                        }
                        return new EpornerVideoDetail("eporner_" + strH, str2, strH4, lValueOf, strH5, strH6, strH3, epornerThumb, arrayList);
                    }
                }
            } catch (Exception e2) {
                e = e2;
                epornerVideoDetail = null;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final EpornerResolveResponse d(String str) {
        String strR;
        EpornerResolveResponse epornerResolveResponse;
        com.google.gson.k kVarO;
        EpornerResolveResponse epornerResolveResponse2;
        String strH;
        String strH2;
        String strJ0 = str;
        strJ0.getClass();
        if (kotlin.text.r.O(strJ0, "eporner_", false)) {
            strJ0 = kotlin.text.k.j0(strJ0, "eporner_");
        }
        String str2 = strJ0;
        kotlin.o oVar = com.app.mlounge.util.a.a;
        EpornerResolveResponse epornerResolveResponse3 = null;
        b("https://www.eporner.com/", null, null);
        String strU = androidx.privacysandbox.ads.adservices.java.internal.a.u(new StringBuilder("https://www.eporner.com/embed/"), str2, "/");
        String strB = b(strU, null, null);
        if (strB != null) {
            kotlin.text.g gVarQ = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.q("EP\\.video\\.player\\.hash\\s*=\\s*'([a-f0-9]+)'", 0, strB, strB);
            String str3 = gVarQ != null ? (String) ((kotlin.collections.b0) gVarQ.a()).get(1) : null;
            if (str3 == null || str3.length() != 32) {
                com.app.mlounge.util.a.f(TAG, "extractHash — no 32-char hex hash found in embed HTML");
                strR = null;
            } else {
                strR = kotlin.collections.o.R(new kotlin.ranges.d(0, 3, 1), "", null, null, new androidx.compose.material3.r0(str3, 11), 30);
            }
            if (strR == null) {
                com.app.mlounge.util.a.f(TAG, "resolveVideo: hash not found in embed page for ".concat(str2));
                return null;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringBuilder sbO = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.o("https://www.eporner.com/xhr/video/", str2, "?hash=", strR, "&domain=www.eporner.com&pixelRatio=1&playerWidth=0&playerHeight=0&fallback=false&embed=true&supportedFormats=hls,dash,h265,vp9,av1,mp4&_=");
            sbO.append(jCurrentTimeMillis);
            String strB2 = b(sbO.toString(), strU, kotlin.collections.a0.v(new kotlin.k("Accept", "application/json, text/plain, */*"), new kotlin.k("Origin", SITE), new kotlin.k("X-Requested-With", "XMLHttpRequest")));
            if (strB2 != null) {
                try {
                    com.google.gson.k kVar = (com.google.gson.k) this.gson.d(com.google.gson.k.class, strB2);
                    if (kVar != null && (kVarO = kVar.o("sources")) != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        com.google.gson.k kVarO2 = kVarO.o("mp4");
                        if (kVarO2 != null) {
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            Iterator it = ((com.google.gson.internal.l) kVarO2.e.keySet()).iterator();
                            while (((com.google.gson.internal.k) it).hasNext()) {
                                String str4 = (String) ((com.google.gson.internal.k) it).c().C;
                                com.google.gson.k kVarO3 = kVarO2.o(str4);
                                if (kVarO3 != null) {
                                    epornerResolveResponse = epornerResolveResponse3;
                                    try {
                                        com.google.gson.h hVarL = kVarO3.l("labelShort");
                                        String str5 = (hVarL == null || (strH2 = hVarL.h()) == null) ? str4 : strH2;
                                        com.google.gson.h hVarL2 = kVarO3.l("src");
                                        String strH3 = hVarL2 != null ? hVarL2.h() : epornerResolveResponse;
                                        com.google.gson.h hVarL3 = kVarO3.l("default");
                                        linkedHashMap2.put(str4, new EpornerSourceDetail(str5, strH3, "mp4", Boolean.valueOf(hVarL3 != null ? hVarL3.b() : false)));
                                        epornerResolveResponse3 = epornerResolveResponse;
                                        kVarO2 = kVarO2;
                                    } catch (Exception e) {
                                        e = e;
                                        kotlin.o oVar2 = com.app.mlounge.util.a.a;
                                        com.app.mlounge.util.a.b(TAG, "parseXhrResponse failed for ".concat(str2), e);
                                        return epornerResolveResponse;
                                    }
                                }
                            }
                            epornerResolveResponse2 = epornerResolveResponse3;
                            if (!linkedHashMap2.isEmpty()) {
                                linkedHashMap.put("mp4", linkedHashMap2);
                            }
                        } else {
                            epornerResolveResponse2 = null;
                        }
                        com.google.gson.k kVarO4 = kVarO.o("hls");
                        if (kVarO4 != null) {
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                            Iterator it2 = ((com.google.gson.internal.l) kVarO4.e.keySet()).iterator();
                            while (((com.google.gson.internal.k) it2).hasNext()) {
                                String str6 = (String) ((com.google.gson.internal.k) it2).c().C;
                                com.google.gson.k kVarO5 = kVarO4.o(str6);
                                if (kVarO5 != null) {
                                    com.google.gson.h hVarL4 = kVarO5.l("labelShort");
                                    if (hVarL4 == null || (strH = hVarL4.h()) == null) {
                                        strH = str6;
                                    }
                                    com.google.gson.h hVarL5 = kVarO5.l("src");
                                    String strH4 = hVarL5 != null ? hVarL5.h() : epornerResolveResponse2;
                                    com.google.gson.h hVarL6 = kVarO5.l("default");
                                    linkedHashMap3.put(str6, new EpornerSourceDetail(strH, strH4, "hls", Boolean.valueOf(hVarL6 != null ? hVarL6.b() : false)));
                                }
                            }
                            if (!linkedHashMap3.isEmpty()) {
                                linkedHashMap.put("hls", linkedHashMap3);
                            }
                        }
                        if (!linkedHashMap.isEmpty()) {
                            return new EpornerResolveResponse(linkedHashMap);
                        }
                        kotlin.o oVar3 = com.app.mlounge.util.a.a;
                        com.app.mlounge.util.a.f(TAG, "parseXhrResponse — no sources in XHR response for " + str2);
                        return epornerResolveResponse2;
                    }
                } catch (Exception e2) {
                    e = e2;
                    epornerResolveResponse = epornerResolveResponse3;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2, types: [com.app.mlounge.data.remote.model.EpornerThumb] */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v2 */
    public final EpornerSearchDetails e(int i, String str) {
        EpornerSearchDetails epornerSearchDetails;
        com.google.gson.g gVarN;
        Object epornerVideo;
        String strH;
        ?? epornerThumb;
        String strH2;
        ?? r20;
        String strH3;
        String strH4;
        String strH5;
        String strH6;
        str.getClass();
        String strM = CATEGORY_SLUG.get(str);
        boolean z = false;
        if (strM == null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            strM = kotlin.text.r.M(lowerCase, " ", "-", false);
        }
        String str2 = "https://www.eporner.com/api/v2/video/search/?query=" + strM + "&per_page=30&page=" + i + "&thumbsize=big&order=&format=json";
        kotlin.o oVar = com.app.mlounge.util.a.a;
        EpornerSearchDetails epornerSearchDetails2 = null;
        String strB = b(str2, null, null);
        if (strB != null) {
            try {
                com.google.gson.k kVar = (com.google.gson.k) this.gson.d(com.google.gson.k.class, strB);
                if (kVar != null && (gVarN = kVar.n("videos")) != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = gVarN.e.iterator();
                    while (it.hasNext()) {
                        com.google.gson.k kVarE = ((com.google.gson.h) it.next()).e();
                        com.google.gson.h hVarL = kVarE.l("id");
                        if (hVarL == null || (strH = hVarL.h()) == null) {
                            epornerSearchDetails = epornerSearchDetails2;
                            it = it;
                            epornerVideo = epornerSearchDetails;
                        } else {
                            com.google.gson.h hVarL2 = kVarE.l("title");
                            String str3 = (hVarL2 == null || (strH6 = hVarL2.h()) == null) ? "" : strH6;
                            com.google.gson.h hVarL3 = kVarE.l("keywords");
                            ?? H = hVarL3 != null ? hVarL3.h() : epornerSearchDetails2;
                            com.google.gson.h hVarL4 = kVarE.l("views");
                            ?? ValueOf = hVarL4 != null ? Long.valueOf(hVarL4.f()) : epornerSearchDetails2;
                            com.google.gson.h hVarL5 = kVarE.l("rate");
                            ?? H2 = hVarL5 != null ? hVarL5.h() : epornerSearchDetails2;
                            com.google.gson.h hVarL6 = kVarE.l("url");
                            ?? M = (hVarL6 == null || (strH5 = hVarL6.h()) == null) ? epornerSearchDetails2 : kotlin.text.r.M(strH5, "\\/", "/", z);
                            com.google.gson.h hVarL7 = kVarE.l("added");
                            ?? H3 = hVarL7 != null ? hVarL7.h() : epornerSearchDetails2;
                            com.google.gson.h hVarL8 = kVarE.l("length_min");
                            String str4 = (hVarL8 == null || (strH4 = hVarL8.h()) == null) ? "" : strH4;
                            com.google.gson.k kVarO = kVarE.o("default_thumb");
                            epornerSearchDetails = epornerSearchDetails2;
                            if (kVarO != null) {
                                try {
                                    com.google.gson.h hVarL9 = kVarO.l("src");
                                    ?? M2 = (hVarL9 == null || (strH2 = hVarL9.h()) == null) ? epornerSearchDetails : kotlin.text.r.M(strH2, "\\/", "/", false);
                                    com.google.gson.h hVarL10 = kVarO.l("width");
                                    ?? ValueOf2 = hVarL10 != null ? Integer.valueOf(hVarL10.c()) : epornerSearchDetails;
                                    com.google.gson.h hVarL11 = kVarO.l("height");
                                    epornerThumb = new EpornerThumb(M2, ValueOf2, hVarL11 != null ? Integer.valueOf(hVarL11.c()) : epornerSearchDetails);
                                } catch (Exception e) {
                                    e = e;
                                    com.app.mlounge.util.a.b(TAG, "parseSearchResponse failed", e);
                                    return epornerSearchDetails;
                                }
                            } else {
                                it = it;
                                epornerThumb = epornerSearchDetails;
                            }
                            com.google.gson.g gVarN2 = kVarE.n("thumbs");
                            if (gVarN2 != null) {
                                ArrayList arrayList2 = new ArrayList();
                                for (Iterator it2 = gVarN2.e.iterator(); it2.hasNext(); it2 = it2) {
                                    com.google.gson.k kVarE2 = ((com.google.gson.h) it2.next()).e();
                                    com.google.gson.h hVarL12 = kVarE2.l("src");
                                    ?? M3 = (hVarL12 == null || (strH3 = hVarL12.h()) == null) ? epornerSearchDetails : kotlin.text.r.M(strH3, "\\/", "/", false);
                                    com.google.gson.h hVarL13 = kVarE2.l("width");
                                    ?? ValueOf3 = hVarL13 != null ? Integer.valueOf(hVarL13.c()) : epornerSearchDetails;
                                    com.google.gson.h hVarL14 = kVarE2.l("height");
                                    arrayList2.add(new EpornerThumb(M3, ValueOf3, hVarL14 != null ? Integer.valueOf(hVarL14.c()) : epornerSearchDetails));
                                }
                                r20 = arrayList2;
                            } else {
                                r20 = epornerSearchDetails;
                            }
                            epornerVideo = new EpornerVideo("eporner_" + strH, str3, H, ValueOf, H2, H3, str4, epornerThumb, r20, M);
                        }
                        if (epornerVideo != null) {
                            arrayList.add(epornerVideo);
                        }
                        epornerSearchDetails2 = epornerSearchDetails;
                        it = it;
                        z = false;
                    }
                    epornerSearchDetails = epornerSearchDetails2;
                    com.google.gson.h hVarL15 = kVar.l("total_count");
                    ?? ValueOf4 = hVarL15 != null ? Integer.valueOf(hVarL15.c()) : epornerSearchDetails;
                    com.google.gson.h hVarL16 = kVar.l("total_pages");
                    ?? ValueOf5 = hVarL16 != null ? Integer.valueOf(hVarL16.c()) : epornerSearchDetails;
                    com.google.gson.h hVarL17 = kVar.l("page");
                    ?? ValueOf6 = hVarL17 != null ? Integer.valueOf(hVarL17.c()) : epornerSearchDetails;
                    com.google.gson.h hVarL18 = kVar.l("per_page");
                    return new EpornerSearchDetails(ValueOf4, ValueOf5, ValueOf6, hVarL18 != null ? Integer.valueOf(hVarL18.c()) : epornerSearchDetails, arrayList);
                }
            } catch (Exception e2) {
                e = e2;
                epornerSearchDetails = epornerSearchDetails2;
            }
        }
        return null;
    }
}
