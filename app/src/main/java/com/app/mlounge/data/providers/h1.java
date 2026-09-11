package com.app.mlounge.data.providers;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 {
    public static final int $stable = 8;
    public static final f1 Companion = new f1();
    private static final Map<String, String> REGIONS = kotlin.collections.a0.v(new kotlin.k("us", "45.50.96.71"), new kotlin.k("gb", "178.238.11.6"), new kotlin.k("ca", "99.224.0.1"), new kotlin.k("de", "85.214.132.117"), new kotlin.k("fr", "212.27.48.10"), new kotlin.k("it", "5.170.0.1"), new kotlin.k("es", "88.0.0.1"));
    private static final String TAG = "PlutoTV";
    private final okhttp3.y client;
    private final com.google.gson.f gson = new com.google.gson.f();
    private final String ua = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/14.1.2 Safari/605.1.15";

    public h1(okhttp3.y yVar) {
        this.client = yVar;
    }
}
