package coil3.disk;

import java.io.IOException;
import java.util.zip.Deflater;
import okio.c0;
import okio.d0;
import okio.f0;
import okio.j0;
import okio.o;
import okio.z;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements f0 {
    public final Object A;
    public final /* synthetic */ int e = 1;
    public boolean y;
    public final Object z;

    public e(okhttp3.internal.http1.f fVar) {
        this.A = fVar;
        this.z = new o(((z) fVar.c.A).e.e());
    }

    @Override // okio.f0
    public final void E(okio.f fVar, long j) throws IOException {
        switch (this.e) {
            case 0:
                if (this.y) {
                    fVar.skip(j);
                } else {
                    try {
                        ((f0) this.z).E(fVar, j);
                    } catch (IOException e) {
                        this.y = true;
                        ((androidx.compose.ui.text.font.e) this.A).invoke(e);
                        return;
                    }
                }
                break;
            case 1:
                if (!this.y) {
                    okhttp3.internal.e.a(fVar.y, 0L, j);
                    ((z) ((okhttp3.internal.http1.f) this.A).c.A).E(fVar, j);
                } else {
                    net.luminis.tls.engine.impl.c.r("closed");
                }
                break;
            default:
                Deflater deflater = (Deflater) this.A;
                fVar.getClass();
                okio.b.d(fVar.y, 0L, j);
                while (j > 0) {
                    c0 c0Var = fVar.e;
                    c0Var.getClass();
                    int iMin = (int) Math.min(j, c0Var.c - c0Var.b);
                    deflater.setInput(c0Var.a, c0Var.b, iMin);
                    a(false);
                    long j2 = iMin;
                    fVar.y -= j2;
                    int i = c0Var.b + iMin;
                    c0Var.b = i;
                    if (i == c0Var.c) {
                        fVar.e = c0Var.a();
                        d0.a(c0Var);
                    }
                    j -= j2;
                }
                deflater.setInput(okio.internal.b.b, 0, 0);
                break;
        }
    }

    public void a(boolean z) throws IOException {
        c0 c0VarL0;
        int iDeflate;
        Deflater deflater = (Deflater) this.A;
        z zVar = (z) this.z;
        okio.f fVar = zVar.y;
        while (true) {
            c0VarL0 = fVar.l0(1);
            byte[] bArr = c0VarL0.a;
            int i = c0VarL0.c;
            if (z) {
                try {
                    iDeflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (NullPointerException e) {
                    throw new IOException("Deflater already closed", e);
                }
            } else {
                iDeflate = deflater.deflate(bArr, i, 8192 - i);
            }
            if (iDeflate > 0) {
                c0VarL0.c += iDeflate;
                fVar.y += (long) iDeflate;
                zVar.a();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (c0VarL0.b == c0VarL0.c) {
            fVar.e = c0VarL0.a();
            d0.a(c0VarL0);
        }
    }

    @Override // okio.f0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        switch (this.e) {
            case 0:
                try {
                    ((f0) this.z).close();
                    return;
                } catch (IOException e) {
                    this.y = true;
                    ((androidx.compose.ui.text.font.e) this.A).invoke(e);
                    return;
                }
            case 1:
                okhttp3.internal.http1.f fVar = (okhttp3.internal.http1.f) this.A;
                if (this.y) {
                    return;
                }
                this.y = true;
                o oVar = (o) this.z;
                j0 j0Var = oVar.e;
                oVar.e = j0.d;
                j0Var.a();
                j0Var.b();
                fVar.d = 3;
                return;
            default:
                Deflater deflater = (Deflater) this.A;
                if (this.y) {
                    return;
                }
                deflater.finish();
                a(false);
                th = null;
                try {
                    deflater.end();
                    break;
                } catch (Throwable th) {
                    if (th == null) {
                        th = th;
                    }
                }
                try {
                    ((z) this.z).close();
                    break;
                } catch (Throwable th2) {
                    if (th == null) {
                        th = th2;
                    }
                }
                this.y = true;
                if (th != null) {
                    throw th;
                }
                return;
        }
    }

    @Override // okio.f0
    public final j0 e() {
        switch (this.e) {
            case 0:
                return ((f0) this.z).e();
            case 1:
                return (o) this.z;
            default:
                return ((z) this.z).e.e();
        }
    }

    @Override // okio.f0, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.e) {
            case 0:
                try {
                    ((f0) this.z).flush();
                } catch (IOException e) {
                    this.y = true;
                    ((androidx.compose.ui.text.font.e) this.A).invoke(e);
                    return;
                }
                break;
            case 1:
                if (!this.y) {
                    ((z) ((okhttp3.internal.http1.f) this.A).c.A).flush();
                    break;
                }
                break;
            default:
                a(true);
                ((z) this.z).flush();
                break;
        }
    }

    public String toString() {
        switch (this.e) {
            case 2:
                return "DeflaterSink(" + ((z) this.z) + ')';
            default:
                return super.toString();
        }
    }

    public e(okio.f fVar, Deflater deflater) {
        this.z = new z(fVar);
        this.A = deflater;
    }

    public e(f0 f0Var, androidx.compose.ui.text.font.e eVar) {
        this.z = f0Var;
        this.A = eVar;
    }
}
