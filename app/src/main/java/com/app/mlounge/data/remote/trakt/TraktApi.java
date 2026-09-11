package com.app.mlounge.data.remote.trakt;

import java.util.List;
import kotlin.coroutines.d;
import kotlin.y;
import retrofit2.http.a;
import retrofit2.http.f;
import retrofit2.http.i;
import retrofit2.http.o;
import retrofit2.http.s;
import retrofit2.http.t;
import retrofit2.r0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface TraktApi {

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class DefaultImpls {
    }

    @f("sync/watchlist/{type}")
    Object a(@i("Authorization") String str, @s("type") String str2, @t("page") int i, @t("limit") int i2, d<? super r0<List<TraktWatchlistItem>>> dVar);

    @o("sync/watchlist/remove")
    Object b(@i("Authorization") String str, @a TraktSyncRequest traktSyncRequest, d<? super TraktSyncResponse> dVar);

    @o("sync/history")
    Object c(@i("Authorization") String str, @a TraktSyncRequest traktSyncRequest, d<? super TraktSyncResponse> dVar);

    @f("sync/history/{type}")
    Object d(@i("Authorization") String str, @s("type") String str2, @t("page") int i, @t("limit") int i2, d<? super r0<List<TraktHistoryItem>>> dVar);

    @o("oauth/token")
    Object e(@a TraktRefreshTokenRequest traktRefreshTokenRequest, d<? super TraktTokenResponse> dVar);

    @o("oauth/device/token")
    Object f(@a TraktDeviceTokenRequest traktDeviceTokenRequest, d<? super r0<TraktTokenResponse>> dVar);

    @o("sync/watchlist")
    Object g(@i("Authorization") String str, @a TraktSyncRequest traktSyncRequest, d<? super TraktSyncResponse> dVar);

    @f("users/settings")
    Object h(@i("Authorization") String str, d<? super TraktUserSettings> dVar);

    @o("oauth/revoke")
    Object i(@a TraktRevokeRequest traktRevokeRequest, d<? super r0<y>> dVar);

    @o("sync/history/remove")
    Object j(@i("Authorization") String str, @a TraktSyncRequest traktSyncRequest, d<? super TraktSyncResponse> dVar);

    @f("sync/last_activities")
    Object k(@i("Authorization") String str, d<? super TraktLastActivities> dVar);

    @o("oauth/device/code")
    Object l(@a TraktDeviceCodeRequest traktDeviceCodeRequest, d<? super TraktDeviceCodeResponse> dVar);
}
