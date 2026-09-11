package com.google.android.material.behavior;

import android.view.View;
import com.google.android.material.shape.e;
import com.google.common.util.concurrent.x0;
import com.google.firebase.concurrent.i;
import java.util.concurrent.Executor;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;
import retrofit2.w;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable {
    public final /* synthetic */ int e;
    public Object y;
    public final /* synthetic */ Object z;

    public d(w wVar, Throwable th) {
        this.e = 3;
        this.y = wVar;
        this.z = th;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x0041 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:101:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r1 == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        ((java.lang.Runnable) r10.y).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0061, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0062, code lost:
    
        com.google.firebase.concurrent.i.C.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.y), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007f, code lost:
    
        r10.y = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0081, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d1, code lost:
    
        if (r1 == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00da, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00dc, code lost:
    
        ((java.lang.Runnable) r10.y).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ea, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00eb, code lost:
    
        com.google.common.util.concurrent.x0.C.a().log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.y), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x010c, code lost:
    
        r10.y = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x010e, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a() {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.d.a():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                androidx.customview.widget.d dVar = ((SwipeDismissBehavior) this.z).a;
                if (dVar == null || !dVar.f()) {
                    return;
                }
                ((View) this.y).postOnAnimation(this);
                return;
            case 1:
                try {
                    a();
                    return;
                } catch (Error e) {
                    synchronized (((x0) this.z).y) {
                        ((x0) this.z).z = 1;
                        throw e;
                    }
                }
            case 2:
                try {
                    a();
                    return;
                } catch (Error e2) {
                    synchronized (((i) this.z).y) {
                        ((i) this.z).z = 1;
                        throw e2;
                    }
                }
            default:
                e.g((w) this.y).resumeWith(kotlin.a.b((Throwable) this.z));
                return;
        }
    }

    public String toString() {
        String str;
        String str2;
        switch (this.e) {
            case 1:
                Runnable runnable = (Runnable) this.y;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i = ((x0) this.z).z;
                if (i == 1) {
                    str = "IDLE";
                } else if (i == 2) {
                    str = "QUEUING";
                } else if (i != 3) {
                    str = i != 4 ? "null" : DebugCoroutineInfoImplKt.RUNNING;
                } else {
                    str = "QUEUED";
                }
                sb.append(str);
                sb.append("}");
                return sb.toString();
            case 2:
                Runnable runnable2 = (Runnable) this.y;
                if (runnable2 != null) {
                    return "SequentialExecutorWorker{running=" + runnable2 + "}";
                }
                StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
                int i2 = ((i) this.z).z;
                if (i2 == 1) {
                    str2 = "IDLE";
                } else if (i2 == 2) {
                    str2 = "QUEUING";
                } else if (i2 != 3) {
                    str2 = i2 != 4 ? "null" : DebugCoroutineInfoImplKt.RUNNING;
                } else {
                    str2 = "QUEUED";
                }
                sb2.append(str2);
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ d(Executor executor, int i) {
        this.e = i;
        this.z = executor;
    }

    public d(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.e = 0;
        this.z = swipeDismissBehavior;
        this.y = view;
    }
}
