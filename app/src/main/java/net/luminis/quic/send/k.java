package net.luminis.quic.send;

import androidx.media3.extractor.r;
import com.google.android.gms.measurement.internal.e0;
import com.google.android.material.shape.c0;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import net.luminis.quic.frame.l;
import net.luminis.quic.frame.n;
import net.luminis.quic.impl.o;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static final net.luminis.quic.impl.j z = new net.luminis.quic.impl.j(0);
    public volatile DatagramSocket b;
    public final InetSocketAddress c;
    public final net.luminis.quic.impl.i d;
    public final net.luminis.quic.cc.a e;
    public final net.luminis.quic.recovery.h f;
    public final net.luminis.quic.log.a g;
    public final e0 h;
    public final androidx.emoji2.text.f j;
    public final c0 k;
    public final net.luminis.quic.recovery.g l;
    public final net.luminis.quic.impl.d m;
    public final Thread n;
    public net.luminis.quic.crypto.d p;
    public boolean r;
    public volatile boolean s;
    public volatile boolean t;
    public volatile int u;
    public volatile long v;
    public final j[] i = new j[androidx.constraintlayout.core.g.f(4).length];
    public final boolean[] o = new boolean[androidx.constraintlayout.core.g.f(3).length];
    public final Object q = new Object();
    public final AtomicInteger w = new AtomicInteger();
    public volatile boolean x = false;
    public volatile int y = -1;
    public volatile int a = 1232;

    public k(o oVar, DatagramSocket datagramSocket, InetSocketAddress inetSocketAddress, net.luminis.quic.impl.i iVar, net.luminis.quic.log.a aVar) {
        int i = 0;
        this.b = datagramSocket;
        this.c = inetSocketAddress;
        this.d = iVar;
        this.g = aVar;
        this.h = aVar.i();
        for (int i2 : androidx.constraintlayout.core.g.f(4)) {
            this.i[androidx.constraintlayout.core.g.e(i2)] = new j(i2);
        }
        c0 c0Var = new c0();
        c0Var.e = new net.luminis.quic.ack.b[androidx.constraintlayout.core.g.f(3).length];
        for (int i3 : androidx.constraintlayout.core.g.f(3)) {
            ((net.luminis.quic.ack.b[]) c0Var.e)[androidx.constraintlayout.core.g.e(i3)] = new net.luminis.quic.ack.b(i3, this);
        }
        this.k = c0Var;
        j[] jVarArr = this.i;
        androidx.emoji2.text.f fVar = new androidx.emoji2.text.f();
        fVar.b = new g[androidx.constraintlayout.core.g.f(4).length];
        fVar.a = jVarArr;
        r rVar = new r();
        int[] iArrF = androidx.constraintlayout.core.g.f(4);
        int length = iArrF.length;
        int i4 = 0;
        while (i4 < length) {
            int i5 = iArrF[i4];
            int iE = androidx.constraintlayout.core.g.e(i5);
            net.luminis.quic.ack.b eVar = i5 != 2 ? ((net.luminis.quic.ack.b[]) c0Var.e)[androidx.constraintlayout.core.g.e(com.google.android.datatransport.runtime.backends.c.e(i5))] : new e(i, null);
            int iE2 = androidx.constraintlayout.core.g.e(i5);
            if (iE2 == 0) {
                ((g[]) fVar.b)[iE] = new d(oVar, 1, ((j[]) fVar.a)[iE], eVar);
            } else if (iE2 == 1 || iE2 == 3) {
                ((g[]) fVar.b)[iE] = new g(oVar, i5, ((j[]) fVar.a)[iE], eVar, rVar);
            } else {
                ((g[]) fVar.b)[iE] = new g(oVar, i5, ((j[]) fVar.a)[iE], eVar);
            }
            i4++;
            i = 0;
        }
        fVar.c = new int[]{1, 2, 3};
        this.j = fVar;
        net.luminis.quic.cc.a aVar2 = new net.luminis.quic.cc.a(aVar, this);
        this.e = aVar2;
        net.luminis.quic.recovery.h hVar = new net.luminis.quic.recovery.h(aVar);
        this.f = hVar;
        net.luminis.quic.recovery.g gVar = new net.luminis.quic.recovery.g(iVar.y, hVar, aVar2, this, aVar);
        this.l = gVar;
        iVar.E.add(gVar);
        iVar.I = gVar;
        this.m = iVar.F;
        Thread thread = new Thread(new net.luminis.quic.recovery.c(1, this), androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("sender", ""));
        this.n = thread;
        thread.setDaemon(true);
    }

    public final long a() {
        Long l;
        androidx.emoji2.text.f fVar = this.j;
        int[] iArr = (int[]) fVar.c;
        int length = iArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                l = null;
                break;
            }
            j jVar = ((j[]) fVar.a)[androidx.constraintlayout.core.g.e(iArr[i])];
            synchronized (jVar.d) {
                l = jVar.e;
            }
            if (l != null) {
                break;
            }
            i++;
        }
        if (l == null) {
            return 5000L;
        }
        long jMax = Long.max(l.longValue() - System.currentTimeMillis(), 0L);
        if (jMax > 0) {
            this.w.set(0);
            this.x = false;
            return jMax;
        }
        if (this.x) {
            int iIncrementAndGet = this.w.incrementAndGet();
            if (iIncrementAndGet % 20 == 3) {
                this.g.d("possible bug: sender is looping in busy wait; got " + iIncrementAndGet + " iterations");
            }
            if (iIncrementAndGet > 10003) {
                return 8000L;
            }
        }
        this.x = true;
        return 0L;
    }

    public final void b(int i, String str) {
        synchronized (this.o) {
            try {
                if (!this.o[androidx.constraintlayout.core.g.e(i)]) {
                    androidx.emoji2.text.f fVar = this.j;
                    g gVar = ((g[]) fVar.b)[androidx.constraintlayout.core.g.e(com.google.android.datatransport.runtime.backends.c.d(i))];
                    gVar.g = new c(fVar, i);
                    gVar.c.b(false);
                    gVar.f = true;
                    net.luminis.quic.recovery.g gVar2 = this.l;
                    if (!gVar2.m) {
                        gVar2.c[androidx.constraintlayout.core.g.e(i)].c();
                        gVar2.j = 0;
                        gVar2.j();
                    }
                    this.g.getClass();
                    ((net.luminis.quic.ack.b[]) this.k.e)[androidx.constraintlayout.core.g.e(i)] = new e(0, null);
                    this.o[androidx.constraintlayout.core.g.e(i)] = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:209:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:? A[LOOP:8: B:61:0x011a->B:211:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x008f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:54:0x0102  */
    /* JADX WARN: Code duplicated, block: B:63:0x0120  */
    /* JADX WARN: Code duplicated, block: B:71:0x0145  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v3 */
    public final void c() throws IOException {
        int i;
        byte[] bArrA;
        net.luminis.quic.cid.d dVar;
        byte[] bArr;
        androidx.emoji2.text.f fVar;
        ?? arrayList;
        int length;
        int iMin;
        int[] iArr;
        int length2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Iterator it;
        int i7;
        Iterator it2;
        net.luminis.quic.packet.g gVar;
        int i8;
        g gVar2;
        int i9;
        byte[] bArr2;
        int i10;
        h hVarA;
        long j;
        synchronized (this.q) {
            i = 0;
            try {
                try {
                    if (!this.r) {
                        long jA = a();
                        if (jA > 0) {
                            this.q.wait(jA);
                        }
                    }
                    this.r = false;
                } catch (InterruptedException unused) {
                    this.g.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.t) {
            this.s = false;
        }
        while (true) {
            net.luminis.quic.cc.a aVar = this.e;
            int i11 = (int) (aVar.c - aVar.b);
            int iMin2 = this.a;
            if (this.y < 0) {
                bArrA = this.d.Y.e.a();
                dVar = this.d.Y.f;
                if (dVar != null) {
                    bArr = dVar.b;
                } else {
                    bArr = new byte[i];
                }
                fVar = this.j;
                fVar.getClass();
                arrayList = new ArrayList();
                length = bArr.length + 19;
                iMin = Integer.min(i11, iMin2);
                iArr = (int[]) fVar.c;
                length2 = iArr.length;
                i2 = i;
                i3 = i2;
                i4 = i3;
                i5 = i4;
                while (i2 < length2) {
                    i8 = iArr[i2];
                    gVar2 = ((g[]) fVar.b)[androidx.constraintlayout.core.g.e(i8)];
                    i9 = iMin2;
                    if (gVar2 != null) {
                        hVarA = gVar2.a(iMin, i9 - i3, bArrA, bArr);
                        if (hVarA != null) {
                            arrayList.add(hVarA);
                            bArr2 = bArrA;
                            i10 = 0;
                            int iG = hVarA.a.g(0);
                            i3 += iG;
                            iMin -= iG;
                            if (i8 == 1) {
                                i4 = 1;
                            }
                            for (n nVar : hVarA.a.c) {
                                if (!(nVar instanceof net.luminis.quic.frame.k) || (nVar instanceof l)) {
                                    i5 = 1;
                                    break;
                                }
                            }
                        } else {
                            bArr2 = bArrA;
                            i10 = 0;
                        }
                        if (iMin < length && i9 - i3 < length) {
                            break;
                        }
                    } else {
                        bArr2 = bArrA;
                        i10 = 0;
                    }
                    i2++;
                    i = i10;
                    iMin2 = i9;
                    bArrA = bArr2;
                }
                if (i4 != 0 && i3 < 1200) {
                    i7 = 1200 - i3;
                    it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        gVar = ((h) it2.next()).a;
                        if (gVar instanceof net.luminis.quic.packet.c) {
                            gVar.b(new net.luminis.quic.frame.j(i7));
                            break;
                        }
                    }
                    i3 += i7;
                }
                if (i5 != 0 && i3 < 1200) {
                    i6 = 1200 - i3;
                    it = arrayList.iterator();
                    if (it.hasNext()) {
                        ((h) it.next()).a.b(new net.luminis.quic.frame.j(i6));
                    }
                }
            } else if (this.v < this.y) {
                if (((long) this.y) - this.v < iMin2) {
                    net.luminis.quic.log.a aVar2 = this.g;
                    String.format("Sending data may be limited by remaining anti-amplification limit of %d bytes", Long.valueOf(((long) this.y) - this.v));
                    aVar2.getClass();
                }
                iMin2 = Integer.min(iMin2, (int) (((long) this.y) - this.v));
                bArrA = this.d.Y.e.a();
                dVar = this.d.Y.f;
                if (dVar != null) {
                    bArr = dVar.b;
                } else {
                    bArr = new byte[i];
                }
                fVar = this.j;
                fVar.getClass();
                arrayList = new ArrayList();
                length = bArr.length + 19;
                iMin = Integer.min(i11, iMin2);
                iArr = (int[]) fVar.c;
                length2 = iArr.length;
                i2 = i;
                i3 = i2;
                i4 = i3;
                i5 = i4;
                while (i2 < length2) {
                    i8 = iArr[i2];
                    gVar2 = ((g[]) fVar.b)[androidx.constraintlayout.core.g.e(i8)];
                    i9 = iMin2;
                    if (gVar2 != null) {
                        hVarA = gVar2.a(iMin, i9 - i3, bArrA, bArr);
                        if (hVarA != null) {
                            arrayList.add(hVarA);
                            bArr2 = bArrA;
                            i10 = 0;
                            int iG2 = hVarA.a.g(0);
                            i3 += iG2;
                            iMin -= iG2;
                            if (i8 == 1) {
                                i4 = 1;
                            }
                            while (r2.hasNext()) {
                                if (!(nVar instanceof net.luminis.quic.frame.k)) {
                                }
                                i5 = 1;
                            }
                        } else {
                            bArr2 = bArrA;
                            i10 = 0;
                        }
                        if (iMin < length) {
                            continue;
                        }
                    } else {
                        bArr2 = bArrA;
                        i10 = 0;
                    }
                    i2++;
                    i = i10;
                    iMin2 = i9;
                    bArrA = bArr2;
                }
                if (i4 != 0) {
                    i7 = 1200 - i3;
                    it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        gVar = ((h) it2.next()).a;
                        if (gVar instanceof net.luminis.quic.packet.c) {
                            gVar.b(new net.luminis.quic.frame.j(i7));
                            break;
                        }
                    }
                    i3 += i7;
                }
                if (i5 != 0) {
                    i6 = 1200 - i3;
                    it = arrayList.iterator();
                    if (it.hasNext()) {
                        ((h) it.next()).a.b(new net.luminis.quic.frame.j(i6));
                    }
                }
            } else {
                this.g.getClass();
                arrayList = Collections.EMPTY_LIST;
            }
            if (!arrayList.isEmpty()) {
                byte[] bArr3 = new byte[this.a];
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr3);
                try {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        net.luminis.quic.packet.g gVar3 = ((h) it3.next()).a;
                        try {
                            byteBufferWrap.put(gVar3.h(this.p.d(gVar3.k())));
                            net.luminis.quic.log.a aVar3 = this.g;
                            gVar3.l();
                            aVar3.getClass();
                        } catch (net.luminis.quic.crypto.g e) {
                            if (e.e != 2) {
                                throw new IllegalStateException(e.getMessage());
                            }
                            net.luminis.quic.log.a aVar4 = this.g;
                            gVar3.toString();
                            aVar4.getClass();
                            it3.remove();
                        }
                    }
                    if (byteBufferWrap.position() != 0) {
                        DatagramPacket datagramPacket = new DatagramPacket(bArr3, byteBufferWrap.position(), this.c.getAddress(), this.c.getPort());
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        this.b.send(datagramPacket);
                        arrayList.size();
                        this.v += (long) byteBufferWrap.position();
                        for (h hVar : arrayList) {
                            net.luminis.quic.recovery.g gVar4 = this.l;
                            net.luminis.quic.packet.g gVar5 = hVar.a;
                            Long lValueOf = Long.valueOf(jCurrentTimeMillis);
                            Consumer consumer = hVar.b;
                            if (gVar4.m || !gVar5.q()) {
                                j = jCurrentTimeMillis;
                            } else {
                                net.luminis.quic.recovery.a aVar5 = gVar4.c[androidx.constraintlayout.core.g.e(gVar5.m())];
                                synchronized (aVar5) {
                                    try {
                                        if (aVar5.k) {
                                            j = jCurrentTimeMillis;
                                        } else {
                                            if (gVar5.q()) {
                                                net.luminis.quic.cc.a aVar6 = aVar5.c;
                                                synchronized (aVar6) {
                                                    synchronized (aVar6) {
                                                        if (gVar5.p()) {
                                                            j = jCurrentTimeMillis;
                                                        } else {
                                                            j = jCurrentTimeMillis;
                                                            aVar6.b += (long) gVar5.n();
                                                            aVar6.a.getClass();
                                                            if (aVar6.b > aVar6.c) {
                                                                aVar6.a.getClass();
                                                            }
                                                        }
                                                    }
                                                }
                                                aVar6.a.i();
                                            } else {
                                                j = jCurrentTimeMillis;
                                            }
                                            if (gVar5.o()) {
                                                aVar5.g.getAndAdd(1);
                                                aVar5.j = lValueOf;
                                            }
                                            aVar5.f.put(gVar5.l(), new net.luminis.quic.recovery.b(lValueOf, gVar5, consumer));
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                gVar4.j();
                            }
                            net.luminis.quic.impl.d dVar2 = this.m;
                            net.luminis.quic.packet.g gVar6 = hVar.a;
                            Long lValueOf2 = Long.valueOf(j);
                            if (dVar2.f && gVar6.o()) {
                                dVar2.e = lValueOf2;
                            }
                            jCurrentTimeMillis = j;
                        }
                        ArrayList<net.luminis.quic.packet.g> arrayList2 = new ArrayList();
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            arrayList2.add(((h) it4.next()).a);
                        }
                        this.g.j();
                        for (net.luminis.quic.packet.g gVar7 : arrayList2) {
                            if (gVar7 instanceof net.luminis.quic.packet.i) {
                                for (n nVar2 : gVar7.c) {
                                }
                            }
                        }
                        this.h.getClass();
                    }
                } catch (BufferOverflowException e2) {
                    this.g.d("Buffer overflow while generating datagram for " + arrayList);
                    throw e2;
                }
            }
            if (arrayList.isEmpty()) {
                return;
            } else {
                i = 0;
            }
        }
    }

    public final int d() {
        return (this.f.a() * 4) + this.f.b() + this.u;
    }

    public final void e(Function function, int i, int i2, Consumer consumer) {
        ConcurrentLinkedDeque concurrentLinkedDeque = this.i[androidx.constraintlayout.core.g.e(i2)].b;
        b bVar = new b();
        bVar.a = i;
        bVar.b = function;
        bVar.c = consumer;
        concurrentLinkedDeque.addLast(bVar);
    }

    public final void f(n nVar, int i, Consumer consumer) {
        this.i[androidx.constraintlayout.core.g.e(i)].a(nVar, consumer);
    }

    public final void g(int i, int i2) {
        j jVar = this.i[androidx.constraintlayout.core.g.e(com.google.android.datatransport.runtime.backends.c.d(i))];
        jVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() + ((long) i2);
        synchronized (jVar.d) {
            try {
                Long l = jVar.e;
                if (l == null || jCurrentTimeMillis < l.longValue()) {
                    jVar.e = Long.valueOf(jCurrentTimeMillis);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(int i, List list) {
        synchronized (this.o) {
            try {
                if (this.o[androidx.constraintlayout.core.g.e(com.google.android.datatransport.runtime.backends.c.e(i))]) {
                    net.luminis.quic.log.a aVar = this.g;
                    com.google.android.datatransport.runtime.backends.c.e(i);
                    aVar.getClass();
                } else {
                    this.i[androidx.constraintlayout.core.g.e(i)].c.addLast(list);
                    j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        for (j jVar : this.i) {
            jVar.b(true);
        }
        net.luminis.quic.recovery.g gVar = this.l;
        if (gVar.m) {
            return;
        }
        gVar.m = true;
        gVar.h.cancel(true);
        gVar.k = null;
        gVar.f.shutdown();
        for (int i : androidx.constraintlayout.core.g.f(3)) {
            gVar.c[androidx.constraintlayout.core.g.e(i)].c();
        }
    }

    public final void j() {
        synchronized (this.q) {
            this.r = true;
            this.q.notify();
        }
    }
}
