package okhttp3.internal.connection;

import androidx.compose.foundation.lazy.grid.u;
import androidx.compose.foundation.lazy.layout.b1;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.g0;
import okhttp3.t;
import okhttp3.y;
import okio.b0;
import okio.j0;
import okio.z;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements t {
    public static final a a = new a();

    @Override // okhttp3.t
    public final g0 a(u uVar) throws IOException {
        okhttp3.internal.http.e fVar;
        m mVar = (m) uVar.g;
        synchronized (mVar) {
            if (!mVar.M) {
                throw new IllegalStateException("released");
            }
            if (mVar.J || mVar.I || mVar.L || mVar.K) {
                throw new IllegalStateException("Check failed.");
            }
        }
        g gVar = mVar.E;
        gVar.getClass();
        n nVarA = gVar.a();
        y yVar = mVar.e;
        nVarA.getClass();
        yVar.getClass();
        int i = uVar.d;
        com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar = nVarA.h;
        okhttp3.internal.http2.o oVar = nVarA.j;
        if (oVar != null) {
            fVar = new okhttp3.internal.http2.p(yVar, nVarA, uVar, oVar);
        } else {
            nVarA.e.setSoTimeout(i);
            j0 j0VarE = ((b0) cVar.z).e.e();
            long j = i;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            j0VarE.g(j, timeUnit);
            ((z) cVar.A).e.e().g(uVar.e, timeUnit);
            fVar = new okhttp3.internal.http1.f(yVar, nVarA, cVar);
        }
        b1 b1Var = new b1(mVar, gVar, fVar);
        mVar.H = b1Var;
        mVar.O = b1Var;
        synchronized (mVar) {
            mVar.I = true;
            mVar.J = true;
        }
        if (!mVar.N) {
            return u.a(uVar, 0, b1Var, null, 61).f((okhttp3.b0) uVar.i);
        }
        net.luminis.tls.engine.impl.c.t("Canceled");
        return null;
    }
}
