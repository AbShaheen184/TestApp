package okhttp3.internal.http1;

import java.io.IOException;
import okhttp3.n;
import okhttp3.r;
import okhttp3.s;
import okhttp3.y;
import okio.b0;
import okio.h0;
import okio.j0;
import okio.o;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements h0 {
    public final /* synthetic */ f A;
    public final s e;
    public final o y;
    public boolean z;

    public a(f fVar, s sVar) {
        sVar.getClass();
        this.A = fVar;
        this.e = sVar;
        this.y = new o(((b0) fVar.c.z).e.e());
    }

    @Override // okio.h0
    public long K(okio.f fVar, long j) throws IOException {
        f fVar2 = this.A;
        fVar.getClass();
        try {
            return ((b0) fVar2.c.z).K(fVar, j);
        } catch (IOException e) {
            fVar2.b.f();
            a(f.f);
            throw e;
        }
    }

    public final void a(r rVar) {
        y yVar;
        n nVar;
        rVar.getClass();
        f fVar = this.A;
        int i = fVar.d;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            net.luminis.tls.engine.impl.c.l(fVar.d, "state: ");
            return;
        }
        o oVar = this.y;
        j0 j0Var = oVar.e;
        oVar.e = j0.d;
        j0Var.a();
        j0Var.b();
        fVar.d = 6;
        if (rVar.size() <= 0 || (yVar = fVar.a) == null || (nVar = yVar.j) == null) {
            return;
        }
        okhttp3.internal.http.f.b(nVar, this.e, rVar);
    }

    @Override // okio.h0
    public final j0 e() {
        return this.y;
    }
}
