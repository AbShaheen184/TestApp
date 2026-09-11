package kotlinx.coroutines.channels;

import kotlinx.coroutines.DelicateCoroutinesApi;
import kotlinx.coroutines.internal.SystemPropsKt;
import kotlinx.coroutines.selects.SelectClause1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface Channel<E> extends SendChannel<E>, ReceiveChannel<E> {
    public static final int BUFFERED = -2;
    public static final int CONFLATED = -1;
    public static final String DEFAULT_BUFFER_PROPERTY_NAME = "kotlinx.coroutines.channels.defaultBuffer";
    public static final Factory Factory = Factory.$$INSTANCE;
    public static final int OPTIONAL_CHANNEL = -3;
    public static final int RENDEZVOUS = 0;
    public static final int UNLIMITED = Integer.MAX_VALUE;

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class DefaultImpls {
        public static <E> SelectClause1<E> getOnReceiveOrNull(Channel<E> channel) {
            return ReceiveChannel.DefaultImpls.getOnReceiveOrNull(channel);
        }

        @kotlin.c
        public static <E> boolean offer(Channel<E> channel, E e) {
            return SendChannel.DefaultImpls.offer(channel, e);
        }

        @kotlin.c
        public static <E> E poll(Channel<E> channel) {
            return (E) ReceiveChannel.DefaultImpls.poll(channel);
        }

        @kotlin.c
        public static <E> Object receiveOrNull(Channel<E> channel, kotlin.coroutines.d<? super E> dVar) {
            return ReceiveChannel.DefaultImpls.receiveOrNull(channel, dVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class Factory {
        public static final int BUFFERED = -2;
        public static final int CONFLATED = -1;
        public static final String DEFAULT_BUFFER_PROPERTY_NAME = "kotlinx.coroutines.channels.defaultBuffer";
        public static final int OPTIONAL_CHANNEL = -3;
        public static final int RENDEZVOUS = 0;
        public static final int UNLIMITED = Integer.MAX_VALUE;
        static final /* synthetic */ Factory $$INSTANCE = new Factory();
        private static final int CHANNEL_DEFAULT_CAPACITY = SystemPropsKt.systemProp("kotlinx.coroutines.channels.defaultBuffer", 64, 1, 2147483646);

        private Factory() {
        }

        public final int getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core() {
            return CHANNEL_DEFAULT_CAPACITY;
        }

        @DelicateCoroutinesApi
        public static /* synthetic */ void getDEFAULT_BUFFER_PROPERTY_NAME$annotations() {
        }
    }
}
