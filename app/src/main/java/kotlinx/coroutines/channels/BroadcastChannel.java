package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.ObsoleteCoroutinesApi;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@ObsoleteCoroutinesApi
@kotlin.c
public interface BroadcastChannel<E> extends SendChannel<E> {
    void cancel(CancellationException cancellationException);

    @kotlin.c
    /* synthetic */ boolean cancel(Throwable th);

    ReceiveChannel<E> openSubscription();

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class DefaultImpls {
        public static /* synthetic */ boolean cancel$default(BroadcastChannel broadcastChannel, Throwable th, int i, Object obj) {
            if (obj != null) {
                com.google.gson.b.r("Super calls with default arguments not supported in this target, function: cancel");
                return false;
            }
            if ((i & 1) != 0) {
                th = null;
            }
            return broadcastChannel.cancel(th);
        }

        @kotlin.c
        public static <E> boolean offer(BroadcastChannel<E> broadcastChannel, E e) {
            return SendChannel.DefaultImpls.offer(broadcastChannel, e);
        }

        public static /* synthetic */ void cancel$default(BroadcastChannel broadcastChannel, CancellationException cancellationException, int i, Object obj) {
            if (obj != null) {
                com.google.gson.b.r("Super calls with default arguments not supported in this target, function: cancel");
                return;
            }
            if ((i & 1) != 0) {
                cancellationException = null;
            }
            broadcastChannel.cancel(cancellationException);
        }
    }
}
