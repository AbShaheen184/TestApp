package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.compose.ui.text.android.i;
import androidx.core.view.e0;
import androidx.core.view.f0;
import androidx.core.view.o;
import androidx.core.view.q;
import androidx.core.view.r;
import androidx.core.view.s0;
import androidx.core.view.t0;
import androidx.core.view.y;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements q {
    public static final float c0 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final d d0 = new d(0);
    public static final int[] e0 = {R.attr.fillViewport};
    public final OverScroller A;
    public final EdgeEffect B;
    public final EdgeEffect C;
    public y D;
    public int E;
    public boolean F;
    public boolean G;
    public View H;
    public boolean I;
    public VelocityTracker J;
    public boolean K;
    public boolean L;
    public final int M;
    public final int N;
    public final int O;
    public int P;
    public final int[] Q;
    public final int[] R;
    public int S;
    public int T;
    public f U;
    public final r V;
    public final o W;
    public float a0;
    public final androidx.core.view.g b0;
    public final float e;
    public long y;
    public final Rect z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.app.mlounge.R.attr.nestedScrollViewStyle);
        this.z = new Rect();
        this.F = true;
        this.G = false;
        this.H = null;
        this.I = false;
        this.L = true;
        this.P = -1;
        this.Q = new int[2];
        this.R = new int[2];
        this.b0 = new androidx.core.view.g(getContext(), new com.app.mlounge.data.music.e(this, 23));
        int i = Build.VERSION.SDK_INT;
        this.B = i >= 31 ? b.a(context, attributeSet) : new EdgeEffect(context);
        this.C = i >= 31 ? b.a(context, attributeSet) : new EdgeEffect(context);
        this.e = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.A = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.M = viewConfiguration.getScaledTouchSlop();
        this.N = viewConfiguration.getScaledMinimumFlingVelocity();
        this.O = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e0, com.app.mlounge.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.V = new r();
        this.W = new o(this);
        setNestedScrollingEnabled(true);
        s0.m(this, d0);
    }

    private y getScrollFeedbackProvider() {
        if (this.D == null) {
            this.D = new y(this);
        }
        return this.D;
    }

    public static boolean k(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && k((View) parent, nestedScrollView);
    }

    public final boolean a(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View view = viewFindFocus;
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !l(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            r(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.z;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            r(b(rect), -1, null, 0, 1, true);
            viewFindNextFocus.requestFocus(i);
        }
        if (view != null && view.isFocused() && !l(view, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
        } else {
            net.luminis.tls.engine.impl.c.r("ScrollView can host only one direct child");
        }
    }

    public final int b(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i2, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // androidx.core.view.q
    public final void c(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m(iArr, i4, i5);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0087  */
    /* JADX WARN: Code duplicated, block: B:24:0x0096  */
    /* JADX WARN: Code duplicated, block: B:26:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00de  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fc  */
    @Override // android.view.View
    public final void computeScroll() {
        int iRound;
        int[] iArr;
        int i;
        int scrollRange;
        int overScrollMode;
        if (this.A.isFinished()) {
            return;
        }
        this.A.computeScrollOffset();
        int currY = this.A.getCurrY();
        int i2 = currY - this.T;
        int height = getHeight();
        EdgeEffect edgeEffect = this.B;
        EdgeEffect edgeEffect2 = this.C;
        if (i2 <= 0 || androidx.room.r.m(edgeEffect) == 0.0f) {
            if (i2 < 0 && androidx.room.r.m(edgeEffect2) != 0.0f) {
                float f = height;
                iRound = Math.round(androidx.room.r.p(edgeEffect2, (i2 * 4.0f) / f, 0.5f) * (f / 4.0f));
                if (iRound != i2) {
                    edgeEffect2.finish();
                }
            }
            int i3 = i2;
            this.T = currY;
            iArr = this.R;
            iArr[1] = 0;
            this.W.c(0, i3, 1, iArr, null);
            i = i3 - iArr[1];
            scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                i.c(this, Math.abs(this.A.getCurrVelocity()));
            }
            if (i != 0) {
                int scrollY = getScrollY();
                o(i, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i4 = i - scrollY2;
                iArr[1] = 0;
                this.W.d(0, scrollY2, 0, i4, this.Q, 1, iArr);
                i = i4 - iArr[1];
            }
            if (i != 0) {
                overScrollMode = getOverScrollMode();
                if (overScrollMode != 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) this.A.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.A.getCurrVelocity());
                    }
                }
                this.A.abortAnimation();
                v(1);
            }
            if (this.A.isFinished()) {
                v(1);
            } else {
                postInvalidateOnAnimation();
            }
        }
        iRound = Math.round(androidx.room.r.p(edgeEffect, ((-i2) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i2) {
            edgeEffect.finish();
        }
        i2 -= iRound;
        int i5 = i2;
        this.T = currY;
        iArr = this.R;
        iArr[1] = 0;
        this.W.c(0, i5, 1, iArr, null);
        i = i5 - iArr[1];
        scrollRange = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
            i.c(this, Math.abs(this.A.getCurrVelocity()));
        }
        if (i != 0) {
            int scrollY3 = getScrollY();
            o(i, getScrollX(), scrollY3, scrollRange);
            int scrollY4 = getScrollY() - scrollY3;
            int i6 = i - scrollY4;
            iArr[1] = 0;
            this.W.d(0, scrollY4, 0, i6, this.Q, 1, iArr);
            i = i6 - iArr[1];
        }
        if (i != 0) {
            overScrollMode = getOverScrollMode();
            if (overScrollMode != 0) {
                if (i < 0) {
                    if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.A.getCurrVelocity());
                    }
                } else if (edgeEffect2.isFinished()) {
                    edgeEffect2.onAbsorb((int) this.A.getCurrVelocity());
                }
            } else if (i < 0) {
                if (edgeEffect.isFinished()) {
                    edgeEffect.onAbsorb((int) this.A.getCurrVelocity());
                }
            } else if (edgeEffect2.isFinished()) {
                edgeEffect2.onAbsorb((int) this.A.getCurrVelocity());
            }
            this.A.abortAnimation();
            v(1);
        }
        if (this.A.isFinished()) {
            postInvalidateOnAnimation();
        } else {
            v(1);
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    @Override // androidx.core.view.p
    public final void d(View view, int i, int i2, int i3, int i4, int i5) {
        m(null, i4, i5);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a1  */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zJ;
        if (!super.dispatchKeyEvent(keyEvent)) {
            this.z.setEmpty();
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                    if (keyEvent.getAction() != 0) {
                        zJ = false;
                    } else {
                        int keyCode = keyEvent.getKeyCode();
                        if (keyCode == 19) {
                            zJ = keyEvent.isAltPressed() ? j(33) : a(33);
                        } else if (keyCode != 20) {
                            if (keyCode == 62) {
                                p(keyEvent.isShiftPressed() ? 33 : 130);
                            } else if (keyCode == 92) {
                                zJ = j(33);
                            } else if (keyCode == 93) {
                                zJ = j(130);
                            } else if (keyCode == 122) {
                                p(33);
                            } else if (keyCode == 123) {
                                p(130);
                            }
                            zJ = false;
                        } else {
                            zJ = keyEvent.isAltPressed() ? j(130) : a(130);
                        }
                    }
                } else if (isFocused() || keyEvent.getKeyCode() == 4) {
                    zJ = false;
                } else {
                    View viewFindFocus = findFocus();
                    if (viewFindFocus == this) {
                        viewFindFocus = null;
                    }
                    View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                    if (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) {
                        zJ = false;
                    } else {
                        zJ = true;
                    }
                }
            } else if (isFocused()) {
                zJ = false;
            } else {
                zJ = false;
            }
            if (!zJ) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.W.a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.W.b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.W.c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.W.d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.B;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            } else {
                paddingLeft = 0;
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.C;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // androidx.core.view.p
    public final boolean e(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // androidx.core.view.p
    public final void f(View view, View view2, int i, int i2) {
        r rVar = this.V;
        if (i2 == 1) {
            rVar.b = i;
        } else {
            rVar.a = i;
        }
        this.W.g(2, i2);
    }

    @Override // androidx.core.view.p
    public final void g(View view, int i) {
        r rVar = this.V;
        if (i == 1) {
            rVar.b = 0;
        } else {
            rVar.a = 0;
        }
        v(i);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        r rVar = this.V;
        return rVar.b | rVar.a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.a0 == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                net.luminis.tls.engine.impl.c.r("Expected theme to define listPreferredItemHeight.");
                return 0.0f;
            }
            this.a0 = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.a0;
    }

    @Override // androidx.core.view.p
    public final void h(View view, int i, int i2, int[] iArr, int i3) {
        this.W.c(i, i2, i3, iArr, null);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.W.f(0);
    }

    public final void i(int i) {
        if (getChildCount() > 0) {
            this.A.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.W.g(2, 1);
            this.T = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                i.c(this, Math.abs(this.A.getCurrVelocity()));
            }
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.W.d;
    }

    public final boolean j(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.z;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return q(i, rect.top, rect.bottom);
    }

    public final boolean l(View view, int i, int i2) {
        Rect rect = this.z;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    public final void m(int[] iArr, int i, int i2) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.W.d(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.P) {
            int i = actionIndex == 0 ? 1 : 0;
            this.E = (int) motionEvent.getY(i);
            this.P = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.J;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean o(int i, int i2, int i3, int i4) {
        int i5;
        boolean z;
        int i6;
        boolean z2;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i7 = i3 + i;
        if (i2 <= 0 && i2 >= 0) {
            i5 = i2;
            z = false;
        } else {
            i5 = 0;
            z = true;
        }
        if (i7 <= i4) {
            if (i7 < 0) {
                i6 = 0;
            } else {
                i6 = i7;
                z2 = false;
            }
            if (z2 && !this.W.f(1)) {
                this.A.springBack(i5, i6, 0, 0, 0, getScrollRange());
            }
            super.scrollTo(i5, i6);
            return !z || z2;
        }
        i6 = i4;
        z2 = true;
        if (z2) {
            this.A.springBack(i5, i6, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i5, i6);
        if (z) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G = false;
    }

    /* JADX WARN: Code duplicated, block: B:134:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:135:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:137:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00df  */
    /* JADX WARN: Code duplicated, block: B:70:0x012a  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        int i;
        int width;
        int i2;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        boolean z;
        float yVelocity;
        NestedScrollView nestedScrollView;
        float f2;
        long j;
        float f3;
        int i3;
        float fSqrt;
        int i4;
        float f4;
        if (motionEvent.getAction() != 8 || this.I) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            float axisValue = motionEvent.getAxisValue(9);
            width = (int) motionEvent.getX();
            i = 9;
            f = axisValue;
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            float axisValue2 = motionEvent.getAxisValue(26);
            width = getWidth() / 2;
            f = axisValue2;
            i = 26;
        } else {
            f = 0.0f;
            i = 0;
            width = 0;
        }
        if (f == 0.0f) {
            return false;
        }
        r(-((int) (getVerticalScrollFactorCompat() * f)), i, motionEvent, width, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i != 0) {
            androidx.core.view.g gVar = this.b0;
            NestedScrollView nestedScrollView2 = (NestedScrollView) gVar.b.y;
            int[] iArr = gVar.h;
            int source = motionEvent.getSource();
            int deviceId = motionEvent.getDeviceId();
            int i5 = 1;
            if (gVar.f == source && gVar.g == deviceId && gVar.e == i) {
                z = false;
                i2 = 0;
            } else {
                Context context = gVar.a;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int deviceId2 = motionEvent.getDeviceId();
                i2 = 0;
                int source2 = motionEvent.getSource();
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 34) {
                    Method method = t0.a;
                    scaledMinimumFlingVelocity = androidx.compose.ui.text.android.b.h(viewConfiguration, deviceId2, i, source2);
                } else {
                    Method method2 = t0.a;
                    InputDevice device = InputDevice.getDevice(deviceId2);
                    if (device == null || device.getMotionRange(i, source2) == null) {
                        scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                    } else {
                        Resources resources = context.getResources();
                        int identifier = (source2 == 4194304 && i == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier == -1) {
                            scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                        } else if (identifier == 0 || (scaledMinimumFlingVelocity = resources.getDimensionPixelSize(identifier)) < 0) {
                            scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                        }
                    }
                }
                iArr[0] = scaledMinimumFlingVelocity;
                int deviceId3 = motionEvent.getDeviceId();
                int source3 = motionEvent.getSource();
                if (i6 >= 34) {
                    scaledMaximumFlingVelocity = androidx.compose.ui.text.android.b.g(viewConfiguration, deviceId3, i, source3);
                } else {
                    InputDevice device2 = InputDevice.getDevice(deviceId3);
                    if (device2 == null || device2.getMotionRange(i, source3) == null) {
                        scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                    } else {
                        Resources resources2 = context.getResources();
                        int identifier2 = (source3 == 4194304 && i == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier2 == -1) {
                            scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                        } else if (identifier2 == 0 || (scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2)) < 0) {
                            scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                        }
                    }
                }
                iArr[1] = scaledMaximumFlingVelocity;
                gVar.f = source;
                gVar.g = deviceId;
                gVar.e = i;
                z = true;
            }
            int i7 = iArr[i2];
            VelocityTracker velocityTracker = gVar.c;
            if (i7 == Integer.MAX_VALUE) {
                if (velocityTracker == null) {
                    return true;
                }
                velocityTracker.recycle();
                gVar.c = null;
                return true;
            }
            if (velocityTracker == null) {
                gVar.c = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker2 = gVar.c;
            Map map = e0.a;
            velocityTracker2.addMovement(motionEvent);
            int i8 = 20;
            if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                Map map2 = e0.a;
                if (!map2.containsKey(velocityTracker2)) {
                    map2.put(velocityTracker2, new f0());
                }
                f0 f0Var = (f0) map2.get(velocityTracker2);
                long[] jArr = f0Var.b;
                long eventTime = motionEvent.getEventTime();
                if (f0Var.d != 0 && eventTime - jArr[f0Var.e] > 40) {
                    f0Var.d = i2;
                    f0Var.c = 0.0f;
                }
                int i9 = (f0Var.e + 1) % 20;
                f0Var.e = i9;
                int i10 = f0Var.d;
                if (i10 != 20) {
                    f0Var.d = i10 + 1;
                }
                f0Var.a[i9] = motionEvent.getAxisValue(26);
                jArr[f0Var.e] = eventTime;
            }
            float f5 = Float.MAX_VALUE;
            velocityTracker2.computeCurrentVelocity(1000, Float.MAX_VALUE);
            f0 f0Var2 = (f0) e0.a.get(velocityTracker2);
            if (f0Var2 != null) {
                float[] fArr = f0Var2.a;
                long[] jArr2 = f0Var2.b;
                int i11 = f0Var2.d;
                if (i11 < 2) {
                    f3 = Float.MAX_VALUE;
                } else {
                    int i12 = f0Var2.e;
                    int i13 = ((i12 + 20) - (i11 - 1)) % 20;
                    long j2 = jArr2[i12];
                    while (true) {
                        j = jArr2[i13];
                        long j3 = j2 - j;
                        f3 = f5;
                        i3 = f0Var2.d;
                        if (j3 <= 100) {
                            break;
                        }
                        f0Var2.d = i3 - 1;
                        i13 = (i13 + 1) % 20;
                        f5 = f3;
                    }
                    if (i3 >= 2) {
                        if (i3 == 2) {
                            int i14 = (i13 + 1) % 20;
                            long j4 = jArr2[i14];
                            if (j != j4) {
                                nestedScrollView2 = nestedScrollView2;
                                i4 = 1000;
                                fSqrt = fArr[i14] / (j4 - j);
                            }
                        } else {
                            float f6 = 0.0f;
                            int i15 = 0;
                            int i16 = 0;
                            while (true) {
                                if (i15 >= f0Var2.d - 1) {
                                    break;
                                }
                                int i17 = i15 + i13;
                                long j5 = jArr2[i17 % 20];
                                int i18 = (i17 + 1) % i8;
                                if (jArr2[i18] != j5) {
                                    i16++;
                                    float fSqrt2 = (f6 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f6) * 2.0f));
                                    float f7 = fArr[i18] / (jArr2[i18] - j5);
                                    float fAbs = (Math.abs(f7) * (f7 - fSqrt2)) + f6;
                                    if (i16 == i5) {
                                        fAbs *= 0.5f;
                                    }
                                    f6 = fAbs;
                                }
                                i15++;
                                nestedScrollView2 = nestedScrollView2;
                                i8 = 20;
                                i5 = 1;
                            }
                            nestedScrollView2 = nestedScrollView2;
                            fSqrt = ((float) Math.sqrt(Math.abs(f6) * 2.0f)) * (f6 < 0.0f ? -1.0f : 1.0f);
                            i4 = 1000;
                        }
                        f4 = fSqrt * i4;
                        f0Var2.c = f4;
                        if (f4 < (-Math.abs(f3))) {
                            f0Var2.c = -Math.abs(f3);
                        } else if (f0Var2.c > Math.abs(f3)) {
                            f0Var2.c = Math.abs(f3);
                        }
                    }
                }
                i4 = 1000;
                fSqrt = 0.0f;
                f4 = fSqrt * i4;
                f0Var2.c = f4;
                if (f4 < (-Math.abs(f3))) {
                    f0Var2.c = -Math.abs(f3);
                } else if (f0Var2.c > Math.abs(f3)) {
                    f0Var2.c = Math.abs(f3);
                }
            } else {
                nestedScrollView2 = nestedScrollView2;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                yVelocity = androidx.compose.ui.text.android.b.c(velocityTracker2, i);
            } else if (i == 0) {
                yVelocity = velocityTracker2.getXVelocity();
            } else if (i == 1) {
                yVelocity = velocityTracker2.getYVelocity();
            } else {
                f0 f0Var3 = (f0) e0.a.get(velocityTracker2);
                yVelocity = (f0Var3 == null || i != 26) ? 0.0f : f0Var3.c;
            }
            float f8 = yVelocity * (-nestedScrollView2.getVerticalScrollFactorCompat());
            float fSignum = Math.signum(f8);
            if (z || !(fSignum == Math.signum(gVar.d) || fSignum == 0.0f)) {
                nestedScrollView = nestedScrollView2;
                nestedScrollView.A.abortAnimation();
            } else {
                nestedScrollView = nestedScrollView2;
            }
            if (Math.abs(f8) >= iArr[0]) {
                int i19 = iArr[1];
                float fMax = Math.max(-i19, Math.min(f8, i19));
                if (fMax == 0.0f) {
                    f2 = 0.0f;
                } else {
                    nestedScrollView.A.abortAnimation();
                    nestedScrollView.i((int) fMax);
                    f2 = fMax;
                }
                gVar.d = f2;
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x0119  */
    /* JADX WARN: Code duplicated, block: B:70:0x012f  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.I) {
            return true;
        }
        int i = action & 255;
        if (i == 0) {
            int y = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y < childAt.getTop() - scrollY || y >= childAt.getBottom() - scrollY || x < childAt.getLeft() || x >= childAt.getRight()) {
                    if (!u(motionEvent) && this.A.isFinished()) {
                        z = false;
                    }
                    this.I = z;
                    velocityTracker = this.J;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.J = null;
                    }
                } else {
                    this.E = y;
                    this.P = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.J;
                    if (velocityTracker3 == null) {
                        this.J = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.J.addMovement(motionEvent);
                    this.A.computeScrollOffset();
                    if (!u(motionEvent) && this.A.isFinished()) {
                        z = false;
                    }
                    this.I = z;
                    this.W.g(2, 0);
                }
            } else {
                if (!u(motionEvent)) {
                    z = false;
                }
                this.I = z;
                velocityTracker = this.J;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.J = null;
                }
            }
        } else if (i == 1) {
            this.I = false;
            this.P = -1;
            velocityTracker2 = this.J;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.J = null;
            }
            if (this.A.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            v(0);
        } else if (i == 2) {
            int i2 = this.P;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y2 - this.E) > this.M && (2 & getNestedScrollAxes()) == 0) {
                        this.I = true;
                        this.E = y2;
                        if (this.J == null) {
                            this.J = VelocityTracker.obtain();
                        }
                        this.J.addMovement(motionEvent);
                        this.S = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i == 3) {
            this.I = false;
            this.P = -1;
            velocityTracker2 = this.J;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.J = null;
            }
            if (this.A.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            v(0);
        } else if (i == 6) {
            n(motionEvent);
        }
        return this.I;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.F = false;
        View view = this.H;
        if (view != null && k(view, this)) {
            View view2 = this.H;
            Rect rect = this.z;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iB = b(rect);
            if (iB != 0) {
                scrollBy(0, iB);
            }
        }
        this.H = null;
        if (!this.G) {
            if (this.U != null) {
                scrollTo(getScrollX(), this.U.e);
                this.U = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i5 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i5 != scrollY) {
                scrollTo(getScrollX(), i5);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.G = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.K && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        i((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.W.b(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        this.W.c(i, i2, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m(null, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        f(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus != null && l(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        this.U = fVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        fVar.e = getScrollY();
        return fVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !l(viewFindFocus, 0, i4)) {
            return;
        }
        Rect rect = this.z;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iB = b(rect);
        if (iB != 0) {
            if (this.L) {
                t(0, iB, false);
            } else {
                scrollBy(0, iB);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return e(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        g(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0120  */
    /* JADX WARN: Code duplicated, block: B:56:0x0136  */
    /* JADX WARN: Code duplicated, block: B:59:0x013f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0141  */
    /* JADX WARN: Code duplicated, block: B:63:0x0146  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float fP;
        int iRound;
        int i;
        ViewParent parent2;
        int i2;
        if (this.J == null) {
            this.J = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.S = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.S);
        o oVar = this.W;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.B;
            EdgeEffect edgeEffect2 = this.C;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.J;
                velocityTracker.computeCurrentVelocity(1000, this.O);
                int yVelocity = (int) velocityTracker.getYVelocity(this.P);
                if (Math.abs(yVelocity) >= this.N) {
                    if (androidx.room.r.m(edgeEffect) != 0.0f) {
                        if (s(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            i(-yVelocity);
                        }
                    } else if (androidx.room.r.m(edgeEffect2) != 0.0f) {
                        int i3 = -yVelocity;
                        if (s(edgeEffect2, i3)) {
                            edgeEffect2.onAbsorb(i3);
                        } else {
                            i(i3);
                        }
                    } else {
                        int i4 = -yVelocity;
                        float f2 = i4;
                        if (!oVar.b(0.0f, f2)) {
                            dispatchNestedFling(0.0f, f2, true);
                            i(i4);
                        }
                    }
                } else if (this.A.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.P = -1;
                this.I = false;
                VelocityTracker velocityTracker2 = this.J;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.J = null;
                }
                v(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.P);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.P + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i5 = this.E - y;
                    float x = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i5 / getHeight();
                    if (androidx.room.r.m(edgeEffect) != 0.0f) {
                        fP = -androidx.room.r.p(edgeEffect, -height, x);
                        if (androidx.room.r.m(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else if (androidx.room.r.m(edgeEffect2) != 0.0f) {
                        fP = androidx.room.r.p(edgeEffect2, height, 1.0f - x);
                        if (androidx.room.r.m(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                    } else {
                        iRound = Math.round(f * getHeight());
                        if (iRound != 0) {
                            invalidate();
                        }
                        i = i5 - iRound;
                        if (!this.I && Math.abs(i) > this.M) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.I = true;
                            i2 = this.M;
                            if (i > 0) {
                                i -= i2;
                            } else {
                                i += i2;
                            }
                        }
                        if (this.I) {
                            int iR = r(i, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                            this.E = y - iR;
                            this.S += iR;
                        }
                    }
                    f = fP;
                    iRound = Math.round(f * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    i = i5 - iRound;
                    if (!this.I) {
                        parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.I = true;
                        i2 = this.M;
                        if (i > 0) {
                            i -= i2;
                        } else {
                            i += i2;
                        }
                    }
                    if (this.I) {
                        int iR2 = r(i, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.E = y - iR2;
                        this.S += iR2;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.I && getChildCount() > 0) {
                    if (this.A.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                }
                this.P = -1;
                this.I = false;
                VelocityTracker velocityTracker3 = this.J;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.J = null;
                }
                v(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.E = (int) motionEvent.getY(actionIndex);
                this.P = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                n(motionEvent);
                this.E = (int) motionEvent.getY(motionEvent.findPointerIndex(this.P));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.I && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.A.isFinished()) {
                this.A.abortAnimation();
                v(1);
            }
            int y2 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.E = y2;
            this.P = pointerId;
            oVar.g(2, 0);
        }
        VelocityTracker velocityTracker4 = this.J;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public final void p(int i) {
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.z;
        if (z) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i2 = rect.top;
        int i3 = height + i2;
        rect.bottom = i3;
        q(i, i2, i3);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    public final boolean q(int i, int i2, int i3) {
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z2 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z4 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4 && z5) {
                            view = view2;
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else if (z5) {
                        view = view2;
                    }
                }
            }
        }
        View view3 = view == null ? this : view;
        if (i2 < scrollY || i3 > i4) {
            r(z2 ? i2 - scrollY : i3 - i4, -1, null, 0, 1, true);
            z = true;
        } else {
            z = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i);
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0118  */
    /* JADX WARN: Code duplicated, block: B:59:0x0129  */
    public final int r(int i, int i2, MotionEvent motionEvent, int i3, int i4, boolean z) {
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        VelocityTracker velocityTracker;
        o oVar = this.W;
        if (i4 == 1) {
            oVar.g(2, i4);
        }
        boolean zC = this.W.c(0, i, i4, this.R, this.Q);
        int[] iArr = this.Q;
        int[] iArr2 = this.R;
        if (zC) {
            i5 = i - iArr2[1];
            i6 = iArr[1];
        } else {
            i5 = i;
            i6 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z4 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z;
        boolean z5 = o(i5, 0, scrollY, scrollRange) && !oVar.f(i4);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().a.onScrollProgress(motionEvent.getDeviceId(), motionEvent.getSource(), i2, scrollY2);
        }
        iArr2[1] = 0;
        this.W.d(0, scrollY2, 0, i5 - scrollY2, this.Q, i4, iArr2);
        int i7 = i6 + iArr[1];
        int i8 = i5 - iArr2[1];
        int i9 = scrollY + i8;
        EdgeEffect edgeEffect = this.C;
        EdgeEffect edgeEffect2 = this.B;
        if (i9 >= 0) {
            if (i9 > scrollRange && z4) {
                androidx.room.r.p(edgeEffect, i8 / getHeight(), 1.0f - (i3 / getWidth()));
                if (motionEvent != null) {
                    z2 = false;
                    getScrollFeedbackProvider().a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i2, false);
                } else {
                    z2 = false;
                }
                if (!edgeEffect2.isFinished()) {
                    edgeEffect2.onRelease();
                }
            }
            if (edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
                postInvalidateOnAnimation();
                z3 = z2;
            } else {
                z3 = z5;
            }
            if (z3 && i4 == 0 && (velocityTracker = this.J) != null) {
                velocityTracker.clear();
            }
            if (i4 == 1) {
                v(i4);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i7;
        }
        if (z4) {
            androidx.room.r.p(edgeEffect2, (-i8) / getHeight(), i3 / getWidth());
            if (motionEvent != null) {
                getScrollFeedbackProvider().a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i2, true);
            }
            if (!edgeEffect.isFinished()) {
                edgeEffect.onRelease();
            }
        }
        z2 = false;
        if (edgeEffect2.isFinished()) {
            postInvalidateOnAnimation();
            z3 = z2;
        } else {
            postInvalidateOnAnimation();
            z3 = z2;
        }
        if (z3) {
            velocityTracker.clear();
        }
        if (i4 == 1) {
            v(i4);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i7;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.F) {
            this.H = view2;
        } else {
            Rect rect = this.z;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iB = b(rect);
            if (iB != 0) {
                scrollBy(0, iB);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iB = b(rect);
        boolean z2 = iB != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iB);
                return z2;
            }
            t(0, iB, false);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.J) != null) {
            velocityTracker.recycle();
            this.J = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.F = true;
        super.requestLayout();
    }

    public final boolean s(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float fM = androidx.room.r.m(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.e * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = c0;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fM;
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i == getScrollX() && i2 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.K) {
            this.K = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        o oVar = this.W;
        if (oVar.d) {
            ViewGroup viewGroup = oVar.c;
            Field field = s0.a;
            viewGroup.stopNestedScroll();
        }
        oVar.d = z;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.L = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.W.g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        v(0);
    }

    public final void t(int i, int i2, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.y > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iMax = Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.A.startScroll(getScrollX(), scrollY, 0, iMax, org.mozilla.javascript.Context.VERSION_ECMASCRIPT);
            if (z) {
                this.W.g(2, 1);
            } else {
                v(1);
            }
            this.T = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.A.isFinished()) {
                this.A.abortAnimation();
                v(1);
            }
            scrollBy(i, i2);
        }
        this.y = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean u(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.B;
        if (androidx.room.r.m(edgeEffect) != 0.0f) {
            androidx.room.r.p(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.C;
        if (androidx.room.r.m(edgeEffect2) == 0.0f) {
            return z;
        }
        androidx.room.r.p(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void v(int i) {
        this.W.h(i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
        } else {
            net.luminis.tls.engine.impl.c.r("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
        } else {
            net.luminis.tls.engine.impl.c.r("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
        } else {
            net.luminis.tls.engine.impl.c.r("ScrollView can host only one direct child");
        }
    }

    public void setOnScrollChangeListener(e eVar) {
    }
}
