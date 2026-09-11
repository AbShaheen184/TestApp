package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.app.mlounge.R;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p extends Button {
    public final o e;
    public final h0 y;
    public v z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialButtonStyle);
        z1.a(context);
        y1.a(this, getContext());
        o oVar = new o(this);
        this.e = oVar;
        oVar.f(attributeSet, R.attr.materialButtonStyle);
        h0 h0Var = new h0(this);
        this.y = h0Var;
        h0Var.d(attributeSet, R.attr.materialButtonStyle);
        h0Var.b();
        getEmojiTextViewHelper().a(attributeSet, R.attr.materialButtonStyle);
    }

    private v getEmojiTextViewHelper() {
        if (this.z == null) {
            this.z = new v(this);
        }
        return this.z;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o oVar = this.e;
        if (oVar != null) {
            oVar.b();
        }
        h0 h0Var = this.y;
        if (h0Var != null) {
            h0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (t2.a) {
            return super.getAutoSizeMaxTextSize();
        }
        h0 h0Var = this.y;
        if (h0Var != null) {
            return Math.round(h0Var.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (t2.a) {
            return super.getAutoSizeMinTextSize();
        }
        h0 h0Var = this.y;
        if (h0Var != null) {
            return Math.round(h0Var.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (t2.a) {
            return super.getAutoSizeStepGranularity();
        }
        h0 h0Var = this.y;
        if (h0Var != null) {
            return Math.round(h0Var.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (t2.a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        h0 h0Var = this.y;
        return h0Var != null ? h0Var.i.f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (t2.a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        h0 h0Var = this.y;
        if (h0Var != null) {
            return h0Var.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return coil3.network.g.A(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        o oVar = this.e;
        if (oVar != null) {
            return oVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o oVar = this.e;
        if (oVar != null) {
            return oVar.e();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        a2 a2Var = this.y.h;
        if (a2Var != null) {
            return (ColorStateList) a2Var.c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        a2 a2Var = this.y.h;
        if (a2Var != null) {
            return (PorterDuff.Mode) a2Var.d;
        }
        return null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        h0 h0Var = this.y;
        if (h0Var == null || t2.a) {
            return;
        }
        h0Var.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        h0 h0Var = this.y;
        if (h0Var != null) {
            q0 q0Var = h0Var.i;
            if (t2.a || !q0Var.f()) {
                return;
            }
            q0Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        ((_COROUTINE.b) getEmojiTextViewHelper().b.e).E(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (t2.a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        h0 h0Var = this.y;
        if (h0Var != null) {
            h0Var.f(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (t2.a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        h0 h0Var = this.y;
        if (h0Var != null) {
            h0Var.g(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (t2.a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        h0 h0Var = this.y;
        if (h0Var != null) {
            h0Var.h(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o oVar = this.e;
        if (oVar != null) {
            oVar.h();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        o oVar = this.e;
        if (oVar != null) {
            oVar.i(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(coil3.network.g.D(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        ((_COROUTINE.b) getEmojiTextViewHelper().b.e).F(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((_COROUTINE.b) getEmojiTextViewHelper().b.e).q(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        h0 h0Var = this.y;
        if (h0Var != null) {
            h0Var.a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o oVar = this.e;
        if (oVar != null) {
            oVar.m(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o oVar = this.e;
        if (oVar != null) {
            oVar.n(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        h0 h0Var = this.y;
        h0Var.i(colorStateList);
        h0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        h0 h0Var = this.y;
        h0Var.j(mode);
        h0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        h0 h0Var = this.y;
        if (h0Var != null) {
            h0Var.e(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = t2.a;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        h0 h0Var = this.y;
        if (h0Var != null) {
            q0 q0Var = h0Var.i;
            if (z || q0Var.f()) {
                return;
            }
            q0Var.g(i, f);
        }
    }
}
