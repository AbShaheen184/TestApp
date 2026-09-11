package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z3 {
    public static final com.google.common.collect.a1 a = com.google.common.collect.h0.u("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");

    public static String a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static final boolean b(com.google.android.gms.internal.measurement.h0 h0Var, com.google.common.collect.f1 f1Var, com.google.common.collect.f1 f1Var2, com.google.common.collect.n1 n1Var, char[] cArr, int i, int i2, int i3, String str, String str2, String str3, boolean z, boolean z2) {
        y3 y3Var;
        char c;
        int iC = c(h0Var);
        if (iC > 0 && (i2 != 1 || i != 1)) {
            cArr[iC] = '2';
        }
        if (g(h0Var, f1Var2) == com.google.android.gms.internal.measurement.i0.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c = '3';
        } else {
            if (h0Var == com.google.android.gms.internal.measurement.h0.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE && i3 == 1 && n1Var.A.equals(str)) {
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = '1';
                }
                return true;
            }
            if (f1Var.containsKey(h0Var) && (y3Var = (y3) f1Var.get(h0Var)) != null) {
                int iOrdinal = y3Var.ordinal();
                com.google.android.gms.internal.measurement.i0 i0Var = com.google.android.gms.internal.measurement.i0.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                if (iOrdinal != 0) {
                    com.google.android.gms.internal.measurement.i0 i0Var2 = com.google.android.gms.internal.measurement.i0.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return g(h0Var, f1Var2) == i0Var ? f(h0Var, cArr, str3, z2) : e(h0Var, cArr, str2, z);
                        }
                        if (iOrdinal == 3) {
                            return g(h0Var, f1Var2) == i0Var2 ? e(h0Var, cArr, str2, z) : f(h0Var, cArr, str3, z2);
                        }
                        c = '0';
                    } else if (g(h0Var, f1Var2) != i0Var2) {
                        return f(h0Var, cArr, str3, z2);
                    }
                } else if (g(h0Var, f1Var2) != i0Var) {
                    return e(h0Var, cArr, str2, z);
                }
                c = '8';
            } else {
                c = '0';
            }
        }
        if (iC <= 0 || cArr[iC] == '2') {
            return false;
        }
        cArr[iC] = c;
        return false;
    }

    public static final int c(com.google.android.gms.internal.measurement.h0 h0Var) {
        if (h0Var == com.google.android.gms.internal.measurement.h0.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (h0Var == com.google.android.gms.internal.measurement.h0.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (h0Var == com.google.android.gms.internal.measurement.h0.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return h0Var == com.google.android.gms.internal.measurement.h0.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    public static final String d(com.google.android.gms.internal.measurement.h0 h0Var, String str, String str2) {
        String strValueOf = "0";
        String strValueOf2 = (TextUtils.isEmpty(str) || str.length() < h0Var.a()) ? "0" : String.valueOf(str.charAt(h0Var.a() - 1));
        if (!TextUtils.isEmpty(str2) && str2.length() >= h0Var.a()) {
            strValueOf = String.valueOf(str2.charAt(h0Var.a() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    public static final boolean e(com.google.android.gms.internal.measurement.h0 h0Var, char[] cArr, String str, boolean z) {
        char c;
        int iC = c(h0Var);
        if (!z) {
            c = '4';
        } else {
            if (str.length() >= h0Var.a()) {
                char cCharAt = str.charAt(h0Var.a() - 1);
                boolean z2 = cCharAt == '1';
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = cCharAt != '1' ? '6' : '1';
                }
                return z2;
            }
            c = '0';
        }
        if (iC > 0 && cArr[iC] != '2') {
            cArr[iC] = c;
        }
        return false;
    }

    public static final boolean f(com.google.android.gms.internal.measurement.h0 h0Var, char[] cArr, String str, boolean z) {
        char c;
        int iC = c(h0Var);
        if (!z) {
            c = '5';
        } else {
            if (str.length() >= h0Var.a()) {
                char cCharAt = str.charAt(h0Var.a() - 1);
                boolean z2 = cCharAt == '1';
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = cCharAt != '1' ? '7' : '1';
                }
                return z2;
            }
            c = '0';
        }
        if (iC > 0 && cArr[iC] != '2') {
            cArr[iC] = c;
        }
        return false;
    }

    public static final com.google.android.gms.internal.measurement.i0 g(com.google.android.gms.internal.measurement.h0 h0Var, com.google.common.collect.f1 f1Var) {
        Object obj = f1Var.get(h0Var);
        if (obj == null) {
            obj = com.google.android.gms.internal.measurement.i0.PURPOSE_RESTRICTION_UNDEFINED;
        }
        return (com.google.android.gms.internal.measurement.i0) obj;
    }
}
