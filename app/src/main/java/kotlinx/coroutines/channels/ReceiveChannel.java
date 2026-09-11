package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.DelicateCoroutinesApi;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.selects.SelectClause1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface ReceiveChannel<E> {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ReceiveChannel$receiveOrNull$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ReceiveChannel$DefaultImpls", f = "Channel.kt", l = {770}, m = "receiveOrNull")
    public static final class AnonymousClass1<E> extends kotlin.coroutines.jvm.internal.c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.receiveOrNull(null, this);
        }
    }

    @kotlin.c
    /* synthetic */ void cancel();

    void cancel(CancellationException cancellationException);

    @kotlin.c
    /* synthetic */ boolean cancel(Throwable th);

    SelectClause1<E> getOnReceive();

    SelectClause1<ChannelResult<E>> getOnReceiveCatching();

    SelectClause1<E> getOnReceiveOrNull();

    boolean isClosedForReceive();

    boolean isEmpty();

    ChannelIterator<E> iterator();

    @kotlin.c
    E poll();

    Object receive(kotlin.coroutines.d<? super E> dVar);

    /* JADX INFO: renamed from: receiveCatching-JP2dKIU */
    Object mo34receiveCatchingJP2dKIU(kotlin.coroutines.d<? super ChannelResult<? extends E>> dVar);

    @kotlin.c
    Object receiveOrNull(kotlin.coroutines.d<? super E> dVar);

    /* JADX INFO: renamed from: tryReceive-PtdJZtk */
    Object mo35tryReceivePtdJZtk();

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class DefaultImpls {
        public static /* synthetic */ boolean cancel$default(ReceiveChannel receiveChannel, Throwable th, int i, Object obj) {
            if (obj != null) {
                com.google.gson.b.r("Super calls with default arguments not supported in this target, function: cancel");
                return false;
            }
            if ((i & 1) != 0) {
                th = null;
            }
            return receiveChannel.cancel(th);
        }

        public static <E> SelectClause1<E> getOnReceiveOrNull(ReceiveChannel<? extends E> receiveChannel) {
            receiveChannel.getClass();
            return ((BufferedChannel) receiveChannel).getOnReceiveOrNull();
        }

        @kotlin.c
        public static <E> E poll(ReceiveChannel<? extends E> receiveChannel) throws Throwable {
            Object objMo35tryReceivePtdJZtk = receiveChannel.mo35tryReceivePtdJZtk();
            if (ChannelResult.m52isSuccessimpl(objMo35tryReceivePtdJZtk)) {
                return (E) ChannelResult.m48getOrThrowimpl(objMo35tryReceivePtdJZtk);
            }
            Throwable thM46exceptionOrNullimpl = ChannelResult.m46exceptionOrNullimpl(objMo35tryReceivePtdJZtk);
            if (thM46exceptionOrNullimpl == null) {
                return null;
            }
            throw StackTraceRecoveryKt.recoverStackTrace(thM46exceptionOrNullimpl);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @kotlin.c
        public static <E> Object receiveOrNull(ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.d<? super E> dVar) {
            AnonymousClass1 anonymousClass1;
            Object objMo34receiveCatchingJP2dKIU;
            if (dVar instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) dVar;
                int i = anonymousClass1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.label = i - Integer.MIN_VALUE;
                } else {
                    anonymousClass1 = new AnonymousClass1(dVar);
                }
            } else {
                anonymousClass1 = new AnonymousClass1(dVar);
            }
            Object obj = anonymousClass1.result;
            int i2 = anonymousClass1.label;
            if (i2 == 0) {
                kotlin.a.e(obj);
                anonymousClass1.label = 1;
                objMo34receiveCatchingJP2dKIU = receiveChannel.mo34receiveCatchingJP2dKIU(anonymousClass1);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objMo34receiveCatchingJP2dKIU == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                objMo34receiveCatchingJP2dKIU = ((ChannelResult) obj).m54unboximpl();
            }
            return ChannelResult.m47getOrNullimpl(objMo34receiveCatchingJP2dKIU);
        }

        public static /* synthetic */ void cancel$default(ReceiveChannel receiveChannel, CancellationException cancellationException, int i, Object obj) {
            if (obj != null) {
                com.google.gson.b.r("Super calls with default arguments not supported in this target, function: cancel");
                return;
            }
            if ((i & 1) != 0) {
                cancellationException = null;
            }
            receiveChannel.cancel(cancellationException);
        }

        @kotlin.c
        public static /* synthetic */ void getOnReceiveOrNull$annotations() {
        }

        @DelicateCoroutinesApi
        public static /* synthetic */ void isClosedForReceive$annotations() {
        }

        @ExperimentalCoroutinesApi
        public static /* synthetic */ void isEmpty$annotations() {
        }
    }
}
