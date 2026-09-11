package kotlinx.coroutines;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.y;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class AwaitKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.AwaitKt$joinAll$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", l = {Token.NULL}, m = "joinAll")
    public static final class AnonymousClass1 extends c {
        int I$0;
        int I$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AwaitKt.joinAll((Job[]) null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.AwaitKt$joinAll$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", l = {Token.INSTANCEOF}, m = "joinAll")
    public static final class AnonymousClass3 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass3(d<? super AnonymousClass3> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AwaitKt.joinAll((Collection<? extends Job>) null, this);
        }
    }

    public static final <T> Object awaitAll(Collection<? extends Deferred<? extends T>> collection, d<? super List<? extends T>> dVar) {
        return collection.isEmpty() ? u.e : new AwaitAll((Deferred[]) collection.toArray(new Deferred[0])).await(dVar);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0051 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004f -> B:19:0x0052). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object joinAll(kotlinx.coroutines.Job[] r6, kotlin.coroutines.d<? super kotlin.y> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.AwaitKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.AwaitKt$joinAll$1 r0 = (kotlinx.coroutines.AwaitKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.AwaitKt$joinAll$1 r0 = new kotlinx.coroutines.AwaitKt$joinAll$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2e
            int r6 = r0.I$1
            int r1 = r0.I$0
            java.lang.Object r3 = r0.L$0
            kotlinx.coroutines.Job[] r3 = (kotlinx.coroutines.Job[]) r3
            kotlin.a.e(r7)
            r7 = r3
            goto L52
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r6)
            r6 = 0
            return r6
        L35:
            kotlin.a.e(r7)
            int r7 = r6.length
            r1 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L3d:
            if (r1 >= r6) goto L54
            r3 = r7[r1]
            r0.L$0 = r7
            r0.I$0 = r1
            r0.I$1 = r6
            r0.label = r2
            java.lang.Object r3 = r3.join(r0)
            kotlin.coroutines.intrinsics.a r4 = kotlin.coroutines.intrinsics.a.e
            if (r3 != r4) goto L52
            return r4
        L52:
            int r1 = r1 + r2
            goto L3d
        L54:
            kotlin.y r6 = kotlin.y.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.AwaitKt.joinAll(kotlinx.coroutines.Job[], kotlin.coroutines.d):java.lang.Object");
    }

    public static final <T> Object awaitAll(Deferred<? extends T>[] deferredArr, d<? super List<? extends T>> dVar) {
        return deferredArr.length == 0 ? u.e : new AwaitAll(deferredArr).await(dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object joinAll(Collection<? extends Job> collection, d<? super y> dVar) {
        AnonymousClass3 anonymousClass3;
        Iterator it;
        if (dVar instanceof AnonymousClass3) {
            anonymousClass3 = (AnonymousClass3) dVar;
            int i = anonymousClass3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass3.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass3 = new AnonymousClass3(dVar);
            }
        } else {
            anonymousClass3 = new AnonymousClass3(dVar);
        }
        Object obj = anonymousClass3.result;
        int i2 = anonymousClass3.label;
        if (i2 == 0) {
            kotlin.a.e(obj);
            it = collection.iterator();
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = (Iterator) anonymousClass3.L$0;
            kotlin.a.e(obj);
        }
        while (it.hasNext()) {
            Job job = (Job) it.next();
            anonymousClass3.L$0 = it;
            anonymousClass3.label = 1;
            Object objJoin = job.join(anonymousClass3);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objJoin == aVar) {
                return aVar;
            }
        }
        return y.a;
    }
}
