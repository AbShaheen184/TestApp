package com.app.mlounge.data.remote.model;

import androidx.privacysandbox.ads.adservices.java.internal.a;
import coil3.compose.internal.f;
import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class GamesResponse {
    public static final int $stable = 8;
    private final List<Game> games;
    private final boolean hasNext;
    private final boolean hasPrev;
    private final int limit;
    private final int page;
    private final int totalGames;
    private final int totalPages;

    public final List a() {
        return this.games;
    }

    public final int b() {
        return this.totalPages;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GamesResponse)) {
            return false;
        }
        GamesResponse gamesResponse = (GamesResponse) obj;
        return this.page == gamesResponse.page && this.limit == gamesResponse.limit && this.totalGames == gamesResponse.totalGames && this.totalPages == gamesResponse.totalPages && this.hasNext == gamesResponse.hasNext && this.hasPrev == gamesResponse.hasPrev && l.a(this.games, gamesResponse.games);
    }

    public final int hashCode() {
        return this.games.hashCode() + a.f(a.f(a.b(this.totalPages, a.b(this.totalGames, a.b(this.limit, Integer.hashCode(this.page) * 31, 31), 31), 31), 31, this.hasNext), 31, this.hasPrev);
    }

    public final String toString() {
        int i = this.page;
        int i2 = this.limit;
        int i3 = this.totalGames;
        int i4 = this.totalPages;
        boolean z = this.hasNext;
        boolean z2 = this.hasPrev;
        List<Game> list = this.games;
        StringBuilder sbW = a.w("GamesResponse(page=", ", limit=", i, ", totalGames=", i2);
        sbW.append(i3);
        sbW.append(", totalPages=");
        sbW.append(i4);
        sbW.append(", hasNext=");
        sbW.append(z);
        sbW.append(", hasPrev=");
        sbW.append(z2);
        sbW.append(", games=");
        return f.f(sbW, list, ")");
    }
}
