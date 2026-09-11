package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends j0 {
    public String A;
    public int B;
    public String C;
    public String D;
    public long E;
    public final long F;
    public final long G;
    public List H;
    public String I;
    public final String J;
    public int K;
    public String L;
    public String M;
    public long N;
    public String O;
    public String z;

    public p0(s1 s1Var, long j, long j2, String str) {
        super(s1Var);
        this.N = 0L;
        this.O = null;
        this.F = j;
        this.G = j2;
        this.J = str;
    }

    public final void A() {
        String str;
        v();
        s1 s1Var = (s1) this.e;
        g1 g1Var = s1Var.B;
        x0 x0Var = s1Var.C;
        s1.k(g1Var);
        if (g1Var.C().i(e2.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            r4 r4Var = s1Var.F;
            s1.k(r4Var);
            r4Var.v0().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            s1.m(x0Var);
            x0Var.J.a("Analytics Storage consent is not granted");
            str = null;
        }
        s1.m(x0Var);
        x0Var.J.a("Resetting session stitching token to ".concat(str == null ? "null" : "not null"));
        this.M = str;
        s1Var.H.getClass();
        this.N = System.currentTimeMillis();
    }

    public final String B() {
        w();
        com.google.android.gms.common.internal.x.g(this.z);
        return this.z;
    }

    public final String C() {
        v();
        w();
        com.google.android.gms.common.internal.x.g(this.L);
        return this.L;
    }

    @Override // com.google.android.gms.measurement.internal.j0
    public final boolean y() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0269 A[Catch: NameNotFoundException -> 0x0271, TRY_LEAVE, TryCatch #5 {NameNotFoundException -> 0x0271, blocks: (B:99:0x0263, B:101:0x0269), top: B:134:0x0263 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x026c A[PHI: r3 r37
  0x026c: PHI (r3v18 int) = (r3v17 int), (r3v19 int) binds: [B:105:0x0271, B:100:0x0267] A[DONT_GENERATE, DONT_INLINE]
  0x026c: PHI (r37v2 boolean) = (r37v1 boolean), (r37v4 boolean) binds: [B:105:0x0271, B:100:0x0267] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:109:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:110:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:113:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:114:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:117:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:123:0x014f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x0127 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x025a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0102  */
    /* JADX WARN: Code duplicated, block: B:39:0x0109  */
    /* JADX WARN: Code duplicated, block: B:41:0x011c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0134  */
    /* JADX WARN: Code duplicated, block: B:49:0x014d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0186  */
    /* JADX WARN: Code duplicated, block: B:61:0x0197  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:76:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:79:0x0207  */
    /* JADX WARN: Code duplicated, block: B:81:0x021a  */
    /* JADX WARN: Code duplicated, block: B:88:0x022c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0239  */
    /* JADX WARN: Code duplicated, block: B:93:0x023b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0254  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final t4 z(String str) {
        String str2;
        String str3;
        boolean z;
        long j;
        boolean zD;
        boolean z2;
        Class<?> clsLoadClass;
        long j2;
        Object objInvoke;
        String str4;
        long jG;
        long jMin;
        Boolean boolI;
        boolean z3;
        boolean z4;
        String str5;
        Boolean boolI2;
        boolean zBooleanValue;
        s1 s1Var;
        String strB;
        boolean z5;
        int i;
        int i2;
        long j3;
        ApplicationInfo applicationInfoB;
        g0 g0Var;
        int iS;
        long jT;
        v();
        String strB2 = B();
        String strC = C();
        w();
        String str6 = this.A;
        w();
        long j4 = this.B;
        w();
        com.google.android.gms.common.internal.x.g(this.C);
        String str7 = this.C;
        s1 s1Var2 = (s1) this.e;
        g gVar = s1Var2.A;
        x0 x0Var = s1Var2.C;
        g gVar2 = s1Var2.A;
        Context context = s1Var2.e;
        r4 r4Var = s1Var2.F;
        g1 g1Var = s1Var2.B;
        gVar.B();
        w();
        v();
        long j5 = this.E;
        if (j5 == 0) {
            s1.k(r4Var);
            s1 s1Var3 = (s1) r4Var.e;
            String packageName = context.getPackageName();
            r4Var.v();
            com.google.android.gms.common.internal.x.d(packageName);
            PackageManager packageManager = context.getPackageManager();
            z = false;
            MessageDigest messageDigestO = r4.O();
            long jP = -1;
            if (messageDigestO == null) {
                x0 x0Var2 = s1Var3.C;
                s1.m(x0Var2);
                x0Var2.C.a("Could not get MD5 instance");
                str2 = strC;
                str3 = str6;
            } else {
                if (packageManager != null) {
                    try {
                        if (r4Var.e0(context, packageName)) {
                            str2 = strC;
                            str3 = str6;
                            jP = 0;
                        } else {
                            str2 = strC;
                            try {
                                str3 = str6;
                                try {
                                    Signature[] signatureArr = com.google.android.gms.common.wrappers.b.a(context).c(64, s1Var3.e.getPackageName()).signatures;
                                    if (signatureArr == null || signatureArr.length <= 0) {
                                        x0 x0Var3 = s1Var3.C;
                                        s1.m(x0Var3);
                                        x0Var3.F.a("Could not get signatures");
                                    } else {
                                        jP = r4.P(messageDigestO.digest(signatureArr[0].toByteArray()));
                                    }
                                } catch (PackageManager.NameNotFoundException e) {
                                    e = e;
                                    x0 x0Var4 = s1Var3.C;
                                    s1.m(x0Var4);
                                    x0Var4.C.b(e, "Package name not found");
                                    j = 0;
                                }
                            } catch (PackageManager.NameNotFoundException e2) {
                                e = e2;
                                str3 = str6;
                                x0 x0Var5 = s1Var3.C;
                                s1.m(x0Var5);
                                x0Var5.C.b(e, "Package name not found");
                                j = 0;
                                this.E = j;
                                zD = s1Var2.d();
                                s1.k(g1Var);
                                boolean z6 = !g1Var.O;
                                v();
                                if (s1Var2.d()) {
                                    z2 = zD;
                                    if (gVar2.G(null, h0.H0)) {
                                        try {
                                            clsLoadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                                            if (clsLoadClass == null) {
                                                j2 = j;
                                                try {
                                                    objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, context);
                                                    if (objInvoke == null) {
                                                        str4 = null;
                                                    } else {
                                                        try {
                                                            str4 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                                                        } catch (Exception unused) {
                                                            s1.m(x0Var);
                                                            x0Var.H.a("Failed to retrieve Firebase Instance Id");
                                                            str4 = null;
                                                        }
                                                    }
                                                } catch (Exception unused2) {
                                                    s1.m(x0Var);
                                                    x0Var.G.a("Failed to obtain Firebase Analytics instance");
                                                }
                                                s1.k(g1Var);
                                                jG = g1Var.C.g();
                                                jMin = s1Var2.a0;
                                                if (jG != 0) {
                                                    jMin = Math.min(jMin, jG);
                                                }
                                                w();
                                                int i3 = this.K;
                                                boolI = gVar2.I("google_analytics_adid_collection_enabled");
                                                if (boolI != null) {
                                                    z3 = true;
                                                } else {
                                                    z3 = true;
                                                }
                                                s1.k(g1Var);
                                                g1Var.v();
                                                String str8 = str4;
                                                boolean z7 = g1Var.z().getBoolean("deferred_analytics_collection", z);
                                                if (gVar2.L("google_analytics_default_allow_ad_personalization_signals", true) != c2.GRANTED) {
                                                    z4 = true;
                                                } else {
                                                    z4 = false;
                                                }
                                                Boolean boolValueOf = Boolean.valueOf(z4);
                                                List list = this.H;
                                                String strG = g1Var.C().g();
                                                if (this.I == null) {
                                                    s1.k(r4Var);
                                                    this.I = r4Var.t0();
                                                }
                                                String str9 = this.I;
                                                boolean z8 = z3;
                                                if (g1Var.C().i(e2.ANALYTICS_STORAGE)) {
                                                    v();
                                                    if (this.N != 0) {
                                                        s1Var2.H.getClass();
                                                        long jCurrentTimeMillis = System.currentTimeMillis() - this.N;
                                                        if (this.M != null) {
                                                            A();
                                                        }
                                                    }
                                                    if (this.M == null) {
                                                        A();
                                                    }
                                                    str5 = this.M;
                                                } else {
                                                    str5 = null;
                                                }
                                                boolI2 = gVar2.I("google_analytics_sgtm_upload_enabled");
                                                if (boolI2 == null) {
                                                    zBooleanValue = false;
                                                } else {
                                                    zBooleanValue = boolI2.booleanValue();
                                                }
                                                s1.k(r4Var);
                                                s1Var = (s1) r4Var.e;
                                                strB = B();
                                                String str10 = str5;
                                                if (s1Var.e.getPackageManager() == null) {
                                                    z5 = zBooleanValue;
                                                    j3 = 0;
                                                } else {
                                                    try {
                                                        z5 = zBooleanValue;
                                                        i = 0;
                                                        try {
                                                            applicationInfoB = com.google.android.gms.common.wrappers.b.a(s1Var.e).b(0, strB);
                                                            if (applicationInfoB != null) {
                                                                i2 = applicationInfoB.targetSdkVersion;
                                                            } else {
                                                                i2 = i;
                                                            }
                                                        } catch (PackageManager.NameNotFoundException unused3) {
                                                            x0 x0Var6 = s1Var.C;
                                                            s1.m(x0Var6);
                                                            x0Var6.I.b(strB, "PackageManager failed to find running app: app_id");
                                                        }
                                                    } catch (PackageManager.NameNotFoundException unused4) {
                                                        z5 = zBooleanValue;
                                                        i = 0;
                                                    }
                                                    j3 = i2;
                                                }
                                                s1.k(g1Var);
                                                int i4 = g1Var.C().b;
                                                s1.k(g1Var);
                                                g1Var.v();
                                                String str11 = o.b(g1Var.z().getString("dma_consent_settings", null)).b;
                                                com.google.android.gms.internal.measurement.g4.a();
                                                g0Var = h0.P0;
                                                if (gVar2.G(null, g0Var)) {
                                                    s1.k(r4Var);
                                                    iS = r4.S();
                                                } else {
                                                    iS = 0;
                                                }
                                                com.google.android.gms.internal.measurement.g4.a();
                                                if (gVar2.G(null, g0Var)) {
                                                    s1.k(r4Var);
                                                    jT = r4Var.T();
                                                } else {
                                                    jT = 0;
                                                }
                                                String str12 = gVar2.z;
                                                String strValueOf = String.valueOf(f2.h(gVar2.L("google_analytics_default_allow_ad_personalization_signals", true)));
                                                long j6 = s1Var2.a0;
                                                s1.j(s1Var2.R);
                                                return new t4(strB2, str2, str3, j4, str7, 161000L, j2, str, z2, z6, str8, jMin, i3, z8, z7, boolValueOf, this.F, list, strG, str9, str10, z5, j3, i4, str11, iS, jT, str12, strValueOf, j6, com.google.android.datatransport.runtime.backends.c.l(s1Var2.R.A()), gVar2.G(null, h0.e1) ? s1Var2.b0 : 0L);
                                            }
                                        } catch (ClassNotFoundException unused5) {
                                        }
                                        str4 = null;
                                        s1.k(g1Var);
                                        jG = g1Var.C.g();
                                        jMin = s1Var2.a0;
                                        if (jG != 0) {
                                            jMin = Math.min(jMin, jG);
                                        }
                                        w();
                                        int i5 = this.K;
                                        boolI = gVar2.I("google_analytics_adid_collection_enabled");
                                        if (boolI != null) {
                                            z3 = true;
                                        } else {
                                            z3 = true;
                                        }
                                        s1.k(g1Var);
                                        g1Var.v();
                                        String str13 = str4;
                                        boolean z9 = g1Var.z().getBoolean("deferred_analytics_collection", z);
                                        if (gVar2.L("google_analytics_default_allow_ad_personalization_signals", true) != c2.GRANTED) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        Boolean boolValueOf2 = Boolean.valueOf(z4);
                                        List list2 = this.H;
                                        String strG2 = g1Var.C().g();
                                        if (this.I == null) {
                                            s1.k(r4Var);
                                            this.I = r4Var.t0();
                                        }
                                        String str14 = this.I;
                                        boolean z10 = z3;
                                        if (g1Var.C().i(e2.ANALYTICS_STORAGE)) {
                                            str5 = null;
                                        } else {
                                            v();
                                            if (this.N != 0) {
                                                s1Var2.H.getClass();
                                                long jCurrentTimeMillis2 = System.currentTimeMillis() - this.N;
                                                if (this.M != null) {
                                                    A();
                                                }
                                            }
                                            if (this.M == null) {
                                                A();
                                            }
                                            str5 = this.M;
                                        }
                                        boolI2 = gVar2.I("google_analytics_sgtm_upload_enabled");
                                        if (boolI2 == null) {
                                            zBooleanValue = false;
                                        } else {
                                            zBooleanValue = boolI2.booleanValue();
                                        }
                                        s1.k(r4Var);
                                        s1Var = (s1) r4Var.e;
                                        strB = B();
                                        String str15 = str5;
                                        if (s1Var.e.getPackageManager() == null) {
                                            z5 = zBooleanValue;
                                            j3 = 0;
                                        } else {
                                            z5 = zBooleanValue;
                                            i = 0;
                                            applicationInfoB = com.google.android.gms.common.wrappers.b.a(s1Var.e).b(0, strB);
                                            if (applicationInfoB != null) {
                                                i2 = applicationInfoB.targetSdkVersion;
                                            } else {
                                                i2 = i;
                                            }
                                            j3 = i2;
                                        }
                                        s1.k(g1Var);
                                        int i6 = g1Var.C().b;
                                        s1.k(g1Var);
                                        g1Var.v();
                                        String str16 = o.b(g1Var.z().getString("dma_consent_settings", null)).b;
                                        com.google.android.gms.internal.measurement.g4.a();
                                        g0Var = h0.P0;
                                        if (gVar2.G(null, g0Var)) {
                                            s1.k(r4Var);
                                            iS = r4.S();
                                        } else {
                                            iS = 0;
                                        }
                                        com.google.android.gms.internal.measurement.g4.a();
                                        if (gVar2.G(null, g0Var)) {
                                            s1.k(r4Var);
                                            jT = r4Var.T();
                                        } else {
                                            jT = 0;
                                        }
                                        String str17 = gVar2.z;
                                        String strValueOf2 = String.valueOf(f2.h(gVar2.L("google_analytics_default_allow_ad_personalization_signals", true)));
                                        long j7 = s1Var2.a0;
                                        s1.j(s1Var2.R);
                                        if (gVar2.G(null, h0.e1)) {
                                        }
                                        return new t4(strB2, str2, str3, j4, str7, 161000L, j2, str, z2, z6, str13, jMin, i5, z10, z9, boolValueOf2, this.F, list2, strG2, str14, str15, z5, j3, i6, str16, iS, jT, str17, strValueOf2, j7, com.google.android.datatransport.runtime.backends.c.l(s1Var2.R.A()), gVar2.G(null, h0.e1) ? s1Var2.b0 : 0L);
                                    }
                                    s1.m(x0Var);
                                    x0Var.K.a("Disabled IID for tests.");
                                } else {
                                    z2 = zD;
                                }
                                j2 = j;
                                str4 = null;
                                s1.k(g1Var);
                                jG = g1Var.C.g();
                                jMin = s1Var2.a0;
                                if (jG != 0) {
                                    jMin = Math.min(jMin, jG);
                                }
                                w();
                                int i7 = this.K;
                                boolI = gVar2.I("google_analytics_adid_collection_enabled");
                                if (boolI != null) {
                                    z3 = true;
                                } else {
                                    z3 = true;
                                }
                                s1.k(g1Var);
                                g1Var.v();
                                String str18 = str4;
                                boolean z11 = g1Var.z().getBoolean("deferred_analytics_collection", z);
                                if (gVar2.L("google_analytics_default_allow_ad_personalization_signals", true) != c2.GRANTED) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                Boolean boolValueOf3 = Boolean.valueOf(z4);
                                List list3 = this.H;
                                String strG3 = g1Var.C().g();
                                if (this.I == null) {
                                    s1.k(r4Var);
                                    this.I = r4Var.t0();
                                }
                                String str19 = this.I;
                                boolean z12 = z3;
                                if (g1Var.C().i(e2.ANALYTICS_STORAGE)) {
                                    str5 = null;
                                } else {
                                    v();
                                    if (this.N != 0) {
                                        s1Var2.H.getClass();
                                        long jCurrentTimeMillis3 = System.currentTimeMillis() - this.N;
                                        if (this.M != null) {
                                            A();
                                        }
                                    }
                                    if (this.M == null) {
                                        A();
                                    }
                                    str5 = this.M;
                                }
                                boolI2 = gVar2.I("google_analytics_sgtm_upload_enabled");
                                if (boolI2 == null) {
                                    zBooleanValue = false;
                                } else {
                                    zBooleanValue = boolI2.booleanValue();
                                }
                                s1.k(r4Var);
                                s1Var = (s1) r4Var.e;
                                strB = B();
                                String str110 = str5;
                                if (s1Var.e.getPackageManager() == null) {
                                    z5 = zBooleanValue;
                                    j3 = 0;
                                } else {
                                    z5 = zBooleanValue;
                                    i = 0;
                                    applicationInfoB = com.google.android.gms.common.wrappers.b.a(s1Var.e).b(0, strB);
                                    if (applicationInfoB != null) {
                                        i2 = applicationInfoB.targetSdkVersion;
                                    } else {
                                        i2 = i;
                                    }
                                    j3 = i2;
                                }
                                s1.k(g1Var);
                                int i8 = g1Var.C().b;
                                s1.k(g1Var);
                                g1Var.v();
                                String str111 = o.b(g1Var.z().getString("dma_consent_settings", null)).b;
                                com.google.android.gms.internal.measurement.g4.a();
                                g0Var = h0.P0;
                                if (gVar2.G(null, g0Var)) {
                                    s1.k(r4Var);
                                    iS = r4.S();
                                } else {
                                    iS = 0;
                                }
                                com.google.android.gms.internal.measurement.g4.a();
                                if (gVar2.G(null, g0Var)) {
                                    s1.k(r4Var);
                                    jT = r4Var.T();
                                } else {
                                    jT = 0;
                                }
                                String str112 = gVar2.z;
                                String strValueOf3 = String.valueOf(f2.h(gVar2.L("google_analytics_default_allow_ad_personalization_signals", true)));
                                long j8 = s1Var2.a0;
                                s1.j(s1Var2.R);
                                if (gVar2.G(null, h0.e1)) {
                                }
                                return new t4(strB2, str2, str3, j4, str7, 161000L, j2, str, z2, z6, str18, jMin, i7, z12, z11, boolValueOf3, this.F, list3, strG3, str19, str110, z5, j3, i8, str111, iS, jT, str112, strValueOf3, j8, com.google.android.datatransport.runtime.backends.c.l(s1Var2.R.A()), gVar2.G(null, h0.e1) ? s1Var2.b0 : 0L);
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e3) {
                        e = e3;
                        str2 = strC;
                    }
                } else {
                    str2 = strC;
                    str3 = str6;
                }
                j = 0;
                this.E = j;
            }
            j = jP;
            this.E = j;
        } else {
            str2 = strC;
            str3 = str6;
            z = false;
            j = j5;
        }
        zD = s1Var2.d();
        s1.k(g1Var);
        boolean z13 = !g1Var.O;
        v();
        if (s1Var2.d()) {
            z2 = zD;
        } else {
            z2 = zD;
            if (gVar2.G(null, h0.H0)) {
                clsLoadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                if (clsLoadClass == null) {
                    j2 = j;
                    objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, context);
                    if (objInvoke == null) {
                        str4 = null;
                    } else {
                        str4 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                    }
                    s1.k(g1Var);
                    jG = g1Var.C.g();
                    jMin = s1Var2.a0;
                    if (jG != 0) {
                        jMin = Math.min(jMin, jG);
                    }
                    w();
                    int i9 = this.K;
                    boolI = gVar2.I("google_analytics_adid_collection_enabled");
                    if (boolI != null || boolI.booleanValue()) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    s1.k(g1Var);
                    g1Var.v();
                    String str113 = str4;
                    boolean z14 = g1Var.z().getBoolean("deferred_analytics_collection", z);
                    if (gVar2.L("google_analytics_default_allow_ad_personalization_signals", true) != c2.GRANTED) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    Boolean boolValueOf4 = Boolean.valueOf(z4);
                    List list4 = this.H;
                    String strG4 = g1Var.C().g();
                    if (this.I == null) {
                        s1.k(r4Var);
                        this.I = r4Var.t0();
                    }
                    String str114 = this.I;
                    boolean z15 = z3;
                    if (g1Var.C().i(e2.ANALYTICS_STORAGE)) {
                        str5 = null;
                    } else {
                        v();
                        if (this.N != 0) {
                            s1Var2.H.getClass();
                            long jCurrentTimeMillis4 = System.currentTimeMillis() - this.N;
                            if (this.M != null && jCurrentTimeMillis4 > 86400000 && this.O == null) {
                                A();
                            }
                        }
                        if (this.M == null) {
                            A();
                        }
                        str5 = this.M;
                    }
                    boolI2 = gVar2.I("google_analytics_sgtm_upload_enabled");
                    if (boolI2 == null) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = boolI2.booleanValue();
                    }
                    s1.k(r4Var);
                    s1Var = (s1) r4Var.e;
                    strB = B();
                    String str115 = str5;
                    if (s1Var.e.getPackageManager() == null) {
                        z5 = zBooleanValue;
                        j3 = 0;
                    } else {
                        z5 = zBooleanValue;
                        i = 0;
                        applicationInfoB = com.google.android.gms.common.wrappers.b.a(s1Var.e).b(0, strB);
                        if (applicationInfoB != null) {
                            i2 = applicationInfoB.targetSdkVersion;
                        } else {
                            i2 = i;
                        }
                        j3 = i2;
                    }
                    s1.k(g1Var);
                    int i10 = g1Var.C().b;
                    s1.k(g1Var);
                    g1Var.v();
                    String str116 = o.b(g1Var.z().getString("dma_consent_settings", null)).b;
                    com.google.android.gms.internal.measurement.g4.a();
                    g0Var = h0.P0;
                    if (gVar2.G(null, g0Var)) {
                        s1.k(r4Var);
                        iS = r4.S();
                    } else {
                        iS = 0;
                    }
                    com.google.android.gms.internal.measurement.g4.a();
                    if (gVar2.G(null, g0Var)) {
                        s1.k(r4Var);
                        jT = r4Var.T();
                    } else {
                        jT = 0;
                    }
                    String str117 = gVar2.z;
                    String strValueOf4 = String.valueOf(f2.h(gVar2.L("google_analytics_default_allow_ad_personalization_signals", true)));
                    long j9 = s1Var2.a0;
                    s1.j(s1Var2.R);
                    if (gVar2.G(null, h0.e1)) {
                    }
                    return new t4(strB2, str2, str3, j4, str7, 161000L, j2, str, z2, z13, str113, jMin, i9, z15, z14, boolValueOf4, this.F, list4, strG4, str114, str115, z5, j3, i10, str116, iS, jT, str117, strValueOf4, j9, com.google.android.datatransport.runtime.backends.c.l(s1Var2.R.A()), gVar2.G(null, h0.e1) ? s1Var2.b0 : 0L);
                }
                str4 = null;
                s1.k(g1Var);
                jG = g1Var.C.g();
                jMin = s1Var2.a0;
                if (jG != 0) {
                    jMin = Math.min(jMin, jG);
                }
                w();
                int i11 = this.K;
                boolI = gVar2.I("google_analytics_adid_collection_enabled");
                if (boolI != null) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                s1.k(g1Var);
                g1Var.v();
                String str118 = str4;
                boolean z16 = g1Var.z().getBoolean("deferred_analytics_collection", z);
                if (gVar2.L("google_analytics_default_allow_ad_personalization_signals", true) != c2.GRANTED) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Boolean boolValueOf5 = Boolean.valueOf(z4);
                List list5 = this.H;
                String strG5 = g1Var.C().g();
                if (this.I == null) {
                    s1.k(r4Var);
                    this.I = r4Var.t0();
                }
                String str119 = this.I;
                boolean z17 = z3;
                if (g1Var.C().i(e2.ANALYTICS_STORAGE)) {
                    str5 = null;
                } else {
                    v();
                    if (this.N != 0) {
                        s1Var2.H.getClass();
                        long jCurrentTimeMillis5 = System.currentTimeMillis() - this.N;
                        if (this.M != null) {
                            A();
                        }
                    }
                    if (this.M == null) {
                        A();
                    }
                    str5 = this.M;
                }
                boolI2 = gVar2.I("google_analytics_sgtm_upload_enabled");
                if (boolI2 == null) {
                    zBooleanValue = false;
                } else {
                    zBooleanValue = boolI2.booleanValue();
                }
                s1.k(r4Var);
                s1Var = (s1) r4Var.e;
                strB = B();
                String str1110 = str5;
                if (s1Var.e.getPackageManager() == null) {
                    z5 = zBooleanValue;
                    j3 = 0;
                } else {
                    z5 = zBooleanValue;
                    i = 0;
                    applicationInfoB = com.google.android.gms.common.wrappers.b.a(s1Var.e).b(0, strB);
                    if (applicationInfoB != null) {
                        i2 = applicationInfoB.targetSdkVersion;
                    } else {
                        i2 = i;
                    }
                    j3 = i2;
                }
                s1.k(g1Var);
                int i12 = g1Var.C().b;
                s1.k(g1Var);
                g1Var.v();
                String str1111 = o.b(g1Var.z().getString("dma_consent_settings", null)).b;
                com.google.android.gms.internal.measurement.g4.a();
                g0Var = h0.P0;
                if (gVar2.G(null, g0Var)) {
                    s1.k(r4Var);
                    iS = r4.S();
                } else {
                    iS = 0;
                }
                com.google.android.gms.internal.measurement.g4.a();
                if (gVar2.G(null, g0Var)) {
                    s1.k(r4Var);
                    jT = r4Var.T();
                } else {
                    jT = 0;
                }
                String str1112 = gVar2.z;
                String strValueOf5 = String.valueOf(f2.h(gVar2.L("google_analytics_default_allow_ad_personalization_signals", true)));
                long j10 = s1Var2.a0;
                s1.j(s1Var2.R);
                if (gVar2.G(null, h0.e1)) {
                }
                return new t4(strB2, str2, str3, j4, str7, 161000L, j2, str, z2, z13, str118, jMin, i11, z17, z16, boolValueOf5, this.F, list5, strG5, str119, str1110, z5, j3, i12, str1111, iS, jT, str1112, strValueOf5, j10, com.google.android.datatransport.runtime.backends.c.l(s1Var2.R.A()), gVar2.G(null, h0.e1) ? s1Var2.b0 : 0L);
            }
            s1.m(x0Var);
            x0Var.K.a("Disabled IID for tests.");
        }
        j2 = j;
        str4 = null;
        s1.k(g1Var);
        jG = g1Var.C.g();
        jMin = s1Var2.a0;
        if (jG != 0) {
            jMin = Math.min(jMin, jG);
        }
        w();
        int i13 = this.K;
        boolI = gVar2.I("google_analytics_adid_collection_enabled");
        if (boolI != null) {
            z3 = true;
        } else {
            z3 = true;
        }
        s1.k(g1Var);
        g1Var.v();
        String str1113 = str4;
        boolean z18 = g1Var.z().getBoolean("deferred_analytics_collection", z);
        if (gVar2.L("google_analytics_default_allow_ad_personalization_signals", true) != c2.GRANTED) {
            z4 = true;
        } else {
            z4 = false;
        }
        Boolean boolValueOf6 = Boolean.valueOf(z4);
        List list6 = this.H;
        String strG6 = g1Var.C().g();
        if (this.I == null) {
            s1.k(r4Var);
            this.I = r4Var.t0();
        }
        String str1114 = this.I;
        boolean z19 = z3;
        if (g1Var.C().i(e2.ANALYTICS_STORAGE)) {
            str5 = null;
        } else {
            v();
            if (this.N != 0) {
                s1Var2.H.getClass();
                long jCurrentTimeMillis6 = System.currentTimeMillis() - this.N;
                if (this.M != null) {
                    A();
                }
            }
            if (this.M == null) {
                A();
            }
            str5 = this.M;
        }
        boolI2 = gVar2.I("google_analytics_sgtm_upload_enabled");
        if (boolI2 == null) {
            zBooleanValue = false;
        } else {
            zBooleanValue = boolI2.booleanValue();
        }
        s1.k(r4Var);
        s1Var = (s1) r4Var.e;
        strB = B();
        String str1115 = str5;
        if (s1Var.e.getPackageManager() == null) {
            z5 = zBooleanValue;
            j3 = 0;
        } else {
            z5 = zBooleanValue;
            i = 0;
            applicationInfoB = com.google.android.gms.common.wrappers.b.a(s1Var.e).b(0, strB);
            if (applicationInfoB != null) {
                i2 = applicationInfoB.targetSdkVersion;
            } else {
                i2 = i;
            }
            j3 = i2;
        }
        s1.k(g1Var);
        int i14 = g1Var.C().b;
        s1.k(g1Var);
        g1Var.v();
        String str1116 = o.b(g1Var.z().getString("dma_consent_settings", null)).b;
        com.google.android.gms.internal.measurement.g4.a();
        g0Var = h0.P0;
        if (gVar2.G(null, g0Var)) {
            s1.k(r4Var);
            iS = r4.S();
        } else {
            iS = 0;
        }
        com.google.android.gms.internal.measurement.g4.a();
        if (gVar2.G(null, g0Var)) {
            s1.k(r4Var);
            jT = r4Var.T();
        } else {
            jT = 0;
        }
        String str1117 = gVar2.z;
        String strValueOf6 = String.valueOf(f2.h(gVar2.L("google_analytics_default_allow_ad_personalization_signals", true)));
        long j11 = s1Var2.a0;
        s1.j(s1Var2.R);
        if (gVar2.G(null, h0.e1)) {
        }
        return new t4(strB2, str2, str3, j4, str7, 161000L, j2, str, z2, z13, str1113, jMin, i13, z19, z18, boolValueOf6, this.F, list6, strG6, str1114, str1115, z5, j3, i14, str1116, iS, jT, str1117, strValueOf6, j11, com.google.android.datatransport.runtime.backends.c.l(s1Var2.R.A()), gVar2.G(null, h0.e1) ? s1Var2.b0 : 0L);
    }
}
