package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import androidx.compose.ui.platform.t1;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.s0;
import androidx.customview.widget.d;
import androidx.media3.exoplayer.s;
import androidx.transition.k;
import com.app.mlounge.R;
import com.google.android.material.shape.j;
import com.google.android.material.shape.n;
import com.google.android.material.shape.o;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends androidx.coordinatorlayout.widget.a {
    public b a;
    public final j b;
    public final ColorStateList c;
    public final o d;
    public final t1 e;
    public final float f;
    public final boolean g;
    public int h;
    public d i;
    public boolean j;
    public final float k;
    public int l;
    public int m;
    public int n;
    public int o;
    public WeakReference p;
    public WeakReference q;
    public final int r;
    public VelocityTracker s;
    public int t;
    public final LinkedHashSet u;
    public final com.google.android.material.bottomsheet.a v;

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.e = new t1(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.u = new LinkedHashSet();
        this.v = new com.google.android.material.bottomsheet.a(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.a.t);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.c = com.google.android.material.resources.c.j(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.d = o.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.r = resourceId;
            WeakReference weakReference = this.q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.q = null;
            WeakReference weakReference2 = this.p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        o oVar = this.d;
        if (oVar != null) {
            j jVar = new j(oVar);
            this.b = jVar;
            jVar.k(context);
            ColorStateList colorStateList = this.c;
            if (colorStateList != null) {
                this.b.n(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.b.setTint(typedValue.data);
            }
        }
        this.f = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.g = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // androidx.coordinatorlayout.widget.a
    public final void c(androidx.coordinatorlayout.widget.d dVar) {
        this.p = null;
        this.i = null;
    }

    @Override // androidx.coordinatorlayout.widget.a
    public final void e() {
        this.p = null;
        this.i = null;
    }

    @Override // androidx.coordinatorlayout.widget.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        d dVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && s0.d(view) == null) || !this.g) {
            this.j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.s) != null) {
            velocityTracker.recycle();
            this.s = null;
        }
        if (this.s == null) {
            this.s = VelocityTracker.obtain();
        }
        this.s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.t = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.j) {
            this.j = false;
            return false;
        }
        return (this.j || (dVar = this.i) == null || !dVar.p(motionEvent)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int iN;
        int i2;
        View viewFindViewById;
        int i3 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.p;
        j jVar = this.b;
        int i4 = 0;
        if (weakReference == null) {
            this.p = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            com.google.android.material.motion.a.B(context, R.attr.motionDurationMedium2, 300);
            com.google.android.material.motion.a.B(context, R.attr.motionDurationShort3, 150);
            com.google.android.material.motion.a.B(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (jVar != null) {
                view.setBackground(jVar);
                float elevation = this.f;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                jVar.m(elevation);
            } else {
                ColorStateList colorStateList = this.c;
                if (colorStateList != null) {
                    Field field = s0.a;
                    view.setBackgroundTintList(colorStateList);
                }
            }
            int i5 = this.h == 5 ? 4 : 0;
            if (view.getVisibility() != i5) {
                view.setVisibility(i5);
            }
            u();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (s0.d(view) == null) {
                s0.n(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i6 = Gravity.getAbsoluteGravity(((androidx.coordinatorlayout.widget.d) view.getLayoutParams()).c, i) == 3 ? 1 : 0;
        b bVar = this.a;
        if (bVar == null || bVar.r() != i6) {
            androidx.coordinatorlayout.widget.d dVar = null;
            o oVar = this.d;
            if (i6 == 0) {
                this.a = new a(this, i3);
                if (oVar != null) {
                    WeakReference weakReference2 = this.p;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof androidx.coordinatorlayout.widget.d)) {
                        dVar = (androidx.coordinatorlayout.widget.d) view3.getLayoutParams();
                    }
                    if (dVar == null || ((ViewGroup.MarginLayoutParams) dVar).rightMargin <= 0) {
                        n nVarF = oVar.f();
                        nVarF.f = new com.google.android.material.shape.a(0.0f);
                        nVarF.g = new com.google.android.material.shape.a(0.0f);
                        o oVarA = nVarF.a();
                        if (jVar != null) {
                            jVar.setShapeAppearanceModel(oVarA);
                        }
                    }
                }
            } else {
                if (i6 != 1) {
                    net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.p("Invalid sheet edge position value: ", i6, ". Must be 0 or 1."));
                    return false;
                }
                this.a = new a(this, i4);
                if (oVar != null) {
                    WeakReference weakReference3 = this.p;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof androidx.coordinatorlayout.widget.d)) {
                        dVar = (androidx.coordinatorlayout.widget.d) view2.getLayoutParams();
                    }
                    if (dVar == null || ((ViewGroup.MarginLayoutParams) dVar).leftMargin <= 0) {
                        n nVarF2 = oVar.f();
                        nVarF2.e = new com.google.android.material.shape.a(0.0f);
                        nVarF2.h = new com.google.android.material.shape.a(0.0f);
                        o oVarA2 = nVarF2.a();
                        if (jVar != null) {
                            jVar.setShapeAppearanceModel(oVarA2);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new d(coordinatorLayout.getContext(), coordinatorLayout, this.v);
        }
        int iN2 = this.a.n(view);
        coordinatorLayout.q(view, i);
        this.m = coordinatorLayout.getWidth();
        this.n = this.a.o(coordinatorLayout);
        this.l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.o = marginLayoutParams != null ? this.a.e(marginLayoutParams) : 0;
        int i7 = this.h;
        if (i7 == 1 || i7 == 2) {
            iN = iN2 - this.a.n(view);
        } else if (i7 == 3) {
            iN = 0;
        } else {
            if (i7 != 5) {
                net.luminis.tls.engine.impl.c.l(this.h, "Unexpected value: ");
                return false;
            }
            iN = this.a.j();
        }
        Field field2 = s0.a;
        view.offsetLeftAndRight(iN);
        if (this.q == null && (i2 = this.r) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.q = new WeakReference(viewFindViewById);
        }
        Iterator it = this.u.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                k.i();
                return false;
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.a
    public final void m(View view, Parcelable parcelable) {
        int i = ((c) parcelable).z;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.h = i;
    }

    @Override // androidx.coordinatorlayout.widget.a
    public final Parcelable n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new c(this);
    }

    @Override // androidx.coordinatorlayout.widget.a
    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.h == 1 && actionMasked == 0) {
            return true;
        }
        if (s()) {
            this.i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.s) != null) {
            velocityTracker.recycle();
            this.s = null;
        }
        if (this.s == null) {
            this.s = VelocityTracker.obtain();
        }
        this.s.addMovement(motionEvent);
        if (s() && actionMasked == 2 && !this.j && s()) {
            float fAbs = Math.abs(this.t - motionEvent.getX());
            d dVar = this.i;
            if (fAbs > dVar.b) {
                dVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.j;
    }

    public final void r(int i) {
        View view;
        if (this.h == i) {
            return;
        }
        this.h = i;
        WeakReference weakReference = this.p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.h == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.u.iterator();
        if (it.hasNext()) {
            throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.b(it);
        }
        u();
    }

    public final boolean s() {
        if (this.i != null) {
            return this.g || this.h == 1;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r1.o(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        r(2);
        r2.e.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            r0 = 3
            if (r4 == r0) goto L17
            r0 = 5
            if (r4 != r0) goto Ld
            com.google.android.material.sidesheet.b r0 = r2.a
            int r0 = r0.j()
            goto L1d
        Ld:
            java.lang.String r3 = "Invalid state to get outer edge offset: "
            java.lang.String r3 = androidx.privacysandbox.ads.adservices.java.internal.a.l(r4, r3)
            net.luminis.tls.engine.impl.c.o(r3)
            return
        L17:
            com.google.android.material.sidesheet.b r0 = r2.a
            int r0 = r0.i()
        L1d:
            androidx.customview.widget.d r1 = r2.i
            if (r1 == 0) goto L55
            if (r5 == 0) goto L2e
            int r3 = r3.getTop()
            boolean r3 = r1.o(r0, r3)
            if (r3 == 0) goto L55
            goto L4b
        L2e:
            int r5 = r3.getTop()
            r1.r = r3
            r3 = -1
            r1.c = r3
            r3 = 0
            boolean r3 = r1.h(r0, r5, r3, r3)
            if (r3 != 0) goto L49
            int r5 = r1.a
            if (r5 != 0) goto L49
            android.view.View r5 = r1.r
            if (r5 == 0) goto L49
            r5 = 0
            r1.r = r5
        L49:
            if (r3 == 0) goto L55
        L4b:
            r3 = 2
            r2.r(r3)
            androidx.compose.ui.platform.t1 r3 = r2.e
            r3.a(r4)
            return
        L55:
            r2.r(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.t(android.view.View, int, boolean):void");
    }

    public final void u() {
        View view;
        WeakReference weakReference = this.p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        s0.j(view, 262144);
        s0.g(view, 0);
        s0.j(view, 1048576);
        s0.g(view, 0);
        int i = 5;
        if (this.h != 5) {
            s0.k(view, androidx.core.view.accessibility.b.l, new s(this, i, 2));
        }
        int i2 = 3;
        if (this.h != 3) {
            s0.k(view, androidx.core.view.accessibility.b.j, new s(this, i2, 2));
        }
    }

    public SideSheetBehavior() {
        this.e = new t1(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.u = new LinkedHashSet();
        this.v = new com.google.android.material.bottomsheet.a(this, 1);
    }
}
