package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.app.mlounge.R;
import com.app.mlounge.emulator.LibretroCore;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements androidx.core.view.p, androidx.core.view.q {
    public static final int[] W = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final androidx.core.view.z1 a0;
    public static final Rect b0;
    public s0 A;
    public Drawable B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public final Rect H;
    public final Rect I;
    public final Rect J;
    public final Rect K;
    public androidx.core.view.z1 L;
    public androidx.core.view.z1 M;
    public androidx.core.view.z1 N;
    public androidx.core.view.z1 O;
    public OverScroller P;
    public ViewPropertyAnimator Q;
    public final b R;
    public final c S;
    public final c T;
    public final androidx.core.view.r U;
    public final f V;
    public int e;
    public ContentFrameLayout y;
    public ActionBarContainer z;

    static {
        androidx.core.view.n1 h1Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            h1Var = new androidx.core.view.m1();
        } else if (i >= 35) {
            h1Var = new androidx.core.view.l1();
        } else if (i >= 34) {
            h1Var = new androidx.core.view.k1();
        } else if (i >= 31) {
            h1Var = new androidx.core.view.j1();
        } else if (i >= 30) {
            h1Var = new androidx.core.view.i1();
        } else {
            h1Var = i >= 29 ? new androidx.core.view.h1() : new androidx.core.view.g1();
        }
        h1Var.h(androidx.core.graphics.c.b(0, 1, 0, 1));
        a0 = h1Var.b();
        b0 = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.H = new Rect();
        this.I = new Rect();
        this.J = new Rect();
        this.K = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        androidx.core.view.z1 z1Var = androidx.core.view.z1.b;
        this.L = z1Var;
        this.M = z1Var;
        this.N = z1Var;
        this.O = z1Var;
        this.R = new b(this, 0);
        this.S = new c(this, 0);
        this.T = new c(this, 1);
        i(context);
        this.U = new androidx.core.view.r();
        f fVar = new f(context);
        fVar.setWillNotDraw(true);
        this.V = fVar;
        addView(fVar);
    }

    public static boolean a(View view, Rect rect, boolean z) {
        boolean z2;
        e eVar = (e) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    public final void b() {
        removeCallbacks(this.S);
        removeCallbacks(this.T);
        ViewPropertyAnimator viewPropertyAnimator = this.Q;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // androidx.core.view.q
    public final void c(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        d(view, i, i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.core.view.p
    public final void d(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.B != null) {
            if (this.z.getVisibility() == 0) {
                translationY = (int) (this.z.getTranslationY() + this.z.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.B.setBounds(0, translationY, getWidth(), this.B.getIntrinsicHeight() + translationY);
            this.B.draw(canvas);
        }
    }

    @Override // androidx.core.view.p
    public final boolean e(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // androidx.core.view.p
    public final void f(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.core.view.p
    public final void g(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.z;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        androidx.core.view.r rVar = this.U;
        return rVar.b | rVar.a;
    }

    public CharSequence getTitle() {
        j();
        return ((m2) this.A).a.getTitle();
    }

    public final void i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(W);
        this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.B = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.P = new OverScroller(context);
    }

    public final void j() {
        s0 wrapper;
        if (this.y == null) {
            this.y = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.z = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof s0) {
                wrapper = (s0) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    net.luminis.tls.engine.impl.c.r("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                    return;
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.A = wrapper;
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        j();
        androidx.core.view.z1 z1VarD = androidx.core.view.z1.d(this, windowInsets);
        androidx.core.view.w1 w1Var = z1VarD.a;
        boolean zA = a(this.z, new Rect(w1Var.n().a, z1VarD.a(), w1Var.n().c, w1Var.n().d), false);
        Field field = androidx.core.view.s0.a;
        Rect rect = this.H;
        androidx.core.view.k0.b(this, z1VarD, rect);
        androidx.core.view.z1 z1VarR = w1Var.r(rect.left, rect.top, rect.right, rect.bottom);
        this.L = z1VarR;
        boolean z = true;
        if (!this.M.equals(z1VarR)) {
            this.M = this.L;
            zA = true;
        }
        Rect rect2 = this.I;
        if (rect2.equals(rect)) {
            z = zA;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return w1Var.a().a.c().a.b().c();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        Field field = androidx.core.view.s0.a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:24:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:34:0x0100  */
    /* JADX WARN: Code duplicated, block: B:36:0x0104  */
    /* JADX WARN: Code duplicated, block: B:37:0x010a  */
    /* JADX WARN: Code duplicated, block: B:39:0x010e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0114  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        androidx.core.view.z1 z1Var;
        int i3;
        androidx.core.view.n1 g1Var;
        j();
        measureChildWithMargins(this.z, i, 0, i2, 0);
        e eVar = (e) this.z.getLayoutParams();
        int iMax = Math.max(0, this.z.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = Math.max(0, this.z.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.z.getMeasuredState());
        Field field = androidx.core.view.s0.a;
        boolean z = (getWindowSystemUiVisibility() & LibretroCore.SCREEN_WIDTH) != 0;
        if (z) {
            measuredHeight = this.e;
            if (this.D && this.z.getTabContainer() != null) {
                measuredHeight += this.e;
            }
        } else {
            measuredHeight = this.z.getVisibility() != 8 ? this.z.getMeasuredHeight() : 0;
        }
        Rect rect = this.H;
        Rect rect2 = this.J;
        rect2.set(rect);
        this.N = this.L;
        if (this.C || z) {
            androidx.core.graphics.c cVarB = androidx.core.graphics.c.b(this.N.a.n().a, this.N.a() + measuredHeight, this.N.a.n().c, this.N.a.n().d);
            z1Var = this.N;
            i3 = Build.VERSION.SDK_INT;
            if (i3 >= 36) {
                g1Var = new androidx.core.view.m1(z1Var);
            } else if (i3 >= 35) {
                g1Var = new androidx.core.view.l1(z1Var);
            } else if (i3 >= 34) {
                g1Var = new androidx.core.view.k1(z1Var);
            } else if (i3 >= 31) {
                g1Var = new androidx.core.view.j1(z1Var);
            } else if (i3 >= 30) {
                g1Var = new androidx.core.view.i1(z1Var);
            } else if (i3 >= 29) {
                g1Var = new androidx.core.view.h1(z1Var);
            } else {
                g1Var = new androidx.core.view.g1(z1Var);
            }
            g1Var.h(cVarB);
            this.N = g1Var.b();
        } else {
            f fVar = this.V;
            androidx.core.view.z1 z1Var2 = a0;
            Rect rect3 = this.K;
            androidx.core.view.k0.b(fVar, z1Var2, rect3);
            if (rect3.equals(b0)) {
                androidx.core.graphics.c cVarB2 = androidx.core.graphics.c.b(this.N.a.n().a, this.N.a() + measuredHeight, this.N.a.n().c, this.N.a.n().d);
                z1Var = this.N;
                i3 = Build.VERSION.SDK_INT;
                if (i3 >= 36) {
                    g1Var = new androidx.core.view.m1(z1Var);
                } else if (i3 >= 35) {
                    g1Var = new androidx.core.view.l1(z1Var);
                } else if (i3 >= 34) {
                    g1Var = new androidx.core.view.k1(z1Var);
                } else if (i3 >= 31) {
                    g1Var = new androidx.core.view.j1(z1Var);
                } else if (i3 >= 30) {
                    g1Var = new androidx.core.view.i1(z1Var);
                } else if (i3 >= 29) {
                    g1Var = new androidx.core.view.h1(z1Var);
                } else {
                    g1Var = new androidx.core.view.g1(z1Var);
                }
                g1Var.h(cVarB2);
                this.N = g1Var.b();
            } else {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.N = this.N.a.r(0, measuredHeight, 0, 0);
            }
        }
        a(this.y, rect2, true);
        if (!this.O.equals(this.N)) {
            androidx.core.view.z1 z1Var3 = this.N;
            this.O = z1Var3;
            androidx.core.view.s0.b(this.y, z1Var3);
        }
        measureChildWithMargins(this.y, i, 0, i2, 0);
        e eVar2 = (e) this.y.getLayoutParams();
        int iMax3 = Math.max(iMax, this.y.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.y.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.y.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.E || !z) {
            return false;
        }
        this.P.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.P.getFinalY() > this.z.getHeight()) {
            b();
            this.T.run();
        } else {
            b();
            this.S.run();
        }
        this.F = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.G + i2;
        this.G = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.U.a = i;
        this.G = getActionBarHideOffset();
        b();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.z.getVisibility() != 0) {
            return false;
        }
        return this.E;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.E || this.F) {
            return;
        }
        if (this.G <= this.z.getHeight()) {
            b();
            postDelayed(this.S, 600L);
        } else {
            b();
            postDelayed(this.T, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        j();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    public void setActionBarHideOffset(int i) {
        b();
        this.z.setTranslationY(-Math.max(0, Math.min(i, this.z.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        if (getWindowToken() != null) {
            throw null;
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.D = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.E) {
            this.E = z;
            if (z) {
                return;
            }
            b();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        j();
        m2 m2Var = (m2) this.A;
        m2Var.d = i != 0 ? coil3.network.g.p(m2Var.a.getContext(), i) : null;
        m2Var.c();
    }

    public void setLogo(int i) {
        j();
        m2 m2Var = (m2) this.A;
        m2Var.e = i != 0 ? coil3.network.g.p(m2Var.a.getContext(), i) : null;
        m2Var.c();
    }

    public void setOverlayMode(boolean z) {
        this.C = z;
    }

    public void setWindowCallback(Window.Callback callback) {
        j();
        ((m2) this.A).getClass();
    }

    public void setWindowTitle(CharSequence charSequence) {
        j();
        m2 m2Var = (m2) this.A;
        if (m2Var.g) {
            return;
        }
        Toolbar toolbar = m2Var.a;
        m2Var.h = charSequence;
        if ((m2Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (m2Var.g) {
                androidx.core.view.s0.n(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        j();
        m2 m2Var = (m2) this.A;
        m2Var.d = drawable;
        m2Var.c();
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // androidx.core.view.p
    public final void h(View view, int i, int i2, int[] iArr, int i3) {
    }
}
