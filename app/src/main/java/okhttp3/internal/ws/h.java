package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import java.util.zip.Deflater;
import okio.c0;
import okio.i;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Closeable {
    public final boolean A;
    public final long B;
    public final okio.f C;
    public final okio.f D;
    public boolean E;
    public a F;
    public final byte[] G;
    public final okio.e H;
    public final okio.g e;
    public final Random y;
    public final boolean z;

    public h(okio.g gVar, Random random, boolean z, boolean z2, long j) {
        gVar.getClass();
        this.e = gVar;
        this.y = random;
        this.z = z;
        this.A = z2;
        this.B = j;
        this.C = new okio.f();
        this.D = gVar.d();
        this.G = new byte[4];
        this.H = new okio.e();
    }

    public final void a(int i, i iVar) {
        if (this.E) {
            net.luminis.tls.engine.impl.c.t("closed");
            return;
        }
        int iF = iVar.f();
        if (iF > 125) {
            net.luminis.tls.engine.impl.c.o("Payload size must be less than or equal to 125");
            return;
        }
        okio.f fVar = this.D;
        fVar.o0(i | 128);
        fVar.o0(iF | 128);
        byte[] bArr = this.G;
        bArr.getClass();
        this.y.nextBytes(bArr);
        fVar.write(bArr, 0, bArr.length);
        if (iF > 0) {
            long j = fVar.y;
            fVar.m0(iVar);
            okio.e eVar = this.H;
            eVar.getClass();
            fVar.c0(eVar);
            eVar.g(j);
            com.google.android.material.resources.c.q(eVar, bArr);
            eVar.close();
        }
        this.e.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a aVar = this.F;
        if (aVar != null) {
            okhttp3.internal.e.b(aVar);
        }
        okhttp3.internal.e.b(this.e);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0139  */
    public final void g(i iVar) throws IOException {
        int i;
        byte[] bArr;
        if (this.E) {
            net.luminis.tls.engine.impl.c.t("closed");
            return;
        }
        okio.f fVar = this.C;
        fVar.m0(iVar);
        if (!this.z || iVar.e.length < this.B) {
            i = 130;
        } else {
            a aVar = this.F;
            if (aVar == null) {
                aVar = new a(0, this.A);
                this.F = aVar;
            }
            coil3.disk.e eVar = (coil3.disk.e) aVar.B;
            okio.f fVar2 = aVar.z;
            if (fVar2.y != 0) {
                net.luminis.tls.engine.impl.c.o("Failed requirement.");
                return;
            }
            if (aVar.y) {
                ((Deflater) aVar.A).reset();
            }
            eVar.E(fVar, fVar.y);
            eVar.flush();
            i iVar2 = b.a;
            if (fVar2.b0(iVar2.f(), fVar2.y - ((long) iVar2.e.length), iVar2)) {
                long j = fVar2.y - ((long) 4);
                okio.e eVarC0 = fVar2.c0(okio.b.a);
                try {
                    eVarC0.a(j);
                    eVarC0.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        com.google.common.base.b.d(eVarC0, th);
                        throw th2;
                    }
                }
            } else {
                fVar2.o0(0);
            }
            fVar.E(fVar2, fVar2.y);
            i = 194;
        }
        long j2 = fVar.y;
        okio.f fVar3 = this.D;
        fVar3.o0(i);
        if (j2 > 125) {
            if (j2 <= 65535) {
                fVar3.o0(254);
                fVar3.s0((int) j2);
            } else {
                fVar3.o0(255);
                c0 c0VarL0 = fVar3.l0(8);
                byte[] bArr2 = c0VarL0.a;
                int i2 = c0VarL0.c;
                bArr2[i2] = (byte) ((j2 >>> 56) & 255);
                bArr2[i2 + 1] = (byte) ((j2 >>> 48) & 255);
                bArr2[i2 + 2] = (byte) ((j2 >>> 40) & 255);
                bArr2[i2 + 3] = (byte) ((j2 >>> 32) & 255);
                bArr2[i2 + 4] = (byte) ((j2 >>> 24) & 255);
                bArr2[i2 + 5] = (byte) ((j2 >>> 16) & 255);
                bArr2[i2 + 6] = (byte) ((j2 >>> 8) & 255);
                bArr2[i2 + 7] = (byte) (j2 & 255);
                c0VarL0.c = i2 + 8;
                fVar3.y += 8;
            }
            bArr = this.G;
            bArr.getClass();
            this.y.nextBytes(bArr);
            fVar3.write(bArr, 0, bArr.length);
            if (j2 > r5) {
                okio.e eVar2 = this.H;
                eVar2.getClass();
                fVar.c0(eVar2);
                eVar2.g(0L);
                com.google.android.material.resources.c.q(eVar2, bArr);
                eVar2.close();
            }
            fVar3.E(fVar, j2);
            this.e.flush();
        }
        fVar3.o0(((int) j2) | 128);
        bArr = this.G;
        bArr.getClass();
        this.y.nextBytes(bArr);
        fVar3.write(bArr, 0, bArr.length);
        if (j2 > r5) {
            okio.e eVar3 = this.H;
            eVar3.getClass();
            fVar.c0(eVar3);
            eVar3.g(0L);
            com.google.android.material.resources.c.q(eVar3, bArr);
            eVar3.close();
        }
        fVar3.E(fVar, j2);
        this.e.flush();
    }
}
