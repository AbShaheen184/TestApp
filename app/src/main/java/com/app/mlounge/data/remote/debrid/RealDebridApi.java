package com.app.mlounge.data.remote.debrid;

import com.google.gson.k;
import kotlin.coroutines.d;
import retrofit2.http.c;
import retrofit2.http.e;
import retrofit2.http.f;
import retrofit2.http.i;
import retrofit2.http.o;
import retrofit2.http.s;
import retrofit2.http.t;
import retrofit2.r0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface RealDebridApi {
    @f("rest/1.0/user")
    Object a(@i("Authorization") String str, d<? super k> dVar);

    @o("oauth/v2/token")
    @e
    Object b(@c("client_id") String str, @c("client_secret") String str2, @c("code") String str3, @c("grant_type") String str4, d<? super RealDebridTokenResponse> dVar);

    @o("rest/1.0/torrents/selectFiles/{id}")
    @e
    Object c(@i("Authorization") String str, @s("id") String str2, @c("files") String str3, d<? super r0<k>> dVar);

    @f("rest/1.0/torrents/info/{id}")
    Object d(@i("Authorization") String str, @s("id") String str2, d<? super k> dVar);

    @f("oauth/v2/device/code")
    Object e(@t("client_id") String str, @t("new_credentials") String str2, d<? super RealDebridDeviceCodeResponse> dVar);

    @o("rest/1.0/unrestrict/link")
    @e
    Object f(@i("Authorization") String str, @c("link") String str2, d<? super k> dVar);

    @f("oauth/v2/device/credentials")
    Object g(@t("client_id") String str, @t("code") String str2, d<? super RealDebridCredentialsResponse> dVar);

    @o("rest/1.0/torrents/addMagnet")
    @e
    Object h(@i("Authorization") String str, @c("magnet") String str2, d<? super k> dVar);
}
