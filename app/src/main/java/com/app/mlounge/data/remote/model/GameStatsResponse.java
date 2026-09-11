package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import java.util.Map;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class GameStatsResponse {
    public static final int $stable = 8;
    private final Map<String, Integer> decades;
    private final Map<String, Integer> genres;
    private final String platform;
    private final String platformName;
    private final Integer totalGames;

    public final Map a() {
        return this.decades;
    }

    public final Map b() {
        return this.genres;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameStatsResponse)) {
            return false;
        }
        GameStatsResponse gameStatsResponse = (GameStatsResponse) obj;
        return l.a(this.platform, gameStatsResponse.platform) && l.a(this.platformName, gameStatsResponse.platformName) && l.a(this.totalGames, gameStatsResponse.totalGames) && l.a(this.genres, gameStatsResponse.genres) && l.a(this.decades, gameStatsResponse.decades);
    }

    public final int hashCode() {
        String str = this.platform;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.platformName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.totalGames;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Map<String, Integer> map = this.genres;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, Integer> map2 = this.decades;
        return iHashCode4 + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.platform;
        String str2 = this.platformName;
        Integer num = this.totalGames;
        Map<String, Integer> map = this.genres;
        Map<String, Integer> map2 = this.decades;
        StringBuilder sbO = c.o("GameStatsResponse(platform=", str, ", platformName=", str2, ", totalGames=");
        sbO.append(num);
        sbO.append(", genres=");
        sbO.append(map);
        sbO.append(", decades=");
        sbO.append(map2);
        sbO.append(")");
        return sbO.toString();
    }
}
