package com.google.android.datatransport.runtime;

import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements Runnable {
    public final /* synthetic */ int e;
    public final Runnable y;

    public /* synthetic */ o(int i, Runnable runnable) {
        this.e = i;
        this.y = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                try {
                    this.y.run();
                } catch (Exception e) {
                    org.jsoup.helper.n.l("Executor", "Background execution failure.", e);
                    return;
                }
                break;
            case 1:
                Process.setThreadPriority(0);
                this.y.run();
                break;
            case 2:
                this.y.run();
                break;
            default:
                this.y.run();
                break;
        }
    }

    public String toString() {
        switch (this.e) {
            case 2:
                return this.y.toString();
            case 3:
                return this.y.toString();
            default:
                return super.toString();
        }
    }
}
