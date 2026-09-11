package com.app.mlounge.data.remote.model;

import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class NtvChannelsResponse {
    public static final int $stable = 8;
    private final List<NtvChannel> channels;
    private final Boolean success;

    public final List a() {
        return this.channels;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NtvChannelsResponse)) {
            return false;
        }
        NtvChannelsResponse ntvChannelsResponse = (NtvChannelsResponse) obj;
        return l.a(this.success, ntvChannelsResponse.success) && l.a(this.channels, ntvChannelsResponse.channels);
    }

    public final int hashCode() {
        Boolean bool = this.success;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<NtvChannel> list = this.channels;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "NtvChannelsResponse(success=" + this.success + ", channels=" + this.channels + ")";
    }
}
