package kotlinx.coroutines.channels;

import kotlin.coroutines.i;
import kotlin.coroutines.j;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class ProduceKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ProduceKt$awaitClose$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", l = {302}, m = "awaitClose")
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ProduceKt.awaitClose(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object awaitClose(ProducerScope<?> producerScope, kotlin.jvm.functions.a aVar, kotlin.coroutines.d<? super y> dVar) {
        AnonymousClass1 anonymousClass1;
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
        try {
            if (i2 == 0) {
                kotlin.a.e(obj);
                if (anonymousClass1.getContext().get(Job.Key) != producerScope) {
                    net.luminis.tls.engine.impl.c.r("awaitClose() can only be invoked from the producer context");
                    return null;
                }
                anonymousClass1.L$0 = producerScope;
                anonymousClass1.L$1 = aVar;
                anonymousClass1.label = 1;
                final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(com.google.android.material.shape.e.g(anonymousClass1), 1);
                cancellableContinuationImpl.initCancellability();
                producerScope.invokeOnClose(new l() { // from class: kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1
                    @Override // kotlin.jvm.functions.l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((Throwable) obj2);
                        return y.a;
                    }

                    public final void invoke(Throwable th) {
                        cancellableContinuationImpl.resumeWith(y.a);
                    }
                });
                Object result = cancellableContinuationImpl.getResult();
                kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                if (result == aVar2) {
                    return aVar2;
                }
            } else {
                if (i2 != 1) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar = (kotlin.jvm.functions.a) anonymousClass1.L$1;
                kotlin.a.e(obj);
            }
            aVar.invoke();
            return y.a;
        } catch (Throwable th) {
            aVar.invoke();
            throw th;
        }
    }

    public static /* synthetic */ Object awaitClose$default(ProducerScope producerScope, kotlin.jvm.functions.a aVar, kotlin.coroutines.d dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = new d();
        }
        return awaitClose(producerScope, aVar, dVar);
    }

    public static final <E> ReceiveChannel<E> produce(CoroutineScope coroutineScope, i iVar, int i, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, l lVar, p pVar) {
        ProducerCoroutine producerCoroutine = new ProducerCoroutine(CoroutineContextKt.newCoroutineContext(coroutineScope, iVar), ChannelKt.Channel$default(i, bufferOverflow, null, 4, null));
        if (lVar != null) {
            producerCoroutine.invokeOnCompletion(lVar);
        }
        producerCoroutine.start(coroutineStart, producerCoroutine, pVar);
        return producerCoroutine;
    }

    public static /* synthetic */ ReceiveChannel produce$default(CoroutineScope coroutineScope, i iVar, int i, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, l lVar, p pVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            iVar = j.e;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        if ((i2 & 8) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        if ((i2 & 16) != 0) {
            lVar = null;
        }
        l lVar2 = lVar;
        return produce(coroutineScope, iVar, i, bufferOverflow, coroutineStart, lVar2, pVar);
    }

    @InternalCoroutinesApi
    public static final <E> ReceiveChannel<E> produce(CoroutineScope coroutineScope, i iVar, int i, CoroutineStart coroutineStart, l lVar, p pVar) {
        return produce(coroutineScope, iVar, i, BufferOverflow.SUSPEND, coroutineStart, lVar, pVar);
    }

    @ExperimentalCoroutinesApi
    public static final <E> ReceiveChannel<E> produce(CoroutineScope coroutineScope, i iVar, int i, p pVar) {
        return produce(coroutineScope, iVar, i, BufferOverflow.SUSPEND, CoroutineStart.DEFAULT, null, pVar);
    }

    public static /* synthetic */ ReceiveChannel produce$default(CoroutineScope coroutineScope, i iVar, int i, CoroutineStart coroutineStart, l lVar, p pVar, int i2, Object obj) {
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
        return produce(coroutineScope, iVar, i, coroutineStart2, lVar, pVar);
    }

    public static /* synthetic */ ReceiveChannel produce$default(CoroutineScope coroutineScope, i iVar, int i, p pVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            iVar = j.e;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return produce(coroutineScope, iVar, i, pVar);
    }
}
