package androidx.media3.exoplayer.trackselection;

import android.os.SystemClock;
import androidx.media3.common.util.j0;
import androidx.media3.common.w0;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements q {
    public final w0 a;
    public final int b;
    public final int[] c;
    public final androidx.media3.common.r[] d;
    public final long[] e;
    public int f;

    public c(w0 w0Var, int[] iArr) {
        androidx.media3.common.r[] rVarArr;
        int i = 0;
        com.google.android.material.motion.a.q(iArr.length > 0);
        w0Var.getClass();
        this.a = w0Var;
        int length = iArr.length;
        this.b = length;
        this.d = new androidx.media3.common.r[length];
        int i2 = 0;
        while (true) {
            int length2 = iArr.length;
            rVarArr = this.d;
            if (i2 >= length2) {
                break;
            }
            rVarArr[i2] = w0Var.d[iArr[i2]];
            i2++;
        }
        Arrays.sort(rVarArr, new androidx.compose.foundation.lazy.layout.a(9));
        this.c = new int[this.b];
        while (true) {
            int i3 = this.b;
            if (i >= i3) {
                this.e = new long[i3];
                return;
            } else {
                this.c[i] = w0Var.a(this.d[i]);
                i++;
            }
        }
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public final boolean a(int i, long j) {
        return this.e[i] > j;
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public final int b(androidx.media3.common.r rVar) {
        for (int i = 0; i < this.b; i++) {
            if (this.d[i] == rVar) {
                return i;
            }
        }
        return -1;
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public final w0 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c cVar = (c) obj;
            if (this.a.equals(cVar.a) && Arrays.equals(this.c, cVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public final androidx.media3.common.r g(int i) {
        return this.d[i];
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        }
        return this.f;
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public final int i(int i) {
        return this.c[i];
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public int j(long j, List list) {
        return list.size();
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public final int length() {
        return this.c.length;
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public final int m() {
        return this.c[d()];
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public final androidx.media3.common.r n() {
        return this.d[d()];
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public final boolean p(int i, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zA = a(i, jElapsedRealtime);
        int i2 = 0;
        while (i2 < this.b && !zA) {
            zA = (i2 == i || a(i2, jElapsedRealtime)) ? false : true;
            i2++;
        }
        if (!zA) {
            return false;
        }
        long[] jArr = this.e;
        jArr[i] = Math.max(jArr[i], j0.a(jElapsedRealtime, j));
        return true;
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public final int u(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public void h() {
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public void k() {
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public final void f(boolean z) {
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public void q(float f) {
    }
}
