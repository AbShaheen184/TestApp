package androidx.media3.extractor;

import androidx.compose.animation.core.t2;
import androidx.media3.common.j0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final int m;
    public final String n;
    public final com.google.firebase.messaging.o o;

    public w(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, int i11, String str, com.google.firebase.messaging.o oVar) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = i10;
        this.l = f;
        this.m = i11;
        this.n = str;
        this.o = oVar;
    }

    public static w a(androidx.media3.common.util.w wVar, boolean z, com.google.firebase.messaging.o oVar) throws j0 {
        boolean z2;
        t2 t2VarJ;
        int i = 4;
        try {
            if (z) {
                wVar.N(4);
            } else {
                wVar.N(21);
            }
            int iZ = wVar.z() & 3;
            int iZ2 = wVar.z();
            int i2 = wVar.b;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                z2 = true;
                if (i4 >= iZ2) {
                    break;
                }
                wVar.N(1);
                int iG = wVar.G();
                for (int i6 = 0; i6 < iG; i6++) {
                    int iG2 = wVar.G();
                    i5 += iG2 + 4;
                    wVar.N(iG2);
                }
                i4++;
            }
            wVar.M(i2);
            byte[] bArr = new byte[i5];
            com.google.firebase.messaging.o oVar2 = oVar;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            float f = 1.0f;
            String strA = null;
            int i17 = 0;
            int i18 = 0;
            while (i17 < iZ2) {
                int iZ3 = wVar.z() & 63;
                int iG3 = wVar.G();
                int i19 = i3;
                com.google.firebase.messaging.o oVarL = oVar2;
                while (i19 < iG3) {
                    boolean z3 = z2;
                    int iG4 = wVar.G();
                    int i20 = iZ;
                    System.arraycopy(androidx.media3.container.r.a, i3, bArr, i18, i);
                    int i21 = i18 + 4;
                    System.arraycopy(wVar.a, wVar.b, bArr, i21, iG4);
                    if (iZ3 == 32 && i19 == 0) {
                        oVarL = androidx.media3.container.r.l(bArr, i21, i21 + iG4);
                    } else {
                        if (iZ3 == 33 && i19 == 0) {
                            androidx.media3.container.n nVarK = androidx.media3.container.r.k(bArr, i21, i21 + iG4, oVarL);
                            i7 = nVarK.a + 1;
                            i8 = nVarK.g;
                            int i22 = nVarK.h;
                            i10 = nVarK.c + 8;
                            i11 = nVarK.d + 8;
                            int i23 = nVarK.k;
                            i9 = i22;
                            int i24 = nVarK.l;
                            int i25 = nVarK.m;
                            float f2 = nVarK.i;
                            int i26 = nVarK.j;
                            androidx.media3.container.k kVar = nVarK.b;
                            if (kVar != null) {
                                strA = androidx.media3.common.util.f.a(kVar.a, kVar.b, kVar.c, kVar.d, kVar.e, kVar.f);
                            }
                            i16 = i26;
                            f = f2;
                            i14 = i25;
                            i13 = i24;
                            i12 = i23;
                        } else if (iZ3 == 39 && i19 == 0 && (t2VarJ = androidx.media3.container.r.j(bArr, i21, i21 + iG4)) != null && oVarL != null) {
                            i3 = 0;
                            i15 = t2VarJ.e == ((androidx.media3.container.i) ((com.google.common.collect.h0) oVarL.y).get(0)).b ? 4 : 5;
                        }
                        i3 = 0;
                    }
                    i18 = i21 + iG4;
                    wVar.N(iG4);
                    i19++;
                    z2 = z3;
                    iZ = i20;
                    i = 4;
                }
                i17++;
                oVar2 = oVarL;
                i = 4;
            }
            return new w(i5 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iZ + 1, i7, i8, i9, i10, i11, i12, i13, i14, i15, f, i16, strA, oVar2);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw j0.a(e, "Error parsing".concat(z ? "L-HEVC config" : "HEVC config"));
        }
    }
}
