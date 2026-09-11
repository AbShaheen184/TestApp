package okio;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements h {
    public final h0 e;
    public final f y;
    public boolean z;

    public b0(h0 h0Var) {
        h0Var.getClass();
        this.e = h0Var;
        this.y = new f();
    }

    @Override // okio.h
    public final boolean A(long j, i iVar) {
        iVar.getClass();
        int iF = iVar.f();
        if (this.z) {
            net.luminis.tls.engine.impl.c.r("closed");
            return false;
        }
        if (iF >= 0 && iF <= iVar.f()) {
            return iF == 0 || okio.internal.b.c(this, iVar, iF, 1L) != -1;
        }
        return false;
    }

    @Override // okio.h
    public final String B(Charset charset) {
        charset.getClass();
        h0 h0Var = this.e;
        f fVar = this.y;
        fVar.n0(h0Var);
        return fVar.h0(fVar.y, charset);
    }

    @Override // okio.h0
    public final long K(f fVar, long j) {
        fVar.getClass();
        if (j < 0) {
            net.luminis.tls.engine.impl.c.p(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.g("byteCount < 0: ", j));
            return 0L;
        }
        if (this.z) {
            net.luminis.tls.engine.impl.c.r("closed");
            return 0L;
        }
        f fVar2 = this.y;
        if (fVar2.y == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.e.K(fVar2, 8192L) == -1) {
                return -1L;
            }
        }
        return fVar2.K(fVar, Math.min(j, fVar2.y));
    }

    public final short L() {
        R(2L);
        return this.y.g0();
    }

    public final String N(long j) {
        R(j);
        return this.y.h0(j, kotlin.text.a.a);
    }

    @Override // okio.h
    public final long O(g gVar) {
        f fVar;
        long j = 0;
        while (true) {
            h0 h0Var = this.e;
            fVar = this.y;
            if (h0Var.K(fVar, 8192L) == -1) {
                break;
            }
            long jM = fVar.m();
            if (jM > 0) {
                j += jM;
                gVar.E(fVar, jM);
            }
        }
        long j2 = fVar.y;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        gVar.E(fVar, j2);
        return j3;
    }

    @Override // okio.h
    public final void R(long j) {
        if (!request(j)) {
            throw new EOFException();
        }
    }

    @Override // okio.h
    public final InputStream V() {
        return new a0(this);
    }

    @Override // okio.h
    public final int W(v vVar) throws EOFException {
        f fVar;
        vVar.getClass();
        if (this.z) {
            net.luminis.tls.engine.impl.c.r("closed");
            return 0;
        }
        do {
            fVar = this.y;
            int iD = okio.internal.a.d(fVar, vVar, true);
            if (iD != -2) {
                if (iD == -1) {
                    break;
                }
                fVar.skip(vVar.e[iD].f());
                return iD;
            }
        } while (this.e.K(fVar, 8192L) != -1);
        return -1;
    }

    public final boolean a() {
        if (this.z) {
            net.luminis.tls.engine.impl.c.r("closed");
            return false;
        }
        f fVar = this.y;
        return fVar.X() && this.e.K(fVar, 8192L) == -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.z) {
            return;
        }
        this.z = true;
        this.e.close();
        this.y.a();
    }

    @Override // okio.h
    public final f d() {
        return this.y;
    }

    @Override // okio.h0
    public final j0 e() {
        return this.e.e();
    }

    public final long g(byte b, long j, long j2) {
        if (this.z) {
            net.luminis.tls.engine.impl.c.r("closed");
            return 0L;
        }
        if (0 > j2) {
            net.luminis.tls.engine.impl.c.p(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.g("fromIndex=0 toIndex=", j2));
            return 0L;
        }
        long jMax = 0;
        while (jMax < j2) {
            f fVar = this.y;
            byte b2 = b;
            long j3 = j2;
            long jZ = fVar.Z(b2, jMax, j3);
            if (jZ != -1) {
                return jZ;
            }
            long j4 = fVar.y;
            if (j4 >= j3 || this.e.K(fVar, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j4);
            b = b2;
            j2 = j3;
        }
        return -1L;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.z;
    }

    @Override // okio.h
    public final i k(long j) {
        R(j);
        return this.y.k(j);
    }

    public final b0 m() {
        return new b0(new y(this));
    }

    @Override // okio.h
    public final byte[] n() {
        h0 h0Var = this.e;
        f fVar = this.y;
        fVar.n0(h0Var);
        return fVar.d0(fVar.y);
    }

    @Override // okio.h
    public final long o(i iVar) {
        iVar.getClass();
        return okio.internal.b.c(this, iVar, iVar.f(), 1024L);
    }

    @Override // okio.h
    public final void p(f fVar, long j) throws EOFException {
        f fVar2 = this.y;
        try {
            R(j);
            fVar2.p(fVar, j);
        } catch (EOFException e) {
            fVar.n0(fVar2);
            throw e;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        f fVar = this.y;
        if (fVar.y == 0 && this.e.K(fVar, 8192L) == -1) {
            return -1;
        }
        return fVar.read(byteBuffer);
    }

    @Override // okio.h
    public final byte readByte() {
        R(1L);
        return this.y.readByte();
    }

    @Override // okio.h
    public final void readFully(byte[] bArr) throws EOFException {
        f fVar = this.y;
        bArr.getClass();
        try {
            R(bArr.length);
            fVar.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = fVar.y;
                if (j <= 0) {
                    throw e;
                }
                int i2 = fVar.read(bArr, i, (int) j);
                if (i2 == -1) {
                    throw new AssertionError();
                }
                i += i2;
            }
        }
    }

    @Override // okio.h
    public final int readInt() {
        R(4L);
        return this.y.readInt();
    }

    @Override // okio.h
    public final long readLong() {
        R(8L);
        return this.y.readLong();
    }

    @Override // okio.h
    public final short readShort() {
        R(2L);
        return this.y.readShort();
    }

    @Override // okio.h
    public final boolean request(long j) {
        f fVar;
        if (j < 0) {
            net.luminis.tls.engine.impl.c.p(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.g("byteCount < 0: ", j));
            return false;
        }
        if (this.z) {
            net.luminis.tls.engine.impl.c.r("closed");
            return false;
        }
        do {
            fVar = this.y;
            if (fVar.y >= j) {
                return true;
            }
        } while (this.e.K(fVar, 8192L) != -1);
        return false;
    }

    @Override // okio.h
    public final String s(long j) {
        if (j < 0) {
            net.luminis.tls.engine.impl.c.p(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.g("limit < 0: ", j));
            return null;
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jG = g((byte) 10, 0L, j2);
        f fVar = this.y;
        if (jG != -1) {
            return okio.internal.a.c(fVar, jG);
        }
        if (j2 < Long.MAX_VALUE && request(j2) && fVar.Y(j2 - 1) == 13 && request(j2 + 1) && fVar.Y(j2) == 10) {
            return okio.internal.a.c(fVar, j2);
        }
        f fVar2 = new f();
        fVar.L(fVar2, 0L, Math.min(32, fVar.y));
        throw new EOFException("\\n not found: limit=" + Math.min(fVar.y, j) + " content=" + fVar2.k(fVar2.y).g() + (char) 8230);
    }

    @Override // okio.h
    public final void skip(long j) {
        if (this.z) {
            net.luminis.tls.engine.impl.c.r("closed");
            return;
        }
        while (j > 0) {
            f fVar = this.y;
            if (fVar.y == 0 && this.e.K(fVar, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, fVar.y);
            fVar.skip(jMin);
            j -= jMin;
        }
    }

    public final String toString() {
        return "buffer(" + this.e + ')';
    }

    public final int w() {
        R(4L);
        int i = this.y.readInt();
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public final long z() throws EOFException {
        R(8L);
        long j = this.y.readLong();
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }
}
