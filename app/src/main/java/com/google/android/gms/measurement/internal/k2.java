package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k2 extends n {
    public final /* synthetic */ int e;
    public final /* synthetic */ v2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(v2 v2Var, b2 b2Var, int i) {
        super(b2Var);
        this.e = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(v2Var);
                this.f = v2Var;
                super(b2Var);
                break;
            case 2:
                Objects.requireNonNull(v2Var);
                this.f = v2Var;
                super(b2Var);
                break;
            case 3:
                this.f = v2Var;
                super(b2Var);
                break;
            default:
                Objects.requireNonNull(v2Var);
                this.f = v2Var;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0128  */
    /* JADX WARN: Code duplicated, block: B:49:0x0146  */
    /* JADX WARN: Code duplicated, block: B:51:0x0157  */
    /* JADX WARN: Code duplicated, block: B:57:0x0173  */
    /* JADX WARN: Code duplicated, block: B:58:0x0176  */
    /* JADX WARN: Code duplicated, block: B:61:0x017a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0184  */
    /* JADX WARN: Code duplicated, block: B:66:0x0198  */
    /* JADX WARN: Code duplicated, block: B:67:0x019b  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:71:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:76:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:77:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:82:0x0289 A[Catch: IllegalArgumentException -> 0x0290, MalformedURLException -> 0x0292, TryCatch #5 {IllegalArgumentException -> 0x0290, MalformedURLException -> 0x0292, blocks: (B:80:0x0241, B:82:0x0289, B:87:0x0294, B:89:0x029a, B:91:0x02a2, B:92:0x02a8, B:93:0x02ac), top: B:116:0x0241 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x029a A[Catch: IllegalArgumentException -> 0x0290, MalformedURLException -> 0x0292, TryCatch #5 {IllegalArgumentException -> 0x0290, MalformedURLException -> 0x0292, blocks: (B:80:0x0241, B:82:0x0289, B:87:0x0294, B:89:0x029a, B:91:0x02a2, B:92:0x02a8, B:93:0x02ac), top: B:116:0x0241 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x02a2 A[Catch: IllegalArgumentException -> 0x0290, MalformedURLException -> 0x0292, TryCatch #5 {IllegalArgumentException -> 0x0290, MalformedURLException -> 0x0292, blocks: (B:80:0x0241, B:82:0x0289, B:87:0x0294, B:89:0x029a, B:91:0x02a2, B:92:0x02a8, B:93:0x02ac), top: B:116:0x0241 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x02c6  */
    @Override // com.google.android.gms.measurement.internal.n
    public final void a() throws Throwable {
        Pair pair;
        NetworkInfo activeNetworkInfo;
        o3 o3VarP;
        s1 s1Var;
        k0 k0Var;
        i iVarU;
        Bundle bundle;
        String str;
        Boolean bool;
        int iOrdinal;
        int i;
        String str2;
        String string;
        s1 s1Var2;
        URL url;
        String strConcat;
        switch (this.e) {
            case 0:
                v2 v2Var = ((s1) this.f.e).J;
                s1.l(v2Var);
                new Thread(new j2(v2Var, 0)).start();
                break;
            case 1:
                this.f.U();
                break;
            case 2:
                this.f.B();
                break;
            default:
                v2 v2Var2 = this.f;
                s1 s1Var3 = (s1) v2Var2.e;
                g1 g1Var = s1Var3.B;
                x0 x0Var = s1Var3.C;
                p1 p1Var = s1Var3.D;
                s1.m(p1Var);
                p1Var.v();
                y2 y2Var = s1Var3.L;
                s1.m(y2Var);
                s1 s1Var4 = (s1) y2Var.e;
                s1.m(y2Var);
                String strB = s1Var3.r().B();
                Boolean boolI = s1Var3.A.I("google_analytics_adid_collection_enabled");
                boolean z = false;
                if (boolI == null || boolI.booleanValue()) {
                    s1.k(g1Var);
                    s1 s1Var5 = (s1) g1Var.e;
                    g1Var.v();
                    if (g1Var.C().i(e2.AD_STORAGE)) {
                        s1Var5.H.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        String str3 = g1Var.E;
                        if (str3 == null || jElapsedRealtime >= g1Var.G) {
                            g1Var.G = s1Var5.A.D(strB, h0.b) + jElapsedRealtime;
                            try {
                                androidx.room.t tVarA = com.google.android.gms.ads.identifier.a.a(s1Var5.e);
                                g1Var.E = "";
                                String str4 = tVarA.b;
                                if (str4 != null) {
                                    g1Var.E = str4;
                                }
                                g1Var.F = tVarA.c;
                            } catch (Exception e) {
                                x0 x0Var2 = s1Var5.C;
                                s1.m(x0Var2);
                                x0Var2.J.b(e, "Unable to get advertising id");
                                g1Var.E = "";
                            }
                            pair = new Pair(g1Var.E, Boolean.valueOf(g1Var.F));
                        } else {
                            pair = new Pair(str3, Boolean.valueOf(g1Var.F));
                        }
                    } else {
                        pair = new Pair("", Boolean.FALSE);
                    }
                    if (!((Boolean) pair.second).booleanValue() && !TextUtils.isEmpty((CharSequence) pair.first)) {
                        s1.m(y2Var);
                        y2Var.x();
                        ConnectivityManager connectivityManager = (ConnectivityManager) s1Var4.e.getSystemService("connectivity");
                        if (connectivityManager != null) {
                            try {
                                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                            } catch (SecurityException unused) {
                                activeNetworkInfo = null;
                            }
                        } else {
                            activeNetworkInfo = null;
                        }
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            StringBuilder sb = new StringBuilder();
                            o3 o3VarP2 = s1Var3.p();
                            o3VarP2.v();
                            o3VarP2.w();
                            if (!o3VarP2.C()) {
                                v2 v2Var3 = s1Var3.J;
                                s1.l(v2Var3);
                                s1 s1Var6 = (s1) v2Var3.e;
                                v2Var3.v();
                                o3VarP = s1Var6.p();
                                s1Var = (s1) o3VarP.e;
                                o3VarP.v();
                                o3VarP.w();
                                k0Var = o3VarP.A;
                                if (k0Var == null) {
                                    o3VarP.B();
                                    x0 x0Var3 = s1Var.C;
                                    s1.m(x0Var3);
                                    x0Var3.J.a("Failed to get consents; not connected to service yet.");
                                } else {
                                    try {
                                        iVarU = k0Var.u(o3VarP.L(false));
                                        o3VarP.I();
                                    } catch (RemoteException e2) {
                                        x0 x0Var4 = s1Var.C;
                                        s1.m(x0Var4);
                                        x0Var4.C.b(e2, "Failed to get consents; remote exception");
                                        iVarU = null;
                                    }
                                    if (iVarU != null) {
                                        bundle = iVarU.e;
                                    } else {
                                        bundle = null;
                                    }
                                    if (bundle == null) {
                                        i = s1Var3.Y;
                                        s1Var3.Y = i + 1;
                                        z = i < 10;
                                        s1.m(x0Var);
                                        v0 v0Var = x0Var.J;
                                        StringBuilder sb2 = new StringBuilder(69);
                                        sb2.append("Failed to retrieve DMA consent from the service, ");
                                        if (i < 10) {
                                            str2 = "Retrying.";
                                        } else {
                                            str2 = "Skipping.";
                                        }
                                        v0Var.b(Integer.valueOf(s1Var3.Y), androidx.privacysandbox.ads.adservices.java.internal.a.u(sb2, str2, " retryCount"));
                                    } else {
                                        f2 f2VarB = f2.b(100, bundle);
                                        sb.append("&gcs=");
                                        sb.append(f2VarB.f());
                                        o oVarC = o.c(100, bundle);
                                        str = oVarC.d;
                                        sb.append("&dma=");
                                        Boolean bool2 = oVarC.c;
                                        bool = Boolean.FALSE;
                                        sb.append(!Objects.equals(bool2, bool) ? 1 : 0);
                                        if (!TextUtils.isEmpty(str)) {
                                            sb.append("&dma_cps=");
                                            sb.append(str);
                                        }
                                        iOrdinal = f2.d(bundle.getString("ad_personalization")).ordinal();
                                        if (iOrdinal != 2) {
                                            if (iOrdinal != 3) {
                                                bool = null;
                                            } else {
                                                bool = Boolean.TRUE;
                                            }
                                        }
                                        int i2 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                        sb.append("&npa=");
                                        sb.append(i2);
                                        s1.m(x0Var);
                                        x0Var.K.b(sb, "Consent query parameters to Bow");
                                        r4 r4Var = s1Var3.F;
                                        s1.k(r4Var);
                                        ((s1) s1Var3.r().e).A.B();
                                        String str5 = (String) pair.first;
                                        long jG = g1Var.R.g() - 1;
                                        string = sb.toString();
                                        s1Var2 = (s1) r4Var.e;
                                        try {
                                            com.google.android.gms.common.internal.x.d(str5);
                                            com.google.android.gms.common.internal.x.d(strB);
                                            strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + r4Var.h0()) + "&rdid=" + str5 + "&bundleid=" + strB + "&retry=" + jG;
                                            if (strB.equals(s1Var2.A.z("debug.deferred.deeplink"))) {
                                                strConcat = strConcat.concat("&ddl_test=1");
                                            }
                                            if (!string.isEmpty()) {
                                                if (string.charAt(0) != '&') {
                                                    strConcat = strConcat.concat("&");
                                                }
                                                strConcat = strConcat.concat(string);
                                            }
                                            url = new URL(strConcat);
                                        } catch (IllegalArgumentException e3) {
                                            e = e3;
                                            x0 x0Var5 = s1Var2.C;
                                            s1.m(x0Var5);
                                            x0Var5.C.b(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                            url = null;
                                        } catch (MalformedURLException e4) {
                                            e = e4;
                                            x0 x0Var6 = s1Var2.C;
                                            s1.m(x0Var6);
                                            x0Var6.C.b(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                            url = null;
                                        }
                                        if (url != null) {
                                            s1.m(y2Var);
                                            r1 r1Var = new r1(s1Var3);
                                            y2Var.x();
                                            p1 p1Var2 = s1Var4.D;
                                            s1.m(p1Var2);
                                            p1Var2.H(new a1(y2Var, strB, url, (byte[]) null, (HashMap) null, r1Var));
                                        }
                                    }
                                }
                                iVarU = null;
                                if (iVarU != null) {
                                    bundle = iVarU.e;
                                } else {
                                    bundle = null;
                                }
                                if (bundle == null) {
                                    i = s1Var3.Y;
                                    s1Var3.Y = i + 1;
                                    if (i < 10) {
                                    }
                                    s1.m(x0Var);
                                    v0 v0Var2 = x0Var.J;
                                    StringBuilder sb3 = new StringBuilder(69);
                                    sb3.append("Failed to retrieve DMA consent from the service, ");
                                    if (i < 10) {
                                        str2 = "Retrying.";
                                    } else {
                                        str2 = "Skipping.";
                                    }
                                    v0Var2.b(Integer.valueOf(s1Var3.Y), androidx.privacysandbox.ads.adservices.java.internal.a.u(sb3, str2, " retryCount"));
                                } else {
                                    f2 f2VarB2 = f2.b(100, bundle);
                                    sb.append("&gcs=");
                                    sb.append(f2VarB2.f());
                                    o oVarC2 = o.c(100, bundle);
                                    str = oVarC2.d;
                                    sb.append("&dma=");
                                    Boolean bool3 = oVarC2.c;
                                    bool = Boolean.FALSE;
                                    sb.append(!Objects.equals(bool3, bool) ? 1 : 0);
                                    if (!TextUtils.isEmpty(str)) {
                                        sb.append("&dma_cps=");
                                        sb.append(str);
                                    }
                                    iOrdinal = f2.d(bundle.getString("ad_personalization")).ordinal();
                                    if (iOrdinal != 2) {
                                        if (iOrdinal != 3) {
                                            bool = null;
                                        } else {
                                            bool = Boolean.TRUE;
                                        }
                                    }
                                    int i3 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                    sb.append("&npa=");
                                    sb.append(i3);
                                    s1.m(x0Var);
                                    x0Var.K.b(sb, "Consent query parameters to Bow");
                                    r4 r4Var2 = s1Var3.F;
                                    s1.k(r4Var2);
                                    ((s1) s1Var3.r().e).A.B();
                                    String str6 = (String) pair.first;
                                    long jG2 = g1Var.R.g() - 1;
                                    string = sb.toString();
                                    s1Var2 = (s1) r4Var2.e;
                                    com.google.android.gms.common.internal.x.d(str6);
                                    com.google.android.gms.common.internal.x.d(strB);
                                    strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + r4Var2.h0()) + "&rdid=" + str6 + "&bundleid=" + strB + "&retry=" + jG2;
                                    if (strB.equals(s1Var2.A.z("debug.deferred.deeplink"))) {
                                        strConcat = strConcat.concat("&ddl_test=1");
                                    }
                                    if (!string.isEmpty()) {
                                        if (string.charAt(0) != '&') {
                                            strConcat = strConcat.concat("&");
                                        }
                                        strConcat = strConcat.concat(string);
                                    }
                                    url = new URL(strConcat);
                                    if (url != null) {
                                        s1.m(y2Var);
                                        r1 r1Var2 = new r1(s1Var3);
                                        y2Var.x();
                                        p1 p1Var3 = s1Var4.D;
                                        s1.m(p1Var3);
                                        p1Var3.H(new a1(y2Var, strB, url, (byte[]) null, (HashMap) null, r1Var2));
                                    }
                                }
                                break;
                            } else {
                                r4 r4Var3 = ((s1) o3VarP2.e).F;
                                s1.k(r4Var3);
                                if (r4Var3.h0() >= 234200) {
                                    v2 v2Var4 = s1Var3.J;
                                    s1.l(v2Var4);
                                    s1 s1Var7 = (s1) v2Var4.e;
                                    v2Var4.v();
                                    o3VarP = s1Var7.p();
                                    s1Var = (s1) o3VarP.e;
                                    o3VarP.v();
                                    o3VarP.w();
                                    k0Var = o3VarP.A;
                                    if (k0Var == null) {
                                        o3VarP.B();
                                        x0 x0Var7 = s1Var.C;
                                        s1.m(x0Var7);
                                        x0Var7.J.a("Failed to get consents; not connected to service yet.");
                                    } else {
                                        iVarU = k0Var.u(o3VarP.L(false));
                                        o3VarP.I();
                                        if (iVarU != null) {
                                            bundle = iVarU.e;
                                        } else {
                                            bundle = null;
                                        }
                                        if (bundle == null) {
                                            i = s1Var3.Y;
                                            s1Var3.Y = i + 1;
                                            if (i < 10) {
                                            }
                                            s1.m(x0Var);
                                            v0 v0Var3 = x0Var.J;
                                            StringBuilder sb4 = new StringBuilder(69);
                                            sb4.append("Failed to retrieve DMA consent from the service, ");
                                            if (i < 10) {
                                                str2 = "Retrying.";
                                            } else {
                                                str2 = "Skipping.";
                                            }
                                            v0Var3.b(Integer.valueOf(s1Var3.Y), androidx.privacysandbox.ads.adservices.java.internal.a.u(sb4, str2, " retryCount"));
                                        } else {
                                            f2 f2VarB3 = f2.b(100, bundle);
                                            sb.append("&gcs=");
                                            sb.append(f2VarB3.f());
                                            o oVarC3 = o.c(100, bundle);
                                            str = oVarC3.d;
                                            sb.append("&dma=");
                                            Boolean bool4 = oVarC3.c;
                                            bool = Boolean.FALSE;
                                            sb.append(!Objects.equals(bool4, bool) ? 1 : 0);
                                            if (!TextUtils.isEmpty(str)) {
                                                sb.append("&dma_cps=");
                                                sb.append(str);
                                            }
                                            iOrdinal = f2.d(bundle.getString("ad_personalization")).ordinal();
                                            if (iOrdinal != 2) {
                                                if (iOrdinal != 3) {
                                                    bool = null;
                                                } else {
                                                    bool = Boolean.TRUE;
                                                }
                                            }
                                            int i4 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                            sb.append("&npa=");
                                            sb.append(i4);
                                            s1.m(x0Var);
                                            x0Var.K.b(sb, "Consent query parameters to Bow");
                                            r4 r4Var4 = s1Var3.F;
                                            s1.k(r4Var4);
                                            ((s1) s1Var3.r().e).A.B();
                                            String str7 = (String) pair.first;
                                            long jG3 = g1Var.R.g() - 1;
                                            string = sb.toString();
                                            s1Var2 = (s1) r4Var4.e;
                                            com.google.android.gms.common.internal.x.d(str7);
                                            com.google.android.gms.common.internal.x.d(strB);
                                            strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + r4Var4.h0()) + "&rdid=" + str7 + "&bundleid=" + strB + "&retry=" + jG3;
                                            if (strB.equals(s1Var2.A.z("debug.deferred.deeplink"))) {
                                                strConcat = strConcat.concat("&ddl_test=1");
                                            }
                                            if (!string.isEmpty()) {
                                                if (string.charAt(0) != '&') {
                                                    strConcat = strConcat.concat("&");
                                                }
                                                strConcat = strConcat.concat(string);
                                            }
                                            url = new URL(strConcat);
                                            if (url != null) {
                                                s1.m(y2Var);
                                                r1 r1Var3 = new r1(s1Var3);
                                                y2Var.x();
                                                p1 p1Var4 = s1Var4.D;
                                                s1.m(p1Var4);
                                                p1Var4.H(new a1(y2Var, strB, url, (byte[]) null, (HashMap) null, r1Var3));
                                            }
                                        }
                                    }
                                    iVarU = null;
                                    if (iVarU != null) {
                                        bundle = iVarU.e;
                                    } else {
                                        bundle = null;
                                    }
                                    if (bundle == null) {
                                        i = s1Var3.Y;
                                        s1Var3.Y = i + 1;
                                        if (i < 10) {
                                        }
                                        s1.m(x0Var);
                                        v0 v0Var4 = x0Var.J;
                                        StringBuilder sb5 = new StringBuilder(69);
                                        sb5.append("Failed to retrieve DMA consent from the service, ");
                                        if (i < 10) {
                                            str2 = "Retrying.";
                                        } else {
                                            str2 = "Skipping.";
                                        }
                                        v0Var4.b(Integer.valueOf(s1Var3.Y), androidx.privacysandbox.ads.adservices.java.internal.a.u(sb5, str2, " retryCount"));
                                    } else {
                                        f2 f2VarB4 = f2.b(100, bundle);
                                        sb.append("&gcs=");
                                        sb.append(f2VarB4.f());
                                        o oVarC4 = o.c(100, bundle);
                                        str = oVarC4.d;
                                        sb.append("&dma=");
                                        Boolean bool5 = oVarC4.c;
                                        bool = Boolean.FALSE;
                                        sb.append(!Objects.equals(bool5, bool) ? 1 : 0);
                                        if (!TextUtils.isEmpty(str)) {
                                            sb.append("&dma_cps=");
                                            sb.append(str);
                                        }
                                        iOrdinal = f2.d(bundle.getString("ad_personalization")).ordinal();
                                        if (iOrdinal != 2) {
                                            if (iOrdinal != 3) {
                                                bool = null;
                                            } else {
                                                bool = Boolean.TRUE;
                                            }
                                        }
                                        int i5 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                        sb.append("&npa=");
                                        sb.append(i5);
                                        s1.m(x0Var);
                                        x0Var.K.b(sb, "Consent query parameters to Bow");
                                        r4 r4Var5 = s1Var3.F;
                                        s1.k(r4Var5);
                                        ((s1) s1Var3.r().e).A.B();
                                        String str8 = (String) pair.first;
                                        long jG4 = g1Var.R.g() - 1;
                                        string = sb.toString();
                                        s1Var2 = (s1) r4Var5.e;
                                        com.google.android.gms.common.internal.x.d(str8);
                                        com.google.android.gms.common.internal.x.d(strB);
                                        strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + r4Var5.h0()) + "&rdid=" + str8 + "&bundleid=" + strB + "&retry=" + jG4;
                                        if (strB.equals(s1Var2.A.z("debug.deferred.deeplink"))) {
                                            strConcat = strConcat.concat("&ddl_test=1");
                                        }
                                        if (!string.isEmpty()) {
                                            if (string.charAt(0) != '&') {
                                                strConcat = strConcat.concat("&");
                                            }
                                            strConcat = strConcat.concat(string);
                                        }
                                        url = new URL(strConcat);
                                        if (url != null) {
                                            s1.m(y2Var);
                                            r1 r1Var4 = new r1(s1Var3);
                                            y2Var.x();
                                            p1 p1Var5 = s1Var4.D;
                                            s1.m(p1Var5);
                                            p1Var5.H(new a1(y2Var, strB, url, (byte[]) null, (HashMap) null, r1Var4));
                                        }
                                    }
                                } else {
                                    r4 r4Var6 = s1Var3.F;
                                    s1.k(r4Var6);
                                    ((s1) s1Var3.r().e).A.B();
                                    String str9 = (String) pair.first;
                                    long jG5 = g1Var.R.g() - 1;
                                    string = sb.toString();
                                    s1Var2 = (s1) r4Var6.e;
                                    com.google.android.gms.common.internal.x.d(str9);
                                    com.google.android.gms.common.internal.x.d(strB);
                                    strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + r4Var6.h0()) + "&rdid=" + str9 + "&bundleid=" + strB + "&retry=" + jG5;
                                    if (strB.equals(s1Var2.A.z("debug.deferred.deeplink"))) {
                                        strConcat = strConcat.concat("&ddl_test=1");
                                    }
                                    if (!string.isEmpty()) {
                                        if (string.charAt(0) != '&') {
                                            strConcat = strConcat.concat("&");
                                        }
                                        strConcat = strConcat.concat(string);
                                    }
                                    url = new URL(strConcat);
                                    if (url != null) {
                                        s1.m(y2Var);
                                        r1 r1Var5 = new r1(s1Var3);
                                        y2Var.x();
                                        p1 p1Var6 = s1Var4.D;
                                        s1.m(p1Var6);
                                        p1Var6.H(new a1(y2Var, strB, url, (byte[]) null, (HashMap) null, r1Var5));
                                    }
                                }
                            }
                        } else {
                            s1.m(x0Var);
                            x0Var.F.a("Network is not available for Deferred Deep Link request. Skipping");
                        }
                    } else {
                        s1.m(x0Var);
                        x0Var.K.a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
                    }
                } else {
                    s1.m(x0Var);
                    x0Var.K.a("ADID collection is disabled from Manifest. Skipping");
                }
                if (z) {
                    v2Var2.P.b(2000L);
                }
                break;
        }
    }
}
