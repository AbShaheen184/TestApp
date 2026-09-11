package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.SystemClock;
import android.os.Trace;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e1 {
    public static final coil3.memory.c a = new coil3.memory.c("Phenotype.API", new com.google.android.gms.common.internal.service.b(1), new com.google.firebase.heartbeatinfo.e());

    public static int a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static File b(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            return filesDir;
        }
        SystemClock.sleep(100L);
        File filesDir2 = context.getFilesDir();
        if (filesDir2 != null) {
            return filesDir2;
        }
        net.luminis.tls.engine.impl.c.r("getFilesDir returned null twice.");
        return null;
    }

    public static void c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        com.google.gson.b.h(str.concat(" must not be null"));
    }

    public static a1 d() {
        ClassLoader classLoader = e1.class.getClassLoader();
        if (a1.class.equals(a1.class)) {
            try {
                try {
                    if (Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader).getConstructor(null).newInstance(null) == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ReflectiveOperationException e) {
                    throw new IllegalStateException(e);
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        try {
            Iterator it = Arrays.asList(new e1[0]).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ServiceConfigurationError e2) {
                    Logger.getLogger(z0.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(a1.class.getSimpleName()), (Throwable) e2);
                }
            }
            if (arrayList.size() == 1) {
                return (a1) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (a1) a1.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (ReflectiveOperationException e3) {
                throw new IllegalStateException(e3);
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static void e(qf qfVar) {
        we weVar;
        if (g(qfVar) || (weVar = ((we) qfVar).e) == null) {
            Trace.beginSection(((we) qfVar).z);
            h(qfVar);
        } else {
            e(weVar);
            h(qfVar);
        }
    }

    public static void f(qf qfVar) {
        if (!g(qfVar)) {
            we weVar = (we) qfVar;
            if (weVar.e != null) {
                Trace.endSection();
                f(weVar.e);
                return;
            }
        }
        Trace.endSection();
        Trace.endSection();
    }

    public static boolean g(qf qfVar) {
        return ((we) qfVar).B != Thread.currentThread();
    }

    public static void h(qf qfVar) {
        String strSubstring = ((we) qfVar).A;
        AtomicReference atomicReference = bf.a;
        if (strSubstring.length() > 127) {
            strSubstring = strSubstring.substring(0, 127);
        }
        Trace.beginSection(strSubstring);
    }
}
