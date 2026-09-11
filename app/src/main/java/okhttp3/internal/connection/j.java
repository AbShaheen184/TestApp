package okhttp3.internal.connection;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Runnable {
    public final okhttp3.h e;
    public volatile AtomicInteger y = new AtomicInteger(0);
    public final /* synthetic */ m z;

    public j(m mVar, okhttp3.h hVar) {
        this.z = mVar;
        this.e = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.firebase.messaging.o oVar;
        String strConcat = "OkHttp ".concat(this.z.y.a.h());
        m mVar = this.z;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(strConcat);
        try {
            mVar.B.i();
            boolean z = false;
            try {
                try {
                    try {
                        this.e.d(mVar, mVar.g());
                        oVar = mVar.e.a;
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            okhttp3.internal.platform.e eVar = okhttp3.internal.platform.e.a;
                            okhttp3.internal.platform.e.a.i(4, "Callback failure for ".concat(m.a(mVar)), e);
                        } else {
                            this.e.f(mVar, e);
                        }
                        oVar = mVar.e.a;
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        mVar.cancel();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            iOException.initCause(th);
                            this.e.f(mVar, iOException);
                        }
                        if (!(th instanceof InterruptedException)) {
                            throw th;
                        }
                        Thread.currentThread().interrupt();
                        oVar = mVar.e.a;
                    }
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th2) {
                    th = th2;
                }
                oVar.getClass();
                com.google.firebase.messaging.o.C(oVar, null, null, this, 3);
                threadCurrentThread.setName(name);
            } catch (Throwable th3) {
                com.google.firebase.messaging.o oVar2 = mVar.e.a;
                oVar2.getClass();
                com.google.firebase.messaging.o.C(oVar2, null, null, this, 3);
                throw th3;
            }
        } catch (Throwable th4) {
            threadCurrentThread.setName(name);
            throw th4;
        }
    }
}
