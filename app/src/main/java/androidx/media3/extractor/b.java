package androidx.media3.extractor;

import android.util.Base64;
import androidx.media3.common.util.j0;
import com.app.mlounge.emulator.LibretroCore;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final int[] a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final int[] c = {1, 2, 3, 6};
    public static final int[] d = {48000, 44100, 32000};
    public static final int[] e = {24000, 22050, 16000};
    public static final int[] f = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] g = {32, 40, 48, 56, 64, 80, 96, Token.ASSIGN_MOD, 128, 160, 192, LibretroCore.SCREEN_HEIGHT, LibretroCore.SCREEN_WIDTH, 320, 384, 448, 512, 576, 640};
    public static final int[] h = {69, 87, Token.ASSIGN_LOGICAL_AND, Token.DOT, Token.VOID, Token.DEBUGGER, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final int[] i = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, LibretroCore.PSP_SCREEN_WIDTH, 400, 400, 2048};
    public static final int[] j = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] k = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] l = {64, Token.ASSIGN_MOD, 128, 192, LibretroCore.SCREEN_HEIGHT, LibretroCore.SCREEN_WIDTH, 384, 448, 512, 640, 768, 896, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final int[] m = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    public static final int[] n = {5, 8, 10, 12};
    public static final int[] o = {6, 9, 12, 15};
    public static final int[] p = {2, 4, 6, 8};
    public static final int[] q = {9, 11, 13, 16};
    public static final int[] r = {5, 8, 10, 12};
    public static final String[] s = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] t = {44100, 48000, 32000};
    public static final int[] u = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] v = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] w = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] x = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] y = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static boolean a(androidx.media3.common.util.w wVar, t tVar, int i2, r rVar) {
        long jB = wVar.B();
        long j2 = jB >>> 16;
        if (j2 != i2) {
            return false;
        }
        boolean z = (j2 & 1) == 1;
        int i3 = (int) ((jB >> 12) & 15);
        int i4 = (int) ((jB >> 8) & 15);
        int i5 = (int) ((jB >> 4) & 15);
        int i6 = (int) ((jB >> 1) & 7);
        boolean z2 = (jB & 1) == 1;
        if (i5 <= 7) {
            if (i5 != tVar.g - 1) {
                return false;
            }
        } else if (i5 > 10 || tVar.g != 2) {
            return false;
        }
        if (!(i6 == 0 || i6 == tVar.i) || z2) {
            return false;
        }
        try {
            long jH = wVar.H();
            if (!z) {
                jH *= (long) tVar.b;
            }
            long j3 = tVar.j;
            if (j3 != 0 && jH > j3) {
                return false;
            }
            rVar.a = jH;
            int iS = s(i3, wVar);
            long j4 = tVar.j;
            boolean z3 = j4 == 0 || jH + ((long) iS) >= j4;
            if (iS == -1) {
                return false;
            }
            if ((!z3 && iS < tVar.a) || iS > tVar.b) {
                return false;
            }
            int i7 = tVar.e;
            if (i4 != 0) {
                if (i4 <= 11) {
                    if (i4 != tVar.f) {
                        return false;
                    }
                } else if (i4 != 12) {
                    if (i4 > 14) {
                        return false;
                    }
                    int iG = wVar.G();
                    if (i4 == 14) {
                        iG *= 10;
                    }
                    if (iG != i7) {
                        return false;
                    }
                } else if (wVar.z() * 1000 != i7) {
                    return false;
                }
            }
            int iZ = wVar.z();
            int i8 = wVar.b;
            byte[] bArr = wVar.a;
            int i9 = i8 - 1;
            int i10 = 0;
            for (int i11 = wVar.b; i11 < i9; i11++) {
                i10 = j0.m[i10 ^ (bArr[i11] & 255)];
            }
            String str = j0.a;
            if (iZ != i10) {
                return false;
            }
            if (wVar.a() != 0) {
                int iJ = wVar.j();
                if ((iJ & 128) != 0) {
                    return false;
                }
                int i12 = (iJ & Token.ELSE) >> 1;
                if ((i12 >= 2 && i12 <= 7) || (i12 >= 13 && i12 <= 31)) {
                    androidx.media3.common.util.c.k("FlacFrameReader", "Ignoring frame where first subframe has a reserved type: " + i12);
                    return false;
                }
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static void b(String str, boolean z) throws androidx.media3.common.j0 {
        if (!z) {
            throw androidx.media3.common.j0.a(null, str);
        }
    }

    public static void c(long j2, androidx.media3.common.util.w wVar, h0[] h0VarArr) {
        int i2;
        int iZ;
        while (true) {
            if (wVar.a() <= 1) {
                return;
            }
            int i3 = 0;
            while (true) {
                if (wVar.a() == 0) {
                    i2 = -1;
                    break;
                }
                int iZ2 = wVar.z();
                i3 += iZ2;
                if (iZ2 != 255) {
                    i2 = i3;
                    break;
                }
            }
            int i4 = 0;
            do {
                if (wVar.a() == 0) {
                    i4 = -1;
                    break;
                } else {
                    iZ = wVar.z();
                    i4 += iZ;
                }
            } while (iZ == 255);
            int i5 = wVar.b + i4;
            if (i4 == -1 || i4 > wVar.a()) {
                androidx.media3.common.util.c.t("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i5 = wVar.c;
            } else if (i2 == 4 && i4 >= 8) {
                int iZ3 = wVar.z();
                int iG = wVar.G();
                int iM = iG == 49 ? wVar.m() : 0;
                int iZ4 = wVar.z();
                if (iG == 47) {
                    wVar.N(1);
                }
                boolean z = iZ3 == 181 && (iG == 49 || iG == 47) && iZ4 == 3;
                if (iG == 49) {
                    z &= iM == 1195456820;
                }
                if (z) {
                    d(j2, wVar, h0VarArr);
                }
            }
            wVar.M(i5);
        }
    }

    public static void d(long j2, androidx.media3.common.util.w wVar, h0[] h0VarArr) {
        int iZ = wVar.z();
        if ((iZ & 64) != 0) {
            wVar.N(1);
            int i2 = (iZ & 31) * 3;
            int i3 = wVar.b;
            for (h0 h0Var : h0VarArr) {
                wVar.M(i3);
                h0Var.f(i2, wVar);
                com.google.android.material.motion.a.q(j2 != -9223372036854775807L);
                h0Var.g(j2, 1, i2, 0, null);
            }
        }
    }

    public static int e(int i2, int i3) {
        int i4 = i3 / 2;
        if (i2 < 0 || i2 >= 3 || i3 < 0 || i4 >= 19) {
            return -1;
        }
        int i5 = d[i2];
        if (i5 == 44100) {
            return ((i3 % 2) + h[i4]) * 2;
        }
        int i6 = g[i4];
        return i5 == 32000 ? i6 * 6 : i6 * 4;
    }

    public static void f(int i2, androidx.media3.common.util.w wVar) {
        wVar.J(7);
        byte[] bArr = wVar.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i2 >> 16) & 255);
        bArr[5] = (byte) ((i2 >> 8) & 255);
        bArr[6] = (byte) (i2 & 255);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    public static int g(byte[] bArr) {
        int i2;
        byte b2;
        int i3;
        int i4;
        byte b3;
        boolean z = false;
        byte b4 = bArr[0];
        if (b4 != -2) {
            if (b4 == -1) {
                i4 = ((bArr[7] & 3) << 12) | ((bArr[6] & 255) << 4);
                b3 = bArr[9];
            } else if (b4 != 31) {
                i2 = ((bArr[5] & 3) << 12) | ((bArr[6] & 255) << 4);
                b2 = bArr[7];
            } else {
                i4 = ((bArr[6] & 3) << 12) | ((bArr[7] & 255) << 4);
                b3 = bArr[8];
            }
            i3 = (((b3 & 60) >> 2) | i4) + 1;
            z = true;
            if (z) {
                return (i3 * 16) / 14;
            }
            return i3;
        }
        i2 = ((bArr[4] & 3) << 12) | ((bArr[7] & 255) << 4);
        b2 = bArr[6];
        i3 = (((b2 & 240) >> 4) | i2) + 1;
        if (z) {
            return (i3 * 16) / 14;
        }
        return i3;
    }

    public static int h(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if ((i2 & (-2097152)) != -2097152 || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i8 = t[i6];
        if (i3 == 2) {
            i8 /= 2;
        } else if (i3 == 0) {
            i8 /= 4;
        }
        int i9 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? u[i5 - 1] : v[i5 - 1]) * 12) / i8) + i9) * 4;
        }
        if (i3 == 3) {
            i7 = i4 == 2 ? w[i5 - 1] : x[i5 - 1];
        } else {
            i7 = y[i5 - 1];
        }
        int i10 = Token.LABEL;
        if (i3 == 3) {
            return ((i7 * Token.LABEL) / i8) + i9;
        }
        if (i4 == 1) {
            i10 = 72;
        }
        return ((i10 * i7) / i8) + i9;
    }

    public static int i(int i2) {
        if (i2 == 2147385345 || i2 == -25230976 || i2 == 536864768 || i2 == -14745368) {
            return 1;
        }
        if (i2 == 1683496997 || i2 == 622876772) {
            return 2;
        }
        if (i2 == 1078008818 || i2 == -233094848) {
            return 3;
        }
        return (i2 == 1908687592 || i2 == -398277519) ? 4 : 0;
    }

    public static int j(int i2) {
        if (i2 == 20) {
            return 63750;
        }
        if (i2 == 30) {
            return 2250000;
        }
        switch (i2) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i2) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }

    public static androidx.media3.common.util.v k(byte[] bArr) {
        byte[] bArr2;
        byte b2 = bArr[0];
        if (b2 == 127 || b2 == 100 || b2 == 64 || b2 == 113) {
            return new androidx.media3.common.util.v(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b3 = bArrCopyOf[0];
        if (b3 == -2 || b3 == -1 || b3 == 37 || b3 == -14 || b3 == -24) {
            for (int i2 = 0; i2 < bArrCopyOf.length - 1; i2 += 2) {
                byte b4 = bArrCopyOf[i2];
                int i3 = i2 + 1;
                bArrCopyOf[i2] = bArrCopyOf[i3];
                bArrCopyOf[i3] = b4;
            }
        }
        androidx.media3.common.util.v vVar = new androidx.media3.common.util.v(bArrCopyOf, bArrCopyOf.length);
        if (bArrCopyOf[0] == 31) {
            androidx.media3.common.util.v vVar2 = new androidx.media3.common.util.v(bArrCopyOf, bArrCopyOf.length);
            while (vVar2.b() >= 16) {
                vVar2.o(2);
                int iG = vVar2.g(14) & 16383;
                int iMin = Math.min(8 - vVar.d, 14);
                int i4 = vVar.d;
                int i5 = (8 - i4) - iMin;
                byte[] bArr3 = vVar.b;
                int i6 = vVar.c;
                byte b5 = (byte) (((65280 >> i4) | ((1 << i5) - 1)) & bArr3[i6]);
                bArr3[i6] = b5;
                int i7 = 14 - iMin;
                bArr3[i6] = (byte) (b5 | ((iG >>> i7) << i5));
                int i8 = i6 + 1;
                while (true) {
                    bArr2 = vVar.b;
                    if (i7 > 8) {
                        bArr2[i8] = (byte) (iG >>> (i7 - 8));
                        i7 -= 8;
                        i8++;
                    }
                }
                int i9 = 8 - i7;
                byte b6 = (byte) (bArr2[i8] & ((1 << i9) - 1));
                bArr2[i8] = b6;
                bArr2[i8] = (byte) (((iG & ((1 << i7) - 1)) << i9) | b6);
                vVar.o(14);
                vVar.a();
            }
        }
        vVar.l(bArrCopyOf, bArrCopyOf.length);
        return vVar;
    }

    public static int l(androidx.media3.common.util.v vVar) throws androidx.media3.common.j0 {
        int iG = vVar.g(4);
        if (iG == 15) {
            if (vVar.b() >= 24) {
                return vVar.g(24);
            }
            throw androidx.media3.common.j0.a(null, "AAC header insufficient data");
        }
        if (iG < 13) {
            return a[iG];
        }
        throw androidx.media3.common.j0.a(null, "AAC header wrong Sampling Frequency Index");
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0090  */
    public static androidx.media3.container.j m(androidx.media3.common.util.v vVar) {
        int i2;
        int i3;
        int iG = vVar.g(16);
        int iG2 = vVar.g(16);
        if (iG2 == 65535) {
            iG2 = vVar.g(24);
            i2 = 7;
        } else {
            i2 = 4;
        }
        int i4 = iG2 + i2;
        if (iG == 44097) {
            i4 += 2;
        }
        if (vVar.g(2) == 3) {
            do {
                vVar.g(2);
            } while (vVar.f());
        }
        int iG3 = vVar.g(10);
        if (vVar.f() && vVar.g(3) > 0) {
            vVar.o(2);
        }
        int i5 = vVar.f() ? 48000 : 44100;
        int iG4 = vVar.g(4);
        int[] iArr = i;
        if (i5 == 44100 && iG4 == 13) {
            i3 = iArr[iG4];
        } else if (i5 != 48000 || iG4 >= 14) {
            i3 = 0;
        } else {
            int i6 = iArr[iG4];
            int i7 = iG3 % 5;
            if (i7 == 1) {
                if (iG4 != 3 || iG4 == 8) {
                    i3 = i6 + 1;
                } else {
                    i3 = i6;
                }
            } else if (i7 != 2) {
                if (i7 == 3) {
                    if (iG4 != 3) {
                    }
                    i3 = i6 + 1;
                } else if (i7 == 4 && (iG4 == 3 || iG4 == 8 || iG4 == 11)) {
                    i3 = i6 + 1;
                } else {
                    i3 = i6;
                }
            } else if (iG4 == 8 || iG4 == 11) {
                i3 = i6 + 1;
            } else {
                i3 = i6;
            }
        }
        return new androidx.media3.container.j(i5, i4, i3);
    }

    public static a n(androidx.media3.common.util.v vVar, boolean z) throws androidx.media3.common.j0 {
        int iG = vVar.g(5);
        if (iG == 31) {
            iG = vVar.g(6) + 32;
        }
        int iL = l(vVar);
        int iG2 = vVar.g(4);
        String strL = androidx.privacysandbox.ads.adservices.java.internal.a.l(iG, "mp4a.40.");
        if (iG == 5 || iG == 29) {
            iL = l(vVar);
            int iG3 = vVar.g(5);
            if (iG3 == 31) {
                iG3 = vVar.g(6) + 32;
            }
            iG = iG3;
            if (iG == 22) {
                iG2 = vVar.g(4);
            }
        }
        if (z) {
            if (iG != 1 && iG != 2 && iG != 3 && iG != 4 && iG != 6 && iG != 7 && iG != 17) {
                switch (iG) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw androidx.media3.common.j0.c("Unsupported audio object type: " + iG);
                }
            }
            if (vVar.f()) {
                androidx.media3.common.util.c.t("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (vVar.f()) {
                vVar.o(14);
            }
            boolean zF = vVar.f();
            if (iG2 == 0) {
                androidx.transition.k.n();
                return null;
            }
            if (iG == 6 || iG == 20) {
                vVar.o(3);
            }
            if (zF) {
                if (iG == 22) {
                    vVar.o(16);
                }
                if (iG == 17 || iG == 19 || iG == 20 || iG == 23) {
                    vVar.o(3);
                }
                vVar.o(1);
            }
            switch (iG) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iG4 = vVar.g(2);
                    if (iG4 == 2 || iG4 == 3) {
                        throw androidx.media3.common.j0.c("Unsupported epConfig: " + iG4);
                    }
                    break;
            }
        }
        int i2 = b[iG2];
        if (i2 != -1) {
            return new a(iL, i2, strL);
        }
        throw androidx.media3.common.j0.a(null, null);
    }

    public static void o(androidx.media3.common.util.v vVar, c cVar) throws androidx.media3.common.j0 {
        int iG = vVar.g(5);
        vVar.o(2);
        if (vVar.f()) {
            vVar.o(5);
        }
        if (iG >= 7 && iG <= 10) {
            vVar.n();
        }
        if (vVar.f()) {
            int iG2 = vVar.g(3);
            if (cVar.b == -1 && iG >= 0 && iG <= 15 && (iG2 == 0 || iG2 == 1)) {
                cVar.b = iG;
            }
            if (vVar.f()) {
                v(vVar);
            }
        }
    }

    public static void p(androidx.media3.common.util.v vVar, c cVar) throws androidx.media3.common.j0 {
        vVar.o(2);
        boolean zF = vVar.f();
        int iG = vVar.g(8);
        for (int i2 = 0; i2 < iG; i2++) {
            vVar.o(2);
            if (vVar.f()) {
                vVar.o(5);
            }
            if (zF) {
                vVar.o(24);
            } else {
                if (vVar.f()) {
                    if (!vVar.f()) {
                        vVar.o(4);
                    }
                    cVar.c = vVar.g(6) + 1;
                }
                vVar.o(4);
            }
        }
        if (vVar.f()) {
            vVar.o(3);
            if (vVar.f()) {
                v(vVar);
            }
        }
    }

    public static int q(androidx.media3.common.util.v vVar, int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && vVar.f(); i3++) {
            i2++;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 += 1 << iArr[i5];
        }
        return vVar.g(iArr[i2]) + i4;
    }

    public static androidx.media3.common.h0 r(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = (String) list.get(i2);
            String str2 = j0.a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                androidx.media3.common.util.c.t("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(androidx.media3.extractor.metadata.flac.a.d(new androidx.media3.common.util.w(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e2) {
                    androidx.media3.common.util.c.u("VorbisUtil", "Failed to parse vorbis picture", e2);
                }
            } else {
                arrayList.add(new androidx.media3.extractor.metadata.vorbis.a(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new androidx.media3.common.h0(arrayList);
    }

    public static int s(int i2, androidx.media3.common.util.w wVar) {
        switch (i2) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i2 - 2);
            case 6:
                return wVar.z() + 1;
            case 7:
                return wVar.G() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return LibretroCore.SCREEN_WIDTH << (i2 - 8);
            default:
                return -1;
        }
    }

    public static androidx.media3.common.util.b t(androidx.media3.common.util.w wVar) {
        wVar.N(1);
        int iC = wVar.C();
        long j2 = ((long) wVar.b) + ((long) iC);
        int i2 = iC / 18;
        long[] jArrCopyOf = new long[i2];
        long[] jArrCopyOf2 = new long[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            long jT = wVar.t();
            if (jT == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i3);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i3);
                break;
            }
            jArrCopyOf[i3] = jT;
            jArrCopyOf2[i3] = wVar.t();
            wVar.N(2);
        }
        wVar.N((int) (j2 - ((long) wVar.b)));
        return new androidx.media3.common.util.b(16, jArrCopyOf, jArrCopyOf2);
    }

    public static androidx.media3.exoplayer.dash.manifest.t u(androidx.media3.common.util.w wVar, boolean z, boolean z2) throws androidx.media3.common.j0 {
        if (z) {
            w(3, wVar, false);
        }
        wVar.x((int) wVar.q(), StandardCharsets.UTF_8);
        long jQ = wVar.q();
        String[] strArr = new String[(int) jQ];
        for (int i2 = 0; i2 < jQ; i2++) {
            strArr[i2] = wVar.x((int) wVar.q(), StandardCharsets.UTF_8);
        }
        if (z2 && (wVar.z() & 1) == 0) {
            throw androidx.media3.common.j0.a(null, "framing bit expected to be set");
        }
        return new androidx.media3.exoplayer.dash.manifest.t(strArr, 6);
    }

    public static void v(androidx.media3.common.util.v vVar) throws androidx.media3.common.j0 {
        int iG = vVar.g(6);
        if (iG < 2 || iG > 42) {
            throw androidx.media3.common.j0.c(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iG)));
        }
        vVar.o(iG * 8);
    }

    public static boolean w(int i2, androidx.media3.common.util.w wVar, boolean z) throws androidx.media3.common.j0 {
        if (wVar.a() < 7) {
            if (z) {
                return false;
            }
            throw androidx.media3.common.j0.a(null, "too short header: " + wVar.a());
        }
        if (wVar.z() != i2) {
            if (z) {
                return false;
            }
            throw androidx.media3.common.j0.a(null, "expected header type " + Integer.toHexString(i2));
        }
        if (wVar.z() == 118 && wVar.z() == 111 && wVar.z() == 114 && wVar.z() == 98 && wVar.z() == 105 && wVar.z() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw androidx.media3.common.j0.a(null, "expected characters 'vorbis'");
    }
}
