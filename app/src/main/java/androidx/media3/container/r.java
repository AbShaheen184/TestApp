package androidx.media3.container;

import androidx.compose.animation.core.t2;
import com.app.mlounge.emulator.LibretroCore;
import com.google.common.collect.a1;
import com.google.common.collect.d0;
import com.google.common.collect.h0;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static final byte[] a = {0, 0, 0, 1};
    public static final float[] b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object c = new Object();
    public static int[] d = new int[10];

    public static ArrayList a(byte[] bArr) {
        long j = (((long) (((bArr[11] & 255) << 8) | (bArr[10] & 255))) * 1000000000) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static void b(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int c(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        com.google.android.material.motion.a.q(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            b(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            b(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            b(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b2 = bArr[i5];
            if ((b2 & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b2 == 1) {
                    b(zArr);
                    return i6;
                }
                i5 -= 2;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    public static String d(androidx.media3.common.r rVar) {
        String str = rVar.o;
        String str2 = rVar.k;
        if (Objects.equals(str, "video/dolby-vision") && str2 != null) {
            if (str2.startsWith("dva1") || str2.startsWith("dvav")) {
                return "video/avc";
            }
            if (str2.startsWith("dvh1") || str2.startsWith("dvhe")) {
                return "video/hevc";
            }
        }
        return rVar.o;
    }

    public static long e(byte b2, byte b3) {
        int i;
        int i2;
        int i3 = b2 & 255;
        int i4 = b2 & 3;
        if (i4 != 0) {
            i = 2;
            if (i4 != 1 && i4 != 2) {
                i = b3 & 63;
            }
        } else {
            i = 1;
        }
        int i5 = i3 >> 3;
        int i6 = i5 & 3;
        if (i5 >= 16) {
            i2 = 2500 << i6;
        } else if (i5 >= 12) {
            i2 = 10000 << (i5 & 1);
        } else {
            i2 = i6 == 3 ? 60000 : 10000 << i6;
        }
        return ((long) i) * ((long) i2);
    }

    public static boolean f(byte[] bArr, int i, androidx.media3.common.r rVar) {
        int i2;
        if (Objects.equals(rVar.o, "video/avc")) {
            byte b2 = bArr[4];
            if (((b2 & 96) >> 5) == 0 && ((i2 = b2 & 31) == 1 || i2 == 9 || i2 == 14)) {
                return false;
            }
        } else if (Objects.equals(rVar.o, "video/hevc")) {
            j jVarH = h(new v(bArr, 4, i + 4));
            int i3 = jVarH.a;
            if (i3 == 35) {
                return false;
            }
            if (i3 <= 14 && i3 % 2 == 0 && jVarH.c == rVar.F - 1) {
                return false;
            }
        }
        return true;
    }

    public static int g(androidx.media3.common.r rVar) {
        String strD = d(rVar);
        if (Objects.equals(strD, "video/avc")) {
            return 1;
        }
        return (Objects.equals(strD, "video/hevc") || Objects.equals(strD, "video/vvc")) ? 2 : 0;
    }

    public static j h(v vVar) {
        vVar.i();
        return new j(vVar.e(6), vVar.e(6), vVar.e(3) - 1);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e A[SYNTHETIC] */
    public static k i(v vVar, boolean z, int i, k kVar) {
        int[] iArr;
        int i2;
        boolean z2;
        int i3;
        int i4;
        boolean zD;
        int iE;
        int i5;
        int i6;
        int[] iArr2 = new int[6];
        if (!z) {
            if (kVar != null) {
                int i7 = kVar.a;
                zD = kVar.b;
                iE = kVar.c;
                i5 = kVar.d;
                iArr2 = kVar.e;
                i2 = i7;
            } else {
                iArr = iArr2;
                i2 = 0;
                z2 = false;
                i3 = 0;
                i4 = 0;
            }
            int iE2 = vVar.e(8);
            i6 = 0;
            for (int i8 = 0; i8 < i; i8++) {
                if (vVar.d()) {
                    i6 += 88;
                }
                if (vVar.d()) {
                    i6 += 8;
                }
            }
            vVar.j(i6);
            if (i > 0) {
                vVar.j((8 - i) * 2);
            }
            return new k(i2, z2, i3, i4, iArr, iE2);
        }
        int iE3 = vVar.e(2);
        zD = vVar.d();
        iE = vVar.e(5);
        i5 = 0;
        for (int i9 = 0; i9 < 32; i9++) {
            if (vVar.d()) {
                i5 |= 1 << i9;
            }
        }
        for (int i10 = 0; i10 < 6; i10++) {
            iArr2[i10] = vVar.e(8);
        }
        i2 = iE3;
        iArr = iArr2;
        z2 = zD;
        i3 = iE;
        i4 = i5;
        int iE4 = vVar.e(8);
        i6 = 0;
        while (i8 < i) {
            if (vVar.d()) {
                i6 += 88;
            }
            if (vVar.d()) {
                i6 += 8;
            }
        }
        vVar.j(i6);
        if (i > 0) {
            vVar.j((8 - i) * 2);
        }
        return new k(i2, z2, i3, i4, iArr, iE4);
    }

    public static t2 j(byte[] bArr, int i, int i2) {
        byte b2;
        int i3 = i + 2;
        do {
            i2--;
            b2 = bArr[i2];
            if (b2 != 0) {
                break;
            }
        } while (i2 > i3);
        if (b2 == 0 || i2 <= i3) {
            return null;
        }
        v vVar = new v(bArr, i3, i2 + 1);
        while (vVar.b(16)) {
            int iE = vVar.e(8);
            int i4 = 0;
            while (iE == 255) {
                i4 += 255;
                iE = vVar.e(8);
            }
            int i5 = i4 + iE;
            int iE2 = vVar.e(8);
            int i6 = 0;
            while (iE2 == 255) {
                i6 += 255;
                iE2 = vVar.e(8);
            }
            int i7 = i6 + iE2;
            if (i7 == 0 || !vVar.b(i7)) {
                return null;
            }
            if (i5 == 176) {
                int iF = vVar.f();
                boolean zD = vVar.d();
                int iF2 = zD ? vVar.f() : 0;
                int iF3 = vVar.f();
                int iF4 = -1;
                for (int i8 = 0; i8 <= iF3; i8++) {
                    iF4 = vVar.f();
                    vVar.f();
                    int iE3 = vVar.e(6);
                    if (iE3 == 63) {
                        return null;
                    }
                    vVar.e(iE3 == 0 ? Math.max(0, iF - 30) : Math.max(0, (iE3 + iF) - 31));
                    if (zD) {
                        int iE4 = vVar.e(6);
                        if (iE4 == 63) {
                            return null;
                        }
                        vVar.e(iE4 == 0 ? Math.max(0, iF2 - 30) : Math.max(0, (iE4 + iF2) - 31));
                    }
                    if (vVar.d()) {
                        vVar.j(10);
                    }
                }
                return new t2(iF4);
            }
            vVar.j(i7 * 8);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004a  */
    /* JADX WARN: Code duplicated, block: B:202:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b1  */
    public static n k(byte[] bArr, int i, int i2, com.google.firebase.messaging.o oVar) {
        int i3;
        int i4;
        int i5;
        int i6;
        int iF;
        int i7;
        int iF2;
        int i8;
        int i9;
        int iMax;
        int i10;
        int i11;
        int i12;
        int iF3;
        int iG;
        int i13;
        l lVar;
        l lVar2;
        j jVarH = h(new v(bArr, i, i2));
        v vVar = new v(bArr, i + 2, i2);
        int i14 = 4;
        vVar.j(4);
        int iE = vVar.e(3);
        int i15 = jVarH.b;
        boolean z = i15 != 0 && iE == 7;
        if (oVar != null) {
            h0 h0Var = (h0) oVar.y;
            if (h0Var.isEmpty()) {
                i3 = 0;
            } else {
                i3 = ((i) h0Var.get(Math.min(i15, h0Var.size() - 1))).a;
            }
        } else {
            i3 = 0;
        }
        k kVarI = null;
        if (!z) {
            vVar.i();
            kVarI = i(vVar, true, iE, null);
        } else if (oVar != null) {
            l lVar3 = (l) oVar.z;
            int[] iArr = lVar3.b;
            h0 h0Var2 = lVar3.a;
            int i16 = iArr[i3];
            if (h0Var2.size() > i16) {
                kVarI = (k) h0Var2.get(i16);
            }
        }
        vVar.f();
        if (z) {
            int iE2 = vVar.d() ? vVar.e(8) : -1;
            if (oVar == null || (lVar2 = (l) oVar.A) == null) {
                iF = 0;
                iF2 = 0;
                i7 = 0;
                i9 = 0;
                i6 = 0;
                i8 = 0;
            } else {
                h0 h0Var3 = lVar2.a;
                if (iE2 == -1) {
                    iE2 = lVar2.b[i3];
                }
                if (iE2 == -1 || h0Var3.size() <= iE2) {
                    iF = 0;
                    iF2 = 0;
                    i7 = 0;
                    i9 = 0;
                    i6 = 0;
                    i8 = 0;
                } else {
                    m mVar = (m) h0Var3.get(iE2);
                    int i17 = mVar.a;
                    i7 = mVar.d;
                    int i18 = mVar.e;
                    iF = mVar.b;
                    iF2 = mVar.c;
                    i6 = i18;
                    i8 = i6;
                    i9 = i7;
                }
            }
        } else {
            int iF4 = vVar.f();
            if (iF4 == 3) {
                vVar.i();
            }
            int iF5 = vVar.f();
            int iF6 = vVar.f();
            if (vVar.d()) {
                int iF7 = vVar.f();
                int iF8 = vVar.f();
                int iF9 = vVar.f();
                int iF10 = vVar.f();
                i4 = iF5 - ((iF7 + iF8) * ((iF4 == 1 || iF4 == 2) ? 2 : 1));
                i5 = iF6 - ((iF9 + iF10) * (iF4 == 1 ? 2 : 1));
            } else {
                i4 = iF5;
                i5 = iF6;
            }
            i6 = i5;
            iF = vVar.f();
            i7 = i4;
            iF2 = vVar.f();
            i8 = iF6;
            i9 = iF5;
        }
        int iF11 = vVar.f();
        if (z) {
            iMax = -1;
        } else {
            iMax = -1;
            for (int i19 = vVar.d() ? 0 : iE; i19 <= iE; i19++) {
                vVar.f();
                iMax = Math.max(vVar.f(), iMax);
                vVar.f();
            }
        }
        vVar.f();
        vVar.f();
        vVar.f();
        vVar.f();
        vVar.f();
        vVar.f();
        if (vVar.d()) {
            int i20 = 6;
            if (z ? vVar.d() : false) {
                vVar.j(6);
            } else if (vVar.d()) {
                int i21 = 0;
                while (i21 < i14) {
                    int i22 = 0;
                    while (i22 < i20) {
                        if (vVar.d()) {
                            int iMin = Math.min(64, 1 << ((i21 << 1) + 4));
                            if (i21 > 1) {
                                vVar.g();
                            }
                            for (int i23 = 0; i23 < iMin; i23++) {
                                vVar.g();
                            }
                        } else {
                            vVar.f();
                        }
                        i22 += i21 == 3 ? 3 : 1;
                        i20 = 6;
                    }
                    i21++;
                    i14 = 4;
                    i20 = 6;
                }
            }
        }
        vVar.j(2);
        if (vVar.d()) {
            vVar.j(8);
            vVar.f();
            vVar.f();
            vVar.i();
        }
        int iF12 = vVar.f();
        int[] iArr2 = new int[0];
        int[] iArrCopyOf = new int[0];
        int i24 = 0;
        int iF13 = -1;
        int i25 = -1;
        while (i24 < iF12) {
            if (i24 == 0 || !vVar.d()) {
                int iF14 = vVar.f();
                iF13 = vVar.f();
                int[] iArr3 = new int[iF14];
                int i26 = 0;
                while (i26 < iF14) {
                    iArr3[i26] = (i26 > 0 ? iArr3[i26 - 1] : 0) - (vVar.f() + 1);
                    vVar.i();
                    i26++;
                }
                int[] iArr4 = new int[iF13];
                int i27 = 0;
                while (i27 < iF13) {
                    iArr4[i27] = vVar.f() + 1 + (i27 > 0 ? iArr4[i27 - 1] : 0);
                    vVar.i();
                    i27++;
                }
                i25 = iF14;
                iArr2 = iArr3;
                iArrCopyOf = iArr4;
            } else {
                int i28 = i25 + iF13;
                int iF15 = (1 - ((vVar.d() ? 1 : 0) * 2)) * (vVar.f() + 1);
                int i29 = i28 + 1;
                boolean[] zArr = new boolean[i29];
                for (int i30 = 0; i30 <= i28; i30++) {
                    if (vVar.d()) {
                        zArr[i30] = true;
                    } else {
                        zArr[i30] = vVar.d();
                    }
                }
                int[] iArr5 = new int[i29];
                int[] iArr6 = new int[i29];
                int i31 = 0;
                for (int i32 = iF13 - 1; i32 >= 0; i32--) {
                    int i33 = iArrCopyOf[i32] + iF15;
                    if (i33 < 0 && zArr[i25 + i32]) {
                        iArr5[i31] = i33;
                        i31++;
                    }
                }
                if (iF15 < 0 && zArr[i28]) {
                    iArr5[i31] = iF15;
                    i31++;
                }
                int i34 = i31;
                int[] iArr7 = iArr2;
                for (int i35 = 0; i35 < i25; i35++) {
                    int i36 = iArr7[i35] + iF15;
                    if (i36 < 0 && zArr[i35]) {
                        iArr5[i34] = i36;
                        i34++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr5, i34);
                int i37 = 0;
                for (int i38 = i25 - 1; i38 >= 0; i38--) {
                    int i39 = iArr7[i38] + iF15;
                    if (i39 > 0 && zArr[i38]) {
                        iArr6[i37] = i39;
                        i37++;
                    }
                }
                if (iF15 > 0 && zArr[i28]) {
                    iArr6[i37] = iF15;
                    i37++;
                }
                int i40 = i34;
                int i41 = i37;
                for (int i42 = 0; i42 < iF13; i42++) {
                    int i43 = iArrCopyOf[i42] + iF15;
                    if (i43 > 0 && zArr[i25 + i42]) {
                        iArr6[i41] = i43;
                        i41++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr6, i41);
                iF13 = i41;
                i25 = i40;
                iArr2 = iArrCopyOf2;
            }
            i24++;
            iF12 = iF12;
            i3 = i3;
        }
        int i44 = i3;
        if (vVar.d()) {
            int iF16 = vVar.f();
            for (int i45 = 0; i45 < iF16; i45++) {
                vVar.j(iF11 + 5);
            }
        }
        vVar.j(2);
        float f = 1.0f;
        if (vVar.d()) {
            if (vVar.d()) {
                int iE3 = vVar.e(8);
                if (iE3 == 255) {
                    int iE4 = vVar.e(16);
                    int iE5 = vVar.e(16);
                    if (iE4 != 0 && iE5 != 0) {
                        f = iE4 / iE5;
                    }
                } else if (iE3 < 17) {
                    f = b[iE3];
                } else {
                    androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.w("Unexpected aspect_ratio_idc value: ", iE3, "NalUnitUtil");
                }
            }
            if (vVar.d()) {
                vVar.i();
            }
            if (vVar.d()) {
                vVar.j(3);
                i13 = vVar.d() ? 1 : 2;
                if (vVar.d()) {
                    int iE6 = vVar.e(8);
                    int iE7 = vVar.e(8);
                    vVar.j(8);
                    iF3 = androidx.media3.common.h.f(iE6);
                    iG = androidx.media3.common.h.g(iE7);
                } else {
                    iF3 = -1;
                    iG = -1;
                }
            } else if (oVar == null || (lVar = (l) oVar.B) == null) {
                iF3 = -1;
                iG = -1;
                i13 = -1;
            } else {
                h0 h0Var4 = lVar.a;
                int i46 = lVar.b[i44];
                if (h0Var4.size() > i46) {
                    o oVar2 = (o) h0Var4.get(i46);
                    int i47 = oVar2.a;
                    int i48 = oVar2.b;
                    iG = oVar2.c;
                    iF3 = i47;
                    i13 = i48;
                } else {
                    iF3 = -1;
                    iG = -1;
                    i13 = -1;
                }
            }
            if (vVar.d()) {
                vVar.f();
                vVar.f();
            }
            vVar.i();
            if (vVar.d()) {
                i6 *= 2;
            }
            i10 = iF3;
            i12 = iG;
            i11 = i13;
        } else {
            i10 = -1;
            i11 = -1;
            i12 = -1;
        }
        return new n(iE, kVarI, iF, iF2, i7, i6, i9, i8, f, iMax, i10, i11, i12);
    }

    /* JADX WARN: Code duplicated, block: B:475:0x015b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0118  */
    /* JADX WARN: Code duplicated, block: B:62:0x011e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0124  */
    /* JADX WARN: Code duplicated, block: B:65:0x012a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0130  */
    /* JADX WARN: Code duplicated, block: B:69:0x013d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0148  */
    /* JADX WARN: Code duplicated, block: B:74:0x014d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0155  */
    /* JADX WARN: Multi-variable type inference failed */
    public static com.google.firebase.messaging.o l(byte[] bArr, int i, int i2) {
        int[] iArr;
        l lVar;
        int iE;
        int iE2;
        int iE3;
        int i3;
        a1 a1Var;
        boolean[][] zArr;
        int i4;
        boolean[][] zArr2;
        int[] iArr2;
        int[] iArr3;
        boolean z;
        int i5;
        boolean zD;
        int i6;
        int i7;
        int i8;
        boolean zD2;
        boolean zD3;
        int iF;
        int i9;
        int i10;
        int i11;
        boolean z2;
        boolean z3;
        v vVar = new v(bArr, i, i2);
        h(vVar);
        vVar.j(4);
        boolean zD4 = vVar.d();
        boolean zD5 = vVar.d();
        int iE4 = vVar.e(6);
        int i12 = iE4 + 1;
        int iE5 = vVar.e(3);
        vVar.j(17);
        k kVarI = i(vVar, true, iE5, null);
        for (int i13 = vVar.d() ? 0 : iE5; i13 <= iE5; i13++) {
            vVar.f();
            vVar.f();
            vVar.f();
        }
        int iE6 = vVar.e(6);
        int iF2 = vVar.f() + 1;
        int i14 = 6;
        int i15 = 1;
        l lVar2 = new l(h0.s(kVarI), new int[1], 0);
        boolean z4 = i12 >= 2 && iF2 >= 2;
        boolean z5 = zD4 && zD5;
        int i16 = iE6 + 1;
        boolean z6 = i16 >= i12;
        if (!z4 || !z5 || !z6) {
            return new com.google.firebase.messaging.o(null, lVar2, null, null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr4 = (int[][]) Array.newInstance((Class<?>) cls, iF2, i16);
        int[] iArr5 = new int[iF2];
        int[] iArr6 = new int[iF2];
        iArr4[0][0] = 0;
        iArr5[0] = 1;
        iArr6[0] = 0;
        for (int i17 = 1; i17 < iF2; i17++) {
            int i18 = 0;
            for (int i19 = 0; i19 <= iE6; i19++) {
                if (vVar.d()) {
                    iArr4[i17][i18] = i19;
                    iArr6[i17] = i19;
                    i18++;
                }
                iArr5[i17] = i18;
            }
        }
        if (vVar.d()) {
            vVar.j(64);
            if (vVar.d()) {
                vVar.f();
            }
            int iF3 = vVar.f();
            int i20 = 0;
            while (i20 < iF3) {
                vVar.f();
                if (i20 == 0 || vVar.d()) {
                    boolean zD6 = vVar.d();
                    boolean zD7 = vVar.d();
                    z3 = zD6;
                    z2 = zD7;
                    if (zD6 || zD7) {
                        zD = vVar.d();
                        if (zD) {
                            vVar.j(19);
                        }
                        vVar.j(8);
                        if (zD) {
                            vVar.j(4);
                        }
                        vVar.j(15);
                        i7 = zD6;
                        i6 = zD7;
                    }
                    i8 = 0;
                    while (i8 <= iE5) {
                        zD2 = vVar.d();
                        if (!zD2) {
                            zD2 = vVar.d();
                        }
                        if (zD2) {
                            vVar.f();
                            zD3 = false;
                        } else {
                            zD3 = vVar.d();
                        }
                        if (zD3) {
                            iF = 0;
                        } else {
                            iF = vVar.f();
                        }
                        int[][] iArr7 = iArr4;
                        i9 = i7 + i6;
                        int[] iArr8 = iArr6;
                        i10 = 0;
                        while (i10 < i9) {
                            int i21 = i9;
                            for (i11 = 0; i11 <= iF; i11++) {
                                vVar.f();
                                vVar.f();
                                if (zD) {
                                    vVar.f();
                                    vVar.f();
                                }
                                vVar.i();
                            }
                            i10++;
                            i9 = i21;
                        }
                        i8++;
                        i20 = i20;
                        iArr4 = iArr7;
                        iArr6 = iArr8;
                    }
                    i20++;
                } else {
                    z3 = false;
                    z2 = false;
                }
                zD = false;
                i7 = z3;
                i6 = z2;
                i8 = 0;
                while (i8 <= iE5) {
                    zD2 = vVar.d();
                    if (!zD2) {
                        zD2 = vVar.d();
                    }
                    if (zD2) {
                        vVar.f();
                        zD3 = false;
                    } else {
                        zD3 = vVar.d();
                    }
                    if (zD3) {
                        iF = vVar.f();
                    } else {
                        iF = 0;
                    }
                    int[][] iArr9 = iArr4;
                    i9 = i7 + i6;
                    int[] iArr10 = iArr6;
                    i10 = 0;
                    while (i10 < i9) {
                        int i22 = i9;
                        while (i11 <= iF) {
                            vVar.f();
                            vVar.f();
                            if (zD) {
                                vVar.f();
                                vVar.f();
                            }
                            vVar.i();
                        }
                        i10++;
                        i9 = i22;
                    }
                    i8++;
                    i20 = i20;
                    iArr4 = iArr9;
                    iArr6 = iArr10;
                }
                i20++;
            }
        }
        int[][] iArr11 = iArr4;
        int[] iArr12 = iArr6;
        if (!vVar.d()) {
            return new com.google.firebase.messaging.o(null, lVar2, null, null);
        }
        int i23 = vVar.d;
        if (i23 > 0) {
            vVar.j(8 - i23);
        }
        k kVarI2 = i(vVar, false, iE5, kVarI);
        boolean zD8 = vVar.d();
        boolean[] zArr3 = new boolean[16];
        int i24 = 0;
        for (int i25 = 0; i25 < 16; i25++) {
            boolean zD9 = vVar.d();
            zArr3[i25] = zD9;
            if (zD9) {
                i24++;
            }
        }
        if (i24 == 0 || !zArr3[1]) {
            return new com.google.firebase.messaging.o(null, lVar2, null, null);
        }
        int[] iArr13 = new int[i24];
        for (int i26 = 0; i26 < i24 - (zD8 ? 1 : 0); i26++) {
            iArr13[i26] = vVar.e(3);
        }
        int[] iArr14 = new int[i24 + 1];
        if (zD8) {
            int i27 = 1;
            while (i27 < i24) {
                int[] iArr15 = iArr14;
                for (int i28 = 0; i28 < i27; i28++) {
                    iArr15[i27] = iArr13[i28] + 1 + iArr15[i27];
                }
                i27++;
                iArr14 = iArr15;
            }
            iArr = iArr14;
            iArr[i24] = 6;
        } else {
            iArr = iArr14;
        }
        int[][] iArr16 = (int[][]) Array.newInstance((Class<?>) cls, i12, i24);
        int[] iArr17 = new int[i12];
        iArr17[0] = 0;
        boolean zD10 = vVar.d();
        int i29 = 1;
        while (i29 < i12) {
            if (zD10) {
                i5 = i29;
                iArr17[i5] = vVar.e(i14);
            } else {
                i5 = i29;
                iArr17[i5] = i5;
            }
            if (zD8) {
                int i30 = 0;
                while (i30 < i24) {
                    int i31 = i30 + 1;
                    iArr16[i5][i30] = (iArr17[i5] & ((1 << iArr[i31]) - 1)) >> iArr[i30];
                    i30 = i31;
                }
            } else {
                int i32 = 0;
                while (i32 < i24) {
                    int i33 = i32;
                    iArr16[i5][i33] = vVar.e(iArr13[i32] + 1);
                    i32 = i33 + 1;
                }
            }
            i29 = i5 + 1;
            i14 = 6;
        }
        int[] iArr18 = new int[i16];
        int i34 = 1;
        int i35 = 0;
        while (i35 < i12) {
            iArr18[iArr17[i35]] = -1;
            int[] iArr19 = iArr18;
            int i36 = 0;
            int i37 = 0;
            while (i36 < 16) {
                if (zArr3[i36]) {
                    if (i36 == i15) {
                        iArr19[iArr17[i35]] = iArr16[i35][i37];
                    }
                    i37++;
                }
                i36++;
                i15 = 1;
            }
            if (i35 > 0) {
                int i38 = 0;
                while (true) {
                    if (i38 >= i35) {
                        z = true;
                        break;
                    }
                    int i39 = i38;
                    if (iArr19[iArr17[i35]] == iArr19[iArr17[i38]]) {
                        z = false;
                        break;
                    }
                    i38 = i39 + 1;
                }
                if (z) {
                    i34++;
                }
            }
            i35++;
            iArr18 = iArr19;
            i15 = 1;
        }
        int[] iArr20 = iArr18;
        int iE7 = vVar.e(4);
        if (i34 < 2 || iE7 == 0) {
            return new com.google.firebase.messaging.o(null, lVar2, null, null);
        }
        int[] iArr21 = new int[i34];
        for (int i40 = 0; i40 < i34; i40++) {
            iArr21[i40] = vVar.e(iE7);
        }
        int[] iArr22 = new int[i16];
        int i41 = 0;
        while (i41 < i12) {
            iArr22[Math.min(iArr17[i41], iE6)] = i41;
            i41++;
            iArr21 = iArr21;
        }
        int[] iArr23 = iArr21;
        d0 d0VarK = h0.k();
        int i42 = 0;
        while (i42 <= iE6) {
            int i43 = i34;
            int[] iArr24 = iArr17;
            int iMin = Math.min(iArr20[i42], i43 - 1);
            int[] iArr25 = iArr22;
            d0VarK.b(new i(iArr25[i42], iMin >= 0 ? iArr23[iMin] : -1));
            i42++;
            i34 = i43;
            iArr22 = iArr25;
            iArr17 = iArr24;
        }
        int[] iArr26 = iArr17;
        a1 a1VarG = d0VarK.g();
        if (((i) a1VarG.get(0)).b == -1) {
            return new com.google.firebase.messaging.o(null, lVar2, null, null);
        }
        int i44 = 1;
        while (true) {
            if (i44 > iE6) {
                i44 = -1;
                break;
            }
            if (((i) a1VarG.get(i44)).b != -1) {
                break;
            }
            i44++;
        }
        if (i44 == -1) {
            return new com.google.firebase.messaging.o(null, lVar2, null, null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i12, i12);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i12, i12);
        int i45 = 1;
        while (i45 < i12) {
            boolean[][] zArr6 = zArr5;
            for (int i46 = 0; i46 < i45; i46++) {
                boolean[] zArr7 = zArr4[i45];
                boolean[] zArr8 = zArr6[i45];
                boolean zD11 = vVar.d();
                zArr8[i46] = zD11;
                zArr7[i46] = zD11;
            }
            i45++;
            zArr5 = zArr6;
        }
        boolean[][] zArr9 = zArr5;
        for (int i47 = 1; i47 < i12; i47++) {
            int i48 = 0;
            while (i48 < iE4) {
                boolean[][] zArr10 = zArr4;
                for (int i49 = 0; i49 < i47; i49++) {
                    boolean[] zArr11 = zArr9[i47];
                    if (zArr11[i49] && zArr9[i49][i48]) {
                        zArr11[i48] = true;
                        break;
                    }
                }
                i48++;
                zArr4 = zArr10;
            }
        }
        boolean[][] zArr12 = zArr4;
        int[] iArr27 = new int[i16];
        for (int i50 = 0; i50 < i12; i50++) {
            int i51 = 0;
            for (int i52 = 0; i52 < i50; i52++) {
                i51 += zArr12[i50][i52] ? 1 : 0;
            }
            iArr27[iArr26[i50]] = i51;
        }
        int i53 = 0;
        for (int i54 = 0; i54 < i12; i54++) {
            if (iArr27[iArr26[i54]] == 0) {
                i53++;
            }
        }
        if (i53 > 1) {
            return new com.google.firebase.messaging.o(null, lVar2, null, null);
        }
        int[] iArr28 = new int[i12];
        int[] iArr29 = new int[iF2];
        if (vVar.d()) {
            int i55 = 0;
            while (i55 < i12) {
                int i56 = i55;
                iArr28[i56] = vVar.e(3);
                i55 = i56 + 1;
            }
        } else {
            Arrays.fill(iArr28, 0, i12, iE5);
        }
        int i57 = 0;
        while (i57 < iF2) {
            int i58 = i57;
            int[] iArr30 = iArr28;
            int[] iArr31 = iArr29;
            int iMax = 0;
            for (int i59 = 0; i59 < iArr5[i58]; i59++) {
                iMax = Math.max(iMax, iArr30[((i) a1VarG.get(iArr11[i58][i59])).a]);
            }
            iArr31[i58] = iMax + 1;
            i57 = i58 + 1;
            iArr28 = iArr30;
            iArr29 = iArr31;
        }
        int[] iArr32 = iArr29;
        if (vVar.d()) {
            int i60 = 0;
            while (i60 < iE4) {
                int i61 = i60 + 1;
                int i62 = i61;
                while (i62 < i12) {
                    if (zArr12[i62][i60]) {
                        vVar.j(3);
                    }
                    i62++;
                    iE4 = iE4;
                }
                i60 = i61;
            }
        }
        vVar.i();
        int iF4 = vVar.f() + 1;
        d0 d0VarK2 = h0.k();
        d0VarK2.b(kVarI);
        if (iF4 > 1) {
            d0VarK2.b(kVarI2);
            for (int i63 = 2; i63 < iF4; i63++) {
                kVarI2 = i(vVar, vVar.d(), iE5, kVarI2);
                d0VarK2.b(kVarI2);
            }
        }
        a1 a1VarG2 = d0VarK2.g();
        int iF5 = vVar.f() + iF2;
        if (iF5 > iF2) {
            return new com.google.firebase.messaging.o(null, lVar2, null, null);
        }
        int iE8 = vVar.e(2);
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, iF5, i16);
        int[] iArr33 = new int[iF5];
        int i64 = 0;
        int[] iArr34 = new int[iF5];
        int i65 = 0;
        while (i65 < iF2) {
            iArr33[i65] = i64;
            iArr34[i65] = iArr12[i65];
            if (iE8 == 0) {
                i4 = i65;
                zArr2 = zArr13;
                iArr2 = iArr33;
                iArr3 = iArr5;
                Arrays.fill(zArr13[i4], i64, iArr5[i4], true);
                iArr2[i4] = iArr3[i4];
            } else {
                i4 = i65;
                zArr2 = zArr13;
                iArr2 = iArr33;
                iArr3 = iArr5;
                if (iE8 == 1) {
                    int i66 = iArr12[i4];
                    for (int i67 = 0; i67 < iArr3[i4]; i67++) {
                        zArr2[i4][i67] = iArr11[i4][i67] == i66;
                    }
                    iArr2[i4] = 1;
                } else {
                    i64 = 0;
                    zArr2[0][0] = true;
                    iArr2[0] = 1;
                }
                i65 = i4 + 1;
                zArr13 = zArr2;
                iArr33 = iArr2;
                iArr5 = iArr3;
            }
            i64 = 0;
            i65 = i4 + 1;
            zArr13 = zArr2;
            iArr33 = iArr2;
            iArr5 = iArr3;
        }
        boolean[][] zArr14 = zArr13;
        int[] iArr35 = iArr33;
        int[] iArr36 = iArr5;
        int[] iArr37 = new int[i16];
        int i68 = 2;
        int[] iArr38 = new int[2];
        iArr38[1] = i16;
        iArr38[i64] = iF5;
        boolean[][] zArr15 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr38);
        int i69 = 1;
        int i70 = 0;
        while (i69 < iF5) {
            if (iE8 == i68) {
                for (int i71 = 0; i71 < iArr36[i69]; i71++) {
                    zArr14[i69][i71] = vVar.d();
                    int i72 = iArr35[i69];
                    boolean z7 = zArr14[i69][i71];
                    iArr35[i69] = i72 + (z7 ? 1 : 0);
                    if (z7) {
                        iArr34[i69] = iArr11[i69][i71];
                    }
                }
            }
            if (i70 == 0) {
                i3 = 0;
                if (iArr11[i69][0] == 0 && zArr14[i69][0]) {
                    for (int i73 = 1; i73 < iArr36[i69]; i73++) {
                        if (iArr11[i69][i73] == i44 && zArr14[i69][i44]) {
                            i70 = i69;
                        }
                    }
                }
            } else {
                i3 = 0;
            }
            int i74 = i3;
            while (i74 < iArr36[i69]) {
                if (iF4 > 1) {
                    zArr15[i69][i74] = zArr14[i69][i74];
                    a1Var = a1VarG2;
                    zArr = zArr15;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int iC = com.google.common.math.c.c(iF4);
                    if (!zArr[i69][i74]) {
                        int i75 = ((i) a1VarG.get(iArr11[i69][i74])).a;
                        int i76 = i3;
                        while (i76 < i74) {
                            int i77 = i76;
                            if (zArr9[i75][((i) a1VarG.get(iArr11[i69][i77])).a]) {
                                zArr[i69][i74] = true;
                                break;
                            }
                            i76 = i77 + 1;
                        }
                    }
                    if (zArr[i69][i74]) {
                        if (i70 <= 0 || i69 != i70) {
                            vVar.j(iC);
                        } else {
                            iArr37[i74] = vVar.e(iC);
                        }
                    }
                } else {
                    a1Var = a1VarG2;
                    zArr = zArr15;
                }
                i74++;
                a1VarG2 = a1Var;
                zArr15 = zArr;
            }
            a1 a1Var2 = a1VarG2;
            boolean[][] zArr16 = zArr15;
            if (iArr35[i69] == 1 && iArr27[iArr34[i69]] > 0) {
                vVar.i();
            }
            i69++;
            a1VarG2 = a1Var2;
            zArr15 = zArr16;
            i68 = 2;
        }
        a1 a1Var3 = a1VarG2;
        boolean[][] zArr17 = zArr15;
        if (i70 == 0) {
            return new com.google.firebase.messaging.o(null, lVar2, null, null);
        }
        int iF6 = vVar.f();
        int i78 = iF6 + 1;
        d0 d0VarL = h0.l(i78);
        int[] iArr39 = new int[i12];
        for (int i79 = 0; i79 < i78; i79++) {
            int iE9 = vVar.e(16);
            int iE10 = vVar.e(16);
            if (vVar.d()) {
                iE = vVar.e(2);
                if (iE == 3) {
                    vVar.i();
                }
                iE2 = vVar.e(4);
                iE3 = vVar.e(4);
            } else {
                iE = 0;
                iE2 = 0;
                iE3 = 0;
            }
            if (vVar.d()) {
                int iF7 = vVar.f();
                int iF8 = vVar.f();
                int iF9 = vVar.f();
                int iF10 = vVar.f();
                iE9 -= (iF7 + iF8) * ((iE == 1 || iE == 2) ? 2 : 1);
                iE10 -= (iF9 + iF10) * (iE == 1 ? 2 : 1);
            }
            d0VarL.b(new m(iE, iE2, iE3, iE9, iE10));
        }
        if (i78 <= 1 || !vVar.d()) {
            for (int i80 = 1; i80 < i12; i80++) {
                iArr39[i80] = Math.min(i80, iF6);
            }
        } else {
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int iC2 = com.google.common.math.c.c(i78);
            for (int i81 = 1; i81 < i12; i81++) {
                iArr39[i81] = vVar.e(iC2);
            }
        }
        l lVar3 = new l(d0VarL.g(), iArr39, 1);
        vVar.j(2);
        for (int i82 = 1; i82 < i12; i82++) {
            if (iArr27[iArr26[i82]] == 0) {
                vVar.i();
            }
        }
        for (int i83 = 1; i83 < iF5; i83++) {
            boolean zD12 = vVar.d();
            int i84 = 0;
            while (i84 < iArr32[i83]) {
                if ((i84 <= 0 || !zD12) ? i84 == 0 : vVar.d()) {
                    for (int i85 = 0; i85 < iArr36[i83]; i85++) {
                        if (zArr17[i83][i85]) {
                            vVar.f();
                        }
                    }
                    vVar.f();
                    vVar.f();
                }
                i84++;
            }
        }
        int iF11 = vVar.f() + 2;
        if (vVar.d()) {
            vVar.j(iF11);
        } else {
            for (int i86 = 1; i86 < i12; i86++) {
                for (int i87 = 0; i87 < i86; i87++) {
                    if (zArr12[i86][i87]) {
                        vVar.j(iF11);
                    }
                }
            }
        }
        int iF12 = vVar.f();
        for (int i88 = 1; i88 <= iF12; i88++) {
            vVar.j(8);
        }
        if (vVar.d()) {
            int i89 = vVar.d;
            if (i89 > 0) {
                vVar.j(8 - i89);
            }
            if (!vVar.d() ? vVar.d() : true) {
                vVar.i();
            }
            boolean zD13 = vVar.d();
            boolean zD14 = vVar.d();
            if (zD13 || zD14) {
                for (int i90 = 0; i90 < iF2; i90++) {
                    for (int i91 = 0; i91 < iArr32[i90]; i91++) {
                        boolean zD15 = zD13 ? vVar.d() : false;
                        boolean zD16 = zD14 ? vVar.d() : false;
                        if (zD15) {
                            vVar.j(32);
                        }
                        if (zD16) {
                            vVar.j(18);
                        }
                    }
                }
            }
            boolean zD17 = vVar.d();
            int iE11 = zD17 ? vVar.e(4) + 1 : i12;
            d0 d0VarL2 = h0.l(iE11);
            int[] iArr40 = new int[i12];
            for (int i92 = 0; i92 < iE11; i92++) {
                vVar.j(3);
                int i93 = vVar.d() ? 1 : 2;
                int iF13 = androidx.media3.common.h.f(vVar.e(8));
                int iG = androidx.media3.common.h.g(vVar.e(8));
                vVar.j(8);
                d0VarL2.b(new o(iF13, i93, iG));
            }
            if (zD17 && iE11 > 1) {
                for (int i94 = 0; i94 < i12; i94++) {
                    iArr40[i94] = vVar.e(4);
                }
            }
            lVar = new l(d0VarL2.g(), iArr40, 2);
        } else {
            lVar = null;
        }
        return new com.google.firebase.messaging.o(a1VarG, new l(a1Var3, iArr37, 0), lVar3, lVar);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ae A[PHI: r19
  0x01ae: PHI (r19v6 float) = (r19v3 float), (r19v9 float), (r19v3 float), (r19v3 float), (r19v10 float) binds: [B:94:0x0190, B:104:0x01b5, B:98:0x01a6, B:99:0x01a8, B:100:0x01aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:102:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:108:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:113:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:114:0x01de  */
    /* JADX WARN: Code duplicated, block: B:117:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:118:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:122:0x0208  */
    /* JADX WARN: Code duplicated, block: B:125:0x0214  */
    /* JADX WARN: Code duplicated, block: B:128:0x021f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0228  */
    /* JADX WARN: Code duplicated, block: B:134:0x022f  */
    /* JADX WARN: Code duplicated, block: B:137:0x023b  */
    /* JADX WARN: Code duplicated, block: B:139:0x0261  */
    /* JADX WARN: Code duplicated, block: B:61:0x011c  */
    /* JADX WARN: Code duplicated, block: B:64:0x012e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0140  */
    /* JADX WARN: Code duplicated, block: B:67:0x0143 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0145  */
    /* JADX WARN: Code duplicated, block: B:69:0x0148  */
    /* JADX WARN: Code duplicated, block: B:71:0x014c  */
    /* JADX WARN: Code duplicated, block: B:72:0x014f  */
    /* JADX WARN: Code duplicated, block: B:93:0x018c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0192  */
    /* JADX WARN: Code duplicated, block: B:97:0x019c  */
    public static q m(byte[] bArr, int i, int i2) {
        int iF;
        int iF2;
        int i3;
        boolean z;
        int i4;
        int iF3;
        boolean z2;
        boolean zD;
        int i5;
        int i6;
        int i7;
        int iF4;
        int iF5;
        float f;
        int i8;
        int i9;
        int i10;
        float f2;
        int i11;
        int i12;
        int iG;
        boolean zD2;
        boolean zD3;
        int iE;
        int iE2;
        int iE3;
        int i13;
        int i14;
        v vVar = new v(bArr, i + 1, i2);
        int iE4 = vVar.e(8);
        int iE5 = vVar.e(8);
        int iE6 = vVar.e(8);
        int iF6 = vVar.f();
        if (iE4 == 100 || iE4 == 110 || iE4 == 122 || iE4 == 244 || iE4 == 44 || iE4 == 83 || iE4 == 86 || iE4 == 118 || iE4 == 128 || iE4 == 138) {
            iF = vVar.f();
            boolean zD4 = iF == 3 ? vVar.d() : false;
            int iF7 = vVar.f();
            iF2 = vVar.f();
            vVar.i();
            if (vVar.d()) {
                int i15 = iF != 3 ? 8 : 12;
                i3 = 16;
                int i16 = 0;
                while (i16 < i15) {
                    if (vVar.d()) {
                        int i17 = i16 < 6 ? 16 : 64;
                        int iG2 = 8;
                        int i18 = 8;
                        for (int i19 = 0; i19 < i17; i19++) {
                            if (iG2 != 0) {
                                iG2 = ((vVar.g() + i18) + LibretroCore.SCREEN_WIDTH) % LibretroCore.SCREEN_WIDTH;
                            }
                            if (iG2 != 0) {
                                i18 = iG2;
                            }
                        }
                    }
                    i16++;
                }
            } else {
                i3 = 16;
            }
            z = zD4;
            i4 = iF7;
        } else {
            iF = 1;
            i3 = 16;
            i4 = 0;
            z = false;
            iF2 = 0;
        }
        int iF8 = vVar.f() + 4;
        int iF9 = vVar.f();
        if (iF9 != 0) {
            if (iF9 == 1) {
                boolean zD5 = vVar.d();
                vVar.g();
                vVar.g();
                iE4 = iE4;
                long jF = vVar.f();
                iF9 = iF9;
                for (int i20 = 0; i20 < jF; i20++) {
                    vVar.f();
                }
                iF2 = iF2;
                z2 = zD5;
                iF3 = 0;
            } else {
                iF3 = 0;
            }
            vVar.f();
            vVar.i();
            int iF10 = vVar.f() + 1;
            int iF11 = vVar.f() + 1;
            zD = vVar.d();
            i5 = 2 - (zD ? 1 : 0);
            int i21 = iF11 * i5;
            if (!zD) {
                vVar.i();
            }
            vVar.i();
            i6 = iF10 * 16;
            i7 = i21 * 16;
            if (vVar.d()) {
                int iF12 = vVar.f();
                int iF13 = vVar.f();
                int iF14 = vVar.f();
                int iF15 = vVar.f();
                if (iF == 0) {
                    i13 = 1;
                } else {
                    if (iF == 3) {
                        i13 = 1;
                    } else {
                        i13 = 2;
                    }
                    if (iF == 1) {
                        i14 = 2;
                    } else {
                        i14 = 1;
                    }
                    i5 *= i14;
                }
                i6 -= (iF12 + iF13) * i13;
                i7 -= (iF14 + iF15) * i5;
            }
            int i22 = i7;
            int i23 = i6;
            int i24 = iE4;
            iF4 = ((i24 != 44 || i24 == 86 || i24 == 100 || i24 == 110 || i24 == 122 || i24 == 244) && (iE5 & 16) != 0) ? 0 : i3;
            iF5 = -1;
            f = 1.0f;
            if (vVar.d()) {
                if (!vVar.d()) {
                    iE = vVar.e(8);
                    if (iE == 255) {
                        int i25 = i3;
                        iE2 = vVar.e(i25);
                        iE3 = vVar.e(i25);
                        if (iE2 != 0 && iE3 != 0) {
                            f = iE2 / iE3;
                        }
                    } else if (iE < 17) {
                        f = b[iE];
                    } else {
                        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.w("Unexpected aspect_ratio_idc value: ", iE, "NalUnitUtil");
                    }
                }
                if (vVar.d()) {
                    vVar.i();
                }
                if (vVar.d()) {
                    vVar.j(3);
                    if (vVar.d()) {
                        i12 = 1;
                    } else {
                        i12 = 2;
                    }
                    if (vVar.d()) {
                        int iE7 = vVar.e(8);
                        int iE8 = vVar.e(8);
                        vVar.j(8);
                        iF5 = androidx.media3.common.h.f(iE7);
                        iG = androidx.media3.common.h.g(iE8);
                    } else {
                        iG = -1;
                    }
                } else {
                    i12 = -1;
                    iG = -1;
                }
                if (vVar.d()) {
                    vVar.f();
                    vVar.f();
                }
                if (vVar.d()) {
                    vVar.j(65);
                }
                zD2 = vVar.d();
                if (zD2) {
                    n(vVar);
                }
                zD3 = vVar.d();
                if (zD3) {
                    n(vVar);
                }
                if (zD2 || zD3) {
                    vVar.i();
                }
                vVar.i();
                if (vVar.d()) {
                    vVar.i();
                    vVar.f();
                    vVar.f();
                    vVar.f();
                    vVar.f();
                    iF4 = vVar.f();
                    vVar.f();
                }
                f2 = f;
                i11 = iF5;
                i9 = i12;
                i10 = iG;
                i8 = iF4;
            } else {
                iF8 = iF8;
                i8 = iF4;
                i9 = -1;
                i10 = -1;
                f2 = 1.0f;
                i11 = -1;
            }
            return new q(i24, iE5, iE6, iF6, i23, i22, f2, i4, iF2, z, zD, iF8, iF9, iF3, z2, i11, i9, i10, i8);
        }
        iF3 = vVar.f() + 4;
        z2 = false;
        vVar.f();
        vVar.i();
        int iF16 = vVar.f() + 1;
        int iF17 = vVar.f() + 1;
        zD = vVar.d();
        i5 = 2 - (zD ? 1 : 0);
        int i26 = iF17 * i5;
        if (!zD) {
            vVar.i();
        }
        vVar.i();
        i6 = iF16 * 16;
        i7 = i26 * 16;
        if (vVar.d()) {
            int iF18 = vVar.f();
            int iF19 = vVar.f();
            int iF110 = vVar.f();
            int iF111 = vVar.f();
            if (iF == 0) {
                i13 = 1;
            } else {
                if (iF == 3) {
                    i13 = 1;
                } else {
                    i13 = 2;
                }
                if (iF == 1) {
                    i14 = 2;
                } else {
                    i14 = 1;
                }
                i5 *= i14;
            }
            i6 -= (iF18 + iF19) * i13;
            i7 -= (iF110 + iF111) * i5;
        }
        int i27 = i7;
        int i28 = i6;
        int i29 = iE4;
        if (i29 != 44) {
        }
        iF5 = -1;
        f = 1.0f;
        if (vVar.d()) {
            if (!vVar.d()) {
                iE = vVar.e(8);
                if (iE == 255) {
                    int i210 = i3;
                    iE2 = vVar.e(i210);
                    iE3 = vVar.e(i210);
                    if (iE2 != 0) {
                        f = iE2 / iE3;
                    }
                } else if (iE < 17) {
                    f = b[iE];
                } else {
                    androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.w("Unexpected aspect_ratio_idc value: ", iE, "NalUnitUtil");
                }
            }
            if (vVar.d()) {
                vVar.i();
            }
            if (vVar.d()) {
                vVar.j(3);
                if (vVar.d()) {
                    i12 = 1;
                } else {
                    i12 = 2;
                }
                if (vVar.d()) {
                    int iE9 = vVar.e(8);
                    int iE10 = vVar.e(8);
                    vVar.j(8);
                    iF5 = androidx.media3.common.h.f(iE9);
                    iG = androidx.media3.common.h.g(iE10);
                } else {
                    iG = -1;
                }
            } else {
                i12 = -1;
                iG = -1;
            }
            if (vVar.d()) {
                vVar.f();
                vVar.f();
            }
            if (vVar.d()) {
                vVar.j(65);
            }
            zD2 = vVar.d();
            if (zD2) {
                n(vVar);
            }
            zD3 = vVar.d();
            if (zD3) {
                n(vVar);
            }
            if (zD2) {
                vVar.i();
            } else {
                vVar.i();
            }
            vVar.i();
            if (vVar.d()) {
                vVar.i();
                vVar.f();
                vVar.f();
                vVar.f();
                vVar.f();
                iF4 = vVar.f();
                vVar.f();
            }
            f2 = f;
            i11 = iF5;
            i9 = i12;
            i10 = iG;
            i8 = iF4;
        } else {
            iF8 = iF8;
            i8 = iF4;
            i9 = -1;
            i10 = -1;
            f2 = 1.0f;
            i11 = -1;
        }
        return new q(i29, iE5, iE6, iF6, i28, i27, f2, i4, iF2, z, zD, iF8, iF9, iF3, z2, i11, i9, i10, i8);
    }

    public static void n(v vVar) {
        int iF = vVar.f() + 1;
        vVar.j(8);
        for (int i = 0; i < iF; i++) {
            vVar.f();
            vVar.f();
            vVar.i();
        }
        vVar.j(20);
    }

    public static ArrayList o(ByteBuffer byteBuffer) {
        int iRemaining;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            try {
                byte b2 = byteBufferAsReadOnlyBuffer.get();
                int i = (b2 >> 3) & 15;
                if (((b2 >> 2) & 1) != 0) {
                    byteBufferAsReadOnlyBuffer.get();
                }
                if (((b2 >> 1) & 1) != 0) {
                    iRemaining = 0;
                    for (int i2 = 0; i2 < 8; i2++) {
                        byte b3 = byteBufferAsReadOnlyBuffer.get();
                        iRemaining |= (b3 & 127) << (i2 * 7);
                        if ((b3 & 128) == 0) {
                            break;
                        }
                    }
                } else {
                    iRemaining = byteBufferAsReadOnlyBuffer.remaining();
                }
                if (byteBufferAsReadOnlyBuffer.position() + iRemaining > byteBufferAsReadOnlyBuffer.limit()) {
                    break;
                }
                ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
                byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position() + iRemaining);
                arrayList.add(new t(byteBufferDuplicate, i));
                byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iRemaining);
            } catch (BufferUnderflowException unused) {
            }
        }
        return arrayList;
    }

    public static int p(byte[] bArr, int i) {
        int i2;
        synchronized (c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    try {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = d;
                    if (iArr.length <= i4) {
                        d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    d[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = d[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i9 + 2;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }
}
