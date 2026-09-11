package okhttp3.internal.connection;

import androidx.compose.foundation.lazy.layout.b1;
import java.io.IOException;
import java.net.ProtocolException;
import okio.f0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends okio.m {
    public boolean A;
    public long B;
    public boolean C;
    public boolean D;
    public final /* synthetic */ b1 E;
    public final long y;
    public final boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b1 b1Var, f0 f0Var, long j, boolean z) {
        super(f0Var);
        f0Var.getClass();
        this.E = b1Var;
        this.y = j;
        this.z = z;
        this.C = z;
    }

    @Override // okio.m, okio.f0
    public final void E(okio.f fVar, long j) throws IOException {
        if (this.D) {
            net.luminis.tls.engine.impl.c.r("closed");
            return;
        }
        long j2 = this.y;
        if (j2 != -1 && this.B + j > j2) {
            StringBuilder sbM = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.m(j2, "expected ", " bytes but received ");
            sbM.append(this.B + j);
            throw new ProtocolException(sbM.toString());
        }
        try {
            if (this.C) {
                this.C = false;
            }
            this.e.E(fVar, j);
            this.B += j;
        } catch (IOException e) {
            IOException iOExceptionA = a(e);
            iOExceptionA.getClass();
            throw iOExceptionA;
        }
    }

    public final IOException a(IOException iOException) {
        if (this.A) {
            return iOException;
        }
        this.A = true;
        return b1.b(this.E, this.z, iOException, 4);
    }

    @Override // okio.m, okio.f0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.D) {
            return;
        }
        this.D = true;
        long j = this.y;
        if (j != -1 && this.B != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
            a(null);
        } catch (IOException e) {
            IOException iOExceptionA = a(e);
            iOExceptionA.getClass();
            throw iOExceptionA;
        }
    }

    @Override // okio.m, okio.f0, java.io.Flushable
    public final void flush() throws IOException {
        try {
            super.flush();
        } catch (IOException e) {
            IOException iOExceptionA = a(e);
            iOExceptionA.getClass();
            throw iOExceptionA;
        }
    }
}
