package kotlinx.coroutines.channels;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.i;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.q;
import kotlin.k;
import kotlin.y;
import kotlinx.coroutines.ObsoleteCoroutinesApi;

/* JADX INFO: loaded from: classes.dex */
public final class ChannelsKt {
    public static final String DEFAULT_CLOSE_MESSAGE = "Channel was closed";

    public static final void cancelConsumed(ReceiveChannel<?> receiveChannel, Throwable th) {
        ChannelsKt__Channels_commonKt.cancelConsumed(receiveChannel, th);
    }

    @ObsoleteCoroutinesApi
    @kotlin.c
    public static final <E, R> R consume(BroadcastChannel<E> broadcastChannel, l lVar) {
        return (R) ChannelsKt__DeprecatedKt.consume(broadcastChannel, lVar);
    }

    @kotlin.c
    public static final <E> Object consumeEach(BroadcastChannel<E> broadcastChannel, l lVar, kotlin.coroutines.d<? super y> dVar) {
        return ChannelsKt__DeprecatedKt.consumeEach(broadcastChannel, lVar, dVar);
    }

    public static final l consumes(ReceiveChannel<?> receiveChannel) {
        return ChannelsKt__DeprecatedKt.consumes(receiveChannel);
    }

    public static final l consumesAll(ReceiveChannel<?>... receiveChannelArr) {
        return ChannelsKt__DeprecatedKt.consumesAll(receiveChannelArr);
    }

    public static final <E, K> ReceiveChannel<E> distinctBy(ReceiveChannel<? extends E> receiveChannel, i iVar, p pVar) {
        return ChannelsKt__DeprecatedKt.distinctBy(receiveChannel, iVar, pVar);
    }

    public static final <E> ReceiveChannel<E> filter(ReceiveChannel<? extends E> receiveChannel, i iVar, p pVar) {
        return ChannelsKt__DeprecatedKt.filter(receiveChannel, iVar, pVar);
    }

    public static final <E> ReceiveChannel<E> filterNotNull(ReceiveChannel<? extends E> receiveChannel) {
        return ChannelsKt__DeprecatedKt.filterNotNull(receiveChannel);
    }

    public static final <E, R> ReceiveChannel<R> map(ReceiveChannel<? extends E> receiveChannel, i iVar, p pVar) {
        return ChannelsKt__DeprecatedKt.map(receiveChannel, iVar, pVar);
    }

    public static final <E, R> ReceiveChannel<R> mapIndexed(ReceiveChannel<? extends E> receiveChannel, i iVar, q qVar) {
        return ChannelsKt__DeprecatedKt.mapIndexed(receiveChannel, iVar, qVar);
    }

    public static final <E, C extends SendChannel<? super E>> Object toChannel(ReceiveChannel<? extends E> receiveChannel, C c, kotlin.coroutines.d<? super C> dVar) {
        return ChannelsKt__DeprecatedKt.toChannel(receiveChannel, c, dVar);
    }

    public static final <E, C extends Collection<? super E>> Object toCollection(ReceiveChannel<? extends E> receiveChannel, C c, kotlin.coroutines.d<? super C> dVar) {
        return ChannelsKt__DeprecatedKt.toCollection(receiveChannel, c, dVar);
    }

    public static final <E> Object toList(ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.d<? super List<? extends E>> dVar) {
        return ChannelsKt__Channels_commonKt.toList(receiveChannel, dVar);
    }

    public static final <K, V, M extends Map<? super K, ? super V>> Object toMap(ReceiveChannel<? extends k> receiveChannel, M m, kotlin.coroutines.d<? super M> dVar) {
        return ChannelsKt__DeprecatedKt.toMap(receiveChannel, m, dVar);
    }

    public static final <E> Object toMutableSet(ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.d<? super Set<E>> dVar) {
        return ChannelsKt__DeprecatedKt.toMutableSet(receiveChannel, dVar);
    }

    public static final <E> Object trySendBlocking(SendChannel<? super E> sendChannel, E e) {
        return ChannelsKt__ChannelsKt.trySendBlocking(sendChannel, e);
    }

    public static final <E, R> R consume(ReceiveChannel<? extends E> receiveChannel, l lVar) {
        return (R) ChannelsKt__Channels_commonKt.consume(receiveChannel, lVar);
    }

    public static final <E> Object consumeEach(ReceiveChannel<? extends E> receiveChannel, l lVar, kotlin.coroutines.d<? super y> dVar) {
        return ChannelsKt__Channels_commonKt.consumeEach(receiveChannel, lVar, dVar);
    }

    public static final <E, R, V> ReceiveChannel<V> zip(ReceiveChannel<? extends E> receiveChannel, ReceiveChannel<? extends R> receiveChannel2, i iVar, p pVar) {
        return ChannelsKt__DeprecatedKt.zip(receiveChannel, receiveChannel2, iVar, pVar);
    }
}
