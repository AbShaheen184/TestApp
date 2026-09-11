package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.app.mlounge.R;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u extends EditText implements androidx.core.view.t {
    public final androidx.core.widget.h A;
    public final androidx.compose.foundation.text.input.internal.o B;
    public t C;
    public final o e;
    public final h0 y;
    public final androidx.compose.foundation.text.input.internal.o z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        z1.a(context);
        y1.a(this, getContext());
        o oVar = new o(this);
        this.e = oVar;
        oVar.f(attributeSet, R.attr.editTextStyle);
        h0 h0Var = new h0(this);
        this.y = h0Var;
        h0Var.d(attributeSet, R.attr.editTextStyle);
        h0Var.b();
        androidx.compose.foundation.text.input.internal.o oVar2 = new androidx.compose.foundation.text.input.internal.o(2, false);
        oVar2.y = this;
        this.z = oVar2;
        this.A = new androidx.core.widget.h();
        androidx.compose.foundation.text.input.internal.o oVar3 = new androidx.compose.foundation.text.input.internal.o(this, 1);
        this.B = oVar3;
        oVar3.o(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerM = oVar3.m(keyListener);
        if (keyListenerM == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    private t getSuperCaller() {
        if (this.C == null) {
            this.C = new t(this);
        }
        return this.C;
    }

    @Override // androidx.core.view.t
    public final androidx.core.view.f a(androidx.core.view.f fVar) {
        this.A.getClass();
        return androidx.core.widget.h.a(this, fVar);
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

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
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

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnection;
        String[] strArrF;
        InputConnection eVar;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.y.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && inputConnectionOnCreateInputConnection != null) {
            androidx.core.view.inputmethod.c.c(editorInfo, getText());
        }
        androidx.datastore.preferences.protobuf.h1.t(editorInfo, inputConnectionOnCreateInputConnection, this);
        if (inputConnectionOnCreateInputConnection != null && i <= 30 && (strArrF = androidx.core.view.s0.f(this)) != null) {
            androidx.core.view.inputmethod.c.b(editorInfo, strArrF);
            androidx.activity.y yVar = new androidx.activity.y(this, 3);
            if (i >= 25) {
                eVar = new androidx.core.view.inputmethod.d(inputConnectionOnCreateInputConnection, yVar);
            } else if (androidx.core.view.inputmethod.c.a(editorInfo).length != 0) {
                eVar = new androidx.core.view.inputmethod.e(inputConnectionOnCreateInputConnection, yVar);
            }
            inputConnectionOnCreateInputConnection = eVar;
        }
        com.app.mlounge.data.music.e eVar2 = (com.app.mlounge.data.music.e) this.B.z;
        if (inputConnectionOnCreateInputConnection == null) {
            eVar2.getClass();
            inputConnection = null;
        } else {
            androidx.compose.foundation.text.input.internal.o oVar = (androidx.compose.foundation.text.input.internal.o) eVar2.y;
            oVar.getClass();
            if (!(inputConnectionOnCreateInputConnection instanceof androidx.emoji2.viewsintegration.b)) {
                inputConnectionOnCreateInputConnection = new androidx.emoji2.viewsintegration.b(editorInfo, inputConnectionOnCreateInputConnection, (EditText) oVar.y);
            }
            inputConnection = inputConnectionOnCreateInputConnection;
        }
        return (androidx.emoji2.viewsintegration.b) inputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean zA = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && androidx.core.view.s0.f(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zA = a0.a(dragEvent, this, activity);
            }
        }
        if (zA) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        androidx.core.view.d dVar;
        androidx.core.view.c cVar;
        int i2;
        androidx.compose.ui.scrollcapture.i iVar;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31 || androidx.core.view.s0.f(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i3 >= 31) {
                iVar = new androidx.compose.ui.scrollcapture.i(primaryClip, 1);
            } else {
                dVar = new androidx.core.view.d();
                dVar.b = primaryClip;
                dVar.c = 1;
            }
            if (i == 16908322) {
                cVar = dVar;
                cVar = iVar;
                i2 = 0;
            } else {
                cVar = dVar;
                cVar = iVar;
                i2 = 1;
            }
            cVar.b(i2);
            androidx.core.view.s0.i(this, cVar.build());
        }
        return true;
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

    public void setEmojiCompatEnabled(boolean z) {
        this.B.s(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.B.m(keyListener));
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
}
