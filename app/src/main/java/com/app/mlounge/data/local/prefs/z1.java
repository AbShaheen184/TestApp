package com.app.mlounge.data.local.prefs;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z1 {
    public static final /* synthetic */ kotlin.reflect.j[] a = {new kotlin.jvm.internal.s(z1.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1)};
    public static final androidx.datastore.preferences.a b = _COROUTINE.b.C("cinemahq_prefs", new androidx.compose.ui.draw.i(new androidx.room.z(15)), null, 12);

    public static final androidx.datastore.core.e a(Context context) {
        context.getClass();
        return b.a(context, a[0]);
    }
}
