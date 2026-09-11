package androidx.core.provider;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.activity.compose.p;
import com.caverock.androidsvg.y1;
import com.google.android.gms.cloudmessaging.n;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.internal.measurement.af;
import com.google.android.gms.internal.measurement.b6;
import com.google.android.gms.internal.measurement.bf;
import com.google.android.gms.internal.measurement.da;
import com.google.android.gms.internal.measurement.h6;
import com.google.android.gms.internal.measurement.pf;
import com.google.android.gms.internal.measurement.qf;
import com.google.android.gms.internal.measurement.t5;
import com.google.android.gms.internal.measurement.ue;
import com.google.android.gms.measurement.internal.e2;
import com.google.android.gms.measurement.internal.g1;
import com.google.android.gms.measurement.internal.g2;
import com.google.android.gms.measurement.internal.k0;
import com.google.android.gms.measurement.internal.k4;
import com.google.android.gms.measurement.internal.l1;
import com.google.android.gms.measurement.internal.l4;
import com.google.android.gms.measurement.internal.m4;
import com.google.android.gms.measurement.internal.n4;
import com.google.android.gms.measurement.internal.o3;
import com.google.android.gms.measurement.internal.o4;
import com.google.android.gms.measurement.internal.r3;
import com.google.android.gms.measurement.internal.r4;
import com.google.android.gms.measurement.internal.s1;
import com.google.android.gms.measurement.internal.t;
import com.google.android.gms.measurement.internal.t4;
import com.google.android.gms.measurement.internal.u;
import com.google.android.gms.measurement.internal.v2;
import com.google.android.gms.measurement.internal.x0;
import com.google.android.gms.measurement.internal.z1;
import com.google.android.gms.tasks.q;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.l0;
import com.google.common.util.concurrent.n0;
import com.google.common.util.concurrent.y0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.z;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Runnable {
    public Object A;
    public final /* synthetic */ int e;
    public Object y;
    public Object z;

    public m(o3 o3Var, AtomicReference atomicReference, t4 t4Var) {
        this.e = 10;
        this.y = atomicReference;
        this.z = t4Var;
        Objects.requireNonNull(o3Var);
        this.A = o3Var;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x034e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0354  */
    /* JADX WARN: Code duplicated, block: B:117:0x0365  */
    /* JADX WARN: Code duplicated, block: B:119:0x036b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0371  */
    /* JADX WARN: Code duplicated, block: B:124:0x0391  */
    /* JADX WARN: Code duplicated, block: B:127:0x03e5 A[Catch: SQLiteException -> 0x03f0, TRY_LEAVE, TryCatch #18 {SQLiteException -> 0x03f0, blocks: (B:125:0x03c6, B:127:0x03e5), top: B:278:0x03c6 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x0414  */
    /* JADX WARN: Code duplicated, block: B:136:0x0417  */
    /* JADX WARN: Code duplicated, block: B:138:0x041f  */
    /* JADX WARN: Code duplicated, block: B:139:0x0428  */
    /* JADX WARN: Code duplicated, block: B:146:0x0472  */
    /* JADX WARN: Code duplicated, block: B:295:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Object objCall;
        int i;
        q qVarQ;
        t tVar;
        int i2;
        long j;
        int i3;
        Cursor cursorQuery;
        m4 m4Var;
        String str;
        int i4;
        k4 k4Var;
        com.google.android.gms.measurement.internal.m mVar;
        Long lValueOf;
        ContentValues contentValues;
        x0 x0Var;
        AtomicReference atomicReference;
        r4 r4Var;
        switch (this.e) {
            case 0:
                try {
                    objCall = ((e) this.y).call();
                    break;
                } catch (Exception unused) {
                    objCall = null;
                }
                ((Handler) this.A).post(new l0(3, (f) this.z, objCall));
                return;
            case 1:
                CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) this.y;
                try {
                    BuildersKt.runBlocking(cancellableContinuationImpl.getContext().minusKey(kotlin.coroutines.e.e), new androidx.compose.animation.core.f((androidx.room.q) this.z, cancellableContinuationImpl, (p) this.A, (kotlin.coroutines.d) null, 6));
                    return;
                } catch (Throwable th) {
                    cancellableContinuationImpl.cancel(th);
                    return;
                }
            case 2:
                com.google.android.gms.cloudmessaging.a aVar = (com.google.android.gms.cloudmessaging.a) this.z;
                Intent intent = aVar.e;
                String stringExtra = intent.getStringExtra("google.message_id");
                if (stringExtra == null) {
                    stringExtra = intent.getStringExtra("message_id");
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    qVarQ = kotlin.math.a.t(null);
                } else {
                    Bundle bundle = new Bundle();
                    Intent intent2 = aVar.e;
                    String stringExtra2 = intent2.getStringExtra("google.message_id");
                    if (stringExtra2 == null) {
                        stringExtra2 = intent2.getStringExtra("message_id");
                    }
                    bundle.putString("google.message_id", stringExtra2);
                    Intent intent3 = aVar.e;
                    Integer numValueOf = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
                    if (numValueOf != null) {
                        bundle.putInt("google.product_id", numValueOf.intValue());
                    }
                    Context context = (Context) this.y;
                    bundle.putBoolean("supports_message_handled", true);
                    n nVarP = n.p(context);
                    synchronized (nVarP) {
                        i = nVarP.e;
                        nVarP.e = i + 1;
                    }
                    qVarQ = nVarP.q(new com.google.android.gms.cloudmessaging.m(i, 2, bundle, 0));
                }
                qVarQ.a(com.google.android.gms.cloudmessaging.h.y, new androidx.media3.exoplayer.dash.manifest.t((CountDownLatch) this.A, 19));
                return;
            case 3:
                y1 y1Var = (y1) this.y;
                ListenableFuture listenableFuture = (y0) this.z;
                ue ueVar = (ue) this.A;
                try {
                    Object objB = n0.b(listenableFuture);
                    y0 y0Var = (y0) y1Var.f;
                    y0Var.l(objB);
                    ueVar.n(y0Var);
                    return;
                } catch (Throwable unused2) {
                    ueVar.n(listenableFuture);
                    return;
                }
            case 4:
                if (((z) this.y).e != null) {
                    androidx.transition.k.i();
                    return;
                }
                qf qfVar = (qf) this.z;
                da daVar = (da) this.A;
                pf pfVarC = bf.c();
                qf qfVarB = bf.b(pfVarC, qfVar);
                try {
                    daVar.run();
                    bf.b(pfVarC, qfVarB);
                    return;
                } catch (Throwable th2) {
                    try {
                        af.a(th2);
                        throw th2;
                    } catch (Throwable th3) {
                        bf.b(pfVarC, qfVarB);
                        throw th3;
                    }
                }
            case 5:
                l4 l4Var = ((z1) this.A).d;
                l4Var.W();
                com.google.android.gms.measurement.internal.e eVar = (com.google.android.gms.measurement.internal.e) this.y;
                Object objD = eVar.z.d();
                t4 t4Var = (t4) this.z;
                if (objD == null) {
                    l4Var.b0(eVar, t4Var);
                    return;
                } else {
                    l4Var.a0(eVar, t4Var);
                    return;
                }
            case 6:
                u uVar = (u) this.y;
                t4 t4Var2 = (t4) this.z;
                z1 z1Var = (z1) this.A;
                z1Var.getClass();
                l4 l4Var2 = z1Var.d;
                if ("_cmp".equals(uVar.e) && (tVar = uVar.y) != null) {
                    Bundle bundle2 = tVar.e;
                    if (bundle2.size() != 0) {
                        String string = bundle2.getString("_cis");
                        if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                            l4Var2.b().I.b(uVar.toString(), "Event has been filtered ");
                            uVar = new u("_cmpx", tVar, uVar.z, uVar.A, uVar.B);
                        }
                    }
                }
                String str2 = uVar.e;
                l1 l1Var = l4Var2.e;
                n4 n4Var = l4Var2.D;
                l4.U(l1Var);
                String str3 = t4Var2.e;
                t5 t5Var = TextUtils.isEmpty(str3) ? null : (t5) l1Var.H.h(str3);
                if (t5Var == null) {
                    l4Var2.b().K.b(t4Var2.e, "EES not loaded for");
                    l4Var2.W();
                    l4Var2.j(uVar, t4Var2);
                    return;
                }
                try {
                    com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar = t5Var.c;
                    l4.U(n4Var);
                    HashMap mapJ0 = n4.j0(uVar.y.h(), true);
                    String strG = g2.g(str2, g2.f, g2.a);
                    if (strG == null) {
                        strG = str2;
                    }
                    if (t5Var.a(new com.google.android.gms.internal.measurement.b(strG, uVar.A, mapJ0))) {
                        if (((com.google.android.gms.internal.measurement.b) cVar.z).equals((com.google.android.gms.internal.measurement.b) cVar.y)) {
                            l4Var2.W();
                            l4Var2.j(uVar, t4Var2);
                        } else {
                            l4Var2.b().K.b(str2, "EES edited event");
                            l4.U(n4Var);
                            u uVarZ = n4.z((com.google.android.gms.internal.measurement.b) cVar.z);
                            l4Var2.W();
                            l4Var2.j(uVarZ, t4Var2);
                        }
                        if (((ArrayList) cVar.A).isEmpty()) {
                            return;
                        }
                        for (com.google.android.gms.internal.measurement.b bVar : (ArrayList) cVar.A) {
                            l4Var2.b().K.b(bVar.a, "EES logging created event");
                            l4.U(n4Var);
                            u uVarZ2 = n4.z(bVar);
                            l4Var2.W();
                            l4Var2.j(uVarZ2, t4Var2);
                        }
                        return;
                    }
                } catch (h6 unused3) {
                    l4Var2.b().C.c(t4Var2.y, str2, "EES error. appId, eventName");
                }
                l4Var2.b().K.b(str2, "EES was not applied to event");
                l4Var2.W();
                l4Var2.j(uVar, t4Var2);
                return;
            case 7:
                z1 z1Var2 = (z1) this.A;
                z1Var2.d.W();
                z1Var2.d.h((u) this.y, (String) this.z);
                return;
            case 8:
                l4 l4Var3 = ((z1) this.A).d;
                l4Var3.W();
                o4 o4Var = (o4) this.y;
                Object objD2 = o4Var.d();
                t4 t4Var3 = (t4) this.z;
                if (objD2 == null) {
                    l4Var3.Y(o4Var.y, t4Var3);
                    return;
                } else {
                    l4Var3.X(o4Var, t4Var3);
                    return;
                }
            case 9:
                z1 z1Var3 = (z1) this.y;
                t4 t4Var4 = (t4) this.z;
                com.google.android.gms.measurement.internal.d dVar = (com.google.android.gms.measurement.internal.d) this.A;
                l4 l4Var4 = z1Var3.d;
                l4Var4.W();
                String str4 = t4Var4.e;
                x.g(str4);
                HashMap map = l4Var4.b0;
                l4Var4.e().v();
                l4Var4.m0();
                com.google.android.gms.measurement.internal.m mVar2 = l4Var4.z;
                l4.U(mVar2);
                long j2 = dVar.e;
                long j3 = dVar.z;
                mVar2.v();
                mVar2.w();
                Cursor cursor = null;
                m4VarY = null;
                m4 m4VarY = null;
                try {
                    cursorQuery = mVar2.m0().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"}, "rowId=?", new String[]{String.valueOf(j2)}, null, null, null, "1");
                    try {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                String string2 = cursorQuery.getString(1);
                                x.g(string2);
                                j = j3;
                                try {
                                    try {
                                        try {
                                            i3 = 1;
                                            cursorQuery = cursorQuery;
                                            i2 = 4;
                                            j = j;
                                            try {
                                                m4VarY = mVar2.Y(string2, j2, cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                                                cursorQuery.close();
                                            } catch (SQLiteException e) {
                                                e = e;
                                                cursorQuery = cursorQuery;
                                                try {
                                                    x0 x0Var2 = ((s1) mVar2.e).C;
                                                    s1.m(x0Var2);
                                                    x0Var2.C.c(Long.valueOf(j2), e, "Error to querying MeasurementBatch from upload_queue. rowId");
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    cursor = cursorQuery;
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                    throw th;
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                cursor = cursorQuery;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                throw th;
                                            }
                                        } catch (SQLiteException e2) {
                                            e = e2;
                                            i3 = 1;
                                            i2 = 4;
                                            cursorQuery = cursorQuery;
                                            x0 x0Var3 = ((s1) mVar2.e).C;
                                            s1.m(x0Var3);
                                            x0Var3.C.c(Long.valueOf(j2), e, "Error to querying MeasurementBatch from upload_queue. rowId");
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            m4Var = m4VarY;
                                            if (m4Var == null) {
                                                l4Var4.b().F.c(str4, Long.valueOf(j2), "[sgtm] Queued batch doesn't exist. appId, rowId");
                                                return;
                                            }
                                            str = m4Var.c;
                                            i4 = dVar.y;
                                            if (i4 == i3) {
                                                if (i4 == 3) {
                                                    k4Var = (k4) map.get(str);
                                                    if (k4Var == null) {
                                                        k4Var = new k4(l4Var4);
                                                        map.put(str, k4Var);
                                                    } else {
                                                        k4Var.b += i3;
                                                        k4Var.c = k4Var.a();
                                                    }
                                                    l4Var4.c().getClass();
                                                    l4Var4.b().K.d("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str4, str, Long.valueOf((k4Var.c - System.currentTimeMillis()) / 1000));
                                                }
                                                com.google.android.gms.measurement.internal.m mVar3 = l4Var4.z;
                                                l4.U(mVar3);
                                                Long lValueOf2 = Long.valueOf(dVar.e);
                                                mVar3.H(lValueOf2);
                                                l4Var4.b().K.c(str4, lValueOf2, "[sgtm] increased batch retry count after failed client upload. appId, rowId");
                                                return;
                                            }
                                            if (map.containsKey(str)) {
                                                map.remove(str);
                                            }
                                            com.google.android.gms.measurement.internal.m mVar4 = l4Var4.z;
                                            l4.U(mVar4);
                                            Long lValueOf3 = Long.valueOf(j2);
                                            mVar4.C(lValueOf3);
                                            l4Var4.b().K.c(str4, lValueOf3, "[sgtm] queued batch deleted after successful client upload. appId, rowId");
                                            if (j > 0) {
                                                mVar = l4Var4.z;
                                                l4.U(mVar);
                                                s1 s1Var = (s1) mVar.e;
                                                mVar.v();
                                                mVar.w();
                                                lValueOf = Long.valueOf(j);
                                                contentValues = new ContentValues();
                                                contentValues.put("upload_type", Integer.valueOf(i3));
                                                com.google.android.gms.common.util.a aVar2 = s1Var.H;
                                                x0Var = s1Var.C;
                                                aVar2.getClass();
                                                contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                                                try {
                                                    if (mVar.m0().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j), str4, String.valueOf(i2)}) != 1) {
                                                        s1.m(x0Var);
                                                        x0Var.F.c(str4, lValueOf, "Google Signal pending batch not updated. appId, rowId");
                                                        break;
                                                    }
                                                    l4Var4.b().K.c(str4, Long.valueOf(j), "[sgtm] queued Google Signal batch updated. appId, signalRowId");
                                                    l4Var4.t(str4);
                                                    return;
                                                } catch (SQLiteException e3) {
                                                    s1.m(x0Var);
                                                    x0Var.C.d("Failed to update google Signal pending batch. appid, rowId", str4, Long.valueOf(j), e3);
                                                    throw e3;
                                                }
                                            }
                                            return;
                                        }
                                    } catch (SQLiteException e4) {
                                        e = e4;
                                        i3 = 1;
                                    }
                                } catch (SQLiteException e5) {
                                    e = e5;
                                    i2 = 4;
                                    i3 = 1;
                                    cursorQuery = cursorQuery;
                                    j = j;
                                }
                            } else {
                                i2 = 4;
                                j = j3;
                                i3 = 1;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                            }
                        } catch (SQLiteException e6) {
                            e = e6;
                            i2 = 4;
                            j = j3;
                            i3 = 1;
                            cursorQuery = cursorQuery;
                        }
                        m4Var = m4VarY;
                        if (m4Var == null) {
                            l4Var4.b().F.c(str4, Long.valueOf(j2), "[sgtm] Queued batch doesn't exist. appId, rowId");
                            return;
                        }
                        str = m4Var.c;
                        i4 = dVar.y;
                        if (i4 == i3) {
                            if (i4 == 3) {
                                k4Var = (k4) map.get(str);
                                if (k4Var == null) {
                                    k4Var = new k4(l4Var4);
                                    map.put(str, k4Var);
                                } else {
                                    k4Var.b += i3;
                                    k4Var.c = k4Var.a();
                                }
                                l4Var4.c().getClass();
                                l4Var4.b().K.d("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str4, str, Long.valueOf((k4Var.c - System.currentTimeMillis()) / 1000));
                            }
                            com.google.android.gms.measurement.internal.m mVar5 = l4Var4.z;
                            l4.U(mVar5);
                            Long lValueOf4 = Long.valueOf(dVar.e);
                            mVar5.H(lValueOf4);
                            l4Var4.b().K.c(str4, lValueOf4, "[sgtm] increased batch retry count after failed client upload. appId, rowId");
                            return;
                        }
                        if (map.containsKey(str)) {
                            map.remove(str);
                        }
                        com.google.android.gms.measurement.internal.m mVar6 = l4Var4.z;
                        l4.U(mVar6);
                        Long lValueOf5 = Long.valueOf(j2);
                        mVar6.C(lValueOf5);
                        l4Var4.b().K.c(str4, lValueOf5, "[sgtm] queued batch deleted after successful client upload. appId, rowId");
                        if (j > 0) {
                            mVar = l4Var4.z;
                            l4.U(mVar);
                            s1 s1Var2 = (s1) mVar.e;
                            mVar.v();
                            mVar.w();
                            lValueOf = Long.valueOf(j);
                            contentValues = new ContentValues();
                            contentValues.put("upload_type", Integer.valueOf(i3));
                            com.google.android.gms.common.util.a aVar3 = s1Var2.H;
                            x0Var = s1Var2.C;
                            aVar3.getClass();
                            contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                            if (mVar.m0().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j), str4, String.valueOf(i2)}) != 1) {
                                s1.m(x0Var);
                                x0Var.F.c(str4, lValueOf, "Google Signal pending batch not updated. appId, rowId");
                                break;
                            }
                            l4Var4.b().K.c(str4, Long.valueOf(j), "[sgtm] queued Google Signal batch updated. appId, signalRowId");
                            l4Var4.t(str4);
                            return;
                        }
                        return;
                    } catch (Throwable th6) {
                        th = th6;
                        cursorQuery = cursorQuery;
                    }
                } catch (SQLiteException e7) {
                    e = e7;
                    i2 = 4;
                    j = j3;
                    i3 = 1;
                    cursorQuery = null;
                } catch (Throwable th7) {
                    th = th7;
                }
                break;
            case 10:
                AtomicReference atomicReference2 = (AtomicReference) this.y;
                synchronized (atomicReference2) {
                    try {
                        try {
                            o3 o3Var = (o3) this.A;
                            s1 s1Var3 = (s1) o3Var.e;
                            g1 g1Var = s1Var3.B;
                            s1.k(g1Var);
                            if (g1Var.C().i(e2.ANALYTICS_STORAGE)) {
                                k0 k0Var = o3Var.A;
                                if (k0Var != null) {
                                    atomicReference2.set(k0Var.D((t4) this.z));
                                    String str5 = (String) atomicReference2.get();
                                    if (str5 != null) {
                                        v2 v2Var = ((s1) o3Var.e).J;
                                        s1.l(v2Var);
                                        v2Var.D.set(str5);
                                        g1 g1Var2 = s1Var3.B;
                                        s1.k(g1Var2);
                                        g1Var2.D.v(str5);
                                    }
                                    o3Var.I();
                                    atomicReference = (AtomicReference) this.y;
                                    atomicReference.notify();
                                    return;
                                }
                                x0 x0Var4 = s1Var3.C;
                                s1.m(x0Var4);
                                x0Var4.C.a("Failed to get app instance id");
                            } else {
                                x0 x0Var5 = s1Var3.C;
                                s1.m(x0Var5);
                                x0Var5.H.a("Analytics storage consent denied; will not get app instance id");
                                v2 v2Var2 = ((s1) o3Var.e).J;
                                s1.l(v2Var2);
                                v2Var2.D.set(null);
                                g1 g1Var3 = s1Var3.B;
                                s1.k(g1Var3);
                                g1Var3.D.v(null);
                                atomicReference2.set(null);
                            }
                            atomicReference2.notify();
                            return;
                        } catch (RemoteException e8) {
                            x0 x0Var6 = ((s1) ((o3) this.A).e).C;
                            s1.m(x0Var6);
                            x0Var6.C.b(e8, "Failed to get app instance id");
                            atomicReference = (AtomicReference) this.y;
                        }
                    } catch (Throwable th8) {
                        ((AtomicReference) this.y).notify();
                        throw th8;
                    }
                }
                break;
            case 11:
                b6 b6Var = (b6) this.z;
                o3 o3Var2 = (o3) this.A;
                String strD = null;
                try {
                    try {
                        s1 s1Var4 = (s1) o3Var2.e;
                        g1 g1Var4 = s1Var4.B;
                        x0 x0Var7 = s1Var4.C;
                        s1.k(g1Var4);
                        if (g1Var4.C().i(e2.ANALYTICS_STORAGE)) {
                            k0 k0Var2 = o3Var2.A;
                            if (k0Var2 != null) {
                                strD = k0Var2.D((t4) this.y);
                                if (strD != null) {
                                    v2 v2Var3 = s1Var4.J;
                                    s1.l(v2Var3);
                                    v2Var3.D.set(strD);
                                    s1.k(g1Var4);
                                    g1Var4.D.v(strD);
                                }
                                o3Var2.I();
                                r4Var = ((s1) o3Var2.e).F;
                                s1.k(r4Var);
                                r4Var.j0(strD, b6Var);
                                return;
                            }
                            s1.m(x0Var7);
                            x0Var7.C.a("Failed to get app instance id");
                        } else {
                            s1.m(x0Var7);
                            x0Var7.H.a("Analytics storage consent denied; will not get app instance id");
                            v2 v2Var4 = s1Var4.J;
                            s1.l(v2Var4);
                            v2Var4.D.set(null);
                            s1.k(g1Var4);
                            g1Var4.D.v(null);
                        }
                        r4Var = s1Var4.F;
                    } catch (RemoteException e9) {
                        x0 x0Var8 = ((s1) o3Var2.e).C;
                        s1.m(x0Var8);
                        x0Var8.C.b(e9, "Failed to get app instance id");
                    }
                    s1.k(r4Var);
                    r4Var.j0(strD, b6Var);
                    return;
                } catch (Throwable th9) {
                    r4 r4Var2 = ((s1) o3Var2.e).F;
                    s1.k(r4Var2);
                    r4Var2.j0(null, b6Var);
                    throw th9;
                }
            case 12:
                o3 o3Var3 = (o3) this.y;
                t4 t4Var5 = (t4) this.z;
                com.google.android.gms.measurement.internal.d dVar2 = (com.google.android.gms.measurement.internal.d) this.A;
                s1 s1Var5 = (s1) o3Var3.e;
                k0 k0Var3 = o3Var3.A;
                if (k0Var3 == null) {
                    x0 x0Var9 = s1Var5.C;
                    s1.m(x0Var9);
                    x0Var9.C.a("[sgtm] Discarding data. Failed to update batch upload status.");
                    return;
                }
                try {
                    k0Var3.s(t4Var5, dVar2);
                    o3Var3.I();
                    return;
                } catch (RemoteException e10) {
                    x0 x0Var10 = s1Var5.C;
                    s1.m(x0Var10);
                    x0Var10.C.c(Long.valueOf(dVar2.e), e10, "[sgtm] Failed to update batch upload status, rowId, exception");
                    return;
                }
            case 13:
                androidx.media3.exoplayer.dash.manifest.t tVar2 = (androidx.media3.exoplayer.dash.manifest.t) this.y;
                x0 x0Var11 = (x0) this.z;
                JobParameters jobParameters = (JobParameters) this.A;
                x0Var11.K.a("AppMeasurementJobService processed last upload request.");
                ((r3) ((Service) tVar2.y)).c(jobParameters);
                return;
            default:
                com.google.firebase.crashlytics.internal.send.b bVar2 = (com.google.firebase.crashlytics.internal.send.b) this.A;
                com.google.firebase.crashlytics.internal.common.b bVar3 = (com.google.firebase.crashlytics.internal.common.b) this.y;
                bVar2.b(bVar3, (com.google.android.gms.tasks.j) this.z);
                ((AtomicInteger) bVar2.i.z).set(0);
                double dMin = Math.min(3600000.0d, Math.pow(bVar2.b, bVar2.a()) * (60000.0d / bVar2.a));
                String str6 = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dMin / 1000.0d)) + " s for report: " + bVar3.b;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str6, null);
                }
                try {
                    Thread.sleep((long) dMin);
                    return;
                } catch (InterruptedException unused4) {
                    return;
                }
        }
    }

    public String toString() {
        switch (this.e) {
            case 4:
                da daVar = (da) this.A;
                StringBuilder sb = new StringBuilder(daVar.toString().length() + 14);
                sb.append("propagating=[");
                sb.append(daVar);
                sb.append("]");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ m(int i, Object obj, Object obj2, Object obj3) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
    }

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, int i, boolean z) {
        this.e = i;
        this.y = obj2;
        this.z = obj3;
        this.A = obj;
    }

    public /* synthetic */ m() {
        this.e = 0;
    }
}
