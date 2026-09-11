package androidx.core.provider;

import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends Thread {
    public final int e;

    public j(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.e = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.e);
        super.run();
    }
}
