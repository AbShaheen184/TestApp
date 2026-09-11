package androidx.compose.ui.platform;

import android.os.Trace;
import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ u y;

    public /* synthetic */ i(u uVar, int i) {
        this.e = i;
        this.y = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                kotlin.collections.k kVar = this.y.E;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!kVar.isEmpty()) {
                    try {
                        ((kotlin.jvm.functions.a) kVar.removeLast()).invoke();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                Trace.endSection();
                return;
            default:
                u uVar = this.y;
                uVar.Z0 = false;
                MotionEvent motionEvent = uVar.R0;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    uVar.J(motionEvent);
                    return;
                } else {
                    net.luminis.tls.engine.impl.c.r("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
        }
    }
}
