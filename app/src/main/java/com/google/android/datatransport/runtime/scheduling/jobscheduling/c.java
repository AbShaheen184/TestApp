package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.PersistableBundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.compose.foundation.gestures.y2;
import androidx.core.graphics.drawable.IconCompat;
import androidx.media3.ui.c0;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.internal.measurement.aa;
import com.google.android.gms.internal.measurement.ba;
import com.google.android.gms.internal.measurement.f1;
import com.google.android.gms.internal.measurement.gc;
import com.google.android.gms.internal.measurement.j5;
import com.google.android.gms.internal.measurement.o5;
import com.google.android.gms.internal.measurement.s5;
import com.google.android.gms.internal.measurement.t0;
import com.google.android.gms.internal.measurement.x9;
import com.google.android.gms.internal.measurement.z9;
import com.google.android.gms.measurement.internal.a3;
import com.google.android.gms.measurement.internal.b1;
import com.google.android.gms.measurement.internal.d4;
import com.google.android.gms.measurement.internal.e0;
import com.google.android.gms.measurement.internal.h0;
import com.google.android.gms.measurement.internal.l4;
import com.google.android.gms.measurement.internal.m4;
import com.google.android.gms.measurement.internal.o3;
import com.google.android.gms.measurement.internal.s1;
import com.google.android.gms.measurement.internal.v0;
import com.google.android.gms.measurement.internal.v2;
import com.google.android.gms.measurement.internal.x0;
import com.google.android.gms.measurement.internal.x2;
import com.google.android.gms.measurement.internal.z0;
import com.google.android.gms.tasks.q;
import com.google.common.base.t;
import com.google.firebase.messaging.FirebaseMessagingService;
import j$.net.URLEncoder;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiFunction;
import java.util.zip.Adler32;
import javax.net.ssl.HttpsURLConnection;
import okhttp3.d0;
import okhttp3.r;
import okhttp3.v;
import okhttp3.w;
import okio.b0;
import okio.f0;
import okio.g0;
import okio.z;
import org.jsoup.nodes.n;
import org.jsoup.nodes.o;
import org.jsoup.select.u;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class c implements com.google.android.gms.tasks.d, com.google.android.gms.common.api.internal.h, x2, z0, com.google.firebase.crashlytics.internal.analytics.b, com.google.firebase.crashlytics.internal.analytics.a, g0, u {
    public static c B;
    public Object A;
    public final /* synthetic */ int e;
    public Object y;
    public Object z;

    public c(int i) {
        this.e = i;
        switch (i) {
            case 7:
                this.y = new AtomicBoolean(false);
                new ConcurrentHashMap();
                this.z = new ConcurrentHashMap();
                new ConcurrentHashMap();
                this.A = new ConcurrentHashMap();
                break;
            case 20:
                String string = UUID.randomUUID().toString();
                string.getClass();
                okio.i iVar = okio.i.A;
                this.y = e0.h(string);
                this.z = w.f;
                this.A = new ArrayList();
                break;
            default:
                this.y = new com.google.android.gms.internal.measurement.b("", 0L, null);
                this.z = new com.google.android.gms.internal.measurement.b("", 0L, null);
                this.A = new ArrayList();
                break;
        }
    }

    public static String n(String str, HashMap map) {
        StringBuilder sb = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb.append((String) entry.getKey());
        sb.append("=");
        sb.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb.append("&");
            sb.append((String) entry2.getKey());
            sb.append("=");
            sb.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), "UTF-8") : "");
        }
        String string = sb.toString();
        if (string.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.i(str, "?", string);
        }
        if (!str.endsWith("&")) {
            string = "&".concat(string);
        }
        return str.concat(string);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032 A[Catch: all -> 0x0023, TryCatch #1 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:57:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0058 A[Catch: all -> 0x0023, TryCatch #1 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:57:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0063 A[Catch: all -> 0x0023, TryCatch #1 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:57:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0067 A[Catch: all -> 0x0023, TryCatch #1 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:57:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x006b A[Catch: all -> 0x0023, PHI: r10
  0x006b: PHI (r10v13 int) = (r10v7 int), (r10v0 int) binds: [B:14:0x0030, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:57:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x008e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0134  */
    /* JADX WARN: Code duplicated, block: B:45:0x0137  */
    /* JADX WARN: Code duplicated, block: B:55:0x017a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.measurement.internal.x2, com.google.android.gms.measurement.internal.z0
    public void a(String str, int i, Throwable th, byte[] bArr, Map map) {
        int i2;
        a3 a3Var;
        AtomicReference atomicReference;
        b1 b1Var;
        com.google.android.gms.measurement.internal.m mVar;
        String strSubstring;
        Object obj;
        switch (this.e) {
            case 10:
                v2 v2Var = (v2) this.y;
                v2Var.v();
                d4 d4Var = (d4) this.A;
                if (i != 200 && i != 204) {
                    i2 = 304;
                    if (i != 304) {
                        i2 = i;
                    }
                    x0 x0Var = ((s1) v2Var.e).C;
                    s1.m(x0Var);
                    x0Var.F.d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(d4Var.e), Integer.valueOf(i2), th);
                    if (Arrays.asList(((String) h0.u.a(null)).split(",")).contains(String.valueOf(i2))) {
                        a3Var = a3.BACKOFF;
                    } else {
                        a3Var = a3.FAILURE;
                    }
                    atomicReference = (AtomicReference) this.z;
                    o3 o3VarP = ((s1) v2Var.e).p();
                    long j = d4Var.e;
                    com.google.android.gms.measurement.internal.d dVar = new com.google.android.gms.measurement.internal.d(j, d4Var.C, a3Var.e);
                    o3VarP.v();
                    o3VarP.w();
                    o3VarP.J(new androidx.core.provider.m(12, o3VarP, o3VarP.L(true), dVar));
                    x0 x0Var2 = ((s1) v2Var.e).C;
                    s1.m(x0Var2);
                    x0Var2.K.c(Long.valueOf(j), a3Var, "[sgtm] Updated status for row_id");
                    synchronized (atomicReference) {
                        atomicReference.set(a3Var);
                        atomicReference.notifyAll();
                        break;
                    }
                    return;
                }
                i2 = i;
                if (th == null) {
                    x0 x0Var3 = ((s1) v2Var.e).C;
                    s1.m(x0Var3);
                    x0Var3.K.b(Long.valueOf(d4Var.e), "[sgtm] Upload succeeded for row_id");
                    a3Var = a3.SUCCESS;
                } else {
                    x0 x0Var4 = ((s1) v2Var.e).C;
                    s1.m(x0Var4);
                    x0Var4.F.d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(d4Var.e), Integer.valueOf(i2), th);
                    if (Arrays.asList(((String) h0.u.a(null)).split(",")).contains(String.valueOf(i2))) {
                        a3Var = a3.BACKOFF;
                    } else {
                        a3Var = a3.FAILURE;
                    }
                }
                atomicReference = (AtomicReference) this.z;
                o3 o3VarP2 = ((s1) v2Var.e).p();
                long j2 = d4Var.e;
                com.google.android.gms.measurement.internal.d dVar2 = new com.google.android.gms.measurement.internal.d(j2, d4Var.C, a3Var.e);
                o3VarP2.v();
                o3VarP2.w();
                o3VarP2.J(new androidx.core.provider.m(12, o3VarP2, o3VarP2.L(true), dVar2));
                x0 x0Var5 = ((s1) v2Var.e).C;
                s1.m(x0Var5);
                x0Var5.K.c(Long.valueOf(j2), a3Var, "[sgtm] Updated status for row_id");
                synchronized (atomicReference) {
                    atomicReference.set(a3Var);
                    atomicReference.notifyAll();
                    return;
                }
            case 11:
                ((l4) this.A).z(true, i, th, bArr, (String) this.y, (ArrayList) this.z, map);
                return;
            default:
                long j3 = ((m4) this.z).a;
                l4 l4Var = (l4) this.A;
                String str2 = (String) this.y;
                l4Var.e().v();
                l4Var.m0();
                if (bArr == null) {
                    try {
                        bArr = new byte[0];
                    } finally {
                        l4Var.R = false;
                        l4Var.O();
                    }
                }
                if (i == 200) {
                    if (th == null) {
                        com.google.android.gms.measurement.internal.m mVar2 = l4Var.z;
                        l4.U(mVar2);
                        mVar2.C(Long.valueOf(j3));
                        l4Var.b().K.c(str2, Integer.valueOf(i), "Successfully uploaded batch from upload queue. appId, status");
                        b1Var = l4Var.y;
                        l4.U(b1Var);
                        if (b1Var.z()) {
                            mVar = l4Var.z;
                            l4.U(mVar);
                            if (mVar.B(str2)) {
                                l4Var.t(str2);
                            } else {
                                l4Var.N();
                            }
                        } else {
                            l4Var.N();
                        }
                    } else {
                        String str3 = new String(bArr, StandardCharsets.UTF_8);
                        strSubstring = str3.substring(0, Math.min(32, str3.length()));
                        v0 v0Var = l4Var.b().H;
                        Integer numValueOf = Integer.valueOf(i);
                        obj = th;
                        if (th == null) {
                            obj = strSubstring;
                        }
                        v0Var.d("Network upload failed. Will retry later. appId, status, error", str2, numValueOf, obj);
                        com.google.android.gms.measurement.internal.m mVar3 = l4Var.z;
                        l4.U(mVar3);
                        mVar3.H(Long.valueOf(j3));
                        l4Var.N();
                    }
                } else if (i == 204) {
                    i = 204;
                    if (th == null) {
                        com.google.android.gms.measurement.internal.m mVar4 = l4Var.z;
                        l4.U(mVar4);
                        mVar4.C(Long.valueOf(j3));
                        l4Var.b().K.c(str2, Integer.valueOf(i), "Successfully uploaded batch from upload queue. appId, status");
                        b1Var = l4Var.y;
                        l4.U(b1Var);
                        if (b1Var.z()) {
                            mVar = l4Var.z;
                            l4.U(mVar);
                            if (mVar.B(str2)) {
                                l4Var.t(str2);
                            } else {
                                l4Var.N();
                            }
                        } else {
                            l4Var.N();
                        }
                    } else {
                        String str4 = new String(bArr, StandardCharsets.UTF_8);
                        strSubstring = str4.substring(0, Math.min(32, str4.length()));
                        v0 v0Var2 = l4Var.b().H;
                        Integer numValueOf2 = Integer.valueOf(i);
                        obj = th;
                        if (th == null) {
                            obj = strSubstring;
                        }
                        v0Var2.d("Network upload failed. Will retry later. appId, status, error", str2, numValueOf2, obj);
                        com.google.android.gms.measurement.internal.m mVar5 = l4Var.z;
                        l4.U(mVar5);
                        mVar5.H(Long.valueOf(j3));
                        l4Var.N();
                    }
                } else {
                    String str5 = new String(bArr, StandardCharsets.UTF_8);
                    strSubstring = str5.substring(0, Math.min(32, str5.length()));
                    v0 v0Var3 = l4Var.b().H;
                    Integer numValueOf3 = Integer.valueOf(i);
                    obj = th;
                    if (th == null) {
                        obj = strSubstring;
                    }
                    v0Var3.d("Network upload failed. Will retry later. appId, status, error", str2, numValueOf3, obj);
                    com.google.android.gms.measurement.internal.m mVar6 = l4Var.z;
                    l4.U(mVar6);
                    mVar6.H(Long.valueOf(j3));
                    l4Var.N();
                }
                return;
        }
    }

    @Override // com.google.android.gms.common.api.internal.h
    public void accept(Object obj, Object obj2) {
        aa aaVar = (aa) ((ba) obj).t();
        x9 x9Var = new x9((z9) this.y, (androidx.emoji2.text.f) this.A);
        String str = (String) this.z;
        Parcel parcelH = aaVar.h();
        parcelH.writeString(str);
        o5.c(parcelH, x9Var);
        aaVar.G(parcelH, 28);
    }

    public void b(String str, String str2) {
        int i = okhttp3.e0.a;
        d0 d0VarC = okhttp3.b.c(str2, null);
        StringBuilder sb = new StringBuilder("form-data; name=\"");
        okhttp3.u uVar = w.f;
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\n') {
                sb.append("%0A");
            } else if (cCharAt == '\r') {
                sb.append("%0D");
            } else if (cCharAt != '\"') {
                sb.append(cCharAt);
            } else {
                sb.append("%22");
            }
        }
        sb.append('\"');
        String string = sb.toString();
        com.caverock.androidsvg.m mVar = new com.caverock.androidsvg.m(1);
        mVar.e("Content-Disposition", string);
        r rVarF = mVar.f();
        if (rVarF.b("Content-Type") != null) {
            net.luminis.tls.engine.impl.c.o("Unexpected header: Content-Type");
        } else if (rVarF.b("Content-Length") != null) {
            net.luminis.tls.engine.impl.c.o("Unexpected header: Content-Length");
        } else {
            ((ArrayList) this.A).add(new v(rVarF, d0VarC));
        }
    }

    @Override // okio.g0
    public okio.h0 c() {
        switch (this.e) {
            case 21:
                return (b0) this.z;
            default:
                return (okhttp3.internal.connection.f) this.z;
        }
    }

    @Override // okio.g0
    public void cancel() {
        switch (this.e) {
            case 21:
                ((g0) this.y).cancel();
                break;
            default:
                ((okhttp3.internal.http.e) ((androidx.compose.foundation.lazy.layout.b1) this.A).A).cancel();
                break;
        }
    }

    public /* bridge */ /* synthetic */ Object clone() {
        switch (this.e) {
            case 3:
                c cVar = new c(((com.google.android.gms.internal.measurement.b) this.y).clone());
                Iterator it = ((ArrayList) this.A).iterator();
                while (it.hasNext()) {
                    ((ArrayList) cVar.A).add(((com.google.android.gms.internal.measurement.b) it.next()).clone());
                }
                return cVar;
            default:
                return super.clone();
        }
    }

    @Override // okio.g0
    public f0 d() {
        switch (this.e) {
            case 21:
                return (z) this.A;
            default:
                return (okhttp3.internal.connection.e) this.y;
        }
    }

    public void e(org.jsoup.nodes.j jVar, int i) {
        jVar.B((org.jsoup.internal.b) this.z, (org.jsoup.nodes.f) this.A);
    }

    @Override // org.jsoup.select.u
    public void f(o oVar, int i) {
        if (oVar.getClass() == org.jsoup.nodes.v.class) {
            m((org.jsoup.nodes.v) oVar, 0, i);
        } else if (oVar instanceof org.jsoup.nodes.j) {
            e((org.jsoup.nodes.j) oVar, i);
        } else {
            h((n) oVar, i);
        }
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.b
    public void g(String str, Bundle bundle) {
        CountDownLatch countDownLatch = (CountDownLatch) this.A;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    public void h(n nVar, int i) {
        nVar.B((org.jsoup.internal.b) this.z, (org.jsoup.nodes.f) this.A);
    }

    @Override // org.jsoup.select.u
    public void i(o oVar, int i) {
        if (oVar instanceof org.jsoup.nodes.j) {
            k((org.jsoup.nodes.j) oVar, i);
        }
    }

    public void k(org.jsoup.nodes.j jVar, int i) {
        jVar.Z((org.jsoup.internal.b) this.z, (org.jsoup.nodes.f) this.A);
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.a
    public void l(Bundle bundle) {
        synchronized (this.z) {
            try {
                com.google.firebase.crashlytics.internal.b bVar = com.google.firebase.crashlytics.internal.b.a;
                bVar.c("Logging event _ae to Firebase Analytics with params " + bundle);
                this.A = new CountDownLatch(1);
                ((com.google.android.material.internal.b) this.y).l(bundle);
                bVar.c("Awaiting app exception callback from Analytics...");
                try {
                    if (((CountDownLatch) this.A).await(500, TimeUnit.MILLISECONDS)) {
                        bVar.c("App exception callback received from Analytics listener.");
                    } else {
                        bVar.d(null, "Timeout exceeded while awaiting app exception callback from Analytics listener.");
                    }
                } catch (InterruptedException unused) {
                    Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
                }
                this.A = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void m(org.jsoup.nodes.v vVar, int i, int i2) {
        org.jsoup.internal.b bVar = (org.jsoup.internal.b) this.z;
        String strJ = vVar.J();
        org.jsoup.nodes.f fVar = (org.jsoup.nodes.f) this.A;
        char[] cArr = org.jsoup.nodes.l.a;
        org.jsoup.nodes.l.c(strJ, bVar, fVar.e, fVar.y, i | 1);
    }

    public void o(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = (HashMap) this.y;
        com.google.firebase.encoders.proto.f fVar = new com.google.firebase.encoders.proto.f(byteArrayOutputStream, map, (HashMap) this.z, (com.google.firebase.encoders.d) this.A);
        com.google.firebase.encoders.d dVar = (com.google.firebase.encoders.d) map.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, fVar);
            return;
        }
        throw new com.google.firebase.encoders.b("No encoder for " + obj.getClass());
    }

    @Override // com.google.android.gms.tasks.d
    public void onComplete(com.google.android.gms.tasks.i iVar) {
        com.google.android.gms.cloudmessaging.b bVar = (com.google.android.gms.cloudmessaging.b) this.y;
        String str = (String) this.z;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.A;
        synchronized (bVar.a) {
            bVar.a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ba  */
    public androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l p() throws Throwable {
        Throwable th;
        HttpsURLConnection httpsURLConnection;
        com.google.firebase.crashlytics.internal.concurrency.d.b();
        InputStream inputStream = null;
        String string = null;
        inputStream = null;
        try {
            try {
                String strN = n((String) this.y, (HashMap) this.z);
                String strConcat = "GET Request URL: ".concat(strN);
                try {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", strConcat, null);
                    }
                    httpsURLConnection = (HttpsURLConnection) new URL(strN).openConnection();
                    try {
                        httpsURLConnection.setReadTimeout(10000);
                        httpsURLConnection.setConnectTimeout(10000);
                        httpsURLConnection.setRequestMethod("GET");
                        for (Map.Entry entry : ((HashMap) this.A).entrySet()) {
                            httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                        httpsURLConnection.connect();
                        int responseCode = httpsURLConnection.getResponseCode();
                        InputStream inputStream2 = httpsURLConnection.getInputStream();
                        if (inputStream2 != null) {
                            try {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, "UTF-8"));
                                char[] cArr = new char[8192];
                                StringBuilder sb = new StringBuilder();
                                while (true) {
                                    int i = bufferedReader.read(cArr);
                                    if (i == -1) {
                                        break;
                                    }
                                    sb.append(cArr, 0, i);
                                }
                                string = sb.toString();
                            } catch (Throwable th2) {
                                th = th2;
                                inputStream = inputStream2;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (httpsURLConnection != null) {
                                    httpsURLConnection.disconnect();
                                }
                                throw th;
                            }
                        }
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        httpsURLConnection.disconnect();
                        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l(responseCode, string);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th = th;
                    httpsURLConnection = null;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                httpsURLConnection = null;
                if (inputStream != null) {
                    inputStream.close();
                }
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public boolean q() {
        com.google.firebase.messaging.j jVar;
        IconCompat iconCompat;
        if (((com.google.android.material.internal.b) this.A).m("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.z;
        if (!((KeyguardManager) firebaseMessagingService.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == iMyPid) {
                        if (runningAppProcessInfo.importance != 100) {
                            break;
                        }
                        return false;
                    }
                }
            }
        }
        String strU = ((com.google.android.material.internal.b) this.A).u("gcm.n.image");
        if (TextUtils.isEmpty(strU)) {
            jVar = null;
        } else {
            try {
                jVar = new com.google.firebase.messaging.j(new URL(strU));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + strU);
                jVar = null;
            }
        }
        if (jVar != null) {
            ExecutorService executorService = (ExecutorService) this.y;
            com.google.android.gms.tasks.j jVar2 = new com.google.android.gms.tasks.j();
            jVar.y = executorService.submit(new c0(14, jVar, jVar2));
            jVar.z = jVar2.a;
        }
        com.google.firebase.messaging.g gVarA = com.google.firebase.messaging.d.a((FirebaseMessagingService) this.z, (com.google.android.material.internal.b) this.A);
        androidx.core.app.h hVar = (androidx.core.app.h) gVarA.a;
        if (jVar != null) {
            try {
                q qVar = jVar.z;
                x.g(qVar);
                Bitmap bitmap = (Bitmap) kotlin.math.a.g(qVar, 5L, TimeUnit.SECONDS);
                hVar.d(bitmap);
                androidx.core.app.f fVar = new androidx.core.app.f();
                if (bitmap == null) {
                    iconCompat = null;
                } else {
                    iconCompat = new IconCompat(1);
                    iconCompat.b = bitmap;
                }
                fVar.y = iconCompat;
                fVar.z = null;
                fVar.A = true;
                hVar.e(fVar);
            } catch (InterruptedException unused2) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                jVar.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e) {
                Log.w("FirebaseMessaging", "Failed to download image: " + e.getCause());
            } catch (TimeoutException unused3) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                jVar.close();
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) ((FirebaseMessagingService) this.z).getSystemService("notification")).notify((String) gVarA.b, 0, ((androidx.core.app.h) gVarA.a).a());
        return true;
    }

    public void r(String str, String str2) {
        ((HashMap) this.A).put(str, str2);
    }

    public void s(int i) {
        String strValueOf;
        org.jsoup.internal.b bVarA = ((org.jsoup.internal.b) this.z).a('\n');
        org.jsoup.nodes.f fVar = (org.jsoup.nodes.f) this.A;
        int iMin = i * fVar.A;
        int i2 = fVar.B;
        String[] strArr = org.jsoup.internal.k.a;
        org.jsoup.helper.n.B("width must be >= 0", iMin >= 0);
        org.jsoup.helper.n.C(i2 >= -1);
        if (i2 != -1) {
            iMin = Math.min(iMin, i2);
        }
        String[] strArr2 = org.jsoup.internal.k.a;
        if (iMin < 21) {
            strValueOf = strArr2[iMin];
        } else {
            char[] cArr = new char[iMin];
            for (int i3 = 0; i3 < iMin; i3++) {
                cArr[i3] = ' ';
            }
            strValueOf = String.valueOf(cArr);
        }
        bVarA.b(strValueOf);
    }

    public void t(com.google.android.datatransport.runtime.i iVar, int i, boolean z) {
        a aVar = (a) this.A;
        Context context = (Context) this.y;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = iVar.a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        com.google.android.datatransport.d dVar = iVar.c;
        adler32.update(byteBufferAllocate.putInt(com.google.android.datatransport.runtime.util.a.a(dVar)).array());
        byte[] bArr = iVar.b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                int i2 = jobInfo.getExtras().getInt("attemptNumber");
                if (jobInfo.getId() == value) {
                    if (i2 < i) {
                        break;
                    }
                    org.jsoup.helper.n.k("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", iVar);
                    return;
                }
            }
        }
        Cursor cursorRawQuery = ((com.google.android.datatransport.runtime.scheduling.persistence.g) this.z).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(com.google.android.datatransport.runtime.util.a.a(dVar))});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(aVar.a(dVar, jLongValue, i));
            Set set = ((b) aVar.b.get(dVar)).c;
            if (set.contains(d.e)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(d.z)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(d.y)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", com.google.android.datatransport.runtime.util.a.a(dVar));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {iVar, Integer.valueOf(value), Long.valueOf(aVar.a(dVar, jLongValue, i)), lValueOf, Integer.valueOf(i)};
            String strY = org.jsoup.helper.n.y("JobInfoScheduler");
            if (Log.isLoggable(strY, 3)) {
                Log.d(strY, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    public String toString() {
        switch (this.e) {
            case 13:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.y);
                sb.append('{');
                coil3.memory.c cVar = (coil3.memory.c) ((coil3.memory.c) this.z).z;
                String str = "";
                while (cVar != null) {
                    Object obj = cVar.y;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    cVar = (coil3.memory.c) cVar.z;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(okhttp3.u uVar) {
        uVar.getClass();
        if (uVar.b.equals("multipart")) {
            this.z = uVar;
        } else {
            net.luminis.tls.engine.impl.c.n(uVar, "multipart != ");
        }
    }

    public File v() {
        String str = (String) ((t) this.z).get();
        String str2 = (String) ((t) this.A).get();
        return new File(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.l(new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length() + 3), str, "/", str2, ".pb"));
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:57:0x0050 A[EDGE_INSN: B:57:0x0050->B:55:0x0050 BREAK  A[LOOP:1: B:25:0x0072->B:60:?], SYNTHETIC] */
    public void w(t0 t0Var, Set set, String str) {
        gc[] gcVarArr;
        if (!set.isEmpty() && !((AtomicBoolean) this.y).getAndSet(true)) {
            if (s5.z == null) {
                synchronized (s5.class) {
                    try {
                        if (s5.z == null) {
                            s5.z = new s5(0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            ((CopyOnWriteArrayList) s5.z.y).add(0, new f1(15));
        }
        final byte[] bArrL = t0Var.l();
        ((ConcurrentHashMap) this.z).compute(str, new BiFunction() { // from class: com.google.android.gms.internal.measurement.fc
            @Override // java.util.function.BiFunction
            public final /* synthetic */ Object apply(Object obj, Object obj2) {
                byte[] bArr = (byte[]) obj2;
                byte[] bArr2 = bArrL;
                return Arrays.equals(bArr, bArr2) ? bArr : bArr2;
            }
        });
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AtomicReference atomicReference = (AtomicReference) ((ConcurrentHashMap) this.A).putIfAbsent((String) it.next(), new AtomicReference(new gc(str, bArrL)));
            if (atomicReference != null) {
                while (true) {
                    Object obj = atomicReference.get();
                    if (obj instanceof gc) {
                        gc gcVar = (gc) obj;
                        if (str.equals(gcVar.e)) {
                            gcVar.a(bArrL);
                            break;
                        }
                        gc gcVar2 = new gc(str, bArrL);
                        gcVarArr = str.compareTo(gcVar.e) < 0 ? new gc[]{gcVar2, gcVar} : new gc[]{gcVar, gcVar2};
                        do {
                            if (atomicReference.compareAndSet(obj, gcVarArr)) {
                                break;
                            }
                        } while (atomicReference.get() == obj);
                    } else {
                        gc[] gcVarArr2 = (gc[]) obj;
                        int iBinarySearch = Arrays.binarySearch(gcVarArr2, str);
                        if (iBinarySearch >= 0) {
                            gcVarArr2[iBinarySearch].a(bArrL);
                            break;
                        }
                        int i = ~iBinarySearch;
                        int length = gcVarArr2.length;
                        int i2 = length + 1;
                        int i3 = length - i;
                        if (i3 == 0) {
                            gcVarArr = (gc[]) Arrays.copyOf(gcVarArr2, i2);
                        } else {
                            gc[] gcVarArr3 = new gc[i2];
                            System.arraycopy(gcVarArr2, 0, gcVarArr3, 0, i);
                            System.arraycopy(gcVarArr2, i, gcVarArr3, i + 1, i3);
                            gcVarArr = gcVarArr3;
                        }
                        gcVarArr[i] = new gc(str, bArrL);
                        do {
                            if (atomicReference.compareAndSet(obj, gcVarArr)) {
                                break;
                                break;
                            }
                        } while (atomicReference.get() == obj);
                    }
                }
            }
        }
    }

    public synchronized void x(int i, int i2, long j, long j2) {
        ((s1) this.y).H.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = (AtomicLong) this.A;
        if (atomicLong.get() != -1 && jElapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        q qVarC = ((com.google.android.gms.common.internal.service.c) this.z).c(new com.google.android.gms.common.internal.m(0, Arrays.asList(new com.google.android.gms.common.internal.j(36301, i, 0, j, j2, null, null, 0, i2))));
        y2 y2Var = new y2(this, jElapsedRealtime, 6);
        qVarC.getClass();
        qVarC.b(com.google.android.gms.tasks.k.a, y2Var);
    }

    public /* synthetic */ c(int i, boolean z) {
        this.e = i;
    }

    public /* synthetic */ c(l4 l4Var, String str, Object obj, int i) {
        this.e = i;
        this.y = str;
        this.z = obj;
        this.A = l4Var;
    }

    public /* synthetic */ c(int i, Object obj, Object obj2, Object obj3) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
    }

    public c(Context context, s1 s1Var) {
        this.e = 9;
        this.A = new AtomicLong(-1L);
        this.z = new com.google.android.gms.common.internal.service.c(context, com.google.android.gms.common.internal.service.c.j, new com.google.android.gms.common.internal.n("measurement:api"), com.google.android.gms.common.api.e.c);
        this.y = s1Var;
    }

    public c(t0 t0Var, String str) {
        this.e = 6;
        this.y = com.google.common.io.d.d;
        this.z = com.google.android.material.resources.c.n(new j5(4, this, t0Var));
        this.A = com.google.android.material.resources.c.n(new j5(3, this, str));
    }

    public c(com.google.android.gms.internal.measurement.b bVar) {
        this.e = 3;
        this.y = bVar;
        this.z = bVar.clone();
        this.A = new ArrayList();
    }

    public c(g0 g0Var) {
        this.e = 21;
        this.y = g0Var;
        okio.h0 h0VarC = g0Var.c();
        h0VarC.getClass();
        this.z = new b0(h0VarC);
        this.A = okio.b.b(g0Var.d());
    }

    public c(String str, HashMap map) {
        this.e = 16;
        this.y = str;
        this.z = map;
        this.A = new HashMap();
    }

    public c(com.google.android.material.internal.b bVar) {
        this.e = 15;
        this.z = new Object();
        this.y = bVar;
    }

    public c(FirebaseMessagingService firebaseMessagingService, com.google.android.material.internal.b bVar, ExecutorService executorService) {
        this.e = 18;
        this.y = executorService;
        this.z = firebaseMessagingService;
        this.A = bVar;
    }

    public c(String str, String str2) {
        this.e = 25;
        this.y = str;
        this.z = str2;
        this.A = null;
    }

    public c(String str) {
        this.e = 13;
        coil3.memory.c cVar = new coil3.memory.c(28, false);
        this.z = cVar;
        this.A = cVar;
        this.y = str;
    }

    public c(androidx.compose.foundation.lazy.layout.b1 b1Var) {
        this.e = 22;
        this.A = b1Var;
        okhttp3.internal.http.e eVar = (okhttp3.internal.http.e) b1Var.A;
        this.y = new okhttp3.internal.connection.e(b1Var, eVar.g().d(), -1L, true);
        this.z = new okhttp3.internal.connection.f(b1Var, eVar.g().c(), -1L, true);
    }
}
