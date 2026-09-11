package com.google.firebase.sessions;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {
    public static final r0 a = new r0();
    public static final com.google.android.material.internal.b b;

    static {
        com.google.firebase.encoders.json.d dVar = new com.google.firebase.encoders.json.d();
        dVar.a(q0.class, g.a);
        dVar.a(x0.class, h.a);
        dVar.a(k.class, e.a);
        dVar.a(b.class, d.a);
        dVar.a(a.class, c.a);
        dVar.a(g0.class, f.a);
        dVar.d = true;
        b = new com.google.android.material.internal.b(dVar);
    }

    public static b a(com.google.firebase.g gVar) throws PackageManager.NameNotFoundException {
        gVar.a();
        Context context = gVar.a;
        context.getClass();
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        gVar.a();
        String str = gVar.c.b;
        str.getClass();
        Build.MODEL.getClass();
        Build.VERSION.RELEASE.getClass();
        packageName.getClass();
        String str2 = packageInfo.versionName;
        if (str2 == null) {
            str2 = strValueOf;
        }
        Build.MANUFACTURER.getClass();
        gVar.a();
        g0 g0VarB = h0.b(context);
        gVar.a();
        return new b(str, new a(packageName, str2, strValueOf, g0VarB, h0.a(context)));
    }
}
