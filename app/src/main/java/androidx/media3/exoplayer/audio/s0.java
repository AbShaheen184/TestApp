package androidx.media3.exoplayer.audio;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends androidx.media3.common.audio.n {
    public int n;
    public boolean o;
    public int p;
    public long q;
    public byte[] s;
    public byte[] v;
    public int r = 0;
    public int t = 0;
    public int u = 0;
    public final long l = 100000;
    public final float i = 0.2f;
    public final long m = 2000000;
    public final int k = 10;
    public final short j = 1024;

    public s0() {
        byte[] bArr = androidx.media3.common.util.j0.b;
        this.s = bArr;
        this.v = bArr;
    }

    @Override // androidx.media3.common.audio.m
    public final void c(ByteBuffer byteBuffer) {
        int iLimit;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.g.hasRemaining()) {
            int i = this.p;
            short s = this.j;
            if (i == 0) {
                int iLimit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit2, byteBuffer.position() + this.s.length));
                int iLimit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit3 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iLimit3) << 8) | (byteBuffer.get(iLimit3 - 1) & 255)) > s) {
                        int i2 = this.n;
                        iPosition = ((iLimit3 / i2) * i2) + i2;
                        break;
                    }
                    iLimit3 -= 2;
                }
                if (iPosition == byteBuffer.position()) {
                    this.p = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    l(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit2);
            } else {
                if (i != 1) {
                    org.mozilla.javascript.c.a();
                    return;
                }
                com.google.android.material.motion.a.q(this.t < this.s.length);
                int iLimit4 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iPosition2) << 8) | (byteBuffer.get(iPosition2 - 1) & 255)) > s) {
                        int i3 = this.n;
                        iLimit = (iPosition2 / i3) * i3;
                        break;
                    }
                    iPosition2 += 2;
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int length = this.t;
                int i4 = this.u;
                int length2 = length + i4;
                byte[] bArr = this.s;
                if (length2 < bArr.length) {
                    length = bArr.length;
                } else {
                    length2 = i4 - (bArr.length - length);
                }
                int i5 = length - length2;
                boolean z = iLimit < iLimit4;
                int iMin = Math.min(iPosition3, i5);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.s, length2, iMin);
                int i6 = this.u + iMin;
                this.u = i6;
                com.google.android.material.motion.a.q(i6 <= this.s.length);
                boolean z2 = z && iPosition3 < i5;
                n(z2);
                if (z2) {
                    this.p = 0;
                    this.r = 0;
                }
                byteBuffer.limit(iLimit4);
            }
        }
    }

    @Override // androidx.media3.common.audio.n
    public final androidx.media3.common.audio.j h(androidx.media3.common.audio.j jVar) throws androidx.media3.common.audio.l {
        if (jVar.c == 2) {
            return jVar.a == -1 ? androidx.media3.common.audio.j.e : jVar;
        }
        throw new androidx.media3.common.audio.l(jVar);
    }

    @Override // androidx.media3.common.audio.n
    public final void i() {
        if (isActive()) {
            androidx.media3.common.audio.j jVar = this.b;
            int i = jVar.b * 2;
            this.n = i;
            int i2 = ((((int) ((this.l * ((long) jVar.a)) / 1000000)) / 2) / i) * i * 2;
            if (this.s.length != i2) {
                this.s = new byte[i2];
                this.v = new byte[i2];
            }
        }
        this.p = 0;
        this.q = 0L;
        this.r = 0;
        this.t = 0;
        this.u = 0;
    }

    @Override // androidx.media3.common.audio.n, androidx.media3.common.audio.m
    public final boolean isActive() {
        return super.isActive() && this.o;
    }

    @Override // androidx.media3.common.audio.n
    public final void j() {
        if (this.u > 0) {
            n(true);
            this.r = 0;
        }
    }

    @Override // androidx.media3.common.audio.n
    public final void k() {
        this.o = false;
        byte[] bArr = androidx.media3.common.util.j0.b;
        this.s = bArr;
        this.v = bArr;
    }

    public final int m(int i) {
        int length = ((((int) ((this.m * ((long) this.b.a)) / 1000000)) - this.r) * this.n) - (this.s.length / 2);
        com.google.android.material.motion.a.q(length >= 0);
        int iMin = (int) Math.min((i * this.i) + 0.5f, length);
        int i2 = this.n;
        return (iMin / i2) * i2;
    }

    public final void n(boolean z) {
        int length;
        int iM;
        int i = this.u;
        byte[] bArr = this.s;
        if (i == bArr.length || z) {
            if (this.r == 0) {
                if (z) {
                    o(i, 3);
                    length = i;
                } else {
                    com.google.android.material.motion.a.q(i >= bArr.length / 2);
                    length = this.s.length / 2;
                    o(length, 0);
                }
                iM = length;
            } else if (z) {
                int length2 = i - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iM2 = m(length2) + (this.s.length / 2);
                o(iM2, 2);
                iM = iM2;
                length = length3;
            } else {
                length = i - (bArr.length / 2);
                iM = m(length);
                o(iM, 1);
            }
            if (!(length % this.n == 0)) {
                net.luminis.tls.engine.impl.c.r(com.google.android.material.resources.b.p("bytesConsumed is not aligned to frame size: %s", Integer.valueOf(length)));
                return;
            }
            com.google.android.material.motion.a.q(i >= iM);
            this.u -= length;
            int i2 = this.t + length;
            this.t = i2;
            this.t = i2 % this.s.length;
            int i3 = this.r;
            int i4 = this.n;
            this.r = (iM / i4) + i3;
            this.q += (long) ((length - iM) / i4);
        }
    }

    public final void o(int i, int i2) {
        if (i == 0) {
            return;
        }
        com.google.android.material.motion.a.f(this.u >= i);
        int i3 = this.t;
        if (i2 == 2) {
            int i4 = this.u;
            int i5 = i3 + i4;
            byte[] bArr = this.s;
            if (i5 <= bArr.length) {
                System.arraycopy(bArr, i5 - i, this.v, 0, i);
            } else {
                int length = i4 - (bArr.length - i3);
                byte[] bArr2 = this.v;
                if (length >= i) {
                    System.arraycopy(bArr, length - i, bArr2, 0, i);
                } else {
                    int i6 = i - length;
                    System.arraycopy(bArr, bArr.length - i6, bArr2, 0, i6);
                    System.arraycopy(this.s, 0, this.v, i6, length);
                }
            }
        } else {
            int i7 = i3 + i;
            byte[] bArr3 = this.s;
            int length2 = bArr3.length;
            byte[] bArr4 = this.v;
            if (i7 <= length2) {
                System.arraycopy(bArr3, i3, bArr4, 0, i);
            } else {
                int length3 = bArr3.length - i3;
                System.arraycopy(bArr3, i3, bArr4, 0, length3);
                System.arraycopy(this.s, 0, this.v, length3, i - length3);
            }
        }
        com.google.android.material.motion.a.c(i, "sizeToOutput is not aligned to frame size: %s", i % this.n == 0);
        com.google.android.material.motion.a.q(this.t < this.s.length);
        byte[] bArr5 = this.v;
        com.google.android.material.motion.a.c(i, "byteOutput size is not aligned to frame size %s", i % this.n == 0);
        if (i2 != 3) {
            for (int i8 = 0; i8 < i; i8 += 2) {
                int i9 = i8 + 1;
                int i10 = (bArr5[i9] << 8) | (bArr5[i8] & 255);
                int i11 = this.k;
                if (i2 == 0) {
                    i11 = ((((i8 * 1000) / (i - 1)) * (i11 - 100)) / 1000) + 100;
                } else if (i2 == 2) {
                    i11 += (((i8 * 1000) * (100 - i11)) / (i - 1)) / 1000;
                }
                int i12 = (i10 * i11) / 100;
                if (i12 >= 32767) {
                    bArr5[i8] = -1;
                    bArr5[i9] = 127;
                } else if (i12 <= -32768) {
                    bArr5[i8] = 0;
                    bArr5[i9] = -128;
                } else {
                    bArr5[i8] = (byte) (i12 & 255);
                    bArr5[i9] = (byte) (i12 >> 8);
                }
            }
        }
        l(i).put(bArr5, 0, i).flip();
    }
}
