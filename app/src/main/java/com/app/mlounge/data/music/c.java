package com.app.mlounge.data.music;

import androidx.compose.foundation.text.u0;
import com.app.mlounge.data.remote.model.MusicAlbum;
import com.app.mlounge.data.remote.model.MusicTrack;
import com.app.mlounge.data.repository.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.b0;
import kotlin.o;
import kotlin.text.k;
import kotlin.text.r;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import okhttp3.a0;
import okhttp3.g0;
import okhttp3.internal.connection.m;
import okhttp3.x;
import okhttp3.y;
import org.jsoup.nodes.j;
import org.jsoup.parser.e0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements d {
    public final androidx.media3.exoplayer.hls.c a;
    public final y b;

    public c(y yVar) {
        yVar.getClass();
        androidx.media3.exoplayer.hls.c cVar = new androidx.media3.exoplayer.hls.c(15);
        this.a = cVar;
        x xVarA = yVar.a();
        xVarA.k = cVar;
        this.b = new y(xVarA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ArrayList h(c cVar, org.jsoup.nodes.g gVar) {
        String strD0;
        String strD1;
        String string;
        String strD2;
        String string2;
        org.jsoup.select.e<j> eVarB0 = gVar.b0("div.album_report");
        eVarB0.getClass();
        ArrayList arrayList = new ArrayList();
        for (j jVar : eVarB0) {
            j jVarC0 = jVar.c0("a.album_report__link");
            Object musicAlbum = null;
            if (jVarC0 != null) {
                j jVarC1 = jVarC0.c0("span.album_report__name");
                String str = (jVarC1 == null || (strD2 = jVarC1.d0()) == null || (string2 = k.A0(strD2).toString()) == null) ? "Unknown" : string2;
                j jVarC2 = jVar.c0("img.album_report__image");
                String strB = jVarC2 != null ? jVarC2.b("src") : null;
                j jVarK = k(jVar, "album_report__artist");
                String str2 = (jVarK == null || (strD1 = jVarK.d0()) == null || (string = k.A0(strD1).toString()) == null) ? "Unknown" : string;
                j jVarK2 = k(jVar, "album_report__date");
                if (jVarK2 != null && (strD0 = jVarK2.d0()) != null) {
                    musicAlbum = k.A0(strD0).toString();
                }
                String strB2 = jVarC0.b("href");
                strB2.getClass();
                musicAlbum = new MusicAlbum(str, str2, strB2, strB, musicAlbum);
            }
            if (musicAlbum != null) {
                arrayList.add(musicAlbum);
            }
        }
        return arrayList;
    }

    public static final MusicTrack i(c cVar, j jVar, String str, String str2, String str3) {
        String string;
        String strD0;
        String str4;
        String strD1;
        String str5;
        String str6;
        j jVarC0;
        String strB;
        String strD2;
        String string2;
        String strD3;
        String string3;
        String strD4;
        String strD = jVar.d("id");
        strD.getClass();
        j jVarC1 = jVar.c0("a[rel]");
        if (jVarC1 == null) {
            return null;
        }
        String strD5 = jVarC1.d("rel");
        strD5.getClass();
        j jVarC2 = jVar.c0("[itemprop=name]");
        if (jVarC2 == null || (strD4 = jVarC2.d0()) == null || (string = k.A0(strD4).toString()) == null) {
            j jVarC3 = jVar.c0("td.song__name--search");
            string = (jVarC3 == null || (strD0 = jVarC3.d0()) == null) ? "Unknown" : k.A0(strD0).toString();
        }
        String str7 = string;
        j jVarC4 = jVar.c0("[itemprop=byArtist]");
        if (jVarC4 == null || (strD3 = jVarC4.d0()) == null || (string3 = k.A0(strD3).toString()) == null) {
            j jVarC5 = jVar.c0("td.song__artist--search");
            if (jVarC5 != null && (strD1 = jVarC5.d0()) != null) {
                str = k.A0(strD1).toString();
            }
            str4 = str;
        } else {
            str4 = string3;
        }
        j jVarC6 = jVar.c0("[itemprop=inAlbum]");
        if (jVarC6 == null) {
            jVarC6 = jVar.c0("td.song__album--search");
        }
        String str8 = (jVarC6 == null || (strD2 = jVarC6.d0()) == null || (string2 = k.A0(strD2).toString()) == null) ? str2 : string2;
        String str9 = (jVarC6 == null || (jVarC0 = jVarC6.c0("a")) == null || (strB = jVarC0.b("href")) == null) ? str3 : strB;
        j jVarC7 = jVar.c0("[itemprop=duration]");
        String strD6 = jVarC7 != null ? jVarC7.d("content") : null;
        if (strD6 != null) {
            int i = 0;
            if (r.O(strD6, "PT", false)) {
                try {
                    Pattern patternCompile = Pattern.compile("(\\d+)M");
                    patternCompile.getClass();
                    Matcher matcher = patternCompile.matcher(strD6);
                    matcher.getClass();
                    kotlin.text.g gVarC = com.google.android.material.shape.k.C(matcher, 0, strD6);
                    int i2 = (gVarC == null || (str6 = (String) ((b0) gVarC.a()).get(1)) == null) ? 0 : Integer.parseInt(str6);
                    Pattern patternCompile2 = Pattern.compile("(\\d+)S");
                    patternCompile2.getClass();
                    Matcher matcher2 = patternCompile2.matcher(strD6);
                    matcher2.getClass();
                    kotlin.text.g gVarC2 = com.google.android.material.shape.k.C(matcher2, 0, strD6);
                    if (gVarC2 != null && (str5 = (String) ((b0) gVarC2.a()).get(1)) != null) {
                        i = Integer.parseInt(str5);
                    }
                    if (i2 > 0) {
                        strD6 = i2 + ":" + String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
                    } else {
                        strD6 = "0:".concat(String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)));
                    }
                } catch (Exception unused) {
                }
            }
        }
        return new MusicTrack(strD, strD5, str7, str4, str8, strD6, null, str9);
    }

    public static org.jsoup.nodes.g j(c cVar, String str) {
        try {
            a0 a0Var = new a0();
            a0Var.d(str);
            a0Var.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:121.0) Gecko/20100101 Firefox/121.0");
            a0Var.b("Referer", "https://musicmp3.ru/");
            okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
            y yVar = cVar.b;
            yVar.getClass();
            g0 g0VarE = new m(yVar, b0Var, false).e();
            if (g0VarE.N) {
                return e0.a(g0VarE.D.z(), str);
            }
            return null;
        } catch (Exception e) {
            o oVar = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.b("MusicMp3Source", "Fetch failed: ".concat(str), e);
            return null;
        }
    }

    public static j k(j jVar, String str) {
        j jVar2;
        j jVarC0;
        j jVarC1;
        j jVar3 = jVar.e;
        if (jVar3 != null && (jVarC1 = jVar3.c0(".".concat(str))) != null) {
            return jVarC1;
        }
        j jVar4 = jVar.e;
        if (jVar4 == null || (jVar2 = jVar4.e) == null || (jVarC0 = jVar2.c0(".".concat(str))) == null) {
            return null;
        }
        return jVarC0;
    }

    @Override // com.app.mlounge.data.music.d
    public final Object a(String str, String str2, kotlin.coroutines.d dVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new u0(this, str, str2, null, 2), dVar);
    }

    @Override // com.app.mlounge.data.music.d
    public final Object b(String str, String str2, Object obj, z zVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new b(obj, str, this, null, 0), zVar);
    }

    @Override // com.app.mlounge.data.music.d
    public final Object c(String str, String str2, Object obj, z zVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new b(obj, str, this, null, 2), zVar);
    }

    @Override // com.app.mlounge.data.music.d
    public final Object d(String str, String str2, Object obj, z zVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new androidx.compose.foundation.text.a0(this, obj, str, str2, (kotlin.coroutines.d) null), zVar);
    }

    @Override // com.app.mlounge.data.music.d
    public final Object e(String str, com.app.mlounge.data.repository.y yVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new a(this, str, null, 0), yVar);
    }

    @Override // com.app.mlounge.data.music.d
    public final Object f(String str, com.app.mlounge.data.repository.y yVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new a(this, str, null, 1), yVar);
    }

    @Override // com.app.mlounge.data.music.d
    public final Object g(String str, String str2, Object obj, z zVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new b(obj, str, this, null, 1), zVar);
    }

    @Override // com.app.mlounge.data.music.d
    public final String getName() {
        return "MusicMp3";
    }
}
