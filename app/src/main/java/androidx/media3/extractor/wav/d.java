package androidx.media3.extractor.wav;

import android.util.Pair;
import androidx.media3.common.j0;
import androidx.media3.common.util.w;
import androidx.media3.container.v;
import androidx.media3.exoplayer.upstream.h;
import androidx.media3.extractor.h0;
import androidx.media3.extractor.n;
import androidx.media3.extractor.o;
import androidx.media3.extractor.p;
import androidx.media3.extractor.r;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements n {
    public p a;
    public h0 b;
    public b e;
    public int c = 0;
    public long d = -1;
    public int f = -1;
    public long g = -1;

    @Override // androidx.media3.extractor.n
    public final boolean a(o oVar) {
        return e.a(oVar);
    }

    @Override // androidx.media3.extractor.n
    public final void b(long j, long j2) {
        this.c = j == 0 ? 0 : 4;
        b bVar = this.e;
        if (bVar != null) {
            bVar.a(j2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:82:0x021d  */
    @Override // androidx.media3.extractor.n
    public final int c(o oVar, r rVar) throws j0 {
        byte[] bArr;
        int i;
        this.b.getClass();
        String str = androidx.media3.common.util.j0.a;
        int i2 = this.c;
        int iD = 4;
        if (i2 == 0) {
            com.google.android.material.motion.a.q(oVar.getPosition() == 0);
            int i3 = this.f;
            if (i3 != -1) {
                oVar.r(i3);
                this.c = 4;
                return 0;
            }
            if (!e.a(oVar)) {
                throw j0.a(null, "Unsupported or unrecognized wav file type.");
            }
            oVar.r((int) (oVar.f() - oVar.getPosition()));
            this.c = 1;
            return 0;
        }
        long jP = -1;
        if (i2 == 1) {
            w wVar = new w(8);
            h hVarC = h.c(oVar, wVar);
            if (hVarC.a != 1685272116) {
                oVar.n();
            } else {
                oVar.h(8);
                wVar.M(0);
                oVar.x(wVar.a, 0, 8);
                jP = wVar.p();
                oVar.r(((int) hVarC.b) + 8);
            }
            this.d = jP;
            this.c = 2;
            return 0;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    org.mozilla.javascript.c.a();
                    return 0;
                }
                com.google.android.material.motion.a.q(this.g != -1);
                long position = this.g - oVar.getPosition();
                b bVar = this.e;
                bVar.getClass();
                return bVar.b(oVar, position) ? -1 : 0;
            }
            oVar.n();
            h hVarB = e.b(1684108385, oVar, new w(8));
            oVar.r(8);
            Pair pairCreate = Pair.create(Long.valueOf(oVar.getPosition()), Long.valueOf(hVarB.b));
            this.f = ((Long) pairCreate.first).intValue();
            long jLongValue = ((Long) pairCreate.second).longValue();
            long j = this.d;
            if (j != -1 && jLongValue == 4294967295L) {
                jLongValue = j;
            }
            this.g = ((long) this.f) + jLongValue;
            long length = oVar.getLength();
            if (length != -1 && this.g > length) {
                androidx.media3.common.util.c.t("WavExtractor", "Data exceeds input length: " + this.g + ", " + length);
                this.g = length;
            }
            b bVar2 = this.e;
            bVar2.getClass();
            bVar2.c(this.f, this.g);
            this.c = 4;
            return 0;
        }
        w wVar2 = new w(16);
        long j2 = e.b(1718449184, oVar, wVar2).b;
        com.google.android.material.motion.a.q(j2 >= 16);
        oVar.x(wVar2.a, 0, 16);
        wVar2.M(0);
        int iS = wVar2.s();
        int iS2 = wVar2.s();
        int iR = wVar2.r();
        wVar2.r();
        int iS3 = wVar2.s();
        int iS4 = wVar2.s();
        int i4 = ((int) j2) - 16;
        if (i4 > 0) {
            bArr = new byte[i4];
            oVar.x(bArr, 0, i4);
            if (iS == 65534 && i4 == 24) {
                w wVar3 = new w(bArr);
                wVar3.s();
                int iS5 = wVar3.s();
                if (iS5 != 0 && iS5 != iS4) {
                    throw j0.c("validBits ( " + iS5 + ")  != bitsPerSample( " + iS4 + ") are not supported");
                }
                int iR2 = wVar3.r();
                if ((iR2 >> 18) != 0) {
                    throw j0.c("invalid channel mask " + iR2);
                }
                if (iR2 != 0 && Integer.bitCount(iR2) != iS2) {
                    throw j0.c("invalid number of channels (" + Integer.bitCount(iR2) + ") in channel mask " + iR2);
                }
                iS = wVar3.s();
                byte[] bArr2 = new byte[14];
                wVar3.k(bArr2, 0, 14);
                if (!Arrays.equals(bArr2, e.a) && !Arrays.equals(bArr2, e.b)) {
                    throw j0.c("invalid wav format extension guid");
                }
            }
        } else {
            bArr = androidx.media3.common.util.j0.b;
        }
        oVar.r((int) (oVar.f() - oVar.getPosition()));
        v vVar = new v();
        vVar.a = iS2;
        vVar.b = iR;
        vVar.c = iS3;
        vVar.d = iS4;
        vVar.e = bArr;
        if (iS == 17) {
            this.e = new a(this.a, this.b, vVar);
        } else if (iS == 6) {
            this.e = new c(this.a, this.b, vVar, "audio/g711-alaw", -1);
        } else if (iS == 7) {
            this.e = new c(this.a, this.b, vVar, "audio/g711-mlaw", -1);
        } else {
            if (iS == 1) {
                iD = androidx.media3.common.util.j0.D(iS4, ByteOrder.LITTLE_ENDIAN);
                i = iD;
            } else {
                if (iS != 3) {
                    if (iS == 65534) {
                        iD = androidx.media3.common.util.j0.D(iS4, ByteOrder.LITTLE_ENDIAN);
                        i = iD;
                    }
                } else if (iS4 == 32) {
                    i = iD;
                }
                i = 0;
            }
            if (i == 0) {
                throw j0.c("Unsupported WAV format type: " + iS);
            }
            this.e = new c(this.a, this.b, vVar, "audio/raw", i);
        }
        this.c = 3;
        return 0;
    }

    @Override // androidx.media3.extractor.n
    public final void d(p pVar) {
        this.a = pVar;
        this.b = pVar.u(0, 1);
        pVar.o();
    }

    @Override // androidx.media3.extractor.n
    public final void release() {
    }
}
