package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final Bundle e;

    public y0(long j, long j2, Bundle bundle, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.e = bundle;
        this.c = j;
        this.d = j2;
    }

    public static y0 a(u uVar) {
        String str = uVar.e;
        String str2 = uVar.z;
        return new y0(uVar.A, uVar.B, uVar.y.h(), str, str2);
    }

    public final u b() {
        t tVar = new t(new Bundle(this.e));
        return new u(this.a, tVar, this.b, this.c, this.d);
    }

    public final String toString() {
        String string = this.e.toString();
        String str = this.b;
        int length = String.valueOf(str).length();
        String str2 = this.a;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + string.length());
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.y(sb, "origin=", str, ",name=", str2);
        return androidx.privacysandbox.ads.adservices.java.internal.a.u(sb, ",params=", string);
    }
}
