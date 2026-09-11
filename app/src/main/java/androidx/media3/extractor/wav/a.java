package androidx.media3.extractor.wav;

import androidx.media3.common.i0;
import androidx.media3.common.j0;
import androidx.media3.common.q;
import androidx.media3.common.r;
import androidx.media3.common.util.w;
import androidx.media3.container.v;
import androidx.media3.extractor.h0;
import androidx.media3.extractor.o;
import androidx.media3.extractor.p;
import java.math.RoundingMode;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b {
    public static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, Token.ASSIGN_URSH, Token.AND, 130, Token.BLOCK, Token.DOTDOT, Token.WITHEXPR, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final p a;
    public final h0 b;
    public final v c;
    public final int d;
    public final byte[] e;
    public final w f;
    public final int g;
    public final r h;
    public int i;
    public long j;
    public int k;
    public long l;

    public a(p pVar, h0 h0Var, v vVar) throws j0 {
        this.a = pVar;
        this.b = h0Var;
        this.c = vVar;
        int i = vVar.b;
        int iMax = Math.max(1, i / 10);
        this.g = iMax;
        w wVar = new w(vVar.e);
        wVar.s();
        int iS = wVar.s();
        this.d = iS;
        int i2 = vVar.a;
        int i3 = vVar.c;
        int i4 = (((i3 - (i2 * 4)) * 8) / (vVar.d * i2)) + 1;
        if (iS != i4) {
            throw j0.a(null, "Expected frames per block: " + i4 + "; got: " + iS);
        }
        int iG = androidx.media3.common.util.j0.g(iMax, iS);
        this.e = new byte[iG * i3];
        this.f = new w(iS * 2 * i2 * iG);
        int i5 = ((i3 * i) * 8) / iS;
        q qVar = new q();
        qVar.n = i0.p("audio/raw");
        qVar.h = i5;
        qVar.i = i5;
        qVar.o = iMax * 2 * i2;
        qVar.F = i2;
        qVar.G = i;
        qVar.H = 2;
        this.h = new r(qVar);
    }

    @Override // androidx.media3.extractor.wav.b
    public final void a(long j) {
        this.i = 0;
        this.j = j;
        this.k = 0;
        this.l = 0L;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0054  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:37:0x0135  */
    /* JADX WARN: Code duplicated, block: B:43:0x0045 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x010b A[EDGE_INSN: B:47:0x010b->B:35:0x010b BREAK  A[LOOP:1: B:17:0x004b->B:34:0x0101], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:4:0x0020). Please report as a decompilation issue!!! */
    @Override // androidx.media3.extractor.wav.b
    public final boolean b(o oVar, long j) {
        byte[] bArr;
        int i;
        int i2;
        int i3;
        w wVar;
        int i4;
        int i5;
        int i6;
        byte[] bArr2;
        int i7;
        int i8;
        int iJ;
        int iMin;
        int[] iArr;
        int i9;
        int i10;
        int i11;
        byte b;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = this.k;
        v vVar = this.c;
        int i19 = i18 / (vVar.a * 2);
        int i20 = this.g;
        int i21 = this.d;
        int iG = androidx.media3.common.util.j0.g(i20 - i19, i21);
        int i22 = vVar.c;
        int i23 = iG * i22;
        boolean z = j == 0;
        while (true) {
            bArr = this.e;
            if (z && (i16 = this.i) < i23) {
                i17 = oVar.read(bArr, this.i, (int) Math.min(i23 - i16, j));
                if (i17 == -1) {
                    break;
                }
                this.i += i17;
                bArr = this.e;
                if (z) {
                }
            }
            i = this.i / i22;
            if (i > 0) {
                i3 = 0;
                while (true) {
                    wVar = this.f;
                    if (i3 < i) {
                        break;
                    }
                    i5 = 0;
                    while (true) {
                        i6 = vVar.a;
                        if (i5 < i6) {
                            bArr2 = wVar.a;
                            int i24 = (i5 * 4) + (i3 * i22);
                            i7 = (i6 * 4) + i24;
                            i8 = (i22 / i6) - 4;
                            iJ = (short) ((bArr[i24] & 255) | ((bArr[i24 + 1] & 255) << 8));
                            int i25 = i;
                            iMin = Math.min(bArr[i24 + 2] & 255, 88);
                            iArr = n;
                            i9 = iArr[iMin];
                            i10 = ((i3 * i21 * i6) + i5) * 2;
                            bArr2[i10] = (byte) (iJ & 255);
                            bArr2[i10 + 1] = (byte) (iJ >> 8);
                            int i26 = i3;
                            i11 = 0;
                            while (i11 < i8 * 2) {
                                b = bArr[((i11 / 8) * i6 * 4) + i7 + ((i11 / 2) % 4)];
                                i12 = i11;
                                i13 = b & 255;
                                if (i12 % 2 == 0) {
                                    i14 = b & 15;
                                } else {
                                    i14 = i13 >> 4;
                                }
                                i15 = ((((i14 & 7) * 2) + 1) * i9) >> 3;
                                if ((i14 & 8) != 0) {
                                    i15 = -i15;
                                }
                                iJ = androidx.media3.common.util.j0.j(iJ + i15, -32768, 32767);
                                i10 = (i6 * 2) + i10;
                                bArr2[i10] = (byte) (iJ & 255);
                                bArr2[i10 + 1] = (byte) (iJ >> 8);
                                iMin = androidx.media3.common.util.j0.j(iMin + m[i14], 0, 88);
                                i9 = iArr[iMin];
                                i11 = i12 + 1;
                            }
                            i5++;
                            i = i25;
                            i3 = i26;
                        }
                    }
                    i3++;
                }
                int i27 = i;
                int i28 = i21 * i27 * 2 * vVar.a;
                wVar.M(0);
                wVar.L(i28);
                this.i -= i27 * i22;
                int i29 = wVar.c;
                this.b.f(i29, wVar);
                i4 = this.k + i29;
                this.k = i4;
                if (i4 / (vVar.a * 2) >= i20) {
                    d(i20);
                }
            }
            if (z && (i2 = this.k / (vVar.a * 2)) > 0) {
                d(i2);
            }
            return z;
        }
        while (true) {
            bArr = this.e;
            if (z) {
            }
            i = this.i / i22;
            if (i > 0) {
                i3 = 0;
                while (true) {
                    wVar = this.f;
                    if (i3 < i) {
                        break;
                        break;
                    }
                    i5 = 0;
                    while (true) {
                        i6 = vVar.a;
                        if (i5 < i6) {
                            bArr2 = wVar.a;
                            int i210 = (i5 * 4) + (i3 * i22);
                            i7 = (i6 * 4) + i210;
                            i8 = (i22 / i6) - 4;
                            iJ = (short) ((bArr[i210] & 255) | ((bArr[i210 + 1] & 255) << 8));
                            int i211 = i;
                            iMin = Math.min(bArr[i210 + 2] & 255, 88);
                            iArr = n;
                            i9 = iArr[iMin];
                            i10 = ((i3 * i21 * i6) + i5) * 2;
                            bArr2[i10] = (byte) (iJ & 255);
                            bArr2[i10 + 1] = (byte) (iJ >> 8);
                            int i212 = i3;
                            i11 = 0;
                            while (i11 < i8 * 2) {
                                b = bArr[((i11 / 8) * i6 * 4) + i7 + ((i11 / 2) % 4)];
                                i12 = i11;
                                i13 = b & 255;
                                if (i12 % 2 == 0) {
                                    i14 = b & 15;
                                } else {
                                    i14 = i13 >> 4;
                                }
                                i15 = ((((i14 & 7) * 2) + 1) * i9) >> 3;
                                if ((i14 & 8) != 0) {
                                    i15 = -i15;
                                }
                                iJ = androidx.media3.common.util.j0.j(iJ + i15, -32768, 32767);
                                i10 = (i6 * 2) + i10;
                                bArr2[i10] = (byte) (iJ & 255);
                                bArr2[i10 + 1] = (byte) (iJ >> 8);
                                iMin = androidx.media3.common.util.j0.j(iMin + m[i14], 0, 88);
                                i9 = iArr[iMin];
                                i11 = i12 + 1;
                            }
                            i5++;
                            i = i211;
                            i3 = i212;
                        }
                    }
                    i3++;
                }
                int i213 = i;
                int i214 = i21 * i213 * 2 * vVar.a;
                wVar.M(0);
                wVar.L(i214);
                this.i -= i213 * i22;
                int i215 = wVar.c;
                this.b.f(i215, wVar);
                i4 = this.k + i215;
                this.k = i4;
                if (i4 / (vVar.a * 2) >= i20) {
                    d(i20);
                }
            }
            if (z) {
                d(i2);
            }
            return z;
            this.i += i17;
        }
    }

    @Override // androidx.media3.extractor.wav.b
    public final void c(int i, long j) {
        f fVar = new f(this.c, this.d, i, j);
        this.a.g(fVar);
        r rVar = this.h;
        h0 h0Var = this.b;
        h0Var.e(rVar);
        h0Var.d(fVar.e);
    }

    public final void d(int i) {
        long j = this.j;
        long j2 = this.l;
        v vVar = this.c;
        long j3 = vVar.b;
        String str = androidx.media3.common.util.j0.a;
        long jY = j + androidx.media3.common.util.j0.Y(j2, 1000000L, j3, RoundingMode.DOWN);
        int i2 = i * 2 * vVar.a;
        this.b.g(jY, 1, i2, this.k - i2, null);
        this.l += (long) i;
        this.k -= i2;
    }
}
