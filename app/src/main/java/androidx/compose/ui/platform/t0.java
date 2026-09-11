package androidx.compose.ui.platform;

import android.view.Choreographer;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements Choreographer.FrameCallback {
    public final /* synthetic */ CancellableContinuationImpl e;
    public final /* synthetic */ kotlin.jvm.functions.l y;

    public t0(CancellableContinuationImpl cancellableContinuationImpl, androidx.compose.runtime.e eVar, kotlin.jvm.functions.l lVar) {
        this.e = cancellableContinuationImpl;
        this.y = lVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object lVar;
        try {
            lVar = this.y.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            lVar = new kotlin.l(th);
        }
        this.e.resumeWith(lVar);
    }
}
