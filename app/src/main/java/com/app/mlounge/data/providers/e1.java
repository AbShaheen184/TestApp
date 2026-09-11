package com.app.mlounge.data.providers;

import android.content.Context;
import com.app.mlounge.data.remote.model.EpornerResolveResponse;
import com.app.mlounge.data.remote.model.EpornerSearchDetails;
import com.app.mlounge.data.remote.model.EpornerSourceDetail;
import com.app.mlounge.data.remote.model.EpornerThumb;
import com.app.mlounge.data.remote.model.EpornerVideo;
import com.app.mlounge.data.remote.model.EpornerVideoDetail;
import com.app.mlounge.emulator.LibretroCore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 {
    public static final int $stable = 8;
    private static final String BASE = "https://noodlemagazine.com";
    private static final String TAG = "NoodleMag";
    private static final String UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/150.0.0.0 Safari/537.36";
    private final Context appContext;
    private final okhttp3.y client;
    private final w0 cookieJar;
    private final com.google.gson.f gson;
    private final Map<String, String> headers;
    private boolean webViewWarmedUp;
    public static final v0 Companion = new v0();
    private static final List<String> CATEGORIES = com.google.common.base.c.q("4K Ultra HD", "60 FPS", "Amateur", "Anal", "Asian", "ASMR", "BBW", "BDSM", "Big Ass", "Big Dick", "Big Tits", "Bisexual", "Blonde", "Blowjob", "Bondage", "Brunette", "Bukkake", "Creampie", "Cumshot", "Double Penetration", "Ebony", "Fat", "Fetish", "Fisting", "Footjob", "For Women", "Gay", "German", "Gonzo", "Group sex", "Hairy", "Handjob", "Hardcore", "HD Porn", "Hentai", "Indian", "Interracial", "Japanese", "Latina", "Lesbian", "Lingerie", "Massage", "Masturbation", "Mature", "MILF", "Office", "Old/Young", "Orgasm", "Orgy", "Outdoor", "Parody", "Party", "POV", "Public", "Pussy licking", "Reality", "Redhead", "Shemale", "Sleep", "Small Tits", "Squirt", "Striptease", "Students", "Swinger", "Teen", "Threesome", "Toys", "Uncategorized", "Uniform", "Vintage", "VR Porn", "Webcam");

    public e1(Context context, okhttp3.y yVar) {
        this.appContext = context;
        w0 w0Var = new w0();
        this.cookieJar = w0Var;
        okhttp3.x xVarA = yVar.a();
        xVarA.k = w0Var;
        this.client = new okhttp3.y(xVarA);
        this.gson = new com.google.gson.f();
        this.headers = kotlin.collections.a0.v(new kotlin.k("User-Agent", UA), new kotlin.k("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8"), new kotlin.k("Accept-Language", "en-US,en;q=0.5"), new kotlin.k("Sec-Fetch-Dest", "document"), new kotlin.k("Sec-Fetch-Mode", "navigate"), new kotlin.k("Sec-Fetch-Site", "none"), new kotlin.k("Sec-Fetch-User", "?1"), new kotlin.k("Upgrade-Insecure-Requests", "1"));
    }

    public final String d(String str) {
        okhttp3.a0 a0Var = new okhttp3.a0();
        a0Var.d(str);
        for (Map.Entry<String, String> entry : this.headers.entrySet()) {
            a0Var.a(entry.getKey(), entry.getValue());
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

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object e(String str, kotlin.coroutines.jvm.internal.c cVar) {
        x0 x0Var;
        String str2;
        kotlin.text.g gVarQ;
        String str3;
        String string;
        String str4;
        if (cVar instanceof x0) {
            x0Var = (x0) cVar;
            int i = x0Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                x0Var.label = i - Integer.MIN_VALUE;
            } else {
                x0Var = new x0(this, cVar);
            }
        } else {
            x0Var = new x0(this, cVar);
        }
        Object obj = x0Var.result;
        int i2 = x0Var.label;
        if (i2 == 0) {
            kotlin.a.e(obj);
            str2 = str;
            x0Var.L$0 = str2;
            x0Var.label = 1;
            Object objH = h(x0Var);
            Object obj2 = kotlin.coroutines.intrinsics.a.e;
            if (objH == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str5 = (String) x0Var.L$0;
            kotlin.a.e(obj);
            str2 = str5;
        }
        String strJ0 = kotlin.text.k.j0(str2, "noodle_");
        String strConcat = "https://noodlemagazine.com/watch/".concat(strJ0);
        kotlin.o oVar = com.app.mlounge.util.a.a;
        String strD = d(strConcat);
        if (strD == null || (gVarQ = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.q("<title>([^<]+)", 0, strD, strD)) == null || (str3 = (String) ((kotlin.collections.b0) gVarQ.a()).get(1)) == null || (string = kotlin.text.k.A0(str3).toString()) == null) {
            return null;
        }
        kotlin.text.g gVarQ2 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.q("<meta\\s+property=\"og:image\"\\s+content=\"([^\"]+)", 0, strD, strD);
        if (gVarQ2 == null || (str4 = (String) ((kotlin.collections.b0) gVarQ2.a()).get(1)) == null) {
            str4 = "";
        }
        return new EpornerVideoDetail("noodle_".concat(strJ0), string, null, null, null, null, null, str4.length() > 0 ? new EpornerThumb(str4, null, null) : null, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(String str, kotlin.coroutines.jvm.internal.c cVar) {
        y0 y0Var;
        String str2;
        com.google.gson.g gVarN;
        EpornerSourceDetail epornerSourceDetail;
        String strH;
        com.google.gson.h hVarL;
        String strH2;
        String strH3;
        if (cVar instanceof y0) {
            y0Var = (y0) cVar;
            int i = y0Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                y0Var.label = i - Integer.MIN_VALUE;
            } else {
                y0Var = new y0(this, cVar);
            }
        } else {
            y0Var = new y0(this, cVar);
        }
        Object obj = y0Var.result;
        int i2 = y0Var.label;
        if (i2 == 0) {
            kotlin.a.e(obj);
            y0Var.L$0 = str;
            y0Var.label = 1;
            Object objH = h(y0Var);
            Object obj2 = kotlin.coroutines.intrinsics.a.e;
            if (objH == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) y0Var.L$0;
            kotlin.a.e(obj);
        }
        String strConcat = "https://noodlemagazine.com/watch/".concat(kotlin.text.k.j0(str, "noodle_"));
        kotlin.o oVar = com.app.mlounge.util.a.a;
        String strD = d(strConcat);
        if (strD != null) {
            kotlin.text.g gVarQ = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.q("window\\.playlist\\s*=\\s*(\\{[\\s\\S]+?\\});", 0, strD, strD);
            if (gVarQ == null || (str2 = (String) ((kotlin.collections.b0) gVarQ.a()).get(1)) == null) {
                com.app.mlounge.util.a.f(TAG, "extractVideoSources — window.playlist not found");
                return null;
            }
            try {
                com.google.gson.k kVar = (com.google.gson.k) this.gson.d(com.google.gson.k.class, str2);
                if (kVar != null && (gVarN = kVar.n("sources")) != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it = gVarN.e.iterator();
                    it.getClass();
                    boolean z = false;
                    while (true) {
                        String str3 = "mp4";
                        if (!it.hasNext()) {
                            break;
                        }
                        com.google.gson.k kVarE = ((com.google.gson.h) it.next()).e();
                        com.google.gson.h hVarL2 = kVarE.l("file");
                        if (hVarL2 != null && (strH = hVarL2.h()) != null && (hVarL = kVarE.l("label")) != null && (strH2 = hVarL.h()) != null) {
                            com.google.gson.h hVarL3 = kVarE.l("type");
                            if (hVarL3 != null && (strH3 = hVarL3.h()) != null) {
                                str3 = strH3;
                            }
                            com.google.gson.h hVarL4 = kVarE.l("default");
                            boolean zB = hVarL4 != null ? hVarL4.b() : false;
                            if (!z && zB) {
                                z = true;
                            }
                            String str4 = strH2 + "p";
                            linkedHashMap.put(str4, new EpornerSourceDetail(str4, strH, str3, Boolean.valueOf(zB)));
                        }
                    }
                    if (linkedHashMap.isEmpty()) {
                        com.app.mlounge.util.a.f(TAG, "extractVideoSources — no sources in playlist");
                        return null;
                    }
                    if (!z && (epornerSourceDetail = (EpornerSourceDetail) kotlin.collections.o.L(linkedHashMap.values())) != null) {
                        linkedHashMap.put(kotlin.collections.o.J(linkedHashMap.keySet()), EpornerSourceDetail.a(epornerSourceDetail));
                    }
                    Map mapSingletonMap = Collections.singletonMap("mp4", linkedHashMap);
                    mapSingletonMap.getClass();
                    return new EpornerResolveResponse(mapSingletonMap);
                }
            } catch (Exception e) {
                com.app.mlounge.util.a.b(TAG, "extractVideoSources — failed to parse playlist JSON", e);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object g(int i, String str, kotlin.coroutines.jvm.internal.c cVar) {
        z0 z0Var;
        String str2;
        int i2;
        List listP;
        Integer num;
        String str3;
        ArrayList arrayList;
        String str4;
        String string;
        String string2;
        Long lR;
        Long lValueOf;
        String str5;
        String string3;
        String str6;
        if (cVar instanceof z0) {
            z0Var = (z0) cVar;
            int i3 = z0Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                z0Var.label = i3 - Integer.MIN_VALUE;
            } else {
                z0Var = new z0(this, cVar);
            }
        } else {
            z0Var = new z0(this, cVar);
        }
        Object obj = z0Var.result;
        int i4 = z0Var.label;
        int i5 = 1;
        if (i4 == 0) {
            kotlin.a.e(obj);
            str2 = str;
            z0Var.L$0 = str2;
            i2 = i;
            z0Var.I$0 = i2;
            z0Var.label = 1;
            Object objH = h(z0Var);
            Object obj2 = kotlin.coroutines.intrinsics.a.e;
            if (objH == obj2) {
                return obj2;
            }
        } else {
            if (i4 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = z0Var.I$0;
            String str7 = (String) z0Var.L$0;
            kotlin.a.e(obj);
            str2 = str7;
        }
        String lowerCase = str2.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        boolean z = false;
        String strM = kotlin.text.r.M(kotlin.text.r.M(lowerCase, "/", "-", false), " ", "-", false);
        Pattern patternCompile = Pattern.compile("[^a-z0-9-]");
        patternCompile.getClass();
        String strReplaceAll = patternCompile.matcher(strM).replaceAll("");
        strReplaceAll.getClass();
        Pattern patternCompile2 = Pattern.compile("-+");
        patternCompile2.getClass();
        String strReplaceAll2 = patternCompile2.matcher(strReplaceAll).replaceAll("-");
        strReplaceAll2.getClass();
        char[] cArr = {'-'};
        int length = strReplaceAll2.length() - 1;
        int i6 = 0;
        byte b = false;
        while (i6 <= length) {
            boolean zY = kotlin.collections.n.y(strReplaceAll2.charAt(b == false ? i6 : length), cArr);
            if (b == true) {
                if (!zY) {
                    break;
                }
                length--;
            } else if (zY) {
                i6++;
            } else {
                b = true;
            }
        }
        String str8 = "https://noodlemagazine.com/video/" + strReplaceAll2.subSequence(i6, length + 1).toString() + "?p=" + i2;
        kotlin.o oVar = com.app.mlounge.util.a.a;
        String strD = d(str8);
        if (strD == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        Pattern patternCompile3 = Pattern.compile("<div\\s+class=\"item\">");
        patternCompile3.getClass();
        kotlin.text.k.m0(0);
        Matcher matcher = patternCompile3.matcher(strD);
        if (matcher.find()) {
            ArrayList arrayList3 = new ArrayList(10);
            int iEnd = 0;
            while (true) {
                arrayList3.add(strD.subSequence(iEnd, matcher.start()).toString());
                iEnd = matcher.end();
                if (!matcher.find()) {
                    break;
                }
                arrayList2 = arrayList2;
                i5 = i5;
            }
            arrayList3.add(strD.subSequence(iEnd, strD.length()).toString());
            listP = arrayList3;
        } else {
            listP = com.google.common.base.c.p(strD.toString());
        }
        Iterator it = kotlin.collections.o.H(listP).iterator();
        while (it.hasNext()) {
            String strV0 = kotlin.text.k.v0((String) it.next(), "</div>");
            kotlin.text.g gVarQ = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.q("href=\"/watch/([^\"]+)", z ? 1 : 0, strV0, strV0);
            if (gVarQ != null) {
                String str9 = (String) ((kotlin.collections.b0) gVarQ.a()).get(i5);
                kotlin.text.g gVarQ2 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.q("<img\\s[^>]*src=\"([^\"]+preview_[^\"]+)", z ? 1 : 0, strV0, strV0);
                if (gVarQ2 == null || (str3 = (String) ((kotlin.collections.b0) gVarQ2.a()).get(i5)) == null) {
                    str3 = "";
                }
                kotlin.text.g gVarQ3 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.q("alt=\"([^\"]{2,200})", z ? 1 : 0, strV0, strV0);
                if (gVarQ3 == null || (str4 = (String) ((kotlin.collections.b0) gVarQ3.a()).get(i5)) == null || (string = kotlin.text.k.A0(str4).toString()) == null) {
                    i5 = i5;
                    arrayList = arrayList2;
                    it = it;
                } else {
                    kotlin.text.g gVarQ4 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.q("m_views[^>]*>([^<]+)", z ? 1 : 0, strV0, strV0);
                    if (gVarQ4 == null || (str6 = (String) ((kotlin.collections.b0) gVarQ4.a()).get(i5)) == null || (string2 = kotlin.text.k.A0(str6).toString()) == null) {
                        string2 = "";
                    }
                    kotlin.text.g gVarQ5 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.q("m_time[^>]*>([^<]+)", z ? 1 : 0, strV0, strV0);
                    String str10 = (gVarQ5 == null || (str5 = (String) ((kotlin.collections.b0) gVarQ5.a()).get(i5)) == null || (string3 = kotlin.text.k.A0(str5).toString()) == null) ? "" : string3;
                    String strH = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("noodle_", str9);
                    String string4 = kotlin.text.k.A0(kotlin.text.r.M(string2, ",", "", z)).toString();
                    if (kotlin.text.r.H(string4, "M", z)) {
                        Double dG = kotlin.text.q.G(kotlin.text.k.k0(string4, "M"));
                        lValueOf = dG != null ? Long.valueOf((long) (((double) 1000000) * dG.doubleValue())) : null;
                        it = it;
                    } else {
                        i5 = i5;
                        arrayList2 = arrayList2;
                        if (kotlin.text.r.H(string4, "K", z)) {
                            Double dG2 = kotlin.text.q.G(kotlin.text.k.k0(string4, "K"));
                            if (dG2 != null) {
                                lR = Long.valueOf((long) (dG2.doubleValue() * ((double) 1000)));
                            } else {
                                it = it;
                                lValueOf = null;
                            }
                        } else {
                            lR = kotlin.text.r.R(string4);
                        }
                        lValueOf = lR;
                    }
                    arrayList = arrayList2;
                    arrayList.add(new EpornerVideo(strH, string, null, lValueOf, null, null, str10, str3.length() > 0 ? new EpornerThumb(str3, null, null) : null, null, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("https://noodlemagazine.com/watch/", str9)));
                }
                arrayList2 = arrayList;
                it = it;
                z = false;
                i5 = i5;
            }
        }
        int i7 = i5;
        ArrayList arrayList4 = arrayList2;
        Set setS = kotlin.sequences.k.s(kotlin.sequences.k.q(kotlin.text.i.b(new kotlin.text.i("\\?p=(\\d+)\"[^>]*>"), strD), new androidx.room.z(18)));
        Integer numValueOf = (setS.isEmpty() || (num = (Integer) kotlin.collections.o.U(setS)) == null) ? null : Integer.valueOf(num.intValue() + 1);
        kotlin.o oVar2 = com.app.mlounge.util.a.a;
        arrayList4.size();
        Integer num2 = new Integer(i2);
        int size = arrayList4.size();
        if (size < i7) {
            size = i7;
        }
        return new EpornerSearchDetails(null, numValueOf, num2, new Integer(size), arrayList4.isEmpty() ? null : arrayList4);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(kotlin.coroutines.jvm.internal.c cVar) {
        a1 a1Var;
        if (cVar instanceof a1) {
            a1Var = (a1) cVar;
            int i = a1Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                a1Var.label = i - Integer.MIN_VALUE;
            } else {
                a1Var = new a1(this, cVar);
            }
        } else {
            a1Var = new a1(this, cVar);
        }
        Object objWithContext = a1Var.result;
        int i2 = a1Var.label;
        kotlin.y yVar = kotlin.y.a;
        if (i2 == 0) {
            kotlin.a.e(objWithContext);
            if (this.webViewWarmedUp) {
                return yVar;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            d1 d1Var = new d1(this, null);
            a1Var.label = 1;
            objWithContext = BuildersKt.withContext(main, d1Var, a1Var);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objWithContext == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(objWithContext);
        }
        if (((Boolean) objWithContext).booleanValue()) {
            this.webViewWarmedUp = true;
        }
        kotlin.o oVar = com.app.mlounge.util.a.a;
        return yVar;
    }
}
