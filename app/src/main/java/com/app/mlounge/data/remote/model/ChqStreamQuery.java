package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class ChqStreamQuery {
    public static final int $stable = 0;
    private final String tmdbId;
    private final String type;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChqStreamQuery)) {
            return false;
        }
        ChqStreamQuery chqStreamQuery = (ChqStreamQuery) obj;
        return l.a(this.type, chqStreamQuery.type) && l.a(this.tmdbId, chqStreamQuery.tmdbId);
    }

    public final int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tmdbId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return c.j("ChqStreamQuery(type=", this.type, ", tmdbId=", this.tmdbId, ")");
    }
}
