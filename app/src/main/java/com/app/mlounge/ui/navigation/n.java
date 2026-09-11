package com.app.mlounge.ui.navigation;

import android.net.Uri;
import com.google.firebase.crashlytics.internal.model.t1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends w {
    public static final n g = new n("music_artist_detail/{artistUrl}", "Artist", t1.q(), null, 40);

    public final String a(String str) {
        str.getClass();
        return androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("music_artist_detail/", Uri.encode(str));
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof n);
    }

    public final int hashCode() {
        return -2073326244;
    }

    public final String toString() {
        return "MusicArtistDetail";
    }
}
