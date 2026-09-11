package com.app.mlounge.data.remote.trakt;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import com.google.gson.annotations.b;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TraktAccount {
    public static final int $stable = 0;

    @b("cover_image")
    private final String coverImage;

    @b("timezone")
    private final String timezone;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraktAccount)) {
            return false;
        }
        TraktAccount traktAccount = (TraktAccount) obj;
        return l.a(this.timezone, traktAccount.timezone) && l.a(this.coverImage, traktAccount.coverImage);
    }

    public final int hashCode() {
        String str = this.timezone;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.coverImage;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return c.j("TraktAccount(timezone=", this.timezone, ", coverImage=", this.coverImage, ")");
    }
}
