package com.app.mlounge.data.remote.api;

import com.app.mlounge.data.remote.model.NtvChannelsResponse;
import com.app.mlounge.data.remote.model.SportsMatchResponse;
import com.google.gson.b;
import kotlin.coroutines.d;
import retrofit2.http.f;
import retrofit2.http.t;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface NtvApi {

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object getMatches$default(NtvApi ntvApi, String str, String str2, d dVar, int i, Object obj) {
        if (obj != null) {
            b.r("Super calls with default arguments not supported in this target, function: getMatches");
            return null;
        }
        if ((i & 2) != 0) {
            str2 = "both";
        }
        return ntvApi.getMatches(str, str2, dVar);
    }

    @f("api/get-channels")
    Object getChannels(d<? super NtvChannelsResponse> dVar);

    @f("api/get-matches")
    Object getMatches(@t("server") String str, @t("type") String str2, d<? super SportsMatchResponse> dVar);
}
