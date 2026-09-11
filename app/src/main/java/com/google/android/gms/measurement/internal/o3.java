package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o3 extends j0 {
    public k0 A;
    public volatile Boolean B;
    public final k3 C;
    public ScheduledExecutorService D;
    public final androidx.compose.foundation.gestures.y2 E;
    public final ArrayList F;
    public final k3 G;
    public final n3 z;

    public o3(s1 s1Var) {
        super(s1Var);
        this.F = new ArrayList();
        this.E = new androidx.compose.foundation.gestures.y2(s1Var.H);
        this.z = new n3(this);
        this.C = new k3(this, s1Var, 0);
        this.G = new k3(this, s1Var, 1);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:14:0x0059  */
    public final void A(Bundle bundle) {
        boolean z;
        boolean zC;
        v();
        w();
        t tVar = new t(bundle);
        H();
        s1 s1Var = (s1) this.e;
        if (s1Var.A.G(null, h0.W0)) {
            r0 r0VarO = s1Var.o();
            s1 s1Var2 = (s1) r0VarO.e;
            r4 r4Var = s1Var2.F;
            x0 x0Var = s1Var2.C;
            s1.k(r4Var);
            byte[] bArrF0 = r4.f0(tVar);
            if (bArrF0 == null) {
                s1.m(x0Var);
                x0Var.D.a("Null default event parameters; not writing to database");
            } else {
                if (bArrF0.length > 131072) {
                    s1.m(x0Var);
                    x0Var.D.a("Default event parameters too long for local database. Sending directly to service");
                } else {
                    zC = r0VarO.C(bArrF0, 4);
                }
                if (zC) {
                    z = true;
                } else {
                    z = false;
                }
            }
            zC = false;
            if (zC) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        J(new l2(this, L(false), z, tVar, bundle));
    }

    public final void B() {
        v();
        w();
        if (M()) {
            return;
        }
        if (C()) {
            n3 n3Var = this.z;
            o3 o3Var = n3Var.z;
            o3Var.v();
            Context context = ((s1) o3Var.e).e;
            synchronized (n3Var) {
                try {
                    if (n3Var.e) {
                        x0 x0Var = ((s1) n3Var.z.e).C;
                        s1.m(x0Var);
                        x0Var.K.a("Connection attempt already in progress");
                        return;
                    } else {
                        if (n3Var.y != null && (n3Var.y.d() || n3Var.y.h())) {
                            x0 x0Var2 = ((s1) n3Var.z.e).C;
                            s1.m(x0Var2);
                            x0Var2.K.a("Already awaiting connection attempt");
                            return;
                        }
                        n3Var.y = new t0(context, Looper.getMainLooper(), com.google.android.gms.common.internal.i0.a(context), com.google.android.gms.common.f.b, 93, n3Var, n3Var, null);
                        x0 x0Var3 = ((s1) n3Var.z.e).C;
                        s1.m(x0Var3);
                        x0Var3.K.a("Connecting to remote service");
                        n3Var.e = true;
                        com.google.android.gms.common.internal.x.g(n3Var.y);
                        n3Var.y.m();
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        s1 s1Var = (s1) this.e;
        if (s1Var.A.y()) {
            return;
        }
        List<ResolveInfo> listQueryIntentServices = s1Var.e.getPackageManager().queryIntentServices(new Intent().setClassName(s1Var.e, "com.google.android.gms.measurement.AppMeasurementService"), Parser.ARGC_LIMIT);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            x0 x0Var4 = s1Var.C;
            s1.m(x0Var4);
            x0Var4.C.a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(s1Var.e, "com.google.android.gms.measurement.AppMeasurementService"));
        n3 n3Var2 = this.z;
        o3 o3Var2 = n3Var2.z;
        o3Var2.v();
        Context context2 = ((s1) o3Var2.e).e;
        com.google.android.gms.common.stats.a aVarB = com.google.android.gms.common.stats.a.b();
        synchronized (n3Var2) {
            try {
                boolean z = n3Var2.e;
                o3 o3Var3 = n3Var2.z;
                if (z) {
                    x0 x0Var5 = ((s1) o3Var3.e).C;
                    s1.m(x0Var5);
                    x0Var5.K.a("Connection attempt already in progress");
                } else {
                    x0 x0Var6 = ((s1) o3Var3.e).C;
                    s1.m(x0Var6);
                    x0Var6.K.a("Using local app measurement service");
                    n3Var2.e = true;
                    aVarB.a(context2, intent, o3Var3.z, Token.DEFAULT);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean C() {
        v();
        w();
        if (this.B == null) {
            v();
            w();
            s1 s1Var = (s1) this.e;
            g1 g1Var = s1Var.B;
            s1.k(g1Var);
            g1Var.v();
            boolean z = false;
            Boolean boolValueOf = !g1Var.z().contains("use_service") ? null : Boolean.valueOf(g1Var.z().getBoolean("use_service", false));
            boolean z2 = true;
            if (boolValueOf == null || !boolValueOf.booleanValue()) {
                p0 p0VarR = ((s1) this.e).r();
                p0VarR.w();
                if (p0VarR.K == 1) {
                    z = true;
                } else {
                    x0 x0Var = s1Var.C;
                    s1.m(x0Var);
                    x0Var.K.a("Checking service availability");
                    r4 r4Var = s1Var.F;
                    s1.k(r4Var);
                    int iB = com.google.android.gms.common.f.b.b(((s1) r4Var.e).e, 12451000);
                    if (iB == 0) {
                        x0 x0Var2 = s1Var.C;
                        s1.m(x0Var2);
                        x0Var2.K.a("Service available");
                    } else if (iB == 1) {
                        x0 x0Var3 = s1Var.C;
                        s1.m(x0Var3);
                        x0Var3.K.a("Service missing");
                    } else if (iB != 2) {
                        if (iB != 3) {
                            x0 x0Var4 = s1Var.C;
                            if (iB == 9) {
                                s1.m(x0Var4);
                                x0Var4.F.a("Service invalid");
                            } else if (iB != 18) {
                                s1.m(x0Var4);
                                x0Var4.F.b(Integer.valueOf(iB), "Unexpected service status");
                            } else {
                                s1.m(x0Var4);
                                x0Var4.F.a("Service updating");
                            }
                        } else {
                            x0 x0Var5 = s1Var.C;
                            s1.m(x0Var5);
                            x0Var5.F.a("Service disabled");
                        }
                        z2 = false;
                    } else {
                        x0 x0Var6 = s1Var.C;
                        s1.m(x0Var6);
                        x0Var6.J.a("Service container out of date");
                        r4 r4Var2 = s1Var.F;
                        s1.k(r4Var2);
                        if (r4Var2.h0() >= 17443) {
                            z = boolValueOf == null;
                            z2 = false;
                        }
                    }
                    z = true;
                }
                if (!z && s1Var.A.y()) {
                    x0 x0Var7 = s1Var.C;
                    s1.m(x0Var7);
                    x0Var7.C.a("No way to upload. Consider using the full version of Analytics");
                } else if (z2) {
                    g1 g1Var2 = s1Var.B;
                    s1.k(g1Var2);
                    g1Var2.v();
                    SharedPreferences.Editor editorEdit = g1Var2.z().edit();
                    editorEdit.putBoolean("use_service", z);
                    editorEdit.apply();
                }
                z2 = z;
            }
            this.B = Boolean.valueOf(z2);
        }
        return this.B.booleanValue();
    }

    public final void D() {
        v();
        w();
        n3 n3Var = this.z;
        if (n3Var.y != null && (n3Var.y.h() || n3Var.y.d())) {
            n3Var.y.o();
        }
        n3Var.y = null;
        try {
            com.google.android.gms.common.stats.a.b().c(((s1) this.e).e, n3Var);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.A = null;
    }

    public final boolean E() {
        v();
        w();
        if (!C()) {
            return true;
        }
        r4 r4Var = ((s1) this.e).F;
        s1.k(r4Var);
        return r4Var.h0() >= ((Integer) h0.J0.a(null)).intValue();
    }

    public final boolean F() {
        v();
        w();
        if (!C()) {
            return true;
        }
        r4 r4Var = ((s1) this.e).F;
        s1.k(r4Var);
        return r4Var.h0() >= 241200;
    }

    public final void G(ComponentName componentName) {
        v();
        if (this.A != null) {
            this.A = null;
            x0 x0Var = ((s1) this.e).C;
            s1.m(x0Var);
            x0Var.K.b(componentName, "Disconnected from device MeasurementService");
            v();
            B();
        }
    }

    public final void H() {
        ((s1) this.e).getClass();
    }

    public final void I() {
        v();
        androidx.compose.foundation.gestures.y2 y2Var = this.E;
        ((com.google.android.gms.common.util.a) y2Var.z).getClass();
        y2Var.y = SystemClock.elapsedRealtime();
        ((s1) this.e).getClass();
        this.C.b(((Long) h0.Y.a(null)).longValue());
    }

    public final void J(Runnable runnable) {
        v();
        if (M()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.F;
        long size = arrayList.size();
        s1 s1Var = (s1) this.e;
        s1Var.getClass();
        if (size >= 1000) {
            x0 x0Var = s1Var.C;
            s1.m(x0Var);
            x0Var.C.a("Discarding data. Max runnable queue size reached");
        } else {
            arrayList.add(runnable);
            this.G.b(60000L);
            B();
        }
    }

    public final void K() {
        v();
        s1 s1Var = (s1) this.e;
        x0 x0Var = s1Var.C;
        s1.m(x0Var);
        v0 v0Var = x0Var.K;
        ArrayList arrayList = this.F;
        v0Var.b(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e) {
                x0 x0Var2 = s1Var.C;
                s1.m(x0Var2);
                x0Var2.C.b(e, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.G.c();
    }

    public final t4 L(boolean z) {
        long jAbs;
        Pair pair;
        s1 s1Var = (s1) this.e;
        s1Var.getClass();
        p0 p0VarR = s1Var.r();
        String strK = null;
        if (z) {
            x0 x0Var = s1Var.C;
            s1.m(x0Var);
            s1 s1Var2 = (s1) x0Var.e;
            g1 g1Var = s1Var2.B;
            s1.k(g1Var);
            if (g1Var.B != null) {
                g1 g1Var2 = s1Var2.B;
                s1.k(g1Var2);
                f1 f1Var = g1Var2.B;
                g1 g1Var3 = (g1) f1Var.B;
                g1Var3.v();
                g1Var3.v();
                long j = ((g1) f1Var.B).z().getLong((String) f1Var.y, 0L);
                if (j == 0) {
                    f1Var.f();
                    jAbs = 0;
                } else {
                    ((s1) g1Var3.e).H.getClass();
                    jAbs = Math.abs(j - System.currentTimeMillis());
                }
                long j2 = f1Var.e;
                if (jAbs < j2) {
                    pair = null;
                } else if (jAbs > j2 + j2) {
                    f1Var.f();
                    pair = null;
                } else {
                    String string = g1Var3.z().getString((String) f1Var.A, null);
                    long j3 = g1Var3.z().getLong((String) f1Var.z, 0L);
                    f1Var.f();
                    pair = (string == null || j3 <= 0) ? g1.W : new Pair(string, Long.valueOf(j3));
                }
                if (pair != null && pair != g1.W) {
                    String strValueOf = String.valueOf(pair.second);
                    String str = (String) pair.first;
                    strK = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.k(new StringBuilder(strValueOf.length() + 1 + String.valueOf(str).length()), strValueOf, ":", str);
                }
            }
        }
        return p0VarR.z(strK);
    }

    public final boolean M() {
        v();
        w();
        return this.A != null;
    }

    /* JADX WARN: Code duplicated, block: B:259:0x0442 A[Catch: all -> 0x047e, TRY_ENTER, TryCatch #56 {all -> 0x047e, blocks: (B:269:0x046e, B:259:0x0442, B:261:0x0448, B:262:0x044b, B:279:0x048f, B:208:0x0379, B:210:0x0383, B:215:0x0394), top: B:399:0x046e }] */
    /* JADX WARN: Code duplicated, block: B:264:0x045a  */
    /* JADX WARN: Code duplicated, block: B:272:0x0475  */
    /* JADX WARN: Code duplicated, block: B:274:0x047a A[PHI: r5 r7 r24 r25 r27 r37 r38
  0x047a: PHI (r5v15 android.database.sqlite.SQLiteDatabase) = 
  (r5v12 android.database.sqlite.SQLiteDatabase)
  (r5v13 android.database.sqlite.SQLiteDatabase)
  (r5v16 android.database.sqlite.SQLiteDatabase)
 binds: [B:265:0x045d, B:282:0x04a1, B:273:0x0478] A[DONT_GENERATE, DONT_INLINE]
  0x047a: PHI (r7v5 int) = (r7v3 int), (r7v3 int), (r7v6 int) binds: [B:265:0x045d, B:282:0x04a1, B:273:0x0478] A[DONT_GENERATE, DONT_INLINE]
  0x047a: PHI (r24v9 int) = (r24v6 int), (r24v7 int), (r24v10 int) binds: [B:265:0x045d, B:282:0x04a1, B:273:0x0478] A[DONT_GENERATE, DONT_INLINE]
  0x047a: PHI (r25v9 java.lang.String) = (r25v6 java.lang.String), (r25v7 java.lang.String), (r25v10 java.lang.String) binds: [B:265:0x045d, B:282:0x04a1, B:273:0x0478] A[DONT_GENERATE, DONT_INLINE]
  0x047a: PHI (r27v9 java.lang.String) = (r27v6 java.lang.String), (r27v7 java.lang.String), (r27v10 java.lang.String) binds: [B:265:0x045d, B:282:0x04a1, B:273:0x0478] A[DONT_GENERATE, DONT_INLINE]
  0x047a: PHI (r37v9 int) = (r37v6 int), (r37v7 int), (r37v10 int) binds: [B:265:0x045d, B:282:0x04a1, B:273:0x0478] A[DONT_GENERATE, DONT_INLINE]
  0x047a: PHI (r38v9 java.lang.String) = (r38v6 java.lang.String), (r38v7 java.lang.String), (r38v10 java.lang.String) binds: [B:265:0x045d, B:282:0x04a1, B:273:0x0478] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:281:0x049e  */
    /* JADX WARN: Code duplicated, block: B:286:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:288:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:293:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:294:0x04da  */
    /* JADX WARN: Code duplicated, block: B:301:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:303:0x0505  */
    /* JADX WARN: Code duplicated, block: B:305:0x050d  */
    /* JADX WARN: Code duplicated, block: B:306:0x0595  */
    /* JADX WARN: Code duplicated, block: B:317:0x05c0 A[Catch: RemoteException -> 0x05ee, TRY_LEAVE, TryCatch #50 {RemoteException -> 0x05ee, blocks: (B:315:0x05b5, B:317:0x05c0), top: B:393:0x05b5 }] */
    /* JADX WARN: Code duplicated, block: B:320:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:338:0x062a  */
    /* JADX WARN: Code duplicated, block: B:340:0x062e  */
    /* JADX WARN: Code duplicated, block: B:342:0x064f  */
    /* JADX WARN: Code duplicated, block: B:348:0x066e  */
    /* JADX WARN: Code duplicated, block: B:354:0x0686  */
    /* JADX WARN: Code duplicated, block: B:362:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:383:0x065b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:395:0x0672 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:412:0x059b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:456:0x04a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:457:0x04a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:459:0x04a4 A[SYNTHETIC] */
    public final void N(k0 k0Var, com.google.android.gms.common.internal.safeparcel.a aVar, t4 t4Var) throws Throwable {
        ArrayList arrayList;
        s1 s1Var;
        Context context;
        x0 x0Var;
        int i;
        SQLiteDatabase sQLiteDatabaseB;
        int i2;
        int i3;
        Cursor cursor;
        Cursor cursorQuery;
        Cursor cursorQuery2;
        long j;
        String str;
        String[] strArr;
        int i4;
        long j2;
        String string;
        g0 g0Var;
        t tVarCreateFromParcel;
        int i5;
        e eVarCreateFromParcel;
        o4 o4VarCreateFromParcel;
        int size;
        int size2;
        int i6;
        q0 q0Var;
        com.google.android.gms.common.internal.safeparcel.a aVar2;
        g0 g0Var2;
        s1 s1Var2;
        Context context2;
        x0 x0Var2;
        long jElapsedRealtime;
        long j3;
        long jCurrentTimeMillis;
        String str2;
        v();
        w();
        H();
        s1 s1Var3 = (s1) this.e;
        s1Var3.getClass();
        Context context3 = s1Var3.e;
        g gVar = s1Var3.A;
        x0 x0Var3 = s1Var3.C;
        com.google.android.gms.common.util.a aVar3 = s1Var3.H;
        int i7 = 100;
        t4 t4Var2 = t4Var;
        int i8 = 0;
        for (int i9 = 100; i8 < 1001 && i9 == i7; i9 = size) {
            ArrayList arrayList2 = new ArrayList();
            r0 r0VarO = s1Var3.o();
            int i10 = i7;
            String str3 = "entry";
            String str4 = "type";
            String str5 = "rowid";
            com.google.android.gms.common.util.a aVar4 = aVar3;
            s1 s1Var4 = (s1) r0VarO.e;
            r0VarO.v();
            int i11 = i8;
            if (r0VarO.A) {
                s1Var = s1Var3;
                context = context3;
                x0Var = x0Var3;
            } else {
                arrayList = new ArrayList();
                s1Var = s1Var3;
                if (((s1) r0VarO.e).e.getDatabasePath("google_app_measurement_local.db").exists()) {
                    int i12 = 5;
                    context = context3;
                    x0Var = x0Var3;
                    int i13 = 0;
                    int i14 = 5;
                    while (true) {
                        if (i13 < i12) {
                            try {
                                sQLiteDatabaseB = r0VarO.B();
                                if (sQLiteDatabaseB == null) {
                                    try {
                                        try {
                                            r0VarO.A = true;
                                        } catch (SQLiteDatabaseLockedException unused) {
                                            i2 = i13;
                                            i3 = 5;
                                            str4 = str4;
                                            cursorQuery = null;
                                            try {
                                                SystemClock.sleep(i14);
                                                i14 += 20;
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                                if (sQLiteDatabaseB != null) {
                                                    sQLiteDatabaseB.close();
                                                }
                                                i13 = i2 + 1;
                                                i12 = i3;
                                                str4 = str4;
                                                str3 = str3;
                                                str5 = str5;
                                            } catch (Throwable th) {
                                                th = th;
                                                cursor = cursorQuery;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                if (sQLiteDatabaseB != null) {
                                                    sQLiteDatabaseB.close();
                                                }
                                                throw th;
                                            }
                                        } catch (SQLiteFullException e) {
                                            e = e;
                                            i2 = i13;
                                            i3 = 5;
                                            str4 = str4;
                                            cursorQuery = null;
                                            x0 x0Var4 = s1Var4.C;
                                            s1.m(x0Var4);
                                            x0Var4.C.b(e, "Error reading entries from local database");
                                            r0VarO.A = true;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            if (sQLiteDatabaseB != null) {
                                                sQLiteDatabaseB.close();
                                            }
                                            i13 = i2 + 1;
                                            i12 = i3;
                                            str4 = str4;
                                            str3 = str3;
                                            str5 = str5;
                                        } catch (SQLiteException e2) {
                                            e = e2;
                                            i2 = i13;
                                            i3 = 5;
                                            str4 = str4;
                                            cursorQuery = null;
                                            if (sQLiteDatabaseB != null) {
                                                sQLiteDatabaseB.endTransaction();
                                            }
                                            x0 x0Var5 = s1Var4.C;
                                            s1.m(x0Var5);
                                            x0Var5.C.b(e, "Error reading entries from local database");
                                            r0VarO.A = true;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            if (sQLiteDatabaseB != null) {
                                                sQLiteDatabaseB.close();
                                            }
                                            i13 = i2 + 1;
                                            i12 = i3;
                                            str4 = str4;
                                            str3 = str3;
                                            str5 = str5;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        sQLiteDatabaseB = sQLiteDatabaseB;
                                        cursor = null;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabaseB != null) {
                                            sQLiteDatabaseB.close();
                                        }
                                        throw th;
                                    }
                                } else {
                                    sQLiteDatabaseB.beginTransaction();
                                    try {
                                        cursorQuery2 = sQLiteDatabaseB.query("messages", new String[]{str5}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                                        try {
                                            long j4 = -1;
                                            if (cursorQuery2.moveToFirst()) {
                                                i2 = i13;
                                                try {
                                                    j = cursorQuery2.getLong(0);
                                                    try {
                                                        cursorQuery2.close();
                                                    } catch (SQLiteDatabaseLockedException unused2) {
                                                        i3 = 5;
                                                        str4 = str4;
                                                        cursorQuery = null;
                                                        SystemClock.sleep(i14);
                                                        i14 += 20;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseB != null) {
                                                            sQLiteDatabaseB.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    } catch (SQLiteFullException e3) {
                                                        e = e3;
                                                        i3 = 5;
                                                        str4 = str4;
                                                        cursorQuery = null;
                                                        x0 x0Var6 = s1Var4.C;
                                                        s1.m(x0Var6);
                                                        x0Var6.C.b(e, "Error reading entries from local database");
                                                        r0VarO.A = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseB != null) {
                                                            sQLiteDatabaseB.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    } catch (SQLiteException e4) {
                                                        e = e4;
                                                        i3 = 5;
                                                        str4 = str4;
                                                        cursorQuery = null;
                                                        if (sQLiteDatabaseB != null) {
                                                            sQLiteDatabaseB.endTransaction();
                                                        }
                                                        x0 x0Var7 = s1Var4.C;
                                                        s1.m(x0Var7);
                                                        x0Var7.C.b(e, "Error reading entries from local database");
                                                        r0VarO.A = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseB != null) {
                                                            sQLiteDatabaseB.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    i3 = 5;
                                                    if (cursorQuery2 != null) {
                                                        try {
                                                            cursorQuery2.close();
                                                        } catch (SQLiteDatabaseLockedException unused3) {
                                                            cursorQuery = null;
                                                            SystemClock.sleep(i14);
                                                            i14 += 20;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseB != null) {
                                                                sQLiteDatabaseB.close();
                                                            }
                                                            i13 = i2 + 1;
                                                            i12 = i3;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            str5 = str5;
                                                        } catch (SQLiteFullException e5) {
                                                            e = e5;
                                                            cursorQuery = null;
                                                            x0 x0Var8 = s1Var4.C;
                                                            s1.m(x0Var8);
                                                            x0Var8.C.b(e, "Error reading entries from local database");
                                                            r0VarO.A = true;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseB != null) {
                                                                sQLiteDatabaseB.close();
                                                            }
                                                            i13 = i2 + 1;
                                                            i12 = i3;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            str5 = str5;
                                                        } catch (SQLiteException e6) {
                                                            e = e6;
                                                            cursorQuery = null;
                                                            if (sQLiteDatabaseB != null) {
                                                                sQLiteDatabaseB.endTransaction();
                                                            }
                                                            x0 x0Var9 = s1Var4.C;
                                                            s1.m(x0Var9);
                                                            x0Var9.C.b(e, "Error reading entries from local database");
                                                            r0VarO.A = true;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseB != null) {
                                                                sQLiteDatabaseB.close();
                                                            }
                                                            i13 = i2 + 1;
                                                            i12 = i3;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            str5 = str5;
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            cursor = null;
                                                            if (cursor != null) {
                                                                cursor.close();
                                                            }
                                                            if (sQLiteDatabaseB != null) {
                                                                sQLiteDatabaseB.close();
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                    throw th;
                                                }
                                            } else {
                                                i2 = i13;
                                                cursorQuery2.close();
                                                j = -1;
                                            }
                                            if (j != -1) {
                                                str = "rowid<?";
                                                strArr = new String[]{String.valueOf(j)};
                                            } else {
                                                str = null;
                                                strArr = null;
                                            }
                                            try {
                                                String[] strArr2 = {str5, str4, str3};
                                                g gVar2 = s1Var4.A;
                                                g0 g0Var3 = h0.W0;
                                                str5 = str5;
                                                try {
                                                    try {
                                                        int i15 = 4;
                                                        int i16 = 3;
                                                        if (gVar2.G(null, g0Var3)) {
                                                            i4 = 5;
                                                            try {
                                                                strArr2 = new String[]{str5, str4, str3, "app_version", "app_version_int"};
                                                            } catch (SQLiteDatabaseLockedException unused4) {
                                                                i3 = 5;
                                                                str4 = str4;
                                                                cursorQuery = null;
                                                                SystemClock.sleep(i14);
                                                                i14 += 20;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseB != null) {
                                                                    sQLiteDatabaseB.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            } catch (SQLiteFullException e7) {
                                                                e = e7;
                                                                i3 = 5;
                                                                str4 = str4;
                                                                cursorQuery = null;
                                                                x0 x0Var10 = s1Var4.C;
                                                                s1.m(x0Var10);
                                                                x0Var10.C.b(e, "Error reading entries from local database");
                                                                r0VarO.A = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseB != null) {
                                                                    sQLiteDatabaseB.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            } catch (SQLiteException e8) {
                                                                e = e8;
                                                                i3 = 5;
                                                                str4 = str4;
                                                                cursorQuery = null;
                                                                if (sQLiteDatabaseB != null) {
                                                                    sQLiteDatabaseB.endTransaction();
                                                                }
                                                                x0 x0Var11 = s1Var4.C;
                                                                s1.m(x0Var11);
                                                                x0Var11.C.b(e, "Error reading entries from local database");
                                                                r0VarO.A = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseB != null) {
                                                                    sQLiteDatabaseB.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            }
                                                        } else {
                                                            i4 = 5;
                                                        }
                                                        try {
                                                            cursorQuery = sQLiteDatabaseB.query("messages", strArr2, str, strArr, null, null, "rowid asc", Integer.toString(i10));
                                                            while (cursorQuery.moveToNext()) {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            j4 = cursorQuery.getLong(0);
                                                                            try {
                                                                                int i17 = cursorQuery.getInt(1);
                                                                                str4 = str4;
                                                                                try {
                                                                                    byte[] blob = cursorQuery.getBlob(2);
                                                                                    str3 = str3;
                                                                                    try {
                                                                                        if (s1Var4.A.G(null, g0Var3)) {
                                                                                            try {
                                                                                                string = cursorQuery.getString(i16);
                                                                                                j2 = cursorQuery.getLong(i15);
                                                                                            } catch (SQLiteDatabaseLockedException unused5) {
                                                                                                cursorQuery = cursorQuery;
                                                                                                sQLiteDatabaseB = sQLiteDatabaseB;
                                                                                                i3 = 5;
                                                                                                SystemClock.sleep(i14);
                                                                                                i14 += 20;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseB != null) {
                                                                                                    sQLiteDatabaseB.close();
                                                                                                }
                                                                                                i13 = i2 + 1;
                                                                                                i12 = i3;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            } catch (SQLiteFullException e9) {
                                                                                                e = e9;
                                                                                                cursorQuery = cursorQuery;
                                                                                                sQLiteDatabaseB = sQLiteDatabaseB;
                                                                                                i3 = 5;
                                                                                                x0 x0Var12 = s1Var4.C;
                                                                                                s1.m(x0Var12);
                                                                                                x0Var12.C.b(e, "Error reading entries from local database");
                                                                                                r0VarO.A = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseB != null) {
                                                                                                    sQLiteDatabaseB.close();
                                                                                                }
                                                                                                i13 = i2 + 1;
                                                                                                i12 = i3;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            } catch (SQLiteException e10) {
                                                                                                e = e10;
                                                                                                cursorQuery = cursorQuery;
                                                                                                sQLiteDatabaseB = sQLiteDatabaseB;
                                                                                                i3 = 5;
                                                                                                if (sQLiteDatabaseB != null) {
                                                                                                    sQLiteDatabaseB.endTransaction();
                                                                                                }
                                                                                                x0 x0Var13 = s1Var4.C;
                                                                                                s1.m(x0Var13);
                                                                                                x0Var13.C.b(e, "Error reading entries from local database");
                                                                                                r0VarO.A = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseB != null) {
                                                                                                    sQLiteDatabaseB.close();
                                                                                                }
                                                                                                i13 = i2 + 1;
                                                                                                i12 = i3;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            }
                                                                                        } else {
                                                                                            j2 = 0;
                                                                                            string = null;
                                                                                        }
                                                                                        if (i17 == 0) {
                                                                                            g0Var = g0Var3;
                                                                                            try {
                                                                                                try {
                                                                                                    Parcel parcelObtain = Parcel.obtain();
                                                                                                    try {
                                                                                                        try {
                                                                                                            parcelObtain.unmarshall(blob, 0, blob.length);
                                                                                                            parcelObtain.setDataPosition(0);
                                                                                                            u uVarCreateFromParcel = u.CREATOR.createFromParcel(parcelObtain);
                                                                                                            parcelObtain.recycle();
                                                                                                            if (uVarCreateFromParcel != null) {
                                                                                                                arrayList.add(new q0(uVarCreateFromParcel, string, j2));
                                                                                                            }
                                                                                                        } catch (Throwable th5) {
                                                                                                            parcelObtain.recycle();
                                                                                                            throw th5;
                                                                                                        }
                                                                                                    } catch (com.google.android.gms.common.internal.safeparcel.b unused6) {
                                                                                                        x0 x0Var14 = s1Var4.C;
                                                                                                        s1.m(x0Var14);
                                                                                                        x0Var14.C.a("Failed to load event from local database");
                                                                                                        parcelObtain.recycle();
                                                                                                    }
                                                                                                } catch (SQLiteDatabaseLockedException unused7) {
                                                                                                    sQLiteDatabaseB = sQLiteDatabaseB;
                                                                                                    i3 = 5;
                                                                                                    SystemClock.sleep(i14);
                                                                                                    i14 += 20;
                                                                                                    if (cursorQuery != null) {
                                                                                                        cursorQuery.close();
                                                                                                    }
                                                                                                    if (sQLiteDatabaseB != null) {
                                                                                                        sQLiteDatabaseB.close();
                                                                                                    }
                                                                                                    i13 = i2 + 1;
                                                                                                    i12 = i3;
                                                                                                    str4 = str4;
                                                                                                    str3 = str3;
                                                                                                    str5 = str5;
                                                                                                } catch (SQLiteFullException e11) {
                                                                                                    e = e11;
                                                                                                    sQLiteDatabaseB = sQLiteDatabaseB;
                                                                                                    i3 = 5;
                                                                                                    x0 x0Var15 = s1Var4.C;
                                                                                                    s1.m(x0Var15);
                                                                                                    x0Var15.C.b(e, "Error reading entries from local database");
                                                                                                    r0VarO.A = true;
                                                                                                    if (cursorQuery != null) {
                                                                                                        cursorQuery.close();
                                                                                                    }
                                                                                                    if (sQLiteDatabaseB != null) {
                                                                                                        sQLiteDatabaseB.close();
                                                                                                    }
                                                                                                    i13 = i2 + 1;
                                                                                                    i12 = i3;
                                                                                                    str4 = str4;
                                                                                                    str3 = str3;
                                                                                                    str5 = str5;
                                                                                                } catch (SQLiteException e12) {
                                                                                                    e = e12;
                                                                                                    sQLiteDatabaseB = sQLiteDatabaseB;
                                                                                                    i3 = 5;
                                                                                                    if (sQLiteDatabaseB != null && sQLiteDatabaseB.inTransaction()) {
                                                                                                        sQLiteDatabaseB.endTransaction();
                                                                                                    }
                                                                                                    x0 x0Var16 = s1Var4.C;
                                                                                                    s1.m(x0Var16);
                                                                                                    x0Var16.C.b(e, "Error reading entries from local database");
                                                                                                    r0VarO.A = true;
                                                                                                    if (cursorQuery != null) {
                                                                                                        cursorQuery.close();
                                                                                                    }
                                                                                                    if (sQLiteDatabaseB != null) {
                                                                                                        sQLiteDatabaseB.close();
                                                                                                    }
                                                                                                    i13 = i2 + 1;
                                                                                                    i12 = i3;
                                                                                                    str4 = str4;
                                                                                                    str3 = str3;
                                                                                                    str5 = str5;
                                                                                                }
                                                                                            } catch (Throwable th6) {
                                                                                                th = th6;
                                                                                                sQLiteDatabaseB = sQLiteDatabaseB;
                                                                                                cursor = cursorQuery;
                                                                                                if (cursor != null) {
                                                                                                    cursor.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseB != null) {
                                                                                                    sQLiteDatabaseB.close();
                                                                                                }
                                                                                                throw th;
                                                                                            }
                                                                                        } else {
                                                                                            g0Var = g0Var3;
                                                                                            if (i17 == 1) {
                                                                                                Parcel parcelObtain2 = Parcel.obtain();
                                                                                                try {
                                                                                                    try {
                                                                                                        parcelObtain2.unmarshall(blob, 0, blob.length);
                                                                                                        parcelObtain2.setDataPosition(0);
                                                                                                        o4VarCreateFromParcel = o4.CREATOR.createFromParcel(parcelObtain2);
                                                                                                        parcelObtain2.recycle();
                                                                                                    } catch (com.google.android.gms.common.internal.safeparcel.b unused8) {
                                                                                                        x0 x0Var17 = s1Var4.C;
                                                                                                        s1.m(x0Var17);
                                                                                                        x0Var17.C.a("Failed to load user property from local database");
                                                                                                        parcelObtain2.recycle();
                                                                                                        o4VarCreateFromParcel = null;
                                                                                                    }
                                                                                                    if (o4VarCreateFromParcel != null) {
                                                                                                        arrayList.add(new q0(o4VarCreateFromParcel, string, j2));
                                                                                                    }
                                                                                                } catch (Throwable th7) {
                                                                                                    parcelObtain2.recycle();
                                                                                                    throw th7;
                                                                                                }
                                                                                            } else {
                                                                                                if (i17 == 2) {
                                                                                                    Parcel parcelObtain3 = Parcel.obtain();
                                                                                                    try {
                                                                                                        try {
                                                                                                            parcelObtain3.unmarshall(blob, 0, blob.length);
                                                                                                            parcelObtain3.setDataPosition(0);
                                                                                                            eVarCreateFromParcel = e.CREATOR.createFromParcel(parcelObtain3);
                                                                                                            parcelObtain3.recycle();
                                                                                                        } catch (Throwable th8) {
                                                                                                            parcelObtain3.recycle();
                                                                                                            throw th8;
                                                                                                        }
                                                                                                    } catch (com.google.android.gms.common.internal.safeparcel.b unused9) {
                                                                                                        x0 x0Var18 = s1Var4.C;
                                                                                                        s1.m(x0Var18);
                                                                                                        x0Var18.C.a("Failed to load conditional user property from local database");
                                                                                                        parcelObtain3.recycle();
                                                                                                        eVarCreateFromParcel = null;
                                                                                                    }
                                                                                                    if (eVarCreateFromParcel != null) {
                                                                                                        arrayList.add(new q0(eVarCreateFromParcel, string, j2));
                                                                                                    }
                                                                                                } else if (i17 == 4) {
                                                                                                    try {
                                                                                                        Parcel parcelObtain4 = Parcel.obtain();
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    parcelObtain4.unmarshall(blob, 0, blob.length);
                                                                                                                    parcelObtain4.setDataPosition(0);
                                                                                                                    tVarCreateFromParcel = t.CREATOR.createFromParcel(parcelObtain4);
                                                                                                                    try {
                                                                                                                        parcelObtain4.recycle();
                                                                                                                    } catch (SQLiteDatabaseLockedException unused10) {
                                                                                                                        sQLiteDatabaseB = sQLiteDatabaseB;
                                                                                                                        i3 = 5;
                                                                                                                        SystemClock.sleep(i14);
                                                                                                                        i14 += 20;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseB != null) {
                                                                                                                            sQLiteDatabaseB.close();
                                                                                                                        }
                                                                                                                        i13 = i2 + 1;
                                                                                                                        i12 = i3;
                                                                                                                        str4 = str4;
                                                                                                                        str3 = str3;
                                                                                                                        str5 = str5;
                                                                                                                    } catch (SQLiteFullException e13) {
                                                                                                                        e = e13;
                                                                                                                        sQLiteDatabaseB = sQLiteDatabaseB;
                                                                                                                        i3 = 5;
                                                                                                                        x0 x0Var19 = s1Var4.C;
                                                                                                                        s1.m(x0Var19);
                                                                                                                        x0Var19.C.b(e, "Error reading entries from local database");
                                                                                                                        r0VarO.A = true;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseB != null) {
                                                                                                                            sQLiteDatabaseB.close();
                                                                                                                        }
                                                                                                                        i13 = i2 + 1;
                                                                                                                        i12 = i3;
                                                                                                                        str4 = str4;
                                                                                                                        str3 = str3;
                                                                                                                        str5 = str5;
                                                                                                                    } catch (SQLiteException e14) {
                                                                                                                        e = e14;
                                                                                                                        sQLiteDatabaseB = sQLiteDatabaseB;
                                                                                                                        i3 = 5;
                                                                                                                        if (sQLiteDatabaseB != null) {
                                                                                                                            sQLiteDatabaseB.endTransaction();
                                                                                                                        }
                                                                                                                        x0 x0Var110 = s1Var4.C;
                                                                                                                        s1.m(x0Var110);
                                                                                                                        x0Var110.C.b(e, "Error reading entries from local database");
                                                                                                                        r0VarO.A = true;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseB != null) {
                                                                                                                            sQLiteDatabaseB.close();
                                                                                                                        }
                                                                                                                        i13 = i2 + 1;
                                                                                                                        i12 = i3;
                                                                                                                        str4 = str4;
                                                                                                                        str3 = str3;
                                                                                                                        str5 = str5;
                                                                                                                    }
                                                                                                                } catch (com.google.android.gms.common.internal.safeparcel.b unused11) {
                                                                                                                    x0 x0Var20 = s1Var4.C;
                                                                                                                    s1.m(x0Var20);
                                                                                                                    x0Var20.C.a("Failed to load default event parameters from local database");
                                                                                                                    parcelObtain4.recycle();
                                                                                                                    tVarCreateFromParcel = null;
                                                                                                                }
                                                                                                                if (tVarCreateFromParcel != null) {
                                                                                                                    arrayList.add(new q0(tVarCreateFromParcel, string, j2));
                                                                                                                }
                                                                                                                i5 = 3;
                                                                                                            } catch (Throwable th9) {
                                                                                                                th = th9;
                                                                                                                parcelObtain4.recycle();
                                                                                                                throw th;
                                                                                                            }
                                                                                                        } catch (com.google.android.gms.common.internal.safeparcel.b unused12) {
                                                                                                        } catch (Throwable th10) {
                                                                                                            th = th10;
                                                                                                        }
                                                                                                    } catch (SQLiteDatabaseLockedException unused13) {
                                                                                                        sQLiteDatabaseB = sQLiteDatabaseB;
                                                                                                        i3 = 5;
                                                                                                        SystemClock.sleep(i14);
                                                                                                        i14 += 20;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseB != null) {
                                                                                                            sQLiteDatabaseB.close();
                                                                                                        }
                                                                                                        i13 = i2 + 1;
                                                                                                        i12 = i3;
                                                                                                        str4 = str4;
                                                                                                        str3 = str3;
                                                                                                        str5 = str5;
                                                                                                    } catch (SQLiteFullException e15) {
                                                                                                        e = e15;
                                                                                                        sQLiteDatabaseB = sQLiteDatabaseB;
                                                                                                        i3 = 5;
                                                                                                        x0 x0Var111 = s1Var4.C;
                                                                                                        s1.m(x0Var111);
                                                                                                        x0Var111.C.b(e, "Error reading entries from local database");
                                                                                                        r0VarO.A = true;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseB != null) {
                                                                                                            sQLiteDatabaseB.close();
                                                                                                        }
                                                                                                        i13 = i2 + 1;
                                                                                                        i12 = i3;
                                                                                                        str4 = str4;
                                                                                                        str3 = str3;
                                                                                                        str5 = str5;
                                                                                                    } catch (SQLiteException e16) {
                                                                                                        e = e16;
                                                                                                        sQLiteDatabaseB = sQLiteDatabaseB;
                                                                                                        i3 = 5;
                                                                                                        if (sQLiteDatabaseB != null) {
                                                                                                            sQLiteDatabaseB.endTransaction();
                                                                                                        }
                                                                                                        x0 x0Var112 = s1Var4.C;
                                                                                                        s1.m(x0Var112);
                                                                                                        x0Var112.C.b(e, "Error reading entries from local database");
                                                                                                        r0VarO.A = true;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseB != null) {
                                                                                                            sQLiteDatabaseB.close();
                                                                                                        }
                                                                                                        i13 = i2 + 1;
                                                                                                        i12 = i3;
                                                                                                        str4 = str4;
                                                                                                        str3 = str3;
                                                                                                        str5 = str5;
                                                                                                    }
                                                                                                } else {
                                                                                                    x0 x0Var21 = s1Var4.C;
                                                                                                    i5 = 3;
                                                                                                    if (i17 == 3) {
                                                                                                        s1.m(x0Var21);
                                                                                                        x0Var21.K.a("Skipping app launch break");
                                                                                                    } else {
                                                                                                        s1.m(x0Var21);
                                                                                                        x0Var21.C.a("Unknown record type in local database");
                                                                                                    }
                                                                                                }
                                                                                                i16 = i5;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                cursorQuery = cursorQuery;
                                                                                                g0Var3 = g0Var;
                                                                                                i15 = 4;
                                                                                            }
                                                                                        }
                                                                                        i5 = 3;
                                                                                        i16 = i5;
                                                                                        str4 = str4;
                                                                                        str3 = str3;
                                                                                        cursorQuery = cursorQuery;
                                                                                        g0Var3 = g0Var;
                                                                                        i15 = 4;
                                                                                    } catch (SQLiteDatabaseLockedException unused14) {
                                                                                        cursorQuery = cursorQuery;
                                                                                    } catch (SQLiteFullException e17) {
                                                                                        e = e17;
                                                                                        cursorQuery = cursorQuery;
                                                                                    } catch (SQLiteException e18) {
                                                                                        e = e18;
                                                                                        cursorQuery = cursorQuery;
                                                                                    }
                                                                                } catch (SQLiteDatabaseLockedException unused15) {
                                                                                    str3 = str3;
                                                                                    sQLiteDatabaseB = sQLiteDatabaseB;
                                                                                    i3 = 5;
                                                                                    SystemClock.sleep(i14);
                                                                                    i14 += 20;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseB != null) {
                                                                                        sQLiteDatabaseB.close();
                                                                                    }
                                                                                    i13 = i2 + 1;
                                                                                    i12 = i3;
                                                                                    str4 = str4;
                                                                                    str3 = str3;
                                                                                    str5 = str5;
                                                                                } catch (SQLiteFullException e19) {
                                                                                    e = e19;
                                                                                    str3 = str3;
                                                                                    sQLiteDatabaseB = sQLiteDatabaseB;
                                                                                    i3 = 5;
                                                                                    x0 x0Var113 = s1Var4.C;
                                                                                    s1.m(x0Var113);
                                                                                    x0Var113.C.b(e, "Error reading entries from local database");
                                                                                    r0VarO.A = true;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseB != null) {
                                                                                        sQLiteDatabaseB.close();
                                                                                    }
                                                                                    i13 = i2 + 1;
                                                                                    i12 = i3;
                                                                                    str4 = str4;
                                                                                    str3 = str3;
                                                                                    str5 = str5;
                                                                                } catch (SQLiteException e20) {
                                                                                    e = e20;
                                                                                    str3 = str3;
                                                                                    sQLiteDatabaseB = sQLiteDatabaseB;
                                                                                    i3 = 5;
                                                                                    if (sQLiteDatabaseB != null) {
                                                                                        sQLiteDatabaseB.endTransaction();
                                                                                    }
                                                                                    x0 x0Var114 = s1Var4.C;
                                                                                    s1.m(x0Var114);
                                                                                    x0Var114.C.b(e, "Error reading entries from local database");
                                                                                    r0VarO.A = true;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseB != null) {
                                                                                        sQLiteDatabaseB.close();
                                                                                    }
                                                                                    i13 = i2 + 1;
                                                                                    i12 = i3;
                                                                                    str4 = str4;
                                                                                    str3 = str3;
                                                                                    str5 = str5;
                                                                                }
                                                                            } catch (SQLiteDatabaseLockedException unused16) {
                                                                                str4 = str4;
                                                                            } catch (SQLiteFullException e21) {
                                                                                e = e21;
                                                                                str4 = str4;
                                                                            } catch (SQLiteException e22) {
                                                                                e = e22;
                                                                                str4 = str4;
                                                                            }
                                                                        } catch (SQLiteDatabaseLockedException unused17) {
                                                                            cursorQuery = cursorQuery;
                                                                            str4 = str4;
                                                                            str3 = str3;
                                                                        } catch (SQLiteFullException e23) {
                                                                            e = e23;
                                                                            cursorQuery = cursorQuery;
                                                                            str4 = str4;
                                                                            str3 = str3;
                                                                        } catch (SQLiteException e24) {
                                                                            e = e24;
                                                                            cursorQuery = cursorQuery;
                                                                            str4 = str4;
                                                                            str3 = str3;
                                                                        }
                                                                    } catch (SQLiteDatabaseLockedException unused18) {
                                                                        cursorQuery = cursorQuery;
                                                                        str4 = str4;
                                                                        str3 = str3;
                                                                    } catch (SQLiteFullException e25) {
                                                                        e = e25;
                                                                        cursorQuery = cursorQuery;
                                                                        str4 = str4;
                                                                        str3 = str3;
                                                                    } catch (SQLiteException e26) {
                                                                        e = e26;
                                                                        cursorQuery = cursorQuery;
                                                                        str4 = str4;
                                                                        str3 = str3;
                                                                    }
                                                                } catch (Throwable th11) {
                                                                    th = th11;
                                                                    cursorQuery = cursorQuery;
                                                                }
                                                            }
                                                            cursorQuery = cursorQuery;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            i = 0;
                                                            sQLiteDatabaseB = sQLiteDatabaseB;
                                                            try {
                                                                if (sQLiteDatabaseB.delete("messages", "rowid <= ?", new String[]{Long.toString(j4)}) < arrayList.size()) {
                                                                    x0 x0Var22 = s1Var4.C;
                                                                    s1.m(x0Var22);
                                                                    x0Var22.C.a("Fewer entries removed from local database than expected");
                                                                }
                                                                sQLiteDatabaseB.setTransactionSuccessful();
                                                                sQLiteDatabaseB.endTransaction();
                                                                cursorQuery.close();
                                                                sQLiteDatabaseB.close();
                                                            } catch (SQLiteDatabaseLockedException unused19) {
                                                                i3 = 5;
                                                                SystemClock.sleep(i14);
                                                                i14 += 20;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseB != null) {
                                                                    sQLiteDatabaseB.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            } catch (SQLiteFullException e27) {
                                                                e = e27;
                                                                i3 = 5;
                                                                x0 x0Var115 = s1Var4.C;
                                                                s1.m(x0Var115);
                                                                x0Var115.C.b(e, "Error reading entries from local database");
                                                                r0VarO.A = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseB != null) {
                                                                    sQLiteDatabaseB.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            } catch (SQLiteException e28) {
                                                                e = e28;
                                                                i3 = 5;
                                                                if (sQLiteDatabaseB != null) {
                                                                    sQLiteDatabaseB.endTransaction();
                                                                }
                                                                x0 x0Var116 = s1Var4.C;
                                                                s1.m(x0Var116);
                                                                x0Var116.C.b(e, "Error reading entries from local database");
                                                                r0VarO.A = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseB != null) {
                                                                    sQLiteDatabaseB.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            }
                                                        } catch (SQLiteDatabaseLockedException unused20) {
                                                            str3 = str3;
                                                            sQLiteDatabaseB = sQLiteDatabaseB;
                                                            str4 = str4;
                                                            i3 = i4;
                                                            cursorQuery = null;
                                                            SystemClock.sleep(i14);
                                                            i14 += 20;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseB != null) {
                                                                sQLiteDatabaseB.close();
                                                            }
                                                            i13 = i2 + 1;
                                                            i12 = i3;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            str5 = str5;
                                                        }
                                                    } catch (SQLiteFullException e29) {
                                                        e = e29;
                                                        str3 = str3;
                                                        sQLiteDatabaseB = sQLiteDatabaseB;
                                                        str4 = str4;
                                                        i3 = 5;
                                                        cursorQuery = null;
                                                        x0 x0Var117 = s1Var4.C;
                                                        s1.m(x0Var117);
                                                        x0Var117.C.b(e, "Error reading entries from local database");
                                                        r0VarO.A = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseB != null) {
                                                            sQLiteDatabaseB.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    } catch (SQLiteException e30) {
                                                        e = e30;
                                                        str3 = str3;
                                                        sQLiteDatabaseB = sQLiteDatabaseB;
                                                        str4 = str4;
                                                        i3 = 5;
                                                        cursorQuery = null;
                                                        if (sQLiteDatabaseB != null) {
                                                            sQLiteDatabaseB.endTransaction();
                                                        }
                                                        x0 x0Var118 = s1Var4.C;
                                                        s1.m(x0Var118);
                                                        x0Var118.C.b(e, "Error reading entries from local database");
                                                        r0VarO.A = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseB != null) {
                                                            sQLiteDatabaseB.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    }
                                                } catch (SQLiteDatabaseLockedException unused21) {
                                                    str3 = str3;
                                                    sQLiteDatabaseB = sQLiteDatabaseB;
                                                    str4 = str4;
                                                    i3 = 5;
                                                    cursorQuery = null;
                                                    SystemClock.sleep(i14);
                                                    i14 += 20;
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    if (sQLiteDatabaseB != null) {
                                                        sQLiteDatabaseB.close();
                                                    }
                                                    i13 = i2 + 1;
                                                    i12 = i3;
                                                    str4 = str4;
                                                    str3 = str3;
                                                    str5 = str5;
                                                }
                                            } catch (SQLiteDatabaseLockedException unused22) {
                                                str5 = str5;
                                            } catch (SQLiteFullException e31) {
                                                e = e31;
                                                str5 = str5;
                                            } catch (SQLiteException e32) {
                                                e = e32;
                                                str5 = str5;
                                            }
                                        } catch (Throwable th12) {
                                            th = th12;
                                            i2 = i13;
                                        }
                                    } catch (Throwable th13) {
                                        th = th13;
                                        i2 = i13;
                                        i3 = 5;
                                        cursorQuery2 = null;
                                    }
                                }
                            } catch (SQLiteDatabaseLockedException unused23) {
                                str5 = str5;
                                i2 = i13;
                                str4 = str4;
                                str3 = str3;
                                i3 = 5;
                                sQLiteDatabaseB = null;
                            } catch (SQLiteFullException e33) {
                                e = e33;
                                str5 = str5;
                                i2 = i13;
                                str4 = str4;
                                str3 = str3;
                                i3 = 5;
                                sQLiteDatabaseB = null;
                            } catch (SQLiteException e34) {
                                e = e34;
                                str5 = str5;
                                i2 = i13;
                                str4 = str4;
                                str3 = str3;
                                i3 = 5;
                                sQLiteDatabaseB = null;
                            } catch (Throwable th14) {
                                th = th14;
                                sQLiteDatabaseB = null;
                            }
                        } else {
                            i = 0;
                            x0 x0Var23 = s1Var4.C;
                            s1.m(x0Var23);
                            x0Var23.F.a("Failed to read events from database in reasonable time");
                            arrayList = null;
                        }
                        i13 = i2 + 1;
                        i12 = i3;
                        str4 = str4;
                        str3 = str3;
                        str5 = str5;
                    }
                } else {
                    context = context3;
                    x0Var = x0Var3;
                    i = 0;
                }
                if (arrayList != null) {
                    arrayList2.addAll(arrayList);
                    size = arrayList.size();
                } else {
                    size = i;
                }
                if (aVar != null && size < i10) {
                    arrayList2.add(new q0(aVar, t4Var2.z, t4Var2.G));
                }
                i6 = i;
                for (size2 = arrayList2.size(); i6 < size2; size2 = size2) {
                    q0Var = (q0) arrayList2.get(i6);
                    aVar2 = q0Var.a;
                    g0Var2 = h0.W0;
                    if (gVar.G(null, g0Var2)) {
                        str2 = q0Var.b;
                        if (!TextUtils.isEmpty(str2)) {
                            t4Var2 = new t4(t4Var2.e, t4Var2.y, str2, q0Var.c, t4Var2.A, t4Var2.B, t4Var2.C, t4Var2.D, t4Var2.E, t4Var2.F, t4Var2.H, t4Var2.I, t4Var2.J, t4Var2.K, t4Var2.L, t4Var2.M, t4Var2.N, t4Var2.O, t4Var2.P, t4Var2.Q, t4Var2.R, t4Var2.S, t4Var2.T, t4Var2.U, t4Var2.V, t4Var2.W, t4Var2.X, t4Var2.Y, t4Var2.Z, t4Var2.a0, t4Var2.b0, t4Var2.c0);
                        }
                    }
                    if (aVar2 instanceof u) {
                        try {
                            aVar4.getClass();
                            jCurrentTimeMillis = System.currentTimeMillis();
                            try {
                                aVar4.getClass();
                                jElapsedRealtime = SystemClock.elapsedRealtime();
                                try {
                                    try {
                                        k0Var.C((u) aVar2, t4Var2);
                                        s1.m(x0Var);
                                        x0Var2 = x0Var;
                                        try {
                                            x0Var2.K.a("Logging telemetry for logEvent from database");
                                            if (com.google.android.datatransport.runtime.scheduling.jobscheduling.c.B == null) {
                                                s1Var2 = s1Var;
                                                context2 = context;
                                                try {
                                                    com.google.android.datatransport.runtime.scheduling.jobscheduling.c.B = new com.google.android.datatransport.runtime.scheduling.jobscheduling.c(context2, s1Var2);
                                                } catch (RemoteException e35) {
                                                    e = e35;
                                                    j3 = jCurrentTimeMillis;
                                                    s1.m(x0Var2);
                                                    x0Var2.C.b(e, "Failed to send event to the service");
                                                    if (j3 != 0) {
                                                        if (com.google.android.datatransport.runtime.scheduling.jobscheduling.c.B == null) {
                                                            com.google.android.datatransport.runtime.scheduling.jobscheduling.c.B = new com.google.android.datatransport.runtime.scheduling.jobscheduling.c(context2, s1Var2);
                                                        }
                                                        com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar = com.google.android.datatransport.runtime.scheduling.jobscheduling.c.B;
                                                        aVar4.getClass();
                                                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                                                        aVar4.getClass();
                                                        cVar.x(13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j3, jCurrentTimeMillis2);
                                                    }
                                                }
                                            } else {
                                                s1Var2 = s1Var;
                                                context2 = context;
                                            }
                                            com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar2 = com.google.android.datatransport.runtime.scheduling.jobscheduling.c.B;
                                            aVar4.getClass();
                                            long jCurrentTimeMillis3 = System.currentTimeMillis();
                                            aVar4.getClass();
                                            cVar2.x(0, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), jCurrentTimeMillis, jCurrentTimeMillis3);
                                        } catch (RemoteException e36) {
                                            e = e36;
                                            s1Var2 = s1Var;
                                            context2 = context;
                                        }
                                    } catch (RemoteException e37) {
                                        e = e37;
                                        s1Var2 = s1Var;
                                        context2 = context;
                                        x0Var2 = x0Var;
                                        j3 = jCurrentTimeMillis;
                                        s1.m(x0Var2);
                                        x0Var2.C.b(e, "Failed to send event to the service");
                                        if (j3 != 0) {
                                            if (com.google.android.datatransport.runtime.scheduling.jobscheduling.c.B == null) {
                                                com.google.android.datatransport.runtime.scheduling.jobscheduling.c.B = new com.google.android.datatransport.runtime.scheduling.jobscheduling.c(context2, s1Var2);
                                            }
                                            com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar3 = com.google.android.datatransport.runtime.scheduling.jobscheduling.c.B;
                                            aVar4.getClass();
                                            long jCurrentTimeMillis4 = System.currentTimeMillis();
                                            aVar4.getClass();
                                            cVar3.x(13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j3, jCurrentTimeMillis4);
                                        }
                                        i6++;
                                        x0Var = x0Var2;
                                        s1Var = s1Var2;
                                        context = context2;
                                    }
                                } catch (RemoteException e38) {
                                    e = e38;
                                }
                            } catch (RemoteException e39) {
                                e = e39;
                                s1Var2 = s1Var;
                                context2 = context;
                                x0Var2 = x0Var;
                                jElapsedRealtime = 0;
                            }
                        } catch (RemoteException e40) {
                            e = e40;
                            s1Var2 = s1Var;
                            context2 = context;
                            x0Var2 = x0Var;
                            jElapsedRealtime = 0;
                            j3 = 0;
                        }
                    } else {
                        s1Var2 = s1Var;
                        context2 = context;
                        x0Var2 = x0Var;
                        if (aVar2 instanceof o4) {
                            try {
                                k0Var.t((o4) aVar2, t4Var2);
                            } catch (RemoteException e41) {
                                s1.m(x0Var2);
                                x0Var2.C.b(e41, "Failed to send user property to the service");
                            }
                        } else {
                            if (aVar2 instanceof e) {
                                try {
                                    k0Var.i((e) aVar2, t4Var2);
                                } catch (RemoteException e42) {
                                    s1.m(x0Var2);
                                    x0Var2.C.b(e42, "Failed to send conditional user property to the service");
                                }
                            } else if (gVar.G(null, g0Var2) || !(aVar2 instanceof t)) {
                                s1.m(x0Var2);
                                x0Var2.C.a("Discarding data. Unrecognized parcel type.");
                            } else {
                                try {
                                    k0Var.v(((t) aVar2).h(), t4Var2);
                                } catch (RemoteException e43) {
                                    s1.m(x0Var2);
                                    x0Var2.C.b(e43, "Failed to send default event parameters to the service");
                                }
                            }
                            i6++;
                            x0Var = x0Var2;
                            s1Var = s1Var2;
                            context = context2;
                        }
                    }
                    i6++;
                    x0Var = x0Var2;
                    s1Var = s1Var2;
                    context = context2;
                }
                x0Var3 = x0Var;
                s1Var3 = s1Var;
                context3 = context;
                aVar3 = aVar4;
                i7 = 100;
                i8 = i11 + 1;
            }
            i = 0;
            arrayList = null;
            if (arrayList != null) {
                arrayList2.addAll(arrayList);
                size = arrayList.size();
            } else {
                size = i;
            }
            if (aVar != null) {
                arrayList2.add(new q0(aVar, t4Var2.z, t4Var2.G));
            }
            i6 = i;
            while (i6 < size2) {
                q0Var = (q0) arrayList2.get(i6);
                aVar2 = q0Var.a;
                g0Var2 = h0.W0;
                if (gVar.G(null, g0Var2)) {
                    str2 = q0Var.b;
                    if (!TextUtils.isEmpty(str2)) {
                        t4Var2 = new t4(t4Var2.e, t4Var2.y, str2, q0Var.c, t4Var2.A, t4Var2.B, t4Var2.C, t4Var2.D, t4Var2.E, t4Var2.F, t4Var2.H, t4Var2.I, t4Var2.J, t4Var2.K, t4Var2.L, t4Var2.M, t4Var2.N, t4Var2.O, t4Var2.P, t4Var2.Q, t4Var2.R, t4Var2.S, t4Var2.T, t4Var2.U, t4Var2.V, t4Var2.W, t4Var2.X, t4Var2.Y, t4Var2.Z, t4Var2.a0, t4Var2.b0, t4Var2.c0);
                    }
                }
                if (aVar2 instanceof u) {
                    aVar4.getClass();
                    jCurrentTimeMillis = System.currentTimeMillis();
                    aVar4.getClass();
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                    k0Var.C((u) aVar2, t4Var2);
                    s1.m(x0Var);
                    x0Var2 = x0Var;
                    x0Var2.K.a("Logging telemetry for logEvent from database");
                    if (com.google.android.datatransport.runtime.scheduling.jobscheduling.c.B == null) {
                        s1Var2 = s1Var;
                        context2 = context;
                        com.google.android.datatransport.runtime.scheduling.jobscheduling.c.B = new com.google.android.datatransport.runtime.scheduling.jobscheduling.c(context2, s1Var2);
                    } else {
                        s1Var2 = s1Var;
                        context2 = context;
                    }
                    com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar4 = com.google.android.datatransport.runtime.scheduling.jobscheduling.c.B;
                    aVar4.getClass();
                    long jCurrentTimeMillis5 = System.currentTimeMillis();
                    aVar4.getClass();
                    cVar4.x(0, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), jCurrentTimeMillis, jCurrentTimeMillis5);
                } else {
                    s1Var2 = s1Var;
                    context2 = context;
                    x0Var2 = x0Var;
                    if (aVar2 instanceof o4) {
                        k0Var.t((o4) aVar2, t4Var2);
                    } else {
                        if (aVar2 instanceof e) {
                            k0Var.i((e) aVar2, t4Var2);
                        } else if (gVar.G(null, g0Var2)) {
                            s1.m(x0Var2);
                            x0Var2.C.a("Discarding data. Unrecognized parcel type.");
                        } else {
                            s1.m(x0Var2);
                            x0Var2.C.a("Discarding data. Unrecognized parcel type.");
                        }
                        i6++;
                        x0Var = x0Var2;
                        s1Var = s1Var2;
                        context = context2;
                    }
                }
                i6++;
                x0Var = x0Var2;
                s1Var = s1Var2;
                context = context2;
            }
            x0Var3 = x0Var;
            s1Var3 = s1Var;
            context3 = context;
            aVar3 = aVar4;
            i7 = 100;
            i8 = i11 + 1;
        }
    }

    public final void O(e eVar) {
        boolean zC;
        v();
        w();
        s1 s1Var = (s1) this.e;
        s1Var.getClass();
        r0 r0VarO = s1Var.o();
        s1 s1Var2 = (s1) r0VarO.e;
        s1.k(s1Var2.F);
        byte[] bArrF0 = r4.f0(eVar);
        if (bArrF0.length > 131072) {
            x0 x0Var = s1Var2.C;
            s1.m(x0Var);
            x0Var.D.a("Conditional user property too long for local database. Sending directly to service");
            zC = false;
        } else {
            zC = r0VarO.C(bArrF0, 2);
        }
        J(new com.google.android.gms.cloudmessaging.i(this, L(true), zC, new e(eVar)));
    }

    @Override // com.google.android.gms.measurement.internal.j0
    public final boolean y() {
        return false;
    }

    public final void z(AtomicReference atomicReference) {
        v();
        w();
        J(new androidx.core.provider.m(this, atomicReference, L(false)));
    }
}
