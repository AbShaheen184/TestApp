package com.app.mlounge.data.iptv;

import android.content.Context;
import androidx.compose.animation.core.c1;
import com.app.mlounge.data.remote.model.IptvChannel;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import okhttp3.g0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l {
    public static final int $stable = 8;
    private static final String CHANNELS_FILE = "custom_channels.json";
    public static final a Companion = new a();
    private static final String EPG_FILE = "custom_epg.json";
    private static final String PLAYLIST_DIR = "playlists";
    public static final String SLUG = "custom";
    private static final String TAG = "CustomIPTV";
    private final com.app.mlounge.data.local.dao.k channelDao;
    private final okhttp3.y client;
    private final Context context;
    private final com.google.gson.f gson = new com.google.gson.f();
    private final File playlistDir;

    public l(Context context, okhttp3.y yVar, com.app.mlounge.data.local.dao.k kVar) {
        this.context = context;
        this.client = yVar;
        this.channelDao = kVar;
        File file = new File(context.getFilesDir(), PLAYLIST_DIR);
        file.mkdirs();
        this.playlistDir = file;
    }

    public static final String e(l lVar, String str) throws Exception {
        lVar.getClass();
        okhttp3.a0 a0Var = new okhttp3.a0();
        a0Var.d(str);
        a0Var.b("User-Agent", "Mozilla/5.0");
        okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
        okhttp3.y yVar = lVar.client;
        yVar.getClass();
        g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
        if (g0VarE.N) {
            return g0VarE.D.z();
        }
        throw new Exception(androidx.privacysandbox.ads.adservices.java.internal.a.l(g0VarE.A, "HTTP "));
    }

    public static final com.app.mlounge.data.local.entity.d f(l lVar, IptvChannel iptvChannel) {
        lVar.getClass();
        return new com.app.mlounge.data.local.entity.d(iptvChannel.c(), iptvChannel.f(), iptvChannel.b(), iptvChannel.a(), SLUG, iptvChannel.e());
    }

    public static String g(String str, String str2) {
        String strB0 = kotlin.text.k.B0(str, '/');
        if (!kotlin.text.r.O(strB0, "http://", false) && !kotlin.text.r.O(strB0, "https://", false)) {
            strB0 = "http://".concat(strB0);
        }
        return (str2 == null || kotlin.text.k.d0(str2)) ? strB0 : androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.i(strB0, ":", str2);
    }

    public final Object h(c1 c1Var) {
        new File(this.playlistDir, CHANNELS_FILE).delete();
        new File(this.playlistDir, EPG_FILE).delete();
        Object objA = ((com.app.mlounge.data.local.dao.l) this.channelDao).a(SLUG, c1Var);
        return objA == kotlin.coroutines.intrinsics.a.e ? objA : kotlin.y.a;
    }

    public final Object i(String str, com.app.mlounge.ui.viewmodel.h hVar, com.app.mlounge.ui.viewmodel.i iVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new d(hVar, str, this, null), iVar);
    }

    public final Object j(String str, String str2, String str3, String str4, com.app.mlounge.ui.viewmodel.h hVar, com.app.mlounge.ui.viewmodel.i iVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new e(this, str, str2, hVar, str3, str4, null), iVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(String str, String str2, String str3, String str4, com.app.mlounge.ui.viewmodel.h hVar, kotlin.coroutines.jvm.internal.c cVar) {
        f fVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i = fVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fVar.label = i - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objWithContext = fVar.result;
        int i2 = fVar.label;
        try {
            if (i2 == 0) {
                kotlin.a.e(objWithContext);
                String str5 = g(str, str2) + "/xmltv.php?username=" + str3 + "&password=" + str4;
                fVar.L$0 = null;
                fVar.L$1 = null;
                fVar.L$2 = null;
                fVar.L$3 = null;
                fVar.L$4 = null;
                fVar.L$5 = null;
                fVar.L$6 = null;
                fVar.label = 1;
                objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new b(hVar, str5, this, null), fVar);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objWithContext == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(objWithContext);
            }
            return (Map) objWithContext;
        } catch (Exception e) {
            kotlin.o oVar = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.f(TAG, "Xtream EPG failed: " + e.getMessage());
            return kotlin.collections.v.e;
        }
    }

    public final boolean l() {
        return new File(this.playlistDir, EPG_FILE).exists();
    }

    public final Map m(Set set) {
        File file = new File(this.playlistDir, EPG_FILE);
        if (!file.exists() || set.isEmpty()) {
            return kotlin.collections.v.e;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Type typeB = new g().b();
            com.google.gson.stream.a aVar = new com.google.gson.stream.a(new BufferedReader(new InputStreamReader(new FileInputStream(file), kotlin.text.a.a), 8192));
            try {
                aVar.g();
                while (aVar.a0()) {
                    String strH0 = aVar.h0();
                    if (set.contains(strH0)) {
                        com.google.gson.f fVar = this.gson;
                        fVar.getClass();
                        linkedHashMap.put(strH0, fVar.c(aVar, new com.google.gson.reflect.a(typeB)));
                    } else {
                        aVar.t0();
                    }
                }
                aVar.L();
                aVar.close();
                return linkedHashMap;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    com.google.common.base.b.d(aVar, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            kotlin.o oVar = com.app.mlounge.util.a.a;
            coil3.compose.internal.f.i("Failed to load EPG for channels: ", e.getMessage(), TAG);
            return linkedHashMap;
        }
    }

    public final void n(LinkedHashMap linkedHashMap) throws IOException {
        Type typeB = new h().b();
        File file = new File(this.playlistDir, EPG_FILE);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), kotlin.text.a.a), 8192);
        try {
            com.google.gson.f fVar = this.gson;
            fVar.getClass();
            try {
                fVar.i(linkedHashMap, typeB, fVar.f(bufferedWriter));
                bufferedWriter.close();
            } catch (IOException e) {
                throw new com.google.gson.i(e, 8);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                com.google.common.base.b.d(bufferedWriter, th);
                throw th2;
            }
        }
    }

    public final Object o(String str, com.app.mlounge.ui.viewmodel.h hVar, com.app.mlounge.ui.viewmodel.i iVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new i(hVar, str, this, null), iVar);
    }

    public final Object p(String str, com.app.mlounge.ui.viewmodel.h hVar, com.app.mlounge.ui.viewmodel.i iVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new k(hVar, str, this, null), iVar);
    }
}
