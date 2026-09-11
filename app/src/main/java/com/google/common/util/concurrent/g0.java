package com.google.common.util.concurrent;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import j$.net.URLDecoder;
import j$.net.URLEncoder;
import j$.time.LocalDateTime;
import j$.time.temporal.ChronoUnit;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.lang.ref.SoftReference;
import java.lang.reflect.Type;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements com.google.android.gms.tasks.h, com.google.firebase.crashlytics.internal.stacktrace.a, okhttp3.h, retrofit2.f, retrofit2.g {
    public final /* synthetic */ int e;
    public Object y;
    public Object z;

    public g0(int i) {
        this.e = i;
        switch (i) {
            case 6:
                this.y = new AtomicInteger();
                this.z = new AtomicInteger();
                break;
            case 13:
                this.y = new okhttp3.y();
                this.z = "https://api.themoviedb.org/3";
                break;
            case 16:
                this.y = new ArrayList();
                this.z = new ArrayList();
                break;
            default:
                this.y = new AtomicReference(q0.y);
                this.z = new com.google.android.datatransport.runtime.scheduling.jobscheduling.c(14, false);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static g0 i(Context context) {
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new g0(9, channel, fileLockLock, false);
                } catch (IOException e) {
                    e = e;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                } catch (Error e2) {
                    e = e2;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                } catch (OverlappingFileLockException e3) {
                    e = e3;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException e4) {
                e = e4;
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e5) {
            e = e5;
            channel = null;
            fileLockLock = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0056  */
    public static void l(String str, StringBuilder sb, boolean z) {
        int i = 0;
        while (i < str.length()) {
            int iCodePointAt = str.codePointAt(i);
            if (iCodePointAt == 32) {
                sb.append(z ? '+' : "%20");
            } else if (iCodePointAt == 37) {
                if (i < str.length() - 2) {
                    int i2 = i + 1;
                    if (u(str.charAt(i2))) {
                        int i3 = i + 2;
                        if (u(str.charAt(i3))) {
                            sb.append('%');
                            sb.append(str.charAt(i2));
                            sb.append(str.charAt(i3));
                            i = i3;
                        } else {
                            sb.append("%25");
                        }
                    } else {
                        sb.append("%25");
                    }
                } else {
                    sb.append("%25");
                }
            } else if (iCodePointAt > 127 || "<>\"{}|\\^[]`".indexOf(iCodePointAt) != -1) {
                sb.append(URLEncoder.encode(new String(Character.toChars(iCodePointAt)), org.jsoup.helper.b.b.name()));
                if (Character.charCount(iCodePointAt) == 2) {
                    i++;
                }
            } else {
                sb.append((char) iCodePointAt);
            }
            i++;
        }
    }

    public static boolean u(char c) {
        if (c >= '0' && c <= '9') {
            return true;
        }
        if (c < 'A' || c > 'F') {
            return c >= 'a' && c <= 'f';
        }
        return true;
    }

    public void A() {
        try {
            ((FileLock) this.z).release();
            ((FileChannel) this.y).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    public void B() {
        StringBuilder sb = (StringBuilder) this.z;
        if (sb != null) {
            String[] strArr = org.jsoup.internal.k.a;
            if (sb.length() <= 8192) {
                sb.delete(0, sb.length());
                org.jsoup.internal.k.e.z(sb);
            }
            this.z = null;
        }
        this.y = null;
    }

    public ListenableFuture C(y yVar, Executor executor) {
        executor.getClass();
        f0 f0Var = new f0(e0.e);
        f0Var.y = executor;
        f0Var.e = this;
        coil3.memory.c cVar = new coil3.memory.c(29, f0Var, yVar);
        y0 y0Var = new y0();
        ListenableFuture listenableFuture = (ListenableFuture) ((AtomicReference) this.y).getAndSet(y0Var);
        a1 a1Var = new a1();
        a1Var.F = new z0(a1Var, cVar);
        listenableFuture.a(a1Var, f0Var);
        ListenableFuture listenableFutureE = n0.e(a1Var);
        androidx.compose.foundation.text.j jVar = new androidx.compose.foundation.text.j(a1Var, y0Var, listenableFuture, listenableFutureE, f0Var, 1);
        d0 d0Var = d0.e;
        listenableFutureE.a(jVar, d0Var);
        a1Var.a(jVar, d0Var);
        return listenableFutureE;
    }

    public boolean D(String str, String str2) {
        String str3 = ((org.schabi.newpipe.extractor.timeago.b) this.y).a;
        if (str.equals(str2)) {
            return true;
        }
        if (str3.isEmpty()) {
            return str.toLowerCase().contains(str2.toLowerCase());
        }
        String strQuote = Pattern.quote(str2.toLowerCase());
        String strQuote2 = str3.equals(" ") ? "[ \\t\\xA0\\u1680\\u180e\\u2000-\\u200a\\u202f\\u205f\\u3000\\d]" : Pattern.quote(str3);
        return Pattern.compile(androidx.privacysandbox.ads.adservices.java.internal.a.u(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.o("(^|", strQuote2, ")", strQuote, "($|"), strQuote2, ")")).matcher(str.toLowerCase()).find();
    }

    public String E() {
        StringBuilder sb = (StringBuilder) this.z;
        if (sb == null) {
            String str = (String) this.y;
            return str != null ? str : "";
        }
        this.y = sb.toString();
        org.jsoup.internal.k.l((StringBuilder) this.z);
        this.z = null;
        return (String) this.y;
    }

    public void F(Object obj, String str) {
        try {
            ((com.grack.nanojson.c) ((Stack) this.y).peek()).put(str, obj);
        } catch (ClassCastException unused) {
            throw new androidx.compose.ui.res.e("Attempted to write a keyed value to a JsonArray", 9);
        }
    }

    public void G(String str, boolean z) {
        F(Boolean.valueOf(z), str);
    }

    @Override // retrofit2.f
    public Type a() {
        return (Type) this.y;
    }

    @Override // retrofit2.g
    public void b(retrofit2.d dVar, Throwable th) {
        ((retrofit2.n) this.z).e.execute(new androidx.compose.foundation.text.contextmenu.internal.g(8, this, (retrofit2.g) this.y, th));
    }

    @Override // com.google.firebase.crashlytics.internal.stacktrace.a
    public StackTraceElement[] c(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        com.google.firebase.crashlytics.internal.stacktrace.a[] aVarArr = (com.google.firebase.crashlytics.internal.stacktrace.a[]) this.y;
        StackTraceElement[] stackTraceElementArrC = stackTraceElementArr;
        for (int i = 0; i < 1; i++) {
            com.google.firebase.crashlytics.internal.stacktrace.a aVar = aVarArr[i];
            if (stackTraceElementArrC.length <= 1024) {
                break;
            }
            stackTraceElementArrC = aVar.c(stackTraceElementArr);
        }
        return stackTraceElementArrC.length > 1024 ? ((com.google.android.gms.measurement.internal.e0) this.z).c(stackTraceElementArrC) : stackTraceElementArrC;
    }

    @Override // okhttp3.h
    public void d(okhttp3.internal.connection.m mVar, okhttp3.g0 g0Var) {
        okio.h0 h0VarC;
        okio.f0 f0VarD;
        int iIntValue;
        switch (this.e) {
            case 18:
                int i = 4;
                try {
                    okio.g0 g0VarA = ((okhttp3.internal.ws.e) this.y).a(g0Var);
                    okhttp3.r rVar = g0Var.C;
                    int size = rVar.size();
                    int i2 = 0;
                    int i3 = 0;
                    boolean z = false;
                    boolean z2 = false;
                    boolean z3 = false;
                    boolean z4 = false;
                    Integer numQ = null;
                    Integer numQ2 = null;
                    while (i3 < size) {
                        if (rVar.c(i3).equalsIgnoreCase("Sec-WebSocket-Extensions")) {
                            String strF = rVar.f(i3);
                            int i4 = i2;
                            while (i4 < strF.length()) {
                                int iG = okhttp3.internal.e.g(strF, ',', i4, i2, i);
                                int iE = okhttp3.internal.e.e(strF, ';', i4, iG);
                                String strQ = okhttp3.internal.e.q(i4, iE, strF);
                                int i5 = iE + 1;
                                if (strQ.equalsIgnoreCase("permessage-deflate")) {
                                    if (z) {
                                        z4 = true;
                                    }
                                    i4 = i5;
                                    while (i4 < iG) {
                                        int iE2 = okhttp3.internal.e.e(strF, ';', i4, iG);
                                        int iE3 = okhttp3.internal.e.e(strF, '=', i4, iE2);
                                        String strQ2 = okhttp3.internal.e.q(i4, iE3, strF);
                                        String strL0 = iE3 < iE2 ? kotlin.text.k.l0(okhttp3.internal.e.q(iE3 + 1, iE2, strF)) : null;
                                        i4 = iE2 + 1;
                                        if (strQ2.equalsIgnoreCase("client_max_window_bits")) {
                                            if (numQ != null) {
                                                z4 = true;
                                            }
                                            numQ = strL0 != null ? kotlin.text.r.Q(strL0) : null;
                                            if (numQ == null) {
                                                z4 = true;
                                            }
                                        } else if (strQ2.equalsIgnoreCase("client_no_context_takeover")) {
                                            if (z2) {
                                                z4 = true;
                                            }
                                            if (strL0 != null) {
                                                z4 = true;
                                            }
                                            z2 = true;
                                        } else {
                                            if (strQ2.equalsIgnoreCase("server_max_window_bits")) {
                                                if (numQ2 != null) {
                                                    z4 = true;
                                                }
                                                numQ2 = strL0 != null ? kotlin.text.r.Q(strL0) : null;
                                                if (numQ2 == null) {
                                                }
                                            } else if (strQ2.equalsIgnoreCase("server_no_context_takeover")) {
                                                if (z3) {
                                                    z4 = true;
                                                }
                                                if (strL0 != null) {
                                                    z4 = true;
                                                }
                                                z3 = true;
                                            }
                                            z4 = true;
                                        }
                                    }
                                    z = true;
                                } else {
                                    i4 = i5;
                                    z4 = true;
                                }
                                i = 4;
                                i2 = 0;
                            }
                        }
                        i3++;
                        i = 4;
                        i2 = 0;
                    }
                    ((okhttp3.internal.ws.e) this.y).d = new okhttp3.internal.ws.f(z, numQ, z2, numQ2, z3, z4);
                    if (z4 || numQ != null || (numQ2 != null && (8 > (iIntValue = numQ2.intValue()) || iIntValue >= 16))) {
                        okhttp3.internal.ws.e eVar = (okhttp3.internal.ws.e) this.y;
                        synchronized (eVar) {
                            eVar.p.clear();
                            eVar.b(1010, "unexpected Sec-WebSocket-Extensions in response header");
                        }
                    }
                    String str = okhttp3.internal.g.b + " WebSocket " + ((okhttp3.b0) this.z).a.h();
                    okhttp3.internal.ws.e eVar2 = (okhttp3.internal.ws.e) this.y;
                    com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar = new com.google.android.datatransport.runtime.scheduling.jobscheduling.c(g0VarA);
                    okhttp3.internal.ws.f fVar = eVar2.d;
                    fVar.getClass();
                    synchronized (eVar2) {
                        try {
                            eVar2.m = str;
                            eVar2.n = cVar;
                            eVar2.k = new okhttp3.internal.ws.h((okio.z) cVar.A, eVar2.b, fVar.a, fVar.c, eVar2.e);
                            eVar2.i = new okhttp3.internal.cache.f(eVar2);
                            long j = eVar2.c;
                            if (j != 0) {
                                long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                                okhttp3.internal.concurrent.c cVar2 = eVar2.l;
                                String strConcat = str.concat(" ping");
                                androidx.compose.ui.text.platform.e eVar3 = new androidx.compose.ui.text.platform.e(eVar2, nanos, 2);
                                cVar2.getClass();
                                cVar2.d(new okhttp3.internal.concurrent.b(strConcat, eVar3), nanos);
                            }
                            if (!eVar2.p.isEmpty()) {
                                eVar2.e();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    eVar2.j = new okhttp3.internal.ws.g((okio.b0) cVar.z, eVar2, fVar.a, fVar.e);
                    okhttp3.internal.ws.e eVar4 = (okhttp3.internal.ws.e) this.y;
                    try {
                        eVar4.a.b(eVar4);
                        while (eVar4.s == -1) {
                            okhttp3.internal.ws.g gVar = eVar4.j;
                            gVar.getClass();
                            gVar.a();
                        }
                    } catch (Exception e) {
                        okhttp3.internal.ws.e.c(eVar4, e, 6);
                    } finally {
                        eVar4.d();
                    }
                    return;
                } catch (IOException e2) {
                    okhttp3.internal.ws.e.c((okhttp3.internal.ws.e) this.y, e2, 4);
                    okhttp3.internal.e.b(g0Var);
                    okio.g0 g0Var2 = g0Var.E;
                    if (g0Var2 != null && (f0VarD = g0Var2.d()) != null) {
                        okhttp3.internal.e.b(f0VarD);
                    }
                    okio.g0 g0Var3 = g0Var.E;
                    if (g0Var3 == null || (h0VarC = g0Var3.c()) == null) {
                        return;
                    }
                    okhttp3.internal.e.b(h0VarC);
                    return;
                }
            default:
                retrofit2.g gVar2 = (retrofit2.g) this.y;
                retrofit2.z zVar = (retrofit2.z) this.z;
                try {
                    try {
                        gVar2.g(zVar, zVar.c(g0Var));
                        return;
                    } catch (Throwable th2) {
                        retrofit2.z0.q(th2);
                        th2.printStackTrace();
                        return;
                    }
                } catch (Throwable th3) {
                    retrofit2.z0.q(th3);
                    try {
                        gVar2.b(zVar, th3);
                        return;
                    } catch (Throwable th4) {
                        retrofit2.z0.q(th4);
                        th4.printStackTrace();
                        return;
                    }
                }
        }
    }

    @Override // com.google.android.gms.tasks.h
    public com.google.android.gms.tasks.q e(Object obj) throws Throwable {
        FileWriter fileWriter;
        switch (this.e) {
            case 4:
                Boolean bool = (Boolean) obj;
                com.google.firebase.crashlytics.internal.common.m mVar = (com.google.firebase.crashlytics.internal.common.m) this.z;
                if (bool.booleanValue()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
                    }
                    boolean zBooleanValue = bool.booleanValue();
                    com.google.android.gms.common.api.internal.m mVar2 = mVar.b;
                    if (zBooleanValue) {
                        ((com.google.android.gms.tasks.j) mVar2.C).d(null);
                        return ((com.google.android.gms.tasks.i) this.y).i(mVar.e.a, new com.google.android.material.shape.c0(this));
                    }
                    mVar2.getClass();
                    net.luminis.tls.engine.impl.c.r("An invalid data collection token was used.");
                    return null;
                }
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
                }
                Iterator it = com.google.firebase.crashlytics.internal.persistence.c.k(((File) mVar.g.c).listFiles(com.google.firebase.crashlytics.internal.common.m.r)).iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
                com.google.firebase.crashlytics.internal.persistence.c cVar = ((com.google.firebase.crashlytics.internal.persistence.a) mVar.m.b).b;
                com.google.firebase.crashlytics.internal.persistence.a.a(com.google.firebase.crashlytics.internal.persistence.c.k(((File) cVar.e).listFiles()));
                com.google.firebase.crashlytics.internal.persistence.a.a(com.google.firebase.crashlytics.internal.persistence.c.k(((File) cVar.f).listFiles()));
                com.google.firebase.crashlytics.internal.persistence.a.a(com.google.firebase.crashlytics.internal.persistence.c.k(((File) cVar.g).listFiles()));
                mVar.q.d(null);
                return kotlin.math.a.t(null);
            default:
                com.appsalt.internal.j0 j0Var = (com.appsalt.internal.j0) this.z;
                JSONObject jSONObject = (JSONObject) ((com.google.firebase.crashlytics.internal.concurrency.d) this.y).c.e.submit(new coil3.decode.y(this, 2)).get();
                FileWriter fileWriter2 = null;
                if (jSONObject != null) {
                    com.google.firebase.crashlytics.internal.settings.a aVarI = ((com.google.android.material.shape.c0) j0Var.c).i(jSONObject);
                    com.google.android.material.shape.c0 c0Var = (com.google.android.material.shape.c0) j0Var.e;
                    long j = aVarI.c;
                    c0Var.getClass();
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
                    }
                    try {
                        jSONObject.put("expires_at", j);
                        fileWriter = new FileWriter((File) c0Var.e);
                        try {
                            try {
                                fileWriter.write(jSONObject.toString());
                                fileWriter.flush();
                            } catch (Exception e) {
                                e = e;
                                Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                            }
                            com.google.firebase.crashlytics.internal.common.g.b(fileWriter, "Failed to close settings writer.");
                            com.appsalt.internal.j0.d(jSONObject, "Loaded settings: ");
                            String str = ((com.google.firebase.crashlytics.internal.settings.c) j0Var.b).f;
                            SharedPreferences.Editor editorEdit = ((Context) j0Var.a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                            editorEdit.putString("existing_instance_identifier", str);
                            editorEdit.apply();
                            ((AtomicReference) j0Var.h).set(aVarI);
                            ((com.google.android.gms.tasks.j) ((AtomicReference) j0Var.i).get()).d(aVarI);
                        } catch (Throwable th) {
                            th = th;
                            fileWriter2 = fileWriter;
                            com.google.firebase.crashlytics.internal.common.g.b(fileWriter2, "Failed to close settings writer.");
                            throw th;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        fileWriter = null;
                    } catch (Throwable th2) {
                        th = th2;
                        com.google.firebase.crashlytics.internal.common.g.b(fileWriter2, "Failed to close settings writer.");
                        throw th;
                    }
                    break;
                }
                return kotlin.math.a.t(null);
        }
    }

    @Override // okhttp3.h
    public void f(okhttp3.internal.connection.m mVar, IOException iOException) {
        switch (this.e) {
            case 18:
                okhttp3.internal.ws.e.c((okhttp3.internal.ws.e) this.y, iOException, 6);
                break;
            default:
                try {
                    ((retrofit2.g) this.y).b((retrofit2.z) this.z, iOException);
                } catch (Throwable th) {
                    retrofit2.z0.q(th);
                    th.printStackTrace();
                    return;
                }
                break;
        }
    }

    @Override // retrofit2.g
    public void g(retrofit2.d dVar, retrofit2.r0 r0Var) {
        ((retrofit2.n) this.z).e.execute(new androidx.compose.foundation.text.contextmenu.internal.g(7, this, (retrofit2.g) this.y, r0Var));
    }

    @Override // retrofit2.f
    public Object h(retrofit2.z zVar) {
        Executor executor = (Executor) this.z;
        return executor == null ? zVar : new retrofit2.n(executor, zVar);
    }

    public void j(char c) {
        StringBuilder sb = (StringBuilder) this.z;
        if (sb != null) {
            sb.append(c);
            return;
        }
        if (((String) this.y) == null) {
            this.y = String.valueOf(c);
            return;
        }
        StringBuilder sbB = org.jsoup.internal.k.b();
        this.z = sbB;
        sbB.append((String) this.y);
        this.y = null;
        ((StringBuilder) this.z).append(c);
    }

    public void k(String str) {
        StringBuilder sb = (StringBuilder) this.z;
        if (sb != null) {
            sb.append(str);
            return;
        }
        if (((String) this.y) == null) {
            this.y = str;
            return;
        }
        StringBuilder sbB = org.jsoup.internal.k.b();
        this.z = sbB;
        sbB.append((String) this.y);
        this.y = null;
        ((StringBuilder) this.z).append(str);
    }

    public Object m() {
        org.jsoup.internal.f fVar = (org.jsoup.internal.f) this.y;
        ArrayDeque arrayDeque = (ArrayDeque) ((SoftReference) fVar.get()).get();
        if (arrayDeque == null) {
            arrayDeque = new ArrayDeque();
            fVar.set(new SoftReference(arrayDeque));
        }
        return !arrayDeque.isEmpty() ? arrayDeque.pop() : ((Supplier) this.z).get();
    }

    public URL n() {
        String strDecode;
        try {
            String protocol = ((URL) this.y).getProtocol();
            String userInfo = ((URL) this.y).getUserInfo();
            try {
                strDecode = URLDecoder.decode(((URL) this.y).getHost(), org.jsoup.helper.b.b.name());
            } catch (UnsupportedEncodingException e) {
                net.luminis.tls.engine.impl.c.k(e);
                strDecode = null;
            }
            URI uri = new URI(protocol, userInfo, IDN.toASCII(strDecode), ((URL) this.y).getPort(), null, null, null);
            StringBuilder sbB = org.jsoup.internal.k.b();
            sbB.append(uri.toASCIIString());
            l(((URL) this.y).getPath(), sbB, false);
            if (((StringBuilder) this.z) != null) {
                sbB.append('?');
                l(org.jsoup.internal.k.l((StringBuilder) this.z), sbB, true);
            }
            if (((URL) this.y).getRef() != null) {
                sbB.append('#');
                l(((URL) this.y).getRef(), sbB, false);
            }
            URL url = new URL(org.jsoup.internal.k.l(sbB));
            this.y = url;
            return url;
        } catch (UnsupportedEncodingException | MalformedURLException | URISyntaxException unused) {
            return (URL) this.y;
        }
    }

    public void o() {
        String str = (String) this.y;
        try {
            com.google.firebase.crashlytics.internal.persistence.c cVar = (com.google.firebase.crashlytics.internal.persistence.c) this.z;
            cVar.getClass();
            new File((File) cVar.c, str).createNewFile();
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e);
        }
    }

    public void p() {
        Stack stack = (Stack) this.y;
        if (stack.size() == 1) {
            throw new androidx.compose.ui.res.e("Cannot end the root object or array", 9);
        }
        stack.pop();
    }

    public File q() {
        if (((File) this.y) == null) {
            synchronized (this) {
                try {
                    if (((File) this.y) == null) {
                        com.google.firebase.g gVar = (com.google.firebase.g) this.z;
                        gVar.a();
                        this.y = new File(gVar.a.getFilesDir(), "PersistedInstallation." + ((com.google.firebase.g) this.z).d() + ".json");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (File) this.y;
    }

    public org.schabi.newpipe.extractor.localization.b r(int i, ChronoUnit chronoUnit) {
        ChronoUnit chronoUnit2 = ChronoUnit.YEARS;
        LocalDateTime localDateTime = (LocalDateTime) this.z;
        LocalDateTime localDateTimeMinusDays = chronoUnit == chronoUnit2 ? localDateTime.minusYears(i).minusDays(1L) : localDateTime.a(i, chronoUnit);
        boolean zIsDateBased = chronoUnit.isDateBased();
        if (zIsDateBased) {
            localDateTimeMinusDays = localDateTimeMinusDays.truncatedTo(ChronoUnit.DAYS);
        }
        return new org.schabi.newpipe.extractor.localization.b(localDateTimeMinusDays, zIsDateBased);
    }

    public boolean s() {
        return (((StringBuilder) this.z) == null && ((String) this.y) == null) ? false : true;
    }

    public void t(com.google.firebase.installations.local.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.a);
            jSONObject.put("Status", androidx.constraintlayout.core.g.e(bVar.b));
            jSONObject.put("AuthToken", bVar.c);
            jSONObject.put("RefreshToken", bVar.d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f);
            jSONObject.put("ExpiresInSecs", bVar.e);
            jSONObject.put("FisError", bVar.g);
            com.google.firebase.g gVar = (com.google.firebase.g) this.z;
            gVar.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", gVar.a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(q())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public String toString() {
        switch (this.e) {
            case 15:
                return String.format("%s|%s", (net.luminis.quic.impl.n) this.y, (ArrayList) this.z);
            case 21:
                StringBuilder sb = (StringBuilder) this.z;
                if (sb != null) {
                    return sb.toString();
                }
                String str = (String) this.y;
                return str != null ? str : "";
            default:
                return super.toString();
        }
    }

    public void v(String str) {
        com.grack.nanojson.c cVar = new com.grack.nanojson.c();
        F(cVar, str);
        ((Stack) this.y).push(cVar);
    }

    public void w(int i, Bundle bundle) {
        Locale locale = Locale.US;
        String str = "Analytics listener received message. ID: " + i + ", Extras: " + bundle;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            com.google.firebase.crashlytics.internal.analytics.b bVar = "clx".equals(bundle2.getString("_o")) ? (com.google.android.datatransport.runtime.scheduling.jobscheduling.c) this.y : (com.google.android.material.shape.c0) this.z;
            if (bVar == null) {
                return;
            }
            bVar.g(string, bundle2);
        }
    }

    public org.schabi.newpipe.extractor.localization.b x(String str) {
        int i;
        org.schabi.newpipe.extractor.timeago.b bVar = (org.schabi.newpipe.extractor.timeago.b) this.y;
        for (Map.Entry entry : bVar.i.entrySet()) {
            ChronoUnit chronoUnit = (ChronoUnit) entry.getKey();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                String str2 = (String) entry2.getKey();
                int iIntValue = ((Integer) entry2.getValue()).intValue();
                if (D(str, str2)) {
                    return r(iIntValue, chronoUnit);
                }
            }
        }
        try {
            i = Integer.parseInt(str.replaceAll("\\D+", ""));
        } catch (NumberFormatException unused) {
            i = 1;
        }
        EnumMap enumMap = new EnumMap(ChronoUnit.class);
        enumMap.put(ChronoUnit.SECONDS, bVar.b);
        enumMap.put(ChronoUnit.MINUTES, bVar.c);
        enumMap.put(ChronoUnit.HOURS, bVar.d);
        enumMap.put(ChronoUnit.DAYS, bVar.e);
        enumMap.put(ChronoUnit.WEEKS, bVar.f);
        enumMap.put(ChronoUnit.MONTHS, bVar.g);
        enumMap.put(ChronoUnit.YEARS, bVar.h);
        return r(i, (ChronoUnit) enumMap.entrySet().stream().filter(new org.schabi.newpipe.extractor.localization.d(this, str, 0)).map(new androidx.media3.exoplayer.audio.f(17)).findFirst().orElseThrow(new org.jsoup.internal.g(str, 2)));
    }

    public com.google.firebase.installations.local.b y() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(q());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i2 = androidx.constraintlayout.core.g.f(5)[iOptInt];
        if (i2 == 0) {
            com.google.gson.b.h("Null registrationStatus");
            return null;
        }
        String str = i2 == 0 ? " registrationStatus" : "";
        if (str.isEmpty()) {
            return new com.google.firebase.installations.local.b(strOptString, i2, strOptString2, strOptString3, jOptLong2, jOptLong, strOptString4);
        }
        net.luminis.tls.engine.impl.c.r("Missing required properties:".concat(str));
        return null;
    }

    public void z(Object obj) {
        org.jsoup.internal.f fVar = (org.jsoup.internal.f) this.y;
        ArrayDeque arrayDeque = (ArrayDeque) ((SoftReference) fVar.get()).get();
        if (arrayDeque == null) {
            arrayDeque = new ArrayDeque();
            fVar.set(new SoftReference(arrayDeque));
        }
        if (arrayDeque.size() < 12) {
            arrayDeque.push(obj);
        }
    }

    public /* synthetic */ g0(int i, Object obj, Object obj2, boolean z) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
    }

    public /* synthetic */ g0(int i, boolean z) {
        this.e = i;
    }

    public g0(AppMeasurementSdk appMeasurementSdk, g0 g0Var) {
        this.e = 1;
        this.z = g0Var;
        appMeasurementSdk.a(new com.google.firebase.analytics.connector.internal.b(this, 0));
        this.y = new HashSet();
    }

    public g0(URL url) {
        this.e = 19;
        this.y = url;
        if (url.getQuery() != null) {
            StringBuilder sbB = org.jsoup.internal.k.b();
            sbB.append(((URL) this.y).getQuery());
            this.z = sbB;
        }
    }

    public g0(com.google.firebase.crashlytics.internal.stacktrace.a[] aVarArr) {
        this.e = 8;
        this.y = aVarArr;
        this.z = new com.google.android.gms.measurement.internal.e0(11);
    }

    public g0(Supplier supplier) {
        this.e = 20;
        this.z = supplier;
        this.y = new org.jsoup.internal.f(new org.jsoup.internal.c(1), 0);
    }

    public g0(Context context) {
        this.e = 3;
        this.y = context;
        this.z = null;
    }

    public g0(com.google.firebase.g gVar) {
        this.e = 10;
        this.z = gVar;
    }

    public /* synthetic */ g0(int i, Object obj, Object obj2) {
        this.e = i;
        this.z = obj;
        this.y = obj2;
    }
}
