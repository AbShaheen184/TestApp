package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.q;
import androidx.appcompat.widget.d1;
import androidx.core.view.s0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends e implements q {
    public static final int[] g0 = {R.attr.state_checked};
    public int S;
    public boolean T;
    public boolean U;
    public final boolean V;
    public final CheckedTextView W;
    public FrameLayout a0;
    public androidx.appcompat.view.menu.k b0;
    public ColorStateList c0;
    public boolean d0;
    public Drawable e0;
    public final com.google.android.material.button.f f0;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.V = true;
        com.google.android.material.button.f fVar = new com.google.android.material.button.f(this, 2);
        this.f0 = fVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.app.mlounge.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.app.mlounge.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.app.mlounge.R.id.design_menu_item_text);
        this.W = checkedTextView;
        s0.m(checkedTextView, fVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.a0 == null) {
                this.a0 = (FrameLayout) ((ViewStub) findViewById(com.app.mlounge.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.a0.removeAllViews();
            this.a0.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.q
    public final void c(androidx.appcompat.view.menu.k kVar) {
        StateListDrawable stateListDrawable;
        this.b0 = kVar;
        int i = kVar.a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(kVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.app.mlounge.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(g0, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(kVar.isCheckable());
        setChecked(kVar.isChecked());
        setEnabled(kVar.isEnabled());
        setTitle(kVar.e);
        setIcon(kVar.getIcon());
        View view = kVar.z;
        if (view == null) {
            view = null;
        }
        setActionView(view);
        setContentDescription(kVar.q);
        com.google.android.gms.dynamite.g.B(this, kVar.r);
        androidx.appcompat.view.menu.k kVar2 = this.b0;
        CharSequence charSequence = kVar2.e;
        CheckedTextView checkedTextView = this.W;
        if (charSequence == null && kVar2.getIcon() == null) {
            View view2 = this.b0.z;
            if ((view2 != null ? view2 : null) != null) {
                checkedTextView.setVisibility(8);
                FrameLayout frameLayout = this.a0;
                if (frameLayout != null) {
                    d1 d1Var = (d1) frameLayout.getLayoutParams();
                    ((LinearLayout.LayoutParams) d1Var).width = -1;
                    this.a0.setLayoutParams(d1Var);
                    return;
                }
                return;
            }
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.a0;
        if (frameLayout2 != null) {
            d1 d1Var2 = (d1) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) d1Var2).width = -2;
            this.a0.setLayoutParams(d1Var2);
        }
    }

    @Override // androidx.appcompat.view.menu.q
    public androidx.appcompat.view.menu.k getItemData() {
        return this.b0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        androidx.appcompat.view.menu.k kVar = this.b0;
        if (kVar != null && kVar.isCheckable() && this.b0.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, g0);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.U != z) {
            this.U = z;
            this.f0.h(this.W, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.W;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.V) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.d0) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.c0);
            }
            int i = this.S;
            drawable.setBounds(0, 0, i, i);
        } else if (this.T) {
            if (this.e0 == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = androidx.core.content.res.j.a;
                Drawable drawable2 = resources.getDrawable(com.app.mlounge.R.drawable.navigation_empty_icon, theme);
                this.e0 = drawable2;
                if (drawable2 != null) {
                    int i2 = this.S;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.e0;
        }
        this.W.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.W.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.S = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.c0 = colorStateList;
        this.d0 = colorStateList != null;
        androidx.appcompat.view.menu.k kVar = this.b0;
        if (kVar != null) {
            setIcon(kVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.W.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.T = z;
    }

    public void setTextAppearance(int i) {
        this.W.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.W.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.W.setText(charSequence);
    }
}
