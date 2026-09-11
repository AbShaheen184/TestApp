package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.appcompat.widget.d0;
import androidx.compose.foundation.gestures.z1;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l;
import androidx.compose.ui.platform.t1;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.k0;
import androidx.core.view.s0;
import androidx.customview.widget.d;
import androidx.recyclerview.widget.k;
import com.app.mlounge.R;
import com.google.android.material.shape.h;
import com.google.android.material.shape.j;
import com.google.android.material.shape.o;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends androidx.coordinatorlayout.widget.a {
    public final t1 A;
    public final ValueAnimator B;
    public final int C;
    public int D;
    public int E;
    public final float F;
    public int G;
    public final float H;
    public boolean I;
    public boolean J;
    public final boolean K;
    public final boolean L;
    public boolean M;
    public int N;
    public d O;
    public boolean P;
    public int Q;
    public boolean R;
    public final float S;
    public int T;
    public int U;
    public int V;
    public WeakReference W;
    public WeakReference X;
    public final ArrayList Y;
    public VelocityTracker Z;
    public final int a;
    public int a0;
    public boolean b;
    public int b0;
    public final float c;
    public boolean c0;
    public final int d;
    public HashMap d0;
    public int e;
    public final SparseIntArray e0;
    public boolean f;
    public final a f0;
    public int g;
    public final int h;
    public final j i;
    public final ColorStateList j;
    public final int k;
    public final int l;
    public int m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public int v;
    public int w;
    public final boolean x;
    public final o y;
    public boolean z;

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        this.a = 0;
        int i2 = 1;
        this.b = true;
        this.k = -1;
        this.l = -1;
        this.A = new t1(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = true;
        this.N = 4;
        this.S = 0.1f;
        this.Y = new ArrayList();
        this.b0 = -1;
        this.e0 = new SparseIntArray();
        this.f0 = new a(this, 0);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.a.a);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.j = com.google.android.material.resources.c.j(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(22)) {
            this.y = o.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        o oVar = this.y;
        if (oVar != null) {
            j jVar = new j(oVar);
            this.i = jVar;
            jVar.k(context);
            ColorStateList colorStateList = this.j;
            if (colorStateList != null) {
                this.i.n(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.i.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(s(), 1.0f);
        this.B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.B.addUpdateListener(new k(this, i2));
        this.H = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(10);
        if (typedValuePeekValue == null || (i = typedValuePeekValue.data) != -1) {
            A(typedArrayObtainStyledAttributes.getDimensionPixelSize(10, -1));
        } else {
            A(i);
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(9, false);
        if (this.I != z) {
            this.I = z;
            if (!z && this.N == 5) {
                B(4);
            }
            F();
        }
        this.n = typedArrayObtainStyledAttributes.getBoolean(14, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(7, true);
        if (this.b != z2) {
            this.b = z2;
            if (this.W != null) {
                r();
            }
            C((this.b && this.N == 6) ? 3 : this.N);
            G(this.N, true);
            F();
        }
        this.J = typedArrayObtainStyledAttributes.getBoolean(13, false);
        this.K = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.L = typedArrayObtainStyledAttributes.getBoolean(5, true);
        this.a = typedArrayObtainStyledAttributes.getInt(11, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(8, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            net.luminis.tls.engine.impl.c.o("ratio must be a float value between 0 and 1");
            throw null;
        }
        this.F = f;
        if (this.W != null) {
            this.E = (int) ((1.0f - f) * this.V);
        }
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(6);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0);
            if (dimensionPixelOffset < 0) {
                net.luminis.tls.engine.impl.c.o("offset must be greater than or equal to 0");
                throw null;
            }
            this.C = dimensionPixelOffset;
            G(this.N, true);
        } else {
            int i3 = typedValuePeekValue2.data;
            if (i3 < 0) {
                net.luminis.tls.engine.impl.c.o("offset must be greater than or equal to 0");
                throw null;
            }
            this.C = i3;
            G(this.N, true);
        }
        this.d = typedArrayObtainStyledAttributes.getInt(12, 500);
        this.o = typedArrayObtainStyledAttributes.getBoolean(18, false);
        this.p = typedArrayObtainStyledAttributes.getBoolean(19, false);
        this.q = typedArrayObtainStyledAttributes.getBoolean(20, false);
        this.r = typedArrayObtainStyledAttributes.getBoolean(21, true);
        this.s = typedArrayObtainStyledAttributes.getBoolean(15, false);
        this.t = typedArrayObtainStyledAttributes.getBoolean(16, false);
        this.u = typedArrayObtainStyledAttributes.getBoolean(17, false);
        this.x = typedArrayObtainStyledAttributes.getBoolean(24, true);
        typedArrayObtainStyledAttributes.recycle();
        this.c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static View v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewV = v(viewGroup.getChildAt(i));
            if (viewV != null) {
                return viewV;
            }
        }
        return null;
    }

    public static int w(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public final void A(int i) {
        boolean z = this.f;
        if (i == -1) {
            if (z) {
                return;
            } else {
                this.f = true;
            }
        } else {
            if (!z && this.e == i) {
                return;
            }
            this.f = false;
            this.e = Math.max(0, i);
        }
        I();
    }

    public final void B(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(androidx.privacysandbox.ads.adservices.java.internal.a.u(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.I && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i2 = (i == 6 && this.b && y(i) <= this.D) ? 3 : i;
        WeakReference weakReference = this.W;
        if (weakReference == null || weakReference.get() == null) {
            C(i);
            return;
        }
        View view = (View) this.W.get();
        d0 d0Var = new d0(this, view, i2);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(d0Var);
        } else {
            d0Var.run();
        }
    }

    public final void C(int i) {
        if (this.N == i) {
            return;
        }
        this.N = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.I;
        }
        WeakReference weakReference = this.W;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            H(true);
        } else if (i == 6 || i == 5 || i == 4) {
            H(false);
        }
        G(i, true);
        ArrayList arrayList = this.Y;
        if (arrayList.size() <= 0) {
            F();
        } else {
            arrayList.get(0).getClass();
            androidx.transition.k.i();
        }
    }

    public final boolean D(View view, float f) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        return Math.abs(((f * this.S) + ((float) view.getTop())) - ((float) this.G)) / ((float) t()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        C(2);
        G(r4, true);
        r2.A.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.o(r3.getLeft(), r0) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.y(r4)
            androidx.customview.widget.d r1 = r2.O
            if (r1 == 0) goto L40
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.o(r3, r0)
            if (r3 == 0) goto L40
            goto L32
        L15:
            int r5 = r3.getLeft()
            r1.r = r3
            r3 = -1
            r1.c = r3
            r3 = 0
            boolean r3 = r1.h(r5, r0, r3, r3)
            if (r3 != 0) goto L30
            int r5 = r1.a
            if (r5 != 0) goto L30
            android.view.View r5 = r1.r
            if (r5 == 0) goto L30
            r5 = 0
            r1.r = r5
        L30:
            if (r3 == 0) goto L40
        L32:
            r3 = 2
            r2.C(r3)
            r3 = 1
            r2.G(r4, r3)
            androidx.compose.ui.platform.t1 r3 = r2.A
            r3.a(r4)
            return
        L40:
            r2.C(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.E(android.view.View, int, boolean):void");
    }

    public final void F() {
        View view;
        int iA;
        WeakReference weakReference = this.W;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        s0.j(view, 524288);
        s0.g(view, 0);
        s0.j(view, 262144);
        s0.g(view, 0);
        s0.j(view, 1048576);
        s0.g(view, 0);
        SparseIntArray sparseIntArray = this.e0;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            s0.j(view, i);
            s0.g(view, 0);
            sparseIntArray.delete(0);
        }
        int i2 = 6;
        if (!this.b && this.N != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            l lVar = new l(this, i2, 9);
            ArrayList arrayListE = s0.e(view);
            int i3 = 0;
            while (true) {
                if (i3 >= arrayListE.size()) {
                    int i4 = 0;
                    int i5 = -1;
                    while (true) {
                        int[] iArr = s0.c;
                        if (i4 >= 32 || i5 != -1) {
                            break;
                        }
                        int i6 = iArr[i4];
                        boolean z = true;
                        for (int i7 = 0; i7 < arrayListE.size(); i7++) {
                            z &= ((androidx.core.view.accessibility.b) arrayListE.get(i7)).a() != i6;
                        }
                        if (z) {
                            i5 = i6;
                        }
                        i4++;
                    }
                    iA = i5;
                    break;
                }
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((androidx.core.view.accessibility.b) arrayListE.get(i3)).a).getLabel())) {
                    iA = ((androidx.core.view.accessibility.b) arrayListE.get(i3)).a();
                    break;
                }
                i3++;
            }
            if (iA != -1) {
                androidx.core.view.accessibility.b bVar = new androidx.core.view.accessibility.b(null, iA, string, lVar, null);
                View.AccessibilityDelegate accessibilityDelegateC = s0.c(view);
                androidx.core.view.b bVar2 = accessibilityDelegateC == null ? null : accessibilityDelegateC instanceof androidx.core.view.a ? ((androidx.core.view.a) accessibilityDelegateC).a : new androidx.core.view.b(accessibilityDelegateC);
                if (bVar2 == null) {
                    bVar2 = new androidx.core.view.b();
                }
                s0.m(view, bVar2);
                s0.j(view, bVar.a());
                s0.e(view).add(bVar);
                s0.g(view, 0);
            }
            sparseIntArray.put(0, iA);
        }
        if (this.I) {
            int i8 = 5;
            if (this.N != 5) {
                s0.k(view, androidx.core.view.accessibility.b.l, new l(this, i8, 9));
            }
        }
        int i9 = this.N;
        int i10 = 4;
        int i11 = 3;
        if (i9 == 3) {
            s0.k(view, androidx.core.view.accessibility.b.k, new l(this, this.b ? 4 : 6, 9));
            return;
        }
        if (i9 == 4) {
            s0.k(view, androidx.core.view.accessibility.b.j, new l(this, this.b ? 3 : 6, 9));
        } else {
            if (i9 != 6) {
                return;
            }
            s0.k(view, androidx.core.view.accessibility.b.k, new l(this, i10, 9));
            s0.k(view, androidx.core.view.accessibility.b.j, new l(this, i11, 9));
        }
    }

    public final void G(int i, boolean z) {
        j jVar;
        if (i == 2) {
            return;
        }
        boolean z2 = this.N == 3 && (this.x || z());
        if (this.z == z2 || (jVar = this.i) == null) {
            return;
        }
        this.z = z2;
        ValueAnimator valueAnimator = this.B;
        if (z && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(jVar.y.j, z2 ? s() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float fS = this.z ? s() : 1.0f;
        h hVar = jVar.y;
        if (hVar.j != fS) {
            hVar.j = fS;
            jVar.C = true;
            jVar.D = true;
            jVar.invalidateSelf();
        }
    }

    public final void H(boolean z) {
        WeakReference weakReference = this.W;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.d0 != null) {
                    return;
                } else {
                    this.d0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.W.get() && z) {
                    this.d0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.d0 = null;
        }
    }

    public final void I() {
        View view;
        if (this.W != null) {
            r();
            if (this.N != 4 || (view = (View) this.W.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // androidx.coordinatorlayout.widget.a
    public final void c(androidx.coordinatorlayout.widget.d dVar) {
        this.W = null;
        this.O = null;
    }

    @Override // androidx.coordinatorlayout.widget.a
    public final void e() {
        this.W = null;
        this.O = null;
    }

    @Override // androidx.coordinatorlayout.widget.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        d dVar;
        if (!view.isShown() || !this.K) {
            this.P = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.a0 = -1;
            this.b0 = -1;
            VelocityTracker velocityTracker = this.Z;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.Z = null;
            }
        }
        if (this.Z == null) {
            this.Z = VelocityTracker.obtain();
        }
        this.Z.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            this.b0 = y;
            if (this.N != 2) {
                WeakReference weakReference = this.X;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.o(view2, x, y)) {
                    this.a0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.c0 = true;
                }
            }
            this.P = this.a0 == -1 && !coordinatorLayout.o(view, x, this.b0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.c0 = false;
            this.a0 = -1;
            if (this.P) {
                this.P = false;
                return false;
            }
        }
        if (this.P || (dVar = this.O) == null || !dVar.p(motionEvent)) {
            WeakReference weakReference2 = this.X;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.P || this.N == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.O == null || (i = this.b0) == -1 || Math.abs(i - motionEvent.getY()) <= this.O.b) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.W == null) {
            this.g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z = (Build.VERSION.SDK_INT < 29 || this.n || this.f) ? false : true;
            if (this.o || this.p || this.q || this.s || this.t || this.u || z) {
                z1 z1Var = new z1(this, z);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                androidx.media3.container.j jVar = new androidx.media3.container.j();
                jVar.a = paddingStart;
                jVar.b = paddingEnd;
                jVar.c = paddingBottom;
                coil3.memory.c cVar = new coil3.memory.c(27, z1Var, jVar);
                Field field = s0.a;
                k0.c(view, cVar);
                if (view.isAttachedToWindow()) {
                    view.requestApplyInsets();
                } else {
                    view.addOnAttachStateChangeListener(new com.google.android.material.internal.l());
                }
            }
            s0.o(view, new c(view));
            this.W = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            com.google.android.material.motion.a.B(context, R.attr.motionDurationMedium2, 300);
            com.google.android.material.motion.a.B(context, R.attr.motionDurationShort3, 150);
            com.google.android.material.motion.a.B(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            j jVar2 = this.i;
            if (jVar2 != null) {
                view.setBackground(jVar2);
                float elevation = this.H;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                jVar2.m(elevation);
            } else {
                ColorStateList colorStateList = this.j;
                if (colorStateList != null) {
                    view.setBackgroundTintList(colorStateList);
                }
            }
            F();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.O == null) {
            this.O = new d(coordinatorLayout.getContext(), coordinatorLayout, this.f0);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i);
        this.U = coordinatorLayout.getWidth();
        this.V = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.T = height;
        int iMin = this.V;
        int i2 = iMin - height;
        int i3 = this.w;
        if (i2 < i3) {
            boolean z2 = this.r;
            int i4 = this.l;
            if (z2) {
                if (i4 != -1) {
                    iMin = Math.min(iMin, i4);
                }
                this.T = iMin;
            } else {
                int iMin2 = iMin - i3;
                if (i4 != -1) {
                    iMin2 = Math.min(iMin2, i4);
                }
                this.T = iMin2;
            }
        }
        this.D = Math.max(0, this.V - this.T);
        this.E = (int) ((1.0f - this.F) * this.V);
        r();
        int i5 = this.N;
        if (i5 == 3) {
            int iX = x();
            Field field2 = s0.a;
            view.offsetTopAndBottom(iX);
        } else if (i5 == 6) {
            int i6 = this.E;
            Field field3 = s0.a;
            view.offsetTopAndBottom(i6);
        } else if (this.I && i5 == 5) {
            int i7 = this.V;
            Field field4 = s0.a;
            view.offsetTopAndBottom(i7);
        } else if (i5 == 4) {
            int i8 = this.G;
            Field field5 = s0.a;
            view.offsetTopAndBottom(i8);
        } else if (i5 == 1 || i5 == 2) {
            int top2 = top - view.getTop();
            Field field6 = s0.a;
            view.offsetTopAndBottom(top2);
        }
        G(this.N, false);
        this.X = new WeakReference(v(view));
        ArrayList arrayList = this.Y;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        androidx.transition.k.i();
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(w(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.k, marginLayoutParams.width), w(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.l, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.a
    public final boolean i(View view) {
        WeakReference weakReference = this.X;
        return (weakReference == null || view != weakReference.get() || this.N == 3 || this.M) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.a
    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.X;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != view3) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        boolean z = this.K;
        boolean z2 = this.L;
        if (i2 > 0) {
            if (!this.R && !z2 && view2 == view3 && view2.canScrollVertically(1)) {
                this.M = true;
                return;
            }
            if (i4 < x()) {
                int iX = top - x();
                iArr[1] = iX;
                Field field = s0.a;
                view.offsetTopAndBottom(-iX);
                C(3);
            } else {
                if (!z) {
                    return;
                }
                iArr[1] = i2;
                Field field2 = s0.a;
                view.offsetTopAndBottom(-i2);
                C(1);
            }
        } else if (i2 < 0) {
            boolean zCanScrollVertically = view2.canScrollVertically(-1);
            if (!this.R && !z2 && view2 == view3 && zCanScrollVertically) {
                this.M = true;
                return;
            }
            if (!zCanScrollVertically) {
                int i5 = this.G;
                if (i4 > i5 && !this.I) {
                    int i6 = top - i5;
                    iArr[1] = i6;
                    Field field3 = s0.a;
                    view.offsetTopAndBottom(-i6);
                    C(4);
                } else {
                    if (!z) {
                        return;
                    }
                    iArr[1] = i2;
                    Field field4 = s0.a;
                    view.offsetTopAndBottom(-i2);
                    C(1);
                }
            }
        }
        u(view.getTop());
        this.Q = i2;
        this.R = true;
        this.M = false;
    }

    @Override // androidx.coordinatorlayout.widget.a
    public final void m(View view, Parcelable parcelable) {
        b bVar = (b) parcelable;
        int i = this.a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.e = bVar.A;
            }
            if (i == -1 || (i & 2) == 2) {
                this.b = bVar.B;
            }
            if (i == -1 || (i & 4) == 4) {
                this.I = bVar.C;
            }
            if (i == -1 || (i & 8) == 8) {
                this.J = bVar.D;
            }
        }
        int i2 = bVar.z;
        if (i2 == 1 || i2 == 2) {
            this.N = 4;
        } else {
            this.N = i2;
        }
    }

    @Override // androidx.coordinatorlayout.widget.a
    public final Parcelable n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new b(this);
    }

    @Override // androidx.coordinatorlayout.widget.a
    public final boolean o(View view, int i, int i2) {
        this.Q = 0;
        this.R = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    @Override // androidx.coordinatorlayout.widget.a
    public final void p(View view, View view2, int i) {
        int top;
        int top2;
        int i2;
        float yVelocity;
        int i3 = 3;
        if (view.getTop() == x()) {
            C(3);
            return;
        }
        WeakReference weakReference = this.X;
        if (weakReference != null && view2 == weakReference.get() && this.R) {
            if (this.Q > 0) {
                if (!this.b && view.getTop() > this.E) {
                    i3 = 6;
                }
            } else if (this.I) {
                VelocityTracker velocityTracker = this.Z;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.c);
                    yVelocity = this.Z.getYVelocity(this.a0);
                }
                if (D(view, yVelocity)) {
                    i3 = 5;
                } else if (this.Q == 0) {
                    top2 = view.getTop();
                    if (this.b) {
                        i2 = this.E;
                        if (top2 < i2) {
                            if (top2 >= Math.abs(top2 - this.G)) {
                            }
                        } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.G)) {
                            i3 = 4;
                        }
                        i3 = 6;
                    } else if (Math.abs(top2 - this.D) >= Math.abs(top2 - this.G)) {
                        i3 = 4;
                    }
                } else {
                    if (!this.b) {
                        top = view.getTop();
                        if (Math.abs(top - this.E) < Math.abs(top - this.G)) {
                            i3 = 6;
                        }
                    }
                    i3 = 4;
                }
            } else if (this.Q == 0) {
                top2 = view.getTop();
                if (this.b) {
                    i2 = this.E;
                    if (top2 < i2) {
                        if (top2 >= Math.abs(top2 - this.G)) {
                        }
                    } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.G)) {
                        i3 = 4;
                    }
                    i3 = 6;
                } else if (Math.abs(top2 - this.D) >= Math.abs(top2 - this.G)) {
                    i3 = 4;
                }
            } else {
                if (!this.b) {
                    top = view.getTop();
                    if (Math.abs(top - this.E) < Math.abs(top - this.G)) {
                        i3 = 6;
                    }
                }
                i3 = 4;
            }
            E(view, i3, false);
            this.R = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.N;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        d dVar = this.O;
        if (dVar != null && (this.K || i == 1)) {
            dVar.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.a0 = -1;
            this.b0 = -1;
            VelocityTracker velocityTracker = this.Z;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.Z = null;
            }
        }
        if (this.Z == null) {
            this.Z = VelocityTracker.obtain();
        }
        this.Z.addMovement(motionEvent);
        if (this.O != null && ((this.K || this.N == 1) && actionMasked == 2 && !this.P)) {
            float fAbs = Math.abs(this.b0 - motionEvent.getY());
            d dVar2 = this.O;
            if (fAbs > dVar2.b) {
                dVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.P;
    }

    public final void r() {
        int iT = t();
        boolean z = this.b;
        int i = this.V;
        if (z) {
            this.G = Math.max(i - iT, this.D);
        } else {
            this.G = i - iT;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0057  */
    public final float s() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        float f;
        float f2 = 0.0f;
        if (this.i != null && (weakReference = this.W) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.W.get();
            if (z() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                j jVar = this.i;
                float[] fArr = jVar.Y;
                float fA = fArr != null ? fArr[3] : jVar.y.a.e.a(jVar.g());
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    float radius = roundedCorner.getRadius();
                    if (radius <= 0.0f || fA <= 0.0f) {
                        f = 0.0f;
                    } else {
                        f = radius / fA;
                    }
                } else {
                    f = 0.0f;
                }
                j jVar2 = this.i;
                float[] fArr2 = jVar2.Y;
                float fA2 = fArr2 != null ? fArr2[0] : jVar2.y.a.f.a(jVar2.g());
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                    float radius2 = roundedCorner2.getRadius();
                    if (radius2 > 0.0f && fA2 > 0.0f) {
                        f2 = radius2 / fA2;
                    }
                }
                return Math.max(f, f2);
            }
        }
        return 0.0f;
    }

    public final int t() {
        int i;
        if (this.f) {
            return Math.min(Math.max(this.g, this.V - ((this.U * 9) / 16)), this.T) + this.v;
        }
        return (this.n || this.o || (i = this.m) <= 0) ? this.e + this.v : Math.max(this.e, i + this.h);
    }

    public final void u(int i) {
        if (((View) this.W.get()) != null) {
            ArrayList arrayList = this.Y;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.G;
            if (i <= i2 && i2 != x()) {
                x();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            androidx.transition.k.i();
        }
    }

    public final int x() {
        if (this.b) {
            return this.D;
        }
        return Math.max(this.C, this.r ? 0 : this.w);
    }

    public final int y(int i) {
        if (i == 3) {
            return x();
        }
        if (i == 4) {
            return this.G;
        }
        if (i == 5) {
            return this.V;
        }
        if (i == 6) {
            return this.E;
        }
        net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "Invalid state to get top offset: "));
        return 0;
    }

    public final boolean z() {
        WeakReference weakReference = this.W;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.W.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }

    public BottomSheetBehavior() {
        this.a = 0;
        this.b = true;
        this.k = -1;
        this.l = -1;
        this.A = new t1(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = true;
        this.N = 4;
        this.S = 0.1f;
        this.Y = new ArrayList();
        this.b0 = -1;
        this.e0 = new SparseIntArray();
        this.f0 = new a(this, 0);
    }
}
