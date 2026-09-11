package okio.internal;

import com.google.firebase.messaging.o;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import okio.c0;
import okio.d0;
import okio.h0;
import okio.j0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements h0 {
    public final InputStream e;
    public final h y;
    public final /* synthetic */ o z;

    public e(o oVar) {
        this.z = oVar;
        Socket socket = (Socket) oVar.y;
        this.e = socket.getInputStream();
        this.y = new h(socket);
    }

    @Override // okio.h0
    public final long K(okio.f fVar, long j) throws IOException {
        fVar.getClass();
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            net.luminis.tls.engine.impl.c.p(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.g("byteCount < 0: ", j));
            return 0L;
        }
        h hVar = this.y;
        hVar.f();
        c0 c0VarL0 = fVar.l0(1);
        int iMin = (int) Math.min(j, 8192 - c0VarL0.c);
        try {
            hVar.i();
            try {
                try {
                    int i = this.e.read(c0VarL0.a, c0VarL0.c, iMin);
                    if (hVar.j()) {
                        throw hVar.k(null);
                    }
                    if (i != -1) {
                        c0VarL0.c += i;
                        long j2 = i;
                        fVar.y += j2;
                        return j2;
                    }
                    if (c0VarL0.b != c0VarL0.c) {
                        return -1L;
                    }
                    fVar.e = c0VarL0.a();
                    d0.a(c0VarL0);
                    return -1L;
                } catch (IOException e) {
                    if (hVar.j()) {
                        throw hVar.k(e);
                    }
                    throw e;
                }
            } catch (Throwable th) {
                hVar.j();
                throw th;
            }
        } catch (AssertionError e2) {
            if (m.a(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i;
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
                    if ((i2 & 2) != 0) {
                        i = 0;
                        break;
                    }
                    int i3 = i2 | 2;
                    if (atomicInteger.compareAndSet(i2, i3)) {
                        i = i3;
                        break;
                    }
                }
                if (i == 0) {
                    hVar.j();
                    return;
                }
                if (i == 3) {
                    socket.close();
                } else if (socket.isClosed() || socket.isInputShutdown()) {
                    hVar.j();
                    return;
                } else {
                    try {
                        socket.shutdownInput();
                    } catch (UnsupportedOperationException unused) {
                        this.e.close();
                    }
                }
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

    @Override // okio.h0
    public final j0 e() {
        return this.y;
    }

    public final String toString() {
        return "source(" + ((Socket) this.z.y) + ')';
    }
}
