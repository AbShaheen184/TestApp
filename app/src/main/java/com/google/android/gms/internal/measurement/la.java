package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class la {
    public static final androidx.collection.f a = new androidx.collection.f(0);

    public static synchronized Uri a() {
        androidx.collection.f fVar = a;
        Uri uri = (Uri) fVar.get("com.google.android.gms.measurement");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        fVar.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }

    public static String b(Context context, String str) {
        if (str.contains("#")) {
            net.luminis.tls.engine.impl.c.o("The passed in package cannot already have a subpackage: ".concat(str));
            return null;
        }
        String packageName = context.getPackageName();
        return androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.k(new StringBuilder(str.length() + 1 + String.valueOf(packageName).length()), str, "#", packageName);
    }
}
