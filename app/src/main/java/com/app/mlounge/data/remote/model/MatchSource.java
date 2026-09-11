package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import androidx.privacysandbox.ads.adservices.java.internal.a;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class MatchSource {
    public static final int $stable = 0;
    private final String id;
    private final String source;
    private final String url;

    public final String a() {
        return this.id;
    }

    public final String b() {
        return this.source;
    }

    public final String c() {
        return this.url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchSource)) {
            return false;
        }
        MatchSource matchSource = (MatchSource) obj;
        return l.a(this.source, matchSource.source) && l.a(this.id, matchSource.id) && l.a(this.url, matchSource.url);
    }

    public final int hashCode() {
        String str = this.source;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.id;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.source;
        String str2 = this.id;
        return a.u(c.o("MatchSource(source=", str, ", id=", str2, ", url="), this.url, ")");
    }
}
