package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.app.mlounge.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a1 extends ListView {
    public int A;
    public int B;
    public int C;
    public x0 D;
    public boolean E;
    public final boolean F;
    public boolean G;
    public androidx.core.widget.c H;
    public z0 I;
    public final Rect e;
    public int y;
    public int z;

    public a1(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.e = new Rect();
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.F = z;
        setCacheColorHint(0);
    }

    public final int a(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = adapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            view = adapter.getView(i4, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i5 = layoutParams.height;
            view.measure(i, i5 > 0 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i4 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i2) {
                return i2;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x014a  */
    /* JADX WARN: Code duplicated, block: B:83:0x015f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0166 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0168  */
    /* JADX WARN: Code duplicated, block: B:89:0x017a  */
    /* JADX WARN: Code duplicated, block: B:90:0x017c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0180  */
    /* JADX WARN: Code duplicated, block: B:9:0x0016  */
    public final boolean b(MotionEvent motionEvent, int i) {
        boolean z;
        boolean zA;
        View childAt;
        View childAt2;
        androidx.core.widget.c cVar;
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = true;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z = true;
            } else if (actionMasked != 3) {
                z = true;
                z2 = false;
            } else {
                z = false;
                z2 = false;
            }
            if (z || z2) {
                this.G = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.C - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            cVar = this.H;
            if (z) {
                if (cVar == null) {
                    this.H = new androidx.core.widget.c(this);
                }
                androidx.core.widget.c cVar2 = this.H;
                boolean z3 = cVar2.M;
                cVar2.M = true;
                cVar2.onTouch(this, motionEvent);
            } else if (cVar != null) {
                if (cVar.M) {
                    cVar.d();
                }
                cVar.M = false;
            }
            return z;
        }
        z = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex < 0) {
            z = false;
            z2 = false;
        } else {
            int x = (int) motionEvent.getX(iFindPointerIndex);
            int y = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x, y);
            if (iPointToPosition != -1) {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f = x;
                float f2 = y;
                this.G = true;
                u0.a(this, f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i2 = this.C;
                if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.C = iPointToPosition;
                u0.a(childAt3, f - childAt3.getLeft(), f2 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z4 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z4) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.e;
                rect.set(left, top, right, bottom);
                rect.left -= this.y;
                rect.top -= this.z;
                rect.right += this.A;
                rect.bottom += this.B;
                if (Build.VERSION.SDK_INT >= 33) {
                    zA = w0.a(this);
                } else {
                    Field field = y0.a;
                    if (field != null) {
                        try {
                            zA = field.getBoolean(this);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                            zA = false;
                        }
                    } else {
                        zA = false;
                    }
                }
                if (childAt3.isEnabled() != zA) {
                    boolean z5 = !zA;
                    if (Build.VERSION.SDK_INT >= 33) {
                        w0.b(this, z5);
                    } else {
                        Field field2 = y0.a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z5));
                            } catch (IllegalAccessException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z4) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    selector2.setHotspot(f, f2);
                }
                x0 x0Var = this.D;
                if (x0Var != null) {
                    x0Var.y = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z2 = false;
                z = true;
            }
        }
        if (z) {
            this.G = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.C - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.G = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.C - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        cVar = this.H;
        if (z) {
            if (cVar == null) {
                this.H = new androidx.core.widget.c(this);
            }
            androidx.core.widget.c cVar3 = this.H;
            boolean z6 = cVar3.M;
            cVar3.M = true;
            cVar3.onTouch(this, motionEvent);
        } else if (cVar != null) {
            if (cVar.M) {
                cVar.d();
            }
            cVar.M = false;
        }
        return z;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.e;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.I != null) {
            return;
        }
        super.drawableStateChanged();
        x0 x0Var = this.D;
        if (x0Var != null) {
            x0Var.y = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.G && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.F || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.F || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.F || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.F && this.E) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.I = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.I == null) {
            z0 z0Var = new z0(this, 0);
            this.I = z0Var;
            post(z0Var);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i < 30 || !v0.d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        v0.a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        v0.b.invoke(this, Integer.valueOf(iPointToPosition));
                        v0.c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.G && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.C = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        z0 z0Var = this.I;
        if (z0Var != null) {
            a1 a1Var = (a1) z0Var.y;
            a1Var.I = null;
            a1Var.removeCallbacks(z0Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.E = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        x0 x0Var = null;
        if (drawable != null) {
            x0 x0Var2 = new x0();
            Drawable drawable2 = x0Var2.e;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            x0Var2.e = drawable;
            drawable.setCallback(x0Var2);
            x0Var2.y = true;
            x0Var = x0Var2;
        }
        this.D = x0Var;
        super.setSelector(x0Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.y = rect.left;
        this.z = rect.top;
        this.A = rect.right;
        this.B = rect.bottom;
    }
}
