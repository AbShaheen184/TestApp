package kotlinx.coroutines.channels;

import kotlin.jvm.functions.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class ChannelKt {
    public static final <E> Channel<E> Channel(int i, BufferOverflow bufferOverflow, l lVar) {
        if (i == -2) {
            return bufferOverflow == BufferOverflow.SUSPEND ? new BufferedChannel(Channel.Factory.getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core(), lVar) : new ConflatedBufferedChannel(1, bufferOverflow, lVar);
        }
        if (i == -1) {
            if (bufferOverflow == BufferOverflow.SUSPEND) {
                return new ConflatedBufferedChannel(1, BufferOverflow.DROP_OLDEST, lVar);
            }
            net.luminis.tls.engine.impl.c.o("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            return null;
        }
        if (i == 0) {
            return bufferOverflow == BufferOverflow.SUSPEND ? new BufferedChannel(0, lVar) : new ConflatedBufferedChannel(1, bufferOverflow, lVar);
        }
        if (i != Integer.MAX_VALUE) {
            return bufferOverflow == BufferOverflow.SUSPEND ? new BufferedChannel(i, lVar) : new ConflatedBufferedChannel(i, bufferOverflow, lVar);
        }
        return new BufferedChannel(Integer.MAX_VALUE, lVar);
    }

    public static /* synthetic */ Channel Channel$default(int i, BufferOverflow bufferOverflow, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        return Channel(i, bufferOverflow, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getOrElse-WpGqRn0, reason: not valid java name */
    public static final <T> T m38getOrElseWpGqRn0(Object obj, l lVar) {
        return obj instanceof ChannelResult.Failed ? (T) lVar.invoke(ChannelResult.m46exceptionOrNullimpl(obj)) : obj;
    }

    /* JADX INFO: renamed from: onClosed-WpGqRn0, reason: not valid java name */
    public static final <T> Object m39onClosedWpGqRn0(Object obj, l lVar) {
        if (obj instanceof ChannelResult.Closed) {
            lVar.invoke(ChannelResult.m46exceptionOrNullimpl(obj));
        }
        return obj;
    }

    /* JADX INFO: renamed from: onFailure-WpGqRn0, reason: not valid java name */
    public static final <T> Object m40onFailureWpGqRn0(Object obj, l lVar) {
        if (obj instanceof ChannelResult.Failed) {
            lVar.invoke(ChannelResult.m46exceptionOrNullimpl(obj));
        }
        return obj;
    }

    /* JADX INFO: renamed from: onSuccess-WpGqRn0, reason: not valid java name */
    public static final <T> Object m41onSuccessWpGqRn0(Object obj, l lVar) {
        if (!(obj instanceof ChannelResult.Failed)) {
            lVar.invoke(obj);
        }
        return obj;
    }

    public static /* synthetic */ Channel Channel$default(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return Channel(i);
    }

    @kotlin.c
    public static final /* synthetic */ Channel Channel(int i) {
        return Channel$default(i, null, null, 6, null);
    }
}
