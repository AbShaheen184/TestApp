package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.c2;
import com.app.mlounge.R;
import org.mozilla.javascript.Parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements q, AbsListView.SelectionBoundsAdjuster {
    public TextView A;
    public CheckBox B;
    public TextView C;
    public ImageView D;
    public ImageView E;
    public LinearLayout F;
    public final Drawable G;
    public final int H;
    public final Context I;
    public boolean J;
    public final Drawable K;
    public final boolean L;
    public LayoutInflater M;
    public boolean N;
    public k e;
    public ImageView y;
    public RadioButton z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c2 c2VarS = c2.S(getContext(), attributeSet, androidx.appcompat.a.o, R.attr.listMenuViewStyle);
        this.G = c2VarS.D(5);
        TypedArray typedArray = (TypedArray) c2VarS.z;
        this.H = typedArray.getResourceId(1, -1);
        this.J = typedArray.getBoolean(7, false);
        this.I = context;
        this.K = c2VarS.D(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.L = typedArrayObtainStyledAttributes.hasValue(0);
        c2VarS.U();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.M == null) {
            this.M = LayoutInflater.from(getContext());
        }
        return this.M;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.D;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.E;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.E.getLayoutParams();
        rect.top = this.E.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    @Override // androidx.appcompat.view.menu.q
    public final void c(k kVar) {
        boolean z;
        int i;
        String string;
        boolean z2;
        this.e = kVar;
        boolean zIsVisible = kVar.isVisible();
        j jVar = kVar.n;
        setVisibility(zIsVisible ? 0 : 8);
        setTitle(kVar.e);
        setCheckable(kVar.isCheckable());
        if (jVar.n()) {
            if ((jVar.m() ? kVar.j : kVar.h) != 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        jVar.m();
        if (z) {
            k kVar2 = this.e;
            j jVar2 = kVar2.n;
            if (jVar2.n()) {
                if ((jVar2.m() ? kVar2.j : kVar2.h) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            i = z2 ? 0 : 8;
        }
        if (i == 0) {
            TextView textView = this.C;
            k kVar3 = this.e;
            j jVar3 = kVar3.n;
            Context context = jVar3.a;
            char c = jVar3.m() ? kVar3.j : kVar3.h;
            if (c == 0) {
                string = "";
            } else {
                Resources resources = context.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i2 = jVar3.m() ? kVar3.k : kVar3.i;
                k.a(i2, Parser.ARGC_LIMIT, resources.getString(R.string.abc_menu_meta_shortcut_label), sb);
                k.a(i2, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb);
                k.a(i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb);
                k.a(i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb);
                k.a(i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb);
                k.a(i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb);
                if (c == '\b') {
                    sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c == '\n') {
                    sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c != ' ') {
                    sb.append(c);
                } else {
                    sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.C.getVisibility() != i) {
            this.C.setVisibility(i);
        }
        setIcon(kVar.getIcon());
        setEnabled(kVar.isEnabled());
        setSubMenuArrowVisible(kVar.hasSubMenu());
        setContentDescription(kVar.q);
    }

    @Override // androidx.appcompat.view.menu.q
    public k getItemData() {
        return this.e;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.G);
        TextView textView = (TextView) findViewById(R.id.title);
        this.A = textView;
        int i = this.H;
        if (i != -1) {
            textView.setTextAppearance(this.I, i);
        }
        this.C = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.D = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.K);
        }
        this.E = (ImageView) findViewById(R.id.group_divider);
        this.F = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.y != null && this.J) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.y.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.z == null && this.B == null) {
            return;
        }
        if ((this.e.x & 4) != 0) {
            if (this.z == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.z = radioButton;
                LinearLayout linearLayout = this.F;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.z;
            view = this.B;
        } else {
            if (this.B == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.B = checkBox;
                LinearLayout linearLayout2 = this.F;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.B;
            view = this.z;
        }
        if (z) {
            compoundButton.setChecked(this.e.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.B;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.z;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.e.x & 4) != 0) {
            if (this.z == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.z = radioButton;
                LinearLayout linearLayout = this.F;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.z;
        } else {
            if (this.B == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.B = checkBox;
                LinearLayout linearLayout2 = this.F;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.B;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.N = z;
        this.J = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.E;
        if (imageView != null) {
            imageView.setVisibility((this.L || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        j jVar = this.e.n;
        boolean z = this.N;
        if (z || this.J) {
            ImageView imageView = this.y;
            if (imageView == null && drawable == null && !this.J) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.y = imageView2;
                LinearLayout linearLayout = this.F;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.J) {
                this.y.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.y;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.y.getVisibility() != 0) {
                this.y.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.A;
        if (charSequence == null) {
            if (textView.getVisibility() != 8) {
                this.A.setVisibility(8);
            }
        } else {
            textView.setText(charSequence);
            if (this.A.getVisibility() != 0) {
                this.A.setVisibility(0);
            }
        }
    }
}
