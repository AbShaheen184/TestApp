package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.app.mlounge.R;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends o {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public AutoCompleteTextView h;
    public final androidx.media3.ui.h i;
    public final com.app.mlounge.emulator.c j;
    public final j k;
    public boolean l;
    public boolean m;
    public boolean n;
    public long o;
    public AccessibilityManager p;
    public ValueAnimator q;
    public ValueAnimator r;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.material.textfield.j] */
    public k(n nVar) {
        super(nVar);
        this.i = new androidx.media3.ui.h(this, 8);
        this.j = new com.app.mlounge.emulator.c(this, 2);
        this.k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: com.google.android.material.textfield.j
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                k kVar = this.e;
                AutoCompleteTextView autoCompleteTextView = kVar.h;
                if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
                    return;
                }
                kVar.d.setImportantForAccessibility(z ? 2 : 1);
            }
        };
        this.o = Long.MAX_VALUE;
        this.f = com.google.android.material.motion.a.B(nVar.getContext(), R.attr.motionDurationShort3, 67);
        this.e = com.google.android.material.motion.a.B(nVar.getContext(), R.attr.motionDurationShort3, 50);
        this.g = com.google.android.material.motion.a.C(nVar.getContext(), R.attr.motionEasingLinearInterpolator, com.google.android.material.animation.a.a);
    }

    @Override // com.google.android.material.textfield.o
    public final void a() {
        if (this.p.isTouchExplorationEnabled() && this.h.getInputType() != 0 && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new com.google.android.datatransport.runtime.scheduling.jobscheduling.k(this, 5));
    }

    @Override // com.google.android.material.textfield.o
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // com.google.android.material.textfield.o
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // com.google.android.material.textfield.o
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // com.google.android.material.textfield.o
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // com.google.android.material.textfield.o
    public final AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.k;
    }

    @Override // com.google.android.material.textfield.o
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // com.google.android.material.textfield.o
    public final boolean k() {
        return this.n;
    }

    @Override // com.google.android.material.textfield.o
    public final void l(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            org.mozilla.javascript.c.b("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
            return;
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.h
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    k kVar = this.e;
                    long j = jUptimeMillis - kVar.o;
                    if (j < 0 || j > 300) {
                        kVar.m = false;
                    }
                    kVar.t();
                    kVar.m = true;
                    kVar.o = SystemClock.uptimeMillis();
                }
                return false;
            }
        });
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.i
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                k kVar = this.a;
                kVar.m = true;
                kVar.o = SystemClock.uptimeMillis();
                kVar.s(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.p.isTouchExplorationEnabled()) {
            this.d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.o
    public final void m(androidx.core.view.accessibility.d dVar) {
        if (this.h.getInputType() == 0) {
            dVar.k(Spinner.class.getName());
        }
        if (dVar.h()) {
            dVar.m(null);
        }
    }

    @Override // com.google.android.material.textfield.o
    public final void n(AccessibilityEvent accessibilityEvent) {
        if (this.p.isEnabled() && this.h.getInputType() == 0) {
            boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.n && !this.h.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z) {
                t();
                this.m = true;
                this.o = SystemClock.uptimeMillis();
            }
        }
    }

    @Override // com.google.android.material.textfield.o
    public final void q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f);
        int i = 1;
        valueAnimatorOfFloat.addUpdateListener(new androidx.media3.ui.f(this, i));
        this.r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.e);
        valueAnimatorOfFloat2.addUpdateListener(new androidx.media3.ui.f(this, i));
        this.q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new androidx.appcompat.widget.b(this, 4));
        this.p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.o
    public final void r() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void s(boolean z) {
        if (this.n != z) {
            this.n = z;
            this.r.cancel();
            this.q.start();
        }
    }

    public final void t() {
        if (this.h == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - this.o;
        if (jUptimeMillis < 0 || jUptimeMillis > 300) {
            this.m = false;
        }
        if (this.m) {
            this.m = false;
            return;
        }
        s(!this.n);
        boolean z = this.n;
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (!z) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            this.h.showDropDown();
        }
    }
}
