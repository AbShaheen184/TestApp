package androidx.media3.exoplayer.audio;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends androidx.media3.common.audio.n {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m;
    public int n;
    public long o;

    @Override // androidx.media3.common.audio.n, androidx.media3.common.audio.m
    public final boolean a() {
        return super.a() && this.n == 0;
    }

    @Override // androidx.media3.common.audio.n, androidx.media3.common.audio.m
    public final ByteBuffer b() {
        int i;
        if (super.a() && (i = this.n) > 0) {
            l(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.b();
    }

    @Override // androidx.media3.common.audio.m
    public final void c(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.l);
        this.o += (long) (iMin / this.b.d);
        this.l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.l > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.n + i2) - this.m.length;
        ByteBuffer byteBufferL = l(length);
        int iJ = androidx.media3.common.util.j0.j(length, 0, this.n);
        byteBufferL.put(this.m, 0, iJ);
        int iJ2 = androidx.media3.common.util.j0.j(length - iJ, 0, i2);
        byteBuffer.limit(byteBuffer.position() + iJ2);
        byteBufferL.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i3 = i2 - iJ2;
        int i4 = this.n - iJ;
        this.n = i4;
        byte[] bArr = this.m;
        System.arraycopy(bArr, iJ, bArr, 0, i4);
        byteBuffer.get(this.m, this.n, i3);
        this.n += i3;
        byteBufferL.flip();
    }

    @Override // androidx.media3.common.audio.m
    public final long g(long j) {
        return Math.max(0L, j - androidx.media3.common.util.j0.W(this.b.a, this.j + this.i));
    }

    @Override // androidx.media3.common.audio.n
    public final androidx.media3.common.audio.j h(androidx.media3.common.audio.j jVar) throws androidx.media3.common.audio.l {
        if (!androidx.media3.common.util.j0.M(jVar.c)) {
            throw new androidx.media3.common.audio.l(jVar);
        }
        this.k = true;
        return (this.i == 0 && this.j == 0) ? androidx.media3.common.audio.j.e : jVar;
    }

    @Override // androidx.media3.common.audio.n
    public final void i() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // androidx.media3.common.audio.n
    public final void j() {
        if (this.k) {
            int i = this.n;
            if (i > 0) {
                this.o += (long) (i / this.b.d);
            }
            this.n = 0;
        }
    }

    @Override // androidx.media3.common.audio.n
    public final void k() {
        this.m = androidx.media3.common.util.j0.b;
    }
}
