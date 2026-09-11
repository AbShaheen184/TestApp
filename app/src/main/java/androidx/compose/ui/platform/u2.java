package androidx.compose.ui.platform;

import android.view.View;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u2 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ Job e;

    public u2(Job job) {
        this.e = job;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        Job.DefaultImpls.cancel$default(this.e, (CancellationException) null, 1, (Object) null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
