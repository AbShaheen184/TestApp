package androidx.room.coroutines;

import androidx.datastore.preferences.protobuf.h1;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v {
    public final int a;
    public final kotlin.jvm.functions.a b;
    public final ReentrantLock c = new ReentrantLock();
    public int d;
    public boolean e;
    public final j[] f;
    public final Semaphore g;
    public final kotlin.collections.k h;

    public v(int i, kotlin.jvm.functions.a aVar) {
        this.a = i;
        this.b = aVar;
        this.f = new j[i];
        this.g = SemaphoreKt.Semaphore$default(i, 0, 2, null);
        this.h = new kotlin.collections.k(i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(kotlin.coroutines.jvm.internal.c cVar) {
        t tVar;
        kotlin.collections.k kVar = this.h;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i = tVar.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                tVar.z = i - Integer.MIN_VALUE;
            } else {
                tVar = new t(this, cVar);
            }
        } else {
            tVar = new t(this, cVar);
        }
        Object obj = tVar.e;
        int i2 = tVar.z;
        Semaphore semaphore = this.g;
        if (i2 == 0) {
            kotlin.a.e(obj);
            tVar.z = 1;
            Object objAcquire = semaphore.acquire(tVar);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objAcquire == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
        }
        try {
            ReentrantLock reentrantLock = this.c;
            reentrantLock.lock();
            try {
                if (this.e) {
                    h1.y(21, "Connection pool is closed");
                    throw null;
                }
                if (kVar.isEmpty() && this.d < this.a) {
                    j jVar = new j((androidx.sqlite.a) this.b.invoke());
                    j[] jVarArr = this.f;
                    int i3 = this.d;
                    this.d = i3 + 1;
                    jVarArr[i3] = jVar;
                    kVar.addLast(jVar);
                }
                j jVar2 = (j) kVar.removeLast();
                reentrantLock.unlock();
                return jVar2;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            semaphore.release();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0054 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x006a A[Catch: all -> 0x006e, TryCatch #2 {all -> 0x006e, blocks: (B:29:0x0066, B:31:0x006a, B:35:0x0072, B:39:0x0079), top: B:48:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0070  */
    /* JADX WARN: Code duplicated, block: B:35:0x0072 A[Catch: all -> 0x006e, TryCatch #2 {all -> 0x006e, blocks: (B:29:0x0066, B:31:0x006a, B:35:0x0072, B:39:0x0079), top: B:48:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0076 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x0079 A[Catch: all -> 0x006e, TRY_LEAVE, TryCatch #2 {all -> 0x006e, blocks: (B:29:0x0066, B:31:0x006a, B:35:0x0072, B:39:0x0079), top: B:48:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0055 -> B:25:0x0057). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:24:0x0055
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(long r7, androidx.compose.foundation.text.r r9, kotlin.coroutines.jvm.internal.c r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof androidx.room.coroutines.u
            if (r0 == 0) goto L13
            r0 = r10
            androidx.room.coroutines.u r0 = (androidx.room.coroutines.u) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            androidx.room.coroutines.u r0 = new androidx.room.coroutines.u
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.A
            int r1 = r0.C
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2e
            long r7 = r0.e
            kotlin.jvm.internal.z r9 = r0.z
            kotlin.jvm.functions.a r1 = r0.y
            kotlin.a.e(r10)     // Catch: java.lang.Throwable -> L2c
            goto L57
        L2c:
            r10 = move-exception
            goto L61
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r7)
            r7 = 0
            return r7
        L35:
            kotlin.a.e(r10)
        L38:
            kotlin.jvm.internal.z r10 = new kotlin.jvm.internal.z
            r10.<init>()
            androidx.compose.animation.b0 r1 = new androidx.compose.animation.b0     // Catch: java.lang.Throwable -> L5c
            r4 = 22
            r1.<init>(r10, r6, r3, r4)     // Catch: java.lang.Throwable -> L5c
            r0.y = r9     // Catch: java.lang.Throwable -> L5c
            r0.z = r10     // Catch: java.lang.Throwable -> L5c
            r0.e = r7     // Catch: java.lang.Throwable -> L5c
            r0.C = r2     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r1 = kotlinx.coroutines.TimeoutKt.m26withTimeoutKLykuaI(r7, r1, r0)     // Catch: java.lang.Throwable -> L5c
            kotlin.coroutines.intrinsics.a r4 = kotlin.coroutines.intrinsics.a.e
            if (r1 != r4) goto L55
            return r4
        L55:
            r1 = r9
            r9 = r10
        L57:
            r10 = r9
            r9 = r1
            r1 = r0
            r0 = r3
            goto L66
        L5c:
            r1 = move-exception
            r5 = r1
            r1 = r9
            r9 = r10
            r10 = r5
        L61:
            r5 = r10
            r10 = r9
            r9 = r1
            r1 = r0
            r0 = r5
        L66:
            boolean r4 = r0 instanceof kotlinx.coroutines.TimeoutCancellationException     // Catch: java.lang.Throwable -> L6e
            if (r4 == 0) goto L70
            r9.invoke()     // Catch: java.lang.Throwable -> L6e
            goto L77
        L6e:
            r7 = move-exception
            goto L7a
        L70:
            if (r0 != 0) goto L79
            java.lang.Object r10 = r10.e     // Catch: java.lang.Throwable -> L6e
            if (r10 == 0) goto L77
            return r10
        L77:
            r0 = r1
            goto L38
        L79:
            throw r0     // Catch: java.lang.Throwable -> L6e
        L7a:
            java.lang.Object r8 = r10.e
            androidx.room.coroutines.j r8 = (androidx.room.coroutines.j) r8
            if (r8 == 0) goto L83
            r6.e(r8)
        L83:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.v.b(long, androidx.compose.foundation.text.r, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    public final void c() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.e = true;
            for (j jVar : this.f) {
                if (jVar != null) {
                    jVar.close();
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void d(StringBuilder sb) {
        kotlin.collections.k kVar = this.h;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            kotlin.collections.builders.b bVarH = com.google.common.base.c.h();
            int i = kVar.z;
            for (int i2 = 0; i2 < i; i2++) {
                bVarH.add(kVar.get(i2));
            }
            kotlin.collections.builders.b bVarC = com.google.common.base.c.c(bVarH);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.a + ", ");
            sb.append("permits=" + this.g.getAvailablePermits() + ", ");
            sb.append("queue=(size=" + bVarC.b() + ")[" + kotlin.collections.o.R(bVarC, null, null, null, null, 63) + ']');
            sb.append(")");
            sb.append('\n');
            j[] jVarArr = this.f;
            int length = jVarArr.length;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                j jVar = jVarArr[i4];
                i3++;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\t\t[");
                sb2.append(i3);
                sb2.append("] - ");
                sb2.append(jVar != null ? jVar.e.toString() : null);
                sb.append(sb2.toString());
                sb.append('\n');
                if (jVar != null) {
                    jVar.a(sb);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void e(j jVar) {
        jVar.getClass();
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.h.addLast(jVar);
            reentrantLock.unlock();
            this.g.release();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
