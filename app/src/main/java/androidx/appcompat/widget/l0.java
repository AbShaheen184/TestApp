package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class l0 extends TextView {
    public v A;
    public boolean B;
    public com.app.mlounge.data.music.e C;
    public Future D;
    public final o e;
    public final h0 y;
    public final androidx.compose.foundation.text.input.internal.o z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        z1.a(context);
        this.B = false;
        this.C = null;
        y1.a(this, getContext());
        o oVar = new o(this);
        this.e = oVar;
        oVar.f(attributeSet, i);
        h0 h0Var = new h0(this);
        this.y = h0Var;
        h0Var.d(attributeSet, i);
        h0Var.b();
        androidx.compose.foundation.text.input.internal.o oVar2 = new androidx.compose.foundation.text.input.internal.o(2, false);
        oVar2.y = this;
        this.z = oVar2;
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private v getEmojiTextViewHelper() {
        if (this.A == null) {
            this.A = new v(this);
        }
        return this.A;
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public i0 getSuperCaller() {
        if (this.C == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.C = new k0(this);
            } else if (i >= 28) {
                this.C = new j0(this);
            } else if (i >= 26) {
                this.C = new com.app.mlounge.data.music.e(this, 3);
            }
        }
        return this.C;
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

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.D;
        if (future != null) {
            try {
                this.D = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                coil3.network.g.q(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        androidx.compose.foundation.text.input.internal.o oVar;
        if (Build.VERSION.SDK_INT >= 28 || (oVar = this.z) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) oVar.z;
        return textClassifier == null ? b0.a((TextView) oVar.y) : textClassifier;
    }

    public androidx.core.text.c getTextMetricsParamsCompat() {
        return coil3.network.g.q(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.y.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            androidx.core.view.inputmethod.c.c(editorInfo, getText());
        }
        androidx.datastore.preferences.protobuf.h1.t(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        h0 h0Var = this.y;
        if (h0Var == null || t2.a) {
            return;
        }
        h0Var.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.D;
        if (future != null) {
            try {
                this.D = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                coil3.network.g.q(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
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
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        h0 h0Var = this.y;
        if (h0Var != null) {
            h0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        h0 h0Var = this.y;
        if (h0Var != null) {
            h0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? coil3.network.g.p(context, i) : null, i2 != 0 ? coil3.network.g.p(context, i2) : null, i3 != 0 ? coil3.network.g.p(context, i3) : null, i4 != 0 ? coil3.network.g.p(context, i4) : null);
        h0 h0Var = this.y;
        if (h0Var != null) {
            h0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? coil3.network.g.p(context, i) : null, i2 != 0 ? coil3.network.g.p(context, i2) : null, i3 != 0 ? coil3.network.g.p(context, i3) : null, i4 != 0 ? coil3.network.g.p(context, i4) : null);
        h0 h0Var = this.y;
        if (h0Var != null) {
            h0Var.b();
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

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().d(i);
        } else {
            coil3.network.g.u(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().c(i);
        } else {
            coil3.network.g.v(this, i);
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().e(i, f);
        } else if (i2 >= 34) {
            androidx.compose.ui.text.android.b.m(this, i, f);
        } else {
            coil3.network.g.w(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(androidx.core.text.d dVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        coil3.network.g.q(this);
        throw null;
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
    public void setTextClassifier(TextClassifier textClassifier) {
        androidx.compose.foundation.text.input.internal.o oVar;
        if (Build.VERSION.SDK_INT >= 28 || (oVar = this.z) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            oVar.z = textClassifier;
        }
    }

    public void setTextFuture(Future<androidx.core.text.d> future) {
        this.D = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(androidx.core.text.c cVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = cVar.b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(cVar.a);
        setBreakStrategy(cVar.c);
        setHyphenationFrequency(cVar.d);
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

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.B) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            _COROUTINE.a aVar = androidx.core.graphics.f.a;
            if (context == null) {
                net.luminis.tls.engine.impl.c.o("Context cannot be null");
                return;
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.B = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.B = false;
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        coil3.network.g.w(this, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        h0 h0Var = this.y;
        if (h0Var != null) {
            h0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        h0 h0Var = this.y;
        if (h0Var != null) {
            h0Var.b();
        }
    }

    public l0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }
}
