package okio;

import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements f0 {
    public final FileOutputStream e;
    public final j0 y;

    public w(FileOutputStream fileOutputStream, j0 j0Var) {
        this.e = fileOutputStream;
        this.y = j0Var;
    }

    @Override // okio.f0
    public final void E(f fVar, long j) throws IOException {
        b.d(fVar.y, 0L, j);
        while (j > 0) {
            this.y.f();
            c0 c0Var = fVar.e;
            c0Var.getClass();
            int iMin = (int) Math.min(j, c0Var.c - c0Var.b);
            this.e.write(c0Var.a, c0Var.b, iMin);
            int i = c0Var.b + iMin;
            c0Var.b = i;
            long j2 = iMin;
            j -= j2;
            fVar.y -= j2;
            if (i == c0Var.c) {
                fVar.e = c0Var.a();
                d0.a(c0Var);
            }
        }
    }

    @Override // okio.f0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.e.close();
    }

    @Override // okio.f0
    public final j0 e() {
        return this.y;
    }

    @Override // okio.f0, java.io.Flushable
    public final void flush() throws IOException {
        this.e.flush();
    }

    public final String toString() {
        return "sink(" + this.e + ')';
    }
}
