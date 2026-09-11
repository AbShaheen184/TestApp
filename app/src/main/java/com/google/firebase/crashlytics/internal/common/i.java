package com.google.firebase.crashlytics.internal.common;

import android.util.Log;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static final h d = new h(0);
    public static final androidx.compose.foundation.lazy.layout.a e = new androidx.compose.foundation.lazy.layout.a(24);
    public final com.google.firebase.crashlytics.internal.persistence.c a;
    public String b = null;
    public String c = null;

    public i(com.google.firebase.crashlytics.internal.persistence.c cVar) {
        this.a = cVar;
    }

    public static void a(com.google.firebase.crashlytics.internal.persistence.c cVar, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            cVar.f(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e2);
        }
    }
}
