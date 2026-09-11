package com.app.mlounge.ui.navigation;

import com.google.firebase.crashlytics.internal.model.t1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends w {
    public static final t g = new t("tvshow_detail/{tvId}", "TV Show", t1.t(), null, 40);

    public final String a(int i) {
        return androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "tvshow_detail/");
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof t);
    }

    public final int hashCode() {
        return -731578799;
    }

    public final String toString() {
        return "TvShowDetail";
    }
}
