package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.analyzer.b;
import androidx.constraintlayout.core.widgets.c;
import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.core.widgets.e;
import androidx.constraintlayout.core.widgets.f;
import androidx.constraintlayout.core.widgets.g;
import androidx.constraintlayout.core.widgets.h;
import androidx.constraintlayout.widget.r;
import androidx.constraintlayout.widget.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class Flow extends t {
    public final g G;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new int[32];
        this.D = new HashMap();
        this.z = context;
        super.g(attributeSet);
        g gVar = new g();
        gVar.r0 = 0;
        gVar.s0 = 0;
        gVar.t0 = 0;
        gVar.u0 = 0;
        gVar.v0 = 0;
        gVar.w0 = 0;
        gVar.x0 = false;
        gVar.y0 = 0;
        gVar.z0 = 0;
        gVar.A0 = new b();
        gVar.B0 = null;
        gVar.C0 = -1;
        gVar.D0 = -1;
        gVar.E0 = -1;
        gVar.F0 = -1;
        gVar.G0 = -1;
        gVar.H0 = -1;
        gVar.I0 = 0.5f;
        gVar.J0 = 0.5f;
        gVar.K0 = 0.5f;
        gVar.L0 = 0.5f;
        gVar.M0 = 0.5f;
        gVar.N0 = 0.5f;
        gVar.O0 = 0;
        gVar.P0 = 0;
        gVar.Q0 = 2;
        gVar.R0 = 2;
        gVar.S0 = 0;
        gVar.T0 = -1;
        gVar.U0 = 0;
        gVar.V0 = new ArrayList();
        gVar.W0 = null;
        gVar.X0 = null;
        gVar.Y0 = null;
        gVar.a1 = 0;
        this.G = gVar;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.G.U0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    g gVar2 = this.G;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.r0 = dimensionPixelSize;
                    gVar2.s0 = dimensionPixelSize;
                    gVar2.t0 = dimensionPixelSize;
                    gVar2.u0 = dimensionPixelSize;
                } else if (index == 18) {
                    g gVar3 = this.G;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar3.t0 = dimensionPixelSize2;
                    gVar3.v0 = dimensionPixelSize2;
                    gVar3.w0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.G.u0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.G.v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.G.r0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.G.w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.G.s0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.G.S0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.G.C0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.G.D0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.G.E0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.G.G0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.G.F0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.G.H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.G.I0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.G.K0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.G.M0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.G.L0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.G.N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.G.J0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.G.Q0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.G.R0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.G.O0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.G.P0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.G.T0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.A = this.G;
        i();
    }

    @Override // androidx.constraintlayout.widget.c
    public final void h(d dVar, boolean z) {
        g gVar = this.G;
        int i = gVar.t0;
        if (i > 0 || gVar.u0 > 0) {
            if (z) {
                gVar.v0 = gVar.u0;
                gVar.w0 = i;
            } else {
                gVar.v0 = i;
                gVar.w0 = gVar.u0;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0154  */
    /* JADX WARN: Code duplicated, block: B:107:0x015c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0168  */
    /* JADX WARN: Code duplicated, block: B:122:0x017b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x017d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0188  */
    /* JADX WARN: Code duplicated, block: B:129:0x019f  */
    /* JADX WARN: Code duplicated, block: B:138:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:141:0x01be  */
    /* JADX WARN: Code duplicated, block: B:143:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:148:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:156:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:161:0x0203  */
    /* JADX WARN: Code duplicated, block: B:166:0x0221  */
    /* JADX WARN: Code duplicated, block: B:168:0x0227 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:169:0x0229  */
    /* JADX WARN: Code duplicated, block: B:174:0x0239  */
    /* JADX WARN: Code duplicated, block: B:176:0x0241 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:177:0x0243  */
    /* JADX WARN: Code duplicated, block: B:182:0x0257  */
    /* JADX WARN: Code duplicated, block: B:186:0x025f  */
    /* JADX WARN: Code duplicated, block: B:187:0x0261  */
    /* JADX WARN: Code duplicated, block: B:193:0x0288 A[PHI: r28 r30 r31 r32 r33 r35
  0x0288: PHI (r28v1 char) = (r28v0 char), (r28v3 char), (r28v4 char) binds: [B:293:0x04ac, B:291:0x0493, B:192:0x027c] A[DONT_GENERATE, DONT_INLINE]
  0x0288: PHI (r30v1 int) = (r30v0 int), (r30v3 int), (r30v4 int) binds: [B:293:0x04ac, B:291:0x0493, B:192:0x027c] A[DONT_GENERATE, DONT_INLINE]
  0x0288: PHI (r31v1 int) = (r31v0 int), (r31v3 int), (r31v4 int) binds: [B:293:0x04ac, B:291:0x0493, B:192:0x027c] A[DONT_GENERATE, DONT_INLINE]
  0x0288: PHI (r32v1 int) = (r32v0 int), (r32v3 int), (r32v4 int) binds: [B:293:0x04ac, B:291:0x0493, B:192:0x027c] A[DONT_GENERATE, DONT_INLINE]
  0x0288: PHI (r33v1 int[]) = (r33v0 int[]), (r33v3 int[]), (r33v4 int[]) binds: [B:293:0x04ac, B:291:0x0493, B:192:0x027c] A[DONT_GENERATE, DONT_INLINE]
  0x0288: PHI (r35v1 int) = (r35v0 int), (r35v3 int), (r35v4 int) binds: [B:293:0x04ac, B:291:0x0493, B:192:0x027c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:194:0x028c  */
    /* JADX WARN: Code duplicated, block: B:197:0x029d  */
    /* JADX WARN: Code duplicated, block: B:199:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:201:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:203:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:220:0x030c  */
    /* JADX WARN: Code duplicated, block: B:222:0x032a  */
    /* JADX WARN: Code duplicated, block: B:224:0x0331  */
    /* JADX WARN: Code duplicated, block: B:226:0x0340  */
    /* JADX WARN: Code duplicated, block: B:228:0x0346  */
    /* JADX WARN: Code duplicated, block: B:230:0x0353  */
    /* JADX WARN: Code duplicated, block: B:247:0x0378  */
    /* JADX WARN: Code duplicated, block: B:249:0x0390  */
    /* JADX WARN: Code duplicated, block: B:251:0x0394  */
    /* JADX WARN: Code duplicated, block: B:260:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:265:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:267:0x03da  */
    /* JADX WARN: Code duplicated, block: B:268:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:272:0x0405  */
    /* JADX WARN: Code duplicated, block: B:274:0x040d  */
    /* JADX WARN: Code duplicated, block: B:276:0x0411  */
    /* JADX WARN: Code duplicated, block: B:277:0x0422  */
    /* JADX WARN: Code duplicated, block: B:280:0x0444  */
    /* JADX WARN: Code duplicated, block: B:282:0x044d  */
    /* JADX WARN: Code duplicated, block: B:284:0x0453  */
    /* JADX WARN: Code duplicated, block: B:285:0x0464  */
    /* JADX WARN: Code duplicated, block: B:288:0x0484  */
    /* JADX WARN: Code duplicated, block: B:292:0x049b  */
    /* JADX WARN: Code duplicated, block: B:295:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:297:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:298:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:301:0x050b A[LOOP:14: B:300:0x0509->B:301:0x050b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:306:0x0534 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:307:0x0536  */
    /* JADX WARN: Code duplicated, block: B:308:0x053b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:309:0x053d  */
    /* JADX WARN: Code duplicated, block: B:310:0x053f  */
    /* JADX WARN: Code duplicated, block: B:313:0x0543 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:314:0x0545  */
    /* JADX WARN: Code duplicated, block: B:315:0x054a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:316:0x054c  */
    /* JADX WARN: Code duplicated, block: B:317:0x054e  */
    /* JADX WARN: Code duplicated, block: B:320:0x055d  */
    /* JADX WARN: Code duplicated, block: B:321:0x0560  */
    /* JADX WARN: Code duplicated, block: B:332:0x00d3 A[EDGE_INSN: B:332:0x00d3->B:59:0x00d3 BREAK  A[LOOP:1: B:53:0x00bc->B:58:0x00ce], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:334:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:0x013b A[EDGE_INSN: B:338:0x013b->B:93:0x013b BREAK  A[LOOP:3: B:81:0x011d->B:92:0x0136], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:0x013b A[EDGE_INSN: B:339:0x013b->B:93:0x013b BREAK  A[LOOP:3: B:81:0x011d->B:92:0x0136], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:341:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:353:0x0232 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:356:0x024c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:358:0x0162 A[EDGE_INSN: B:358:0x0162->B:109:0x0162 BREAK  A[LOOP:9: B:98:0x0148->B:108:0x015f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:360:0x015f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0097  */
    /* JADX WARN: Code duplicated, block: B:40:0x009f  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00de  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:76:0x0102  */
    /* JADX WARN: Code duplicated, block: B:77:0x0112  */
    /* JADX WARN: Code duplicated, block: B:79:0x0118 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x011a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0121 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0123  */
    /* JADX WARN: Code duplicated, block: B:88:0x012b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0133  */
    /* JADX WARN: Code duplicated, block: B:94:0x013d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0141  */
    /* JADX WARN: Code duplicated, block: B:97:0x0145  */
    /* JADX WARN: Code duplicated, block: B:99:0x014a A[DONT_INVERT] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.constraintlayout.widget.t
    public final void j(g gVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr;
        int i7;
        int i8;
        int i9;
        d[] dVarArr;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        d[] dVarArr2;
        int i15;
        int i16;
        int i17;
        int[] iArr2;
        int i18;
        int i19;
        int i20;
        char c;
        int i21;
        f fVar;
        int i22;
        char c2;
        int i23;
        int i24;
        boolean z;
        int i25;
        char c3;
        int[] iArr3;
        int i26;
        c cVar;
        c cVar2;
        f fVar2;
        int i27;
        f fVar3;
        int i28;
        int i29;
        int i30;
        int i31;
        d dVar;
        int iO;
        boolean z2;
        int i32;
        int size;
        int[] iArr4;
        int i33;
        boolean z3;
        c cVar3;
        int i34;
        int i35;
        int i36;
        int i37;
        c cVar4;
        c cVar5;
        c cVar6;
        int i38;
        int iMax;
        int i39;
        f fVar4;
        int i40;
        int iD;
        int iC;
        int i41;
        f fVar5;
        f fVar6;
        int i42;
        int i43;
        d dVar2;
        int iP;
        int i44;
        int i45;
        boolean z4;
        d dVar3;
        int i46;
        int i47;
        int i48;
        int i49;
        int iCeil;
        int iCeil2;
        int i50;
        int i51;
        int i52;
        d dVar4;
        int iO2;
        boolean z5;
        d[] dVarArr3;
        d[] dVarArr4;
        int i53;
        int i54;
        int i55;
        int iP2;
        int i56;
        int iO3;
        d dVar5;
        d dVar6;
        int i57;
        int i58;
        int i59;
        int i60;
        d dVar7;
        d[] dVarArr5;
        d dVar8;
        d dVar9;
        int i61;
        int i62;
        d dVar10;
        int iP3;
        int i63;
        int i64;
        d dVar11;
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size3 = View.MeasureSpec.getSize(i2);
        int i65 = 0;
        if (gVar == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        ArrayList arrayList = gVar.V0;
        if (gVar.q0 > 0) {
            b bVar = gVar.A0;
            d dVar12 = gVar.S;
            androidx.constraintlayout.widget.f fVar7 = dVar12 != null ? ((e) dVar12).t0 : null;
            if (fVar7 == null) {
                gVar.y0 = 0;
                gVar.z0 = 0;
                gVar.x0 = false;
            } else {
                int i66 = 0;
                while (i66 < gVar.q0) {
                    d dVar13 = gVar.p0[i66];
                    if (dVar13 != null && !(dVar13 instanceof h)) {
                        int iJ = dVar13.j(i65);
                        int iJ2 = dVar13.j(1);
                        if (iJ != 3 || dVar13.q == 1 || iJ2 != 3 || dVar13.r == 1) {
                            if (iJ == 3) {
                                iJ = 2;
                            }
                            if (iJ2 == 3) {
                                iJ2 = 2;
                            }
                            bVar.a = iJ;
                            bVar.b = iJ2;
                            bVar.c = dVar13.n();
                            bVar.d = dVar13.k();
                            fVar7.b(dVar13, bVar);
                            dVar13.J(bVar.e);
                            dVar13.G(bVar.f);
                            dVar13.D(bVar.g);
                        }
                    }
                    i66++;
                    i65 = 0;
                }
                i3 = gVar.v0;
                i4 = gVar.w0;
                i5 = gVar.r0;
                i6 = gVar.s0;
                iArr = new int[2];
                i7 = (size2 - i3) - i4;
                i8 = gVar.U0;
                if (i8 == 1) {
                    i7 = (size3 - i5) - i6;
                }
                i9 = gVar.C0;
                if (i8 == 0) {
                    if (i9 == -1) {
                        gVar.C0 = 0;
                    }
                    if (gVar.D0 == -1) {
                        gVar.D0 = 0;
                    }
                } else {
                    if (i9 == -1) {
                        gVar.C0 = 0;
                    }
                    if (gVar.D0 == -1) {
                        gVar.D0 = 0;
                    }
                }
                dVarArr = gVar.p0;
                i10 = 0;
                i11 = 0;
                while (true) {
                    i12 = gVar.q0;
                    i13 = i5;
                    if (i10 < i12) {
                        break;
                    }
                    if (gVar.p0[i10].f0 == 8) {
                        i11++;
                    }
                    i10++;
                    i5 = i13;
                }
                if (i11 > 0) {
                    dVarArr = new d[i12 - i11];
                    i63 = 0;
                    i64 = 0;
                    while (i63 < gVar.q0) {
                        dVar11 = gVar.p0[i63];
                        int i67 = i63;
                        if (dVar11.f0 != 8) {
                            dVarArr[i64] = dVar11;
                            i64++;
                        }
                        i63 = i67 + 1;
                    }
                    i14 = i64;
                } else {
                    i14 = i12;
                }
                dVarArr2 = dVarArr;
                gVar.Z0 = dVarArr2;
                gVar.a1 = i14;
                i15 = gVar.S0;
                if (i15 != 0) {
                    if (i15 != 1) {
                        i25 = i6;
                        c3 = 1;
                        iArr3 = iArr;
                        i26 = gVar.U0;
                        cVar = gVar.K;
                        cVar2 = gVar.J;
                        if (i14 == 0) {
                            arrayList.clear();
                            i27 = i7;
                            i18 = i3;
                            c = 1;
                            i19 = i4;
                            i20 = i13;
                            i16 = i25;
                            iArr2 = iArr3;
                            fVar2 = new f(gVar, i26, gVar.H, gVar.I, gVar.J, gVar.K, i27);
                            arrayList.add(fVar2);
                            if (i26 == 0) {
                                fVar6 = fVar2;
                                i42 = 0;
                                i31 = 0;
                                i43 = 0;
                                while (i42 < i14) {
                                    dVar2 = dVarArr2[i42];
                                    iP = gVar.P(dVar2, i27);
                                    i44 = i42;
                                    if (dVar2.o0[0] == 3) {
                                        i31++;
                                    }
                                    i45 = i31;
                                    z4 = (i43 != i27 || (gVar.O0 + i43) + iP > i27) && fVar6.b != null;
                                    if (!z4 && i44 > 0 && (i48 = gVar.T0) > 0 && i44 % i48 == 0) {
                                        z4 = true;
                                    }
                                    if (z4) {
                                        i46 = i45;
                                        dVar3 = dVar2;
                                        i47 = i44;
                                        f fVar8 = new f(gVar, i26, gVar.H, gVar.I, gVar.J, gVar.K, i27);
                                        fVar8.n = i47;
                                        arrayList.add(fVar8);
                                        fVar6 = fVar8;
                                    } else {
                                        dVar3 = dVar2;
                                        i46 = i45;
                                        i47 = i44;
                                        if (i47 > 0) {
                                            i43 = gVar.O0 + iP + i43;
                                        }
                                        fVar6.a(dVar3);
                                        i42 = i47 + 1;
                                        i31 = i46;
                                    }
                                    i43 = iP;
                                    fVar6.a(dVar3);
                                    i42 = i47 + 1;
                                    i31 = i46;
                                }
                            } else {
                                fVar3 = fVar2;
                                i28 = 0;
                                i29 = 0;
                                i30 = 0;
                                while (i28 < i14) {
                                    dVar = dVarArr2[i28];
                                    iO = gVar.O(dVar, i27);
                                    if (dVar.o0[1] == 3) {
                                        i29++;
                                    }
                                    int i68 = i29;
                                    z2 = (i30 != i27 || (gVar.P0 + i30) + iO > i27) && fVar3.b != null;
                                    if (!z2 && i28 > 0 && (i32 = gVar.T0) > 0 && i28 % i32 == 0) {
                                        z2 = true;
                                    }
                                    if (z2) {
                                        f fVar9 = new f(gVar, i26, gVar.H, gVar.I, gVar.J, gVar.K, i27);
                                        fVar9.n = i28;
                                        arrayList.add(fVar9);
                                        fVar3 = fVar9;
                                    } else {
                                        if (i28 > 0) {
                                            i30 = gVar.P0 + iO + i30;
                                        }
                                        fVar3.a(dVar);
                                        i28++;
                                        i29 = i68;
                                    }
                                    i30 = iO;
                                    fVar3.a(dVar);
                                    i28++;
                                    i29 = i68;
                                }
                                i31 = i29;
                            }
                            size = arrayList.size();
                            c cVar7 = gVar.H;
                            c cVar8 = gVar.I;
                            int i69 = gVar.v0;
                            int i70 = gVar.r0;
                            int i71 = gVar.w0;
                            int i72 = gVar.s0;
                            iArr4 = gVar.o0;
                            i33 = i26;
                            if (iArr4[0] != 2 || iArr4[1] == 2) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (i31 > 0 && z3) {
                                for (i41 = 0; i41 < size; i41++) {
                                    fVar5 = (f) arrayList.get(i41);
                                    if (i33 == 0) {
                                        fVar5.e(i27 - fVar5.d());
                                    } else {
                                        fVar5.e(i27 - fVar5.c());
                                    }
                                }
                            }
                            cVar3 = cVar8;
                            i34 = i69;
                            i35 = i70;
                            i36 = i71;
                            i37 = i72;
                            cVar4 = cVar;
                            cVar5 = cVar7;
                            cVar6 = cVar2;
                            i38 = 0;
                            iMax = 0;
                            i39 = 0;
                            while (i38 < size) {
                                fVar4 = (f) arrayList.get(i38);
                                if (i33 == 0) {
                                    if (i38 < size - 1) {
                                        cVar4 = ((f) arrayList.get(i38 + 1)).b.I;
                                        i37 = 0;
                                    } else {
                                        i37 = gVar.s0;
                                        cVar4 = cVar;
                                    }
                                    c cVar9 = fVar4.b.K;
                                    i40 = i33;
                                    fVar4.f(i40, cVar5, cVar3, cVar6, cVar4, i34, i35, i36, i37, i27);
                                    iMax = Math.max(iMax, fVar4.d());
                                    iC = fVar4.c() + i39;
                                    if (i38 > 0) {
                                        iC += gVar.P0;
                                    }
                                    i39 = iC;
                                    cVar3 = cVar9;
                                    i35 = 0;
                                } else {
                                    i40 = i33;
                                    if (i38 < size - 1) {
                                        cVar6 = ((f) arrayList.get(i38 + 1)).b.H;
                                        i36 = 0;
                                    } else {
                                        i36 = gVar.w0;
                                        cVar6 = cVar2;
                                    }
                                    c cVar10 = fVar4.b.J;
                                    fVar4.f(i40, cVar5, cVar3, cVar6, cVar4, i34, i35, i36, i37, i27);
                                    iD = fVar4.d() + iMax;
                                    int iMax2 = Math.max(i39, fVar4.c());
                                    if (i38 > 0) {
                                        iD += gVar.O0;
                                    }
                                    i39 = iMax2;
                                    iMax = iD;
                                    cVar5 = cVar10;
                                    i34 = 0;
                                }
                                i38++;
                                i33 = i40;
                            }
                            iArr2[0] = iMax;
                            iArr2[1] = i39;
                        }
                        c2 = 0;
                    } else if (i15 != 2) {
                        i16 = i6;
                        iArr2 = iArr;
                        i18 = i3;
                        i19 = i4;
                        i20 = i13;
                        c2 = 0;
                        c = 1;
                    } else {
                        i49 = gVar.U0;
                        iCeil = gVar.T0;
                        if (i49 == 0) {
                            if (iCeil <= 0) {
                                i61 = 0;
                                i62 = 0;
                                iCeil2 = 0;
                                while (true) {
                                    i25 = i6;
                                    if (i61 >= i14) {
                                        break;
                                    }
                                    if (i61 > 0) {
                                        i62 += gVar.O0;
                                    }
                                    dVar10 = dVarArr2[i61];
                                    if (dVar10 != null) {
                                        iP3 = gVar.P(dVar10, i7) + i62;
                                        if (iP3 > i7) {
                                            break;
                                        }
                                        iCeil2++;
                                        i62 = iP3;
                                    }
                                    i61++;
                                    i6 = i25;
                                }
                            } else {
                                i25 = i6;
                                iCeil2 = iCeil;
                            }
                            iCeil = 0;
                        } else {
                            i25 = i6;
                            if (iCeil <= 0) {
                                i51 = 0;
                                i52 = 0;
                                for (i50 = 0; i50 < i14; i50++) {
                                    if (i50 > 0) {
                                        i51 += gVar.P0;
                                    }
                                    dVar4 = dVarArr2[i50];
                                    if (dVar4 != null) {
                                        iO2 = gVar.O(dVar4, i7) + i51;
                                        if (iO2 > i7) {
                                            break;
                                        }
                                        i52++;
                                        i51 = iO2;
                                    }
                                }
                                iCeil = i52;
                            }
                            iCeil2 = 0;
                        }
                        if (gVar.Y0 == null) {
                            gVar.Y0 = new int[2];
                        }
                        z5 = (iCeil != 0 && i49 == 1) || (iCeil2 == 0 && i49 == 0);
                        while (!z5) {
                            if (i49 == 0) {
                                iCeil = (int) Math.ceil(i14 / iCeil2);
                            } else {
                                iCeil2 = (int) Math.ceil(i14 / iCeil);
                                iCeil = iCeil;
                            }
                            dVarArr3 = gVar.X0;
                            int[] iArr5 = iArr;
                            if (dVarArr3 != null || dVarArr3.length < iCeil2) {
                                gVar.X0 = new d[iCeil2];
                            } else {
                                Arrays.fill(dVarArr3, (Object) null);
                            }
                            dVarArr4 = gVar.W0;
                            if (dVarArr4 != null || dVarArr4.length < iCeil) {
                                gVar.W0 = new d[iCeil];
                            } else {
                                Arrays.fill(dVarArr4, (Object) null);
                            }
                            i53 = 0;
                            while (i53 < iCeil2) {
                                i57 = 0;
                                while (i57 < iCeil) {
                                    i58 = (i57 * iCeil2) + i53;
                                    i59 = i53;
                                    if (i49 == 1) {
                                        i58 = (i59 * iCeil) + i57;
                                    }
                                    int i73 = i49;
                                    i60 = i58;
                                    if (i60 >= dVarArr2.length && (dVar7 = dVarArr2[i60]) != null) {
                                        int iP4 = gVar.P(dVar7, i7);
                                        dVarArr5 = dVarArr2;
                                        dVar8 = gVar.X0[i59];
                                        if (dVar8 != null || dVar8.n() < iP4) {
                                            gVar.X0[i59] = dVar7;
                                        }
                                        int iO4 = gVar.O(dVar7, i7);
                                        dVar9 = gVar.W0[i57];
                                        if (dVar9 != null || dVar9.k() < iO4) {
                                            gVar.W0[i57] = dVar7;
                                        }
                                    } else {
                                        dVarArr5 = dVarArr2;
                                    }
                                    i57++;
                                    i53 = i59;
                                    i49 = i73;
                                    dVarArr2 = dVarArr5;
                                }
                                i53++;
                            }
                            d[] dVarArr6 = dVarArr2;
                            i54 = i49;
                            iP2 = 0;
                            for (i55 = 0; i55 < iCeil2; i55++) {
                                dVar6 = gVar.X0[i55];
                                if (dVar6 == null) {
                                    if (i55 > 0) {
                                        iP2 += gVar.O0;
                                    }
                                    iP2 = gVar.P(dVar6, i7) + iP2;
                                }
                            }
                            i56 = 0;
                            iO3 = 0;
                            while (i56 < iCeil) {
                                dVar5 = gVar.W0[i56];
                                int i74 = i56;
                                if (dVar5 == null) {
                                    if (i56 > 0) {
                                        iO3 += gVar.P0;
                                    }
                                    iO3 = gVar.O(dVar5, i7) + iO3;
                                }
                                i56 = i74 + 1;
                            }
                            iArr5[0] = iP2;
                            iArr5[1] = iO3;
                            if (i54 == 0) {
                                if (iP2 > i7 || iCeil2 <= 1) {
                                    z5 = true;
                                } else {
                                    iCeil2--;
                                    z5 = z5;
                                }
                            } else if (iO3 > i7 || iCeil <= 1) {
                                z5 = true;
                            } else {
                                iCeil--;
                                z5 = z5;
                            }
                            iArr = iArr5;
                            i49 = i54;
                            dVarArr2 = dVarArr6;
                        }
                        iArr3 = iArr;
                        c3 = 1;
                        int[] iArr6 = gVar.Y0;
                        iArr6[0] = iCeil2;
                        iArr6[1] = iCeil;
                    }
                    c = c3;
                    i18 = i3;
                    i19 = i4;
                    i20 = i13;
                    i16 = i25;
                    iArr2 = iArr3;
                    c2 = 0;
                } else {
                    i16 = i6;
                    i17 = i7;
                    iArr2 = iArr;
                    i18 = i3;
                    i19 = i4;
                    i20 = i13;
                    c = 1;
                    i21 = gVar.U0;
                    if (i14 == 0) {
                        c2 = 0;
                    } else {
                        if (arrayList.size() == 0) {
                            fVar = new f(gVar, i21, gVar.H, gVar.I, gVar.J, gVar.K, i17);
                            arrayList.add(fVar);
                        } else {
                            f fVar10 = (f) arrayList.get(0);
                            fVar10.c = 0;
                            fVar10.b = null;
                            fVar10.l = 0;
                            fVar10.m = 0;
                            fVar10.n = 0;
                            fVar10.o = 0;
                            fVar10.p = 0;
                            fVar10.f(i21, gVar.H, gVar.I, gVar.J, gVar.K, gVar.v0, gVar.r0, gVar.w0, gVar.s0, i17);
                            fVar = fVar10;
                        }
                        for (i22 = 0; i22 < i14; i22++) {
                            fVar.a(dVarArr2[i22]);
                        }
                        c2 = 0;
                        iArr2[0] = fVar.d();
                        iArr2[1] = fVar.c();
                    }
                }
                i23 = iArr2[c2] + i18 + i19;
                i24 = iArr2[c] + i20 + i16;
                if (mode != 1073741824) {
                    if (mode == Integer.MIN_VALUE) {
                        size2 = Math.min(i23, size2);
                    } else if (mode == 0) {
                        size2 = i23;
                    } else {
                        size2 = 0;
                    }
                }
                if (mode2 != 1073741824) {
                    if (mode2 == Integer.MIN_VALUE) {
                        size3 = Math.min(i24, size3);
                    } else if (mode2 == 0) {
                        size3 = i24;
                    } else {
                        size3 = 0;
                    }
                }
                gVar.y0 = size2;
                gVar.z0 = size3;
                gVar.J(size2);
                gVar.G(size3);
                if (gVar.q0 > 0) {
                    z = c;
                } else {
                    z = 0;
                }
                gVar.x0 = z;
            }
        } else {
            i3 = gVar.v0;
            i4 = gVar.w0;
            i5 = gVar.r0;
            i6 = gVar.s0;
            iArr = new int[2];
            i7 = (size2 - i3) - i4;
            i8 = gVar.U0;
            if (i8 == 1) {
                i7 = (size3 - i5) - i6;
            }
            i9 = gVar.C0;
            if (i8 == 0) {
                if (i9 == -1) {
                    gVar.C0 = 0;
                }
                if (gVar.D0 == -1) {
                    gVar.D0 = 0;
                }
            } else {
                if (i9 == -1) {
                    gVar.C0 = 0;
                }
                if (gVar.D0 == -1) {
                    gVar.D0 = 0;
                }
            }
            dVarArr = gVar.p0;
            i10 = 0;
            i11 = 0;
            while (true) {
                i12 = gVar.q0;
                i13 = i5;
                if (i10 < i12) {
                    break;
                    break;
                }
                if (gVar.p0[i10].f0 == 8) {
                    i11++;
                }
                i10++;
                i5 = i13;
            }
            if (i11 > 0) {
                dVarArr = new d[i12 - i11];
                i63 = 0;
                i64 = 0;
                while (i63 < gVar.q0) {
                    dVar11 = gVar.p0[i63];
                    int i610 = i63;
                    if (dVar11.f0 != 8) {
                        dVarArr[i64] = dVar11;
                        i64++;
                    }
                    i63 = i610 + 1;
                }
                i14 = i64;
            } else {
                i14 = i12;
            }
            dVarArr2 = dVarArr;
            gVar.Z0 = dVarArr2;
            gVar.a1 = i14;
            i15 = gVar.S0;
            if (i15 != 0) {
                if (i15 != 1) {
                    i25 = i6;
                    c3 = 1;
                    iArr3 = iArr;
                    i26 = gVar.U0;
                    cVar = gVar.K;
                    cVar2 = gVar.J;
                    if (i14 == 0) {
                        arrayList.clear();
                        i27 = i7;
                        i18 = i3;
                        c = 1;
                        i19 = i4;
                        i20 = i13;
                        i16 = i25;
                        iArr2 = iArr3;
                        fVar2 = new f(gVar, i26, gVar.H, gVar.I, gVar.J, gVar.K, i27);
                        arrayList.add(fVar2);
                        if (i26 == 0) {
                            fVar6 = fVar2;
                            i42 = 0;
                            i31 = 0;
                            i43 = 0;
                            while (i42 < i14) {
                                dVar2 = dVarArr2[i42];
                                iP = gVar.P(dVar2, i27);
                                i44 = i42;
                                if (dVar2.o0[0] == 3) {
                                    i31++;
                                }
                                i45 = i31;
                                if (i43 != i27) {
                                }
                                if (!z4) {
                                    z4 = true;
                                }
                                if (z4) {
                                    i46 = i45;
                                    dVar3 = dVar2;
                                    i47 = i44;
                                    f fVar11 = new f(gVar, i26, gVar.H, gVar.I, gVar.J, gVar.K, i27);
                                    fVar11.n = i47;
                                    arrayList.add(fVar11);
                                    fVar6 = fVar11;
                                } else {
                                    dVar3 = dVar2;
                                    i46 = i45;
                                    i47 = i44;
                                    if (i47 > 0) {
                                        i43 = gVar.O0 + iP + i43;
                                    }
                                    fVar6.a(dVar3);
                                    i42 = i47 + 1;
                                    i31 = i46;
                                }
                                i43 = iP;
                                fVar6.a(dVar3);
                                i42 = i47 + 1;
                                i31 = i46;
                            }
                        } else {
                            fVar3 = fVar2;
                            i28 = 0;
                            i29 = 0;
                            i30 = 0;
                            while (i28 < i14) {
                                dVar = dVarArr2[i28];
                                iO = gVar.O(dVar, i27);
                                if (dVar.o0[1] == 3) {
                                    i29++;
                                }
                                int i611 = i29;
                                if (i30 != i27) {
                                }
                                if (!z2) {
                                    z2 = true;
                                }
                                if (z2) {
                                    f fVar12 = new f(gVar, i26, gVar.H, gVar.I, gVar.J, gVar.K, i27);
                                    fVar12.n = i28;
                                    arrayList.add(fVar12);
                                    fVar3 = fVar12;
                                } else {
                                    if (i28 > 0) {
                                        i30 = gVar.P0 + iO + i30;
                                    }
                                    fVar3.a(dVar);
                                    i28++;
                                    i29 = i611;
                                }
                                i30 = iO;
                                fVar3.a(dVar);
                                i28++;
                                i29 = i611;
                            }
                            i31 = i29;
                        }
                        size = arrayList.size();
                        c cVar11 = gVar.H;
                        c cVar12 = gVar.I;
                        int i612 = gVar.v0;
                        int i75 = gVar.r0;
                        int i76 = gVar.w0;
                        int i77 = gVar.s0;
                        iArr4 = gVar.o0;
                        i33 = i26;
                        if (iArr4[0] != 2) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (i31 > 0) {
                            while (i41 < size) {
                                fVar5 = (f) arrayList.get(i41);
                                if (i33 == 0) {
                                    fVar5.e(i27 - fVar5.d());
                                } else {
                                    fVar5.e(i27 - fVar5.c());
                                }
                            }
                        }
                        cVar3 = cVar12;
                        i34 = i612;
                        i35 = i75;
                        i36 = i76;
                        i37 = i77;
                        cVar4 = cVar;
                        cVar5 = cVar11;
                        cVar6 = cVar2;
                        i38 = 0;
                        iMax = 0;
                        i39 = 0;
                        while (i38 < size) {
                            fVar4 = (f) arrayList.get(i38);
                            if (i33 == 0) {
                                if (i38 < size - 1) {
                                    cVar4 = ((f) arrayList.get(i38 + 1)).b.I;
                                    i37 = 0;
                                } else {
                                    i37 = gVar.s0;
                                    cVar4 = cVar;
                                }
                                c cVar13 = fVar4.b.K;
                                i40 = i33;
                                fVar4.f(i40, cVar5, cVar3, cVar6, cVar4, i34, i35, i36, i37, i27);
                                iMax = Math.max(iMax, fVar4.d());
                                iC = fVar4.c() + i39;
                                if (i38 > 0) {
                                    iC += gVar.P0;
                                }
                                i39 = iC;
                                cVar3 = cVar13;
                                i35 = 0;
                            } else {
                                i40 = i33;
                                if (i38 < size - 1) {
                                    cVar6 = ((f) arrayList.get(i38 + 1)).b.H;
                                    i36 = 0;
                                } else {
                                    i36 = gVar.w0;
                                    cVar6 = cVar2;
                                }
                                c cVar14 = fVar4.b.J;
                                fVar4.f(i40, cVar5, cVar3, cVar6, cVar4, i34, i35, i36, i37, i27);
                                iD = fVar4.d() + iMax;
                                int iMax3 = Math.max(i39, fVar4.c());
                                if (i38 > 0) {
                                    iD += gVar.O0;
                                }
                                i39 = iMax3;
                                iMax = iD;
                                cVar5 = cVar14;
                                i34 = 0;
                            }
                            i38++;
                            i33 = i40;
                        }
                        iArr2[0] = iMax;
                        iArr2[1] = i39;
                    }
                    c2 = 0;
                } else if (i15 != 2) {
                    i16 = i6;
                    iArr2 = iArr;
                    i18 = i3;
                    i19 = i4;
                    i20 = i13;
                    c2 = 0;
                    c = 1;
                } else {
                    i49 = gVar.U0;
                    iCeil = gVar.T0;
                    if (i49 == 0) {
                        if (iCeil <= 0) {
                            i61 = 0;
                            i62 = 0;
                            iCeil2 = 0;
                            while (true) {
                                i25 = i6;
                                if (i61 >= i14) {
                                    break;
                                    break;
                                }
                                if (i61 > 0) {
                                    i62 += gVar.O0;
                                }
                                dVar10 = dVarArr2[i61];
                                if (dVar10 != null) {
                                    iP3 = gVar.P(dVar10, i7) + i62;
                                    if (iP3 > i7) {
                                        break;
                                        break;
                                    } else {
                                        iCeil2++;
                                        i62 = iP3;
                                    }
                                }
                                i61++;
                                i6 = i25;
                            }
                        } else {
                            i25 = i6;
                            iCeil2 = iCeil;
                        }
                        iCeil = 0;
                    } else {
                        i25 = i6;
                        if (iCeil <= 0) {
                            i51 = 0;
                            i52 = 0;
                            while (i50 < i14) {
                                if (i50 > 0) {
                                    i51 += gVar.P0;
                                }
                                dVar4 = dVarArr2[i50];
                                if (dVar4 != null) {
                                    iO2 = gVar.O(dVar4, i7) + i51;
                                    if (iO2 > i7) {
                                        break;
                                        break;
                                    } else {
                                        i52++;
                                        i51 = iO2;
                                    }
                                }
                            }
                            iCeil = i52;
                        }
                        iCeil2 = 0;
                    }
                    if (gVar.Y0 == null) {
                        gVar.Y0 = new int[2];
                    }
                    if (iCeil != 0) {
                    }
                    while (!z5) {
                        if (i49 == 0) {
                            iCeil = (int) Math.ceil(i14 / iCeil2);
                        } else {
                            iCeil2 = (int) Math.ceil(i14 / iCeil);
                            iCeil = iCeil;
                        }
                        dVarArr3 = gVar.X0;
                        int[] iArr7 = iArr;
                        if (dVarArr3 != null) {
                            gVar.X0 = new d[iCeil2];
                        } else {
                            gVar.X0 = new d[iCeil2];
                        }
                        dVarArr4 = gVar.W0;
                        if (dVarArr4 != null) {
                            gVar.W0 = new d[iCeil];
                        } else {
                            gVar.W0 = new d[iCeil];
                        }
                        i53 = 0;
                        while (i53 < iCeil2) {
                            i57 = 0;
                            while (i57 < iCeil) {
                                i58 = (i57 * iCeil2) + i53;
                                i59 = i53;
                                if (i49 == 1) {
                                    i58 = (i59 * iCeil) + i57;
                                }
                                int i78 = i49;
                                i60 = i58;
                                if (i60 >= dVarArr2.length) {
                                    dVarArr5 = dVarArr2;
                                } else {
                                    int iP5 = gVar.P(dVar7, i7);
                                    dVarArr5 = dVarArr2;
                                    dVar8 = gVar.X0[i59];
                                    if (dVar8 != null) {
                                        gVar.X0[i59] = dVar7;
                                    } else {
                                        gVar.X0[i59] = dVar7;
                                    }
                                    int iO5 = gVar.O(dVar7, i7);
                                    dVar9 = gVar.W0[i57];
                                    if (dVar9 != null) {
                                        gVar.W0[i57] = dVar7;
                                    } else {
                                        gVar.W0[i57] = dVar7;
                                    }
                                }
                                i57++;
                                i53 = i59;
                                i49 = i78;
                                dVarArr2 = dVarArr5;
                            }
                            i53++;
                        }
                        d[] dVarArr7 = dVarArr2;
                        i54 = i49;
                        iP2 = 0;
                        while (i55 < iCeil2) {
                            dVar6 = gVar.X0[i55];
                            if (dVar6 == null) {
                                if (i55 > 0) {
                                    iP2 += gVar.O0;
                                }
                                iP2 = gVar.P(dVar6, i7) + iP2;
                            }
                        }
                        i56 = 0;
                        iO3 = 0;
                        while (i56 < iCeil) {
                            dVar5 = gVar.W0[i56];
                            int i79 = i56;
                            if (dVar5 == null) {
                                if (i56 > 0) {
                                    iO3 += gVar.P0;
                                }
                                iO3 = gVar.O(dVar5, i7) + iO3;
                            }
                            i56 = i79 + 1;
                        }
                        iArr7[0] = iP2;
                        iArr7[1] = iO3;
                        if (i54 == 0) {
                            if (iP2 > i7) {
                            }
                            z5 = true;
                        } else {
                            if (iO3 > i7) {
                            }
                            z5 = true;
                        }
                        iArr = iArr7;
                        i49 = i54;
                        dVarArr2 = dVarArr7;
                    }
                    iArr3 = iArr;
                    c3 = 1;
                    int[] iArr8 = gVar.Y0;
                    iArr8[0] = iCeil2;
                    iArr8[1] = iCeil;
                }
                c = c3;
                i18 = i3;
                i19 = i4;
                i20 = i13;
                i16 = i25;
                iArr2 = iArr3;
                c2 = 0;
            } else {
                i16 = i6;
                i17 = i7;
                iArr2 = iArr;
                i18 = i3;
                i19 = i4;
                i20 = i13;
                c = 1;
                i21 = gVar.U0;
                if (i14 == 0) {
                    c2 = 0;
                } else {
                    if (arrayList.size() == 0) {
                        fVar = new f(gVar, i21, gVar.H, gVar.I, gVar.J, gVar.K, i17);
                        arrayList.add(fVar);
                    } else {
                        f fVar13 = (f) arrayList.get(0);
                        fVar13.c = 0;
                        fVar13.b = null;
                        fVar13.l = 0;
                        fVar13.m = 0;
                        fVar13.n = 0;
                        fVar13.o = 0;
                        fVar13.p = 0;
                        fVar13.f(i21, gVar.H, gVar.I, gVar.J, gVar.K, gVar.v0, gVar.r0, gVar.w0, gVar.s0, i17);
                        fVar = fVar13;
                    }
                    while (i22 < i14) {
                        fVar.a(dVarArr2[i22]);
                    }
                    c2 = 0;
                    iArr2[0] = fVar.d();
                    iArr2[1] = fVar.c();
                }
            }
            i23 = iArr2[c2] + i18 + i19;
            i24 = iArr2[c] + i20 + i16;
            if (mode != 1073741824) {
                if (mode == Integer.MIN_VALUE) {
                    size2 = Math.min(i23, size2);
                } else if (mode == 0) {
                    size2 = i23;
                } else {
                    size2 = 0;
                }
            }
            if (mode2 != 1073741824) {
                if (mode2 == Integer.MIN_VALUE) {
                    size3 = Math.min(i24, size3);
                } else if (mode2 == 0) {
                    size3 = i24;
                } else {
                    size3 = 0;
                }
            }
            gVar.y0 = size2;
            gVar.z0 = size3;
            gVar.J(size2);
            gVar.G(size3);
            if (gVar.q0 > 0) {
                z = c;
            } else {
                z = 0;
            }
            gVar.x0 = z;
        }
        setMeasuredDimension(gVar.y0, gVar.z0);
    }

    @Override // androidx.constraintlayout.widget.c, android.view.View
    public final void onMeasure(int i, int i2) {
        j(this.G, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.G.K0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.G.E0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.G.L0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.G.F0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.G.Q0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.G.I0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.G.O0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.G.C0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.G.T0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.G.U0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        g gVar = this.G;
        gVar.r0 = i;
        gVar.s0 = i;
        gVar.t0 = i;
        gVar.u0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.G.s0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.G.v0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.G.w0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.G.r0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.G.R0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.G.J0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.G.P0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.G.D0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.G.S0 = i;
        requestLayout();
    }
}
