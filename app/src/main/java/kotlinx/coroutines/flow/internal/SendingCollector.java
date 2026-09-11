package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.a;
import kotlin.y;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@InternalCoroutinesApi
public final class SendingCollector<T> implements FlowCollector<T> {
    private final SendChannel<T> channel;

    /* JADX WARN: Multi-variable type inference failed */
    public SendingCollector(SendChannel<? super T> sendChannel) {
        this.channel = sendChannel;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, d<? super y> dVar) {
        Object objSend = this.channel.send(t, dVar);
        return objSend == a.e ? objSend : y.a;
    }
}
