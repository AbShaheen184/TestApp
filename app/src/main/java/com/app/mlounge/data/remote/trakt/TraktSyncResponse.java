package com.app.mlounge.data.remote.trakt;

import com.google.gson.annotations.b;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TraktSyncResponse {
    public static final int $stable = 8;
    private final TraktSyncCount added = null;
    private final TraktSyncCount deleted = null;

    @b("not_found")
    private final TraktSyncNotFound notFound = null;

    public final TraktSyncCount a() {
        return this.added;
    }

    public final TraktSyncCount b() {
        return this.deleted;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraktSyncResponse)) {
            return false;
        }
        TraktSyncResponse traktSyncResponse = (TraktSyncResponse) obj;
        return l.a(this.added, traktSyncResponse.added) && l.a(this.deleted, traktSyncResponse.deleted) && l.a(this.notFound, traktSyncResponse.notFound);
    }

    public final int hashCode() {
        TraktSyncCount traktSyncCount = this.added;
        int iHashCode = (traktSyncCount == null ? 0 : traktSyncCount.hashCode()) * 31;
        TraktSyncCount traktSyncCount2 = this.deleted;
        int iHashCode2 = (iHashCode + (traktSyncCount2 == null ? 0 : traktSyncCount2.hashCode())) * 31;
        TraktSyncNotFound traktSyncNotFound = this.notFound;
        return iHashCode2 + (traktSyncNotFound != null ? traktSyncNotFound.hashCode() : 0);
    }

    public final String toString() {
        return "TraktSyncResponse(added=" + this.added + ", deleted=" + this.deleted + ", notFound=" + this.notFound + ")";
    }
}
