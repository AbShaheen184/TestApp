package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.i0;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Handler.Callback {
    public static final Status L = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status M = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object N = new Object();
    public static e O;
    public com.google.android.gms.common.internal.service.c A;
    public final Context B;
    public final com.google.android.gms.common.e C;
    public final coil3.memory.c D;
    public final AtomicInteger E;
    public final AtomicInteger F;
    public final ConcurrentHashMap G;
    public final androidx.collection.h H;
    public final androidx.collection.h I;
    public final com.google.android.gms.internal.base.g J;
    public volatile boolean K;
    public long e;
    public boolean y;
    public com.google.android.gms.common.internal.m z;

    public e(Context context, Looper looper) {
        com.google.android.gms.common.e eVar = com.google.android.gms.common.e.d;
        this.e = 10000L;
        this.y = false;
        this.E = new AtomicInteger(1);
        this.F = new AtomicInteger(0);
        this.G = new ConcurrentHashMap(5, 0.75f, 1);
        this.H = new androidx.collection.h(0);
        this.I = new androidx.collection.h(0);
        this.K = true;
        this.B = context;
        com.google.android.gms.internal.base.g gVar = new com.google.android.gms.internal.base.g(looper, this);
        Looper.getMainLooper();
        this.J = gVar;
        this.C = eVar;
        this.D = new coil3.memory.c(22);
        PackageManager packageManager = context.getPackageManager();
        if (com.google.android.gms.common.util.b.f == null) {
            com.google.android.gms.common.util.b.f = Boolean.valueOf(com.google.android.gms.common.util.b.a() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (com.google.android.gms.common.util.b.f.booleanValue()) {
            this.K = false;
        }
        gVar.sendMessage(gVar.obtainMessage(6));
    }

    public static Status c(b bVar, com.google.android.gms.common.b bVar2) {
        return new Status(17, coil3.compose.internal.f.e("API: ", (String) bVar.b.z, " is not available on this device. Connection failed with: ", String.valueOf(bVar2)), bVar2.z, bVar2);
    }

    public static e e(Context context) {
        e eVar;
        HandlerThread handlerThread;
        synchronized (N) {
            if (O == null) {
                synchronized (i0.g) {
                    try {
                        handlerThread = i0.i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            i0.i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = i0.i;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = com.google.android.gms.common.e.c;
                O = new e(applicationContext, looper);
            }
            eVar = O;
        }
        return eVar;
    }

    public final boolean a() {
        com.google.android.gms.common.internal.k kVar;
        if (this.y) {
            return false;
        }
        synchronized (com.google.android.gms.common.internal.k.class) {
            try {
                if (com.google.android.gms.common.internal.k.y == null) {
                    com.google.android.gms.common.internal.k.y = new com.google.android.gms.common.internal.k(0);
                }
                kVar = com.google.android.gms.common.internal.k.y;
            } catch (Throwable th) {
                throw th;
            }
        }
        kVar.getClass();
        int i = ((SparseIntArray) this.D.y).get(203400000, -1);
        return i == -1 || i == 0;
    }

    public final boolean b(com.google.android.gms.common.b bVar, int i) {
        com.google.android.gms.common.e eVar = this.C;
        eVar.getClass();
        Context context = this.B;
        if (!com.google.android.gms.common.wrappers.a.e(context)) {
            int i2 = bVar.y;
            PendingIntent activity = bVar.z;
            if (!((i2 == 0 || activity == null) ? false : true)) {
                activity = null;
                Intent intentA = eVar.a(i2, context, null);
                if (intentA != null) {
                    activity = PendingIntent.getActivity(context, 0, intentA, 201326592);
                }
            }
            if (activity != null) {
                int i3 = GoogleApiActivity.y;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                eVar.f(context, i2, PendingIntent.getActivity(context, 0, intent, com.google.android.gms.internal.base.f.a | 134217728));
                return true;
            }
        }
        return false;
    }

    public final k d(com.google.android.gms.common.api.f fVar) {
        b bVar = fVar.e;
        ConcurrentHashMap concurrentHashMap = this.G;
        k kVar = (k) concurrentHashMap.get(bVar);
        if (kVar == null) {
            kVar = new k(this, fVar);
            concurrentHashMap.put(bVar, kVar);
        }
        if (kVar.e.l()) {
            this.I.add(bVar);
        }
        kVar.n();
        return kVar;
    }

    public final void f(com.google.android.gms.common.b bVar, int i) {
        if (b(bVar, i)) {
            return;
        }
        com.google.android.gms.internal.base.g gVar = this.J;
        gVar.sendMessage(gVar.obtainMessage(5, i, 0, bVar));
    }

    /* JADX WARN: Code duplicated, block: B:165:0x0315  */
    /* JADX WARN: Code duplicated, block: B:167:0x031b  */
    /* JADX WARN: Code duplicated, block: B:169:0x0339  */
    /* JADX WARN: Code duplicated, block: B:171:0x0343  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v5 com.google.android.gms.common.api.internal.k, still in use, count: 2, list:
          (r3v5 com.google.android.gms.common.api.internal.k) from 0x030d: IGET (r3v5 com.google.android.gms.common.api.internal.k) A[WRAPPED] (LINE:782) com.google.android.gms.common.api.internal.k.j int
          (r3v5 com.google.android.gms.common.api.internal.k) from 0x0313: PHI (r3 I:??) = (r3v2 com.google.android.gms.common.api.internal.k), (r3v5 com.google.android.gms.common.api.internal.k) binds: [B:163:0x0312, B:218:0x0313] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r13) {
        /*
            Method dump skipped, instruction units count: 1040
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.e.handleMessage(android.os.Message):boolean");
    }
}
