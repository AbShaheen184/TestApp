package androidx.media3.extractor.ts;

import android.util.SparseArray;
import androidx.media3.common.i0;
import androidx.media3.common.util.j0;
import androidx.media3.extractor.h0;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements h {
    public final b0 a;
    public final boolean b;
    public final boolean c;
    public long g;
    public String i;
    public h0 j;
    public o k;
    public boolean l;
    public boolean n;
    public final boolean[] h = new boolean[3];
    public final androidx.media3.exoplayer.h0 d = new androidx.media3.exoplayer.h0(7);
    public final androidx.media3.exoplayer.h0 e = new androidx.media3.exoplayer.h0(8);
    public final androidx.media3.exoplayer.h0 f = new androidx.media3.exoplayer.h0(6);
    public long m = -9223372036854775807L;
    public final androidx.media3.common.util.w o = new androidx.media3.common.util.w();

    public p(b0 b0Var, boolean z, boolean z2) {
        this.a = b0Var;
        this.b = z;
        this.c = z2;
    }

    @Override // androidx.media3.extractor.ts.h
    public final void a() {
        this.g = 0L;
        this.n = false;
        this.m = -9223372036854775807L;
        androidx.media3.container.r.b(this.h);
        this.d.f();
        this.e.f();
        this.f.f();
        this.a.d.c(0);
        o oVar = this.k;
        if (oVar != null) {
            oVar.k = false;
            oVar.o = false;
            n nVar = oVar.n;
            nVar.b = false;
            nVar.a = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:66:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:70:0x020e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0215  */
    /* JADX WARN: Code duplicated, block: B:92:0x0252  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void b(int i, int i2, long j, long j2) {
        long j3;
        int i3;
        long j4;
        long j5;
        boolean z;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z3;
        androidx.appcompat.widget.o oVar = this.a.d;
        if (!this.l || this.k.c) {
            androidx.media3.exoplayer.h0 h0Var = this.d;
            h0Var.d(i2);
            androidx.media3.exoplayer.h0 h0Var2 = this.e;
            h0Var2.d(i2);
            boolean z4 = this.l;
            boolean z5 = h0Var.d;
            if (z4) {
                if (z5) {
                    androidx.media3.container.q qVarM = androidx.media3.container.r.m((byte[]) h0Var.f, 3, h0Var.e);
                    oVar.l(qVarM.s);
                    this.k.d.append(qVarM.d, qVarM);
                    h0Var.f();
                } else if (h0Var2.d) {
                    androidx.media3.container.v vVar = new androidx.media3.container.v((byte[]) h0Var2.f, 4, h0Var2.e);
                    int iF = vVar.f();
                    int iF2 = vVar.f();
                    vVar.i();
                    this.k.e.append(iF, new androidx.media3.container.p(iF, iF2, vVar.d()));
                    h0Var2.f();
                }
            } else if (z5 && h0Var2.d) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf((byte[]) h0Var.f, h0Var.e));
                arrayList.add(Arrays.copyOf((byte[]) h0Var2.f, h0Var2.e));
                androidx.media3.container.q qVarM2 = androidx.media3.container.r.m((byte[]) h0Var.f, 3, h0Var.e);
                int i8 = qVarM2.s;
                androidx.media3.container.v vVar2 = new androidx.media3.container.v((byte[]) h0Var2.f, 4, h0Var2.e);
                int iF3 = vVar2.f();
                int iF4 = vVar2.f();
                vVar2.i();
                androidx.media3.container.p pVar = new androidx.media3.container.p(iF3, iF4, vVar2.d());
                int i9 = qVarM2.a;
                int i10 = qVarM2.b;
                int i11 = qVarM2.c;
                byte[] bArr = androidx.media3.common.util.f.a;
                String str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11));
                h0 h0Var3 = this.j;
                androidx.media3.common.q qVar = new androidx.media3.common.q();
                qVar.a = this.i;
                qVar.m = i0.p("video/mp2t");
                qVar.n = i0.p("video/avc");
                qVar.j = str;
                qVar.u = qVarM2.e;
                qVar.v = qVarM2.f;
                qVar.D = new androidx.media3.common.h(qVarM2.p, qVarM2.q, qVarM2.r, null, qVarM2.h + 8, qVarM2.i + 8);
                qVar.A = qVarM2.g;
                qVar.q = arrayList;
                qVar.p = i8;
                h0Var3.e(new androidx.media3.common.r(qVar));
                this.l = true;
                oVar.l(i8);
                this.k.d.append(qVarM2.d, qVarM2);
                this.k.e.append(iF3, pVar);
                h0Var.f();
                h0Var2.f();
            }
        }
        androidx.media3.exoplayer.h0 h0Var4 = this.f;
        if (h0Var4.d(i2)) {
            int iP = androidx.media3.container.r.p((byte[]) h0Var4.f, h0Var4.e);
            byte[] bArr2 = (byte[]) h0Var4.f;
            androidx.media3.common.util.w wVar = this.o;
            wVar.K(bArr2, iP);
            wVar.M(4);
            oVar.a(j2, wVar);
        }
        o oVar2 = this.k;
        boolean z6 = this.l;
        if (oVar2.i == 9) {
            if (z6 && oVar2.o) {
                j3 = oVar2.j;
                i3 = i + ((int) (j - j3));
                j4 = oVar2.q;
                if (j4 != -9223372036854775807L) {
                    j5 = oVar2.p;
                    if (j3 != j5) {
                        oVar2.a.g(j4, oVar2.r ? 1 : 0, (int) (j3 - j5), i3, null);
                    }
                }
            }
            oVar2.p = oVar2.j;
            oVar2.q = oVar2.l;
            oVar2.r = false;
            oVar2.o = true;
        } else if (oVar2.c) {
            n nVar = oVar2.n;
            n nVar2 = oVar2.m;
            if (nVar.a) {
                if (nVar2.a) {
                    androidx.media3.container.q qVar2 = nVar.c;
                    qVar2.getClass();
                    androidx.media3.container.q qVar3 = nVar2.c;
                    qVar3.getClass();
                    int i12 = qVar3.m;
                    if (nVar.f != nVar2.f || nVar.g != nVar2.g || nVar.h != nVar2.h || ((nVar.i && nVar2.i && nVar.j != nVar2.j) || (((i5 = nVar.d) != (i6 = nVar2.d) && (i5 == 0 || i6 == 0)) || (((i7 = qVar2.m) == 0 && i12 == 0 && (nVar.m != nVar2.m || nVar.n != nVar2.n)) || ((i7 == 1 && i12 == 1 && (nVar.o != nVar2.o || nVar.p != nVar2.p)) || (z3 = nVar.k) != nVar2.k || (z3 && nVar.l != nVar2.l)))))) {
                        if (z6) {
                            j3 = oVar2.j;
                            i3 = i + ((int) (j - j3));
                            j4 = oVar2.q;
                            if (j4 != -9223372036854775807L) {
                                j5 = oVar2.p;
                                if (j3 != j5) {
                                    oVar2.a.g(j4, oVar2.r ? 1 : 0, (int) (j3 - j5), i3, null);
                                }
                            }
                        }
                        oVar2.p = oVar2.j;
                        oVar2.q = oVar2.l;
                        oVar2.r = false;
                        oVar2.o = true;
                    }
                } else {
                    if (z6) {
                        j3 = oVar2.j;
                        i3 = i + ((int) (j - j3));
                        j4 = oVar2.q;
                        if (j4 != -9223372036854775807L) {
                            j5 = oVar2.p;
                            if (j3 != j5) {
                                oVar2.a.g(j4, oVar2.r ? 1 : 0, (int) (j3 - j5), i3, null);
                            }
                        }
                    }
                    oVar2.p = oVar2.j;
                    oVar2.q = oVar2.l;
                    oVar2.r = false;
                    oVar2.o = true;
                }
            }
        }
        if (oVar2.b) {
            n nVar3 = oVar2.n;
            z = nVar3.b && ((i4 = nVar3.e) == 7 || i4 == 2);
        } else {
            z = oVar2.s;
        }
        boolean z7 = oVar2.r;
        int i13 = oVar2.i;
        if (i13 == 5) {
            z2 = true;
        } else if (z) {
            z2 = true;
            if (i13 != 1) {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        boolean z8 = z7 | z2;
        oVar2.r = z8;
        oVar2.i = 24;
        if (z8) {
            this.n = false;
        }
    }

    @Override // androidx.media3.extractor.ts.h
    public final void c(androidx.media3.common.util.w wVar) {
        int i;
        this.j.getClass();
        String str = j0.a;
        int i2 = wVar.b;
        int i3 = wVar.c;
        byte[] bArr = wVar.a;
        this.g += (long) wVar.a();
        this.j.f(wVar.a(), wVar);
        while (true) {
            int iC = androidx.media3.container.r.c(bArr, i2, i3, this.h);
            if (iC == i3) {
                g(bArr, i2, i3);
                return;
            }
            int i4 = bArr[iC + 3] & 31;
            if (iC <= 0 || bArr[iC - 1] != 0) {
                i = 3;
            } else {
                iC--;
                i = 4;
            }
            int i5 = iC;
            int i6 = i;
            int i7 = i5 - i2;
            if (i7 > 0) {
                g(bArr, i2, i5);
            }
            int i8 = i3 - i5;
            long j = this.g - ((long) i8);
            b(i8, i7 < 0 ? -i7 : 0, j, this.m);
            h(j, this.m, i4);
            i2 = i5 + i6;
        }
    }

    @Override // androidx.media3.extractor.ts.h
    public final void d(boolean z) {
        this.j.getClass();
        String str = j0.a;
        if (z) {
            this.a.d.c(0);
            b(0, 0, this.g, this.m);
            h(this.g, this.m, 9);
            b(0, 0, this.g, this.m);
        }
    }

    @Override // androidx.media3.extractor.ts.h
    public final void e(int i, long j) {
        this.m = j;
        this.n = ((i & 2) != 0) | this.n;
    }

    @Override // androidx.media3.extractor.ts.h
    public final void f(androidx.media3.extractor.p pVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.i = e0Var.e;
        e0Var.b();
        h0 h0VarU = pVar.u(e0Var.d, 2);
        this.j = h0VarU;
        this.k = new o(h0VarU, this.b, this.c);
        this.a.b(pVar, e0Var);
    }

    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0104  */
    /* JADX WARN: Code duplicated, block: B:59:0x0106  */
    /* JADX WARN: Code duplicated, block: B:61:0x0109  */
    /* JADX WARN: Code duplicated, block: B:64:0x0110  */
    /* JADX WARN: Code duplicated, block: B:65:0x0115  */
    /* JADX WARN: Code duplicated, block: B:68:0x011a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0121  */
    /* JADX WARN: Code duplicated, block: B:80:0x0137  */
    /* JADX WARN: Code duplicated, block: B:81:0x0139  */
    public final void g(byte[] bArr, int i, int i2) {
        boolean zD;
        boolean zD2;
        boolean z;
        boolean z2;
        int iF;
        int i3;
        int iG;
        int iG2;
        int iE;
        int iG3;
        if (!this.l || this.k.c) {
            this.d.a(bArr, i, i2);
            this.e.a(bArr, i, i2);
        }
        this.f.a(bArr, i, i2);
        o oVar = this.k;
        SparseArray sparseArray = oVar.e;
        androidx.media3.container.v vVar = oVar.f;
        if (oVar.k) {
            int i4 = i2 - i;
            byte[] bArr2 = oVar.g;
            int length = bArr2.length;
            int i5 = oVar.h + i4;
            if (length < i5) {
                oVar.g = Arrays.copyOf(bArr2, i5 * 2);
            }
            System.arraycopy(bArr, i, oVar.g, oVar.h, i4);
            int i6 = oVar.h + i4;
            oVar.h = i6;
            vVar.e = oVar.g;
            vVar.b = 0;
            vVar.c = 0;
            vVar.a = i6;
            vVar.d = 0;
            vVar.a();
            if (vVar.b(8)) {
                vVar.i();
                int iE2 = vVar.e(2);
                vVar.j(5);
                if (vVar.c()) {
                    vVar.f();
                    if (vVar.c()) {
                        int iF2 = vVar.f();
                        if (!oVar.c) {
                            oVar.k = false;
                            n nVar = oVar.n;
                            nVar.e = iF2;
                            nVar.b = true;
                            return;
                        }
                        if (vVar.c()) {
                            int iF3 = vVar.f();
                            if (sparseArray.indexOfKey(iF3) < 0) {
                                oVar.k = false;
                                return;
                            }
                            androidx.media3.container.p pVar = (androidx.media3.container.p) sparseArray.get(iF3);
                            SparseArray sparseArray2 = oVar.d;
                            int i7 = pVar.a;
                            boolean z3 = pVar.b;
                            androidx.media3.container.q qVar = (androidx.media3.container.q) sparseArray2.get(i7);
                            boolean z4 = qVar.j;
                            int i8 = qVar.n;
                            int i9 = qVar.l;
                            if (z4) {
                                if (!vVar.b(2)) {
                                    return;
                                } else {
                                    vVar.j(2);
                                }
                            }
                            if (vVar.b(i9)) {
                                int iE3 = vVar.e(i9);
                                if (!qVar.k) {
                                    if (vVar.b(1)) {
                                        zD = vVar.d();
                                        if (!zD) {
                                            zD2 = false;
                                        } else {
                                            if (!vVar.b(1)) {
                                                return;
                                            }
                                            zD2 = vVar.d();
                                            z = true;
                                        }
                                        if (oVar.i == 5) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            iF = 0;
                                        } else if (!vVar.c()) {
                                            return;
                                        } else {
                                            iF = vVar.f();
                                        }
                                        i3 = qVar.m;
                                        if (i3 == 0) {
                                            if (i3 == 1 || qVar.o) {
                                                iG = 0;
                                                iG2 = 0;
                                                iE = 0;
                                            } else {
                                                if (!vVar.c()) {
                                                    return;
                                                }
                                                iG3 = vVar.g();
                                                if (!z3 || zD) {
                                                    iG = 0;
                                                    iG2 = 0;
                                                } else {
                                                    if (!vVar.c()) {
                                                        return;
                                                    }
                                                    iG2 = vVar.g();
                                                    iG = 0;
                                                }
                                                iE = 0;
                                            }
                                            n nVar2 = oVar.n;
                                            nVar2.c = qVar;
                                            nVar2.d = iE2;
                                            nVar2.e = iF2;
                                            nVar2.f = iE3;
                                            nVar2.g = iF3;
                                            nVar2.h = zD;
                                            nVar2.i = z;
                                            nVar2.j = zD2;
                                            nVar2.k = z2;
                                            nVar2.l = iF;
                                            nVar2.m = iE;
                                            nVar2.n = iG;
                                            nVar2.o = iG3;
                                            nVar2.p = iG2;
                                            nVar2.a = true;
                                            nVar2.b = true;
                                            oVar.k = false;
                                        }
                                        if (!vVar.b(i8)) {
                                            return;
                                        }
                                        iE = vVar.e(i8);
                                        if (z3 || zD) {
                                            iG = 0;
                                        } else if (!vVar.c()) {
                                            return;
                                        } else {
                                            iG = vVar.g();
                                        }
                                        iG2 = 0;
                                        iG3 = 0;
                                        n nVar3 = oVar.n;
                                        nVar3.c = qVar;
                                        nVar3.d = iE2;
                                        nVar3.e = iF2;
                                        nVar3.f = iE3;
                                        nVar3.g = iF3;
                                        nVar3.h = zD;
                                        nVar3.i = z;
                                        nVar3.j = zD2;
                                        nVar3.k = z2;
                                        nVar3.l = iF;
                                        nVar3.m = iE;
                                        nVar3.n = iG;
                                        nVar3.o = iG3;
                                        nVar3.p = iG2;
                                        nVar3.a = true;
                                        nVar3.b = true;
                                        oVar.k = false;
                                    }
                                    return;
                                }
                                zD = false;
                                zD2 = false;
                                z = zD2;
                                if (oVar.i == 5) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    iF = 0;
                                } else if (!vVar.c()) {
                                    return;
                                } else {
                                    iF = vVar.f();
                                }
                                i3 = qVar.m;
                                if (i3 == 0) {
                                    if (i3 == 1) {
                                    }
                                    iG = 0;
                                    iG2 = 0;
                                    iE = 0;
                                } else {
                                    if (!vVar.b(i8)) {
                                        return;
                                    }
                                    iE = vVar.e(i8);
                                    if (z3) {
                                        iG = 0;
                                    } else {
                                        iG = 0;
                                    }
                                    iG2 = 0;
                                }
                                iG3 = 0;
                                n nVar4 = oVar.n;
                                nVar4.c = qVar;
                                nVar4.d = iE2;
                                nVar4.e = iF2;
                                nVar4.f = iE3;
                                nVar4.g = iF3;
                                nVar4.h = zD;
                                nVar4.i = z;
                                nVar4.j = zD2;
                                nVar4.k = z2;
                                nVar4.l = iF;
                                nVar4.m = iE;
                                nVar4.n = iG;
                                nVar4.o = iG3;
                                nVar4.p = iG2;
                                nVar4.a = true;
                                nVar4.b = true;
                                oVar.k = false;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void h(long j, long j2, int i) {
        if (!this.l || this.k.c) {
            this.d.g(i);
            this.e.g(i);
        }
        this.f.g(i);
        o oVar = this.k;
        boolean z = this.n;
        oVar.i = i;
        oVar.l = j2;
        oVar.j = j;
        oVar.s = z;
        if (!oVar.b || i != 1) {
            if (!oVar.c) {
                return;
            }
            if (i != 5 && i != 1 && i != 2) {
                return;
            }
        }
        n nVar = oVar.m;
        oVar.m = oVar.n;
        oVar.n = nVar;
        nVar.b = false;
        nVar.a = false;
        oVar.h = 0;
        oVar.k = true;
    }
}
