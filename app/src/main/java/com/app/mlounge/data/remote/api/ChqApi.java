package com.app.mlounge.data.remote.api;

import com.app.mlounge.data.remote.model.ChqStreamResponse;
import com.app.mlounge.data.remote.model.GameDetailResponse;
import com.app.mlounge.data.remote.model.GameSearchResponse;
import com.app.mlounge.data.remote.model.GameStatsResponse;
import com.app.mlounge.data.remote.model.GamesResponse;
import com.app.mlounge.data.remote.model.IptvGroupsResponse;
import com.app.mlounge.data.remote.model.IptvSearchResponse;
import com.app.mlounge.data.remote.model.IptvStatsResponse;
import com.google.gson.b;
import kotlin.coroutines.d;
import okhttp3.j0;
import retrofit2.http.f;
import retrofit2.http.s;
import retrofit2.http.t;
import retrofit2.http.w;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface ChqApi {

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object get4khdStreams$default(ChqApi chqApi, String str, String str2, Integer num, Integer num2, d dVar, int i, Object obj) {
        if (obj != null) {
            b.r("Super calls with default arguments not supported in this target, function: get4khdStreams");
            return null;
        }
        if ((i & 2) != 0) {
            str2 = "movie";
        }
        return chqApi.get4khdStreams(str, str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, dVar);
    }

    static /* synthetic */ Object getChannelGroups$default(ChqApi chqApi, String str, d dVar, int i, Object obj) {
        if (obj != null) {
            b.r("Super calls with default arguments not supported in this target, function: getChannelGroups");
            return null;
        }
        if ((i & 1) != 0) {
            str = null;
        }
        return chqApi.getChannelGroups(str, dVar);
    }

    static /* synthetic */ Object getFmoviesStreams$default(ChqApi chqApi, String str, String str2, Integer num, Integer num2, d dVar, int i, Object obj) {
        if (obj != null) {
            b.r("Super calls with default arguments not supported in this target, function: getFmoviesStreams");
            return null;
        }
        if ((i & 2) != 0) {
            str2 = "movie";
        }
        return chqApi.getFmoviesStreams(str, str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, dVar);
    }

    static /* synthetic */ Object getGames$default(ChqApi chqApi, String str, int i, int i2, String str2, String str3, d dVar, int i3, Object obj) {
        if (obj != null) {
            b.r("Super calls with default arguments not supported in this target, function: getGames");
            return null;
        }
        if ((i3 & 2) != 0) {
            i = 1;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = 20;
        }
        return chqApi.getGames(str, i4, i2, (i3 & 8) != 0 ? null : str2, (i3 & 16) != 0 ? null : str3, dVar);
    }

    static /* synthetic */ Object getKmmoviesStreams$default(ChqApi chqApi, String str, String str2, Integer num, Integer num2, d dVar, int i, Object obj) {
        if (obj != null) {
            b.r("Super calls with default arguments not supported in this target, function: getKmmoviesStreams");
            return null;
        }
        if ((i & 2) != 0) {
            str2 = "movie";
        }
        return chqApi.getKmmoviesStreams(str, str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, dVar);
    }

    static /* synthetic */ Object getMoviesmodStreams$default(ChqApi chqApi, String str, String str2, Integer num, Integer num2, d dVar, int i, Object obj) {
        if (obj != null) {
            b.r("Super calls with default arguments not supported in this target, function: getMoviesmodStreams");
            return null;
        }
        if ((i & 2) != 0) {
            str2 = "movie";
        }
        return chqApi.getMoviesmodStreams(str, str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, dVar);
    }

    static /* synthetic */ Object getMultiEmbedStreams$default(ChqApi chqApi, String str, String str2, Integer num, Integer num2, d dVar, int i, Object obj) {
        if (obj != null) {
            b.r("Super calls with default arguments not supported in this target, function: getMultiEmbedStreams");
            return null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        return chqApi.getMultiEmbedStreams(str, str2, num, num2, dVar);
    }

    static /* synthetic */ Object getPlutoCategories$default(ChqApi chqApi, String str, d dVar, int i, Object obj) {
        if (obj != null) {
            b.r("Super calls with default arguments not supported in this target, function: getPlutoCategories");
            return null;
        }
        if ((i & 1) != 0) {
            str = "us";
        }
        return chqApi.getPlutoCategories(str, dVar);
    }

    static /* synthetic */ Object getPlutoChannels$default(ChqApi chqApi, String str, d dVar, int i, Object obj) {
        if (obj != null) {
            b.r("Super calls with default arguments not supported in this target, function: getPlutoChannels");
            return null;
        }
        if ((i & 1) != 0) {
            str = "us";
        }
        return chqApi.getPlutoChannels(str, dVar);
    }

    static /* synthetic */ Object getPrimesrcStreams$default(ChqApi chqApi, String str, String str2, Integer num, Integer num2, d dVar, int i, Object obj) {
        if (obj != null) {
            b.r("Super calls with default arguments not supported in this target, function: getPrimesrcStreams");
            return null;
        }
        if ((i & 2) != 0) {
            str2 = "movie";
        }
        return chqApi.getPrimesrcStreams(str, str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, dVar);
    }

    static /* synthetic */ Object getTorrentioStreams$default(ChqApi chqApi, String str, String str2, String str3, Integer num, Integer num2, d dVar, int i, Object obj) {
        if (obj != null) {
            b.r("Super calls with default arguments not supported in this target, function: getTorrentioStreams");
            return null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = "movie";
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            num2 = null;
        }
        return chqApi.getTorrentioStreams(str, str2, str3, num, num2, dVar);
    }

    static /* synthetic */ Object getTwoembedStreams$default(ChqApi chqApi, String str, String str2, Integer num, Integer num2, d dVar, int i, Object obj) {
        if (obj != null) {
            b.r("Super calls with default arguments not supported in this target, function: getTwoembedStreams");
            return null;
        }
        if ((i & 2) != 0) {
            str2 = "movie";
        }
        return chqApi.getTwoembedStreams(str, str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, dVar);
    }

    static /* synthetic */ Object getUhdmoviesStreams$default(ChqApi chqApi, String str, String str2, Integer num, Integer num2, d dVar, int i, Object obj) {
        if (obj != null) {
            b.r("Super calls with default arguments not supported in this target, function: getUhdmoviesStreams");
            return null;
        }
        if ((i & 2) != 0) {
            str2 = "movie";
        }
        return chqApi.getUhdmoviesStreams(str, str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, dVar);
    }

    static /* synthetic */ Object getVidrockStreams$default(ChqApi chqApi, String str, String str2, Integer num, Integer num2, d dVar, int i, Object obj) {
        if (obj != null) {
            b.r("Super calls with default arguments not supported in this target, function: getVidrockStreams");
            return null;
        }
        if ((i & 2) != 0) {
            str2 = "movie";
        }
        return chqApi.getVidrockStreams(str, str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, dVar);
    }

    static /* synthetic */ Object getVidsrcStreams$default(ChqApi chqApi, String str, String str2, Integer num, Integer num2, d dVar, int i, Object obj) {
        if (obj != null) {
            b.r("Super calls with default arguments not supported in this target, function: getVidsrcStreams");
            return null;
        }
        if ((i & 2) != 0) {
            str2 = "movie";
        }
        return chqApi.getVidsrcStreams(str, str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, dVar);
    }

    static /* synthetic */ Object getVidzeeStreams$default(ChqApi chqApi, String str, String str2, Integer num, Integer num2, d dVar, int i, Object obj) {
        if (obj != null) {
            b.r("Super calls with default arguments not supported in this target, function: getVidzeeStreams");
            return null;
        }
        if ((i & 2) != 0) {
            str2 = "movie";
        }
        return chqApi.getVidzeeStreams(str, str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, dVar);
    }

    static /* synthetic */ Object getVixsrcStreams$default(ChqApi chqApi, String str, String str2, Integer num, Integer num2, d dVar, int i, Object obj) {
        if (obj != null) {
            b.r("Super calls with default arguments not supported in this target, function: getVixsrcStreams");
            return null;
        }
        if ((i & 2) != 0) {
            str2 = "movie";
        }
        return chqApi.getVixsrcStreams(str, str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, dVar);
    }

    static /* synthetic */ Object searchChannels$default(ChqApi chqApi, String str, String str2, String str3, int i, d dVar, int i2, Object obj) {
        if (obj != null) {
            b.r("Super calls with default arguments not supported in this target, function: searchChannels");
            return null;
        }
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        if ((i2 & 4) != 0) {
            str3 = null;
        }
        if ((i2 & 8) != 0) {
            i = 100;
        }
        return chqApi.searchChannels(str, str2, str3, i, dVar);
    }

    static /* synthetic */ Object searchGames$default(ChqApi chqApi, String str, String str2, int i, int i2, d dVar, int i3, Object obj) {
        if (obj != null) {
            b.r("Super calls with default arguments not supported in this target, function: searchGames");
            return null;
        }
        if ((i3 & 4) != 0) {
            i = 1;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = 20;
        }
        return chqApi.searchGames(str, str2, i4, i2, dVar);
    }

    @w
    @f("api/games/{platform}/rom/{slug}")
    Object downloadRom(@s("platform") String str, @s("slug") String str2, d<? super j0> dVar);

    @f("api/4khdhub/streams")
    Object get4khdStreams(@t("tmdbId") String str, @t("type") String str2, @t("season") Integer num, @t("episode") Integer num2, d<? super ChqStreamResponse> dVar);

    @f("api/iptv/groups")
    Object getChannelGroups(@t("country") String str, d<? super IptvGroupsResponse> dVar);

    @f("api/fmovies/streams")
    Object getFmoviesStreams(@t("tmdbId") String str, @t("type") String str2, @t("season") Integer num, @t("episode") Integer num2, d<? super ChqStreamResponse> dVar);

    @f("api/games/{platform}/game/{slug}")
    Object getGameDetail(@s("platform") String str, @s("slug") String str2, d<? super GameDetailResponse> dVar);

    @f("api/games/{platform}/stats")
    Object getGameStats(@s("platform") String str, d<? super GameStatsResponse> dVar);

    @f("api/games/{platform}/games")
    Object getGames(@s("platform") String str, @t("page") int i, @t("limit") int i2, @t("genre") String str2, @t("decade") String str3, d<? super GamesResponse> dVar);

    @f("api/iptv/stats")
    Object getIptvStats(d<? super IptvStatsResponse> dVar);

    @f("api/kmmovies/streams")
    Object getKmmoviesStreams(@t("tmdbId") String str, @t("type") String str2, @t("season") Integer num, @t("episode") Integer num2, d<? super ChqStreamResponse> dVar);

    @f("api/moviesmod/streams")
    Object getMoviesmodStreams(@t("tmdbId") String str, @t("type") String str2, @t("season") Integer num, @t("episode") Integer num2, d<? super ChqStreamResponse> dVar);

    @f("api/multiembed/streams")
    Object getMultiEmbedStreams(@t("tmdbId") String str, @t("type") String str2, @t("season") Integer num, @t("episode") Integer num2, d<? super ChqStreamResponse> dVar);

    @f("api/plutotv/categories/{region}")
    Object getPlutoCategories(@s("region") String str, d<? super PlutoCategoriesResponse> dVar);

    @f("api/plutotv/channels/{region}")
    Object getPlutoChannels(@s("region") String str, d<? super PlutoChannelsResponse> dVar);

    @f("api/primesrc/streams")
    Object getPrimesrcStreams(@t("tmdbId") String str, @t("type") String str2, @t("season") Integer num, @t("episode") Integer num2, d<? super ChqStreamResponse> dVar);

    @f("api/{provider}/meta")
    Object getProviderMeta(@s("provider") String str, d<? super ProviderMeta> dVar);

    @f("api/torrentio/streams")
    Object getTorrentioStreams(@t("tmdbId") String str, @t("imdbId") String str2, @t("type") String str3, @t("season") Integer num, @t("episode") Integer num2, d<? super ChqStreamResponse> dVar);

    @f("api/twoembed/streams")
    Object getTwoembedStreams(@t("tmdbId") String str, @t("type") String str2, @t("season") Integer num, @t("episode") Integer num2, d<? super ChqStreamResponse> dVar);

    @f("api/uhdmovies/streams")
    Object getUhdmoviesStreams(@t("tmdbId") String str, @t("type") String str2, @t("season") Integer num, @t("episode") Integer num2, d<? super ChqStreamResponse> dVar);

    @f("api/vavoo/channels")
    Object getVavooChannels(d<? super VavooChannelsResponse> dVar);

    @f("api/vidrock/streams")
    Object getVidrockStreams(@t("tmdbId") String str, @t("type") String str2, @t("season") Integer num, @t("episode") Integer num2, d<? super ChqStreamResponse> dVar);

    @f("api/vidsrc/streams")
    Object getVidsrcStreams(@t("tmdbId") String str, @t("type") String str2, @t("season") Integer num, @t("episode") Integer num2, d<? super ChqStreamResponse> dVar);

    @f("api/vidzee/streams")
    Object getVidzeeStreams(@t("tmdbId") String str, @t("type") String str2, @t("season") Integer num, @t("episode") Integer num2, d<? super ChqStreamResponse> dVar);

    @f("api/vixsrc/streams")
    Object getVixsrcStreams(@t("tmdbId") String str, @t("type") String str2, @t("season") Integer num, @t("episode") Integer num2, d<? super ChqStreamResponse> dVar);

    @f("api/{provider}/regenerate")
    Object regenerateProviderPlaylist(@s("provider") String str, d<? super String> dVar);

    @f("api/vavoo/resolve")
    Object resolveVavooChannel(@t("url") String str, d<? super VavooResolveResponse> dVar);

    @f("api/iptv/search")
    Object searchChannels(@t("q") String str, @t("country") String str2, @t("category") String str3, @t("limit") int i, d<? super IptvSearchResponse> dVar);

    @f("api/games/{platform}/search")
    Object searchGames(@s("platform") String str, @t("q") String str2, @t("page") int i, @t("limit") int i2, d<? super GameSearchResponse> dVar);
}
