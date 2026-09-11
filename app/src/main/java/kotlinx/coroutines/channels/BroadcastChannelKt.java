package kotlinx.coroutines.channels;

import kotlinx.coroutines.ObsoleteCoroutinesApi;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class BroadcastChannelKt {
    private static final Symbol NO_ELEMENT = new Symbol("NO_ELEMENT");

    @ObsoleteCoroutinesApi
    @kotlin.c
    public static final <E> BroadcastChannel<E> BroadcastChannel(int i) {
        if (i == -2) {
            return new BroadcastChannelImpl(Channel.Factory.getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core());
        }
        if (i == -1) {
            return new ConflatedBroadcastChannel();
        }
        if (i == 0) {
            net.luminis.tls.engine.impl.c.o("Unsupported 0 capacity for BroadcastChannel");
            return null;
        }
        if (i != Integer.MAX_VALUE) {
            return new BroadcastChannelImpl(i);
        }
        net.luminis.tls.engine.impl.c.o("Unsupported UNLIMITED capacity for BroadcastChannel");
        return null;
    }
}
