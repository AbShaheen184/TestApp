package androidx.media3.common.util;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v {
    public final /* synthetic */ int a;
    public byte[] b;
    public int c;
    public int d;
    public int e;

    public v(int i, int i2) {
        this.a = 2;
        this.c = i;
        this.d = i2;
        this.b = new byte[(i2 * 2) - 1];
        this.e = 0;
    }

    public void a() {
        int i;
        int i2 = this.c;
        com.google.android.material.motion.a.q(i2 >= 0 && (i2 < (i = this.e) || (i2 == i && this.d == 0)));
    }

    public int b() {
        return ((this.e - this.c) * 8) - this.d;
    }

    public void c() {
        if (this.d == 0) {
            return;
        }
        this.d = 0;
        this.c++;
        a();
    }

    public int d() {
        com.google.android.material.motion.a.q(this.d == 0);
        return this.c;
    }

    public int e() {
        return (this.c * 8) + this.d;
    }

    public boolean f() {
        switch (this.a) {
            case 0:
                boolean z = (this.b[this.c] & (128 >> this.d)) != 0;
                n();
                return z;
            default:
                boolean z2 = (((this.b[this.d] & 255) >> this.e) & 1) == 1;
                o(1);
                return z2;
        }
    }

    public int g(int i) {
        switch (this.a) {
            case 0:
                if (i == 0) {
                    return 0;
                }
                this.d += i;
                int i2 = 0;
                while (true) {
                    int i3 = this.d;
                    if (i3 <= 8) {
                        byte[] bArr = this.b;
                        int i4 = this.c;
                        int i5 = ((-1) >>> (32 - i)) & (i2 | ((bArr[i4] & 255) >> (8 - i3)));
                        if (i3 == 8) {
                            this.d = 0;
                            this.c = i4 + 1;
                        }
                        a();
                        return i5;
                    }
                    int i6 = i3 - 8;
                    this.d = i6;
                    byte[] bArr2 = this.b;
                    int i7 = this.c;
                    this.c = i7 + 1;
                    i2 |= (bArr2[i7] & 255) << i6;
                }
                break;
            default:
                int i8 = this.d;
                int iMin = Math.min(i, 8 - this.e);
                byte[] bArr3 = this.b;
                int i9 = i8 + 1;
                int i10 = ((bArr3[i8] & 255) >> this.e) & (255 >> (8 - iMin));
                while (iMin < i) {
                    i10 |= (bArr3[i9] & 255) << iMin;
                    iMin += 8;
                    i9++;
                }
                int i11 = i10 & ((-1) >>> (32 - i));
                o(i);
                return i11;
        }
    }

    public void h(byte[] bArr, int i) {
        int i2 = i >> 3;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.b;
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            byte b = bArr2[i4];
            int i6 = this.d;
            byte b2 = (byte) (b << i6);
            bArr[i3] = b2;
            bArr[i3] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
        }
        int i7 = i & 7;
        if (i7 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i2] & (255 >> i7));
        bArr[i2] = b3;
        int i8 = this.d;
        if (i8 + i7 > 8) {
            byte[] bArr3 = this.b;
            int i9 = this.c;
            this.c = i9 + 1;
            bArr[i2] = (byte) (b3 | ((bArr3[i9] & 255) << i8));
            this.d = i8 - 8;
        }
        int i10 = this.d + i7;
        this.d = i10;
        byte[] bArr4 = this.b;
        int i11 = this.c;
        bArr[i2] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i2]);
        if (i10 == 8) {
            this.d = 0;
            this.c = i11 + 1;
        }
        a();
    }

    public long i(int i) {
        if (i <= 32) {
            int iG = g(i);
            String str = j0.a;
            return 4294967295L & ((long) iG);
        }
        int iG2 = g(i - 32);
        int iG3 = g(32);
        String str2 = j0.a;
        return (4294967295L & ((long) iG3)) | ((((long) iG2) & 4294967295L) << 32);
    }

    public void j(byte[] bArr, int i) {
        com.google.android.material.motion.a.q(this.d == 0);
        System.arraycopy(this.b, this.c, bArr, 0, i);
        this.c += i;
        a();
    }

    public void k(w wVar) {
        l(wVar.a, wVar.c);
        m(wVar.b * 8);
    }

    public void l(byte[] bArr, int i) {
        this.b = bArr;
        this.c = 0;
        this.d = 0;
        this.e = i;
    }

    public void m(int i) {
        int i2 = i / 8;
        this.c = i2;
        this.d = i - (i2 * 8);
        a();
    }

    public void n() {
        int i = this.d + 1;
        this.d = i;
        if (i == 8) {
            this.d = 0;
            this.c++;
        }
        a();
    }

    public void o(int i) {
        int i2;
        switch (this.a) {
            case 0:
                int i3 = i / 8;
                int i4 = this.c + i3;
                this.c = i4;
                int i5 = (i - (i3 * 8)) + this.d;
                this.d = i5;
                if (i5 > 7) {
                    this.c = i4 + 1;
                    this.d = i5 - 8;
                }
                a();
                break;
            default:
                int i6 = i / 8;
                int i7 = this.d + i6;
                this.d = i7;
                int i8 = (i - (i6 * 8)) + this.e;
                this.e = i8;
                boolean z = true;
                if (i8 > 7) {
                    this.d = i7 + 1;
                    this.e = i8 - 8;
                }
                int i9 = this.d;
                if (i9 < 0 || (i9 >= (i2 = this.c) && (i9 != i2 || this.e != 0))) {
                    z = false;
                }
                com.google.android.material.motion.a.q(z);
                break;
        }
    }

    public void p(int i) {
        com.google.android.material.motion.a.q(this.d == 0);
        this.c += i;
        a();
    }

    public v(byte[] bArr) {
        this.a = 1;
        this.b = bArr;
        this.c = bArr.length;
    }

    public v(byte[] bArr, int i) {
        this.a = 0;
        this.b = bArr;
        this.e = i;
    }

    public v() {
        this.a = 0;
        this.b = j0.b;
    }
}
