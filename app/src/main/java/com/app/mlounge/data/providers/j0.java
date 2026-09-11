package com.app.mlounge.data.providers;

import com.app.mlounge.data.remote.model.ChqStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements k0 {
    public static final int $stable = 8;
    private static final String BASE_URL = "https://none.eat-peach.sbs";
    private static final String ORIGIN = "https://peachify.pro";
    private static final String REFERER = "https://peachify.pro/";
    private static final String TAG = "HollyProvider";
    private static final String UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/151.0.0.0 Safari/537.36";
    private final okhttp3.y client;
    private final com.google.gson.f gson;
    private final String name;
    public static final f0 Companion = new f0();
    private static final List<String> VARIANTS = com.google.common.base.c.q("holly", "air", "multi", "moviebox");

    public j0(okhttp3.y yVar) {
        yVar.getClass();
        this.client = yVar;
        this.name = "Holly";
        this.gson = new com.google.gson.f();
    }

    public static final Object b(j0 j0Var, String str, String str2, String str3, Integer num, Integer num2) {
        String strE;
        okhttp3.j0 j0Var2;
        String strZ;
        com.google.gson.k kVar;
        com.google.gson.g gVarN;
        String strH;
        String strH2;
        String strH3;
        j0Var.getClass();
        kotlin.collections.u uVar = kotlin.collections.u.e;
        if (!kotlin.jvm.internal.l.a(str3, "tv") || num == null || num2 == null) {
            strE = coil3.compose.internal.f.e("https://none.eat-peach.sbs/", str, "/movie/", str2);
        } else {
            StringBuilder sbO = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.o("https://none.eat-peach.sbs/", str, "/tv/", str2, "/");
            sbO.append(num);
            sbO.append("/");
            sbO.append(num2);
            strE = sbO.toString();
        }
        try {
            okhttp3.y yVar = j0Var.client;
            okhttp3.b0 b0VarD = d(strE);
            yVar.getClass();
            okhttp3.g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0VarD, false).e();
            if (g0VarE.N && (j0Var2 = g0VarE.D) != null && (strZ = j0Var2.z()) != null && (kVar = (com.google.gson.k) j0Var.gson.d(com.google.gson.k.class, strZ)) != null && (gVarN = kVar.n("sources")) != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it = gVarN.e.iterator();
                while (it.hasNext()) {
                    com.google.gson.k kVarE = ((com.google.gson.h) it.next()).e();
                    com.google.gson.h hVarL = kVarE.l("url");
                    ChqStream chqStream = null;
                    if (hVarL != null && (strH = hVarL.h()) != null) {
                        com.google.gson.h hVarL2 = kVarE.l("type");
                        if (hVarL2 == null || (strH2 = hVarL2.h()) == null) {
                            strH2 = "hls";
                        }
                        String str4 = strH2;
                        com.google.gson.h hVarL3 = kVarE.l("dub");
                        String str5 = "";
                        if (hVarL3 == null || (strH3 = hVarL3.h()) == null) {
                            strH3 = "";
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        com.google.gson.k kVarO = kVarE.o("headers");
                        if (kVarO != null) {
                            Iterator it2 = ((com.google.gson.internal.l) kVarO.e.entrySet()).iterator();
                            while (((com.google.gson.internal.k) it2).hasNext()) {
                                com.google.gson.internal.m mVarC = ((com.google.gson.internal.k) it2).c();
                                linkedHashMap.put(mVarC.getKey(), ((com.google.gson.h) mVarC.getValue()).h());
                            }
                        }
                        if (!kotlin.text.k.d0(strH3)) {
                            str5 = strH3;
                        }
                        chqStream = new ChqStream(kotlin.text.k.A0("Holly (" + str + ") " + ((Object) str5)).toString(), strH, kotlin.text.k.T(strH3, "sub", true) ? "SUB" : "DUB", str4, str4, null, linkedHashMap.isEmpty() ? null : linkedHashMap, null, null, null, null, null, null, 8064);
                    }
                    if (chqStream != null) {
                        arrayList.add(chqStream);
                    }
                }
                return arrayList;
            }
            return uVar;
        } catch (Exception e) {
            kotlin.o oVar = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.a(TAG, "Error fetching from " + str + ": " + e.getMessage());
            return uVar;
        }
    }

    public static okhttp3.b0 d(String str) {
        okhttp3.a0 a0Var = new okhttp3.a0();
        a0Var.d(str);
        a0Var.b("User-Agent", UA);
        a0Var.b("Accept", "*/*");
        a0Var.b("Origin", ORIGIN);
        a0Var.b("Referer", REFERER);
        a0Var.b("Sec-Fetch-Mode", "cors");
        a0Var.b("Sec-Fetch-Site", "cross-site");
        return new okhttp3.b0(a0Var);
    }

    @Override // com.app.mlounge.data.providers.k0
    public final Object a(String str, String str2, Integer num, Integer num2, kotlin.coroutines.jvm.internal.i iVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new i0(this, str, str2, num, num2, null), iVar);
    }

    @Override // com.app.mlounge.data.providers.k0
    public final String getName() {
        return this.name;
    }
}
