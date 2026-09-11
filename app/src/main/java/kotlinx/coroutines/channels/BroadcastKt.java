package kotlinx.coroutines.channels;

import kotlin.coroutines.j;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.ObsoleteCoroutinesApi;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class BroadcastKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.BroadcastKt$broadcast$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.BroadcastKt$broadcast$2", f = "Broadcast.kt", l = {26, 27}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements p {
        final /* synthetic */ ReceiveChannel<E> $channel;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$channel = receiveChannel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$channel, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(ProducerScope<? super E> producerScope, kotlin.coroutines.d<? super y> dVar) {
            return ((AnonymousClass2) create(producerScope, dVar)).invokeSuspend(y.a);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0046  */
        /* JADX WARN: Code duplicated, block: B:18:0x0051  */
        /* JADX WARN: Code duplicated, block: B:21:0x0062  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
        
            if (r4.send(r7, r6) == r3) goto L20;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005f -> B:7:0x0017). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                int r0 = r6.label
                r1 = 2
                r2 = 1
                kotlin.coroutines.intrinsics.a r3 = kotlin.coroutines.intrinsics.a.e
                if (r0 == 0) goto L2c
                if (r0 == r2) goto L20
                if (r0 != r1) goto L19
                java.lang.Object r0 = r6.L$1
                kotlinx.coroutines.channels.ChannelIterator r0 = (kotlinx.coroutines.channels.ChannelIterator) r0
                java.lang.Object r4 = r6.L$0
                kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
                kotlin.a.e(r7)
            L17:
                r7 = r4
                goto L39
            L19:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                net.luminis.tls.engine.impl.c.r(r7)
                r7 = 0
                return r7
            L20:
                java.lang.Object r0 = r6.L$1
                kotlinx.coroutines.channels.ChannelIterator r0 = (kotlinx.coroutines.channels.ChannelIterator) r0
                java.lang.Object r4 = r6.L$0
                kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
                kotlin.a.e(r7)
                goto L49
            L2c:
                kotlin.a.e(r7)
                java.lang.Object r7 = r6.L$0
                kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
                kotlinx.coroutines.channels.ReceiveChannel<E> r0 = r6.$channel
                kotlinx.coroutines.channels.ChannelIterator r0 = r0.iterator()
            L39:
                r6.L$0 = r7
                r6.L$1 = r0
                r6.label = r2
                java.lang.Object r4 = r0.hasNext(r6)
                if (r4 != r3) goto L46
                goto L61
            L46:
                r5 = r4
                r4 = r7
                r7 = r5
            L49:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 == 0) goto L62
                java.lang.Object r7 = r0.next()
                r6.L$0 = r4
                r6.L$1 = r0
                r6.label = r1
                java.lang.Object r7 = r4.send(r7, r6)
                if (r7 != r3) goto L17
            L61:
                return r3
            L62:
                kotlin.y r7 = kotlin.y.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BroadcastKt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @ObsoleteCoroutinesApi
    @kotlin.c
    public static final <E> BroadcastChannel<E> broadcast(ReceiveChannel<? extends E> receiveChannel, int i, CoroutineStart coroutineStart) {
        return broadcast$default(CoroutineScopeKt.plus(CoroutineScopeKt.plus(GlobalScope.INSTANCE, Dispatchers.getUnconfined()), new BroadcastKt$broadcast$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key)), null, i, coroutineStart, new b(receiveChannel, 1), new AnonymousClass2(receiveChannel, null), 1, null);
    }

    public static /* synthetic */ BroadcastChannel broadcast$default(CoroutineScope coroutineScope, kotlin.coroutines.i iVar, int i, CoroutineStart coroutineStart, l lVar, p pVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            iVar = j.e;
        }
        if ((i2 & 2) != 0) {
            i = 1;
        }
        if ((i2 & 4) != 0) {
            coroutineStart = CoroutineStart.LAZY;
        }
        if ((i2 & 8) != 0) {
            lVar = null;
        }
        CoroutineStart coroutineStart2 = coroutineStart;
        return broadcast(coroutineScope, iVar, i, coroutineStart2, lVar, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y broadcast$lambda$1(ReceiveChannel receiveChannel, Throwable th) {
        ChannelsKt.cancelConsumed(receiveChannel, th);
        return y.a;
    }

    public static /* synthetic */ BroadcastChannel broadcast$default(ReceiveChannel receiveChannel, int i, CoroutineStart coroutineStart, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        if ((i2 & 2) != 0) {
            coroutineStart = CoroutineStart.LAZY;
        }
        return broadcast(receiveChannel, i, coroutineStart);
    }

    @ObsoleteCoroutinesApi
    @kotlin.c
    public static final <E> BroadcastChannel<E> broadcast(CoroutineScope coroutineScope, kotlin.coroutines.i iVar, int i, CoroutineStart coroutineStart, l lVar, p pVar) {
        BroadcastCoroutine broadcastCoroutine;
        kotlin.coroutines.i iVarNewCoroutineContext = CoroutineContextKt.newCoroutineContext(coroutineScope, iVar);
        BroadcastChannel BroadcastChannel = BroadcastChannelKt.BroadcastChannel(i);
        if (coroutineStart.isLazy()) {
            broadcastCoroutine = new LazyBroadcastCoroutine(iVarNewCoroutineContext, BroadcastChannel, pVar);
        } else {
            broadcastCoroutine = new BroadcastCoroutine(iVarNewCoroutineContext, BroadcastChannel, true);
        }
        if (lVar != null) {
            ((JobSupport) broadcastCoroutine).invokeOnCompletion(lVar);
        }
        ((AbstractCoroutine) broadcastCoroutine).start(coroutineStart, broadcastCoroutine, pVar);
        return (BroadcastChannel<E>) broadcastCoroutine;
    }
}
