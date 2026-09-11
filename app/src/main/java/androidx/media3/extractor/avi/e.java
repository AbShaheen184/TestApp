package androidx.media3.extractor.avi;

import androidx.media3.common.util.j0;
import androidx.media3.extractor.b0;
import androidx.media3.extractor.h0;
import androidx.media3.extractor.z;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public final d a;
    public final h0 b;
    public final int c;
    public final int d;
    public final long e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public long[] m;
    public int[] n;

    public e(int i, d dVar, h0 h0Var) {
        int i2 = dVar.d;
        this.a = dVar;
        int iB = dVar.b();
        boolean z = true;
        if (iB != 1 && iB != 2) {
            z = false;
        }
        com.google.android.material.motion.a.f(z);
        int i3 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.c = (iB == 2 ? 1667497984 : 1651965952) | i3;
        long j = ((long) dVar.b) * 1000000;
        long j2 = dVar.c;
        String str = j0.a;
        this.e = j0.Y(i2, j, j2, RoundingMode.DOWN);
        this.b = h0Var;
        this.d = iB == 2 ? i3 | 1650720768 : -1;
        this.l = -1L;
        this.m = new long[512];
        this.n = new int[512];
        this.f = i2;
    }

    public final b0 a(int i) {
        return new b0(((this.e * ((long) 1)) / ((long) this.f)) * ((long) this.n[i]), this.m[i]);
    }

    public final z b(long j) {
        if (this.k == 0) {
            b0 b0Var = new b0(0L, this.l);
            return new z(b0Var, b0Var);
        }
        int i = (int) (j / ((this.e * ((long) 1)) / ((long) this.f)));
        int iE = j0.e(this.n, i, true, true);
        if (this.n[iE] == i) {
            b0 b0VarA = a(iE);
            return new z(b0VarA, b0VarA);
        }
        b0 b0VarA2 = a(iE);
        int i2 = iE + 1;
        return i2 < this.m.length ? new z(b0VarA2, a(i2)) : new z(b0VarA2, b0VarA2);
    }
}
