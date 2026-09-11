package com.app.mlounge.data.providers;

import android.util.Base64;
import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements k0 {
    public static final int $stable = 8;
    private static final String APP_ID = "com.movieblast";
    private static final String BASE_URL = "https://app.cloud-mb.xyz";
    public static final l0 Companion = new l0();
    private static final String SIGN_SECRET = "GJ8reydarI7Jqat9rvbAJKNQ9gY4DoEQF2H5nfuI1gi";
    private static final String TOKEN = "jdvhhjv255vghhghdhvfch2565656jhdcghfdf";
    private static final String USERAGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36";
    private final okhttp3.y client;
    private final com.google.gson.f gson;
    private final String name;
    private final l1 tmdbHelper;

    public n0(okhttp3.y yVar, l1 l1Var) {
        yVar.getClass();
        l1Var.getClass();
        this.client = yVar;
        this.tmdbHelper = l1Var;
        this.name = "MovieBlast";
        this.gson = new com.google.gson.f();
    }

    public static final String b(n0 n0Var, String str) throws NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {
        n0Var.getClass();
        String path = new URL(str).getPath();
        String strValueOf = String.valueOf(System.currentTimeMillis() / ((long) 1000));
        String strC = androidx.constraintlayout.core.g.c(path, strValueOf);
        Mac mac = Mac.getInstance("HmacSHA256");
        Charset charset = kotlin.text.a.a;
        byte[] bytes = SIGN_SECRET.getBytes(charset);
        bytes.getClass();
        mac.init(new SecretKeySpec(bytes, "HmacSHA256"));
        byte[] bytes2 = strC.getBytes(charset);
        bytes2.getClass();
        return str + "?verify=" + strValueOf + "-" + URLEncoder.encode(Base64.encodeToString(mac.doFinal(bytes2), 2), "UTF-8");
    }

    public static final String f(n0 n0Var, String str) {
        n0Var.getClass();
        if (str == null) {
            str = "";
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (kotlin.text.k.T(lowerCase, "2160", false) || kotlin.text.k.T(lowerCase, "4k", false)) {
            return "4K";
        }
        if (kotlin.text.k.T(lowerCase, "1440", false)) {
            return "1440p";
        }
        if (kotlin.text.k.T(lowerCase, "1080", false)) {
            return "1080p";
        }
        if (kotlin.text.k.T(lowerCase, "720", false)) {
            return "720p";
        }
        if (kotlin.text.k.T(lowerCase, "480", false)) {
            return "480p";
        }
        return kotlin.text.k.T(lowerCase, "360", false) ? "360p" : "Unknown";
    }

    @Override // com.app.mlounge.data.providers.k0
    public final Object a(String str, String str2, Integer num, Integer num2, kotlin.coroutines.jvm.internal.i iVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new m0(this, str, str2, num, num2, null), iVar);
    }

    @Override // com.app.mlounge.data.providers.k0
    public final String getName() {
        return this.name;
    }
}
