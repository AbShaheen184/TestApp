package androidx.compose.ui.node;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {
    public final f0 a;
    public boolean b;
    public boolean c;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public r0 q;
    public b0 d = b0.B;
    public final v0 p = new v0(this);

    public j0(f0 f0Var) {
        this.a = f0Var;
    }

    public final d1 a() {
        return (d1) this.a.d0.e;
    }

    public final void b() {
        b0 b0Var = this.a.e0.d;
        b0 b0Var2 = b0.z;
        b0 b0Var3 = b0.A;
        if (b0Var == b0Var2 || b0Var == b0Var3) {
            if (this.p.W) {
                g(true);
            } else {
                f(true);
            }
        }
        if (b0Var == b0Var3) {
            r0 r0Var = this.q;
            if (r0Var == null || !r0Var.Q) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j) {
        r0 r0Var = this.q;
        if (r0Var != null) {
            j0 j0Var = r0Var.C;
            j0Var.d = b0.y;
            f0 f0Var = j0Var.a;
            j0Var.e = false;
            r0Var.U = j;
            o1 snapshotObserver = ((androidx.compose.ui.platform.u) i0.a(f0Var)).getSnapshotObserver();
            q0 q0Var = r0Var.V;
            snapshotObserver.a.d(f0Var, snapshotObserver.b, q0Var);
            j0Var.f = true;
            j0Var.g = true;
            boolean zO = k.o(f0Var);
            v0 v0Var = j0Var.p;
            if (zO) {
                v0Var.R = true;
                v0Var.S = true;
            } else {
                v0Var.Q = true;
            }
            j0Var.d = b0.B;
        }
    }

    public final void d(int i) {
        int i2 = this.l;
        this.l = i;
        if ((i2 == 0) != (i == 0)) {
            f0 f0VarV = this.a.v();
            j0 j0Var = f0VarV != null ? f0VarV.e0 : null;
            if (j0Var != null) {
                int i3 = j0Var.l;
                if (i == 0) {
                    j0Var.d(i3 - 1);
                } else {
                    j0Var.d(i3 + 1);
                }
            }
        }
    }

    public final void e(int i) {
        int i2 = this.o;
        this.o = i;
        if ((i2 == 0) != (i == 0)) {
            f0 f0VarV = this.a.v();
            j0 j0Var = f0VarV != null ? f0VarV.e0 : null;
            if (j0Var != null) {
                int i3 = j0Var.o;
                if (i == 0) {
                    j0Var.e(i3 - 1);
                } else {
                    j0Var.e(i3 + 1);
                }
            }
        }
    }

    public final void f(boolean z) {
        if (this.k != z) {
            this.k = z;
            if (z && !this.j) {
                d(this.l + 1);
            } else {
                if (z || this.j) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void g(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (z && !this.k) {
                d(this.l + 1);
            } else {
                if (z || this.k) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void h(boolean z) {
        if (this.n != z) {
            this.n = z;
            if (z && !this.m) {
                e(this.o + 1);
            } else {
                if (z || this.m) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void i(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z && !this.n) {
                e(this.o + 1);
            } else {
                if (z || this.n) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void j() {
        v0 v0Var = this.p;
        j0 j0Var = v0Var.C;
        Object obj = v0Var.N;
        f0 f0Var = this.a;
        if ((obj != null || j0Var.a().K() != null) && v0Var.M) {
            v0Var.M = false;
            v0Var.N = j0Var.a().K();
            f0 f0VarV = f0Var.v();
            if (f0VarV != null) {
                f0.V(f0VarV, false, 7);
            }
        }
        r0 r0Var = this.q;
        if (r0Var != null) {
            j0 j0Var2 = r0Var.C;
            if (r0Var.T == null) {
                o0 o0VarR0 = j0Var2.a().R0();
                o0VarR0.getClass();
                if (o0VarR0.L.K() == null) {
                    return;
                }
            }
            if (r0Var.S) {
                r0Var.S = false;
                o0 o0VarR1 = j0Var2.a().R0();
                o0VarR1.getClass();
                r0Var.T = o0VarR1.L.K();
                if (k.o(f0Var)) {
                    f0 f0VarV2 = f0Var.v();
                    if (f0VarV2 != null) {
                        f0.V(f0VarV2, false, 7);
                        return;
                    }
                    return;
                }
                f0 f0VarV3 = f0Var.v();
                if (f0VarV3 != null) {
                    f0.T(f0VarV3, false, 7);
                }
            }
        }
    }
}
