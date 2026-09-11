package net.luminis.quic.send;

import androidx.media3.extractor.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.luminis.quic.frame.m;
import net.luminis.quic.frame.n;
import net.luminis.quic.impl.o;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class g {
    public static final net.luminis.quic.impl.j h = new net.luminis.quic.impl.j(0);
    public final o a;
    public final int b;
    public final j c;
    public final net.luminis.quic.ack.b d;
    public final r e;
    public volatile boolean f;
    public c g;

    public g(o oVar, int i, j jVar, net.luminis.quic.ack.b bVar) {
        this(oVar, i, jVar, bVar, new r());
    }

    public h a(int i, int i2, byte[] bArr, byte[] bArr2) {
        int iD;
        boolean z;
        h hVar;
        net.luminis.quic.frame.a aVarA;
        c cVar;
        List list;
        int iMin = Integer.min(i, i2);
        net.luminis.quic.packet.g gVarB = b(bArr, bArr2);
        ArrayList arrayList = new ArrayList();
        j jVar = this.c;
        jVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (jVar.d) {
            try {
                Long l = jVar.e;
                iD = 0;
                z = l != null && (jCurrentTimeMillis > l.longValue() || jVar.e.longValue() - jCurrentTimeMillis < 1);
                hVar = null;
                if (z) {
                    jVar.e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z && this.d.c()) {
            aVarA = this.d.a();
            if (gVarB.g(aVarA.d()) > i2) {
                j jVar2 = this.c;
                synchronized (jVar2.d) {
                    jVar2.e = Long.valueOf(System.currentTimeMillis());
                }
                return null;
            }
            gVarB.b(aVarA);
            arrayList.add(h);
            this.d.f(aVarA, gVarB.l().longValue());
        } else {
            aVarA = null;
        }
        int iD2 = (aVarA != null || this.c.b.isEmpty() || !this.d.b() || (aVarA = this.d.a()) == null) ? 0 : aVarA.d();
        List list2 = (List) this.c.c.peekFirst();
        if (list2 != null && !list2.isEmpty()) {
            List list3 = (List) this.c.c.pollFirst();
            if (list3 == null) {
                list = list3;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new m());
                list = arrayList2;
            }
            list = list3;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iD += ((n) it.next()).d();
            }
            List list4 = list;
            if (gVarB.g(iD) > i2) {
                m mVar = new m();
                if (gVarB.g(1) > i2) {
                    return null;
                }
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(mVar);
                list4 = arrayList3;
            }
            gVarB.f = true;
            gVarB.c.addAll(list4);
            return new h(gVarB);
        }
        if (!this.c.b.isEmpty()) {
            int iG = gVarB.g(1000) - 1000;
            while (iG < iMin) {
                int i3 = iMin - iG;
                int i4 = i3 - iD2;
                i iVarC = this.c.c(i4);
                if (iVarC != null || iD2 <= 0) {
                    i3 = i4;
                } else {
                    iVarC = this.c.c(i3);
                }
                if (iVarC == null) {
                    break;
                }
                n nVarC = iVarC.c(i3);
                if (nVarC != null) {
                    if (nVarC.d() > i3) {
                        throw new RuntimeException("supplier does not produce frame of right (max) size: " + nVarC.d() + " > " + i3 + " frame: " + nVarC);
                    }
                    int iD3 = nVarC.d() + iG;
                    gVarB.b(nVarC);
                    arrayList.add(iVarC.b());
                    if (iD2 <= 0 || iD3 + iD2 > iMin) {
                        iG = iD3;
                    } else {
                        gVarB.b(aVarA);
                        arrayList.add(h);
                        this.d.f(aVarA, gVarB.l().longValue());
                        iG = aVarA.d() + iD3;
                        iD2 = 0;
                    }
                }
            }
        }
        if (!this.c.c.isEmpty() && gVarB.c.isEmpty()) {
            if (((List) this.c.c.pollFirst()) == null) {
                new ArrayList().add(new m());
            }
            gVarB.f = true;
            gVarB.b(new m());
            arrayList.add(h);
        }
        if (gVarB.c.isEmpty()) {
            this.e.a--;
        } else {
            if (gVarB.c.size() != arrayList.size()) {
                org.mozilla.javascript.c.a();
                return null;
            }
            hVar = new h(gVarB, new f(0, arrayList));
        }
        if (this.f) {
            j jVar3 = this.c;
            synchronized (jVar3.d) {
                try {
                    if (jVar3.b.isEmpty() && jVar3.e == null) {
                        iD = 1;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (iD != 0 && (cVar = this.g) != null) {
                cVar.accept(this);
                return hVar;
            }
        }
        return hVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    public net.luminis.quic.packet.g b(byte[] bArr, byte[] bArr2) {
        net.luminis.quic.packet.b bVar;
        net.luminis.quic.packet.g iVar;
        long j;
        int iE = androidx.constraintlayout.core.g.e(this.b);
        if (iE != 1) {
            if (iE == 2) {
                bVar = new net.luminis.quic.packet.b(this.a.a, bArr, bArr2, 0);
            } else {
                if (iE != 3) {
                    com.google.gson.b.l();
                    return null;
                }
                net.luminis.quic.impl.n nVar = this.a.a;
                iVar = new net.luminis.quic.packet.i();
                iVar.a = nVar;
                iVar.e = bArr2;
                iVar.c = new ArrayList();
            }
            r rVar = this.e;
            j = rVar.a;
            rVar.a = 1 + j;
            if (j >= 0) {
                iVar.b = j;
                return iVar;
            }
            net.luminis.tls.engine.impl.c.a();
            return null;
        }
        bVar = new net.luminis.quic.packet.b(this.a.a, bArr, bArr2, 1);
        iVar = bVar;
        r rVar2 = this.e;
        j = rVar2.a;
        rVar2.a = 1 + j;
        if (j >= 0) {
            iVar.b = j;
            return iVar;
        }
        net.luminis.tls.engine.impl.c.a();
        return null;
    }

    public final String toString() {
        return "PacketAssembler[" + com.google.android.datatransport.runtime.backends.c.y(this.b) + "]";
    }

    public g(o oVar, int i, j jVar, net.luminis.quic.ack.b bVar, r rVar) {
        this.a = oVar;
        this.b = i;
        this.c = jVar;
        this.d = bVar;
        this.e = rVar;
    }
}
