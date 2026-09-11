package com.app.mlounge.data.remote.model;

import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class MusicPageResponse<T> {
    public static final int $stable = 8;
    private final List<T> items;
    private final Object nextPageToken;

    public MusicPageResponse() {
        this.items = u.e;
        this.nextPageToken = null;
    }

    public final List a() {
        return this.items;
    }

    public final Object b() {
        return this.nextPageToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicPageResponse)) {
            return false;
        }
        MusicPageResponse musicPageResponse = (MusicPageResponse) obj;
        return l.a(this.items, musicPageResponse.items) && l.a(this.nextPageToken, musicPageResponse.nextPageToken);
    }

    public final int hashCode() {
        int iHashCode = this.items.hashCode() * 31;
        Object obj = this.nextPageToken;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "MusicPageResponse(items=" + this.items + ", nextPageToken=" + this.nextPageToken + ")";
    }

    public MusicPageResponse(List list, Object obj) {
        this.items = list;
        this.nextPageToken = obj;
    }
}
