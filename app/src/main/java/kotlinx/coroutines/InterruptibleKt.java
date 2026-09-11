package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.d;
import kotlin.coroutines.j;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.y;
import net.luminis.tls.engine.impl.c;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class InterruptibleKt {
    private static final int FINISHED = 1;
    private static final int INTERRUPTED = 3;
    private static final int INTERRUPTING = 2;
    private static final int WORKING = 0;

    /* JADX INFO: renamed from: kotlinx.coroutines.InterruptibleKt$runInterruptible$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements p {
        final /* synthetic */ kotlin.jvm.functions.a $block;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(kotlin.jvm.functions.a aVar, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$block = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super T> dVar) {
            return ((AnonymousClass2) create(coroutineScope, dVar)).invokeSuspend(y.a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                kotlin.a.e(obj);
                return InterruptibleKt.runInterruptibleInExpectedContext(((CoroutineScope) this.L$0).getCoroutineContext(), this.$block);
            }
            c.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    public static final <T> Object runInterruptible(kotlin.coroutines.i iVar, kotlin.jvm.functions.a aVar, d<? super T> dVar) {
        return BuildersKt.withContext(iVar, new AnonymousClass2(aVar, null), dVar);
    }

    public static /* synthetic */ Object runInterruptible$default(kotlin.coroutines.i iVar, kotlin.jvm.functions.a aVar, d dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            iVar = j.e;
        }
        return runInterruptible(iVar, aVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T runInterruptibleInExpectedContext(kotlin.coroutines.i iVar, kotlin.jvm.functions.a aVar) throws Throwable {
        try {
            ThreadState threadState = new ThreadState();
            threadState.setup(JobKt.getJob(iVar));
            try {
                return (T) aVar.invoke();
            } finally {
                threadState.clearInterrupt();
            }
        } catch (InterruptedException e) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
        }
    }
}
