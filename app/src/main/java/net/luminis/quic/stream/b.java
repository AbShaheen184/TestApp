package net.luminis.quic.stream;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public long e;
    public final net.luminis.quic.log.a i;
    public int k;
    public final ConcurrentHashMap j = new ConcurrentHashMap();
    public long f = 0;
    public final HashMap g = new HashMap();
    public final HashMap h = new HashMap();

    public b(long j, long j2, long j3, long j4, net.luminis.quic.log.a aVar) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.i = aVar;
        this.e = j;
    }

    public final long a(e eVar) {
        int i = eVar.a;
        long jLongValue = ((Long) this.g.get(Integer.valueOf(i))).longValue() - ((Long) this.h.get(Integer.valueOf(i))).longValue();
        long j = this.e - this.f;
        return jLongValue > j ? j : jLongValue;
    }

    public final void b(net.luminis.quic.frame.f fVar) {
        synchronized (this) {
            try {
                int i = fVar.y;
                long j = fVar.z;
                if (this.g.containsKey(Integer.valueOf(i))) {
                    if (j > ((Long) this.g.get(Integer.valueOf(i))).longValue()) {
                        boolean z = ((Long) this.h.get(Integer.valueOf(i))).longValue() == ((Long) this.g.get(Integer.valueOf(i))).longValue() && this.f != this.e;
                        this.g.put(Integer.valueOf(i), Long.valueOf(j));
                        if (z) {
                            r rVar = (r) this.j.get(Integer.valueOf(i));
                            rVar.e.b.i(new p(rVar, 0), 20, rVar.N(), new q(rVar, 0), false);
                        }
                    }
                } else if (i % 2 == 0 && i > this.k) {
                    throw new net.luminis.quic.impl.l(net.luminis.quic.a.STREAM_STATE_ERROR);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
