package com.appsalt.internal;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        String str = Build.VERSION.RELEASE;
        return kotlin.jvm.internal.l.a(str, str);
    }

    public final int hashCode() {
        return Build.VERSION.RELEASE.hashCode() - 933324943;
    }

    public final String toString() {
        return androidx.privacysandbox.ads.adservices.java.internal.a.t(new StringBuilder("Os(name=android, version="), Build.VERSION.RELEASE, ')');
    }
}
