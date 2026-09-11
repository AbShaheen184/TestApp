package androidx.media3.extractor.text.dvb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.compose.animation.core.u2;
import androidx.media3.common.util.i;
import androidx.media3.common.util.j0;
import androidx.media3.common.util.v;
import androidx.media3.common.util.w;
import androidx.media3.extractor.text.k;
import androidx.media3.extractor.text.l;
import com.app.mlounge.emulator.LibretroCore;
import com.google.common.collect.a1;
import com.google.common.collect.e0;
import com.google.common.collect.h0;
import java.util.ArrayList;
import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements l {
    public static final byte[] E = {0, 7, 8, 15};
    public static final byte[] F = {0, 119, -120, -1};
    public static final byte[] G = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public final b A;
    public final a B;
    public final g C;
    public Bitmap D;
    public final Paint e;
    public final Paint y;
    public final Canvas z;

    public h(List list) {
        w wVar = new w((byte[]) list.get(0));
        int iG = wVar.G();
        int iG2 = wVar.G();
        Paint paint = new Paint();
        this.e = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.y = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.z = new Canvas();
        this.A = new b(719, 575, 0, 719, 0, 575);
        this.B = new a(0, new int[]{0, -1, -16777216, -8421505}, b(), c());
        this.C = new g(iG, iG2);
    }

    public static byte[] a(int i, int i2, v vVar) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) vVar.g(i2);
        }
        return bArr;
    }

    public static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = d(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                iArr[i] = d(255, (i & 1) != 0 ? 127 : 0, (i & 2) != 0 ? 127 : 0, (i & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] c() {
        int[] iArr = new int[LibretroCore.SCREEN_WIDTH];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = d(63, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & Token.WITH;
                if (i2 == 0) {
                    iArr[i] = d(255, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = d(127, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = d(255, ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = d(255, ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int d(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:119:0x0203 A[LOOP:3: B:87:0x0156->B:119:0x0203, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:133:0x01ff A[SYNTHETIC] */
    public static void e(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] bArr2;
        char c;
        char c2;
        int iG;
        int iG2;
        boolean z;
        int iG3;
        int iG4;
        int iG5;
        int i4;
        int i5;
        boolean z2;
        int iG6;
        v vVar = new v(bArr, bArr.length);
        int i6 = i2;
        int i7 = i3;
        byte[] bArrA = null;
        byte[] bArrA2 = null;
        byte[] bArrA3 = null;
        while (vVar.b() != 0) {
            int i8 = 8;
            int iG7 = vVar.g(8);
            if (iG7 != 240) {
                int i9 = 3;
                int i10 = 2;
                int i11 = 4;
                switch (iG7) {
                    case 16:
                        if (i == 3) {
                            bArr2 = bArrA == null ? F : bArrA;
                        } else if (i == 2) {
                            bArr2 = bArrA3 == null ? E : bArrA3;
                        } else {
                            bArr2 = null;
                        }
                        boolean z3 = false;
                        while (true) {
                            int iG8 = vVar.g(2);
                            if (iG8 != 0) {
                                iG = iG8;
                                iG2 = 1;
                            } else {
                                if (vVar.f()) {
                                    int iG9 = vVar.g(3) + 3;
                                    iG = vVar.g(2);
                                    iG2 = iG9;
                                } else {
                                    if (vVar.f()) {
                                        iG2 = 1;
                                        c = '\b';
                                        c2 = 4;
                                    } else {
                                        int iG10 = vVar.g(2);
                                        if (iG10 == 0) {
                                            c = '\b';
                                            c2 = 4;
                                            z3 = true;
                                        } else if (iG10 == 1) {
                                            c = '\b';
                                            c2 = 4;
                                            iG2 = 2;
                                        } else if (iG10 == 2) {
                                            c = '\b';
                                            c2 = 4;
                                            iG2 = vVar.g(4) + 12;
                                            iG = vVar.g(2);
                                            z3 = z3;
                                        } else if (iG10 != 3) {
                                            z3 = z3;
                                            c = '\b';
                                            c2 = 4;
                                        } else {
                                            c = '\b';
                                            int iG11 = vVar.g(8) + 29;
                                            iG = vVar.g(2);
                                            z3 = z3;
                                            iG2 = iG11;
                                            c2 = 4;
                                        }
                                        iG = 0;
                                        iG2 = 0;
                                    }
                                    iG = 0;
                                }
                                if (iG2 == 0 && paint != null) {
                                    if (bArr2 != 0) {
                                        iG = bArr2[iG];
                                    }
                                    paint.setColor(iArr[iG]);
                                    canvas.drawRect(i6, i7, i6 + iG2, i7 + 1, paint);
                                }
                                i6 += iG2;
                                if (z3) {
                                    vVar.c();
                                } else {
                                    paint = paint;
                                    z3 = z3;
                                }
                            }
                            c = '\b';
                            c2 = 4;
                            if (iG2 == 0) {
                            }
                            i6 += iG2;
                            if (z3) {
                                vVar.c();
                            } else {
                                paint = paint;
                                z3 = z3;
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr3 = i == 3 ? bArrA2 == null ? G : bArrA2 : null;
                        boolean z4 = false;
                        while (true) {
                            int iG12 = vVar.g(i11);
                            if (iG12 != 0) {
                                z = z4;
                                iG5 = iG12;
                                iG3 = 1;
                            } else if (vVar.f()) {
                                if (vVar.f()) {
                                    int iG13 = vVar.g(i10);
                                    if (iG13 == 0) {
                                        z = z4;
                                        iG3 = 1;
                                    } else if (iG13 != 1) {
                                        if (iG13 == i10) {
                                            iG3 = vVar.g(i11) + 9;
                                            iG4 = vVar.g(i11);
                                        } else if (iG13 != i9) {
                                            z = z4;
                                            iG3 = 0;
                                        } else {
                                            iG3 = vVar.g(i8) + 25;
                                            iG4 = vVar.g(i11);
                                        }
                                        iG5 = iG4;
                                    } else {
                                        z = z4;
                                        iG3 = i10;
                                    }
                                    iG5 = 0;
                                } else {
                                    iG3 = vVar.g(i10) + 4;
                                    iG5 = vVar.g(i11);
                                }
                                z = z4;
                            } else {
                                int iG14 = vVar.g(i9);
                                if (iG14 != 0) {
                                    iG3 = iG14 + 2;
                                    z = z4;
                                } else {
                                    z = true;
                                    iG3 = 0;
                                }
                                iG5 = 0;
                            }
                            if (iG3 == 0 || paint == 0) {
                                i4 = i9;
                                i5 = i10;
                            } else {
                                if (bArr3 != 0) {
                                    iG5 = bArr3[iG5];
                                }
                                paint.setColor(iArr[iG5]);
                                i4 = i9;
                                i5 = 2;
                                canvas.drawRect(i6, i7, i6 + iG3, i7 + 1, paint);
                            }
                            i6 += iG3;
                            if (z) {
                                vVar.c();
                            } else {
                                z4 = z;
                                i9 = i4;
                                i10 = i5;
                                i11 = 4;
                                i8 = 8;
                            }
                            break;
                        }
                        break;
                    case 18:
                        boolean z5 = false;
                        while (true) {
                            int iG15 = vVar.g(8);
                            if (iG15 != 0) {
                                z2 = z5;
                                iG6 = 1;
                            } else if (vVar.f()) {
                                z2 = z5;
                                iG6 = vVar.g(7);
                                iG15 = vVar.g(8);
                            } else {
                                int iG16 = vVar.g(7);
                                if (iG16 != 0) {
                                    z2 = z5;
                                    iG6 = iG16;
                                    iG15 = 0;
                                } else {
                                    z2 = true;
                                    iG15 = 0;
                                    iG6 = 0;
                                }
                            }
                            if (iG6 != 0 && paint != 0) {
                                paint.setColor(iArr[iG15]);
                                canvas.drawRect(i6, i7, i6 + iG6, i7 + 1, paint);
                            }
                            i6 += iG6;
                            if (!z2) {
                                z5 = z2;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (iG7) {
                            case 32:
                                bArrA3 = a(4, 4, vVar);
                                break;
                            case Token.GETPROP /* 33 */:
                                bArrA = a(4, 8, vVar);
                                break;
                            case Token.GETPROPNOWARN /* 34 */:
                                bArrA2 = a(16, 8, vVar);
                                break;
                        }
                        break;
                }
            } else {
                i7 += 2;
                i6 = i2;
            }
        }
    }

    public static a f(v vVar, int i) {
        int[] iArr;
        int iG;
        int i2;
        int iG2;
        int iG3;
        int iG4;
        int i3 = 8;
        int iG5 = vVar.g(8);
        vVar.o(8);
        int i4 = 2;
        int i5 = i - 2;
        int i6 = 0;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] iArrB = b();
        int[] iArrC = c();
        while (i5 > 0) {
            int iG6 = vVar.g(i3);
            int iG7 = vVar.g(i3);
            if ((iG7 & 128) != 0) {
                iArr = iArr2;
            } else {
                iArr = (iG7 & 64) != 0 ? iArrB : iArrC;
            }
            if ((iG7 & 1) != 0) {
                iG3 = vVar.g(i3);
                iG4 = vVar.g(i3);
                iG = vVar.g(i3);
                iG2 = vVar.g(i3);
                i2 = i5 - 6;
            } else {
                int iG8 = vVar.g(6) << i4;
                int iG9 = vVar.g(4) << 4;
                iG = vVar.g(4) << 4;
                i2 = i5 - 4;
                iG2 = vVar.g(i4) << 6;
                iG3 = iG8;
                iG4 = iG9;
            }
            if (iG3 == 0) {
                iG4 = i6;
                iG = iG4;
                iG2 = 255;
            }
            double d = iG3;
            double d2 = iG4 - 128;
            double d3 = iG - 128;
            iArr[iG6] = d((byte) (255 - (iG2 & 255)), j0.j((int) ((1.402d * d2) + d), 0, 255), j0.j((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), j0.j((int) ((d3 * 1.772d) + d), 0, 255));
            i5 = i2;
            i6 = 0;
            iG5 = iG5;
            iArrC = iArrC;
            i3 = 8;
            i4 = 2;
        }
        return new a(iG5, iArr2, iArrB, iArrC);
    }

    public static c g(v vVar) {
        byte[] bArr;
        int iG = vVar.g(16);
        vVar.o(4);
        int iG2 = vVar.g(2);
        boolean zF = vVar.f();
        vVar.o(1);
        byte[] bArr2 = j0.b;
        if (iG2 != 1) {
            if (iG2 == 0) {
                int iG3 = vVar.g(16);
                int iG4 = vVar.g(16);
                if (iG3 > 0) {
                    bArr2 = new byte[iG3];
                    vVar.j(bArr2, iG3);
                }
                if (iG4 > 0) {
                    bArr = new byte[iG4];
                    vVar.j(bArr, iG4);
                }
            }
            return new c(iG, zF, bArr2, bArr);
        }
        vVar.o(vVar.g(8) * 16);
        bArr = bArr2;
        return new c(iG, zF, bArr2, bArr);
    }

    @Override // androidx.media3.extractor.text.l
    public final void k(byte[] bArr, int i, int i2, k kVar, i iVar) {
        g gVar;
        boolean z;
        androidx.media3.extractor.text.a aVar;
        char c;
        char c2;
        char c3;
        int i3;
        int i4;
        e eVar;
        int i5;
        int i6;
        e eVar2;
        int iG;
        int iG2;
        int i7;
        int iG3;
        v vVar = new v(bArr, i + i2);
        vVar.m(i);
        while (true) {
            int iB = vVar.b();
            gVar = this.C;
            z = true;
            if (iB >= 48 && vVar.g(8) == 15) {
                int iG4 = vVar.g(8);
                int iG5 = vVar.g(16);
                int iG6 = vVar.g(16);
                int iD = vVar.d() + iG6;
                if (iG6 * 8 > vVar.b()) {
                    androidx.media3.common.util.c.t("DvbParser", "Data field length exceeds limit");
                    vVar.o(vVar.b());
                } else {
                    switch (iG4) {
                        case 16:
                            if (iG5 == gVar.a) {
                                u2 u2Var = gVar.i;
                                vVar.g(8);
                                int iG7 = vVar.g(4);
                                int iG8 = vVar.g(2);
                                vVar.o(2);
                                int i8 = iG6 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i8 > 0) {
                                    int iG9 = vVar.g(8);
                                    vVar.o(8);
                                    i8 -= 6;
                                    sparseArray.put(iG9, new d(vVar.g(16), vVar.g(16)));
                                }
                                u2 u2Var2 = new u2(iG7, iG8, sparseArray);
                                if (iG8 != 0) {
                                    gVar.i = u2Var2;
                                    gVar.c.clear();
                                    gVar.d.clear();
                                    gVar.e.clear();
                                } else if (u2Var != null && u2Var.e != iG7) {
                                    gVar.i = u2Var2;
                                }
                            }
                            break;
                        case 17:
                            u2 u2Var3 = gVar.i;
                            SparseArray sparseArray2 = gVar.c;
                            if (iG5 == gVar.a && u2Var3 != null) {
                                int iG10 = vVar.g(8);
                                vVar.o(4);
                                boolean zF = vVar.f();
                                vVar.o(3);
                                int iG11 = vVar.g(16);
                                int iG12 = vVar.g(16);
                                vVar.g(3);
                                int iG13 = vVar.g(3);
                                vVar.o(2);
                                int iG14 = vVar.g(8);
                                int iG15 = vVar.g(8);
                                int iG16 = vVar.g(4);
                                int iG17 = vVar.g(2);
                                vVar.o(2);
                                int i9 = iG6 - 10;
                                SparseArray sparseArray3 = new SparseArray();
                                while (i9 > 0) {
                                    int iG18 = vVar.g(16);
                                    int iG19 = vVar.g(2);
                                    vVar.g(2);
                                    int iG20 = vVar.g(12);
                                    vVar.o(4);
                                    int iG21 = vVar.g(12);
                                    int i10 = i9 - 6;
                                    if (iG19 == 1 || iG19 == 2) {
                                        vVar.g(8);
                                        vVar.g(8);
                                        i9 -= 8;
                                    } else {
                                        i9 = i10;
                                    }
                                    sparseArray3.put(iG18, new f(iG20, iG21));
                                }
                                e eVar3 = new e(iG10, zF, iG11, iG12, iG13, iG14, iG15, iG16, iG17, sparseArray3);
                                if (u2Var3.y == 0 && (eVar2 = (e) sparseArray2.get(iG10)) != null) {
                                    SparseArray sparseArray4 = eVar2.j;
                                    for (int i11 = 0; i11 < sparseArray4.size(); i11++) {
                                        eVar3.j.put(sparseArray4.keyAt(i11), (f) sparseArray4.valueAt(i11));
                                    }
                                }
                                sparseArray2.put(eVar3.a, eVar3);
                            }
                            break;
                        case 18:
                            if (iG5 == gVar.a) {
                                a aVarF = f(vVar, iG6);
                                gVar.d.put(aVarF.a, aVarF);
                            } else if (iG5 == gVar.b) {
                                a aVarF2 = f(vVar, iG6);
                                gVar.f.put(aVarF2.a, aVarF2);
                            }
                            break;
                        case 19:
                            if (iG5 == gVar.a) {
                                c cVarG = g(vVar);
                                gVar.e.put(cVarG.a, cVarG);
                            } else if (iG5 == gVar.b) {
                                c cVarG2 = g(vVar);
                                gVar.g.put(cVarG2.a, cVarG2);
                            }
                            break;
                        case 20:
                            if (iG5 == gVar.a) {
                                vVar.o(4);
                                boolean zF2 = vVar.f();
                                vVar.o(3);
                                int iG22 = vVar.g(16);
                                int iG23 = vVar.g(16);
                                if (zF2) {
                                    int iG24 = vVar.g(16);
                                    iG = vVar.g(16);
                                    iG3 = vVar.g(16);
                                    iG2 = vVar.g(16);
                                    i7 = iG24;
                                } else {
                                    iG = iG22;
                                    iG2 = iG23;
                                    i7 = 0;
                                    iG3 = 0;
                                }
                                gVar.h = new b(iG22, iG23, i7, iG, iG3, iG2);
                            }
                            break;
                    }
                    vVar.p(iD - vVar.d());
                }
            }
        }
        u2 u2Var4 = gVar.i;
        if (u2Var4 == null) {
            e0 e0Var = h0.y;
            aVar = new androidx.media3.extractor.text.a(-9223372036854775807L, -9223372036854775807L, a1.B);
        } else {
            b bVar = gVar.h;
            if (bVar == null) {
                bVar = this.A;
            }
            Bitmap bitmap = this.D;
            Canvas canvas = this.z;
            if (bitmap == null || bVar.a + 1 != bitmap.getWidth() || bVar.b + 1 != this.D.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bVar.a + 1, bVar.b + 1, Bitmap.Config.ARGB_8888);
                this.D = bitmapCreateBitmap;
                canvas.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray5 = (SparseArray) u2Var4.z;
            int i12 = 0;
            while (i12 < sparseArray5.size()) {
                canvas.save();
                d dVar = (d) sparseArray5.valueAt(i12);
                e eVar4 = (e) gVar.c.get(sparseArray5.keyAt(i12));
                int i13 = dVar.a + bVar.c;
                int i14 = dVar.b + bVar.e;
                int i15 = eVar4.c;
                int i16 = eVar4.f;
                int i17 = eVar4.d;
                boolean z2 = z;
                int i18 = i13 + i15;
                int i19 = i14 + i17;
                SparseArray sparseArray6 = sparseArray5;
                canvas.clipRect(i13, i14, Math.min(i18, bVar.d), Math.min(i19, bVar.f));
                a aVar2 = (a) gVar.d.get(i16);
                if (aVar2 == null && (aVar2 = (a) gVar.f.get(i16)) == null) {
                    aVar2 = this.B;
                }
                SparseArray sparseArray7 = eVar4.j;
                int i20 = i12;
                int i21 = 0;
                while (i21 < sparseArray7.size()) {
                    int iKeyAt = sparseArray7.keyAt(i21);
                    SparseArray sparseArray8 = sparseArray7;
                    f fVar = (f) sparseArray7.valueAt(i21);
                    int i22 = i14;
                    c cVar = (c) gVar.e.get(iKeyAt);
                    if (cVar == null) {
                        cVar = (c) gVar.g.get(iKeyAt);
                    }
                    c cVar2 = cVar;
                    if (cVar2 != null) {
                        Paint paint = cVar2.b ? null : this.e;
                        int i23 = i13;
                        int i24 = eVar4.e;
                        int i25 = i23 + fVar.a;
                        int i26 = i22 + fVar.b;
                        int i27 = i17;
                        Paint paint2 = paint;
                        i5 = i23;
                        i4 = i22;
                        e eVar5 = eVar4;
                        int[] iArr = i24 == 3 ? aVar2.d : i24 == 2 ? aVar2.c : aVar2.b;
                        eVar = eVar5;
                        i6 = i27;
                        e(cVar2.c, iArr, i24, i25, i26, paint2, canvas);
                        e(cVar2.d, iArr, i24, i25, i26 + 1, paint2, canvas);
                    } else {
                        i4 = i22;
                        eVar = eVar4;
                        i5 = i13;
                        i6 = i17;
                    }
                    i21++;
                    i15 = i15;
                    i14 = i4;
                    eVar4 = eVar;
                    i13 = i5;
                    arrayList = arrayList;
                    sparseArray7 = sparseArray8;
                    bVar = bVar;
                    gVar = gVar;
                    i17 = i6;
                }
                b bVar2 = bVar;
                ArrayList arrayList2 = arrayList;
                g gVar2 = gVar;
                int i28 = i14;
                e eVar6 = eVar4;
                int i29 = i13;
                int i30 = i15;
                int i31 = i17;
                if (eVar6.b) {
                    int i32 = eVar6.e;
                    if (i32 == 3) {
                        i3 = aVar2.d[eVar6.g];
                        c3 = 2;
                    } else {
                        c3 = 2;
                        i3 = i32 == 2 ? aVar2.c[eVar6.h] : aVar2.b[eVar6.i];
                    }
                    Paint paint3 = this.y;
                    paint3.setColor(i3);
                    c = c3;
                    c2 = 3;
                    canvas.drawRect(i29, i28, i18, i19, paint3);
                } else {
                    c = 2;
                    c2 = 3;
                }
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.D, i29, i28, i30, i31);
                float f = bVar2.a;
                float f2 = bVar2.b;
                arrayList2.add(new androidx.media3.common.text.b(null, null, null, bitmapCreateBitmap2, i28 / f2, 0, 0, i29 / f, 0, Integer.MIN_VALUE, -3.4028235E38f, i30 / f, i31 / f2, false, -16777216, Integer.MIN_VALUE, 0.0f, 0));
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i12 = i20 + 1;
                z = z2;
                bVar = bVar2;
                arrayList = arrayList2;
                gVar = gVar2;
                sparseArray5 = sparseArray6;
            }
            aVar = new androidx.media3.extractor.text.a(-9223372036854775807L, -9223372036854775807L, arrayList);
        }
        iVar.accept(aVar);
    }

    @Override // androidx.media3.extractor.text.l
    public final void reset() {
        g gVar = this.C;
        gVar.c.clear();
        gVar.d.clear();
        gVar.e.clear();
        gVar.f.clear();
        gVar.g.clear();
        gVar.h = null;
        gVar.i = null;
    }

    @Override // androidx.media3.extractor.text.l
    public final int z() {
        return 2;
    }
}
