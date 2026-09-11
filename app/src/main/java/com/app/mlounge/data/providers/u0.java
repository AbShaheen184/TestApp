package com.app.mlounge.data.providers;

import com.app.mlounge.data.remote.model.ChqStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 implements k0 {
    public static final int $stable = 8;
    private static final String DEFAULT_API_BASE = "https://ballerinacappuccinalovestungtungtungsahur.com";
    private static final String PLAYER_ORIGIN = "https://vidlove.cc";
    private static final String TAG = "Movies111";
    private String apiBase;
    private final Mutex baseMutex;
    private final okhttp3.y client;
    private final com.google.gson.f gson;
    private final String name;
    public static final o0 Companion = new o0();
    private static final Map<String, String> SERVER_NAMES = kotlin.collections.a0.v(new kotlin.k("moviebox", "MovieBox"), new kotlin.k("vidapi", "VidAPI"), new kotlin.k("ipcloud", "IPCloud"), new kotlin.k("tcloud", "TCloud"), new kotlin.k("vixsrc", "VixSrc"), new kotlin.k("1embed", "1Embed"), new kotlin.k("xpass", "XPass"), new kotlin.k("vidrift", "VidRift"), new kotlin.k("lookmovie", "LookMovie"), new kotlin.k("vidnest", "VidNest"));
    private static final List<String> DEFAULT_MOVIE_ORDER = com.google.common.base.c.q("moviebox", "vidapi", "ipcloud", "tcloud", "vixsrc", "1embed", "xpass", "vidrift", "lookmovie", "vidnest");
    private static final List<String> DEFAULT_TV_ORDER = com.google.common.base.c.q("moviebox", "ipcloud", "tcloud", "vidapi");
    private static final String UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36";

    public u0(okhttp3.y yVar) {
        yVar.getClass();
        this.client = yVar;
        this.name = TAG;
        this.gson = new com.google.gson.f();
        this.baseMutex = MutexKt.Mutex$default(false, 1, null);
    }

    public static final void b(u0 u0Var, List list, String str, String str2, String str3, String str4) {
        String str5 = str3;
        u0Var.getClass();
        String str6 = "hls";
        if (!kotlin.text.k.T(str, ".m3u8", false) && !kotlin.text.k.T(str, "mpegurl", false) && !kotlin.text.k.T(str, "/hls", false) && !kotlin.jvm.internal.l.a(str4, "hls")) {
            str6 = "mp4";
        }
        String strH = (str5 == null || kotlin.text.k.d0(str5) || str5.equalsIgnoreCase("Auto")) ? androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Movies111 - ", str2) : androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.j("Movies111 - ", str2, " (", str5, ")");
        if (str5 == null) {
            str5 = "Auto";
        }
        list.add(new ChqStream(strH, str, str5, str6, str6, null, null, null, null, null, null, str2, null, 6016));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0019  */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ed  */
    public static final String c(u0 u0Var, com.google.gson.k kVar) {
        String strH;
        com.google.gson.g gVarD;
        com.google.gson.h hVarL;
        String strH2;
        okhttp3.g0 g0VarE;
        String strG;
        com.google.gson.h hVarL2;
        String strH3;
        u0Var.getClass();
        com.google.gson.h hVarL3 = kVar.l("manifest");
        if (hVarL3 == null) {
            strH = null;
        } else {
            if (!(hVarL3 instanceof com.google.gson.l)) {
                hVarL3 = null;
            }
            if (hVarL3 != null) {
                strH = hVarL3.h();
            } else {
                strH = null;
            }
        }
        if (strH == null || !kotlin.text.r.O(kotlin.text.k.C0(strH).toString(), "#EXTM3U", false)) {
            com.google.gson.h hVarL4 = kVar.l("qualities");
            if (hVarL4 == null) {
                gVarD = null;
            } else {
                if (!(hVarL4 instanceof com.google.gson.g)) {
                    hVarL4 = null;
                }
                if (hVarL4 != null) {
                    gVarD = hVarL4.d();
                } else {
                    gVarD = null;
                }
            }
            String str = "mp4";
            if (gVarD != null) {
                Iterator it = gVarD.e.iterator();
                it.getClass();
                while (it.hasNext()) {
                    com.google.gson.h hVar = (com.google.gson.h) it.next();
                    hVar.getClass();
                    if ((hVar instanceof com.google.gson.k) && (hVarL2 = hVar.e().l("type")) != null) {
                        if (!(hVarL2 instanceof com.google.gson.l)) {
                            hVarL2 = null;
                        }
                        if (hVarL2 != null && (strH3 = hVarL2.h()) != null) {
                            if (kotlin.text.k.T(strH3, "mp4", true)) {
                                return "mp4";
                            }
                            if (kotlin.text.k.T(strH3, "m3u8", true) || kotlin.text.k.T(strH3, "mpegurl", true)) {
                            }
                        }
                    }
                }
                hVarL = kVar.l("url");
                if (hVarL != null) {
                    if (!(hVarL instanceof com.google.gson.l)) {
                        hVarL = null;
                    }
                    if (hVarL != null && (strH2 = hVarL.h()) != null) {
                        try {
                            okhttp3.y yVar = u0Var.client;
                            okhttp3.a0 a0Var = new okhttp3.a0();
                            a0Var.d(strH2);
                            a0Var.c("HEAD", null);
                            a0Var.b("User-Agent", UA);
                            okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
                            yVar.getClass();
                            g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
                            try {
                                strG = okhttp3.g0.g("Content-Type", g0VarE);
                                if (strG == null) {
                                    strG = "";
                                }
                                if (kotlin.text.k.T(strG, "mpegurl", true) || (!kotlin.text.k.T(strG, "mp4", true) && !kotlin.text.k.T(strG, "quicktime", true) && kotlin.text.k.d0(strG) && okhttp3.g0.g("Content-Length", g0VarE) == null)) {
                                    str = "hls";
                                }
                                g0VarE.close();
                                return str;
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    com.google.common.base.b.d(g0VarE, th);
                                    throw th2;
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            } else {
                hVarL = kVar.l("url");
                if (hVarL != null) {
                    if (!(hVarL instanceof com.google.gson.l)) {
                        hVarL = null;
                    }
                    if (hVarL != null) {
                        okhttp3.y yVar2 = u0Var.client;
                        okhttp3.a0 a0Var2 = new okhttp3.a0();
                        a0Var2.d(strH2);
                        a0Var2.c("HEAD", null);
                        a0Var2.b("User-Agent", UA);
                        okhttp3.b0 b0Var2 = new okhttp3.b0(a0Var2);
                        yVar2.getClass();
                        g0VarE = new okhttp3.internal.connection.m(yVar2, b0Var2, false).e();
                        strG = okhttp3.g0.g("Content-Type", g0VarE);
                        if (strG == null) {
                            strG = "";
                        }
                        if (kotlin.text.k.T(strG, "mpegurl", true)) {
                            str = "hls";
                        } else {
                            str = "hls";
                        }
                        g0VarE.close();
                        return str;
                    }
                }
            }
        }
        return "hls";
    }

    /* JADX WARN: Code duplicated, block: B:41:0x009a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object d(u0 u0Var, String str, kotlin.coroutines.jvm.internal.c cVar) {
        p0 p0Var;
        ArrayList arrayList;
        u0Var.getClass();
        if (cVar instanceof p0) {
            p0Var = (p0) cVar;
            int i = p0Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                p0Var.label = i - Integer.MIN_VALUE;
            } else {
                p0Var = new p0(u0Var, cVar);
            }
        } else {
            p0Var = new p0(u0Var, cVar);
        }
        Object objI = p0Var.result;
        int i2 = p0Var.label;
        try {
            if (i2 == 0) {
                kotlin.a.e(objI);
                p0Var.L$0 = null;
                p0Var.label = 1;
                objI = u0Var.i(str + "/source-order");
                Object obj = kotlin.coroutines.intrinsics.a.e;
                if (objI == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(objI);
            }
            com.google.gson.k kVar = (com.google.gson.k) objI;
            if (kVar == null) {
                return DEFAULT_TV_ORDER;
            }
            com.google.gson.h hVarL = kVar.l("tv");
            if (hVarL == null) {
                arrayList = null;
            } else {
                if (!(hVarL instanceof com.google.gson.g)) {
                    hVarL = null;
                }
                if (hVarL != null) {
                    com.google.gson.g gVarD = hVarL.d();
                    arrayList = new ArrayList();
                    for (com.google.gson.h hVar : gVarD.e) {
                        hVar.getClass();
                        String strH = hVar instanceof com.google.gson.l ? hVar.h() : null;
                        if (strH != null) {
                            arrayList.add(strH);
                        }
                    }
                } else {
                    arrayList = null;
                }
            }
            if (arrayList != null) {
                ArrayList arrayList2 = arrayList.isEmpty() ? null : arrayList;
                if (arrayList2 != null) {
                    return arrayList2;
                }
            }
            return DEFAULT_TV_ORDER;
        } catch (Exception unused) {
            return DEFAULT_TV_ORDER;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x007d A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002f, B:35:0x0079, B:37:0x007d, B:38:0x0080), top: B:45:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0080 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002f, B:35:0x0079, B:37:0x007d, B:38:0x0080), top: B:45:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object e(u0 u0Var, kotlin.coroutines.jvm.internal.c cVar) throws Throwable {
        q0 q0Var;
        Mutex mutex;
        int i;
        Mutex mutex2;
        String str;
        u0Var.getClass();
        if (cVar instanceof q0) {
            q0Var = (q0) cVar;
            int i2 = q0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q0Var.label = i2 - Integer.MIN_VALUE;
            } else {
                q0Var = new q0(u0Var, cVar);
            }
        } else {
            q0Var = new q0(u0Var, cVar);
        }
        Object obj = q0Var.result;
        int i3 = q0Var.label;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        try {
            if (i3 == 0) {
                kotlin.a.e(obj);
                String str2 = u0Var.apiBase;
                if (str2 != null) {
                    return str2;
                }
                mutex = u0Var.baseMutex;
                q0Var.L$0 = mutex;
                q0Var.I$0 = 0;
                q0Var.label = 1;
                if (mutex.lock(null, q0Var) != aVar) {
                    i = 0;
                }
                return aVar;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mutex2 = (Mutex) q0Var.L$0;
                try {
                    kotlin.a.e(obj);
                    str = (String) obj;
                    if (str != null) {
                        u0Var.apiBase = str;
                    } else {
                        str = DEFAULT_API_BASE;
                    }
                    mutex2.unlock(null);
                    return str;
                } catch (Throwable th) {
                    th = th;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            i = q0Var.I$0;
            Mutex mutex3 = (Mutex) q0Var.L$0;
            kotlin.a.e(obj);
            mutex = mutex3;
            String str3 = u0Var.apiBase;
            if (str3 != null) {
                mutex.unlock(null);
                return str3;
            }
            q0Var.L$0 = mutex;
            q0Var.I$0 = i;
            q0Var.I$1 = 0;
            q0Var.label = 2;
            String strJ = u0Var.j();
            if (strJ != aVar) {
                mutex2 = mutex;
                obj = strJ;
                str = (String) obj;
                if (str != null) {
                    u0Var.apiBase = str;
                } else {
                    str = DEFAULT_API_BASE;
                }
                mutex2.unlock(null);
                return str;
            }
            return aVar;
        } catch (Throwable th2) {
            th = th2;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th;
        }
    }

    public static okhttp3.b0 h(String str) {
        okhttp3.a0 a0Var = new okhttp3.a0();
        a0Var.d(str);
        a0Var.b("User-Agent", UA);
        a0Var.b("Accept", "application/json, text/plain, */*");
        a0Var.b("Referer", "https://vidlove.cc/");
        a0Var.b("Origin", PLAYER_ORIGIN);
        return new okhttp3.b0(a0Var);
    }

    @Override // com.app.mlounge.data.providers.k0
    public final Object a(String str, String str2, Integer num, Integer num2, kotlin.coroutines.jvm.internal.i iVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new t0(this, str2, num, num2, str, null), iVar);
    }

    @Override // com.app.mlounge.data.providers.k0
    public final String getName() {
        return this.name;
    }

    public final com.google.gson.k i(String str) {
        okhttp3.j0 j0Var;
        try {
            okhttp3.y yVar = this.client;
            okhttp3.b0 b0VarH = h(str);
            yVar.getClass();
            okhttp3.g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0VarH, false).e();
            try {
                String strZ = (!g0VarE.N || (j0Var = g0VarE.D) == null) ? null : j0Var.z();
                g0VarE.close();
                if (strZ == null) {
                    return null;
                }
                return (com.google.gson.k) this.gson.d(com.google.gson.k.class, strZ);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    com.google.common.base.b.d(g0VarE, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            kotlin.o oVar = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.b(TAG, "fetchJson failed: ".concat(str), e);
            return null;
        }
    }

    public final String j() {
        String str;
        try {
            okhttp3.y yVar = this.client;
            okhttp3.b0 b0VarH = h("https://vidlove.cc/movie/533535");
            yVar.getClass();
            okhttp3.g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0VarH, false).e();
            try {
                okhttp3.j0 j0Var = g0VarE.D;
                String strZ = j0Var != null ? j0Var.z() : null;
                g0VarE.close();
                if (strZ != null) {
                    Pattern patternCompile = Pattern.compile("src=\"(/assets/index-[^\"]+\\.js)\"");
                    patternCompile.getClass();
                    Matcher matcher = patternCompile.matcher(strZ);
                    matcher.getClass();
                    kotlin.text.g gVarC = com.google.android.material.shape.k.C(matcher, 0, strZ);
                    if (gVarC != null && (str = (String) ((kotlin.collections.b0) gVarC.a()).get(1)) != null) {
                        okhttp3.y yVar2 = this.client;
                        okhttp3.b0 b0VarH2 = h(PLAYER_ORIGIN.concat(str));
                        yVar2.getClass();
                        okhttp3.g0 g0VarE2 = new okhttp3.internal.connection.m(yVar2, b0VarH2, false).e();
                        try {
                            okhttp3.j0 j0Var2 = g0VarE2.D;
                            String strZ2 = j0Var2 != null ? j0Var2.z() : null;
                            g0VarE2.close();
                            if (strZ2 != null) {
                                Pattern patternCompile2 = Pattern.compile("serverConfigs-[A-Za-z0-9_-]+\\.js");
                                patternCompile2.getClass();
                                Matcher matcher2 = patternCompile2.matcher(strZ2);
                                matcher2.getClass();
                                kotlin.text.g gVarC2 = com.google.android.material.shape.k.C(matcher2, 0, strZ2);
                                if (gVarC2 != null) {
                                    String strGroup = gVarC2.a.group();
                                    strGroup.getClass();
                                    okhttp3.y yVar3 = this.client;
                                    okhttp3.b0 b0VarH3 = h("https://vidlove.cc/assets/".concat(strGroup));
                                    yVar3.getClass();
                                    okhttp3.g0 g0VarE3 = new okhttp3.internal.connection.m(yVar3, b0VarH3, false).e();
                                    try {
                                        okhttp3.j0 j0Var3 = g0VarE3.D;
                                        String strZ3 = j0Var3 != null ? j0Var3.z() : null;
                                        g0VarE3.close();
                                        if (strZ3 != null) {
                                            Pattern patternCompile3 = Pattern.compile("const e=\"(https://[^\"]+)\"");
                                            patternCompile3.getClass();
                                            Matcher matcher3 = patternCompile3.matcher(strZ3);
                                            matcher3.getClass();
                                            kotlin.text.g gVarC3 = com.google.android.material.shape.k.C(matcher3, 0, strZ3);
                                            String str2 = gVarC3 != null ? (String) ((kotlin.collections.b0) gVarC3.a()).get(1) : null;
                                            kotlin.o oVar = com.app.mlounge.util.a.a;
                                            return str2;
                                        }
                                    } catch (Throwable th) {
                                        try {
                                            throw th;
                                        } catch (Throwable th2) {
                                            com.google.common.base.b.d(g0VarE3, th);
                                            throw th2;
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                com.google.common.base.b.d(g0VarE2, th3);
                                throw th4;
                            }
                        }
                    }
                }
                return null;
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    com.google.common.base.b.d(g0VarE, th5);
                    throw th6;
                }
            }
        } catch (Exception e) {
            com.app.mlounge.util.a.b(TAG, "resolveApiBase failed", e);
            return null;
        }
    }
}
