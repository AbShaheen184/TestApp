package androidx.compose.foundation.gestures;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f0 {
    public static final float a = ((float) 0.125d) / 18;

    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c A[LOOP:0: B:23:0x0068->B:27:0x007c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x0080 A[EDGE_INSN: B:54:0x0080->B:29:0x0080 BREAK  A[LOOP:0: B:23:0x0068->B:27:0x007c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005b -> B:22:0x005e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(androidx.compose.ui.input.pointer.k0 r12, long r13, kotlin.coroutines.jvm.internal.c r15) {
        /*
            boolean r0 = r15 instanceof androidx.compose.foundation.gestures.z
            if (r0 == 0) goto L13
            r0 = r15
            androidx.compose.foundation.gestures.z r0 = (androidx.compose.foundation.gestures.z) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.z r0 = new androidx.compose.foundation.gestures.z
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.z
            int r1 = r0.A
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2d
            kotlin.jvm.internal.y r12 = r0.y
            androidx.compose.ui.input.pointer.k0 r13 = r0.e
            kotlin.a.e(r15)
            r11 = r13
            r13 = r12
            r12 = r11
            goto L5e
        L2d:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r12)
            r12 = 0
            return r12
        L34:
            kotlin.a.e(r15)
            androidx.compose.ui.input.pointer.l0 r15 = r12.C
            androidx.compose.ui.input.pointer.m r15 = r15.P
            boolean r15 = e(r15, r13)
            if (r15 == 0) goto L43
            goto Lc3
        L43:
            kotlin.jvm.internal.y r15 = new kotlin.jvm.internal.y
            r15.<init>()
            r15.e = r13
        L4a:
            r0.e = r12
            r0.y = r15
            r0.A = r2
            androidx.compose.ui.input.pointer.n r13 = androidx.compose.ui.input.pointer.n.y
            java.lang.Object r13 = r12.b(r13, r0)
            kotlin.coroutines.intrinsics.a r14 = kotlin.coroutines.intrinsics.a.e
            if (r13 != r14) goto L5b
            return r14
        L5b:
            r11 = r15
            r15 = r13
            r13 = r11
        L5e:
            androidx.compose.ui.input.pointer.m r15 = (androidx.compose.ui.input.pointer.m) r15
            java.lang.Object r14 = r15.a
            int r1 = r14.size()
            r4 = 0
            r5 = r4
        L68:
            if (r5 >= r1) goto L7f
            java.lang.Object r6 = r14.get(r5)
            r7 = r6
            androidx.compose.ui.input.pointer.v r7 = (androidx.compose.ui.input.pointer.v) r7
            long r7 = r7.a
            long r9 = r13.e
            boolean r7 = androidx.compose.ui.input.pointer.u.e(r7, r9)
            if (r7 == 0) goto L7c
            goto L80
        L7c:
            int r5 = r5 + 1
            goto L68
        L7f:
            r6 = r3
        L80:
            androidx.compose.ui.input.pointer.v r6 = (androidx.compose.ui.input.pointer.v) r6
            if (r6 != 0) goto L86
            r6 = r3
            goto Lba
        L86:
            boolean r14 = androidx.compose.ui.input.pointer.u.d(r6)
            if (r14 == 0) goto Lae
            java.lang.Object r14 = r15.a
            int r15 = r14.size()
        L92:
            if (r4 >= r15) goto La3
            java.lang.Object r1 = r14.get(r4)
            r5 = r1
            androidx.compose.ui.input.pointer.v r5 = (androidx.compose.ui.input.pointer.v) r5
            boolean r5 = r5.d
            if (r5 == 0) goto La0
            goto La4
        La0:
            int r4 = r4 + 1
            goto L92
        La3:
            r1 = r3
        La4:
            androidx.compose.ui.input.pointer.v r1 = (androidx.compose.ui.input.pointer.v) r1
            if (r1 != 0) goto La9
            goto Lba
        La9:
            long r14 = r1.a
            r13.e = r14
            goto Lc4
        Lae:
            long r14 = androidx.compose.ui.input.pointer.u.g(r6, r2)
            r4 = 0
            boolean r14 = androidx.compose.ui.geometry.b.b(r14, r4)
            if (r14 != 0) goto Lc4
        Lba:
            if (r6 == 0) goto Lc3
            boolean r12 = r6.b()
            if (r12 != 0) goto Lc3
            return r6
        Lc3:
            return r3
        Lc4:
            r15 = r13
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.f0.a(androidx.compose.ui.input.pointer.k0, long, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [kotlin.jvm.internal.z] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    public static final Object b(androidx.compose.ui.input.pointer.k0 k0Var, long j, kotlin.coroutines.jvm.internal.c cVar) {
        a0 a0Var;
        Object obj;
        androidx.compose.ui.input.pointer.v vVar;
        kotlin.jvm.internal.v vVar2;
        if (cVar instanceof a0) {
            a0Var = (a0) cVar;
            int i = a0Var.B;
            if ((i & Integer.MIN_VALUE) != 0) {
                a0Var.B = i - Integer.MIN_VALUE;
            } else {
                a0Var = new a0(cVar);
            }
        } else {
            a0Var = new a0(cVar);
        }
        Object obj2 = a0Var.A;
        int i2 = a0Var.B;
        try {
            if (i2 == 0) {
                kotlin.a.e(obj2);
                if (!e(k0Var.C.P, j)) {
                    ?? r11 = k0Var.C.P.a;
                    int size = r11.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            obj = null;
                            break;
                        }
                        obj = r11.get(i3);
                        if (androidx.compose.ui.input.pointer.u.e(((androidx.compose.ui.input.pointer.v) obj).a, j)) {
                            break;
                        }
                        i3++;
                    }
                    vVar = (androidx.compose.ui.input.pointer.v) obj;
                    if (vVar != null) {
                        kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
                        kotlin.jvm.internal.z zVar2 = new kotlin.jvm.internal.z();
                        zVar2.e = vVar;
                        long jB = k0Var.f().b();
                        kotlin.jvm.internal.v vVar3 = new kotlin.jvm.internal.v();
                        kotlin.jvm.functions.p b0Var = new b0(vVar3, zVar2, zVar, null);
                        a0Var.e = vVar;
                        a0Var.y = zVar;
                        a0Var.z = vVar3;
                        a0Var.B = 1;
                        Object objG = k0Var.g(jB, b0Var, a0Var);
                        Object obj3 = kotlin.coroutines.intrinsics.a.e;
                        if (objG == obj3) {
                            return obj3;
                        }
                        vVar2 = vVar3;
                        j = zVar;
                    }
                }
                return null;
            }
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vVar2 = a0Var.z;
            kotlin.jvm.internal.z zVar3 = a0Var.y;
            vVar = a0Var.e;
            kotlin.a.e(obj2);
            j = zVar3;
            if (vVar2.e) {
                androidx.compose.ui.input.pointer.v vVar4 = (androidx.compose.ui.input.pointer.v) j.e;
                return vVar4 == null ? vVar : vVar4;
            }
            return null;
        } catch (androidx.compose.ui.input.pointer.o unused) {
            androidx.compose.ui.input.pointer.v vVar5 = (androidx.compose.ui.input.pointer.v) j.e;
            return vVar5 == null ? vVar : vVar5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c8 A[LOOP:0: B:26:0x00ae->B:30:0x00c8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x00d4 A[EDGE_INSN: B:69:0x00d4->B:32:0x00d4 BREAK  A[LOOP:0: B:26:0x00ae->B:30:0x00c8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0160 -> B:63:0x0166). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(androidx.compose.ui.input.pointer.k0 r21, long r22, androidx.compose.animation.core.g0 r24, kotlin.coroutines.jvm.internal.a r25) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.f0.c(androidx.compose.ui.input.pointer.k0, long, androidx.compose.animation.core.g0, kotlin.coroutines.jvm.internal.a):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object d(androidx.compose.ui.input.pointer.k0 r4, long r5, kotlin.jvm.functions.l r7, kotlin.coroutines.jvm.internal.c r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.e0
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.e0 r0 = (androidx.compose.foundation.gestures.e0) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.e0 r0 = new androidx.compose.foundation.gestures.e0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.z
            int r1 = r0.A
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            kotlin.jvm.functions.l r4 = r0.y
            androidx.compose.ui.input.pointer.k0 r5 = r0.e
            kotlin.a.e(r8)
            r7 = r4
            r4 = r5
            goto L44
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r4)
            r4 = 0
            return r4
        L32:
            kotlin.a.e(r8)
        L35:
            r0.e = r4
            r0.y = r7
            r0.A = r2
            java.lang.Object r8 = a(r4, r5, r0)
            kotlin.coroutines.intrinsics.a r5 = kotlin.coroutines.intrinsics.a.e
            if (r8 != r5) goto L44
            return r5
        L44:
            androidx.compose.ui.input.pointer.v r8 = (androidx.compose.ui.input.pointer.v) r8
            if (r8 != 0) goto L4b
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4b:
            boolean r5 = androidx.compose.ui.input.pointer.u.d(r8)
            if (r5 == 0) goto L54
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L54:
            r7.invoke(r8)
            long r5 = r8.a
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.f0.d(androidx.compose.ui.input.pointer.k0, long, kotlin.jvm.functions.l, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static final boolean e(androidx.compose.ui.input.pointer.m mVar, long j) {
        Object obj;
        ?? r6 = mVar.a;
        int size = r6.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = r6.get(i);
            if (androidx.compose.ui.input.pointer.u.e(((androidx.compose.ui.input.pointer.v) obj).a, j)) {
                break;
            }
            i++;
        }
        androidx.compose.ui.input.pointer.v vVar = (androidx.compose.ui.input.pointer.v) obj;
        if (vVar != null && vVar.d) {
            z = true;
        }
        return true ^ z;
    }

    public static final float f(androidx.compose.ui.platform.p2 p2Var, int i) {
        return i == 2 ? p2Var.f() * a : p2Var.f();
    }
}
