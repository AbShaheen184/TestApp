package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.a0;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends c {
    public static final androidx.compose.ui.graphics.a r = new androidx.compose.ui.graphics.a(19);
    public final s d;
    public final float e;
    public final float f;
    public final r g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final i k;
    public final p l;
    public final m m;
    public final i n;
    public final p o;
    public final m p;
    public final boolean q;

    /* JADX WARN: Code duplicated, block: B:42:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:45:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:47:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:53:0x0213  */
    /* JADX WARN: Code duplicated, block: B:56:0x021c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0230  */
    /* JADX WARN: Code duplicated, block: B:65:0x0248  */
    /* JADX WARN: Code duplicated, block: B:68:0x0262 A[EDGE_INSN: B:68:0x0262->B:69:0x0264 BREAK  A[LOOP:1: B:61:0x022a->B:67:0x025b]] */
    /* JADX WARN: Code duplicated, block: B:76:0x0213 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0262 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public q(String str, float[] fArr, s sVar, float[] fArr2, i iVar, i iVar2, float f, float f2, r rVar, int i) {
        int i2;
        float f3;
        float f4;
        float[] fArr3;
        q qVar;
        double d;
        int i3;
        super(i, b.a, str);
        this.d = sVar;
        this.e = f;
        this.f = f2;
        this.g = rVar;
        this.k = iVar;
        boolean z = 1;
        z = 1;
        this.l = new p(this, z ? 1 : 0);
        int i4 = 0;
        this.m = new m(this, i4);
        this.n = iVar2;
        this.o = new p(this, i4);
        this.p = new m(this, z ? 1 : 0);
        if (fArr.length != 6 && fArr.length != 9) {
            net.luminis.tls.engine.impl.c.o("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
            throw null;
        }
        if (f >= f2) {
            throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
        }
        float[] fArr4 = new float[6];
        if (fArr.length == 9) {
            float f5 = fArr[0];
            float f6 = fArr[1];
            float f7 = f5 + f6 + fArr[2];
            fArr4[0] = f5 / f7;
            fArr4[1] = f6 / f7;
            float f8 = fArr[3];
            float f9 = fArr[4];
            float f10 = f8 + f9 + fArr[5];
            fArr4[2] = f8 / f10;
            fArr4[3] = f9 / f10;
            float f11 = fArr[6];
            float f12 = fArr[7];
            float f13 = f11 + f12 + fArr[8];
            fArr4[4] = f11 / f13;
            fArr4[5] = f12 / f13;
        } else {
            System.arraycopy(fArr, 0, fArr4, 0, 6);
        }
        this.h = fArr4;
        if (fArr2 == null) {
            float f14 = fArr4[0];
            float f15 = fArr4[1];
            float f16 = fArr4[2];
            float f17 = fArr4[3];
            float f18 = fArr4[4];
            float f19 = fArr4[5];
            f3 = 1.0f;
            float f20 = sVar.a;
            i2 = 0;
            float f21 = sVar.b;
            float f22 = 1;
            float f23 = (f22 - f14) / f15;
            float f24 = (f22 - f16) / f17;
            float f25 = (f22 - f18) / f19;
            float f26 = (f22 - f20) / f21;
            float f27 = f14 / f15;
            float f28 = (f16 / f17) - f27;
            float f29 = (f20 / f21) - f27;
            float f30 = f24 - f23;
            float f31 = (f18 / f19) - f27;
            float f32 = (((f26 - f23) * f28) - (f29 * f30)) / (((f25 - f23) * f28) - (f30 * f31));
            float f33 = (f29 - (f31 * f32)) / f28;
            float f34 = (1.0f - f33) - f32;
            float f35 = f34 / f15;
            float f36 = f33 / f17;
            float f37 = f32 / f19;
            this.i = new float[]{f35 * f14, f34, ((1.0f - f14) - f15) * f35, f36 * f16, f33, ((1.0f - f16) - f17) * f36, f37 * f18, f32, ((1.0f - f18) - f19) * f37};
        } else {
            i2 = 0;
            f3 = 1.0f;
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.i = fArr2;
        }
        this.j = j.f(this.i);
        float fB = j.b(fArr4);
        float[] fArr5 = d.a;
        if (fB / j.b(d.b) > 0.9f) {
            float[] fArr6 = d.a;
            float f38 = fArr4[i2];
            float f39 = fArr6[i2];
            float f40 = fArr4[1];
            float f41 = fArr6[1];
            float f42 = fArr4[2];
            float f43 = fArr6[2];
            float f44 = fArr4[3];
            float f45 = fArr6[3];
            float f46 = fArr4[4];
            float f47 = fArr6[4];
            float f48 = fArr4[5];
            float f49 = fArr6[5];
            f4 = 0.0f;
            float[] fArr7 = new float[6];
            fArr7[i2] = f38 - f39;
            fArr7[1] = f40 - f41;
            fArr7[2] = f42 - f43;
            fArr7[3] = f44 - f45;
            fArr7[4] = f46 - f47;
            fArr7[5] = f48 - f49;
            float f50 = fArr7[i2];
            float f51 = fArr7[1];
            if (((f41 - f49) * f50) - ((f39 - f47) * f51) >= 0.0f && ((f39 - f43) * f51) - ((f41 - f45) * f50) >= 0.0f) {
                float f52 = fArr7[2];
                float f53 = fArr7[3];
                if (((f45 - f41) * f52) - ((f43 - f39) * f53) >= 0.0f && ((f43 - f47) * f53) - ((f45 - f49) * f52) >= 0.0f) {
                    float f54 = fArr7[4];
                    float f55 = fArr7[5];
                    if (((f49 - f45) * f54) - ((f47 - f43) * f55) < 0.0f || ((f47 - f39) * f55) - ((f49 - f41) * f54) < 0.0f) {
                    }
                }
            }
            if (i != 0) {
                fArr3 = d.a;
                if (fArr4 == fArr3) {
                    i3 = i2;
                    while (true) {
                        if (i3 >= 6) {
                            if (j.d(sVar, j.d)) {
                                break;
                            }
                            float[] fArr8 = d.a;
                            qVar = d.e;
                            while (d <= 1.0d) {
                                if (Math.abs(iVar.a(d) - qVar.k.a(d)) <= 0.001d) {
                                }
                            }
                        } else if (Float.compare(fArr4[i3], fArr3[i3]) != 0 || Math.abs(fArr4[i3] - fArr3[i3]) <= 0.001f) {
                            i3++;
                        }
                        z = i2;
                        break;
                    }
                }
                if (j.d(sVar, j.d) || f != f4 || f2 != f3) {
                    z = i2;
                    break;
                }
                float[] fArr9 = d.a;
                qVar = d.e;
                for (d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                    if (Math.abs(iVar.a(d) - qVar.k.a(d)) <= 0.001d || Math.abs(iVar2.a(d) - qVar.n.a(d)) > 0.001d) {
                        z = i2;
                        break;
                    }
                }
            }
            this.q = z;
        }
        f4 = 0.0f;
        int i5 = (f > f4 ? 1 : (f == f4 ? 0 : -1));
        if (i != 0) {
            fArr3 = d.a;
            if (fArr4 == fArr3) {
                i3 = i2;
                while (true) {
                    if (i3 >= 6) {
                        if (Float.compare(fArr4[i3], fArr3[i3]) != 0) {
                        }
                        i3++;
                    } else {
                        if (j.d(sVar, j.d)) {
                            break;
                        }
                        float[] fArr10 = d.a;
                        qVar = d.e;
                        while (d <= 1.0d) {
                            if (Math.abs(iVar.a(d) - qVar.k.a(d)) <= 0.001d) {
                            }
                        }
                    }
                    z = i2;
                    break;
                }
            }
            if (j.d(sVar, j.d)) {
                z = i2;
                break;
            }
            float[] fArr11 = d.a;
            qVar = d.e;
            while (d <= 1.0d) {
                if (Math.abs(iVar.a(d) - qVar.k.a(d)) <= 0.001d) {
                }
                z = i2;
            }
        }
        this.q = z;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final float a(int i) {
        return this.f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final float b(int i) {
        return this.e;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final boolean c() {
        return this.q;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final long d(float f, float f2, float f3) {
        double d = f;
        m mVar = this.p;
        float fA = (float) mVar.a(d);
        float fA2 = (float) mVar.a(f2);
        float fA3 = (float) mVar.a(f3);
        float[] fArr = this.i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f4 = (fArr[6] * fA3) + (fArr[3] * fA2) + (fArr[0] * fA);
        return (((long) Float.floatToRawIntBits((fArr[7] * fA3) + (fArr[4] * fA2) + (fArr[1] * fA))) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final float e(float f, float f2, float f3) {
        double d = f;
        m mVar = this.p;
        float fA = (float) mVar.a(d);
        float fA2 = (float) mVar.a(f2);
        float fA3 = (float) mVar.a(f3);
        float[] fArr = this.i;
        return (fArr[8] * fA3) + (fArr[5] * fA2) + (fArr[2] * fA);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        q qVar = (q) obj;
        if (Float.compare(qVar.e, this.e) != 0 || Float.compare(qVar.f, this.f) != 0 || !kotlin.jvm.internal.l.a(this.d, qVar.d) || !Arrays.equals(this.h, qVar.h)) {
            return false;
        }
        r rVar = qVar.g;
        r rVar2 = this.g;
        if (rVar2 != null) {
            return kotlin.jvm.internal.l.a(rVar2, rVar);
        }
        if (rVar == null) {
            return true;
        }
        if (kotlin.jvm.internal.l.a(this.k, qVar.k)) {
            return kotlin.jvm.internal.l.a(this.n, qVar.n);
        }
        return false;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final long f(float f, float f2, float f3, float f4, c cVar) {
        float[] fArr = this.j;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        m mVar = this.m;
        return a0.b((float) mVar.a(f5), (float) mVar.a(f6), (float) mVar.a(f7), f4, cVar);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.h) + ((this.d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.e;
        int iFloatToIntBits = (iHashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        r rVar = this.g;
        int iHashCode2 = iFloatToIntBits2 + (rVar != null ? rVar.hashCode() : 0);
        if (rVar == null) {
            return this.n.hashCode() + ((this.k.hashCode() + (iHashCode2 * 31)) * 31);
        }
        return iHashCode2;
    }

    public q(String str, float[] fArr, s sVar, final r rVar, int i) {
        i iVar;
        i iVar2;
        double d = rVar.a;
        boolean z = d == -3.0d;
        double d2 = rVar.g;
        double d3 = rVar.f;
        if (z) {
            final int i2 = 4;
            iVar = new i() { // from class: androidx.compose.ui.graphics.colorspace.o
                @Override // androidx.compose.ui.graphics.colorspace.i
                public final double a(double d4) {
                    int i3 = i2;
                    r rVar2 = rVar;
                    switch (i3) {
                        case 0:
                            float[] fArr2 = d.a;
                            return d.a(rVar2, d4);
                        case 1:
                            float[] fArr3 = d.a;
                            return d.c(rVar2, d4);
                        case 2:
                            double d5 = rVar2.b;
                            return d4 >= rVar2.e ? Math.pow((d5 * d4) + rVar2.c, rVar2.a) : d4 * rVar2.d;
                        case 3:
                            double d6 = rVar2.b;
                            double d7 = rVar2.c;
                            double d8 = rVar2.d;
                            return d4 >= rVar2.e ? Math.pow((d6 * d4) + d7, rVar2.a) + rVar2.f : (d8 * d4) + rVar2.g;
                        case 4:
                            float[] fArr4 = d.a;
                            return d.b(rVar2, d4);
                        case 5:
                            float[] fArr5 = d.a;
                            return d.d(rVar2, d4);
                        case 6:
                            double d9 = rVar2.b;
                            double d10 = rVar2.c;
                            double d11 = rVar2.d;
                            return d4 >= rVar2.e * d11 ? (Math.pow(d4, 1.0d / rVar2.a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = rVar2.b;
                            double d13 = rVar2.c;
                            double d14 = rVar2.d;
                            return d4 >= rVar2.e * d14 ? (Math.pow(d4 - rVar2.f, 1.0d / rVar2.a) - d13) / d12 : (d4 - rVar2.g) / d14;
                    }
                }
            };
        } else if (d == -2.0d) {
            final int i3 = 5;
            iVar = new i() { // from class: androidx.compose.ui.graphics.colorspace.o
                @Override // androidx.compose.ui.graphics.colorspace.i
                public final double a(double d4) {
                    int i4 = i3;
                    r rVar2 = rVar;
                    switch (i4) {
                        case 0:
                            float[] fArr2 = d.a;
                            return d.a(rVar2, d4);
                        case 1:
                            float[] fArr3 = d.a;
                            return d.c(rVar2, d4);
                        case 2:
                            double d5 = rVar2.b;
                            return d4 >= rVar2.e ? Math.pow((d5 * d4) + rVar2.c, rVar2.a) : d4 * rVar2.d;
                        case 3:
                            double d6 = rVar2.b;
                            double d7 = rVar2.c;
                            double d8 = rVar2.d;
                            return d4 >= rVar2.e ? Math.pow((d6 * d4) + d7, rVar2.a) + rVar2.f : (d8 * d4) + rVar2.g;
                        case 4:
                            float[] fArr4 = d.a;
                            return d.b(rVar2, d4);
                        case 5:
                            float[] fArr5 = d.a;
                            return d.d(rVar2, d4);
                        case 6:
                            double d9 = rVar2.b;
                            double d10 = rVar2.c;
                            double d11 = rVar2.d;
                            return d4 >= rVar2.e * d11 ? (Math.pow(d4, 1.0d / rVar2.a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = rVar2.b;
                            double d13 = rVar2.c;
                            double d14 = rVar2.d;
                            return d4 >= rVar2.e * d14 ? (Math.pow(d4 - rVar2.f, 1.0d / rVar2.a) - d13) / d12 : (d4 - rVar2.g) / d14;
                    }
                }
            };
        } else if (d3 == 0.0d && d2 == 0.0d) {
            final int i4 = 6;
            iVar = new i() { // from class: androidx.compose.ui.graphics.colorspace.o
                @Override // androidx.compose.ui.graphics.colorspace.i
                public final double a(double d4) {
                    int i5 = i4;
                    r rVar2 = rVar;
                    switch (i5) {
                        case 0:
                            float[] fArr2 = d.a;
                            return d.a(rVar2, d4);
                        case 1:
                            float[] fArr3 = d.a;
                            return d.c(rVar2, d4);
                        case 2:
                            double d5 = rVar2.b;
                            return d4 >= rVar2.e ? Math.pow((d5 * d4) + rVar2.c, rVar2.a) : d4 * rVar2.d;
                        case 3:
                            double d6 = rVar2.b;
                            double d7 = rVar2.c;
                            double d8 = rVar2.d;
                            return d4 >= rVar2.e ? Math.pow((d6 * d4) + d7, rVar2.a) + rVar2.f : (d8 * d4) + rVar2.g;
                        case 4:
                            float[] fArr4 = d.a;
                            return d.b(rVar2, d4);
                        case 5:
                            float[] fArr5 = d.a;
                            return d.d(rVar2, d4);
                        case 6:
                            double d9 = rVar2.b;
                            double d10 = rVar2.c;
                            double d11 = rVar2.d;
                            return d4 >= rVar2.e * d11 ? (Math.pow(d4, 1.0d / rVar2.a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = rVar2.b;
                            double d13 = rVar2.c;
                            double d14 = rVar2.d;
                            return d4 >= rVar2.e * d14 ? (Math.pow(d4 - rVar2.f, 1.0d / rVar2.a) - d13) / d12 : (d4 - rVar2.g) / d14;
                    }
                }
            };
        } else {
            final int i5 = 7;
            iVar = new i() { // from class: androidx.compose.ui.graphics.colorspace.o
                @Override // androidx.compose.ui.graphics.colorspace.i
                public final double a(double d4) {
                    int i6 = i5;
                    r rVar2 = rVar;
                    switch (i6) {
                        case 0:
                            float[] fArr2 = d.a;
                            return d.a(rVar2, d4);
                        case 1:
                            float[] fArr3 = d.a;
                            return d.c(rVar2, d4);
                        case 2:
                            double d5 = rVar2.b;
                            return d4 >= rVar2.e ? Math.pow((d5 * d4) + rVar2.c, rVar2.a) : d4 * rVar2.d;
                        case 3:
                            double d6 = rVar2.b;
                            double d7 = rVar2.c;
                            double d8 = rVar2.d;
                            return d4 >= rVar2.e ? Math.pow((d6 * d4) + d7, rVar2.a) + rVar2.f : (d8 * d4) + rVar2.g;
                        case 4:
                            float[] fArr4 = d.a;
                            return d.b(rVar2, d4);
                        case 5:
                            float[] fArr5 = d.a;
                            return d.d(rVar2, d4);
                        case 6:
                            double d9 = rVar2.b;
                            double d10 = rVar2.c;
                            double d11 = rVar2.d;
                            return d4 >= rVar2.e * d11 ? (Math.pow(d4, 1.0d / rVar2.a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = rVar2.b;
                            double d13 = rVar2.c;
                            double d14 = rVar2.d;
                            return d4 >= rVar2.e * d14 ? (Math.pow(d4 - rVar2.f, 1.0d / rVar2.a) - d13) / d12 : (d4 - rVar2.g) / d14;
                    }
                }
            };
        }
        if (d == -3.0d) {
            final int i6 = 0;
            iVar2 = new i() { // from class: androidx.compose.ui.graphics.colorspace.o
                @Override // androidx.compose.ui.graphics.colorspace.i
                public final double a(double d4) {
                    int i7 = i6;
                    r rVar2 = rVar;
                    switch (i7) {
                        case 0:
                            float[] fArr2 = d.a;
                            return d.a(rVar2, d4);
                        case 1:
                            float[] fArr3 = d.a;
                            return d.c(rVar2, d4);
                        case 2:
                            double d5 = rVar2.b;
                            return d4 >= rVar2.e ? Math.pow((d5 * d4) + rVar2.c, rVar2.a) : d4 * rVar2.d;
                        case 3:
                            double d6 = rVar2.b;
                            double d7 = rVar2.c;
                            double d8 = rVar2.d;
                            return d4 >= rVar2.e ? Math.pow((d6 * d4) + d7, rVar2.a) + rVar2.f : (d8 * d4) + rVar2.g;
                        case 4:
                            float[] fArr4 = d.a;
                            return d.b(rVar2, d4);
                        case 5:
                            float[] fArr5 = d.a;
                            return d.d(rVar2, d4);
                        case 6:
                            double d9 = rVar2.b;
                            double d10 = rVar2.c;
                            double d11 = rVar2.d;
                            return d4 >= rVar2.e * d11 ? (Math.pow(d4, 1.0d / rVar2.a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = rVar2.b;
                            double d13 = rVar2.c;
                            double d14 = rVar2.d;
                            return d4 >= rVar2.e * d14 ? (Math.pow(d4 - rVar2.f, 1.0d / rVar2.a) - d13) / d12 : (d4 - rVar2.g) / d14;
                    }
                }
            };
        } else if (d == -2.0d) {
            final int i7 = 1;
            iVar2 = new i() { // from class: androidx.compose.ui.graphics.colorspace.o
                @Override // androidx.compose.ui.graphics.colorspace.i
                public final double a(double d4) {
                    int i8 = i7;
                    r rVar2 = rVar;
                    switch (i8) {
                        case 0:
                            float[] fArr2 = d.a;
                            return d.a(rVar2, d4);
                        case 1:
                            float[] fArr3 = d.a;
                            return d.c(rVar2, d4);
                        case 2:
                            double d5 = rVar2.b;
                            return d4 >= rVar2.e ? Math.pow((d5 * d4) + rVar2.c, rVar2.a) : d4 * rVar2.d;
                        case 3:
                            double d6 = rVar2.b;
                            double d7 = rVar2.c;
                            double d8 = rVar2.d;
                            return d4 >= rVar2.e ? Math.pow((d6 * d4) + d7, rVar2.a) + rVar2.f : (d8 * d4) + rVar2.g;
                        case 4:
                            float[] fArr4 = d.a;
                            return d.b(rVar2, d4);
                        case 5:
                            float[] fArr5 = d.a;
                            return d.d(rVar2, d4);
                        case 6:
                            double d9 = rVar2.b;
                            double d10 = rVar2.c;
                            double d11 = rVar2.d;
                            return d4 >= rVar2.e * d11 ? (Math.pow(d4, 1.0d / rVar2.a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = rVar2.b;
                            double d13 = rVar2.c;
                            double d14 = rVar2.d;
                            return d4 >= rVar2.e * d14 ? (Math.pow(d4 - rVar2.f, 1.0d / rVar2.a) - d13) / d12 : (d4 - rVar2.g) / d14;
                    }
                }
            };
        } else if (d3 == 0.0d && d2 == 0.0d) {
            final int i8 = 2;
            iVar2 = new i() { // from class: androidx.compose.ui.graphics.colorspace.o
                @Override // androidx.compose.ui.graphics.colorspace.i
                public final double a(double d4) {
                    int i9 = i8;
                    r rVar2 = rVar;
                    switch (i9) {
                        case 0:
                            float[] fArr2 = d.a;
                            return d.a(rVar2, d4);
                        case 1:
                            float[] fArr3 = d.a;
                            return d.c(rVar2, d4);
                        case 2:
                            double d5 = rVar2.b;
                            return d4 >= rVar2.e ? Math.pow((d5 * d4) + rVar2.c, rVar2.a) : d4 * rVar2.d;
                        case 3:
                            double d6 = rVar2.b;
                            double d7 = rVar2.c;
                            double d8 = rVar2.d;
                            return d4 >= rVar2.e ? Math.pow((d6 * d4) + d7, rVar2.a) + rVar2.f : (d8 * d4) + rVar2.g;
                        case 4:
                            float[] fArr4 = d.a;
                            return d.b(rVar2, d4);
                        case 5:
                            float[] fArr5 = d.a;
                            return d.d(rVar2, d4);
                        case 6:
                            double d9 = rVar2.b;
                            double d10 = rVar2.c;
                            double d11 = rVar2.d;
                            return d4 >= rVar2.e * d11 ? (Math.pow(d4, 1.0d / rVar2.a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = rVar2.b;
                            double d13 = rVar2.c;
                            double d14 = rVar2.d;
                            return d4 >= rVar2.e * d14 ? (Math.pow(d4 - rVar2.f, 1.0d / rVar2.a) - d13) / d12 : (d4 - rVar2.g) / d14;
                    }
                }
            };
        } else {
            final int i9 = 3;
            iVar2 = new i() { // from class: androidx.compose.ui.graphics.colorspace.o
                @Override // androidx.compose.ui.graphics.colorspace.i
                public final double a(double d4) {
                    int i10 = i9;
                    r rVar2 = rVar;
                    switch (i10) {
                        case 0:
                            float[] fArr2 = d.a;
                            return d.a(rVar2, d4);
                        case 1:
                            float[] fArr3 = d.a;
                            return d.c(rVar2, d4);
                        case 2:
                            double d5 = rVar2.b;
                            return d4 >= rVar2.e ? Math.pow((d5 * d4) + rVar2.c, rVar2.a) : d4 * rVar2.d;
                        case 3:
                            double d6 = rVar2.b;
                            double d7 = rVar2.c;
                            double d8 = rVar2.d;
                            return d4 >= rVar2.e ? Math.pow((d6 * d4) + d7, rVar2.a) + rVar2.f : (d8 * d4) + rVar2.g;
                        case 4:
                            float[] fArr4 = d.a;
                            return d.b(rVar2, d4);
                        case 5:
                            float[] fArr5 = d.a;
                            return d.d(rVar2, d4);
                        case 6:
                            double d9 = rVar2.b;
                            double d10 = rVar2.c;
                            double d11 = rVar2.d;
                            return d4 >= rVar2.e * d11 ? (Math.pow(d4, 1.0d / rVar2.a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = rVar2.b;
                            double d13 = rVar2.c;
                            double d14 = rVar2.d;
                            return d4 >= rVar2.e * d14 ? (Math.pow(d4 - rVar2.f, 1.0d / rVar2.a) - d13) / d12 : (d4 - rVar2.g) / d14;
                    }
                }
            };
        }
        this(str, fArr, sVar, null, iVar, iVar2, 0.0f, 1.0f, rVar, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q(String str, float[] fArr, s sVar, final double d, float f, float f2, int i) {
        i iVar;
        i iVar2 = r;
        if (d == 1.0d) {
            iVar = iVar2;
        } else {
            final int i2 = 0;
            iVar = new i() { // from class: androidx.compose.ui.graphics.colorspace.n
                @Override // androidx.compose.ui.graphics.colorspace.i
                public final double a(double d2) {
                    switch (i2) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        if (d != 1.0d) {
            final int i3 = 1;
            iVar2 = new i() { // from class: androidx.compose.ui.graphics.colorspace.n
                @Override // androidx.compose.ui.graphics.colorspace.i
                public final double a(double d2) {
                    switch (i3) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        this(str, fArr, sVar, null, iVar, iVar2, f, f2, new r(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
    }
}
