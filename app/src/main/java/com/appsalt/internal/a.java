package com.appsalt.internal;

import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final String a;
    public final String b;
    public final int c;
    public final Channel d;
    public final Channel e;
    public final coil3.memory.c f;
    public i3 g;

    public a(String str, String str2, int i, Channel channel, Channel channel2, coil3.memory.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = channel;
        this.e = channel2;
        this.f = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX WARN: Code duplicated, block: B:24:0x006e  */
    /* JADX WARN: Code duplicated, block: B:36:0x009d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007c, code lost:
    
        if (r10 == r5) goto L27;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x007c -> B:13:0x0036). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.appsalt.internal.a r9, kotlin.coroutines.jvm.internal.c r10) {
        /*
            r9.getClass()
            boolean r0 = r10 instanceof com.appsalt.internal.q4
            if (r0 == 0) goto L16
            r0 = r10
            com.appsalt.internal.q4 r0 = (com.appsalt.internal.q4) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.B = r1
            goto L1b
        L16:
            com.appsalt.internal.q4 r0 = new com.appsalt.internal.q4
            r0.<init>(r9, r10)
        L1b:
            java.lang.Object r10 = r0.z
            int r1 = r0.B
            kotlin.y r2 = kotlin.y.a
            r3 = 2
            r4 = 1
            kotlin.coroutines.intrinsics.a r5 = kotlin.coroutines.intrinsics.a.e
            if (r1 == 0) goto L50
            if (r1 == r4) goto L42
            if (r1 != r3) goto L3b
            kotlin.jvm.internal.v r9 = r0.y
            com.appsalt.internal.a r1 = r0.e
            kotlin.a.e(r10)
            kotlin.m r10 = (kotlin.m) r10
            java.lang.Object r10 = r10.e
        L36:
            r8 = r10
            r10 = r9
            r9 = r1
            r1 = r8
            goto L7f
        L3b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r9)
            r9 = 0
            return r9
        L42:
            kotlin.jvm.internal.v r9 = r0.y
            com.appsalt.internal.a r1 = r0.e
            kotlin.a.e(r10)
            kotlinx.coroutines.channels.ChannelResult r10 = (kotlinx.coroutines.channels.ChannelResult) r10
            java.lang.Object r10 = r10.m54unboximpl()
            goto L72
        L50:
            kotlin.a.e(r10)
            kotlin.jvm.internal.v r10 = new kotlin.jvm.internal.v
            r10.<init>()
            r10.e = r4
        L5a:
            r1 = r2
        L5b:
            boolean r6 = r10.e
            if (r6 == 0) goto L9d
            kotlinx.coroutines.channels.Channel r1 = r9.d
            r0.e = r9
            r0.y = r10
            r0.B = r4
            java.lang.Object r1 = r1.mo34receiveCatchingJP2dKIU(r0)
            if (r1 != r5) goto L6e
            goto L7e
        L6e:
            r8 = r1
            r1 = r9
            r9 = r10
            r10 = r8
        L72:
            r0.e = r1
            r0.y = r9
            r0.B = r3
            java.io.Serializable r10 = r1.a(r10, r0)
            if (r10 != r5) goto L36
        L7e:
            return r5
        L7f:
            boolean r6 = r1 instanceof kotlin.l
            if (r6 != 0) goto L8c
            r7 = r1
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r10.e = r7
        L8c:
            java.lang.Throwable r7 = kotlin.m.a(r1)
            if (r7 == 0) goto L95
            r7 = 0
            r10.e = r7
        L95:
            if (r6 != 0) goto L5b
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r1.getClass()
            goto L5a
        L9d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsalt.internal.a.b(com.appsalt.internal.a, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x009e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
    
        if (r8 == r4) goto L30;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0083 -> B:13:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(com.appsalt.internal.a r7, kotlin.coroutines.jvm.internal.c r8) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof com.appsalt.internal.v5
            if (r0 == 0) goto L16
            r0 = r8
            com.appsalt.internal.v5 r0 = (com.appsalt.internal.v5) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.B = r1
            goto L1b
        L16:
            com.appsalt.internal.v5 r0 = new com.appsalt.internal.v5
            r0.<init>(r7, r8)
        L1b:
            java.lang.Object r8 = r0.z
            int r1 = r0.B
            r2 = 2
            r3 = 1
            kotlin.coroutines.intrinsics.a r4 = kotlin.coroutines.intrinsics.a.e
            if (r1 == 0) goto L4e
            if (r1 == r3) goto L40
            if (r1 != r2) goto L39
            kotlin.jvm.internal.v r7 = r0.y
            com.appsalt.internal.a r1 = r0.e
            kotlin.a.e(r8)
            kotlin.m r8 = (kotlin.m) r8
            java.lang.Object r8 = r8.e
        L34:
            r6 = r8
            r8 = r7
            r7 = r1
            r1 = r6
            goto L86
        L39:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r7)
            r7 = 0
            return r7
        L40:
            kotlin.jvm.internal.v r7 = r0.y
            com.appsalt.internal.a r1 = r0.e
            kotlin.a.e(r8)
            kotlinx.coroutines.channels.ChannelResult r8 = (kotlinx.coroutines.channels.ChannelResult) r8
            java.lang.Object r8 = r8.m54unboximpl()
            goto L79
        L4e:
            kotlin.a.e(r8)
            kotlin.jvm.internal.v r8 = new kotlin.jvm.internal.v
            r8.<init>()
            r8.e = r3
            kotlin.y r1 = kotlin.y.a
        L5a:
            boolean r5 = r8.e
            if (r5 == 0) goto L9e
            com.appsalt.internal.i3 r1 = r7.g
            if (r1 == 0) goto L90
            kotlinx.coroutines.channels.Channel r1 = r1.a()
            if (r1 == 0) goto L90
            r0.e = r7
            r0.y = r8
            r0.B = r3
            java.lang.Object r1 = r1.mo34receiveCatchingJP2dKIU(r0)
            if (r1 != r4) goto L75
            goto L85
        L75:
            r6 = r1
            r1 = r7
            r7 = r8
            r8 = r6
        L79:
            r0.e = r1
            r0.y = r7
            r0.B = r2
            java.lang.Object r8 = r1.f(r8, r0)
            if (r8 != r4) goto L34
        L85:
            return r4
        L86:
            java.lang.Throwable r5 = kotlin.m.a(r1)
            if (r5 == 0) goto L5a
            r5 = 0
            r8.e = r5
            goto L5a
        L90:
            androidx.compose.runtime.snapshots.g r7 = new androidx.compose.runtime.snapshots.g
            java.lang.String r8 = "Unable to get transport"
            r0 = 3
            r7.<init>(r8, r0)
            kotlin.l r8 = new kotlin.l
            r8.<init>(r7)
            return r8
        L9e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsalt.internal.a.e(com.appsalt.internal.a, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        if (d(r8, r0) == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d3, code lost:
    
        if (r8.e(r9, r0) == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e5, code lost:
    
        if (r7.e.send(r8, r0) == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f8, code lost:
    
        if (d(r8, r0) == r1) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable a(java.lang.Object r8, kotlin.coroutines.jvm.internal.c r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsalt.internal.a.a(java.lang.Object, kotlin.coroutines.jvm.internal.c):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:42:0x0106  */
    /* JADX WARN: Code duplicated, block: B:45:0x011a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0120  */
    /* JADX WARN: Code duplicated, block: B:55:0x0186  */
    /* JADX WARN: Code duplicated, block: B:59:0x0197  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ca A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fa, code lost:
    
        if (r12.send(r13, r3) == r9) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(com.appsalt.internal.d1 r24, kotlin.coroutines.jvm.internal.c r25) {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsalt.internal.a.c(com.appsalt.internal.d1, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    public final Object d(Throwable th, kotlin.coroutines.jvm.internal.c cVar) {
        int i;
        if (th instanceof l4) {
            i = 3;
        } else if (th instanceof r3) {
            i = 6;
        } else if (th instanceof ClosedReceiveChannelException) {
            i = 1;
        } else {
            i = th instanceof u0 ? 4 : 5;
        }
        Object objSend = this.e.send(new g2(this.a, this.c, new w0(this.b, i)), cVar);
        return objSend == kotlin.coroutines.intrinsics.a.e ? objSend : kotlin.y.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if (d(r6, r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
    
        if (r5.e.send(r7, r0) == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(java.lang.Object r6, kotlin.coroutines.jvm.internal.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.appsalt.internal.y4
            if (r0 == 0) goto L13
            r0 = r7
            com.appsalt.internal.y4 r0 = (com.appsalt.internal.y4) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            com.appsalt.internal.y4 r0 = new com.appsalt.internal.y4
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.y
            int r1 = r0.A
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 == r3) goto L2f
            if (r1 != r2) goto L28
            kotlin.a.e(r7)
            goto L7e
        L28:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r6)
            r6 = 0
            return r6
        L2f:
            java.lang.Throwable r6 = r0.e
            kotlin.a.e(r7)
            goto L58
        L35:
            kotlin.a.e(r7)
            boolean r7 = kotlinx.coroutines.channels.ChannelResult.m51isFailureimpl(r6)
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.e
            if (r7 == 0) goto L5d
            java.lang.Throwable r6 = kotlinx.coroutines.channels.ChannelResult.m46exceptionOrNullimpl(r6)
            if (r6 != 0) goto L4d
            kotlinx.coroutines.channels.ClosedReceiveChannelException r6 = new kotlinx.coroutines.channels.ClosedReceiveChannelException
            java.lang.String r7 = ""
            r6.<init>(r7)
        L4d:
            r0.e = r6
            r0.A = r3
            java.lang.Object r7 = r5.d(r6, r0)
            if (r7 != r1) goto L58
            goto L7d
        L58:
            kotlin.l r6 = kotlin.a.b(r6)
            return r6
        L5d:
            com.appsalt.internal.g2 r7 = new com.appsalt.internal.g2
            com.appsalt.internal.t0 r3 = new com.appsalt.internal.t0
            java.lang.Object r6 = kotlinx.coroutines.channels.ChannelResult.m48getOrThrowimpl(r6)
            byte[] r6 = (byte[]) r6
            java.lang.String r4 = r5.b
            r3.<init>(r4, r6)
            java.lang.String r6 = r5.a
            int r4 = r5.c
            r7.<init>(r6, r4, r3)
            r0.A = r2
            kotlinx.coroutines.channels.Channel r6 = r5.e
            java.lang.Object r6 = r6.send(r7, r0)
            if (r6 != r1) goto L7e
        L7d:
            return r1
        L7e:
            kotlin.y r6 = kotlin.y.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsalt.internal.a.f(java.lang.Object, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }
}
