package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.b6;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l2 implements Runnable {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public l2(v2 v2Var, AtomicReference atomicReference, String str, String str2, boolean z) {
        this.B = atomicReference;
        this.y = str;
        this.z = str2;
        this.A = z;
        Objects.requireNonNull(v2Var);
        this.C = v2Var;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x010b A[Catch: RuntimeException -> 0x00e5, TRY_ENTER, TryCatch #1 {RuntimeException -> 0x00e5, blocks: (B:53:0x010b, B:55:0x0116, B:58:0x0123, B:60:0x0129, B:62:0x0143, B:64:0x014c, B:66:0x0152, B:69:0x016b, B:71:0x017a, B:70:0x0172, B:72:0x018d, B:74:0x0193, B:76:0x0199, B:78:0x019f, B:80:0x01a5, B:82:0x01ad, B:84:0x01b5, B:86:0x01bb, B:87:0x01cd, B:26:0x0094, B:28:0x009a, B:30:0x00a4, B:32:0x00aa, B:34:0x00b0, B:36:0x00b6, B:38:0x00be, B:40:0x00c6, B:42:0x00ce, B:44:0x00d6, B:48:0x00ec, B:50:0x00fa), top: B:101:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0116 A[Catch: RuntimeException -> 0x00e5, TryCatch #1 {RuntimeException -> 0x00e5, blocks: (B:53:0x010b, B:55:0x0116, B:58:0x0123, B:60:0x0129, B:62:0x0143, B:64:0x014c, B:66:0x0152, B:69:0x016b, B:71:0x017a, B:70:0x0172, B:72:0x018d, B:74:0x0193, B:76:0x0199, B:78:0x019f, B:80:0x01a5, B:82:0x01ad, B:84:0x01b5, B:86:0x01bb, B:87:0x01cd, B:26:0x0094, B:28:0x009a, B:30:0x00a4, B:32:0x00aa, B:34:0x00b0, B:36:0x00b6, B:38:0x00be, B:40:0x00c6, B:42:0x00ce, B:44:0x00d6, B:48:0x00ec, B:50:0x00fa), top: B:101:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0121 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:61:0x0141  */
    /* JADX WARN: Code duplicated, block: B:63:0x014a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0152 A[Catch: RuntimeException -> 0x00e5, TryCatch #1 {RuntimeException -> 0x00e5, blocks: (B:53:0x010b, B:55:0x0116, B:58:0x0123, B:60:0x0129, B:62:0x0143, B:64:0x014c, B:66:0x0152, B:69:0x016b, B:71:0x017a, B:70:0x0172, B:72:0x018d, B:74:0x0193, B:76:0x0199, B:78:0x019f, B:80:0x01a5, B:82:0x01ad, B:84:0x01b5, B:86:0x01bb, B:87:0x01cd, B:26:0x0094, B:28:0x009a, B:30:0x00a4, B:32:0x00aa, B:34:0x00b0, B:36:0x00b6, B:38:0x00be, B:40:0x00c6, B:42:0x00ce, B:44:0x00d6, B:48:0x00ec, B:50:0x00fa), top: B:101:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0169 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x016b A[Catch: RuntimeException -> 0x00e5, TryCatch #1 {RuntimeException -> 0x00e5, blocks: (B:53:0x010b, B:55:0x0116, B:58:0x0123, B:60:0x0129, B:62:0x0143, B:64:0x014c, B:66:0x0152, B:69:0x016b, B:71:0x017a, B:70:0x0172, B:72:0x018d, B:74:0x0193, B:76:0x0199, B:78:0x019f, B:80:0x01a5, B:82:0x01ad, B:84:0x01b5, B:86:0x01bb, B:87:0x01cd, B:26:0x0094, B:28:0x009a, B:30:0x00a4, B:32:0x00aa, B:34:0x00b0, B:36:0x00b6, B:38:0x00be, B:40:0x00c6, B:42:0x00ce, B:44:0x00d6, B:48:0x00ec, B:50:0x00fa), top: B:101:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0172 A[Catch: RuntimeException -> 0x00e5, TryCatch #1 {RuntimeException -> 0x00e5, blocks: (B:53:0x010b, B:55:0x0116, B:58:0x0123, B:60:0x0129, B:62:0x0143, B:64:0x014c, B:66:0x0152, B:69:0x016b, B:71:0x017a, B:70:0x0172, B:72:0x018d, B:74:0x0193, B:76:0x0199, B:78:0x019f, B:80:0x01a5, B:82:0x01ad, B:84:0x01b5, B:86:0x01bb, B:87:0x01cd, B:26:0x0094, B:28:0x009a, B:30:0x00a4, B:32:0x00aa, B:34:0x00b0, B:36:0x00b6, B:38:0x00be, B:40:0x00c6, B:42:0x00ce, B:44:0x00d6, B:48:0x00ec, B:50:0x00fa), top: B:101:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x018d A[Catch: RuntimeException -> 0x00e5, TryCatch #1 {RuntimeException -> 0x00e5, blocks: (B:53:0x010b, B:55:0x0116, B:58:0x0123, B:60:0x0129, B:62:0x0143, B:64:0x014c, B:66:0x0152, B:69:0x016b, B:71:0x017a, B:70:0x0172, B:72:0x018d, B:74:0x0193, B:76:0x0199, B:78:0x019f, B:80:0x01a5, B:82:0x01ad, B:84:0x01b5, B:86:0x01bb, B:87:0x01cd, B:26:0x0094, B:28:0x009a, B:30:0x00a4, B:32:0x00aa, B:34:0x00b0, B:36:0x00b6, B:38:0x00be, B:40:0x00c6, B:42:0x00ce, B:44:0x00d6, B:48:0x00ec, B:50:0x00fa), top: B:101:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0193 A[Catch: RuntimeException -> 0x00e5, TryCatch #1 {RuntimeException -> 0x00e5, blocks: (B:53:0x010b, B:55:0x0116, B:58:0x0123, B:60:0x0129, B:62:0x0143, B:64:0x014c, B:66:0x0152, B:69:0x016b, B:71:0x017a, B:70:0x0172, B:72:0x018d, B:74:0x0193, B:76:0x0199, B:78:0x019f, B:80:0x01a5, B:82:0x01ad, B:84:0x01b5, B:86:0x01bb, B:87:0x01cd, B:26:0x0094, B:28:0x009a, B:30:0x00a4, B:32:0x00aa, B:34:0x00b0, B:36:0x00b6, B:38:0x00be, B:40:0x00c6, B:42:0x00ce, B:44:0x00d6, B:48:0x00ec, B:50:0x00fa), top: B:101:0x0094 }] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        x0 x0Var;
        Bundle bundleX0;
        String str;
        x0 x0Var2;
        v0 v0Var;
        Bundle bundleX1;
        switch (this.e) {
            case 0:
                o3 o3VarP = ((AppMeasurementDynamiteService) this.C).d.p();
                b6 b6Var = (b6) this.B;
                String str2 = (String) this.y;
                String str3 = (String) this.z;
                o3VarP.v();
                o3VarP.w();
                o3VarP.J(new g3(o3VarP, str2, str3, o3VarP.L(false), this.A, b6Var));
                break;
            case 1:
                String str4 = (String) this.y;
                String str5 = (String) this.z;
                o3 o3VarP2 = ((s1) ((v2) this.C).e).p();
                AtomicReference atomicReference = (AtomicReference) this.B;
                o3VarP2.v();
                o3VarP2.w();
                o3VarP2.J(new g3(o3VarP2, atomicReference, str4, str5, o3VarP2.L(false), this.A));
                break;
            case 2:
                r2 r2Var = (r2) this.C;
                v2 v2Var = (v2) r2Var.y;
                v2Var.v();
                s1 s1Var = (s1) v2Var.e;
                r1 r1Var = v2Var.N;
                String str6 = (String) this.z;
                Uri uri = (Uri) this.B;
                try {
                    r4 r4Var = s1Var.F;
                    x0 x0Var3 = s1Var.C;
                    s1.k(r4Var);
                    try {
                        String str7 = "Activity created with data 'referrer' without required params";
                        if (TextUtils.isEmpty(str6)) {
                            x0Var = x0Var3;
                        } else {
                            try {
                                if (!str6.contains("gclid")) {
                                    x0Var = x0Var3;
                                    if (!str6.contains("gbraid") && !str6.contains("utm_campaign") && !str6.contains("utm_source") && !str6.contains("utm_medium") && !str6.contains("utm_id") && !str6.contains("dclid") && !str6.contains("srsltid") && !str6.contains("sfmc_id")) {
                                        x0 x0Var4 = ((s1) r4Var.e).C;
                                        s1.m(x0Var4);
                                        x0Var4.J.a("Activity created with data 'referrer' without required params");
                                    }
                                    str = (String) this.y;
                                    if (this.A) {
                                        r4 r4Var2 = s1Var.F;
                                        s1.k(r4Var2);
                                        bundleX1 = r4Var2.x0(uri);
                                        if (bundleX1 != null) {
                                            bundleX1.putString("_cis", "intent");
                                            if (bundleX1.containsKey("gclid") && bundleX0 != null && bundleX0.containsKey("gclid")) {
                                                bundleX1.putString("_cer", "gclid=" + bundleX0.getString("gclid"));
                                            }
                                            v2Var.C(str, "_cmp", bundleX1);
                                            r1Var.b(str, bundleX1);
                                        } else {
                                            str7 = "Activity created with data 'referrer' without required params";
                                        }
                                    } else {
                                        str7 = "Activity created with data 'referrer' without required params";
                                    }
                                    if (!TextUtils.isEmpty(str6)) {
                                        s1.m(x0Var);
                                        x0Var2 = x0Var;
                                        v0Var = x0Var2.J;
                                        v0Var.b(str6, "Activity created with referrer");
                                        if (s1Var.A.G(null, h0.G0)) {
                                            if (bundleX0 != null) {
                                                v2Var.C(str, "_cmp", bundleX0);
                                                r1Var.b(str, bundleX0);
                                            } else {
                                                s1.m(x0Var2);
                                                v0Var.b(str6, "Referrer does not contain valid parameters");
                                            }
                                            s1Var.H.getClass();
                                            v2Var.F(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ldl", null, true, System.currentTimeMillis());
                                        } else if (str6.contains("gclid") || (!str6.contains("utm_campaign") && !str6.contains("utm_source") && !str6.contains("utm_medium") && !str6.contains("utm_term") && !str6.contains("utm_content"))) {
                                            s1.m(x0Var2);
                                            v0Var.a(str7);
                                        } else if (!TextUtils.isEmpty(str6)) {
                                            s1Var.H.getClass();
                                            v2Var.F(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ldl", str6, true, System.currentTimeMillis());
                                        }
                                    }
                                } else {
                                    x0Var = x0Var3;
                                }
                                bundleX0 = r4Var.x0(Uri.parse("https://google.com/search?".concat(str6)));
                                if (bundleX0 != null) {
                                    bundleX0.putString("_cis", "referrer");
                                }
                                str = (String) this.y;
                                if (this.A) {
                                    r4 r4Var3 = s1Var.F;
                                    s1.k(r4Var3);
                                    bundleX1 = r4Var3.x0(uri);
                                    if (bundleX1 != null) {
                                        bundleX1.putString("_cis", "intent");
                                        if (bundleX1.containsKey("gclid")) {
                                        }
                                        v2Var.C(str, "_cmp", bundleX1);
                                        r1Var.b(str, bundleX1);
                                    } else {
                                        str7 = "Activity created with data 'referrer' without required params";
                                    }
                                } else {
                                    str7 = "Activity created with data 'referrer' without required params";
                                }
                                if (!TextUtils.isEmpty(str6)) {
                                    s1.m(x0Var);
                                    x0Var2 = x0Var;
                                    v0Var = x0Var2.J;
                                    v0Var.b(str6, "Activity created with referrer");
                                    if (s1Var.A.G(null, h0.G0)) {
                                        if (str6.contains("gclid")) {
                                        }
                                        s1.m(x0Var2);
                                        v0Var.a(str7);
                                    } else {
                                        if (bundleX0 != null) {
                                            v2Var.C(str, "_cmp", bundleX0);
                                            r1Var.b(str, bundleX0);
                                        } else {
                                            s1.m(x0Var2);
                                            v0Var.b(str6, "Referrer does not contain valid parameters");
                                        }
                                        s1Var.H.getClass();
                                        v2Var.F(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ldl", null, true, System.currentTimeMillis());
                                    }
                                }
                            } catch (RuntimeException e) {
                                e = e;
                                r2Var = r2Var;
                                x0 x0Var5 = ((s1) ((v2) r2Var.y).e).C;
                                s1.m(x0Var5);
                                x0Var5.C.b(e, "Throwable caught in handleReferrerForOnActivityCreated");
                                return;
                            }
                        }
                        bundleX0 = null;
                        str = (String) this.y;
                        if (this.A) {
                            r4 r4Var4 = s1Var.F;
                            s1.k(r4Var4);
                            bundleX1 = r4Var4.x0(uri);
                            if (bundleX1 != null) {
                                bundleX1.putString("_cis", "intent");
                                if (bundleX1.containsKey("gclid")) {
                                }
                                v2Var.C(str, "_cmp", bundleX1);
                                r1Var.b(str, bundleX1);
                            } else {
                                str7 = "Activity created with data 'referrer' without required params";
                            }
                        } else {
                            str7 = "Activity created with data 'referrer' without required params";
                        }
                        if (!TextUtils.isEmpty(str6)) {
                            s1.m(x0Var);
                            x0Var2 = x0Var;
                            v0Var = x0Var2.J;
                            v0Var.b(str6, "Activity created with referrer");
                            if (s1Var.A.G(null, h0.G0)) {
                                if (str6.contains("gclid")) {
                                }
                                s1.m(x0Var2);
                                v0Var.a(str7);
                            } else {
                                if (bundleX0 != null) {
                                    v2Var.C(str, "_cmp", bundleX0);
                                    r1Var.b(str, bundleX0);
                                } else {
                                    s1.m(x0Var2);
                                    v0Var.b(str6, "Referrer does not contain valid parameters");
                                }
                                s1Var.H.getClass();
                                v2Var.F(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ldl", null, true, System.currentTimeMillis());
                            }
                        }
                    } catch (RuntimeException e2) {
                        e = e2;
                        x0 x0Var6 = ((s1) ((v2) r2Var.y).e).C;
                        s1.m(x0Var6);
                        x0Var6.C.b(e, "Throwable caught in handleReferrerForOnActivityCreated");
                        return;
                    }
                } catch (RuntimeException e3) {
                    e = e3;
                }
                break;
            default:
                o3 o3Var = (o3) this.C;
                k0 k0Var = o3Var.A;
                s1 s1Var2 = (s1) o3Var.e;
                if (k0Var == null) {
                    x0 x0Var7 = s1Var2.C;
                    s1.m(x0Var7);
                    x0Var7.C.a("Failed to send default event parameters to service");
                } else {
                    boolean zG = s1Var2.A.G(null, h0.W0);
                    t4 t4Var = (t4) this.B;
                    if (zG) {
                        o3Var.N(k0Var, this.A ? null : (t) this.y, t4Var);
                    } else {
                        try {
                            k0Var.v((Bundle) this.z, t4Var);
                            o3Var.I();
                        } catch (RemoteException e4) {
                            x0 x0Var8 = s1Var2.C;
                            s1.m(x0Var8);
                            x0Var8.C.b(e4, "Failed to send default event parameters to service");
                        }
                    }
                }
                break;
        }
    }

    public l2(r2 r2Var, boolean z, Uri uri, String str, String str2) {
        this.A = z;
        this.B = uri;
        this.y = str;
        this.z = str2;
        this.C = r2Var;
    }

    public l2(AppMeasurementDynamiteService appMeasurementDynamiteService, b6 b6Var, String str, String str2, boolean z) {
        this.B = b6Var;
        this.y = str;
        this.z = str2;
        this.A = z;
        this.C = appMeasurementDynamiteService;
    }

    public l2(o3 o3Var, t4 t4Var, boolean z, t tVar, Bundle bundle) {
        this.B = t4Var;
        this.A = z;
        this.y = tVar;
        this.z = bundle;
        Objects.requireNonNull(o3Var);
        this.C = o3Var;
    }
}
