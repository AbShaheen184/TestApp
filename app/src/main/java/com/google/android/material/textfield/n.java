package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.c2;
import androidx.appcompat.widget.l0;
import com.app.mlounge.R;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends LinearLayout {
    public ColorStateList A;
    public PorterDuff.Mode B;
    public View.OnLongClickListener C;
    public final CheckableImageButton D;
    public final androidx.compose.ui.text.android.selection.e E;
    public int F;
    public final LinkedHashSet G;
    public ColorStateList H;
    public PorterDuff.Mode I;
    public int J;
    public ImageView.ScaleType K;
    public View.OnLongClickListener L;
    public CharSequence M;
    public final l0 N;
    public boolean O;
    public EditText P;
    public final AccessibilityManager Q;
    public AccessibilityManager.TouchExplorationStateChangeListener R;
    public final l S;
    public final TextInputLayout e;
    public final FrameLayout y;
    public final CheckableImageButton z;

    public n(TextInputLayout textInputLayout, c2 c2Var) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.F = 0;
        this.G = new LinkedHashSet();
        this.S = new l(this);
        m mVar = new m(this);
        this.Q = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.e = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.y = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.z = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.D = checkableImageButtonA2;
        this.E = new androidx.compose.ui.text.android.selection.e(this, c2Var);
        l0 l0Var = new l0(getContext(), null);
        this.N = l0Var;
        TypedArray typedArray = (TypedArray) c2Var.z;
        if (typedArray.hasValue(38)) {
            this.A = com.google.android.material.resources.c.k(getContext(), c2Var, 38);
        }
        if (typedArray.hasValue(39)) {
            this.B = com.google.android.material.internal.j.f(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(c2Var.D(37));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        checkableImageButtonA.setImportantForAccessibility(2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setCheckable(false);
        checkableImageButtonA.setFocusable(false);
        if (!typedArray.hasValue(54)) {
            if (typedArray.hasValue(32)) {
                this.H = com.google.android.material.resources.c.k(getContext(), c2Var, 32);
            }
            if (typedArray.hasValue(33)) {
                this.I = com.google.android.material.internal.j.f(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && checkableImageButtonA2.getContentDescription() != (text = typedArray.getText(27))) {
                checkableImageButtonA2.setContentDescription(text);
            }
            checkableImageButtonA2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(54)) {
            if (typedArray.hasValue(55)) {
                this.H = com.google.android.material.resources.c.k(getContext(), c2Var, 55);
            }
            if (typedArray.hasValue(56)) {
                this.I = com.google.android.material.internal.j.f(typedArray.getInt(56, -1), null);
            }
            g(typedArray.getBoolean(54, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(52);
            if (checkableImageButtonA2.getContentDescription() != text2) {
                checkableImageButtonA2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            net.luminis.tls.engine.impl.c.o("endIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.J) {
            this.J = dimensionPixelSize;
            checkableImageButtonA2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonA.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType scaleTypeG = p.g(typedArray.getInt(31, -1));
            this.K = scaleTypeG;
            checkableImageButtonA2.setScaleType(scaleTypeG);
            checkableImageButtonA.setScaleType(scaleTypeG);
        }
        l0Var.setVisibility(8);
        l0Var.setId(R.id.textinput_suffix_text);
        l0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        l0Var.setAccessibilityLiveRegion(1);
        l0Var.setTextAppearance(typedArray.getResourceId(73, 0));
        if (typedArray.hasValue(74)) {
            l0Var.setTextColor(c2Var.z(74));
        }
        CharSequence text3 = typedArray.getText(72);
        this.M = TextUtils.isEmpty(text3) ? null : text3;
        l0Var.setText(text3);
        n();
        frameLayout.addView(checkableImageButtonA2);
        addView(l0Var);
        addView(frameLayout);
        addView(checkableImageButtonA);
        textInputLayout.C0.add(mVar);
        if (textInputLayout.B != null) {
            mVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new androidx.appcompat.view.menu.d(this, 6));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (com.google.android.material.resources.c.m(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final o b() {
        o dVar;
        int i = this.F;
        androidx.compose.ui.text.android.selection.e eVar = this.E;
        SparseArray sparseArray = (SparseArray) eVar.d;
        o oVar = (o) sparseArray.get(i);
        if (oVar != null) {
            return oVar;
        }
        n nVar = (n) eVar.e;
        if (i == -1) {
            dVar = new d(nVar, 0);
        } else if (i == 0) {
            dVar = new d(nVar, 1);
        } else if (i == 1) {
            dVar = new t(nVar, eVar.c);
        } else if (i == 2) {
            dVar = new c(nVar);
        } else {
            if (i != 3) {
                net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "Invalid end icon mode: "));
                return null;
            }
            dVar = new k(nVar);
        }
        sparseArray.append(i, dVar);
        return dVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.D;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.N.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.y.getVisibility() == 0 && this.D.getVisibility() == 0;
    }

    public final boolean e() {
        return this.z.getVisibility() == 0;
    }

    public final void f(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean z3;
        o oVarB = b();
        boolean zJ = oVarB.j();
        CheckableImageButton checkableImageButton = this.D;
        boolean z4 = true;
        if (!zJ || (z3 = checkableImageButton.A) == oVarB.k()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(oVarB instanceof k) || (zIsActivated = checkableImageButton.isActivated()) == ((k) oVarB).l) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            p.u(this.e, checkableImageButton, this.H);
        }
    }

    public final void g(int i) {
        if (this.F == i) {
            return;
        }
        o oVarB = b();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.R;
        AccessibilityManager accessibilityManager = this.Q;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.R = null;
        oVarB.r();
        this.F = i;
        Iterator it = this.G.iterator();
        if (it.hasNext()) {
            throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.b(it);
        }
        h(i != 0);
        o oVarB2 = b();
        int iD = this.E.b;
        if (iD == 0) {
            iD = oVarB2.d();
        }
        Drawable drawableP = iD != 0 ? coil3.network.g.p(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.D;
        checkableImageButton.setImageDrawable(drawableP);
        TextInputLayout textInputLayout = this.e;
        if (drawableP != null) {
            p.a(textInputLayout, checkableImageButton, this.H, this.I);
            p.u(textInputLayout, checkableImageButton, this.H);
        }
        int iC = oVarB2.c();
        CharSequence text = iC != 0 ? getResources().getText(iC) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(oVarB2.j());
        if (!oVarB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        oVarB2.q();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListenerH = oVarB2.h();
        this.R = touchExplorationStateChangeListenerH;
        if (touchExplorationStateChangeListenerH != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.R);
        }
        View.OnClickListener onClickListenerF = oVarB2.f();
        View.OnLongClickListener onLongClickListener = this.L;
        checkableImageButton.setOnClickListener(onClickListenerF);
        p.v(checkableImageButton, onLongClickListener);
        EditText editText = this.P;
        if (editText != null) {
            oVarB2.l(editText);
            j(oVarB2);
        }
        p.a(textInputLayout, checkableImageButton, this.H, this.I);
        f(true);
    }

    public final void h(boolean z) {
        if (d() != z) {
            this.D.setVisibility(z ? 0 : 8);
            k();
            m();
            this.e.s();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.z;
        checkableImageButton.setImageDrawable(drawable);
        l();
        p.a(this.e, checkableImageButton, this.A, this.B);
    }

    public final void j(o oVar) {
        if (this.P == null) {
            return;
        }
        if (oVar.e() != null) {
            this.P.setOnFocusChangeListener(oVar.e());
        }
        if (oVar.g() != null) {
            this.D.setOnFocusChangeListener(oVar.g());
        }
    }

    public final void k() {
        this.y.setVisibility((this.D.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || ((this.M == null || this.O) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.z;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.e;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.H.q && textInputLayout.o()) ? 0 : 8);
        k();
        m();
        if (this.F != 0) {
            return;
        }
        textInputLayout.s();
    }

    public final void m() {
        TextInputLayout textInputLayout = this.e;
        if (textInputLayout.B == null) {
            return;
        }
        this.N.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.B.getPaddingTop(), (d() || e()) ? 0 : textInputLayout.B.getPaddingEnd(), textInputLayout.B.getPaddingBottom());
    }

    public final void n() {
        l0 l0Var = this.N;
        int visibility = l0Var.getVisibility();
        int i = (this.M == null || this.O) ? 8 : 0;
        if (visibility != i) {
            b().o(i == 0);
        }
        k();
        l0Var.setVisibility(i);
        this.e.s();
    }
}
