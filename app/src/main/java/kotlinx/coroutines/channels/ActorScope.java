package kotlinx.coroutines.channels;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ObsoleteCoroutinesApi;
import kotlinx.coroutines.selects.SelectClause1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@ObsoleteCoroutinesApi
public interface ActorScope<E> extends CoroutineScope, ReceiveChannel<E> {

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class DefaultImpls {
        public static <E> SelectClause1<E> getOnReceiveOrNull(ActorScope<E> actorScope) {
            return ReceiveChannel.DefaultImpls.getOnReceiveOrNull(actorScope);
        }

        @kotlin.c
        public static <E> E poll(ActorScope<E> actorScope) {
            return (E) ReceiveChannel.DefaultImpls.poll(actorScope);
        }

        @kotlin.c
        public static <E> Object receiveOrNull(ActorScope<E> actorScope, kotlin.coroutines.d<? super E> dVar) {
            return ReceiveChannel.DefaultImpls.receiveOrNull(actorScope, dVar);
        }
    }

    Channel<E> getChannel();
}
