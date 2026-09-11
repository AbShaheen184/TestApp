package com.app.mlounge.ui.navigation;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends w {
    public static final m g = new m("music_album_detail/{albumUrl}", "Album", _COROUTINE.b.s(), null, 40);

    public final String a(String str) {
        str.getClass();
        return androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("music_album_detail/", Uri.encode(str));
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof m);
    }

    public final int hashCode() {
        return -184136644;
    }

    public final String toString() {
        return "MusicAlbumDetail";
    }
}
