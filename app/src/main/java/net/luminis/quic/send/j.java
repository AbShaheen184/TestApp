package net.luminis.quic.send;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.function.Consumer;
import net.luminis.quic.frame.l;
import net.luminis.quic.frame.n;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public final int a;
    public final ConcurrentLinkedDeque b = new ConcurrentLinkedDeque();
    public final ConcurrentLinkedDeque c = new ConcurrentLinkedDeque();
    public final Object d = new Object();
    public Long e;
    public volatile boolean f;

    public j(int i) {
        this.a = i;
    }

    public final void a(n nVar, Consumer consumer) {
        boolean z = nVar instanceof l;
        ConcurrentLinkedDeque<i> concurrentLinkedDeque = this.b;
        if (z) {
            long j = 0;
            for (i iVar : concurrentLinkedDeque) {
                if ((iVar instanceof a) && ((a) iVar).a.getClass().equals(l.class)) {
                    j++;
                }
            }
            if (j >= 256) {
                return;
            }
        }
        concurrentLinkedDeque.addLast(new a(nVar, consumer));
    }

    public final void b(boolean z) {
        this.f = true;
        this.b.clear();
        this.c.clear();
        if (z) {
            synchronized (this.d) {
                this.e = null;
            }
        }
    }

    public final i c(int i) {
        if (i < 1) {
            return null;
        }
        try {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                if (iVar.a() <= i) {
                    it.remove();
                    return iVar;
                }
            }
            return null;
        } catch (ConcurrentModificationException e) {
            if (this.f) {
                return null;
            }
            throw e;
        }
    }

    public final String toString() {
        return "SendRequestQueue[" + com.google.android.datatransport.runtime.backends.c.y(this.a) + "]";
    }
}
