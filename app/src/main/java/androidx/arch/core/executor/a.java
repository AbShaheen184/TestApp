package androidx.arch.core.executor;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Executor {
    public final /* synthetic */ int e;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.e) {
            case 0:
                b.O().l.m.execute(runnable);
                break;
            case 1:
                break;
            default:
                runnable.run();
                break;
        }
    }

    private final void a(Runnable runnable) {
    }
}
