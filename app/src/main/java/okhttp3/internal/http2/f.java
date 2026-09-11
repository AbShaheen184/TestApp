package okhttp3.internal.http2;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final okio.f a;
    public boolean c;
    public int g;
    public int h;
    public int b = Integer.MAX_VALUE;
    public int d = 4096;
    public d[] e = new d[8];
    public int f = 7;

    public f(okio.f fVar) {
        this.a = fVar;
    }

    public final void a(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                d dVar = this.e[length];
                dVar.getClass();
                i -= dVar.c;
                int i4 = this.h;
                d dVar2 = this.e[length];
                dVar2.getClass();
                this.h = i4 - dVar2.c;
                this.g--;
                i3++;
                length--;
            }
            d[] dVarArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(dVarArr, i5, dVarArr, i5 + i3, this.g);
            d[] dVarArr2 = this.e;
            int i6 = this.f + 1;
            Arrays.fill(dVarArr2, i6, i6 + i3, (Object) null);
            this.f += i3;
        }
    }

    public final void b(d dVar) {
        int i = dVar.c;
        int i2 = this.d;
        if (i > i2) {
            d[] dVarArr = this.e;
            kotlin.collections.n.K(0, dVarArr.length, null, dVarArr);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        a((this.h + i) - i2);
        int i3 = this.g + 1;
        d[] dVarArr2 = this.e;
        if (i3 > dVarArr2.length) {
            d[] dVarArr3 = new d[dVarArr2.length * 2];
            System.arraycopy(dVarArr2, 0, dVarArr3, dVarArr2.length, dVarArr2.length);
            this.f = this.e.length - 1;
            this.e = dVarArr3;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        this.e[i4] = dVar;
        this.g++;
        this.h += i;
    }

    public final void c(okio.i iVar) throws EOFException {
        iVar.getClass();
        int[] iArr = y.a;
        int iF = iVar.f();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < iF; i++) {
            byte bK = iVar.k(i);
            byte[] bArr = okhttp3.internal.e.a;
            j2 += (long) y.b[bK & 255];
        }
        int i2 = (int) ((j2 + ((long) 7)) >> 3);
        int iF2 = iVar.f();
        okio.f fVar = this.a;
        if (i2 >= iF2) {
            e(iVar.f(), 127, 0);
            fVar.m0(iVar);
            return;
        }
        okio.f fVar2 = new okio.f();
        int[] iArr2 = y.a;
        int iF3 = iVar.f();
        int i3 = 0;
        for (int i4 = 0; i4 < iF3; i4++) {
            byte bK2 = iVar.k(i4);
            byte[] bArr2 = okhttp3.internal.e.a;
            int i5 = bK2 & 255;
            int i6 = y.a[i5];
            byte b = y.b[i5];
            j = (j << b) | ((long) i6);
            i3 += b;
            while (i3 >= 8) {
                i3 -= 8;
                fVar2.o0((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            fVar2.o0((int) ((j << (8 - i3)) | (255 >>> i3)));
        }
        okio.i iVarK = fVar2.k(fVar2.y);
        e(iVarK.f(), 127, 128);
        fVar.m0(iVarK);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    public final void d(ArrayList arrayList) throws EOFException {
        int length;
        int length2;
        if (this.c) {
            int i = this.b;
            if (i < this.d) {
                e(i, 31, 32);
            }
            this.c = false;
            this.b = Integer.MAX_VALUE;
            e(this.d, 31, 32);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = (d) arrayList.get(i2);
            okio.i iVarS = dVar.a.s();
            okio.i iVar = dVar.b;
            Integer num = (Integer) g.b.get(iVarS);
            if (num != null) {
                int iIntValue = num.intValue();
                length2 = iIntValue + 1;
                if (2 > length2 || length2 >= 8) {
                    length = length2;
                    length2 = -1;
                } else {
                    d[] dVarArr = g.a;
                    if (kotlin.jvm.internal.l.a(dVarArr[iIntValue].b, iVar)) {
                        length = length2;
                    } else if (kotlin.jvm.internal.l.a(dVarArr[length2].b, iVar)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                }
            } else {
                length = -1;
                length2 = -1;
            }
            if (length2 == -1) {
                int length3 = this.e.length;
                for (int i3 = this.f + 1; i3 < length3; i3++) {
                    d dVar2 = this.e[i3];
                    dVar2.getClass();
                    if (kotlin.jvm.internal.l.a(dVar2.a, iVarS)) {
                        d dVar3 = this.e[i3];
                        dVar3.getClass();
                        if (kotlin.jvm.internal.l.a(dVar3.b, iVar)) {
                            length2 = g.a.length + (i3 - this.f);
                            break;
                        } else if (length == -1) {
                            length = (i3 - this.f) + g.a.length;
                        }
                    }
                }
            }
            if (length2 != -1) {
                e(length2, 127, 128);
            } else if (length == -1) {
                this.a.o0(64);
                c(iVarS);
                c(iVar);
                b(dVar);
            } else {
                okio.i iVar2 = d.d;
                iVarS.getClass();
                iVar2.getClass();
                if (!iVarS.n(0, iVar2, iVar2.f()) || kotlin.jvm.internal.l.a(d.i, iVarS)) {
                    e(length, 63, 64);
                    c(iVar);
                    b(dVar);
                } else {
                    e(length, 15, 0);
                    c(iVar);
                }
            }
        }
    }

    public final void e(int i, int i2, int i3) {
        okio.f fVar = this.a;
        if (i < i2) {
            fVar.o0(i | i3);
            return;
        }
        fVar.o0(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            fVar.o0(128 | (i4 & 127));
            i4 >>>= 7;
        }
        fVar.o0(i4);
    }
}
