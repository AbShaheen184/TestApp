package kotlinx.coroutines.channels;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.i;
import kotlin.jvm.functions.l;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.Segment;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class ChannelSegment<E> extends Segment<ChannelSegment<E>> {
    private final BufferedChannel<E> _channel;
    private final /* synthetic */ AtomicReferenceArray data;

    public ChannelSegment(long j, ChannelSegment<E> channelSegment, BufferedChannel<E> bufferedChannel, int i) {
        super(j, channelSegment, i);
        this._channel = bufferedChannel;
        this.data = new AtomicReferenceArray(BufferedChannelKt.SEGMENT_SIZE * 2);
    }

    private final /* synthetic */ AtomicReferenceArray getData() {
        return this.data;
    }

    private final void setElementLazy(int i, Object obj) {
        getData().set(i * 2, obj);
    }

    public final boolean casState$kotlinx_coroutines_core(int i, Object obj, Object obj2) {
        AtomicReferenceArray data = getData();
        int i2 = (i * 2) + 1;
        while (!data.compareAndSet(i2, obj, obj2)) {
            if (data.get(i2) != obj) {
                return false;
            }
        }
        return true;
    }

    public final void cleanElement$kotlinx_coroutines_core(int i) {
        setElementLazy(i, null);
    }

    public final Object getAndSetState$kotlinx_coroutines_core(int i, Object obj) {
        return getData().getAndSet((i * 2) + 1, obj);
    }

    public final BufferedChannel<E> getChannel() {
        BufferedChannel<E> bufferedChannel = this._channel;
        bufferedChannel.getClass();
        return bufferedChannel;
    }

    public final E getElement$kotlinx_coroutines_core(int i) {
        return (E) getData().get(i * 2);
    }

    @Override // kotlinx.coroutines.internal.Segment
    public int getNumberOfSlots() {
        return BufferedChannelKt.SEGMENT_SIZE;
    }

    public final Object getState$kotlinx_coroutines_core(int i) {
        return getData().get((i * 2) + 1);
    }

    @Override // kotlinx.coroutines.internal.Segment
    public void onCancellation(int i, Throwable th, i iVar) {
        l lVar;
        l lVar2;
        int i2 = BufferedChannelKt.SEGMENT_SIZE;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        E element$kotlinx_coroutines_core = getElement$kotlinx_coroutines_core(i);
        while (true) {
            Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core(i);
            if ((state$kotlinx_coroutines_core instanceof Waiter) || (state$kotlinx_coroutines_core instanceof WaiterEB)) {
                if (casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, z ? BufferedChannelKt.INTERRUPTED_SEND : BufferedChannelKt.INTERRUPTED_RCV)) {
                    cleanElement$kotlinx_coroutines_core(i);
                    onCancelledRequest(i, !z);
                    if (!z || (lVar = getChannel().onUndeliveredElement) == null) {
                        return;
                    }
                    OnUndeliveredElementKt.callUndeliveredElement(lVar, element$kotlinx_coroutines_core, iVar);
                    return;
                }
            } else {
                if (state$kotlinx_coroutines_core == BufferedChannelKt.INTERRUPTED_SEND || state$kotlinx_coroutines_core == BufferedChannelKt.INTERRUPTED_RCV) {
                    break;
                }
                if (state$kotlinx_coroutines_core != BufferedChannelKt.RESUMING_BY_EB && state$kotlinx_coroutines_core != BufferedChannelKt.RESUMING_BY_RCV) {
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.DONE_RCV || state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED || state$kotlinx_coroutines_core == BufferedChannelKt.getCHANNEL_CLOSED()) {
                        return;
                    }
                    com.google.gson.b.u(state$kotlinx_coroutines_core, "unexpected state: ");
                    return;
                }
            }
        }
        cleanElement$kotlinx_coroutines_core(i);
        if (!z || (lVar2 = getChannel().onUndeliveredElement) == null) {
            return;
        }
        OnUndeliveredElementKt.callUndeliveredElement(lVar2, element$kotlinx_coroutines_core, iVar);
    }

    public final void onCancelledRequest(int i, boolean z) {
        if (z) {
            getChannel().waitExpandBufferCompletion$kotlinx_coroutines_core((this.id * ((long) BufferedChannelKt.SEGMENT_SIZE)) + ((long) i));
        }
        onSlotCleaned();
    }

    public final E retrieveElement$kotlinx_coroutines_core(int i) {
        E element$kotlinx_coroutines_core = getElement$kotlinx_coroutines_core(i);
        cleanElement$kotlinx_coroutines_core(i);
        return element$kotlinx_coroutines_core;
    }

    public final void setState$kotlinx_coroutines_core(int i, Object obj) {
        getData().set((i * 2) + 1, obj);
    }

    public final void storeElement$kotlinx_coroutines_core(int i, E e) {
        setElementLazy(i, e);
    }
}
