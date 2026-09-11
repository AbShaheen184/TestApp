package okhttp3.internal.cache;

import java.io.IOException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import okio.h0;
import okio.j0;
import okio.z;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements h0 {
    public final /* synthetic */ z A;
    public boolean e;
    public final /* synthetic */ okio.h y;
    public final /* synthetic */ androidx.compose.material.ripple.g z;

    public a(okio.h hVar, androidx.compose.material.ripple.g gVar, z zVar) {
        this.y = hVar;
        this.z = gVar;
        this.A = zVar;
    }

    @Override // okio.h0
    public final long K(okio.f fVar, long j) throws Throwable {
        fVar.getClass();
        try {
            long jK = this.y.K(fVar, j);
            z zVar = this.A;
            if (jK != -1) {
                fVar.L(zVar.y, fVar.y - jK, jK);
                zVar.a();
                return jK;
            }
            if (!this.e) {
                this.e = true;
                zVar.close();
            }
            return -1L;
        } catch (IOException e) {
            if (this.e) {
                throw e;
            }
            this.e = true;
            this.z.a();
            throw e;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        boolean zG;
        if (!this.e) {
            TimeZone timeZone = okhttp3.internal.g.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                zG = okhttp3.internal.g.g(this, 100);
            } catch (IOException unused) {
                zG = false;
            }
            if (!zG) {
                this.e = true;
                this.z.a();
            }
        }
        this.y.close();
    }

    @Override // okio.h0
    public final j0 e() {
        return this.y.e();
    }
}
