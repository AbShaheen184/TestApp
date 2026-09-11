package com.i4studio.subslib;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final b a = new b();
    public static final ArrayList b = new ArrayList();

    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    /* JADX WARN: Code duplicated, block: B:19:0x0086 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0087  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0087 -> B:21:0x008d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.io.Serializable a(com.i4studio.subslib.model.a r13, kotlin.coroutines.jvm.internal.c r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.i4studio.subslib.a
            if (r0 == 0) goto L13
            r0 = r14
            com.i4studio.subslib.a r0 = (com.i4studio.subslib.a) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.F = r1
            goto L18
        L13:
            com.i4studio.subslib.a r0 = new com.i4studio.subslib.a
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.D
            int r1 = r0.F
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L40
            if (r1 != r3) goto L39
            int r13 = r0.C
            int r1 = r0.B
            java.util.Iterator r4 = r0.A
            java.util.Collection r5 = r0.z
            java.util.Collection r5 = (java.util.Collection) r5
            java.lang.String r6 = r0.y
            com.i4studio.subslib.model.a r7 = r0.e
            kotlin.a.e(r14)
            r11 = r5
            r5 = r13
            r13 = r7
            r7 = r6
            r6 = r11
            goto L8d
        L39:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r13)
            r13 = 0
            return r13
        L40:
            kotlin.a.e(r14)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r1 = com.i4studio.subslib.b.b
            java.util.Iterator r1 = r1.iterator()
            r4 = 0
            r5 = r14
            r14 = r1
            r6 = r2
            r1 = r4
        L53:
            boolean r7 = r14.hasNext()
            if (r7 == 0) goto L97
            java.lang.Object r7 = r14.next()
            com.i4studio.subslib.subdl.a r7 = (com.i4studio.subslib.subdl.a) r7
            r0.e = r13
            r0.y = r6
            r8 = r5
            java.util.Collection r8 = (java.util.Collection) r8
            r0.z = r8
            r0.A = r14
            r0.B = r1
            r0.C = r4
            r0.F = r3
            r7.getClass()
            kotlinx.coroutines.CoroutineDispatcher r8 = kotlinx.coroutines.Dispatchers.getIO()
            androidx.compose.foundation.text.input.internal.k r9 = new androidx.compose.foundation.text.input.internal.k
            r10 = 17
            r9.<init>(r7, r13, r2, r10)
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r8, r9, r0)
            kotlin.coroutines.intrinsics.a r8 = kotlin.coroutines.intrinsics.a.e
            if (r7 != r8) goto L87
            return r8
        L87:
            r11 = r4
            r4 = r14
            r14 = r7
            r7 = r6
            r6 = r5
            r5 = r11
        L8d:
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            kotlin.collections.o.C(r6, r14)
            r14 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            goto L53
        L97:
            java.util.List r5 = (java.util.List) r5
            java.util.HashSet r13 = new java.util.HashSet
            r13.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r0 = r5.iterator()
        La7:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lc0
            java.lang.Object r1 = r0.next()
            r2 = r1
            com.i4studio.subslib.model.c r2 = (com.i4studio.subslib.model.c) r2
            java.lang.String r2 = r2.e
            boolean r2 = r13.add(r2)
            if (r2 == 0) goto La7
            r14.add(r1)
            goto La7
        Lc0:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.i4studio.subslib.b.a(com.i4studio.subslib.model.a, kotlin.coroutines.jvm.internal.c):java.io.Serializable");
    }
}
