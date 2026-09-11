package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.l;
import kotlin.y;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.selects.SelectClause1;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class ChannelsKt__Channels_commonKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", l = {Token.XMLATTR}, m = "consumeEach")
    public static final class AnonymousClass1<E> extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__Channels_commonKt.consumeEach(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", l = {209}, m = "toList")
    public static final class C00111<E> extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C00111(kotlin.coroutines.d<? super C00111> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt.toList(null, this);
        }
    }

    public static final void cancelConsumed(ReceiveChannel<?> receiveChannel, Throwable th) {
        CancellationException CancellationException = null;
        if (th != null) {
            CancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            if (CancellationException == null) {
                CancellationException = ExceptionsKt.CancellationException("Channel was consumed, consumer had failed", th);
            }
        }
        receiveChannel.cancel(CancellationException);
    }

    public static final <E, R> R consume(ReceiveChannel<? extends E> receiveChannel, l lVar) {
        try {
            R r = (R) lVar.invoke(receiveChannel);
            ChannelsKt.cancelConsumed(receiveChannel, null);
            return r;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ChannelsKt.cancelConsumed(receiveChannel, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0055 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:28:0x0061 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #1 {all -> 0x0031, blocks: (B:12:0x002d, B:26:0x0059, B:28:0x0061, B:21:0x0045), top: B:40:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0056 -> B:26:0x0059). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final <E> java.lang.Object consumeEach(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r5, kotlin.jvm.functions.l r6, kotlin.coroutines.d<? super kotlin.y> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L33
            java.lang.Object r5 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            java.lang.Object r1 = r0.L$0
            kotlin.jvm.functions.l r1 = (kotlin.jvm.functions.l) r1
            kotlin.a.e(r7)     // Catch: java.lang.Throwable -> L31
            goto L59
        L31:
            r5 = move-exception
            goto L75
        L33:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r5)
            r5 = 0
            return r5
        L3a:
            kotlin.a.e(r7)
            kotlinx.coroutines.channels.ChannelIterator r7 = r5.iterator()     // Catch: java.lang.Throwable -> L71
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L45:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L31
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L31
            r0.L$2 = r5     // Catch: java.lang.Throwable -> L31
            r0.label = r2     // Catch: java.lang.Throwable -> L31
            java.lang.Object r1 = r5.hasNext(r0)     // Catch: java.lang.Throwable -> L31
            kotlin.coroutines.intrinsics.a r3 = kotlin.coroutines.intrinsics.a.e
            if (r1 != r3) goto L56
            return r3
        L56:
            r4 = r1
            r1 = r7
            r7 = r4
        L59:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L31
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r7 == 0) goto L6a
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L31
            r1.invoke(r7)     // Catch: java.lang.Throwable -> L31
            r7 = r1
            goto L45
        L6a:
            r5 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r5)
            kotlin.y r5 = kotlin.y.a
            return r5
        L71:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L75:
            throw r5     // Catch: java.lang.Throwable -> L76
        L76:
            r7 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.consumeEach(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.l, kotlin.coroutines.d):java.lang.Object");
    }

    private static final <E> Object consumeEach$$forInline(ReceiveChannel<? extends E> receiveChannel, l lVar, kotlin.coroutines.d<? super y> dVar) {
        try {
            ChannelIterator<? extends E> it = receiveChannel.iterator();
            while (((Boolean) it.hasNext(null)).booleanValue()) {
                lVar.invoke(it.next());
            }
            ChannelsKt.cancelConsumed(receiveChannel, null);
            return y.a;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ChannelsKt.cancelConsumed(receiveChannel, th);
                throw th2;
            }
        }
    }

    @kotlin.c
    public static final /* synthetic */ SelectClause1 onReceiveOrNull(ReceiveChannel receiveChannel) {
        receiveChannel.getClass();
        return receiveChannel.getOnReceiveOrNull();
    }

    @kotlin.c
    public static final /* synthetic */ Object receiveOrNull(ReceiveChannel receiveChannel, kotlin.coroutines.d dVar) {
        receiveChannel.getClass();
        return receiveChannel.receiveOrNull(dVar);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0060 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0061  */
    /* JADX WARN: Code duplicated, block: B:28:0x006c A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #2 {all -> 0x0035, blocks: (B:12:0x0031, B:26:0x0064, B:28:0x006c), top: B:44:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0061 -> B:26:0x0064). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final <E> java.lang.Object toList(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r7, kotlin.coroutines.d<? super java.util.List<? extends E>> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.C00111
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.C00111) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L3f
            if (r1 != r2) goto L38
            java.lang.Object r7 = r0.L$3
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r1 = r0.L$2
            kotlinx.coroutines.channels.ReceiveChannel r1 = (kotlinx.coroutines.channels.ReceiveChannel) r1
            java.lang.Object r3 = r0.L$1
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r4 = r0.L$0
            java.util.List r4 = (java.util.List) r4
            kotlin.a.e(r8)     // Catch: java.lang.Throwable -> L35
            goto L64
        L35:
            r7 = move-exception
            r8 = r1
            goto L84
        L38:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r7)
            r7 = 0
            return r7
        L3f:
            kotlin.a.e(r8)
            kotlin.collections.builders.b r8 = com.google.common.base.c.h()
            kotlinx.coroutines.channels.ChannelIterator r1 = r7.iterator()     // Catch: java.lang.Throwable -> L80
            r3 = r8
            r4 = r3
            r8 = r7
            r7 = r1
        L4e:
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L7e
            r0.L$1 = r3     // Catch: java.lang.Throwable -> L7e
            r0.L$2 = r8     // Catch: java.lang.Throwable -> L7e
            r0.L$3 = r7     // Catch: java.lang.Throwable -> L7e
            r0.label = r2     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r1 = r7.hasNext(r0)     // Catch: java.lang.Throwable -> L7e
            kotlin.coroutines.intrinsics.a r5 = kotlin.coroutines.intrinsics.a.e
            if (r1 != r5) goto L61
            return r5
        L61:
            r6 = r1
            r1 = r8
            r8 = r6
        L64:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L35
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r8 == 0) goto L75
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L35
            r3.add(r8)     // Catch: java.lang.Throwable -> L35
            r8 = r1
            goto L4e
        L75:
            r7 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r1, r7)
            kotlin.collections.builders.b r7 = com.google.common.base.c.c(r4)
            return r7
        L7e:
            r7 = move-exception
            goto L84
        L80:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L84:
            throw r7     // Catch: java.lang.Throwable -> L85
        L85:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.toList(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.d):java.lang.Object");
    }
}
