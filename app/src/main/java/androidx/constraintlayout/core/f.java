package androidx.constraintlayout.core;

import androidx.compose.foundation.text.input.internal.o;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends b {
    public h[] f;
    public h[] g;
    public int h;
    public o i;

    @Override // androidx.constraintlayout.core.b
    public final h d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            h[] hVarArr = this.f;
            h hVar = hVarArr[i2];
            if (!zArr[hVar.y]) {
                o oVar = this.i;
                oVar.y = hVar;
                int i3 = 8;
                if (i != -1) {
                    h hVar2 = hVarArr[i];
                    while (i3 >= 0) {
                        float f = hVar2.E[i3];
                        float f2 = ((h) oVar.y).E[i3];
                        if (f2 != f) {
                            if (f2 >= f) {
                                break;
                            }
                            i = i2;
                            break;
                            break;
                        }
                        i3--;
                    }
                } else {
                    while (i3 >= 0) {
                        float f3 = ((h) oVar.y).E[i3];
                        if (f3 > 0.0f) {
                            break;
                        }
                        if (f3 < 0.0f) {
                            i = i2;
                            break;
                        }
                        i3--;
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f[i];
    }

    @Override // androidx.constraintlayout.core.b
    public final boolean e() {
        return this.h == 0;
    }

    @Override // androidx.constraintlayout.core.b
    public final void i(c cVar, b bVar, boolean z) {
        h hVar = bVar.a;
        if (hVar == null) {
            return;
        }
        float[] fArr = hVar.E;
        a aVar = bVar.d;
        int iD = aVar.d();
        for (int i = 0; i < iD; i++) {
            h hVarE = aVar.e(i);
            float f = aVar.f(i);
            o oVar = this.i;
            oVar.y = hVarE;
            if (hVarE.e) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((h) oVar.y).E;
                    float f2 = (fArr[i2] * f) + fArr2[i2];
                    fArr2[i2] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        ((h) oVar.y).E[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ((f) oVar.z).k((h) oVar.y);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f3 = fArr[i3];
                    if (f3 != 0.0f) {
                        float f4 = f3 * f;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        ((h) oVar.y).E[i3] = f4;
                    } else {
                        ((h) oVar.y).E[i3] = 0.0f;
                    }
                }
                j(hVarE);
            }
            this.b = (bVar.b * f) + this.b;
        }
        k(hVar);
    }

    public final void j(h hVar) {
        int i;
        h[] hVarArr;
        int i2 = this.h + 1;
        h[] hVarArr2 = this.f;
        if (i2 > hVarArr2.length) {
            h[] hVarArr3 = (h[]) Arrays.copyOf(hVarArr2, hVarArr2.length * 2);
            this.f = hVarArr3;
            this.g = (h[]) Arrays.copyOf(hVarArr3, hVarArr3.length * 2);
        }
        h[] hVarArr4 = this.f;
        int i3 = this.h;
        hVarArr4[i3] = hVar;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && hVarArr4[i3].y > hVar.y) {
            int i5 = 0;
            while (true) {
                i = this.h;
                hVarArr = this.g;
                if (i5 >= i) {
                    break;
                }
                hVarArr[i5] = this.f[i5];
                i5++;
            }
            Arrays.sort(hVarArr, 0, i, new e(0));
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f[i6] = this.g[i6];
            }
        }
        hVar.e = true;
        hVar.a(this);
    }

    public final void k(h hVar) {
        int i = 0;
        while (i < this.h) {
            if (this.f[i] == hVar) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        hVar.e = false;
                        return;
                    } else {
                        h[] hVarArr = this.f;
                        int i3 = i + 1;
                        hVarArr[i] = hVarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // androidx.constraintlayout.core.b
    public final String toString() {
        o oVar = this.i;
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.h; i++) {
            oVar.y = this.f[i];
            str = str + oVar + " ";
        }
        return str;
    }
}
