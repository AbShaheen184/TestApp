package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import com.google.gson.annotations.b;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class NtvChannel {
    public static final int $stable = 0;

    @b("channel_code")
    private final String channelCode;

    @b("channel_id")
    private final String channelId;

    @b("channel_image")
    private final String channelImage;

    @b("channel_name")
    private final String channelName;

    @b("channel_url")
    private final String channelUrl;

    @b("has_icon")
    private final Boolean hasIcon;
    private final String server;
    private final Integer viewers;

    public final String a() {
        return this.channelCode;
    }

    public final String b() {
        return this.channelId;
    }

    public final String c() {
        return this.channelImage;
    }

    public final String d() {
        return this.channelName;
    }

    public final String e() {
        return this.channelUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NtvChannel)) {
            return false;
        }
        NtvChannel ntvChannel = (NtvChannel) obj;
        return l.a(this.channelId, ntvChannel.channelId) && l.a(this.channelName, ntvChannel.channelName) && l.a(this.channelCode, ntvChannel.channelCode) && l.a(this.channelUrl, ntvChannel.channelUrl) && l.a(this.channelImage, ntvChannel.channelImage) && l.a(this.viewers, ntvChannel.viewers) && l.a(this.server, ntvChannel.server) && l.a(this.hasIcon, ntvChannel.hasIcon);
    }

    public final String f() {
        return this.server;
    }

    public final int hashCode() {
        String str = this.channelId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.channelName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.channelCode;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.channelUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.channelImage;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.viewers;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.server;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.hasIcon;
        return iHashCode7 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        String str = this.channelId;
        String str2 = this.channelName;
        String str3 = this.channelCode;
        String str4 = this.channelUrl;
        String str5 = this.channelImage;
        Integer num = this.viewers;
        String str6 = this.server;
        Boolean bool = this.hasIcon;
        StringBuilder sbO = c.o("NtvChannel(channelId=", str, ", channelName=", str2, ", channelCode=");
        c.y(sbO, str3, ", channelUrl=", str4, ", channelImage=");
        sbO.append(str5);
        sbO.append(", viewers=");
        sbO.append(num);
        sbO.append(", server=");
        sbO.append(str6);
        sbO.append(", hasIcon=");
        sbO.append(bool);
        sbO.append(")");
        return sbO.toString();
    }
}
