package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.widget.c2;
import androidx.collection.y0;
import androidx.compose.foundation.gestures.y2;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {
    public c2 a;
    public RecyclerView b;
    public final androidx.media3.common.util.b c;
    public final androidx.media3.common.util.b d;
    public boolean e;
    public boolean f;
    public final boolean g;
    public final boolean h;
    public int i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public int n;

    public c0() {
        androidx.media3.exoplayer.hls.c cVar = new androidx.media3.exoplayer.hls.c(this);
        androidx.media3.exoplayer.dash.manifest.t tVar = new androidx.media3.exoplayer.dash.manifest.t(this, 11);
        this.c = new androidx.media3.common.util.b(cVar);
        this.d = new androidx.media3.common.util.b(tVar);
        this.e = false;
        this.f = false;
        this.g = true;
        this.h = true;
    }

    public static int G(View view) {
        return ((d0) view.getLayoutParams()).a.b();
    }

    public static b0 H(Context context, AttributeSet attributeSet, int i, int i2) {
        b0 b0Var = new b0();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.recyclerview.a.a, i, i2);
        b0Var.a = typedArrayObtainStyledAttributes.getInt(0, 1);
        b0Var.b = typedArrayObtainStyledAttributes.getInt(10, 1);
        b0Var.c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        b0Var.d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return b0Var;
    }

    public static boolean L(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public static void M(View view, int i, int i2, int i3, int i4) {
        d0 d0Var = (d0) view.getLayoutParams();
        Rect rect = d0Var.b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) d0Var).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) d0Var).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) d0Var).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) d0Var).bottomMargin);
    }

    public static int f(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i2, i3) : size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX WARN: Code duplicated, block: B:5:0x0010  */
    public static int v(boolean z, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, i - i3);
        if (z) {
            if (i4 >= 0) {
                i2 = 1073741824;
            } else if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                i2 = 0;
                i4 = 0;
            } else {
                i4 = iMax;
            }
        } else if (i4 >= 0) {
            i2 = 1073741824;
        } else if (i4 == -1) {
            i4 = iMax;
        } else if (i4 != -2) {
            i2 = 0;
            i4 = 0;
        } else if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
            i4 = iMax;
            i2 = Integer.MIN_VALUE;
        } else {
            i4 = iMax;
            i2 = 0;
        }
        return View.MeasureSpec.makeMeasureSpec(i4, i2);
    }

    public static int y(View view) {
        Rect rect = ((d0) view.getLayoutParams()).b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static int z(View view) {
        Rect rect = ((d0) view.getLayoutParams()).b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public final int A() {
        RecyclerView recyclerView = this.b;
        v adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public final int B() {
        RecyclerView recyclerView = this.b;
        Field field = androidx.core.view.s0.a;
        return recyclerView.getLayoutDirection();
    }

    public final int C() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int D() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int I(i0 i0Var, l0 l0Var) {
        return -1;
    }

    public final void J(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((d0) view.getLayoutParams()).b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.b.H;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean K();

    public void N(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int iY = recyclerView.C.y();
            for (int i2 = 0; i2 < iY; i2++) {
                recyclerView.C.x(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void O(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int iY = recyclerView.C.y();
            for (int i2 = 0; i2 < iY; i2++) {
                recyclerView.C.x(i2).offsetTopAndBottom(i);
            }
        }
    }

    public abstract void R(RecyclerView recyclerView);

    public abstract View S(View view, int i, i0 i0Var, l0 l0Var);

    public void T(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.b;
        i0 i0Var = recyclerView.z;
        l0 l0Var = recyclerView.A0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        v vVar = this.b.I;
        if (vVar != null) {
            accessibilityEvent.setItemCount(vVar.a());
        }
    }

    public void U(i0 i0Var, l0 l0Var, androidx.core.view.accessibility.d dVar) {
        if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
            dVar.a(8192);
            dVar.p(true);
        }
        if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
            dVar.a(4096);
            dVar.p(true);
        }
        dVar.a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(I(i0Var, l0Var), w(i0Var, l0Var), false, 0));
    }

    public final void V(View view, androidx.core.view.accessibility.d dVar) {
        p0 p0VarG = RecyclerView.G(view);
        if (p0VarG == null || p0VarG.h()) {
            return;
        }
        c2 c2Var = this.a;
        if (((ArrayList) c2Var.A).contains(p0VarG.a)) {
            return;
        }
        RecyclerView recyclerView = this.b;
        W(recyclerView.z, recyclerView.A0, view, dVar);
    }

    public final void a(View view, int i, boolean z) {
        p0 p0VarG = RecyclerView.G(view);
        if (z || p0VarG.h()) {
            y0 y0Var = (y0) this.b.D.y;
            x0 x0VarA = (x0) y0Var.get(p0VarG);
            if (x0VarA == null) {
                x0VarA = x0.a();
                y0Var.put(p0VarG, x0VarA);
            }
            x0VarA.a |= 1;
        } else {
            this.b.D.F(p0VarG);
        }
        d0 d0Var = (d0) view.getLayoutParams();
        if (p0VarG.p() || p0VarG.i()) {
            if (p0VarG.i()) {
                p0VarG.n.m(p0VarG);
            } else {
                p0VarG.j &= -33;
            }
            this.a.p(view, i, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.b;
            c2 c2Var = this.a;
            if (parent == recyclerView) {
                y2 y2Var = (y2) c2Var.z;
                int iIndexOfChild = ((u) c2Var.y).a.indexOfChild(view);
                int iE = (iIndexOfChild == -1 || y2Var.G(iIndexOfChild)) ? -1 : iIndexOfChild - y2Var.E(iIndexOfChild);
                if (i == -1) {
                    i = this.a.y();
                }
                if (iE == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.w());
                }
                if (iE != i) {
                    c0 c0Var = this.b.J;
                    View viewT = c0Var.t(iE);
                    if (viewT == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iE + c0Var.b.toString());
                    }
                    c0Var.t(iE);
                    c0Var.a.u(iE);
                    d0 d0Var2 = (d0) viewT.getLayoutParams();
                    p0 p0VarG2 = RecyclerView.G(viewT);
                    boolean zH = p0VarG2.h();
                    RecyclerView recyclerView2 = c0Var.b;
                    if (zH) {
                        y0 y0Var2 = (y0) recyclerView2.D.y;
                        x0 x0VarA2 = (x0) y0Var2.get(p0VarG2);
                        if (x0VarA2 == null) {
                            x0VarA2 = x0.a();
                            y0Var2.put(p0VarG2, x0VarA2);
                        }
                        x0VarA2.a = 1 | x0VarA2.a;
                    } else {
                        recyclerView2.D.F(p0VarG2);
                    }
                    c0Var.a.p(viewT, i, d0Var2, p0VarG2.h());
                }
            } else {
                c2Var.o(view, i, false);
                d0Var.c = true;
            }
        }
        if (d0Var.d) {
            p0VarG.a.invalidate();
            d0Var.d = false;
        }
    }

    public void b(String str) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.f(str);
        }
    }

    public abstract boolean c();

    public abstract void c0(i0 i0Var, l0 l0Var);

    public abstract boolean d();

    public abstract void d0(l0 l0Var);

    public boolean e(d0 d0Var) {
        return d0Var != null;
    }

    public Parcelable f0() {
        return null;
    }

    public final void h0(i0 i0Var) {
        for (int iU = u() - 1; iU >= 0; iU--) {
            if (!RecyclerView.G(t(iU)).o()) {
                View viewT = t(iU);
                k0(iU);
                i0Var.i(viewT);
            }
        }
    }

    public abstract int i(l0 l0Var);

    public final void i0(i0 i0Var) {
        ArrayList arrayList;
        int size = i0Var.a.size();
        int i = size - 1;
        while (true) {
            arrayList = i0Var.a;
            if (i < 0) {
                break;
            }
            View view = ((p0) arrayList.get(i)).a;
            p0 p0VarG = RecyclerView.G(view);
            if (!p0VarG.o()) {
                p0VarG.n(false);
                if (p0VarG.j()) {
                    this.b.removeDetachedView(view, false);
                }
                z zVar = this.b.j0;
                if (zVar != null) {
                    zVar.d(p0VarG);
                }
                p0VarG.n(true);
                p0 p0VarG2 = RecyclerView.G(view);
                p0VarG2.n = null;
                p0VarG2.o = false;
                p0VarG2.j &= -33;
                i0Var.j(p0VarG2);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = i0Var.b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    public abstract int j(l0 l0Var);

    public final void j0(View view, i0 i0Var) {
        c2 c2Var = this.a;
        u uVar = (u) c2Var.y;
        int iIndexOfChild = uVar.a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            if (((y2) c2Var.z).J(iIndexOfChild)) {
                c2Var.e0(view);
            }
            uVar.a(iIndexOfChild);
        }
        i0Var.i(view);
    }

    public abstract int k(l0 l0Var);

    public final void k0(int i) {
        if (t(i) != null) {
            c2 c2Var = this.a;
            int iG = c2Var.G(i);
            u uVar = (u) c2Var.y;
            View childAt = uVar.a.getChildAt(iG);
            if (childAt == null) {
                return;
            }
            if (((y2) c2Var.z).J(iG)) {
                c2Var.e0(childAt);
            }
            uVar.a(iG);
        }
    }

    public abstract int l(l0 l0Var);

    /* JADX WARN: Code duplicated, block: B:28:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ba  */
    public boolean l0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int iD = D();
        int iF = F();
        int iE = this.m - E();
        int iC = this.n - C();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i = left - iD;
        int iMin = Math.min(0, i);
        int i2 = top - iF;
        int iMin2 = Math.min(0, i2);
        int i3 = iWidth - iE;
        int iMax = Math.max(0, i3);
        int iMax2 = Math.max(0, iHeight - iC);
        if (B() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i3);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i2, iMax2);
        }
        int[] iArr = {iMax, iMin2};
        int i4 = iArr[0];
        int i5 = iArr[1];
        if (z2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int iD2 = D();
                int iF2 = F();
                int iE2 = this.m - E();
                int iC2 = this.n - C();
                Rect rect2 = this.b.F;
                x(focusedChild, rect2);
                if (rect2.left - i4 < iE2 && rect2.right - i4 > iD2 && rect2.top - i5 < iC2 && rect2.bottom - i5 > iF2) {
                    if (i4 == 0) {
                    }
                    if (z) {
                        recyclerView.scrollBy(i4, i5);
                        return true;
                    }
                    recyclerView.Y(i4, i5, false);
                    return true;
                }
            }
        } else if (i4 == 0 || i5 != 0) {
            if (z) {
                recyclerView.scrollBy(i4, i5);
                return true;
            }
            recyclerView.Y(i4, i5, false);
            return true;
        }
        return false;
    }

    public abstract int m(l0 l0Var);

    public final void m0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int n(l0 l0Var);

    public abstract int n0(int i, i0 i0Var, l0 l0Var);

    public final void o(i0 i0Var) {
        for (int iU = u() - 1; iU >= 0; iU--) {
            View viewT = t(iU);
            p0 p0VarG = RecyclerView.G(viewT);
            if (!p0VarG.o()) {
                if (!p0VarG.f() || p0VarG.h() || this.b.I.b) {
                    t(iU);
                    this.a.u(iU);
                    i0Var.k(viewT);
                    this.b.D.F(p0VarG);
                } else {
                    k0(iU);
                    i0Var.j(p0VarG);
                }
            }
        }
    }

    public abstract int o0(int i, i0 i0Var, l0 l0Var);

    public View p(int i) {
        int iU = u();
        for (int i2 = 0; i2 < iU; i2++) {
            View viewT = t(i2);
            p0 p0VarG = RecyclerView.G(viewT);
            if (p0VarG != null && p0VarG.b() == i && !p0VarG.o() && (this.b.A0.g || !p0VarG.h())) {
                return viewT;
            }
        }
        return null;
    }

    public final void p0(RecyclerView recyclerView) {
        q0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public abstract d0 q();

    public final void q0(int i, int i2) {
        this.m = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.k = mode;
        if (mode == 0 && !RecyclerView.V0) {
            this.m = 0;
        }
        this.n = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.l = mode2;
        if (mode2 != 0 || RecyclerView.V0) {
            return;
        }
        this.n = 0;
    }

    public d0 r(Context context, AttributeSet attributeSet) {
        return new d0(context, attributeSet);
    }

    public void r0(Rect rect, int i, int i2) {
        int iE = E() + D() + rect.width();
        int iC = C() + F() + rect.height();
        RecyclerView recyclerView = this.b;
        Field field = androidx.core.view.s0.a;
        this.b.setMeasuredDimension(f(i, iE, recyclerView.getMinimumWidth()), f(i2, iC, this.b.getMinimumHeight()));
    }

    public d0 s(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof d0) {
            return new d0((d0) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new d0((ViewGroup.MarginLayoutParams) layoutParams) : new d0(layoutParams);
    }

    public final void s0(int i, int i2) {
        int iU = u();
        if (iU == 0) {
            this.b.l(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < iU; i7++) {
            View viewT = t(i7);
            Rect rect = this.b.F;
            x(viewT, rect);
            int i8 = rect.left;
            if (i8 < i6) {
                i6 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i5) {
                i5 = i11;
            }
        }
        this.b.F.set(i6, i4, i3, i5);
        r0(this.b.F, i, i2);
    }

    public final View t(int i) {
        c2 c2Var = this.a;
        if (c2Var != null) {
            return c2Var.x(i);
        }
        return null;
    }

    public final void t0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.b = null;
            this.a = null;
            this.m = 0;
            this.n = 0;
        } else {
            this.b = recyclerView;
            this.a = recyclerView.C;
            this.m = recyclerView.getWidth();
            this.n = recyclerView.getHeight();
        }
        this.k = 1073741824;
        this.l = 1073741824;
    }

    public final int u() {
        c2 c2Var = this.a;
        if (c2Var != null) {
            return c2Var.y();
        }
        return 0;
    }

    public final boolean u0(View view, int i, int i2, d0 d0Var) {
        return (!view.isLayoutRequested() && this.g && L(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) d0Var).width) && L(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) d0Var).height)) ? false : true;
    }

    public boolean v0() {
        return false;
    }

    public int w(i0 i0Var, l0 l0Var) {
        return -1;
    }

    public final boolean w0(View view, int i, int i2, d0 d0Var) {
        return (this.g && L(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) d0Var).width) && L(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) d0Var).height)) ? false : true;
    }

    public void x(View view, Rect rect) {
        int[] iArr = RecyclerView.T0;
        d0 d0Var = (d0) view.getLayoutParams();
        Rect rect2 = d0Var.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) d0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) d0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) d0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) d0Var).bottomMargin);
    }

    public boolean x0() {
        return false;
    }

    public void P() {
    }

    public void Y() {
    }

    public void Q(RecyclerView recyclerView) {
    }

    public void e0(Parcelable parcelable) {
    }

    public void g0(int i) {
    }

    public void X(int i, int i2) {
    }

    public void Z(int i, int i2) {
    }

    public void a0(int i, int i2) {
    }

    public void b0(int i, int i2) {
    }

    public void h(int i, androidx.media3.common.util.e eVar) {
    }

    public void W(i0 i0Var, l0 l0Var, View view, androidx.core.view.accessibility.d dVar) {
    }

    public void g(int i, int i2, l0 l0Var, androidx.media3.common.util.e eVar) {
    }
}
