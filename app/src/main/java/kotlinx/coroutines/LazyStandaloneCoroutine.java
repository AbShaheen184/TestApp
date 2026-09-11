package kotlinx.coroutines;

import com.google.android.material.shape.e;
import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.intrinsics.CancellableKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class LazyStandaloneCoroutine extends StandaloneCoroutine {
    private final d<y> continuation;

    public LazyStandaloneCoroutine(i iVar, p pVar) {
        super(iVar, false);
        this.continuation = e.b(pVar, this, this);
    }

    @Override // kotlinx.coroutines.JobSupport
    public void onStart() throws Throwable {
        CancellableKt.startCoroutineCancellable(this.continuation, this);
    }
}
