package com.google.firebase.sessions;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final String a;
    public final a b;

    public b(String str, a aVar) {
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!kotlin.jvm.internal.l.a(this.a, bVar.a)) {
            return false;
        }
        String str = Build.MODEL;
        if (!kotlin.jvm.internal.l.a(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        return kotlin.jvm.internal.l.a(str2, str2) && this.b.equals(bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((a0.LOG_ENVIRONMENT_PROD.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.e((((Build.MODEL.hashCode() + (this.a.hashCode() * 31)) * 31) + 48517564) * 31, 31, Build.VERSION.RELEASE)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=3.0.5, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + a0.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.b + ')';
    }
}
