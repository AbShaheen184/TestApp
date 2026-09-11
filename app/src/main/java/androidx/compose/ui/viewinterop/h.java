package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.foundation.text.selection.l0;
import androidx.compose.foundation.text.z0;
import androidx.compose.ui.input.pointer.a0;
import androidx.compose.ui.input.pointer.b0;
import androidx.compose.ui.node.a1;
import androidx.compose.ui.node.f0;
import androidx.compose.ui.node.m1;
import androidx.compose.ui.node.n1;
import androidx.compose.ui.node.o1;
import androidx.compose.ui.node.w1;
import androidx.compose.ui.platform.b3;
import androidx.core.view.k0;
import androidx.core.view.s0;
import androidx.core.view.z1;
import com.app.mlounge.R;
import java.util.LinkedHashMap;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h extends ViewGroup implements androidx.core.view.q, androidx.compose.runtime.i, n1, androidx.core.view.s {
    public kotlin.jvm.functions.a A;
    public boolean B;
    public kotlin.jvm.functions.a C;
    public kotlin.jvm.functions.a D;
    public androidx.compose.ui.r E;
    public kotlin.jvm.functions.l F;
    public androidx.compose.ui.unit.c G;
    public kotlin.jvm.functions.l H;
    public androidx.lifecycle.v I;
    public androidx.savedstate.g J;
    public final int[] K;
    public long L;
    public z1 M;
    public kotlin.jvm.functions.l N;
    public final g O;
    public final g P;
    public kotlin.jvm.functions.l Q;
    public final int[] R;
    public int S;
    public int T;
    public final androidx.core.view.r U;
    public boolean V;
    public final f0 W;
    public final androidx.compose.ui.input.nestedscroll.d e;
    public final View y;
    public final m1 z;

    public h(Context context, androidx.compose.runtime.p pVar, int i, androidx.compose.ui.input.nestedscroll.d dVar, View view, m1 m1Var) {
        super(context);
        this.e = dVar;
        this.y = view;
        this.z = m1Var;
        LinkedHashMap linkedHashMap = b3.a;
        setTag(R.id.androidx_compose_ui_view_composition_context, pVar);
        int i2 = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        v vVar = (v) this;
        s0.o(this, new a(vVar, i2));
        k0.c(this, this);
        this.A = f.B;
        this.C = f.A;
        this.D = f.z;
        this.E = androidx.compose.ui.o.b;
        this.G = _COROUTINE.a.b();
        int i3 = 2;
        this.K = new int[2];
        this.L = 0L;
        int i4 = 1;
        this.O = new g(vVar, i4);
        this.P = new g(vVar, i2);
        this.R = new int[2];
        this.S = Integer.MIN_VALUE;
        this.T = Integer.MIN_VALUE;
        this.U = new androidx.core.view.r();
        f0 f0Var = new f0(3);
        f0Var.M = vVar;
        androidx.compose.ui.r rVarA = androidx.compose.ui.semantics.n.a(androidx.compose.ui.input.nestedscroll.f.a(dVar), true, b.B);
        a0 a0Var = new a0();
        a0Var.b = new b0(vVar, i2);
        z0 z0Var = new z0();
        z0 z0Var2 = a0Var.c;
        if (z0Var2 != null) {
            z0Var2.y = null;
        }
        a0Var.c = z0Var;
        z0Var.y = a0Var;
        setOnRequestDisallowInterceptTouchEvent$ui(z0Var);
        androidx.compose.ui.r rVarD = androidx.compose.ui.layout.a0.l(androidx.compose.ui.draw.h.c(rVarA.d(a0Var), new androidx.compose.animation.h(5, vVar, f0Var, vVar)), new c(vVar, f0Var, i3)).d(new m(new b0(vVar, i3)));
        f0Var.d0(this.E.d(rVarD));
        this.F = new androidx.compose.animation.c(11, f0Var, rVarD);
        f0Var.Z(this.G);
        this.H = new androidx.compose.animation.e(f0Var, 24);
        f0Var.k0 = new c(vVar, f0Var, i2);
        f0Var.l0 = new b0(vVar, i4);
        f0Var.c0(new d(vVar, f0Var));
        this.W = f0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o1 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            androidx.compose.ui.internal.a.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return ((androidx.compose.ui.platform.u) this.z).getSnapshotObserver();
    }

    public static final int k(v vVar, int i, int i2, int i3) {
        if (i3 >= 0 || i == i2) {
            return View.MeasureSpec.makeMeasureSpec(com.google.android.material.resources.c.c(i3, i, i2), 1073741824);
        }
        if (i3 != -2 || i2 == Integer.MAX_VALUE) {
            return (i3 != -1 || i2 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
    }

    public static androidx.core.graphics.c l(androidx.core.graphics.c cVar, int i, int i2, int i3, int i4) {
        int i5 = cVar.a - i;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = cVar.b - i2;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = cVar.c - i3;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = cVar.d - i4;
        return androidx.core.graphics.c.b(i5, i6, i7, i8 >= 0 ? i8 : 0);
    }

    @Override // androidx.compose.runtime.i
    public final void a() {
        this.D.invoke();
    }

    @Override // androidx.compose.runtime.i
    public final void b() {
        this.C.invoke();
        removeAllViewsInLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r24v1, types: [androidx.compose.ui.input.nestedscroll.i] */
    /* JADX WARN: Type inference failed for: r2v12 */
    @Override // androidx.core.view.q
    public final void c(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        char c;
        long j;
        char c2;
        a1 a1Var;
        ?? r18;
        ?? E;
        if (this.y.isNestedScrollingEnabled()) {
            byte b = -1;
            float f = -1;
            char c3 = ' ';
            long j2 = 4294967295L;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i * f)) << 32) | (((long) Float.floatToRawIntBits(i2 * f)) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i4 * f)) & 4294967295L) | (((long) Float.floatToRawIntBits(i3 * f)) << 32);
            int i6 = i5 == 0 ? 1 : 2;
            androidx.compose.ui.input.nestedscroll.i iVar = this.e.a;
            androidx.compose.ui.node.z1 z1Var = null;
            if (iVar == null || !iVar.K) {
                c = ' ';
                j = 4294967295L;
                c2 = 0;
            } else {
                if (!iVar.e.K) {
                    androidx.compose.ui.internal.a.b("visitAncestors called on an unattached node");
                }
                androidx.compose.ui.q qVar = iVar.e.B;
                f0 f0VarT = androidx.compose.ui.node.k.t(iVar);
                loop0: while (true) {
                    if (f0VarT == null) {
                        c = c3;
                        j = j2;
                        break;
                    }
                    c = c3;
                    if ((((androidx.compose.ui.q) f0VarT.d0.g).A & 262144) != 0) {
                        while (qVar != null) {
                            if ((qVar.z & 262144) != 0) {
                                ?? r19 = 0;
                                ?? r1 = qVar;
                                while (r1 != 0) {
                                    byte b2 = b;
                                    if (r1 instanceof androidx.compose.ui.node.z1) {
                                        androidx.compose.ui.node.z1 z1Var2 = (androidx.compose.ui.node.z1) r1;
                                        j = j2;
                                        if (kotlin.jvm.internal.l.a(iVar.i(), z1Var2.i()) && androidx.compose.ui.input.nestedscroll.i.class == z1Var2.getClass()) {
                                            z1Var = z1Var2;
                                            break loop0;
                                        }
                                    } else {
                                        j = j2;
                                        if ((r1.z & 262144) != 0 && (r1 instanceof androidx.compose.ui.node.j)) {
                                            androidx.compose.ui.q qVar2 = ((androidx.compose.ui.node.j) r1).M;
                                            int i7 = 0;
                                            while (qVar2 != null) {
                                                if ((qVar2.z & 262144) == 0) {
                                                    E = r1;
                                                    r18 = r19;
                                                    E = E;
                                                } else {
                                                    i7++;
                                                    if (i7 == 1) {
                                                        E = r1;
                                                        r18 = r19;
                                                        E = E;
                                                        E = qVar2;
                                                        E = r1;
                                                        r18 = r19;
                                                        E = E;
                                                    } else {
                                                        ?? bVar = r18 == 0 ? new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]) : r18;
                                                        if (E != 0) {
                                                            bVar.b(E);
                                                            E = 0;
                                                        }
                                                        bVar.b(qVar2);
                                                        r18 = bVar;
                                                    }
                                                }
                                                qVar2 = qVar2.C;
                                                E = E;
                                                r18 = r18;
                                            }
                                            E = r1;
                                            r18 = r19;
                                            r18 = r18;
                                            if (i7 == 1) {
                                            }
                                            b = b2;
                                            j2 = j;
                                            r1 = E;
                                            r19 = r18;
                                        }
                                        E = androidx.compose.ui.node.k.e(r18);
                                        b = b2;
                                        j2 = j;
                                        r1 = E;
                                        r19 = r18;
                                    }
                                    r18 = r19;
                                    E = androidx.compose.ui.node.k.e(r18);
                                    b = b2;
                                    j2 = j;
                                    r1 = E;
                                    r19 = r18;
                                }
                            }
                            qVar = qVar.B;
                            b = b;
                            j2 = j2;
                        }
                    }
                    byte b3 = b;
                    long j3 = j2;
                    f0VarT = f0VarT.v();
                    qVar = (f0VarT == null || (a1Var = f0VarT.d0) == null) ? null : (w1) a1Var.f;
                    c3 = c;
                    b = b3;
                    j2 = j3;
                }
                c2 = 0;
                z1Var = (androidx.compose.ui.input.nestedscroll.i) z1Var;
            }
            long jN0 = z1Var != null ? z1Var.n0(jFloatToRawIntBits, jFloatToRawIntBits2, i6) : 0L;
            iArr[c2] = kotlin.math.a.F(Float.intBitsToFloat((int) (jN0 >> c))) * (-1);
            iArr[1] = kotlin.math.a.F(Float.intBitsToFloat((int) (jN0 & j))) * (-1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v7 */
    @Override // androidx.core.view.p
    public final void d(View view, int i, int i2, int i3, int i4, int i5) {
        androidx.compose.ui.input.nestedscroll.i iVar;
        androidx.compose.ui.node.z1 z1Var;
        a1 a1Var;
        if (this.y.isNestedScrollingEnabled()) {
            float f = -1;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i * f)) << 32) | (((long) Float.floatToRawIntBits(i2 * f)) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i3 * f)) << 32) | (((long) Float.floatToRawIntBits(i4 * f)) & 4294967295L);
            int i6 = i5 == 0 ? 1 : 2;
            androidx.compose.ui.input.nestedscroll.i iVar2 = this.e.a;
            if (iVar2 == null || !iVar2.K) {
                iVar = null;
            } else {
                if (!iVar2.e.K) {
                    androidx.compose.ui.internal.a.b("visitAncestors called on an unattached node");
                }
                androidx.compose.ui.q qVar = iVar2.e.B;
                f0 f0VarT = androidx.compose.ui.node.k.t(iVar2);
                loop0: while (true) {
                    if (f0VarT == null) {
                        z1Var = null;
                        break;
                    }
                    if ((((androidx.compose.ui.q) f0VarT.d0.g).A & 262144) != 0) {
                        while (qVar != null) {
                            if ((qVar.z & 262144) != 0) {
                                ?? E = qVar;
                                ?? bVar = 0;
                                while (E != 0) {
                                    if (E instanceof androidx.compose.ui.node.z1) {
                                        androidx.compose.ui.node.z1 z1Var2 = (androidx.compose.ui.node.z1) E;
                                        if (kotlin.jvm.internal.l.a(iVar2.i(), z1Var2.i()) && androidx.compose.ui.input.nestedscroll.i.class == z1Var2.getClass()) {
                                            z1Var = z1Var2;
                                            break loop0;
                                        }
                                    } else if ((E.z & 262144) != 0 && (E instanceof androidx.compose.ui.node.j)) {
                                        androidx.compose.ui.q qVar2 = ((androidx.compose.ui.node.j) E).M;
                                        int i7 = 0;
                                        while (qVar2 != null) {
                                            if ((qVar2.z & 262144) != 0) {
                                                i7++;
                                                if (i7 == 1) {
                                                    E = E;
                                                    bVar = bVar;
                                                    bVar = bVar;
                                                    E = qVar2;
                                                } else {
                                                    if (bVar == 0) {
                                                        bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                                    }
                                                    if (E != 0) {
                                                        bVar.b(E);
                                                        E = 0;
                                                    }
                                                    bVar.b(qVar2);
                                                }
                                            } else {
                                                E = E;
                                                bVar = bVar;
                                            }
                                            qVar2 = qVar2.C;
                                            E = E;
                                            bVar = bVar;
                                        }
                                        if (i7 == 1) {
                                            E = E;
                                            bVar = bVar;
                                        } else {
                                            E = E;
                                            bVar = bVar;
                                        }
                                    }
                                    E = androidx.compose.ui.node.k.e(bVar);
                                }
                            }
                            qVar = qVar.B;
                        }
                    }
                    f0VarT = f0VarT.v();
                    qVar = (f0VarT == null || (a1Var = f0VarT.d0) == null) ? null : (w1) a1Var.f;
                }
                iVar = (androidx.compose.ui.input.nestedscroll.i) z1Var;
            }
            if (iVar != null) {
                iVar.n0(jFloatToRawIntBits, jFloatToRawIntBits2, i6);
            }
        }
    }

    @Override // androidx.core.view.p
    public final boolean e(View view, View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    @Override // androidx.core.view.p
    public final void f(View view, View view2, int i, int i2) {
        androidx.core.view.r rVar = this.U;
        if (i2 == 1) {
            rVar.b = i;
        } else {
            rVar.a = i;
        }
    }

    @Override // androidx.core.view.p
    public final void g(View view, int i) {
        androidx.core.view.r rVar = this.U;
        if (i == 1) {
            rVar.b = 0;
        } else {
            rVar.a = 0;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.R;
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], getWidth() + i, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final androidx.compose.ui.unit.c getDensity() {
        return this.G;
    }

    public final View getInteropView() {
        return this.y;
    }

    public final f0 getLayoutNode() {
        return this.W;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.y.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final androidx.lifecycle.v getLifecycleOwner() {
        return this.I;
    }

    public final androidx.compose.ui.r getModifier() {
        return this.E;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        androidx.core.view.r rVar = this.U;
        return rVar.b | rVar.a;
    }

    public final kotlin.jvm.functions.l getOnDensityChanged$ui() {
        return this.H;
    }

    public final kotlin.jvm.functions.l getOnModifierChanged$ui() {
        return this.F;
    }

    public final kotlin.jvm.functions.l getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.Q;
    }

    public final kotlin.jvm.functions.a getRelease() {
        return this.D;
    }

    public final kotlin.jvm.functions.a getReset() {
        return this.C;
    }

    public final androidx.savedstate.g getSavedStateRegistryOwner() {
        return this.J;
    }

    public final kotlin.jvm.functions.a getUpdate() {
        return this.A;
    }

    public final View getView() {
        return this.y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r7v17 */
    @Override // androidx.core.view.p
    public final void h(View view, int i, int i2, int[] iArr, int i3) {
        char c;
        long j;
        a1 a1Var;
        byte b;
        ?? r16;
        ?? E;
        long j2;
        if (this.y.isNestedScrollingEnabled()) {
            byte b2 = -1;
            float f = -1;
            char c2 = ' ';
            long j3 = 4294967295L;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i2 * f)) & 4294967295L) | (((long) Float.floatToRawIntBits(i * f)) << 32);
            int i4 = i3 == 0 ? 1 : 2;
            androidx.compose.ui.input.nestedscroll.i iVar = this.e.a;
            androidx.compose.ui.input.nestedscroll.i iVar2 = null;
            androidx.compose.ui.node.z1 z1Var = null;
            if (iVar == null || !iVar.K) {
                c = ' ';
                j = 4294967295L;
            } else {
                if (!iVar.e.K) {
                    androidx.compose.ui.internal.a.b("visitAncestors called on an unattached node");
                }
                androidx.compose.ui.q qVar = iVar.e.B;
                f0 f0VarT = androidx.compose.ui.node.k.t(iVar);
                loop0: while (true) {
                    if (f0VarT == null) {
                        c = c2;
                        break;
                    }
                    if ((((androidx.compose.ui.q) f0VarT.d0.g).A & 262144) != 0) {
                        while (qVar != null) {
                            if ((qVar.z & 262144) != 0) {
                                ?? r17 = 0;
                                ?? r14 = qVar;
                                while (r14 != 0) {
                                    c = c2;
                                    if (r14 instanceof androidx.compose.ui.node.z1) {
                                        androidx.compose.ui.node.z1 z1Var2 = (androidx.compose.ui.node.z1) r14;
                                        b = b2;
                                        if (kotlin.jvm.internal.l.a(iVar.i(), z1Var2.i()) && androidx.compose.ui.input.nestedscroll.i.class == z1Var2.getClass()) {
                                            z1Var = z1Var2;
                                            break loop0;
                                        }
                                    } else {
                                        b = b2;
                                        if ((r14.z & 262144) != 0 && (r14 instanceof androidx.compose.ui.node.j)) {
                                            androidx.compose.ui.q qVar2 = ((androidx.compose.ui.node.j) r14).M;
                                            int i5 = 0;
                                            while (qVar2 != null) {
                                                long j4 = j3;
                                                if ((qVar2.z & 262144) != 0) {
                                                    i5++;
                                                    if (i5 == 1) {
                                                        E = r14;
                                                        r16 = r17;
                                                        E = qVar2;
                                                    } else {
                                                        ?? bVar = r16 == 0 ? new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]) : r16;
                                                        if (E != 0) {
                                                            bVar.b(E);
                                                            E = 0;
                                                        }
                                                        bVar.b(qVar2);
                                                        r16 = bVar;
                                                    }
                                                } else {
                                                    E = r14;
                                                    r16 = r17;
                                                }
                                                qVar2 = qVar2.C;
                                                j3 = j4;
                                                E = E;
                                                r16 = r16;
                                            }
                                            E = r14;
                                            r16 = r17;
                                            j2 = j3;
                                            r16 = r16;
                                            if (i5 == 1) {
                                            }
                                            c2 = c;
                                            b2 = b;
                                            j3 = j2;
                                            r14 = E;
                                            r17 = r16;
                                        }
                                        E = androidx.compose.ui.node.k.e(r16);
                                        c2 = c;
                                        b2 = b;
                                        j3 = j2;
                                        r14 = E;
                                        r17 = r16;
                                    }
                                    j2 = j3;
                                    r16 = r17;
                                    E = androidx.compose.ui.node.k.e(r16);
                                    c2 = c;
                                    b2 = b;
                                    j3 = j2;
                                    r14 = E;
                                    r17 = r16;
                                }
                            }
                            qVar = qVar.B;
                            c2 = c2;
                            b2 = b2;
                            j3 = j3;
                        }
                    }
                    char c3 = c2;
                    byte b3 = b2;
                    long j5 = j3;
                    f0VarT = f0VarT.v();
                    qVar = (f0VarT == null || (a1Var = f0VarT.d0) == null) ? null : (w1) a1Var.f;
                    c2 = c3;
                    b2 = b3;
                    j3 = j5;
                }
                j = j3;
                iVar2 = (androidx.compose.ui.input.nestedscroll.i) z1Var;
            }
            long jI = iVar2 != null ? iVar2.I(i4, jFloatToRawIntBits) : 0L;
            iArr[0] = kotlin.math.a.F(Float.intBitsToFloat((int) (jI >> c))) * (-1);
            iArr[1] = kotlin.math.a.F(Float.intBitsToFloat((int) (jI & j))) * (-1);
        }
    }

    @Override // androidx.core.view.s
    public final z1 i(View view, z1 z1Var) {
        this.M = new z1(z1Var);
        return m(z1Var);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.V) {
            this.W.C();
            return null;
        }
        this.y.postOnAnimation(new androidx.compose.foundation.text.contextmenu.internal.c(3, this.P));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.y.isNestedScrollingEnabled();
    }

    public final z1 m(z1 z1Var) {
        androidx.core.view.w1 w1Var = z1Var.a;
        androidx.core.graphics.c cVarI = w1Var.i(-1);
        androidx.core.graphics.c cVar = androidx.core.graphics.c.e;
        if (!cVarI.equals(cVar) || !w1Var.j(-9).equals(cVar) || w1Var.h() != null) {
            androidx.compose.ui.node.r rVar = (androidx.compose.ui.node.r) this.W.d0.d;
            if (rVar.o0.K) {
                long jI = android.support.v4.media.session.b.I(rVar.W(0L));
                int i = (int) (jI >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i2 = (int) (jI & 4294967295L);
                if (i2 < 0) {
                    i2 = 0;
                }
                long jU = androidx.compose.ui.layout.a0.g(rVar).u();
                int i3 = (int) (jU >> 32);
                int i4 = (int) (jU & 4294967295L);
                long j = rVar.z;
                long jI2 = android.support.v4.media.session.b.I(rVar.W((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i5 = i3 - ((int) (jI2 >> 32));
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = i4 - ((int) (4294967295L & jI2));
                int i7 = i6 >= 0 ? i6 : 0;
                if (i != 0 || i2 != 0 || i5 != 0 || i7 != 0) {
                    return z1Var.a.r(i, i2, i5, i7);
                }
            }
        }
        return z1Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.O.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.V) {
            this.W.C();
        } else {
            this.y.postOnAnimation(new androidx.compose.foundation.text.contextmenu.internal.c(3, this.P));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().a.b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.y.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.y;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.S = i;
        this.T = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.y.isNestedScrollingEnabled()) {
            return false;
        }
        BuildersKt__Builders_commonKt.launch$default(this.e.c(), null, null, new e(z, this, com.google.android.gms.dynamite.g.d(f * (-1.0f), (-1.0f) * f2), null), 3, null);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!this.y.isNestedScrollingEnabled()) {
            return false;
        }
        BuildersKt__Builders_commonKt.launch$default(this.e.c(), null, null, new l0(this, com.google.android.gms.dynamite.g.d(f * (-1.0f), f2 * (-1.0f)), null, 2), 3, null);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // androidx.compose.ui.node.n1
    public final boolean p() {
        return isAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        kotlin.jvm.functions.l lVar = this.N;
        if (lVar == null) {
            return true;
        }
        lVar.invoke(rect != null ? androidx.compose.ui.graphics.a0.z(rect) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        kotlin.jvm.functions.l lVar = this.Q;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(androidx.compose.ui.unit.c cVar) {
        if (cVar != this.G) {
            this.G = cVar;
            kotlin.jvm.functions.l lVar = this.H;
            if (lVar != null) {
                lVar.invoke(cVar);
            }
        }
    }

    public final void setLifecycleOwner(androidx.lifecycle.v vVar) {
        if (vVar != this.I) {
            this.I = vVar;
            setTag(R.id.view_tree_lifecycle_owner, vVar);
        }
    }

    public final void setModifier(androidx.compose.ui.r rVar) {
        if (rVar != this.E) {
            this.E = rVar;
            kotlin.jvm.functions.l lVar = this.F;
            if (lVar != null) {
                lVar.invoke(rVar);
            }
        }
    }

    public final void setOnDensityChanged$ui(kotlin.jvm.functions.l lVar) {
        this.H = lVar;
    }

    public final void setOnModifierChanged$ui(kotlin.jvm.functions.l lVar) {
        this.F = lVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(kotlin.jvm.functions.l lVar) {
        this.Q = lVar;
    }

    public final void setRelease(kotlin.jvm.functions.a aVar) {
        this.D = aVar;
    }

    public final void setReset(kotlin.jvm.functions.a aVar) {
        this.C = aVar;
    }

    public final void setSavedStateRegistryOwner(androidx.savedstate.g gVar) {
        if (gVar != this.J) {
            this.J = gVar;
            setTag(R.id.view_tree_saved_state_registry_owner, gVar);
        }
    }

    public final void setUpdate(kotlin.jvm.functions.a aVar) {
        this.A = aVar;
        this.B = true;
        this.O.invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}
