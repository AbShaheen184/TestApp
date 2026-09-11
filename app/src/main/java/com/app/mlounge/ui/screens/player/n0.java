package com.app.mlounge.ui.screens.player;

import android.content.Context;
import android.net.Uri;
import androidx.compose.animation.core.t2;
import androidx.media3.common.d1;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import androidx.media3.exoplayer.source.e1;
import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {
    public static final n0 a = new n0();
    public static androidx.media3.datasource.cache.n b;

    public static androidx.media3.exoplayer.source.a a(Context context, String str, boolean z, androidx.media3.common.util.b bVar, androidx.media3.common.b0 b0Var, String str2, androidx.media3.extractor.q qVar) {
        String str3;
        char c;
        char c2;
        androidx.media3.exoplayer.source.a q0Var;
        context.getClass();
        str.getClass();
        bVar.getClass();
        d1 d1Var = new d1();
        com.google.common.collect.e0 e0Var = com.google.common.collect.h0.y;
        com.google.common.collect.a1 a1Var = com.google.common.collect.a1.B;
        List list = Collections.EMPTY_LIST;
        androidx.media3.common.w wVar = new androidx.media3.common.w();
        androidx.media3.common.z zVar = androidx.media3.common.z.a;
        Uri uri = Uri.parse(str);
        boolean z2 = kotlin.text.k.T(str, ".mpd", false) || (str2 != null && kotlin.text.k.T(str2, "dash", false));
        if (z) {
            str3 = "application/x-mpegURL";
        } else if (z2) {
            str3 = "application/dash+xml";
        } else if (kotlin.text.k.T(str, "vixsrc.to", true)) {
            str3 = "video/mp4";
        } else {
            str3 = (str2 == null || str2.length() == 0) ? null : str2;
        }
        androidx.media3.common.y yVar = uri != null ? new androidx.media3.common.y(uri, str3, a1Var) : null;
        androidx.media3.common.c0 c0Var = new androidx.media3.common.c0("", new androidx.media3.common.v(d1Var), yVar, new androidx.media3.common.x(wVar), androidx.media3.common.f0.B, zVar);
        androidx.media3.exoplayer.drm.f fVar = androidx.media3.exoplayer.drm.f.a;
        if (z) {
            HlsMediaSource$Factory hlsMediaSource$Factory = new HlsMediaSource$Factory(bVar);
            hlsMediaSource$Factory.j = true;
            hlsMediaSource$Factory.i = new t2(5);
            yVar.getClass();
            if (hlsMediaSource$Factory.b == null) {
                androidx.media3.exoplayer.hls.d dVar = new androidx.media3.exoplayer.hls.d();
                dVar.a = new com.google.android.gms.common.internal.k(20);
                dVar.c = 3;
                hlsMediaSource$Factory.b = dVar;
            }
            androidx.media3.exoplayer.hls.d dVar2 = hlsMediaSource$Factory.b;
            dVar2.b = hlsMediaSource$Factory.c;
            dVar2.c = hlsMediaSource$Factory.d;
            List list2 = yVar.c;
            boolean zIsEmpty = list2.isEmpty();
            androidx.media3.exoplayer.hls.playlist.u bVar2 = hlsMediaSource$Factory.e;
            if (!zIsEmpty) {
                bVar2 = new androidx.media3.common.util.b(10, bVar2, list2);
            }
            hlsMediaSource$Factory.h.a(c0Var);
            t2 t2Var = hlsMediaSource$Factory.i;
            hlsMediaSource$Factory.f.getClass();
            androidx.media3.exoplayer.hls.c cVar = hlsMediaSource$Factory.a;
            c = 0;
            c2 = 1;
            q0Var = new androidx.media3.exoplayer.hls.m(c0Var, cVar, dVar2, hlsMediaSource$Factory.g, fVar, t2Var, new androidx.media3.exoplayer.hls.playlist.e(cVar, t2Var, bVar2), hlsMediaSource$Factory.l, hlsMediaSource$Factory.j, hlsMediaSource$Factory.k);
        } else {
            c = 0;
            c2 = 1;
            if (z2) {
                DashMediaSource$Factory dashMediaSource$Factory = new DashMediaSource$Factory(bVar);
                dashMediaSource$Factory.e = new t2(5);
                yVar.getClass();
                androidx.media3.exoplayer.dash.manifest.e eVar = new androidx.media3.exoplayer.dash.manifest.e();
                List list3 = yVar.c;
                androidx.media3.exoplayer.upstream.p bVar3 = !list3.isEmpty() ? new androidx.media3.common.util.b(11, eVar, list3) : eVar;
                dashMediaSource$Factory.c.a(c0Var);
                q0Var = new androidx.media3.exoplayer.dash.i(c0Var, dashMediaSource$Factory.b, bVar3, dashMediaSource$Factory.a, dashMediaSource$Factory.d, fVar, dashMediaSource$Factory.e, dashMediaSource$Factory.f, dashMediaSource$Factory.g);
            } else {
                androidx.activity.y yVar2 = new androidx.activity.y(qVar == null ? new androidx.media3.extractor.l() : qVar, 17);
                t2 t2Var2 = new t2(-1);
                yVar.getClass();
                androidx.media3.common.y yVar3 = c0Var.b;
                yVar3.getClass();
                yVar3.getClass();
                q0Var = new androidx.media3.exoplayer.source.q0(c0Var, bVar, yVar2, fVar, t2Var2);
            }
        }
        if (b0Var == null) {
            return q0Var;
        }
        e1 e1Var = new e1(b0Var, bVar, new t2(-1));
        androidx.media3.exoplayer.source.a[] aVarArr = new androidx.media3.exoplayer.source.a[2];
        aVarArr[c] = q0Var;
        aVarArr[c2] = e1Var;
        return new androidx.media3.exoplayer.source.g0(aVarArr);
    }

    public static okhttp3.y b(String str, Map map) {
        String host;
        str.getClass();
        okhttp3.x xVar = new okhttp3.x();
        xVar.b(com.google.common.base.c.p(okhttp3.z.HTTP_1_1));
        xVar.a(20L);
        xVar.c(30L);
        xVar.i = true;
        xVar.j = true;
        xVar.c.add(new l0());
        if (map != null) {
            String str2 = (String) map.get("Origin");
            String host2 = "";
            String str3 = str2 == null ? "" : str2;
            String str4 = (String) map.get("Referer");
            String str5 = str4 == null ? "" : str4;
            String str6 = (String) map.get("User-Agent");
            String str7 = str6 == null ? "" : str6;
            String str8 = (String) map.get("Cookie");
            String str9 = str8 == null ? "" : str8;
            try {
                host = new URL(str3).getHost();
            } catch (Exception unused) {
                host = "";
            }
            try {
                host2 = new URL(str).getHost();
            } catch (Exception unused2) {
            }
            host.getClass();
            xVar.d.add(new m0(str7, str5, host, kotlin.text.k.x0(host, "."), host2, str3, str9));
        }
        return new okhttp3.y(xVar);
    }

    public static String c(long j) {
        long j2 = (long) ((j / 23.976d) * ((double) 1000));
        long j3 = 3600000;
        long j4 = 60000;
        long j5 = 1000;
        return String.format("%02d:%02d:%02d,%03d", Arrays.copyOf(new Object[]{Long.valueOf(j2 / j3), Long.valueOf((j2 % j3) / j4), Long.valueOf((j2 % j4) / j5), Long.valueOf(j2 % j5)}, 4));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        if (r1.equals("uk") == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        if (r1.equals("sr") == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r1.equals("sq") == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
    
        if (r1.equals("sl") == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
    
        if (r1.equals("sk") == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008b, code lost:
    
        if (r1.equals("ru") == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0095, code lost:
    
        if (r1.equals("ro") == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009f, code lost:
    
        if (r1.equals("pl") == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a9, code lost:
    
        if (r1.equals("mk") == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b3, code lost:
    
        if (r1.equals("hu") == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bc, code lost:
    
        if (r1.equals("hr") == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00eb, code lost:
    
        if (r1.equals("cs") == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ee, code lost:
    
        r1 = java.nio.charset.Charset.forName("windows-1250");
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f7, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00fe, code lost:
    
        if (r1.equals("bg") == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0107, code lost:
    
        if (r1.equals("be") == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x010a, code lost:
    
        r1 = java.nio.charset.Charset.forName("windows-1251");
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0113, code lost:
    
        return r1;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.nio.charset.Charset e(java.lang.String r1) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.screens.player.n0.e(java.lang.String):java.nio.charset.Charset");
    }

    /* JADX WARN: Code duplicated, block: B:5:0x0015  */
    public static String f(String str) {
        String string;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            string = kotlin.text.k.A0(lowerCase).toString();
            if (string == null) {
                string = "";
            }
        } else {
            string = "";
        }
        if (kotlin.text.k.T(string, "english", false) || kotlin.text.k.T(string, "(en)", false)) {
            return "en";
        }
        if (kotlin.text.k.T(string, "french", false) || kotlin.text.k.T(string, "français", false) || kotlin.text.k.T(string, "(fr)", false)) {
            return "fr";
        }
        if (kotlin.text.k.T(string, "spanish", false) || kotlin.text.k.T(string, "español", false) || kotlin.text.k.T(string, "(es)", false)) {
            return "es";
        }
        if (kotlin.text.k.T(string, "german", false) || kotlin.text.k.T(string, "deutsch", false) || kotlin.text.k.T(string, "(de)", false)) {
            return "de";
        }
        if (kotlin.text.k.T(string, "italian", false) || kotlin.text.k.T(string, "italiano", false) || kotlin.text.k.T(string, "(it)", false)) {
            return "it";
        }
        if (kotlin.text.k.T(string, "portuguese", false) || kotlin.text.k.T(string, "português", false) || kotlin.text.k.T(string, "(pt)", false)) {
            return "pt";
        }
        if (kotlin.text.k.T(string, "japanese", false) || kotlin.text.k.T(string, "日本語", false) || kotlin.text.k.T(string, "(ja)", false)) {
            return "ja";
        }
        if (kotlin.text.k.T(string, "chinese", false) || kotlin.text.k.T(string, "中文", false) || kotlin.text.k.T(string, "(zh)", false)) {
            return "zh";
        }
        if (kotlin.text.k.T(string, "arabic", false) || kotlin.text.k.T(string, "العربية", false) || kotlin.text.k.T(string, "(ar)", false)) {
            return "ar";
        }
        if (kotlin.text.k.T(string, "korean", false) || kotlin.text.k.T(string, "한국어", false) || kotlin.text.k.T(string, "(ko)", false)) {
            return "ko";
        }
        if (kotlin.text.k.T(string, "dutch", false) || kotlin.text.k.T(string, "nederlands", false) || kotlin.text.k.T(string, "(nl)", false)) {
            return "nl";
        }
        return (kotlin.text.k.T(string, "russian", false) || kotlin.text.k.T(string, "русский", false) || kotlin.text.k.T(string, "(ru)", false)) ? "ru" : "en";
    }

    public final androidx.media3.common.util.b d(Context context, okhttp3.y yVar) {
        context.getClass();
        androidx.media3.common.util.b bVar = new androidx.media3.common.util.b(yVar);
        com.google.android.gms.cloudmessaging.n nVar = new com.google.android.gms.cloudmessaging.n();
        nVar.z = new androidx.media3.datasource.n();
        androidx.media3.datasource.cache.n nVar2 = b;
        if (nVar2 == null) {
            synchronized (this) {
                nVar2 = b;
                if (nVar2 == null) {
                    nVar2 = new androidx.media3.datasource.cache.n(new File(context.getCacheDir(), "google_cdn_cache"), new androidx.media3.datasource.cache.k());
                    b = nVar2;
                }
            }
        }
        nVar.y = nVar2;
        nVar.A = bVar;
        nVar.e = 2;
        return new androidx.media3.common.util.b(context, nVar);
    }
}
