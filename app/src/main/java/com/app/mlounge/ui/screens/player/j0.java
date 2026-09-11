package com.app.mlounge.ui.screens.player;

import android.util.Log;
import com.app.mlounge.data.remote.model.IptvChannel;
import com.app.mlounge.data.remote.model.NtvChannel;
import com.app.mlounge.data.remote.model.TmdbEpisode;
import com.app.mlounge.data.remote.model.TmdbGenre;
import com.app.mlounge.data.remote.model.TmdbMovie;
import com.app.mlounge.data.remote.model.TmdbMultiResult;
import com.app.mlounge.data.remote.model.TmdbTvShow;
import com.appsalt.internal.g4;
import com.appsalt.internal.n4;
import com.appsalt.lib.longevity.RewardService;
import com.google.firebase.crashlytics.internal.model.t1;
import j$.net.URLEncoder;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Map;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j0 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;

    public /* synthetic */ j0(int i) {
        this.e = i;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) throws UnsupportedEncodingException {
        String string;
        String strE;
        String strE2;
        int i = this.e;
        int i2 = 2;
        kotlin.y yVar = kotlin.y.a;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                return Boolean.valueOf(kotlin.text.k.A0(str).toString().length() > 0);
            case 1:
                ((androidx.compose.foundation.lazy.grid.s) obj).getClass();
                return new androidx.compose.foundation.lazy.grid.b(t1.b(androidx.compose.foundation.lazy.grid.s.b));
            case 2:
                ((androidx.compose.foundation.text.o0) obj).getClass();
                return yVar;
            case 3:
                File file = (File) obj;
                file.getClass();
                return Boolean.valueOf(file.isFile());
            case 4:
                File file2 = (File) obj;
                file2.getClass();
                String absolutePath = file2.getAbsolutePath();
                absolutePath.getClass();
                return absolutePath;
            case 5:
                TmdbEpisode tmdbEpisode = (TmdbEpisode) obj;
                tmdbEpisode.getClass();
                return androidx.privacysandbox.ads.adservices.java.internal.a.l(tmdbEpisode.b(), "ep_");
            case 6:
                TmdbGenre tmdbGenre = (TmdbGenre) obj;
                tmdbGenre.getClass();
                return tmdbGenre.b();
            case 7:
                return Integer.valueOf(((TmdbMovie) obj).a());
            case 8:
                return Integer.valueOf(((TmdbMultiResult) obj).b());
            case 9:
                NtvChannel ntvChannel = (NtvChannel) obj;
                ntvChannel.getClass();
                String strF = ntvChannel.f();
                String str2 = strF == null ? "cdnlive" : strF;
                if (str2.equals("cdnlive")) {
                    return null;
                }
                if (str2.equals("hesgoales") && ((strE2 = ntvChannel.e()) == null || !kotlin.text.k.T(strE2, "livelive24.com", false))) {
                    return null;
                }
                if (str2.equals("hesgoales") || ((strE = ntvChannel.e()) != null && kotlin.text.k.T(strE, "livelive24.com", false))) {
                    String strE3 = ntvChannel.e();
                    if (strE3 == null) {
                        strE3 = "";
                    }
                    String strEncode = URLEncoder.encode(strE3, "UTF-8");
                    String strD = ntvChannel.d();
                    if (strD == null) {
                        strD = "Unknown";
                    }
                    String strA = ntvChannel.a();
                    if (strA == null) {
                        strA = "";
                    }
                    String strB = ntvChannel.b();
                    String str3 = strB != null ? strB : "";
                    StringBuilder sbO = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.o("ntv://", strD, "|", strA, "|");
                    androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.y(sbO, str2, "|", str3, "|");
                    sbO.append(strEncode);
                    string = sbO.toString();
                } else {
                    String strD2 = ntvChannel.d();
                    if (strD2 == null) {
                        strD2 = "Unknown";
                    }
                    String strA2 = ntvChannel.a();
                    if (strA2 == null) {
                        strA2 = "";
                    }
                    String strB2 = ntvChannel.b();
                    string = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.k(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.o("ntv://", strD2, "|", strA2, "|"), str2, "|", strB2 != null ? strB2 : "");
                }
                String str4 = string;
                String strD3 = ntvChannel.d();
                return new IptvChannel(strD3 == null ? "Unknown" : strD3, str4, ntvChannel.c(), str2, "ntv", ntvChannel.b());
            case 10:
                return Integer.valueOf(((TmdbTvShow) obj).b());
            case 11:
                return (Comparable) ((kotlin.k) obj).e;
            case 12:
                return (Comparable) ((kotlin.k) obj).y;
            case 13:
                return yVar;
            case 14:
                Byte b = (Byte) obj;
                b.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b}, 1));
            case 15:
                int iByteValue = ((Byte) obj).byteValue() & 255;
                com.google.android.material.shape.e.a(16);
                String string2 = Integer.toString(iByteValue, 16);
                string2.getClass();
                return kotlin.text.k.h0(2, string2);
            case 16:
                String strD0 = kotlin.text.k.D0((String) obj, '0');
                return kotlin.text.k.d0(strD0) ? "0" : strD0;
            case 17:
                return new n4((g4) obj, new com.appsalt.internal.w(1));
            case 18:
                ((Boolean) obj).getClass();
                boolean z = RewardService.C;
                return yVar;
            case 19:
                boolean z2 = RewardService.C;
                return yVar;
            case 20:
                androidx.datastore.core.b bVar = (androidx.datastore.core.b) obj;
                bVar.getClass();
                Log.w("FirebaseSessions", "CorruptionException in session configs DataStore", bVar);
                return com.google.firebase.sessions.settings.h.b;
            case 21:
                return Boolean.valueOf(obj == null);
            case 22:
                return CoroutineDispatcher.Key._init_$lambda$0((kotlin.coroutines.g) obj);
            case 23:
                return ExecutorCoroutineDispatcher.Key._init_$lambda$0((kotlin.coroutines.g) obj);
            case 24:
                return Boolean.valueOf(DebugProbesImpl.dumpCoroutinesSynchronized$lambda$14((DebugProbesImpl.CoroutineOwner) obj));
            case 25:
                kotlinx.serialization.descriptors.a aVar = (kotlinx.serialization.descriptors.a) obj;
                aVar.getClass();
                kotlinx.serialization.descriptors.a.a(aVar, "JsonPrimitive", new kotlinx.serialization.json.l(new kotlinx.coroutines.debug.internal.b(i2)));
                kotlinx.serialization.descriptors.a.a(aVar, "JsonNull", new kotlinx.serialization.json.l(new kotlinx.coroutines.debug.internal.b(3)));
                kotlinx.serialization.descriptors.a.a(aVar, "JsonLiteral", new kotlinx.serialization.json.l(new kotlinx.coroutines.debug.internal.b(4)));
                kotlinx.serialization.descriptors.a.a(aVar, "JsonObject", new kotlinx.serialization.json.l(new kotlinx.coroutines.debug.internal.b(5)));
                kotlinx.serialization.descriptors.a.a(aVar, "JsonArray", new kotlinx.serialization.json.l(new kotlinx.coroutines.debug.internal.b(6)));
                return yVar;
            case 26:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str5 = (String) entry.getKey();
                kotlinx.serialization.json.i iVar = (kotlinx.serialization.json.i) entry.getValue();
                StringBuilder sb = new StringBuilder();
                kotlinx.serialization.json.internal.p.a(str5, sb);
                sb.append(':');
                sb.append(iVar);
                return sb.toString();
            case 27:
                okhttp3.internal.b bVar2 = (okhttp3.internal.b) obj;
                bVar2.getClass();
                com.google.android.material.shape.k kVar = bVar2.d;
                if (kVar instanceof okhttp3.internal.b) {
                    return (okhttp3.internal.b) kVar;
                }
                return null;
            case 28:
                okhttp3.internal.b bVar3 = (okhttp3.internal.b) obj;
                bVar3.getClass();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(bVar3.b);
                sb2.append('=');
                sb2.append(bVar3.c);
                return sb2.toString();
            default:
                okio.internal.i iVar2 = (okio.internal.i) obj;
                iVar2.getClass();
                okio.x xVar = okio.internal.g.C;
                return Boolean.valueOf(com.google.android.gms.measurement.internal.c0.n(iVar2.a));
        }
    }
}
