package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements h0 {
    public final q A;
    public final CRC32 B;
    public byte e;
    public final b0 y;
    public final Inflater z;

    public p(h hVar) {
        hVar.getClass();
        b0 b0Var = new b0(hVar);
        this.y = b0Var;
        Inflater inflater = new Inflater(true);
        this.z = inflater;
        this.A = new q(b0Var, inflater);
        this.B = new CRC32();
    }

    public static void a(int i, int i2, String str) throws IOException {
        if (i2 == i) {
            return;
        }
        StringBuilder sbD = androidx.constraintlayout.core.g.d(str, ": actual 0x");
        sbD.append(kotlin.text.k.h0(8, b.g(i2)));
        sbD.append(" != expected 0x");
        sbD.append(kotlin.text.k.h0(8, b.g(i)));
        throw new IOException(sbD.toString());
    }

    @Override // okio.h0
    public final long K(f fVar, long j) throws IOException {
        p pVar = this;
        fVar.getClass();
        if (j < 0) {
            net.luminis.tls.engine.impl.c.p(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.g("byteCount < 0: ", j));
            return 0L;
        }
        if (j == 0) {
            return 0L;
        }
        byte b = pVar.e;
        CRC32 crc32 = pVar.B;
        b0 b0Var = pVar.y;
        if (b == 0) {
            b0Var.R(10L);
            f fVar2 = b0Var.y;
            byte bY = fVar2.Y(3L);
            boolean z = ((bY >> 1) & 1) == 1;
            if (z) {
                pVar.g(fVar2, 0L, 10L);
            }
            a(8075, b0Var.readShort(), "ID1ID2");
            b0Var.skip(8L);
            if (((bY >> 2) & 1) == 1) {
                b0Var.R(2L);
                if (z) {
                    g(fVar2, 0L, 2L);
                }
                long jG0 = fVar2.g0() & 65535;
                b0Var.R(jG0);
                if (z) {
                    g(fVar2, 0L, jG0);
                }
                b0Var.skip(jG0);
            }
            if (((bY >> 3) & 1) == 1) {
                long jG = b0Var.g((byte) 0, 0L, Long.MAX_VALUE);
                if (jG == -1) {
                    throw new EOFException();
                }
                if (z) {
                    g(fVar2, 0L, jG + 1);
                }
                b0Var.skip(jG + 1);
            }
            if (((bY >> 4) & 1) == 1) {
                long jG2 = b0Var.g((byte) 0, 0L, Long.MAX_VALUE);
                if (jG2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    pVar = this;
                    pVar.g(fVar2, 0L, jG2 + 1);
                } else {
                    pVar = this;
                }
                b0Var.skip(jG2 + 1);
            } else {
                pVar = this;
            }
            if (z) {
                a(b0Var.L(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            pVar.e = (byte) 1;
        }
        if (pVar.e == 1) {
            long j2 = fVar.y;
            long jK = pVar.A.K(fVar, j);
            if (jK != -1) {
                pVar.g(fVar, j2, jK);
                return jK;
            }
            pVar.e = (byte) 2;
        }
        if (pVar.e == 2) {
            a(b0Var.w(), (int) crc32.getValue(), "CRC");
            a(b0Var.w(), (int) pVar.z.getBytesWritten(), "ISIZE");
            pVar.e = (byte) 3;
            if (!b0Var.a()) {
                net.luminis.tls.engine.impl.c.t("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A.close();
    }

    @Override // okio.h0
    public final j0 e() {
        return this.y.e.e();
    }

    public final void g(f fVar, long j, long j2) {
        c0 c0Var = fVar.e;
        c0Var.getClass();
        while (true) {
            int i = c0Var.c;
            int i2 = c0Var.b;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            c0Var = c0Var.f;
            c0Var.getClass();
        }
        while (j2 > 0) {
            int i3 = (int) (((long) c0Var.b) + j);
            int iMin = (int) Math.min(c0Var.c - i3, j2);
            this.B.update(c0Var.a, i3, iMin);
            j2 -= (long) iMin;
            c0Var = c0Var.f;
            c0Var.getClass();
            j = 0;
        }
    }
}
