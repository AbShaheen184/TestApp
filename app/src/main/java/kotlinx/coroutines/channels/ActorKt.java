package kotlinx.coroutines.channels;

import kotlin.coroutines.i;
import kotlin.coroutines.j;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.ObsoleteCoroutinesApi;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class ActorKt {
    @ObsoleteCoroutinesApi
    public static final <E> SendChannel<E> actor(CoroutineScope coroutineScope, i iVar, int i, CoroutineStart coroutineStart, l lVar, p pVar) {
        i iVarNewCoroutineContext = CoroutineContextKt.newCoroutineContext(coroutineScope, iVar);
        Channel channelChannel$default = ChannelKt.Channel$default(i, null, null, 6, null);
        ActorCoroutine lazyActorCoroutine = coroutineStart.isLazy() ? new LazyActorCoroutine(iVarNewCoroutineContext, channelChannel$default, pVar) : new ActorCoroutine(iVarNewCoroutineContext, channelChannel$default, true);
        if (lVar != null) {
            ((JobSupport) lazyActorCoroutine).invokeOnCompletion(lVar);
        }
        ((AbstractCoroutine) lazyActorCoroutine).start(coroutineStart, lazyActorCoroutine, pVar);
        return (SendChannel<E>) lazyActorCoroutine;
    }

    public static /* synthetic */ SendChannel actor$default(CoroutineScope coroutineScope, i iVar, int i, CoroutineStart coroutineStart, l lVar, p pVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            iVar = j.e;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        if ((i2 & 8) != 0) {
            lVar = null;
        }
        CoroutineStart coroutineStart2 = coroutineStart;
        return actor(coroutineScope, iVar, i, coroutineStart2, lVar, pVar);
    }
}
