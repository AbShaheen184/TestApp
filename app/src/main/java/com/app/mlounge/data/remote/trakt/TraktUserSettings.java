package com.app.mlounge.data.remote.trakt;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TraktUserSettings {
    public static final int $stable = 0;
    private final TraktAccount account;
    private final TraktUser user;

    public final TraktUser a() {
        return this.user;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraktUserSettings)) {
            return false;
        }
        TraktUserSettings traktUserSettings = (TraktUserSettings) obj;
        return l.a(this.user, traktUserSettings.user) && l.a(this.account, traktUserSettings.account);
    }

    public final int hashCode() {
        TraktUser traktUser = this.user;
        int iHashCode = (traktUser == null ? 0 : traktUser.hashCode()) * 31;
        TraktAccount traktAccount = this.account;
        return iHashCode + (traktAccount != null ? traktAccount.hashCode() : 0);
    }

    public final String toString() {
        return "TraktUserSettings(user=" + this.user + ", account=" + this.account + ")";
    }
}
