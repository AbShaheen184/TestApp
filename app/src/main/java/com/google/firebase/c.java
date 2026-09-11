package com.google.firebase;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.caverock.androidsvg.y1;
import com.google.firebase.components.j;
import com.google.firebase.components.r;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements com.google.firebase.inject.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c(Context context, String str) {
        this.a = 2;
        this.c = context;
        this.b = str;
    }

    @Override // com.google.firebase.inject.b
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.a) {
            case 0:
                g gVar = (g) this.b;
                Context context = (Context) this.c;
                String strD = gVar.d();
                com.google.firebase.internal.a aVar = new com.google.firebase.internal.a();
                Context contextCreateDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
                SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:".concat(strD), 0);
                boolean z = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = contextCreateDeviceProtectedStorageContext.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextCreateDeviceProtectedStorageContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                        break;
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                aVar.a = z;
                return aVar;
            case 1:
                com.google.firebase.components.g gVar2 = (com.google.firebase.components.g) this.b;
                com.google.firebase.components.b bVar = (com.google.firebase.components.b) this.c;
                com.google.firebase.components.e eVar = bVar.f;
                y1 y1Var = new y1();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                Set<j> set = bVar.c;
                Set set2 = bVar.g;
                for (j jVar : set) {
                    int i = jVar.c;
                    int i2 = jVar.b;
                    boolean z2 = i == 0;
                    r rVar = jVar.a;
                    if (z2) {
                        if (i2 == 2) {
                            hashSet4.add(rVar);
                        } else {
                            hashSet.add(rVar);
                        }
                    } else if (i == 2) {
                        hashSet3.add(rVar);
                    } else if (i2 == 2) {
                        hashSet5.add(rVar);
                    } else {
                        hashSet2.add(rVar);
                    }
                }
                if (!set2.isEmpty()) {
                    hashSet.add(r.a(com.google.firebase.events.b.class));
                }
                y1Var.a = Collections.unmodifiableSet(hashSet);
                y1Var.b = Collections.unmodifiableSet(hashSet2);
                y1Var.c = Collections.unmodifiableSet(hashSet3);
                y1Var.d = Collections.unmodifiableSet(hashSet4);
                y1Var.e = Collections.unmodifiableSet(hashSet5);
                y1Var.f = gVar2;
                return eVar.b(y1Var);
            default:
                return new com.google.firebase.heartbeatinfo.h((Context) this.c, (String) this.b);
        }
    }

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
