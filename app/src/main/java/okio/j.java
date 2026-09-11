package okio;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements h0 {
    public final s e;
    public long y;
    public boolean z;

    public j(s sVar, long j) {
        this.e = sVar;
        this.y = j;
    }

    @Override // okio.h0
    public final long K(f fVar, long j) {
        long j2;
        long j3;
        int i;
        fVar.getClass();
        if (this.z) {
            net.luminis.tls.engine.impl.c.r("closed");
            return 0L;
        }
        s sVar = this.e;
        long j4 = this.y;
        if (j < 0) {
            net.luminis.tls.engine.impl.c.p(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.g("byteCount < 0: ", j));
            return 0L;
        }
        long j5 = j + j4;
        long j6 = j4;
        while (true) {
            if (j6 < j5) {
                c0 c0VarL0 = fVar.l0(1);
                byte[] bArr = c0VarL0.a;
                int i2 = c0VarL0.c;
                j2 = -1;
                int iMin = (int) Math.min(j5 - j6, 8192 - i2);
                synchronized (sVar) {
                    bArr.getClass();
                    sVar.A.seek(j6);
                    i = 0;
                    while (true) {
                        if (i < iMin) {
                            int i3 = sVar.A.read(bArr, i2, iMin - i);
                            if (i3 != -1) {
                                i += i3;
                            } else if (i == 0) {
                                i = -1;
                                break;
                            }
                        }
                        break;
                    }
                }
                if (i == -1) {
                    if (c0VarL0.b == c0VarL0.c) {
                        fVar.e = c0VarL0.a();
                        d0.a(c0VarL0);
                    }
                    if (j4 == j6) {
                        j3 = -1;
                        break;
                    }
                } else {
                    c0VarL0.c += i;
                    long j7 = i;
                    j6 += j7;
                    fVar.y += j7;
                }
            } else {
                j2 = -1;
            }
            j3 = j6 - j4;
            break;
        }
        if (j3 != j2) {
            this.y += j3;
        }
        return j3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        s sVar = this.e;
        if (this.z) {
            return;
        }
        this.z = true;
        ReentrantLock reentrantLock = sVar.z;
        reentrantLock.lock();
        try {
            int i = sVar.y - 1;
            sVar.y = i;
            if (i == 0 && sVar.e) {
                reentrantLock.unlock();
                synchronized (sVar) {
                    sVar.A.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // okio.h0
    public final j0 e() {
        return j0.d;
    }
}
