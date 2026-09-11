package androidx.media3.common.audio;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements p {
    public final short[] a;
    public short[] b;
    public short[] c;
    public short[] d;
    public int e;
    public int f;
    public int g;
    public final /* synthetic */ r h;

    public q(r rVar) {
        this.h = rVar;
        int i = rVar.h;
        this.a = new short[i];
        int i2 = i * rVar.b;
        this.b = new short[i2];
        this.c = new short[i2];
        this.d = new short[i2];
    }

    @Override // androidx.media3.common.audio.p
    public final void a(int i, int i2) {
        for (int i3 = 0; i3 < this.h.b * i2; i3++) {
            this.b[i + i3] = 0;
        }
    }

    @Override // androidx.media3.common.audio.p
    public final void b(int i, int i2) {
        short[] sArr = this.b;
        r rVar = this.h;
        int i3 = rVar.h / i2;
        int i4 = rVar.b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.a[i7] = (short) (i8 / i5);
        }
    }

    @Override // androidx.media3.common.audio.p
    public final int c(int i, int i2, int i3) {
        return s(this.b, i, i2, i3);
    }

    @Override // androidx.media3.common.audio.p
    public final void d() {
        this.g = this.e;
    }

    @Override // androidx.media3.common.audio.p
    public final Object e() {
        return this.b;
    }

    @Override // androidx.media3.common.audio.p
    public final Object f() {
        return this.c;
    }

    @Override // androidx.media3.common.audio.p
    public final void flush() {
        this.g = 0;
        this.e = 0;
        this.f = 0;
    }

    @Override // androidx.media3.common.audio.p
    public final void g(long j, long j2, int i) {
        int i2 = 0;
        while (true) {
            r rVar = this.h;
            int i3 = rVar.b;
            if (i2 >= i3) {
                return;
            }
            short[] sArr = this.c;
            int i4 = (rVar.k * i3) + i2;
            short[] sArr2 = this.d;
            int i5 = (i * i3) + i2;
            short s = sArr2[i5];
            short s2 = sArr2[i5 + i3];
            long j3 = ((long) rVar.n) * j;
            int i6 = rVar.m;
            long j4 = ((long) (i6 + 1)) * j2;
            long j5 = j4 - j3;
            long j6 = j4 - (((long) i6) * j2);
            sArr[i4] = (short) ((((j6 - j5) * ((long) s2)) + (((long) s) * j5)) / j6);
            i2++;
        }
    }

    @Override // androidx.media3.common.audio.p
    public final void h(int i) {
        this.c = r(this.c, this.h.k, i);
    }

    @Override // androidx.media3.common.audio.p
    public final boolean i() {
        int i = this.e;
        return i != 0 && this.h.p != 0 && this.f <= i * 3 && i * 2 > this.g * 3;
    }

    @Override // androidx.media3.common.audio.p
    public final Object j() {
        return this.d;
    }

    @Override // androidx.media3.common.audio.p
    public final void k(int i, int i2, int i3, int i4, int i5) {
        short[] sArr = this.c;
        short[] sArr2 = this.b;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i8] * i10) + ((i - i10) * sArr2[i9])) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    @Override // androidx.media3.common.audio.p
    public final void l(ByteBuffer byteBuffer, int i) {
        ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
        short[] sArr = this.b;
        r rVar = this.h;
        shortBufferAsShortBuffer.get(sArr, rVar.j * rVar.b, i / 2);
        byteBuffer.position(byteBuffer.position() + i);
    }

    @Override // androidx.media3.common.audio.p
    public final void m(int i) {
        this.d = r(this.d, this.h.l, i);
    }

    @Override // androidx.media3.common.audio.p
    public final int n() {
        return 2;
    }

    @Override // androidx.media3.common.audio.p
    public final void o(int i) {
        this.b = r(this.b, this.h.j, i);
    }

    @Override // androidx.media3.common.audio.p
    public final void p(ByteBuffer byteBuffer, int i) {
        ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
        short[] sArr = this.c;
        int i2 = this.h.b;
        shortBufferAsShortBuffer.put(sArr, 0, i * i2);
        byteBuffer.position((i * 2 * i2) + byteBuffer.position());
    }

    @Override // androidx.media3.common.audio.p
    public final int q(int i, int i2) {
        return s(this.a, 0, i, i2);
    }

    public final short[] r(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.h.b;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    public final int s(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.h.b;
        int i5 = 255;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int iAbs = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                iAbs += Math.abs(sArr[i4 + i9] - sArr[(i4 + i2) + i9]);
            }
            if (iAbs * i7 < i6 * i2) {
                i7 = i2;
                i6 = iAbs;
            }
            if (iAbs * i5 > i8 * i2) {
                i5 = i2;
                i8 = iAbs;
            }
            i2++;
        }
        this.e = i6 / i7;
        this.f = i8 / i5;
        return i7;
    }
}
