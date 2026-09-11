package androidx.media3.common.audio;

import androidx.media3.common.util.j0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements m {
    public int b;
    public float c;
    public float d;
    public j e;
    public j f;
    public j g;
    public j h;
    public boolean i;
    public r j;
    public ByteBuffer k;
    public ByteBuffer l;
    public long m;
    public long n;
    public boolean o;

    @Override // androidx.media3.common.audio.m
    public final boolean a() {
        if (this.o) {
            r rVar = this.j;
            if (rVar != null) {
                com.google.android.material.motion.a.q(rVar.k >= 0);
                if (rVar.i.n() * rVar.k * rVar.b == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // androidx.media3.common.audio.m
    public final ByteBuffer b() {
        r rVar = this.j;
        if (rVar != null) {
            p pVar = rVar.i;
            int i = rVar.b;
            com.google.android.material.motion.a.q(rVar.k >= 0);
            int iN = pVar.n() * rVar.k * i;
            if (iN > 0) {
                if (this.k.capacity() < iN) {
                    this.k = ByteBuffer.allocateDirect(iN).order(ByteOrder.nativeOrder());
                } else {
                    this.k.clear();
                }
                ByteBuffer byteBuffer = this.k;
                com.google.android.material.motion.a.q(rVar.k >= 0);
                int iMin = Math.min(byteBuffer.remaining() / (pVar.n() * i), rVar.k);
                pVar.p(byteBuffer, iMin);
                rVar.k -= iMin;
                System.arraycopy(pVar.f(), iMin * i, pVar.f(), 0, rVar.k * i);
                this.k.flip();
                this.n += (long) iN;
                this.l = this.k;
            }
        }
        ByteBuffer byteBuffer2 = this.l;
        this.l = m.a;
        return byteBuffer2;
    }

    @Override // androidx.media3.common.audio.m
    public final void c(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            r rVar = this.j;
            rVar.getClass();
            this.m += (long) byteBuffer.remaining();
            int iRemaining = byteBuffer.remaining();
            int i = rVar.b;
            p pVar = rVar.i;
            int iN = iRemaining / (pVar.n() * i);
            pVar.o(iN);
            pVar.l(byteBuffer, iRemaining);
            rVar.j += iN;
            rVar.b();
        }
    }

    @Override // androidx.media3.common.audio.m
    public final void d(k kVar) {
        if (isActive()) {
            j jVar = this.e;
            this.g = jVar;
            j jVar2 = this.f;
            this.h = jVar2;
            if (this.i) {
                this.j = new r(jVar.a, jVar.b, this.c, this.d, jVar2.a, jVar.c == 4);
            } else {
                r rVar = this.j;
                if (rVar != null) {
                    rVar.j = 0;
                    rVar.k = 0;
                    rVar.l = 0;
                    rVar.m = 0;
                    rVar.n = 0;
                    rVar.o = 0;
                    rVar.p = 0;
                    rVar.q = 0.0d;
                    rVar.i.flush();
                }
            }
        }
        this.l = m.a;
        this.m = 0L;
        this.n = 0L;
        this.o = false;
    }

    @Override // androidx.media3.common.audio.m
    public final void e() {
        r rVar = this.j;
        if (rVar != null) {
            int i = rVar.j;
            float f = rVar.c;
            float f2 = rVar.d;
            double d = f / f2;
            double d2 = rVar.e * f2;
            int i2 = rVar.o;
            int i3 = rVar.k + ((int) ((((((((double) (i - i2)) / d) + ((double) i2)) + rVar.q) + ((double) rVar.l)) / d2) + 0.5d));
            rVar.q = 0.0d;
            p pVar = rVar.i;
            int i4 = rVar.h * 2;
            pVar.o(i4 + i);
            pVar.a(i * rVar.b, i4);
            rVar.j = i4 + rVar.j;
            rVar.b();
            if (rVar.k > i3) {
                rVar.k = Math.max(i3, 0);
            }
            rVar.j = 0;
            rVar.o = 0;
            rVar.l = 0;
        }
        this.o = true;
    }

    @Override // androidx.media3.common.audio.m
    public final j f(j jVar) throws l {
        int i = jVar.c;
        if (i != 2 && i != 4) {
            throw new l(jVar);
        }
        int i2 = this.b;
        if (i2 == -1) {
            i2 = jVar.a;
        }
        this.e = jVar;
        j jVar2 = new j(i2, jVar.b, i);
        this.f = jVar2;
        this.i = true;
        return jVar2;
    }

    @Override // androidx.media3.common.audio.m
    public final long g(long j) {
        if (this.n < 1024) {
            return (long) (j / ((double) this.c));
        }
        long j2 = this.m;
        r rVar = this.j;
        rVar.getClass();
        long jN = j2 - ((long) (rVar.i.n() * (rVar.j * rVar.b)));
        int i = this.h.a;
        int i2 = this.g.a;
        long j3 = this.n;
        return i == i2 ? j0.Y(j, j3, jN, RoundingMode.DOWN) : j0.Y(j, j3 * ((long) i2), jN * ((long) i), RoundingMode.DOWN);
    }

    @Override // androidx.media3.common.audio.m
    public final boolean isActive() {
        if (this.f.a != -1) {
            return Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.a != this.e.a;
        }
        return false;
    }

    @Override // androidx.media3.common.audio.m
    public final void reset() {
        this.c = 1.0f;
        this.d = 1.0f;
        j jVar = j.e;
        this.e = jVar;
        this.f = jVar;
        this.g = jVar;
        this.h = jVar;
        ByteBuffer byteBuffer = m.a;
        this.k = byteBuffer;
        this.l = byteBuffer;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.m = 0L;
        this.n = 0L;
        this.o = false;
    }
}
