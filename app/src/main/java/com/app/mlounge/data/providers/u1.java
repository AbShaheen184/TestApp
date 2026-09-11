package com.app.mlounge.data.providers;

import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 implements k0 {
    public static final int $stable = 8;
    private static final String API_URL = "https://streamdata.vaplayer.ru/api.php";
    public static final s1 Companion = new s1();
    private static final String IFRAME_URL = "https://nextgencloudfabric.com";
    private final okhttp3.y client;
    private final com.google.gson.f gson;
    private final String name;

    public u1(okhttp3.y yVar) {
        yVar.getClass();
        this.client = yVar;
        this.name = "VidApi";
        this.gson = new com.google.gson.f();
    }

    @Override // com.app.mlounge.data.providers.k0
    public final Object a(String str, String str2, Integer num, Integer num2, kotlin.coroutines.jvm.internal.i iVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new t1(str, str2, num, num2, this, null), iVar);
    }

    @Override // com.app.mlounge.data.providers.k0
    public final String getName() {
        return this.name;
    }
}
