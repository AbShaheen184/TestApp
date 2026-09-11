package com.google.firebase.crashlytics.internal.persistence;

import android.content.Context;
import android.util.Log;
import androidx.appcompat.widget.q2;
import androidx.compose.foundation.gestures.w0;
import androidx.compose.foundation.lazy.layout.b1;
import androidx.core.provider.m;
import androidx.media3.exoplayer.u;
import com.appsalt.internal.j0;
import com.google.android.gms.tasks.q;
import com.google.common.util.concurrent.g0;
import com.google.firebase.components.s;
import com.google.firebase.crashlytics.internal.common.g;
import com.google.firebase.crashlytics.internal.common.j;
import com.google.firebase.crashlytics.internal.common.r;
import com.google.firebase.crashlytics.internal.common.v;
import com.google.firebase.crashlytics.internal.metadata.d;
import com.google.firebase.crashlytics.internal.metadata.e;
import com.google.firebase.crashlytics.internal.metadata.f;
import com.google.firebase.crashlytics.internal.metadata.n;
import com.google.firebase.crashlytics.internal.model.a0;
import com.google.firebase.crashlytics.internal.model.b0;
import com.google.firebase.crashlytics.internal.model.c1;
import com.google.firebase.crashlytics.internal.model.c2;
import com.google.firebase.crashlytics.internal.model.d1;
import com.google.firebase.crashlytics.internal.model.f0;
import com.google.firebase.crashlytics.internal.model.f1;
import com.google.firebase.crashlytics.internal.model.g1;
import com.google.firebase.crashlytics.internal.model.j2;
import com.google.firebase.crashlytics.internal.model.o0;
import com.google.firebase.crashlytics.internal.model.p0;
import com.google.firebase.crashlytics.internal.model.q0;
import com.google.firebase.crashlytics.internal.model.r0;
import com.google.firebase.crashlytics.internal.model.t0;
import com.google.firebase.crashlytics.internal.model.u0;
import com.google.firebase.crashlytics.internal.model.v0;
import com.google.firebase.crashlytics.internal.model.z0;
import com.google.firebase.messaging.o;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public c(Context context) {
        String string;
        String str = ((z0) com.google.firebase.crashlytics.internal.c.a.b(context)).a;
        this.a = str;
        File filesDir = context.getFilesDir();
        this.b = filesDir;
        if (str.isEmpty()) {
            string = ".com.google.firebase.crashlytics.files.v1";
        } else {
            StringBuilder sb = new StringBuilder(".crashlytics.v3");
            sb.append(File.separator);
            sb.append(str.length() > 40 ? g.h(str) : str.replaceAll("[^a-zA-Z0-9.]", "_"));
            string = sb.toString();
        }
        File file = new File(filesDir, string);
        i(file);
        this.c = file;
        File file2 = new File(file, "open-sessions");
        i(file2);
        this.d = file2;
        File file3 = new File(file, "reports");
        i(file3);
        this.e = file3;
        File file4 = new File(file, "priority-reports");
        i(file4);
        this.f = file4;
        File file5 = new File(file, "native-reports");
        i(file5);
        this.g = file5;
    }

    public static p0 a(p0 p0Var, f fVar, q2 q2Var, Map map) {
        Map mapUnmodifiableMap;
        Map mapUnmodifiableMap2;
        Map mapUnmodifiableMap3;
        o0 o0VarA = p0Var.a();
        String strE = ((d) fVar.y).e();
        if (strE != null) {
            o0VarA.e = new c1(strE);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        boolean zIsEmpty = map.isEmpty();
        b1 b1Var = (b1) q2Var.d;
        if (zIsEmpty) {
            e eVar = (e) ((AtomicMarkableReference) b1Var.y).getReference();
            synchronized (eVar) {
                mapUnmodifiableMap2 = Collections.unmodifiableMap(new HashMap(eVar.a));
            }
        } else {
            e eVar2 = (e) ((AtomicMarkableReference) b1Var.y).getReference();
            synchronized (eVar2) {
                mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(eVar2.a));
            }
            HashMap map2 = new HashMap(mapUnmodifiableMap);
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String strA = e.a(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, (String) entry.getKey());
                if (map2.size() < 64 || map2.containsKey(strA)) {
                    map2.put(strA, e.a(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, (String) entry.getValue()));
                } else {
                    i++;
                }
            }
            if (i > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i + " keys when adding event specific keys. Maximum allowable: 1024", null);
            }
            mapUnmodifiableMap2 = Collections.unmodifiableMap(map2);
        }
        List listG = g(mapUnmodifiableMap2);
        e eVar3 = (e) ((AtomicMarkableReference) ((b1) q2Var.e).y).getReference();
        synchronized (eVar3) {
            mapUnmodifiableMap3 = Collections.unmodifiableMap(new HashMap(eVar3.a));
        }
        List listG2 = g(mapUnmodifiableMap3);
        if (!listG.isEmpty() || !listG2.isEmpty()) {
            q0 q0Var = (q0) p0Var.c;
            o0VarA.c = new q0(q0Var.a, listG, listG2, q0Var.d, q0Var.e, q0Var.f, q0Var.g);
        }
        return o0VarA.a();
    }

    public static j2 b(p0 p0Var, q2 q2Var) {
        List listUnmodifiableList;
        w0 w0Var = (w0) q2Var.f;
        synchronized (w0Var) {
            listUnmodifiableList = Collections.unmodifiableList(new ArrayList(w0Var.b));
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < listUnmodifiableList.size(); i++) {
            n nVar = (n) listUnmodifiableList.get(i);
            nVar.getClass();
            d1 d1Var = new d1();
            com.google.firebase.crashlytics.internal.metadata.b bVar = (com.google.firebase.crashlytics.internal.metadata.b) nVar;
            String str = bVar.e;
            if (str == null) {
                com.google.gson.b.h("Null variantId");
                return null;
            }
            String str2 = bVar.b;
            if (str2 == null) {
                com.google.gson.b.h("Null rolloutId");
                return null;
            }
            d1Var.a = new f1(str2, str);
            String str3 = bVar.c;
            if (str3 == null) {
                com.google.gson.b.h("Null parameterKey");
                return null;
            }
            d1Var.b = str3;
            d1Var.c = bVar.d;
            d1Var.d = bVar.f;
            d1Var.e = (byte) (d1Var.e | 1);
            arrayList.add(d1Var.a());
        }
        if (arrayList.isEmpty()) {
            return p0Var;
        }
        o0 o0VarA = p0Var.a();
        o0VarA.f = new g1(arrayList);
        return o0VarA.a();
    }

    public static String d(InputStream inputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = bufferedInputStream.read(bArr);
                    if (i == -1) {
                        String string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        byteArrayOutputStream.close();
                        bufferedInputStream.close();
                        return string;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                    try {
                        bufferedInputStream.close();
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
            bufferedInputStream.close();
            throw th4;
        }
    }

    public static c e(Context context, v vVar, c cVar, com.google.firebase.crashlytics.internal.common.a aVar, f fVar, q2 q2Var, g0 g0Var, j0 j0Var, g0 g0Var2, j jVar, com.google.firebase.crashlytics.internal.concurrency.d dVar) {
        r rVar = new r(context, vVar, aVar, g0Var, j0Var);
        a aVar2 = new a(cVar, j0Var, jVar);
        com.google.firebase.crashlytics.internal.model.serialization.a aVar3 = com.google.firebase.crashlytics.internal.send.a.b;
        com.google.android.datatransport.runtime.r.b(context);
        return new c(rVar, aVar2, new com.google.firebase.crashlytics.internal.send.a(new com.google.firebase.crashlytics.internal.send.b(com.google.android.datatransport.runtime.r.a().c(new com.google.android.datatransport.cct.a(com.google.firebase.crashlytics.internal.send.a.c, com.google.firebase.crashlytics.internal.send.a.d)).a("FIREBASE_CRASHLYTICS_REPORT", new com.google.android.datatransport.c("json"), com.google.firebase.crashlytics.internal.send.a.e), j0Var.b(), g0Var2)), fVar, q2Var, vVar, dVar);
    }

    public static List g(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                com.google.gson.b.h("Null key");
                return null;
            }
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                com.google.gson.b.h("Null value");
                return null;
            }
            arrayList.add(new f0(str, str2));
        }
        Collections.sort(arrayList, new androidx.compose.foundation.lazy.layout.a(25));
        return Collections.unmodifiableList(arrayList);
    }

    public static synchronized void i(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return;
                }
                String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str, null);
                }
                file.delete();
            }
            if (!file.mkdirs()) {
                Log.e("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static boolean j(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                j(file2);
            }
        }
        return file.delete();
    }

    public static List k(Object[] objArr) {
        return objArr == null ? Collections.EMPTY_LIST : Arrays.asList(objArr);
    }

    public void c(String str) {
        File file = new File((File) this.b, str);
        if (file.exists() && j(file)) {
            String str2 = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
        }
    }

    public File f(String str, String str2) {
        File file = new File((File) this.d, str);
        file.mkdirs();
        return new File(file, str2);
    }

    public void h(Throwable th, Thread thread, String str, com.google.firebase.crashlytics.internal.metadata.c cVar, boolean z) {
        boolean zEquals = str.equals("crash");
        r rVar = (r) this.a;
        long j = cVar.b;
        Context context = rVar.a;
        int i = context.getResources().getConfiguration().orientation;
        g0 g0Var = rVar.d;
        Stack stack = new Stack();
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            stack.push(cause);
        }
        o oVar = null;
        while (!stack.isEmpty()) {
            Throwable th2 = (Throwable) stack.pop();
            oVar = new o(th2.getLocalizedMessage(), th2.getClass().getName(), g0Var.c(th2.getStackTrace()), oVar, 22);
        }
        o oVar2 = oVar;
        o0 o0Var = new o0();
        o0Var.b = str;
        o0Var.a = j;
        o0Var.g = (byte) (o0Var.g | 1);
        c2 c2VarB = com.google.firebase.crashlytics.internal.c.a.b(context);
        int i2 = ((z0) c2VarB).c;
        Boolean boolValueOf = i2 > 0 ? Boolean.valueOf(i2 != 100) : null;
        ArrayList arrayListA = com.google.firebase.crashlytics.internal.c.a(context);
        byte b = (byte) 1;
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) oVar2.A;
        String name = thread.getName();
        if (name == null) {
            com.google.gson.b.h("Null name");
            return;
        }
        byte b2 = (byte) 1;
        List listD = r.d(stackTraceElementArr, 4);
        if (listD == null) {
            com.google.gson.b.h("Null frames");
            return;
        }
        if (b2 != 1) {
            StringBuilder sb = new StringBuilder();
            if (b2 == 0) {
                sb.append(" importance");
            }
            net.luminis.tls.engine.impl.c.r(com.google.android.datatransport.runtime.backends.c.s("Missing required properties:", sb));
            return;
        }
        arrayList.add(new v0(name, 4, listD));
        if (z) {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it = Thread.getAllStackTraces().entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Thread, StackTraceElement[]> next = it.next();
                Thread key = next.getKey();
                if (!key.equals(thread)) {
                    StackTraceElement[] stackTraceElementArrC = g0Var.c(next.getValue());
                    String name2 = key.getName();
                    if (name2 == null) {
                        com.google.gson.b.h("Null name");
                        return;
                    }
                    List listD2 = r.d(stackTraceElementArrC, 0);
                    if (listD2 == null) {
                        com.google.gson.b.h("Null frames");
                        return;
                    }
                    if (b2 != 1) {
                        byte b3 = b2;
                        StringBuilder sb2 = new StringBuilder();
                        if (b3 == 0) {
                            sb2.append(" importance");
                        }
                        net.luminis.tls.engine.impl.c.r(com.google.android.datatransport.runtime.backends.c.s("Missing required properties:", sb2));
                        return;
                    }
                    arrayList.add(new v0(name2, 0, listD2));
                }
                it = it;
                b2 = b2;
            }
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        t0 t0VarC = r.c(oVar2, 0);
        u0 u0VarE = r.e();
        List listA = rVar.a();
        if (listA == null) {
            com.google.gson.b.h("Null binaries");
            return;
        }
        r0 r0Var = new r0(listUnmodifiableList, t0VarC, null, u0VarE, listA);
        if (b != 1) {
            StringBuilder sb3 = new StringBuilder();
            if (b == 0) {
                sb3.append(" uiOrientation");
            }
            net.luminis.tls.engine.impl.c.r(com.google.android.datatransport.runtime.backends.c.s("Missing required properties:", sb3));
            return;
        }
        o0Var.c = new q0(r0Var, null, null, boolValueOf, c2VarB, arrayListA, i);
        o0Var.d = rVar.b(i);
        p0 p0VarA = o0Var.a();
        Map map = cVar.c;
        f fVar = (f) this.d;
        q2 q2Var = (q2) this.e;
        j2 j2VarB = b(a(p0VarA, fVar, q2Var, map), q2Var);
        if (z) {
            ((a) this.b).d(j2VarB, cVar.a, zEquals);
        } else {
            ((com.google.firebase.crashlytics.internal.concurrency.d) this.g).b.a(new u(this, j2VarB, cVar, zEquals));
        }
    }

    public q l(String str, Executor executor) {
        com.google.firebase.crashlytics.internal.common.b bVar;
        com.google.android.gms.tasks.j jVar;
        ArrayList<File> arrayListB = ((a) this.b).b();
        ArrayList<com.google.firebase.crashlytics.internal.common.b> arrayList = new ArrayList();
        for (File file : arrayListB) {
            try {
                com.google.firebase.crashlytics.internal.model.serialization.a aVar = a.g;
                String strE = a.e(file);
                aVar.getClass();
                arrayList.add(new com.google.firebase.crashlytics.internal.common.b(com.google.firebase.crashlytics.internal.model.serialization.a.i(strE), file.getName(), file));
            } catch (IOException e) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (com.google.firebase.crashlytics.internal.common.b bVar2 : arrayList) {
            if (str == null || str.equals(bVar2.b)) {
                com.google.firebase.crashlytics.internal.send.a aVar2 = (com.google.firebase.crashlytics.internal.send.a) this.c;
                b0 b0Var = bVar2.a;
                if (b0Var.f == null || b0Var.g == null) {
                    com.google.firebase.crashlytics.internal.common.u uVarB = ((v) this.f).b(true);
                    b0 b0Var2 = bVar2.a;
                    String str2 = uVarB.a;
                    a0 a0VarA = b0Var2.a();
                    a0VarA.e = str2;
                    b0 b0VarA = a0VarA.a();
                    String str3 = uVarB.b;
                    a0 a0VarA2 = b0VarA.a();
                    a0VarA2.f = str3;
                    bVar = new com.google.firebase.crashlytics.internal.common.b(a0VarA2.a(), bVar2.b, bVar2.c);
                } else {
                    bVar = bVar2;
                }
                boolean z = str != null;
                com.google.firebase.crashlytics.internal.send.b bVar3 = aVar2.a;
                synchronized (bVar3.f) {
                    try {
                        jVar = new com.google.android.gms.tasks.j();
                        if (z) {
                            ((AtomicInteger) bVar3.i.y).getAndIncrement();
                            if (bVar3.f.size() < bVar3.e) {
                                com.google.firebase.crashlytics.internal.b bVar4 = com.google.firebase.crashlytics.internal.b.a;
                                bVar4.b("Enqueueing report: " + bVar.b);
                                bVar4.b("Queue size: " + bVar3.f.size());
                                bVar3.g.execute(new m(bVar3, bVar, jVar, 14, false));
                                bVar4.b("Closing task for report: " + bVar.b);
                                jVar.d(bVar);
                            } else {
                                bVar3.a();
                                String str4 = "Dropping report due to queue being full: " + bVar.b;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str4, null);
                                }
                                ((AtomicInteger) bVar3.i.z).getAndIncrement();
                                jVar.d(bVar);
                            }
                        } else {
                            bVar3.b(bVar, jVar);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                arrayList2.add(jVar.a.j(executor, new s(this, 7)));
            }
        }
        return kotlin.math.a.M(arrayList2);
    }

    public c(r rVar, a aVar, com.google.firebase.crashlytics.internal.send.a aVar2, f fVar, q2 q2Var, v vVar, com.google.firebase.crashlytics.internal.concurrency.d dVar) {
        this.a = rVar;
        this.b = aVar;
        this.c = aVar2;
        this.d = fVar;
        this.e = q2Var;
        this.f = vVar;
        this.g = dVar;
    }
}
