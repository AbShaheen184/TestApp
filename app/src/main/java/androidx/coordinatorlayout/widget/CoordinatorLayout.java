package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.y0;
import androidx.core.view.k0;
import androidx.core.view.p;
import androidx.core.view.q;
import androidx.core.view.r;
import androidx.core.view.s0;
import androidx.core.view.z1;
import com.app.mlounge.R;
import com.google.firebase.messaging.o;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements p, q {
    public static final String Q;
    public static final Class[] R;
    public static final ThreadLocal S;
    public static final androidx.constraintlayout.core.e T;
    public static final androidx.core.util.b U;
    public final ArrayList A;
    public final int[] B;
    public final int[] C;
    public boolean D;
    public boolean E;
    public final int[] F;
    public View G;
    public View H;
    public e I;
    public boolean J;
    public z1 K;
    public boolean L;
    public Drawable M;
    public ViewGroup.OnHierarchyChangeListener N;
    public com.app.mlounge.data.music.e O;
    public final r P;
    public final ArrayList e;
    public final o y;
    public final ArrayList z;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        Q = r0 != null ? r0.getName() : null;
        T = new androidx.constraintlayout.core.e(1);
        R = new Class[]{Context.class, AttributeSet.class};
        S = new ThreadLocal();
        U = new androidx.core.util.b();
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        CoordinatorLayout coordinatorLayout;
        Context context2;
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.e = new ArrayList();
        this.y = new o(5);
        this.z = new ArrayList();
        this.A = new ArrayList();
        this.B = new int[2];
        this.C = new int[2];
        this.P = new r();
        int[] iArr = androidx.coordinatorlayout.a.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        } else {
            coordinatorLayout = this;
            context2 = context;
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            coordinatorLayout.F = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                int[] iArr2 = coordinatorLayout.F;
                iArr2[i] = (int) (iArr2[i] * f);
            }
        }
        coordinatorLayout.M = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new c(this));
        Field field = s0.a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect a() {
        Rect rect = (Rect) U.a();
        return rect == null ? new Rect() : rect;
    }

    public static void l(int i, Rect rect, Rect rect2, d dVar, int i2, int i3) {
        int iWidth;
        int iHeight;
        int i4 = dVar.c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = dVar.d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & Token.ASSIGN_MOD) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & Token.ASSIGN_MOD;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & Token.ASSIGN_MOD;
        if (i8 != 1) {
            iWidth = i8 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i9 != 16) {
            iHeight = i9 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i6 == 1) {
            iWidth -= i2 / 2;
        } else if (i6 != 5) {
            iWidth -= i2;
        }
        if (i7 == 16) {
            iHeight -= i3 / 2;
        } else if (i7 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    public static d n(View view) {
        d dVar = (d) view.getLayoutParams();
        if (!dVar.b) {
            b bVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                bVar = (b) superclass.getAnnotation(b.class);
                if (bVar != null) {
                    break;
                }
            }
            if (bVar != null) {
                try {
                    a aVar = (a) bVar.value().getDeclaredConstructor(null).newInstance(null);
                    a aVar2 = dVar.a;
                    if (aVar2 != aVar) {
                        if (aVar2 != null) {
                            aVar2.e();
                        }
                        dVar.a = aVar;
                        dVar.b = true;
                        if (aVar != null) {
                            aVar.c(dVar);
                        }
                    }
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + bVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            dVar.b = true;
        }
        return dVar;
    }

    public static void u(View view, int i) {
        d dVar = (d) view.getLayoutParams();
        int i2 = dVar.i;
        if (i2 != i) {
            Field field = s0.a;
            view.offsetLeftAndRight(i - i2);
            dVar.i = i;
        }
    }

    public static void v(View view, int i) {
        d dVar = (d) view.getLayoutParams();
        int i2 = dVar.j;
        if (i2 != i) {
            Field field = s0.a;
            view.offsetTopAndBottom(i - i2);
            dVar.j = i;
        }
    }

    public final void b(d dVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) dVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    @Override // androidx.core.view.q
    public final void c(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        a aVar;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(i5) && (aVar = dVar.a) != null) {
                    int[] iArr2 = this.B;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aVar.k(this, childAt, i2, i3, i4, iArr2);
                    iMax = i3 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i4 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof d) && super.checkLayoutParams(layoutParams);
    }

    @Override // androidx.core.view.p
    public final void d(View view, int i, int i2, int i3, int i4, int i5) {
        c(view, i, i2, i3, i4, 0, this.C);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        a aVar = ((d) view.getLayoutParams()).a;
        if (aVar != null) {
            aVar.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.M;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // androidx.core.view.p
    public final boolean e(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                a aVar = dVar.a;
                if (aVar != null) {
                    boolean zO = aVar.o(childAt, i, i2);
                    z |= zO;
                    if (i2 == 0) {
                        dVar.m = zO;
                    } else if (i2 == 1) {
                        dVar.n = zO;
                    }
                } else if (i2 == 0) {
                    dVar.m = false;
                } else if (i2 == 1) {
                    dVar.n = false;
                }
            }
        }
        return z;
    }

    @Override // androidx.core.view.p
    public final void f(View view, View view2, int i, int i2) {
        r rVar = this.P;
        if (i2 == 1) {
            rVar.b = i;
        } else {
            rVar.a = i;
        }
        this.H = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((d) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // androidx.core.view.p
    public final void g(View view, int i) {
        r rVar = this.P;
        if (i == 1) {
            rVar.b = 0;
        } else {
            rVar.a = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            d dVar = (d) childAt.getLayoutParams();
            if (dVar.a(i)) {
                a aVar = dVar.a;
                if (aVar != null) {
                    aVar.p(childAt, view, i);
                }
                if (i == 0) {
                    dVar.m = false;
                } else if (i == 1) {
                    dVar.n = false;
                }
            }
        }
        this.H = null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof d) {
            return new d((d) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new d((ViewGroup.MarginLayoutParams) layoutParams) : new d(layoutParams);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.e);
    }

    public final z1 getLastWindowInsets() {
        return this.K;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        r rVar = this.P;
        return rVar.b | rVar.a;
    }

    public Drawable getStatusBarBackground() {
        return this.M;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // androidx.core.view.p
    public final void h(View view, int i, int i2, int[] iArr, int i3) {
        a aVar;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(i3) && (aVar = dVar.a) != null) {
                    int[] iArr2 = this.B;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aVar.j(this, childAt, view, i, i2, iArr2, i3);
                    iMax = i > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            p(1);
        }
    }

    public final void i(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList j(View view) {
        y0 y0Var = (y0) this.y.z;
        int i = y0Var.z;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) y0Var.i(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(y0Var.f(i2));
            }
        }
        ArrayList arrayList3 = this.A;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(View view, Rect rect) {
        ThreadLocal threadLocal = g.a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = g.a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        g.a(this, view, matrix);
        ThreadLocal threadLocal3 = g.b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int m(int i) {
        int[] iArr = this.F;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    public final boolean o(View view, int i, int i2) {
        androidx.core.util.b bVar = U;
        Rect rectA = a();
        k(view, rectA);
        try {
            return rectA.contains(i, i2);
        } finally {
            rectA.setEmpty();
            bVar.c(rectA);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.J) {
            if (this.I == null) {
                this.I = new e(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.I);
        }
        if (this.K == null) {
            Field field = s0.a;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.E = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.J && this.I != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.I);
        }
        View view = this.H;
        if (view != null) {
            g(view, 0);
        }
        this.E = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.L || this.M == null) {
            return;
        }
        z1 z1Var = this.K;
        int iA = z1Var != null ? z1Var.a() : 0;
        if (iA > 0) {
            this.M.setBounds(0, 0, getWidth(), iA);
            this.M.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean zR = r(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zR;
        }
        t(true);
        return zR;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        a aVar;
        Field field = s0.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((aVar = ((d) view.getLayoutParams()).a) == null || !aVar.g(this, view, layoutDirection))) {
                q(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x012c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0169  */
    /* JADX WARN: Code duplicated, block: B:75:0x0173  */
    /* JADX WARN: Code duplicated, block: B:78:0x0192  */
    /* JADX WARN: Code duplicated, block: B:79:0x0195  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        a aVar;
        int i6;
        int i7;
        boolean z2;
        int i8;
        int i9;
        ArrayList arrayList;
        int i10;
        View view;
        int i11;
        boolean zH;
        int iMax;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.s();
        int childCount = coordinatorLayout.getChildCount();
        int i12 = 0;
        loop0: while (true) {
            if (i12 >= childCount) {
                z = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i12);
            y0 y0Var = (y0) coordinatorLayout.y.z;
            int i13 = y0Var.z;
            for (int i14 = 0; i14 < i13; i14++) {
                ArrayList arrayList2 = (ArrayList) y0Var.i(i14);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z = true;
                    break loop0;
                }
            }
            i12++;
        }
        if (z != coordinatorLayout.J) {
            boolean z3 = coordinatorLayout.E;
            if (z) {
                if (z3) {
                    if (coordinatorLayout.I == null) {
                        coordinatorLayout.I = new e(coordinatorLayout);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.I);
                }
                coordinatorLayout.J = true;
            } else {
                if (z3 && coordinatorLayout.I != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.I);
                }
                coordinatorLayout.J = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        Field field = s0.a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z4 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i15 = paddingLeft + paddingRight;
        int i16 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z5 = coordinatorLayout.K != null && coordinatorLayout.getFitsSystemWindows();
        ArrayList arrayList3 = coordinatorLayout.e;
        int size3 = arrayList3.size();
        int i17 = 0;
        int iCombineMeasuredStates = 0;
        while (i17 < size3) {
            View view2 = (View) arrayList3.get(i17);
            int i18 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i4 = size3;
                i11 = i17;
                i6 = paddingLeft;
                suggestedMinimumWidth = i18;
                z2 = false;
                i8 = paddingRight;
            } else {
                d dVar = (d) view2.getLayoutParams();
                int i19 = dVar.e;
                if (i19 < 0 || mode == 0) {
                    i3 = suggestedMinimumHeight;
                } else {
                    int iM = coordinatorLayout.m(i19);
                    int i20 = dVar.c;
                    if (i20 == 0) {
                        i20 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i20, layoutDirection) & 7;
                    i3 = suggestedMinimumHeight;
                    if ((absoluteGravity != 3 || z4) && !(absoluteGravity == 5 && z4)) {
                        if ((absoluteGravity == 5 && !z4) || (absoluteGravity == 3 && z4)) {
                            iMax = Math.max(0, iM - paddingLeft);
                        }
                        if (z5 || view2.getFitsSystemWindows()) {
                            iMakeMeasureSpec = i;
                            iMakeMeasureSpec2 = i2;
                        } else {
                            int i21 = coordinatorLayout.K.a.n().c + coordinatorLayout.K.a.n().a;
                            int iA = coordinatorLayout.K.a.n().d + coordinatorLayout.K.a();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - i21, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iA, mode2);
                        }
                        aVar = dVar.a;
                        if (aVar != null) {
                            z2 = false;
                            i6 = paddingLeft;
                            i7 = i18;
                            i8 = paddingRight;
                            i9 = i3;
                            arrayList = arrayList3;
                            int i22 = iMakeMeasureSpec;
                            i11 = i17;
                            int i23 = iMakeMeasureSpec2;
                            zH = aVar.h(this, view2, i22, i5, i23);
                            view = view2;
                            iMakeMeasureSpec = i22;
                            i10 = i23;
                            if (zH) {
                                coordinatorLayout = this;
                            }
                            int iMax2 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
                            int iMax3 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                            suggestedMinimumWidth = iMax2;
                            suggestedMinimumHeight = iMax3;
                        } else {
                            i6 = paddingLeft;
                            i7 = i18;
                            z2 = false;
                            i8 = paddingRight;
                            i9 = i3;
                            arrayList = arrayList3;
                            i10 = iMakeMeasureSpec2;
                            view = view2;
                            i11 = i17;
                        }
                        coordinatorLayout = this;
                        coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i5, i10, 0);
                        int iMax4 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
                        int iMax5 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax4;
                        suggestedMinimumHeight = iMax5;
                    } else {
                        iMax = Math.max(0, (size - paddingRight) - iM);
                    }
                    int i24 = size3;
                    i5 = iMax;
                    i4 = i24;
                    if (z5) {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    } else {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    }
                    aVar = dVar.a;
                    if (aVar != null) {
                        z2 = false;
                        i6 = paddingLeft;
                        i7 = i18;
                        i8 = paddingRight;
                        i9 = i3;
                        arrayList = arrayList3;
                        int i25 = iMakeMeasureSpec;
                        i11 = i17;
                        int i26 = iMakeMeasureSpec2;
                        zH = aVar.h(this, view2, i25, i5, i26);
                        view = view2;
                        iMakeMeasureSpec = i25;
                        i10 = i26;
                        if (zH) {
                            coordinatorLayout = this;
                        }
                        int iMax6 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
                        int iMax7 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax6;
                        suggestedMinimumHeight = iMax7;
                    } else {
                        i6 = paddingLeft;
                        i7 = i18;
                        z2 = false;
                        i8 = paddingRight;
                        i9 = i3;
                        arrayList = arrayList3;
                        i10 = iMakeMeasureSpec2;
                        view = view2;
                        i11 = i17;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i5, i10, 0);
                    int iMax8 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
                    int iMax9 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax8;
                    suggestedMinimumHeight = iMax9;
                }
                i4 = size3;
                i5 = 0;
                if (z5) {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                } else {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                }
                aVar = dVar.a;
                if (aVar != null) {
                    z2 = false;
                    i6 = paddingLeft;
                    i7 = i18;
                    i8 = paddingRight;
                    i9 = i3;
                    arrayList = arrayList3;
                    int i27 = iMakeMeasureSpec;
                    i11 = i17;
                    int i28 = iMakeMeasureSpec2;
                    zH = aVar.h(this, view2, i27, i5, i28);
                    view = view2;
                    iMakeMeasureSpec = i27;
                    i10 = i28;
                    if (zH) {
                        coordinatorLayout = this;
                    }
                    int iMax10 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
                    int iMax11 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax10;
                    suggestedMinimumHeight = iMax11;
                } else {
                    i6 = paddingLeft;
                    i7 = i18;
                    z2 = false;
                    i8 = paddingRight;
                    i9 = i3;
                    arrayList = arrayList3;
                    i10 = iMakeMeasureSpec2;
                    view = view2;
                    i11 = i17;
                }
                coordinatorLayout = this;
                coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i5, i10, 0);
                int iMax12 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
                int iMax13 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                suggestedMinimumWidth = iMax12;
                suggestedMinimumHeight = iMax13;
            }
            i17 = i11 + 1;
            paddingLeft = i6;
            paddingRight = i8;
            size3 = i4;
            arrayList3 = arrayList;
        }
        int i29 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i, (-16777216) & i29), View.resolveSizeAndState(suggestedMinimumHeight, i2, i29 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(0)) {
                    a aVar = dVar.a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        a aVar;
        int childCount = getChildCount();
        boolean zI = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(0) && (aVar = dVar.a) != null) {
                    zI |= aVar.i(view);
                }
            }
        }
        return zI;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        h(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        d(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        f(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.e);
        SparseArray sparseArray = fVar.z;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            a aVar = n(childAt).a;
            if (id != -1 && aVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                aVar.m(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableN;
        f fVar = new f(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            a aVar = ((d) childAt.getLayoutParams()).a;
            if (id != -1 && aVar != null && (parcelableN = aVar.n(childAt)) != null) {
                sparseArray.append(id, parcelableN);
            }
        }
        fVar.z = sparseArray;
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return e(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        g(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015 A[PHI: r3
  0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zR;
        boolean zQ;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.G == null) {
            zR = r(motionEvent, 1);
            if (!zR) {
                zQ = false;
            }
            motionEventObtain = null;
            if (this.G == null) {
                zQ |= super.onTouchEvent(motionEvent);
            } else if (zR) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return zQ;
            }
            t(false);
            return zQ;
        }
        zR = false;
        a aVar = ((d) this.G.getLayoutParams()).a;
        if (aVar != null) {
            zQ = aVar.q(this.G, motionEvent);
        } else {
            zQ = false;
        }
        motionEventObtain = null;
        if (this.G == null) {
            zQ |= super.onTouchEvent(motionEvent);
        } else if (zR) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked == 1) {
        }
        t(false);
        return zQ;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x026c  */
    /* JADX WARN: Code duplicated, block: B:33:0x00de  */
    public final void p(int i) {
        int i2;
        Rect rect;
        int i3;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        int width;
        int i4;
        int i5;
        int i6;
        int height;
        int i7;
        int i8;
        int i9;
        d dVar;
        int i10;
        View view;
        a aVar;
        Field field = s0.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList2 = this.e;
        int size = arrayList2.size();
        Rect rectA = a();
        Rect rectA2 = a();
        Rect rectA3 = a();
        int i11 = 0;
        while (true) {
            androidx.core.util.b bVar = U;
            if (i11 >= size) {
                Rect rect2 = rectA3;
                rectA.setEmpty();
                bVar.c(rectA);
                rectA2.setEmpty();
                bVar.c(rectA2);
                rect2.setEmpty();
                bVar.c(rect2);
                return;
            }
            View view2 = (View) arrayList2.get(i11);
            d dVar2 = (d) view2.getLayoutParams();
            if (i == 0 && view2.getVisibility() == 8) {
                arrayList = arrayList2;
                i3 = size;
                rect = rectA3;
                i2 = i11;
            } else {
                int i12 = 0;
                while (i12 < i11) {
                    if (dVar2.l == ((View) arrayList2.get(i12))) {
                        d dVar3 = (d) view2.getLayoutParams();
                        if (dVar3.k != null) {
                            Rect rectA4 = a();
                            Rect rectA5 = a();
                            d dVar4 = dVar2;
                            Rect rectA6 = a();
                            k(dVar3.k, rectA4);
                            i(view2, rectA5, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            View view3 = view2;
                            int measuredHeight = view3.getMeasuredHeight();
                            dVar = dVar4;
                            i10 = i12;
                            layoutDirection = layoutDirection;
                            view = view3;
                            l(layoutDirection, rectA4, rectA6, dVar3, measuredWidth, measuredHeight);
                            boolean z3 = (rectA6.left == rectA5.left && rectA6.top == rectA5.top) ? false : true;
                            b(dVar3, rectA6, measuredWidth, measuredHeight);
                            int i13 = rectA6.left - rectA5.left;
                            int i14 = rectA6.top - rectA5.top;
                            if (i13 != 0) {
                                Field field2 = s0.a;
                                view.offsetLeftAndRight(i13);
                            }
                            if (i14 != 0) {
                                Field field3 = s0.a;
                                view.offsetTopAndBottom(i14);
                            }
                            if (z3 && (aVar = dVar3.a) != null) {
                                aVar.d(this, view, dVar3.k);
                            }
                            rectA4.setEmpty();
                            bVar.c(rectA4);
                            rectA5.setEmpty();
                            bVar.c(rectA5);
                            rectA6.setEmpty();
                            bVar.c(rectA6);
                        } else {
                            dVar = dVar2;
                            i10 = i12;
                            view = view2;
                        }
                    } else {
                        dVar = dVar2;
                        i10 = i12;
                        view = view2;
                    }
                    i12 = i10 + 1;
                    dVar2 = dVar;
                    view2 = view;
                    arrayList2 = arrayList2;
                    size = size;
                    i11 = i11;
                    rectA3 = rectA3;
                }
                ArrayList arrayList3 = arrayList2;
                d dVar5 = dVar2;
                int i15 = size;
                Rect rect3 = rectA3;
                i2 = i11;
                View view4 = view2;
                i(view4, rectA2, true);
                if (dVar5.g != 0 && !rectA2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(dVar5.g, layoutDirection);
                    int i16 = absoluteGravity & Token.ASSIGN_MOD;
                    if (i16 == 48) {
                        rectA.top = Math.max(rectA.top, rectA2.bottom);
                    } else if (i16 == 80) {
                        rectA.bottom = Math.max(rectA.bottom, getHeight() - rectA2.top);
                    }
                    int i17 = absoluteGravity & 7;
                    if (i17 == 3) {
                        rectA.left = Math.max(rectA.left, rectA2.right);
                    } else if (i17 == 5) {
                        rectA.right = Math.max(rectA.right, getWidth() - rectA2.left);
                    }
                }
                if (dVar5.h != 0 && view4.getVisibility() == 0) {
                    Field field4 = s0.a;
                    if (view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
                        d dVar6 = (d) view4.getLayoutParams();
                        a aVar2 = dVar6.a;
                        Rect rectA7 = a();
                        Rect rectA8 = a();
                        rectA8.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                        if (aVar2 == null || !aVar2.a(view4)) {
                            rectA7.set(rectA8);
                        } else if (!rectA8.contains(rectA7)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectA7.toShortString() + " | Bounds:" + rectA8.toShortString());
                        }
                        rectA8.setEmpty();
                        bVar.c(rectA8);
                        if (rectA7.isEmpty()) {
                            rectA7.setEmpty();
                            bVar.c(rectA7);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(dVar6.h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i8 = (rectA7.top - ((ViewGroup.MarginLayoutParams) dVar6).topMargin) - dVar6.j) >= (i9 = rectA.top)) {
                                z = false;
                            } else {
                                v(view4, i9 - i8);
                                z = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectA7.bottom) - ((ViewGroup.MarginLayoutParams) dVar6).bottomMargin) + dVar6.j) < (i7 = rectA.bottom)) {
                                v(view4, height - i7);
                                z = true;
                            }
                            if (!z) {
                                v(view4, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i5 = (rectA7.left - ((ViewGroup.MarginLayoutParams) dVar6).leftMargin) - dVar6.i) >= (i6 = rectA.left)) {
                                z2 = false;
                            } else {
                                u(view4, i6 - i5);
                                z2 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectA7.right) - ((ViewGroup.MarginLayoutParams) dVar6).rightMargin) + dVar6.i) < (i4 = rectA.right)) {
                                u(view4, width - i4);
                                z2 = true;
                            }
                            if (!z2) {
                                u(view4, 0);
                            }
                            rectA7.setEmpty();
                            bVar.c(rectA7);
                        }
                    }
                }
                if (i != 2) {
                    rect = rect3;
                    rect.set(((d) view4.getLayoutParams()).o);
                    if (rect.equals(rectA2)) {
                        arrayList = arrayList3;
                        i3 = i15;
                    } else {
                        ((d) view4.getLayoutParams()).o.set(rectA2);
                    }
                } else {
                    rect = rect3;
                }
                int i18 = i2 + 1;
                i3 = i15;
                while (true) {
                    arrayList = arrayList3;
                    if (i18 < i3) {
                        View view5 = (View) arrayList.get(i18);
                        a aVar3 = ((d) view5.getLayoutParams()).a;
                        if (aVar3 != null) {
                            aVar3.b(view5);
                        }
                        i18++;
                        arrayList3 = arrayList;
                    }
                }
            }
            i11 = i2 + 1;
            size = i3;
            rectA3 = rect;
            arrayList2 = arrayList;
        }
    }

    public final void q(View view, int i) {
        int i2;
        d dVar = (d) view.getLayoutParams();
        View view2 = dVar.k;
        if (view2 == null && dVar.f != -1) {
            net.luminis.tls.engine.impl.c.r("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
            return;
        }
        androidx.core.util.b bVar = U;
        if (view2 != null) {
            Rect rectA = a();
            Rect rectA2 = a();
            try {
                k(view2, rectA);
                d dVar2 = (d) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i, rectA, rectA2, dVar2, measuredWidth, measuredHeight);
                b(dVar2, rectA2, measuredWidth, measuredHeight);
                view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
                return;
            } finally {
                rectA.setEmpty();
                bVar.c(rectA);
                rectA2.setEmpty();
                bVar.c(rectA2);
            }
        }
        int i3 = dVar.e;
        if (i3 < 0) {
            d dVar3 = (d) view.getLayoutParams();
            Rect rectA3 = a();
            rectA3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) dVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) dVar3).bottomMargin);
            if (this.K != null) {
                Field field = s0.a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectA3.left = this.K.a.n().a + rectA3.left;
                    rectA3.top = this.K.a() + rectA3.top;
                    rectA3.right -= this.K.a.n().c;
                    rectA3.bottom -= this.K.a.n().d;
                }
            }
            Rect rectA4 = a();
            int i4 = dVar3.c;
            if ((i4 & 7) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & Token.ASSIGN_MOD) == 0) {
                i4 |= 48;
            }
            Gravity.apply(i4, view.getMeasuredWidth(), view.getMeasuredHeight(), rectA3, rectA4, i);
            view.layout(rectA4.left, rectA4.top, rectA4.right, rectA4.bottom);
            rectA3.setEmpty();
            bVar.c(rectA3);
            rectA4.setEmpty();
            bVar.c(rectA4);
            return;
        }
        d dVar4 = (d) view.getLayoutParams();
        int i5 = dVar4.c;
        if (i5 == 0) {
            i5 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & Token.ASSIGN_MOD;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i3 = width - i3;
        }
        int iM = m(i3) - measuredWidth2;
        if (i6 == 1) {
            iM += measuredWidth2 / 2;
        } else if (i6 == 5) {
            iM += measuredWidth2;
        }
        if (i7 != 16) {
            i2 = i7 != 80 ? 0 : measuredHeight2;
        } else {
            i2 = measuredHeight2 / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar4).leftMargin, Math.min(iM, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) dVar4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar4).topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) dVar4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    public final boolean r(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.z;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        androidx.constraintlayout.core.e eVar = T;
        if (eVar != null) {
            Collections.sort(arrayList, eVar);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zF = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            a aVar = ((d) view.getLayoutParams()).a;
            if (zF && actionMasked != 0) {
                if (aVar != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i == 0) {
                        aVar.f(this, view, motionEventObtain);
                    } else if (i == 1) {
                        aVar.q(view, motionEventObtain);
                    }
                }
            } else if (!zF && aVar != null) {
                if (i == 0) {
                    zF = aVar.f(this, view, motionEvent);
                } else if (i == 1) {
                    zF = aVar.q(view, motionEvent);
                }
                if (zF) {
                    this.G = view;
                }
            }
        }
        arrayList.clear();
        return zF;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        a aVar = ((d) view.getLayoutParams()).a;
        if (aVar != null) {
            aVar.l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.D) {
            return;
        }
        t(false);
        this.D = true;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0084  */
    /* JADX WARN: Code duplicated, block: B:37:0x008f  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:38:0x0093
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void s() {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.s():void");
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.N = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.M;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.M = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.M.setState(getDrawableState());
                }
                Drawable drawable3 = this.M;
                Field field = s0.a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.M.setVisible(getVisibility() == 0, false);
                this.M.setCallback(this);
            }
            Field field2 = s0.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? getContext().getDrawable(i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.M;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.M.setVisible(z, false);
    }

    public final void t(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            a aVar = ((d) childAt.getLayoutParams()).a;
            if (aVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    aVar.f(this, childAt, motionEventObtain);
                } else {
                    aVar.q(childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((d) getChildAt(i2).getLayoutParams()).getClass();
        }
        this.G = null;
        this.D = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.M;
    }

    public final void w() {
        Field field = s0.a;
        if (!getFitsSystemWindows()) {
            k0.c(this, null);
            return;
        }
        if (this.O == null) {
            this.O = new com.app.mlounge.data.music.e(this, 21);
        }
        k0.c(this, this.O);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }
}
