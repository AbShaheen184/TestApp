package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import android.util.Log;
import androidx.appcompat.widget.q2;
import androidx.compose.animation.core.t2;
import androidx.compose.foundation.gestures.w0;
import androidx.compose.foundation.lazy.layout.b1;
import com.appsalt.internal.j0;
import com.google.common.util.concurrent.g0;
import com.google.firebase.crashlytics.internal.model.a0;
import com.google.firebase.crashlytics.internal.model.b0;
import com.google.firebase.crashlytics.internal.model.c0;
import com.google.firebase.crashlytics.internal.model.d0;
import com.google.firebase.crashlytics.internal.model.e0;
import com.google.firebase.crashlytics.internal.model.h1;
import com.google.firebase.crashlytics.internal.model.i0;
import com.google.firebase.crashlytics.internal.model.j1;
import com.google.firebase.crashlytics.internal.model.k0;
import com.google.firebase.crashlytics.internal.model.k1;
import com.google.firebase.crashlytics.internal.model.l1;
import com.google.firebase.crashlytics.internal.model.m0;
import com.google.firebase.crashlytics.internal.model.m1;
import com.google.firebase.crashlytics.internal.model.m2;
import com.google.firebase.crashlytics.internal.model.n1;
import com.google.firebase.crashlytics.internal.model.n2;
import com.google.firebase.crashlytics.internal.model.o0;
import com.google.firebase.crashlytics.internal.model.p0;
import com.google.firebase.crashlytics.internal.model.q0;
import com.google.firebase.crashlytics.internal.model.r0;
import com.google.firebase.crashlytics.internal.model.u0;
import com.google.firebase.crashlytics.internal.model.y0;
import com.google.firebase.crashlytics.internal.model.z0;
import io.hopmonsdk.Hopmn;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    public static final h r = new h(1);
    public static final Charset s = Charset.forName("UTF-8");
    public final Context a;
    public final com.google.android.gms.common.api.internal.m b;
    public final g0 c;
    public final q2 d;
    public final com.google.firebase.crashlytics.internal.concurrency.d e;
    public final v f;
    public final com.google.firebase.crashlytics.internal.persistence.c g;
    public final a h;
    public final com.google.firebase.crashlytics.internal.metadata.f i;
    public final com.google.firebase.crashlytics.internal.a j;
    public final com.google.firebase.crashlytics.internal.analytics.a k;
    public final j l;
    public final com.google.firebase.crashlytics.internal.persistence.c m;
    public s n;
    public final com.google.android.gms.tasks.j o = new com.google.android.gms.tasks.j();
    public final com.google.android.gms.tasks.j p = new com.google.android.gms.tasks.j();
    public final com.google.android.gms.tasks.j q = new com.google.android.gms.tasks.j();

    public m(Context context, v vVar, com.google.android.gms.common.api.internal.m mVar, com.google.firebase.crashlytics.internal.persistence.c cVar, g0 g0Var, a aVar, q2 q2Var, com.google.firebase.crashlytics.internal.metadata.f fVar, com.google.firebase.crashlytics.internal.persistence.c cVar2, com.google.firebase.crashlytics.internal.a aVar2, com.google.firebase.crashlytics.internal.analytics.a aVar3, j jVar, com.google.firebase.crashlytics.internal.concurrency.d dVar) {
        new AtomicBoolean(false);
        this.a = context;
        this.f = vVar;
        this.b = mVar;
        this.g = cVar;
        this.c = g0Var;
        this.h = aVar;
        this.d = q2Var;
        this.i = fVar;
        this.j = aVar2;
        this.k = aVar3;
        this.l = jVar;
        this.m = cVar2;
        this.e = dVar;
    }

    public static com.google.android.gms.tasks.q a(m mVar) {
        com.google.android.gms.tasks.q qVarL;
        mVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : com.google.firebase.crashlytics.internal.persistence.c.k(((File) mVar.g.c).listFiles(r))) {
            try {
                long j = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    qVarL = kotlin.math.a.t(null);
                } catch (ClassNotFoundException unused) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    qVarL = kotlin.math.a.l(new ScheduledThreadPoolExecutor(1), new l(mVar, j));
                }
                arrayList.add(qVarL);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return kotlin.math.a.M(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:203:0x05f1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.google.firebase.crashlytics.internal.common.j] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20, types: [int] */
    /* JADX WARN: Type inference failed for: r11v53 */
    /* JADX WARN: Type inference failed for: r32v0, types: [boolean] */
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
    public final void b(boolean z, j0 j0Var, boolean z2) throws Throwable {
        ArrayList arrayList;
        int i;
        int i2;
        ?? r10;
        boolean z3;
        String str;
        String strSubstring;
        boolean z4;
        String[] list;
        Throwable th;
        List listB;
        ApplicationExitInfo next;
        String strD;
        int i3;
        List listUnmodifiableList;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        com.google.firebase.crashlytics.internal.concurrency.d.a();
        ArrayList arrayList2 = new ArrayList(((com.google.firebase.crashlytics.internal.persistence.a) this.m.b).c());
        if (arrayList2.size() <= z) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No open sessions to be closed.", null);
                return;
            }
            return;
        }
        String str2 = (String) arrayList2.get(z == true ? 1 : 0);
        if (z2 && j0Var.b().b.b) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30) {
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons.size() != 0) {
                    com.google.firebase.crashlytics.internal.persistence.c cVar = this.g;
                    com.google.firebase.crashlytics.internal.metadata.f fVar = new com.google.firebase.crashlytics.internal.metadata.f(cVar);
                    fVar.y = com.google.firebase.crashlytics.internal.metadata.f.z;
                    if (str2 != null) {
                        fVar.y = new com.google.firebase.crashlytics.internal.metadata.m(cVar.f(str2, "userlog"));
                    }
                    com.google.firebase.crashlytics.internal.persistence.c cVar2 = this.g;
                    com.google.firebase.crashlytics.internal.concurrency.d dVar = this.e;
                    com.google.firebase.crashlytics.internal.metadata.h hVar = new com.google.firebase.crashlytics.internal.metadata.h(cVar2);
                    i = 4;
                    q2 q2Var = new q2(str2, cVar2, dVar);
                    i2 = 8;
                    ((com.google.firebase.crashlytics.internal.metadata.e) ((AtomicMarkableReference) ((b1) q2Var.d).y).getReference()).c(hVar.c(str2, false));
                    ((com.google.firebase.crashlytics.internal.metadata.e) ((AtomicMarkableReference) ((b1) q2Var.e).y).getReference()).c(hVar.c(str2, true));
                    ((AtomicMarkableReference) q2Var.g).set(hVar.d(str2), false);
                    w0 w0Var = (w0) q2Var.f;
                    File fileF = cVar2.f(str2, "rollouts-state");
                    if (!fileF.exists() || fileF.length() == 0) {
                        com.google.firebase.crashlytics.internal.metadata.h.g(fileF, "The file has a length of zero for session: " + str2);
                        listB = Collections.EMPTY_LIST;
                    } else {
                        try {
                            fileInputStream2 = new FileInputStream(fileF);
                            try {
                                try {
                                    listB = com.google.firebase.crashlytics.internal.metadata.h.b(g.i(fileInputStream2));
                                    String str3 = "Loaded rollouts state:\n" + listB + "\nfor session " + str2;
                                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                        Log.d("FirebaseCrashlytics", str3, null);
                                    }
                                    g.b(fileInputStream2, "Failed to close rollouts state file.");
                                } catch (Throwable th2) {
                                    th = th2;
                                    fileInputStream = fileInputStream2;
                                    g.b(fileInputStream, "Failed to close rollouts state file.");
                                    throw th;
                                }
                            } catch (Exception e) {
                                e = e;
                                Log.w("FirebaseCrashlytics", "Error deserializing rollouts state.", e);
                                com.google.firebase.crashlytics.internal.metadata.h.f(fileF);
                                g.b(fileInputStream2, "Failed to close rollouts state file.");
                                listB = Collections.EMPTY_LIST;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            fileInputStream2 = null;
                        } catch (Throwable th3) {
                            th = th3;
                            fileInputStream = null;
                            g.b(fileInputStream, "Failed to close rollouts state file.");
                            throw th;
                        }
                    }
                    synchronized (w0Var) {
                        w0Var.b.clear();
                        if (listB.size() > w0Var.a) {
                            Log.w("FirebaseCrashlytics", "Ignored 0 entries when adding rollout assignments. Maximum allowable: " + w0Var.a, null);
                            w0Var.b.addAll(listB.subList(0, w0Var.a));
                        } else {
                            w0Var.b.addAll(listB);
                        }
                    }
                    com.google.firebase.crashlytics.internal.persistence.c cVar3 = this.m;
                    com.google.firebase.crashlytics.internal.persistence.a aVar = (com.google.firebase.crashlytics.internal.persistence.a) cVar3.b;
                    long jLastModified = aVar.b.f(str2, "start-time").lastModified();
                    Iterator<ApplicationExitInfo> it = historicalProcessExitReasons.iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                            if (next.getTimestamp() < jLastModified) {
                            }
                        }
                        next = null;
                        break;
                    } while (next.getReason() != 6);
                    if (next == null) {
                        String strH = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("No relevant ApplicationExitInfo occurred during session: ", str2);
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", strH, null);
                        }
                        arrayList = arrayList2;
                    } else {
                        r rVar = (r) cVar3.a;
                        try {
                            InputStream traceInputStream = next.getTraceInputStream();
                            strD = traceInputStream != null ? com.google.firebase.crashlytics.internal.persistence.c.d(traceInputStream) : null;
                        } catch (IOException e3) {
                            Log.w("FirebaseCrashlytics", "Could not get input trace in application exit info: " + next.toString() + " Error: " + e3, null);
                        }
                        c0 c0Var = new c0();
                        c0Var.d = next.getImportance();
                        c0Var.j = (byte) (c0Var.j | 4);
                        String processName = next.getProcessName();
                        if (processName == null) {
                            com.google.gson.b.h("Null processName");
                            return;
                        }
                        c0Var.b = processName;
                        c0Var.c = next.getReason();
                        c0Var.j = (byte) (c0Var.j | 2);
                        c0Var.g = next.getTimestamp();
                        c0Var.j = (byte) (c0Var.j | 32);
                        c0Var.a = next.getPid();
                        c0Var.j = (byte) (c0Var.j | 1);
                        c0Var.e = next.getPss();
                        c0Var.j = (byte) (c0Var.j | 8);
                        c0Var.f = next.getRss();
                        c0Var.j = (byte) (c0Var.j | 16);
                        c0Var.h = strD;
                        d0 d0VarA = c0Var.a();
                        int i5 = rVar.a.getResources().getConfiguration().orientation;
                        o0 o0Var = new o0();
                        o0Var.b = "anr";
                        long j = d0VarA.g;
                        o0Var.a = j;
                        o0Var.g = (byte) (o0Var.g | 1);
                        a aVar2 = rVar.c;
                        if (!rVar.e.b().b.c || aVar2.c.size() <= 0) {
                            arrayList = arrayList2;
                            i3 = i5;
                            listUnmodifiableList = null;
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it2 = aVar2.c.iterator();
                            while (it2.hasNext()) {
                                d dVar2 = (d) it2.next();
                                int i6 = i5;
                                String str4 = dVar2.a;
                                if (str4 == null) {
                                    com.google.gson.b.h("Null libraryName");
                                    return;
                                }
                                Iterator it3 = it2;
                                String str5 = dVar2.b;
                                if (str5 == null) {
                                    com.google.gson.b.h("Null arch");
                                    return;
                                }
                                String str6 = dVar2.c;
                                if (str6 == null) {
                                    com.google.gson.b.h("Null buildId");
                                    return;
                                }
                                arrayList3.add(new e0(str5, str4, str6));
                                it2 = it3;
                                i5 = i6;
                                arrayList2 = arrayList2;
                            }
                            arrayList = arrayList2;
                            i3 = i5;
                            listUnmodifiableList = Collections.unmodifiableList(arrayList3);
                        }
                        c0 c0Var2 = new c0();
                        c0Var2.d = d0VarA.d;
                        byte b = (byte) (c0Var2.j | 4);
                        c0Var2.j = b;
                        String str7 = d0VarA.b;
                        if (str7 == null) {
                            com.google.gson.b.h("Null processName");
                            return;
                        }
                        c0Var2.b = str7;
                        c0Var2.c = d0VarA.c;
                        c0Var2.g = j;
                        c0Var2.a = d0VarA.a;
                        c0Var2.e = d0VarA.e;
                        c0Var2.f = d0VarA.f;
                        c0Var2.j = (byte) (((byte) (((byte) (((byte) (((byte) (b | 2)) | 32)) | 1)) | 8)) | 16);
                        c0Var2.h = d0VarA.h;
                        c0Var2.i = listUnmodifiableList;
                        d0 d0VarA2 = c0Var2.a();
                        int i7 = d0VarA2.d;
                        Boolean boolValueOf = Boolean.valueOf(i7 != 100);
                        String str8 = d0VarA2.b;
                        int i8 = d0VarA2.a;
                        str8.getClass();
                        y0 y0Var = new y0();
                        y0Var.a = str8;
                        y0Var.b = i8;
                        byte b2 = (byte) (y0Var.e | 1);
                        y0Var.c = i7;
                        y0Var.d = false;
                        y0Var.e = (byte) (((byte) (b2 | 2)) | 4);
                        z0 z0VarA = y0Var.a();
                        byte b3 = (byte) 1;
                        u0 u0VarE = r.e();
                        List listA = rVar.a();
                        if (listA == null) {
                            com.google.gson.b.h("Null binaries");
                            return;
                        }
                        r0 r0Var = new r0(null, null, d0VarA2, u0VarE, listA);
                        if (b3 != 1) {
                            StringBuilder sb = new StringBuilder();
                            if (b3 == 0) {
                                sb.append(" uiOrientation");
                            }
                            net.luminis.tls.engine.impl.c.r(com.google.android.datatransport.runtime.backends.c.s("Missing required properties:", sb));
                            return;
                        }
                        o0Var.c = new q0(r0Var, null, null, boolValueOf, z0VarA, null, i3);
                        o0Var.d = rVar.b(i3);
                        p0 p0VarA = o0Var.a();
                        String strH2 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Persisting anr for session ", str2);
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", strH2, null);
                        }
                        aVar.d(com.google.firebase.crashlytics.internal.persistence.c.b(com.google.firebase.crashlytics.internal.persistence.c.a(p0VarA, fVar, q2Var, Collections.EMPTY_MAP), q2Var), str2, true);
                    }
                } else {
                    arrayList = arrayList2;
                    i = 4;
                    i2 = 8;
                    String strH3 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("No ApplicationExitInfo available. Session: ", str2);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", strH3, null);
                    }
                }
            } else {
                arrayList = arrayList2;
                i = 4;
                i2 = 8;
                String strL = androidx.privacysandbox.ads.adservices.java.internal.a.l(i4, "ANR feature enabled, but device is API ");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", strL, null);
                }
            }
        } else {
            arrayList = arrayList2;
            i = 4;
            i2 = 8;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "ANR feature disabled.", null);
            }
        }
        if (z2 && this.j.c()) {
            String strH4 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Finalizing native report for session ", str2);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                th = null;
                Log.v("FirebaseCrashlytics", strH4, null);
            } else {
                th = null;
            }
            this.j.a().getClass();
            Log.w("FirebaseCrashlytics", "No minidump data found for session " + str2, th);
            Log.i("FirebaseCrashlytics", "No Tombstones data found for session " + str2, th);
            Log.w("FirebaseCrashlytics", "No native core present", th);
            r10 = th;
        } else {
            r10 = 0;
        }
        if (z != 0) {
            z3 = false;
            str = (String) arrayList.get(0);
        } else {
            z3 = false;
            this.l.a(r10);
            str = null;
        }
        com.google.firebase.crashlytics.internal.persistence.c cVar4 = this.m;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        com.google.firebase.crashlytics.internal.persistence.a aVar3 = (com.google.firebase.crashlytics.internal.persistence.a) cVar4.b;
        com.google.firebase.crashlytics.internal.persistence.c cVar5 = aVar3.b;
        cVar5.c(".com.google.firebase.crashlytics");
        cVar5.c(".com.google.firebase.crashlytics-ndk");
        if (!((String) cVar5.a).isEmpty()) {
            cVar5.c(".com.google.firebase.crashlytics.files.v1");
            final String str9 = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator;
            File file = (File) cVar5.b;
            if (file.exists() && (list = file.list(new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.persistence.b
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str10) {
                    return str10.startsWith(str9);
                }
            })) != null) {
                int length = list.length;
                for (?? r11 = z3; r11 < length; r11++) {
                    cVar5.c(list[r11]);
                }
            }
        }
        NavigableSet<String> navigableSetC = aVar3.c();
        if (str != null) {
            navigableSetC.remove(str);
        }
        int i9 = i2;
        if (navigableSetC.size() > i9) {
            while (navigableSetC.size() > i9) {
                String str10 = (String) navigableSetC.last();
                String strH5 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Removing session over cap: ", str10);
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", strH5, null);
                }
                com.google.firebase.crashlytics.internal.persistence.c.j(new File((File) cVar5.d, str10));
                navigableSetC.remove(str10);
            }
        }
        for (String str11 : navigableSetC) {
            String strH6 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Finalizing report for session ", str11);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strH6, null);
            }
            com.google.firebase.crashlytics.internal.model.serialization.a aVar4 = com.google.firebase.crashlytics.internal.persistence.a.g;
            h hVar2 = com.google.firebase.crashlytics.internal.persistence.a.i;
            File file2 = new File((File) cVar5.d, str11);
            file2.mkdirs();
            List<File> listK = com.google.firebase.crashlytics.internal.persistence.c.k(file2.listFiles(hVar2));
            if (listK.isEmpty()) {
                String strQ = androidx.privacysandbox.ads.adservices.java.internal.a.q("Session ", str11, " has no events.");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", strQ, null);
                }
            } else {
                Collections.sort(listK);
                ArrayList arrayList4 = new ArrayList();
                boolean z5 = z3;
                for (File file3 : listK) {
                    try {
                        String strE = com.google.firebase.crashlytics.internal.persistence.a.e(file3);
                        aVar4.getClass();
                        try {
                            JsonReader jsonReader = new JsonReader(new StringReader(strE));
                            try {
                                p0 p0VarE = com.google.firebase.crashlytics.internal.model.serialization.a.e(jsonReader);
                                jsonReader.close();
                                arrayList4.add(p0VarE);
                                if (z5) {
                                    z4 = true;
                                } else {
                                    String name = file3.getName();
                                    if (name.startsWith(Hopmn.EVENT) && name.endsWith("_")) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                }
                                z5 = z4;
                            } catch (Throwable th4) {
                                try {
                                    jsonReader.close();
                                } catch (Throwable th5) {
                                    th4.addSuppressed(th5);
                                }
                                throw th4;
                            }
                        } catch (IllegalStateException e4) {
                            throw new IOException(e4);
                        }
                    } catch (IOException e5) {
                        Log.w("FirebaseCrashlytics", "Could not add event to report for " + file3, e5);
                    }
                }
                if (arrayList4.isEmpty()) {
                    Log.w("FirebaseCrashlytics", "Could not parse event files for session " + str11, null);
                } else {
                    String strD2 = new com.google.firebase.crashlytics.internal.metadata.h(cVar5).d(str11);
                    i iVar = aVar3.d.b;
                    synchronized (iVar) {
                        if (Objects.equals(iVar.b, str11)) {
                            strSubstring = iVar.c;
                        } else {
                            com.google.firebase.crashlytics.internal.persistence.c cVar6 = iVar.a;
                            h hVar3 = i.d;
                            File file4 = new File((File) cVar6.d, str11);
                            file4.mkdirs();
                            List listK2 = com.google.firebase.crashlytics.internal.persistence.c.k(file4.listFiles(hVar3));
                            if (listK2.isEmpty()) {
                                Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
                                strSubstring = null;
                            } else {
                                strSubstring = ((File) Collections.min(listK2, i.e)).getName().substring(i);
                            }
                        }
                    }
                    File fileF2 = cVar5.f(str11, "report");
                    try {
                        String strE2 = com.google.firebase.crashlytics.internal.persistence.a.e(fileF2);
                        aVar4.getClass();
                        b0 b0VarI = com.google.firebase.crashlytics.internal.model.serialization.a.i(strE2);
                        a0 a0VarA = b0VarI.a();
                        m2 m2Var = b0VarI.k;
                        if (m2Var != null) {
                            try {
                                i0 i0VarA = m2Var.a();
                                i0VarA.e = Long.valueOf(jCurrentTimeMillis);
                                i0VarA.f = z5;
                                try {
                                    i0VarA.m = (byte) (i0VarA.m | 2);
                                    if (strD2 != null) {
                                        i0VarA.h = new j1(strD2);
                                    }
                                    a0VarA.j = i0VarA.a();
                                } catch (IOException e6) {
                                    e = e6;
                                    Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileF2, e);
                                    com.google.firebase.crashlytics.internal.persistence.c.j(new File((File) cVar5.d, str11));
                                    z3 = false;
                                    i = 4;
                                }
                            } catch (IOException e7) {
                                e = e7;
                            }
                        }
                        b0 b0VarA = a0VarA.a();
                        a0 a0VarA2 = b0VarA.a();
                        a0VarA2.g = strSubstring;
                        m2 m2Var2 = b0VarA.k;
                        if (m2Var2 != null) {
                            i0 i0VarA2 = m2Var2.a();
                            i0VarA2.c = strSubstring;
                            a0VarA2.j = i0VarA2.a();
                        }
                        b0 b0VarA2 = a0VarA2.a();
                        m2 m2Var3 = b0VarA2.k;
                        if (m2Var3 == null) {
                            throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                        }
                        a0 a0VarA3 = b0VarA2.a();
                        i0 i0VarA3 = m2Var3.a();
                        i0VarA3.k = arrayList4;
                        a0VarA3.j = i0VarA3.a();
                        b0 b0VarA3 = a0VarA3.a();
                        m2 m2Var4 = b0VarA3.k;
                        if (m2Var4 != null) {
                            String str12 = "appQualitySessionId: " + strSubstring;
                            try {
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    try {
                                        Log.d("FirebaseCrashlytics", str12, null);
                                    } catch (IOException e8) {
                                        e = e8;
                                        Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileF2, e);
                                    }
                                }
                                com.google.firebase.crashlytics.internal.persistence.a.f(z5 ? new File((File) cVar5.f, ((com.google.firebase.crashlytics.internal.model.j0) m2Var4).b) : new File((File) cVar5.e, ((com.google.firebase.crashlytics.internal.model.j0) m2Var4).b), com.google.firebase.crashlytics.internal.model.serialization.a.a.c(b0VarA3));
                            } catch (IOException e9) {
                                e = e9;
                                Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileF2, e);
                            }
                        }
                        e = e8;
                    } catch (IOException e10) {
                        e = e10;
                    }
                    Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileF2, e);
                }
                com.google.firebase.crashlytics.internal.persistence.c.j(new File((File) cVar5.d, str11));
                z3 = false;
                i = 4;
            }
            com.google.firebase.crashlytics.internal.persistence.c.j(new File((File) cVar5.d, str11));
            z3 = false;
            i = 4;
        }
        t2 t2Var = aVar3.c.b().a;
        ArrayList arrayListB = aVar3.b();
        int size = arrayListB.size();
        if (size <= 4) {
            return;
        }
        Iterator it4 = arrayListB.subList(4, size).iterator();
        while (it4.hasNext()) {
            ((File) it4.next()).delete();
        }
    }

    public final void c(String str, Boolean bool) {
        String str2;
        String str3;
        String str4;
        int i;
        Integer num;
        Map mapUnmodifiableMap;
        List listUnmodifiableList;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        String strH = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strH, null);
        }
        Locale locale = Locale.US;
        v vVar = this.f;
        a aVar = this.h;
        l1 l1Var = new l1(vVar.c, aVar.f, aVar.g, vVar.c().a, com.google.android.datatransport.runtime.backends.c.k(aVar.d != null ? 4 : 1), aVar.h);
        String str5 = Build.VERSION.RELEASE;
        String str6 = Build.VERSION.CODENAME;
        n1 n1Var = new n1(g.g());
        Context context = this.a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        f fVar = f.e;
        String str7 = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str7)) {
            f fVar2 = (f) f.y.get(str7.toLowerCase(locale));
            if (fVar2 != null) {
                fVar = fVar2;
            }
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
        }
        int iOrdinal = fVar.ordinal();
        String str8 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jA = g.a(context);
        boolean zF = g.f();
        int iC = g.c();
        String str9 = Build.MANUFACTURER;
        String str10 = Build.PRODUCT;
        this.j.d(str, jCurrentTimeMillis, new k1(l1Var, n1Var, new m1(iOrdinal, iAvailableProcessors, jA, blockCount, zF, iC)));
        if (!bool.booleanValue() || str == null) {
            str2 = str6;
            str3 = str9;
            str4 = str10;
            i = 4;
        } else {
            q2 q2Var = this.d;
            synchronized (((String) q2Var.c)) {
                q2Var.c = str;
                com.google.firebase.crashlytics.internal.metadata.e eVar = (com.google.firebase.crashlytics.internal.metadata.e) ((AtomicMarkableReference) ((b1) q2Var.d).y).getReference();
                synchronized (eVar) {
                    mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(eVar.a));
                }
                w0 w0Var = (w0) q2Var.f;
                synchronized (w0Var) {
                    listUnmodifiableList = Collections.unmodifiableList(new ArrayList(w0Var.b));
                }
                str3 = str9;
                str2 = str6;
                str4 = str10;
                i = 4;
                ((com.google.firebase.crashlytics.internal.concurrency.d) q2Var.b).b.a(new com.app.mlounge.ui.components.i(q2Var, str, mapUnmodifiableMap, listUnmodifiableList, 2));
            }
        }
        com.google.firebase.crashlytics.internal.metadata.f fVar3 = this.i;
        ((com.google.firebase.crashlytics.internal.metadata.d) fVar3.y).c();
        fVar3.y = com.google.firebase.crashlytics.internal.metadata.f.z;
        if (str != null) {
            fVar3.y = new com.google.firebase.crashlytics.internal.metadata.m(((com.google.firebase.crashlytics.internal.persistence.c) fVar3.e).f(str, "userlog"));
        }
        this.l.a(str);
        com.google.firebase.crashlytics.internal.persistence.c cVar = this.m;
        r rVar = (r) cVar.a;
        Charset charset = n2.a;
        a0 a0Var = new a0();
        a0Var.a = "20.0.5";
        a aVar2 = rVar.c;
        String str11 = aVar2.a;
        if (str11 == null) {
            com.google.gson.b.h("Null gmpAppId");
            return;
        }
        a0Var.b = str11;
        v vVar2 = rVar.b;
        String str12 = vVar2.c().a;
        if (str12 == null) {
            com.google.gson.b.h("Null installationUuid");
            return;
        }
        a0Var.d = str12;
        a0Var.e = vVar2.c().b;
        a0Var.f = vVar2.c().c;
        String str13 = aVar2.f;
        if (str13 == null) {
            com.google.gson.b.h("Null buildVersion");
            return;
        }
        a0Var.h = str13;
        String str14 = aVar2.g;
        if (str14 == null) {
            com.google.gson.b.h("Null displayVersion");
            return;
        }
        a0Var.i = str14;
        a0Var.c = i;
        a0Var.m = (byte) (a0Var.m | 1);
        i0 i0Var = new i0();
        i0Var.f = false;
        byte b = (byte) (i0Var.m | 2);
        i0Var.d = jCurrentTimeMillis;
        i0Var.m = (byte) (b | 1);
        if (str == null) {
            com.google.gson.b.h("Null identifier");
            return;
        }
        i0Var.b = str;
        String str15 = r.g;
        if (str15 == null) {
            com.google.gson.b.h("Null generator");
            return;
        }
        i0Var.a = str15;
        String str16 = vVar2.c;
        if (str16 == null) {
            com.google.gson.b.h("Null identifier");
            return;
        }
        String str17 = vVar2.c().a;
        g0 g0Var = aVar2.h;
        if (((androidx.media3.exoplayer.dash.manifest.u) g0Var.z) == null) {
            g0Var.z = new androidx.media3.exoplayer.dash.manifest.u(g0Var);
        }
        androidx.media3.exoplayer.dash.manifest.u uVar = (androidx.media3.exoplayer.dash.manifest.u) g0Var.z;
        String str18 = uVar.b;
        if (uVar == null) {
            g0Var.z = new androidx.media3.exoplayer.dash.manifest.u(g0Var);
        }
        i0Var.g = new k0(str16, str13, str14, str17, str18, ((androidx.media3.exoplayer.dash.manifest.u) g0Var.z).c);
        h1 h1Var = new h1();
        h1Var.a = 3;
        h1Var.e = (byte) (h1Var.e | 1);
        if (str5 == null) {
            com.google.gson.b.h("Null version");
            return;
        }
        h1Var.b = str5;
        if (str2 == null) {
            com.google.gson.b.h("Null buildVersion");
            return;
        }
        h1Var.c = str2;
        h1Var.d = g.g();
        h1Var.e = (byte) (h1Var.e | 2);
        i0Var.i = h1Var.a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int iIntValue = 7;
        if (!TextUtils.isEmpty(str7) && (num = (Integer) r.f.get(str7.toLowerCase(locale))) != null) {
            iIntValue = num.intValue();
        }
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jA2 = g.a(rVar.a);
        long blockCount2 = ((long) statFs2.getBlockCount()) * ((long) statFs2.getBlockSize());
        boolean zF2 = g.f();
        int iC2 = g.c();
        m0 m0Var = new m0();
        m0Var.a = iIntValue;
        byte b2 = (byte) (m0Var.j | 1);
        m0Var.j = b2;
        if (str8 == 0) {
            com.google.gson.b.h("Null model");
            return;
        }
        m0Var.b = str8;
        m0Var.c = iAvailableProcessors2;
        m0Var.d = jA2;
        m0Var.e = blockCount2;
        m0Var.f = zF2;
        m0Var.g = iC2;
        m0Var.j = (byte) (((byte) (((byte) (((byte) (((byte) (b2 | 2)) | 4)) | 8)) | 16)) | 32);
        String str19 = str3;
        if (str19 == null) {
            com.google.gson.b.h("Null manufacturer");
            return;
        }
        m0Var.h = str19;
        String str20 = str4;
        if (str20 == null) {
            com.google.gson.b.h("Null modelClass");
            return;
        }
        m0Var.i = str20;
        i0Var.j = m0Var.a();
        i0Var.l = 3;
        i0Var.m = (byte) (i0Var.m | 4);
        a0Var.j = i0Var.a();
        b0 b0VarA = a0Var.a();
        com.google.firebase.crashlytics.internal.persistence.c cVar2 = ((com.google.firebase.crashlytics.internal.persistence.a) cVar.b).b;
        m2 m2Var = b0VarA.k;
        if (m2Var == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String str21 = ((com.google.firebase.crashlytics.internal.model.j0) m2Var).b;
        try {
            com.google.firebase.crashlytics.internal.persistence.a.g.getClass();
            com.google.firebase.crashlytics.internal.persistence.a.f(cVar2.f(str21, "report"), com.google.firebase.crashlytics.internal.model.serialization.a.a.c(b0VarA));
            File fileF = cVar2.f(str21, "start-time");
            long j = ((com.google.firebase.crashlytics.internal.model.j0) m2Var).d;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileF), com.google.firebase.crashlytics.internal.persistence.a.e);
            try {
                outputStreamWriter.write("");
                fileF.setLastModified(j * 1000);
                outputStreamWriter.close();
            } catch (Throwable th) {
                try {
                    outputStreamWriter.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (IOException e) {
            String strH2 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Could not persist report for session ", str21);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", strH2, e);
            }
        }
    }

    public final boolean d(j0 j0Var) throws Throwable {
        com.google.firebase.crashlytics.internal.concurrency.d.a();
        s sVar = this.n;
        if (sVar != null && sVar.e.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            b(true, j0Var, true);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    public final String e() {
        NavigableSet navigableSetC = ((com.google.firebase.crashlytics.internal.persistence.a) this.m.b).c();
        if (navigableSetC.isEmpty()) {
            return null;
        }
        return (String) navigableSetC.first();
    }

    public final String f() throws IOException {
        InputStream resourceAsStream;
        Context context = this.a;
        int iD = g.d(context, "com.google.firebase.crashlytics.version_control_info", "string");
        String string = iD == 0 ? null : context.getResources().getString(iD);
        if (string != null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from string resource", null);
            }
            return Base64.encodeToString(string.getBytes(s), 0);
        }
        ClassLoader classLoader = m.class.getClassLoader();
        if (classLoader == null) {
            Log.w("FirebaseCrashlytics", "Couldn't get Class Loader", null);
            resourceAsStream = null;
        } else {
            resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
        }
        if (resourceAsStream == null) {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            Log.i("FirebaseCrashlytics", "No version control information found", null);
            return null;
        }
        try {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from file", null);
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
                while (true) {
                    int i = resourceAsStream.read(bArr);
                    if (i == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        String strEncodeToString = Base64.encodeToString(byteArray, 0);
                        resourceAsStream.close();
                        return strEncodeToString;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                    try {
                        resourceAsStream.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            resourceAsStream.close();
            throw th4;
        }
    }

    public final void g() {
        try {
            String strF = f();
            if (strF != null) {
                try {
                    ((b1) this.d.e).q("com.crashlytics.version-control-info", strF);
                } catch (IllegalArgumentException e) {
                    Context context = this.a;
                    if (context != null) {
                        if ((context.getApplicationInfo().flags & 2) != 0) {
                            throw e;
                        }
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e2);
        }
    }

    public final void h(com.google.android.gms.tasks.q qVar) {
        com.google.android.gms.tasks.q qVar2;
        com.google.android.gms.tasks.q qVarA;
        com.google.android.gms.tasks.j jVar = this.o;
        com.google.firebase.crashlytics.internal.persistence.c cVar = ((com.google.firebase.crashlytics.internal.persistence.a) this.m.b).b;
        if (com.google.firebase.crashlytics.internal.persistence.c.k(((File) cVar.e).listFiles()).isEmpty() && com.google.firebase.crashlytics.internal.persistence.c.k(((File) cVar.f).listFiles()).isEmpty() && com.google.firebase.crashlytics.internal.persistence.c.k(((File) cVar.g).listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            jVar.d(Boolean.FALSE);
            return;
        }
        com.google.firebase.crashlytics.internal.b bVar = com.google.firebase.crashlytics.internal.b.a;
        bVar.c("Crash reports are available to be sent.");
        com.google.android.gms.common.api.internal.m mVar = this.b;
        if (mVar.a()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            jVar.d(Boolean.FALSE);
            qVarA = kotlin.math.a.t(Boolean.TRUE);
        } else {
            bVar.b("Automatic data collection is disabled.");
            bVar.c("Notifying that unsent reports are available.");
            jVar.d(Boolean.TRUE);
            synchronized (mVar.z) {
                qVar2 = ((com.google.android.gms.tasks.j) mVar.A).a;
            }
            com.google.android.gms.measurement.internal.e0 e0Var = new com.google.android.gms.measurement.internal.e0(9);
            qVar2.getClass();
            com.google.android.datatransport.runtime.p pVar = com.google.android.gms.tasks.k.a;
            com.google.android.gms.tasks.q qVar3 = new com.google.android.gms.tasks.q();
            qVar2.b.h(new com.google.android.gms.tasks.n(pVar, e0Var, qVar3));
            qVar2.p();
            bVar.b("Waiting for send/deleteUnsentReports to be called.");
            qVarA = com.google.firebase.crashlytics.internal.concurrency.a.a(qVar3, this.p.a);
        }
        qVarA.i(this.e.a, new g0(4, this, qVar));
    }
}
