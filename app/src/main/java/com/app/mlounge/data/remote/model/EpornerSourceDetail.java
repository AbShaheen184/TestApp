package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class EpornerSourceDetail {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private final Boolean f0default;
    private final String labelShort;
    private final String src;
    private final String type;

    public EpornerSourceDetail(String str, String str2, String str3, Boolean bool) {
        this.labelShort = str;
        this.src = str2;
        this.type = str3;
        this.f0default = bool;
    }

    public static EpornerSourceDetail a(EpornerSourceDetail epornerSourceDetail) {
        return new EpornerSourceDetail(epornerSourceDetail.labelShort, epornerSourceDetail.src, epornerSourceDetail.type, Boolean.TRUE);
    }

    public final String b() {
        return this.labelShort;
    }

    public final String c() {
        return this.src;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EpornerSourceDetail)) {
            return false;
        }
        EpornerSourceDetail epornerSourceDetail = (EpornerSourceDetail) obj;
        return l.a(this.labelShort, epornerSourceDetail.labelShort) && l.a(this.src, epornerSourceDetail.src) && l.a(this.type, epornerSourceDetail.type) && l.a(this.f0default, epornerSourceDetail.f0default);
    }

    public final int hashCode() {
        String str = this.labelShort;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.src;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f0default;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        String str = this.labelShort;
        String str2 = this.src;
        String str3 = this.type;
        Boolean bool = this.f0default;
        StringBuilder sbO = c.o("EpornerSourceDetail(labelShort=", str, ", src=", str2, ", type=");
        sbO.append(str3);
        sbO.append(", default=");
        sbO.append(bool);
        sbO.append(")");
        return sbO.toString();
    }
}
