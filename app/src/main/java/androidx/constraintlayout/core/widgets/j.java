package androidx.constraintlayout.core.widgets;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static final boolean[] a = new boolean[3];

    /* JADX WARN: Code duplicated, block: B:189:0x028c  */
    /* JADX WARN: Code duplicated, block: B:206:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:208:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:210:0x02de  */
    /* JADX WARN: Code duplicated, block: B:233:0x0370  */
    /* JADX WARN: Code duplicated, block: B:235:0x038c  */
    /* JADX WARN: Code duplicated, block: B:237:0x0391  */
    /* JADX WARN: Code duplicated, block: B:241:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:251:0x0422  */
    /* JADX WARN: Code duplicated, block: B:406:0x0694  */
    /* JADX WARN: Code duplicated, block: B:409:0x069f  */
    /* JADX WARN: Code duplicated, block: B:410:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:413:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:414:0x06ab  */
    /* JADX WARN: Code duplicated, block: B:416:0x06af  */
    /* JADX WARN: Code duplicated, block: B:418:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:421:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:423:0x06c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:433:0x06df A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:75:0x0114  */
    public static void a(e eVar, androidx.constraintlayout.core.c cVar, ArrayList arrayList, int i) {
        int i2;
        b[] bVarArr;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        int i5;
        d dVar;
        androidx.constraintlayout.core.c cVar2;
        androidx.constraintlayout.core.h hVar;
        c cVar3;
        androidx.constraintlayout.core.h hVar2;
        d dVar2;
        int i6;
        c cVar4;
        androidx.constraintlayout.core.h hVar3;
        d dVar3;
        int i7;
        c[] cVarArr;
        int i8;
        c cVar5;
        c cVar6;
        androidx.constraintlayout.core.h hVar4;
        c cVar7;
        androidx.constraintlayout.core.h hVar5;
        int size;
        ArrayList arrayList2;
        int i9;
        int i10;
        float f;
        int i11;
        androidx.constraintlayout.core.h hVar6;
        androidx.constraintlayout.core.h hVar7;
        androidx.constraintlayout.core.h hVar8;
        androidx.constraintlayout.core.h hVar9;
        androidx.constraintlayout.core.b bVarL;
        float f2;
        c cVar8;
        d dVar4;
        int i12;
        int i13;
        d dVar5;
        e eVar2 = eVar;
        if (i == 0) {
            i2 = eVar2.y0;
            bVarArr = eVar2.B0;
            i3 = 0;
        } else {
            i2 = eVar2.z0;
            bVarArr = eVar2.A0;
            i3 = 2;
        }
        int i14 = i2;
        b[] bVarArr2 = bVarArr;
        int i15 = 0;
        while (i15 < i14) {
            b bVar = bVarArr2[i15];
            boolean z4 = bVar.q;
            d dVar6 = bVar.a;
            c[] cVarArr2 = dVar6.P;
            int i16 = 3;
            int i17 = 8;
            float f3 = 0.0f;
            if (z4) {
                i4 = i15;
            } else {
                int i18 = bVar.l;
                int i19 = i18 * 2;
                d dVar7 = dVar6;
                d dVar8 = dVar7;
                boolean z5 = false;
                while (!z5) {
                    bVar.i++;
                    d[] dVarArr = dVar7.l0;
                    c[] cVarArr3 = dVar7.P;
                    dVarArr[i18] = null;
                    dVar7.k0[i18] = null;
                    if (dVar7.f0 != i17) {
                        dVar7.j(i18);
                        cVarArr3[i19].e();
                        int i20 = i19 + 1;
                        cVarArr3[i20].e();
                        cVarArr3[i19].e();
                        cVarArr3[i20].e();
                        if (bVar.b == null) {
                            bVar.b = dVar7;
                        }
                        bVar.d = dVar7;
                        int i21 = dVar7.o0[i18];
                        if (i21 == i16) {
                            int i22 = dVar7.s[i18];
                            if (i22 == 0 || i22 == i16 || i22 == 2) {
                                bVar.j++;
                                float f4 = dVar7.j0[i18];
                                if (f4 > 0.0f) {
                                    bVar.k += f4;
                                }
                                i13 = i18;
                                if (dVar7.f0 != 8 && i21 == 3 && (i22 == 0 || i22 == 3)) {
                                    if (f4 < 0.0f) {
                                        bVar.n = true;
                                    } else {
                                        bVar.o = true;
                                    }
                                    if (bVar.h == null) {
                                        bVar.h = new ArrayList();
                                    }
                                    bVar.h.add(dVar7);
                                }
                                if (bVar.f == null) {
                                    bVar.f = dVar7;
                                }
                                d dVar9 = bVar.g;
                                if (dVar9 != null) {
                                    dVar9.k0[i13] = dVar7;
                                }
                                bVar.g = dVar7;
                            } else {
                                i15 = i15;
                                i13 = i18;
                            }
                            if (i13 == 0) {
                                if (dVar7.q == 0 && dVar7.t == 0) {
                                    int i23 = dVar7.u;
                                }
                            } else if (dVar7.r == 0 && dVar7.w == 0) {
                                int i24 = dVar7.x;
                            }
                        } else {
                            i15 = i15;
                            i13 = i18;
                        }
                    } else {
                        i15 = i15;
                        i13 = i18;
                    }
                    d dVar10 = dVar8;
                    if (dVar10 != dVar7) {
                        dVar10.l0[i13] = dVar7;
                    }
                    c cVar9 = cVarArr3[i19 + 1].f;
                    if (cVar9 != null) {
                        dVar5 = cVar9.d;
                        c cVar10 = dVar5.P[i19].f;
                        if (cVar10 == null || cVar10.d != dVar7) {
                            dVar5 = null;
                        }
                    } else {
                        dVar5 = null;
                    }
                    if (dVar5 == null) {
                        dVar5 = dVar7;
                        z5 = true;
                    }
                    dVar8 = dVar7;
                    i18 = i13;
                    i16 = 3;
                    i17 = 8;
                    dVar7 = dVar5;
                    i15 = i15;
                }
                i4 = i15;
                int i25 = i18;
                d dVar11 = bVar.b;
                if (dVar11 != null) {
                    dVar11.P[i19].e();
                }
                d dVar12 = bVar.d;
                if (dVar12 != null) {
                    dVar12.P[i19 + 1].e();
                }
                bVar.c = dVar7;
                if (i25 == 0 && bVar.m) {
                    bVar.e = dVar7;
                } else {
                    bVar.e = dVar6;
                }
                bVar.p = bVar.o && bVar.n;
            }
            bVar.q = true;
            if (arrayList == 0 || arrayList.contains(dVar6)) {
                d dVar13 = bVar.c;
                d dVar14 = bVar.b;
                d dVar15 = bVar.d;
                d dVar16 = bVar.e;
                float f5 = bVar.k;
                int[] iArr = eVar2.o0;
                c[] cVarArr4 = eVar2.P;
                boolean z6 = iArr[i] == 2;
                if (i == 0) {
                    int i26 = dVar16.h0;
                    boolean z7 = i26 == 0;
                    boolean z8 = i26 == 1;
                    z = i26 == 2;
                    z3 = z8;
                    z2 = z7;
                } else {
                    int i27 = dVar16.i0;
                    boolean z9 = i27 == 0;
                    boolean z10 = i27 == 1;
                    z = i27 == 2;
                    z2 = z9;
                    z3 = z10;
                }
                boolean z11 = false;
                while (!z11) {
                    c[] cVarArr5 = dVar6.P;
                    int[] iArr2 = dVar6.o0;
                    c cVar11 = cVarArr5[i3];
                    int i28 = z ? 1 : 4;
                    int iE = cVar11.e();
                    boolean z12 = z6;
                    boolean z13 = z;
                    boolean z14 = iArr2[i] == 3 && dVar6.s[i] == 0;
                    c cVar12 = cVar11.f;
                    if (cVar12 != null && dVar6 != dVar6) {
                        iE = cVar12.e() + iE;
                    }
                    int i29 = iE;
                    if (z13 && dVar6 != dVar6 && dVar6 != dVar14) {
                        i28 = 8;
                    }
                    d dVar17 = dVar6;
                    c cVar13 = cVar11.f;
                    if (cVar13 != null) {
                        boolean z15 = z14;
                        androidx.constraintlayout.core.h hVar10 = cVar11.i;
                        androidx.constraintlayout.core.h hVar11 = cVar13.i;
                        if (dVar6 == dVar14) {
                            cVar.f(hVar10, hVar11, i29, 6);
                        } else {
                            cVar.f(hVar10, hVar11, i29, 8);
                        }
                        if (z15 && !z13) {
                            i28 = 5;
                        }
                        cVar.e(cVar11.i, cVar11.f.i, i29, (dVar6 == dVar14 && z13 && dVar6.R[i]) ? 5 : i28);
                    }
                    if (z12) {
                        if (dVar6.f0 == 8 || iArr2[i] != 3) {
                            i12 = 0;
                        } else {
                            i12 = 0;
                            cVar.f(cVarArr5[i3 + 1].i, cVarArr5[i3].i, 0, 5);
                        }
                        cVar.f(cVarArr5[i3].i, cVarArr4[i3].i, i12, 8);
                    }
                    c cVar14 = cVarArr5[i3 + 1].f;
                    if (cVar14 != null) {
                        dVar4 = cVar14.d;
                        c cVar15 = dVar4.P[i3].f;
                        if (cVar15 == null || cVar15.d != dVar6) {
                            dVar4 = null;
                        }
                    } else {
                        dVar4 = null;
                    }
                    if (dVar4 != null) {
                        dVar6 = dVar4;
                    } else {
                        z11 = true;
                    }
                    dVar6 = dVar17;
                    z6 = z12;
                    z = z13;
                }
                boolean z16 = z6;
                boolean z17 = z;
                if (dVar15 != null) {
                    int i30 = i3 + 1;
                    if (dVar13.P[i30].f != null) {
                        c cVar16 = dVar15.P[i30];
                        if (dVar15.o0[i] == 3 && dVar15.s[i] == 0 && !z17) {
                            c cVar17 = cVar16.f;
                            if (cVar17.d == eVar2) {
                                cVar.e(cVar16.i, cVar17.i, -cVar16.e(), 5);
                            } else if (z17) {
                                cVar8 = cVar16.f;
                                if (cVar8.d == eVar2) {
                                    cVar.e(cVar16.i, cVar8.i, -cVar16.e(), 4);
                                }
                            }
                        } else if (z17) {
                            cVar8 = cVar16.f;
                            if (cVar8.d == eVar2) {
                                cVar.e(cVar16.i, cVar8.i, -cVar16.e(), 4);
                            }
                        }
                        cVar.g(cVar16.i, dVar13.P[i30].f.i, -cVar16.e(), 6);
                    }
                }
                if (z16) {
                    int i31 = i3 + 1;
                    androidx.constraintlayout.core.h hVar12 = cVarArr4[i31].i;
                    c cVar18 = dVar13.P[i31];
                    cVar.f(hVar12, cVar18.i, cVar18.e(), 8);
                }
                ArrayList arrayList3 = bVar.h;
                if (arrayList3 != null && (size = arrayList3.size()) > 1) {
                    if (bVar.n && !bVar.p) {
                        f5 = bVar.j;
                    }
                    d dVar18 = null;
                    float f6 = 0.0f;
                    int i32 = 0;
                    while (i32 < size) {
                        d dVar19 = (d) arrayList3.get(i32);
                        float[] fArr = dVar19.j0;
                        c[] cVarArr6 = dVar19.P;
                        float f7 = fArr[i];
                        if (f7 >= f3) {
                            arrayList2 = arrayList3;
                            i9 = size;
                            if (f7 == f3) {
                                cVar.e(cVarArr6[i3 + 1].i, cVarArr6[i3].i, 0, 8);
                                i10 = i14;
                                f = f3;
                                f6 = f6;
                                i11 = i32;
                            } else {
                                float f8 = f6;
                                if (dVar18 != null) {
                                    c[] cVarArr7 = dVar18.P;
                                    hVar6 = cVarArr7[i3].i;
                                    int i33 = i3 + 1;
                                    hVar7 = cVarArr7[i33].i;
                                    hVar8 = cVarArr6[i3].i;
                                    hVar9 = cVarArr6[i33].i;
                                    bVarL = cVar.l();
                                    f2 = f3;
                                    bVarL.b = f2;
                                    f = f2;
                                    if (f5 != f2 || f8 == f7) {
                                        i11 = i32;
                                        i10 = i14;
                                        bVarL.d.g(hVar6, 1.0f);
                                        bVarL.d.g(hVar7, -1.0f);
                                        bVarL.d.g(hVar9, 1.0f);
                                        bVarL.d.g(hVar8, -1.0f);
                                    } else {
                                        androidx.constraintlayout.core.a aVar = bVarL.d;
                                        if (f8 == f) {
                                            i11 = i32;
                                            aVar.g(hVar6, 1.0f);
                                            bVarL.d.g(hVar7, -1.0f);
                                            i10 = i14;
                                        } else {
                                            i11 = i32;
                                            i10 = i14;
                                            if (f7 == f3) {
                                                aVar.g(hVar8, 1.0f);
                                                bVarL.d.g(hVar9, -1.0f);
                                            } else {
                                                float f9 = (f8 / f5) / (f7 / f5);
                                                aVar.g(hVar6, 1.0f);
                                                bVarL.d.g(hVar7, -1.0f);
                                                bVarL.d.g(hVar9, f9);
                                                bVarL.d.g(hVar8, -f9);
                                            }
                                        }
                                    }
                                    cVar.c(bVarL);
                                } else {
                                    i10 = i14;
                                    f = f3;
                                    i11 = i32;
                                }
                                f6 = f7;
                                dVar18 = dVar19;
                            }
                        } else {
                            if (bVar.p) {
                                arrayList2 = arrayList3;
                                i9 = size;
                                cVar.e(cVarArr6[i3 + 1].i, cVarArr6[i3].i, 0, 4);
                            } else {
                                f7 = 1.0f;
                                arrayList2 = arrayList3;
                                i9 = size;
                                if (f7 == f3) {
                                    cVar.e(cVarArr6[i3 + 1].i, cVarArr6[i3].i, 0, 8);
                                } else {
                                    float f10 = f6;
                                    if (dVar18 != null) {
                                        c[] cVarArr8 = dVar18.P;
                                        hVar6 = cVarArr8[i3].i;
                                        int i34 = i3 + 1;
                                        hVar7 = cVarArr8[i34].i;
                                        hVar8 = cVarArr6[i3].i;
                                        hVar9 = cVarArr6[i34].i;
                                        bVarL = cVar.l();
                                        f2 = f3;
                                        bVarL.b = f2;
                                        f = f2;
                                        if (f5 != f2) {
                                            i11 = i32;
                                            i10 = i14;
                                            bVarL.d.g(hVar6, 1.0f);
                                            bVarL.d.g(hVar7, -1.0f);
                                            bVarL.d.g(hVar9, 1.0f);
                                            bVarL.d.g(hVar8, -1.0f);
                                        } else {
                                            i11 = i32;
                                            i10 = i14;
                                            bVarL.d.g(hVar6, 1.0f);
                                            bVarL.d.g(hVar7, -1.0f);
                                            bVarL.d.g(hVar9, 1.0f);
                                            bVarL.d.g(hVar8, -1.0f);
                                        }
                                        cVar.c(bVarL);
                                    } else {
                                        i10 = i14;
                                        f = f3;
                                        i11 = i32;
                                    }
                                    f6 = f7;
                                    dVar18 = dVar19;
                                }
                            }
                            i10 = i14;
                            f = f3;
                            f6 = f6;
                            i11 = i32;
                        }
                        i32 = i11 + 1;
                        i14 = i10;
                        arrayList3 = arrayList2;
                        size = i9;
                        f3 = f;
                    }
                }
                i5 = i14;
                if (dVar14 == null || !(dVar14 == dVar15 || z17)) {
                    dVar = dVar15;
                    if (!z2 || dVar14 == null) {
                        int i35 = 8;
                        if (z3 && dVar14 != null) {
                            int i36 = bVar.j;
                            boolean z18 = i36 > 0 && bVar.i == i36;
                            d dVar20 = dVar14;
                            d dVar21 = dVar20;
                            while (dVar21 != null) {
                                c[] cVarArr9 = dVar21.P;
                                d dVar22 = dVar21.l0[i];
                                while (dVar22 != null && dVar22.f0 == i35) {
                                    dVar22 = dVar22.l0[i];
                                }
                                if (dVar21 == dVar14 || dVar21 == dVar || dVar22 == null) {
                                    dVar20 = dVar20;
                                } else {
                                    if (dVar22 == dVar) {
                                        dVar22 = null;
                                    }
                                    c cVar19 = cVarArr9[i3];
                                    androidx.constraintlayout.core.h hVar13 = cVar19.i;
                                    int i37 = i3 + 1;
                                    androidx.constraintlayout.core.h hVar14 = dVar20.P[i37].i;
                                    int iE2 = cVar19.e();
                                    int iE3 = cVarArr9[i37].e();
                                    if (dVar22 != null) {
                                        cVar3 = dVar22.P[i3];
                                        hVar2 = cVar3.i;
                                        c cVar20 = cVar3.f;
                                        hVar = cVar20 != null ? cVar20.i : null;
                                    } else {
                                        c cVar21 = dVar.P[i3];
                                        androidx.constraintlayout.core.h hVar15 = cVar21 != null ? cVar21.i : null;
                                        hVar = cVarArr9[i37].i;
                                        cVar3 = cVar21;
                                        hVar2 = hVar15;
                                    }
                                    if (cVar3 != null) {
                                        iE3 += cVar3.e();
                                    }
                                    int iE4 = iE2 + dVar20.P[i37].e();
                                    d dVar23 = dVar22;
                                    androidx.constraintlayout.core.h hVar16 = hVar2;
                                    int i38 = z18 ? 8 : 4;
                                    if (hVar13 == null || hVar14 == null || hVar16 == null || hVar == null) {
                                        dVar2 = dVar23;
                                    } else {
                                        dVar2 = dVar23;
                                        cVar.b(hVar13, hVar14, iE4, 0.5f, hVar16, hVar, iE3, i38);
                                    }
                                    dVar22 = dVar2;
                                }
                                if (dVar21.f0 != 8) {
                                    dVar20 = dVar21;
                                }
                                dVar21 = dVar22;
                                dVar20 = dVar20;
                                i35 = 8;
                            }
                            cVar2 = cVar;
                            c cVar22 = dVar14.P[i3];
                            c cVar23 = cVarArr2[i3].f;
                            int i39 = i3 + 1;
                            c cVar24 = dVar.P[i39];
                            c cVar25 = dVar13.P[i39].f;
                            if (cVar23 != null) {
                                if (dVar14 != dVar) {
                                    cVar2.e(cVar22.i, cVar23.i, cVar22.e(), 5);
                                } else if (cVar25 != null) {
                                    cVar2.b(cVar22.i, cVar23.i, cVar22.e(), 0.5f, cVar24.i, cVar25.i, cVar24.e(), 5);
                                }
                            }
                            if (cVar25 != null && dVar14 != dVar) {
                                cVar2.e(cVar24.i, cVar25.i, -cVar24.e(), 5);
                            }
                        }
                        if ((z2 || z3) && dVar14 != null && dVar14 != dVar) {
                            cVarArr = dVar14.P;
                            c cVar26 = cVarArr[i3];
                            if (dVar == null) {
                                dVar = dVar14;
                            }
                            c[] cVarArr10 = dVar.P;
                            i8 = i3 + 1;
                            cVar5 = cVarArr10[i8];
                            cVar6 = cVar26.f;
                            if (cVar6 != null) {
                                hVar4 = cVar6.i;
                            } else {
                                hVar4 = null;
                            }
                            cVar7 = cVar5.f;
                            if (cVar7 != null) {
                                hVar5 = cVar7.i;
                            } else {
                                hVar5 = null;
                            }
                            if (dVar13 != dVar) {
                                c cVar27 = dVar13.P[i8].f;
                                hVar5 = cVar27 != null ? cVar27.i : null;
                            }
                            if (dVar14 == dVar) {
                                cVar5 = cVarArr[i8];
                            }
                            if (hVar4 == null && hVar5 != null) {
                                cVar2.b(cVar26.i, hVar4, cVar26.e(), 0.5f, hVar5, cVar5.i, cVarArr10[i8].e(), 5);
                            }
                        }
                    } else {
                        int i40 = bVar.j;
                        boolean z19 = i40 > 0 && bVar.i == i40;
                        d dVar24 = dVar14;
                        d dVar25 = dVar24;
                        while (dVar24 != null) {
                            c[] cVarArr11 = dVar24.P;
                            d dVar26 = dVar24.l0[i];
                            while (true) {
                                if (dVar26 == null) {
                                    i6 = 8;
                                    break;
                                }
                                i6 = 8;
                                if (dVar26.f0 != 8) {
                                    break;
                                } else {
                                    dVar26 = dVar26.l0[i];
                                }
                            }
                            if (dVar26 != null || dVar24 == dVar) {
                                c cVar28 = cVarArr11[i3];
                                androidx.constraintlayout.core.h hVar17 = cVar28.i;
                                c cVar29 = cVar28.f;
                                androidx.constraintlayout.core.h hVar18 = cVar29 != null ? cVar29.i : null;
                                if (dVar25 != dVar24) {
                                    hVar18 = dVar25.P[i3 + 1].i;
                                } else if (dVar24 == dVar14) {
                                    c cVar30 = cVarArr2[i3].f;
                                    hVar18 = cVar30 != null ? cVar30.i : null;
                                }
                                int iE5 = cVar28.e();
                                int i41 = i3 + 1;
                                int iE6 = cVarArr11[i41].e();
                                if (dVar26 != null) {
                                    cVar4 = dVar26.P[i3];
                                    hVar3 = cVar4.i;
                                } else {
                                    cVar4 = dVar13.P[i41].f;
                                    hVar3 = cVar4 != null ? cVar4.i : null;
                                }
                                androidx.constraintlayout.core.h hVar19 = cVarArr11[i41].i;
                                if (cVar4 != null) {
                                    iE6 += cVar4.e();
                                }
                                int iE7 = dVar25.P[i41].e() + iE5;
                                if (hVar17 == null || hVar18 == null || hVar3 == null || hVar19 == null) {
                                    dVar3 = dVar26;
                                    i7 = 8;
                                } else {
                                    if (dVar24 == dVar14) {
                                        iE7 = dVar14.P[i3].e();
                                    }
                                    if (dVar24 == dVar) {
                                        iE6 = dVar.P[i41].e();
                                    }
                                    dVar3 = dVar26;
                                    i7 = 8;
                                    cVar.b(hVar17, hVar18, iE7, 0.5f, hVar3, hVar19, iE6, z19 ? 8 : 5);
                                }
                            } else {
                                dVar3 = dVar26;
                                i7 = i6;
                            }
                            if (dVar24.f0 != i7) {
                                dVar25 = dVar24;
                            }
                            dVar24 = dVar3;
                            dVar25 = dVar25;
                        }
                    }
                } else {
                    c cVar31 = cVarArr2[i3];
                    int i42 = i3 + 1;
                    c cVar32 = dVar13.P[i42];
                    c cVar33 = cVar31.f;
                    androidx.constraintlayout.core.h hVar20 = cVar33 != null ? cVar33.i : null;
                    c cVar34 = cVar32.f;
                    androidx.constraintlayout.core.h hVar21 = cVar34 != null ? cVar34.i : null;
                    c cVar35 = dVar14.P[i3];
                    if (dVar15 != null) {
                        cVar32 = dVar15.P[i42];
                    }
                    if (hVar20 == null || hVar21 == null) {
                        dVar = dVar15;
                    } else {
                        float f11 = i == 0 ? dVar16.c0 : dVar16.d0;
                        int iE8 = cVar35.e();
                        int iE9 = cVar32.e();
                        androidx.constraintlayout.core.h hVar22 = cVar35.i;
                        androidx.constraintlayout.core.h hVar23 = cVar32.i;
                        androidx.constraintlayout.core.h hVar24 = hVar20;
                        dVar = dVar15;
                        cVar.b(hVar22, hVar24, iE8, f11, hVar21, hVar23, iE9, 7);
                    }
                }
                cVar2 = cVar;
                if (z2) {
                    cVarArr = dVar14.P;
                    c cVar210 = cVarArr[i3];
                    if (dVar == null) {
                        dVar = dVar14;
                    }
                    c[] cVarArr12 = dVar.P;
                    i8 = i3 + 1;
                    cVar5 = cVarArr12[i8];
                    cVar6 = cVar210.f;
                    if (cVar6 != null) {
                        hVar4 = cVar6.i;
                    } else {
                        hVar4 = null;
                    }
                    cVar7 = cVar5.f;
                    if (cVar7 != null) {
                        hVar5 = cVar7.i;
                    } else {
                        hVar5 = null;
                    }
                    if (dVar13 != dVar) {
                        c cVar211 = dVar13.P[i8].f;
                        hVar5 = cVar211 != null ? cVar211.i : null;
                    }
                    if (dVar14 == dVar) {
                        cVar5 = cVarArr[i8];
                    }
                    if (hVar4 == null) {
                    }
                } else {
                    cVarArr = dVar14.P;
                    c cVar212 = cVarArr[i3];
                    if (dVar == null) {
                        dVar = dVar14;
                    }
                    c[] cVarArr13 = dVar.P;
                    i8 = i3 + 1;
                    cVar5 = cVarArr13[i8];
                    cVar6 = cVar212.f;
                    if (cVar6 != null) {
                        hVar4 = cVar6.i;
                    } else {
                        hVar4 = null;
                    }
                    cVar7 = cVar5.f;
                    if (cVar7 != null) {
                        hVar5 = cVar7.i;
                    } else {
                        hVar5 = null;
                    }
                    if (dVar13 != dVar) {
                        c cVar213 = dVar13.P[i8].f;
                        hVar5 = cVar213 != null ? cVar213.i : null;
                    }
                    if (dVar14 == dVar) {
                        cVar5 = cVarArr[i8];
                    }
                    if (hVar4 == null) {
                    }
                }
            } else {
                i5 = i14;
            }
            i15 = i4 + 1;
            eVar2 = eVar;
            i14 = i5;
        }
    }

    public static void b(e eVar, androidx.constraintlayout.core.c cVar, d dVar) {
        dVar.n = -1;
        c cVar2 = dVar.L;
        int[] iArr = dVar.o0;
        c cVar3 = dVar.K;
        c cVar4 = dVar.I;
        c cVar5 = dVar.J;
        c cVar6 = dVar.H;
        dVar.o = -1;
        int[] iArr2 = eVar.o0;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i = cVar6.g;
            int iN = eVar.n() - cVar5.g;
            cVar6.i = cVar.k(cVar6);
            cVar5.i = cVar.k(cVar5);
            cVar.d(cVar6.i, i);
            cVar.d(cVar5.i, iN);
            dVar.n = 2;
            dVar.X = i;
            int i2 = iN - i;
            dVar.T = i2;
            int i3 = dVar.a0;
            if (i2 < i3) {
                dVar.T = i3;
            }
        }
        if (iArr2[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i4 = cVar4.g;
        int iK = eVar.k() - cVar3.g;
        cVar4.i = cVar.k(cVar4);
        cVar3.i = cVar.k(cVar3);
        cVar.d(cVar4.i, i4);
        cVar.d(cVar3.i, iK);
        if (dVar.Z > 0 || dVar.f0 == 8) {
            androidx.constraintlayout.core.h hVarK = cVar.k(cVar2);
            cVar2.i = hVarK;
            cVar.d(hVarK, dVar.Z + i4);
        }
        dVar.o = 2;
        dVar.Y = i4;
        int i5 = iK - i4;
        dVar.U = i5;
        int i6 = dVar.b0;
        if (i5 < i6) {
            dVar.U = i6;
        }
    }

    public static final boolean c(int i, int i2) {
        return (i & i2) == i2;
    }
}
