package kotlinx.coroutines.channels;

import kotlin.jvm.functions.l;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.f;
import kotlin.y;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.SelectInstance;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class ConflatedBufferedChannel<E> extends BufferedChannel<E> {
    private final int capacity;
    private final BufferOverflow onBufferOverflow;

    public ConflatedBufferedChannel(int i, BufferOverflow bufferOverflow, l lVar) {
        super(i, lVar);
        this.capacity = i;
        this.onBufferOverflow = bufferOverflow;
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            androidx.media3.exoplayer.hls.playlist.a.g(a0.a(BufferedChannel.class).c(), " instead", "This implementation does not support suspension for senders, use ");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        net.luminis.tls.engine.impl.c.p(androidx.privacysandbox.ads.adservices.java.internal.a.p("Buffered channel capacity must be at least 1, but ", i, " was specified"));
        throw null;
    }

    public static /* synthetic */ <E> Object send$suspendImpl(ConflatedBufferedChannel<E> conflatedBufferedChannel, E e, kotlin.coroutines.d<? super y> dVar) throws Throwable {
        UndeliveredElementException undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
        Object objM59trySendImplMj0NB7M = conflatedBufferedChannel.m59trySendImplMj0NB7M(e, true);
        if (!(objM59trySendImplMj0NB7M instanceof ChannelResult.Closed)) {
            return y.a;
        }
        ChannelResult.m46exceptionOrNullimpl(objM59trySendImplMj0NB7M);
        l lVar = conflatedBufferedChannel.onUndeliveredElement;
        if (lVar == null || (undeliveredElementExceptionCallUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(lVar, e, null, 2, null)) == null) {
            throw conflatedBufferedChannel.getSendException();
        }
        kotlin.a.a(undeliveredElementExceptionCallUndeliveredElementCatchingException$default, conflatedBufferedChannel.getSendException());
        throw undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
    }

    public static <E> Object sendBroadcast$suspendImpl(ConflatedBufferedChannel<E> conflatedBufferedChannel, E e, kotlin.coroutines.d<? super Boolean> dVar) {
        Object objM59trySendImplMj0NB7M = conflatedBufferedChannel.m59trySendImplMj0NB7M(e, true);
        if (objM59trySendImplMj0NB7M instanceof ChannelResult.Failed) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: trySendDropLatest-Mj0NB7M, reason: not valid java name */
    private final Object m58trySendDropLatestMj0NB7M(E e, boolean z) {
        l lVar;
        UndeliveredElementException undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
        Object objMo28trySendJP2dKIU = super.mo28trySendJP2dKIU(e);
        if (ChannelResult.m52isSuccessimpl(objMo28trySendJP2dKIU) || ChannelResult.m50isClosedimpl(objMo28trySendJP2dKIU)) {
            return objMo28trySendJP2dKIU;
        }
        if (!z || (lVar = this.onUndeliveredElement) == null || (undeliveredElementExceptionCallUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(lVar, e, null, 2, null)) == null) {
            return ChannelResult.Companion.m57successJP2dKIU(y.a);
        }
        throw undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
    }

    /* JADX INFO: renamed from: trySendImpl-Mj0NB7M, reason: not valid java name */
    private final Object m59trySendImplMj0NB7M(E e, boolean z) {
        return this.onBufferOverflow == BufferOverflow.DROP_LATEST ? m58trySendDropLatestMj0NB7M(e, z) : m36trySendDropOldestJP2dKIU(e);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public boolean isConflatedDropOldest() {
        return this.onBufferOverflow == BufferOverflow.DROP_OLDEST;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.BufferedChannel
    public void registerSelectForSend(SelectInstance<?> selectInstance, Object obj) {
        Object objMo28trySendJP2dKIU = mo28trySendJP2dKIU(obj);
        if (!(objMo28trySendJP2dKIU instanceof ChannelResult.Failed)) {
            selectInstance.selectInRegistrationPhase(y.a);
        } else if (!(objMo28trySendJP2dKIU instanceof ChannelResult.Closed)) {
            net.luminis.tls.engine.impl.c.r("unreachable");
        } else {
            ChannelResult.m46exceptionOrNullimpl(objMo28trySendJP2dKIU);
            selectInstance.selectInRegistrationPhase(BufferedChannelKt.getCHANNEL_CLOSED());
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public Object send(E e, kotlin.coroutines.d<? super y> dVar) {
        return send$suspendImpl((ConflatedBufferedChannel) this, (Object) e, dVar);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public Object sendBroadcast$kotlinx_coroutines_core(E e, kotlin.coroutines.d<? super Boolean> dVar) {
        return sendBroadcast$suspendImpl((ConflatedBufferedChannel) this, (Object) e, dVar);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public boolean shouldSendSuspend$kotlinx_coroutines_core() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public Object mo28trySendJP2dKIU(E e) {
        return m59trySendImplMj0NB7M(e, false);
    }

    public /* synthetic */ ConflatedBufferedChannel(int i, BufferOverflow bufferOverflow, l lVar, int i2, f fVar) {
        this(i, bufferOverflow, (i2 & 4) != 0 ? null : lVar);
    }
}
