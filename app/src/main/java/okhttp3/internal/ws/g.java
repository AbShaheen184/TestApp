package okhttp3.internal.ws;

import com.appsalt.internal.n4;
import com.appsalt.internal.t1;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;
import kotlin.jvm.internal.l;
import okhttp3.internal.connection.m;
import okio.b0;
import okio.i;
import okio.q;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Closeable {
    public final boolean A;
    public boolean B;
    public int C;
    public long D;
    public boolean E;
    public boolean F;
    public boolean G;
    public final okio.f H;
    public final okio.f I;
    public a J;
    public final byte[] K;
    public final okio.h e;
    public final e y;
    public final boolean z;

    public g(okio.h hVar, e eVar, boolean z, boolean z2) {
        hVar.getClass();
        this.e = hVar;
        this.y = eVar;
        this.z = z;
        this.A = z2;
        this.H = new okio.f();
        this.I = new okio.f();
        this.K = null;
    }

    public final void a() throws IOException {
        m();
        if (this.F) {
            g();
            return;
        }
        int i = this.C;
        if (i != 1 && i != 2) {
            TimeZone timeZone = okhttp3.internal.g.a;
            String hexString = Integer.toHexString(i);
            hexString.getClass();
            throw new ProtocolException("Unknown opcode: ".concat(hexString));
        }
        while (!this.B) {
            long j = this.D;
            okio.f fVar = this.I;
            if (j > 0) {
                this.e.p(fVar, j);
            }
            if (this.E) {
                if (this.G) {
                    a aVar = this.J;
                    if (aVar == null) {
                        aVar = new a(1, this.A);
                        this.J = aVar;
                    }
                    okio.f fVar2 = aVar.z;
                    if (fVar2.y != 0) {
                        net.luminis.tls.engine.impl.c.o("Failed requirement.");
                        return;
                    }
                    Inflater inflater = (Inflater) aVar.A;
                    if (inflater == null) {
                        inflater = new Inflater(true);
                        aVar.A = inflater;
                    }
                    q qVar = (q) aVar.B;
                    if (qVar == null) {
                        qVar = new q(new b0(fVar2), inflater);
                        aVar.B = qVar;
                    }
                    if (aVar.y) {
                        inflater.reset();
                    }
                    fVar2.n0(fVar);
                    fVar2.r0(65535);
                    long bytesRead = inflater.getBytesRead() + fVar2.y;
                    do {
                        qVar.a(fVar, Long.MAX_VALUE);
                        if (inflater.getBytesRead() >= bytesRead) {
                            break;
                        }
                    } while (!inflater.finished());
                    if (inflater.getBytesRead() < bytesRead) {
                        fVar2.a();
                        qVar.close();
                        aVar.B = null;
                        aVar.A = null;
                    }
                }
                e eVar = this.y;
                n4 n4Var = eVar.a;
                if (i == 1) {
                    String strI0 = fVar.i0();
                    if (!l.a(n4Var.e, eVar)) {
                        m mVar = eVar.h;
                        mVar.getClass();
                        mVar.cancel();
                    }
                    n4Var.a.getClass();
                    n4Var.h.mo28trySendJP2dKIU(new t1(strI0.getBytes(kotlin.text.a.a)));
                    return;
                }
                i iVarK = fVar.k(fVar.y);
                iVarK.getClass();
                if (!l.a(n4Var.e, eVar)) {
                    m mVar2 = eVar.h;
                    mVar2.getClass();
                    mVar2.cancel();
                }
                n4Var.a.getClass();
                n4Var.h.mo28trySendJP2dKIU(new t1(iVarK.t()));
                return;
            }
            while (!this.B) {
                m();
                if (!this.F) {
                    break;
                } else {
                    g();
                }
            }
            if (this.C != 0) {
                int i2 = this.C;
                TimeZone timeZone2 = okhttp3.internal.g.a;
                String hexString2 = Integer.toHexString(i2);
                hexString2.getClass();
                throw new ProtocolException("Expected continuation opcode. Got: ".concat(hexString2));
            }
        }
        net.luminis.tls.engine.impl.c.t("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a aVar = this.J;
        if (aVar != null) {
            okhttp3.internal.e.b(aVar);
        }
        okhttp3.internal.e.b(this.e);
    }

    public final void g() throws ProtocolException, EOFException {
        String strI0;
        short s;
        String strL;
        long j = this.D;
        if (j > 0) {
            this.e.p(this.H, j);
        }
        switch (this.C) {
            case 8:
                okio.f fVar = this.H;
                long j2 = fVar.y;
                if (j2 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (j2 != 0) {
                    s = fVar.readShort();
                    strI0 = this.H.i0();
                    if (s < 1000 || s >= 5000) {
                        strL = androidx.privacysandbox.ads.adservices.java.internal.a.l(s, "Code must be in range [1000,5000): ");
                    } else {
                        strL = ((1004 > s || s >= 1007) && (1015 > s || s >= 3000)) ? null : androidx.privacysandbox.ads.adservices.java.internal.a.p("Code ", s, " is reserved and may not be used.");
                    }
                    if (strL != null) {
                        throw new ProtocolException(strL);
                    }
                } else {
                    strI0 = "";
                    s = 1005;
                }
                e eVar = this.y;
                if (s == -1) {
                    net.luminis.tls.engine.impl.c.o("Failed requirement.");
                    return;
                }
                synchronized (eVar) {
                    if (eVar.s != -1) {
                        throw new IllegalStateException("already closed");
                    }
                    eVar.s = s;
                    eVar.t = strI0;
                }
                this.B = true;
                return;
            case 9:
                e eVar2 = this.y;
                okio.f fVar2 = this.H;
                i iVarK = fVar2.k(fVar2.y);
                synchronized (eVar2) {
                    try {
                        iVarK.getClass();
                        if (!eVar2.u && (!eVar2.r || !eVar2.p.isEmpty())) {
                            eVar2.o.add(iVarK);
                            eVar2.e();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 10:
                e eVar3 = this.y;
                okio.f fVar3 = this.H;
                i iVarK2 = fVar3.k(fVar3.y);
                synchronized (eVar3) {
                    iVarK2.getClass();
                    eVar3.w = false;
                }
                return;
            default:
                int i = this.C;
                TimeZone timeZone = okhttp3.internal.g.a;
                String hexString = Integer.toHexString(i);
                hexString.getClass();
                throw new ProtocolException("Unknown control opcode: ".concat(hexString));
        }
    }

    public final void m() throws IOException {
        boolean z;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (this.B) {
            net.luminis.tls.engine.impl.c.t("closed");
            return;
        }
        okio.h hVar = this.e;
        long jH = hVar.e().h();
        hVar.e().b();
        try {
            byte b = hVar.readByte();
            byte[] bArr = okhttp3.internal.e.a;
            hVar.e().g(jH, timeUnit);
            int i = b & 15;
            this.C = i;
            boolean z2 = (b & 128) != 0;
            this.E = z2;
            boolean z3 = (b & 8) != 0;
            this.F = z3;
            if (z3 && !z2) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z4 = (b & 64) != 0;
            if (i == 1 || i == 2) {
                if (!z4) {
                    z = false;
                } else {
                    if (!this.z) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z = true;
                }
                this.G = z;
            } else if (z4) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((b & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((b & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            byte b2 = hVar.readByte();
            boolean z5 = (b2 & 128) != 0;
            if (z5) {
                throw new ProtocolException("Server-sent frames must not be masked.");
            }
            long j = b2 & 127;
            this.D = j;
            if (j == 126) {
                this.D = hVar.readShort() & 65535;
            } else if (j == 127) {
                long j2 = hVar.readLong();
                this.D = j2;
                if (j2 < 0) {
                    long j3 = this.D;
                    TimeZone timeZone = okhttp3.internal.g.a;
                    String hexString = Long.toHexString(j3);
                    hexString.getClass();
                    throw new ProtocolException("Frame length 0x" + hexString + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.F && this.D > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z5) {
                byte[] bArr2 = this.K;
                bArr2.getClass();
                hVar.readFully(bArr2);
            }
        } catch (Throwable th) {
            hVar.e().g(jH, timeUnit);
            throw th;
        }
    }
}
