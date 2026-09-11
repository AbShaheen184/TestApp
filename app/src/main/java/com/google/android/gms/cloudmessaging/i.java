package com.google.android.gms.cloudmessaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.measurement.internal.k0;
import com.google.android.gms.measurement.internal.o3;
import com.google.android.gms.measurement.internal.o4;
import com.google.android.gms.measurement.internal.s1;
import com.google.android.gms.measurement.internal.t4;
import com.google.android.gms.measurement.internal.u;
import com.google.android.gms.measurement.internal.x0;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ Parcelable z;

    public i(o3 o3Var, t4 t4Var, boolean z, com.google.android.gms.measurement.internal.e eVar) {
        this.e = 3;
        this.z = t4Var;
        this.y = z;
        this.A = eVar;
        Objects.requireNonNull(o3Var);
        this.B = o3Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Executor executorUnconfigurableExecutorService;
        int iA;
        switch (this.e) {
            case 0:
                Intent intent = (Intent) this.z;
                Context context = (Context) this.A;
                boolean z = this.y;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.B;
                try {
                    Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
                    Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    if (intent2 == null) {
                        int iIntValue = 500;
                        if (intent.getExtras() != null) {
                            a aVar = new a(intent);
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            synchronized (FirebaseInstanceIdReceiver.class) {
                                try {
                                    SoftReference softReference = FirebaseInstanceIdReceiver.b;
                                    executorUnconfigurableExecutorService = softReference != null ? (Executor) softReference.get() : null;
                                    if (executorUnconfigurableExecutorService == null) {
                                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.google.android.gms.common.util.concurrent.a("pscm-ack-executor", 0));
                                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                                        executorUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                        FirebaseInstanceIdReceiver.b = new SoftReference(executorUnconfigurableExecutorService);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                                break;
                            }
                            executorUnconfigurableExecutorService.execute(new androidx.core.provider.m(2, context, aVar, countDownLatch));
                            try {
                                iIntValue = ((Integer) kotlin.math.a.f(new com.google.firebase.messaging.g(context).b(intent))).intValue();
                            } catch (InterruptedException | ExecutionException e) {
                                Log.e("FirebaseMessaging", "Failed to send message to service.", e);
                            }
                            try {
                                if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                                    Log.w("CloudMessagingReceiver", "Message ack timed out");
                                }
                            } catch (InterruptedException e2) {
                                Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e2.toString()));
                            }
                        }
                        iA = iIntValue;
                        break;
                    } else {
                        iA = FirebaseInstanceIdReceiver.a(intent2);
                    }
                    if (z && pendingResult != null) {
                        pendingResult.setResultCode(iA);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th2;
                }
            case 1:
                o3 o3Var = (o3) this.B;
                k0 k0Var = o3Var.A;
                if (k0Var != null) {
                    o3Var.N(k0Var, this.y ? null : (o4) this.A, (t4) this.z);
                    o3Var.I();
                    return;
                } else {
                    x0 x0Var = ((s1) o3Var.e).C;
                    s1.m(x0Var);
                    x0Var.C.a("Discarding data. Failed to set user property");
                    return;
                }
            case 2:
                o3 o3Var2 = (o3) this.B;
                k0 k0Var2 = o3Var2.A;
                if (k0Var2 != null) {
                    o3Var2.N(k0Var2, this.y ? null : (u) this.A, (t4) this.z);
                    o3Var2.I();
                    return;
                } else {
                    x0 x0Var2 = ((s1) o3Var2.e).C;
                    s1.m(x0Var2);
                    x0Var2.C.a("Discarding data. Failed to send event to service");
                    return;
                }
            default:
                o3 o3Var3 = (o3) this.B;
                k0 k0Var3 = o3Var3.A;
                if (k0Var3 != null) {
                    o3Var3.N(k0Var3, this.y ? null : (com.google.android.gms.measurement.internal.e) this.A, (t4) this.z);
                    o3Var3.I();
                    return;
                } else {
                    x0 x0Var3 = ((s1) o3Var3.e).C;
                    s1.m(x0Var3);
                    x0Var3.C.a("Discarding data. Failed to send conditional user property to service");
                    return;
                }
        }
    }

    public /* synthetic */ i(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.e = 0;
        this.z = intent;
        this.A = context;
        this.y = z;
        this.B = pendingResult;
    }

    public /* synthetic */ i(o3 o3Var, t4 t4Var, boolean z, com.google.android.gms.common.internal.safeparcel.a aVar, int i) {
        this.e = i;
        this.z = t4Var;
        this.y = z;
        this.A = aVar;
        this.B = o3Var;
    }
}
