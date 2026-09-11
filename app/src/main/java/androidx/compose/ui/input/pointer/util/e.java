package androidx.compose.ui.input.pointer.util;

import coil3.g;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public final boolean a;
    public final d b;
    public final int c;
    public final a[] d;
    public int e;
    public final float[] f;
    public final float[] g;
    public final float[] h;

    public e(boolean z, d dVar) {
        int i;
        this.a = z;
        this.b = dVar;
        if (z && dVar.equals(d.e)) {
            net.luminis.tls.engine.impl.c.r("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int iOrdinal = dVar.ordinal();
        if (iOrdinal == 0) {
            i = 3;
        } else {
            if (iOrdinal != 1) {
                g.a();
                throw null;
            }
            i = 2;
        }
        this.c = i;
        this.d = new a[20];
        this.f = new float[20];
        this.g = new float[20];
        this.h = new float[3];
    }

    public final void a(float f, long j) {
        int i = (this.e + 1) % 20;
        this.e = i;
        a[] aVarArr = this.d;
        a aVar = aVarArr[i];
        if (aVar != null) {
            aVar.a = j;
            aVar.b = f;
        } else {
            a aVar2 = new a();
            aVar2.a = j;
            aVar2.b = f;
            aVarArr[i] = aVar2;
        }
    }

    public final float b(float f) {
        d dVar;
        float[] fArr;
        float[] fArr2;
        float f2;
        boolean z;
        int i;
        float fSignum;
        float f3 = f;
        float f4 = 0.0f;
        if (f3 <= 0.0f) {
            androidx.compose.ui.internal.a.b("maximumVelocity should be a positive value. You specified=" + f3);
        }
        int i2 = this.e;
        a[] aVarArr = this.d;
        a aVar = aVarArr[i2];
        if (aVar == null) {
            f2 = 0.0f;
        } else {
            int i3 = 0;
            a aVar2 = aVar;
            while (true) {
                a aVar3 = aVarArr[i2];
                boolean z2 = this.a;
                dVar = this.b;
                fArr = this.f;
                fArr2 = this.g;
                if (aVar3 == null) {
                    f2 = f4;
                    z = z2;
                    i = 1;
                    break;
                }
                long j = aVar.a;
                f2 = f4;
                int i4 = i2;
                long j2 = aVar3.a;
                float f5 = j - j2;
                z = z2;
                i = 1;
                float fAbs = Math.abs(j2 - aVar2.a);
                aVar2 = (dVar == d.e || z) ? aVar3 : aVar;
                if (f5 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i3] = aVar3.b;
                fArr2[i3] = -f5;
                i2 = (i4 == 0 ? 20 : i4) - 1;
                i3++;
                if (i3 >= 20) {
                    break;
                }
                f4 = f2;
            }
            if (i3 >= this.c) {
                int iOrdinal = dVar.ordinal();
                if (iOrdinal == 0) {
                    try {
                        float[] fArr3 = this.h;
                        okhttp3.internal.platform.android.g.D(fArr2, fArr, i3, fArr3);
                        fSignum = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        fSignum = f2;
                    }
                } else {
                    if (iOrdinal != i) {
                        g.a();
                        return 0.0f;
                    }
                    int i5 = i3 - i;
                    float f6 = fArr2[i5];
                    int i6 = i5;
                    float fAbs2 = f2;
                    while (i6 > 0) {
                        int i7 = i6 - 1;
                        float f7 = fArr2[i7];
                        if (f6 != f7) {
                            float f8 = (z ? -fArr[i7] : fArr[i6] - fArr[i7]) / (f6 - f7);
                            fAbs2 += Math.abs(f8) * (f8 - (Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2))));
                            if (i6 == i5) {
                                fAbs2 *= 0.5f;
                            }
                        }
                        i6--;
                        f6 = f7;
                    }
                    fSignum = Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2));
                }
                f4 = fSignum * 1000;
            } else {
                f4 = f2;
            }
        }
        if (f4 == f2 || Float.isNaN(f4)) {
            return f2;
        }
        if (f4 <= f2) {
            f3 = -f3;
            if (f4 >= f3) {
                return f4;
            }
        } else if (f4 <= f3) {
            f3 = f4;
        }
        return f3;
    }

    public /* synthetic */ e() {
        this(false, d.e);
    }

    public e(int i) {
        this(true, d.y);
    }
}
