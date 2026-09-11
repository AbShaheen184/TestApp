package com.app.mlounge.data.providers;

import android.util.Base64;
import java.util.Arrays;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 implements k0 {
    public static final int $stable = 8;
    private static final String BLOCKED_DOMAIN = "binge.vaporeen.workers.dev";
    public static final a2 Companion = new a2();
    private static final String DOMAIN = "https://vidrock.ru";
    private static final String PASSPHRASE = "7f3e9c2a8b5d1f4e6a9c3b7d2e5f8a1c4b6d9e2f5a8c1b4d7e9f2a5c8b1d4e7f";
    private final okhttp3.y client;
    private final com.google.gson.f gson;
    private final String name;

    public c2(okhttp3.y yVar) {
        yVar.getClass();
        this.client = yVar;
        this.name = "Vidrock";
        this.gson = new com.google.gson.f();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x006b A[Catch: Exception -> 0x0049, TRY_LEAVE, TryCatch #0 {Exception -> 0x0049, blocks: (B:3:0x0004, B:6:0x000f, B:7:0x002e, B:9:0x0037, B:10:0x0041, B:16:0x005f, B:19:0x006b, B:13:0x004b, B:15:0x0054), top: B:23:0x0004 }] */
    public static final String b(c2 c2Var, String str) {
        StringBuilder sb;
        String str2;
        byte[] bArrDecode;
        c2Var.getClass();
        try {
            byte[] bArr = new byte[32];
            for (int i = 0; i < 64; i += 2) {
                bArr[i / 2] = (byte) (Character.digit(PASSPHRASE.charAt(i + 1), 16) + (Character.digit(PASSPHRASE.charAt(i), 16) << 4));
            }
            if (str.length() % 4 != 2) {
                if (str.length() % 4 == 3) {
                    sb = new StringBuilder();
                    sb.append(str);
                    str2 = "=";
                }
                bArrDecode = Base64.decode(str, 8);
                if (bArrDecode.length < 28) {
                    return null;
                }
                byte[] bArrCopyOf = Arrays.copyOf(bArrDecode, 12);
                byte[] bArrI = kotlin.collections.n.I(bArrDecode, 12, bArrDecode.length);
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(2, new SecretKeySpec(bArr, "AES"), new GCMParameterSpec(128, bArrCopyOf));
                byte[] bArrDoFinal = cipher.doFinal(bArrI);
                bArrDoFinal.getClass();
                return new String(bArrDoFinal, kotlin.text.a.a);
            }
            sb = new StringBuilder();
            sb.append(str);
            str2 = "==";
            sb.append(str2);
            str = sb.toString();
            bArrDecode = Base64.decode(str, 8);
            if (bArrDecode.length < 28) {
                return null;
            }
            byte[] bArrCopyOf2 = Arrays.copyOf(bArrDecode, 12);
            byte[] bArrI2 = kotlin.collections.n.I(bArrDecode, 12, bArrDecode.length);
            Cipher cipher2 = Cipher.getInstance("AES/GCM/NoPadding");
            cipher2.init(2, new SecretKeySpec(bArr, "AES"), new GCMParameterSpec(128, bArrCopyOf2));
            byte[] bArrDoFinal2 = cipher2.doFinal(bArrI2);
            bArrDoFinal2.getClass();
            return new String(bArrDoFinal2, kotlin.text.a.a);
        } catch (Exception e) {
            kotlin.o oVar = com.app.mlounge.util.a.a;
            e.getMessage();
            return null;
        }
    }

    public static final String e(c2 c2Var, String str) {
        String strZ;
        com.google.gson.k kVarE;
        com.google.gson.h hVarL;
        String strH;
        c2Var.getClass();
        int i = 0;
        if (!kotlin.text.r.H(str, ".mp4", false) && !kotlin.text.r.H(str, ".m3u8", false)) {
            try {
                okhttp3.a0 a0Var = new okhttp3.a0();
                a0Var.d(str);
                a0Var.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Safari/537.36");
                a0Var.b("Referer", DOMAIN);
                okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
                okhttp3.y yVar = c2Var.client;
                yVar.getClass();
                okhttp3.j0 j0Var = new okhttp3.internal.connection.m(yVar, b0Var, false).e().D;
                if (j0Var != null && (strZ = j0Var.z()) != null) {
                    com.google.gson.h hVar = (com.google.gson.h) c2Var.gson.d(com.google.gson.h.class, strZ);
                    if (hVar instanceof com.google.gson.g) {
                        Iterator it = ((com.google.gson.g) hVar).e.iterator();
                        it.getClass();
                        String str2 = str;
                        while (it.hasNext()) {
                            com.google.gson.h hVar2 = (com.google.gson.h) it.next();
                            hVar2.getClass();
                            if (!(hVar2 instanceof com.google.gson.k)) {
                                hVar2 = null;
                            }
                            if (hVar2 != null && (hVarL = (kVarE = hVar2.e()).l("resolution")) != null) {
                                int iC = hVarL.c();
                                com.google.gson.h hVarL2 = kVarE.l("url");
                                if (hVarL2 != null && (strH = hVarL2.h()) != null && iC > i) {
                                    str2 = strH;
                                    i = iC;
                                }
                            }
                        }
                        if (i > 0) {
                            return str2;
                        }
                    }
                }
            } catch (Exception e) {
                kotlin.o oVar = com.app.mlounge.util.a.a;
                e.getMessage();
            }
        }
        return str;
    }

    @Override // com.app.mlounge.data.providers.k0
    public final Object a(String str, String str2, Integer num, Integer num2, kotlin.coroutines.jvm.internal.i iVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new b2(str2, num, num2, str, this, null), iVar);
    }

    @Override // com.app.mlounge.data.providers.k0
    public final String getName() {
        return this.name;
    }
}
