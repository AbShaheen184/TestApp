package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {759}, m = "receiveCatching-JP2dKIU$suspendImpl")
public final class BufferedChannel$receiveCatching$1<E> extends kotlin.coroutines.jvm.internal.c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BufferedChannel<E> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedChannel$receiveCatching$1(BufferedChannel<E> bufferedChannel, kotlin.coroutines.d<? super BufferedChannel$receiveCatching$1> dVar) {
        super(dVar);
        this.this$0 = bufferedChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM32receiveCatchingJP2dKIU$suspendImpl = BufferedChannel.m32receiveCatchingJP2dKIU$suspendImpl(this.this$0, this);
        return objM32receiveCatchingJP2dKIU$suspendImpl == kotlin.coroutines.intrinsics.a.e ? objM32receiveCatchingJP2dKIU$suspendImpl : ChannelResult.m42boximpl(objM32receiveCatchingJP2dKIU$suspendImpl);
    }
}
