package com.google.firebase.sessions;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0085, code lost:
    
        if (r10 == r6) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.firebase.installations.d] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.google.firebase.installations.d r9, kotlin.coroutines.jvm.internal.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.google.firebase.sessions.x
            if (r0 == 0) goto L13
            r0 = r10
            com.google.firebase.sessions.x r0 = (com.google.firebase.sessions.x) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            com.google.firebase.sessions.x r0 = new com.google.firebase.sessions.x
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.y
            int r1 = r0.A
            java.lang.String r2 = "FirebaseSessions"
            r3 = 2
            r4 = 1
            java.lang.String r5 = ""
            kotlin.coroutines.intrinsics.a r6 = kotlin.coroutines.intrinsics.a.e
            if (r1 == 0) goto L46
            if (r1 == r4) goto L3c
            if (r1 != r3) goto L35
            java.lang.Object r9 = r0.e
            java.lang.String r9 = (java.lang.String) r9
            kotlin.a.e(r10)     // Catch: java.lang.Exception -> L32
            goto L88
        L32:
            r10 = move-exception
            goto L8f
        L35:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r9)
            r9 = 0
            return r9
        L3c:
            java.lang.Object r9 = r0.e
            com.google.firebase.installations.d r9 = (com.google.firebase.installations.d) r9
            kotlin.a.e(r10)     // Catch: java.lang.Exception -> L44
            goto L61
        L44:
            r10 = move-exception
            goto L6d
        L46:
            kotlin.a.e(r10)
            r10 = r9
            com.google.firebase.installations.c r10 = (com.google.firebase.installations.c) r10     // Catch: java.lang.Exception -> L44
            com.google.android.gms.tasks.q r9 = r10.d()     // Catch: java.lang.Exception -> L44
            r9.getClass()     // Catch: java.lang.Exception -> L69
            r0.e = r10     // Catch: java.lang.Exception -> L69
            r0.A = r4     // Catch: java.lang.Exception -> L69
            java.lang.Object r9 = kotlinx.coroutines.tasks.TasksKt.await(r9, r0)     // Catch: java.lang.Exception -> L69
            if (r9 != r6) goto L5e
            goto L87
        L5e:
            r7 = r10
            r10 = r9
            r9 = r7
        L61:
            com.google.firebase.installations.a r10 = (com.google.firebase.installations.a) r10     // Catch: java.lang.Exception -> L44
            java.lang.String r10 = r10.a     // Catch: java.lang.Exception -> L44
            r7 = r10
            r10 = r9
            r9 = r7
            goto L74
        L69:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L6d:
            java.lang.String r1 = "Error getting authentication token."
            android.util.Log.w(r2, r1, r10)
            r10 = r9
            r9 = r5
        L74:
            com.google.firebase.installations.c r10 = (com.google.firebase.installations.c) r10     // Catch: java.lang.Exception -> L32
            com.google.android.gms.tasks.q r10 = r10.c()     // Catch: java.lang.Exception -> L32
            r10.getClass()     // Catch: java.lang.Exception -> L32
            r0.e = r9     // Catch: java.lang.Exception -> L32
            r0.A = r3     // Catch: java.lang.Exception -> L32
            java.lang.Object r10 = kotlinx.coroutines.tasks.TasksKt.await(r10, r0)     // Catch: java.lang.Exception -> L32
            if (r10 != r6) goto L88
        L87:
            return r6
        L88:
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L32
            if (r10 != 0) goto L8d
            goto L94
        L8d:
            r5 = r10
            goto L94
        L8f:
            java.lang.String r0 = "Error getting Firebase installation id ."
            android.util.Log.w(r2, r0, r10)
        L94:
            com.google.firebase.sessions.z r10 = new com.google.firebase.sessions.z
            r10.<init>(r5, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.y.a(com.google.firebase.installations.d, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }
}
