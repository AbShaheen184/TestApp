package androidx.constraintlayout.core.widgets.analyzer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o implements d {
    public int a;
    public androidx.constraintlayout.core.widgets.d b;
    public l c;
    public int d;
    public final g e = new g(this);
    public int f = 0;
    public boolean g = false;
    public final f h = new f(this);
    public final f i = new f(this);
    public int j = 1;

    public o(androidx.constraintlayout.core.widgets.d dVar) {
        this.b = dVar;
    }

    public static void b(f fVar, f fVar2, int i) {
        fVar.l.add(fVar2);
        fVar.f = i;
        fVar2.k.add(fVar);
    }

    public static f h(androidx.constraintlayout.core.widgets.c cVar) {
        androidx.constraintlayout.core.widgets.c cVar2 = cVar.f;
        if (cVar2 == null) {
            return null;
        }
        androidx.constraintlayout.core.widgets.d dVar = cVar2.d;
        int iE = androidx.constraintlayout.core.g.e(cVar2.e);
        if (iE == 1) {
            return dVar.d.h;
        }
        if (iE == 2) {
            return dVar.e.h;
        }
        if (iE == 3) {
            return dVar.d.i;
        }
        if (iE == 4) {
            return dVar.e.i;
        }
        if (iE != 5) {
            return null;
        }
        return dVar.e.k;
    }

    public static f i(androidx.constraintlayout.core.widgets.c cVar, int i) {
        androidx.constraintlayout.core.widgets.c cVar2 = cVar.f;
        if (cVar2 == null) {
            return null;
        }
        androidx.constraintlayout.core.widgets.d dVar = cVar2.d;
        o oVar = i == 0 ? dVar.d : dVar.e;
        int iE = androidx.constraintlayout.core.g.e(cVar2.e);
        if (iE == 1 || iE == 2) {
            return oVar.h;
        }
        if (iE == 3 || iE == 4) {
            return oVar.i;
        }
        return null;
    }

    public final void c(f fVar, f fVar2, int i, g gVar) {
        fVar.l.add(fVar2);
        fVar.l.add(this.e);
        fVar.h = i;
        fVar.i = gVar;
        fVar2.k.add(fVar);
        gVar.k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        androidx.constraintlayout.core.widgets.d dVar = this.b;
        if (i2 == 0) {
            int i3 = dVar.u;
            int iMax = Math.max(dVar.t, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            int i4 = dVar.x;
            int iMax2 = Math.max(dVar.w, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    public long j() {
        g gVar = this.e;
        if (gVar.j) {
            return gVar.g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code duplicated, block: B:28:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    public final void l(androidx.constraintlayout.core.widgets.c cVar, androidx.constraintlayout.core.widgets.c cVar2, int i) {
        g gVar;
        float f;
        int i2;
        int i3;
        f fVarH = h(cVar);
        f fVarH2 = h(cVar2);
        if (fVarH.j && fVarH2.j) {
            int iE = cVar.e() + fVarH.g;
            int iE2 = fVarH2.g - cVar2.e();
            int i4 = iE2 - iE;
            g gVar2 = this.e;
            if (!gVar2.j && this.d == 3) {
                int i5 = this.a;
                if (i5 == 0) {
                    gVar2.d(g(i4, i));
                } else if (i5 == 1) {
                    gVar2.d(Math.min(g(gVar2.m, i), i4));
                } else if (i5 == 2) {
                    androidx.constraintlayout.core.widgets.d dVar = this.b;
                    androidx.constraintlayout.core.widgets.d dVar2 = dVar.S;
                    if (dVar2 != null) {
                        g gVar3 = (i == 0 ? dVar2.d : dVar2.e).e;
                        if (gVar3.j) {
                            gVar2.d(g((int) ((gVar3.g * (i == 0 ? dVar.v : dVar.y)) + 0.5f), i));
                        }
                    }
                } else if (i5 == 3) {
                    androidx.constraintlayout.core.widgets.d dVar3 = this.b;
                    o oVar = dVar3.d;
                    if (oVar.d == 3 && oVar.a == 3) {
                        m mVar = dVar3.e;
                        if (mVar.d != 3 || mVar.a != 3) {
                            if (i == 0) {
                                oVar = dVar3.e;
                            }
                            gVar = oVar.e;
                            if (gVar.j) {
                                f = dVar3.V;
                                i2 = gVar.g;
                                if (i == 1) {
                                    i3 = (int) ((i2 / f) + 0.5f);
                                } else {
                                    i3 = (int) ((f * i2) + 0.5f);
                                }
                                gVar2.d(i3);
                            }
                        }
                    } else {
                        if (i == 0) {
                            oVar = dVar3.e;
                        }
                        gVar = oVar.e;
                        if (gVar.j) {
                            f = dVar3.V;
                            i2 = gVar.g;
                            if (i == 1) {
                                i3 = (int) ((i2 / f) + 0.5f);
                            } else {
                                i3 = (int) ((f * i2) + 0.5f);
                            }
                            gVar2.d(i3);
                        }
                    }
                }
            }
            if (gVar2.j) {
                int i6 = gVar2.g;
                f fVar = this.i;
                f fVar2 = this.h;
                if (i6 == i4) {
                    fVar2.d(iE);
                    fVar.d(iE2);
                    return;
                }
                androidx.constraintlayout.core.widgets.d dVar4 = this.b;
                float f2 = i == 0 ? dVar4.c0 : dVar4.d0;
                if (fVarH == fVarH2) {
                    iE = fVarH.g;
                    iE2 = fVarH2.g;
                    f2 = 0.5f;
                }
                fVar2.d((int) ((((iE2 - iE) - i6) * f2) + iE + 0.5f));
                fVar.d(fVar2.g + gVar2.g);
            }
        }
    }
}
