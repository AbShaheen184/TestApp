package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n extends AutoCompleteTextView {
    public static final int[] A = {R.attr.popupBackground};
    public final o e;
    public final h0 y;
    public final androidx.compose.foundation.text.input.internal.o z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.app.mlounge.R.attr.autoCompleteTextViewStyle);
        z1.a(context);
        y1.a(this, getContext());
        c2 c2VarS = c2.S(getContext(), attributeSet, A, com.app.mlounge.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) c2VarS.z).hasValue(0)) {
            setDropDownBackgroundDrawable(c2VarS.D(0));
        }
        c2VarS.U();
        o oVar = new o(this);
        this.e = oVar;
        oVar.f(attributeSet, com.app.mlounge.R.attr.autoCompleteTextViewStyle);
        h0 h0Var = new h0(this);
        this.y = h0Var;
        h0Var.d(attributeSet, com.app.mlounge.R.attr.autoCompleteTextViewStyle);
        h0Var.b();
        androidx.compose.foundation.text.input.internal.o oVar2 = new androidx.compose.foundation.text.input.internal.o(this, 1);
        this.z = oVar2;
        oVar2.o(attributeSet, com.app.mlounge.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerM = oVar2.m(keyListener);
        if (keyListenerM == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
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

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnection;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        androidx.datastore.preferences.protobuf.h1.t(editorInfo, inputConnectionOnCreateInputConnection, this);
        com.app.mlounge.data.music.e eVar = (com.app.mlounge.data.music.e) this.z.z;
        if (inputConnectionOnCreateInputConnection == null) {
            eVar.getClass();
            inputConnection = null;
        } else {
            androidx.compose.foundation.text.input.internal.o oVar = (androidx.compose.foundation.text.input.internal.o) eVar.y;
            oVar.getClass();
            if (!(inputConnectionOnCreateInputConnection instanceof androidx.emoji2.viewsintegration.b)) {
                inputConnectionOnCreateInputConnection = new androidx.emoji2.viewsintegration.b(editorInfo, inputConnectionOnCreateInputConnection, (EditText) oVar.y);
            }
            inputConnection = inputConnectionOnCreateInputConnection;
        }
        return (androidx.emoji2.viewsintegration.b) inputConnection;
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
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(coil3.network.g.D(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(coil3.network.g.p(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.z.s(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.z.m(keyListener));
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
}
