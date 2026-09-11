package okhttp3.internal.cache;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import okhttp3.internal.connection.n;
import okio.z;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends okhttp3.internal.concurrent.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(okhttp3.internal.ws.e eVar) {
        super(androidx.privacysandbox.ads.adservices.java.internal.a.u(new StringBuilder(), eVar.m, " writer"), true);
        this.e = 2;
        this.f = eVar;
    }

    @Override // okhttp3.internal.concurrent.a
    public final long a() {
        n nVar;
        switch (this.e) {
            case 0:
                h hVar = (h) this.f;
                synchronized (hVar) {
                    if (hVar.J && !hVar.K) {
                        try {
                            hVar.b0();
                        } catch (IOException unused) {
                            hVar.L = true;
                        }
                        try {
                            if (hVar.L()) {
                                hVar.Z();
                                hVar.G = 0;
                            }
                        } catch (IOException unused2) {
                            hVar.M = true;
                            z zVar = hVar.E;
                            if (zVar != null) {
                                okhttp3.internal.e.b(zVar);
                            }
                            hVar.E = new z(new okio.d());
                        }
                    }
                    break;
                }
                return -1L;
            case 1:
                androidx.compose.ui.graphics.vector.a aVar = (androidx.compose.ui.graphics.vector.a) this.f;
                long jNanoTime = System.nanoTime();
                long j = (jNanoTime - aVar.b) + 1;
                Iterator it = ((ConcurrentLinkedQueue) aVar.e).iterator();
                it.getClass();
                long j2 = Long.MAX_VALUE;
                int i = 0;
                int i2 = 0;
                n nVar2 = null;
                n nVar3 = null;
                while (it.hasNext()) {
                    n nVar4 = (n) it.next();
                    nVar4.getClass();
                    synchronized (nVar4) {
                        if (aVar.a(nVar4, jNanoTime) > 0) {
                            i2++;
                        } else {
                            long j3 = j2;
                            long j4 = nVar4.r;
                            if (j4 < j) {
                                j = j4;
                                nVar2 = nVar4;
                            }
                            i++;
                            if (j4 < j3) {
                                j2 = j4;
                                nVar3 = nVar4;
                            } else {
                                j2 = j3;
                            }
                        }
                    }
                }
                long j5 = j2;
                if (nVar2 != null) {
                    nVar = nVar2;
                } else if (i > aVar.a) {
                    nVar = nVar3;
                    j = j5;
                } else {
                    j = -1;
                    nVar = null;
                }
                if (nVar == null) {
                    if (nVar3 != null) {
                        return (j5 + aVar.b) - jNanoTime;
                    }
                    if (i2 > 0) {
                        return aVar.b;
                    }
                    return -1L;
                }
                synchronized (nVar) {
                    if (nVar.q.isEmpty() && nVar.r == j) {
                        nVar.k = true;
                        ((ConcurrentLinkedQueue) aVar.e).remove(nVar);
                        okhttp3.internal.g.c(nVar.e);
                        if (!((ConcurrentLinkedQueue) aVar.e).isEmpty()) {
                            return 0L;
                        }
                        ((okhttp3.internal.concurrent.c) aVar.c).a();
                        return 0L;
                    }
                    return 0L;
                }
            default:
                okhttp3.internal.ws.e eVar = (okhttp3.internal.ws.e) this.f;
                try {
                    return eVar.g() ? 0L : -1L;
                } catch (IOException e) {
                    okhttp3.internal.ws.e.c(eVar, e, 2);
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, String str, int i) {
        super(str, true);
        this.e = i;
        this.f = obj;
    }
}
