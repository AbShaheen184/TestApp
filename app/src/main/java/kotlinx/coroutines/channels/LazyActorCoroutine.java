package kotlinx.coroutines.channels;

import kotlin.coroutines.i;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.c0;
import kotlin.y;
import kotlinx.coroutines.intrinsics.CancellableKt;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.selects.SelectClause2Impl;
import kotlinx.coroutines.selects.SelectInstance;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class LazyActorCoroutine<E> extends ActorCoroutine<E> {
    private kotlin.coroutines.d<? super y> continuation;

    public LazyActorCoroutine(i iVar, Channel<E> channel, p pVar) {
        super(iVar, channel, false);
        this.continuation = com.google.android.material.shape.e.b(pVar, this, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSendRegFunction(SelectInstance<?> selectInstance, Object obj) throws Throwable {
        onStart();
        super.getOnSend().getRegFunc().invoke(this, selectInstance, obj);
    }

    @Override // kotlinx.coroutines.channels.ChannelCoroutine, kotlinx.coroutines.channels.SendChannel
    public boolean close(Throwable th) {
        boolean zClose = super.close(th);
        start();
        return zClose;
    }

    @Override // kotlinx.coroutines.channels.ChannelCoroutine, kotlinx.coroutines.channels.SendChannel
    public SelectClause2<E, SendChannel<E>> getOnSend() {
        LazyActorCoroutine$onSend$1 lazyActorCoroutine$onSend$1 = LazyActorCoroutine$onSend$1.INSTANCE;
        lazyActorCoroutine$onSend$1.getClass();
        c0.c(3, lazyActorCoroutine$onSend$1);
        return new SelectClause2Impl(this, lazyActorCoroutine$onSend$1, super.getOnSend().getProcessResFunc(), null, 8, null);
    }

    @Override // kotlinx.coroutines.channels.ChannelCoroutine, kotlinx.coroutines.channels.SendChannel
    @kotlin.c
    public boolean offer(E e) {
        start();
        return super.offer(e);
    }

    @Override // kotlinx.coroutines.JobSupport
    public void onStart() throws Throwable {
        CancellableKt.startCoroutineCancellable(this.continuation, this);
    }

    @Override // kotlinx.coroutines.channels.ChannelCoroutine, kotlinx.coroutines.channels.SendChannel
    public Object send(E e, kotlin.coroutines.d<? super y> dVar) {
        start();
        Object objSend = super.send(e, dVar);
        return objSend == kotlin.coroutines.intrinsics.a.e ? objSend : y.a;
    }

    @Override // kotlinx.coroutines.channels.ChannelCoroutine, kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public Object mo28trySendJP2dKIU(E e) {
        start();
        return super.mo28trySendJP2dKIU(e);
    }

    public static /* synthetic */ void getOnSend$annotations() {
    }
}
