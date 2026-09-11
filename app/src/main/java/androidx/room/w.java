package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements Executor {
    public final Executor e;
    public Runnable z;
    public final ArrayDeque y = new ArrayDeque();
    public final Object A = new Object();

    public w(Executor executor) {
        this.e = executor;
    }

    public final void a() {
        synchronized (this.A) {
            Object objPoll = this.y.poll();
            Runnable runnable = (Runnable) objPoll;
            this.z = runnable;
            if (objPoll != null) {
                this.e.execute(runnable);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.A) {
            this.y.offer(new androidx.media3.ui.c0(1, runnable, this));
            if (this.z == null) {
                a();
            }
        }
    }
}
