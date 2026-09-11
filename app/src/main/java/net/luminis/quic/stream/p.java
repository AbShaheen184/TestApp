package net.luminis.quic.stream;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;

    public /* synthetic */ p(r rVar, int i) {
        this.a = i;
        this.b = rVar;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        long jLongValue;
        long jLongValue2;
        boolean z;
        switch (this.a) {
            case 0:
                r rVar = this.b;
                int iIntValue = ((Integer) obj).intValue();
                if (rVar.I) {
                    return null;
                }
                synchronized (rVar.z) {
                    rVar.H = false;
                    break;
                }
                if (rVar.A.isEmpty()) {
                    return null;
                }
                b bVar = rVar.M;
                e eVar = rVar.e;
                synchronized (bVar) {
                    jLongValue = ((Long) bVar.h.get(Integer.valueOf(eVar.a))).longValue() + bVar.a(eVar);
                    break;
                }
                int i = rVar.C.get();
                long j = rVar.F;
                if (jLongValue <= j && i != 0) {
                    if (j == rVar.K) {
                        return null;
                    }
                    rVar.K = j;
                    e eVar2 = rVar.e;
                    eVar2.b.i(new p(rVar, 2), com.google.android.material.textfield.p.b(eVar2.a) + 9, 4, new q(rVar, 2), true);
                    return null;
                }
                e eVar3 = rVar.e;
                eVar3.getClass();
                int iMin = Integer.min(i, (iIntValue - new net.luminis.quic.frame.r(new byte[0], eVar3.a, j, false).D) - 1);
                b bVar2 = rVar.M;
                e eVar4 = rVar.e;
                long j2 = rVar.F + ((long) iMin);
                bVar2.getClass();
                int i2 = eVar4.a;
                synchronized (bVar2) {
                    long jA = bVar2.a(eVar4);
                    long jLongValue3 = j2 - ((Long) bVar2.h.get(Integer.valueOf(i2))).longValue();
                    long jMin = Long.min(jLongValue3, jA);
                    if (jLongValue3 < 0) {
                        throw new IllegalArgumentException();
                    }
                    bVar2.f += jMin;
                    jLongValue2 = ((Long) bVar2.h.get(Integer.valueOf(i2))).longValue() + jMin;
                    bVar2.h.put(Integer.valueOf(i2), Long.valueOf(jLongValue2));
                }
                int iMin2 = Integer.min((int) (jLongValue2 - rVar.F), iMin);
                byte[] bArrCopyOfRange = new byte[iMin2];
                int i3 = 0;
                while (i3 < iMin2 && !rVar.A.isEmpty()) {
                    ByteBuffer byteBuffer = (ByteBuffer) rVar.A.peek();
                    int i4 = iMin2 - i3;
                    if (byteBuffer.remaining() <= i4) {
                        int iRemaining = byteBuffer.remaining() + i3;
                        byteBuffer.get(bArrCopyOfRange, i3, byteBuffer.remaining());
                        rVar.A.poll();
                        i3 = iRemaining;
                    } else {
                        byteBuffer.get(bArrCopyOfRange, i3, i4);
                        i3 = iMin2;
                    }
                }
                if (rVar.A.isEmpty() || rVar.A.peek() != rVar.y) {
                    z = false;
                } else {
                    rVar.A.poll();
                    z = true;
                }
                if (i3 == 0 && !z) {
                    return null;
                }
                rVar.C.getAndAdd(i3 * (-1));
                rVar.D.lock();
                try {
                    rVar.E.signal();
                    rVar.D.unlock();
                    if (i3 < iMin2) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, 0, i3);
                    }
                    e eVar5 = rVar.e;
                    eVar5.getClass();
                    net.luminis.quic.frame.r rVar2 = new net.luminis.quic.frame.r(bArrCopyOfRange, eVar5.a, rVar.F, z);
                    rVar.F += (long) i3;
                    if (!rVar.A.isEmpty()) {
                        synchronized (rVar.z) {
                            rVar.H = true;
                            break;
                        }
                        int i5 = 0;
                        rVar.e.b.i(new p(rVar, i5), 20, rVar.N(), new q(rVar, i5), true);
                    }
                    if (rVar2.C) {
                        rVar.L();
                    }
                    return rVar2;
                } catch (Throwable th) {
                    rVar.D.unlock();
                    throw th;
                }
            case 1:
                r rVar3 = this.b;
                ((Integer) obj).getClass();
                int i6 = rVar3.e.a;
                long j3 = rVar3.J;
                long j4 = rVar3.F;
                net.luminis.quic.frame.p pVar = new net.luminis.quic.frame.p();
                pVar.e = i6;
                pVar.y = j3;
                pVar.z = j4;
                return pVar;
            default:
                r rVar4 = this.b;
                ((Integer) obj).getClass();
                return r.w(rVar4);
        }
    }
}
