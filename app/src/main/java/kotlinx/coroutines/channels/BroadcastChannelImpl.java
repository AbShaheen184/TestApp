package kotlinx.coroutines.channels;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.o;
import kotlin.collections.u;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.selects.SelectInstance;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class BroadcastChannelImpl<E> extends BufferedChannel<E> implements BroadcastChannel<E> {
    private final int capacity;
    private Object lastConflatedElement;
    private final ReentrantLock lock;
    private final HashMap<SelectInstance<?>, Object> onSendInternalResult;
    private List<? extends BufferedChannel<E>> subscribers;

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public final class SubscriberBuffered extends BufferedChannel<E> {
        public SubscriberBuffered() {
            super(BroadcastChannelImpl.this.getCapacity(), null, 2, 0 == true ? 1 : 0);
        }

        @Override // kotlinx.coroutines.channels.BufferedChannel
        /* JADX INFO: renamed from: cancelImpl, reason: merged with bridge method [inline-methods] */
        public boolean cancelImpl$kotlinx_coroutines_core(Throwable th) {
            ReentrantLock reentrantLock = ((BroadcastChannelImpl) BroadcastChannelImpl.this).lock;
            BroadcastChannelImpl<E> broadcastChannelImpl = BroadcastChannelImpl.this;
            reentrantLock.lock();
            try {
                broadcastChannelImpl.removeSubscriber(this);
                return super.cancelImpl$kotlinx_coroutines_core(th);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public final class SubscriberConflated extends ConflatedBufferedChannel<E> {
        public SubscriberConflated() {
            super(1, BufferOverflow.DROP_OLDEST, null, 4, null);
        }

        @Override // kotlinx.coroutines.channels.BufferedChannel
        /* JADX INFO: renamed from: cancelImpl, reason: merged with bridge method [inline-methods] */
        public boolean cancelImpl$kotlinx_coroutines_core(Throwable th) {
            BroadcastChannelImpl.this.removeSubscriber(this);
            return super.cancelImpl$kotlinx_coroutines_core(th);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2", f = "BroadcastChannel.kt", l = {240}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements p {
        final /* synthetic */ Object $element;
        final /* synthetic */ SelectInstance<?> $select;
        int label;
        final /* synthetic */ BroadcastChannelImpl<E> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BroadcastChannelImpl<E> broadcastChannelImpl, Object obj, SelectInstance<?> selectInstance, kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.this$0 = broadcastChannelImpl;
            this.$element = obj;
            this.$select = selectInstance;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass2(this.this$0, this.$element, this.$select, dVar);
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(CoroutineScope coroutineScope, kotlin.coroutines.d<? super y> dVar) {
            return ((AnonymousClass2) create(coroutineScope, dVar)).invokeSuspend(y.a);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.d to kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2 for r5v1 'this'  kotlin.coroutines.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                int r0 = r5.label
                r1 = 1
                if (r0 == 0) goto L14
                if (r0 != r1) goto Ld
                kotlin.a.e(r6)     // Catch: java.lang.Throwable -> Lb
                goto L3b
            Lb:
                r6 = move-exception
                goto L26
            Ld:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                net.luminis.tls.engine.impl.c.r(r6)
                r6 = 0
                return r6
            L14:
                kotlin.a.e(r6)
                kotlinx.coroutines.channels.BroadcastChannelImpl<E> r6 = r5.this$0     // Catch: java.lang.Throwable -> Lb
                java.lang.Object r0 = r5.$element     // Catch: java.lang.Throwable -> Lb
                r5.label = r1     // Catch: java.lang.Throwable -> Lb
                java.lang.Object r6 = r6.send(r0, r5)     // Catch: java.lang.Throwable -> Lb
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.e
                if (r6 != r0) goto L3b
                return r0
            L26:
                kotlinx.coroutines.channels.BroadcastChannelImpl<E> r0 = r5.this$0
                boolean r0 = r0.isClosedForSend()
                if (r0 == 0) goto L7c
                boolean r0 = r6 instanceof kotlinx.coroutines.channels.ClosedSendChannelException
                if (r0 != 0) goto L3a
                kotlinx.coroutines.channels.BroadcastChannelImpl<E> r0 = r5.this$0
                java.lang.Throwable r0 = r0.getSendException()
                if (r0 != r6) goto L7c
            L3a:
                r1 = 0
            L3b:
                kotlinx.coroutines.channels.BroadcastChannelImpl<E> r6 = r5.this$0
                java.util.concurrent.locks.ReentrantLock r6 = kotlinx.coroutines.channels.BroadcastChannelImpl.access$getLock$p(r6)
                kotlinx.coroutines.channels.BroadcastChannelImpl<E> r0 = r5.this$0
                kotlinx.coroutines.selects.SelectInstance<?> r2 = r5.$select
                r6.lock()
                java.util.HashMap r3 = kotlinx.coroutines.channels.BroadcastChannelImpl.access$getOnSendInternalResult$p(r0)     // Catch: java.lang.Throwable -> L72
                kotlin.y r4 = kotlin.y.a
                if (r1 == 0) goto L52
                r1 = r4
                goto L56
            L52:
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()     // Catch: java.lang.Throwable -> L72
            L56:
                r3.put(r2, r1)     // Catch: java.lang.Throwable -> L72
                r2.getClass()     // Catch: java.lang.Throwable -> L72
                r1 = r2
                kotlinx.coroutines.selects.SelectImplementation r1 = (kotlinx.coroutines.selects.SelectImplementation) r1     // Catch: java.lang.Throwable -> L72
                r1 = r2
                kotlinx.coroutines.selects.SelectImplementation r1 = (kotlinx.coroutines.selects.SelectImplementation) r1     // Catch: java.lang.Throwable -> L72
                kotlinx.coroutines.selects.TrySelectDetailedResult r1 = r1.trySelectDetailed(r0, r4)     // Catch: java.lang.Throwable -> L72
                kotlinx.coroutines.selects.TrySelectDetailedResult r3 = kotlinx.coroutines.selects.TrySelectDetailedResult.REREGISTER     // Catch: java.lang.Throwable -> L72
                if (r1 == r3) goto L74
                java.util.HashMap r0 = kotlinx.coroutines.channels.BroadcastChannelImpl.access$getOnSendInternalResult$p(r0)     // Catch: java.lang.Throwable -> L72
                r0.remove(r2)     // Catch: java.lang.Throwable -> L72
                goto L74
            L72:
                r0 = move-exception
                goto L78
            L74:
                r6.unlock()
                return r4
            L78:
                r6.unlock()
                throw r0
            L7c:
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BroadcastChannelImpl.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.BroadcastChannelImpl$send$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.BroadcastChannelImpl", f = "BroadcastChannel.kt", l = {Token.YIELD_STAR}, m = "send")
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ BroadcastChannelImpl<E> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BroadcastChannelImpl<E> broadcastChannelImpl, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(dVar);
            this.this$0 = broadcastChannelImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.send(null, this);
        }
    }

    public BroadcastChannelImpl(int i) {
        super(0, null);
        this.capacity = i;
        if (i < 1 && i != -1) {
            net.luminis.tls.engine.impl.c.p(androidx.privacysandbox.ads.adservices.java.internal.a.p("BroadcastChannel capacity must be positive or Channel.CONFLATED, but ", i, " was specified"));
            throw null;
        }
        this.lock = new ReentrantLock();
        this.subscribers = u.e;
        this.lastConflatedElement = BroadcastChannelKt.NO_ELEMENT;
        this.onSendInternalResult = new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void removeSubscriber(ReceiveChannel<? extends E> receiveChannel) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            List<? extends BufferedChannel<E>> list = this.subscribers;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((BufferedChannel) obj) != receiveChannel) {
                    arrayList.add(obj);
                }
            }
            this.subscribers = arrayList;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public boolean cancelImpl$kotlinx_coroutines_core(Throwable th) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            Iterator<T> it = this.subscribers.iterator();
            while (it.hasNext()) {
                ((BufferedChannel) it.next()).cancelImpl$kotlinx_coroutines_core(th);
            }
            this.lastConflatedElement = BroadcastChannelKt.NO_ELEMENT;
            return super.cancelImpl$kotlinx_coroutines_core(th);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public boolean close(Throwable th) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            Iterator<T> it = this.subscribers.iterator();
            while (it.hasNext()) {
                ((BufferedChannel) it.next()).close(th);
            }
            List<? extends BufferedChannel<E>> list = this.subscribers;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((BufferedChannel) obj).hasElements$kotlinx_coroutines_core()) {
                    arrayList.add(obj);
                }
            }
            this.subscribers = arrayList;
            return super.close(th);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int getCapacity() {
        return this.capacity;
    }

    public final E getValue() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (isClosedForSend()) {
                Throwable closeCause = getCloseCause();
                if (closeCause == null) {
                    throw new IllegalStateException("This broadcast channel is closed");
                }
                throw closeCause;
            }
            if (this.lastConflatedElement == BroadcastChannelKt.NO_ELEMENT) {
                throw new IllegalStateException("No value");
            }
            E e = (E) this.lastConflatedElement;
            reentrantLock.unlock();
            return e;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final E getValueOrNull() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            E e = null;
            if (!isClosedForReceive() && this.lastConflatedElement != BroadcastChannelKt.NO_ELEMENT) {
                e = (E) this.lastConflatedElement;
            }
            return e;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return super.isClosedForSend();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    public ReceiveChannel<E> openSubscription() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            SubscriberBuffered subscriberConflated = this.capacity == -1 ? new SubscriberConflated() : new SubscriberBuffered();
            if (isClosedForSend() && this.lastConflatedElement == BroadcastChannelKt.NO_ELEMENT) {
                ((BufferedChannel) subscriberConflated).close(getCloseCause());
                return subscriberConflated;
            }
            if (this.lastConflatedElement != BroadcastChannelKt.NO_ELEMENT) {
                ((BufferedChannel) subscriberConflated).mo28trySendJP2dKIU(getValue());
            }
            this.subscribers = o.W(this.subscribers, subscriberConflated);
            return subscriberConflated;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public void registerSelectForSend(SelectInstance<?> selectInstance, Object obj) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            Object objRemove = this.onSendInternalResult.remove(selectInstance);
            if (objRemove != null) {
                selectInstance.selectInRegistrationPhase(objRemove);
                reentrantLock.unlock();
            } else {
                reentrantLock.unlock();
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(selectInstance.getContext()), null, CoroutineStart.UNDISPATCHED, new AnonymousClass2(this, obj, selectInstance, null), 1, null);
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0061  */
    /* JADX WARN: Code duplicated, block: B:28:0x0077 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x0078  */
    /* JADX WARN: Code duplicated, block: B:32:0x0083  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0078 -> B:30:0x007b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public java.lang.Object send(E r7, kotlin.coroutines.d<? super kotlin.y> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.BroadcastChannelImpl.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.BroadcastChannelImpl$send$1 r0 = (kotlinx.coroutines.channels.BroadcastChannelImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.BroadcastChannelImpl$send$1 r0 = new kotlinx.coroutines.channels.BroadcastChannelImpl$send$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2f
            java.lang.Object r7 = r0.L$2
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r1 = r0.L$1
            java.lang.Object r3 = r0.L$0
            kotlinx.coroutines.channels.BroadcastChannelImpl r3 = (kotlinx.coroutines.channels.BroadcastChannelImpl) r3
            kotlin.a.e(r8)
            goto L7b
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r7)
            r7 = 0
            return r7
        L36:
            kotlin.a.e(r8)
            java.util.concurrent.locks.ReentrantLock r8 = r6.lock
            r8.lock()
            boolean r1 = r6.isClosedForSend()     // Catch: java.lang.Throwable -> L4c
            if (r1 != 0) goto L94
            int r1 = r6.capacity     // Catch: java.lang.Throwable -> L4c
            r3 = -1
            if (r1 != r3) goto L4e
            r6.lastConflatedElement = r7     // Catch: java.lang.Throwable -> L4c
            goto L4e
        L4c:
            r7 = move-exception
            goto L99
        L4e:
            java.util.List<? extends kotlinx.coroutines.channels.BufferedChannel<E>> r1 = r6.subscribers     // Catch: java.lang.Throwable -> L4c
            r8.unlock()
            java.util.Iterator r8 = r1.iterator()
            r3 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L5b:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L91
            java.lang.Object r1 = r7.next()
            kotlinx.coroutines.channels.BufferedChannel r1 = (kotlinx.coroutines.channels.BufferedChannel) r1
            r0.L$0 = r3
            r0.L$1 = r8
            r0.L$2 = r7
            r0.label = r2
            java.lang.Object r1 = r1.sendBroadcast$kotlinx_coroutines_core(r8, r0)
            kotlin.coroutines.intrinsics.a r4 = kotlin.coroutines.intrinsics.a.e
            if (r1 != r4) goto L78
            return r4
        L78:
            r5 = r1
            r1 = r8
            r8 = r5
        L7b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L8f
            boolean r8 = r3.isClosedForSend()
            if (r8 != 0) goto L8a
            goto L8f
        L8a:
            java.lang.Throwable r7 = r3.getSendException()
            throw r7
        L8f:
            r8 = r1
            goto L5b
        L91:
            kotlin.y r7 = kotlin.y.a
            return r7
        L94:
            java.lang.Throwable r7 = r6.getSendException()     // Catch: java.lang.Throwable -> L4c
            throw r7     // Catch: java.lang.Throwable -> L4c
        L99:
            r8.unlock()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BroadcastChannelImpl.send(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.lastConflatedElement != BroadcastChannelKt.NO_ELEMENT) {
            str = "CONFLATED_ELEMENT=" + this.lastConflatedElement + "; ";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append("BROADCAST=<");
        sb.append(super.toString());
        sb.append(">; SUBSCRIBERS=");
        sb.append(o.R(this.subscribers, ";", "<", ">", null, 56));
        return sb.toString();
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU, reason: not valid java name */
    public Object mo28trySendJP2dKIU(E e) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (isClosedForSend()) {
                Object objMo28trySendJP2dKIU = super.mo28trySendJP2dKIU(e);
                reentrantLock.unlock();
                return objMo28trySendJP2dKIU;
            }
            List<? extends BufferedChannel<E>> list = this.subscribers;
            if (list == null || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((BufferedChannel) it.next()).shouldSendSuspend$kotlinx_coroutines_core()) {
                        Object objM56failurePtdJZtk = ChannelResult.Companion.m56failurePtdJZtk();
                        reentrantLock.unlock();
                        return objM56failurePtdJZtk;
                    }
                }
            }
            if (this.capacity == -1) {
                this.lastConflatedElement = e;
            }
            Iterator<T> it2 = this.subscribers.iterator();
            while (it2.hasNext()) {
                ((BufferedChannel) it2.next()).mo28trySendJP2dKIU(e);
            }
            Object objM57successJP2dKIU = ChannelResult.Companion.m57successJP2dKIU(y.a);
            reentrantLock.unlock();
            return objM57successJP2dKIU;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    public static /* synthetic */ void getValueOrNull$annotations() {
    }
}
