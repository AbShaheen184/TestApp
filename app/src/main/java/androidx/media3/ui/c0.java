package androidx.media3.ui;

import android.app.job.JobParameters;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.measurement.internal.r2;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.android.HandlerContext;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ c0(com.google.firebase.crashlytics.internal.common.q qVar, Throwable th) {
        this.e = 10;
        Map map = Collections.EMPTY_MAP;
        this.y = qVar;
        this.z = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.firebase.inject.a aVar;
        switch (this.e) {
            case 0:
                h0.a((h0) this.y, (Bitmap) this.z);
                return;
            case 1:
                Runnable runnable = (Runnable) this.y;
                androidx.room.w wVar = (androidx.room.w) this.z;
                try {
                    runnable.run();
                    return;
                } finally {
                    wVar.a();
                }
            case 2:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.y;
                JobParameters jobParameters = (JobParameters) this.z;
                int i = JobInfoSchedulerService.e;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 3:
                ((com.google.common.util.concurrent.c0) this.y).t((ListenableFuture) this.z);
                return;
            case 4:
                ((com.google.common.util.concurrent.c0) this.y).q((com.google.common.collect.b0) this.z);
                return;
            case 5:
                com.google.firebase.components.p pVar = (com.google.firebase.components.p) this.y;
                com.google.firebase.inject.b bVar = (com.google.firebase.inject.b) this.z;
                if (pVar.b != com.google.firebase.components.p.d) {
                    net.luminis.tls.engine.impl.c.r("provide() can be called only once.");
                    return;
                }
                synchronized (pVar) {
                    aVar = pVar.a;
                    pVar.a = null;
                    pVar.b = bVar;
                    break;
                }
                aVar.e(bVar);
                return;
            case 6:
                com.google.firebase.components.o oVar = (com.google.firebase.components.o) this.y;
                com.google.firebase.inject.b bVar2 = (com.google.firebase.inject.b) this.z;
                synchronized (oVar) {
                    try {
                        if (oVar.b == null) {
                            oVar.a.add(bVar2);
                        } else {
                            oVar.b.add(bVar2.get());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 7:
                com.google.firebase.concurrent.a aVar2 = (com.google.firebase.concurrent.a) this.y;
                Runnable runnable2 = (Runnable) this.z;
                Process.setThreadPriority(aVar2.c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
            case 8:
                Callable callable = (Callable) this.y;
                com.google.firebase.concurrent.h hVar = (com.google.firebase.concurrent.h) ((com.google.android.material.shape.c0) this.z).e;
                try {
                    hVar.l(callable.call());
                    return;
                } catch (Exception e) {
                    hVar.m(e);
                    return;
                }
            case 9:
                ((com.google.firebase.crashlytics.internal.common.m) this.y).c((String) this.z, Boolean.FALSE);
                return;
            case 10:
                com.google.firebase.crashlytics.internal.common.q qVar = (com.google.firebase.crashlytics.internal.common.q) this.y;
                Throwable th2 = (Throwable) this.z;
                Map map = Collections.EMPTY_MAP;
                com.google.firebase.crashlytics.internal.common.m mVar = qVar.g;
                Thread threadCurrentThread = Thread.currentThread();
                mVar.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                com.google.firebase.crashlytics.internal.common.s sVar = mVar.n;
                if (sVar == null || !sVar.e.get()) {
                    long j = jCurrentTimeMillis / 1000;
                    String strE = mVar.e();
                    if (strE == null) {
                        Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
                        return;
                    }
                    com.google.firebase.crashlytics.internal.metadata.c cVar = new com.google.firebase.crashlytics.internal.metadata.c(strE, j, map);
                    com.google.firebase.crashlytics.internal.persistence.c cVar2 = mVar.m;
                    cVar2.getClass();
                    String strConcat = "Persisting non-fatal event for session ".concat(strE);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", strConcat, null);
                    }
                    cVar2.h(th2, threadCurrentThread, "error", cVar, false);
                    return;
                }
                return;
            case 11:
                com.google.firebase.crashlytics.internal.send.b bVar3 = (com.google.firebase.crashlytics.internal.send.b) this.y;
                CountDownLatch countDownLatch = (CountDownLatch) this.z;
                try {
                    androidx.compose.runtime.internal.c cVar3 = bVar3.h;
                    com.google.android.datatransport.runtime.r.a().d.c(((com.google.android.datatransport.runtime.i) cVar3.e).b(com.google.android.datatransport.d.z), 1);
                    break;
                } catch (Exception unused) {
                }
                countDownLatch.countDown();
                return;
            case 12:
                ((r2) this.y).a((Intent) this.z);
                return;
            case 13:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.y;
                com.google.android.gms.tasks.j jVar = (com.google.android.gms.tasks.j) this.z;
                try {
                    jVar.b(firebaseMessaging.a());
                    return;
                } catch (Exception e2) {
                    jVar.a(e2);
                    return;
                }
            case 14:
                com.google.firebase.messaging.j jVar2 = (com.google.firebase.messaging.j) this.y;
                com.google.android.gms.tasks.j jVar3 = (com.google.android.gms.tasks.j) this.z;
                try {
                    jVar3.b(jVar2.a());
                    return;
                } catch (Exception e3) {
                    jVar3.a(e3);
                    return;
                }
            default:
                HandlerContext.scheduleResumeAfterDelay$lambda$1((CancellableContinuation) this.y, (HandlerContext) this.z);
                return;
        }
    }

    public /* synthetic */ c0(com.google.common.util.concurrent.c0 c0Var, int i, ListenableFuture listenableFuture) {
        this.e = 3;
        this.y = c0Var;
        this.z = listenableFuture;
    }

    public /* synthetic */ c0(int i, Object obj, Object obj2) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
    }
}
