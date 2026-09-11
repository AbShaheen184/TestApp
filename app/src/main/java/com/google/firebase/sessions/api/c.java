package com.google.firebase.sessions.api;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final c a = new c();
    public static final Map b = Collections.synchronizedMap(new LinkedHashMap());

    public static a a(d dVar) {
        Map map = b;
        map.getClass();
        Object obj = map.get(dVar);
        if (obj != null) {
            return (a) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + dVar + ". Dependencies should be added at class load time.");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0060  */
    /* JADX WARN: Code duplicated, block: B:19:0x008f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0090  */
    /* JADX WARN: Code duplicated, block: B:23:0x009c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0090 -> B:30:0x0091). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.c r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.google.firebase.sessions.api.b
            if (r0 == 0) goto L13
            r0 = r10
            com.google.firebase.sessions.api.b r0 = (com.google.firebase.sessions.api.b) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.F = r1
            goto L18
        L13:
            com.google.firebase.sessions.api.b r0 = new com.google.firebase.sessions.api.b
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.D
            int r1 = r0.F
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L39
            if (r1 != r2) goto L32
            java.lang.Object r1 = r0.C
            java.util.Map r4 = r0.B
            kotlinx.coroutines.sync.Mutex r5 = r0.A
            com.google.firebase.sessions.api.d r6 = r0.z
            java.util.Iterator r7 = r0.y
            java.util.Map r8 = r0.e
            kotlin.a.e(r10)
            goto L91
        L32:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r10)
            r10 = 0
            return r10
        L39:
            kotlin.a.e(r10)
            java.util.Map r10 = com.google.firebase.sessions.api.c.b
            r10.getClass()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            int r4 = r10.size()
            int r4 = kotlin.collections.a0.u(r4)
            r1.<init>(r4)
            java.util.Set r10 = r10.entrySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
            r7 = r10
            r4 = r1
        L5a:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto Lc2
            java.lang.Object r10 = r7.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r1 = r10.getKey()
            java.lang.Object r5 = r10.getKey()
            r6 = r5
            com.google.firebase.sessions.api.d r6 = (com.google.firebase.sessions.api.d) r6
            java.lang.Object r10 = r10.getValue()
            com.google.firebase.sessions.api.a r10 = (com.google.firebase.sessions.api.a) r10
            kotlinx.coroutines.sync.Mutex r5 = r10.a
            r0.e = r4
            r0.y = r7
            r0.z = r6
            r0.A = r5
            r0.B = r4
            r0.C = r1
            r0.F = r2
            java.lang.Object r10 = r5.lock(r3, r0)
            kotlin.coroutines.intrinsics.a r8 = kotlin.coroutines.intrinsics.a.e
            if (r10 != r8) goto L90
            return r8
        L90:
            r8 = r4
        L91:
            r6.getClass()     // Catch: java.lang.Throwable -> Lbd
            com.google.firebase.sessions.api.a r10 = a(r6)     // Catch: java.lang.Throwable -> Lbd
            com.google.firebase.crashlytics.internal.common.j r10 = r10.b     // Catch: java.lang.Throwable -> Lbd
            if (r10 == 0) goto La4
            r5.unlock(r3)
            r4.put(r1, r10)
            r4 = r8
            goto L5a
        La4:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lbd
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r1 = "Subscriber "
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lbd
            r0.append(r6)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r1 = " has not been registered."
            r0.append(r1)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lbd
            r10.<init>(r0)     // Catch: java.lang.Throwable -> Lbd
            throw r10     // Catch: java.lang.Throwable -> Lbd
        Lbd:
            r10 = move-exception
            r5.unlock(r3)
            throw r10
        Lc2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.api.c.b(kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }
}
