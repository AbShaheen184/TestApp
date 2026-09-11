package androidx.constraintlayout.core;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Comparable {
    public float B;
    public int I;
    public boolean e;
    public int y = -1;
    public int z = -1;
    public int A = 0;
    public boolean C = false;
    public final float[] D = new float[9];
    public final float[] E = new float[9];
    public b[] F = new b[16];
    public int G = 0;
    public int H = 0;

    public h(int i) {
        this.I = i;
    }

    public final void a(b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.G;
            b[] bVarArr = this.F;
            if (i >= i2) {
                if (i2 >= bVarArr.length) {
                    this.F = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.F;
                int i3 = this.G;
                bVarArr2[i3] = bVar;
                this.G = i3 + 1;
                return;
            }
            if (bVarArr[i] == bVar) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.y - ((h) obj).y;
    }

    public final void d(b bVar) {
        int i = this.G;
        int i2 = 0;
        while (i2 < i) {
            if (this.F[i2] == bVar) {
                while (i2 < i - 1) {
                    b[] bVarArr = this.F;
                    int i3 = i2 + 1;
                    bVarArr[i2] = bVarArr[i3];
                    i2 = i3;
                }
                this.G--;
                return;
            }
            i2++;
        }
    }

    public final void e() {
        this.I = 5;
        this.A = 0;
        this.y = -1;
        this.z = -1;
        this.B = 0.0f;
        this.C = false;
        int i = this.G;
        for (int i2 = 0; i2 < i; i2++) {
            this.F[i2] = null;
        }
        this.G = 0;
        this.H = 0;
        this.e = false;
        Arrays.fill(this.E, 0.0f);
    }

    public final void f(c cVar, float f) {
        this.B = f;
        this.C = true;
        int i = this.G;
        this.z = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.F[i2].h(cVar, this, false);
        }
        this.G = 0;
    }

    public final void g(c cVar, b bVar) {
        int i = this.G;
        for (int i2 = 0; i2 < i; i2++) {
            this.F[i2].i(cVar, bVar, false);
        }
        this.G = 0;
    }

    public final String toString() {
        return "" + this.y;
    }
}
