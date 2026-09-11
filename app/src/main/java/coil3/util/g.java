package coil3.util;

import androidx.lifecycle.v;
import kotlin.y;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements androidx.lifecycle.f {
    public final /* synthetic */ CancellableContinuationImpl e;

    public g(CancellableContinuationImpl cancellableContinuationImpl) {
        this.e = cancellableContinuationImpl;
    }

    @Override // androidx.lifecycle.f
    public final void z(v vVar) {
        this.e.resumeWith(y.a);
    }
}
