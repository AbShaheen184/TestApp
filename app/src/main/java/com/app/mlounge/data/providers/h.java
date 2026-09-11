package com.app.mlounge.data.providers;

import android.net.Uri;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final int $stable = 0;
    public static final h INSTANCE = new h();
    private static final String UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36";

    public static String a(h hVar, okhttp3.y yVar, String str) {
        String strZ;
        hVar.getClass();
        yVar.getClass();
        str.getClass();
        try {
            okhttp3.a0 a0Var = new okhttp3.a0();
            a0Var.d(str);
            a0Var.b("User-Agent", UA);
            a0Var.b("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8");
            a0Var.b("Accept-Language", "en-US,en;q=0.5");
            a0Var.b("Connection", "keep-alive");
            a0Var.b("Upgrade-Insecure-Requests", "1");
            a0Var.b("Sec-Fetch-Dest", "document");
            a0Var.b("Sec-Fetch-Mode", "navigate");
            a0Var.b("Sec-Fetch-Site", "none");
            a0Var.b("Sec-Fetch-User", "?1");
            if (!kotlin.text.k.d0("")) {
                a0Var.b("Referer", "");
            }
            okhttp3.g0 g0VarE = new okhttp3.internal.connection.m(yVar, new okhttp3.b0(a0Var), false).e();
            try {
                if (g0VarE.N) {
                    okhttp3.j0 j0Var = g0VarE.D;
                    if (j0Var != null) {
                        strZ = j0Var.z();
                    }
                    g0VarE.close();
                    return strZ;
                }
                kotlin.o oVar = com.app.mlounge.util.a.a;
                com.app.mlounge.util.a.a("CatalogHelper", "fetchPage HTTP " + g0VarE.A + ": " + str);
                strZ = null;
                g0VarE.close();
                return strZ;
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
            com.app.mlounge.util.a.a("CatalogHelper", "fetchPage exception for " + str + ": " + e.getMessage());
            return null;
        }
    }

    public final ArrayList b(okhttp3.y yVar, String str) {
        String string;
        String str2;
        String strM;
        String str3;
        yVar.getClass();
        str.getClass();
        ArrayList arrayList = new ArrayList();
        try {
            String strA = a(this, yVar, str);
            if (strA != null) {
                Pattern patternCompile = Pattern.compile("<a[^>]*id=\"downloadBtn\"[^>]*href=\"([^\"]+)\"");
                patternCompile.getClass();
                Matcher matcher = patternCompile.matcher(strA);
                matcher.getClass();
                kotlin.text.g gVarC = com.google.android.material.shape.k.C(matcher, 0, strA);
                if (gVarC != null) {
                    arrayList.add(new g((String) ((kotlin.collections.b0) gVarC.a()).get(1), "HubCloud"));
                    return arrayList;
                }
                Pattern patternCompile2 = Pattern.compile("id=\"download\"[^>]*href=\"([^\"]+)\"");
                patternCompile2.getClass();
                Matcher matcher2 = patternCompile2.matcher(strA);
                matcher2.getClass();
                kotlin.text.g gVarC2 = com.google.android.material.shape.k.C(matcher2, 0, strA);
                if (gVarC2 == null) {
                    Pattern patternCompile3 = Pattern.compile("href=\"([^\"]*(?:gamerxyt\\.com|hubcloud\\.php)[^\"]*)\"");
                    patternCompile3.getClass();
                    Matcher matcher3 = patternCompile3.matcher(strA);
                    matcher3.getClass();
                    gVarC2 = com.google.android.material.shape.k.C(matcher3, 0, strA);
                    if (gVarC2 == null) {
                    }
                }
                String str4 = (String) ((kotlin.collections.b0) gVarC2.a()).get(1);
                if (!kotlin.text.r.O(str4, "http", false)) {
                    Pattern patternCompile4 = Pattern.compile("(https?://[^/]+)");
                    patternCompile4.getClass();
                    Matcher matcher4 = patternCompile4.matcher(str);
                    matcher4.getClass();
                    kotlin.text.g gVarC3 = com.google.android.material.shape.k.C(matcher4, 0, str);
                    if (gVarC3 == null || (str3 = (String) ((kotlin.collections.b0) gVarC3.a()).get(1)) == null) {
                        str3 = "";
                    }
                    str4 = str3 + "/" + kotlin.text.k.D0(str4, '/');
                }
                try {
                    String strA2 = a(this, yVar, str4);
                    if (strA2 != null) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        androidx.collection.m0 m0Var = new androidx.collection.m0(kotlin.text.i.b(new kotlin.text.i("<a[^>]*href=\"([^\"]+)\"[^>]*class=\"[^\"]*btn[^\"]*\"[^>]*>([\\s\\S]*?)</a>", 0), strA2));
                        while (m0Var.hasNext()) {
                            kotlin.text.g gVar = (kotlin.text.g) m0Var.next();
                            String str5 = (String) ((kotlin.collections.b0) gVar.a()).get(1);
                            CharSequence charSequence = (CharSequence) ((kotlin.collections.b0) gVar.a()).get(2);
                            Pattern patternCompile5 = Pattern.compile("<[^>]+>");
                            patternCompile5.getClass();
                            charSequence.getClass();
                            String strReplaceAll = patternCompile5.matcher(charSequence).replaceAll("");
                            strReplaceAll.getClass();
                            String string2 = kotlin.text.k.A0(strReplaceAll).toString();
                            String lowerCase = string2.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                            if (kotlin.text.k.T(lowerCase, "download", false) && !kotlin.text.k.T(str5, "push-me", false) && !kotlin.text.k.T(str5, "winexch", false) && !kotlin.text.k.T(str5, "bonuscaf", false) && !kotlin.text.k.T(str5, "admaven", false) && !str5.equals("#")) {
                                if (kotlin.text.k.T(string2, "FSL", false)) {
                                    string = "FSL";
                                } else if (kotlin.text.k.T(string2, "10Gbps", false)) {
                                    string = "10Gbps";
                                } else if (kotlin.text.k.T(string2, "Pixeldrain", false) || kotlin.text.k.T(str5, "pixeldra", false)) {
                                    string = "Pixeldrain";
                                } else {
                                    Pattern patternCompile6 = Pattern.compile("\\[([^]]+)]");
                                    patternCompile6.getClass();
                                    Matcher matcher5 = patternCompile6.matcher(string2);
                                    matcher5.getClass();
                                    kotlin.text.g gVarC4 = com.google.android.material.shape.k.C(matcher5, 0, string2);
                                    if (gVarC4 == null || (str2 = (String) ((kotlin.collections.b0) gVarC4.a()).get(1)) == null || (string = kotlin.text.k.A0(str2).toString()) == null) {
                                        string = "CDN";
                                    }
                                }
                                if (kotlin.text.k.T(str5, "dl.php?link=", false)) {
                                    try {
                                        String queryParameter = Uri.parse(str5).getQueryParameter("link");
                                        if (queryParameter != null && !kotlin.text.k.d0(queryParameter)) {
                                            str5 = queryParameter;
                                        }
                                    } catch (Exception unused) {
                                    }
                                }
                                Pattern patternCompile7 = Pattern.compile("pixeldrain\\.(net|dev)/u/([a-zA-Z0-9]+)");
                                patternCompile7.getClass();
                                Matcher matcher6 = patternCompile7.matcher(str5);
                                matcher6.getClass();
                                kotlin.text.g gVarC5 = com.google.android.material.shape.k.C(matcher6, 0, str5);
                                if (gVarC5 != null) {
                                    str5 = "https://pixeldrain.dev/api/file/" + ((kotlin.collections.b0) gVarC5.a()).get(2) + "?download";
                                }
                                try {
                                    URI uri = new URI(str5);
                                    strM = new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), uri.getQuery(), uri.getFragment()).toASCIIString();
                                    strM.getClass();
                                } catch (Exception unused2) {
                                    strM = kotlin.text.r.M(str5, " ", "%20", false);
                                }
                                if (!linkedHashSet.contains(strM)) {
                                    linkedHashSet.add(strM);
                                    arrayList.add(new g(strM, string));
                                }
                            }
                        }
                        if (arrayList.isEmpty()) {
                            Pattern patternCompile8 = Pattern.compile("href=\"([^\"]*dl\\.php\\?link=([^\"&]+)[^\"]*)\"");
                            patternCompile8.getClass();
                            Matcher matcher7 = patternCompile8.matcher(strA2);
                            matcher7.getClass();
                            kotlin.text.g gVarC6 = com.google.android.material.shape.k.C(matcher7, 0, strA2);
                            if (gVarC6 != null) {
                                String strDecode = Uri.decode((String) ((kotlin.collections.b0) gVarC6.a()).get(2));
                                if (!linkedHashSet.contains(strDecode)) {
                                    strDecode.getClass();
                                    linkedHashSet.add(strDecode);
                                    arrayList.add(new g(strDecode, "Direct"));
                                }
                            }
                        }
                    }
                } catch (Exception unused3) {
                }
            }
        } catch (Exception unused4) {
        }
        return arrayList;
    }
}
