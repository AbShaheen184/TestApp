package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i4 extends c4 {
    public static final boolean y(String str) {
        String str2 = (String) h0.t.a(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        if (java.lang.Math.abs(r7.hashCode() % 100) < r9.J().u()) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.h4 w(java.lang.String r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.i4.w(java.lang.String):com.google.android.gms.measurement.internal.h4");
    }

    public final String x(String str) {
        l1 l1Var = this.y.e;
        l4.U(l1Var);
        String strI = l1Var.I(str);
        if (TextUtils.isEmpty(strI)) {
            return (String) h0.r.a(null);
        }
        Uri uri = Uri.parse((String) h0.r.a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        String authority = uri.getAuthority();
        StringBuilder sb = new StringBuilder(String.valueOf(strI).length() + 1 + String.valueOf(authority).length());
        sb.append(strI);
        sb.append(".");
        sb.append(authority);
        builderBuildUpon.authority(sb.toString());
        return builderBuildUpon.build().toString();
    }
}
