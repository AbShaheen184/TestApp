package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final Object c = new Object();
    public static y d;
    public final Object a;
    public final Object b;

    public g(com.google.android.material.internal.b bVar) {
        this.a = bVar.u("gcm.n.title");
        bVar.r("gcm.n.title");
        Object[] objArrQ = bVar.q("gcm.n.title");
        if (objArrQ != null) {
            String[] strArr = new String[objArrQ.length];
            for (int i = 0; i < objArrQ.length; i++) {
                strArr[i] = String.valueOf(objArrQ[i]);
            }
        }
        this.b = bVar.u("gcm.n.body");
        bVar.r("gcm.n.body");
        Object[] objArrQ2 = bVar.q("gcm.n.body");
        if (objArrQ2 != null) {
            String[] strArr2 = new String[objArrQ2.length];
            for (int i2 = 0; i2 < objArrQ2.length; i2++) {
                strArr2[i2] = String.valueOf(objArrQ2[i2]);
            }
        }
        bVar.u("gcm.n.icon");
        if (TextUtils.isEmpty(bVar.u("gcm.n.sound2"))) {
            bVar.u("gcm.n.sound");
        }
        bVar.u("gcm.n.tag");
        bVar.u("gcm.n.color");
        bVar.u("gcm.n.click_action");
        bVar.u("gcm.n.android_channel_id");
        String strU = bVar.u("gcm.n.link_android");
        strU = TextUtils.isEmpty(strU) ? bVar.u("gcm.n.link") : strU;
        if (!TextUtils.isEmpty(strU)) {
            Uri.parse(strU);
        }
        bVar.u("gcm.n.image");
        bVar.u("gcm.n.ticker");
        bVar.n("gcm.n.notification_priority");
        bVar.n("gcm.n.visibility");
        bVar.n("gcm.n.notification_count");
        bVar.m("gcm.n.sticky");
        bVar.m("gcm.n.local_only");
        bVar.m("gcm.n.default_sound");
        bVar.m("gcm.n.default_vibrate_timings");
        bVar.m("gcm.n.default_light_settings");
        bVar.s();
        bVar.p();
        bVar.v();
    }

    public static com.google.android.gms.tasks.q a(Context context, Intent intent, boolean z) {
        y yVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (c) {
            try {
                if (d == null) {
                    d = new y(context);
                }
                yVar = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z) {
            return yVar.b(intent).j(new androidx.arch.core.executor.a(2), new com.google.firebase.components.s(21));
        }
        if (o.w().B(context)) {
            synchronized (v.a) {
                try {
                    v.a(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        v.b.a();
                    }
                    com.google.android.gms.tasks.q qVarB = yVar.b(intent);
                    com.google.android.datatransport.runtime.scheduling.jobscheduling.l lVar = new com.google.android.datatransport.runtime.scheduling.jobscheduling.l(intent, 8);
                    qVarB.getClass();
                    qVarB.b.h(new com.google.android.gms.tasks.n(com.google.android.gms.tasks.k.a, lVar));
                    qVarB.p();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            yVar.b(intent);
        }
        return kotlin.math.a.t(-1);
    }

    public com.google.android.gms.tasks.q b(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = (Context) this.a;
        androidx.arch.core.executor.a aVar = (androidx.arch.core.executor.a) this.b;
        boolean z = com.google.android.gms.common.util.b.a() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z2 = (intent.getFlags() & 268435456) != 0;
        return (!z || z2) ? kotlin.math.a.l(aVar, new Callable() { // from class: com.google.firebase.messaging.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                ServiceInfo serviceInfo;
                String str2;
                int i;
                ComponentName componentNameStartService;
                Context context2 = context;
                Intent intent2 = intent;
                o oVarW = o.w();
                oVarW.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) oVarW.B).offer(intent2);
                Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent3.setPackage(context2.getPackageName());
                synchronized (oVarW) {
                    try {
                        str = (String) oVarW.y;
                        if (str == null) {
                            ResolveInfo resolveInfoResolveService = context2.getPackageManager().resolveService(intent3, 0);
                            if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                                Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                            } else if (!context2.getPackageName().equals(serviceInfo.packageName) || (str2 = serviceInfo.name) == null) {
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            } else {
                                if (str2.startsWith(".")) {
                                    oVarW.y = context2.getPackageName() + serviceInfo.name;
                                } else {
                                    oVarW.y = serviceInfo.name;
                                }
                                str = (String) oVarW.y;
                            }
                            str = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (str != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str));
                    }
                    intent3.setClassName(context2.getPackageName(), str);
                }
                try {
                    if (oVarW.B(context2)) {
                        componentNameStartService = v.i(context2, intent3);
                    } else {
                        componentNameStartService = context2.startService(intent3);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (componentNameStartService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i = 404;
                    } else {
                        i = -1;
                    }
                } catch (IllegalStateException e) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e);
                    i = 402;
                } catch (SecurityException e2) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
                    i = 401;
                }
                return Integer.valueOf(i);
            }
        }).d(aVar, new com.google.android.gms.tasks.b() { // from class: com.google.firebase.messaging.f
            @Override // com.google.android.gms.tasks.b
            public final Object d(com.google.android.gms.tasks.i iVar) {
                return (com.google.android.gms.common.util.b.a() && ((Integer) iVar.f()).intValue() == 402) ? g.a(context, intent, z2).j(new androidx.arch.core.executor.a(2), new com.google.firebase.components.s(20)) : iVar;
            }
        }) : a(context, intent, z2);
    }

    public g(Context context) {
        this.a = context;
        this.b = new androidx.arch.core.executor.a(2);
    }

    public g(ExecutorService executorService) {
        this.b = new androidx.collection.f(0);
        this.a = executorService;
    }

    public g(androidx.core.app.h hVar, String str) {
        this.a = hVar;
        this.b = str;
    }
}
