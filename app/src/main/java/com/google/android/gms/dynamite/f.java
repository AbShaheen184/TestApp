package com.google.android.gms.dynamite;

import android.os.Process;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l;
import com.google.android.gms.measurement.internal.c0;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends Thread {
    public final /* synthetic */ int e = 2;

    public /* synthetic */ f(String str) {
        super(str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
                break;
            case 1:
                DebugProbesImpl.startWeakRefCleanerThread$lambda$2();
                return;
        }
        while (true) {
            try {
                l lVar = okio.c.h;
                ReentrantLock reentrantLock = okio.c.j;
                reentrantLock.lock();
                try {
                    okio.c cVarO = c0.o();
                    if (cVarO == okio.c.i) {
                        okio.c.i = null;
                        reentrantLock.unlock();
                        return;
                    } else {
                        reentrantLock.unlock();
                        if (cVarO != null) {
                            cVarO.l();
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused2) {
            }
        }
    }

    public /* synthetic */ f(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }

    public f(kotlinx.coroutines.debug.internal.b bVar) {
    }
}
