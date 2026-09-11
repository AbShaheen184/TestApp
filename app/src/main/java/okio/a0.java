package okio;

import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends InputStream implements InputStreamRetargetInterface {
    public final /* synthetic */ b0 e;

    public a0(b0 b0Var) {
        this.e = b0Var;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        b0 b0Var = this.e;
        if (!b0Var.z) {
            return (int) Math.min(b0Var.y.y, Integer.MAX_VALUE);
        }
        net.luminis.tls.engine.impl.c.t("closed");
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e.close();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        bArr.getClass();
        b0 b0Var = this.e;
        f fVar = b0Var.y;
        if (b0Var.z) {
            net.luminis.tls.engine.impl.c.t("closed");
            return 0;
        }
        b.d(bArr.length, i, i2);
        if (fVar.y == 0 && b0Var.e.K(fVar, 8192L) == -1) {
            return -1;
        }
        return fVar.read(bArr, i, i2);
    }

    public final String toString() {
        return this.e + ".inputStream()";
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final long transferTo(OutputStream outputStream) throws IOException {
        outputStream.getClass();
        b0 b0Var = this.e;
        f fVar = b0Var.y;
        if (b0Var.z) {
            net.luminis.tls.engine.impl.c.t("closed");
            return 0L;
        }
        long j = 0;
        long j2 = 0;
        while (true) {
            if (fVar.y == j && b0Var.e.K(fVar, 8192L) == -1) {
                return j2;
            }
            long j3 = fVar.y;
            j2 += j3;
            b.d(j3, 0L, j3);
            c0 c0Var = fVar.e;
            while (j3 > j) {
                c0Var.getClass();
                int iMin = (int) Math.min(j3, c0Var.c - c0Var.b);
                outputStream.write(c0Var.a, c0Var.b, iMin);
                int i = c0Var.b + iMin;
                c0Var.b = i;
                long j4 = iMin;
                fVar.y -= j4;
                j3 -= j4;
                if (i == c0Var.c) {
                    c0 c0VarA = c0Var.a();
                    fVar.e = c0VarA;
                    d0.a(c0Var);
                    c0Var = c0VarA;
                }
                j = 0;
            }
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        b0 b0Var = this.e;
        f fVar = b0Var.y;
        if (b0Var.z) {
            net.luminis.tls.engine.impl.c.t("closed");
            return 0;
        }
        if (fVar.y == 0 && b0Var.e.K(fVar, 8192L) == -1) {
            return -1;
        }
        return fVar.readByte() & 255;
    }
}
