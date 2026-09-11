package androidx.datastore.core;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 implements kotlin.coroutines.h {
    public static final k1 e = new k1();

    /* JADX WARN: Can't wrap try/catch for region: R(3:31|17|34) */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        r1 = r0.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        if (r1 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        r12.e = r11;
        r12.y = r3;
        r12.A = 1;
        r0 = kotlinx.coroutines.DelayKt.delay(r3, r12);
        r1 = kotlin.coroutines.intrinsics.a.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (r0 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006e -> B:27:0x0072). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(java.io.FileOutputStream r11, kotlin.coroutines.jvm.internal.c r12) throws java.io.IOException {
        /*
            boolean r0 = r12 instanceof androidx.datastore.core.n0
            if (r0 == 0) goto L13
            r0 = r12
            androidx.datastore.core.n0 r0 = (androidx.datastore.core.n0) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            androidx.datastore.core.n0 r0 = new androidx.datastore.core.n0
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.z
            int r1 = r0.A
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L2a
            long r3 = r0.y
            java.io.FileOutputStream r11 = r0.e
            kotlin.a.e(r12)
            r12 = r0
            goto L72
        L2a:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r11)
            r11 = 0
            return r11
        L31:
            kotlin.a.e(r12)
            r3 = 10
            r12 = r0
        L37:
            r0 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L77
            java.nio.channels.FileChannel r5 = r11.getChannel()     // Catch: java.io.IOException -> L52
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 0
            r6 = 0
            java.nio.channels.FileLock r0 = r5.lock(r6, r8, r10)     // Catch: java.io.IOException -> L52
            r0.getClass()     // Catch: java.io.IOException -> L52
            goto L8a
        L52:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            if (r1 == 0) goto L76
            java.lang.String r5 = "Resource deadlock would occur"
            r6 = 0
            boolean r1 = kotlin.text.k.T(r1, r5, r6)
            if (r1 != r2) goto L76
            r12.e = r11
            r12.y = r3
            r12.A = r2
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.delay(r3, r12)
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.e
            if (r0 != r1) goto L72
            r0 = r1
            goto L8a
        L72:
            r0 = 2
            long r0 = (long) r0
            long r3 = r3 * r0
            goto L37
        L76:
            throw r0
        L77:
            java.nio.channels.FileChannel r5 = r11.getChannel()
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 0
            r6 = 0
            java.nio.channels.FileLock r0 = r5.lock(r6, r8, r10)
            r0.getClass()
        L8a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.k1.a(java.io.FileOutputStream, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }
}
