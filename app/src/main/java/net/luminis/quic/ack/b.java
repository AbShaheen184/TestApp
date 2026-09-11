package net.luminis.quic.ack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import net.luminis.quic.frame.o;
import net.luminis.quic.packet.g;
import net.luminis.quic.send.k;
import net.luminis.tls.engine.impl.c;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class b {
    public final int a;
    public final k b;
    public boolean d;
    public Long e;
    public final ArrayList c = new ArrayList();
    public final HashMap f = new HashMap();
    public int g = 0;

    public b(int i, k kVar) {
        this.a = i;
        this.b = kVar;
    }

    public static void g(ArrayList arrayList, net.luminis.quic.frame.a aVar) {
        long j;
        long j2;
        long j3;
        long j4;
        o oVar;
        if (arrayList.isEmpty()) {
            return;
        }
        ListIterator listIterator = arrayList.listIterator();
        ListIterator listIterator2 = aVar.A.listIterator();
        o oVar2 = (o) listIterator.next();
        while (listIterator2.hasNext()) {
            o oVar3 = (o) listIterator2.next();
            while (true) {
                j = oVar2.a;
                j2 = oVar2.b;
                j3 = oVar3.b;
                j4 = oVar3.a;
                if (j > j3) {
                    if (!listIterator.hasNext()) {
                        return;
                    } else {
                        oVar2 = (o) listIterator.next();
                    }
                }
            }
            if (j2 >= j4) {
                if (j4 <= j && j3 >= j2) {
                    listIterator.remove();
                } else if (oVar2.b(oVar3)) {
                    continue;
                } else {
                    if (oVar2.equals(oVar3)) {
                        c.a();
                        return;
                    }
                    if (oVar2.b(oVar3)) {
                        c.a();
                        return;
                    }
                    if (oVar3.b(oVar2)) {
                        c.a();
                        return;
                    }
                    long j5 = oVar2.a;
                    long j6 = oVar3.b;
                    if (j5 > j6 || j2 < j4) {
                        oVar = oVar2;
                    } else if (j5 < j4 && j2 == j6) {
                        oVar = new o(j5, j4 - 1);
                    } else if (j5 > j4 && j2 > j6) {
                        oVar = new o(j6 + 1, j2);
                    } else if (j5 == j4 && j2 > j6) {
                        oVar = new o(j6 + 1, j2);
                    } else {
                        if (j5 >= j4 || j2 >= j6) {
                            org.mozilla.javascript.c.a();
                            return;
                        }
                        oVar = new o(j5, j4 - 1);
                    }
                    listIterator.set(oVar);
                }
            }
        }
    }

    public final synchronized net.luminis.quic.frame.a a() {
        int iCurrentTimeMillis;
        try {
            int i = 0;
            if (this.e != null && this.a == 3 && (iCurrentTimeMillis = (int) (System.currentTimeMillis() - this.e.longValue())) >= 0) {
                i = iCurrentTimeMillis;
            }
            if (this.c.isEmpty()) {
                return null;
            }
            return new net.luminis.quic.frame.a(i, this.c);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean b() {
        return !this.c.isEmpty();
    }

    public synchronized boolean c() {
        return this.d;
    }

    public synchronized void d(g gVar) {
        try {
            if (gVar.c()) {
                o.a(this.c, gVar.l().longValue());
                if (gVar.o()) {
                    this.d = true;
                    if (this.e == null) {
                        this.e = Long.valueOf(System.currentTimeMillis());
                    }
                    int i = this.a;
                    if (i != 3) {
                        this.b.g(i, 0);
                    } else {
                        int i2 = this.g + 1;
                        this.g = i2;
                        k kVar = this.b;
                        if (i2 >= 2) {
                            kVar.g(i, 0);
                            this.g = 0;
                        } else {
                            kVar.g(i, 20);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void e(net.luminis.quic.frame.a aVar) {
        Long l;
        try {
            Iterator it = aVar.g().iterator();
            do {
                if (!it.hasNext()) {
                    l = null;
                    break;
                }
                l = (Long) it.next();
            } while (!this.f.containsKey(l));
            if (l != null) {
                g(this.c, (net.luminis.quic.frame.a) this.f.get(l));
                this.f.keySet().removeIf(new a(l, 0));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void f(net.luminis.quic.frame.a aVar, long j) {
        this.f.put(Long.valueOf(j), aVar);
        this.d = false;
        this.e = null;
        this.g = 0;
    }
}
