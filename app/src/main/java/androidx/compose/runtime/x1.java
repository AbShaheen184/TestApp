package androidx.compose.runtime;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 implements c {
    public final androidx.collection.y e = new androidx.collection.y();
    public final androidx.collection.j0 y = new androidx.collection.j0();
    public final Object z;

    public x1(Object obj) {
        this.z = obj;
    }

    public final void a(androidx.compose.ui.node.a2 a2Var, androidx.compose.runtime.internal.l lVar) {
        Exception exc;
        androidx.collection.y yVar = this.e;
        int i = yVar.b;
        androidx.collection.j0 j0Var = new androidx.collection.j0();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            androidx.collection.j0 j0Var2 = this.y;
            if (i2 >= i) {
                if (i3 != j0Var2.b) {
                    t.a("Applier operation size mismatch");
                }
                j0Var2.d();
                yVar.b = 0;
                a2Var.n();
                return;
            }
            int i4 = i2 + 1;
            try {
                try {
                    switch (yVar.c(i2)) {
                        case 0:
                            a2Var.k();
                            i2 = i4;
                            break;
                        case 1:
                            int i5 = i3 + 1;
                            a2Var.d(j0Var2.f(i3));
                            i3 = i5;
                            i2 = i4;
                            break;
                        case 2:
                            int i6 = i2 + 2;
                            i2 += 3;
                            a2Var.g(yVar.c(i4), yVar.c(i6));
                            break;
                        case 3:
                            int i7 = i2 + 2;
                            try {
                                int i8 = i2 + 3;
                                try {
                                    i2 += 4;
                                    a2Var.f(yVar.c(i4), yVar.c(i7), yVar.c(i8));
                                } catch (Exception e) {
                                    exc = e;
                                    i2 = i8;
                                }
                            } catch (Exception e2) {
                                exc = e2;
                                i2 = i7;
                            }
                            break;
                        case 4:
                            a2Var.a();
                            i2 = i4;
                            break;
                        case 5:
                            i2 += 2;
                            int i9 = i3 + 1;
                            a2Var.c(yVar.c(i4), j0Var2.f(i3));
                            i3 = i9;
                            break;
                        case 6:
                            i2 += 2;
                            try {
                                yVar.c(i4);
                                int i10 = i3 + 1;
                                i3 = i10;
                            } catch (Exception e3) {
                                exc = e3;
                            }
                            break;
                        case 7:
                            int i11 = i3 + 1;
                            Object objF = j0Var2.f(i3);
                            objF.getClass();
                            kotlin.jvm.internal.c0.c(2, objF);
                            i3 += 2;
                            a2Var.l(j0Var2.f(i11), (kotlin.jvm.functions.p) objF);
                            i2 = i4;
                            break;
                        case 8:
                            Object obj = a2Var.z;
                            if (obj instanceof i) {
                                i iVar = (i) obj;
                                if (lVar.f.j(iVar)) {
                                    iVar.b();
                                }
                            }
                            j0Var.a(obj);
                            a2Var.e();
                            i2 = i4;
                            break;
                        default:
                            i2 = i4;
                            break;
                    }
                } catch (Exception e4) {
                    exc = e4;
                    i2 = i4;
                }
            } catch (Throwable th) {
                a2Var.n();
                throw th;
            }
            exc = e3;
            throw new k(j0Var2, j0Var, yVar, i2 - 1, exc);
        }
    }

    @Override // androidx.compose.runtime.c
    public final void c(int i, Object obj) {
        androidx.collection.y yVar = this.e;
        yVar.a(5);
        yVar.a(i);
        this.y.a(obj);
    }

    @Override // androidx.compose.runtime.c
    public final void d(Object obj) {
        this.e.a(1);
        this.y.a(obj);
    }

    @Override // androidx.compose.runtime.c
    public final void e() {
        this.e.a(8);
    }

    @Override // androidx.compose.runtime.c
    public final void f(int i, int i2, int i3) {
        androidx.collection.y yVar = this.e;
        yVar.a(3);
        yVar.a(i);
        yVar.a(i2);
        yVar.a(i3);
    }

    @Override // androidx.compose.runtime.c
    public final void g(int i, int i2) {
        androidx.collection.y yVar = this.e;
        yVar.a(2);
        yVar.a(i);
        yVar.a(i2);
    }

    @Override // androidx.compose.runtime.c
    public final void k() {
        this.e.a(0);
    }

    @Override // androidx.compose.runtime.c
    public final void l(Object obj, kotlin.jvm.functions.p pVar) {
        this.e.a(7);
        androidx.collection.j0 j0Var = this.y;
        j0Var.a(pVar);
        j0Var.a(obj);
    }

    @Override // androidx.compose.runtime.c
    public final void m(int i, Object obj) {
        androidx.collection.y yVar = this.e;
        yVar.a(6);
        yVar.a(i);
        this.y.a(obj);
    }

    @Override // androidx.compose.runtime.c
    public final Object o() {
        return this.z;
    }
}
