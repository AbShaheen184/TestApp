package com.google.firebase.datastorage;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import androidx.compose.foundation.text.input.internal.k;
import androidx.compose.ui.draw.i;
import androidx.datastore.core.e;
import androidx.datastore.migrations.d;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.c;
import kotlin.jvm.internal.t;
import kotlin.reflect.j;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final /* synthetic */ j[] d;
    public final String a;
    public final ThreadLocal b;
    public final e c;

    static {
        t tVar = new t(c.NO_RECEIVER, b.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0);
        a0.a.getClass();
        d = new j[]{tVar};
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.firebase.datastorage.a] */
    public b(Context context, String str) {
        context.getClass();
        this.a = str;
        this.b = new ThreadLocal();
        final int i = 0;
        i iVar = new i(new l(this) { // from class: com.google.firebase.datastorage.a
            public final /* synthetic */ b y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.l
            public final Object invoke(Object obj) {
                switch (i) {
                    case 0:
                        androidx.datastore.core.b bVar = (androidx.datastore.core.b) obj;
                        bVar.getClass();
                        Log.w(a0.a(b.class).c(), "CorruptionException in " + this.y.a + " DataStore running in process " + Process.myPid(), bVar);
                        return new androidx.datastore.preferences.core.a(true);
                    default:
                        Context context2 = (Context) obj;
                        context2.getClass();
                        String str2 = this.y.a;
                        LinkedHashSet linkedHashSet = androidx.datastore.preferences.j.a;
                        linkedHashSet.getClass();
                        return com.google.common.base.c.p(new androidx.datastore.migrations.c(context2, str2, d.a, new k(linkedHashSet, null, 2), new androidx.datastore.preferences.i(3, 0, null)));
                }
            }
        });
        final int i2 = 1;
        this.c = _COROUTINE.b.C(str, iVar, new l(this) { // from class: com.google.firebase.datastorage.a
            public final /* synthetic */ b y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.l
            public final Object invoke(Object obj) {
                switch (i2) {
                    case 0:
                        androidx.datastore.core.b bVar = (androidx.datastore.core.b) obj;
                        bVar.getClass();
                        Log.w(a0.a(b.class).c(), "CorruptionException in " + this.y.a + " DataStore running in process " + Process.myPid(), bVar);
                        return new androidx.datastore.preferences.core.a(true);
                    default:
                        Context context2 = (Context) obj;
                        context2.getClass();
                        String str2 = this.y.a;
                        LinkedHashSet linkedHashSet = androidx.datastore.preferences.j.a;
                        linkedHashSet.getClass();
                        return com.google.common.base.c.p(new androidx.datastore.migrations.c(context2, str2, d.a, new k(linkedHashSet, null, 2), new androidx.datastore.preferences.i(3, 0, null)));
                }
            }
        }, 8).a(context, d[0]);
    }

    public final void a(l lVar) {
    }
}
