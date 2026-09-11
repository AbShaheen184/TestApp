package kotlinx.coroutines.flow;

import kotlin.y;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.ChannelFlowKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class FlowKt__ChannelsKt {
    public static final <T> Flow<T> consumeAsFlow(ReceiveChannel<? extends T> receiveChannel) {
        return new ChannelAsFlow(receiveChannel, true, null, 0, null, 28, null);
    }

    public static final <T> Object emitAll(FlowCollector<? super T> flowCollector, ReceiveChannel<? extends T> receiveChannel, kotlin.coroutines.d<? super y> dVar) {
        Object objEmitAllImpl$FlowKt__ChannelsKt = emitAllImpl$FlowKt__ChannelsKt(flowCollector, receiveChannel, true, dVar);
        return objEmitAllImpl$FlowKt__ChannelsKt == kotlin.coroutines.intrinsics.a.e ? objEmitAllImpl$FlowKt__ChannelsKt : y.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:30:0x007c A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0034, B:24:0x005f, B:28:0x0074, B:30:0x007c, B:20:0x0051, B:23:0x005b), top: B:42:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0093  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008e, code lost:
    
        if (r1.emit(r9, r0) == r4) goto L32;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x008e -> B:14:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object emitAllImpl$FlowKt__ChannelsKt(kotlinx.coroutines.flow.FlowCollector<? super T> r6, kotlinx.coroutines.channels.ReceiveChannel<? extends T> r7, boolean r8, kotlin.coroutines.d<? super kotlin.y> r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = (kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = new kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            kotlin.coroutines.intrinsics.a r4 = kotlin.coroutines.intrinsics.a.e
            if (r1 == 0) goto L55
            if (r1 == r3) goto L43
            if (r1 != r2) goto L3c
            boolean r8 = r0.Z$0
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r1 = r0.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.a.e(r9)     // Catch: java.lang.Throwable -> L3a
        L37:
            r9 = r6
            r6 = r1
            goto L5f
        L3a:
            r6 = move-exception
            goto L9a
        L3c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r6)
            r6 = 0
            return r6
        L43:
            boolean r8 = r0.Z$0
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r1 = r0.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.a.e(r9)     // Catch: java.lang.Throwable -> L3a
            goto L74
        L55:
            kotlin.a.e(r9)
            kotlinx.coroutines.flow.FlowKt.ensureActive(r6)
            kotlinx.coroutines.channels.ChannelIterator r9 = r7.iterator()     // Catch: java.lang.Throwable -> L3a
        L5f:
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L3a
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L3a
            r0.L$2 = r9     // Catch: java.lang.Throwable -> L3a
            r0.Z$0 = r8     // Catch: java.lang.Throwable -> L3a
            r0.label = r3     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r1 = r9.hasNext(r0)     // Catch: java.lang.Throwable -> L3a
            if (r1 != r4) goto L70
            goto L90
        L70:
            r5 = r1
            r1 = r6
            r6 = r9
            r9 = r5
        L74:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3a
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3a
            if (r9 == 0) goto L91
            java.lang.Object r9 = r6.next()     // Catch: java.lang.Throwable -> L3a
            r0.L$0 = r1     // Catch: java.lang.Throwable -> L3a
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L3a
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L3a
            r0.Z$0 = r8     // Catch: java.lang.Throwable -> L3a
            r0.label = r2     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r9 = r1.emit(r9, r0)     // Catch: java.lang.Throwable -> L3a
            if (r9 != r4) goto L37
        L90:
            return r4
        L91:
            if (r8 == 0) goto L97
            r6 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r6)
        L97:
            kotlin.y r6 = kotlin.y.a
            return r6
        L9a:
            throw r6     // Catch: java.lang.Throwable -> L9b
        L9b:
            r9 = move-exception
            if (r8 == 0) goto La1
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r6)
        La1:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ChannelsKt.emitAllImpl$FlowKt__ChannelsKt(kotlinx.coroutines.flow.FlowCollector, kotlinx.coroutines.channels.ReceiveChannel, boolean, kotlin.coroutines.d):java.lang.Object");
    }

    public static final <T> ReceiveChannel<T> produceIn(Flow<? extends T> flow, CoroutineScope coroutineScope) {
        return ChannelFlowKt.asChannelFlow(flow).produceImpl(coroutineScope);
    }

    public static final <T> Flow<T> receiveAsFlow(ReceiveChannel<? extends T> receiveChannel) {
        return new ChannelAsFlow(receiveChannel, false, null, 0, null, 28, null);
    }
}
