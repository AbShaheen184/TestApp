package kotlinx.coroutines;

import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.coroutines.i;
import kotlin.coroutines.j;
import kotlin.jvm.functions.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class BuildersKt__BuildersKt {
    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    public static final <T> T runBlocking(i iVar, p pVar) {
        EventLoop eventLoopCurrentOrNull$kotlinx_coroutines_core;
        i iVarNewCoroutineContext;
        Thread threadCurrentThread = Thread.currentThread();
        f fVar = (f) iVar.get(e.e);
        if (fVar == null) {
            eventLoopCurrentOrNull$kotlinx_coroutines_core = ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
            iVarNewCoroutineContext = CoroutineContextKt.newCoroutineContext(GlobalScope.INSTANCE, iVar.plus(eventLoopCurrentOrNull$kotlinx_coroutines_core));
        } else {
            EventLoop eventLoop = fVar instanceof EventLoop ? (EventLoop) fVar : null;
            if (eventLoop == null) {
                eventLoopCurrentOrNull$kotlinx_coroutines_core = ThreadLocalEventLoop.INSTANCE.currentOrNull$kotlinx_coroutines_core();
            } else {
                EventLoop eventLoop2 = eventLoop.shouldBeProcessedFromContext() ? eventLoop : null;
                if (eventLoop2 == null) {
                    eventLoopCurrentOrNull$kotlinx_coroutines_core = ThreadLocalEventLoop.INSTANCE.currentOrNull$kotlinx_coroutines_core();
                } else {
                    eventLoopCurrentOrNull$kotlinx_coroutines_core = eventLoop2;
                }
            }
            iVarNewCoroutineContext = CoroutineContextKt.newCoroutineContext(GlobalScope.INSTANCE, iVar);
        }
        BlockingCoroutine blockingCoroutine = new BlockingCoroutine(iVarNewCoroutineContext, threadCurrentThread, eventLoopCurrentOrNull$kotlinx_coroutines_core);
        blockingCoroutine.start(CoroutineStart.DEFAULT, blockingCoroutine, pVar);
        return (T) blockingCoroutine.joinBlocking();
    }

    public static /* synthetic */ Object runBlocking$default(i iVar, p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            iVar = j.e;
        }
        return BuildersKt.runBlocking(iVar, pVar);
    }
}
