package com.google.common.util.concurrent;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.foundation.lazy.layout.b1;
import androidx.media3.exoplayer.l1;
import com.google.android.gms.internal.measurement.b6;
import com.google.android.gms.internal.measurement.dd;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.ic;
import com.google.android.gms.internal.measurement.j5;
import com.google.android.gms.internal.measurement.j6;
import com.google.android.gms.internal.measurement.mc;
import com.google.android.gms.internal.measurement.o5;
import com.google.android.gms.internal.measurement.p5;
import com.google.android.gms.internal.measurement.pc;
import com.google.android.gms.internal.measurement.qc;
import com.google.android.gms.internal.measurement.r5;
import com.google.android.gms.internal.measurement.s5;
import com.google.android.gms.internal.measurement.t1;
import com.google.android.gms.internal.measurement.zc;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.b2;
import com.google.android.gms.measurement.internal.c2;
import com.google.android.gms.measurement.internal.c3;
import com.google.android.gms.measurement.internal.e2;
import com.google.android.gms.measurement.internal.f1;
import com.google.android.gms.measurement.internal.f2;
import com.google.android.gms.measurement.internal.g1;
import com.google.android.gms.measurement.internal.g2;
import com.google.android.gms.measurement.internal.h1;
import com.google.android.gms.measurement.internal.i2;
import com.google.android.gms.measurement.internal.j3;
import com.google.android.gms.measurement.internal.k2;
import com.google.android.gms.measurement.internal.l4;
import com.google.android.gms.measurement.internal.m3;
import com.google.android.gms.measurement.internal.n3;
import com.google.android.gms.measurement.internal.o3;
import com.google.android.gms.measurement.internal.p1;
import com.google.android.gms.measurement.internal.r1;
import com.google.android.gms.measurement.internal.r3;
import com.google.android.gms.measurement.internal.r4;
import com.google.android.gms.measurement.internal.s1;
import com.google.android.gms.measurement.internal.t4;
import com.google.android.gms.measurement.internal.v2;
import com.google.android.gms.measurement.internal.w3;
import com.google.android.gms.measurement.internal.z1;
import com.google.android.gms.measurement.internal.z2;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements Runnable {
    public final /* synthetic */ int e;
    public final Object y;
    public final Object z;

    public l0(v2 v2Var, b6 b6Var) {
        this.e = 13;
        this.y = b6Var;
        Objects.requireNonNull(v2Var);
        this.z = v2Var;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:103:0x02c3 A[Catch: NotFoundException -> 0x02c8, TRY_LEAVE, TryCatch #0 {NotFoundException -> 0x02c8, blocks: (B:100:0x02b2, B:103:0x02c3), top: B:296:0x02b2 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:111:0x02de  */
    /* JADX WARN: Code duplicated, block: B:112:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:115:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:118:0x0307 A[EDGE_INSN: B:118:0x0307->B:119:0x0309 BREAK  A[LOOP:0: B:113:0x02ed->B:312:?]] */
    /* JADX WARN: Code duplicated, block: B:120:0x030b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0312  */
    /* JADX WARN: Code duplicated, block: B:124:0x032f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0379  */
    /* JADX WARN: Code duplicated, block: B:127:0x0382  */
    /* JADX WARN: Code duplicated, block: B:130:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:133:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:134:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:137:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:140:0x03f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:142:0x03f7 A[PHI: r13
  0x03f7: PHI (r13v20 boolean) = (r13v8 boolean), (r13v7 boolean) binds: [B:141:0x03f6, B:138:0x03f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:144:0x041c  */
    /* JADX WARN: Code duplicated, block: B:145:0x0420  */
    /* JADX WARN: Code duplicated, block: B:147:0x0424  */
    /* JADX WARN: Code duplicated, block: B:148:0x0428  */
    /* JADX WARN: Code duplicated, block: B:151:0x043a  */
    /* JADX WARN: Code duplicated, block: B:152:0x0452  */
    /* JADX WARN: Code duplicated, block: B:155:0x0479 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:156:0x047b  */
    /* JADX WARN: Code duplicated, block: B:160:0x049d  */
    /* JADX WARN: Code duplicated, block: B:161:0x04b1 A[PHI: r28 r29 r30
  0x04b1: PHI (r28v2 com.google.android.gms.measurement.internal.s1) = (r28v0 com.google.android.gms.measurement.internal.s1), (r28v3 com.google.android.gms.measurement.internal.s1) binds: [B:159:0x049b, B:157:0x047e] A[DONT_GENERATE, DONT_INLINE]
  0x04b1: PHI (r29v2 com.google.android.gms.measurement.internal.v0) = (r29v0 com.google.android.gms.measurement.internal.v0), (r29v3 com.google.android.gms.measurement.internal.v0) binds: [B:159:0x049b, B:157:0x047e] A[DONT_GENERATE, DONT_INLINE]
  0x04b1: PHI (r30v2 com.google.android.gms.measurement.internal.r4) = (r30v0 com.google.android.gms.measurement.internal.r4), (r30v3 com.google.android.gms.measurement.internal.r4) binds: [B:159:0x049b, B:157:0x047e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:163:0x04bf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:171:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:175:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:176:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:179:0x0513  */
    /* JADX WARN: Code duplicated, block: B:182:0x0523  */
    /* JADX WARN: Code duplicated, block: B:185:0x0542  */
    /* JADX WARN: Code duplicated, block: B:187:0x0550 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:193:0x056d  */
    /* JADX WARN: Code duplicated, block: B:195:0x0573  */
    /* JADX WARN: Code duplicated, block: B:197:0x0591  */
    /* JADX WARN: Code duplicated, block: B:201:0x05be  */
    /* JADX WARN: Code duplicated, block: B:204:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:209:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:211:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:213:0x0601  */
    /* JADX WARN: Code duplicated, block: B:214:0x060c  */
    /* JADX WARN: Code duplicated, block: B:217:0x0616  */
    /* JADX WARN: Code duplicated, block: B:220:0x062c  */
    /* JADX WARN: Code duplicated, block: B:224:0x0638  */
    /* JADX WARN: Code duplicated, block: B:227:0x0646  */
    /* JADX WARN: Code duplicated, block: B:230:0x065a  */
    /* JADX WARN: Code duplicated, block: B:231:0x065f  */
    /* JADX WARN: Code duplicated, block: B:233:0x0671  */
    /* JADX WARN: Code duplicated, block: B:235:0x0691 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:246:0x0707  */
    /* JADX WARN: Code duplicated, block: B:248:0x0723  */
    /* JADX WARN: Code duplicated, block: B:251:0x072f  */
    /* JADX WARN: Code duplicated, block: B:260:0x0779  */
    /* JADX WARN: Code duplicated, block: B:262:0x0781  */
    /* JADX WARN: Code duplicated, block: B:263:0x0783  */
    /* JADX WARN: Code duplicated, block: B:265:0x078b  */
    /* JADX WARN: Code duplicated, block: B:269:0x0798  */
    /* JADX WARN: Code duplicated, block: B:273:0x07cd  */
    /* JADX WARN: Code duplicated, block: B:275:0x07d8  */
    /* JADX WARN: Code duplicated, block: B:276:0x07da  */
    /* JADX WARN: Code duplicated, block: B:278:0x07dd  */
    /* JADX WARN: Code duplicated, block: B:280:0x080e  */
    /* JADX WARN: Code duplicated, block: B:283:0x0824  */
    /* JADX WARN: Code duplicated, block: B:287:0x0838  */
    /* JADX WARN: Code duplicated, block: B:296:0x02b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:310:0x0307 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0188 A[Catch: NameNotFoundException -> 0x01a5, TryCatch #3 {NameNotFoundException -> 0x01a5, blocks: (B:41:0x017d, B:43:0x0188, B:45:0x0194), top: B:302:0x017d }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0194 A[Catch: NameNotFoundException -> 0x01a5, TRY_LEAVE, TryCatch #3 {NameNotFoundException -> 0x01a5, blocks: (B:41:0x017d, B:43:0x0188, B:45:0x0194), top: B:302:0x017d }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0199  */
    /* JADX WARN: Code duplicated, block: B:56:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:58:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:60:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:62:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:64:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:66:0x01df  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:70:0x0203  */
    /* JADX WARN: Code duplicated, block: B:71:0x020e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0219  */
    /* JADX WARN: Code duplicated, block: B:73:0x0224  */
    /* JADX WARN: Code duplicated, block: B:74:0x022f  */
    /* JADX WARN: Code duplicated, block: B:75:0x023a  */
    /* JADX WARN: Code duplicated, block: B:79:0x024e  */
    /* JADX WARN: Code duplicated, block: B:80:0x024f A[Catch: IllegalStateException -> 0x0270, TryCatch #1 {IllegalStateException -> 0x0270, blocks: (B:77:0x0246, B:81:0x0255, B:85:0x025d, B:87:0x0261, B:80:0x024f), top: B:298:0x0246 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x025b  */
    /* JADX WARN: Code duplicated, block: B:84:0x025c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0261 A[Catch: IllegalStateException -> 0x0270, TRY_LEAVE, TryCatch #1 {IllegalStateException -> 0x0270, blocks: (B:77:0x0246, B:81:0x0255, B:85:0x025d, B:87:0x0261, B:80:0x024f), top: B:298:0x0246 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0293  */
    /* JADX WARN: Code duplicated, block: B:95:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:98:0x02a8  */
    /* JADX WARN: Type inference failed for: r0v44, types: [com.google.android.gms.measurement.internal.u2] */
    private final void a() throws Throwable {
        com.google.android.gms.measurement.internal.p0 p0Var;
        String str;
        String string;
        int i;
        String str2;
        PackageInfo packageInfo;
        CharSequence applicationLabel;
        int iG;
        List listAsList;
        s1 s1Var;
        Bundle bundleH;
        Integer numValueOf;
        String[] stringArray;
        z2 z2Var;
        com.google.android.gms.measurement.internal.v0 v0Var;
        com.google.android.gms.measurement.internal.v0 v0Var2;
        com.google.android.gms.measurement.internal.v0 v0Var3;
        com.google.android.gms.measurement.internal.v0 v0Var4;
        String strB;
        int i2;
        AtomicInteger atomicInteger;
        long j;
        final v2 v2Var;
        int iA;
        boolean zG;
        boolean z;
        com.google.android.gms.measurement.internal.v0 v0Var5;
        com.google.android.gms.measurement.internal.x0 x0Var;
        b1 b1Var;
        f2 f2VarC;
        c2 c2VarL;
        c2 c2VarL2;
        e2 e2Var;
        c2 c2Var;
        s1 s1Var2;
        com.google.android.gms.measurement.internal.v0 v0Var6;
        r4 r4Var;
        f2 f2Var;
        boolean z2;
        s1 s1Var3;
        c2 c2VarL3;
        c2 c2VarL4;
        Boolean boolI;
        l1 l1Var;
        r1 r1Var;
        s1 s1Var4;
        r4 r4Var2;
        b1 b1Var2;
        com.google.android.gms.measurement.internal.x0 x0Var2;
        boolean zD;
        SharedPreferences sharedPreferences;
        boolean zContains;
        boolean zIsEmpty;
        boolean z3;
        long jMax;
        com.google.android.gms.measurement.internal.v0 v0Var7;
        Context context;
        IntentFilter intentFilter;
        androidx.media3.common.util.t tVar;
        boolean z4;
        Context context2;
        int i3;
        Iterator it;
        String str3;
        r4 r4Var3;
        String strB2;
        Bundle bundle;
        s1 s1Var5 = (s1) this.z;
        i2 i2Var = (i2) this.y;
        p1 p1Var = s1Var5.D;
        com.google.android.gms.measurement.internal.x0 x0Var3 = s1Var5.C;
        g1 g1Var = s1Var5.B;
        r4 r4Var4 = s1Var5.F;
        s1.m(p1Var);
        p1Var.v();
        com.google.android.gms.measurement.internal.g gVar = s1Var5.A;
        ((s1) gVar.e).getClass();
        com.google.android.gms.measurement.internal.p pVar = new com.google.android.gms.measurement.internal.p(s1Var5);
        pVar.y();
        s1Var5.P = pVar;
        j6 j6Var = i2Var.d;
        long j2 = j6Var == null ? 0L : j6Var.e;
        String string2 = "";
        if (j6Var != null && (bundle = j6Var.A) != null) {
            string2 = bundle.getString("runtime_google_app_id", "");
        }
        com.google.android.gms.measurement.internal.p0 p0Var2 = new com.google.android.gms.measurement.internal.p0(s1Var5, i2Var.c, j2, string2);
        p0Var2.x();
        s1Var5.Q = p0Var2;
        com.google.android.gms.measurement.internal.r0 r0Var = new com.google.android.gms.measurement.internal.r0(s1Var5);
        r0Var.x();
        s1Var5.N = r0Var;
        o3 o3Var = new o3(s1Var5);
        o3Var.x();
        s1Var5.O = o3Var;
        boolean z5 = r4Var4.y;
        s1 s1Var6 = (s1) r4Var4.e;
        if (z5) {
            net.luminis.tls.engine.impl.c.r("Can't initialize twice");
            return;
        }
        r4Var4.v();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                com.google.android.gms.measurement.internal.x0 x0Var4 = ((s1) r4Var4.e).C;
                s1.m(x0Var4);
                x0Var4.F.a("Utils falling back to Random for random id");
            }
        }
        r4Var4.A.set(jNextLong);
        s1Var6.Z.incrementAndGet();
        r4Var4.y = true;
        if (g1Var.y) {
            net.luminis.tls.engine.impl.c.r("Can't initialize twice");
            return;
        }
        SharedPreferences sharedPreferences2 = ((s1) g1Var.e).e.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        g1Var.z = sharedPreferences2;
        boolean z6 = sharedPreferences2.getBoolean("has_been_opened", false);
        g1Var.O = z6;
        if (!z6) {
            SharedPreferences.Editor editorEdit = g1Var.z.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        g1Var.B = new f1(g1Var, Math.max(0L, ((Long) com.google.android.gms.measurement.internal.h0.d.a(null)).longValue()));
        ((s1) g1Var.e).Z.incrementAndGet();
        g1Var.y = true;
        com.google.android.gms.measurement.internal.p0 p0Var3 = s1Var5.Q;
        if (p0Var3.y) {
            net.luminis.tls.engine.impl.c.r("Can't initialize twice");
            return;
        }
        s1 s1Var7 = (s1) p0Var3.e;
        com.google.android.gms.measurement.internal.x0 x0Var5 = s1Var7.C;
        com.google.android.gms.measurement.internal.x0 x0Var6 = s1Var7.C;
        s1.m(x0Var5);
        x0Var5.K.c(Long.valueOf(p0Var3.G), Long.valueOf(p0Var3.F), "sdkVersion bundled with app, dynamiteVersion");
        Context context3 = s1Var7.e;
        String packageName = context3.getPackageName();
        PackageManager packageManager = context3.getPackageManager();
        String str4 = "";
        String str5 = "Unknown";
        String installerPackageName = "unknown";
        try {
            if (packageManager != null) {
                p0Var = p0Var2;
                str = "Can't initialize twice";
                try {
                    installerPackageName = packageManager.getInstallerPackageName(packageName);
                } catch (IllegalArgumentException unused) {
                    s1.m(x0Var6);
                    x0Var6.C.b(com.google.android.gms.measurement.internal.x0.D(packageName), "Error retrieving app installer package name. appId");
                }
                String str6 = installerPackageName;
                try {
                    if (str6 != null) {
                        if ("com.android.vending".equals(str6)) {
                            installerPackageName = "";
                        }
                        packageInfo = packageManager.getPackageInfo(context3.getPackageName(), 0);
                        if (packageInfo != null) {
                            applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                            if (TextUtils.isEmpty(applicationLabel)) {
                                string = "Unknown";
                            } else {
                                string = applicationLabel.toString();
                            }
                            try {
                                str2 = packageInfo.versionName;
                                try {
                                    i = packageInfo.versionCode;
                                } catch (PackageManager.NameNotFoundException unused2) {
                                    str5 = str2;
                                    s1.m(x0Var6);
                                    x0Var6.C.c(com.google.android.gms.measurement.internal.x0.D(packageName), string, "Error retrieving package info. appId, appName");
                                    i = Integer.MIN_VALUE;
                                    str2 = str5;
                                }
                            } catch (PackageManager.NameNotFoundException unused3) {
                            }
                        }
                        String str7 = installerPackageName;
                        p0Var3.z = packageName;
                        p0Var3.C = str7;
                        p0Var3.A = str2;
                        p0Var3.B = i;
                        p0Var3.D = string;
                        p0Var3.E = 0L;
                        iG = s1Var7.g();
                        if (iG == 0) {
                            s1.m(x0Var6);
                            x0Var6.K.a("App measurement collection enabled");
                        } else if (iG == 1) {
                            s1.m(x0Var6);
                            x0Var6.I.a("App measurement deactivated via the manifest");
                        } else if (iG == 3) {
                            s1.m(x0Var6);
                            x0Var6.I.a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                        } else if (iG == 4) {
                            s1.m(x0Var6);
                            x0Var6.I.a("App measurement disabled via the manifest");
                        } else if (iG == 6) {
                            s1.m(x0Var6);
                            x0Var6.H.a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                        } else if (iG == 7) {
                            s1.m(x0Var6);
                            x0Var6.I.a("App measurement disabled via the global data collection setting");
                        } else if (iG != 8) {
                            s1.m(x0Var6);
                            x0Var6.I.a("App measurement disabled");
                            s1.m(x0Var6);
                            x0Var6.D.a("Invalid scion state in identity");
                        } else {
                            s1.m(x0Var6);
                            x0Var6.I.a("App measurement disabled due to denied storage consent");
                        }
                        p0Var3.L = "";
                        strB2 = p0Var3.J;
                        if (TextUtils.isEmpty(strB2)) {
                            strB2 = g2.b(context3, s1Var7.M);
                        }
                        if (!TextUtils.isEmpty(strB2)) {
                            str4 = strB2;
                        }
                        p0Var3.L = str4;
                        if (iG == 0) {
                            s1.m(x0Var6);
                            x0Var6.K.c(p0Var3.z, p0Var3.L, "App measurement enabled for app package, google app id");
                        }
                        listAsList = null;
                        p0Var3.H = null;
                        com.google.android.gms.measurement.internal.g gVar2 = s1Var7.A;
                        s1Var = (s1) gVar2.e;
                        com.google.android.gms.common.internal.x.d("analytics.safelisted_events");
                        bundleH = gVar2.H();
                        if (bundleH != null) {
                            if (bundleH.containsKey("analytics.safelisted_events")) {
                                numValueOf = Integer.valueOf(bundleH.getInt("analytics.safelisted_events"));
                            }
                            if (numValueOf != null) {
                                try {
                                    stringArray = s1Var.e.getResources().getStringArray(numValueOf.intValue());
                                    if (stringArray == null) {
                                        listAsList = Arrays.asList(stringArray);
                                    }
                                } catch (Resources.NotFoundException e) {
                                    com.google.android.gms.measurement.internal.x0 x0Var7 = s1Var.C;
                                    s1.m(x0Var7);
                                    x0Var7.C.b(e, "Failed to load string array from metadata: resource not found");
                                }
                            }
                            if (listAsList != null) {
                                p0Var3.H = listAsList;
                                break;
                            }
                            if (listAsList.isEmpty()) {
                                it = listAsList.iterator();
                                do {
                                    if (it.hasNext()) {
                                        p0Var3.H = listAsList;
                                        break;
                                    } else {
                                        str3 = (String) it.next();
                                        r4Var3 = s1Var7.F;
                                        s1.k(r4Var3);
                                    }
                                } while (r4Var3.A0("safelisted event", str3));
                            } else {
                                s1.m(x0Var6);
                                x0Var6.H.a("Safelisted event list is empty. Ignoring");
                            }
                            if (packageManager != null) {
                                p0Var3.K = com.google.android.gms.common.wrappers.a.e(context3) ? 1 : 0;
                            } else {
                                p0Var3.K = 0;
                            }
                            ((s1) p0Var3.e).Z.incrementAndGet();
                            p0Var3.y = true;
                            z2Var = new z2(s1Var5);
                            z2Var.x();
                            s1Var5.R = z2Var;
                            if (!z2Var.y) {
                                net.luminis.tls.engine.impl.c.r(str);
                                return;
                            }
                            z2Var.z = (JobScheduler) ((s1) z2Var.e).e.getSystemService("jobscheduler");
                            ((s1) z2Var.e).Z.incrementAndGet();
                            z2Var.y = true;
                            s1.m(x0Var3);
                            v0Var = x0Var3.J;
                            v0Var2 = x0Var3.I;
                            v0Var3 = x0Var3.K;
                            v0Var4 = x0Var3.C;
                            gVar.B();
                            v0Var2.b(161000L, "App measurement initialized, version");
                            s1.m(x0Var3);
                            v0Var2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                            strB = p0Var.B();
                            if (r4Var4.b0(strB, gVar.z)) {
                                s1.m(x0Var3);
                                v0Var2.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                            } else {
                                s1.m(x0Var3);
                                v0Var2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strB)));
                            }
                            s1.m(x0Var3);
                            v0Var.a("Debug-level message logging enabled");
                            i2 = s1Var5.X;
                            atomicInteger = s1Var5.Z;
                            if (i2 != atomicInteger.get()) {
                                s1.m(x0Var3);
                                v0Var4.c(Integer.valueOf(s1Var5.X), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                            }
                            s1Var5.S = true;
                            j = s1Var5.a0;
                            v2Var = s1Var5.J;
                            p1 p1Var2 = s1Var5.D;
                            s1.m(p1Var2);
                            p1Var2.v();
                            s1.j(s1Var5.R);
                            iA = s1Var5.R.A();
                            g4.a();
                            zG = gVar.G(null, com.google.android.gms.measurement.internal.h0.P0);
                            if (iA == 2) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (zG) {
                                r4Var4.v();
                                if (r4Var4.T() == 1) {
                                    r4Var4.v();
                                    intentFilter = new IntentFilter();
                                    intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                    intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                    tVar = new androidx.media3.common.util.t(s1Var6);
                                    z4 = z;
                                    context2 = s1Var6.e;
                                    x0Var = x0Var3;
                                    i3 = Build.VERSION.SDK_INT;
                                    v0Var5 = v0Var2;
                                    if (i3 >= 33) {
                                        com.google.android.gms.common.wrappers.a.h(context2, tVar, intentFilter);
                                    } else if (i3 >= 26) {
                                        androidx.media3.common.audio.h.q(context2, tVar, intentFilter);
                                    } else {
                                        context2.registerReceiver(tVar, intentFilter, null, null);
                                    }
                                    com.google.android.gms.measurement.internal.x0 x0Var8 = s1Var6.C;
                                    s1.m(x0Var8);
                                    x0Var8.J.a("Registered app receiver");
                                    if (z4) {
                                        s1.j(s1Var5.R);
                                        s1Var5.R.z(((Long) com.google.android.gms.measurement.internal.h0.C.a(null)).longValue());
                                    }
                                } else if (z) {
                                    z = true;
                                    r4Var4.v();
                                    intentFilter = new IntentFilter();
                                    intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                    intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                    tVar = new androidx.media3.common.util.t(s1Var6);
                                    z4 = z;
                                    context2 = s1Var6.e;
                                    x0Var = x0Var3;
                                    i3 = Build.VERSION.SDK_INT;
                                    v0Var5 = v0Var2;
                                    if (i3 >= 33) {
                                        com.google.android.gms.common.wrappers.a.h(context2, tVar, intentFilter);
                                    } else if (i3 >= 26) {
                                        androidx.media3.common.audio.h.q(context2, tVar, intentFilter);
                                    } else {
                                        context2.registerReceiver(tVar, intentFilter, null, null);
                                    }
                                    com.google.android.gms.measurement.internal.x0 x0Var9 = s1Var6.C;
                                    s1.m(x0Var9);
                                    x0Var9.J.a("Registered app receiver");
                                    if (z4) {
                                        s1.j(s1Var5.R);
                                        s1Var5.R.z(((Long) com.google.android.gms.measurement.internal.h0.C.a(null)).longValue());
                                    }
                                } else {
                                    v0Var5 = v0Var2;
                                    x0Var = x0Var3;
                                }
                            } else if (z) {
                                z = true;
                                r4Var4.v();
                                intentFilter = new IntentFilter();
                                intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                tVar = new androidx.media3.common.util.t(s1Var6);
                                z4 = z;
                                context2 = s1Var6.e;
                                x0Var = x0Var3;
                                i3 = Build.VERSION.SDK_INT;
                                v0Var5 = v0Var2;
                                if (i3 >= 33) {
                                    com.google.android.gms.common.wrappers.a.h(context2, tVar, intentFilter);
                                } else if (i3 >= 26) {
                                    androidx.media3.common.audio.h.q(context2, tVar, intentFilter);
                                } else {
                                    context2.registerReceiver(tVar, intentFilter, null, null);
                                }
                                com.google.android.gms.measurement.internal.x0 x0Var10 = s1Var6.C;
                                s1.m(x0Var10);
                                x0Var10.J.a("Registered app receiver");
                                if (z4) {
                                    s1.j(s1Var5.R);
                                    s1Var5.R.z(((Long) com.google.android.gms.measurement.internal.h0.C.a(null)).longValue());
                                }
                            } else {
                                v0Var5 = v0Var2;
                                x0Var = x0Var3;
                            }
                            b1Var = g1Var.D;
                            f2VarC = g1Var.C();
                            int i4 = f2VarC.b;
                            c2VarL = gVar.L("google_analytics_default_allow_ad_storage", false);
                            c2VarL2 = gVar.L("google_analytics_default_allow_analytics_storage", false);
                            e2Var = e2.ANALYTICS_STORAGE;
                            c2Var = c2.UNINITIALIZED;
                            if (c2VarL == c2Var || c2VarL2 != c2Var) {
                                s1Var2 = s1Var5;
                                v0Var6 = v0Var4;
                                r4Var = r4Var4;
                                if (f2.l(-10, g1Var.z().getInt("consent_source", 100))) {
                                    EnumMap enumMap = new EnumMap(e2.class);
                                    enumMap.put(e2.AD_STORAGE, c2VarL);
                                    enumMap.put(e2Var, c2VarL2);
                                    f2Var = new f2(enumMap, -10);
                                    z2 = false;
                                }
                                if (f2Var != null) {
                                    s1.l(v2Var);
                                    v2Var.R(f2Var, true);
                                } else {
                                    f2Var = f2VarC;
                                }
                                s1.l(v2Var);
                                s1Var3 = (s1) v2Var.e;
                                v2Var.V(f2Var);
                                g1Var.v();
                                int i5 = com.google.android.gms.measurement.internal.o.b(g1Var.z().getString("dma_consent_settings", null)).a;
                                c2VarL3 = gVar.L("google_analytics_default_allow_ad_personalization_signals", true);
                                if (c2VarL3 != c2Var) {
                                    s1.m(x0Var);
                                    v0Var3.b(c2VarL3, "Default ad personalization consent from Manifest");
                                }
                                c2VarL4 = gVar.L("google_analytics_default_allow_ad_user_data", true);
                                if (c2VarL4 == c2Var && f2.l(-10, i5)) {
                                    s1.l(v2Var);
                                    EnumMap enumMap2 = new EnumMap(e2.class);
                                    enumMap2.put(e2.AD_USER_DATA, c2VarL4);
                                    v2Var.Q(new com.google.android.gms.measurement.internal.o(enumMap2, -10, (Boolean) null, (String) null), true);
                                } else if (!TextUtils.isEmpty(s1Var2.r().C()) && (i5 == 0 || i5 == 30)) {
                                    s1.l(v2Var);
                                    v2Var.Q(new com.google.android.gms.measurement.internal.o((Boolean) null, -10, (Boolean) null, (String) null), true);
                                }
                                boolI = gVar.I("google_analytics_tcf_data_enabled");
                                if (boolI != null || boolI.booleanValue()) {
                                    s1.m(x0Var);
                                    v0Var.a("TCF client enabled.");
                                    s1.l(v2Var);
                                    v2Var.v();
                                    com.google.android.gms.measurement.internal.x0 x0Var11 = s1Var3.C;
                                    s1.m(x0Var11);
                                    x0Var11.J.a("Register tcfPrefChangeListener.");
                                    if (v2Var.Q == null) {
                                        v2Var.R = new k2(v2Var, s1Var3, 2);
                                        v2Var.Q = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.u2
                                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                                v2 v2Var2 = v2Var;
                                                v2Var2.getClass();
                                                if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                                    x0 x0Var12 = ((s1) v2Var2.e).C;
                                                    s1.m(x0Var12);
                                                    x0Var12.K.a("IABTCF_TCString change picked up in listener.");
                                                    k2 k2Var = v2Var2.R;
                                                    com.google.android.gms.common.internal.x.g(k2Var);
                                                    k2Var.b(500L);
                                                }
                                            }
                                        };
                                    }
                                    g1 g1Var2 = s1Var3.B;
                                    s1.k(g1Var2);
                                    g1Var2.A().registerOnSharedPreferenceChangeListener(v2Var.Q);
                                    s1.l(v2Var);
                                    v2Var.B();
                                }
                                l1Var = g1Var.C;
                                if (l1Var.g() == 0) {
                                    s1.m(x0Var);
                                    v0Var3.b(Long.valueOf(j), "Persisting first open");
                                    l1Var.h(j);
                                }
                                s1.l(v2Var);
                                r1Var = v2Var.N;
                                if (r1Var.d() && r1Var.c()) {
                                    g1 g1Var3 = r1Var.e.B;
                                    s1.k(g1Var3);
                                    g1Var3.T.v(null);
                                }
                                if (s1Var2.h()) {
                                    s1Var4 = s1Var2;
                                    r4Var2 = r4Var;
                                    if (TextUtils.isEmpty(s1Var4.r().C())) {
                                        b1Var2 = b1Var;
                                    } else {
                                        String strC = s1Var4.r().C();
                                        g1Var.v();
                                        String string3 = g1Var.z().getString("gmp_app_id", null);
                                        zIsEmpty = TextUtils.isEmpty(strC);
                                        boolean zIsEmpty2 = TextUtils.isEmpty(string3);
                                        if (!zIsEmpty || zIsEmpty2) {
                                            b1Var2 = b1Var;
                                        } else {
                                            com.google.android.gms.common.internal.x.g(strC);
                                            if (strC.equals(string3)) {
                                                b1Var2 = b1Var;
                                            } else {
                                                s1.m(x0Var);
                                                v0Var5.a("Rechecking which service to use due to a GMP App Id change");
                                                g1Var.v();
                                                g1Var.v();
                                                Boolean boolValueOf = g1Var.z().contains("measurement_enabled") ? Boolean.valueOf(g1Var.z().getBoolean("measurement_enabled", true)) : null;
                                                SharedPreferences.Editor editorEdit2 = g1Var.z().edit();
                                                editorEdit2.clear();
                                                editorEdit2.apply();
                                                if (boolValueOf != null) {
                                                    g1Var.v();
                                                    SharedPreferences.Editor editorEdit3 = g1Var.z().edit();
                                                    editorEdit3.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                                                    editorEdit3.apply();
                                                }
                                                s1Var4.o().z();
                                                s1Var4.O.D();
                                                s1Var4.O.B();
                                                l1Var.h(j);
                                                b1Var2 = b1Var;
                                                b1Var2.v(null);
                                            }
                                        }
                                        String strC2 = s1Var4.r().C();
                                        g1Var.v();
                                        SharedPreferences.Editor editorEdit4 = g1Var.z().edit();
                                        editorEdit4.putString("gmp_app_id", strC2);
                                        editorEdit4.apply();
                                    }
                                    if (!g1Var.C().i(e2Var)) {
                                        b1Var2.v(null);
                                    }
                                    s1.l(v2Var);
                                    v2Var.D.set(b1Var2.t());
                                    try {
                                        s1Var6.e.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                    } catch (ClassNotFoundException unused4) {
                                        b1 b1Var3 = g1Var.S;
                                        if (!TextUtils.isEmpty(b1Var3.t())) {
                                            s1.m(x0Var);
                                            x0Var2 = x0Var;
                                            x0Var2.F.a("Remote config removed with active feature rollouts");
                                            b1Var3.v(null);
                                        }
                                        if (!TextUtils.isEmpty(s1Var4.r().C())) {
                                            zD = s1Var4.d();
                                            sharedPreferences = g1Var.z;
                                            if (sharedPreferences == null) {
                                                zContains = z2;
                                            } else {
                                                zContains = sharedPreferences.contains("deferred_analytics_collection");
                                            }
                                            if (!zContains) {
                                                g1Var.D(!zD);
                                            }
                                            if (zD) {
                                                s1.l(v2Var);
                                                v2Var.H();
                                            }
                                            w3 w3Var = s1Var4.E;
                                            s1.l(w3Var);
                                            w3Var.B.F();
                                            s1Var4.p().z(new AtomicReference());
                                            s1Var4.p().A(g1Var.V.H());
                                        }
                                        g4.a();
                                        if (gVar.G(null, com.google.android.gms.measurement.internal.h0.P0)) {
                                            r4Var2.v();
                                            if (r4Var2.T() == 1) {
                                                z3 = true;
                                            } else {
                                                z3 = z2;
                                            }
                                            if (z3) {
                                                long jIntValue = ((Integer) com.google.android.gms.measurement.internal.h0.w0.a(null)).intValue();
                                                long jNextInt = new Random().nextInt(5000);
                                                s1Var4.H.getClass();
                                                jMax = Math.max(500L, ((jIntValue * 1000) + jNextInt) - SystemClock.elapsedRealtime());
                                                if (jMax > 500) {
                                                    s1.m(x0Var2);
                                                    v0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                                }
                                                s1.l(v2Var);
                                                v2Var.v();
                                                if (v2Var.I == null) {
                                                    v2Var.I = new k2(v2Var, s1Var3, 0);
                                                }
                                                v2Var.I.b(jMax);
                                            }
                                        }
                                        g1Var.L.b(true);
                                    }
                                    x0Var2 = x0Var;
                                    if (!TextUtils.isEmpty(s1Var4.r().C())) {
                                        zD = s1Var4.d();
                                        sharedPreferences = g1Var.z;
                                        if (sharedPreferences == null) {
                                            zContains = z2;
                                        } else {
                                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                                        }
                                        if (!zContains && !gVar.J()) {
                                            g1Var.D(!zD);
                                        }
                                        if (zD) {
                                            s1.l(v2Var);
                                            v2Var.H();
                                        }
                                        w3 w3Var2 = s1Var4.E;
                                        s1.l(w3Var2);
                                        w3Var2.B.F();
                                        s1Var4.p().z(new AtomicReference());
                                        s1Var4.p().A(g1Var.V.H());
                                    }
                                } else {
                                    if (s1Var2.d()) {
                                        r4Var2 = r4Var;
                                        if (r4Var2.Z("android.permission.INTERNET")) {
                                            v0Var7 = v0Var6;
                                        } else {
                                            s1.m(x0Var);
                                            v0Var7 = v0Var6;
                                            v0Var7.a("App is missing INTERNET permission");
                                        }
                                        if (!r4Var2.Z("android.permission.ACCESS_NETWORK_STATE")) {
                                            s1.m(x0Var);
                                            v0Var7.a("App is missing ACCESS_NETWORK_STATE permission");
                                        }
                                        s1Var4 = s1Var2;
                                        context = s1Var4.e;
                                        if (!com.google.android.gms.common.wrappers.b.a(context).d() && !gVar.y()) {
                                            if (!r4.r0(context)) {
                                                s1.m(x0Var);
                                                v0Var7.a("AppMeasurementReceiver not registered/enabled");
                                            }
                                            if (!r4.Q(context)) {
                                                s1.m(x0Var);
                                                v0Var7.a("AppMeasurementService not registered/enabled");
                                            }
                                        }
                                        s1.m(x0Var);
                                        v0Var7.a("Uploading is not possible. App measurement disabled");
                                    } else {
                                        s1Var4 = s1Var2;
                                        r4Var2 = r4Var;
                                    }
                                    x0Var2 = x0Var;
                                }
                                g4.a();
                                if (gVar.G(null, com.google.android.gms.measurement.internal.h0.P0)) {
                                    r4Var2.v();
                                    if (r4Var2.T() == 1) {
                                        z3 = true;
                                    } else {
                                        z3 = z2;
                                    }
                                    if (z3) {
                                        long jIntValue2 = ((Integer) com.google.android.gms.measurement.internal.h0.w0.a(null)).intValue();
                                        long jNextInt2 = new Random().nextInt(5000);
                                        s1Var4.H.getClass();
                                        jMax = Math.max(500L, ((jIntValue2 * 1000) + jNextInt2) - SystemClock.elapsedRealtime());
                                        if (jMax > 500) {
                                            s1.m(x0Var2);
                                            v0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                        }
                                        s1.l(v2Var);
                                        v2Var.v();
                                        if (v2Var.I == null) {
                                            v2Var.I = new k2(v2Var, s1Var3, 0);
                                        }
                                        v2Var.I.b(jMax);
                                    }
                                }
                                g1Var.L.b(true);
                            }
                            s1Var2 = s1Var5;
                            v0Var6 = v0Var4;
                            r4Var = r4Var4;
                            if (TextUtils.isEmpty(s1Var2.r().C()) && (i4 == 0 || i4 == 30 || i4 == 10 || i4 == 40)) {
                                s1.l(v2Var);
                                z2 = false;
                                v2Var.R(new f2(-10), false);
                            } else {
                                z2 = false;
                            }
                            f2Var = null;
                            if (f2Var != null) {
                                s1.l(v2Var);
                                v2Var.R(f2Var, true);
                            } else {
                                f2Var = f2VarC;
                            }
                            s1.l(v2Var);
                            s1Var3 = (s1) v2Var.e;
                            v2Var.V(f2Var);
                            g1Var.v();
                            int i6 = com.google.android.gms.measurement.internal.o.b(g1Var.z().getString("dma_consent_settings", null)).a;
                            c2VarL3 = gVar.L("google_analytics_default_allow_ad_personalization_signals", true);
                            if (c2VarL3 != c2Var) {
                                s1.m(x0Var);
                                v0Var3.b(c2VarL3, "Default ad personalization consent from Manifest");
                            }
                            c2VarL4 = gVar.L("google_analytics_default_allow_ad_user_data", true);
                            if (c2VarL4 == c2Var) {
                                if (!TextUtils.isEmpty(s1Var2.r().C())) {
                                    s1.l(v2Var);
                                    v2Var.Q(new com.google.android.gms.measurement.internal.o((Boolean) null, -10, (Boolean) null, (String) null), true);
                                }
                            } else if (!TextUtils.isEmpty(s1Var2.r().C())) {
                                s1.l(v2Var);
                                v2Var.Q(new com.google.android.gms.measurement.internal.o((Boolean) null, -10, (Boolean) null, (String) null), true);
                            }
                            boolI = gVar.I("google_analytics_tcf_data_enabled");
                            if (boolI != null) {
                                s1.m(x0Var);
                                v0Var.a("TCF client enabled.");
                                s1.l(v2Var);
                                v2Var.v();
                                com.google.android.gms.measurement.internal.x0 x0Var12 = s1Var3.C;
                                s1.m(x0Var12);
                                x0Var12.J.a("Register tcfPrefChangeListener.");
                                if (v2Var.Q == null) {
                                    v2Var.R = new k2(v2Var, s1Var3, 2);
                                    v2Var.Q = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.u2
                                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                            v2 v2Var2 = v2Var;
                                            v2Var2.getClass();
                                            if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                                x0 x0Var13 = ((s1) v2Var2.e).C;
                                                s1.m(x0Var13);
                                                x0Var13.K.a("IABTCF_TCString change picked up in listener.");
                                                k2 k2Var = v2Var2.R;
                                                com.google.android.gms.common.internal.x.g(k2Var);
                                                k2Var.b(500L);
                                            }
                                        }
                                    };
                                }
                                g1 g1Var4 = s1Var3.B;
                                s1.k(g1Var4);
                                g1Var4.A().registerOnSharedPreferenceChangeListener(v2Var.Q);
                                s1.l(v2Var);
                                v2Var.B();
                            } else {
                                s1.m(x0Var);
                                v0Var.a("TCF client enabled.");
                                s1.l(v2Var);
                                v2Var.v();
                                com.google.android.gms.measurement.internal.x0 x0Var13 = s1Var3.C;
                                s1.m(x0Var13);
                                x0Var13.J.a("Register tcfPrefChangeListener.");
                                if (v2Var.Q == null) {
                                    v2Var.R = new k2(v2Var, s1Var3, 2);
                                    v2Var.Q = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.u2
                                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                            v2 v2Var2 = v2Var;
                                            v2Var2.getClass();
                                            if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                                x0 x0Var14 = ((s1) v2Var2.e).C;
                                                s1.m(x0Var14);
                                                x0Var14.K.a("IABTCF_TCString change picked up in listener.");
                                                k2 k2Var = v2Var2.R;
                                                com.google.android.gms.common.internal.x.g(k2Var);
                                                k2Var.b(500L);
                                            }
                                        }
                                    };
                                }
                                g1 g1Var5 = s1Var3.B;
                                s1.k(g1Var5);
                                g1Var5.A().registerOnSharedPreferenceChangeListener(v2Var.Q);
                                s1.l(v2Var);
                                v2Var.B();
                            }
                            l1Var = g1Var.C;
                            if (l1Var.g() == 0) {
                                s1.m(x0Var);
                                v0Var3.b(Long.valueOf(j), "Persisting first open");
                                l1Var.h(j);
                            }
                            s1.l(v2Var);
                            r1Var = v2Var.N;
                            if (r1Var.d()) {
                                g1 g1Var6 = r1Var.e.B;
                                s1.k(g1Var6);
                                g1Var6.T.v(null);
                            }
                            if (s1Var2.h()) {
                                if (s1Var2.d()) {
                                    r4Var2 = r4Var;
                                    if (r4Var2.Z("android.permission.INTERNET")) {
                                        s1.m(x0Var);
                                        v0Var7 = v0Var6;
                                        v0Var7.a("App is missing INTERNET permission");
                                    } else {
                                        v0Var7 = v0Var6;
                                    }
                                    if (!r4Var2.Z("android.permission.ACCESS_NETWORK_STATE")) {
                                        s1.m(x0Var);
                                        v0Var7.a("App is missing ACCESS_NETWORK_STATE permission");
                                    }
                                    s1Var4 = s1Var2;
                                    context = s1Var4.e;
                                    if (!com.google.android.gms.common.wrappers.b.a(context).d()) {
                                        if (!r4.r0(context)) {
                                            s1.m(x0Var);
                                            v0Var7.a("AppMeasurementReceiver not registered/enabled");
                                        }
                                        if (!r4.Q(context)) {
                                            s1.m(x0Var);
                                            v0Var7.a("AppMeasurementService not registered/enabled");
                                        }
                                    }
                                    s1.m(x0Var);
                                    v0Var7.a("Uploading is not possible. App measurement disabled");
                                } else {
                                    s1Var4 = s1Var2;
                                    r4Var2 = r4Var;
                                }
                                x0Var2 = x0Var;
                            } else {
                                s1Var4 = s1Var2;
                                r4Var2 = r4Var;
                                if (TextUtils.isEmpty(s1Var4.r().C())) {
                                    String strC3 = s1Var4.r().C();
                                    g1Var.v();
                                    String string4 = g1Var.z().getString("gmp_app_id", null);
                                    zIsEmpty = TextUtils.isEmpty(strC3);
                                    boolean zIsEmpty3 = TextUtils.isEmpty(string4);
                                    if (zIsEmpty) {
                                        b1Var2 = b1Var;
                                    } else {
                                        b1Var2 = b1Var;
                                    }
                                    String strC4 = s1Var4.r().C();
                                    g1Var.v();
                                    SharedPreferences.Editor editorEdit5 = g1Var.z().edit();
                                    editorEdit5.putString("gmp_app_id", strC4);
                                    editorEdit5.apply();
                                } else {
                                    b1Var2 = b1Var;
                                }
                                if (!g1Var.C().i(e2Var)) {
                                    b1Var2.v(null);
                                }
                                s1.l(v2Var);
                                v2Var.D.set(b1Var2.t());
                                s1Var6.e.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                x0Var2 = x0Var;
                                if (!TextUtils.isEmpty(s1Var4.r().C())) {
                                    zD = s1Var4.d();
                                    sharedPreferences = g1Var.z;
                                    if (sharedPreferences == null) {
                                        zContains = z2;
                                    } else {
                                        zContains = sharedPreferences.contains("deferred_analytics_collection");
                                    }
                                    if (!zContains) {
                                        g1Var.D(!zD);
                                    }
                                    if (zD) {
                                        s1.l(v2Var);
                                        v2Var.H();
                                    }
                                    w3 w3Var3 = s1Var4.E;
                                    s1.l(w3Var3);
                                    w3Var3.B.F();
                                    s1Var4.p().z(new AtomicReference());
                                    s1Var4.p().A(g1Var.V.H());
                                }
                            }
                            g4.a();
                            if (gVar.G(null, com.google.android.gms.measurement.internal.h0.P0)) {
                                r4Var2.v();
                                if (r4Var2.T() == 1) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if (z3) {
                                    long jIntValue3 = ((Integer) com.google.android.gms.measurement.internal.h0.w0.a(null)).intValue();
                                    long jNextInt3 = new Random().nextInt(5000);
                                    s1Var4.H.getClass();
                                    jMax = Math.max(500L, ((jIntValue3 * 1000) + jNextInt3) - SystemClock.elapsedRealtime());
                                    if (jMax > 500) {
                                        s1.m(x0Var2);
                                        v0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                    }
                                    s1.l(v2Var);
                                    v2Var.v();
                                    if (v2Var.I == null) {
                                        v2Var.I = new k2(v2Var, s1Var3, 0);
                                    }
                                    v2Var.I.b(jMax);
                                }
                            }
                            g1Var.L.b(true);
                        }
                        com.google.android.gms.measurement.internal.x0 x0Var14 = s1Var.C;
                        s1.m(x0Var14);
                        x0Var14.C.a("Failed to load metadata: Metadata bundle is null");
                        numValueOf = null;
                        if (numValueOf != null) {
                            stringArray = s1Var.e.getResources().getStringArray(numValueOf.intValue());
                            if (stringArray == null) {
                                listAsList = Arrays.asList(stringArray);
                            }
                        }
                        if (listAsList != null) {
                            p0Var3.H = listAsList;
                            break;
                        }
                        if (listAsList.isEmpty()) {
                            it = listAsList.iterator();
                            do {
                                if (it.hasNext()) {
                                    p0Var3.H = listAsList;
                                    break;
                                } else {
                                    str3 = (String) it.next();
                                    r4Var3 = s1Var7.F;
                                    s1.k(r4Var3);
                                }
                            } while (r4Var3.A0("safelisted event", str3));
                        } else {
                            s1.m(x0Var6);
                            x0Var6.H.a("Safelisted event list is empty. Ignoring");
                        }
                        if (packageManager != null) {
                            p0Var3.K = com.google.android.gms.common.wrappers.a.e(context3) ? 1 : 0;
                        } else {
                            p0Var3.K = 0;
                        }
                        ((s1) p0Var3.e).Z.incrementAndGet();
                        p0Var3.y = true;
                        z2Var = new z2(s1Var5);
                        z2Var.x();
                        s1Var5.R = z2Var;
                        if (!z2Var.y) {
                            net.luminis.tls.engine.impl.c.r(str);
                            return;
                        }
                        z2Var.z = (JobScheduler) ((s1) z2Var.e).e.getSystemService("jobscheduler");
                        ((s1) z2Var.e).Z.incrementAndGet();
                        z2Var.y = true;
                        s1.m(x0Var3);
                        v0Var = x0Var3.J;
                        v0Var2 = x0Var3.I;
                        v0Var3 = x0Var3.K;
                        v0Var4 = x0Var3.C;
                        gVar.B();
                        v0Var2.b(161000L, "App measurement initialized, version");
                        s1.m(x0Var3);
                        v0Var2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                        strB = p0Var.B();
                        if (r4Var4.b0(strB, gVar.z)) {
                            s1.m(x0Var3);
                            v0Var2.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                        } else {
                            s1.m(x0Var3);
                            v0Var2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strB)));
                        }
                        s1.m(x0Var3);
                        v0Var.a("Debug-level message logging enabled");
                        i2 = s1Var5.X;
                        atomicInteger = s1Var5.Z;
                        if (i2 != atomicInteger.get()) {
                            s1.m(x0Var3);
                            v0Var4.c(Integer.valueOf(s1Var5.X), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                        }
                        s1Var5.S = true;
                        j = s1Var5.a0;
                        v2Var = s1Var5.J;
                        p1 p1Var3 = s1Var5.D;
                        s1.m(p1Var3);
                        p1Var3.v();
                        s1.j(s1Var5.R);
                        iA = s1Var5.R.A();
                        g4.a();
                        zG = gVar.G(null, com.google.android.gms.measurement.internal.h0.P0);
                        if (iA == 2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (zG) {
                            r4Var4.v();
                            if (r4Var4.T() == 1) {
                                r4Var4.v();
                                intentFilter = new IntentFilter();
                                intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                tVar = new androidx.media3.common.util.t(s1Var6);
                                z4 = z;
                                context2 = s1Var6.e;
                                x0Var = x0Var3;
                                i3 = Build.VERSION.SDK_INT;
                                v0Var5 = v0Var2;
                                if (i3 >= 33) {
                                    com.google.android.gms.common.wrappers.a.h(context2, tVar, intentFilter);
                                } else if (i3 >= 26) {
                                    androidx.media3.common.audio.h.q(context2, tVar, intentFilter);
                                } else {
                                    context2.registerReceiver(tVar, intentFilter, null, null);
                                }
                                com.google.android.gms.measurement.internal.x0 x0Var15 = s1Var6.C;
                                s1.m(x0Var15);
                                x0Var15.J.a("Registered app receiver");
                                if (z4) {
                                    s1.j(s1Var5.R);
                                    s1Var5.R.z(((Long) com.google.android.gms.measurement.internal.h0.C.a(null)).longValue());
                                }
                            } else if (z) {
                                z = true;
                                r4Var4.v();
                                intentFilter = new IntentFilter();
                                intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                tVar = new androidx.media3.common.util.t(s1Var6);
                                z4 = z;
                                context2 = s1Var6.e;
                                x0Var = x0Var3;
                                i3 = Build.VERSION.SDK_INT;
                                v0Var5 = v0Var2;
                                if (i3 >= 33) {
                                    com.google.android.gms.common.wrappers.a.h(context2, tVar, intentFilter);
                                } else if (i3 >= 26) {
                                    androidx.media3.common.audio.h.q(context2, tVar, intentFilter);
                                } else {
                                    context2.registerReceiver(tVar, intentFilter, null, null);
                                }
                                com.google.android.gms.measurement.internal.x0 x0Var16 = s1Var6.C;
                                s1.m(x0Var16);
                                x0Var16.J.a("Registered app receiver");
                                if (z4) {
                                    s1.j(s1Var5.R);
                                    s1Var5.R.z(((Long) com.google.android.gms.measurement.internal.h0.C.a(null)).longValue());
                                }
                            } else {
                                v0Var5 = v0Var2;
                                x0Var = x0Var3;
                            }
                        } else if (z) {
                            z = true;
                            r4Var4.v();
                            intentFilter = new IntentFilter();
                            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            tVar = new androidx.media3.common.util.t(s1Var6);
                            z4 = z;
                            context2 = s1Var6.e;
                            x0Var = x0Var3;
                            i3 = Build.VERSION.SDK_INT;
                            v0Var5 = v0Var2;
                            if (i3 >= 33) {
                                com.google.android.gms.common.wrappers.a.h(context2, tVar, intentFilter);
                            } else if (i3 >= 26) {
                                androidx.media3.common.audio.h.q(context2, tVar, intentFilter);
                            } else {
                                context2.registerReceiver(tVar, intentFilter, null, null);
                            }
                            com.google.android.gms.measurement.internal.x0 x0Var17 = s1Var6.C;
                            s1.m(x0Var17);
                            x0Var17.J.a("Registered app receiver");
                            if (z4) {
                                s1.j(s1Var5.R);
                                s1Var5.R.z(((Long) com.google.android.gms.measurement.internal.h0.C.a(null)).longValue());
                            }
                        } else {
                            v0Var5 = v0Var2;
                            x0Var = x0Var3;
                        }
                        b1Var = g1Var.D;
                        f2VarC = g1Var.C();
                        int i7 = f2VarC.b;
                        c2VarL = gVar.L("google_analytics_default_allow_ad_storage", false);
                        c2VarL2 = gVar.L("google_analytics_default_allow_analytics_storage", false);
                        e2Var = e2.ANALYTICS_STORAGE;
                        c2Var = c2.UNINITIALIZED;
                        if (c2VarL == c2Var) {
                            s1Var2 = s1Var5;
                            v0Var6 = v0Var4;
                            r4Var = r4Var4;
                            if (f2.l(-10, g1Var.z().getInt("consent_source", 100))) {
                                EnumMap enumMap3 = new EnumMap(e2.class);
                                enumMap3.put(e2.AD_STORAGE, c2VarL);
                                enumMap3.put(e2Var, c2VarL2);
                                f2Var = new f2(enumMap3, -10);
                                z2 = false;
                            } else {
                                if (TextUtils.isEmpty(s1Var2.r().C())) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                f2Var = null;
                            }
                        } else {
                            s1Var2 = s1Var5;
                            v0Var6 = v0Var4;
                            r4Var = r4Var4;
                            if (f2.l(-10, g1Var.z().getInt("consent_source", 100))) {
                                EnumMap enumMap4 = new EnumMap(e2.class);
                                enumMap4.put(e2.AD_STORAGE, c2VarL);
                                enumMap4.put(e2Var, c2VarL2);
                                f2Var = new f2(enumMap4, -10);
                                z2 = false;
                            } else {
                                if (TextUtils.isEmpty(s1Var2.r().C())) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                f2Var = null;
                            }
                        }
                        if (f2Var != null) {
                            s1.l(v2Var);
                            v2Var.R(f2Var, true);
                        } else {
                            f2Var = f2VarC;
                        }
                        s1.l(v2Var);
                        s1Var3 = (s1) v2Var.e;
                        v2Var.V(f2Var);
                        g1Var.v();
                        int i8 = com.google.android.gms.measurement.internal.o.b(g1Var.z().getString("dma_consent_settings", null)).a;
                        c2VarL3 = gVar.L("google_analytics_default_allow_ad_personalization_signals", true);
                        if (c2VarL3 != c2Var) {
                            s1.m(x0Var);
                            v0Var3.b(c2VarL3, "Default ad personalization consent from Manifest");
                        }
                        c2VarL4 = gVar.L("google_analytics_default_allow_ad_user_data", true);
                        if (c2VarL4 == c2Var) {
                            if (!TextUtils.isEmpty(s1Var2.r().C())) {
                                s1.l(v2Var);
                                v2Var.Q(new com.google.android.gms.measurement.internal.o((Boolean) null, -10, (Boolean) null, (String) null), true);
                            }
                        } else if (!TextUtils.isEmpty(s1Var2.r().C())) {
                            s1.l(v2Var);
                            v2Var.Q(new com.google.android.gms.measurement.internal.o((Boolean) null, -10, (Boolean) null, (String) null), true);
                        }
                        boolI = gVar.I("google_analytics_tcf_data_enabled");
                        if (boolI != null) {
                            s1.m(x0Var);
                            v0Var.a("TCF client enabled.");
                            s1.l(v2Var);
                            v2Var.v();
                            com.google.android.gms.measurement.internal.x0 x0Var18 = s1Var3.C;
                            s1.m(x0Var18);
                            x0Var18.J.a("Register tcfPrefChangeListener.");
                            if (v2Var.Q == null) {
                                v2Var.R = new k2(v2Var, s1Var3, 2);
                                v2Var.Q = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.u2
                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                        v2 v2Var2 = v2Var;
                                        v2Var2.getClass();
                                        if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                            x0 x0Var19 = ((s1) v2Var2.e).C;
                                            s1.m(x0Var19);
                                            x0Var19.K.a("IABTCF_TCString change picked up in listener.");
                                            k2 k2Var = v2Var2.R;
                                            com.google.android.gms.common.internal.x.g(k2Var);
                                            k2Var.b(500L);
                                        }
                                    }
                                };
                            }
                            g1 g1Var7 = s1Var3.B;
                            s1.k(g1Var7);
                            g1Var7.A().registerOnSharedPreferenceChangeListener(v2Var.Q);
                            s1.l(v2Var);
                            v2Var.B();
                        } else {
                            s1.m(x0Var);
                            v0Var.a("TCF client enabled.");
                            s1.l(v2Var);
                            v2Var.v();
                            com.google.android.gms.measurement.internal.x0 x0Var19 = s1Var3.C;
                            s1.m(x0Var19);
                            x0Var19.J.a("Register tcfPrefChangeListener.");
                            if (v2Var.Q == null) {
                                v2Var.R = new k2(v2Var, s1Var3, 2);
                                v2Var.Q = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.u2
                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                        v2 v2Var2 = v2Var;
                                        v2Var2.getClass();
                                        if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                            x0 x0Var110 = ((s1) v2Var2.e).C;
                                            s1.m(x0Var110);
                                            x0Var110.K.a("IABTCF_TCString change picked up in listener.");
                                            k2 k2Var = v2Var2.R;
                                            com.google.android.gms.common.internal.x.g(k2Var);
                                            k2Var.b(500L);
                                        }
                                    }
                                };
                            }
                            g1 g1Var8 = s1Var3.B;
                            s1.k(g1Var8);
                            g1Var8.A().registerOnSharedPreferenceChangeListener(v2Var.Q);
                            s1.l(v2Var);
                            v2Var.B();
                        }
                        l1Var = g1Var.C;
                        if (l1Var.g() == 0) {
                            s1.m(x0Var);
                            v0Var3.b(Long.valueOf(j), "Persisting first open");
                            l1Var.h(j);
                        }
                        s1.l(v2Var);
                        r1Var = v2Var.N;
                        if (r1Var.d()) {
                            g1 g1Var9 = r1Var.e.B;
                            s1.k(g1Var9);
                            g1Var9.T.v(null);
                        }
                        if (s1Var2.h()) {
                            if (s1Var2.d()) {
                                r4Var2 = r4Var;
                                if (r4Var2.Z("android.permission.INTERNET")) {
                                    s1.m(x0Var);
                                    v0Var7 = v0Var6;
                                    v0Var7.a("App is missing INTERNET permission");
                                } else {
                                    v0Var7 = v0Var6;
                                }
                                if (!r4Var2.Z("android.permission.ACCESS_NETWORK_STATE")) {
                                    s1.m(x0Var);
                                    v0Var7.a("App is missing ACCESS_NETWORK_STATE permission");
                                }
                                s1Var4 = s1Var2;
                                context = s1Var4.e;
                                if (!com.google.android.gms.common.wrappers.b.a(context).d()) {
                                    if (!r4.r0(context)) {
                                        s1.m(x0Var);
                                        v0Var7.a("AppMeasurementReceiver not registered/enabled");
                                    }
                                    if (!r4.Q(context)) {
                                        s1.m(x0Var);
                                        v0Var7.a("AppMeasurementService not registered/enabled");
                                    }
                                }
                                s1.m(x0Var);
                                v0Var7.a("Uploading is not possible. App measurement disabled");
                            } else {
                                s1Var4 = s1Var2;
                                r4Var2 = r4Var;
                            }
                            x0Var2 = x0Var;
                        } else {
                            s1Var4 = s1Var2;
                            r4Var2 = r4Var;
                            if (TextUtils.isEmpty(s1Var4.r().C())) {
                                String strC5 = s1Var4.r().C();
                                g1Var.v();
                                String string5 = g1Var.z().getString("gmp_app_id", null);
                                zIsEmpty = TextUtils.isEmpty(strC5);
                                boolean zIsEmpty4 = TextUtils.isEmpty(string5);
                                if (zIsEmpty) {
                                    b1Var2 = b1Var;
                                } else {
                                    b1Var2 = b1Var;
                                }
                                String strC6 = s1Var4.r().C();
                                g1Var.v();
                                SharedPreferences.Editor editorEdit6 = g1Var.z().edit();
                                editorEdit6.putString("gmp_app_id", strC6);
                                editorEdit6.apply();
                            } else {
                                b1Var2 = b1Var;
                            }
                            if (!g1Var.C().i(e2Var)) {
                                b1Var2.v(null);
                            }
                            s1.l(v2Var);
                            v2Var.D.set(b1Var2.t());
                            s1Var6.e.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                            x0Var2 = x0Var;
                            if (!TextUtils.isEmpty(s1Var4.r().C())) {
                                zD = s1Var4.d();
                                sharedPreferences = g1Var.z;
                                if (sharedPreferences == null) {
                                    zContains = z2;
                                } else {
                                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                                }
                                if (!zContains) {
                                    g1Var.D(!zD);
                                }
                                if (zD) {
                                    s1.l(v2Var);
                                    v2Var.H();
                                }
                                w3 w3Var4 = s1Var4.E;
                                s1.l(w3Var4);
                                w3Var4.B.F();
                                s1Var4.p().z(new AtomicReference());
                                s1Var4.p().A(g1Var.V.H());
                            }
                        }
                        g4.a();
                        if (gVar.G(null, com.google.android.gms.measurement.internal.h0.P0)) {
                            r4Var2.v();
                            if (r4Var2.T() == 1) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (z3) {
                                long jIntValue4 = ((Integer) com.google.android.gms.measurement.internal.h0.w0.a(null)).intValue();
                                long jNextInt4 = new Random().nextInt(5000);
                                s1Var4.H.getClass();
                                jMax = Math.max(500L, ((jIntValue4 * 1000) + jNextInt4) - SystemClock.elapsedRealtime());
                                if (jMax > 500) {
                                    s1.m(x0Var2);
                                    v0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                }
                                s1.l(v2Var);
                                v2Var.v();
                                if (v2Var.I == null) {
                                    v2Var.I = new k2(v2Var, s1Var3, 0);
                                }
                                v2Var.I.b(jMax);
                            }
                        }
                        g1Var.L.b(true);
                    }
                    str6 = "manual_install";
                    packageInfo = packageManager.getPackageInfo(context3.getPackageName(), 0);
                    if (packageInfo != null) {
                        applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                        if (TextUtils.isEmpty(applicationLabel)) {
                            string = applicationLabel.toString();
                        } else {
                            string = "Unknown";
                        }
                        str2 = packageInfo.versionName;
                        i = packageInfo.versionCode;
                    }
                } catch (PackageManager.NameNotFoundException unused5) {
                    string = "Unknown";
                }
                installerPackageName = str6;
                String str8 = installerPackageName;
                p0Var3.z = packageName;
                p0Var3.C = str8;
                p0Var3.A = str2;
                p0Var3.B = i;
                p0Var3.D = string;
                p0Var3.E = 0L;
                iG = s1Var7.g();
                if (iG == 0) {
                    s1.m(x0Var6);
                    x0Var6.K.a("App measurement collection enabled");
                } else if (iG == 1) {
                    s1.m(x0Var6);
                    x0Var6.I.a("App measurement deactivated via the manifest");
                } else if (iG == 3) {
                    s1.m(x0Var6);
                    x0Var6.I.a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                } else if (iG == 4) {
                    s1.m(x0Var6);
                    x0Var6.I.a("App measurement disabled via the manifest");
                } else if (iG == 6) {
                    s1.m(x0Var6);
                    x0Var6.H.a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                } else if (iG == 7) {
                    s1.m(x0Var6);
                    x0Var6.I.a("App measurement disabled via the global data collection setting");
                } else if (iG != 8) {
                    s1.m(x0Var6);
                    x0Var6.I.a("App measurement disabled");
                    s1.m(x0Var6);
                    x0Var6.D.a("Invalid scion state in identity");
                } else {
                    s1.m(x0Var6);
                    x0Var6.I.a("App measurement disabled due to denied storage consent");
                }
                p0Var3.L = "";
                strB2 = p0Var3.J;
                if (TextUtils.isEmpty(strB2)) {
                    strB2 = g2.b(context3, s1Var7.M);
                }
                if (!TextUtils.isEmpty(strB2)) {
                    str4 = strB2;
                }
                p0Var3.L = str4;
                if (iG == 0) {
                    s1.m(x0Var6);
                    x0Var6.K.c(p0Var3.z, p0Var3.L, "App measurement enabled for app package, google app id");
                }
                listAsList = null;
                p0Var3.H = null;
                com.google.android.gms.measurement.internal.g gVar3 = s1Var7.A;
                s1Var = (s1) gVar3.e;
                com.google.android.gms.common.internal.x.d("analytics.safelisted_events");
                bundleH = gVar3.H();
                if (bundleH != null) {
                    if (bundleH.containsKey("analytics.safelisted_events")) {
                        numValueOf = Integer.valueOf(bundleH.getInt("analytics.safelisted_events"));
                    }
                    if (numValueOf != null) {
                        stringArray = s1Var.e.getResources().getStringArray(numValueOf.intValue());
                        if (stringArray == null) {
                            listAsList = Arrays.asList(stringArray);
                        }
                    }
                    if (listAsList != null) {
                        p0Var3.H = listAsList;
                        break;
                    }
                    if (listAsList.isEmpty()) {
                        it = listAsList.iterator();
                        do {
                            if (it.hasNext()) {
                                p0Var3.H = listAsList;
                                break;
                            } else {
                                str3 = (String) it.next();
                                r4Var3 = s1Var7.F;
                                s1.k(r4Var3);
                            }
                        } while (r4Var3.A0("safelisted event", str3));
                    } else {
                        s1.m(x0Var6);
                        x0Var6.H.a("Safelisted event list is empty. Ignoring");
                    }
                    if (packageManager != null) {
                        p0Var3.K = com.google.android.gms.common.wrappers.a.e(context3) ? 1 : 0;
                    } else {
                        p0Var3.K = 0;
                    }
                    ((s1) p0Var3.e).Z.incrementAndGet();
                    p0Var3.y = true;
                    z2Var = new z2(s1Var5);
                    z2Var.x();
                    s1Var5.R = z2Var;
                    if (!z2Var.y) {
                        net.luminis.tls.engine.impl.c.r(str);
                        return;
                    }
                    z2Var.z = (JobScheduler) ((s1) z2Var.e).e.getSystemService("jobscheduler");
                    ((s1) z2Var.e).Z.incrementAndGet();
                    z2Var.y = true;
                    s1.m(x0Var3);
                    v0Var = x0Var3.J;
                    v0Var2 = x0Var3.I;
                    v0Var3 = x0Var3.K;
                    v0Var4 = x0Var3.C;
                    gVar.B();
                    v0Var2.b(161000L, "App measurement initialized, version");
                    s1.m(x0Var3);
                    v0Var2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                    strB = p0Var.B();
                    if (r4Var4.b0(strB, gVar.z)) {
                        s1.m(x0Var3);
                        v0Var2.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                    } else {
                        s1.m(x0Var3);
                        v0Var2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strB)));
                    }
                    s1.m(x0Var3);
                    v0Var.a("Debug-level message logging enabled");
                    i2 = s1Var5.X;
                    atomicInteger = s1Var5.Z;
                    if (i2 != atomicInteger.get()) {
                        s1.m(x0Var3);
                        v0Var4.c(Integer.valueOf(s1Var5.X), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                    }
                    s1Var5.S = true;
                    j = s1Var5.a0;
                    v2Var = s1Var5.J;
                    p1 p1Var4 = s1Var5.D;
                    s1.m(p1Var4);
                    p1Var4.v();
                    s1.j(s1Var5.R);
                    iA = s1Var5.R.A();
                    g4.a();
                    zG = gVar.G(null, com.google.android.gms.measurement.internal.h0.P0);
                    if (iA == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (zG) {
                        r4Var4.v();
                        if (r4Var4.T() == 1) {
                            r4Var4.v();
                            intentFilter = new IntentFilter();
                            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            tVar = new androidx.media3.common.util.t(s1Var6);
                            z4 = z;
                            context2 = s1Var6.e;
                            x0Var = x0Var3;
                            i3 = Build.VERSION.SDK_INT;
                            v0Var5 = v0Var2;
                            if (i3 >= 33) {
                                com.google.android.gms.common.wrappers.a.h(context2, tVar, intentFilter);
                            } else if (i3 >= 26) {
                                androidx.media3.common.audio.h.q(context2, tVar, intentFilter);
                            } else {
                                context2.registerReceiver(tVar, intentFilter, null, null);
                            }
                            com.google.android.gms.measurement.internal.x0 x0Var110 = s1Var6.C;
                            s1.m(x0Var110);
                            x0Var110.J.a("Registered app receiver");
                            if (z4) {
                                s1.j(s1Var5.R);
                                s1Var5.R.z(((Long) com.google.android.gms.measurement.internal.h0.C.a(null)).longValue());
                            }
                        } else if (z) {
                            z = true;
                            r4Var4.v();
                            intentFilter = new IntentFilter();
                            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            tVar = new androidx.media3.common.util.t(s1Var6);
                            z4 = z;
                            context2 = s1Var6.e;
                            x0Var = x0Var3;
                            i3 = Build.VERSION.SDK_INT;
                            v0Var5 = v0Var2;
                            if (i3 >= 33) {
                                com.google.android.gms.common.wrappers.a.h(context2, tVar, intentFilter);
                            } else if (i3 >= 26) {
                                androidx.media3.common.audio.h.q(context2, tVar, intentFilter);
                            } else {
                                context2.registerReceiver(tVar, intentFilter, null, null);
                            }
                            com.google.android.gms.measurement.internal.x0 x0Var111 = s1Var6.C;
                            s1.m(x0Var111);
                            x0Var111.J.a("Registered app receiver");
                            if (z4) {
                                s1.j(s1Var5.R);
                                s1Var5.R.z(((Long) com.google.android.gms.measurement.internal.h0.C.a(null)).longValue());
                            }
                        } else {
                            v0Var5 = v0Var2;
                            x0Var = x0Var3;
                        }
                    } else if (z) {
                        z = true;
                        r4Var4.v();
                        intentFilter = new IntentFilter();
                        intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        tVar = new androidx.media3.common.util.t(s1Var6);
                        z4 = z;
                        context2 = s1Var6.e;
                        x0Var = x0Var3;
                        i3 = Build.VERSION.SDK_INT;
                        v0Var5 = v0Var2;
                        if (i3 >= 33) {
                            com.google.android.gms.common.wrappers.a.h(context2, tVar, intentFilter);
                        } else if (i3 >= 26) {
                            androidx.media3.common.audio.h.q(context2, tVar, intentFilter);
                        } else {
                            context2.registerReceiver(tVar, intentFilter, null, null);
                        }
                        com.google.android.gms.measurement.internal.x0 x0Var112 = s1Var6.C;
                        s1.m(x0Var112);
                        x0Var112.J.a("Registered app receiver");
                        if (z4) {
                            s1.j(s1Var5.R);
                            s1Var5.R.z(((Long) com.google.android.gms.measurement.internal.h0.C.a(null)).longValue());
                        }
                    } else {
                        v0Var5 = v0Var2;
                        x0Var = x0Var3;
                    }
                    b1Var = g1Var.D;
                    f2VarC = g1Var.C();
                    int i9 = f2VarC.b;
                    c2VarL = gVar.L("google_analytics_default_allow_ad_storage", false);
                    c2VarL2 = gVar.L("google_analytics_default_allow_analytics_storage", false);
                    e2Var = e2.ANALYTICS_STORAGE;
                    c2Var = c2.UNINITIALIZED;
                    if (c2VarL == c2Var) {
                        s1Var2 = s1Var5;
                        v0Var6 = v0Var4;
                        r4Var = r4Var4;
                        if (f2.l(-10, g1Var.z().getInt("consent_source", 100))) {
                            EnumMap enumMap5 = new EnumMap(e2.class);
                            enumMap5.put(e2.AD_STORAGE, c2VarL);
                            enumMap5.put(e2Var, c2VarL2);
                            f2Var = new f2(enumMap5, -10);
                            z2 = false;
                        } else {
                            if (TextUtils.isEmpty(s1Var2.r().C())) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            f2Var = null;
                        }
                    } else {
                        s1Var2 = s1Var5;
                        v0Var6 = v0Var4;
                        r4Var = r4Var4;
                        if (f2.l(-10, g1Var.z().getInt("consent_source", 100))) {
                            EnumMap enumMap6 = new EnumMap(e2.class);
                            enumMap6.put(e2.AD_STORAGE, c2VarL);
                            enumMap6.put(e2Var, c2VarL2);
                            f2Var = new f2(enumMap6, -10);
                            z2 = false;
                        } else {
                            if (TextUtils.isEmpty(s1Var2.r().C())) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            f2Var = null;
                        }
                    }
                    if (f2Var != null) {
                        s1.l(v2Var);
                        v2Var.R(f2Var, true);
                    } else {
                        f2Var = f2VarC;
                    }
                    s1.l(v2Var);
                    s1Var3 = (s1) v2Var.e;
                    v2Var.V(f2Var);
                    g1Var.v();
                    int i10 = com.google.android.gms.measurement.internal.o.b(g1Var.z().getString("dma_consent_settings", null)).a;
                    c2VarL3 = gVar.L("google_analytics_default_allow_ad_personalization_signals", true);
                    if (c2VarL3 != c2Var) {
                        s1.m(x0Var);
                        v0Var3.b(c2VarL3, "Default ad personalization consent from Manifest");
                    }
                    c2VarL4 = gVar.L("google_analytics_default_allow_ad_user_data", true);
                    if (c2VarL4 == c2Var) {
                        if (!TextUtils.isEmpty(s1Var2.r().C())) {
                            s1.l(v2Var);
                            v2Var.Q(new com.google.android.gms.measurement.internal.o((Boolean) null, -10, (Boolean) null, (String) null), true);
                        }
                    } else if (!TextUtils.isEmpty(s1Var2.r().C())) {
                        s1.l(v2Var);
                        v2Var.Q(new com.google.android.gms.measurement.internal.o((Boolean) null, -10, (Boolean) null, (String) null), true);
                    }
                    boolI = gVar.I("google_analytics_tcf_data_enabled");
                    if (boolI != null) {
                        s1.m(x0Var);
                        v0Var.a("TCF client enabled.");
                        s1.l(v2Var);
                        v2Var.v();
                        com.google.android.gms.measurement.internal.x0 x0Var113 = s1Var3.C;
                        s1.m(x0Var113);
                        x0Var113.J.a("Register tcfPrefChangeListener.");
                        if (v2Var.Q == null) {
                            v2Var.R = new k2(v2Var, s1Var3, 2);
                            v2Var.Q = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.u2
                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                    v2 v2Var2 = v2Var;
                                    v2Var2.getClass();
                                    if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                        x0 x0Var114 = ((s1) v2Var2.e).C;
                                        s1.m(x0Var114);
                                        x0Var114.K.a("IABTCF_TCString change picked up in listener.");
                                        k2 k2Var = v2Var2.R;
                                        com.google.android.gms.common.internal.x.g(k2Var);
                                        k2Var.b(500L);
                                    }
                                }
                            };
                        }
                        g1 g1Var10 = s1Var3.B;
                        s1.k(g1Var10);
                        g1Var10.A().registerOnSharedPreferenceChangeListener(v2Var.Q);
                        s1.l(v2Var);
                        v2Var.B();
                    } else {
                        s1.m(x0Var);
                        v0Var.a("TCF client enabled.");
                        s1.l(v2Var);
                        v2Var.v();
                        com.google.android.gms.measurement.internal.x0 x0Var114 = s1Var3.C;
                        s1.m(x0Var114);
                        x0Var114.J.a("Register tcfPrefChangeListener.");
                        if (v2Var.Q == null) {
                            v2Var.R = new k2(v2Var, s1Var3, 2);
                            v2Var.Q = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.u2
                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                    v2 v2Var2 = v2Var;
                                    v2Var2.getClass();
                                    if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                        x0 x0Var115 = ((s1) v2Var2.e).C;
                                        s1.m(x0Var115);
                                        x0Var115.K.a("IABTCF_TCString change picked up in listener.");
                                        k2 k2Var = v2Var2.R;
                                        com.google.android.gms.common.internal.x.g(k2Var);
                                        k2Var.b(500L);
                                    }
                                }
                            };
                        }
                        g1 g1Var11 = s1Var3.B;
                        s1.k(g1Var11);
                        g1Var11.A().registerOnSharedPreferenceChangeListener(v2Var.Q);
                        s1.l(v2Var);
                        v2Var.B();
                    }
                    l1Var = g1Var.C;
                    if (l1Var.g() == 0) {
                        s1.m(x0Var);
                        v0Var3.b(Long.valueOf(j), "Persisting first open");
                        l1Var.h(j);
                    }
                    s1.l(v2Var);
                    r1Var = v2Var.N;
                    if (r1Var.d()) {
                        g1 g1Var12 = r1Var.e.B;
                        s1.k(g1Var12);
                        g1Var12.T.v(null);
                    }
                    if (s1Var2.h()) {
                        if (s1Var2.d()) {
                            r4Var2 = r4Var;
                            if (r4Var2.Z("android.permission.INTERNET")) {
                                s1.m(x0Var);
                                v0Var7 = v0Var6;
                                v0Var7.a("App is missing INTERNET permission");
                            } else {
                                v0Var7 = v0Var6;
                            }
                            if (!r4Var2.Z("android.permission.ACCESS_NETWORK_STATE")) {
                                s1.m(x0Var);
                                v0Var7.a("App is missing ACCESS_NETWORK_STATE permission");
                            }
                            s1Var4 = s1Var2;
                            context = s1Var4.e;
                            if (!com.google.android.gms.common.wrappers.b.a(context).d()) {
                                if (!r4.r0(context)) {
                                    s1.m(x0Var);
                                    v0Var7.a("AppMeasurementReceiver not registered/enabled");
                                }
                                if (!r4.Q(context)) {
                                    s1.m(x0Var);
                                    v0Var7.a("AppMeasurementService not registered/enabled");
                                }
                            }
                            s1.m(x0Var);
                            v0Var7.a("Uploading is not possible. App measurement disabled");
                        } else {
                            s1Var4 = s1Var2;
                            r4Var2 = r4Var;
                        }
                        x0Var2 = x0Var;
                    } else {
                        s1Var4 = s1Var2;
                        r4Var2 = r4Var;
                        if (TextUtils.isEmpty(s1Var4.r().C())) {
                            String strC7 = s1Var4.r().C();
                            g1Var.v();
                            String string6 = g1Var.z().getString("gmp_app_id", null);
                            zIsEmpty = TextUtils.isEmpty(strC7);
                            boolean zIsEmpty5 = TextUtils.isEmpty(string6);
                            if (zIsEmpty) {
                                b1Var2 = b1Var;
                            } else {
                                b1Var2 = b1Var;
                            }
                            String strC8 = s1Var4.r().C();
                            g1Var.v();
                            SharedPreferences.Editor editorEdit7 = g1Var.z().edit();
                            editorEdit7.putString("gmp_app_id", strC8);
                            editorEdit7.apply();
                        } else {
                            b1Var2 = b1Var;
                        }
                        if (!g1Var.C().i(e2Var)) {
                            b1Var2.v(null);
                        }
                        s1.l(v2Var);
                        v2Var.D.set(b1Var2.t());
                        s1Var6.e.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                        x0Var2 = x0Var;
                        if (!TextUtils.isEmpty(s1Var4.r().C())) {
                            zD = s1Var4.d();
                            sharedPreferences = g1Var.z;
                            if (sharedPreferences == null) {
                                zContains = z2;
                            } else {
                                zContains = sharedPreferences.contains("deferred_analytics_collection");
                            }
                            if (!zContains) {
                                g1Var.D(!zD);
                            }
                            if (zD) {
                                s1.l(v2Var);
                                v2Var.H();
                            }
                            w3 w3Var5 = s1Var4.E;
                            s1.l(w3Var5);
                            w3Var5.B.F();
                            s1Var4.p().z(new AtomicReference());
                            s1Var4.p().A(g1Var.V.H());
                        }
                    }
                    g4.a();
                    if (gVar.G(null, com.google.android.gms.measurement.internal.h0.P0)) {
                        r4Var2.v();
                        if (r4Var2.T() == 1) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (z3) {
                            long jIntValue5 = ((Integer) com.google.android.gms.measurement.internal.h0.w0.a(null)).intValue();
                            long jNextInt5 = new Random().nextInt(5000);
                            s1Var4.H.getClass();
                            jMax = Math.max(500L, ((jIntValue5 * 1000) + jNextInt5) - SystemClock.elapsedRealtime());
                            if (jMax > 500) {
                                s1.m(x0Var2);
                                v0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                            }
                            s1.l(v2Var);
                            v2Var.v();
                            if (v2Var.I == null) {
                                v2Var.I = new k2(v2Var, s1Var3, 0);
                            }
                            v2Var.I.b(jMax);
                        }
                    }
                    g1Var.L.b(true);
                }
                com.google.android.gms.measurement.internal.x0 x0Var115 = s1Var.C;
                s1.m(x0Var115);
                x0Var115.C.a("Failed to load metadata: Metadata bundle is null");
                numValueOf = null;
                if (numValueOf != null) {
                    stringArray = s1Var.e.getResources().getStringArray(numValueOf.intValue());
                    if (stringArray == null) {
                        listAsList = Arrays.asList(stringArray);
                    }
                }
                if (listAsList != null) {
                    p0Var3.H = listAsList;
                    break;
                }
                if (listAsList.isEmpty()) {
                    it = listAsList.iterator();
                    do {
                        if (it.hasNext()) {
                            p0Var3.H = listAsList;
                            break;
                        } else {
                            str3 = (String) it.next();
                            r4Var3 = s1Var7.F;
                            s1.k(r4Var3);
                        }
                    } while (r4Var3.A0("safelisted event", str3));
                } else {
                    s1.m(x0Var6);
                    x0Var6.H.a("Safelisted event list is empty. Ignoring");
                }
                if (packageManager != null) {
                    p0Var3.K = com.google.android.gms.common.wrappers.a.e(context3) ? 1 : 0;
                } else {
                    p0Var3.K = 0;
                }
                ((s1) p0Var3.e).Z.incrementAndGet();
                p0Var3.y = true;
                z2Var = new z2(s1Var5);
                z2Var.x();
                s1Var5.R = z2Var;
                if (!z2Var.y) {
                    net.luminis.tls.engine.impl.c.r(str);
                    return;
                }
                z2Var.z = (JobScheduler) ((s1) z2Var.e).e.getSystemService("jobscheduler");
                ((s1) z2Var.e).Z.incrementAndGet();
                z2Var.y = true;
                s1.m(x0Var3);
                v0Var = x0Var3.J;
                v0Var2 = x0Var3.I;
                v0Var3 = x0Var3.K;
                v0Var4 = x0Var3.C;
                gVar.B();
                v0Var2.b(161000L, "App measurement initialized, version");
                s1.m(x0Var3);
                v0Var2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                strB = p0Var.B();
                if (r4Var4.b0(strB, gVar.z)) {
                    s1.m(x0Var3);
                    v0Var2.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                } else {
                    s1.m(x0Var3);
                    v0Var2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strB)));
                }
                s1.m(x0Var3);
                v0Var.a("Debug-level message logging enabled");
                i2 = s1Var5.X;
                atomicInteger = s1Var5.Z;
                if (i2 != atomicInteger.get()) {
                    s1.m(x0Var3);
                    v0Var4.c(Integer.valueOf(s1Var5.X), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                }
                s1Var5.S = true;
                j = s1Var5.a0;
                v2Var = s1Var5.J;
                p1 p1Var5 = s1Var5.D;
                s1.m(p1Var5);
                p1Var5.v();
                s1.j(s1Var5.R);
                iA = s1Var5.R.A();
                g4.a();
                zG = gVar.G(null, com.google.android.gms.measurement.internal.h0.P0);
                if (iA == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (zG) {
                    r4Var4.v();
                    if (r4Var4.T() == 1) {
                        r4Var4.v();
                        intentFilter = new IntentFilter();
                        intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        tVar = new androidx.media3.common.util.t(s1Var6);
                        z4 = z;
                        context2 = s1Var6.e;
                        x0Var = x0Var3;
                        i3 = Build.VERSION.SDK_INT;
                        v0Var5 = v0Var2;
                        if (i3 >= 33) {
                            com.google.android.gms.common.wrappers.a.h(context2, tVar, intentFilter);
                        } else if (i3 >= 26) {
                            androidx.media3.common.audio.h.q(context2, tVar, intentFilter);
                        } else {
                            context2.registerReceiver(tVar, intentFilter, null, null);
                        }
                        com.google.android.gms.measurement.internal.x0 x0Var116 = s1Var6.C;
                        s1.m(x0Var116);
                        x0Var116.J.a("Registered app receiver");
                        if (z4) {
                            s1.j(s1Var5.R);
                            s1Var5.R.z(((Long) com.google.android.gms.measurement.internal.h0.C.a(null)).longValue());
                        }
                    } else if (z) {
                        z = true;
                        r4Var4.v();
                        intentFilter = new IntentFilter();
                        intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        tVar = new androidx.media3.common.util.t(s1Var6);
                        z4 = z;
                        context2 = s1Var6.e;
                        x0Var = x0Var3;
                        i3 = Build.VERSION.SDK_INT;
                        v0Var5 = v0Var2;
                        if (i3 >= 33) {
                            com.google.android.gms.common.wrappers.a.h(context2, tVar, intentFilter);
                        } else if (i3 >= 26) {
                            androidx.media3.common.audio.h.q(context2, tVar, intentFilter);
                        } else {
                            context2.registerReceiver(tVar, intentFilter, null, null);
                        }
                        com.google.android.gms.measurement.internal.x0 x0Var117 = s1Var6.C;
                        s1.m(x0Var117);
                        x0Var117.J.a("Registered app receiver");
                        if (z4) {
                            s1.j(s1Var5.R);
                            s1Var5.R.z(((Long) com.google.android.gms.measurement.internal.h0.C.a(null)).longValue());
                        }
                    } else {
                        v0Var5 = v0Var2;
                        x0Var = x0Var3;
                    }
                } else if (z) {
                    z = true;
                    r4Var4.v();
                    intentFilter = new IntentFilter();
                    intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    tVar = new androidx.media3.common.util.t(s1Var6);
                    z4 = z;
                    context2 = s1Var6.e;
                    x0Var = x0Var3;
                    i3 = Build.VERSION.SDK_INT;
                    v0Var5 = v0Var2;
                    if (i3 >= 33) {
                        com.google.android.gms.common.wrappers.a.h(context2, tVar, intentFilter);
                    } else if (i3 >= 26) {
                        androidx.media3.common.audio.h.q(context2, tVar, intentFilter);
                    } else {
                        context2.registerReceiver(tVar, intentFilter, null, null);
                    }
                    com.google.android.gms.measurement.internal.x0 x0Var118 = s1Var6.C;
                    s1.m(x0Var118);
                    x0Var118.J.a("Registered app receiver");
                    if (z4) {
                        s1.j(s1Var5.R);
                        s1Var5.R.z(((Long) com.google.android.gms.measurement.internal.h0.C.a(null)).longValue());
                    }
                } else {
                    v0Var5 = v0Var2;
                    x0Var = x0Var3;
                }
                b1Var = g1Var.D;
                f2VarC = g1Var.C();
                int i11 = f2VarC.b;
                c2VarL = gVar.L("google_analytics_default_allow_ad_storage", false);
                c2VarL2 = gVar.L("google_analytics_default_allow_analytics_storage", false);
                e2Var = e2.ANALYTICS_STORAGE;
                c2Var = c2.UNINITIALIZED;
                if (c2VarL == c2Var) {
                    s1Var2 = s1Var5;
                    v0Var6 = v0Var4;
                    r4Var = r4Var4;
                    if (f2.l(-10, g1Var.z().getInt("consent_source", 100))) {
                        EnumMap enumMap7 = new EnumMap(e2.class);
                        enumMap7.put(e2.AD_STORAGE, c2VarL);
                        enumMap7.put(e2Var, c2VarL2);
                        f2Var = new f2(enumMap7, -10);
                        z2 = false;
                    } else {
                        if (TextUtils.isEmpty(s1Var2.r().C())) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        f2Var = null;
                    }
                } else {
                    s1Var2 = s1Var5;
                    v0Var6 = v0Var4;
                    r4Var = r4Var4;
                    if (f2.l(-10, g1Var.z().getInt("consent_source", 100))) {
                        EnumMap enumMap8 = new EnumMap(e2.class);
                        enumMap8.put(e2.AD_STORAGE, c2VarL);
                        enumMap8.put(e2Var, c2VarL2);
                        f2Var = new f2(enumMap8, -10);
                        z2 = false;
                    } else {
                        if (TextUtils.isEmpty(s1Var2.r().C())) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        f2Var = null;
                    }
                }
                if (f2Var != null) {
                    s1.l(v2Var);
                    v2Var.R(f2Var, true);
                } else {
                    f2Var = f2VarC;
                }
                s1.l(v2Var);
                s1Var3 = (s1) v2Var.e;
                v2Var.V(f2Var);
                g1Var.v();
                int i12 = com.google.android.gms.measurement.internal.o.b(g1Var.z().getString("dma_consent_settings", null)).a;
                c2VarL3 = gVar.L("google_analytics_default_allow_ad_personalization_signals", true);
                if (c2VarL3 != c2Var) {
                    s1.m(x0Var);
                    v0Var3.b(c2VarL3, "Default ad personalization consent from Manifest");
                }
                c2VarL4 = gVar.L("google_analytics_default_allow_ad_user_data", true);
                if (c2VarL4 == c2Var) {
                    if (!TextUtils.isEmpty(s1Var2.r().C())) {
                        s1.l(v2Var);
                        v2Var.Q(new com.google.android.gms.measurement.internal.o((Boolean) null, -10, (Boolean) null, (String) null), true);
                    }
                } else if (!TextUtils.isEmpty(s1Var2.r().C())) {
                    s1.l(v2Var);
                    v2Var.Q(new com.google.android.gms.measurement.internal.o((Boolean) null, -10, (Boolean) null, (String) null), true);
                }
                boolI = gVar.I("google_analytics_tcf_data_enabled");
                if (boolI != null) {
                    s1.m(x0Var);
                    v0Var.a("TCF client enabled.");
                    s1.l(v2Var);
                    v2Var.v();
                    com.google.android.gms.measurement.internal.x0 x0Var119 = s1Var3.C;
                    s1.m(x0Var119);
                    x0Var119.J.a("Register tcfPrefChangeListener.");
                    if (v2Var.Q == null) {
                        v2Var.R = new k2(v2Var, s1Var3, 2);
                        v2Var.Q = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.u2
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                v2 v2Var2 = v2Var;
                                v2Var2.getClass();
                                if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                    x0 x0Var1110 = ((s1) v2Var2.e).C;
                                    s1.m(x0Var1110);
                                    x0Var1110.K.a("IABTCF_TCString change picked up in listener.");
                                    k2 k2Var = v2Var2.R;
                                    com.google.android.gms.common.internal.x.g(k2Var);
                                    k2Var.b(500L);
                                }
                            }
                        };
                    }
                    g1 g1Var13 = s1Var3.B;
                    s1.k(g1Var13);
                    g1Var13.A().registerOnSharedPreferenceChangeListener(v2Var.Q);
                    s1.l(v2Var);
                    v2Var.B();
                } else {
                    s1.m(x0Var);
                    v0Var.a("TCF client enabled.");
                    s1.l(v2Var);
                    v2Var.v();
                    com.google.android.gms.measurement.internal.x0 x0Var1110 = s1Var3.C;
                    s1.m(x0Var1110);
                    x0Var1110.J.a("Register tcfPrefChangeListener.");
                    if (v2Var.Q == null) {
                        v2Var.R = new k2(v2Var, s1Var3, 2);
                        v2Var.Q = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.u2
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                v2 v2Var2 = v2Var;
                                v2Var2.getClass();
                                if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                    x0 x0Var1111 = ((s1) v2Var2.e).C;
                                    s1.m(x0Var1111);
                                    x0Var1111.K.a("IABTCF_TCString change picked up in listener.");
                                    k2 k2Var = v2Var2.R;
                                    com.google.android.gms.common.internal.x.g(k2Var);
                                    k2Var.b(500L);
                                }
                            }
                        };
                    }
                    g1 g1Var14 = s1Var3.B;
                    s1.k(g1Var14);
                    g1Var14.A().registerOnSharedPreferenceChangeListener(v2Var.Q);
                    s1.l(v2Var);
                    v2Var.B();
                }
                l1Var = g1Var.C;
                if (l1Var.g() == 0) {
                    s1.m(x0Var);
                    v0Var3.b(Long.valueOf(j), "Persisting first open");
                    l1Var.h(j);
                }
                s1.l(v2Var);
                r1Var = v2Var.N;
                if (r1Var.d()) {
                    g1 g1Var15 = r1Var.e.B;
                    s1.k(g1Var15);
                    g1Var15.T.v(null);
                }
                if (s1Var2.h()) {
                    if (s1Var2.d()) {
                        r4Var2 = r4Var;
                        if (r4Var2.Z("android.permission.INTERNET")) {
                            s1.m(x0Var);
                            v0Var7 = v0Var6;
                            v0Var7.a("App is missing INTERNET permission");
                        } else {
                            v0Var7 = v0Var6;
                        }
                        if (!r4Var2.Z("android.permission.ACCESS_NETWORK_STATE")) {
                            s1.m(x0Var);
                            v0Var7.a("App is missing ACCESS_NETWORK_STATE permission");
                        }
                        s1Var4 = s1Var2;
                        context = s1Var4.e;
                        if (!com.google.android.gms.common.wrappers.b.a(context).d()) {
                            if (!r4.r0(context)) {
                                s1.m(x0Var);
                                v0Var7.a("AppMeasurementReceiver not registered/enabled");
                            }
                            if (!r4.Q(context)) {
                                s1.m(x0Var);
                                v0Var7.a("AppMeasurementService not registered/enabled");
                            }
                        }
                        s1.m(x0Var);
                        v0Var7.a("Uploading is not possible. App measurement disabled");
                    } else {
                        s1Var4 = s1Var2;
                        r4Var2 = r4Var;
                    }
                    x0Var2 = x0Var;
                } else {
                    s1Var4 = s1Var2;
                    r4Var2 = r4Var;
                    if (TextUtils.isEmpty(s1Var4.r().C())) {
                        String strC9 = s1Var4.r().C();
                        g1Var.v();
                        String string7 = g1Var.z().getString("gmp_app_id", null);
                        zIsEmpty = TextUtils.isEmpty(strC9);
                        boolean zIsEmpty6 = TextUtils.isEmpty(string7);
                        if (zIsEmpty) {
                            b1Var2 = b1Var;
                        } else {
                            b1Var2 = b1Var;
                        }
                        String strC10 = s1Var4.r().C();
                        g1Var.v();
                        SharedPreferences.Editor editorEdit8 = g1Var.z().edit();
                        editorEdit8.putString("gmp_app_id", strC10);
                        editorEdit8.apply();
                    } else {
                        b1Var2 = b1Var;
                    }
                    if (!g1Var.C().i(e2Var)) {
                        b1Var2.v(null);
                    }
                    s1.l(v2Var);
                    v2Var.D.set(b1Var2.t());
                    s1Var6.e.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                    x0Var2 = x0Var;
                    if (!TextUtils.isEmpty(s1Var4.r().C())) {
                        zD = s1Var4.d();
                        sharedPreferences = g1Var.z;
                        if (sharedPreferences == null) {
                            zContains = z2;
                        } else {
                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                        }
                        if (!zContains) {
                            g1Var.D(!zD);
                        }
                        if (zD) {
                            s1.l(v2Var);
                            v2Var.H();
                        }
                        w3 w3Var6 = s1Var4.E;
                        s1.l(w3Var6);
                        w3Var6.B.F();
                        s1Var4.p().z(new AtomicReference());
                        s1Var4.p().A(g1Var.V.H());
                    }
                }
                g4.a();
                if (gVar.G(null, com.google.android.gms.measurement.internal.h0.P0)) {
                    r4Var2.v();
                    if (r4Var2.T() == 1) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (z3) {
                        long jIntValue6 = ((Integer) com.google.android.gms.measurement.internal.h0.w0.a(null)).intValue();
                        long jNextInt6 = new Random().nextInt(5000);
                        s1Var4.H.getClass();
                        jMax = Math.max(500L, ((jIntValue6 * 1000) + jNextInt6) - SystemClock.elapsedRealtime());
                        if (jMax > 500) {
                            s1.m(x0Var2);
                            v0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                        }
                        s1.l(v2Var);
                        v2Var.v();
                        if (v2Var.I == null) {
                            v2Var.I = new k2(v2Var, s1Var3, 0);
                        }
                        v2Var.I.b(jMax);
                    }
                }
                g1Var.L.b(true);
            }
            s1.m(x0Var6);
            p0Var = p0Var2;
            str = "Can't initialize twice";
            x0Var6.C.b(com.google.android.gms.measurement.internal.x0.D(packageName), "PackageManager is null, app identity information might be inaccurate. appId");
            strB2 = p0Var3.J;
            if (TextUtils.isEmpty(strB2)) {
                strB2 = g2.b(context3, s1Var7.M);
            }
            if (!TextUtils.isEmpty(strB2)) {
                str4 = strB2;
            }
            p0Var3.L = str4;
            if (iG == 0) {
                s1.m(x0Var6);
                x0Var6.K.c(p0Var3.z, p0Var3.L, "App measurement enabled for app package, google app id");
            }
        } catch (IllegalStateException e2) {
            s1.m(x0Var6);
            x0Var6.C.c(com.google.android.gms.measurement.internal.x0.D(packageName), e2, "Fetching Google App Id failed with exception. appId");
        }
        i = Integer.MIN_VALUE;
        string = "Unknown";
        str2 = string;
        String str9 = installerPackageName;
        p0Var3.z = packageName;
        p0Var3.C = str9;
        p0Var3.A = str2;
        p0Var3.B = i;
        p0Var3.D = string;
        p0Var3.E = 0L;
        iG = s1Var7.g();
        if (iG == 0) {
            s1.m(x0Var6);
            x0Var6.K.a("App measurement collection enabled");
        } else if (iG == 1) {
            s1.m(x0Var6);
            x0Var6.I.a("App measurement deactivated via the manifest");
        } else if (iG == 3) {
            s1.m(x0Var6);
            x0Var6.I.a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
        } else if (iG == 4) {
            s1.m(x0Var6);
            x0Var6.I.a("App measurement disabled via the manifest");
        } else if (iG == 6) {
            s1.m(x0Var6);
            x0Var6.H.a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
        } else if (iG == 7) {
            s1.m(x0Var6);
            x0Var6.I.a("App measurement disabled via the global data collection setting");
        } else if (iG != 8) {
            s1.m(x0Var6);
            x0Var6.I.a("App measurement disabled");
            s1.m(x0Var6);
            x0Var6.D.a("Invalid scion state in identity");
        } else {
            s1.m(x0Var6);
            x0Var6.I.a("App measurement disabled due to denied storage consent");
        }
        p0Var3.L = "";
        listAsList = null;
        p0Var3.H = null;
        com.google.android.gms.measurement.internal.g gVar4 = s1Var7.A;
        s1Var = (s1) gVar4.e;
        com.google.android.gms.common.internal.x.d("analytics.safelisted_events");
        bundleH = gVar4.H();
        if (bundleH != null) {
            if (bundleH.containsKey("analytics.safelisted_events")) {
                numValueOf = Integer.valueOf(bundleH.getInt("analytics.safelisted_events"));
            }
            if (numValueOf != null) {
                stringArray = s1Var.e.getResources().getStringArray(numValueOf.intValue());
                if (stringArray == null) {
                    listAsList = Arrays.asList(stringArray);
                }
            }
            if (listAsList != null) {
                p0Var3.H = listAsList;
                break;
            }
            if (listAsList.isEmpty()) {
                it = listAsList.iterator();
                do {
                    if (it.hasNext()) {
                        p0Var3.H = listAsList;
                        break;
                    } else {
                        str3 = (String) it.next();
                        r4Var3 = s1Var7.F;
                        s1.k(r4Var3);
                    }
                } while (r4Var3.A0("safelisted event", str3));
            } else {
                s1.m(x0Var6);
                x0Var6.H.a("Safelisted event list is empty. Ignoring");
            }
            if (packageManager != null) {
                p0Var3.K = com.google.android.gms.common.wrappers.a.e(context3) ? 1 : 0;
            } else {
                p0Var3.K = 0;
            }
            ((s1) p0Var3.e).Z.incrementAndGet();
            p0Var3.y = true;
            z2Var = new z2(s1Var5);
            z2Var.x();
            s1Var5.R = z2Var;
            if (!z2Var.y) {
                net.luminis.tls.engine.impl.c.r(str);
                return;
            }
            z2Var.z = (JobScheduler) ((s1) z2Var.e).e.getSystemService("jobscheduler");
            ((s1) z2Var.e).Z.incrementAndGet();
            z2Var.y = true;
            s1.m(x0Var3);
            v0Var = x0Var3.J;
            v0Var2 = x0Var3.I;
            v0Var3 = x0Var3.K;
            v0Var4 = x0Var3.C;
            gVar.B();
            v0Var2.b(161000L, "App measurement initialized, version");
            s1.m(x0Var3);
            v0Var2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
            strB = p0Var.B();
            if (r4Var4.b0(strB, gVar.z)) {
                s1.m(x0Var3);
                v0Var2.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                s1.m(x0Var3);
                v0Var2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strB)));
            }
            s1.m(x0Var3);
            v0Var.a("Debug-level message logging enabled");
            i2 = s1Var5.X;
            atomicInteger = s1Var5.Z;
            if (i2 != atomicInteger.get()) {
                s1.m(x0Var3);
                v0Var4.c(Integer.valueOf(s1Var5.X), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
            }
            s1Var5.S = true;
            j = s1Var5.a0;
            v2Var = s1Var5.J;
            p1 p1Var6 = s1Var5.D;
            s1.m(p1Var6);
            p1Var6.v();
            s1.j(s1Var5.R);
            iA = s1Var5.R.A();
            g4.a();
            zG = gVar.G(null, com.google.android.gms.measurement.internal.h0.P0);
            if (iA == 2) {
                z = true;
            } else {
                z = false;
            }
            if (zG) {
                r4Var4.v();
                if (r4Var4.T() == 1) {
                    r4Var4.v();
                    intentFilter = new IntentFilter();
                    intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    tVar = new androidx.media3.common.util.t(s1Var6);
                    z4 = z;
                    context2 = s1Var6.e;
                    x0Var = x0Var3;
                    i3 = Build.VERSION.SDK_INT;
                    v0Var5 = v0Var2;
                    if (i3 >= 33) {
                        com.google.android.gms.common.wrappers.a.h(context2, tVar, intentFilter);
                    } else if (i3 >= 26) {
                        androidx.media3.common.audio.h.q(context2, tVar, intentFilter);
                    } else {
                        context2.registerReceiver(tVar, intentFilter, null, null);
                    }
                    com.google.android.gms.measurement.internal.x0 x0Var1111 = s1Var6.C;
                    s1.m(x0Var1111);
                    x0Var1111.J.a("Registered app receiver");
                    if (z4) {
                        s1.j(s1Var5.R);
                        s1Var5.R.z(((Long) com.google.android.gms.measurement.internal.h0.C.a(null)).longValue());
                    }
                } else if (z) {
                    z = true;
                    r4Var4.v();
                    intentFilter = new IntentFilter();
                    intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    tVar = new androidx.media3.common.util.t(s1Var6);
                    z4 = z;
                    context2 = s1Var6.e;
                    x0Var = x0Var3;
                    i3 = Build.VERSION.SDK_INT;
                    v0Var5 = v0Var2;
                    if (i3 >= 33) {
                        com.google.android.gms.common.wrappers.a.h(context2, tVar, intentFilter);
                    } else if (i3 >= 26) {
                        androidx.media3.common.audio.h.q(context2, tVar, intentFilter);
                    } else {
                        context2.registerReceiver(tVar, intentFilter, null, null);
                    }
                    com.google.android.gms.measurement.internal.x0 x0Var1112 = s1Var6.C;
                    s1.m(x0Var1112);
                    x0Var1112.J.a("Registered app receiver");
                    if (z4) {
                        s1.j(s1Var5.R);
                        s1Var5.R.z(((Long) com.google.android.gms.measurement.internal.h0.C.a(null)).longValue());
                    }
                } else {
                    v0Var5 = v0Var2;
                    x0Var = x0Var3;
                }
            } else if (z) {
                z = true;
                r4Var4.v();
                intentFilter = new IntentFilter();
                intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                tVar = new androidx.media3.common.util.t(s1Var6);
                z4 = z;
                context2 = s1Var6.e;
                x0Var = x0Var3;
                i3 = Build.VERSION.SDK_INT;
                v0Var5 = v0Var2;
                if (i3 >= 33) {
                    com.google.android.gms.common.wrappers.a.h(context2, tVar, intentFilter);
                } else if (i3 >= 26) {
                    androidx.media3.common.audio.h.q(context2, tVar, intentFilter);
                } else {
                    context2.registerReceiver(tVar, intentFilter, null, null);
                }
                com.google.android.gms.measurement.internal.x0 x0Var1113 = s1Var6.C;
                s1.m(x0Var1113);
                x0Var1113.J.a("Registered app receiver");
                if (z4) {
                    s1.j(s1Var5.R);
                    s1Var5.R.z(((Long) com.google.android.gms.measurement.internal.h0.C.a(null)).longValue());
                }
            } else {
                v0Var5 = v0Var2;
                x0Var = x0Var3;
            }
            b1Var = g1Var.D;
            f2VarC = g1Var.C();
            int i13 = f2VarC.b;
            c2VarL = gVar.L("google_analytics_default_allow_ad_storage", false);
            c2VarL2 = gVar.L("google_analytics_default_allow_analytics_storage", false);
            e2Var = e2.ANALYTICS_STORAGE;
            c2Var = c2.UNINITIALIZED;
            if (c2VarL == c2Var) {
                s1Var2 = s1Var5;
                v0Var6 = v0Var4;
                r4Var = r4Var4;
                if (f2.l(-10, g1Var.z().getInt("consent_source", 100))) {
                    EnumMap enumMap9 = new EnumMap(e2.class);
                    enumMap9.put(e2.AD_STORAGE, c2VarL);
                    enumMap9.put(e2Var, c2VarL2);
                    f2Var = new f2(enumMap9, -10);
                    z2 = false;
                } else {
                    if (TextUtils.isEmpty(s1Var2.r().C())) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    f2Var = null;
                }
            } else {
                s1Var2 = s1Var5;
                v0Var6 = v0Var4;
                r4Var = r4Var4;
                if (f2.l(-10, g1Var.z().getInt("consent_source", 100))) {
                    EnumMap enumMap10 = new EnumMap(e2.class);
                    enumMap10.put(e2.AD_STORAGE, c2VarL);
                    enumMap10.put(e2Var, c2VarL2);
                    f2Var = new f2(enumMap10, -10);
                    z2 = false;
                } else {
                    if (TextUtils.isEmpty(s1Var2.r().C())) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    f2Var = null;
                }
            }
            if (f2Var != null) {
                s1.l(v2Var);
                v2Var.R(f2Var, true);
            } else {
                f2Var = f2VarC;
            }
            s1.l(v2Var);
            s1Var3 = (s1) v2Var.e;
            v2Var.V(f2Var);
            g1Var.v();
            int i14 = com.google.android.gms.measurement.internal.o.b(g1Var.z().getString("dma_consent_settings", null)).a;
            c2VarL3 = gVar.L("google_analytics_default_allow_ad_personalization_signals", true);
            if (c2VarL3 != c2Var) {
                s1.m(x0Var);
                v0Var3.b(c2VarL3, "Default ad personalization consent from Manifest");
            }
            c2VarL4 = gVar.L("google_analytics_default_allow_ad_user_data", true);
            if (c2VarL4 == c2Var) {
                if (!TextUtils.isEmpty(s1Var2.r().C())) {
                    s1.l(v2Var);
                    v2Var.Q(new com.google.android.gms.measurement.internal.o((Boolean) null, -10, (Boolean) null, (String) null), true);
                }
            } else if (!TextUtils.isEmpty(s1Var2.r().C())) {
                s1.l(v2Var);
                v2Var.Q(new com.google.android.gms.measurement.internal.o((Boolean) null, -10, (Boolean) null, (String) null), true);
            }
            boolI = gVar.I("google_analytics_tcf_data_enabled");
            if (boolI != null) {
                s1.m(x0Var);
                v0Var.a("TCF client enabled.");
                s1.l(v2Var);
                v2Var.v();
                com.google.android.gms.measurement.internal.x0 x0Var1114 = s1Var3.C;
                s1.m(x0Var1114);
                x0Var1114.J.a("Register tcfPrefChangeListener.");
                if (v2Var.Q == null) {
                    v2Var.R = new k2(v2Var, s1Var3, 2);
                    v2Var.Q = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.u2
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str10) {
                            v2 v2Var2 = v2Var;
                            v2Var2.getClass();
                            if (Objects.equals(str10, "IABTCF_TCString") || Objects.equals(str10, "IABTCF_gdprApplies") || Objects.equals(str10, "IABTCF_EnableAdvertiserConsentMode")) {
                                x0 x0Var1115 = ((s1) v2Var2.e).C;
                                s1.m(x0Var1115);
                                x0Var1115.K.a("IABTCF_TCString change picked up in listener.");
                                k2 k2Var = v2Var2.R;
                                com.google.android.gms.common.internal.x.g(k2Var);
                                k2Var.b(500L);
                            }
                        }
                    };
                }
                g1 g1Var16 = s1Var3.B;
                s1.k(g1Var16);
                g1Var16.A().registerOnSharedPreferenceChangeListener(v2Var.Q);
                s1.l(v2Var);
                v2Var.B();
            } else {
                s1.m(x0Var);
                v0Var.a("TCF client enabled.");
                s1.l(v2Var);
                v2Var.v();
                com.google.android.gms.measurement.internal.x0 x0Var1115 = s1Var3.C;
                s1.m(x0Var1115);
                x0Var1115.J.a("Register tcfPrefChangeListener.");
                if (v2Var.Q == null) {
                    v2Var.R = new k2(v2Var, s1Var3, 2);
                    v2Var.Q = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.u2
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str10) {
                            v2 v2Var2 = v2Var;
                            v2Var2.getClass();
                            if (Objects.equals(str10, "IABTCF_TCString") || Objects.equals(str10, "IABTCF_gdprApplies") || Objects.equals(str10, "IABTCF_EnableAdvertiserConsentMode")) {
                                x0 x0Var1116 = ((s1) v2Var2.e).C;
                                s1.m(x0Var1116);
                                x0Var1116.K.a("IABTCF_TCString change picked up in listener.");
                                k2 k2Var = v2Var2.R;
                                com.google.android.gms.common.internal.x.g(k2Var);
                                k2Var.b(500L);
                            }
                        }
                    };
                }
                g1 g1Var17 = s1Var3.B;
                s1.k(g1Var17);
                g1Var17.A().registerOnSharedPreferenceChangeListener(v2Var.Q);
                s1.l(v2Var);
                v2Var.B();
            }
            l1Var = g1Var.C;
            if (l1Var.g() == 0) {
                s1.m(x0Var);
                v0Var3.b(Long.valueOf(j), "Persisting first open");
                l1Var.h(j);
            }
            s1.l(v2Var);
            r1Var = v2Var.N;
            if (r1Var.d()) {
                g1 g1Var18 = r1Var.e.B;
                s1.k(g1Var18);
                g1Var18.T.v(null);
            }
            if (s1Var2.h()) {
                if (s1Var2.d()) {
                    r4Var2 = r4Var;
                    if (r4Var2.Z("android.permission.INTERNET")) {
                        s1.m(x0Var);
                        v0Var7 = v0Var6;
                        v0Var7.a("App is missing INTERNET permission");
                    } else {
                        v0Var7 = v0Var6;
                    }
                    if (!r4Var2.Z("android.permission.ACCESS_NETWORK_STATE")) {
                        s1.m(x0Var);
                        v0Var7.a("App is missing ACCESS_NETWORK_STATE permission");
                    }
                    s1Var4 = s1Var2;
                    context = s1Var4.e;
                    if (!com.google.android.gms.common.wrappers.b.a(context).d()) {
                        if (!r4.r0(context)) {
                            s1.m(x0Var);
                            v0Var7.a("AppMeasurementReceiver not registered/enabled");
                        }
                        if (!r4.Q(context)) {
                            s1.m(x0Var);
                            v0Var7.a("AppMeasurementService not registered/enabled");
                        }
                    }
                    s1.m(x0Var);
                    v0Var7.a("Uploading is not possible. App measurement disabled");
                } else {
                    s1Var4 = s1Var2;
                    r4Var2 = r4Var;
                }
                x0Var2 = x0Var;
            } else {
                s1Var4 = s1Var2;
                r4Var2 = r4Var;
                if (TextUtils.isEmpty(s1Var4.r().C())) {
                    String strC11 = s1Var4.r().C();
                    g1Var.v();
                    String string8 = g1Var.z().getString("gmp_app_id", null);
                    zIsEmpty = TextUtils.isEmpty(strC11);
                    boolean zIsEmpty7 = TextUtils.isEmpty(string8);
                    if (zIsEmpty) {
                        b1Var2 = b1Var;
                    } else {
                        b1Var2 = b1Var;
                    }
                    String strC12 = s1Var4.r().C();
                    g1Var.v();
                    SharedPreferences.Editor editorEdit9 = g1Var.z().edit();
                    editorEdit9.putString("gmp_app_id", strC12);
                    editorEdit9.apply();
                } else {
                    b1Var2 = b1Var;
                }
                if (!g1Var.C().i(e2Var)) {
                    b1Var2.v(null);
                }
                s1.l(v2Var);
                v2Var.D.set(b1Var2.t());
                s1Var6.e.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                x0Var2 = x0Var;
                if (!TextUtils.isEmpty(s1Var4.r().C())) {
                    zD = s1Var4.d();
                    sharedPreferences = g1Var.z;
                    if (sharedPreferences == null) {
                        zContains = z2;
                    } else {
                        zContains = sharedPreferences.contains("deferred_analytics_collection");
                    }
                    if (!zContains) {
                        g1Var.D(!zD);
                    }
                    if (zD) {
                        s1.l(v2Var);
                        v2Var.H();
                    }
                    w3 w3Var7 = s1Var4.E;
                    s1.l(w3Var7);
                    w3Var7.B.F();
                    s1Var4.p().z(new AtomicReference());
                    s1Var4.p().A(g1Var.V.H());
                }
            }
            g4.a();
            if (gVar.G(null, com.google.android.gms.measurement.internal.h0.P0)) {
                r4Var2.v();
                if (r4Var2.T() == 1) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (z3) {
                    long jIntValue7 = ((Integer) com.google.android.gms.measurement.internal.h0.w0.a(null)).intValue();
                    long jNextInt7 = new Random().nextInt(5000);
                    s1Var4.H.getClass();
                    jMax = Math.max(500L, ((jIntValue7 * 1000) + jNextInt7) - SystemClock.elapsedRealtime());
                    if (jMax > 500) {
                        s1.m(x0Var2);
                        v0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                    }
                    s1.l(v2Var);
                    v2Var.v();
                    if (v2Var.I == null) {
                        v2Var.I = new k2(v2Var, s1Var3, 0);
                    }
                    v2Var.I.b(jMax);
                }
            }
            g1Var.L.b(true);
        }
        com.google.android.gms.measurement.internal.x0 x0Var1116 = s1Var.C;
        s1.m(x0Var1116);
        x0Var1116.C.a("Failed to load metadata: Metadata bundle is null");
        numValueOf = null;
        if (numValueOf != null) {
            stringArray = s1Var.e.getResources().getStringArray(numValueOf.intValue());
            if (stringArray == null) {
                listAsList = Arrays.asList(stringArray);
            }
        }
        if (listAsList != null) {
            p0Var3.H = listAsList;
            break;
        }
        if (listAsList.isEmpty()) {
            it = listAsList.iterator();
            do {
                if (it.hasNext()) {
                    p0Var3.H = listAsList;
                    break;
                } else {
                    str3 = (String) it.next();
                    r4Var3 = s1Var7.F;
                    s1.k(r4Var3);
                }
            } while (r4Var3.A0("safelisted event", str3));
        } else {
            s1.m(x0Var6);
            x0Var6.H.a("Safelisted event list is empty. Ignoring");
        }
        if (packageManager != null) {
            p0Var3.K = com.google.android.gms.common.wrappers.a.e(context3) ? 1 : 0;
        } else {
            p0Var3.K = 0;
        }
        ((s1) p0Var3.e).Z.incrementAndGet();
        p0Var3.y = true;
        z2Var = new z2(s1Var5);
        z2Var.x();
        s1Var5.R = z2Var;
        if (!z2Var.y) {
            net.luminis.tls.engine.impl.c.r(str);
            return;
        }
        z2Var.z = (JobScheduler) ((s1) z2Var.e).e.getSystemService("jobscheduler");
        ((s1) z2Var.e).Z.incrementAndGet();
        z2Var.y = true;
        s1.m(x0Var3);
        v0Var = x0Var3.J;
        v0Var2 = x0Var3.I;
        v0Var3 = x0Var3.K;
        v0Var4 = x0Var3.C;
        gVar.B();
        v0Var2.b(161000L, "App measurement initialized, version");
        s1.m(x0Var3);
        v0Var2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        strB = p0Var.B();
        if (r4Var4.b0(strB, gVar.z)) {
            s1.m(x0Var3);
            v0Var2.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
        } else {
            s1.m(x0Var3);
            v0Var2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strB)));
        }
        s1.m(x0Var3);
        v0Var.a("Debug-level message logging enabled");
        i2 = s1Var5.X;
        atomicInteger = s1Var5.Z;
        if (i2 != atomicInteger.get()) {
            s1.m(x0Var3);
            v0Var4.c(Integer.valueOf(s1Var5.X), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
        }
        s1Var5.S = true;
        j = s1Var5.a0;
        v2Var = s1Var5.J;
        p1 p1Var7 = s1Var5.D;
        s1.m(p1Var7);
        p1Var7.v();
        s1.j(s1Var5.R);
        iA = s1Var5.R.A();
        g4.a();
        zG = gVar.G(null, com.google.android.gms.measurement.internal.h0.P0);
        if (iA == 2) {
            z = true;
        } else {
            z = false;
        }
        if (zG) {
            r4Var4.v();
            if (r4Var4.T() == 1) {
                r4Var4.v();
                intentFilter = new IntentFilter();
                intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                tVar = new androidx.media3.common.util.t(s1Var6);
                z4 = z;
                context2 = s1Var6.e;
                x0Var = x0Var3;
                i3 = Build.VERSION.SDK_INT;
                v0Var5 = v0Var2;
                if (i3 >= 33) {
                    com.google.android.gms.common.wrappers.a.h(context2, tVar, intentFilter);
                } else if (i3 >= 26) {
                    androidx.media3.common.audio.h.q(context2, tVar, intentFilter);
                } else {
                    context2.registerReceiver(tVar, intentFilter, null, null);
                }
                com.google.android.gms.measurement.internal.x0 x0Var1117 = s1Var6.C;
                s1.m(x0Var1117);
                x0Var1117.J.a("Registered app receiver");
                if (z4) {
                    s1.j(s1Var5.R);
                    s1Var5.R.z(((Long) com.google.android.gms.measurement.internal.h0.C.a(null)).longValue());
                }
            } else if (z) {
                z = true;
                r4Var4.v();
                intentFilter = new IntentFilter();
                intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                tVar = new androidx.media3.common.util.t(s1Var6);
                z4 = z;
                context2 = s1Var6.e;
                x0Var = x0Var3;
                i3 = Build.VERSION.SDK_INT;
                v0Var5 = v0Var2;
                if (i3 >= 33) {
                    com.google.android.gms.common.wrappers.a.h(context2, tVar, intentFilter);
                } else if (i3 >= 26) {
                    androidx.media3.common.audio.h.q(context2, tVar, intentFilter);
                } else {
                    context2.registerReceiver(tVar, intentFilter, null, null);
                }
                com.google.android.gms.measurement.internal.x0 x0Var1118 = s1Var6.C;
                s1.m(x0Var1118);
                x0Var1118.J.a("Registered app receiver");
                if (z4) {
                    s1.j(s1Var5.R);
                    s1Var5.R.z(((Long) com.google.android.gms.measurement.internal.h0.C.a(null)).longValue());
                }
            } else {
                v0Var5 = v0Var2;
                x0Var = x0Var3;
            }
        } else if (z) {
            z = true;
            r4Var4.v();
            intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
            tVar = new androidx.media3.common.util.t(s1Var6);
            z4 = z;
            context2 = s1Var6.e;
            x0Var = x0Var3;
            i3 = Build.VERSION.SDK_INT;
            v0Var5 = v0Var2;
            if (i3 >= 33) {
                com.google.android.gms.common.wrappers.a.h(context2, tVar, intentFilter);
            } else if (i3 >= 26) {
                androidx.media3.common.audio.h.q(context2, tVar, intentFilter);
            } else {
                context2.registerReceiver(tVar, intentFilter, null, null);
            }
            com.google.android.gms.measurement.internal.x0 x0Var1119 = s1Var6.C;
            s1.m(x0Var1119);
            x0Var1119.J.a("Registered app receiver");
            if (z4) {
                s1.j(s1Var5.R);
                s1Var5.R.z(((Long) com.google.android.gms.measurement.internal.h0.C.a(null)).longValue());
            }
        } else {
            v0Var5 = v0Var2;
            x0Var = x0Var3;
        }
        b1Var = g1Var.D;
        f2VarC = g1Var.C();
        int i15 = f2VarC.b;
        c2VarL = gVar.L("google_analytics_default_allow_ad_storage", false);
        c2VarL2 = gVar.L("google_analytics_default_allow_analytics_storage", false);
        e2Var = e2.ANALYTICS_STORAGE;
        c2Var = c2.UNINITIALIZED;
        if (c2VarL == c2Var) {
            s1Var2 = s1Var5;
            v0Var6 = v0Var4;
            r4Var = r4Var4;
            if (f2.l(-10, g1Var.z().getInt("consent_source", 100))) {
                EnumMap enumMap11 = new EnumMap(e2.class);
                enumMap11.put(e2.AD_STORAGE, c2VarL);
                enumMap11.put(e2Var, c2VarL2);
                f2Var = new f2(enumMap11, -10);
                z2 = false;
            } else {
                if (TextUtils.isEmpty(s1Var2.r().C())) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                f2Var = null;
            }
        } else {
            s1Var2 = s1Var5;
            v0Var6 = v0Var4;
            r4Var = r4Var4;
            if (f2.l(-10, g1Var.z().getInt("consent_source", 100))) {
                EnumMap enumMap12 = new EnumMap(e2.class);
                enumMap12.put(e2.AD_STORAGE, c2VarL);
                enumMap12.put(e2Var, c2VarL2);
                f2Var = new f2(enumMap12, -10);
                z2 = false;
            } else {
                if (TextUtils.isEmpty(s1Var2.r().C())) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                f2Var = null;
            }
        }
        if (f2Var != null) {
            s1.l(v2Var);
            v2Var.R(f2Var, true);
        } else {
            f2Var = f2VarC;
        }
        s1.l(v2Var);
        s1Var3 = (s1) v2Var.e;
        v2Var.V(f2Var);
        g1Var.v();
        int i16 = com.google.android.gms.measurement.internal.o.b(g1Var.z().getString("dma_consent_settings", null)).a;
        c2VarL3 = gVar.L("google_analytics_default_allow_ad_personalization_signals", true);
        if (c2VarL3 != c2Var) {
            s1.m(x0Var);
            v0Var3.b(c2VarL3, "Default ad personalization consent from Manifest");
        }
        c2VarL4 = gVar.L("google_analytics_default_allow_ad_user_data", true);
        if (c2VarL4 == c2Var) {
            if (!TextUtils.isEmpty(s1Var2.r().C())) {
                s1.l(v2Var);
                v2Var.Q(new com.google.android.gms.measurement.internal.o((Boolean) null, -10, (Boolean) null, (String) null), true);
            }
        } else if (!TextUtils.isEmpty(s1Var2.r().C())) {
            s1.l(v2Var);
            v2Var.Q(new com.google.android.gms.measurement.internal.o((Boolean) null, -10, (Boolean) null, (String) null), true);
        }
        boolI = gVar.I("google_analytics_tcf_data_enabled");
        if (boolI != null) {
            s1.m(x0Var);
            v0Var.a("TCF client enabled.");
            s1.l(v2Var);
            v2Var.v();
            com.google.android.gms.measurement.internal.x0 x0Var11110 = s1Var3.C;
            s1.m(x0Var11110);
            x0Var11110.J.a("Register tcfPrefChangeListener.");
            if (v2Var.Q == null) {
                v2Var.R = new k2(v2Var, s1Var3, 2);
                v2Var.Q = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.u2
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str10) {
                        v2 v2Var2 = v2Var;
                        v2Var2.getClass();
                        if (Objects.equals(str10, "IABTCF_TCString") || Objects.equals(str10, "IABTCF_gdprApplies") || Objects.equals(str10, "IABTCF_EnableAdvertiserConsentMode")) {
                            x0 x0Var11111 = ((s1) v2Var2.e).C;
                            s1.m(x0Var11111);
                            x0Var11111.K.a("IABTCF_TCString change picked up in listener.");
                            k2 k2Var = v2Var2.R;
                            com.google.android.gms.common.internal.x.g(k2Var);
                            k2Var.b(500L);
                        }
                    }
                };
            }
            g1 g1Var19 = s1Var3.B;
            s1.k(g1Var19);
            g1Var19.A().registerOnSharedPreferenceChangeListener(v2Var.Q);
            s1.l(v2Var);
            v2Var.B();
        } else {
            s1.m(x0Var);
            v0Var.a("TCF client enabled.");
            s1.l(v2Var);
            v2Var.v();
            com.google.android.gms.measurement.internal.x0 x0Var11111 = s1Var3.C;
            s1.m(x0Var11111);
            x0Var11111.J.a("Register tcfPrefChangeListener.");
            if (v2Var.Q == null) {
                v2Var.R = new k2(v2Var, s1Var3, 2);
                v2Var.Q = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.u2
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str10) {
                        v2 v2Var2 = v2Var;
                        v2Var2.getClass();
                        if (Objects.equals(str10, "IABTCF_TCString") || Objects.equals(str10, "IABTCF_gdprApplies") || Objects.equals(str10, "IABTCF_EnableAdvertiserConsentMode")) {
                            x0 x0Var11112 = ((s1) v2Var2.e).C;
                            s1.m(x0Var11112);
                            x0Var11112.K.a("IABTCF_TCString change picked up in listener.");
                            k2 k2Var = v2Var2.R;
                            com.google.android.gms.common.internal.x.g(k2Var);
                            k2Var.b(500L);
                        }
                    }
                };
            }
            g1 g1Var110 = s1Var3.B;
            s1.k(g1Var110);
            g1Var110.A().registerOnSharedPreferenceChangeListener(v2Var.Q);
            s1.l(v2Var);
            v2Var.B();
        }
        l1Var = g1Var.C;
        if (l1Var.g() == 0) {
            s1.m(x0Var);
            v0Var3.b(Long.valueOf(j), "Persisting first open");
            l1Var.h(j);
        }
        s1.l(v2Var);
        r1Var = v2Var.N;
        if (r1Var.d()) {
            g1 g1Var111 = r1Var.e.B;
            s1.k(g1Var111);
            g1Var111.T.v(null);
        }
        if (s1Var2.h()) {
            if (s1Var2.d()) {
                r4Var2 = r4Var;
                if (r4Var2.Z("android.permission.INTERNET")) {
                    s1.m(x0Var);
                    v0Var7 = v0Var6;
                    v0Var7.a("App is missing INTERNET permission");
                } else {
                    v0Var7 = v0Var6;
                }
                if (!r4Var2.Z("android.permission.ACCESS_NETWORK_STATE")) {
                    s1.m(x0Var);
                    v0Var7.a("App is missing ACCESS_NETWORK_STATE permission");
                }
                s1Var4 = s1Var2;
                context = s1Var4.e;
                if (!com.google.android.gms.common.wrappers.b.a(context).d()) {
                    if (!r4.r0(context)) {
                        s1.m(x0Var);
                        v0Var7.a("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!r4.Q(context)) {
                        s1.m(x0Var);
                        v0Var7.a("AppMeasurementService not registered/enabled");
                    }
                }
                s1.m(x0Var);
                v0Var7.a("Uploading is not possible. App measurement disabled");
            } else {
                s1Var4 = s1Var2;
                r4Var2 = r4Var;
            }
            x0Var2 = x0Var;
        } else {
            s1Var4 = s1Var2;
            r4Var2 = r4Var;
            if (TextUtils.isEmpty(s1Var4.r().C())) {
                String strC13 = s1Var4.r().C();
                g1Var.v();
                String string9 = g1Var.z().getString("gmp_app_id", null);
                zIsEmpty = TextUtils.isEmpty(strC13);
                boolean zIsEmpty8 = TextUtils.isEmpty(string9);
                if (zIsEmpty) {
                    b1Var2 = b1Var;
                } else {
                    b1Var2 = b1Var;
                }
                String strC14 = s1Var4.r().C();
                g1Var.v();
                SharedPreferences.Editor editorEdit10 = g1Var.z().edit();
                editorEdit10.putString("gmp_app_id", strC14);
                editorEdit10.apply();
            } else {
                b1Var2 = b1Var;
            }
            if (!g1Var.C().i(e2Var)) {
                b1Var2.v(null);
            }
            s1.l(v2Var);
            v2Var.D.set(b1Var2.t());
            s1Var6.e.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            x0Var2 = x0Var;
            if (!TextUtils.isEmpty(s1Var4.r().C())) {
                zD = s1Var4.d();
                sharedPreferences = g1Var.z;
                if (sharedPreferences == null) {
                    zContains = z2;
                } else {
                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                }
                if (!zContains) {
                    g1Var.D(!zD);
                }
                if (zD) {
                    s1.l(v2Var);
                    v2Var.H();
                }
                w3 w3Var8 = s1Var4.E;
                s1.l(w3Var8);
                w3Var8.B.F();
                s1Var4.p().z(new AtomicReference());
                s1Var4.p().A(g1Var.V.H());
            }
        }
        g4.a();
        if (gVar.G(null, com.google.android.gms.measurement.internal.h0.P0)) {
            r4Var2.v();
            if (r4Var2.T() == 1) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (z3) {
                long jIntValue8 = ((Integer) com.google.android.gms.measurement.internal.h0.w0.a(null)).intValue();
                long jNextInt8 = new Random().nextInt(5000);
                s1Var4.H.getClass();
                jMax = Math.max(500L, ((jIntValue8 * 1000) + jNextInt8) - SystemClock.elapsedRealtime());
                if (jMax > 500) {
                    s1.m(x0Var2);
                    v0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                }
                s1.l(v2Var);
                v2Var.v();
                if (v2Var.I == null) {
                    v2Var.I = new k2(v2Var, s1Var3, 0);
                }
                v2Var.I.b(jMax);
            }
        }
        g1Var.L.b(true);
    }

    private final void b() {
        com.google.android.gms.tasks.n nVar = (com.google.android.gms.tasks.n) this.z;
        synchronized (nVar.z) {
            try {
                com.google.android.gms.tasks.e eVar = (com.google.android.gms.tasks.e) nVar.A;
                if (eVar != null) {
                    Exception excE = ((com.google.android.gms.tasks.i) this.y).e();
                    com.google.android.gms.common.internal.x.g(excE);
                    eVar.z(excE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c() {
        com.google.android.gms.tasks.n nVar = (com.google.android.gms.tasks.n) this.z;
        synchronized (nVar.z) {
            try {
                com.google.android.gms.tasks.f fVar = (com.google.android.gms.tasks.f) nVar.A;
                if (fVar != null) {
                    fVar.b(((com.google.android.gms.tasks.i) this.y).f());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:139:0x037d  */
    /* JADX WARN: Code duplicated, block: B:243:0x05b0 A[Catch: all -> 0x05ae, TryCatch #10 {all -> 0x05ae, blocks: (B:229:0x0590, B:231:0x0594, B:233:0x0598, B:238:0x05a5, B:243:0x05b0, B:244:0x05bb), top: B:366:0x0590 }] */
    /* JADX WARN: Code duplicated, block: B:370:0x038e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v114, types: [android.app.Service] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable thO;
        com.google.firebase.platforminfo.c cVar;
        com.app.mlounge.data.music.e eVar;
        androidx.appcompat.widget.g gVar;
        com.google.android.gms.common.internal.i iVar;
        ?? r9;
        ?? r10;
        com.google.android.gms.common.internal.i j0Var;
        Long lValueOf;
        int i = 0;
         = 0;
        ?? r3 = 0;
        int i2 = 1;
        switch (this.e) {
            case 0:
                k0 k0Var = (k0) this.z;
                Future future = (Future) this.y;
                if ((future instanceof r) && (thO = ((r) future).o()) != null) {
                    k0Var.l(thO);
                    return;
                }
                try {
                    k0Var.b(n0.b(future));
                    return;
                } catch (ExecutionException e) {
                    k0Var.l(e.getCause());
                    return;
                } catch (Throwable th) {
                    k0Var.l(th);
                    return;
                }
            case 1:
                androidx.appcompat.widget.g gVar2 = (androidx.appcompat.widget.g) this.y;
                androidx.appcompat.widget.j jVar = (androidx.appcompat.widget.j) this.z;
                androidx.appcompat.view.menu.j jVar2 = jVar.z;
                if (jVar2 != null && (cVar = jVar2.e) != null && (eVar = ((ActionMenuView) cVar.e).Q) != null) {
                    Toolbar toolbar = (Toolbar) eVar.y;
                    androidx.appcompat.widget.j jVar3 = toolbar.e.P;
                    if (jVar3 == null || (gVar = jVar3.O) == null || !gVar.b()) {
                        Iterator it = toolbar.g0.b.iterator();
                        while (it.hasNext()) {
                            ((androidx.fragment.app.f) ((androidx.core.view.n) it.next())).a.u();
                        }
                    }
                }
                ActionMenuView actionMenuView = jVar.D;
                if (actionMenuView != null && actionMenuView.getWindowToken() != null) {
                    if (gVar2.b()) {
                        jVar.O = gVar2;
                    } else if (gVar2.e != null) {
                        gVar2.d(0, 0, false, false);
                        jVar.O = gVar2;
                    }
                }
                jVar.Q = null;
                return;
            case 2:
                com.google.firebase.platforminfo.c cVar2 = (com.google.firebase.platforminfo.c) this.y;
                Typeface typeface = (Typeface) this.z;
                androidx.core.content.res.b bVar = (androidx.core.content.res.b) cVar2.e;
                if (bVar != null) {
                    bVar.f(typeface);
                    return;
                }
                return;
            case 3:
                ((androidx.core.provider.f) this.y).accept(this.z);
                return;
            case 4:
                com.google.android.gms.cloudmessaging.l lVar = (com.google.android.gms.cloudmessaging.l) this.y;
                IBinder iBinder = (IBinder) this.z;
                synchronized (lVar) {
                    if (iBinder == null) {
                        lVar.a("Null service connection");
                    } else {
                        try {
                            lVar.z = new coil3.memory.c(iBinder);
                            lVar.e = 2;
                            ((ScheduledExecutorService) lVar.C.z).execute(new com.google.android.gms.cloudmessaging.j(lVar, i));
                        } catch (RemoteException e2) {
                            lVar.a(e2.getMessage());
                        }
                    }
                }
                return;
            case 5:
                com.google.android.gms.cloudmessaging.l lVar2 = (com.google.android.gms.cloudmessaging.l) this.y;
                int i3 = ((com.google.android.gms.cloudmessaging.m) this.z).a;
                synchronized (lVar2) {
                    com.google.android.gms.cloudmessaging.m mVar = (com.google.android.gms.cloudmessaging.m) lVar2.B.get(i3);
                    if (mVar != null) {
                        Log.w("MessengerIpcClient", "Timing out request: " + i3);
                        lVar2.B.remove(i3);
                        mVar.b(new androidx.compose.runtime.snapshots.g("Timed out waiting for response", (Throwable) null));
                        lVar2.c();
                    }
                    break;
                }
                return;
            case 6:
                com.google.android.gms.common.b bVar2 = (com.google.android.gms.common.b) this.y;
                com.google.android.gms.common.api.internal.m mVar2 = (com.google.android.gms.common.api.internal.m) this.z;
                com.google.android.gms.common.api.c cVar3 = (com.google.android.gms.common.api.c) mVar2.y;
                com.google.android.gms.common.api.internal.k kVar = (com.google.android.gms.common.api.internal.k) ((com.google.android.gms.common.api.internal.e) mVar2.C).G.get((com.google.android.gms.common.api.internal.b) mVar2.z);
                if (kVar == null) {
                    return;
                }
                if (bVar2.y != 0) {
                    kVar.p(bVar2, null);
                    return;
                }
                mVar2.e = true;
                if (cVar3.l()) {
                    if (!mVar2.e || (iVar = (com.google.android.gms.common.internal.i) mVar2.A) == null) {
                        return;
                    }
                    cVar3.b(iVar, (Set) mVar2.B);
                    return;
                }
                try {
                    cVar3.b(null, cVar3.a());
                    return;
                } catch (SecurityException e3) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e3);
                    cVar3.c("Failed to get service from broker.");
                    kVar.p(new com.google.android.gms.common.b(10, null, null), null);
                    return;
                }
            case 7:
                androidx.emoji2.text.f fVar = (androidx.emoji2.text.f) this.y;
                s5 s5Var = (s5) this.z;
                j5 j5Var = (j5) fVar.b;
                if (j5Var == null) {
                    return;
                }
                s5Var.getClass();
                try {
                    byte[] bArr = (byte[]) s5Var.y;
                    com.google.android.gms.internal.measurement.a1 a1Var = com.google.android.gms.internal.measurement.a1.a;
                    int i4 = com.google.android.gms.internal.measurement.o0.a;
                    qc qcVarV = qc.v(bArr, com.google.android.gms.internal.measurement.a1.b);
                    ?? r6 = false;
                    for (mc mcVar : ((zc) j5Var.z).f) {
                        List listU = qcVarV.u();
                        mcVar.getClass();
                        s5 s5Var2 = pc.i;
                        s5Var2.getClass();
                        if (listU == null || listU.isEmpty()) {
                            r9 = false;
                        } else {
                            Iterator it2 = listU.iterator();
                            r9 = false;
                            while (it2.hasNext()) {
                                ic icVar = (ic) ((ConcurrentHashMap) s5Var2.y).get((String) it2.next());
                                if (icVar != null) {
                                    pc pcVar = icVar.a;
                                    if (pcVar.e) {
                                        androidx.compose.material.ripple.g gVar3 = pcVar.a;
                                        if (gVar3 != null && (gVar3.a || ((androidx.core.view.r) gVar3.e).a == 3 || pcVar.h.b())) {
                                            synchronized (pcVar) {
                                                try {
                                                    androidx.compose.material.ripple.g gVar4 = pcVar.a;
                                                    if (gVar4 != null) {
                                                        if (gVar4.a) {
                                                            pcVar.a = null;
                                                            ((AtomicInteger) pcVar.g.y).incrementAndGet();
                                                        } else if ((((androidx.core.view.r) gVar4.e).a == 3) != false || pcVar.h.b()) {
                                                            pcVar.a = null;
                                                            ((AtomicInteger) pcVar.g.y).incrementAndGet();
                                                        }
                                                    }
                                                } catch (Throwable th2) {
                                                    throw th2;
                                                }
                                            }
                                        }
                                        r10 = false;
                                    } else {
                                        r10 = true;
                                    }
                                    r9 = (r9 == true ? 1 : 0) | r10;
                                }
                            }
                        }
                        if (r9 != false && r6 == false) {
                            ((dd) j5Var.y).a();
                            r6 = true;
                        }
                    }
                    return;
                } catch (t1 unused) {
                    j5Var.getClass();
                    return;
                }
            case 8:
                com.google.android.gms.common.api.internal.u uVar = (com.google.android.gms.common.api.internal.u) this.z;
                com.google.android.gms.signin.internal.e eVar2 = (com.google.android.gms.signin.internal.e) this.y;
                com.google.android.gms.common.b bVar3 = eVar2.y;
                if (bVar3.y == 0) {
                    com.google.android.gms.common.internal.r rVar = eVar2.z;
                    com.google.android.gms.common.internal.x.g(rVar);
                    com.google.android.gms.common.b bVar4 = rVar.z;
                    if (bVar4.y != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(bVar4)), new Exception());
                        uVar.k.c(bVar4);
                        uVar.j.o();
                        return;
                    }
                    com.google.android.gms.common.api.internal.m mVar3 = uVar.k;
                    IBinder iBinder2 = rVar.y;
                    if (iBinder2 == null) {
                        j0Var = null;
                    } else {
                        int i5 = com.google.android.gms.common.internal.a.e;
                        IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        j0Var = iInterfaceQueryLocalInterface instanceof com.google.android.gms.common.internal.i ? (com.google.android.gms.common.internal.i) iInterfaceQueryLocalInterface : new com.google.android.gms.common.internal.j0(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 1);
                    }
                    Set set = uVar.h;
                    mVar3.getClass();
                    if (j0Var == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        mVar3.c(new com.google.android.gms.common.b(4, null, null));
                    } else {
                        mVar3.A = j0Var;
                        mVar3.B = set;
                        if (mVar3.e) {
                            ((com.google.android.gms.common.api.c) mVar3.y).b(j0Var, set);
                        }
                    }
                } else {
                    uVar.k.c(bVar3);
                }
                uVar.j.o();
                return;
            case 9:
                b2 b2Var = (b2) this.y;
                b2Var.a();
                if (com.google.android.material.shape.g.q()) {
                    b2Var.e().E(this);
                    return;
                }
                com.google.android.gms.measurement.internal.n nVar = (com.google.android.gms.measurement.internal.n) this.z;
                i = nVar.c != 0 ? 1 : 0;
                nVar.c = 0L;
                if (i != 0) {
                    nVar.a();
                    return;
                }
                return;
            case 10:
                h1 h1Var = (h1) this.z;
                s1 s1Var = h1Var.y.b;
                p1 p1Var = s1Var.D;
                s1.m(p1Var);
                p1Var.v();
                Bundle bundle = new Bundle();
                bundle.putString("package_name", h1Var.e);
                try {
                    p5 p5Var = (p5) ((r5) this.y);
                    Parcel parcelH = p5Var.h();
                    o5.b(parcelH, bundle);
                    Parcel parcelG = p5Var.g(parcelH, 1);
                    Bundle bundle2 = (Bundle) o5.a(parcelG, Bundle.CREATOR);
                    parcelG.recycle();
                    if (bundle2 == null) {
                        com.google.android.gms.measurement.internal.x0 x0Var = s1Var.C;
                        s1.m(x0Var);
                        x0Var.C.a("Install Referrer Service returned a null response");
                    }
                    break;
                } catch (Exception e4) {
                    com.google.android.gms.measurement.internal.x0 x0Var2 = s1Var.C;
                    s1.m(x0Var2);
                    x0Var2.C.b(e4.getMessage(), "Exception occurred while retrieving the Install Referrer");
                }
                p1 p1Var2 = s1Var.D;
                s1.m(p1Var2);
                p1Var2.v();
                throw new IllegalStateException("Unexpected call on client side");
            case 11:
                a();
                return;
            case 12:
                z1 z1Var = (z1) this.z;
                z1Var.d.W();
                com.google.android.gms.measurement.internal.e eVar3 = (com.google.android.gms.measurement.internal.e) this.y;
                Object objD = eVar3.z.d();
                l4 l4Var = z1Var.d;
                if (objD == null) {
                    l4Var.getClass();
                    String str = eVar3.e;
                    com.google.android.gms.common.internal.x.g(str);
                    t4 t4VarQ = l4Var.Q(str);
                    if (t4VarQ != null) {
                        l4Var.b0(eVar3, t4VarQ);
                        return;
                    }
                    return;
                }
                l4Var.getClass();
                String str2 = eVar3.e;
                com.google.android.gms.common.internal.x.g(str2);
                t4 t4VarQ2 = l4Var.Q(str2);
                if (t4VarQ2 != null) {
                    l4Var.a0(eVar3, t4VarQ2);
                    return;
                }
                return;
            case 13:
                b6 b6Var = (b6) this.y;
                v2 v2Var = (v2) this.z;
                w3 w3Var = ((s1) v2Var.e).E;
                s1.l(w3Var);
                s1 s1Var2 = (s1) w3Var.e;
                g1 g1Var = s1Var2.B;
                g1 g1Var2 = s1Var2.B;
                s1.k(g1Var);
                if (g1Var.C().i(e2.ANALYTICS_STORAGE)) {
                    s1.k(g1Var2);
                    s1Var2.H.getClass();
                    if (!g1Var2.E(System.currentTimeMillis())) {
                        s1.k(g1Var2);
                        if (g1Var2.N.g() != 0) {
                            s1.k(g1Var2);
                            lValueOf = Long.valueOf(g1Var2.N.g());
                        }
                    }
                    if (lValueOf == null) {
                        r4 r4Var = ((s1) v2Var.e).F;
                        s1.k(r4Var);
                        r4Var.k0(b6Var, lValueOf.longValue());
                        return;
                    } else {
                        try {
                            b6Var.w(null);
                            return;
                        } catch (RemoteException e5) {
                            com.google.android.gms.measurement.internal.x0 x0Var3 = ((s1) v2Var.e).C;
                            s1.m(x0Var3);
                            x0Var3.C.b(e5, "getSessionId failed with exception");
                            return;
                        }
                    }
                }
                com.google.android.gms.measurement.internal.x0 x0Var4 = s1Var2.C;
                s1.m(x0Var4);
                x0Var4.H.a("Analytics storage consent denied; will not get session id");
                lValueOf = null;
                if (lValueOf == null) {
                    b6Var.w(null);
                    return;
                }
                r4 r4Var2 = ((s1) v2Var.e).F;
                s1.k(r4Var2);
                r4Var2.k0(b6Var, lValueOf.longValue());
                return;
            case 14:
                ((v2) this.z).M((Boolean) this.y, true);
                return;
            case 15:
                v2 v2Var2 = (v2) this.z;
                s1 s1Var3 = (s1) v2Var2.e;
                g1 g1Var3 = s1Var3.B;
                com.google.android.gms.measurement.internal.x0 x0Var5 = s1Var3.C;
                s1.k(g1Var3);
                g1Var3.v();
                g1Var3.v();
                com.google.android.gms.measurement.internal.o oVarB = com.google.android.gms.measurement.internal.o.b(g1Var3.z().getString("dma_consent_settings", null));
                com.google.android.gms.measurement.internal.o oVar = (com.google.android.gms.measurement.internal.o) this.y;
                int i6 = oVar.a;
                if (!f2.l(i6, oVarB.a)) {
                    s1.m(x0Var5);
                    x0Var5.I.b(Integer.valueOf(i6), "Lower precedence consent source ignored, proposed source");
                    return;
                }
                SharedPreferences.Editor editorEdit = g1Var3.z().edit();
                editorEdit.putString("dma_consent_settings", oVar.b);
                editorEdit.apply();
                s1.m(x0Var5);
                x0Var5.K.b(oVar, "Setting DMA consent(FE)");
                s1 s1Var4 = (s1) v2Var2.e;
                if (s1Var4.p().F()) {
                    o3 o3VarP = s1Var4.p();
                    o3VarP.v();
                    o3VarP.w();
                    o3VarP.J(new m3(o3VarP, i2));
                    return;
                }
                o3 o3VarP2 = s1Var4.p();
                o3VarP2.v();
                o3VarP2.w();
                if (o3VarP2.E()) {
                    o3VarP2.J(new j3(o3VarP2, o3VarP2.L(false)));
                    return;
                }
                return;
            case 16:
                v2 v2Var3 = ((AppMeasurementDynamiteService) this.z).d.J;
                s1.l(v2Var3);
                coil3.memory.c cVar4 = (coil3.memory.c) this.y;
                v2Var3.v();
                v2Var3.w();
                coil3.memory.c cVar5 = v2Var3.A;
                if (cVar4 != cVar5) {
                    com.google.android.gms.common.internal.x.i("EventInterceptor already set.", cVar5 == null);
                }
                v2Var3.A = cVar4;
                return;
            case 17:
                s1 s1Var5 = (s1) ((v2) this.y).e;
                com.google.android.gms.measurement.internal.p0 p0VarR = s1Var5.r();
                String str3 = (String) this.z;
                String str4 = p0VarR.O;
                if (str4 != null && !str4.equals(str3)) {
                    r3 = 1;
                }
                p0VarR.O = str3;
                if (r3 != 0) {
                    s1Var5.r().A();
                    return;
                }
                return;
            case 18:
                o3 o3Var = (o3) this.z;
                com.google.android.gms.measurement.internal.k0 k0Var2 = o3Var.A;
                s1 s1Var6 = (s1) o3Var.e;
                if (k0Var2 == null) {
                    com.google.android.gms.measurement.internal.x0 x0Var6 = s1Var6.C;
                    s1.m(x0Var6);
                    x0Var6.C.a("Failed to send current screen to service");
                    return;
                }
                try {
                    c3 c3Var = (c3) this.y;
                    if (c3Var == null) {
                        k0Var2.k(0L, null, null, s1Var6.e.getPackageName());
                    } else {
                        k0Var2.k(c3Var.c, c3Var.a, c3Var.b, s1Var6.e.getPackageName());
                    }
                    o3Var.I();
                    return;
                } catch (RemoteException e6) {
                    com.google.android.gms.measurement.internal.x0 x0Var7 = ((s1) o3Var.e).C;
                    s1.m(x0Var7);
                    x0Var7.C.b(e6, "Failed to send current screen to the service");
                    return;
                }
            case 19:
                ((n3) this.z).z.G((ComponentName) this.y);
                return;
            case 20:
                o3 o3Var2 = ((n3) this.z).z;
                o3Var2.A = null;
                if (((com.google.android.gms.common.b) this.y).y != 7777) {
                    o3Var2.K();
                    return;
                }
                if (o3Var2.D == null) {
                    o3Var2.D = Executors.newScheduledThreadPool(1);
                }
                o3Var2.D.schedule(new androidx.appcompat.widget.z0(this, 20), ((Long) com.google.android.gms.measurement.internal.h0.Z.a(null)).longValue(), TimeUnit.MILLISECONDS);
                return;
            case 21:
                l4 l4Var2 = (l4) this.y;
                l4Var2.W();
                Runnable runnable = (Runnable) this.z;
                l4Var2.e().v();
                if (l4Var2.M == null) {
                    l4Var2.M = new ArrayList();
                }
                l4Var2.M.add(runnable);
                l4Var2.q();
                return;
            case 22:
                androidx.media3.exoplayer.dash.manifest.t tVar = (androidx.media3.exoplayer.dash.manifest.t) this.y;
                JobParameters jobParameters = (JobParameters) this.z;
                Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
                ((r3) ((Service) tVar.y)).c(jobParameters);
                return;
            case 23:
                com.google.android.gms.tasks.i iVar2 = (com.google.android.gms.tasks.i) this.y;
                boolean z = ((com.google.android.gms.tasks.q) iVar2).d;
                com.google.android.gms.tasks.m mVar4 = (com.google.android.gms.tasks.m) this.z;
                if (z) {
                    mVar4.A.n();
                    return;
                }
                try {
                    ((com.google.android.gms.tasks.m) this.z).A.k(mVar4.z.d(iVar2));
                    return;
                } catch (com.google.android.gms.tasks.g e7) {
                    boolean z2 = e7.getCause() instanceof Exception;
                    com.google.android.gms.tasks.m mVar5 = (com.google.android.gms.tasks.m) this.z;
                    if (z2) {
                        mVar5.A.m((Exception) e7.getCause());
                        return;
                    } else {
                        mVar5.A.m(e7);
                        return;
                    }
                } catch (Exception e8) {
                    ((com.google.android.gms.tasks.m) this.z).A.m(e8);
                    return;
                }
            case 24:
                com.google.android.gms.tasks.m mVar6 = (com.google.android.gms.tasks.m) this.z;
                try {
                    com.google.android.gms.tasks.i iVar3 = (com.google.android.gms.tasks.i) mVar6.z.d((com.google.android.gms.tasks.i) this.y);
                    if (iVar3 == null) {
                        mVar6.z(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    com.google.android.gms.tasks.p pVar = com.google.android.gms.tasks.k.b;
                    iVar3.c(pVar, mVar6);
                    iVar3.b(pVar, mVar6);
                    com.google.android.gms.tasks.q qVar = (com.google.android.gms.tasks.q) iVar3;
                    qVar.b.h(new com.google.android.gms.tasks.n((Executor) pVar, (com.google.android.gms.tasks.c) mVar6));
                    qVar.p();
                    return;
                } catch (com.google.android.gms.tasks.g e9) {
                    if (e9.getCause() instanceof Exception) {
                        mVar6.A.m((Exception) e9.getCause());
                        return;
                    } else {
                        mVar6.A.m(e9);
                        return;
                    }
                } catch (Exception e10) {
                    mVar6.A.m(e10);
                    return;
                }
            case 25:
                com.google.android.gms.tasks.n nVar2 = (com.google.android.gms.tasks.n) this.z;
                synchronized (nVar2.z) {
                    ((com.google.android.gms.tasks.d) nVar2.A).onComplete((com.google.android.gms.tasks.i) this.y);
                    break;
                }
                return;
            case 26:
                b();
                return;
            case 27:
                c();
                return;
            case 28:
                com.google.android.gms.tasks.n nVar3 = (com.google.android.gms.tasks.n) this.z;
                try {
                    com.google.android.gms.tasks.q qVarE = ((com.google.android.gms.tasks.h) nVar3.z).e(((com.google.android.gms.tasks.i) this.y).f());
                    com.google.android.gms.tasks.p pVar2 = com.google.android.gms.tasks.k.b;
                    qVarE.c(pVar2, nVar3);
                    qVarE.b(pVar2, nVar3);
                    qVarE.b.h(new com.google.android.gms.tasks.n((Executor) pVar2, (com.google.android.gms.tasks.c) nVar3));
                    qVarE.p();
                    return;
                } catch (com.google.android.gms.tasks.g e11) {
                    if (e11.getCause() instanceof Exception) {
                        nVar3.z((Exception) e11.getCause());
                        return;
                    } else {
                        ((com.google.android.gms.tasks.q) nVar3.A).m(e11);
                        return;
                    }
                } catch (CancellationException unused2) {
                    nVar3.l();
                    return;
                } catch (Exception e12) {
                    ((com.google.android.gms.tasks.q) nVar3.A).m(e12);
                    return;
                }
            default:
                com.google.android.gms.tasks.q qVar2 = (com.google.android.gms.tasks.q) this.y;
                try {
                    qVar2.k(((Callable) this.z).call());
                    return;
                } catch (Exception e13) {
                    qVar2.m(e13);
                    return;
                } catch (Throwable th3) {
                    qVar2.m(new RuntimeException(th3));
                    return;
                }
        }
    }

    public String toString() {
        switch (this.e) {
            case 0:
                com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar = new com.google.android.datatransport.runtime.scheduling.jobscheduling.c(l0.class.getSimpleName());
                k0 k0Var = (k0) this.z;
                coil3.memory.c cVar2 = new coil3.memory.c(28, false);
                ((coil3.memory.c) cVar.A).z = cVar2;
                cVar.A = cVar2;
                cVar2.y = k0Var;
                return cVar.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ l0(int i, Object obj, Object obj2, boolean z) {
        this.e = i;
        this.z = obj;
        this.y = obj2;
    }

    public l0(androidx.media3.exoplayer.dash.manifest.t tVar, l4 l4Var, Runnable runnable) {
        this.e = 21;
        this.y = l4Var;
        this.z = runnable;
    }

    public l0(h1 h1Var, r5 r5Var, h1 h1Var2) {
        this.e = 10;
        this.y = r5Var;
        this.z = h1Var;
    }

    public /* synthetic */ l0(int i, Object obj, Object obj2) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
    }

    public l0(o3 o3Var, c3 c3Var) {
        this.e = 18;
        this.y = c3Var;
        Objects.requireNonNull(o3Var);
        this.z = o3Var;
    }
}
