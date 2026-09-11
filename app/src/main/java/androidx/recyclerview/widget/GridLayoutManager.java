package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.GridView;
import java.lang.reflect.Field;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean D;
    public final int E;
    public int[] F;
    public View[] G;
    public final SparseIntArray H;
    public final SparseIntArray I;
    public final androidx.media3.common.util.b J;
    public final Rect K;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.D = false;
        this.E = -1;
        this.H = new SparseIntArray();
        this.I = new SparseIntArray();
        androidx.media3.common.util.b bVar = new androidx.media3.common.util.b(21);
        this.J = bVar;
        this.K = new Rect();
        int i3 = c0.H(context, attributeSet, i, i2).b;
        if (i3 == this.E) {
            return;
        }
        this.D = true;
        if (i3 < 1) {
            net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.l(i3, "Span count should be at least 1. Provided "));
            throw null;
        }
        this.E = i3;
        bVar.y();
        m0();
    }

    @Override // androidx.recyclerview.widget.c0
    public final int I(i0 i0Var, l0 l0Var) {
        if (this.o == 0) {
            return this.E;
        }
        if (l0Var.b() < 1) {
            return 0;
        }
        return e1(l0Var.b() - 1, i0Var, l0Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View K0(i0 i0Var, l0 l0Var, boolean z, boolean z2) {
        int i;
        int iU;
        int iU2 = u();
        int i2 = 1;
        if (z2) {
            iU = u() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iU2;
            iU = 0;
        }
        int iB = l0Var.b();
        E0();
        int iQ = this.q.q();
        int iL = this.q.l();
        View view = null;
        View view2 = null;
        while (iU != i) {
            View viewT = t(iU);
            int iG = c0.G(viewT);
            if (iG >= 0 && iG < iB && f1(iG, i0Var, l0Var) == 0) {
                if (((d0) viewT.getLayoutParams()).a.h()) {
                    if (view2 == null) {
                        view2 = viewT;
                    }
                } else {
                    if (this.q.j(viewT) < iL && this.q.g(viewT) >= iQ) {
                        return viewT;
                    }
                    if (view == null) {
                        view = viewT;
                    }
                }
            }
            iU += i2;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v31 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void Q0(i0 i0Var, l0 l0Var, q qVar, androidx.media3.exoplayer.audio.l lVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int iD;
        int iV;
        int iV2;
        ?? r13;
        int i5;
        View viewB;
        int iP = this.q.p();
        boolean z = iP != 1073741824;
        int i6 = u() > 0 ? this.F[this.E] : 0;
        if (z) {
            i1();
        }
        boolean z2 = qVar.e == 1;
        int iG1 = !z2 ? g1(qVar.d, i0Var, l0Var) + f1(qVar.d, i0Var, l0Var) : this.E;
        int i7 = 0;
        while (i7 < this.E && (i5 = qVar.d) >= 0 && i5 < l0Var.b() && iG1 > 0) {
            int i8 = qVar.d;
            int iG2 = g1(i8, i0Var, l0Var);
            if (iG2 > this.E) {
                net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.m(this.E, " spans.", androidx.privacysandbox.ads.adservices.java.internal.a.w("Item at position ", " requires ", i8, " spans but GridLayoutManager has only ", iG2)));
                return;
            }
            iG1 -= iG2;
            if (iG1 < 0 || (viewB = qVar.b(i0Var)) == null) {
                break;
            }
            this.G[i7] = viewB;
            i7++;
        }
        if (i7 == 0) {
            lVar.b = true;
            return;
        }
        if (z2) {
            i3 = 1;
            i2 = i7;
            i = 0;
        } else {
            i = i7 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i9 = 0;
        while (i != i2) {
            View view = this.G[i];
            o oVar = (o) view.getLayoutParams();
            int iG3 = g1(c0.G(view), i0Var, l0Var);
            oVar.f = iG3;
            oVar.e = i9;
            i9 += iG3;
            i += i3;
        }
        float f = 0.0f;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            View view2 = this.G[i11];
            if (qVar.k != null) {
                r13 = 0;
                r13 = 0;
                if (z2) {
                    a(view2, -1, true);
                } else {
                    a(view2, 0, true);
                }
            } else if (z2) {
                r13 = 0;
                a(view2, -1, false);
            } else {
                r13 = 0;
                a(view2, 0, false);
            }
            RecyclerView recyclerView = this.b;
            Rect rect = this.K;
            if (recyclerView == null) {
                rect.set(r13, r13, r13, r13);
            } else {
                rect.set(recyclerView.H(view2));
            }
            h1(view2, iP, r13);
            int iH = this.q.h(view2);
            if (iH > i10) {
                i10 = iH;
            }
            float fI = (this.q.i(view2) * 1.0f) / ((o) view2.getLayoutParams()).f;
            if (fI > f) {
                f = fI;
            }
        }
        if (z) {
            b1(Math.max(Math.round(f * this.E), i6));
            i10 = 0;
            for (int i12 = 0; i12 < i7; i12++) {
                View view3 = this.G[i12];
                h1(view3, 1073741824, true);
                int iH2 = this.q.h(view3);
                if (iH2 > i10) {
                    i10 = iH2;
                }
            }
        }
        for (int i13 = 0; i13 < i7; i13++) {
            View view4 = this.G[i13];
            if (this.q.h(view4) != i10) {
                o oVar2 = (o) view4.getLayoutParams();
                Rect rect2 = oVar2.b;
                int i14 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) oVar2).topMargin + ((ViewGroup.MarginLayoutParams) oVar2).bottomMargin;
                int i15 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) oVar2).leftMargin + ((ViewGroup.MarginLayoutParams) oVar2).rightMargin;
                int iD1 = d1(oVar2.e, oVar2.f);
                if (this.o == 1) {
                    iV2 = c0.v(false, iD1, 1073741824, i15, ((ViewGroup.MarginLayoutParams) oVar2).width);
                    iV = View.MeasureSpec.makeMeasureSpec(i10 - i14, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10 - i15, 1073741824);
                    iV = c0.v(false, iD1, 1073741824, i14, ((ViewGroup.MarginLayoutParams) oVar2).height);
                    iV2 = iMakeMeasureSpec;
                }
                if (w0(view4, iV2, iV, (d0) view4.getLayoutParams())) {
                    view4.measure(iV2, iV);
                }
            }
        }
        int iF = 0;
        lVar.a = i10;
        int i16 = this.o;
        int i17 = qVar.f;
        int i18 = qVar.b;
        if (i16 != 1) {
            if (i17 == -1) {
                iD = i18 - i10;
                i4 = i18;
            } else {
                i4 = i18 + i10;
                iD = i18;
            }
            i18 = iF;
        } else if (i17 == -1) {
            iF = i18 - i10;
            iD = 0;
            i4 = 0;
        } else {
            i4 = 0;
            iF = i18;
            i18 += i10;
            iD = 0;
        }
        int i19 = 0;
        while (true) {
            View[] viewArr = this.G;
            if (i19 >= i7) {
                Arrays.fill(viewArr, (Object) null);
                return;
            }
            View view5 = viewArr[i19];
            o oVar3 = (o) view5.getLayoutParams();
            if (this.o != 1) {
                iF = F() + this.F[oVar3.e];
                i18 = this.q.i(view5) + iF;
            } else if (P0()) {
                int iD2 = D() + this.F[this.E - oVar3.e];
                i4 = iD2;
                iD = iD2 - this.q.i(view5);
            } else {
                iD = D() + this.F[oVar3.e];
                i4 = this.q.i(view5) + iD;
            }
            c0.M(view5, iD, iF, i4, i18);
            if (oVar3.a.h() || oVar3.a.k()) {
                lVar.c = true;
            }
            lVar.d = view5.hasFocusable() | lVar.d;
            i19++;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void R0(i0 i0Var, l0 l0Var, androidx.media3.exoplayer.h0 h0Var, int i) {
        i1();
        if (l0Var.b() > 0 && !l0Var.g) {
            boolean z = i == 1;
            int iF1 = f1(h0Var.b, i0Var, l0Var);
            if (z) {
                while (iF1 > 0) {
                    int i2 = h0Var.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    h0Var.b = i3;
                    iF1 = f1(i3, i0Var, l0Var);
                }
            } else {
                int iB = l0Var.b() - 1;
                int i4 = h0Var.b;
                while (i4 < iB) {
                    int i5 = i4 + 1;
                    int iF2 = f1(i5, i0Var, l0Var);
                    if (iF2 <= iF1) {
                        break;
                    }
                    i4 = i5;
                    iF1 = iF2;
                }
                h0Var.b = i4;
            }
        }
        c1();
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e2, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View S(android.view.View r23, int r24, androidx.recyclerview.widget.i0 r25, androidx.recyclerview.widget.l0 r26) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.S(android.view.View, int, androidx.recyclerview.widget.i0, androidx.recyclerview.widget.l0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.c0
    public final void U(i0 i0Var, l0 l0Var, androidx.core.view.accessibility.d dVar) {
        super.U(i0Var, l0Var, dVar);
        dVar.k(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.c0
    public final void W(i0 i0Var, l0 l0Var, View view, androidx.core.view.accessibility.d dVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof o)) {
            V(view, dVar);
            return;
        }
        o oVar = (o) layoutParams;
        int iE1 = e1(oVar.a.b(), i0Var, l0Var);
        int i = this.o;
        int i2 = oVar.e;
        int i3 = oVar.f;
        if (i == 0) {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, iE1, 1, false, false));
        } else {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(iE1, 1, i2, i3, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.c0
    public final void X(int i, int i2) {
        androidx.media3.common.util.b bVar = this.J;
        bVar.y();
        ((SparseIntArray) bVar.z).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void X0(boolean z) {
        if (z) {
            com.google.gson.b.r("GridLayoutManager does not support stack from end. Consider using reverse layout");
        } else {
            super.X0(false);
        }
    }

    @Override // androidx.recyclerview.widget.c0
    public final void Y() {
        androidx.media3.common.util.b bVar = this.J;
        bVar.y();
        ((SparseIntArray) bVar.z).clear();
    }

    @Override // androidx.recyclerview.widget.c0
    public final void Z(int i, int i2) {
        androidx.media3.common.util.b bVar = this.J;
        bVar.y();
        ((SparseIntArray) bVar.z).clear();
    }

    @Override // androidx.recyclerview.widget.c0
    public final void a0(int i, int i2) {
        androidx.media3.common.util.b bVar = this.J;
        bVar.y();
        ((SparseIntArray) bVar.z).clear();
    }

    @Override // androidx.recyclerview.widget.c0
    public final void b0(int i, int i2) {
        androidx.media3.common.util.b bVar = this.J;
        bVar.y();
        ((SparseIntArray) bVar.z).clear();
    }

    public final void b1(int i) {
        int i2;
        int[] iArr = this.F;
        int i3 = this.E;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.F = iArr;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.c0
    public final void c0(i0 i0Var, l0 l0Var) {
        boolean z = l0Var.g;
        SparseIntArray sparseIntArray = this.I;
        SparseIntArray sparseIntArray2 = this.H;
        if (z) {
            int iU = u();
            for (int i = 0; i < iU; i++) {
                o oVar = (o) t(i).getLayoutParams();
                int iB = oVar.a.b();
                sparseIntArray2.put(iB, oVar.f);
                sparseIntArray.put(iB, oVar.e);
            }
        }
        super.c0(i0Var, l0Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    public final void c1() {
        View[] viewArr = this.G;
        if (viewArr == null || viewArr.length != this.E) {
            this.G = new View[this.E];
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.c0
    public final void d0(l0 l0Var) {
        super.d0(l0Var);
        this.D = false;
    }

    public final int d1(int i, int i2) {
        if (this.o != 1 || !P0()) {
            int[] iArr = this.F;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.F;
        int i3 = this.E;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // androidx.recyclerview.widget.c0
    public final boolean e(d0 d0Var) {
        return d0Var instanceof o;
    }

    public final int e1(int i, i0 i0Var, l0 l0Var) {
        boolean z = l0Var.g;
        androidx.media3.common.util.b bVar = this.J;
        if (!z) {
            bVar.getClass();
            return androidx.media3.common.util.b.x(i, this.E);
        }
        int iB = i0Var.b(i);
        if (iB != -1) {
            bVar.getClass();
            return androidx.media3.common.util.b.x(iB, this.E);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    public final int f1(int i, i0 i0Var, l0 l0Var) {
        boolean z = l0Var.g;
        androidx.media3.common.util.b bVar = this.J;
        if (!z) {
            bVar.getClass();
            return i % this.E;
        }
        int i2 = this.I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iB = i0Var.b(i);
        if (iB != -1) {
            bVar.getClass();
            return iB % this.E;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    public final int g1(int i, i0 i0Var, l0 l0Var) {
        boolean z = l0Var.g;
        androidx.media3.common.util.b bVar = this.J;
        if (!z) {
            bVar.getClass();
            return 1;
        }
        int i2 = this.H.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (i0Var.b(i) != -1) {
            bVar.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    public final void h1(View view, int i, boolean z) {
        int iV;
        int iV2;
        o oVar = (o) view.getLayoutParams();
        Rect rect = oVar.b;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) oVar).topMargin + ((ViewGroup.MarginLayoutParams) oVar).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) oVar).leftMargin + ((ViewGroup.MarginLayoutParams) oVar).rightMargin;
        int iD1 = d1(oVar.e, oVar.f);
        if (this.o == 1) {
            iV2 = c0.v(false, iD1, i, i3, ((ViewGroup.MarginLayoutParams) oVar).width);
            iV = c0.v(true, this.q.r(), this.l, i2, ((ViewGroup.MarginLayoutParams) oVar).height);
        } else {
            int iV3 = c0.v(false, iD1, i, i2, ((ViewGroup.MarginLayoutParams) oVar).height);
            int iV4 = c0.v(true, this.q.r(), this.k, i3, ((ViewGroup.MarginLayoutParams) oVar).width);
            iV = iV3;
            iV2 = iV4;
        }
        d0 d0Var = (d0) view.getLayoutParams();
        if (z ? w0(view, iV2, iV, d0Var) : u0(view, iV2, iV, d0Var)) {
            view.measure(iV2, iV);
        }
    }

    public final void i1() {
        int iC;
        int iF;
        if (this.o == 1) {
            iC = this.m - E();
            iF = D();
        } else {
            iC = this.n - C();
            iF = F();
        }
        b1(iC - iF);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.c0
    public final int j(l0 l0Var) {
        return B0(l0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.c0
    public final int k(l0 l0Var) {
        return C0(l0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.c0
    public final int m(l0 l0Var) {
        return B0(l0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.c0
    public final int n(l0 l0Var) {
        return C0(l0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.c0
    public final int n0(int i, i0 i0Var, l0 l0Var) {
        i1();
        c1();
        return super.n0(i, i0Var, l0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.c0
    public final int o0(int i, i0 i0Var, l0 l0Var) {
        i1();
        c1();
        return super.o0(i, i0Var, l0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.c0
    public final d0 q() {
        return this.o == 0 ? new o(-2, -1) : new o(-1, -2);
    }

    @Override // androidx.recyclerview.widget.c0
    public final d0 r(Context context, AttributeSet attributeSet) {
        o oVar = new o(context, attributeSet);
        oVar.e = -1;
        oVar.f = 0;
        return oVar;
    }

    @Override // androidx.recyclerview.widget.c0
    public final void r0(Rect rect, int i, int i2) {
        int iF;
        int iF2;
        if (this.F == null) {
            super.r0(rect, i, i2);
        }
        int iE = E() + D();
        int iC = C() + F();
        if (this.o == 1) {
            int iHeight = rect.height() + iC;
            RecyclerView recyclerView = this.b;
            Field field = androidx.core.view.s0.a;
            iF2 = c0.f(i2, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.F;
            iF = c0.f(i, iArr[iArr.length - 1] + iE, this.b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iE;
            RecyclerView recyclerView2 = this.b;
            Field field2 = androidx.core.view.s0.a;
            iF = c0.f(i, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.F;
            iF2 = c0.f(i2, iArr2[iArr2.length - 1] + iC, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(iF, iF2);
    }

    @Override // androidx.recyclerview.widget.c0
    public final d0 s(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            o oVar = new o((ViewGroup.MarginLayoutParams) layoutParams);
            oVar.e = -1;
            oVar.f = 0;
            return oVar;
        }
        o oVar2 = new o(layoutParams);
        oVar2.e = -1;
        oVar2.f = 0;
        return oVar2;
    }

    @Override // androidx.recyclerview.widget.c0
    public final int w(i0 i0Var, l0 l0Var) {
        if (this.o == 1) {
            return this.E;
        }
        if (l0Var.b() < 1) {
            return 0;
        }
        return e1(l0Var.b() - 1, i0Var, l0Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.c0
    public final boolean x0() {
        return this.y == null && !this.D;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void z0(l0 l0Var, q qVar, androidx.media3.common.util.e eVar) {
        int i;
        int i2 = this.E;
        for (int i3 = 0; i3 < this.E && (i = qVar.d) >= 0 && i < l0Var.b() && i2 > 0; i3++) {
            eVar.b(qVar.d, Math.max(0, qVar.g));
            this.J.getClass();
            i2--;
            qVar.d += qVar.e;
        }
    }
}
