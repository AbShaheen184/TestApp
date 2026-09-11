package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.i0;
import androidx.media3.common.util.j0;
import androidx.media3.common.util.v;
import androidx.media3.common.util.w;
import com.google.common.collect.a1;
import com.google.common.collect.d0;
import com.google.common.collect.h0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends com.google.android.gms.dynamite.g {
    public static final androidx.media3.exoplayer.hls.playlist.a q = new androidx.media3.exoplayer.hls.playlist.a(10);
    public final androidx.media3.exoplayer.hls.playlist.a p;

    public h(androidx.media3.exoplayer.hls.playlist.a aVar) {
        this.p = aVar;
    }

    public static a H(w wVar, int i, int i2) {
        int iZ;
        String strConcat;
        int iZ2 = wVar.z();
        Charset charsetW = W(iZ2);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        wVar.k(bArr, 0, i3);
        if (i2 == 2) {
            strConcat = "image/" + com.google.common.base.b.w(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iZ = 2;
        } else {
            iZ = Z(bArr, 0);
            String strW = com.google.common.base.b.w(new String(bArr, 0, iZ, StandardCharsets.ISO_8859_1));
            strConcat = strW.indexOf(47) == -1 ? "image/".concat(strW) : strW;
        }
        int i4 = bArr[iZ + 1] & 255;
        int i5 = iZ + 2;
        int iY = Y(bArr, i5, iZ2);
        String str = new String(bArr, i5, iY - i5, charsetW);
        int iV = V(iZ2) + iY;
        return new a(strConcat, str, i4, i3 <= iV ? j0.b : Arrays.copyOfRange(bArr, iV, i3));
    }

    public static c I(w wVar, int i, int i2, boolean z, int i3, androidx.media3.exoplayer.hls.playlist.a aVar) throws Throwable {
        int i4 = wVar.b;
        int iZ = Z(wVar.a, i4);
        String str = new String(wVar.a, i4, iZ - i4, StandardCharsets.ISO_8859_1);
        wVar.M(iZ + 1);
        int iM = wVar.m();
        int iM2 = wVar.m();
        long jB = wVar.B();
        if (jB == 4294967295L) {
            jB = -1;
        }
        long jB2 = wVar.B();
        long j = jB2 == 4294967295L ? -1L : jB2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (wVar.b < i5) {
            i iVarL = L(i2, wVar, z, i3, aVar);
            if (iVarL != null) {
                arrayList.add(iVarL);
            }
        }
        return new c(str, iM, iM2, jB, j, (i[]) arrayList.toArray(new i[0]));
    }

    public static d J(w wVar, int i, int i2, boolean z, int i3, androidx.media3.exoplayer.hls.playlist.a aVar) throws Throwable {
        int i4 = wVar.b;
        int iZ = Z(wVar.a, i4);
        String str = new String(wVar.a, i4, iZ - i4, StandardCharsets.ISO_8859_1);
        wVar.M(iZ + 1);
        int iZ2 = wVar.z();
        boolean z2 = (iZ2 & 2) != 0;
        boolean z3 = (iZ2 & 1) != 0;
        int iZ3 = wVar.z();
        String[] strArr = new String[iZ3];
        for (int i5 = 0; i5 < iZ3; i5++) {
            int i6 = wVar.b;
            int iZ4 = Z(wVar.a, i6);
            strArr[i5] = new String(wVar.a, i6, iZ4 - i6, StandardCharsets.ISO_8859_1);
            wVar.M(iZ4 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (wVar.b < i7) {
            i iVarL = L(i2, wVar, z, i3, aVar);
            if (iVarL != null) {
                arrayList.add(iVarL);
            }
        }
        return new d(str, z2, z3, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    public static e K(int i, w wVar) {
        if (i < 4) {
            return null;
        }
        int iZ = wVar.z();
        Charset charsetW = W(iZ);
        byte[] bArr = new byte[3];
        wVar.k(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        wVar.k(bArr2, 0, i2);
        int iY = Y(bArr2, 0, iZ);
        String str2 = new String(bArr2, 0, iY, charsetW);
        int iV = V(iZ) + iY;
        return new e(str, str2, P(bArr2, iV, Y(bArr2, iV, iZ), charsetW));
    }

    /* JADX WARN: Code duplicated, block: B:153:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:161:0x01ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:162:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:177:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:183:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:185:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:191:0x020c A[Catch: all -> 0x012c, Exception -> 0x012f, OutOfMemoryError -> 0x0132, TRY_LEAVE, TryCatch #3 {Exception -> 0x012f, OutOfMemoryError -> 0x0132, all -> 0x012c, blocks: (B:107:0x0126, B:115:0x0137, B:122:0x014d, B:124:0x0155, B:132:0x016f, B:141:0x0187, B:152:0x01a2, B:159:0x01b4, B:182:0x01f2, B:190:0x0207, B:191:0x020c), top: B:205:0x011c }] */
    /* JADX WARN: Code duplicated, block: B:198:0x022e  */
    /* JADX WARN: Instruction removed from duplicated block: B:198:0x022e, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Throwable] */
    public static i L(int i, w wVar, boolean z, int i2, androidx.media3.exoplayer.hls.playlist.a aVar) throws Throwable {
        int iD;
        i iVar;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Object obj;
        i iVar2;
        ?? r0;
        i bVar;
        boolean z7;
        int i3 = i;
        w wVar2 = wVar;
        int iZ = wVar2.z();
        int iZ2 = wVar2.z();
        int iZ3 = wVar2.z();
        int iZ4 = i3 >= 3 ? wVar2.z() : 0;
        if (i3 == 4) {
            iD = wVar2.D();
            if (!z) {
                iD = (((iD >> 24) & 255) << 21) | (iD & 255) | (((iD >> 8) & 255) << 7) | (((iD >> 16) & 255) << 14);
            }
        } else {
            iD = i3 == 3 ? wVar2.D() : wVar2.C();
        }
        int iG = i3 >= 3 ? wVar2.G() : 0;
        if (iZ == 0 && iZ2 == 0 && iZ3 == 0 && iZ4 == 0 && iD == 0 && iG == 0) {
            wVar2.M(wVar2.c);
            return null;
        }
        int i4 = wVar2.b + iD;
        if (i4 > wVar2.c) {
            androidx.media3.common.util.c.t("Id3Decoder", "Frame size exceeds remaining tag data");
            wVar2.M(wVar2.c);
            return null;
        }
        if (aVar != null) {
            switch (aVar.e) {
                case 10:
                    iVar = null;
                    break;
                default:
                    iVar = null;
                    z7 = (iZ == 67 && iZ2 == 79 && iZ3 == 77 && (iZ4 == 77 || i3 == 2)) || (iZ == 77 && iZ2 == 76 && iZ3 == 76 && (iZ4 == 84 || i3 == 2));
                    break;
            }
            if (!z7) {
                wVar2.M(i4);
                return iVar;
            }
        } else {
            iVar = null;
        }
        if (i3 == 3) {
            z2 = (iG & 128) != 0;
            z5 = (iG & 64) != 0;
            z6 = false;
            z4 = (iG & 32) != 0;
            z3 = z2;
        } else if (i3 == 4) {
            boolean z8 = (iG & 64) != 0;
            boolean z9 = (iG & 8) != 0;
            z5 = (iG & 4) != 0;
            z6 = (iG & 2) != 0;
            z3 = (iG & 1) != 0;
            boolean z10 = z9;
            z4 = z8;
            z2 = z10;
        } else {
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
        }
        if (z2 || z5) {
            androidx.media3.common.util.c.t("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            wVar2.M(i4);
            return iVar;
        }
        if (z4) {
            iD--;
            wVar2.N(1);
        }
        if (z3) {
            iD -= 4;
            wVar2.N(4);
        }
        if (z6) {
            iD = a0(iD, wVar2);
        }
        int i5 = iD;
        try {
            if (iZ == 84 && iZ2 == 88 && iZ3 == 88 && (i3 == 2 || iZ4 == 88)) {
                bVar = S(i5, wVar2);
            } else if (iZ == 84) {
                bVar = Q(i5, wVar2, X(i3, iZ, iZ2, iZ3, iZ4));
            } else if (iZ == 87 && iZ2 == 88 && iZ3 == 88 && (i3 == 2 || iZ4 == 88)) {
                bVar = U(i5, wVar2);
            } else if (iZ == 87) {
                bVar = T(i5, wVar2, X(i3, iZ, iZ2, iZ3, iZ4));
            } else if (iZ == 80 && iZ2 == 82 && iZ3 == 73 && iZ4 == 86) {
                bVar = O(i5, wVar2);
            } else {
                if (iZ != 71 || iZ2 != 69 || iZ3 != 79 || (iZ4 != 66 && i3 != 2)) {
                    if (i3 == 2) {
                        if (iZ == 80 && iZ2 == 73 && iZ3 == 67) {
                            bVar = H(wVar2, i5, i3);
                        } else if (iZ != 67 && iZ2 == 79 && iZ3 == 77 && (iZ4 == 77 || i3 == 2)) {
                            bVar = K(i5, wVar2);
                        } else if (iZ != 67 && iZ2 == 72 && iZ3 == 65 && iZ4 == 80) {
                            try {
                                bVar = I(wVar2, i5, i3, z, i2, aVar);
                                i3 = i;
                                wVar2 = wVar;
                            } catch (Exception e) {
                                e = e;
                                i3 = i;
                                wVar2 = wVar;
                                obj = e;
                                wVar2.M(i4);
                                iVar2 = iVar;
                                r0 = obj;
                            } catch (OutOfMemoryError e2) {
                                e = e2;
                                i3 = i;
                                wVar2 = wVar;
                                obj = e;
                                wVar2.M(i4);
                                iVar2 = iVar;
                                r0 = obj;
                            } catch (Throwable th) {
                                th = th;
                                wVar2 = wVar;
                                wVar2.M(i4);
                                throw th;
                            }
                        } else if (iZ != 67 && iZ2 == 84 && iZ3 == 79 && iZ4 == 67) {
                            i3 = i;
                            wVar2 = wVar;
                            bVar = J(wVar2, i5, i3, z, i2, aVar);
                        } else {
                            i3 = i;
                            wVar2 = wVar;
                            if (iZ != 77 && iZ2 == 76 && iZ3 == 76 && iZ4 == 84) {
                                bVar = N(i5, wVar2);
                            } else {
                                String strX = X(i3, iZ, iZ2, iZ3, iZ4);
                                byte[] bArr = new byte[i5];
                                wVar2.k(bArr, 0, i5);
                                bVar = new b(strX, bArr);
                            }
                        }
                        wVar2.M(i4);
                        iVar2 = bVar;
                        r0 = iVar;
                    } else if (iZ == 65 && iZ2 == 80 && iZ3 == 73 && iZ4 == 67) {
                        bVar = H(wVar2, i5, i3);
                    } else {
                        if (iZ != 67) {
                            if (iZ != 67) {
                            }
                            if (iZ != 67) {
                                i3 = i;
                                wVar2 = wVar;
                                if (iZ != 77) {
                                    String strX2 = X(i3, iZ, iZ2, iZ3, iZ4);
                                    byte[] bArr2 = new byte[i5];
                                    wVar2.k(bArr2, 0, i5);
                                    bVar = new b(strX2, bArr2);
                                } else {
                                    String strX3 = X(i3, iZ, iZ2, iZ3, iZ4);
                                    byte[] bArr3 = new byte[i5];
                                    wVar2.k(bArr3, 0, i5);
                                    bVar = new b(strX3, bArr3);
                                }
                            } else {
                                i3 = i;
                                wVar2 = wVar;
                                if (iZ != 77) {
                                    String strX4 = X(i3, iZ, iZ2, iZ3, iZ4);
                                    byte[] bArr4 = new byte[i5];
                                    wVar2.k(bArr4, 0, i5);
                                    bVar = new b(strX4, bArr4);
                                } else {
                                    String strX5 = X(i3, iZ, iZ2, iZ3, iZ4);
                                    byte[] bArr5 = new byte[i5];
                                    wVar2.k(bArr5, 0, i5);
                                    bVar = new b(strX5, bArr5);
                                }
                            }
                        } else {
                            if (iZ != 67) {
                            }
                            if (iZ != 67) {
                                i3 = i;
                                wVar2 = wVar;
                                if (iZ != 77) {
                                    String strX6 = X(i3, iZ, iZ2, iZ3, iZ4);
                                    byte[] bArr6 = new byte[i5];
                                    wVar2.k(bArr6, 0, i5);
                                    bVar = new b(strX6, bArr6);
                                } else {
                                    String strX7 = X(i3, iZ, iZ2, iZ3, iZ4);
                                    byte[] bArr7 = new byte[i5];
                                    wVar2.k(bArr7, 0, i5);
                                    bVar = new b(strX7, bArr7);
                                }
                            } else {
                                i3 = i;
                                wVar2 = wVar;
                                if (iZ != 77) {
                                    String strX8 = X(i3, iZ, iZ2, iZ3, iZ4);
                                    byte[] bArr8 = new byte[i5];
                                    wVar2.k(bArr8, 0, i5);
                                    bVar = new b(strX8, bArr8);
                                } else {
                                    String strX9 = X(i3, iZ, iZ2, iZ3, iZ4);
                                    byte[] bArr9 = new byte[i5];
                                    wVar2.k(bArr9, 0, i5);
                                    bVar = new b(strX9, bArr9);
                                }
                            }
                        }
                        wVar2.M(i4);
                        iVar2 = bVar;
                        r0 = iVar;
                    }
                    if (iVar2 == null) {
                        androidx.media3.common.util.c.u("Id3Decoder", "Failed to decode frame: id=" + X(i3, iZ, iZ2, iZ3, iZ4) + ", frameSize=" + i5, r0);
                    }
                    return iVar2;
                }
                bVar = M(i5, wVar2);
            }
            wVar2.M(i4);
            iVar2 = bVar;
            r0 = iVar;
        } catch (Exception e3) {
            obj = e3;
        } catch (OutOfMemoryError e4) {
            obj = e4;
        } catch (Throwable th2) {
            th = th2;
        }
        if (iVar2 == null) {
            androidx.media3.common.util.c.u("Id3Decoder", "Failed to decode frame: id=" + X(i3, iZ, iZ2, iZ3, iZ4) + ", frameSize=" + i5, r0);
        }
        return iVar2;
    }

    public static f M(int i, w wVar) {
        int iZ = wVar.z();
        Charset charsetW = W(iZ);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        wVar.k(bArr, 0, i2);
        int iZ2 = Z(bArr, 0);
        String strP = i0.p(new String(bArr, 0, iZ2, StandardCharsets.ISO_8859_1));
        int i3 = iZ2 + 1;
        int iY = Y(bArr, i3, iZ);
        String strP2 = P(bArr, i3, iY, charsetW);
        int iV = V(iZ) + iY;
        int iY2 = Y(bArr, iV, iZ);
        String strP3 = P(bArr, iV, iY2, charsetW);
        int iV2 = V(iZ) + iY2;
        return new f(strP, strP2, strP3, i2 <= iV2 ? j0.b : Arrays.copyOfRange(bArr, iV2, i2));
    }

    public static l N(int i, w wVar) {
        int iG = wVar.G();
        int iC = wVar.C();
        int iC2 = wVar.C();
        int iZ = wVar.z();
        int iZ2 = wVar.z();
        v vVar = new v();
        vVar.k(wVar);
        int i2 = ((i - 10) * 8) / (iZ + iZ2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iG2 = vVar.g(iZ);
            int iG3 = vVar.g(iZ2);
            iArr[i3] = iG2;
            iArr2[i3] = iG3;
        }
        return new l(iG, iC, iC2, iArr, iArr2);
    }

    public static m O(int i, w wVar) {
        byte[] bArr = new byte[i];
        wVar.k(bArr, 0, i);
        int iZ = Z(bArr, 0);
        String str = new String(bArr, 0, iZ, StandardCharsets.ISO_8859_1);
        int i2 = iZ + 1;
        return new m(str, i <= i2 ? j0.b : Arrays.copyOfRange(bArr, i2, i));
    }

    public static String P(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    public static n Q(int i, w wVar, String str) {
        if (i < 1) {
            return null;
        }
        int iZ = wVar.z();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        wVar.k(bArr, 0, i2);
        return new n(str, null, R(bArr, iZ, 0));
    }

    public static a1 R(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return h0.s("");
        }
        d0 d0VarK = h0.k();
        int iY = Y(bArr, i2, i);
        while (i2 < iY) {
            d0VarK.b(new String(bArr, i2, iY - i2, W(i)));
            i2 = V(i) + iY;
            iY = Y(bArr, i2, i);
        }
        a1 a1VarG = d0VarK.g();
        return a1VarG.isEmpty() ? h0.s("") : a1VarG;
    }

    public static n S(int i, w wVar) {
        if (i < 1) {
            return null;
        }
        int iZ = wVar.z();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        wVar.k(bArr, 0, i2);
        int iY = Y(bArr, 0, iZ);
        return new n("TXXX", new String(bArr, 0, iY, W(iZ)), R(bArr, iZ, V(iZ) + iY));
    }

    public static o T(int i, w wVar, String str) {
        byte[] bArr = new byte[i];
        wVar.k(bArr, 0, i);
        return new o(str, null, new String(bArr, 0, Z(bArr, 0), StandardCharsets.ISO_8859_1));
    }

    public static o U(int i, w wVar) {
        if (i < 1) {
            return null;
        }
        int iZ = wVar.z();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        wVar.k(bArr, 0, i2);
        int iY = Y(bArr, 0, iZ);
        String str = new String(bArr, 0, iY, W(iZ));
        int iV = V(iZ) + iY;
        return new o("WXXX", str, P(bArr, iV, Z(bArr, iV), StandardCharsets.ISO_8859_1));
    }

    public static int V(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static Charset W(int i) {
        if (i == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i != 2) {
            return i != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8;
        }
        return StandardCharsets.UTF_16BE;
    }

    public static String X(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static int Y(byte[] bArr, int i, int i2) {
        int iZ = Z(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return iZ;
        }
        while (iZ < bArr.length - 1) {
            if ((iZ - i) % 2 == 0 && bArr[iZ + 1] == 0) {
                return iZ;
            }
            iZ = Z(bArr, iZ + 1);
        }
        return bArr.length;
    }

    public static int Z(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static int a0(int i, w wVar) {
        byte[] bArr = wVar.a;
        int i2 = wVar.b;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007a A[PHI: r3
  0x007a: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0087, B:33:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    public static boolean b0(w wVar, int i, int i2, boolean z) {
        int iC;
        long jC;
        int iG;
        int i3;
        int i4 = wVar.b;
        while (true) {
            try {
                boolean z2 = true;
                if (wVar.a() < i2) {
                    wVar.M(i4);
                    return true;
                }
                if (i >= 3) {
                    iC = wVar.m();
                    jC = wVar.B();
                    iG = wVar.G();
                } else {
                    iC = wVar.C();
                    jC = wVar.C();
                    iG = 0;
                }
                if (iC == 0 && jC == 0 && iG == 0) {
                    wVar.M(i4);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & jC) != 0) {
                        wVar.M(i4);
                        return false;
                    }
                    jC = (((jC >> 24) & 255) << 21) | (jC & 255) | (((jC >> 8) & 255) << 7) | (((jC >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i3 = (iG & 64) != 0 ? 1 : 0;
                    if ((iG & 1) == 0) {
                        z2 = false;
                    }
                } else if (i == 3) {
                    i3 = (iG & 32) != 0 ? 1 : 0;
                    if ((iG & 128) == 0) {
                        z2 = false;
                    }
                } else {
                    i3 = 0;
                    z2 = false;
                }
                if (z2) {
                    i3 += 4;
                }
                if (jC < i3) {
                    wVar.M(i4);
                    return false;
                }
                if (wVar.a() < jC) {
                    wVar.M(i4);
                    return false;
                }
                wVar.N((int) jC);
            } catch (Throwable th) {
                wVar.M(i4);
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c7 A[SYNTHETIC] */
    public final androidx.media3.common.h0 G(byte[] bArr, int i) {
        boolean z;
        g gVar;
        int i2;
        int i3;
        int iA0;
        i iVarL;
        ArrayList arrayList = new ArrayList();
        w wVar = new w(bArr, i);
        boolean z2 = false;
        if (wVar.a() < 10) {
            androidx.media3.common.util.c.t("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iC = wVar.C();
            if (iC == 4801587) {
                int iZ = wVar.z();
                wVar.N(1);
                int iZ2 = wVar.z();
                int iY = wVar.y();
                if (iZ != 2) {
                    if (iZ == 3) {
                        if ((iZ2 & 64) != 0) {
                            int iM = wVar.m();
                            wVar.N(iM);
                            iY -= iM + 4;
                        }
                    } else if (iZ == 4) {
                        if ((iZ2 & 64) != 0) {
                            int iY2 = wVar.y();
                            wVar.N(iY2 - 4);
                            iY -= iY2;
                        }
                        if ((iZ2 & 16) != 0) {
                            iY -= 10;
                        }
                    } else {
                        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.w("Skipped ID3 tag with unsupported majorVersion=", iZ, "Id3Decoder");
                    }
                    if (iZ < 4) {
                        z = false;
                    } else {
                        z = false;
                    }
                    gVar = new g(iZ, iY, z);
                } else if ((iZ2 & 64) != 0) {
                    androidx.media3.common.util.c.t("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                } else {
                    if (iZ < 4 || (iZ2 & 128) == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    gVar = new g(iZ, iY, z);
                }
                if (gVar == null) {
                    return null;
                }
                i2 = gVar.a;
                int i4 = wVar.b;
                i3 = i2 == 2 ? 6 : 10;
                iA0 = gVar.c;
                if (gVar.b) {
                    iA0 = a0(iA0, wVar);
                }
                wVar.L(i4 + iA0);
                if (!b0(wVar, i2, i3, false)) {
                    if (i2 == 4 || !b0(wVar, 4, i3, true)) {
                        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.w("Failed to validate ID3 tag with majorVersion=", i2, "Id3Decoder");
                        return null;
                    }
                    z2 = true;
                }
                while (wVar.a() >= i3) {
                    iVarL = L(i2, wVar, z2, i3, this.p);
                    if (iVarL != null) {
                        arrayList.add(iVarL);
                    }
                }
                return new androidx.media3.common.h0(arrayList);
            }
            androidx.media3.common.util.c.t("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iC))));
        }
        gVar = null;
        if (gVar == null) {
            return null;
        }
        i2 = gVar.a;
        int i5 = wVar.b;
        if (i2 == 2) {
        }
        iA0 = gVar.c;
        if (gVar.b) {
            iA0 = a0(iA0, wVar);
        }
        wVar.L(i5 + iA0);
        if (!b0(wVar, i2, i3, false)) {
            if (i2 == 4) {
            }
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.w("Failed to validate ID3 tag with majorVersion=", i2, "Id3Decoder");
            return null;
        }
        while (wVar.a() >= i3) {
            iVarL = L(i2, wVar, z2, i3, this.p);
            if (iVarL != null) {
                arrayList.add(iVarL);
            }
        }
        return new androidx.media3.common.h0(arrayList);
    }

    @Override // com.google.android.gms.dynamite.g
    public final androidx.media3.common.h0 j(androidx.media3.extractor.metadata.a aVar, ByteBuffer byteBuffer) {
        return G(byteBuffer.array(), byteBuffer.limit());
    }
}
