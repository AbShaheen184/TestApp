package net.luminis.quic.stream;

import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListSet;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public final ConcurrentSkipListSet a = new ConcurrentSkipListSet();
    public final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();
    public volatile long c = 0;
    public volatile long d = 0;
    public volatile long e = -1;
    public final int f = 5120;
    public volatile boolean g;

    public static h c(h hVar, h hVar2) {
        if (hVar.getOffset() <= hVar2.getOffset() && hVar.b() >= hVar2.b()) {
            return hVar;
        }
        if (hVar2.getOffset() <= hVar.getOffset() && hVar2.b() >= hVar.b()) {
            return hVar2;
        }
        int iB = (int) (hVar.b() - hVar2.getOffset());
        byte[] bArr = new byte[(hVar2.getLength() + hVar.getLength()) - iB];
        System.arraycopy(hVar.c(), 0, bArr, 0, hVar.getLength());
        System.arraycopy(hVar2.c(), iB, bArr, hVar.getLength(), hVar2.getLength() - iB);
        return new f(hVar.getOffset(), bArr, hVar.isFinal() || hVar2.isFinal());
    }

    public static h e(h hVar, long j, long j2) {
        int i = (int) (j2 - j);
        if (i == hVar.getLength()) {
            return hVar;
        }
        byte[] bArr = new byte[i];
        System.arraycopy(hVar.c(), (int) (j - hVar.getOffset()), bArr, 0, i);
        return new f(j, bArr, hVar.isFinal());
    }

    public final boolean a(h hVar) throws Exception {
        try {
            if (hVar.getLength() > 0) {
                b(hVar);
            }
            if (hVar.isFinal()) {
                this.e = hVar.b();
            }
            long j = this.c;
            while (!this.a.isEmpty() && ((h) this.a.first()).getOffset() <= this.c) {
                h hVarE = (h) this.a.pollFirst();
                if (hVarE.b() > this.c) {
                    if (hVarE.getOffset() < this.c) {
                        hVarE = e(hVarE, this.c, hVarE.b());
                    }
                    this.b.add(hVarE);
                    this.c = hVarE.b();
                    hVarE.getLength();
                }
            }
            return this.c > j;
        } catch (Exception e) {
            if (this.g) {
                return false;
            }
            throw e;
        }
    }

    public final void b(h hVar) {
        ConcurrentSkipListSet concurrentSkipListSet = this.a;
        h hVar2 = (h) concurrentSkipListSet.lower(hVar);
        int i = this.f;
        if (hVar2 != null && hVar2.b() > hVar.getOffset()) {
            if (Long.max(hVar2.b(), hVar.b()) - Long.min(hVar2.getOffset(), hVar.getOffset()) <= i) {
                hVar = c(hVar2, hVar);
                concurrentSkipListSet.remove(hVar2);
                hVar2.getLength();
            } else {
                hVar = e(hVar, hVar2.b(), hVar.b());
                if (concurrentSkipListSet.lower(hVar) != hVar2) {
                    h hVar3 = (h) concurrentSkipListSet.lower(hVar);
                    hVar = c(hVar3, hVar);
                    concurrentSkipListSet.remove(hVar3);
                    hVar3.getLength();
                }
            }
        }
        h hVar4 = (h) concurrentSkipListSet.higher(hVar);
        while (hVar4 != null && hVar.b() > hVar4.getOffset()) {
            if (Long.max(hVar.b(), hVar4.b()) - Long.min(hVar.getOffset(), hVar4.getOffset()) <= i) {
                hVar = c(hVar, hVar4);
                concurrentSkipListSet.remove(hVar4);
                hVar4.getLength();
            } else {
                hVar = e(hVar, hVar.getOffset(), hVar4.getOffset());
            }
            hVar4 = (h) concurrentSkipListSet.higher(hVar);
        }
        if (concurrentSkipListSet.add(hVar)) {
            hVar.getLength();
        }
    }

    public final int d(ByteBuffer byteBuffer) {
        if (this.e >= 0 && this.d == this.e) {
            return -1;
        }
        h hVar = (h) this.b.peek();
        int i = 0;
        while (hVar != null && byteBuffer.hasRemaining()) {
            int iMin = (int) Long.min(byteBuffer.remaining(), hVar.b() - this.d);
            byteBuffer.put(hVar.c(), (int) (this.d - hVar.getOffset()), iMin);
            this.d += (long) iMin;
            i += iMin;
            if (this.d == hVar.b()) {
                this.b.remove();
                hVar = (h) this.b.peek();
            }
        }
        return i;
    }
}
