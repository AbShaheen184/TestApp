package androidx.media3.exoplayer.source;

import android.media.MediaCodec;
import androidx.appcompat.widget.c2;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {
    public final c2 a;
    public final int b;
    public final androidx.media3.common.util.w c;
    public r0 d;
    public r0 e;
    public r0 f;
    public long g;

    public s0(c2 c2Var) {
        int i;
        this.a = c2Var;
        synchronized (c2Var) {
            i = ((androidx.media3.exoplayer.g) c2Var.A).c.b;
        }
        this.b = i;
        this.c = new androidx.media3.common.util.w(32);
        r0 r0Var = new r0(0L, i);
        this.d = r0Var;
        this.e = r0Var;
        this.f = r0Var;
    }

    public static r0 c(r0 r0Var, long j, ByteBuffer byteBuffer, int i) {
        while (j >= r0Var.y) {
            r0Var = (r0) r0Var.A;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (r0Var.y - j));
            androidx.media3.exoplayer.upstream.a aVar = (androidx.media3.exoplayer.upstream.a) r0Var.z;
            byteBuffer.put(aVar.a, ((int) (j - r0Var.e)) + aVar.b, iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == r0Var.y) {
                r0Var = (r0) r0Var.A;
            }
        }
        return r0Var;
    }

    public static r0 d(r0 r0Var, long j, byte[] bArr, int i) {
        while (j >= r0Var.y) {
            r0Var = (r0) r0Var.A;
        }
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (r0Var.y - j));
            androidx.media3.exoplayer.upstream.a aVar = (androidx.media3.exoplayer.upstream.a) r0Var.z;
            System.arraycopy(aVar.a, ((int) (j - r0Var.e)) + aVar.b, bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == r0Var.y) {
                r0Var = (r0) r0Var.A;
            }
        }
        return r0Var;
    }

    public static r0 e(r0 r0Var, androidx.media3.decoder.e eVar, androidx.media3.exoplayer.image.f fVar, androidx.media3.common.util.w wVar) {
        if (eVar.g(1073741824)) {
            long j = fVar.c;
            int iG = 1;
            wVar.J(1);
            r0 r0VarD = d(r0Var, j, wVar.a, 1);
            long j2 = j + 1;
            byte b = wVar.a[0];
            boolean z = (b & 128) != 0;
            int i = b & 127;
            androidx.media3.decoder.a aVar = eVar.A;
            byte[] bArr = aVar.a;
            if (bArr == null) {
                aVar.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            r0Var = d(r0VarD, j2, aVar.a, i);
            long j3 = j2 + ((long) i);
            if (z) {
                wVar.J(2);
                r0Var = d(r0Var, j3, wVar.a, 2);
                j3 += 2;
                iG = wVar.G();
            }
            int[] iArr = aVar.d;
            if (iArr == null || iArr.length < iG) {
                iArr = new int[iG];
            }
            int[] iArr2 = aVar.e;
            if (iArr2 == null || iArr2.length < iG) {
                iArr2 = new int[iG];
            }
            if (z) {
                int i2 = iG * 6;
                wVar.J(i2);
                r0Var = d(r0Var, j3, wVar.a, i2);
                j3 += (long) i2;
                wVar.M(0);
                for (int i3 = 0; i3 < iG; i3++) {
                    iArr[i3] = wVar.G();
                    iArr2[i3] = wVar.D();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = fVar.b - ((int) (j3 - fVar.c));
            }
            androidx.media3.extractor.g0 g0Var = (androidx.media3.extractor.g0) fVar.d;
            String str = androidx.media3.common.util.j0.a;
            byte[] bArr2 = g0Var.b;
            byte[] bArr3 = aVar.a;
            int i4 = g0Var.a;
            int i5 = g0Var.c;
            int i6 = g0Var.d;
            aVar.f = iG;
            aVar.d = iArr;
            aVar.e = iArr2;
            aVar.b = bArr2;
            aVar.a = bArr3;
            aVar.c = i4;
            aVar.g = i5;
            aVar.h = i6;
            MediaCodec.CryptoInfo cryptoInfo = aVar.i;
            cryptoInfo.numSubSamples = iG;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i4;
            androidx.media3.common.util.b bVar = aVar.j;
            bVar.getClass();
            MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) bVar.z;
            pattern.set(i5, i6);
            ((MediaCodec.CryptoInfo) bVar.y).setPattern(pattern);
            long j4 = fVar.c;
            int i7 = (int) (j3 - j4);
            fVar.c = j4 + ((long) i7);
            fVar.b -= i7;
        }
        if (!eVar.g(268435456)) {
            eVar.q(fVar.b);
            return c(r0Var, fVar.c, eVar.B, fVar.b);
        }
        wVar.J(4);
        r0 r0VarD2 = d(r0Var, fVar.c, wVar.a, 4);
        int iD = wVar.D();
        fVar.c += 4;
        fVar.b -= 4;
        eVar.q(iD);
        r0 r0VarC = c(r0VarD2, fVar.c, eVar.B, iD);
        fVar.c += (long) iD;
        int i8 = fVar.b - iD;
        fVar.b = i8;
        ByteBuffer byteBuffer = eVar.E;
        if (byteBuffer == null || byteBuffer.capacity() < i8) {
            eVar.E = ByteBuffer.allocate(i8);
        } else {
            eVar.E.clear();
        }
        return c(r0VarC, fVar.c, eVar.E, fVar.b);
    }

    public final void a(long j) {
        r0 r0Var;
        if (j == -1) {
            return;
        }
        while (true) {
            r0Var = this.d;
            if (j < r0Var.y) {
                break;
            }
            c2 c2Var = this.a;
            androidx.media3.exoplayer.upstream.a aVar = (androidx.media3.exoplayer.upstream.a) r0Var.z;
            synchronized (c2Var) {
                try {
                    androidx.media3.exoplayer.upstream.d dVar = ((androidx.media3.exoplayer.g) c2Var.A).c;
                    synchronized (dVar) {
                        try {
                            androidx.media3.exoplayer.upstream.a[] aVarArr = dVar.f;
                            int i = dVar.e;
                            dVar.e = i + 1;
                            aVarArr[i] = aVar;
                            dVar.d--;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    c2Var.V(aVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            r0 r0Var2 = this.d;
            r0Var2.z = null;
            r0 r0Var3 = (r0) r0Var2.A;
            r0Var2.A = null;
            this.d = r0Var3;
        }
        if (this.e.e < r0Var.e) {
            this.e = r0Var;
        }
    }

    public final int b(int i) {
        androidx.media3.exoplayer.upstream.a aVarA;
        r0 r0Var = this.f;
        if (((androidx.media3.exoplayer.upstream.a) r0Var.z) == null) {
            c2 c2Var = this.a;
            synchronized (c2Var) {
                aVarA = ((androidx.media3.exoplayer.g) c2Var.A).c.a();
                ((HashMap) c2Var.y).put(aVarA, (androidx.media3.exoplayer.analytics.k) c2Var.z);
                androidx.media3.exoplayer.f fVar = (androidx.media3.exoplayer.f) ((androidx.media3.exoplayer.g) c2Var.A).q.get((androidx.media3.exoplayer.analytics.k) c2Var.z);
                if (fVar != null) {
                    synchronized (fVar) {
                        fVar.d++;
                    }
                }
            }
            r0 r0Var2 = new r0(this.f.y, this.b);
            r0Var.z = aVarA;
            r0Var.A = r0Var2;
        }
        return Math.min(i, (int) (this.f.y - this.g));
    }
}
