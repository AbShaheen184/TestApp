package kotlinx.coroutines.channels;

import kotlin.coroutines.i;
import kotlin.y;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class ProducerCoroutine<E> extends ChannelCoroutine<E> implements ProducerScope<E> {
    public ProducerCoroutine(i iVar, Channel<E> channel) {
        super(iVar, channel, true, true);
    }

    @Override // kotlinx.coroutines.channels.ProducerScope
    public /* bridge */ /* synthetic */ SendChannel getChannel() {
        return getChannel();
    }

    @Override // kotlinx.coroutines.AbstractCoroutine, kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public boolean isActive() {
        return super.isActive();
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public void onCancelled(Throwable th, boolean z) {
        if (get_channel().close(th) || z) {
            return;
        }
        CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), th);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public void onCompleted(y yVar) {
        SendChannel.DefaultImpls.close$default(get_channel(), null, 1, null);
    }
}
