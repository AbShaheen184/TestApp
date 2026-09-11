package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.app.mlounge.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p2 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static p2 H;
    public static p2 I;
    public final o2 A;
    public final o2 B;
    public int C;
    public int D;
    public q2 E;
    public boolean F;
    public boolean G;
    public final View e;
    public final CharSequence y;
    public final int z;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.appcompat.widget.o2] */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.appcompat.widget.o2] */
    public p2(View view, CharSequence charSequence) {
        final int i = 0;
        this.A = new Runnable(this) { // from class: androidx.appcompat.widget.o2
            public final /* synthetic */ p2 y;

            {
                this.y = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.y.c(false);
                        break;
                    default:
                        this.y.a();
                        break;
                }
            }
        };
        final int i2 = 1;
        this.B = new Runnable(this) { // from class: androidx.appcompat.widget.o2
            public final /* synthetic */ p2 y;

            {
                this.y = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        this.y.c(false);
                        break;
                    default:
                        this.y.a();
                        break;
                }
            }
        };
        this.e = view;
        this.y = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = androidx.core.view.t0.a;
        this.z = Build.VERSION.SDK_INT >= 28 ? androidx.compose.foundation.text.selection.s0.l(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.G = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(p2 p2Var) {
        p2 p2Var2 = H;
        if (p2Var2 != null) {
            p2Var2.e.removeCallbacks(p2Var2.A);
        }
        H = p2Var;
        if (p2Var != null) {
            p2Var.e.postDelayed(p2Var.A, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        p2 p2Var = I;
        View view = this.e;
        if (p2Var == this) {
            I = null;
            q2 q2Var = this.E;
            if (q2Var != null) {
                View view2 = (View) q2Var.b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) q2Var.a).getSystemService("window")).removeView(view2);
                }
                this.E = null;
                this.G = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (H == this) {
            b(null);
        }
        view.removeCallbacks(this.B);
    }

    public final void c(boolean z) {
        int height;
        int i;
        int i2;
        int i3;
        long longPressTimeout;
        long j;
        long j2;
        View view = this.e;
        if (view.isAttachedToWindow()) {
            b(null);
            p2 p2Var = I;
            if (p2Var != null) {
                p2Var.a();
            }
            I = this;
            this.F = z;
            q2 q2Var = new q2(view.getContext(), 0);
            View view2 = (View) q2Var.b;
            Context context = (Context) q2Var.a;
            this.E = q2Var;
            int width = this.C;
            int i4 = this.D;
            boolean z2 = this.F;
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) q2Var.d;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            ((TextView) q2Var.c).setText(this.y);
            int[] iArr = (int[]) q2Var.g;
            int[] iArr2 = (int[]) q2Var.f;
            Rect rect = (Rect) q2Var.e;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i4 + dimensionPixelOffset2;
                i = i4 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z2 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                for (Context context2 = view.getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                i3 = 1;
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i2 = 0;
                    i3 = 1;
                } else {
                    Resources resources = context.getResources();
                    i3 = 1;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i2 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i5 = iArr2[i2] - iArr[i2];
                iArr2[i2] = i5;
                iArr2[i3] = iArr2[i3] - iArr[i3];
                layoutParams.x = (i5 + width) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, i2);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i6 = iArr2[i3];
                int i7 = ((i6 + i) - dimensionPixelOffset3) - measuredHeight;
                int i8 = i6 + height + dimensionPixelOffset3;
                if (z2) {
                    if (i7 >= 0) {
                        layoutParams.y = i7;
                    } else {
                        layoutParams.y = i8;
                    }
                } else if (measuredHeight + i8 <= rect.height()) {
                    layoutParams.y = i8;
                } else {
                    layoutParams.y = i7;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.F) {
                j2 = 2500;
            } else {
                Field field = androidx.core.view.s0.a;
                if ((view.getWindowSystemUiVisibility() & 1) == i3) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            o2 o2Var = this.B;
            view.removeCallbacks(o2Var);
            view.postDelayed(o2Var, j2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.E == null || !this.F) {
            View view2 = this.e;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.G = true;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.E == null) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    if (this.G) {
                        this.C = x;
                        this.D = y;
                        this.G = false;
                        b(this);
                    } else {
                        int iAbs = Math.abs(x - this.C);
                        int i = this.z;
                        if (iAbs > i || Math.abs(y - this.D) > i) {
                            this.C = x;
                            this.D = y;
                            this.G = false;
                            b(this);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.C = view.getWidth() / 2;
        this.D = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
