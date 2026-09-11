package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import androidx.privacysandbox.ads.adservices.java.internal.a;
import coil3.compose.internal.f;
import com.app.mlounge.emulator.LibretroCore;
import com.google.gson.annotations.b;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.l;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class ChqStream {
    public static final int $stable = 8;
    private final List<HiAnimeTrack> animeSubtitles;
    private final String description;

    @b(alternate = {"fileIdx"}, value = "file_index")
    private final Integer fileIdx;
    private final Map<String, String> headers;

    @b(alternate = {"infoHash"}, value = "info_hash")
    private final String infoHash;

    @b("is_torrent")
    private final Boolean isTorrent;

    @b(alternate = {"name"}, value = "server")
    private final String name;
    private final String quality;
    private final Integer seeders;
    private final String size;

    @b("stream_type")
    private final String streamType;
    private final String type;

    @b(alternate = {"magnet"}, value = "url")
    private final String url;

    public /* synthetic */ ChqStream(String str, String str2, String str3, String str4, String str5, String str6, Map map, Integer num, String str7, Integer num2, Boolean bool, String str8, List list, int i) {
        this(str, str2, str3, str4, str5, str6, map, (i & 128) != 0 ? null : num, (i & LibretroCore.SCREEN_WIDTH) != 0 ? null : str7, (i & 512) != 0 ? null : num2, (i & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? null : bool, (i & 2048) != 0 ? null : str8, (i & 4096) != 0 ? null : list);
    }

    public static ChqStream a(ChqStream chqStream, String str) {
        String str2 = chqStream.name;
        String str3 = chqStream.url;
        String str4 = chqStream.quality;
        String str5 = chqStream.type;
        String str6 = chqStream.streamType;
        Map<String, String> map = chqStream.headers;
        Integer num = chqStream.seeders;
        String str7 = chqStream.infoHash;
        Integer num2 = chqStream.fileIdx;
        Boolean bool = chqStream.isTorrent;
        String str8 = chqStream.description;
        List<HiAnimeTrack> list = chqStream.animeSubtitles;
        str3.getClass();
        return new ChqStream(str2, str3, str4, str5, str6, str, map, num, str7, num2, bool, str8, list);
    }

    public final List b() {
        return this.animeSubtitles;
    }

    public final String c() {
        return this.description;
    }

    public final Integer d() {
        return this.fileIdx;
    }

    public final Map e() {
        return this.headers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChqStream)) {
            return false;
        }
        ChqStream chqStream = (ChqStream) obj;
        return l.a(this.name, chqStream.name) && l.a(this.url, chqStream.url) && l.a(this.quality, chqStream.quality) && l.a(this.type, chqStream.type) && l.a(this.streamType, chqStream.streamType) && l.a(this.size, chqStream.size) && l.a(this.headers, chqStream.headers) && l.a(this.seeders, chqStream.seeders) && l.a(this.infoHash, chqStream.infoHash) && l.a(this.fileIdx, chqStream.fileIdx) && l.a(this.isTorrent, chqStream.isTorrent) && l.a(this.description, chqStream.description) && l.a(this.animeSubtitles, chqStream.animeSubtitles);
    }

    public final String f() {
        return this.infoHash;
    }

    public final String g() {
        return this.name;
    }

    public final String h() {
        return this.quality;
    }

    public final int hashCode() {
        String str = this.name;
        int iE = a.e((str == null ? 0 : str.hashCode()) * 31, 31, this.url);
        String str2 = this.quality;
        int iHashCode = (iE + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.streamType;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.size;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Map<String, String> map = this.headers;
        int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.seeders;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.infoHash;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.fileIdx;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.isTorrent;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str7 = this.description;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<HiAnimeTrack> list = this.animeSubtitles;
        return iHashCode10 + (list != null ? list.hashCode() : 0);
    }

    public final Integer i() {
        return this.seeders;
    }

    public final String j() {
        return this.size;
    }

    public final String k() {
        return this.streamType;
    }

    public final String l() {
        return this.type;
    }

    public final String m() {
        return this.url;
    }

    public final Boolean n() {
        return this.isTorrent;
    }

    public final String toString() {
        String str = this.name;
        String str2 = this.url;
        String str3 = this.quality;
        String str4 = this.type;
        String str5 = this.streamType;
        String str6 = this.size;
        Map<String, String> map = this.headers;
        Integer num = this.seeders;
        String str7 = this.infoHash;
        Integer num2 = this.fileIdx;
        Boolean bool = this.isTorrent;
        String str8 = this.description;
        List<HiAnimeTrack> list = this.animeSubtitles;
        StringBuilder sbO = c.o("ChqStream(name=", str, ", url=", str2, ", quality=");
        c.y(sbO, str3, ", type=", str4, ", streamType=");
        c.y(sbO, str5, ", size=", str6, ", headers=");
        sbO.append(map);
        sbO.append(", seeders=");
        sbO.append(num);
        sbO.append(", infoHash=");
        sbO.append(str7);
        sbO.append(", fileIdx=");
        sbO.append(num2);
        sbO.append(", isTorrent=");
        sbO.append(bool);
        sbO.append(", description=");
        sbO.append(str8);
        sbO.append(", animeSubtitles=");
        return f.f(sbO, list, ")");
    }

    public ChqStream(String str, String str2, String str3, String str4, String str5, String str6, Map map, Integer num, String str7, Integer num2, Boolean bool, String str8, List list) {
        str2.getClass();
        this.name = str;
        this.url = str2;
        this.quality = str3;
        this.type = str4;
        this.streamType = str5;
        this.size = str6;
        this.headers = map;
        this.seeders = num;
        this.infoHash = str7;
        this.fileIdx = num2;
        this.isTorrent = bool;
        this.description = str8;
        this.animeSubtitles = list;
    }
}
