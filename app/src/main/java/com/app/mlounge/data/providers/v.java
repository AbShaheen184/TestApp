package com.app.mlounge.data.providers;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements k0 {
    public static final int $stable = 8;
    private static final String BASE_URL = "https://4khdhub.one";
    public static final t Companion = new t();
    private static final String UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36";
    private final okhttp3.y client;
    private final l1 tmdbHelper;
    private final String name = "4KHDHub";
    private final long maxPageBodyLength = 5000000;

    public v(okhttp3.y yVar, l1 l1Var) {
        this.client = yVar;
        this.tmdbHelper = l1Var;
    }

    public static final String b(v vVar, String str) {
        vVar.getClass();
        if (kotlin.text.k.d0(str)) {
            return "Unknown";
        }
        Pattern patternCompile = Pattern.compile("(\\d{3,4})p", 66);
        patternCompile.getClass();
        Matcher matcher = patternCompile.matcher(str);
        matcher.getClass();
        kotlin.text.g gVarC = com.google.android.material.shape.k.C(matcher, 0, str);
        if (gVarC == null) {
            Pattern patternCompile2 = Pattern.compile("4K|UHD|2160", 66);
            patternCompile2.getClass();
            return patternCompile2.matcher(str).find() ? "2160p" : "Unknown";
        }
        Integer numQ = kotlin.text.r.Q((String) ((kotlin.collections.b0) gVarC.a()).get(1));
        if (numQ == null) {
            return "1080p";
        }
        int iIntValue = numQ.intValue();
        if (iIntValue >= 2160) {
            return "2160p";
        }
        if (iIntValue >= 1080) {
            return "1080p";
        }
        return iIntValue >= 720 ? "720p" : androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.d(iIntValue, "p");
    }

    /* JADX WARN: Code duplicated, block: B:69:0x01c1 A[Catch: Exception -> 0x004f, TryCatch #0 {Exception -> 0x004f, blocks: (B:3:0x000f, B:6:0x0016, B:20:0x0052, B:21:0x0081, B:23:0x0088, B:25:0x0094, B:28:0x00a4, B:38:0x00f6, B:41:0x00fe, B:42:0x0113, B:44:0x0119, B:46:0x015d, B:48:0x0163, B:50:0x016b, B:53:0x017d, B:55:0x0183, B:57:0x0190, B:60:0x0197, B:62:0x019f, B:64:0x01a7, B:68:0x01b8, B:69:0x01c1, B:70:0x01d2, B:32:0x00af, B:34:0x00c8, B:37:0x00d7, B:17:0x0049, B:9:0x002b, B:11:0x0035, B:14:0x003c), top: B:75:0x000f, inners: #1 }] */
    public static final List e(v vVar, String str, String str2) {
        int i;
        String str3;
        String str4;
        vVar.getClass();
        kotlin.collections.u uVar = kotlin.collections.u.e;
        try {
            kotlin.k kVarG = vVar.g(str, str2);
            if (kVarG == null) {
                return uVar;
            }
            String str5 = (String) kVarG.e;
            String str6 = (String) kVarG.y;
            if (kotlin.text.k.T(str6, "dl.php?link=", false)) {
                try {
                    String queryParameter = Uri.parse(str6).getQueryParameter("link");
                    if (queryParameter != null && !kotlin.text.k.d0(queryParameter)) {
                        kotlin.o oVar = com.app.mlounge.util.a.a;
                        return com.google.common.base.c.p(new kotlin.k(queryParameter, "Direct"));
                    }
                } catch (Exception e) {
                    kotlin.o oVar2 = com.app.mlounge.util.a.a;
                    e.getMessage();
                }
            }
            Iterator it = com.google.common.base.c.q(new kotlin.text.i("var\\s+url\\s*=\\s*'([^']+)'"), new kotlin.text.i("var\\s+url\\s*=\\s*\"([^\"]+)\""), new kotlin.text.i("'url'\\s*:\\s*'([^']+)'"), new kotlin.text.i("window\\.location\\.href\\s*=\\s*'([^']+)'"), new kotlin.text.i("<iframe[^>]+src=['\"]([^'\"]+)['\"]")).iterator();
            while (true) {
                i = 1;
                if (!it.hasNext()) {
                    str3 = null;
                    break;
                }
                kotlin.text.g gVarA = ((kotlin.text.i) it.next()).a(str5);
                if (gVarA != null) {
                    str3 = (String) ((kotlin.collections.b0) gVarA.a()).get(1);
                    break;
                }
            }
            if (str3 == null) {
                return uVar;
            }
            if (!kotlin.text.r.O(str3, "http", false)) {
                Pattern patternCompile = Pattern.compile("(https?://[^/]+)");
                patternCompile.getClass();
                str.getClass();
                Matcher matcher = patternCompile.matcher(str);
                matcher.getClass();
                kotlin.text.g gVarC = com.google.android.material.shape.k.C(matcher, 0, str);
                if (gVarC == null || (str4 = (String) ((kotlin.collections.b0) gVarC.a()).get(1)) == null) {
                    str4 = "";
                }
                str3 = str4 + "/" + kotlin.text.k.D0(str3, '/');
            }
            String strF = vVar.f(str3, str);
            if (strF == null) {
                return uVar;
            }
            ArrayList arrayList = new ArrayList();
            androidx.collection.m0 m0Var = new androidx.collection.m0(kotlin.text.i.b(new kotlin.text.i("<a[^>]*href=\"([^\"]+)\"[^>]*>([\\s\\S]*?)</a>", 0), strF));
            while (m0Var.hasNext()) {
                kotlin.text.g gVar = (kotlin.text.g) m0Var.next();
                String str7 = (String) ((kotlin.collections.b0) gVar.a()).get(i);
                CharSequence charSequence = (CharSequence) ((kotlin.collections.b0) gVar.a()).get(2);
                Pattern patternCompile2 = Pattern.compile("<[^>]+>");
                patternCompile2.getClass();
                charSequence.getClass();
                String strReplaceAll = patternCompile2.matcher(charSequence).replaceAll("");
                strReplaceAll.getClass();
                String string = kotlin.text.k.A0(strReplaceAll).toString();
                if (kotlin.text.r.O(str7, "http", false)) {
                    if (kotlin.text.k.T(string, "FSL", false) || kotlin.text.k.T(string, "Download File", false)) {
                        arrayList.add(new kotlin.k(str7, "FSL"));
                    } else {
                        Locale locale = Locale.ROOT;
                        String lowerCase = string.toLowerCase(locale);
                        lowerCase.getClass();
                        if (kotlin.text.k.T(lowerCase, "download", false)) {
                            arrayList.add(new kotlin.k(str7, "FSL"));
                        } else if (kotlin.text.k.T(string, "PixelServer", false)) {
                            arrayList.add(new kotlin.k(kotlin.text.r.M(str7, "/u/", "/api/file/", false), "PixelServer"));
                        } else {
                            String lowerCase2 = string.toLowerCase(locale);
                            lowerCase2.getClass();
                            if (kotlin.text.k.T(lowerCase2, "pixeldrain", false) || kotlin.text.k.T(str7, "pixeldrain", false)) {
                                arrayList.add(new kotlin.k(kotlin.text.r.M(str7, "/u/", "/api/file/", false), "PixelServer"));
                            } else if (kotlin.text.k.T(str7, "cdn", false) || kotlin.text.k.T(str7, "stream", false)) {
                                arrayList.add(new kotlin.k(str7, "Direct"));
                            } else {
                                String lowerCase3 = string.toLowerCase(locale);
                                lowerCase3.getClass();
                                if (kotlin.text.k.T(lowerCase3, "link", false)) {
                                    arrayList.add(new kotlin.k(str7, "Direct"));
                                }
                            }
                        }
                    }
                    i = 1;
                }
            }
            return arrayList;
        } catch (Exception e2) {
            kotlin.o oVar3 = com.app.mlounge.util.a.a;
            coil3.compose.internal.f.i("pixel resolver: ", e2.getMessage(), "4KHDHub");
            return uVar;
        }
    }

    @Override // com.app.mlounge.data.providers.k0
    public final Object a(String str, String str2, Integer num, Integer num2, kotlin.coroutines.jvm.internal.i iVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new u(this, str, str2, num, null), iVar);
    }

    public final String f(String str, String str2) {
        String strZ;
        okhttp3.j0 j0Var;
        try {
            okhttp3.a0 a0Var = new okhttp3.a0();
            a0Var.d(str);
            a0Var.b("User-Agent", UA);
            a0Var.b("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8");
            a0Var.b("Accept-Language", "en-US,en;q=0.5");
            if (!kotlin.text.k.d0(str2)) {
                a0Var.b("Referer", str2);
            }
            okhttp3.y yVar = this.client;
            okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
            yVar.getClass();
            okhttp3.g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
            try {
                if (!g0VarE.N || (j0Var = g0VarE.D) == null) {
                    strZ = null;
                } else if (j0Var.m() > this.maxPageBodyLength) {
                    kotlin.o oVar = com.app.mlounge.util.a.a;
                    com.app.mlounge.util.a.f("4KHDHub", "fetchPage skipped (too large): " + j0Var.m() + "B");
                    strZ = null;
                } else {
                    strZ = j0Var.z();
                }
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
        } catch (Exception unused) {
            return null;
        }
    }

    public final kotlin.k g(String str, String str2) {
        kotlin.k kVar;
        okhttp3.j0 j0Var;
        try {
            okhttp3.a0 a0Var = new okhttp3.a0();
            a0Var.d(str);
            a0Var.b("User-Agent", UA);
            a0Var.b("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
            a0Var.b("Accept-Language", "en-US,en;q=0.5");
            if (!kotlin.text.k.d0(str2)) {
                a0Var.b("Referer", str2);
            }
            okhttp3.y yVar = this.client;
            okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
            yVar.getClass();
            okhttp3.g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
            try {
                if (!g0VarE.N || (j0Var = g0VarE.D) == null) {
                    kVar = null;
                } else if (j0Var.m() > this.maxPageBodyLength) {
                    kotlin.o oVar = com.app.mlounge.util.a.a;
                    com.app.mlounge.util.a.f("4KHDHub", "fetchPageWithRedirect skipped (too large): " + j0Var.m() + "B");
                    kVar = null;
                } else {
                    kVar = new kotlin.k(j0Var.z(), g0VarE.e.a.i);
                }
                g0VarE.close();
                return kVar;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    com.google.common.base.b.d(g0VarE, th);
                    throw th2;
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.app.mlounge.data.providers.k0
    public final String getName() {
        return this.name;
    }
}
