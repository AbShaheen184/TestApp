package com.app.mlounge.data.remote.model;

import androidx.privacysandbox.ads.adservices.java.internal.a;
import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class GameSearchResponse {
    public static final int $stable = 8;
    private final List<Game> games;
    private final boolean hasNext;
    private final boolean hasPrev;
    private final int limit;
    private final int page;
    private final String query;
    private final int totalPages;
    private final int totalResults;

    public final List a() {
        return this.games;
    }

    public final int b() {
        return this.page;
    }

    public final int c() {
        return this.totalPages;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameSearchResponse)) {
            return false;
        }
        GameSearchResponse gameSearchResponse = (GameSearchResponse) obj;
        return l.a(this.query, gameSearchResponse.query) && this.page == gameSearchResponse.page && this.limit == gameSearchResponse.limit && this.totalResults == gameSearchResponse.totalResults && this.totalPages == gameSearchResponse.totalPages && this.hasNext == gameSearchResponse.hasNext && this.hasPrev == gameSearchResponse.hasPrev && l.a(this.games, gameSearchResponse.games);
    }

    public final int hashCode() {
        String str = this.query;
        return this.games.hashCode() + a.f(a.f(a.b(this.totalPages, a.b(this.totalResults, a.b(this.limit, a.b(this.page, (str == null ? 0 : str.hashCode()) * 31, 31), 31), 31), 31), 31, this.hasNext), 31, this.hasPrev);
    }

    public final String toString() {
        return "GameSearchResponse(query=" + this.query + ", page=" + this.page + ", limit=" + this.limit + ", totalResults=" + this.totalResults + ", totalPages=" + this.totalPages + ", hasNext=" + this.hasNext + ", hasPrev=" + this.hasPrev + ", games=" + this.games + ")";
    }
}
