package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements h0 {
    public boolean A;
    public final b0 e;
    public final Inflater y;
    public int z;

    public q(b0 b0Var, Inflater inflater) {
        this.e = b0Var;
        this.y = inflater;
    }

    @Override // okio.h0
    public final long K(f fVar, long j) throws IOException {
        fVar.getClass();
        do {
            long jA = a(fVar, j);
            if (jA > 0) {
                return jA;
            }
            Inflater inflater = this.y;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.e.a());
        throw new EOFException("source exhausted prematurely");
    }

    public final long a(f fVar, long j) throws IOException {
        Inflater inflater = this.y;
        fVar.getClass();
        if (j < 0) {
            net.luminis.tls.engine.impl.c.p(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.g("byteCount < 0: ", j));
            return 0L;
        }
        if (this.A) {
            net.luminis.tls.engine.impl.c.r("closed");
            return 0L;
        }
        if (j != 0) {
            try {
                c0 c0VarL0 = fVar.l0(1);
                int iMin = (int) Math.min(j, 8192 - c0VarL0.c);
                boolean zNeedsInput = inflater.needsInput();
                b0 b0Var = this.e;
                if (zNeedsInput && !b0Var.a()) {
                    c0 c0Var = b0Var.y.e;
                    c0Var.getClass();
                    int i = c0Var.c;
                    int i2 = c0Var.b;
                    int i3 = i - i2;
                    this.z = i3;
                    inflater.setInput(c0Var.a, i2, i3);
                }
                int iInflate = inflater.inflate(c0VarL0.a, c0VarL0.c, iMin);
                int i4 = this.z;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.z -= remaining;
                    b0Var.skip(remaining);
                }
                if (iInflate > 0) {
                    c0VarL0.c += iInflate;
                    long j2 = iInflate;
                    fVar.y += j2;
                    return j2;
                }
                if (c0VarL0.b == c0VarL0.c) {
                    fVar.e = c0VarL0.a();
                    d0.a(c0VarL0);
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.A) {
            return;
        }
        this.y.end();
        this.A = true;
        this.e.close();
    }

    @Override // okio.h0
    public final j0 e() {
        return this.e.e.e();
    }
}
