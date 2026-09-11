package net.luminis.quic.crypto;

import com.appsalt.internal.x0;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.l;
import com.google.android.material.shape.c0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.StringJoiner;
import net.luminis.quic.impl.o;
import net.luminis.quic.send.k;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final o a;
    public final int b;
    public final int c;
    public final net.luminis.tls.engine.impl.b d;
    public final net.luminis.quic.log.a e;
    public final k f;
    public final net.luminis.quic.stream.g g;
    public final ArrayList h;
    public final ArrayList i;
    public final c0 j;
    public final ArrayList k;
    public final int l;
    public volatile int m;
    public volatile int n;
    public boolean o = false;
    public int p;
    public byte q;
    public int r;

    public f(o oVar, int i, int i2, net.luminis.tls.engine.impl.a aVar, net.luminis.quic.log.a aVar2, k kVar) {
        int i3 = 0;
        this.a = oVar;
        this.b = i;
        this.d = aVar;
        this.e = aVar2;
        this.f = kVar;
        this.c = i == 3 ? 2 : i == 4 ? 3 : 1;
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new c0(new l(this, 14));
        this.k = new ArrayList();
        int iE = androidx.constraintlayout.core.g.e(i);
        if (iE == 0) {
            i3 = 3000;
        } else if (iE == 2) {
            i3 = i2 == 1 ? 16384 : 100;
        } else if (iE == 3) {
            i3 = i2 == 1 ? 65535 : 300;
        }
        this.l = i3;
        this.g = new net.luminis.quic.stream.g();
    }

    public final void a(net.luminis.quic.frame.c cVar) throws Exception {
        try {
            boolean zA = this.g.a(cVar);
            net.luminis.quic.stream.g gVar = this.g;
            long j = gVar.c - gVar.d;
            if (cVar.b() - (((long) this.r) + j) > 4096) {
                throw new net.luminis.quic.impl.l(net.luminis.quic.a.CRYPTO_BUFFER_EXCEEDED);
            }
            if (!zA) {
                net.luminis.quic.log.a aVar = this.e;
                cVar.toString();
                long j2 = this.g.d;
                aVar.getClass();
                return;
            }
            while (true) {
                boolean z = this.o;
                if ((!z || j < this.p) && (z || j < 4)) {
                    return;
                }
                if (!z && j >= 4) {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                    this.r += this.g.d(byteBufferAllocate);
                    this.q = byteBufferAllocate.get(0);
                    byteBufferAllocate.put(0, (byte) 0);
                    int i = byteBufferAllocate.getInt();
                    this.p = i;
                    if (i > this.l) {
                        throw new net.luminis.tls.alert.a("TLS message size too large: " + this.p, 6);
                    }
                    this.o = true;
                    j -= 4;
                }
                if (this.o) {
                    int i2 = this.p;
                    if (j >= i2) {
                        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i2 + 4);
                        byteBufferAllocate2.putInt(this.p);
                        byteBufferAllocate2.put(0, this.q);
                        int iD = this.g.d(byteBufferAllocate2);
                        this.r += iD;
                        j -= (long) iD;
                        this.o = false;
                        net.luminis.tls.handshake.e eVarH = this.j.h(byteBufferAllocate2, this.d, this.c);
                        if (byteBufferAllocate2.hasRemaining()) {
                            throw new RuntimeException();
                        }
                        this.h.add(eVarH);
                    } else {
                        continue;
                    }
                }
            }
        } catch (IOException unused) {
            com.google.gson.b.l();
        }
    }

    public final String b(List list) {
        StringJoiner stringJoiner = new StringJoiner(",");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String simpleName = ((net.luminis.tls.handshake.e) it.next()).getClass().getSimpleName();
            if (simpleName.endsWith("Message")) {
                simpleName = simpleName.substring(0, simpleName.length() - 7);
            }
            stringJoiner.add(simpleName);
        }
        return "CryptoStream[" + com.google.android.datatransport.runtime.backends.c.w(this.b).charAt(0) + "|" + stringJoiner + "]";
    }

    public final void c(net.luminis.tls.handshake.e eVar) {
        byte[] bArrA = eVar.a();
        this.k.add(ByteBuffer.wrap(bArrA));
        this.n += bArrA.length;
        this.f.e(new e(this, 0), 10, this.b, new x0(this, 2));
        this.f.j();
        this.i.add(eVar);
    }

    public final String toString() {
        return b(Collections.EMPTY_LIST);
    }
}
