package okhttp3.internal.connection;

import androidx.compose.foundation.lazy.layout.b1;
import java.io.IOException;
import java.net.ProtocolException;
import okio.h0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends okio.n {
    public long A;
    public boolean B;
    public boolean C;
    public boolean D;
    public final /* synthetic */ b1 E;
    public final long y;
    public final boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b1 b1Var, h0 h0Var, long j, boolean z) {
        super(h0Var);
        h0Var.getClass();
        this.E = b1Var;
        this.y = j;
        this.z = z;
        this.B = true;
        if (j == 0) {
            a(null);
        }
    }

    @Override // okio.n, okio.h0
    public final long K(okio.f fVar, long j) throws IOException {
        b1 b1Var = this.E;
        fVar.getClass();
        if (this.D) {
            net.luminis.tls.engine.impl.c.r("closed");
            return 0L;
        }
        try {
            long jK = this.e.K(fVar, j);
            if (this.B) {
                this.B = false;
            }
            if (jK == -1) {
                a(null);
                return -1L;
            }
            long j2 = this.A + jK;
            long j3 = this.y;
            if (j3 == -1 || j2 <= j3) {
                this.A = j2;
                if (((okhttp3.internal.http.e) b1Var.A).c()) {
                    a(null);
                }
                return jK;
            }
            throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
        } catch (IOException e) {
            IOException iOExceptionA = a(e);
            iOExceptionA.getClass();
            throw iOExceptionA;
        }
    }

    public final IOException a(IOException iOException) {
        if (this.C) {
            return iOException;
        }
        this.C = true;
        if (iOException == null && this.B) {
            this.B = false;
        }
        return b1.b(this.E, this.z, iOException, 8);
    }

    @Override // okio.n, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.D) {
            return;
        }
        this.D = true;
        try {
            super.close();
            a(null);
        } catch (IOException e) {
            IOException iOExceptionA = a(e);
            iOExceptionA.getClass();
            throw iOExceptionA;
        }
    }
}
