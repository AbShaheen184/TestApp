package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements Closeable {
    public static final Logger C = Logger.getLogger(h.class.getName());
    public boolean A;
    public final f B;
    public final okio.g e;
    public final okio.f y;
    public int z;

    public x(okio.z zVar) {
        zVar.getClass();
        this.e = zVar;
        okio.f fVar = new okio.f();
        this.y = fVar;
        this.z = 16384;
        this.B = new f(fVar);
    }

    public final void L(int i, int i2, boolean z) {
        synchronized (this) {
            if (this.A) {
                throw new IOException("closed");
            }
            m(0, 8, 6, z ? 1 : 0);
            this.e.writeInt(i);
            this.e.writeInt(i2);
            this.e.flush();
        }
    }

    public final void N(int i, b bVar) {
        synchronized (this) {
            if (this.A) {
                throw new IOException("closed");
            }
            if (bVar.e == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            m(i, 4, 3, 0);
            this.e.writeInt(bVar.e);
            this.e.flush();
        }
    }

    public final void X(int i, long j) {
        synchronized (this) {
            try {
                if (this.A) {
                    throw new IOException("closed");
                }
                if (j == 0 || j > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
                }
                Logger logger = C;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(h.c(i, j, 4, false));
                }
                m(i, 4, 8, 0);
                this.e.writeInt((int) j);
                this.e.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(a0 a0Var) {
        a0Var.getClass();
        synchronized (this) {
            try {
                if (this.A) {
                    throw new IOException("closed");
                }
                int i = this.z;
                int i2 = a0Var.a;
                if ((i2 & 32) != 0) {
                    i = a0Var.b[5];
                }
                this.z = i;
                if (((i2 & 2) != 0 ? a0Var.b[1] : -1) != -1) {
                    f fVar = this.B;
                    int i3 = (i2 & 2) != 0 ? a0Var.b[1] : -1;
                    fVar.getClass();
                    int iMin = Math.min(i3, 16384);
                    int i4 = fVar.d;
                    if (i4 != iMin) {
                        if (iMin < i4) {
                            fVar.b = Math.min(fVar.b, iMin);
                        }
                        fVar.c = true;
                        fVar.d = iMin;
                        int i5 = fVar.h;
                        if (iMin < i5) {
                            if (iMin == 0) {
                                d[] dVarArr = fVar.e;
                                kotlin.collections.n.K(0, dVarArr.length, null, dVarArr);
                                fVar.f = fVar.e.length - 1;
                                fVar.g = 0;
                                fVar.h = 0;
                            } else {
                                fVar.a(i5 - iMin);
                            }
                        }
                    }
                }
                m(0, 0, 4, 1);
                this.e.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.A = true;
            this.e.close();
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.A) {
                throw new IOException("closed");
            }
            this.e.flush();
        }
    }

    public final void g(boolean z, int i, okio.f fVar, int i2) {
        synchronized (this) {
            if (this.A) {
                throw new IOException("closed");
            }
            m(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                okio.g gVar = this.e;
                fVar.getClass();
                gVar.E(fVar, i2);
            }
        }
    }

    public final void m(int i, int i2, int i3, int i4) {
        if (i3 != 8) {
            Level level = Level.FINE;
            Logger logger = C;
            if (logger.isLoggable(level)) {
                logger.fine(h.b(false, i, i2, i3, i4));
            }
        }
        if (i2 > this.z) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.z + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            net.luminis.tls.engine.impl.c.p(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "reserved bit set: "));
            return;
        }
        byte[] bArr = okhttp3.internal.e.a;
        okio.g gVar = this.e;
        gVar.getClass();
        gVar.writeByte((i2 >>> 16) & 255);
        gVar.writeByte((i2 >>> 8) & 255);
        gVar.writeByte(i2 & 255);
        gVar.writeByte(i3 & 255);
        gVar.writeByte(i4 & 255);
        gVar.writeInt(i & Integer.MAX_VALUE);
    }

    public final void w(int i, b bVar, byte[] bArr) {
        synchronized (this) {
            if (this.A) {
                throw new IOException("closed");
            }
            if (bVar.e == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            m(0, bArr.length + 8, 7, 0);
            this.e.writeInt(i);
            this.e.writeInt(bVar.e);
            if (bArr.length != 0) {
                this.e.write(bArr);
            }
            this.e.flush();
        }
    }

    public final void z(boolean z, int i, ArrayList arrayList) {
        synchronized (this) {
            if (this.A) {
                throw new IOException("closed");
            }
            this.B.d(arrayList);
            long j = this.y.y;
            long jMin = Math.min(this.z, j);
            int i2 = j == jMin ? 4 : 0;
            if (z) {
                i2 |= 1;
            }
            m(i, (int) jMin, 1, i2);
            this.e.E(this.y, jMin);
            if (j > jMin) {
                long j2 = j - jMin;
                while (j2 > 0) {
                    long jMin2 = Math.min(this.z, j2);
                    j2 -= jMin2;
                    m(i, (int) jMin2, 9, j2 == 0 ? 4 : 0);
                    this.e.E(this.y, jMin2);
                }
            }
        }
    }
}
