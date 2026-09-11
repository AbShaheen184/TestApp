package androidx.compose.ui.text.input;

import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements Choreographer.FrameCallback {
    public final /* synthetic */ int e;
    public final /* synthetic */ Runnable y;

    public /* synthetic */ c0(int i, Runnable runnable) {
        this.e = i;
        this.y = runnable;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        switch (this.e) {
            case 0:
                this.y.run();
                break;
            default:
                this.y.run();
                break;
        }
    }
}
