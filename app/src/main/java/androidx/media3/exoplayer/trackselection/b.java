package androidx.media3.exoplayer.trackselection;

import android.os.SystemClock;
import androidx.media3.common.util.e0;
import androidx.media3.common.util.j0;
import androidx.media3.common.w0;
import com.google.common.collect.d0;
import com.google.common.collect.h0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends c {
    public final androidx.media3.exoplayer.upstream.f g;
    public final long h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final h0 o;
    public final e0 p;
    public float q;
    public int r;
    public int s;
    public long t;
    public androidx.media3.exoplayer.source.chunk.k u;

    public b(w0 w0Var, int[] iArr, androidx.media3.exoplayer.upstream.f fVar, long j, long j2, long j3, h0 h0Var) {
        super(w0Var, iArr);
        if (j3 < j) {
            androidx.media3.common.util.c.t("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j3 = j;
        }
        this.g = fVar;
        this.h = j * 1000;
        this.i = j2 * 1000;
        this.j = j3 * 1000;
        this.k = 1279;
        this.l = 719;
        this.m = 0.7f;
        this.n = 0.75f;
        this.o = h0.o(h0Var);
        this.p = e0.a;
        this.q = 1.0f;
        this.s = 0;
        this.t = -9223372036854775807L;
    }

    public static void v(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            d0 d0Var = (d0) arrayList.get(i);
            if (d0Var != null) {
                d0Var.b(new a(j, jArr[i]));
            }
        }
    }

    public static long x(List list) {
        if (!list.isEmpty()) {
            androidx.media3.exoplayer.source.chunk.k kVar = (androidx.media3.exoplayer.source.chunk.k) com.google.common.collect.q.k(list);
            long j = kVar.D;
            if (j != -9223372036854775807L) {
                long j2 = kVar.E;
                if (j2 != -9223372036854775807L) {
                    return j2 - j;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public final int d() {
        return this.r;
    }

    @Override // androidx.media3.exoplayer.trackselection.c, androidx.media3.exoplayer.trackselection.q
    public final void h() {
        this.t = -9223372036854775807L;
        this.u = null;
    }

    @Override // androidx.media3.exoplayer.trackselection.c, androidx.media3.exoplayer.trackselection.q
    public final int j(long j, List list) {
        int i;
        int i2;
        this.p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.t;
        if (j2 != -9223372036854775807L && jElapsedRealtime - j2 < 1000 && (list.isEmpty() || ((androidx.media3.exoplayer.source.chunk.k) com.google.common.collect.q.k(list)).equals(this.u))) {
            return list.size();
        }
        this.t = jElapsedRealtime;
        this.u = list.isEmpty() ? null : (androidx.media3.exoplayer.source.chunk.k) com.google.common.collect.q.k(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jE = j0.E(this.q, ((androidx.media3.exoplayer.source.chunk.k) list.get(size - 1)).D - j);
        long j3 = this.j;
        if (jE >= j3) {
            x(list);
            androidx.media3.common.r rVar = this.d[w(jElapsedRealtime)];
            for (int i3 = 0; i3 < size; i3++) {
                androidx.media3.exoplayer.source.chunk.k kVar = (androidx.media3.exoplayer.source.chunk.k) list.get(i3);
                androidx.media3.common.r rVar2 = kVar.A;
                if (j0.E(this.q, kVar.D - j) >= j3 && rVar2.j < rVar.j && (i = rVar2.w) != -1 && i <= this.l && (i2 = rVar2.v) != -1 && i2 <= this.k && i < rVar.w) {
                    return i3;
                }
            }
        }
        return size;
    }

    @Override // androidx.media3.exoplayer.trackselection.c, androidx.media3.exoplayer.trackselection.q
    public final void k() {
        this.u = null;
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public final void l(long j, long j2, long j3, List list, androidx.media3.exoplayer.source.chunk.l[] lVarArr) {
        long jX;
        this.p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i = this.r;
        if (i >= lVarArr.length || !lVarArr[i].next()) {
            int length = lVarArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    jX = x(list);
                    break;
                }
                androidx.media3.exoplayer.source.chunk.l lVar = lVarArr[i2];
                if (lVar.next()) {
                    jX = lVar.k() - lVar.i();
                    break;
                }
                i2++;
            }
        } else {
            androidx.media3.exoplayer.source.chunk.l lVar2 = lVarArr[this.r];
            jX = lVar2.k() - lVar2.i();
        }
        int i3 = this.s;
        if (i3 == 0) {
            this.s = 1;
            this.r = w(jElapsedRealtime);
            return;
        }
        int i4 = this.r;
        int iB = list.isEmpty() ? -1 : b(((androidx.media3.exoplayer.source.chunk.k) com.google.common.collect.q.k(list)).A);
        if (iB != -1) {
            i3 = ((androidx.media3.exoplayer.source.chunk.k) com.google.common.collect.q.k(list)).B;
            i4 = iB;
        }
        int iW = w(jElapsedRealtime);
        if (iW != i4 && !a(i4, jElapsedRealtime)) {
            androidx.media3.common.r[] rVarArr = this.d;
            androidx.media3.common.r rVar = rVarArr[i4];
            androidx.media3.common.r rVar2 = rVarArr[iW];
            long jMin = this.h;
            if (j3 != -9223372036854775807L) {
                jMin = Math.min((long) ((jX != -9223372036854775807L ? j3 - jX : j3) * this.n), jMin);
            }
            int i5 = rVar2.j;
            int i6 = rVar.j;
            if ((i5 > i6 && j2 < jMin) || (i5 < i6 && j2 >= this.i)) {
                iW = i4;
            }
        }
        if (iW != i4) {
            i3 = 3;
        }
        this.s = i3;
        this.r = iW;
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public final int o() {
        return this.s;
    }

    @Override // androidx.media3.exoplayer.trackselection.c, androidx.media3.exoplayer.trackselection.q
    public final void q(float f) {
        this.q = f;
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public final Object r() {
        return null;
    }

    public final int w(long j) {
        long j2;
        androidx.media3.exoplayer.upstream.f fVar = this.g;
        synchronized (fVar) {
            j2 = fVar.l;
        }
        long j3 = (long) (j2 * this.m);
        this.g.getClass();
        long j4 = (long) (j3 / this.q);
        if (!this.o.isEmpty()) {
            int i = 1;
            while (i < this.o.size() - 1 && ((a) this.o.get(i)).a < j4) {
                i++;
            }
            a aVar = (a) this.o.get(i - 1);
            a aVar2 = (a) this.o.get(i);
            long j5 = aVar.a;
            float f = (j4 - j5) / (aVar2.a - j5);
            long j6 = aVar.b;
            j4 = j6 + ((long) (f * (aVar2.b - j6)));
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            if (j == Long.MIN_VALUE || !a(i3, j)) {
                if (this.d[i3].j <= j4) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }
}
