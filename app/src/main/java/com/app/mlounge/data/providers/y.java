package com.app.mlounge.data.providers;

import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements k0 {
    public static final int $stable = 8;
    private static final String BASE_URL = "https://fsharetv.cc";
    public static final w Companion = new w();
    private static final String TRAILER = "Png81APqcxU";
    private final okhttp3.y client;
    private final com.google.gson.f gson;
    private final String name;
    private final l1 tmdbHelper;

    public y(okhttp3.y yVar, l1 l1Var) {
        yVar.getClass();
        l1Var.getClass();
        this.client = yVar;
        this.tmdbHelper = l1Var;
        this.name = "FshareTV";
        this.gson = new com.google.gson.f();
    }

    @Override // com.app.mlounge.data.providers.k0
    public final Object a(String str, String str2, Integer num, Integer num2, kotlin.coroutines.jvm.internal.i iVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new x(this, str, str2, null), iVar);
    }

    @Override // com.app.mlounge.data.providers.k0
    public final String getName() {
        return this.name;
    }
}
