package kotlinx.coroutines.selects;

import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.l;
import kotlin.y;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class WhileSelectKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.WhileSelectKt$whileSelect$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.selects.WhileSelectKt", f = "WhileSelect.kt", l = {Token.GETPROPNOWARN}, m = "whileSelect")
    public static final class AnonymousClass1 extends c {
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
            return WhileSelectKt.whileSelect(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0054  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0049 -> B:18:0x004c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlinx.coroutines.ExperimentalCoroutinesApi
    public static final java.lang.Object whileSelect(kotlin.jvm.functions.l r4, kotlin.coroutines.d<? super kotlin.y> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.selects.WhileSelectKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.selects.WhileSelectKt$whileSelect$1 r0 = (kotlinx.coroutines.selects.WhileSelectKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.selects.WhileSelectKt$whileSelect$1 r0 = new kotlinx.coroutines.selects.WhileSelectKt$whileSelect$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            java.lang.Object r4 = r0.L$0
            kotlin.jvm.functions.l r4 = (kotlin.jvm.functions.l) r4
            kotlin.a.e(r5)
            goto L4c
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r4)
            r4 = 0
            return r4
        L30:
            kotlin.a.e(r5)
        L33:
            kotlinx.coroutines.selects.SelectImplementation r5 = new kotlinx.coroutines.selects.SelectImplementation
            kotlin.coroutines.i r1 = r0.getContext()
            r5.<init>(r1)
            r4.invoke(r5)
            r0.L$0 = r4
            r0.label = r2
            java.lang.Object r5 = r5.doSelect(r0)
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.e
            if (r5 != r1) goto L4c
            return r1
        L4c:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L33
            kotlin.y r4 = kotlin.y.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.WhileSelectKt.whileSelect(kotlin.jvm.functions.l, kotlin.coroutines.d):java.lang.Object");
    }

    @ExperimentalCoroutinesApi
    private static final Object whileSelect$$forInline(l lVar, d<? super y> dVar) {
        throw null;
    }
}
