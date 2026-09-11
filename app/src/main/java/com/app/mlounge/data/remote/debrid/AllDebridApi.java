package com.app.mlounge.data.remote.debrid;

import com.google.gson.k;
import kotlin.coroutines.d;
import retrofit2.http.c;
import retrofit2.http.e;
import retrofit2.http.f;
import retrofit2.http.i;
import retrofit2.http.o;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface AllDebridApi {
    @f("v4/user")
    Object a(@i("Authorization") String str, d<? super k> dVar);

    @f("v4.1/pin/get")
    Object b(d<? super k> dVar);

    @o("v4/link/unlock")
    @e
    Object c(@i("Authorization") String str, @c("link") String str2, d<? super k> dVar);

    @o("v4/magnet/files")
    @e
    Object d(@i("Authorization") String str, @c("id[]") int i, d<? super k> dVar);

    @o("v4/pin/check")
    @e
    Object e(@c("check") String str, @c("pin") String str2, d<? super k> dVar);

    @o("v4.1/magnet/status")
    @e
    Object f(@i("Authorization") String str, @c("id") int i, d<? super k> dVar);

    @o("v4/magnet/upload")
    @e
    Object g(@i("Authorization") String str, @c("magnets[]") String str2, d<? super k> dVar);
}
