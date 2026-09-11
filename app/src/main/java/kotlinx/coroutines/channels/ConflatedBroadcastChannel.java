package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.l;
import kotlin.y;
import kotlinx.coroutines.ObsoleteCoroutinesApi;
import kotlinx.coroutines.selects.SelectClause2;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@ObsoleteCoroutinesApi
@kotlin.c
public final class ConflatedBroadcastChannel<E> implements BroadcastChannel<E> {
    private final BroadcastChannelImpl<E> broadcast;

    public ConflatedBroadcastChannel() {
        this(new BroadcastChannelImpl(-1));
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    @kotlin.c
    public /* synthetic */ boolean cancel(Throwable th) {
        return this.broadcast.cancel(th);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(Throwable th) {
        return this.broadcast.close(th);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public SelectClause2<E, SendChannel<E>> getOnSend() {
        return this.broadcast.getOnSend();
    }

    public final E getValue() {
        return this.broadcast.getValue();
    }

    public final E getValueOrNull() {
        return this.broadcast.getValueOrNull();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public void invokeOnClose(l lVar) {
        this.broadcast.invokeOnClose(lVar);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        return this.broadcast.isClosedForSend();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @kotlin.c
    public boolean offer(E e) {
        return this.broadcast.offer(e);
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    public ReceiveChannel<E> openSubscription() {
        return this.broadcast.openSubscription();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public Object send(E e, kotlin.coroutines.d<? super y> dVar) {
        return this.broadcast.send(e, dVar);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public Object mo28trySendJP2dKIU(E e) {
        return this.broadcast.mo28trySendJP2dKIU(e);
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    public void cancel(CancellationException cancellationException) {
        this.broadcast.cancel(cancellationException);
    }

    private ConflatedBroadcastChannel(BroadcastChannelImpl<E> broadcastChannelImpl) {
        this.broadcast = broadcastChannelImpl;
    }

    public ConflatedBroadcastChannel(E e) {
        this();
        mo28trySendJP2dKIU(e);
    }
}
