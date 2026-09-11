package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.i;
import kotlin.jvm.functions.l;
import kotlin.y;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.selects.SelectClause1;
import kotlinx.coroutines.selects.SelectClause2;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class ChannelCoroutine<E> extends AbstractCoroutine<y> implements Channel<E> {
    private final Channel<E> _channel;

    public ChannelCoroutine(i iVar, Channel<E> channel, boolean z, boolean z2) {
        super(iVar, z, z2);
        this._channel = channel;
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(cancellationExceptionMessage(), null, this);
        }
        cancelInternal(cancellationException);
    }

    @Override // kotlinx.coroutines.JobSupport
    public void cancelInternal(Throwable th) {
        CancellationException cancellationException$default = JobSupport.toCancellationException$default(this, th, null, 1, null);
        this._channel.cancel(cancellationException$default);
        cancelCoroutine(cancellationException$default);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(Throwable th) {
        return this._channel.close(th);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public SelectClause1<E> getOnReceive() {
        return this._channel.getOnReceive();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public SelectClause1<ChannelResult<E>> getOnReceiveCatching() {
        return this._channel.getOnReceiveCatching();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public SelectClause1<E> getOnReceiveOrNull() {
        return this._channel.getOnReceiveOrNull();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public SelectClause2<E, SendChannel<E>> getOnSend() {
        return this._channel.getOnSend();
    }

    public final Channel<E> get_channel() {
        return this._channel;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public void invokeOnClose(l lVar) {
        this._channel.invokeOnClose(lVar);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isClosedForReceive() {
        return this._channel.isClosedForReceive();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        return this._channel.isClosedForSend();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isEmpty() {
        return this._channel.isEmpty();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public ChannelIterator<E> iterator() {
        return this._channel.iterator();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @kotlin.c
    public boolean offer(E e) {
        return this._channel.offer(e);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @kotlin.c
    public E poll() {
        return this._channel.poll();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public Object receive(kotlin.coroutines.d<? super E> dVar) {
        return this._channel.receive(dVar);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* JADX INFO: renamed from: receiveCatching-JP2dKIU */
    public Object mo34receiveCatchingJP2dKIU(kotlin.coroutines.d<? super ChannelResult<? extends E>> dVar) {
        return this._channel.mo34receiveCatchingJP2dKIU(dVar);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @kotlin.c
    public Object receiveOrNull(kotlin.coroutines.d<? super E> dVar) {
        return this._channel.receiveOrNull(dVar);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public Object send(E e, kotlin.coroutines.d<? super y> dVar) {
        return this._channel.send(e, dVar);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* JADX INFO: renamed from: tryReceive-PtdJZtk */
    public Object mo35tryReceivePtdJZtk() {
        return this._channel.mo35tryReceivePtdJZtk();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public Object mo28trySendJP2dKIU(E e) {
        return this._channel.mo28trySendJP2dKIU(e);
    }

    public final Channel<E> getChannel() {
        return this;
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    @kotlin.c
    public /* synthetic */ void cancel() {
        cancelInternal(new JobCancellationException(cancellationExceptionMessage(), null, this));
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    @kotlin.c
    public final /* synthetic */ boolean cancel(Throwable th) {
        cancelInternal(new JobCancellationException(cancellationExceptionMessage(), null, this));
        return true;
    }
}
