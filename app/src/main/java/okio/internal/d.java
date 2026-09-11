package okio.internal;

import com.google.firebase.messaging.o;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import okio.c0;
import okio.d0;
import okio.f0;
import okio.j0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements f0 {
    public final OutputStream e;
    public final h y;
    public final /* synthetic */ o z;

    public d(o oVar) {
        this.z = oVar;
        Socket socket = (Socket) oVar.y;
        this.e = socket.getOutputStream();
        this.y = new h(socket);
    }

    @Override // okio.f0
    public final void E(okio.f fVar, long j) throws IOException {
        okio.b.d(fVar.y, 0L, j);
        while (j > 0) {
            h hVar = this.y;
            hVar.f();
            c0 c0Var = fVar.e;
            c0Var.getClass();
            int iMin = (int) Math.min(j, c0Var.c - c0Var.b);
            hVar.i();
            try {
                try {
                    this.e.write(c0Var.a, c0Var.b, iMin);
                    if (hVar.j()) {
                        throw hVar.k(null);
                    }
                    int i = c0Var.b + iMin;
                    c0Var.b = i;
                    long j2 = iMin;
                    j -= j2;
                    fVar.y -= j2;
                    if (i == c0Var.c) {
                        fVar.e = c0Var.a();
                        d0.a(c0Var);
                    }
                } catch (IOException e) {
                    if (!hVar.j()) {
                        throw e;
                    }
                    throw hVar.k(e);
                }
            } catch (Throwable th) {
                hVar.j();
                throw th;
            }
        }
    }

    @Override // okio.f0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i;
        OutputStream outputStream = this.e;
        o oVar = this.z;
        h hVar = this.y;
        hVar.i();
        try {
            try {
                AtomicInteger atomicInteger = (AtomicInteger) oVar.z;
                Socket socket = (Socket) oVar.y;
                atomicInteger.getClass();
                while (true) {
                    int i2 = atomicInteger.get();
                    if ((i2 & 1) != 0) {
                        i = 0;
                        break;
                    }
                    int i3 = i2 | 1;
                    if (atomicInteger.compareAndSet(i2, i3)) {
                        i = i3;
                        break;
                    }
                }
                if (i == 0) {
                    hVar.j();
                    return;
                }
                if (i != 3) {
                    if (!socket.isClosed() && !socket.isOutputShutdown()) {
                        outputStream.flush();
                        try {
                            socket.shutdownOutput();
                        } catch (UnsupportedOperationException unused) {
                            outputStream.close();
                        }
                    }
                    hVar.j();
                    return;
                }
                socket.close();
                if (hVar.j()) {
                    throw hVar.k(null);
                }
            } catch (IOException e) {
                if (!hVar.j()) {
                    throw e;
                }
                throw hVar.k(e);
            }
        } catch (Throwable th) {
            hVar.j();
            throw th;
        }
    }

    @Override // okio.f0
    public final j0 e() {
        return this.y;
    }

    @Override // okio.f0, java.io.Flushable
    public final void flush() throws IOException {
        h hVar = this.y;
        hVar.i();
        try {
            try {
                this.e.flush();
                if (hVar.j()) {
                    throw hVar.k(null);
                }
            } catch (IOException e) {
                if (!hVar.j()) {
                    throw e;
                }
                throw hVar.k(e);
            }
        } catch (Throwable th) {
            hVar.j();
            throw th;
        }
    }

    public final String toString() {
        return "sink(" + ((Socket) this.z.y) + ')';
    }
}
