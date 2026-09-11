package com.app.mlounge.data.anime;

import androidx.privacysandbox.ads.adservices.java.internal.a;
import androidx.room.coroutines.d;
import androidx.room.z;
import com.app.mlounge.data.remote.model.HiAnimeAnimeData;
import com.app.mlounge.data.remote.model.HiAnimeCategoryData;
import com.app.mlounge.data.remote.model.HiAnimeDetailData;
import com.app.mlounge.data.remote.model.HiAnimeEpCount;
import com.app.mlounge.data.remote.model.HiAnimeEpisode;
import com.app.mlounge.data.remote.model.HiAnimeEpisodesData;
import com.app.mlounge.data.remote.model.HiAnimeGenresData;
import com.app.mlounge.data.remote.model.HiAnimeHome;
import com.app.mlounge.data.remote.model.HiAnimeInfo;
import com.app.mlounge.data.remote.model.HiAnimeItem;
import com.app.mlounge.data.remote.model.HiAnimeMoreInfo;
import com.app.mlounge.data.remote.model.HiAnimeResponse;
import com.app.mlounge.data.remote.model.HiAnimeSearchData;
import com.app.mlounge.data.remote.model.HiAnimeServer;
import com.app.mlounge.data.remote.model.HiAnimeServersData;
import com.app.mlounge.data.remote.model.HiAnimeSource;
import com.app.mlounge.data.remote.model.HiAnimeSourcesData;
import com.app.mlounge.data.remote.model.HiAnimeStats;
import com.app.mlounge.data.remote.model.HiAnimeTrack;
import com.google.common.base.b;
import com.google.common.base.c;
import com.google.gson.f;
import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.k;
import j$.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.a0;
import kotlin.collections.n;
import kotlin.collections.p;
import kotlin.collections.u;
import kotlin.h;
import kotlin.jvm.internal.l;
import kotlin.o;
import kotlin.text.r;
import okhttp3.b0;
import okhttp3.g0;
import okhttp3.internal.connection.m;
import okhttp3.x;
import okhttp3.y;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class AnikotoScraper {
    private static final String API_BASE = "https://anikoto.ddns.me/api";
    private static final String TAG = "AnikotoScraper";
    private static final String UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/124.0 Safari/537.36";
    private final y client;
    private final f gson;
    private final Map<String, k> watchCache;
    private final h watchClient$delegate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final List<String> GENRES = c.q("Action", "Adventure", "Cars", "Comedy", "Dementia", "Demons", "Drama", "Ecchi", "Fantasy", "Game", "Harem", "Historical", "Horror", "Isekai", "Josei", "Kids", "Magic", "Mahou Shoujo", "Martial Arts", "Mecha", "Military", "Music", "Mystery", "Parody", "Police", "Psychological", "Romance", "Samurai", "School", "Sci-Fi", "Seinen", "Shoujo", "Shoujo Ai", "Shounen", "Shounen Ai", "Slice of Life", "Space", "Sports", "Super Power", "Supernatural", "Thriller", "unknown", "Vampire", "Movie", "ONA", "OVA", "Special", "TV", "Updated", "Added", "Most Viewed", "Upcoming", "Ongoing");
    private static final Map<String, Integer> GENRE_ID_MAP = a0.v(new kotlin.k("Action", 1), new kotlin.k("Adventure", 2), new kotlin.k("Cars", 538), new kotlin.k("Comedy", 8), new kotlin.k("Dementia", 453), new kotlin.k("Demons", Integer.valueOf(Token.INC)), new kotlin.k("Drama", 62), new kotlin.k("Ecchi", 214), new kotlin.k("Fantasy", 3), new kotlin.k("Game", 180), new kotlin.k("Harem", 215), new kotlin.k("Historical", 70), new kotlin.k("Horror", 222), new kotlin.k("Isekai", 74), new kotlin.k("Josei", 404), new kotlin.k("Kids", 46), new kotlin.k("Magic", 203), new kotlin.k("Martial Arts", 114), new kotlin.k("Mecha", Integer.valueOf(Token.EXPORT)), new kotlin.k("Military", Integer.valueOf(Token.IF)), new kotlin.k("Music", 242), new kotlin.k("Mystery", 57), new kotlin.k("Parody", Integer.valueOf(Token.XMLEND)), new kotlin.k("Police", Integer.valueOf(Token.WITH)), new kotlin.k("Psychological", 73), new kotlin.k("Romance", 28), new kotlin.k("Samurai", Integer.valueOf(Token.TO_OBJECT)), new kotlin.k("School", 14), new kotlin.k("Sci-Fi", 12), new kotlin.k("Seinen", 50), new kotlin.k("Shoujo", 252), new kotlin.k("Shoujo Ai", 235), new kotlin.k("Shounen", 15), new kotlin.k("Shounen Ai", 233), new kotlin.k("Slice of Life", 35), new kotlin.k("Space", Integer.valueOf(Token.IMPORT)), new kotlin.k("Sports", 29), new kotlin.k("Super Power", 16), new kotlin.k("Supernatural", 9), new kotlin.k("Thriller", 54), new kotlin.k("Vampire", 58));
    private static final Set<String> TYPE_CHIPS = n.W(new String[]{"Movie", "Music", "ONA", "OVA", "Special", "TV"});
    private static final Map<String, String> CATEGORY_SORT_MAP = a0.v(new kotlin.k("Updated", "latest-updated"), new kotlin.k("Added", "latest-added"), new kotlin.k("Most Viewed", "most-viewed"));
    private static final Map<String, String> CATEGORY_STATUS_MAP = a0.v(new kotlin.k("Ongoing", "currently-airing"), new kotlin.k("Upcoming", "not-yet-aired"));
    private static final Map<String, String> TYPE_NORMALIZE_MAP = a0.v(new kotlin.k("tv", "TV"), new kotlin.k("movie", "Movie"), new kotlin.k("ova", "OVA"), new kotlin.k("ona", "ONA"), new kotlin.k("special", "Special"));

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class Envelope {
        private final com.google.gson.h data;
        private final Boolean ok;

        public Envelope(Boolean bool, com.google.gson.h hVar) {
            this.ok = bool;
            this.data = hVar;
        }

        public static /* synthetic */ Envelope copy$default(Envelope envelope, Boolean bool, com.google.gson.h hVar, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = envelope.ok;
            }
            if ((i & 2) != 0) {
                hVar = envelope.data;
            }
            return envelope.copy(bool, hVar);
        }

        public final Boolean component1() {
            return this.ok;
        }

        public final com.google.gson.h component2() {
            return this.data;
        }

        public final Envelope copy(Boolean bool, com.google.gson.h hVar) {
            return new Envelope(bool, hVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Envelope)) {
                return false;
            }
            Envelope envelope = (Envelope) obj;
            return l.a(this.ok, envelope.ok) && l.a(this.data, envelope.data);
        }

        public final com.google.gson.h getData() {
            return this.data;
        }

        public final Boolean getOk() {
            return this.ok;
        }

        public int hashCode() {
            Boolean bool = this.ok;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            com.google.gson.h hVar = this.data;
            return iHashCode + (hVar != null ? hVar.hashCode() : 0);
        }

        public String toString() {
            return "Envelope(ok=" + this.ok + ", data=" + this.data + ")";
        }
    }

    public AnikotoScraper(y yVar) {
        yVar.getClass();
        this.client = yVar;
        this.gson = new f();
        this.watchClient$delegate = new o(new d(this, 11));
        this.watchCache = Collections.synchronizedMap(new LinkedHashMap<String, k>() { // from class: com.app.mlounge.data.anime.AnikotoScraper$watchCache$1
            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsKey(Object obj) {
                if (obj instanceof String) {
                    return containsKey((String) obj);
                }
                return false;
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsValue(Object obj) {
                if (obj instanceof k) {
                    return containsValue((k) obj);
                }
                return false;
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Map.Entry<String, k>> entrySet() {
                return getEntries();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ k get(Object obj) {
                if (obj instanceof String) {
                    return get((String) obj);
                }
                return null;
            }

            public /* bridge */ Set<Map.Entry<String, k>> getEntries() {
                return super.entrySet();
            }

            public /* bridge */ Set<String> getKeys() {
                return super.keySet();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
                return !(obj instanceof String) ? obj2 : getOrDefault((String) obj, (k) obj2);
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ Collection<k> getValues() {
                return super.values();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<String> keySet() {
                return getKeys();
            }

            @Override // java.util.HashMap, java.util.Map
            public final /* bridge */ boolean remove(Object obj, Object obj2) {
                if ((obj instanceof String) && (obj2 instanceof k)) {
                    return remove((String) obj, (k) obj2);
                }
                return false;
            }

            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry<String, k> entry) {
                entry.getClass();
                return size() > 100;
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ int size() {
                return getSize();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Collection<k> values() {
                return getValues();
            }

            public /* bridge */ boolean containsKey(String str) {
                return super.containsKey((Object) str);
            }

            public /* bridge */ boolean containsValue(k kVar) {
                return super.containsValue((Object) kVar);
            }

            public /* bridge */ k get(String str) {
                return (k) super.get((Object) str);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object get(Object obj) {
                if (obj instanceof String) {
                    return get((String) obj);
                }
                return null;
            }

            public /* bridge */ k getOrDefault(String str, k kVar) {
                return (k) super.getOrDefault((Object) str, kVar);
            }

            public final /* bridge */ k getOrDefault(Object obj, k kVar) {
                return !(obj instanceof String) ? kVar : getOrDefault((String) obj, kVar);
            }

            public /* bridge */ k remove(String str) {
                return (k) super.remove((Object) str);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object remove(Object obj) {
                if (obj instanceof String) {
                    return remove((String) obj);
                }
                return null;
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ k remove(Object obj) {
                if (obj instanceof String) {
                    return remove((String) obj);
                }
                return null;
            }

            public /* bridge */ boolean remove(String str, k kVar) {
                return super.remove((Object) str, (Object) kVar);
            }
        });
    }

    private final String buildFilterUrl(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder(a.l(i, "https://anikoto.ddns.me/api/filter?page="));
        Map<String, String> map = CATEGORY_SORT_MAP;
        String lowerCase = null;
        if (map.containsKey(str)) {
            sb.append("&sort=" + ((Object) map.get(str)));
            Map<String, String> map2 = TYPE_NORMALIZE_MAP;
            if (str2 != null) {
                lowerCase = str2.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            }
            String str3 = map2.get(lowerCase);
            if (str3 != null) {
                sb.append("&term_type[]=".concat(str3));
            }
        } else {
            Map<String, String> map3 = CATEGORY_STATUS_MAP;
            if (map3.containsKey(str)) {
                sb.append("&status[]=" + ((Object) map3.get(str)) + "&sort=latest-updated");
                Map<String, String> map4 = TYPE_NORMALIZE_MAP;
                if (str2 != null) {
                    lowerCase = str2.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                }
                String str4 = map4.get(lowerCase);
                if (str4 != null) {
                    sb.append("&term_type[]=".concat(str4));
                }
            } else if (TYPE_CHIPS.contains(str)) {
                sb.append("&term_type[]=" + str + "&sort=latest-updated");
            } else {
                Integer num = GENRE_ID_MAP.get(str);
                if (num != null) {
                    sb.append("&genre[]=" + num.intValue());
                }
                sb.append("&sort=latest-updated");
                Map<String, String> map5 = TYPE_NORMALIZE_MAP;
                if (str2 != null) {
                    lowerCase = str2.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                }
                String str5 = map5.get(lowerCase);
                if (str5 != null) {
                    sb.append("&term_type[]=".concat(str5));
                }
            }
        }
        return sb.toString();
    }

    private final HiAnimeResponse<HiAnimeHome> emptyHome() {
        u uVar = u.e;
        return new HiAnimeResponse<>(new HiAnimeHome(uVar, uVar, uVar));
    }

    private final String fetch(String str) {
        try {
            okhttp3.a0 a0Var = new okhttp3.a0();
            a0Var.d(str);
            a0Var.b("User-Agent", UA);
            b0 b0Var = new b0(a0Var);
            y yVar = this.client;
            yVar.getClass();
            g0 g0VarE = new m(yVar, b0Var, false).e();
            try {
                String strZ = g0VarE.N ? g0VarE.D.z() : null;
                g0VarE.close();
                return strZ;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    b.d(g0VarE, th);
                    throw th2;
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }

    private final k fetchWatch(String str, String str2) {
        com.google.gson.h data;
        String strI = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.i(str, "|", str2);
        k kVar = this.watchCache.get(strI);
        if (kVar != null) {
            return kVar;
        }
        try {
            okhttp3.a0 a0Var = new okhttp3.a0();
            a0Var.d("https://anikoto.ddns.me/api/watch/" + str + "?ep=" + str2);
            a0Var.b("User-Agent", UA);
            b0 b0Var = new b0(a0Var);
            y watchClient = getWatchClient();
            watchClient.getClass();
            g0 g0VarE = new m(watchClient, b0Var, false).e();
            try {
                String strZ = g0VarE.N ? g0VarE.D.z() : null;
                g0VarE.close();
                if (strZ != null) {
                    Envelope envelope = (Envelope) this.gson.d(Envelope.class, strZ);
                    if (l.a(envelope.getOk(), Boolean.TRUE) && (data = envelope.getData()) != null) {
                        k kVarE = data.e();
                        Map<String, k> map = this.watchCache;
                        map.getClass();
                        map.put(strI, kVarE);
                        return kVarE;
                    }
                }
                return null;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    b.d(g0VarE, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            o oVar = com.app.mlounge.util.a.a;
            coil3.compose.internal.f.i("fetchWatch: ", e.getMessage(), TAG);
            return null;
        }
    }

    public static /* synthetic */ HiAnimeResponse getAnimeByCategory$default(AnikotoScraper anikotoScraper, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return anikotoScraper.getAnimeByCategory(str, i);
    }

    public static /* synthetic */ HiAnimeResponse getAnimeByGenre$default(AnikotoScraper anikotoScraper, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        return anikotoScraper.getAnimeByGenre(str, i, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence getAnimeDetail$lambda$14(com.google.gson.h hVar) {
        String strH = hVar.h();
        strH.getClass();
        return strH;
    }

    public static /* synthetic */ HiAnimeResponse getAnimeEpisodeSources$default(AnikotoScraper anikotoScraper, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "HD-1";
        }
        if ((i & 4) != 0) {
            str3 = "sub";
        }
        return anikotoScraper.getAnimeEpisodeSources(str, str2, str3);
    }

    public static /* synthetic */ HiAnimeResponse getHomePage$default(AnikotoScraper anikotoScraper, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return anikotoScraper.getHomePage(str);
    }

    private final y getWatchClient() {
        return (y) this.watchClient$delegate.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:106:0x010e  */
    /* JADX WARN: Code duplicated, block: B:13:0x001a  */
    /* JADX WARN: Code duplicated, block: B:15:0x0022  */
    /* JADX WARN: Code duplicated, block: B:18:0x0027  */
    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0032 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x004e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0063  */
    /* JADX WARN: Code duplicated, block: B:50:0x007a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0091  */
    /* JADX WARN: Code duplicated, block: B:68:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:86:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:96:0x00f2  */
    private final HiAnimeItem parseCard(k kVar) {
        com.google.gson.h hVarL;
        String strH;
        String strH2;
        String strH3;
        String strH4;
        String strH5;
        String strH6;
        String strH7;
        String strH8;
        Integer numValueOf;
        Integer numValueOf2;
        com.google.gson.h hVarL2;
        com.google.gson.h hVarL3;
        com.google.gson.h hVarL4 = kVar.l("slug");
        String strH9 = null;
        if (hVarL4 == null) {
            hVarL = kVar.l("id");
            if (hVarL == null) {
                strH = null;
            } else {
                if (hVarL instanceof j) {
                    hVarL = null;
                }
                if (hVarL != null) {
                    strH = hVarL.h();
                } else {
                    strH = null;
                }
            }
            if (strH == null) {
                return null;
            }
        } else {
            if (hVarL4 instanceof j) {
                hVarL4 = null;
            }
            if (hVarL4 == null || (strH = hVarL4.h()) == null) {
                hVarL = kVar.l("id");
                if (hVarL == null) {
                    strH = null;
                } else {
                    if (hVarL instanceof j) {
                        hVarL = null;
                    }
                    if (hVarL != null) {
                        strH = hVarL.h();
                    } else {
                        strH = null;
                    }
                }
                if (strH == null) {
                    return null;
                }
            }
        }
        String str = strH;
        k kVarO = kVar.o("episodes");
        com.google.gson.h hVarL5 = kVar.l("title");
        if (hVarL5 == null) {
            strH2 = null;
        } else {
            if (hVarL5 instanceof j) {
                hVarL5 = null;
            }
            if (hVarL5 != null) {
                strH2 = hVarL5.h();
            } else {
                strH2 = null;
            }
        }
        com.google.gson.h hVarL6 = kVar.l("title");
        if (hVarL6 == null) {
            strH3 = null;
        } else {
            if (hVarL6 instanceof j) {
                hVarL6 = null;
            }
            if (hVarL6 != null) {
                strH3 = hVarL6.h();
            } else {
                strH3 = null;
            }
        }
        com.google.gson.h hVarL7 = kVar.l("image");
        if (hVarL7 == null) {
            strH4 = null;
        } else {
            if (hVarL7 instanceof j) {
                hVarL7 = null;
            }
            if (hVarL7 != null) {
                strH4 = hVarL7.h();
            } else {
                strH4 = null;
            }
        }
        com.google.gson.h hVarL8 = kVar.l("titleJp");
        if (hVarL8 == null) {
            strH5 = null;
        } else {
            if (hVarL8 instanceof j) {
                hVarL8 = null;
            }
            if (hVarL8 != null) {
                strH5 = hVarL8.h();
            } else {
                strH5 = null;
            }
        }
        com.google.gson.h hVarL9 = kVar.l("type");
        if (hVarL9 == null) {
            strH6 = null;
        } else {
            if (hVarL9 instanceof j) {
                hVarL9 = null;
            }
            if (hVarL9 != null) {
                strH6 = hVarL9.h();
            } else {
                strH6 = null;
            }
        }
        com.google.gson.h hVarL10 = kVar.l("date");
        if (hVarL10 == null) {
            strH7 = null;
        } else {
            if (hVarL10 instanceof j) {
                hVarL10 = null;
            }
            if (hVarL10 != null) {
                strH7 = hVarL10.h();
            } else {
                strH7 = null;
            }
        }
        com.google.gson.h hVarL11 = kVar.l("score");
        if (hVarL11 == null) {
            strH8 = null;
        } else {
            if (hVarL11 instanceof j) {
                hVarL11 = null;
            }
            if (hVarL11 != null) {
                strH8 = hVarL11.h();
            } else {
                strH8 = null;
            }
        }
        if (kVarO == null || (hVarL3 = kVarO.l("sub")) == null) {
            numValueOf = null;
        } else {
            if (hVarL3 instanceof j) {
                hVarL3 = null;
            }
            if (hVarL3 != null) {
                numValueOf = Integer.valueOf(hVarL3.c());
            } else {
                numValueOf = null;
            }
        }
        if (kVarO == null || (hVarL2 = kVarO.l("dub")) == null) {
            numValueOf2 = null;
        } else {
            if (hVarL2 instanceof j) {
                hVarL2 = null;
            }
            if (hVarL2 != null) {
                numValueOf2 = Integer.valueOf(hVarL2.c());
            } else {
                numValueOf2 = null;
            }
        }
        HiAnimeEpCount hiAnimeEpCount = new HiAnimeEpCount(numValueOf, numValueOf2);
        com.google.gson.h hVarL12 = kVar.l("synopsis");
        if (hVarL12 != null) {
            if (hVarL12 instanceof j) {
                hVarL12 = null;
            }
            if (hVarL12 != null) {
                strH9 = hVarL12.h();
            }
        }
        return new HiAnimeItem(str, strH2, strH3, strH4, strH5, strH6, strH7, strH8, hiAnimeEpCount, strH9);
    }

    private final kotlin.k parseEpisodeId(String str) {
        int iE0 = kotlin.text.k.e0(str, '|', 0, 6);
        return iE0 >= 0 ? new kotlin.k(str.substring(0, iE0), str.substring(iE0 + 1)) : new kotlin.k(str, "1");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0075  */
    /* JADX WARN: Code duplicated, block: B:34:0x007a  */
    /* JADX WARN: Code duplicated, block: B:36:0x007d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:44:0x009f  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, kotlin.collections.u] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    private final HiAnimeResponse<HiAnimeCategoryData> parseFilterResponse(com.google.gson.h hVar, int i) {
        com.google.gson.h hVarL;
        Integer numValueOf;
        com.google.gson.h hVarL2;
        Integer numValueOf2;
        ?? arrayList = u.e;
        boolean zB = true;
        if (hVar == null) {
            return new HiAnimeResponse<>(new HiAnimeCategoryData(arrayList, Integer.valueOf(i), 1, Boolean.FALSE));
        }
        k kVarE = hVar.e();
        g gVarN = kVarE.n("results");
        if (gVarN != null) {
            arrayList = new ArrayList();
            Iterator it = gVarN.e.iterator();
            while (it.hasNext()) {
                HiAnimeItem card = parseCard(((com.google.gson.h) it.next()).e());
                if (card != null) {
                    arrayList.add(card);
                }
            }
        }
        com.google.gson.h hVarL3 = kVarE.l("hasNextPage");
        if (hVarL3 == null && (hVarL3 = kVarE.l("has_next_page")) == null) {
            hVarL3 = kVarE.l("nextPage");
        }
        if (hVarL3 == null) {
            hVarL = kVarE.l("totalPages");
            if (hVarL == null && (hVarL = kVarE.l("total_pages")) == null) {
                hVarL = kVarE.l("lastPage");
            }
            if (hVarL == null) {
                numValueOf = null;
            } else {
                if (hVarL instanceof j) {
                    hVarL = null;
                }
                if (hVarL != null) {
                    numValueOf = Integer.valueOf(hVarL.c());
                } else {
                    numValueOf = null;
                }
            }
            hVarL2 = kVarE.l("total");
            if (hVarL2 == null && (hVarL2 = kVarE.l("totalResults")) == null) {
                hVarL2 = kVarE.l("totalCount");
            }
            if (hVarL2 == null) {
                numValueOf2 = null;
            } else {
                if (hVarL2 instanceof j) {
                    hVarL2 = null;
                }
                if (hVarL2 != null) {
                    numValueOf2 = Integer.valueOf(hVarL2.c());
                } else {
                    numValueOf2 = null;
                }
            }
            if (numValueOf != null ? numValueOf2 == null || arrayList.isEmpty() ? arrayList.size() < 20 : arrayList.size() * i >= numValueOf2.intValue() : i >= numValueOf.intValue()) {
            }
        } else {
            if (hVarL3 instanceof j) {
                hVarL3 = null;
            }
            if (hVarL3 != null) {
                zB = hVarL3.b();
            } else {
                hVarL = kVarE.l("totalPages");
                if (hVarL == null) {
                    hVarL = kVarE.l("lastPage");
                }
                if (hVarL == null) {
                    numValueOf = null;
                } else {
                    if (hVarL instanceof j) {
                        hVarL = null;
                    }
                    if (hVarL != null) {
                        numValueOf = Integer.valueOf(hVarL.c());
                    } else {
                        numValueOf = null;
                    }
                }
                hVarL2 = kVarE.l("total");
                if (hVarL2 == null) {
                    hVarL2 = kVarE.l("totalCount");
                }
                if (hVarL2 == null) {
                    numValueOf2 = null;
                } else {
                    if (hVarL2 instanceof j) {
                        hVarL2 = null;
                    }
                    if (hVarL2 != null) {
                        numValueOf2 = Integer.valueOf(hVarL2.c());
                    } else {
                        numValueOf2 = null;
                    }
                }
                zB = numValueOf != null ? false : false;
            }
        }
        com.google.gson.h hVarL4 = kVarE.l("currentPage");
        if (hVarL4 == null && (hVarL4 = kVarE.l("current_page")) == null) {
            hVarL4 = kVarE.l("page");
        }
        if (hVarL4 != null) {
            com.google.gson.h hVar2 = hVarL4 instanceof j ? null : hVarL4;
            if (hVar2 != null) {
                i = hVar2.c();
            }
        }
        Integer numValueOf3 = Integer.valueOf(i);
        if (zB) {
            i++;
        }
        return new HiAnimeResponse<>(new HiAnimeCategoryData(arrayList, numValueOf3, Integer.valueOf(i), Boolean.valueOf(zB)));
    }

    public static /* synthetic */ HiAnimeResponse searchAnime$default(AnikotoScraper anikotoScraper, String str, int i, String str2, String str3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        if ((i2 & 8) != 0) {
            str3 = null;
        }
        return anikotoScraper.searchAnime(str, i, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y watchClient_delegate$lambda$0(AnikotoScraper anikotoScraper) {
        x xVarA = anikotoScraper.client.a();
        xVarA.a(90L);
        xVarA.c(90L);
        TimeUnit.SECONDS.getClass();
        xVarA.A = okhttp3.internal.g.b("timeout", 90L);
        return new y(xVarA);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0019. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final HiAnimeResponse<HiAnimeCategoryData> getAnimeByCategory(String str, int i) {
        String str2;
        u uVar = u.e;
        str.getClass();
        try {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            switch (lowerCase.hashCode()) {
                case -895216422:
                    if (!lowerCase.equals("new-release")) {
                        str2 = "latest-updated";
                    } else {
                        str2 = "latest-added";
                    }
                    break;
                case -320414065:
                    if (!lowerCase.equals("most-popular")) {
                        str2 = "latest-updated";
                    } else {
                        str2 = "most-viewed";
                    }
                    break;
                case 937145160:
                    if (!lowerCase.equals("new-on-site")) {
                        str2 = "latest-updated";
                    } else {
                        str2 = "latest-added";
                    }
                    break;
                case 1394955557:
                    if (!lowerCase.equals("trending")) {
                        str2 = "latest-updated";
                    } else {
                        str2 = "most-viewed";
                    }
                    break;
                default:
                    str2 = "latest-updated";
                    break;
            }
            String strFetch = fetch("https://anikoto.ddns.me/api/filter?page=" + i + "&sort=" + str2);
            if (strFetch == null) {
                return new HiAnimeResponse<>(new HiAnimeCategoryData(uVar, Integer.valueOf(i), 1, Boolean.FALSE));
            }
            Envelope envelope = (Envelope) this.gson.d(Envelope.class, strFetch);
            return !l.a(envelope.getOk(), Boolean.TRUE) ? new HiAnimeResponse<>(new HiAnimeCategoryData(uVar, Integer.valueOf(i), 1, Boolean.FALSE)) : parseFilterResponse(envelope.getData(), i);
        } catch (Exception e) {
            o oVar = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.a(TAG, "getAnimeByCategory: " + e.getMessage());
            return new HiAnimeResponse<>(new HiAnimeCategoryData(uVar, Integer.valueOf(i), 1, Boolean.FALSE));
        }
    }

    public final HiAnimeResponse<HiAnimeCategoryData> getAnimeByGenre(String str, int i, String str2) {
        u uVar = u.e;
        str.getClass();
        try {
            String strFetch = fetch(buildFilterUrl(str, i, str2));
            if (strFetch == null) {
                return new HiAnimeResponse<>(new HiAnimeCategoryData(uVar, Integer.valueOf(i), 1, Boolean.FALSE));
            }
            Envelope envelope = (Envelope) this.gson.d(Envelope.class, strFetch);
            return !l.a(envelope.getOk(), Boolean.TRUE) ? new HiAnimeResponse<>(new HiAnimeCategoryData(uVar, Integer.valueOf(i), 1, Boolean.FALSE)) : parseFilterResponse(envelope.getData(), i);
        } catch (Exception e) {
            o oVar = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.a(TAG, "getAnimeByGenre: " + e.getMessage());
            return new HiAnimeResponse<>(new HiAnimeCategoryData(uVar, Integer.valueOf(i), 1, Boolean.FALSE));
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x015b A[Catch: Exception -> 0x0022, TryCatch #0 {Exception -> 0x0022, blocks: (B:3:0x000a, B:5:0x001c, B:9:0x0025, B:11:0x003b, B:13:0x0041, B:15:0x0047, B:17:0x0053, B:20:0x005a, B:22:0x0062, B:27:0x006a, B:29:0x0074, B:31:0x007c, B:36:0x0084, B:38:0x008a, B:40:0x0092, B:45:0x009a, B:47:0x00a0, B:49:0x00a8, B:51:0x00ae, B:53:0x00b6, B:55:0x00bc, B:57:0x00c4, B:59:0x00ca, B:61:0x00d2, B:66:0x00da, B:68:0x00e1, B:70:0x00e9, B:75:0x00f1, B:77:0x00f8, B:79:0x0100, B:84:0x0108, B:86:0x010f, B:88:0x0115, B:93:0x011d, B:95:0x0124, B:102:0x012f, B:104:0x014a, B:109:0x0152, B:119:0x0171, B:121:0x0179, B:126:0x0181, B:128:0x0188, B:130:0x0190, B:135:0x0198, B:137:0x019f, B:139:0x01a5, B:144:0x01ad, B:146:0x01b4, B:148:0x01bc, B:153:0x01c4, B:155:0x01cb, B:157:0x01d3, B:162:0x01db, B:164:0x01e2, B:166:0x01ec, B:167:0x01fb, B:169:0x0201, B:171:0x0210, B:173:0x0218, B:175:0x022e, B:177:0x0236, B:178:0x0245, B:180:0x024b, B:183:0x025c, B:113:0x015b, B:115:0x0163, B:117:0x016b, B:185:0x0271), top: B:189:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:127:0x0187  */
    /* JADX WARN: Code duplicated, block: B:136:0x019e  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:154:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:163:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:37:0x0089  */
    /* JADX WARN: Code duplicated, block: B:46:0x009f  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:85:0x010e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0123  */
    public final HiAnimeResponse<HiAnimeDetailData> getAnimeDetail(String str) {
        String strH;
        Integer numValueOf;
        boolean zB;
        boolean zB2;
        String strH2;
        String strH3;
        String strH4;
        String strH5;
        g gVarN;
        String str2;
        com.google.gson.h hVar;
        String strH6;
        String strH7;
        String strH8;
        String strH9;
        String strH10;
        ArrayList arrayList;
        ArrayList arrayList2;
        str.getClass();
        try {
            String strV0 = kotlin.text.k.v0(str, "|");
            String strFetch = fetch("https://anikoto.ddns.me/api/anime/".concat(strV0));
            if (strFetch == null) {
                return new HiAnimeResponse<>(null);
            }
            Envelope envelope = (Envelope) this.gson.d(Envelope.class, strFetch);
            if (!l.a(envelope.getOk(), Boolean.TRUE)) {
                return new HiAnimeResponse<>(null);
            }
            com.google.gson.h data = envelope.getData();
            if (data == null) {
                return new HiAnimeResponse<>(null);
            }
            k kVarE = data.e();
            com.google.gson.h hVarL = kVarE.l("slug");
            if (hVarL == null || (strH = hVarL.h()) == null) {
                strH = strV0;
            }
            com.google.gson.h hVarL2 = kVarE.l("episodeCount");
            if (hVarL2 == null) {
                numValueOf = null;
            } else {
                if (hVarL2 instanceof j) {
                    hVarL2 = null;
                }
                if (hVarL2 != null) {
                    numValueOf = Integer.valueOf(hVarL2.c());
                } else {
                    numValueOf = null;
                }
            }
            com.google.gson.h hVarL3 = kVarE.l("hasSub");
            if (hVarL3 == null) {
                zB = true;
            } else {
                if (hVarL3 instanceof j) {
                    hVarL3 = null;
                }
                if (hVarL3 != null) {
                    zB = hVarL3.b();
                } else {
                    zB = true;
                }
            }
            com.google.gson.h hVarL4 = kVarE.l("hasDub");
            if (hVarL4 == null) {
                zB2 = false;
            } else {
                if (hVarL4 instanceof j) {
                    hVarL4 = null;
                }
                if (hVarL4 != null) {
                    zB2 = hVarL4.b();
                } else {
                    zB2 = false;
                }
            }
            com.google.gson.h hVarL5 = kVarE.l("title");
            String strH11 = hVarL5 != null ? hVarL5.h() : null;
            com.google.gson.h hVarL6 = kVarE.l("image");
            String strH12 = hVarL6 != null ? hVarL6.h() : null;
            com.google.gson.h hVarL7 = kVarE.l("synopsis");
            String strH13 = hVarL7 != null ? hVarL7.h() : null;
            com.google.gson.h hVarL8 = kVarE.l("rating");
            if (hVarL8 == null) {
                strH2 = null;
            } else {
                if (hVarL8 instanceof j) {
                    hVarL8 = null;
                }
                if (hVarL8 != null) {
                    strH2 = hVarL8.h();
                } else {
                    strH2 = null;
                }
            }
            com.google.gson.h hVarL9 = kVarE.l("quality");
            if (hVarL9 == null) {
                strH3 = null;
            } else {
                if (hVarL9 instanceof j) {
                    hVarL9 = null;
                }
                if (hVarL9 != null) {
                    strH3 = hVarL9.h();
                } else {
                    strH3 = null;
                }
            }
            com.google.gson.h hVarL10 = kVarE.l("type");
            if (hVarL10 == null) {
                strH4 = null;
            } else {
                if (hVarL10 instanceof j) {
                    hVarL10 = null;
                }
                if (hVarL10 != null) {
                    strH4 = hVarL10.h();
                } else {
                    strH4 = null;
                }
            }
            com.google.gson.h hVarL11 = kVarE.l("duration");
            if (hVarL11 == null) {
                strH5 = null;
            } else {
                if (hVarL11 instanceof j) {
                    hVarL11 = null;
                }
                if (hVarL11 != null) {
                    strH5 = hVarL11.h();
                } else {
                    strH5 = null;
                }
            }
            Integer num = zB ? numValueOf : null;
            if (!zB2) {
                numValueOf = null;
            }
            HiAnimeInfo hiAnimeInfo = new HiAnimeInfo(strH, strH11, strH12, strH13, new HiAnimeStats(strH2, strH3, strH4, strH5, new HiAnimeEpCount(num, numValueOf)));
            com.google.gson.h hVarL12 = kVarE.l("titleJp");
            if (hVarL12 == null) {
                gVarN = kVarE.n("alternativeTitles");
                if (gVarN != null || (hVar = (com.google.gson.h) kotlin.collections.o.L(gVarN)) == null) {
                    str2 = null;
                } else {
                    String strH14 = hVar.h();
                    str2 = strH14;
                }
            } else {
                if (hVarL12 instanceof j) {
                    hVarL12 = null;
                }
                if (hVarL12 == null || (strH14 = hVarL12.h()) == null) {
                    gVarN = kVarE.n("alternativeTitles");
                    if (gVarN != null) {
                    }
                    str2 = null;
                } else {
                    str2 = strH14;
                }
            }
            com.google.gson.h hVarL13 = kVarE.l("aired");
            if (hVarL13 == null) {
                strH6 = null;
            } else {
                if (hVarL13 instanceof j) {
                    hVarL13 = null;
                }
                if (hVarL13 != null) {
                    strH6 = hVarL13.h();
                } else {
                    strH6 = null;
                }
            }
            com.google.gson.h hVarL14 = kVarE.l("premiered");
            if (hVarL14 == null) {
                strH7 = null;
            } else {
                if (hVarL14 instanceof j) {
                    hVarL14 = null;
                }
                if (hVarL14 != null) {
                    strH7 = hVarL14.h();
                } else {
                    strH7 = null;
                }
            }
            com.google.gson.h hVarL15 = kVarE.l("duration");
            if (hVarL15 == null) {
                strH8 = null;
            } else {
                if (hVarL15 instanceof j) {
                    hVarL15 = null;
                }
                if (hVarL15 != null) {
                    strH8 = hVarL15.h();
                } else {
                    strH8 = null;
                }
            }
            com.google.gson.h hVarL16 = kVarE.l("status");
            if (hVarL16 == null) {
                strH9 = null;
            } else {
                if (hVarL16 instanceof j) {
                    hVarL16 = null;
                }
                if (hVarL16 != null) {
                    strH9 = hVarL16.h();
                } else {
                    strH9 = null;
                }
            }
            com.google.gson.h hVarL17 = kVarE.l("malScore");
            if (hVarL17 == null) {
                strH10 = null;
            } else {
                if (hVarL17 instanceof j) {
                    hVarL17 = null;
                }
                if (hVarL17 != null) {
                    strH10 = hVarL17.h();
                } else {
                    strH10 = null;
                }
            }
            g gVarN2 = kVarE.n("genres");
            if (gVarN2 != null) {
                arrayList = new ArrayList(p.y(gVarN2, 10));
                Iterator it = gVarN2.e.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.google.gson.h) it.next()).h());
                }
            } else {
                arrayList = null;
            }
            g gVarN3 = kVarE.n("studios");
            String strR = gVarN3 != null ? kotlin.collections.o.R(gVarN3, ", ", null, null, new z(5), 30) : null;
            g gVarN4 = kVarE.n("producers");
            if (gVarN4 != null) {
                ArrayList arrayList3 = new ArrayList(p.y(gVarN4, 10));
                Iterator it2 = gVarN4.e.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((com.google.gson.h) it2.next()).h());
                }
                arrayList2 = arrayList3;
            } else {
                arrayList2 = null;
            }
            return new HiAnimeResponse<>(new HiAnimeDetailData(new HiAnimeAnimeData(hiAnimeInfo, new HiAnimeMoreInfo(str2, strH6, strH7, strH8, strH9, strH10, arrayList, strR, arrayList2))));
        } catch (Exception e) {
            o oVar = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.a(TAG, "getAnimeDetail: " + e.getMessage());
            return new HiAnimeResponse<>(null);
        }
    }

    public final HiAnimeResponse<HiAnimeServersData> getAnimeEpisodeServers(String str) {
        String strH;
        str.getClass();
        try {
            kotlin.k episodeId = parseEpisodeId(str);
            String str2 = (String) episodeId.e;
            String str3 = (String) episodeId.y;
            k kVarFetchWatch = fetchWatch(str2, str3);
            if (kVarFetchWatch == null) {
                return new HiAnimeResponse<>(new HiAnimeServersData(str, null, null, null));
            }
            g gVarN = kVarFetchWatch.n("servers");
            if (gVarN == null) {
                return new HiAnimeResponse<>(new HiAnimeServersData(str, null, null, null));
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = gVarN.e.iterator();
            int i = 0;
            int i2 = 0;
            while (it.hasNext()) {
                k kVarE = ((com.google.gson.h) it.next()).e();
                com.google.gson.h hVarL = kVarE.l("name");
                if (hVarL != null && (strH = hVarL.h()) != null) {
                    com.google.gson.h hVarL2 = kVarE.l("type");
                    String strH2 = hVarL2 != null ? hVarL2.h() : null;
                    if (l.a(strH2, "sub")) {
                        arrayList.add(new HiAnimeServer(Integer.valueOf(i), strH));
                        i++;
                    } else if (l.a(strH2, "dub")) {
                        arrayList2.add(new HiAnimeServer(Integer.valueOf(i2), strH));
                        i2++;
                    }
                }
            }
            Integer numQ = r.Q(str3);
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            return new HiAnimeResponse<>(new HiAnimeServersData(str, numQ, arrayList, arrayList2));
        } catch (Exception e) {
            o oVar = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.a(TAG, "getAnimeEpisodeServers: " + e.getMessage());
            return new HiAnimeResponse<>(new HiAnimeServersData(str, null, null, null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:125:0x017e A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x000a, B:5:0x001c, B:9:0x002a, B:11:0x0032, B:13:0x003d, B:14:0x0043, B:17:0x004b, B:19:0x005e, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:27:0x0076, B:31:0x007e, B:34:0x0086, B:110:0x015f, B:112:0x0165, B:117:0x016d, B:119:0x0173, B:141:0x01a7, B:143:0x01af, B:148:0x01b7, B:150:0x01bd, B:155:0x01c7, B:157:0x01d2, B:159:0x01da, B:160:0x01e5, B:162:0x01eb, B:164:0x01fd, B:169:0x0205, B:171:0x020b, B:192:0x0236, B:194:0x023e, B:199:0x0246, B:201:0x024c, B:203:0x0254, B:208:0x025c, B:211:0x0264, B:213:0x026c, B:218:0x0274, B:220:0x027e, B:222:0x0285, B:177:0x0216, B:179:0x021c, B:184:0x0224, B:186:0x022a, B:224:0x028b, B:125:0x017e, B:127:0x0184, B:132:0x018c, B:134:0x0192, B:139:0x019c, B:35:0x008c, B:36:0x0090, B:38:0x0097, B:40:0x00a8, B:45:0x00b0, B:47:0x00b6, B:61:0x00d9, B:63:0x00df, B:65:0x00e5, B:69:0x00ed, B:71:0x00f1, B:74:0x00f9, B:75:0x00fd, B:77:0x0103, B:79:0x0114, B:84:0x011c, B:86:0x0122, B:102:0x0147, B:104:0x014b, B:107:0x0153, B:89:0x012a, B:91:0x0130, B:96:0x0138, B:98:0x013e, B:50:0x00be, B:52:0x00c4, B:57:0x00cc, B:59:0x00d2), top: B:228:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:127:0x0184 A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x000a, B:5:0x001c, B:9:0x002a, B:11:0x0032, B:13:0x003d, B:14:0x0043, B:17:0x004b, B:19:0x005e, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:27:0x0076, B:31:0x007e, B:34:0x0086, B:110:0x015f, B:112:0x0165, B:117:0x016d, B:119:0x0173, B:141:0x01a7, B:143:0x01af, B:148:0x01b7, B:150:0x01bd, B:155:0x01c7, B:157:0x01d2, B:159:0x01da, B:160:0x01e5, B:162:0x01eb, B:164:0x01fd, B:169:0x0205, B:171:0x020b, B:192:0x0236, B:194:0x023e, B:199:0x0246, B:201:0x024c, B:203:0x0254, B:208:0x025c, B:211:0x0264, B:213:0x026c, B:218:0x0274, B:220:0x027e, B:222:0x0285, B:177:0x0216, B:179:0x021c, B:184:0x0224, B:186:0x022a, B:224:0x028b, B:125:0x017e, B:127:0x0184, B:132:0x018c, B:134:0x0192, B:139:0x019c, B:35:0x008c, B:36:0x0090, B:38:0x0097, B:40:0x00a8, B:45:0x00b0, B:47:0x00b6, B:61:0x00d9, B:63:0x00df, B:65:0x00e5, B:69:0x00ed, B:71:0x00f1, B:74:0x00f9, B:75:0x00fd, B:77:0x0103, B:79:0x0114, B:84:0x011c, B:86:0x0122, B:102:0x0147, B:104:0x014b, B:107:0x0153, B:89:0x012a, B:91:0x0130, B:96:0x0138, B:98:0x013e, B:50:0x00be, B:52:0x00c4, B:57:0x00cc, B:59:0x00d2), top: B:228:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:129:0x0188  */
    /* JADX WARN: Code duplicated, block: B:130:0x0189  */
    /* JADX WARN: Code duplicated, block: B:132:0x018c A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x000a, B:5:0x001c, B:9:0x002a, B:11:0x0032, B:13:0x003d, B:14:0x0043, B:17:0x004b, B:19:0x005e, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:27:0x0076, B:31:0x007e, B:34:0x0086, B:110:0x015f, B:112:0x0165, B:117:0x016d, B:119:0x0173, B:141:0x01a7, B:143:0x01af, B:148:0x01b7, B:150:0x01bd, B:155:0x01c7, B:157:0x01d2, B:159:0x01da, B:160:0x01e5, B:162:0x01eb, B:164:0x01fd, B:169:0x0205, B:171:0x020b, B:192:0x0236, B:194:0x023e, B:199:0x0246, B:201:0x024c, B:203:0x0254, B:208:0x025c, B:211:0x0264, B:213:0x026c, B:218:0x0274, B:220:0x027e, B:222:0x0285, B:177:0x0216, B:179:0x021c, B:184:0x0224, B:186:0x022a, B:224:0x028b, B:125:0x017e, B:127:0x0184, B:132:0x018c, B:134:0x0192, B:139:0x019c, B:35:0x008c, B:36:0x0090, B:38:0x0097, B:40:0x00a8, B:45:0x00b0, B:47:0x00b6, B:61:0x00d9, B:63:0x00df, B:65:0x00e5, B:69:0x00ed, B:71:0x00f1, B:74:0x00f9, B:75:0x00fd, B:77:0x0103, B:79:0x0114, B:84:0x011c, B:86:0x0122, B:102:0x0147, B:104:0x014b, B:107:0x0153, B:89:0x012a, B:91:0x0130, B:96:0x0138, B:98:0x013e, B:50:0x00be, B:52:0x00c4, B:57:0x00cc, B:59:0x00d2), top: B:228:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:137:0x0199  */
    /* JADX WARN: Code duplicated, block: B:139:0x019c A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x000a, B:5:0x001c, B:9:0x002a, B:11:0x0032, B:13:0x003d, B:14:0x0043, B:17:0x004b, B:19:0x005e, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:27:0x0076, B:31:0x007e, B:34:0x0086, B:110:0x015f, B:112:0x0165, B:117:0x016d, B:119:0x0173, B:141:0x01a7, B:143:0x01af, B:148:0x01b7, B:150:0x01bd, B:155:0x01c7, B:157:0x01d2, B:159:0x01da, B:160:0x01e5, B:162:0x01eb, B:164:0x01fd, B:169:0x0205, B:171:0x020b, B:192:0x0236, B:194:0x023e, B:199:0x0246, B:201:0x024c, B:203:0x0254, B:208:0x025c, B:211:0x0264, B:213:0x026c, B:218:0x0274, B:220:0x027e, B:222:0x0285, B:177:0x0216, B:179:0x021c, B:184:0x0224, B:186:0x022a, B:224:0x028b, B:125:0x017e, B:127:0x0184, B:132:0x018c, B:134:0x0192, B:139:0x019c, B:35:0x008c, B:36:0x0090, B:38:0x0097, B:40:0x00a8, B:45:0x00b0, B:47:0x00b6, B:61:0x00d9, B:63:0x00df, B:65:0x00e5, B:69:0x00ed, B:71:0x00f1, B:74:0x00f9, B:75:0x00fd, B:77:0x0103, B:79:0x0114, B:84:0x011c, B:86:0x0122, B:102:0x0147, B:104:0x014b, B:107:0x0153, B:89:0x012a, B:91:0x0130, B:96:0x0138, B:98:0x013e, B:50:0x00be, B:52:0x00c4, B:57:0x00cc, B:59:0x00d2), top: B:228:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:153:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:177:0x0216 A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x000a, B:5:0x001c, B:9:0x002a, B:11:0x0032, B:13:0x003d, B:14:0x0043, B:17:0x004b, B:19:0x005e, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:27:0x0076, B:31:0x007e, B:34:0x0086, B:110:0x015f, B:112:0x0165, B:117:0x016d, B:119:0x0173, B:141:0x01a7, B:143:0x01af, B:148:0x01b7, B:150:0x01bd, B:155:0x01c7, B:157:0x01d2, B:159:0x01da, B:160:0x01e5, B:162:0x01eb, B:164:0x01fd, B:169:0x0205, B:171:0x020b, B:192:0x0236, B:194:0x023e, B:199:0x0246, B:201:0x024c, B:203:0x0254, B:208:0x025c, B:211:0x0264, B:213:0x026c, B:218:0x0274, B:220:0x027e, B:222:0x0285, B:177:0x0216, B:179:0x021c, B:184:0x0224, B:186:0x022a, B:224:0x028b, B:125:0x017e, B:127:0x0184, B:132:0x018c, B:134:0x0192, B:139:0x019c, B:35:0x008c, B:36:0x0090, B:38:0x0097, B:40:0x00a8, B:45:0x00b0, B:47:0x00b6, B:61:0x00d9, B:63:0x00df, B:65:0x00e5, B:69:0x00ed, B:71:0x00f1, B:74:0x00f9, B:75:0x00fd, B:77:0x0103, B:79:0x0114, B:84:0x011c, B:86:0x0122, B:102:0x0147, B:104:0x014b, B:107:0x0153, B:89:0x012a, B:91:0x0130, B:96:0x0138, B:98:0x013e, B:50:0x00be, B:52:0x00c4, B:57:0x00cc, B:59:0x00d2), top: B:228:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:179:0x021c A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x000a, B:5:0x001c, B:9:0x002a, B:11:0x0032, B:13:0x003d, B:14:0x0043, B:17:0x004b, B:19:0x005e, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:27:0x0076, B:31:0x007e, B:34:0x0086, B:110:0x015f, B:112:0x0165, B:117:0x016d, B:119:0x0173, B:141:0x01a7, B:143:0x01af, B:148:0x01b7, B:150:0x01bd, B:155:0x01c7, B:157:0x01d2, B:159:0x01da, B:160:0x01e5, B:162:0x01eb, B:164:0x01fd, B:169:0x0205, B:171:0x020b, B:192:0x0236, B:194:0x023e, B:199:0x0246, B:201:0x024c, B:203:0x0254, B:208:0x025c, B:211:0x0264, B:213:0x026c, B:218:0x0274, B:220:0x027e, B:222:0x0285, B:177:0x0216, B:179:0x021c, B:184:0x0224, B:186:0x022a, B:224:0x028b, B:125:0x017e, B:127:0x0184, B:132:0x018c, B:134:0x0192, B:139:0x019c, B:35:0x008c, B:36:0x0090, B:38:0x0097, B:40:0x00a8, B:45:0x00b0, B:47:0x00b6, B:61:0x00d9, B:63:0x00df, B:65:0x00e5, B:69:0x00ed, B:71:0x00f1, B:74:0x00f9, B:75:0x00fd, B:77:0x0103, B:79:0x0114, B:84:0x011c, B:86:0x0122, B:102:0x0147, B:104:0x014b, B:107:0x0153, B:89:0x012a, B:91:0x0130, B:96:0x0138, B:98:0x013e, B:50:0x00be, B:52:0x00c4, B:57:0x00cc, B:59:0x00d2), top: B:228:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:181:0x0220  */
    /* JADX WARN: Code duplicated, block: B:182:0x0221  */
    /* JADX WARN: Code duplicated, block: B:184:0x0224 A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x000a, B:5:0x001c, B:9:0x002a, B:11:0x0032, B:13:0x003d, B:14:0x0043, B:17:0x004b, B:19:0x005e, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:27:0x0076, B:31:0x007e, B:34:0x0086, B:110:0x015f, B:112:0x0165, B:117:0x016d, B:119:0x0173, B:141:0x01a7, B:143:0x01af, B:148:0x01b7, B:150:0x01bd, B:155:0x01c7, B:157:0x01d2, B:159:0x01da, B:160:0x01e5, B:162:0x01eb, B:164:0x01fd, B:169:0x0205, B:171:0x020b, B:192:0x0236, B:194:0x023e, B:199:0x0246, B:201:0x024c, B:203:0x0254, B:208:0x025c, B:211:0x0264, B:213:0x026c, B:218:0x0274, B:220:0x027e, B:222:0x0285, B:177:0x0216, B:179:0x021c, B:184:0x0224, B:186:0x022a, B:224:0x028b, B:125:0x017e, B:127:0x0184, B:132:0x018c, B:134:0x0192, B:139:0x019c, B:35:0x008c, B:36:0x0090, B:38:0x0097, B:40:0x00a8, B:45:0x00b0, B:47:0x00b6, B:61:0x00d9, B:63:0x00df, B:65:0x00e5, B:69:0x00ed, B:71:0x00f1, B:74:0x00f9, B:75:0x00fd, B:77:0x0103, B:79:0x0114, B:84:0x011c, B:86:0x0122, B:102:0x0147, B:104:0x014b, B:107:0x0153, B:89:0x012a, B:91:0x0130, B:96:0x0138, B:98:0x013e, B:50:0x00be, B:52:0x00c4, B:57:0x00cc, B:59:0x00d2), top: B:228:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:189:0x0231  */
    /* JADX WARN: Code duplicated, block: B:191:0x0234  */
    /* JADX WARN: Code duplicated, block: B:192:0x0236 A[Catch: Exception -> 0x0027, PHI: r4
  0x0236: PHI (r4v14 java.lang.String) = (r4v10 java.lang.String), (r4v19 java.lang.String) binds: [B:190:0x0232, B:176:0x0215] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x000a, B:5:0x001c, B:9:0x002a, B:11:0x0032, B:13:0x003d, B:14:0x0043, B:17:0x004b, B:19:0x005e, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:27:0x0076, B:31:0x007e, B:34:0x0086, B:110:0x015f, B:112:0x0165, B:117:0x016d, B:119:0x0173, B:141:0x01a7, B:143:0x01af, B:148:0x01b7, B:150:0x01bd, B:155:0x01c7, B:157:0x01d2, B:159:0x01da, B:160:0x01e5, B:162:0x01eb, B:164:0x01fd, B:169:0x0205, B:171:0x020b, B:192:0x0236, B:194:0x023e, B:199:0x0246, B:201:0x024c, B:203:0x0254, B:208:0x025c, B:211:0x0264, B:213:0x026c, B:218:0x0274, B:220:0x027e, B:222:0x0285, B:177:0x0216, B:179:0x021c, B:184:0x0224, B:186:0x022a, B:224:0x028b, B:125:0x017e, B:127:0x0184, B:132:0x018c, B:134:0x0192, B:139:0x019c, B:35:0x008c, B:36:0x0090, B:38:0x0097, B:40:0x00a8, B:45:0x00b0, B:47:0x00b6, B:61:0x00d9, B:63:0x00df, B:65:0x00e5, B:69:0x00ed, B:71:0x00f1, B:74:0x00f9, B:75:0x00fd, B:77:0x0103, B:79:0x0114, B:84:0x011c, B:86:0x0122, B:102:0x0147, B:104:0x014b, B:107:0x0153, B:89:0x012a, B:91:0x0130, B:96:0x0138, B:98:0x013e, B:50:0x00be, B:52:0x00c4, B:57:0x00cc, B:59:0x00d2), top: B:228:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:194:0x023e A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x000a, B:5:0x001c, B:9:0x002a, B:11:0x0032, B:13:0x003d, B:14:0x0043, B:17:0x004b, B:19:0x005e, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:27:0x0076, B:31:0x007e, B:34:0x0086, B:110:0x015f, B:112:0x0165, B:117:0x016d, B:119:0x0173, B:141:0x01a7, B:143:0x01af, B:148:0x01b7, B:150:0x01bd, B:155:0x01c7, B:157:0x01d2, B:159:0x01da, B:160:0x01e5, B:162:0x01eb, B:164:0x01fd, B:169:0x0205, B:171:0x020b, B:192:0x0236, B:194:0x023e, B:199:0x0246, B:201:0x024c, B:203:0x0254, B:208:0x025c, B:211:0x0264, B:213:0x026c, B:218:0x0274, B:220:0x027e, B:222:0x0285, B:177:0x0216, B:179:0x021c, B:184:0x0224, B:186:0x022a, B:224:0x028b, B:125:0x017e, B:127:0x0184, B:132:0x018c, B:134:0x0192, B:139:0x019c, B:35:0x008c, B:36:0x0090, B:38:0x0097, B:40:0x00a8, B:45:0x00b0, B:47:0x00b6, B:61:0x00d9, B:63:0x00df, B:65:0x00e5, B:69:0x00ed, B:71:0x00f1, B:74:0x00f9, B:75:0x00fd, B:77:0x0103, B:79:0x0114, B:84:0x011c, B:86:0x0122, B:102:0x0147, B:104:0x014b, B:107:0x0153, B:89:0x012a, B:91:0x0130, B:96:0x0138, B:98:0x013e, B:50:0x00be, B:52:0x00c4, B:57:0x00cc, B:59:0x00d2), top: B:228:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:196:0x0242  */
    /* JADX WARN: Code duplicated, block: B:197:0x0243  */
    /* JADX WARN: Code duplicated, block: B:199:0x0246 A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x000a, B:5:0x001c, B:9:0x002a, B:11:0x0032, B:13:0x003d, B:14:0x0043, B:17:0x004b, B:19:0x005e, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:27:0x0076, B:31:0x007e, B:34:0x0086, B:110:0x015f, B:112:0x0165, B:117:0x016d, B:119:0x0173, B:141:0x01a7, B:143:0x01af, B:148:0x01b7, B:150:0x01bd, B:155:0x01c7, B:157:0x01d2, B:159:0x01da, B:160:0x01e5, B:162:0x01eb, B:164:0x01fd, B:169:0x0205, B:171:0x020b, B:192:0x0236, B:194:0x023e, B:199:0x0246, B:201:0x024c, B:203:0x0254, B:208:0x025c, B:211:0x0264, B:213:0x026c, B:218:0x0274, B:220:0x027e, B:222:0x0285, B:177:0x0216, B:179:0x021c, B:184:0x0224, B:186:0x022a, B:224:0x028b, B:125:0x017e, B:127:0x0184, B:132:0x018c, B:134:0x0192, B:139:0x019c, B:35:0x008c, B:36:0x0090, B:38:0x0097, B:40:0x00a8, B:45:0x00b0, B:47:0x00b6, B:61:0x00d9, B:63:0x00df, B:65:0x00e5, B:69:0x00ed, B:71:0x00f1, B:74:0x00f9, B:75:0x00fd, B:77:0x0103, B:79:0x0114, B:84:0x011c, B:86:0x0122, B:102:0x0147, B:104:0x014b, B:107:0x0153, B:89:0x012a, B:91:0x0130, B:96:0x0138, B:98:0x013e, B:50:0x00be, B:52:0x00c4, B:57:0x00cc, B:59:0x00d2), top: B:228:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:200:0x024b  */
    /* JADX WARN: Code duplicated, block: B:203:0x0254 A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x000a, B:5:0x001c, B:9:0x002a, B:11:0x0032, B:13:0x003d, B:14:0x0043, B:17:0x004b, B:19:0x005e, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:27:0x0076, B:31:0x007e, B:34:0x0086, B:110:0x015f, B:112:0x0165, B:117:0x016d, B:119:0x0173, B:141:0x01a7, B:143:0x01af, B:148:0x01b7, B:150:0x01bd, B:155:0x01c7, B:157:0x01d2, B:159:0x01da, B:160:0x01e5, B:162:0x01eb, B:164:0x01fd, B:169:0x0205, B:171:0x020b, B:192:0x0236, B:194:0x023e, B:199:0x0246, B:201:0x024c, B:203:0x0254, B:208:0x025c, B:211:0x0264, B:213:0x026c, B:218:0x0274, B:220:0x027e, B:222:0x0285, B:177:0x0216, B:179:0x021c, B:184:0x0224, B:186:0x022a, B:224:0x028b, B:125:0x017e, B:127:0x0184, B:132:0x018c, B:134:0x0192, B:139:0x019c, B:35:0x008c, B:36:0x0090, B:38:0x0097, B:40:0x00a8, B:45:0x00b0, B:47:0x00b6, B:61:0x00d9, B:63:0x00df, B:65:0x00e5, B:69:0x00ed, B:71:0x00f1, B:74:0x00f9, B:75:0x00fd, B:77:0x0103, B:79:0x0114, B:84:0x011c, B:86:0x0122, B:102:0x0147, B:104:0x014b, B:107:0x0153, B:89:0x012a, B:91:0x0130, B:96:0x0138, B:98:0x013e, B:50:0x00be, B:52:0x00c4, B:57:0x00cc, B:59:0x00d2), top: B:228:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:205:0x0258  */
    /* JADX WARN: Code duplicated, block: B:206:0x0259  */
    /* JADX WARN: Code duplicated, block: B:208:0x025c A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x000a, B:5:0x001c, B:9:0x002a, B:11:0x0032, B:13:0x003d, B:14:0x0043, B:17:0x004b, B:19:0x005e, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:27:0x0076, B:31:0x007e, B:34:0x0086, B:110:0x015f, B:112:0x0165, B:117:0x016d, B:119:0x0173, B:141:0x01a7, B:143:0x01af, B:148:0x01b7, B:150:0x01bd, B:155:0x01c7, B:157:0x01d2, B:159:0x01da, B:160:0x01e5, B:162:0x01eb, B:164:0x01fd, B:169:0x0205, B:171:0x020b, B:192:0x0236, B:194:0x023e, B:199:0x0246, B:201:0x024c, B:203:0x0254, B:208:0x025c, B:211:0x0264, B:213:0x026c, B:218:0x0274, B:220:0x027e, B:222:0x0285, B:177:0x0216, B:179:0x021c, B:184:0x0224, B:186:0x022a, B:224:0x028b, B:125:0x017e, B:127:0x0184, B:132:0x018c, B:134:0x0192, B:139:0x019c, B:35:0x008c, B:36:0x0090, B:38:0x0097, B:40:0x00a8, B:45:0x00b0, B:47:0x00b6, B:61:0x00d9, B:63:0x00df, B:65:0x00e5, B:69:0x00ed, B:71:0x00f1, B:74:0x00f9, B:75:0x00fd, B:77:0x0103, B:79:0x0114, B:84:0x011c, B:86:0x0122, B:102:0x0147, B:104:0x014b, B:107:0x0153, B:89:0x012a, B:91:0x0130, B:96:0x0138, B:98:0x013e, B:50:0x00be, B:52:0x00c4, B:57:0x00cc, B:59:0x00d2), top: B:228:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:210:0x0262  */
    /* JADX WARN: Code duplicated, block: B:213:0x026c A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x000a, B:5:0x001c, B:9:0x002a, B:11:0x0032, B:13:0x003d, B:14:0x0043, B:17:0x004b, B:19:0x005e, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:27:0x0076, B:31:0x007e, B:34:0x0086, B:110:0x015f, B:112:0x0165, B:117:0x016d, B:119:0x0173, B:141:0x01a7, B:143:0x01af, B:148:0x01b7, B:150:0x01bd, B:155:0x01c7, B:157:0x01d2, B:159:0x01da, B:160:0x01e5, B:162:0x01eb, B:164:0x01fd, B:169:0x0205, B:171:0x020b, B:192:0x0236, B:194:0x023e, B:199:0x0246, B:201:0x024c, B:203:0x0254, B:208:0x025c, B:211:0x0264, B:213:0x026c, B:218:0x0274, B:220:0x027e, B:222:0x0285, B:177:0x0216, B:179:0x021c, B:184:0x0224, B:186:0x022a, B:224:0x028b, B:125:0x017e, B:127:0x0184, B:132:0x018c, B:134:0x0192, B:139:0x019c, B:35:0x008c, B:36:0x0090, B:38:0x0097, B:40:0x00a8, B:45:0x00b0, B:47:0x00b6, B:61:0x00d9, B:63:0x00df, B:65:0x00e5, B:69:0x00ed, B:71:0x00f1, B:74:0x00f9, B:75:0x00fd, B:77:0x0103, B:79:0x0114, B:84:0x011c, B:86:0x0122, B:102:0x0147, B:104:0x014b, B:107:0x0153, B:89:0x012a, B:91:0x0130, B:96:0x0138, B:98:0x013e, B:50:0x00be, B:52:0x00c4, B:57:0x00cc, B:59:0x00d2), top: B:228:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:215:0x0270  */
    /* JADX WARN: Code duplicated, block: B:216:0x0271  */
    /* JADX WARN: Code duplicated, block: B:218:0x0274 A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x000a, B:5:0x001c, B:9:0x002a, B:11:0x0032, B:13:0x003d, B:14:0x0043, B:17:0x004b, B:19:0x005e, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:27:0x0076, B:31:0x007e, B:34:0x0086, B:110:0x015f, B:112:0x0165, B:117:0x016d, B:119:0x0173, B:141:0x01a7, B:143:0x01af, B:148:0x01b7, B:150:0x01bd, B:155:0x01c7, B:157:0x01d2, B:159:0x01da, B:160:0x01e5, B:162:0x01eb, B:164:0x01fd, B:169:0x0205, B:171:0x020b, B:192:0x0236, B:194:0x023e, B:199:0x0246, B:201:0x024c, B:203:0x0254, B:208:0x025c, B:211:0x0264, B:213:0x026c, B:218:0x0274, B:220:0x027e, B:222:0x0285, B:177:0x0216, B:179:0x021c, B:184:0x0224, B:186:0x022a, B:224:0x028b, B:125:0x017e, B:127:0x0184, B:132:0x018c, B:134:0x0192, B:139:0x019c, B:35:0x008c, B:36:0x0090, B:38:0x0097, B:40:0x00a8, B:45:0x00b0, B:47:0x00b6, B:61:0x00d9, B:63:0x00df, B:65:0x00e5, B:69:0x00ed, B:71:0x00f1, B:74:0x00f9, B:75:0x00fd, B:77:0x0103, B:79:0x0114, B:84:0x011c, B:86:0x0122, B:102:0x0147, B:104:0x014b, B:107:0x0153, B:89:0x012a, B:91:0x0130, B:96:0x0138, B:98:0x013e, B:50:0x00be, B:52:0x00c4, B:57:0x00cc, B:59:0x00d2), top: B:228:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:219:0x027d  */
    /* JADX WARN: Code duplicated, block: B:240:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00be A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x000a, B:5:0x001c, B:9:0x002a, B:11:0x0032, B:13:0x003d, B:14:0x0043, B:17:0x004b, B:19:0x005e, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:27:0x0076, B:31:0x007e, B:34:0x0086, B:110:0x015f, B:112:0x0165, B:117:0x016d, B:119:0x0173, B:141:0x01a7, B:143:0x01af, B:148:0x01b7, B:150:0x01bd, B:155:0x01c7, B:157:0x01d2, B:159:0x01da, B:160:0x01e5, B:162:0x01eb, B:164:0x01fd, B:169:0x0205, B:171:0x020b, B:192:0x0236, B:194:0x023e, B:199:0x0246, B:201:0x024c, B:203:0x0254, B:208:0x025c, B:211:0x0264, B:213:0x026c, B:218:0x0274, B:220:0x027e, B:222:0x0285, B:177:0x0216, B:179:0x021c, B:184:0x0224, B:186:0x022a, B:224:0x028b, B:125:0x017e, B:127:0x0184, B:132:0x018c, B:134:0x0192, B:139:0x019c, B:35:0x008c, B:36:0x0090, B:38:0x0097, B:40:0x00a8, B:45:0x00b0, B:47:0x00b6, B:61:0x00d9, B:63:0x00df, B:65:0x00e5, B:69:0x00ed, B:71:0x00f1, B:74:0x00f9, B:75:0x00fd, B:77:0x0103, B:79:0x0114, B:84:0x011c, B:86:0x0122, B:102:0x0147, B:104:0x014b, B:107:0x0153, B:89:0x012a, B:91:0x0130, B:96:0x0138, B:98:0x013e, B:50:0x00be, B:52:0x00c4, B:57:0x00cc, B:59:0x00d2), top: B:228:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00df A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x000a, B:5:0x001c, B:9:0x002a, B:11:0x0032, B:13:0x003d, B:14:0x0043, B:17:0x004b, B:19:0x005e, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:27:0x0076, B:31:0x007e, B:34:0x0086, B:110:0x015f, B:112:0x0165, B:117:0x016d, B:119:0x0173, B:141:0x01a7, B:143:0x01af, B:148:0x01b7, B:150:0x01bd, B:155:0x01c7, B:157:0x01d2, B:159:0x01da, B:160:0x01e5, B:162:0x01eb, B:164:0x01fd, B:169:0x0205, B:171:0x020b, B:192:0x0236, B:194:0x023e, B:199:0x0246, B:201:0x024c, B:203:0x0254, B:208:0x025c, B:211:0x0264, B:213:0x026c, B:218:0x0274, B:220:0x027e, B:222:0x0285, B:177:0x0216, B:179:0x021c, B:184:0x0224, B:186:0x022a, B:224:0x028b, B:125:0x017e, B:127:0x0184, B:132:0x018c, B:134:0x0192, B:139:0x019c, B:35:0x008c, B:36:0x0090, B:38:0x0097, B:40:0x00a8, B:45:0x00b0, B:47:0x00b6, B:61:0x00d9, B:63:0x00df, B:65:0x00e5, B:69:0x00ed, B:71:0x00f1, B:74:0x00f9, B:75:0x00fd, B:77:0x0103, B:79:0x0114, B:84:0x011c, B:86:0x0122, B:102:0x0147, B:104:0x014b, B:107:0x0153, B:89:0x012a, B:91:0x0130, B:96:0x0138, B:98:0x013e, B:50:0x00be, B:52:0x00c4, B:57:0x00cc, B:59:0x00d2), top: B:228:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:89:0x012a A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x000a, B:5:0x001c, B:9:0x002a, B:11:0x0032, B:13:0x003d, B:14:0x0043, B:17:0x004b, B:19:0x005e, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:27:0x0076, B:31:0x007e, B:34:0x0086, B:110:0x015f, B:112:0x0165, B:117:0x016d, B:119:0x0173, B:141:0x01a7, B:143:0x01af, B:148:0x01b7, B:150:0x01bd, B:155:0x01c7, B:157:0x01d2, B:159:0x01da, B:160:0x01e5, B:162:0x01eb, B:164:0x01fd, B:169:0x0205, B:171:0x020b, B:192:0x0236, B:194:0x023e, B:199:0x0246, B:201:0x024c, B:203:0x0254, B:208:0x025c, B:211:0x0264, B:213:0x026c, B:218:0x0274, B:220:0x027e, B:222:0x0285, B:177:0x0216, B:179:0x021c, B:184:0x0224, B:186:0x022a, B:224:0x028b, B:125:0x017e, B:127:0x0184, B:132:0x018c, B:134:0x0192, B:139:0x019c, B:35:0x008c, B:36:0x0090, B:38:0x0097, B:40:0x00a8, B:45:0x00b0, B:47:0x00b6, B:61:0x00d9, B:63:0x00df, B:65:0x00e5, B:69:0x00ed, B:71:0x00f1, B:74:0x00f9, B:75:0x00fd, B:77:0x0103, B:79:0x0114, B:84:0x011c, B:86:0x0122, B:102:0x0147, B:104:0x014b, B:107:0x0153, B:89:0x012a, B:91:0x0130, B:96:0x0138, B:98:0x013e, B:50:0x00be, B:52:0x00c4, B:57:0x00cc, B:59:0x00d2), top: B:228:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0134  */
    /* JADX WARN: Code duplicated, block: B:94:0x0135  */
    public final HiAnimeResponse<HiAnimeSourcesData> getAnimeEpisodeSources(String str, String str2, String str3) {
        Object next;
        Object next2;
        k kVarE;
        Object next3;
        com.google.gson.h hVarL;
        String strH;
        String strH2;
        com.google.gson.h hVarL2;
        String strH3;
        com.google.gson.h hVarL3;
        String strH4;
        String strH5;
        com.google.gson.h hVarL4;
        String strH6;
        String strH7;
        Map mapSingletonMap;
        ArrayList arrayList;
        com.google.gson.h hVarL5;
        String strH8;
        HiAnimeTrack hiAnimeTrack;
        com.google.gson.h hVarL6;
        String strH9;
        com.google.gson.h hVarL7;
        String strH10;
        com.google.gson.h hVarL8;
        Boolean boolValueOf;
        str.getClass();
        str2.getClass();
        str3.getClass();
        try {
            kotlin.k episodeId = parseEpisodeId(str);
            k kVarFetchWatch = fetchWatch((String) episodeId.e, (String) episodeId.y);
            if (kVarFetchWatch == null) {
                return new HiAnimeResponse<>(new HiAnimeSourcesData(null, null, null));
            }
            g gVarN = kVarFetchWatch.n("sources");
            if (gVarN == null) {
                return new HiAnimeResponse<>(new HiAnimeSourcesData(null, null, null));
            }
            ArrayList arrayList2 = gVarN.e;
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                k kVarE2 = ((com.google.gson.h) next).e();
                com.google.gson.h hVarL9 = kVarE2.l("server");
                if (l.a(hVarL9 != null ? hVarL9.h() : null, str2)) {
                    com.google.gson.h hVarL10 = kVarE2.l("type");
                    if (l.a(hVarL10 != null ? hVarL10.h() : null, str3)) {
                        break;
                    }
                }
            }
            com.google.gson.h hVar = (com.google.gson.h) next;
            if (hVar != null) {
                kVarE = hVar.e();
            } else {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    k kVarE3 = ((com.google.gson.h) next2).e();
                    com.google.gson.h hVarL11 = kVarE3.l("proxyUrl");
                    if (hVarL11 == null) {
                        hVarL2 = kVarE3.l("m3u8");
                        if (hVarL2 == null) {
                            continue;
                        } else {
                            if (!(hVarL2 instanceof j)) {
                                hVarL2 = null;
                            }
                            if (hVarL2 != null && (strH3 = hVarL2.h()) != null && (!kotlin.text.k.d0(strH3))) {
                                hVarL3 = kVarE3.l("type");
                                if (hVarL3 != null) {
                                    strH4 = hVarL3.h();
                                } else {
                                    strH4 = null;
                                }
                                if (l.a(strH4, str3)) {
                                    break;
                                }
                            }
                        }
                    } else {
                        if (hVarL11 instanceof j) {
                            hVarL11 = null;
                        }
                        if (hVarL11 == null || (strH5 = hVarL11.h()) == null || !(!kotlin.text.k.d0(strH5))) {
                            hVarL2 = kVarE3.l("m3u8");
                            if (hVarL2 == null) {
                                continue;
                            } else {
                                if (!(hVarL2 instanceof j)) {
                                    hVarL2 = null;
                                }
                                if (hVarL2 != null) {
                                    continue;
                                }
                            }
                        }
                        hVarL3 = kVarE3.l("type");
                        if (hVarL3 != null) {
                            strH4 = hVarL3.h();
                        } else {
                            strH4 = null;
                        }
                        if (l.a(strH4, str3)) {
                            break;
                            break;
                        }
                    }
                }
                com.google.gson.h hVar2 = (com.google.gson.h) next2;
                k kVarE4 = hVar2 != null ? hVar2.e() : null;
                if (kVarE4 == null) {
                    Iterator it3 = arrayList2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it3.next();
                        k kVarE5 = ((com.google.gson.h) next3).e();
                        com.google.gson.h hVarL12 = kVarE5.l("proxyUrl");
                        if (hVarL12 != null) {
                            if (hVarL12 instanceof j) {
                                hVarL12 = null;
                            }
                            if (hVarL12 != null && (strH2 = hVarL12.h()) != null && (!kotlin.text.k.d0(strH2))) {
                                break;
                            }
                            hVarL = kVarE5.l("m3u8");
                            if (hVarL == null) {
                                if (!(hVarL instanceof j)) {
                                    hVarL = null;
                                }
                                if (hVarL != null) {
                                    continue;
                                }
                            }
                        } else {
                            hVarL = kVarE5.l("m3u8");
                            if (hVarL == null) {
                                if (!(hVarL instanceof j)) {
                                    hVarL = null;
                                }
                                if (hVarL != null && (strH = hVarL.h()) != null && (!kotlin.text.k.d0(strH))) {
                                    break;
                                }
                            }
                        }
                    }
                    com.google.gson.h hVar3 = (com.google.gson.h) next3;
                    kVarE = hVar3 != null ? hVar3.e() : null;
                    if (kVarE == null) {
                        return new HiAnimeResponse<>(new HiAnimeSourcesData(null, null, null));
                    }
                } else {
                    kVarE = kVarE4;
                }
            }
            com.google.gson.h hVarL13 = kVarE.l("m3u8");
            if (hVarL13 == null) {
                hVarL4 = kVarE.l("proxyUrl");
                if (hVarL4 == null) {
                    strH6 = null;
                } else {
                    if (hVarL4 instanceof j) {
                        hVarL4 = null;
                    }
                    if (hVarL4 != null || (strH6 = hVarL4.h()) == null || kotlin.text.k.d0(strH6)) {
                        strH6 = null;
                    }
                }
                if (strH6 == null) {
                    return new HiAnimeResponse<>(new HiAnimeSourcesData(null, null, null));
                }
            } else {
                if (hVarL13 instanceof j) {
                    hVarL13 = null;
                }
                if (hVarL13 == null || (strH6 = hVarL13.h()) == null) {
                    hVarL4 = kVarE.l("proxyUrl");
                    if (hVarL4 == null) {
                        strH6 = null;
                    } else {
                        if (hVarL4 instanceof j) {
                            hVarL4 = null;
                        }
                        if (hVarL4 != null) {
                            strH6 = null;
                        } else {
                            strH6 = null;
                        }
                    }
                    if (strH6 == null) {
                        return new HiAnimeResponse<>(new HiAnimeSourcesData(null, null, null));
                    }
                } else {
                    if (kotlin.text.k.d0(strH6)) {
                        strH6 = null;
                    }
                    if (strH6 == null) {
                        hVarL4 = kVarE.l("proxyUrl");
                        if (hVarL4 == null) {
                            strH6 = null;
                        } else {
                            if (hVarL4 instanceof j) {
                                hVarL4 = null;
                            }
                            if (hVarL4 != null) {
                                strH6 = null;
                            } else {
                                strH6 = null;
                            }
                        }
                        if (strH6 == null) {
                            return new HiAnimeResponse<>(new HiAnimeSourcesData(null, null, null));
                        }
                    }
                }
            }
            com.google.gson.h hVarL14 = kVarE.l("referer");
            if (hVarL14 == null) {
                strH7 = null;
            } else {
                if (hVarL14 instanceof j) {
                    hVarL14 = null;
                }
                if (hVarL14 == null || (strH7 = hVarL14.h()) == null || kotlin.text.k.d0(strH7)) {
                    strH7 = null;
                }
            }
            if (strH7 != null) {
                mapSingletonMap = Collections.singletonMap("Referer", strH7);
                mapSingletonMap.getClass();
            } else {
                mapSingletonMap = null;
            }
            g gVarN2 = kVarE.n("tracks");
            if (gVarN2 != null) {
                arrayList = new ArrayList();
                Iterator it4 = gVarN2.e.iterator();
                while (it4.hasNext()) {
                    k kVarE6 = ((com.google.gson.h) it4.next()).e();
                    com.google.gson.h hVarL15 = kVarE6.l("file");
                    if (hVarL15 == null) {
                        hVarL5 = kVarE6.l("proxyUrl");
                        if (hVarL5 == null) {
                            strH8 = null;
                        } else {
                            if (hVarL5 instanceof j) {
                                hVarL5 = null;
                            }
                            if (hVarL5 != null || (strH8 = hVarL5.h()) == null || kotlin.text.k.d0(strH8)) {
                                strH8 = null;
                            }
                        }
                        if (strH8 == null) {
                            hiAnimeTrack = null;
                        } else {
                            hVarL6 = kVarE6.l("label");
                            if (hVarL6 == null) {
                                strH9 = null;
                            } else {
                                if (hVarL6 instanceof j) {
                                    hVarL6 = null;
                                }
                                if (hVarL6 != null) {
                                    strH9 = hVarL6.h();
                                } else {
                                    strH9 = null;
                                }
                            }
                            hVarL7 = kVarE6.l("kind");
                            if (hVarL7 == null) {
                                strH10 = "captions";
                            } else {
                                if (hVarL7 instanceof j) {
                                    hVarL7 = null;
                                }
                                if (hVarL7 != null || (strH10 = hVarL7.h()) == null) {
                                    strH10 = "captions";
                                }
                            }
                            hVarL8 = kVarE6.l("default");
                            if (hVarL8 == null) {
                                boolValueOf = null;
                            } else {
                                if (hVarL8 instanceof j) {
                                    hVarL8 = null;
                                }
                                if (hVarL8 != null) {
                                    boolValueOf = Boolean.valueOf(hVarL8.b());
                                } else {
                                    boolValueOf = null;
                                }
                            }
                            hiAnimeTrack = new HiAnimeTrack(strH8, strH9, strH10, boolValueOf);
                        }
                    } else {
                        if (hVarL15 instanceof j) {
                            hVarL15 = null;
                        }
                        if (hVarL15 == null || (strH8 = hVarL15.h()) == null) {
                            hVarL5 = kVarE6.l("proxyUrl");
                            if (hVarL5 == null) {
                                strH8 = null;
                            } else {
                                if (hVarL5 instanceof j) {
                                    hVarL5 = null;
                                }
                                if (hVarL5 != null) {
                                    strH8 = null;
                                } else {
                                    strH8 = null;
                                }
                            }
                            if (strH8 == null) {
                                hiAnimeTrack = null;
                            } else {
                                hVarL6 = kVarE6.l("label");
                                if (hVarL6 == null) {
                                    strH9 = null;
                                } else {
                                    if (hVarL6 instanceof j) {
                                        hVarL6 = null;
                                    }
                                    if (hVarL6 != null) {
                                        strH9 = hVarL6.h();
                                    } else {
                                        strH9 = null;
                                    }
                                }
                                hVarL7 = kVarE6.l("kind");
                                if (hVarL7 == null) {
                                    strH10 = "captions";
                                } else {
                                    if (hVarL7 instanceof j) {
                                        hVarL7 = null;
                                    }
                                    if (hVarL7 != null) {
                                        strH10 = "captions";
                                    } else {
                                        strH10 = "captions";
                                    }
                                }
                                hVarL8 = kVarE6.l("default");
                                if (hVarL8 == null) {
                                    boolValueOf = null;
                                } else {
                                    if (hVarL8 instanceof j) {
                                        hVarL8 = null;
                                    }
                                    if (hVarL8 != null) {
                                        boolValueOf = Boolean.valueOf(hVarL8.b());
                                    } else {
                                        boolValueOf = null;
                                    }
                                }
                                hiAnimeTrack = new HiAnimeTrack(strH8, strH9, strH10, boolValueOf);
                            }
                        } else {
                            if (kotlin.text.k.d0(strH8)) {
                                strH8 = null;
                            }
                            if (strH8 == null) {
                                hVarL5 = kVarE6.l("proxyUrl");
                                if (hVarL5 == null) {
                                    strH8 = null;
                                } else {
                                    if (hVarL5 instanceof j) {
                                        hVarL5 = null;
                                    }
                                    if (hVarL5 != null) {
                                        strH8 = null;
                                    } else {
                                        strH8 = null;
                                    }
                                }
                                if (strH8 == null) {
                                    hiAnimeTrack = null;
                                }
                            }
                            hVarL6 = kVarE6.l("label");
                            if (hVarL6 == null) {
                                strH9 = null;
                            } else {
                                if (hVarL6 instanceof j) {
                                    hVarL6 = null;
                                }
                                if (hVarL6 != null) {
                                    strH9 = hVarL6.h();
                                } else {
                                    strH9 = null;
                                }
                            }
                            hVarL7 = kVarE6.l("kind");
                            if (hVarL7 == null) {
                                strH10 = "captions";
                            } else {
                                if (hVarL7 instanceof j) {
                                    hVarL7 = null;
                                }
                                if (hVarL7 != null) {
                                    strH10 = "captions";
                                } else {
                                    strH10 = "captions";
                                }
                            }
                            hVarL8 = kVarE6.l("default");
                            if (hVarL8 == null) {
                                boolValueOf = null;
                            } else {
                                if (hVarL8 instanceof j) {
                                    hVarL8 = null;
                                }
                                if (hVarL8 != null) {
                                    boolValueOf = Boolean.valueOf(hVarL8.b());
                                } else {
                                    boolValueOf = null;
                                }
                            }
                            hiAnimeTrack = new HiAnimeTrack(strH8, strH9, strH10, boolValueOf);
                        }
                    }
                    if (hiAnimeTrack != null) {
                        arrayList.add(hiAnimeTrack);
                    }
                }
            } else {
                arrayList = null;
            }
            return new HiAnimeResponse<>(new HiAnimeSourcesData(arrayList, c.p(new HiAnimeSource(strH6)), mapSingletonMap));
        } catch (Exception e) {
            o oVar = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.a(TAG, "getAnimeEpisodeSources: " + e.getMessage());
            return new HiAnimeResponse<>(new HiAnimeSourcesData(null, null, null));
        }
    }

    public final HiAnimeResponse<HiAnimeEpisodesData> getAnimeEpisodes(String str) {
        String strH;
        Integer numQ;
        u uVar = u.e;
        str.getClass();
        try {
            String strV0 = kotlin.text.k.v0(str, "|");
            String strFetch = fetch("https://anikoto.ddns.me/api/anime/" + strV0 + "/episodes");
            if (strFetch == null) {
                return new HiAnimeResponse<>(new HiAnimeEpisodesData(0, uVar));
            }
            Envelope envelope = (Envelope) this.gson.d(Envelope.class, strFetch);
            if (!l.a(envelope.getOk(), Boolean.TRUE)) {
                return new HiAnimeResponse<>(new HiAnimeEpisodesData(0, uVar));
            }
            com.google.gson.h data = envelope.getData();
            if (data == null) {
                return new HiAnimeResponse<>(new HiAnimeEpisodesData(0, uVar));
            }
            g gVarN = data.e().n("episodes");
            if (gVarN == null) {
                return new HiAnimeResponse<>(new HiAnimeEpisodesData(0, uVar));
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = gVarN.e.iterator();
            while (it.hasNext()) {
                k kVarE = ((com.google.gson.h) it.next()).e();
                com.google.gson.h hVarL = kVarE.l("number");
                HiAnimeEpisode hiAnimeEpisode = null;
                strH = null;
                String strH2 = null;
                hiAnimeEpisode = null;
                hiAnimeEpisode = null;
                if (hVarL != null && (strH = hVarL.h()) != null && (numQ = r.Q(strH)) != null) {
                    String str2 = strV0 + "|" + numQ.intValue();
                    com.google.gson.h hVarL2 = kVarE.l("title");
                    if (hVarL2 != null) {
                        if (hVarL2 instanceof j) {
                            hVarL2 = null;
                        }
                        if (hVarL2 != null) {
                            strH2 = hVarL2.h();
                        }
                    }
                    hiAnimeEpisode = new HiAnimeEpisode(str2, numQ, strH2);
                }
                if (hiAnimeEpisode != null) {
                    arrayList.add(hiAnimeEpisode);
                }
            }
            return new HiAnimeResponse<>(new HiAnimeEpisodesData(Integer.valueOf(arrayList.size()), arrayList));
        } catch (Exception e) {
            o oVar = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.a(TAG, "getAnimeEpisodes: " + e.getMessage());
            return new HiAnimeResponse<>(new HiAnimeEpisodesData(0, uVar));
        }
    }

    public final HiAnimeResponse<HiAnimeGenresData> getGenres() {
        List<String> list = GENRES;
        return new HiAnimeResponse<>(new HiAnimeGenresData(Integer.valueOf(list.size()), list));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.collections.u] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    public final HiAnimeResponse<HiAnimeHome> getHomePage(String str) {
        ?? arrayList;
        ?? arrayList2;
        String lowerCase;
        String lowerCase2;
        String lowerCase3;
        String lowerCase4;
        try {
            String strFetch = fetch("https://anikoto.ddns.me/api/home");
            if (strFetch == null) {
                return emptyHome();
            }
            Envelope envelope = (Envelope) this.gson.d(Envelope.class, strFetch);
            if (!l.a(envelope.getOk(), Boolean.TRUE)) {
                return emptyHome();
            }
            com.google.gson.h data = envelope.getData();
            if (data == null) {
                return emptyHome();
            }
            k kVarE = data.e();
            g gVarN = kVarE.n("spotlight");
            ?? arrayList3 = u.e;
            if (gVarN != null) {
                arrayList = new ArrayList();
                Iterator it = gVarN.e.iterator();
                while (it.hasNext()) {
                    HiAnimeItem card = parseCard(((com.google.gson.h) it.next()).e());
                    if (card != null) {
                        arrayList.add(card);
                    }
                }
            } else {
                arrayList = arrayList3;
            }
            g gVarN2 = kVarE.n("latestEpisodes");
            if (gVarN2 != null) {
                arrayList2 = new ArrayList();
                Iterator it2 = gVarN2.e.iterator();
                while (it2.hasNext()) {
                    HiAnimeItem card2 = parseCard(((com.google.gson.h) it2.next()).e());
                    if (card2 != null) {
                        arrayList2.add(card2);
                    }
                }
            } else {
                arrayList2 = arrayList3;
            }
            g gVarN3 = kVarE.n("topWeek");
            if (gVarN3 == null) {
                gVarN3 = kVarE.n("topDay");
            }
            if (gVarN3 != null) {
                arrayList3 = new ArrayList();
                Iterator it3 = gVarN3.e.iterator();
                while (it3.hasNext()) {
                    HiAnimeItem card3 = parseCard(((com.google.gson.h) it3.next()).e());
                    if (card3 != null) {
                        arrayList3.add(card3);
                    }
                }
            }
            if (str != null) {
                lowerCase = str.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                ArrayList arrayList4 = new ArrayList();
                for (Object obj : arrayList3) {
                    String strD = ((HiAnimeItem) obj).d();
                    if (strD != null) {
                        lowerCase4 = strD.toLowerCase(Locale.ROOT);
                        lowerCase4.getClass();
                    } else {
                        lowerCase4 = null;
                    }
                    if (l.a(lowerCase4, lowerCase)) {
                        arrayList4.add(obj);
                    }
                }
                arrayList3 = arrayList4;
            }
            if (lowerCase != null) {
                ArrayList arrayList5 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    String strD2 = ((HiAnimeItem) obj2).d();
                    if (strD2 != null) {
                        lowerCase3 = strD2.toLowerCase(Locale.ROOT);
                        lowerCase3.getClass();
                    } else {
                        lowerCase3 = null;
                    }
                    if (l.a(lowerCase3, lowerCase)) {
                        arrayList5.add(obj2);
                    }
                }
                arrayList2 = arrayList5;
            }
            if (lowerCase != null) {
                ArrayList arrayList6 = new ArrayList();
                for (Object obj3 : arrayList) {
                    String strD3 = ((HiAnimeItem) obj3).d();
                    if (strD3 != null) {
                        lowerCase2 = strD3.toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                    } else {
                        lowerCase2 = null;
                    }
                    if (l.a(lowerCase2, lowerCase)) {
                        arrayList6.add(obj3);
                    }
                }
                arrayList = arrayList6;
            }
            return new HiAnimeResponse<>(new HiAnimeHome(arrayList3, arrayList2, arrayList));
        } catch (Exception e) {
            o oVar = com.app.mlounge.util.a.a;
            coil3.compose.internal.f.i("getHomePage: ", e.getMessage(), TAG);
            return emptyHome();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.List] */
    public final HiAnimeResponse<HiAnimeSearchData> searchAnime(String str, int i, String str2, String str3) {
        ?? arrayList;
        g gVarN;
        u uVar = u.e;
        str.getClass();
        try {
            String strFetch = fetch("https://anikoto.ddns.me/api/search?keyword=" + URLEncoder.encode(str, "UTF-8"));
            if (strFetch == null) {
                return new HiAnimeResponse<>(new HiAnimeSearchData(uVar));
            }
            Envelope envelope = (Envelope) this.gson.d(Envelope.class, strFetch);
            if (!l.a(envelope.getOk(), Boolean.TRUE)) {
                return new HiAnimeResponse<>(new HiAnimeSearchData(uVar));
            }
            com.google.gson.h data = envelope.getData();
            k kVarE = data != null ? data.e() : null;
            if (kVarE == null || (gVarN = kVarE.n("results")) == null) {
                arrayList = uVar;
            } else {
                arrayList = new ArrayList();
                Iterator it = gVarN.e.iterator();
                while (it.hasNext()) {
                    HiAnimeItem card = parseCard(((com.google.gson.h) it.next()).e());
                    if (card != null) {
                        arrayList.add(card);
                    }
                }
            }
            if (str2 != null && str2.length() != 0 && !str2.equals("all")) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (r.I(((HiAnimeItem) obj).d(), str2, true)) {
                        arrayList2.add(obj);
                    }
                }
                arrayList = arrayList2;
            }
            return new HiAnimeResponse<>(new HiAnimeSearchData(arrayList));
        } catch (Exception e) {
            o oVar = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.a(TAG, "searchAnime: " + e.getMessage());
            return new HiAnimeResponse<>(new HiAnimeSearchData(uVar));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final List<String> getGENRES() {
            return AnikotoScraper.GENRES;
        }

        private Companion() {
        }
    }
}
