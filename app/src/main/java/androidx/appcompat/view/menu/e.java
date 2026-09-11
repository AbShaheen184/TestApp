package androidx.appcompat.view.menu;

import android.animation.ValueAnimator;
import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import androidx.core.view.a1;
import androidx.core.view.f1;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.internal.measurement.a9;
import com.google.android.gms.internal.measurement.b6;
import com.google.android.gms.internal.measurement.b9;
import com.google.android.gms.internal.measurement.t1;
import com.google.android.gms.internal.measurement.y8;
import com.google.android.gms.internal.measurement.z8;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.d4;
import com.google.android.gms.measurement.internal.e4;
import com.google.android.gms.measurement.internal.f4;
import com.google.android.gms.measurement.internal.h0;
import com.google.android.gms.measurement.internal.h3;
import com.google.android.gms.measurement.internal.i3;
import com.google.android.gms.measurement.internal.k0;
import com.google.android.gms.measurement.internal.l4;
import com.google.android.gms.measurement.internal.m4;
import com.google.android.gms.measurement.internal.n4;
import com.google.android.gms.measurement.internal.o0;
import com.google.android.gms.measurement.internal.o3;
import com.google.android.gms.measurement.internal.r4;
import com.google.android.gms.measurement.internal.s1;
import com.google.android.gms.measurement.internal.t4;
import com.google.android.gms.measurement.internal.u;
import com.google.android.gms.measurement.internal.v2;
import com.google.android.gms.measurement.internal.x0;
import com.google.android.gms.measurement.internal.y1;
import com.google.android.gms.measurement.internal.z1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public e(v2 v2Var, AtomicReference atomicReference, String str, String str2) {
        this.e = 5;
        this.y = atomicReference;
        this.z = str;
        this.A = str2;
        Objects.requireNonNull(v2Var);
        this.B = v2Var;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:113:0x03f2 A[LOOP:1: B:111:0x03ec->B:113:0x03f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:118:0x0442 A[Catch: t1 -> 0x04aa, LOOP:2: B:116:0x0438->B:118:0x0442, LOOP_END, TryCatch #6 {t1 -> 0x04aa, blocks: (B:115:0x042b, B:116:0x0438, B:118:0x0442, B:119:0x0478, B:121:0x0493), top: B:148:0x042b }] */
    /* JADX WARN: Code duplicated, block: B:121:0x0493 A[Catch: t1 -> 0x04aa, TRY_LEAVE, TryCatch #6 {t1 -> 0x04aa, blocks: (B:115:0x042b, B:116:0x0438, B:118:0x0442, B:119:0x0478, B:121:0x0493), top: B:148:0x042b }] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Bundle bundle;
        d4 d4Var;
        y8 y8Var;
        int i;
        long jElapsedRealtime;
        switch (this.e) {
            case 0:
                g gVar = (g) ((com.google.firebase.platforminfo.c) this.B).e;
                k kVar = (k) this.z;
                f fVar = (f) this.y;
                if (fVar != null) {
                    gVar.W = true;
                    fVar.b.c(false);
                    gVar.W = false;
                }
                if (kVar.isEnabled() && kVar.hasSubMenu()) {
                    ((j) this.A).p(kVar, null, 4);
                    return;
                }
                return;
            case 1:
                a1.i((View) this.y, (f1) this.z, (androidx.compose.foundation.text.input.internal.o) this.A);
                ((ValueAnimator) this.B).start();
                return;
            case 2:
                z1 z1Var = (z1) this.y;
                String str = (String) this.z;
                e4 e4Var = (e4) this.A;
                o0 o0Var = (o0) this.B;
                l4 l4Var = z1Var.d;
                l4Var.W();
                l4Var.e().v();
                l4Var.m0();
                com.google.android.gms.measurement.internal.m mVar = l4Var.z;
                l4.U(mVar);
                Object obj = null;
                List<m4> listA = mVar.A(str, e4Var, ((Integer) h0.B.a(null)).intValue());
                ArrayList arrayList = new ArrayList();
                for (m4 m4Var : listA) {
                    String str2 = m4Var.c;
                    long j = m4Var.h;
                    long j2 = m4Var.a;
                    if (l4Var.s(str, str2)) {
                        int i2 = m4Var.i;
                        if (i2 > 0) {
                            if (i2 <= ((Integer) h0.z.a(obj)).intValue()) {
                                long jMin = Math.min(((Long) h0.x.a(obj)).longValue() * (1 << (i2 - 1)), ((Long) h0.y.a(obj)).longValue());
                                l4Var.c().getClass();
                                if (System.currentTimeMillis() >= jMin + j) {
                                    bundle = new Bundle();
                                    for (Map.Entry entry : m4Var.d.entrySet()) {
                                        bundle.putString((String) entry.getKey(), (String) entry.getValue());
                                    }
                                    long j3 = m4Var.a;
                                    z8 z8Var = m4Var.b;
                                    d4Var = new d4(j3, z8Var.a(), m4Var.c, bundle, m4Var.e.e, m4Var.g, "");
                                    try {
                                        y8Var = (y8) n4.g0(z8.B(), d4Var.y);
                                        for (i = 0; i < ((z8) y8Var.y).v(); i++) {
                                            a9 a9Var = (a9) ((z8) y8Var.y).w(i).l();
                                            l4Var.c().getClass();
                                            long jCurrentTimeMillis = System.currentTimeMillis();
                                            a9Var.b();
                                            ((b9) a9Var.y).k0(jCurrentTimeMillis);
                                            y8Var.b();
                                            ((z8) y8Var.y).D(i, (b9) a9Var.d());
                                        }
                                        d4Var.y = ((z8) y8Var.d()).a();
                                        if (Log.isLoggable(l4Var.b().F(), 2)) {
                                            n4 n4Var = l4Var.D;
                                            l4.U(n4Var);
                                            d4Var.D = n4Var.W((z8) y8Var.d());
                                        }
                                        arrayList.add(d4Var);
                                    } catch (t1 unused) {
                                        l4Var.b().F.b(str, "Failed to parse queued batch. appId");
                                    }
                                }
                            }
                            l4Var.b().K.d("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str, Long.valueOf(j2), Long.valueOf(j));
                        } else {
                            bundle = new Bundle();
                            while (r8.hasNext()) {
                                bundle.putString((String) entry.getKey(), (String) entry.getValue());
                            }
                            long j4 = m4Var.a;
                            z8 z8Var2 = m4Var.b;
                            d4Var = new d4(j4, z8Var2.a(), m4Var.c, bundle, m4Var.e.e, m4Var.g, "");
                            y8Var = (y8) n4.g0(z8.B(), d4Var.y);
                            while (i < ((z8) y8Var.y).v()) {
                                a9 a9Var2 = (a9) ((z8) y8Var.y).w(i).l();
                                l4Var.c().getClass();
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                a9Var2.b();
                                ((b9) a9Var2.y).k0(jCurrentTimeMillis2);
                                y8Var.b();
                                ((z8) y8Var.y).D(i, (b9) a9Var2.d());
                            }
                            d4Var.y = ((z8) y8Var.d()).a();
                            if (Log.isLoggable(l4Var.b().F(), 2)) {
                                n4 n4Var2 = l4Var.D;
                                l4.U(n4Var2);
                                d4Var.D = n4Var2.W((z8) y8Var.d());
                            }
                            arrayList.add(d4Var);
                        }
                        obj = null;
                    } else {
                        l4Var.b().K.d("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str, Long.valueOf(j2), m4Var.c);
                    }
                }
                try {
                    o0Var.y(new f4(arrayList));
                    l4Var.b().K.c(str, Integer.valueOf(arrayList.size()), "[sgtm] Sending queued upload batches to client. appId, count");
                    return;
                } catch (RemoteException e) {
                    l4Var.b().C.c(str, e, "[sgtm] Failed to return upload batches for app");
                    return;
                }
            case 3:
                o3 o3VarP = ((AppMeasurementDynamiteService) this.B).d.p();
                b6 b6Var = (b6) this.y;
                u uVar = (u) this.z;
                String str3 = (String) this.A;
                o3VarP.v();
                o3VarP.w();
                s1 s1Var = (s1) o3VarP.e;
                r4 r4Var = s1Var.F;
                s1.k(r4Var);
                if (com.google.android.gms.common.f.b.b(((s1) r4Var.e).e, 12451000) == 0) {
                    o3VarP.J(new e(o3VarP, uVar, str3, b6Var, 7));
                    return;
                }
                x0 x0Var = s1Var.C;
                s1.m(x0Var);
                x0Var.F.a("Not bundling data. Service unavailable or out of date");
                r4 r4Var2 = s1Var.F;
                s1.k(r4Var2);
                r4Var2.m0(b6Var, new byte[0]);
                return;
            case 4:
                z1 z1Var2 = (z1) this.y;
                Bundle bundle2 = (Bundle) this.z;
                String str4 = (String) this.A;
                t4 t4Var = (t4) this.B;
                boolean zIsEmpty = bundle2.isEmpty();
                l4 l4Var2 = z1Var2.d;
                if (zIsEmpty) {
                    com.google.android.gms.measurement.internal.m mVar2 = l4Var2.z;
                    l4.U(mVar2);
                    mVar2.v();
                    mVar2.w();
                    try {
                        mVar2.m0().execSQL("delete from default_event_params where app_id=?", new String[]{str4});
                        return;
                    } catch (SQLiteException e2) {
                        x0 x0Var2 = ((s1) mVar2.e).C;
                        s1.m(x0Var2);
                        x0Var2.C.b(e2, "Error clearing default event params");
                        return;
                    }
                }
                com.google.android.gms.measurement.internal.m mVar3 = l4Var2.z;
                l4.U(mVar3);
                s1 s1Var2 = (s1) mVar3.e;
                mVar3.v();
                mVar3.w();
                com.google.android.gms.measurement.internal.q qVar = new com.google.android.gms.measurement.internal.q((s1) mVar3.e, "", str4, "dep", 0L, 0L, 0L, bundle2);
                n4 n4Var3 = mVar3.y.D;
                l4.U(n4Var3);
                byte[] bArrA = n4Var3.V(qVar).a();
                x0 x0Var3 = s1Var2.C;
                s1.m(x0Var3);
                x0Var3.K.c(str4, Integer.valueOf(bArrA.length), "Saving default event parameters, appId, data size");
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str4);
                contentValues.put("parameters", bArrA);
                try {
                    if (mVar3.m0().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                        s1.m(x0Var3);
                        x0Var3.C.b(x0.D(str4), "Failed to insert default event parameters (got -1). appId");
                    }
                } catch (SQLiteException e3) {
                    s1.m(x0Var3);
                    x0Var3.C.c(x0.D(str4), e3, "Error storing default event parameters. appId");
                }
                com.google.android.gms.measurement.internal.m mVar4 = l4Var2.z;
                l4.U(mVar4);
                long j5 = t4Var.a0;
                try {
                    if (mVar4.S("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str4, String.valueOf(j5)}, 0L) <= 0 && mVar4.S("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str4, String.valueOf(j5)}, 0L) > 0) {
                        com.google.android.gms.measurement.internal.m mVar5 = l4Var2.z;
                        l4.U(mVar5);
                        mVar5.O(str4, Long.valueOf(j5), null, bundle2);
                        return;
                    }
                    return;
                } catch (SQLiteException e4) {
                    x0 x0Var4 = ((s1) mVar4.e).C;
                    s1.m(x0Var4);
                    x0Var4.C.b(e4, "Error checking backfill conditions");
                    return;
                }
            case 5:
                String str5 = (String) this.z;
                String str6 = (String) this.A;
                o3 o3VarP2 = ((s1) ((v2) this.B).e).p();
                AtomicReference atomicReference = (AtomicReference) this.y;
                o3VarP2.v();
                o3VarP2.w();
                o3VarP2.J(new y1(o3VarP2, atomicReference, str5, str6, o3VarP2.L(false)));
                return;
            case 6:
                o3 o3VarP3 = ((AppMeasurementDynamiteService) this.B).d.p();
                b6 b6Var2 = (b6) this.y;
                String str7 = (String) this.z;
                String str8 = (String) this.A;
                o3VarP3.v();
                o3VarP3.w();
                o3VarP3.J(new y1(o3VarP3, str7, str8, o3VarP3.L(false), b6Var2));
                return;
            case 7:
                b6 b6Var3 = (b6) this.A;
                o3 o3Var = (o3) this.B;
                byte[] bArrN = null;
                try {
                    try {
                        k0 k0Var = o3Var.A;
                        if (k0Var != null) {
                            bArrN = k0Var.n((u) this.y, (String) this.z);
                            o3Var.I();
                            r4 r4Var3 = ((s1) o3Var.e).F;
                            s1.k(r4Var3);
                            r4Var3.m0(b6Var3, bArrN);
                            return;
                        }
                        s1 s1Var3 = (s1) o3Var.e;
                        x0 x0Var5 = s1Var3.C;
                        s1.m(x0Var5);
                        x0Var5.C.a("Discarding data. Failed to send event to service to bundle");
                        r4 r4Var4 = s1Var3.F;
                        s1.k(r4Var4);
                        r4Var4.m0(b6Var3, null);
                        return;
                    } catch (RemoteException e5) {
                        x0 x0Var6 = ((s1) o3Var.e).C;
                        s1.m(x0Var6);
                        x0Var6.C.b(e5, "Failed to send event to the service to bundle");
                    }
                } catch (Throwable th) {
                    r4 r4Var5 = ((s1) o3Var.e).F;
                    s1.k(r4Var5);
                    r4Var5.m0(b6Var3, null);
                    throw th;
                }
                break;
            case 8:
                o3 o3Var2 = (o3) this.y;
                AtomicReference atomicReference2 = (AtomicReference) this.z;
                t4 t4Var2 = (t4) this.A;
                Bundle bundle3 = (Bundle) this.B;
                synchronized (atomicReference2) {
                    try {
                        k0 k0Var2 = o3Var2.A;
                        if (k0Var2 != null) {
                            k0Var2.p(t4Var2, bundle3, new h3(o3Var2, atomicReference2));
                            o3Var2.I();
                            return;
                        } else {
                            x0 x0Var7 = ((s1) o3Var2.e).C;
                            s1.m(x0Var7);
                            x0Var7.C.a("Failed to request trigger URIs; not connected to service");
                            return;
                        }
                    } catch (RemoteException e6) {
                        x0 x0Var8 = ((s1) o3Var2.e).C;
                        s1.m(x0Var8);
                        x0Var8.C.b(e6, "Failed to request trigger URIs; remote exception");
                        atomicReference2.notifyAll();
                    }
                }
                break;
            case 9:
                o3 o3Var3 = (o3) this.y;
                AtomicReference atomicReference3 = (AtomicReference) this.z;
                t4 t4Var3 = (t4) this.A;
                e4 e4Var2 = (e4) this.B;
                synchronized (atomicReference3) {
                    try {
                        k0 k0Var3 = o3Var3.A;
                        if (k0Var3 != null) {
                            k0Var3.a(t4Var3, e4Var2, new i3(o3Var3, atomicReference3));
                            o3Var3.I();
                            return;
                        } else {
                            x0 x0Var9 = ((s1) o3Var3.e).C;
                            s1.m(x0Var9);
                            x0Var9.C.a("[sgtm] Failed to get upload batches; not connected to service");
                            return;
                        }
                    } catch (RemoteException e7) {
                        x0 x0Var10 = ((s1) o3Var3.e).C;
                        s1.m(x0Var10);
                        x0Var10.C.b(e7, "[sgtm] Failed to get upload batches; remote exception");
                        atomicReference3.notifyAll();
                    }
                }
                break;
            default:
                l4 l4Var3 = (l4) ((androidx.media3.exoplayer.dash.manifest.t) this.B).y;
                r4 r4VarL0 = l4Var3.l0();
                l4Var3.c().getClass();
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                if (l4Var3.f0().G(null, h0.e1)) {
                    l4Var3.c().getClass();
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                } else {
                    jElapsedRealtime = 0;
                }
                long j6 = jElapsedRealtime;
                Bundle bundle4 = (Bundle) this.A;
                String str9 = (String) this.z;
                String str10 = (String) this.y;
                u uVarD0 = r4VarL0.d0(str9, bundle4, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, jCurrentTimeMillis3, j6, false);
                x.g(uVarD0);
                l4Var3.h(uVarD0, str10);
                return;
        }
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
        this.B = obj4;
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.B = obj;
        this.y = obj2;
        this.z = obj3;
        this.A = obj4;
    }
}
