package net.luminis.quic.cc;

import java.util.ArrayList;
import java.util.Iterator;
import net.luminis.quic.recovery.b;
import net.luminis.quic.send.k;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final net.luminis.quic.log.a a;
    public volatile long b;
    public final k d;
    public volatile long c = 12000;
    public long e = Long.MAX_VALUE;
    public Long f = Long.MIN_VALUE;

    public a(net.luminis.quic.log.a aVar, k kVar) {
        this.a = aVar;
        this.d = kVar;
    }

    public final void a() {
        if (this.b < 0) {
            this.a.d("Inconsistency error in congestion controller; attempt to set bytes in-flight below 0");
            this.b = 0L;
            this.d.j();
        }
    }

    public final synchronized void b(ArrayList arrayList) {
        try {
            Iterator it = arrayList.iterator();
            int iN = 0;
            while (it.hasNext()) {
                iN += ((b) it.next()).b.n();
            }
            long j = iN;
            this.b -= j;
            this.d.j();
            if (j > 0) {
                a();
                net.luminis.quic.log.a aVar = this.a;
                arrayList.size();
                aVar.getClass();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(ArrayList arrayList) {
        try {
            Iterator it = arrayList.iterator();
            int iN = 0;
            while (it.hasNext()) {
                iN += ((b) it.next()).b.n();
            }
            if (iN > 0) {
                this.b -= (long) iN;
                this.d.j();
                a();
                net.luminis.quic.log.a aVar = this.a;
                arrayList.size();
                aVar.getClass();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
