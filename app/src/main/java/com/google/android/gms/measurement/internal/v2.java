package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.DebugKt;
import org.mozilla.javascript.ES6Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v2 extends j0 {
    public coil3.memory.c A;
    public final CopyOnWriteArraySet B;
    public boolean C;
    public final AtomicReference D;
    public final Object E;
    public boolean F;
    public int G;
    public k2 H;
    public k2 I;
    public PriorityQueue J;
    public f2 K;
    public final AtomicLong L;
    public long M;
    public final r1 N;
    public boolean O;
    public k2 P;
    public u2 Q;
    public k2 R;
    public final androidx.media3.exoplayer.hls.c S;
    public r2 z;

    public v2(s1 s1Var) {
        super(s1Var);
        this.B = new CopyOnWriteArraySet();
        this.E = new Object();
        this.F = false;
        this.G = 1;
        this.O = true;
        this.S = new androidx.media3.exoplayer.hls.c(this);
        this.D = new AtomicReference();
        this.K = f2.c;
        this.M = -1L;
        this.L = new AtomicLong(0L);
        this.N = new r1(s1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r6 > 500) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a3, code lost:
    
        if (r7 > 500) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(java.lang.String r20, java.lang.String r21, android.os.Bundle r22, boolean r23, boolean r24, long r25, long r27) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.v2.A(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long, long):void");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0268  */
    /* JADX WARN: Code duplicated, block: B:102:0x026d  */
    /* JADX WARN: Code duplicated, block: B:105:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:107:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:110:0x0318  */
    /* JADX WARN: Code duplicated, block: B:112:0x0333  */
    /* JADX WARN: Code duplicated, block: B:115:0x0352  */
    /* JADX WARN: Code duplicated, block: B:117:0x0364  */
    /* JADX WARN: Code duplicated, block: B:120:0x036f  */
    /* JADX WARN: Code duplicated, block: B:121:0x0372  */
    /* JADX WARN: Code duplicated, block: B:125:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:126:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:128:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:137:0x0414  */
    /* JADX WARN: Code duplicated, block: B:139:0x0434  */
    /* JADX WARN: Code duplicated, block: B:140:0x0447  */
    /* JADX WARN: Code duplicated, block: B:146:0x0460  */
    /* JADX WARN: Code duplicated, block: B:158:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:162:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:166:0x04da A[Catch: NumberFormatException -> 0x04df, TRY_LEAVE, TryCatch #3 {NumberFormatException -> 0x04df, blocks: (B:164:0x04ce, B:166:0x04da), top: B:200:0x04ce }] */
    /* JADX WARN: Code duplicated, block: B:168:0x04df  */
    /* JADX WARN: Code duplicated, block: B:174:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:180:0x0513  */
    /* JADX WARN: Code duplicated, block: B:183:0x0522  */
    /* JADX WARN: Code duplicated, block: B:185:0x0527  */
    /* JADX WARN: Code duplicated, block: B:188:0x0535  */
    /* JADX WARN: Code duplicated, block: B:191:0x054f  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:69:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:77:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:81:0x0201  */
    /* JADX WARN: Code duplicated, block: B:82:0x0204  */
    /* JADX WARN: Code duplicated, block: B:85:0x021b  */
    /* JADX WARN: Code duplicated, block: B:86:0x021e  */
    /* JADX WARN: Code duplicated, block: B:89:0x022c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0231  */
    /* JADX WARN: Code duplicated, block: B:93:0x0240  */
    /* JADX WARN: Code duplicated, block: B:94:0x0245  */
    /* JADX WARN: Code duplicated, block: B:97:0x0254  */
    /* JADX WARN: Code duplicated, block: B:98:0x0259  */
    /* JADX WARN: Instruction removed from duplicated block: B:126:0x03cc, please report this as an issue */
    public final void B() throws Throwable {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        androidx.appcompat.widget.x xVarA;
        com.google.common.collect.p1 p1VarI;
        com.google.android.gms.internal.measurement.i0 i0Var;
        s1 s1Var;
        boolean z;
        x3 x3Var;
        com.google.android.gms.internal.measurement.i0 i0Var2;
        com.google.android.gms.internal.measurement.i0 i0Var3;
        com.google.android.gms.internal.measurement.i0 i0Var4;
        com.google.android.gms.internal.measurement.i0 i0Var5;
        Object obj;
        boolean z2;
        Object obj2;
        boolean z3;
        Object obj3;
        Object obj4;
        Object obj5;
        int iA;
        int iA2;
        int iA3;
        int iA4;
        int i6;
        String str;
        String str2;
        int i7;
        String str3;
        int i8;
        String str4;
        String str5;
        String str6;
        com.google.common.collect.f1 f1VarE;
        String string;
        HashMap map;
        int i9;
        int i10;
        x3 x3Var2;
        String[] strArrSplit;
        String string2;
        String strA;
        Bundle bundleB;
        v2 v2Var;
        HashMap map2;
        String str7;
        Bundle bundleB2;
        Bundle bundleB3;
        String str8;
        HashMap map3;
        String str9;
        StringBuilder sb;
        int i11;
        int iC;
        int i12;
        boolean zEquals;
        int i13;
        String str10;
        com.google.android.gms.internal.measurement.i0 i0Var6;
        v();
        s1 s1Var2 = (s1) this.e;
        x0 x0Var = s1Var2.C;
        x0 x0Var2 = s1Var2.C;
        s1.m(x0Var);
        x0Var.J.a("Handle tcf update.");
        g1 g1Var = s1Var2.B;
        s1.k(g1Var);
        SharedPreferences sharedPreferencesA = g1Var.A();
        com.google.common.collect.a1 a1Var = z3.a;
        com.google.android.gms.internal.measurement.h0 h0Var = com.google.android.gms.internal.measurement.h0.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
        y3 y3Var = y3.e;
        com.google.android.gms.internal.measurement.h0 h0Var2 = com.google.android.gms.internal.measurement.h0.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
        y3 y3Var2 = y3.y;
        com.google.android.gms.internal.measurement.h0 h0Var3 = com.google.android.gms.internal.measurement.h0.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
        com.google.android.gms.internal.measurement.h0 h0Var4 = com.google.android.gms.internal.measurement.h0.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
        com.google.android.gms.internal.measurement.h0 h0Var5 = com.google.android.gms.internal.measurement.h0.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
        com.google.common.collect.f1 f1VarC = com.google.common.collect.f1.c(7, new Object[]{h0Var, y3Var, h0Var2, y3Var2, h0Var3, y3Var, h0Var4, y3Var, h0Var5, y3Var2, com.google.android.gms.internal.measurement.h0.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, y3Var2, com.google.android.gms.internal.measurement.h0.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, y3Var2}, null);
        int i14 = com.google.common.collect.k0.z;
        com.google.common.collect.n1 n1Var = new com.google.common.collect.n1("CH");
        char[] cArr = new char[5];
        boolean zContains = sharedPreferencesA.contains("IABTCF_TCString");
        try {
            i = sharedPreferencesA.getInt("IABTCF_CmpSdkID", -1);
        } catch (ClassCastException unused) {
            i = -1;
        }
        try {
            i2 = sharedPreferencesA.getInt("IABTCF_PolicyVersion", -1);
        } catch (ClassCastException unused2) {
            i2 = -1;
        }
        try {
            i3 = sharedPreferencesA.getInt("IABTCF_gdprApplies", -1);
        } catch (ClassCastException unused3) {
            i3 = -1;
        }
        try {
            try {
                i4 = sharedPreferencesA.getInt("IABTCF_PurposeOneTreatment", -1);
                while (true) {
                    boolean zHasNext = p1VarI.hasNext();
                    i0Var = com.google.android.gms.internal.measurement.i0.PURPOSE_RESTRICTION_UNDEFINED;
                    if (!zHasNext) {
                        break;
                    }
                    com.google.android.gms.internal.measurement.h0 h0Var6 = (com.google.android.gms.internal.measurement.h0) p1VarI.next();
                    boolean z4 = zContains;
                    int iA5 = h0Var6.a();
                    int i15 = i;
                    com.google.common.collect.n1 n1Var2 = n1Var;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iA5).length() + 28);
                    sb2.append("IABTCF_PublisherRestrictions");
                    sb2.append(iA5);
                    String strA2 = z3.a(sharedPreferencesA, sb2.toString());
                    if (TextUtils.isEmpty(strA2) || strA2.length() < 755) {
                        i0Var6 = i0Var;
                    } else {
                        int iDigit = Character.digit(strA2.charAt(754), 10);
                        i0Var6 = com.google.android.gms.internal.measurement.i0.PURPOSE_RESTRICTION_NOT_ALLOWED;
                        if (iDigit >= 0 && iDigit <= com.google.android.gms.internal.measurement.i0.values().length && iDigit != 0) {
                            if (iDigit == 1) {
                                i0Var = com.google.android.gms.internal.measurement.i0.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                            } else if (iDigit == 2) {
                                i0Var = com.google.android.gms.internal.measurement.i0.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                            }
                            i0Var6 = i0Var;
                        }
                    }
                    xVarA.q(h0Var6, i0Var6);
                    zContains = z4;
                    i = i15;
                    n1Var = n1Var2;
                }
            } catch (ClassCastException unused4) {
                i4 = -1;
            }
            i5 = sharedPreferencesA.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
        } catch (ClassCastException unused5) {
            i5 = -1;
        }
        int i16 = i2;
        String strA3 = z3.a(sharedPreferencesA, "IABTCF_PublisherCC");
        xVarA = com.google.common.collect.f1.a();
        p1VarI = f1VarC.keySet().iterator();
        boolean z5 = zContains;
        int i17 = i;
        com.google.common.collect.n1 n1Var3 = n1Var;
        com.google.common.collect.f1 f1VarE2 = xVarA.e(true);
        String strA4 = z3.a(sharedPreferencesA, "IABTCF_PurposeConsents");
        String strA5 = z3.a(sharedPreferencesA, "IABTCF_VendorConsents");
        boolean z6 = !TextUtils.isEmpty(strA5) && strA5.length() >= 755 && strA5.charAt(754) == '1';
        String strA6 = z3.a(sharedPreferencesA, "IABTCF_PurposeLegitimateInterests");
        String strA7 = z3.a(sharedPreferencesA, "IABTCF_VendorLegitimateInterests");
        if (!TextUtils.isEmpty(strA7)) {
            s1Var = s1Var2;
            if (strA7.length() >= 755 && strA7.charAt(754) == '1') {
                z = true;
            }
            cArr[0] = '2';
            if (z5) {
                i0Var2 = (com.google.android.gms.internal.measurement.i0) f1VarE2.get(h0Var);
                i0Var3 = (com.google.android.gms.internal.measurement.i0) f1VarE2.get(h0Var3);
                i0Var4 = (com.google.android.gms.internal.measurement.i0) f1VarE2.get(h0Var4);
                i0Var5 = (com.google.android.gms.internal.measurement.i0) f1VarE2.get(h0Var5);
                androidx.appcompat.widget.x xVarA2 = com.google.common.collect.f1.a();
                xVarA2.q("Version", "2");
                if (true != z6) {
                    obj = "0";
                } else {
                    obj = "1";
                }
                z2 = z6;
                xVarA2.q("VendorConsent", obj);
                if (true != z) {
                    obj2 = "0";
                } else {
                    obj2 = "1";
                }
                z3 = z;
                xVarA2.q("VendorLegitimateInterest", obj2);
                if (i3 != 1) {
                    obj3 = "0";
                } else {
                    obj3 = "1";
                }
                xVarA2.q("gdprApplies", obj3);
                if (i5 != 1) {
                    obj4 = "0";
                } else {
                    obj4 = "1";
                }
                xVarA2.q("EnableAdvertiserConsentMode", obj4);
                xVarA2.q("PolicyVersion", String.valueOf(i16));
                xVarA2.q("CmpSdkID", String.valueOf(i17));
                if (i4 != 1) {
                    obj5 = "0";
                } else {
                    obj5 = "1";
                }
                xVarA2.q("PurposeOneTreatment", obj5);
                xVarA2.q("PublisherCC", strA3);
                if (i0Var2 != null) {
                    iA = i0Var2.a();
                } else {
                    iA = i0Var.a();
                }
                xVarA2.q("PublisherRestrictions1", String.valueOf(iA));
                if (i0Var3 != null) {
                    iA2 = i0Var3.a();
                } else {
                    iA2 = i0Var.a();
                }
                xVarA2.q("PublisherRestrictions3", String.valueOf(iA2));
                if (i0Var4 != null) {
                    iA3 = i0Var4.a();
                } else {
                    iA3 = i0Var.a();
                }
                xVarA2.q("PublisherRestrictions4", String.valueOf(iA3));
                if (i0Var5 != null) {
                    iA4 = i0Var5.a();
                } else {
                    iA4 = i0Var.a();
                }
                xVarA2.q("PublisherRestrictions7", String.valueOf(iA4));
                i6 = i3;
                xVarA2.r(com.google.common.collect.f1.c(4, new Object[]{"Purpose1", z3.d(h0Var, strA4, strA6), "Purpose3", z3.d(h0Var3, strA4, strA6), "Purpose4", z3.d(h0Var4, strA4, strA6), "Purpose7", z3.d(h0Var5, strA4, strA6)}, null).entrySet());
                str = "0";
                str2 = "1";
                i7 = i4;
                if (true != z3.b(h0Var, f1VarC, f1VarE2, n1Var3, cArr, i5, i6, i7, strA3, strA4, strA6, z2, z3)) {
                    str3 = str;
                } else {
                    str3 = str2;
                }
                i8 = i5;
                if (true != z3.b(h0Var3, f1VarC, f1VarE2, n1Var3, cArr, i8, i6, i7, strA3, strA4, strA6, z2, z3)) {
                    str4 = str;
                } else {
                    str4 = str2;
                }
                if (true != z3.b(h0Var4, f1VarC, f1VarE2, n1Var3, cArr, i8, i6, i7, strA3, strA4, strA6, z2, z3)) {
                    str5 = str;
                } else {
                    str5 = str2;
                }
                if (true != z3.b(h0Var5, f1VarC, f1VarE2, n1Var3, cArr, i8, i6, i7, strA3, strA4, strA6, z2, z3)) {
                    str6 = str;
                } else {
                    str6 = str2;
                }
                xVarA2.r(com.google.common.collect.f1.c(5, new Object[]{"AuthorizePurpose1", str3, "AuthorizePurpose3", str4, "AuthorizePurpose4", str5, "AuthorizePurpose7", str6, "PurposeDiagnostics", new String(cArr)}, null).entrySet());
                f1VarE = xVarA2.e(true);
            } else {
                f1VarE = com.google.common.collect.f1.D;
                str2 = "1";
                str = "0";
            }
            x3Var = new x3(f1VarE);
            s1.m(x0Var2);
            x0Var2.K.b(x3Var, "Tcf preferences read");
            g1Var.v();
            string = g1Var.z().getString("stored_tcf_param", "");
            map = new HashMap();
            if (TextUtils.isEmpty(string)) {
                x3Var2 = new x3(map);
                i10 = 2;
            } else {
                for (String str11 : string.split(";")) {
                    strArrSplit = str11.split("=");
                    if (strArrSplit.length < 2 && z3.a.contains(strArrSplit[0])) {
                        map.put(strArrSplit[0], strArrSplit[1]);
                    }
                }
                i10 = 2;
                x3Var2 = new x3(map);
            }
            g1Var.v();
            string2 = g1Var.z().getString("stored_tcf_param", "");
            strA = x3Var.a();
            if (strA.equals(string2)) {
            }
            SharedPreferences.Editor editorEdit = g1Var.z().edit();
            editorEdit.putString("stored_tcf_param", strA);
            editorEdit.apply();
            bundleB = x3Var.b();
            s1.m(x0Var2);
            x0Var2.K.b(bundleB, "Consent generated from Tcf");
            if (bundleB != Bundle.EMPTY) {
                s1Var.H.getClass();
                v2Var = this;
                v2Var.P(bundleB, -30, System.currentTimeMillis());
            } else {
                v2Var = this;
            }
            Bundle bundle = new Bundle();
            map2 = x3Var2.a;
            if (map2.isEmpty() && ((String) map2.get("Version")) == null) {
                str7 = str2;
            } else {
                str7 = str;
            }
            bundleB2 = x3Var.b();
            bundleB3 = x3Var2.b();
            if (bundleB2.size() != bundleB3.size() && Objects.equals(bundleB2.getString("ad_storage"), bundleB3.getString("ad_storage")) && Objects.equals(bundleB2.getString("ad_personalization"), bundleB3.getString("ad_personalization")) && Objects.equals(bundleB2.getString("ad_user_data"), bundleB3.getString("ad_user_data"))) {
                str8 = str;
            } else {
                str8 = str2;
            }
            bundle.putString("_tcfm", str7.concat(str8));
            map3 = x3Var.a;
            str9 = (String) map3.get("PurposeDiagnostics");
            if (TextUtils.isEmpty(str9)) {
                str9 = "200000";
            }
            bundle.putString("_tcfd2", str9);
            sb = new StringBuilder(str2);
            try {
                str10 = (String) map3.get("CmpSdkID");
                if (TextUtils.isEmpty(str10)) {
                    i11 = -1;
                } else {
                    i11 = Integer.parseInt(str10);
                }
            } catch (NumberFormatException unused6) {
            }
            if (i11 >= 0 || i11 > 4095) {
                sb.append("00");
            } else {
                sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i11 >> 6));
                sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i11 & 63));
            }
            iC = x3Var.c();
            if (iC >= 0 || iC > 63) {
                sb.append(str);
            } else {
                sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iC));
            }
            if (true != str2.equals(map3.get("gdprApplies"))) {
                i12 = 0;
            } else {
                i12 = i10;
            }
            zEquals = str2.equals(map3.get("EnableAdvertiserConsentMode"));
            i13 = i12 | 4;
            if (zEquals) {
                i13 = i12 | 12;
            }
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i13));
            bundle.putString("_tcfd", sb.toString());
            v2Var.C(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_tcf", bundle);
        }
        s1Var = s1Var2;
        z = false;
        cArr[0] = '2';
        if (z5) {
            f1VarE = com.google.common.collect.f1.D;
            str2 = "1";
            str = "0";
        } else {
            i0Var2 = (com.google.android.gms.internal.measurement.i0) f1VarE2.get(h0Var);
            i0Var3 = (com.google.android.gms.internal.measurement.i0) f1VarE2.get(h0Var3);
            i0Var4 = (com.google.android.gms.internal.measurement.i0) f1VarE2.get(h0Var4);
            i0Var5 = (com.google.android.gms.internal.measurement.i0) f1VarE2.get(h0Var5);
            androidx.appcompat.widget.x xVarA3 = com.google.common.collect.f1.a();
            xVarA3.q("Version", "2");
            if (true != z6) {
                obj = "0";
            } else {
                obj = "1";
            }
            z2 = z6;
            xVarA3.q("VendorConsent", obj);
            if (true != z) {
                obj2 = "0";
            } else {
                obj2 = "1";
            }
            z3 = z;
            xVarA3.q("VendorLegitimateInterest", obj2);
            if (i3 != 1) {
                obj3 = "0";
            } else {
                obj3 = "1";
            }
            xVarA3.q("gdprApplies", obj3);
            if (i5 != 1) {
                obj4 = "0";
            } else {
                obj4 = "1";
            }
            xVarA3.q("EnableAdvertiserConsentMode", obj4);
            xVarA3.q("PolicyVersion", String.valueOf(i16));
            xVarA3.q("CmpSdkID", String.valueOf(i17));
            if (i4 != 1) {
                obj5 = "0";
            } else {
                obj5 = "1";
            }
            xVarA3.q("PurposeOneTreatment", obj5);
            xVarA3.q("PublisherCC", strA3);
            if (i0Var2 != null) {
                iA = i0Var2.a();
            } else {
                iA = i0Var.a();
            }
            xVarA3.q("PublisherRestrictions1", String.valueOf(iA));
            if (i0Var3 != null) {
                iA2 = i0Var3.a();
            } else {
                iA2 = i0Var.a();
            }
            xVarA3.q("PublisherRestrictions3", String.valueOf(iA2));
            if (i0Var4 != null) {
                iA3 = i0Var4.a();
            } else {
                iA3 = i0Var.a();
            }
            xVarA3.q("PublisherRestrictions4", String.valueOf(iA3));
            if (i0Var5 != null) {
                iA4 = i0Var5.a();
            } else {
                iA4 = i0Var.a();
            }
            xVarA3.q("PublisherRestrictions7", String.valueOf(iA4));
            i6 = i3;
            xVarA3.r(com.google.common.collect.f1.c(4, new Object[]{"Purpose1", z3.d(h0Var, strA4, strA6), "Purpose3", z3.d(h0Var3, strA4, strA6), "Purpose4", z3.d(h0Var4, strA4, strA6), "Purpose7", z3.d(h0Var5, strA4, strA6)}, null).entrySet());
            str = "0";
            str2 = "1";
            i7 = i4;
            if (true != z3.b(h0Var, f1VarC, f1VarE2, n1Var3, cArr, i5, i6, i7, strA3, strA4, strA6, z2, z3)) {
                str3 = str;
            } else {
                str3 = str2;
            }
            i8 = i5;
            if (true != z3.b(h0Var3, f1VarC, f1VarE2, n1Var3, cArr, i8, i6, i7, strA3, strA4, strA6, z2, z3)) {
                str4 = str;
            } else {
                str4 = str2;
            }
            if (true != z3.b(h0Var4, f1VarC, f1VarE2, n1Var3, cArr, i8, i6, i7, strA3, strA4, strA6, z2, z3)) {
                str5 = str;
            } else {
                str5 = str2;
            }
            if (true != z3.b(h0Var5, f1VarC, f1VarE2, n1Var3, cArr, i8, i6, i7, strA3, strA4, strA6, z2, z3)) {
                str6 = str;
            } else {
                str6 = str2;
            }
            xVarA3.r(com.google.common.collect.f1.c(5, new Object[]{"AuthorizePurpose1", str3, "AuthorizePurpose3", str4, "AuthorizePurpose4", str5, "AuthorizePurpose7", str6, "PurposeDiagnostics", new String(cArr)}, null).entrySet());
            f1VarE = xVarA3.e(true);
        }
        x3Var = new x3(f1VarE);
        s1.m(x0Var2);
        x0Var2.K.b(x3Var, "Tcf preferences read");
        g1Var.v();
        string = g1Var.z().getString("stored_tcf_param", "");
        map = new HashMap();
        if (TextUtils.isEmpty(string)) {
            x3Var2 = new x3(map);
            i10 = 2;
        } else {
            while (i9 < r10) {
                strArrSplit = str11.split("=");
                if (strArrSplit.length < 2) {
                }
            }
            i10 = 2;
            x3Var2 = new x3(map);
        }
        g1Var.v();
        string2 = g1Var.z().getString("stored_tcf_param", "");
        strA = x3Var.a();
        if (strA.equals(string2)) {
            SharedPreferences.Editor editorEdit2 = g1Var.z().edit();
            editorEdit2.putString("stored_tcf_param", strA);
            editorEdit2.apply();
            bundleB = x3Var.b();
            s1.m(x0Var2);
            x0Var2.K.b(bundleB, "Consent generated from Tcf");
            if (bundleB != Bundle.EMPTY) {
                s1Var.H.getClass();
                v2Var = this;
                v2Var.P(bundleB, -30, System.currentTimeMillis());
            } else {
                v2Var = this;
            }
            Bundle bundle2 = new Bundle();
            map2 = x3Var2.a;
            if (map2.isEmpty()) {
                str7 = str;
            } else {
                str7 = str;
            }
            bundleB2 = x3Var.b();
            bundleB3 = x3Var2.b();
            if (bundleB2.size() != bundleB3.size()) {
                str8 = str2;
            } else {
                str8 = str;
            }
            bundle2.putString("_tcfm", str7.concat(str8));
            map3 = x3Var.a;
            str9 = (String) map3.get("PurposeDiagnostics");
            if (TextUtils.isEmpty(str9)) {
                str9 = "200000";
            }
            bundle2.putString("_tcfd2", str9);
            sb = new StringBuilder(str2);
            str10 = (String) map3.get("CmpSdkID");
            if (TextUtils.isEmpty(str10)) {
                i11 = Integer.parseInt(str10);
            } else {
                i11 = -1;
            }
            if (i11 >= 0) {
                sb.append("00");
            } else {
                sb.append("00");
            }
            iC = x3Var.c();
            if (iC >= 0) {
                sb.append(str);
            } else {
                sb.append(str);
            }
            if (true != str2.equals(map3.get("gdprApplies"))) {
                i12 = 0;
            } else {
                i12 = i10;
            }
            zEquals = str2.equals(map3.get("EnableAdvertiserConsentMode"));
            i13 = i12 | 4;
            if (zEquals) {
                i13 = i12 | 12;
            }
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i13));
            bundle2.putString("_tcfd", sb.toString());
            v2Var.C(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_tcf", bundle2);
        }
    }

    public final void C(String str, String str2, Bundle bundle) {
        long jElapsedRealtime;
        v();
        s1 s1Var = (s1) this.e;
        s1Var.H.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (s1Var.A.G(null, h0.e1)) {
            s1Var.H.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            jElapsedRealtime = 0;
        }
        D(jCurrentTimeMillis, jElapsedRealtime, bundle, str, str2);
    }

    public final void D(long j, long j2, Bundle bundle, String str, String str2) {
        v();
        boolean z = true;
        if (this.A != null && !r4.a0(str2)) {
            z = false;
        }
        E(str, str2, j, j2, bundle, true, z, true);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x013c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0154  */
    /* JADX WARN: Code duplicated, block: B:61:0x0159  */
    public final void E(String str, String str2, long j, long j2, Bundle bundle, boolean z, boolean z2, boolean z3) {
        String str3;
        g1 g1Var;
        androidx.media3.exoplayer.hls.c cVar;
        boolean z4;
        f3 f3Var;
        g1 g1Var2;
        long j3;
        boolean zA;
        Bundle[] bundleArr;
        long j4;
        int i;
        long j5;
        long j6;
        boolean zC;
        Bundle[] bundleArr2;
        int i2;
        int length;
        com.google.android.gms.common.internal.x.d(str);
        com.google.android.gms.common.internal.x.g(bundle);
        v();
        w();
        s1 s1Var = (s1) this.e;
        boolean zD = s1Var.d();
        w3 w3Var = s1Var.E;
        g gVar = s1Var.A;
        Context context = s1Var.e;
        r4 r4Var = s1Var.F;
        x0 x0Var = s1Var.C;
        if (!zD) {
            s1.m(x0Var);
            x0Var.J.a("Event not sent since app measurement is disabled");
            return;
        }
        List list = s1Var.r().H;
        if (list != null && !list.contains(str2)) {
            s1.m(x0Var);
            x0Var.J.c(str2, str, "Dropping non-safelisted event. event name, origin");
            return;
        }
        if (!this.C) {
            this.C = true;
            try {
                try {
                    (!s1Var.y ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, context.getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, context);
                } catch (Exception e) {
                    s1.m(x0Var);
                    x0Var.F.b(e, "Failed to invoke Tag Manager's initialize() method");
                }
            } catch (ClassNotFoundException unused) {
                s1.m(x0Var);
                x0Var.I.a("Tag Manager is not found and thus will not be used");
            }
        }
        s0 s0Var = s1Var.G;
        g1 g1Var3 = s1Var.B;
        com.google.android.gms.common.util.a aVar = s1Var.H;
        if (!gVar.G(null, h0.Z0) && "_cmp".equals(str2) && bundle.containsKey("gclid")) {
            String string = bundle.getString("gclid");
            aVar.getClass();
            str3 = null;
            G(System.currentTimeMillis(), string, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_lgclid");
        } else {
            str3 = null;
        }
        if (!z || r4.G[0].equals(str2)) {
            g1Var = g1Var3;
        } else {
            s1.k(r4Var);
            s1.k(g1Var3);
            g1Var = g1Var3;
            r4Var.I(bundle, g1Var.V.H());
        }
        androidx.media3.exoplayer.hls.c cVar2 = 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00f1: IGET (r3v1 'cVar2' androidx.media3.exoplayer.hls.c) = (r1v0 'this' ?? I:??[OBJECT, ARRAY] A[IMMUTABLE_TYPE, THIS]) A[DECLARE_VAR] (LINE:242) com.google.android.gms.measurement.internal.v2.S androidx.media3.exoplayer.hls.c in method: com.google.android.gms.measurement.internal.v2.E(java.lang.String, java.lang.String, long, long, android.os.Bundle, boolean, boolean, boolean):void, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
            	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
            	at jadx.core.ProcessClass.process(ProcessClass.java:89)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            */
        /*
            Method dump skipped, instruction units count: 1299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.v2.E(java.lang.String, java.lang.String, long, long, android.os.Bundle, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public final void F(String str, String str2, Object obj, boolean z, long j) {
        int iF0;
        int length;
        s1 s1Var = (s1) this.e;
        if (z) {
            r4 r4Var = s1Var.F;
            s1.k(r4Var);
            iF0 = r4Var.F0(str2);
        } else {
            r4 r4Var2 = s1Var.F;
            s1.k(r4Var2);
            if (!r4Var2.z0("user property", str2)) {
                iF0 = 6;
            } else if (r4Var2.B0("user property", g2.l, null, str2)) {
                ((s1) r4Var2.e).getClass();
                if (r4Var2.C0("user property", 24, str2)) {
                    iF0 = 0;
                } else {
                    iF0 = 6;
                }
            } else {
                iF0 = 15;
            }
        }
        androidx.media3.exoplayer.hls.c cVar = this.S;
        if (iF0 != 0) {
            s1.k(s1Var.F);
            String strC = r4.C(24, str2, true);
            length = str2 != null ? str2.length() : 0;
            s1.k(s1Var.F);
            r4.N(cVar, null, iF0, "_ev", strC, length);
            return;
        }
        String str3 = str == null ? "app" : str;
        if (obj == null) {
            p1 p1Var = s1Var.D;
            s1.m(p1Var);
            p1Var.E(new v1(this, str3, str2, null, j, 1));
            return;
        }
        r4 r4Var3 = s1Var.F;
        r4 r4Var4 = s1Var.F;
        s1.k(r4Var3);
        int iK = r4Var3.K(obj, str2);
        if (iK != 0) {
            s1.k(r4Var4);
            String strC2 = r4.C(24, str2, true);
            length = ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0;
            s1.k(r4Var4);
            r4.N(cVar, null, iK, "_ev", strC2, length);
            return;
        }
        s1.k(r4Var4);
        Object objL = r4Var4.L(obj, str2);
        if (objL != null) {
            p1 p1Var2 = s1Var.D;
            s1.m(p1Var2);
            p1Var2.E(new v1(this, str3, str2, objL, j, 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    /* JADX WARN: Code duplicated, block: B:18:0x0066  */
    public final void G(long j, Object obj, String str, String str2) {
        String str3;
        boolean zC;
        Object objValueOf = obj;
        s1 s1Var = (s1) this.e;
        com.google.android.gms.common.internal.x.d(str);
        com.google.android.gms.common.internal.x.d(str2);
        v();
        w();
        if ("allow_personalized_ads".equals(str2)) {
            String str4 = "_npa";
            if (objValueOf instanceof String) {
                String str5 = (String) objValueOf;
                if (!TextUtils.isEmpty(str5)) {
                    long j2 = true != "false".equals(str5.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
                    objValueOf = Long.valueOf(j2);
                    g1 g1Var = s1Var.B;
                    s1.k(g1Var);
                    g1Var.J.v(j2 == 1 ? "true" : "false");
                } else if (objValueOf == null) {
                    g1 g1Var2 = s1Var.B;
                    s1.k(g1Var2);
                    g1Var2.J.v("unset");
                } else {
                    str4 = str2;
                }
            } else if (objValueOf == null) {
                g1 g1Var3 = s1Var.B;
                s1.k(g1Var3);
                g1Var3.J.v("unset");
            } else {
                str4 = str2;
            }
            x0 x0Var = s1Var.C;
            s1.m(x0Var);
            x0Var.K.c("non_personalized_ads(_npa)", objValueOf, "Setting user property(FE)");
            str3 = str4;
        } else {
            str3 = str2;
        }
        Object obj2 = objValueOf;
        if (!s1Var.d()) {
            x0 x0Var2 = s1Var.C;
            s1.m(x0Var2);
            x0Var2.K.a("User property not set since app measurement is disabled");
            return;
        }
        if (s1Var.h()) {
            o4 o4Var = new o4(j, obj2, str3, str);
            o3 o3VarP = s1Var.p();
            o3VarP.v();
            o3VarP.w();
            o3VarP.H();
            r0 r0VarO = ((s1) o3VarP.e).o();
            r0VarO.getClass();
            Parcel parcelObtain = Parcel.obtain();
            v.b(o4Var, parcelObtain);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            if (bArrMarshall.length > 131072) {
                x0 x0Var3 = ((s1) r0VarO.e).C;
                s1.m(x0Var3);
                x0Var3.D.a("User property too long for local database. Sending directly to service");
                zC = false;
            } else {
                zC = r0VarO.C(bArrMarshall, 1);
            }
            o3VarP.J(new com.google.android.gms.cloudmessaging.i(o3VarP, o3VarP.L(true), zC, o4Var, 1));
        }
    }

    public final void H() {
        v();
        w();
        s1 s1Var = (s1) this.e;
        if (s1Var.h()) {
            g gVar = s1Var.A;
            ((s1) gVar.e).getClass();
            Boolean boolI = gVar.I("google_analytics_deferred_deep_link_enabled");
            if (boolI != null && boolI.booleanValue()) {
                x0 x0Var = s1Var.C;
                s1.m(x0Var);
                x0Var.J.a("Deferred Deep Link feature enabled.");
                p1 p1Var = s1Var.D;
                s1.m(p1Var);
                p1Var.E(new j2(this, 2));
            }
            o3 o3VarP = s1Var.p();
            o3VarP.v();
            o3VarP.w();
            t4 t4VarL = o3VarP.L(true);
            o3VarP.H();
            s1 s1Var2 = (s1) o3VarP.e;
            s1Var2.A.G(null, h0.W0);
            s1Var2.o().C(new byte[0], 3);
            o3VarP.J(new j3(o3VarP, t4VarL, 1));
            this.O = false;
            g1 g1Var = s1Var.B;
            s1.k(g1Var);
            g1Var.v();
            String string = g1Var.z().getString("previous_os_version", null);
            ((s1) g1Var.e).q().x();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = g1Var.z().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            s1Var.q().x();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            C(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ou", bundle);
        }
    }

    public final void I(Bundle bundle, long j) {
        s1 s1Var = (s1) this.e;
        com.google.android.gms.common.internal.x.g(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            x0 x0Var = s1Var.C;
            s1.m(x0Var);
            x0Var.F.a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        g2.e(bundle2, "app_id", String.class, null);
        g2.e(bundle2, "origin", String.class, null);
        g2.e(bundle2, "name", String.class, null);
        g2.e(bundle2, ES6Iterator.VALUE_PROPERTY, Object.class, null);
        g2.e(bundle2, "trigger_event_name", String.class, null);
        g2.e(bundle2, "trigger_timeout", Long.class, 0L);
        g2.e(bundle2, "timed_out_event_name", String.class, null);
        g2.e(bundle2, "timed_out_event_params", Bundle.class, null);
        g2.e(bundle2, "triggered_event_name", String.class, null);
        g2.e(bundle2, "triggered_event_params", Bundle.class, null);
        g2.e(bundle2, "time_to_live", Long.class, 0L);
        g2.e(bundle2, "expired_event_name", String.class, null);
        g2.e(bundle2, "expired_event_params", Bundle.class, null);
        com.google.android.gms.common.internal.x.d(bundle2.getString("name"));
        com.google.android.gms.common.internal.x.d(bundle2.getString("origin"));
        com.google.android.gms.common.internal.x.g(bundle2.get(ES6Iterator.VALUE_PROPERTY));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get(ES6Iterator.VALUE_PROPERTY);
        r4 r4Var = s1Var.F;
        s0 s0Var = s1Var.G;
        x0 x0Var2 = s1Var.C;
        s1.k(r4Var);
        if (r4Var.F0(string) != 0) {
            s1.m(x0Var2);
            x0Var2.C.b(s0Var.c(string), "Invalid conditional user property name");
            return;
        }
        s1.k(r4Var);
        if (r4Var.K(obj, string) != 0) {
            s1.m(x0Var2);
            x0Var2.C.c(s0Var.c(string), obj, "Invalid conditional user property value");
            return;
        }
        Object objL = r4Var.L(obj, string);
        if (objL == null) {
            s1.m(x0Var2);
            x0Var2.C.c(s0Var.c(string), obj, "Unable to normalize conditional user property value");
            return;
        }
        g2.c(bundle2, objL);
        long j2 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j2 > 15552000000L || j2 < 1)) {
            s1.m(x0Var2);
            x0Var2.C.c(s0Var.c(string), Long.valueOf(j2), "Invalid conditional user property timeout");
            return;
        }
        long j3 = bundle2.getLong("time_to_live");
        if (j3 > 15552000000L || j3 < 1) {
            s1.m(x0Var2);
            x0Var2.C.c(s0Var.c(string), Long.valueOf(j3), "Invalid conditional user property time to live");
        } else {
            p1 p1Var = s1Var.D;
            s1.m(p1Var);
            p1Var.E(new p2(this, bundle2, 0));
        }
    }

    public final void J(String str, String str2, Bundle bundle) {
        s1 s1Var = (s1) this.e;
        s1Var.H.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.google.android.gms.common.internal.x.d(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        p1 p1Var = s1Var.D;
        s1.m(p1Var);
        p1Var.E(new p2(this, bundle2, 1));
    }

    public final String K() {
        s1 s1Var = (s1) this.e;
        try {
            return g2.b(s1Var.e, s1Var.M);
        } catch (IllegalStateException e) {
            x0 x0Var = s1Var.C;
            s1.m(x0Var);
            x0Var.C.b(e, "getGoogleAppId failed with exception");
            return null;
        }
    }

    public final void L(f2 f2Var, long j, boolean z) {
        int i = f2Var.b;
        v();
        w();
        s1 s1Var = (s1) this.e;
        g1 g1Var = s1Var.B;
        x0 x0Var = s1Var.C;
        s1.k(g1Var);
        f2 f2VarC = g1Var.C();
        if (j <= this.M && f2.l(f2VarC.b, i)) {
            s1.m(x0Var);
            x0Var.I.b(f2Var, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        g1 g1Var2 = s1Var.B;
        s1.k(g1Var2);
        g1Var2.v();
        if (!f2.l(i, g1Var2.z().getInt("consent_source", 100))) {
            s1.m(x0Var);
            x0Var.I.b(Integer.valueOf(i), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor editorEdit = g1Var2.z().edit();
        editorEdit.putString("consent_settings", f2Var.g());
        editorEdit.putInt("consent_source", i);
        editorEdit.apply();
        s1.m(x0Var);
        x0Var.K.b(f2Var, "Setting storage consent(FE)");
        this.M = j;
        if (s1Var.p().F()) {
            o3 o3VarP = s1Var.p();
            o3VarP.v();
            o3VarP.w();
            o3VarP.J(new m3(o3VarP, 2));
        } else {
            o3 o3VarP2 = s1Var.p();
            o3VarP2.v();
            o3VarP2.w();
            if (o3VarP2.E()) {
                o3VarP2.J(new j3(o3VarP2, o3VarP2.L(false)));
            }
        }
        if (z) {
            s1Var.p().z(new AtomicReference());
        }
    }

    public final void M(Boolean bool, boolean z) {
        v();
        w();
        s1 s1Var = (s1) this.e;
        x0 x0Var = s1Var.C;
        s1.m(x0Var);
        x0Var.J.b(bool, "Setting app measurement enabled (FE)");
        g1 g1Var = s1Var.B;
        s1.k(g1Var);
        g1Var.v();
        SharedPreferences.Editor editorEdit = g1Var.z().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
        if (z) {
            g1Var.v();
            SharedPreferences.Editor editorEdit2 = g1Var.z().edit();
            if (bool != null) {
                editorEdit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit2.remove("measurement_enabled_from_api");
            }
            editorEdit2.apply();
        }
        p1 p1Var = s1Var.D;
        s1.m(p1Var);
        p1Var.v();
        if (s1Var.W || !(bool == null || bool.booleanValue())) {
            N();
        }
    }

    public final void N() {
        v();
        s1 s1Var = (s1) this.e;
        g1 g1Var = s1Var.B;
        x0 x0Var = s1Var.C;
        com.google.android.gms.common.util.a aVar = s1Var.H;
        s1.k(g1Var);
        String strT = g1Var.J.t();
        if (strT != null) {
            if ("unset".equals(strT)) {
                aVar.getClass();
                G(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                Long lValueOf = Long.valueOf(true != "true".equals(strT) ? 0L : 1L);
                aVar.getClass();
                G(System.currentTimeMillis(), lValueOf, "app", "_npa");
            }
        }
        if (!s1Var.d() || !this.O) {
            s1.m(x0Var);
            x0Var.J.a("Updating Scion state (FE)");
            o3 o3VarP = s1Var.p();
            o3VarP.v();
            o3VarP.w();
            o3VarP.J(new j3(o3VarP, o3VarP.L(true), 3));
            return;
        }
        s1.m(x0Var);
        x0Var.J.a("Recording app launch after enabling measurement for the first time (FE)");
        H();
        w3 w3Var = s1Var.E;
        s1.l(w3Var);
        w3Var.B.F();
        p1 p1Var = s1Var.D;
        s1.m(p1Var);
        p1Var.E(new j2(this, 1));
    }

    public final void O() {
        s1 s1Var = (s1) this.e;
        if (!(s1Var.e.getApplicationContext() instanceof Application) || this.z == null) {
            return;
        }
        ((Application) s1Var.e.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.z);
    }

    public final void P(Bundle bundle, int i, long j) throws Throwable {
        Boolean bool;
        String string;
        c2 c2Var;
        Boolean bool2;
        s1 s1Var = (s1) this.e;
        w();
        f2 f2Var = f2.c;
        e2[] e2VarArr = d2.STORAGE.e;
        int length = e2VarArr.length;
        int i2 = 0;
        while (true) {
            bool = null;
            if (i2 >= length) {
                string = null;
                break;
            }
            String str = e2VarArr[i2].e;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if (string.equals("granted")) {
                    bool2 = Boolean.TRUE;
                } else {
                    bool2 = string.equals("denied") ? Boolean.FALSE : null;
                }
                if (bool2 == null) {
                    break;
                }
            }
            i2++;
        }
        if (string != null) {
            x0 x0Var = s1Var.C;
            s1.m(x0Var);
            x0Var.H.b(string, "Ignoring invalid consent setting");
            x0 x0Var2 = s1Var.C;
            s1.m(x0Var2);
            x0Var2.H.a("Valid consent values are 'granted', 'denied'");
        }
        p1 p1Var = s1Var.D;
        s1.m(p1Var);
        boolean zB = p1Var.B();
        f2 f2VarB = f2.b(i, bundle);
        Iterator it = f2VarB.a.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c2Var = c2.UNINITIALIZED;
            if (!zHasNext) {
                break;
            } else if (((c2) it.next()) != c2Var) {
                R(f2VarB, zB);
                break;
            }
        }
        o oVarC = o.c(i, bundle);
        Iterator it2 = oVarC.e.values().iterator();
        while (it2.hasNext()) {
            if (((c2) it2.next()) != c2Var) {
                Q(oVarC, zB);
                break;
            }
        }
        if (bundle != null) {
            int iOrdinal = f2.d(bundle.getString("ad_personalization")).ordinal();
            if (iOrdinal == 2) {
                bool = Boolean.FALSE;
            } else if (iOrdinal == 3) {
                bool = Boolean.TRUE;
            }
        }
        if (bool != null) {
            String str2 = i == -30 ? "tcf" : "app";
            if (zB) {
                G(j, bool.toString(), str2, "allow_personalized_ads");
            } else {
                F(str2, "allow_personalized_ads", bool.toString(), false, j);
            }
        }
    }

    public final void Q(o oVar, boolean z) {
        com.google.common.util.concurrent.l0 l0Var = new com.google.common.util.concurrent.l0(15, this, oVar, false);
        if (z) {
            v();
            l0Var.run();
        } else {
            p1 p1Var = ((s1) this.e).D;
            s1.m(p1Var);
            p1Var.E(l0Var);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:69:0x0115
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void R(com.google.android.gms.measurement.internal.f2 r14, boolean r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.v2.R(com.google.android.gms.measurement.internal.f2, boolean):void");
    }

    public final void S() {
        com.google.android.gms.internal.measurement.g4.a();
        s1 s1Var = (s1) this.e;
        g gVar = s1Var.A;
        p1 p1Var = s1Var.D;
        x0 x0Var = s1Var.C;
        if (gVar.G(null, h0.P0)) {
            s1.m(p1Var);
            if (p1Var.B()) {
                s1.m(x0Var);
                x0Var.C.a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (com.google.android.material.shape.g.q()) {
                s1.m(x0Var);
                x0Var.C.a("Cannot get trigger URIs from main thread");
                return;
            }
            w();
            s1.m(x0Var);
            x0Var.K.a("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            s1.m(p1Var);
            p1Var.F(atomicReference, 10000L, "get trigger URIs", new o2(this, atomicReference, 5, false));
            final List list = (List) atomicReference.get();
            if (list == null) {
                s1.m(x0Var);
                x0Var.E.a("Timed out waiting for get trigger URIs");
            } else {
                s1.m(p1Var);
                p1Var.E(new Runnable() { // from class: com.google.android.gms.measurement.internal.s2
                    @Override // java.lang.Runnable
                    public final void run() {
                        v2 v2Var = this.e;
                        v2Var.v();
                        if (Build.VERSION.SDK_INT < 30) {
                            return;
                        }
                        g1 g1Var = ((s1) v2Var.e).B;
                        s1.k(g1Var);
                        SparseArray sparseArrayB = g1Var.B();
                        for (a4 a4Var : list) {
                            int i = a4Var.z;
                            if (!sparseArrayB.contains(i) || ((Long) sparseArrayB.get(i)).longValue() < a4Var.y) {
                                v2Var.T().add(a4Var);
                            }
                        }
                        v2Var.U();
                    }
                });
            }
        }
    }

    public final PriorityQueue T() {
        if (this.J == null) {
            this.J = new PriorityQueue(Comparator.comparing(t2.a, androidx.constraintlayout.core.e.y));
        }
        return this.J;
    }

    public final void U() {
        a4 a4Var;
        v();
        if (T().isEmpty() || this.F || (a4Var = (a4) T().poll()) == null) {
            return;
        }
        s1 s1Var = (s1) this.e;
        r4 r4Var = s1Var.F;
        s1.k(r4Var);
        androidx.privacysandbox.ads.adservices.java.measurement.a aVarR = r4Var.R();
        if (aVarR != null) {
            this.F = true;
            x0 x0Var = s1Var.C;
            s1.m(x0Var);
            v0 v0Var = x0Var.K;
            String str = a4Var.e;
            v0Var.b(str, "Registering trigger URI");
            ListenableFuture listenableFutureE = aVarR.e(Uri.parse(str));
            if (listenableFutureE != null) {
                listenableFutureE.a(new com.google.common.util.concurrent.l0(0, listenableFutureE, new coil3.memory.c(24, this, a4Var, false)), new com.google.android.datatransport.runtime.p(this, 2));
            } else {
                this.F = false;
                T().add(a4Var);
            }
        }
    }

    public final void V(f2 f2Var) {
        v();
        boolean z = (f2Var.i(e2.ANALYTICS_STORAGE) && f2Var.i(e2.AD_STORAGE)) || ((s1) this.e).p().E();
        s1 s1Var = (s1) this.e;
        p1 p1Var = s1Var.D;
        s1.m(p1Var);
        p1Var.v();
        if (z != s1Var.W) {
            p1 p1Var2 = s1Var.D;
            s1.m(p1Var2);
            p1Var2.v();
            s1Var.W = z;
            g1 g1Var = ((s1) this.e).B;
            s1.k(g1Var);
            g1Var.v();
            Boolean boolValueOf = g1Var.z().contains("measurement_enabled_from_api") ? Boolean.valueOf(g1Var.z().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || boolValueOf == null || boolValueOf.booleanValue()) {
                M(Boolean.valueOf(z), false);
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.j0
    public final boolean y() {
        return false;
    }

    public final void z(String str, String str2, Bundle bundle) {
        long jElapsedRealtime;
        s1 s1Var = (s1) this.e;
        s1Var.H.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (s1Var.A.G(null, h0.e1)) {
            s1Var.H.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            jElapsedRealtime = 0;
        }
        A(str, str2, bundle, true, true, jCurrentTimeMillis, jElapsedRealtime);
    }
}
