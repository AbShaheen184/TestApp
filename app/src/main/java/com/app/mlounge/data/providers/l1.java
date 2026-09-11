package com.app.mlounge.data.providers;

import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 {
    public static final int $stable = 8;
    private final okhttp3.y client;
    private final com.google.gson.f gson = new com.google.gson.f();

    public l1(okhttp3.y yVar) {
        this.client = yVar;
    }

    public final Object c(String str, String str2, kotlin.coroutines.jvm.internal.i iVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new j1(str2, str, this, null), iVar);
    }

    public final Object d(String str, String str2, kotlin.coroutines.jvm.internal.i iVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new k1(str2, str, this, null), iVar);
    }
}
