package kotlinx.coroutines.android;

import kotlin.c;
import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.jvm.internal.f;
import kotlin.y;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class HandlerDispatcher extends MainCoroutineDispatcher implements Delay {
    public /* synthetic */ HandlerDispatcher(f fVar) {
        this();
    }

    @Override // kotlinx.coroutines.Delay
    @c
    public Object delay(long j, d<? super y> dVar) {
        return Delay.DefaultImpls.delay(this, j, dVar);
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher
    public abstract HandlerDispatcher getImmediate();

    public DisposableHandle invokeOnTimeout(long j, Runnable runnable, i iVar) {
        return Delay.DefaultImpls.invokeOnTimeout(this, j, runnable, iVar);
    }

    private HandlerDispatcher() {
    }
}
