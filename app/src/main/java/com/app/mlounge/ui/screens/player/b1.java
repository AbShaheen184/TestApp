package com.app.mlounge.ui.screens.player;

import com.app.mlounge.emulator.LibretroCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final int h;
    public final String i;

    public b1(String str, String str2, String str3, boolean z, int i, int i2, String str4, int i3) {
        boolean z2 = (i3 & 8) == 0;
        boolean z3 = (i3 & 16) == 0;
        z = (i3 & 32) != 0 ? false : z;
        i = (i3 & 64) != 0 ? -1 : i;
        i2 = (i3 & 128) != 0 ? -1 : i2;
        str4 = (i3 & LibretroCore.SCREEN_WIDTH) != 0 ? null : str4;
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z2;
        this.e = z3;
        this.f = z;
        this.g = i;
        this.h = i2;
        this.i = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return this.a.equals(b1Var.a) && this.b.equals(b1Var.b) && this.c.equals(b1Var.c) && this.d == b1Var.d && this.e == b1Var.e && this.f == b1Var.f && this.g == b1Var.g && this.h == b1Var.h && kotlin.jvm.internal.l.a(this.i, b1Var.i);
    }

    public final int hashCode() {
        int iB = androidx.privacysandbox.ads.adservices.java.internal.a.b(this.h, androidx.privacysandbox.ads.adservices.java.internal.a.b(this.g, androidx.privacysandbox.ads.adservices.java.internal.a.f(androidx.privacysandbox.ads.adservices.java.internal.a.f(androidx.privacysandbox.ads.adservices.java.internal.a.f(androidx.privacysandbox.ads.adservices.java.internal.a.e(androidx.privacysandbox.ads.adservices.java.internal.a.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31);
        String str = this.i;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbO = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.o("SubtitleItem(label=", this.a, ", url=", this.b, ", lang=");
        sbO.append(this.c);
        sbO.append(", isLocal=");
        sbO.append(this.d);
        sbO.append(", isInternal=");
        sbO.append(this.e);
        sbO.append(", isDefault=");
        sbO.append(this.f);
        sbO.append(", trackGroupIndex=");
        sbO.append(this.g);
        sbO.append(", trackIndex=");
        sbO.append(this.h);
        sbO.append(", release=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.u(sbO, this.i, ")");
    }
}
