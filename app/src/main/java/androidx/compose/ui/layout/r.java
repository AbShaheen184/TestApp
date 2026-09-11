package androidx.compose.ui.layout;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.core.view.z1;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends androidx.core.view.w0 implements Runnable, androidx.core.view.s, View.OnAttachStateChangeListener {
    public boolean A;
    public int B;
    public z1 C;
    public final androidx.collection.o0 D;
    public final androidx.compose.runtime.e1 E;
    public final androidx.collection.j0 F;
    public final androidx.compose.runtime.snapshots.q G;

    public r() {
        super(1);
        androidx.collection.o0 o0Var = new androidx.collection.o0(9);
        q1.a.getClass();
        o0Var.m(p1.b, new t1("caption bar"));
        o0Var.m(p1.c, new t1("display cutout"));
        o0Var.m(p1.d, new t1("ime"));
        o0Var.m(p1.e, new t1("mandatory system gestures"));
        o0Var.m(p1.f, new t1("navigation bars"));
        o0Var.m(p1.g, new t1("status bars"));
        o0Var.m(p1.h, new t1("system gestures"));
        o0Var.m(p1.i, new t1("tappable element"));
        o0Var.m(p1.j, new t1("waterfall"));
        this.D = o0Var;
        this.E = new androidx.compose.runtime.e1(0);
        this.F = new androidx.collection.j0(4);
        this.G = new androidx.compose.runtime.snapshots.q();
    }

    public final void P(z1 z1Var) {
        char c;
        char c2;
        boolean z;
        char c3;
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        boolean z5;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        Object[] objArr2;
        int i;
        androidx.collection.z zVar = s1.a;
        int[] iArr2 = zVar.b;
        Object[] objArr3 = zVar.c;
        long[] jArr2 = zVar.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            z2 = false;
            z3 = false;
            c = 16;
            c2 = ' ';
            while (true) {
                long j2 = jArr2[i2];
                z = true;
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    c3 = '0';
                    while (i5 < i4) {
                        if ((j2 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr2[i6];
                            q1 q1Var = (q1) objArr3[i6];
                            androidx.core.graphics.c cVarI = z1Var.a.i(i7);
                            long j3 = (((long) cVarI.a) << 48) | (((long) cVarI.b) << 32) | (((long) cVarI.c) << 16) | ((long) cVarI.d);
                            Object objG = this.D.g(q1Var);
                            objG.getClass();
                            t1 t1Var = (t1) objG;
                            if (!a0.f(j3, t1Var.h)) {
                                t1Var.h = j3;
                                z2 = true;
                                if (!a0.f(j3, 0L)) {
                                    z3 = true;
                                }
                            }
                            if (i7 != 8) {
                                androidx.core.graphics.c cVarJ = z1Var.a.j(i7);
                                objArr2 = objArr3;
                                long j4 = (((long) cVarJ.b) << 32) | (((long) cVarJ.a) << 48) | (((long) cVarJ.c) << 16) | ((long) cVarJ.d);
                                if (!a0.f(t1Var.i, j4)) {
                                    t1Var.i = j4;
                                    z2 = true;
                                    if (!a0.f(j4, 0L)) {
                                        z3 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            t1Var.a.setValue(Boolean.valueOf(z1Var.a.u(i7)));
                            i = 8;
                        } else {
                            objArr2 = objArr3;
                            i = i3;
                        }
                        j2 >>= i;
                        i5++;
                        i3 = i;
                        objArr3 = objArr2;
                        jArr2 = jArr2;
                        iArr2 = iArr2;
                    }
                    jArr = jArr2;
                    iArr = iArr2;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr2;
                    iArr = iArr2;
                    objArr = objArr3;
                    c3 = '0';
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                objArr3 = objArr;
                jArr2 = jArr;
                iArr2 = iArr;
            }
        } else {
            c = 16;
            c2 = ' ';
            z = true;
            c3 = '0';
            z2 = false;
            z3 = false;
        }
        androidx.core.view.h hVarH = z1Var.a.h();
        if (hVarH == null) {
            j = 0;
        } else {
            androidx.core.graphics.c cVarC = Build.VERSION.SDK_INT >= 30 ? androidx.core.graphics.c.c(androidx.compose.ui.graphics.layer.i.d(hVarH.a)) : androidx.core.graphics.c.e;
            j = (((long) cVarC.a) << c3) | (((long) cVarC.b) << c2) | (((long) cVarC.c) << c) | ((long) cVarC.d);
        }
        androidx.collection.o0 o0Var = this.D;
        q1.a.getClass();
        Object objG2 = o0Var.g(p1.j);
        objG2.getClass();
        t1 t1Var2 = (t1) objG2;
        t1Var2.a.setValue(Boolean.valueOf(!a0.f(j, 0L)));
        if (!a0.f(t1Var2.h, j)) {
            t1Var2.h = j;
            t1Var2.i = j;
            z2 = z;
            if (!a0.f(j, 0L)) {
                z3 = z2;
            }
        }
        if (hVarH == null) {
            androidx.collection.j0 j0Var = this.F;
            if (j0Var.b > 0) {
                j0Var.d();
                this.G.clear();
                z2 = z;
            }
        } else {
            List listD = Build.VERSION.SDK_INT >= 28 ? androidx.compose.foundation.text.selection.s0.d(hVarH.a) : Collections.EMPTY_LIST;
            int size = listD.size();
            androidx.collection.j0 j0Var2 = this.F;
            if (size < j0Var2.b) {
                j0Var2.l(listD.size(), this.F.b);
                this.G.e(listD.size(), this.G.size());
                z2 = z;
            } else {
                int size2 = listD.size() - this.F.b;
                int i8 = 0;
                while (i8 < size2) {
                    androidx.collection.j0 j0Var3 = this.F;
                    j0Var3.a(androidx.compose.runtime.s.r(listD.get(j0Var3.b)));
                    this.G.add(new q("display cutout rect " + this.F.b));
                    i8++;
                    z2 = z;
                }
            }
            int size3 = listD.size();
            for (int i9 = 0; i9 < size3; i9++) {
                Rect rect = (Rect) listD.get(i9);
                androidx.compose.runtime.y0 y0Var = (androidx.compose.runtime.y0) this.F.f(i9);
                if (!kotlin.jvm.internal.l.a(y0Var.getValue(), rect)) {
                    y0Var.setValue(rect);
                    z2 = z;
                }
            }
            if (!listD.isEmpty()) {
                z3 = z;
            }
        }
        if ((z3 || this.E.g() != 0) && z2) {
            androidx.compose.runtime.e1 e1Var = this.E;
            e1Var.h(e1Var.g() + 1);
            synchronized (androidx.compose.runtime.snapshots.n.c) {
                androidx.collection.p0 p0Var = androidx.compose.runtime.snapshots.n.j.h;
                z4 = (p0Var == null || p0Var.h() != (z5 = z)) ? false : z5;
            }
            if (z4) {
                androidx.compose.runtime.snapshots.n.a();
            }
        }
    }

    @Override // androidx.core.view.s
    public final z1 i(View view, z1 z1Var) {
        if (this.A) {
            this.C = z1Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return z1Var;
            }
        } else if (this.B == 0) {
            P(z1Var);
        }
        return z1Var;
    }

    @Override // androidx.core.view.w0
    public final void n(androidx.core.view.f1 f1Var) {
        boolean z = false;
        this.A = false;
        int iD = f1Var.a.d();
        this.B &= ~iD;
        this.C = null;
        q1 q1Var = (q1) s1.a.b(iD);
        if (q1Var != null) {
            Object objG = this.D.g(q1Var);
            objG.getClass();
            t1 t1Var = (t1) objG;
            t1Var.c.h(0.0f);
            t1Var.e.h(1.0f);
            t1Var.d.h(0L);
            t1Var.c.h(0.0f);
            t1Var.b.setValue(Boolean.FALSE);
            t1Var.j = -1L;
            t1Var.k = -1L;
            androidx.compose.runtime.e1 e1Var = this.E;
            e1Var.h(e1Var.g() + 1);
            synchronized (androidx.compose.runtime.snapshots.n.c) {
                androidx.collection.p0 p0Var = androidx.compose.runtime.snapshots.n.j.h;
                if (p0Var != null && p0Var.h()) {
                    z = true;
                }
            }
            if (z) {
                androidx.compose.runtime.snapshots.n.a();
            }
        }
    }

    @Override // androidx.core.view.w0
    public final void o() {
        this.A = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        Field field = androidx.core.view.s0.a;
        androidx.core.view.k0.c(view, this);
        androidx.core.view.s0.o(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        Field field = androidx.core.view.s0.a;
        androidx.core.view.k0.c(view, null);
        androidx.core.view.s0.o(view, null);
    }

    @Override // androidx.core.view.w0
    public final z1 p(z1 z1Var, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            androidx.core.view.f1 f1Var = (androidx.core.view.f1) list.get(i);
            q1 q1Var = (q1) s1.a.b(f1Var.a.d());
            if (q1Var != null) {
                Object objG = this.D.g(q1Var);
                objG.getClass();
                t1 t1Var = (t1) objG;
                if (((Boolean) t1Var.b.getValue()).booleanValue()) {
                    androidx.core.view.e1 e1Var = f1Var.a;
                    t1Var.c.h(e1Var.c());
                    t1Var.e.h(e1Var.a());
                    t1Var.d.h(e1Var.b());
                }
            }
        }
        P(z1Var);
        return z1Var;
    }

    @Override // androidx.core.view.w0
    public final androidx.compose.foundation.text.input.internal.o q(androidx.core.view.f1 f1Var, androidx.compose.foundation.text.input.internal.o oVar) {
        z1 z1Var = this.C;
        boolean z = false;
        this.A = false;
        this.C = null;
        if (f1Var.a.b() > 0 && z1Var != null) {
            int iD = f1Var.a.d();
            this.B |= iD;
            q1 q1Var = (q1) s1.a.b(iD);
            if (q1Var != null) {
                Object objG = this.D.g(q1Var);
                objG.getClass();
                t1 t1Var = (t1) objG;
                androidx.core.graphics.c cVarI = z1Var.a.i(iD);
                long j = (((long) cVarI.a) << 48) | (((long) cVarI.b) << 32) | (((long) cVarI.c) << 16) | ((long) cVarI.d);
                long j2 = t1Var.h;
                if (!a0.f(j, j2)) {
                    t1Var.j = j2;
                    t1Var.k = j;
                    t1Var.b.setValue(Boolean.TRUE);
                    androidx.core.view.e1 e1Var = f1Var.a;
                    t1Var.c.h(e1Var.c());
                    t1Var.e.h(e1Var.a());
                    t1Var.d.h(e1Var.b());
                    androidx.compose.runtime.e1 e1Var2 = this.E;
                    e1Var2.h(e1Var2.g() + 1);
                    synchronized (androidx.compose.runtime.snapshots.n.c) {
                        androidx.collection.p0 p0Var = androidx.compose.runtime.snapshots.n.j.h;
                        if (p0Var != null && p0Var.h()) {
                            z = true;
                        }
                    }
                    if (z) {
                        androidx.compose.runtime.snapshots.n.a();
                        return oVar;
                    }
                }
            }
        }
        return oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.A) {
            this.B = 0;
            this.A = false;
            z1 z1Var = this.C;
            if (z1Var != null) {
                P(z1Var);
                this.C = null;
            }
        }
    }
}
