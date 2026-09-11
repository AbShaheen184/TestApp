package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Random;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.android.HandlerDispatcherKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Choreographer.FrameCallback {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ Object y;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        switch (this.e) {
            case 0:
                (Build.VERSION.SDK_INT >= 28 ? f.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new e((Context) this.y, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            default:
                HandlerDispatcherKt.postFrameCallback$lambda$5((CancellableContinuation) this.y, j);
                break;
        }
    }

    public /* synthetic */ d(CancellableContinuation cancellableContinuation) {
        this.y = cancellableContinuation;
    }
}
