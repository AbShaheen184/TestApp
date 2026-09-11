package androidx.compose.foundation.gestures;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x2 {
    public static final l0 a = new l0(3, 2, null);

    /* JADX WARN: Code duplicated, block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004c A[LOOP:0: B:19:0x004a->B:20:0x004c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x006b A[LOOP:1: B:22:0x005e->B:26:0x006b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:23:0x0060
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(androidx.compose.ui.input.pointer.k0 r7, kotlin.coroutines.jvm.internal.a r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.p2
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.p2 r0 = (androidx.compose.foundation.gestures.p2) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.p2 r0 = new androidx.compose.foundation.gestures.p2
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.y
            int r1 = r0.z
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            androidx.compose.ui.input.pointer.k0 r7 = r0.e
            kotlin.a.e(r8)
            goto L40
        L27:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r7)
            r7 = 0
            return r7
        L2e:
            kotlin.a.e(r8)
        L31:
            r0.e = r7
            r0.z = r2
            androidx.compose.ui.input.pointer.n r8 = androidx.compose.ui.input.pointer.n.y
            java.lang.Object r8 = r7.b(r8, r0)
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.e
            if (r8 != r1) goto L40
            return r1
        L40:
            androidx.compose.ui.input.pointer.m r8 = (androidx.compose.ui.input.pointer.m) r8
            java.lang.Object r1 = r8.a
            int r3 = r1.size()
            r4 = 0
            r5 = r4
        L4a:
            if (r5 >= r3) goto L58
            java.lang.Object r6 = r1.get(r5)
            androidx.compose.ui.input.pointer.v r6 = (androidx.compose.ui.input.pointer.v) r6
            r6.a()
            int r5 = r5 + 1
            goto L4a
        L58:
            java.lang.Object r8 = r8.a
            int r1 = r8.size()
        L5e:
            if (r4 >= r1) goto L6e
            java.lang.Object r3 = r8.get(r4)
            androidx.compose.ui.input.pointer.v r3 = (androidx.compose.ui.input.pointer.v) r3
            boolean r3 = r3.d
            if (r3 == 0) goto L6b
            goto L31
        L6b:
            int r4 = r4 + 1
            goto L5e
        L6e:
            kotlin.y r7 = kotlin.y.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.x2.a(androidx.compose.ui.input.pointer.k0, kotlin.coroutines.jvm.internal.a):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0047 -> B:18:0x004a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(androidx.compose.ui.input.pointer.k0 r5, boolean r6, androidx.compose.ui.input.pointer.n r7, kotlin.coroutines.jvm.internal.a r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.n2
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.n2 r0 = (androidx.compose.foundation.gestures.n2) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.n2 r0 = new androidx.compose.foundation.gestures.n2
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.A
            int r1 = r0.B
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2f
            boolean r5 = r0.z
            androidx.compose.ui.input.pointer.n r6 = r0.y
            androidx.compose.ui.input.pointer.k0 r7 = r0.e
            kotlin.a.e(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4a
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r5)
            r5 = 0
            return r5
        L36:
            kotlin.a.e(r8)
        L39:
            r0.e = r5
            r0.y = r7
            r0.z = r6
            r0.B = r2
            java.lang.Object r8 = r5.b(r7, r0)
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.e
            if (r8 != r1) goto L4a
            return r1
        L4a:
            androidx.compose.ui.input.pointer.m r8 = (androidx.compose.ui.input.pointer.m) r8
            boolean r1 = e(r8, r6)
            if (r1 == 0) goto L39
            java.lang.Object r5 = r8.a
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.x2.b(androidx.compose.ui.input.pointer.k0, boolean, androidx.compose.ui.input.pointer.n, kotlin.coroutines.jvm.internal.a):java.lang.Object");
    }

    public static Object d(androidx.compose.ui.input.pointer.y yVar, kotlin.jvm.functions.l lVar, kotlin.coroutines.d dVar) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new androidx.compose.animation.core.g(yVar, a, (kotlin.jvm.functions.l) null, (kotlin.jvm.functions.l) null, lVar, (kotlin.coroutines.d) null), dVar);
        return objCoroutineScope == kotlin.coroutines.intrinsics.a.e ? objCoroutineScope : kotlin.y.a;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static boolean e(androidx.compose.ui.input.pointer.m mVar, boolean z) {
        ?? r4 = mVar.a;
        int size = r4.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.input.pointer.v vVar = (androidx.compose.ui.input.pointer.v) r4.get(i);
            if (!(z ? androidx.compose.ui.input.pointer.u.a(vVar) : androidx.compose.ui.input.pointer.u.b(vVar))) {
                return false;
            }
        }
        return true;
    }

    public static Job f(CoroutineScope coroutineScope, Job job, kotlin.jvm.functions.p pVar) {
        return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new androidx.compose.animation.b0(job, pVar, (kotlin.coroutines.d) null), 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object g(androidx.compose.ui.input.pointer.k0 k0Var, androidx.compose.ui.input.pointer.n nVar, kotlin.coroutines.jvm.internal.a aVar) {
        v2 v2Var;
        kotlin.jvm.internal.z zVar;
        if (aVar instanceof v2) {
            v2Var = (v2) aVar;
            int i = v2Var.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                v2Var.z = i - Integer.MIN_VALUE;
            } else {
                v2Var = new v2(aVar);
            }
        } else {
            v2Var = new v2(aVar);
        }
        Object obj = v2Var.y;
        int i2 = v2Var.z;
        try {
            if (i2 == 0) {
                kotlin.a.e(obj);
                kotlin.jvm.internal.z zVar2 = new kotlin.jvm.internal.z();
                zVar2.e = x0.a;
                long jB = k0Var.f().b();
                kotlin.jvm.functions.p o0Var = new o0(nVar, zVar2, (kotlin.coroutines.d) null);
                v2Var.e = zVar2;
                v2Var.z = 1;
                Object objG = k0Var.g(jB, o0Var, v2Var);
                Object obj2 = kotlin.coroutines.intrinsics.a.e;
                if (objG == obj2) {
                    return obj2;
                }
                zVar = zVar2;
            } else {
                if (i2 != 1) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zVar = v2Var.e;
                kotlin.a.e(obj);
            }
            return zVar.e;
        } catch (androidx.compose.ui.input.pointer.o unused) {
            return z0.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bc A[LOOP:1: B:23:0x005e->B:44:0x00bc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x006c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00b7 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x009d -> B:13:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object h(androidx.compose.ui.input.pointer.k0 r13, androidx.compose.ui.input.pointer.n r14, kotlin.coroutines.jvm.internal.a r15) {
        /*
            boolean r0 = r15 instanceof androidx.compose.foundation.gestures.w2
            if (r0 == 0) goto L13
            r0 = r15
            androidx.compose.foundation.gestures.w2 r0 = (androidx.compose.foundation.gestures.w2) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.w2 r0 = new androidx.compose.foundation.gestures.w2
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.z
            int r1 = r0.A
            r2 = 2
            r3 = 0
            r4 = 1
            kotlin.coroutines.intrinsics.a r5 = kotlin.coroutines.intrinsics.a.e
            if (r1 == 0) goto L42
            if (r1 == r4) goto L3a
            if (r1 != r2) goto L33
            androidx.compose.ui.input.pointer.n r13 = r0.y
            androidx.compose.ui.input.pointer.k0 r14 = r0.e
            kotlin.a.e(r15)
        L2e:
            r12 = r14
            r14 = r13
            r13 = r12
            goto La0
        L33:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r13)
            r13 = 0
            return r13
        L3a:
            androidx.compose.ui.input.pointer.n r13 = r0.y
            androidx.compose.ui.input.pointer.k0 r14 = r0.e
            kotlin.a.e(r15)
            goto L55
        L42:
            kotlin.a.e(r15)
        L45:
            r0.e = r13
            r0.y = r14
            r0.A = r4
            java.lang.Object r15 = r13.b(r14, r0)
            if (r15 != r5) goto L52
            goto L9f
        L52:
            r12 = r14
            r14 = r13
            r13 = r12
        L55:
            androidx.compose.ui.input.pointer.m r15 = (androidx.compose.ui.input.pointer.m) r15
            java.lang.Object r15 = r15.a
            int r1 = r15.size()
            r6 = r3
        L5e:
            if (r6 >= r1) goto Lbf
            java.lang.Object r7 = r15.get(r6)
            androidx.compose.ui.input.pointer.v r7 = (androidx.compose.ui.input.pointer.v) r7
            boolean r7 = androidx.compose.ui.input.pointer.u.c(r7)
            if (r7 != 0) goto Lbc
            int r1 = r15.size()
            r6 = r3
        L71:
            if (r6 >= r1) goto L91
            java.lang.Object r7 = r15.get(r6)
            androidx.compose.ui.input.pointer.v r7 = (androidx.compose.ui.input.pointer.v) r7
            boolean r8 = r7.b()
            if (r8 != 0) goto Lb7
            androidx.compose.ui.input.pointer.l0 r8 = r14.C
            long r8 = r8.U
            long r10 = r14.c()
            boolean r7 = androidx.compose.ui.input.pointer.u.f(r7, r8, r10)
            if (r7 == 0) goto L8e
            goto Lb7
        L8e:
            int r6 = r6 + 1
            goto L71
        L91:
            r0.e = r14
            r0.y = r13
            r0.A = r2
            androidx.compose.ui.input.pointer.n r15 = androidx.compose.ui.input.pointer.n.z
            java.lang.Object r15 = r14.b(r15, r0)
            if (r15 != r5) goto L2e
        L9f:
            return r5
        La0:
            androidx.compose.ui.input.pointer.m r15 = (androidx.compose.ui.input.pointer.m) r15
            java.lang.Object r15 = r15.a
            int r1 = r15.size()
            r6 = r3
        La9:
            if (r6 >= r1) goto L45
            java.lang.Object r7 = r15.get(r6)
            androidx.compose.ui.input.pointer.v r7 = (androidx.compose.ui.input.pointer.v) r7
            boolean r7 = r7.b()
            if (r7 == 0) goto Lb9
        Lb7:
            r13 = 0
            return r13
        Lb9:
            int r6 = r6 + 1
            goto La9
        Lbc:
            int r6 = r6 + 1
            goto L5e
        Lbf:
            java.lang.Object r13 = r15.get(r3)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.x2.h(androidx.compose.ui.input.pointer.k0, androidx.compose.ui.input.pointer.n, kotlin.coroutines.jvm.internal.a):java.lang.Object");
    }
}
