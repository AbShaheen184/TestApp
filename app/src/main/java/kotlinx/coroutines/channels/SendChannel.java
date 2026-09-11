package kotlinx.coroutines.channels;

import kotlin.jvm.functions.l;
import kotlin.y;
import kotlinx.coroutines.DelicateCoroutinesApi;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.selects.SelectClause2;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface SendChannel<E> {
    boolean close(Throwable th);

    SelectClause2<E, SendChannel<E>> getOnSend();

    void invokeOnClose(l lVar);

    boolean isClosedForSend();

    @kotlin.c
    boolean offer(E e);

    Object send(E e, kotlin.coroutines.d<? super y> dVar);

    /* JADX INFO: renamed from: trySend-JP2dKIU */
    Object mo28trySendJP2dKIU(E e);

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class DefaultImpls {
        public static /* synthetic */ boolean close$default(SendChannel sendChannel, Throwable th, int i, Object obj) {
            if (obj != null) {
                com.google.gson.b.r("Super calls with default arguments not supported in this target, function: close");
                return false;
            }
            if ((i & 1) != 0) {
                th = null;
            }
            return sendChannel.close(th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @kotlin.c
        public static <E> boolean offer(SendChannel<? super E> sendChannel, E e) throws Throwable {
            Object objMo28trySendJP2dKIU = sendChannel.mo28trySendJP2dKIU(e);
            if (ChannelResult.m52isSuccessimpl(objMo28trySendJP2dKIU)) {
                return true;
            }
            Throwable thM46exceptionOrNullimpl = ChannelResult.m46exceptionOrNullimpl(objMo28trySendJP2dKIU);
            if (thM46exceptionOrNullimpl == null) {
                return false;
            }
            throw StackTraceRecoveryKt.recoverStackTrace(thM46exceptionOrNullimpl);
        }

        @DelicateCoroutinesApi
        public static /* synthetic */ void isClosedForSend$annotations() {
        }
    }
}
