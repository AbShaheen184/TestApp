package com.app.mlounge.data.providers;

import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements k0 {
    public static final int $stable = 8;
    private static final String BASE_URL = "https://comet.elfhosted.com";
    public static final i Companion = new i();
    private final okhttp3.y client;
    private final com.google.gson.f gson;
    private final String name;
    private final com.app.mlounge.data.local.prefs.y1 prefs;
    private final l1 tmdbHelper;

    public k(okhttp3.y yVar, l1 l1Var, com.app.mlounge.data.local.prefs.y1 y1Var) {
        yVar.getClass();
        l1Var.getClass();
        y1Var.getClass();
        this.client = yVar;
        this.tmdbHelper = l1Var;
        this.prefs = y1Var;
        this.name = "Comet";
        this.gson = new com.google.gson.f();
    }

    @Override // com.app.mlounge.data.providers.k0
    public final Object a(String str, String str2, Integer num, Integer num2, kotlin.coroutines.jvm.internal.i iVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new j(this, str, str2, num, num2, null), iVar);
    }

    @Override // com.app.mlounge.data.providers.k0
    public final String getName() {
        return this.name;
    }
}
