package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.w;
import androidx.core.view.s0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends w implements Checkable {
    public static final int[] D = {R.attr.state_checked};
    public boolean A;
    public boolean B;
    public boolean C;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.app.mlounge.R.attr.imageButtonStyle);
        this.B = true;
        this.C = true;
        s0.m(this, new com.google.android.material.button.f(this, 1));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.A;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.A ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), D) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.e);
        setChecked(aVar.z);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.z = this.A;
        return aVar;
    }

    public void setCheckable(boolean z) {
        if (this.B != z) {
            this.B = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.B || this.A == z) {
            return;
        }
        this.A = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.C = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.C) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.A);
    }
}
