package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.w0;
import androidx.media3.ui.c0;
import com.google.common.collect.a1;
import com.google.common.collect.d0;
import com.google.common.collect.h0;
import com.google.firebase.crashlytics.internal.common.w;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements l, com.google.android.datatransport.f {
    public final /* synthetic */ Object A;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ e(Object obj, Object obj2, boolean z, Object obj3) {
        this.y = obj;
        this.z = obj2;
        this.e = z;
        this.A = obj3;
    }

    @Override // androidx.media3.exoplayer.trackselection.l
    public a1 a(int i, w0 w0Var, int[] iArr) {
        o oVar = (o) this.y;
        j jVar = (j) this.z;
        int[] iArr2 = (int[]) this.A;
        oVar.getClass();
        androidx.media3.exoplayer.analytics.c cVar = new androidx.media3.exoplayer.analytics.c(4, oVar, jVar);
        int i2 = iArr2[i];
        d0 d0VarK = h0.k();
        for (int i3 = 0; i3 < w0Var.a; i3++) {
            d0VarK.b(new f(i, w0Var, i3, jVar, iArr[i3], this.e, cVar, i2));
        }
        return d0VarK.g();
    }

    @Override // com.google.android.datatransport.f
    public void g(Exception exc) throws Throwable {
        com.google.firebase.crashlytics.internal.send.b bVar = (com.google.firebase.crashlytics.internal.send.b) this.y;
        com.google.android.gms.tasks.j jVar = (com.google.android.gms.tasks.j) this.z;
        com.google.firebase.crashlytics.internal.common.b bVar2 = (com.google.firebase.crashlytics.internal.common.b) this.A;
        if (exc != null) {
            jVar.c(exc);
            return;
        }
        if (this.e) {
            boolean z = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new c0(11, bVar, countDownLatch)).start();
            ExecutorService executorService = w.a;
            boolean z2 = false;
            try {
                long jNanoTime = 2000000000;
                long jNanoTime2 = System.nanoTime() + 2000000000;
                while (true) {
                    try {
                        try {
                            countDownLatch.await(jNanoTime, TimeUnit.NANOSECONDS);
                            break;
                        } catch (InterruptedException unused) {
                            jNanoTime = jNanoTime2 - System.nanoTime();
                            z2 = true;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                }
                if (z2) {
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable th2) {
                th = th2;
                z = z2;
            }
        }
        jVar.d(bVar2);
    }
}
