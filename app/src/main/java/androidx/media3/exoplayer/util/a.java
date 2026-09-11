package androidx.media3.exoplayer.util;

import com.google.common.util.concurrent.h0;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Executor {
    public final /* synthetic */ int e;
    public final /* synthetic */ Executor y;
    public final /* synthetic */ Object z;

    public /* synthetic */ a(Executor executor, Object obj, int i) {
        this.e = i;
        this.y = executor;
        this.z = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.e) {
            case 0:
                this.y.execute(runnable);
                break;
            default:
                try {
                    this.y.execute(runnable);
                } catch (RejectedExecutionException e) {
                    ((h0) this.z).m(e);
                    return;
                }
                break;
        }
    }
}
