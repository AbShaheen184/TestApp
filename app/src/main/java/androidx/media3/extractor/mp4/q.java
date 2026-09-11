package androidx.media3.extractor.mp4;

import androidx.media3.common.g0;
import androidx.media3.common.i0;
import androidx.media3.common.util.w;
import com.google.common.collect.d0;
import com.google.common.collect.e0;
import com.google.common.collect.h0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public static final int[] a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static String b(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        boolean z = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = ((u) it.next()).a.g.o;
            if (i0.o(str2)) {
                return "video/mp4";
            }
            if (i0.k(str2)) {
                z = true;
            } else if (i0.m(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        if (z) {
            return "audio/mp4";
        }
        return str != null ? str : "application/mp4";
    }

    public static boolean c(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 = 0; i2 < 29; i2++) {
            if (a[i2] == i) {
                return true;
            }
        }
        return false;
    }

    public static androidx.media3.extractor.metadata.id3.a d(w wVar) {
        String str;
        int iM = wVar.m();
        if (wVar.m() != 1684108385) {
            androidx.media3.common.util.c.t("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iM2 = wVar.m();
        byte[] bArr = e.a;
        int i = iM2 & 16777215;
        if (i == 13) {
            str = "image/jpeg";
        } else {
            str = i == 14 ? "image/png" : null;
        }
        if (str == null) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.w("Unrecognized cover art flags: ", i, "MetadataUtil");
            return null;
        }
        wVar.N(4);
        int i2 = iM - 16;
        byte[] bArr2 = new byte[i2];
        wVar.k(bArr2, 0, i2);
        return new androidx.media3.extractor.metadata.id3.a(str, null, 3, bArr2);
    }

    public static androidx.media3.extractor.metadata.id3.n e(int i, w wVar, String str) {
        int iM = wVar.m();
        if (wVar.m() == 1684108385 && iM >= 22) {
            wVar.N(10);
            int iG = wVar.G();
            if (iG > 0) {
                String strL = androidx.privacysandbox.ads.adservices.java.internal.a.l(iG, "");
                int iG2 = wVar.G();
                if (iG2 > 0) {
                    strL = strL + "/" + iG2;
                }
                return new androidx.media3.extractor.metadata.id3.n(str, null, h0.s(strL));
            }
        }
        androidx.media3.common.util.c.t("MetadataUtil", "Failed to parse index/count attribute: ".concat(androidx.media3.container.f.d(i)));
        return null;
    }

    public static int f(w wVar) {
        int iM = wVar.m();
        if (wVar.m() == 1684108385) {
            wVar.N(8);
            int i = iM - 16;
            if (i == 1) {
                return wVar.z();
            }
            if (i == 2) {
                return wVar.G();
            }
            if (i == 3) {
                return wVar.C();
            }
            if (i == 4 && (wVar.j() & 128) == 0) {
                return wVar.D();
            }
        }
        androidx.media3.common.util.c.t("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static androidx.media3.extractor.metadata.id3.i g(int i, String str, w wVar, boolean z, boolean z2) {
        int iF = f(wVar);
        if (z2) {
            iF = Math.min(1, iF);
        }
        if (iF >= 0) {
            return z ? new androidx.media3.extractor.metadata.id3.n(str, null, h0.s(Integer.toString(iF))) : new androidx.media3.extractor.metadata.id3.e("und", str, Integer.toString(iF));
        }
        androidx.media3.common.util.c.t("MetadataUtil", "Failed to parse uint8 attribute: ".concat(androidx.media3.container.f.d(i)));
        return null;
    }

    public static androidx.media3.exoplayer.dash.manifest.t h(byte[] bArr) {
        UUID[] uuidArr;
        w wVar = new w(bArr);
        if (wVar.c < 32) {
            return null;
        }
        wVar.M(0);
        int iA = wVar.a();
        int iM = wVar.m();
        if (iM != iA) {
            androidx.media3.common.util.c.t("PsshAtomUtil", "Advertised atom size (" + iM + ") does not match buffer size: " + iA);
            return null;
        }
        int iM2 = wVar.m();
        if (iM2 != 1886614376) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.w("Atom type is not pssh: ", iM2, "PsshAtomUtil");
            return null;
        }
        int iE = e.e(wVar.m());
        if (iE > 1) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.w("Unsupported pssh version: ", iE, "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(wVar.t(), wVar.t());
        if (iE == 1) {
            int iD = wVar.D();
            uuidArr = new UUID[iD];
            for (int i = 0; i < iD; i++) {
                uuidArr[i] = new UUID(wVar.t(), wVar.t());
            }
        } else {
            uuidArr = null;
        }
        int iD2 = wVar.D();
        int iA2 = wVar.a();
        if (iD2 == iA2) {
            byte[] bArr2 = new byte[iD2];
            wVar.k(bArr2, 0, iD2);
            return new androidx.media3.exoplayer.dash.manifest.t(uuid, iE, bArr2, uuidArr);
        }
        androidx.media3.common.util.c.t("PsshAtomUtil", "Atom data size (" + iD2 + ") does not match the bytes left: " + iA2);
        return null;
    }

    public static androidx.media3.extractor.metadata.id3.n i(int i, w wVar, String str) {
        int iM = wVar.m();
        if (wVar.m() == 1684108385) {
            wVar.N(8);
            return new androidx.media3.extractor.metadata.id3.n(str, null, h0.s(wVar.v(iM - 16)));
        }
        androidx.media3.common.util.c.t("MetadataUtil", "Failed to parse text attribute: ".concat(androidx.media3.container.f.d(i)));
        return null;
    }

    public static void j(int i, androidx.media3.common.h0 h0Var, androidx.media3.common.q qVar, androidx.media3.common.h0 h0Var2, androidx.media3.common.h0... h0VarArr) {
        if (h0Var2 == null) {
            h0Var2 = new androidx.media3.common.h0(new g0[0]);
        }
        if (h0Var != null) {
            d0 d0VarK = h0.k();
            for (g0 g0Var : h0Var.a) {
                if (androidx.media3.container.b.class.isAssignableFrom(g0Var.getClass())) {
                    d0VarK.b((g0) androidx.media3.container.b.class.cast(g0Var));
                }
            }
            e0 e0VarListIterator = d0VarK.g().listIterator(0);
            while (e0VarListIterator.hasNext()) {
                androidx.media3.container.b bVar = (androidx.media3.container.b) e0VarListIterator.next();
                if (!bVar.a.equals("com.android.capture.fps") || i == 2) {
                    h0Var2 = h0Var2.a(bVar);
                }
            }
        }
        for (androidx.media3.common.h0 h0Var3 : h0VarArr) {
            h0Var2 = h0Var2.b(h0Var3);
        }
        if (h0Var2.a.length > 0) {
            qVar.k = h0Var2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0165  */
    /* JADX WARN: Code duplicated, block: B:103:0x0168  */
    /* JADX WARN: Code duplicated, block: B:105:0x016c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x016e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0171  */
    /* JADX WARN: Code duplicated, block: B:110:0x0174 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0077  */
    /* JADX WARN: Multi-variable type inference failed */
    public static androidx.media3.extractor.e0 k(androidx.media3.extractor.o oVar, boolean z, boolean z2) {
        androidx.media3.extractor.e0 e0Var;
        int i;
        int i2;
        int i3;
        long j;
        int i4;
        int[] iArr;
        long length = oVar.getLength();
        long j2 = -1;
        int i5 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j3 = 4096;
        if (i5 != 0 && length <= 4096) {
            j3 = length;
        }
        int i6 = (int) j3;
        w wVar = new w(64);
        int i7 = 0;
        int i8 = 0;
        boolean z3 = false;
        while (true) {
            if (i8 < i6) {
                wVar.J(8);
                if (oVar.e(wVar.a, i7, 8, true)) {
                    long jB = wVar.B();
                    int iM = wVar.m();
                    if (jB == 1) {
                        j2 = j2;
                        oVar.x(wVar.a, 8, 8);
                        i2 = 16;
                        wVar.L(16);
                        jB = wVar.t();
                        i8 = i8;
                    } else {
                        j2 = j2;
                        if (jB == 0) {
                            long length2 = oVar.getLength();
                            if (length2 != j2) {
                                jB = (length2 - oVar.f()) + ((long) 8);
                            }
                        }
                        i2 = 8;
                    }
                    long j4 = jB;
                    e0Var = null;
                    long j5 = i2;
                    if (j4 < j5) {
                        if (iM != 1718773093 || i2 != 8) {
                            return new a(iM, i2, j4);
                        }
                        j4 = j5;
                    }
                    int i9 = i8 + i2;
                    if (iM == 1836019574 || iM == 1970628964) {
                        i6 += (int) j4;
                        i3 = i5;
                        if (i5 != 0 && i6 > length) {
                            i6 = (int) length;
                        }
                        if (iM == 1836019574) {
                            i8 = i9;
                            i5 = i3;
                            i7 = 0;
                        }
                    } else {
                        i3 = i5;
                    }
                    if (iM == 1953653099 || iM == 1835297121 || iM == 1835626086) {
                        j = length;
                        i4 = 0;
                        i8 = i9;
                    } else if (iM == 1836019558 || iM == 1836475768) {
                        i = 1;
                    } else {
                        if (iM == 1835295092) {
                            z3 = true;
                        }
                        if (iM != 1937007212 || j4 <= 1000000) {
                            j = length;
                            if ((((long) i9) + j4) - j5 < i6) {
                                int i10 = (int) (j4 - j5);
                                i8 = i9 + i10;
                                if (iM != 1718909296) {
                                    i4 = 0;
                                    if (i10 != 0) {
                                        oVar.h(i10);
                                    }
                                } else {
                                    if (i10 < 8) {
                                        return new a(iM, 8, i10);
                                    }
                                    wVar.J(i10);
                                    i4 = 0;
                                    oVar.x(wVar.a, 0, i10);
                                    int iM2 = wVar.m();
                                    if (c(iM2, z2)) {
                                        z3 = true;
                                    }
                                    wVar.N(4);
                                    int iA = wVar.a() / 4;
                                    if (z3 || iA <= 0) {
                                        iArr = e0Var;
                                    } else {
                                        iArr = new int[iA];
                                        for (int i11 = 0; i11 < iA; i11++) {
                                            int iM3 = wVar.m();
                                            iArr[i11] = iM3;
                                            if (c(iM3, z2)) {
                                                z3 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!z3) {
                                        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l(iM2, iArr);
                                    }
                                }
                            }
                        }
                        i = 0;
                    }
                    i7 = i4;
                    i5 = i3;
                    length = j;
                }
                if (!z3) {
                    return n.e;
                }
                if (z != i) {
                    return i != 0 ? j.y : j.z;
                }
                return e0Var;
            }
            e0Var = null;
            i = i7;
            if (!z3) {
                return n.e;
            }
            if (z != i) {
                if (i != 0) {
                }
            }
            return e0Var;
        }
    }
}
