package com.app.mlounge.data.remote.trakt;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TraktSyncMovie {
    public static final int $stable = 0;
    private final TraktIds ids;

    public TraktSyncMovie(TraktIds traktIds) {
        this.ids = traktIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraktSyncMovie) && l.a(this.ids, ((TraktSyncMovie) obj).ids);
    }

    public final int hashCode() {
        return this.ids.hashCode();
    }

    public final String toString() {
        return "TraktSyncMovie(ids=" + this.ids + ")";
    }
}
