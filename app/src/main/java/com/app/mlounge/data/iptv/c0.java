package com.app.mlounge.data.iptv;

import android.content.Context;
import com.app.mlounge.data.providers.h1;
import com.app.mlounge.data.remote.model.IptvChannel;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import okhttp3.g0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {
    public static final int $stable = 8;
    private static final String META_FILE = "meta.json";
    private static final String PLAYLISTS_DIR = "playlists";
    private static final String SCRAPER_BASE = "https://raw.githubusercontent.com/abusaeeidx/IPTV-Scraper-Zilla/refs/heads/main";
    private static final String TAG = "PlaylistManager";
    private final com.app.mlounge.data.local.dao.k channelDao;
    private final okhttp3.y client;
    private final Context context;
    private final EarthCamProvider earthCamProvider;
    private final com.google.gson.f gson = new com.google.gson.f();
    private final File playlistDir;
    private final h1 plutoTvProvider;
    public static final v Companion = new v();
    private static final Map<String, String> PROVIDER_SOURCES = kotlin.collections.a0.v(new kotlin.k("xumo", "https://raw.githubusercontent.com/abusaeeidx/IPTV-Scraper-Zilla/refs/heads/main/xumo_playlist.m3u"), new kotlin.k("tubi", "https://raw.githubusercontent.com/abusaeeidx/IPTV-Scraper-Zilla/refs/heads/main/tubi_playlist.m3u"), new kotlin.k("yupptv", "https://raw.githubusercontent.com/abusaeeidx/IPTV-Scraper-Zilla/refs/heads/main/Yupptv.m3u"), new kotlin.k("uslocal", "https://raw.githubusercontent.com/abusaeeidx/IPTV-Scraper-Zilla/refs/heads/main/US_LOCAL.m3u"), new kotlin.k("samsungtv", "https://raw.githubusercontent.com/abusaeeidx/IPTV-Scraper-Zilla/refs/heads/main/SamsungTVPlus-All.m3u"), new kotlin.k("roku", "https://raw.githubusercontent.com/abusaeeidx/IPTV-Scraper-Zilla/refs/heads/main/Roku-All.m3u"), new kotlin.k("lgtv", "https://raw.githubusercontent.com/abusaeeidx/IPTV-Scraper-Zilla/refs/heads/main/LGTV.m3u"), new kotlin.k("iptvorg", "https://iptv-org.github.io/iptv/index.m3u"));

    public c0(Context context, okhttp3.y yVar, com.app.mlounge.data.local.dao.k kVar) {
        this.context = context;
        this.client = yVar;
        this.channelDao = kVar;
        File file = new File(context.getFilesDir(), PLAYLISTS_DIR);
        this.playlistDir = file;
        this.earthCamProvider = new EarthCamProvider(yVar);
        this.plutoTvProvider = new h1(yVar);
        file.mkdirs();
    }

    public static final void a(c0 c0Var) {
        c0Var.getClass();
        Companion.getClass();
        LinkedHashSet linkedHashSetR = com.google.common.base.i.r(com.google.common.base.i.s(com.google.common.base.i.s(PROVIDER_SOURCES.keySet(), "plutotv"), "earthcam"), com.google.common.base.i.t(META_FILE));
        ArrayList arrayList = new ArrayList(kotlin.collections.p.y(linkedHashSetR, 10));
        Iterator it = linkedHashSetR.iterator();
        while (it.hasNext()) {
            arrayList.add(((String) it.next()) + ".json");
        }
        LinkedHashSet linkedHashSetR2 = com.google.common.base.i.r(kotlin.collections.o.o0(arrayList), kotlin.collections.n.W(new String[]{META_FILE, "custom_channels.json", "custom_epg.json"}));
        File[] fileArrListFiles = c0Var.playlistDir.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (!linkedHashSetR2.contains(file.getName())) {
                    file.delete();
                    kotlin.o oVar = com.app.mlounge.util.a.a;
                    file.getName();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0153 A[Catch: Exception -> 0x007d, TRY_LEAVE, TryCatch #0 {Exception -> 0x007d, blocks: (B:21:0x0078, B:45:0x014d, B:47:0x0153), top: B:58:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x016e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0172  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public static final Object b(c0 c0Var, String str, kotlin.coroutines.jvm.internal.c cVar) {
        w wVar;
        InputStream inputStreamA;
        kotlin.jvm.internal.x xVar;
        List arrayList;
        String str2;
        List list;
        com.app.mlounge.data.local.dao.k kVar;
        kotlin.jvm.internal.x xVar2;
        c0Var.getClass();
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i = wVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                wVar.label = i - Integer.MIN_VALUE;
            } else {
                wVar = new w(c0Var, cVar);
            }
        } else {
            wVar = new w(c0Var, cVar);
        }
        Object obj = wVar.result;
        int i2 = wVar.label;
        int i3 = 0;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        try {
            if (i2 == 0) {
                kotlin.a.e(obj);
                String str3 = PROVIDER_SOURCES.get(str);
                if (str3 == null) {
                    return new Integer(0);
                }
                okhttp3.a0 a0Var = new okhttp3.a0();
                a0Var.d(str3);
                a0Var.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120.0.0.0 Safari/537.36");
                okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
                okhttp3.y yVar = c0Var.client;
                yVar.getClass();
                g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
                if (!g0VarE.N) {
                    kotlin.o oVar = com.app.mlounge.util.a.a;
                    com.app.mlounge.util.a.a(TAG, "Failed to download M3U for " + str + ": HTTP " + g0VarE.A);
                    return new Integer(0);
                }
                inputStreamA = g0VarE.D.a();
                xVar = new kotlin.jvm.internal.x();
                arrayList = new ArrayList();
                com.app.mlounge.data.local.dao.k kVar2 = c0Var.channelDao;
                wVar.L$0 = str;
                wVar.L$1 = null;
                wVar.L$2 = null;
                wVar.L$3 = null;
                wVar.L$4 = inputStreamA;
                wVar.L$5 = xVar;
                wVar.L$6 = arrayList;
                wVar.label = 1;
                if (((com.app.mlounge.data.local.dao.l) kVar2).a(str, wVar) == aVar) {
                }
                return aVar;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    list = (List) wVar.L$6;
                    xVar = (kotlin.jvm.internal.x) wVar.L$5;
                    str2 = (String) wVar.L$0;
                    try {
                        kotlin.a.e(obj);
                        if (!list.isEmpty()) {
                            kVar = c0Var.channelDao;
                            wVar.L$0 = str2;
                            wVar.L$1 = null;
                            wVar.L$2 = null;
                            wVar.L$3 = null;
                            wVar.L$4 = null;
                            wVar.L$5 = xVar;
                            wVar.L$6 = null;
                            wVar.label = 3;
                            if (((com.app.mlounge.data.local.dao.l) kVar).b(list, wVar) != aVar) {
                                xVar2 = xVar;
                            }
                            return aVar;
                        }
                        i3 = xVar.e;
                    } catch (Exception e) {
                        e = e;
                        str = str2;
                        kotlin.o oVar2 = com.app.mlounge.util.a.a;
                        com.app.mlounge.util.a.a(TAG, "Error syncing M3U for " + str + ": " + e.getMessage());
                    }
                    return new Integer(i3);
                }
                if (i2 != 3) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xVar2 = (kotlin.jvm.internal.x) wVar.L$5;
                kotlin.a.e(obj);
                xVar = xVar2;
                i3 = xVar.e;
                return new Integer(i3);
            }
            List list2 = (List) wVar.L$6;
            xVar = (kotlin.jvm.internal.x) wVar.L$5;
            inputStreamA = (InputStream) wVar.L$4;
            String str4 = (String) wVar.L$0;
            try {
                kotlin.a.e(obj);
                arrayList = list2;
                str = str4;
            } catch (Exception e2) {
                e = e2;
                str = str4;
                kotlin.o oVar3 = com.app.mlounge.util.a.a;
                com.app.mlounge.util.a.a(TAG, "Error syncing M3U for " + str + ": " + e.getMessage());
            }
            u uVar = u.INSTANCE;
            x xVar3 = new x(arrayList, c0Var, xVar, null);
            wVar.L$0 = str;
            wVar.L$1 = null;
            wVar.L$2 = null;
            wVar.L$3 = null;
            wVar.L$4 = null;
            wVar.L$5 = xVar;
            wVar.L$6 = arrayList;
            wVar.label = 2;
            if (uVar.a(inputStreamA, str, xVar3, wVar) != aVar) {
                str2 = str;
                list = arrayList;
                if (!list.isEmpty()) {
                    kVar = c0Var.channelDao;
                    wVar.L$0 = str2;
                    wVar.L$1 = null;
                    wVar.L$2 = null;
                    wVar.L$3 = null;
                    wVar.L$4 = null;
                    wVar.L$5 = xVar;
                    wVar.L$6 = null;
                    wVar.label = 3;
                    if (((com.app.mlounge.data.local.dao.l) kVar).b(list, wVar) != aVar) {
                        xVar2 = xVar;
                        xVar = xVar2;
                    }
                }
                i3 = xVar.e;
                return new Integer(i3);
            }
            return aVar;
        } catch (Exception e3) {
            e = e3;
        }
    }

    public static final void e(c0 c0Var, Map map) {
        c0Var.getClass();
        Map mapV = kotlin.collections.a0.v(new kotlin.k("lastUpdated", Long.valueOf(System.currentTimeMillis())), new kotlin.k("providers", map));
        File file = new File(c0Var.playlistDir, META_FILE);
        com.google.gson.f fVar = c0Var.gson;
        fVar.getClass();
        Class<?> cls = mapV.getClass();
        StringBuilder sb = new StringBuilder();
        try {
            fVar.i(mapV, cls, fVar.f(new androidx.fragment.app.j(sb)));
            kotlin.io.j.B(file, sb.toString());
        } catch (IOException e) {
            throw new com.google.gson.i(e, 8);
        }
    }

    public static final com.app.mlounge.data.local.entity.d f(c0 c0Var, IptvChannel iptvChannel) {
        c0Var.getClass();
        String strC = iptvChannel.c();
        String strF = iptvChannel.f();
        String strB = iptvChannel.b();
        String strA = iptvChannel.a();
        String strD = iptvChannel.d();
        if (strD == null) {
            strD = "unknown";
        }
        return new com.app.mlounge.data.local.entity.d(strC, strF, strB, strA, strD, iptvChannel.e());
    }

    public final EarthCamProvider g() {
        return this.earthCamProvider;
    }

    public final h1 h() {
        return this.plutoTvProvider;
    }
}
