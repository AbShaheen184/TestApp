package kotlinx.coroutines.channels;

import kotlin.coroutines.i;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.intrinsics.CancellableKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class LazyBroadcastCoroutine<E> extends BroadcastCoroutine<E> {
    private final kotlin.coroutines.d<y> continuation;

    public LazyBroadcastCoroutine(i iVar, BroadcastChannel<E> broadcastChannel, p pVar) {
        super(iVar, broadcastChannel, false);
        this.continuation = com.google.android.material.shape.e.b(pVar, this, this);
    }

    @Override // kotlinx.coroutines.JobSupport
    public void onStart() throws Throwable {
        CancellableKt.startCoroutineCancellable(this.continuation, this);
    }

    @Override // kotlinx.coroutines.channels.BroadcastCoroutine, kotlinx.coroutines.channels.BroadcastChannel
    public ReceiveChannel<E> openSubscription() {
        ReceiveChannel<E> receiveChannelOpenSubscription = get_channel().openSubscription();
        start();
        return receiveChannelOpenSubscription;
    }
}
