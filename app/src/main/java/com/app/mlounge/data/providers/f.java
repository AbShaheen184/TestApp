package com.app.mlounge.data.providers;

import android.util.Base64;
import com.app.mlounge.data.remote.model.ChqStream;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Pattern;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements k0 {
    public static final int $stable = 8;
    private static final String CASTLE_BASE = "https://api.hlowb.com";
    private static final String CASTLE_SUFFIX = "T!BgJB";
    private static final String CHANNEL = "IndiaA";
    private static final String CLIENT = "1";
    public static final d Companion = new d();
    private static final String LANG = "en-US";
    private static final String PKG = "com.external.castle";
    private final okhttp3.y client;
    private final com.google.gson.f gson;
    private final String name;
    private final l1 tmdbHelper;

    public f(okhttp3.y yVar, l1 l1Var) {
        yVar.getClass();
        l1Var.getClass();
        this.client = yVar;
        this.tmdbHelper = l1Var;
        this.name = "Castle";
        this.gson = new com.google.gson.f();
    }

    public static final String b(f fVar, String str, String str2) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        fVar.getClass();
        byte[] bArrDecode = Base64.decode(str2, 0);
        Charset charset = kotlin.text.a.a;
        byte[] bytes = CASTLE_SUFFIX.getBytes(charset);
        bytes.getClass();
        bArrDecode.getClass();
        byte[] bArrT = kotlin.collections.n.T(bArrDecode, bytes);
        byte[] bArrT2 = bArrT.length < 16 ? kotlin.collections.n.T(bArrT, new byte[16 - bArrT.length]) : Arrays.copyOf(bArrT, 16);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, new SecretKeySpec(bArrT2, "AES"), new IvParameterSpec(bArrT2));
        byte[] bArrDoFinal = cipher.doFinal(Base64.decode(str, 0));
        bArrDoFinal.getClass();
        return new String(bArrDoFinal, charset);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d9  */
    public static final ArrayList e(f fVar, com.google.gson.k kVar, String str) {
        String strH;
        String strH2;
        String strH3;
        fVar.getClass();
        ArrayList arrayList = new ArrayList();
        com.google.gson.h hVarL = kVar.l("videoUrl");
        if (hVarL != null && (strH = hVarL.h()) != null) {
            com.google.gson.g gVarN = kVar.n("videos");
            if (gVarN != null) {
                ArrayList arrayList2 = gVarN.e;
                if (arrayList2.size() > 0) {
                    Iterator it = arrayList2.iterator();
                    it.getClass();
                    while (it.hasNext()) {
                        com.google.gson.h hVar = (com.google.gson.h) it.next();
                        com.google.gson.h hVarL2 = hVar.e().l("url");
                        String str2 = (hVarL2 == null || (strH3 = hVarL2.h()) == null) ? strH : strH3;
                        com.google.gson.h hVarL3 = hVar.e().l("resolutionDescription");
                        if (hVarL3 == null || (strH2 = hVarL3.h()) == null) {
                            com.google.gson.h hVarL4 = hVar.e().l("resolution");
                            strH2 = hVarL4 != null ? hVarL4.h() : null;
                            if (strH2 == null) {
                                strH2 = "720p";
                            }
                        }
                        Pattern patternCompile = Pattern.compile("^(SD|HD|FHD)\\s+");
                        patternCompile.getClass();
                        String strReplaceAll = patternCompile.matcher(strH2).replaceAll("");
                        strReplaceAll.getClass();
                        String str3 = "hls";
                        if (!kotlin.text.k.T(str2, ".m3u8", false) && kotlin.text.k.T(str2, ".mp4", false)) {
                            str3 = "mp4";
                        }
                        String str4 = str3;
                        arrayList.add(new ChqStream(coil3.compose.internal.f.e("Castle ", str, " - ", strReplaceAll), str2, strReplaceAll.concat(" - (Use External Player)"), str4, str4, null, null, null, null, null, null, null, null, 8064));
                    }
                } else {
                    arrayList.add(new ChqStream(coil3.compose.internal.f.e("Castle ", str, " - ", "720p"), strH, "720p".concat(" - (Use External Player)"), "hls", "hls", null, null, null, null, null, null, null, null, 8064));
                }
            } else {
                arrayList.add(new ChqStream(coil3.compose.internal.f.e("Castle ", str, " - ", "720p"), strH, "720p".concat(" - (Use External Player)"), "hls", "hls", null, null, null, null, null, null, null, null, 8064));
            }
        }
        return arrayList;
    }

    public static com.google.gson.k g(f fVar) {
        okhttp3.j0 j0Var;
        String strZ;
        fVar.getClass();
        try {
            okhttp3.a0 a0Var = new okhttp3.a0();
            a0Var.d("https://api.hlowb.com/v0.1/system/getSecurityKey/1?channel=IndiaA&clientType=1&lang=en-US");
            a0Var.b("User-Agent", "okhttp/4.9.3");
            a0Var.b("Accept", "application/json");
            a0Var.b("Accept-Language", "en-US,en;q=0.9");
            a0Var.b("Connection", "Keep-Alive");
            a0Var.b("Referer", CASTLE_BASE);
            okhttp3.y yVar = fVar.client;
            okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
            yVar.getClass();
            okhttp3.g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
            try {
                com.google.gson.k kVar = (!g0VarE.N || (j0Var = g0VarE.D) == null || (strZ = j0Var.z()) == null) ? null : (com.google.gson.k) fVar.gson.d(com.google.gson.k.class, strZ);
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
    public final Object a(String str, String str2, Integer num, Integer num2, kotlin.coroutines.jvm.internal.i iVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new e(this, str, str2, num, num2, null), iVar);
    }

    public final String f(String str, String str2) {
        okhttp3.j0 j0Var;
        String strZ;
        String string;
        com.google.gson.k kVar;
        com.google.gson.h hVarL;
        String strH;
        String string2;
        okhttp3.u uVarH;
        try {
            okhttp3.a0 a0Var = new okhttp3.a0();
            a0Var.d(str);
            a0Var.b("User-Agent", "okhttp/4.9.3");
            a0Var.b("Accept", "application/json");
            a0Var.b("Accept-Language", "en-US,en;q=0.9");
            a0Var.b("Connection", "Keep-Alive");
            a0Var.b("Referer", CASTLE_BASE);
            if (str2 != null) {
                int i = okhttp3.e0.a;
                kotlin.text.i iVar = okhttp3.u.e;
                try {
                    uVarH = com.google.android.material.resources.c.h("application/json");
                } catch (IllegalArgumentException unused) {
                    uVarH = null;
                }
                a0Var.c("POST", okhttp3.b.c(str2, uVarH));
            }
            okhttp3.y yVar = this.client;
            okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
            yVar.getClass();
            okhttp3.g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
            try {
                if (!g0VarE.N || (j0Var = g0VarE.D) == null || (strZ = j0Var.z()) == null || (string = kotlin.text.k.A0(strZ).toString()) == null) {
                    string = null;
                } else {
                    kotlin.o oVar = com.app.mlounge.util.a.a;
                    kotlin.text.k.y0(100, string);
                    try {
                        kVar = (com.google.gson.k) this.gson.d(com.google.gson.k.class, string);
                    } catch (Exception e) {
                        kotlin.o oVar2 = com.app.mlounge.util.a.a;
                        e.getMessage();
                        kVar = null;
                    }
                    if (kVar != null && (hVarL = kVar.l("data")) != null && (strH = hVarL.h()) != null && (string2 = kotlin.text.k.A0(strH).toString()) != null) {
                        string = string2;
                    }
                    kotlin.text.k.y0(50, string);
                }
                g0VarE.close();
                return string;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    com.google.common.base.b.d(g0VarE, th);
                    throw th2;
                }
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // com.app.mlounge.data.providers.k0
    public final String getName() {
        return this.name;
    }
}
