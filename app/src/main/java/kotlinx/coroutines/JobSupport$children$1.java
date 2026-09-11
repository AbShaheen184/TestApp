package kotlinx.coroutines;

import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.functions.p;
import kotlin.sequences.j;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", l = {1003, 1005}, m = "invokeSuspend")
public final class JobSupport$children$1 extends h implements p {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ JobSupport this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JobSupport$children$1(JobSupport jobSupport, d<? super JobSupport$children$1> dVar) {
        super(2, dVar);
        this.this$0 = jobSupport;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        JobSupport$children$1 jobSupport$children$1 = new JobSupport$children$1(this.this$0, dVar);
        jobSupport$children$1.L$0 = obj;
        return jobSupport$children$1;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(j jVar, d<? super y> dVar) {
        return ((JobSupport$children$1) create(jVar, dVar)).invokeSuspend(y.a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0061  */
    /* JADX WARN: Code duplicated, block: B:23:0x0065  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0063 -> B:25:0x0076). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.label
            r1 = 2
            r2 = 1
            kotlin.coroutines.intrinsics.a r3 = kotlin.coroutines.intrinsics.a.e
            if (r0 == 0) goto L27
            if (r0 == r2) goto L23
            if (r0 != r1) goto L1c
            java.lang.Object r0 = r5.L$2
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            java.lang.Object r2 = r5.L$1
            kotlinx.coroutines.internal.LockFreeLinkedListHead r2 = (kotlinx.coroutines.internal.LockFreeLinkedListHead) r2
            java.lang.Object r4 = r5.L$0
            kotlin.sequences.j r4 = (kotlin.sequences.j) r4
            kotlin.a.e(r6)
            goto L76
        L1c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r6)
            r6 = 0
            return r6
        L23:
            kotlin.a.e(r6)
            goto L7b
        L27:
            kotlin.a.e(r6)
            java.lang.Object r6 = r5.L$0
            kotlin.sequences.j r6 = (kotlin.sequences.j) r6
            kotlinx.coroutines.JobSupport r0 = r5.this$0
            java.lang.Object r0 = r0.getState$kotlinx_coroutines_core()
            boolean r4 = r0 instanceof kotlinx.coroutines.ChildHandleNode
            if (r4 == 0) goto L42
            kotlinx.coroutines.ChildHandleNode r0 = (kotlinx.coroutines.ChildHandleNode) r0
            kotlinx.coroutines.ChildJob r0 = r0.childJob
            r5.label = r2
            r6.b(r0, r5)
            return r3
        L42:
            boolean r2 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r2 == 0) goto L7b
            kotlinx.coroutines.Incomplete r0 = (kotlinx.coroutines.Incomplete) r0
            kotlinx.coroutines.NodeList r0 = r0.getList()
            if (r0 == 0) goto L7b
            java.lang.Object r2 = r0.getNext()
            r2.getClass()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r2
            r4 = r2
            r2 = r0
            r0 = r4
            r4 = r6
        L5b:
            boolean r6 = kotlin.jvm.internal.l.a(r0, r2)
            if (r6 != 0) goto L7b
            boolean r6 = r0 instanceof kotlinx.coroutines.ChildHandleNode
            if (r6 == 0) goto L76
            r6 = r0
            kotlinx.coroutines.ChildHandleNode r6 = (kotlinx.coroutines.ChildHandleNode) r6
            kotlinx.coroutines.ChildJob r6 = r6.childJob
            r5.L$0 = r4
            r5.L$1 = r2
            r5.L$2 = r0
            r5.label = r1
            r4.b(r6, r5)
            return r3
        L76:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.getNextNode()
            goto L5b
        L7b:
            kotlin.y r6 = kotlin.y.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport$children$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
