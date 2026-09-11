package com.google.firebase;

import android.content.Context;
import android.os.Build;
import androidx.transition.k;
import com.google.android.material.textfield.p;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.j;
import com.google.firebase.components.r;
import com.google.firebase.components.s;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        com.google.firebase.components.a aVarB = com.google.firebase.components.b.b(com.google.firebase.platforminfo.b.class);
        aVarB.a(new j(2, 0, com.google.firebase.platforminfo.a.class));
        aVarB.f = new s(25);
        arrayList.add(aVarB.b());
        r rVar = new r(com.google.firebase.annotations.concurrent.a.class, Executor.class);
        com.google.firebase.components.a aVar = new com.google.firebase.components.a(com.google.firebase.heartbeatinfo.d.class, new Class[]{com.google.firebase.heartbeatinfo.f.class, com.google.firebase.heartbeatinfo.g.class});
        aVar.a(j.b(Context.class));
        aVar.a(j.b(g.class));
        aVar.a(new j(2, 0, com.google.firebase.heartbeatinfo.e.class));
        aVar.a(new j(1, 1, com.google.firebase.platforminfo.b.class));
        aVar.a(new j(rVar, 1, 0));
        aVar.f = new com.google.firebase.heartbeatinfo.b(rVar, 0);
        arrayList.add(aVar.b());
        arrayList.add(p.i("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(p.i("fire-core", "22.0.1"));
        arrayList.add(p.i("device-name", a(Build.PRODUCT)));
        arrayList.add(p.i("device-model", a(Build.DEVICE)));
        arrayList.add(p.i("device-brand", a(Build.BRAND)));
        arrayList.add(p.m("android-target-sdk", new k(25)));
        arrayList.add(p.m("android-min-sdk", new k(26)));
        arrayList.add(p.m("android-platform", new k(27)));
        arrayList.add(p.m("android-installer", new k(28)));
        try {
            kotlin.g.y.getClass();
            str = "2.3.20";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(p.i("kotlin", str));
        }
        return arrayList;
    }
}
