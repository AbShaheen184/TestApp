package okio;

import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final e a = new e();

    public static final boolean a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        bArr.getClass();
        bArr2.getClass();
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static final z b(f0 f0Var) {
        f0Var.getClass();
        return new z(f0Var);
    }

    public static void c(long j, f fVar, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        ArrayList arrayList3;
        long j2;
        int i6;
        int i7 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i2 >= i3) {
            net.luminis.tls.engine.impl.c.o("Failed requirement.");
            return;
        }
        for (int i8 = i2; i8 < i3; i8++) {
            if (((i) arrayList4.get(i8)).f() < i7) {
                net.luminis.tls.engine.impl.c.o("Failed requirement.");
                return;
            }
        }
        i iVar = (i) arrayList.get(i2);
        i iVar2 = (i) arrayList4.get(i3 - 1);
        if (i7 == iVar.f()) {
            int iIntValue = ((Number) arrayList5.get(i2)).intValue();
            int i9 = i2 + 1;
            i iVar3 = (i) arrayList4.get(i9);
            i4 = i9;
            i5 = iIntValue;
            iVar = iVar3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (iVar.k(i7) == iVar2.k(i7)) {
            int iMin = Math.min(iVar.f(), iVar2.f());
            int i10 = 0;
            for (int i11 = i7; i11 < iMin && iVar.k(i11) == iVar2.k(i11); i11++) {
                i10++;
            }
            long j3 = 4;
            long j4 = (fVar.y / j3) + j + ((long) 2) + ((long) i10) + 1;
            fVar.r0(-i10);
            fVar.r0(i5);
            int i12 = i7 + i10;
            while (i7 < i12) {
                fVar.r0(iVar.k(i7) & 255);
                i7++;
            }
            if (i4 + 1 == i3) {
                if (i12 == ((i) arrayList4.get(i4)).f()) {
                    fVar.r0(((Number) arrayList5.get(i4)).intValue());
                    return;
                } else {
                    net.luminis.tls.engine.impl.c.r("Check failed.");
                    return;
                }
            }
            f fVar2 = new f();
            fVar.r0(((int) ((fVar2.y / j3) + j4)) * (-1));
            c(j4, fVar2, i12, arrayList4, i4, i3, arrayList5);
            fVar.n0(fVar2);
            return;
        }
        int i13 = 1;
        for (int i14 = i4 + 1; i14 < i3; i14++) {
            if (((i) arrayList4.get(i14 - 1)).k(i7) != ((i) arrayList4.get(i14)).k(i7)) {
                i13++;
            }
        }
        long j5 = 4;
        long j6 = (fVar.y / j5) + j + ((long) 2) + ((long) (i13 * 2));
        fVar.r0(i13);
        fVar.r0(i5);
        for (int i15 = i4; i15 < i3; i15++) {
            int iK = ((i) arrayList4.get(i15)).k(i7);
            if (i15 == i4 || iK != ((i) arrayList4.get(i15 - 1)).k(i7)) {
                fVar.r0(iK & 255);
            }
        }
        f fVar3 = new f();
        int i16 = i4;
        while (i16 < i3) {
            byte bK = ((i) arrayList4.get(i16)).k(i7);
            int i17 = i16 + 1;
            int i18 = i17;
            while (true) {
                if (i18 >= i3) {
                    i18 = i3;
                    break;
                } else if (bK != ((i) arrayList4.get(i18)).k(i7)) {
                    break;
                } else {
                    i18++;
                }
            }
            if (i17 == i18 && i7 + 1 == ((i) arrayList4.get(i16)).f()) {
                fVar.r0(((Number) arrayList5.get(i16)).intValue());
                arrayList3 = arrayList5;
                j2 = j6;
                i6 = i18;
            } else {
                fVar.r0(((int) ((fVar3.y / j5) + j6)) * (-1));
                arrayList3 = arrayList5;
                j2 = j6;
                i6 = i18;
                c(j2, fVar3, i7 + 1, arrayList, i16, i6, arrayList3);
                arrayList4 = arrayList;
            }
            j6 = j2;
            i16 = i6;
            arrayList5 = arrayList3;
        }
        fVar.n0(fVar3);
    }

    public static final void d(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sbM = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.m(j, "size=", " offset=");
            sbM.append(j2);
            sbM.append(" byteCount=");
            sbM.append(j3);
            throw new ArrayIndexOutOfBoundsException(sbM.toString());
        }
    }

    public static final r e(InputStream inputStream) {
        inputStream.getClass();
        return new r(inputStream, new j0());
    }

    public static final String f(byte b) {
        char[] cArr = okio.internal.b.a;
        return new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]});
    }

    public static final String g(int i) {
        if (i == 0) {
            return "0";
        }
        char[] cArr = okio.internal.b.a;
        int i2 = 0;
        char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i2 < 8 && cArr2[i2] == '0') {
            i2++;
        }
        com.google.android.material.textfield.p.c(i2, 8, 8);
        return new String(cArr2, i2, 8 - i2);
    }
}
