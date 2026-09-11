package com.google.firebase.components;

import android.os.Bundle;
import android.util.Log;
import com.caverock.androidsvg.y1;
import com.google.android.gms.common.internal.x;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements e, com.google.android.gms.tasks.e, com.google.firebase.inject.a, com.google.android.gms.tasks.b, com.google.firebase.events.a {
    public final /* synthetic */ int e;

    public /* synthetic */ s(int i) {
        this.e = i;
    }

    public static /* synthetic */ void a(Object obj, Object obj2, String str) {
        throw new androidx.compose.ui.res.e(str + obj + obj2, 7);
    }

    @Override // com.google.firebase.components.e
    public Object b(y1 y1Var) {
        switch (this.e) {
            case 1:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 2:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 3:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            case 4:
                n nVar = ExecutorsRegistrar.a;
                return com.google.firebase.concurrent.j.e;
            case 15:
                return TransportRegistrar.lambda$getComponents$0(y1Var);
            case 16:
                return TransportRegistrar.lambda$getComponents$1(y1Var);
            case 17:
                return TransportRegistrar.lambda$getComponents$2(y1Var);
            case 18:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(y1Var);
            case 25:
                Set setD = y1Var.d(r.a(com.google.firebase.platforminfo.a.class));
                com.google.firebase.platforminfo.c cVar = com.google.firebase.platforminfo.c.y;
                if (cVar == null) {
                    synchronized (com.google.firebase.platforminfo.c.class) {
                        try {
                            cVar = com.google.firebase.platforminfo.c.y;
                            if (cVar == null) {
                                cVar = new com.google.firebase.platforminfo.c(0);
                                com.google.firebase.platforminfo.c.y = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return new com.google.firebase.platforminfo.b(setD, cVar);
            case 28:
                return FirebaseSessionsRegistrar.getComponents$lambda$0(y1Var);
            default:
                return FirebaseSessionsRegistrar.getComponents$lambda$1(y1Var);
        }
    }

    @Override // com.google.android.gms.tasks.b
    public Object d(com.google.android.gms.tasks.i iVar) throws IOException {
        boolean z;
        int i;
        Object obj;
        switch (this.e) {
            case 7:
                if (iVar.h()) {
                    com.google.firebase.crashlytics.internal.common.b bVar = (com.google.firebase.crashlytics.internal.common.b) iVar.f();
                    com.google.firebase.crashlytics.internal.b bVar2 = com.google.firebase.crashlytics.internal.b.a;
                    bVar2.b("Crashlytics report successfully enqueued to DataTransport: " + bVar.b);
                    File file = bVar.c;
                    z = true;
                    if (file.delete()) {
                        bVar2.b("Deleted report file: " + file.getPath());
                    } else {
                        bVar2.d(null, "Crashlytics could not delete report file: " + file.getPath());
                    }
                } else {
                    Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", iVar.e());
                    z = false;
                }
                return Boolean.valueOf(z);
            case 20:
                i = 403;
                break;
            case 21:
                i = -1;
                break;
            default:
                com.google.android.gms.tasks.q qVar = (com.google.android.gms.tasks.q) iVar;
                synchronized (qVar.a) {
                    x.i("Task is not yet complete", qVar.c);
                    if (qVar.d) {
                        throw new CancellationException("Task is already canceled.");
                    }
                    boolean zIsInstance = IOException.class.isInstance(qVar.f);
                    Exception exc = qVar.f;
                    if (zIsInstance) {
                        throw ((Throwable) IOException.class.cast(exc));
                    }
                    if (exc != null) {
                        throw new com.google.android.gms.tasks.g(exc);
                    }
                    obj = qVar.e;
                }
                Bundle bundle = (Bundle) obj;
                if (bundle != null) {
                    String string = bundle.getString("registration_id");
                    if (string != null) {
                        return string;
                    }
                    String string2 = bundle.getString("unregistered");
                    if (string2 != null) {
                        return string2;
                    }
                    String string3 = bundle.getString("error");
                    if ("RST".equals(string3)) {
                        net.luminis.tls.engine.impl.c.t("INSTANCE_ID_RESET");
                    } else if (string3 != null) {
                        net.luminis.tls.engine.impl.c.t(string3);
                    } else {
                        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                        net.luminis.tls.engine.impl.c.t("SERVICE_NOT_AVAILABLE");
                    }
                } else {
                    net.luminis.tls.engine.impl.c.t("SERVICE_NOT_AVAILABLE");
                }
                return null;
        }
        return Integer.valueOf(i);
    }

    @Override // com.google.firebase.inject.a
    public void e(com.google.firebase.inject.b bVar) {
        bVar.get().getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.tasks.e
    public void z(Exception exc) {
        Log.e("FirebaseCrashlytics", "Error fetching settings.", exc);
    }

    public /* synthetic */ s(Object obj, int i) {
        this.e = i;
    }
}
