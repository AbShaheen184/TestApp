package com.google.firebase;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.os.UserManager;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.measurement.internal.e0;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.n;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.concurrent.j;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final Object k = new Object();
    public static final androidx.collection.f l = new androidx.collection.f(0);
    public final Context a;
    public final String b;
    public final i c;
    public final com.google.firebase.components.g d;
    public final n g;
    public final com.google.firebase.inject.b h;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList j = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public g(Context context, String str, i iVar) {
        ?? arrayList;
        int i = 0;
        this.a = context;
        x.d(str);
        this.b = str;
        this.c = iVar;
        a aVar = FirebaseInitProvider.e;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new com.google.firebase.components.d((String) it.next(), i));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        j jVar = j.e;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        int i2 = 1;
        arrayList3.add(new com.google.firebase.components.d(new FirebaseCommonRegistrar(), i2));
        arrayList3.add(new com.google.firebase.components.d(new ExecutorsRegistrar(), i2));
        arrayList4.add(com.google.firebase.components.b.c(context, Context.class, new Class[0]));
        arrayList4.add(com.google.firebase.components.b.c(this, g.class, new Class[0]));
        arrayList4.add(com.google.firebase.components.b.c(iVar, i.class, new Class[0]));
        e0 e0Var = new e0(12);
        if (((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked() && FirebaseInitProvider.y.get()) {
            arrayList4.add(com.google.firebase.components.b.c(aVar, a.class, new Class[0]));
        }
        com.google.firebase.components.g gVar = new com.google.firebase.components.g(arrayList3, arrayList4, e0Var);
        this.d = gVar;
        Trace.endSection();
        this.g = new n(new c(i, this, context));
        this.h = gVar.c(com.google.firebase.heartbeatinfo.d.class);
        d dVar = new d(this);
        a();
        if (this.e.get()) {
            com.google.android.gms.common.api.internal.d.B.e.get();
        }
        this.i.add(dVar);
        Trace.endSection();
    }

    public static g c() {
        g gVar;
        synchronized (k) {
            try {
                gVar = (g) l.get("[DEFAULT]");
                if (gVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + com.google.android.gms.common.util.c.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((com.google.firebase.heartbeatinfo.d) gVar.h.get()).b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public static g f(Context context) {
        synchronized (k) {
            try {
                if (l.containsKey("[DEFAULT]")) {
                    return c();
                }
                i iVarA = i.a(context);
                if (iVarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return g(context, iVarA);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static g g(Context context, i iVar) {
        g gVar;
        AtomicReference atomicReference = e.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = e.a;
            if (atomicReference2.get() == null) {
                e eVar = new e();
                do {
                    if (atomicReference2.compareAndSet(null, eVar)) {
                        com.google.android.gms.common.api.internal.d.a(application);
                        com.google.android.gms.common.api.internal.d dVar = com.google.android.gms.common.api.internal.d.B;
                        dVar.getClass();
                        synchronized (dVar) {
                            dVar.z.add(eVar);
                        }
                        break;
                    }
                } while (atomicReference2.get() == null);
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (k) {
            androidx.collection.f fVar = l;
            x.i("FirebaseApp name [DEFAULT] already exists!", !fVar.containsKey("[DEFAULT]"));
            x.h(context, "Application context cannot be null.");
            gVar = new g(context, "[DEFAULT]", iVar);
            fVar.put("[DEFAULT]", gVar);
        }
        gVar.e();
        return gVar;
    }

    public final void a() {
        x.i("FirebaseApp was deleted", !this.f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.d.a(cls);
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.b.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        a();
        byte[] bytes2 = this.c.b.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    public final void e() {
        HashMap map;
        if (!((UserManager) this.a.getSystemService(UserManager.class)).isUserUnlocked()) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.a;
            AtomicReference atomicReference = f.b;
            if (atomicReference.get() == null) {
                f fVar = new f(context);
                while (!atomicReference.compareAndSet(null, fVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(fVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(this.b);
        Log.i("FirebaseApp", sb2.toString());
        com.google.firebase.components.g gVar = this.d;
        a();
        boolean zEquals = "[DEFAULT]".equals(this.b);
        AtomicReference atomicReference2 = gVar.f;
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        while (!atomicReference2.compareAndSet(null, boolValueOf)) {
            if (atomicReference2.get() != null) {
                ((com.google.firebase.heartbeatinfo.d) this.h.get()).b();
            }
        }
        synchronized (gVar) {
            map = new HashMap(gVar.a);
        }
        gVar.h(map, zEquals);
        ((com.google.firebase.heartbeatinfo.d) this.h.get()).b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.a();
        return this.b.equals(gVar.b);
    }

    public final boolean h() {
        boolean z;
        a();
        com.google.firebase.internal.a aVar = (com.google.firebase.internal.a) this.g.get();
        synchronized (aVar) {
            z = aVar.a;
        }
        return z;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        coil3.memory.c cVar = new coil3.memory.c(this);
        cVar.f(this.b, "name");
        cVar.f(this.c, "options");
        return cVar.toString();
    }
}
