package com.app.mlounge.data.remote.trakt;

import androidx.privacysandbox.ads.adservices.java.internal.a;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TraktUserIds {
    public static final int $stable = 0;
    private final String slug;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraktUserIds) && l.a(this.slug, ((TraktUserIds) obj).slug);
    }

    public final int hashCode() {
        String str = this.slug;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.q("TraktUserIds(slug=", this.slug, ")");
    }
}
