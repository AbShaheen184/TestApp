package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.app.mlounge.R;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {
    public Drawable A;
    public Drawable B;
    public Drawable C;
    public final boolean D;
    public boolean E;
    public final int F;
    public boolean e;
    public View y;
    public View z;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new a(this, 0));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.appcompat.a.a);
        boolean z = false;
        this.A = typedArrayObtainStyledAttributes.getDrawable(0);
        this.B = typedArrayObtainStyledAttributes.getDrawable(2);
        this.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.D = true;
            this.C = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.D ? !(this.A != null || this.B != null) : this.C == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A;
        if (drawable != null && drawable.isStateful()) {
            this.A.setState(getDrawableState());
        }
        Drawable drawable2 = this.B;
        if (drawable2 != null && drawable2.isStateful()) {
            this.B.setState(getDrawableState());
        }
        Drawable drawable3 = this.C;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.C.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.B;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.C;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.y = findViewById(R.id.action_bar);
        this.z = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.e || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (this.D) {
            Drawable drawable = this.C;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.A == null) {
                z2 = false;
            } else if (this.y.getVisibility() == 0) {
                this.A.setBounds(this.y.getLeft(), this.y.getTop(), this.y.getRight(), this.y.getBottom());
            } else {
                View view = this.z;
                if (view == null || view.getVisibility() != 0) {
                    this.A.setBounds(0, 0, 0, 0);
                } else {
                    this.A.setBounds(this.z.getLeft(), this.z.getTop(), this.z.getRight(), this.z.getBottom());
                }
            }
            this.E = false;
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.y == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.F) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.y == null) {
            return;
        }
        View.MeasureSpec.getMode(i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.A;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.A);
        }
        this.A = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.y;
            if (view != null) {
                this.A.setBounds(view.getLeft(), this.y.getTop(), this.y.getRight(), this.y.getBottom());
            }
        }
        boolean z = false;
        if (!this.D ? !(this.A != null || this.B != null) : this.C == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.C;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.C);
        }
        this.C = drawable;
        boolean z = this.D;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.C) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.A != null || this.B != null) : this.C == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.B;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.B);
        }
        this.B = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.E && this.B != null) {
                throw null;
            }
        }
        boolean z = false;
        if (!this.D ? !(this.A != null || this.B != null) : this.C == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z) {
        this.e = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.B;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.C;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.A;
        boolean z = this.D;
        if (drawable == drawable2 && !z) {
            return true;
        }
        if (drawable == this.B && this.E) {
            return true;
        }
        return (drawable == this.C && z) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public void setTabContainer(w1 w1Var) {
    }
}
