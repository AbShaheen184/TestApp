package okhttp3.internal.http2;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends okio.c {
    public final /* synthetic */ w n;

    public v(w wVar) {
        this.n = wVar;
    }

    @Override // okio.c
    public final IOException k(IOException iOException) {
        return new SocketTimeoutException("timeout");
    }

    @Override // okio.c
    public final void l() {
        this.n.g(b.CANCEL);
        o oVar = this.n.y;
        synchronized (oVar) {
            long j = oVar.L;
            long j2 = oVar.K;
            if (j < j2) {
                return;
            }
            oVar.K = j2 + 1;
            oVar.M = System.nanoTime() + ((long) 1000000000);
            okhttp3.internal.concurrent.c.c(oVar.E, androidx.privacysandbox.ads.adservices.java.internal.a.u(new StringBuilder(), oVar.z, " ping"), 0L, new androidx.room.coroutines.d(oVar, 24), 6);
        }
    }

    public final void m() {
        if (j()) {
            throw k(null);
        }
    }
}
