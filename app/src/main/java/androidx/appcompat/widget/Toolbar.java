package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.app.mlounge.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public w A;
    public y B;
    public final Drawable C;
    public final CharSequence D;
    public w E;
    public View F;
    public Context G;
    public int H;
    public int I;
    public int J;
    public final int K;
    public final int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public v1 Q;
    public int R;
    public int S;
    public final int T;
    public CharSequence U;
    public CharSequence V;
    public ColorStateList W;
    public ColorStateList a0;
    public boolean b0;
    public boolean c0;
    public final ArrayList d0;
    public ActionMenuView e;
    public final ArrayList e0;
    public final int[] f0;
    public final androidx.core.view.m g0;
    public ArrayList h0;
    public final com.google.firebase.platforminfo.c i0;
    public m2 j0;
    public h2 k0;
    public boolean l0;
    public OnBackInvokedCallback m0;
    public OnBackInvokedDispatcher n0;
    public boolean o0;
    public final z0 p0;
    public l0 y;
    public l0 z;

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.T = 8388627;
        this.d0 = new ArrayList();
        this.e0 = new ArrayList();
        this.f0 = new int[2];
        this.g0 = new androidx.core.view.m(new d2(this, 1));
        this.h0 = new ArrayList();
        this.i0 = new com.google.firebase.platforminfo.c((Object) this);
        this.p0 = new z0(this, 2);
        Context context2 = getContext();
        int[] iArr = androidx.appcompat.a.s;
        c2 c2VarS = c2.S(context2, attributeSet, iArr, R.attr.toolbarStyle);
        androidx.core.view.s0.l(this, context, iArr, attributeSet, (TypedArray) c2VarS.z, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) c2VarS.z;
        this.I = typedArray.getResourceId(28, 0);
        this.J = typedArray.getResourceId(19, 0);
        this.T = typedArray.getInteger(0, 8388627);
        this.K = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.P = dimensionPixelOffset;
        this.O = dimensionPixelOffset;
        this.N = dimensionPixelOffset;
        this.M = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.M = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.N = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.O = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.P = dimensionPixelOffset5;
        }
        this.L = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        v1 v1Var = this.Q;
        v1Var.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            v1Var.e = dimensionPixelSize;
            v1Var.a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            v1Var.f = dimensionPixelSize2;
            v1Var.b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            v1Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.R = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.S = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.C = c2VarS.D(4);
        this.D = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.G = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableD = c2VarS.D(16);
        if (drawableD != null) {
            setNavigationIcon(drawableD);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableD2 = c2VarS.D(11);
        if (drawableD2 != null) {
            setLogo(drawableD2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(c2VarS.z(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(c2VarS.z(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        c2VarS.U();
    }

    public static i2 g() {
        i2 i2Var = new i2(-2, -2);
        i2Var.b = 0;
        i2Var.a = 8388627;
        return i2Var;
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new androidx.appcompat.view.d(getContext());
    }

    public static i2 h(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof i2;
        if (z) {
            i2 i2Var = (i2) layoutParams;
            i2 i2Var2 = new i2(i2Var);
            i2Var2.b = 0;
            i2Var2.b = i2Var.b;
            return i2Var2;
        }
        if (z) {
            i2 i2Var3 = new i2((i2) layoutParams);
            i2Var3.b = 0;
            return i2Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            i2 i2Var4 = new i2(layoutParams);
            i2Var4.b = 0;
            return i2Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        i2 i2Var5 = new i2(marginLayoutParams);
        i2Var5.b = 0;
        ((ViewGroup.MarginLayoutParams) i2Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) i2Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) i2Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) i2Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return i2Var5;
    }

    public static int j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i, ArrayList arrayList) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                i2 i2Var = (i2) childAt.getLayoutParams();
                if (i2Var.b == 0 && r(childAt)) {
                    int i3 = i2Var.a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            i2 i2Var2 = (i2) childAt2.getLayoutParams();
            if (i2Var2.b == 0 && r(childAt2)) {
                int i5 = i2Var2.a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z) {
        i2 i2VarH;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            i2VarH = g();
        } else {
            i2VarH = !checkLayoutParams(layoutParams) ? h(layoutParams) : (i2) layoutParams;
        }
        i2VarH.b = 1;
        if (!z || this.F == null) {
            addView(view, i2VarH);
        } else {
            view.setLayoutParams(i2VarH);
            this.e0.add(view);
        }
    }

    public final void c() {
        if (this.E == null) {
            w wVar = new w(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.E = wVar;
            wVar.setImageDrawable(this.C);
            this.E.setContentDescription(this.D);
            i2 i2VarG = g();
            i2VarG.a = (this.K & Token.ASSIGN_MOD) | 8388611;
            i2VarG.b = 2;
            this.E.setLayoutParams(i2VarG);
            this.E.setOnClickListener(new e2(this, 0));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof i2);
    }

    public final void d() {
        if (this.Q == null) {
            v1 v1Var = new v1();
            v1Var.a = 0;
            v1Var.b = 0;
            v1Var.c = Integer.MIN_VALUE;
            v1Var.d = Integer.MIN_VALUE;
            v1Var.e = 0;
            v1Var.f = 0;
            v1Var.g = false;
            v1Var.h = false;
            this.Q = v1Var;
        }
    }

    public final void e() {
        if (this.e == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.e = actionMenuView;
            actionMenuView.setPopupTheme(this.H);
            this.e.setOnMenuItemClickListener(this.i0);
            ActionMenuView actionMenuView2 = this.e;
            com.app.mlounge.data.music.e eVar = new com.app.mlounge.data.music.e(this, 4);
            actionMenuView2.getClass();
            actionMenuView2.Q = eVar;
            i2 i2VarG = g();
            i2VarG.a = (this.K & Token.ASSIGN_MOD) | 8388613;
            this.e.setLayoutParams(i2VarG);
            b(this.e, false);
        }
        ActionMenuView actionMenuView3 = this.e;
        if (actionMenuView3.M == null) {
            androidx.appcompat.view.menu.j jVar = (androidx.appcompat.view.menu.j) actionMenuView3.getMenu();
            if (this.k0 == null) {
                this.k0 = new h2(this);
            }
            this.e.setExpandedActionViewsExclusive(true);
            jVar.b(this.k0, this.G);
            s();
        }
    }

    public final void f() {
        if (this.A == null) {
            this.A = new w(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            i2 i2VarG = g();
            i2VarG.a = (this.K & Token.ASSIGN_MOD) | 8388611;
            this.A.setLayoutParams(i2VarG);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        i2 i2Var = new i2(context, attributeSet);
        i2Var.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.appcompat.a.b);
        i2Var.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        i2Var.b = 0;
        return i2Var;
    }

    public CharSequence getCollapseContentDescription() {
        w wVar = this.E;
        if (wVar != null) {
            return wVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        w wVar = this.E;
        if (wVar != null) {
            return wVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        v1 v1Var = this.Q;
        if (v1Var != null) {
            return v1Var.g ? v1Var.a : v1Var.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.S;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        v1 v1Var = this.Q;
        if (v1Var != null) {
            return v1Var.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        v1 v1Var = this.Q;
        if (v1Var != null) {
            return v1Var.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        v1 v1Var = this.Q;
        if (v1Var != null) {
            return v1Var.g ? v1Var.b : v1Var.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.R;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.j jVar;
        ActionMenuView actionMenuView = this.e;
        return (actionMenuView == null || (jVar = actionMenuView.M) == null || !jVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.S, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.R, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        y yVar = this.B;
        if (yVar != null) {
            return yVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        y yVar = this.B;
        if (yVar != null) {
            return yVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.e.getMenu();
    }

    public View getNavButtonView() {
        return this.A;
    }

    public CharSequence getNavigationContentDescription() {
        w wVar = this.A;
        if (wVar != null) {
            return wVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        w wVar = this.A;
        if (wVar != null) {
            return wVar.getDrawable();
        }
        return null;
    }

    public j getOuterActionMenuPresenter() {
        return null;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.e.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.G;
    }

    public int getPopupTheme() {
        return this.H;
    }

    public CharSequence getSubtitle() {
        return this.V;
    }

    public final TextView getSubtitleTextView() {
        return this.z;
    }

    public CharSequence getTitle() {
        return this.U;
    }

    public int getTitleMarginBottom() {
        return this.P;
    }

    public int getTitleMarginEnd() {
        return this.N;
    }

    public int getTitleMarginStart() {
        return this.M;
    }

    public int getTitleMarginTop() {
        return this.O;
    }

    public final TextView getTitleTextView() {
        return this.y;
    }

    public s0 getWrapper() {
        Drawable drawable;
        if (this.j0 == null) {
            m2 m2Var = new m2();
            m2Var.k = 0;
            m2Var.a = this;
            m2Var.h = getTitle();
            m2Var.i = getSubtitle();
            m2Var.g = m2Var.h != null;
            m2Var.f = getNavigationIcon();
            c2 c2VarS = c2.S(getContext(), null, androidx.appcompat.a.a, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) c2VarS.z;
            m2Var.l = c2VarS.D(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                m2Var.g = true;
                m2Var.h = text;
                if ((m2Var.b & 8) != 0) {
                    setTitle(text);
                    if (m2Var.g) {
                        androidx.core.view.s0.n(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                m2Var.i = text2;
                if ((m2Var.b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableD = c2VarS.D(20);
            if (drawableD != null) {
                m2Var.e = drawableD;
                m2Var.c();
            }
            Drawable drawableD2 = c2VarS.D(17);
            if (drawableD2 != null) {
                m2Var.d = drawableD2;
                m2Var.c();
            }
            if (m2Var.f == null && (drawable = m2Var.l) != null) {
                m2Var.f = drawable;
                if ((m2Var.b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            m2Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = m2Var.c;
                if (view != null && (m2Var.b & 16) != 0) {
                    removeView(view);
                }
                m2Var.c = viewInflate;
                if (viewInflate != null && (m2Var.b & 16) != 0) {
                    addView(viewInflate);
                }
                m2Var.a(m2Var.b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.Q.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.I = resourceId2;
                l0 l0Var = this.y;
                if (l0Var != null) {
                    l0Var.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.J = resourceId3;
                l0 l0Var2 = this.z;
                if (l0Var2 != null) {
                    l0Var2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            c2VarS.U();
            if (R.string.abc_action_bar_up_description != m2Var.k) {
                m2Var.k = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i = m2Var.k;
                    m2Var.j = i != 0 ? getContext().getString(i) : null;
                    m2Var.b();
                }
            }
            m2Var.j = getNavigationContentDescription();
            l2 l2Var = new l2();
            m2Var.a.getContext();
            setNavigationOnClickListener(l2Var);
            this.j0 = m2Var;
        }
        return this.j0;
    }

    public final int i(View view, int i) {
        i2 i2Var = (i2) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = i2Var.a & Token.ASSIGN_MOD;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.T & Token.ASSIGN_MOD;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) i2Var).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) i2Var).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) i2Var).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    public final void l() {
        Iterator it = this.h0.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = this.g0.b.iterator();
        while (it2.hasNext()) {
            ((androidx.fragment.app.f) ((androidx.core.view.n) it2.next())).a.o();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.h0 = currentMenuItems2;
    }

    public final boolean m(View view) {
        return view.getParent() == this || this.e0.contains(view);
    }

    public final int n(View view, int i, int i2, int[] iArr) {
        i2 i2Var = (i2) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) i2Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int i4 = i(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, i4, iMax + measuredWidth, view.getMeasuredHeight() + i4);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) i2Var).rightMargin + iMax;
    }

    public final int o(View view, int i, int i2, int[] iArr) {
        i2 i2Var = (i2) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) i2Var).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int i4 = i(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, i4, iMax, view.getMeasuredHeight() + i4);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) i2Var).leftMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        s();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.p0);
        s();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.c0 = false;
        }
        if (!this.c0) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.c0 = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.c0 = false;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x024b  */
    /* JADX WARN: Code duplicated, block: B:102:0x024e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0270  */
    /* JADX WARN: Code duplicated, block: B:105:0x0273  */
    /* JADX WARN: Code duplicated, block: B:108:0x0285 A[LOOP:0: B:107:0x0283->B:108:0x0285, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x029d A[LOOP:1: B:110:0x029b->B:111:0x029d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x02bd A[LOOP:2: B:113:0x02bb->B:114:0x02bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:118:0x0303 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0305  */
    /* JADX WARN: Code duplicated, block: B:120:0x0309  */
    /* JADX WARN: Code duplicated, block: B:123:0x0310 A[LOOP:3: B:122:0x030e->B:123:0x0310, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:48:0x0115  */
    /* JADX WARN: Code duplicated, block: B:51:0x011b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x011d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0120  */
    /* JADX WARN: Code duplicated, block: B:55:0x0124  */
    /* JADX WARN: Code duplicated, block: B:56:0x0127  */
    /* JADX WARN: Code duplicated, block: B:59:0x0139  */
    /* JADX WARN: Code duplicated, block: B:61:0x0141 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x015a  */
    /* JADX WARN: Code duplicated, block: B:70:0x015e  */
    /* JADX WARN: Code duplicated, block: B:72:0x016f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0171  */
    /* JADX WARN: Code duplicated, block: B:75:0x017d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0189  */
    /* JADX WARN: Code duplicated, block: B:78:0x0193  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:88:0x01df  */
    /* JADX WARN: Code duplicated, block: B:89:0x0203  */
    /* JADX WARN: Code duplicated, block: B:91:0x0206  */
    /* JADX WARN: Code duplicated, block: B:93:0x020e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0210  */
    /* JADX WARN: Code duplicated, block: B:96:0x0214  */
    /* JADX WARN: Code duplicated, block: B:99:0x0228  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iN;
        int iO;
        int iMax;
        int iMin;
        boolean zR;
        boolean zR2;
        int measuredHeight;
        l0 l0Var;
        l0 l0Var2;
        i2 i2Var;
        i2 i2Var2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int paddingTop;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int iMax2;
        int i14;
        int i15;
        int i16;
        int i17;
        ArrayList arrayList;
        int size;
        int iN2;
        int i18;
        int size2;
        int i19;
        int i20;
        int size3;
        int i21;
        int i22;
        int measuredWidth;
        int i23;
        int i24;
        int i25;
        int size4;
        y yVar;
        View view;
        ActionMenuView actionMenuView;
        w wVar;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i26 = width - paddingRight;
        int[] iArr = this.f0;
        iArr[1] = 0;
        iArr[0] = 0;
        Field field = androidx.core.view.s0.a;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (r(this.A)) {
            w wVar2 = this.A;
            if (z3) {
                iO = o(wVar2, i26, iMin2, iArr);
                iN = paddingLeft;
            } else {
                iN = n(wVar2, paddingLeft, iMin2, iArr);
            }
            if (r(this.E)) {
                wVar = this.E;
                if (z3) {
                    iO = o(wVar, iO, iMin2, iArr);
                } else {
                    iN = n(wVar, iN, iMin2, iArr);
                }
            }
            if (r(this.e)) {
                actionMenuView = this.e;
                if (z3) {
                    iN = n(actionMenuView, iN, iMin2, iArr);
                } else {
                    iO = o(actionMenuView, iO, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iN);
            iArr[1] = Math.max(0, currentContentInsetRight - (i26 - iO));
            iMax = Math.max(iN, currentContentInsetLeft);
            iMin = Math.min(iO, i26 - currentContentInsetRight);
            if (r(this.F)) {
                view = this.F;
                if (z3) {
                    iMin = o(view, iMin, iMin2, iArr);
                } else {
                    iMax = n(view, iMax, iMin2, iArr);
                }
            }
            if (r(this.B)) {
                yVar = this.B;
                if (z3) {
                    iMin = o(yVar, iMin, iMin2, iArr);
                } else {
                    iMax = n(yVar, iMax, iMin2, iArr);
                }
            }
            zR = r(this.y);
            zR2 = r(this.z);
            if (zR) {
                i2 i2Var3 = (i2) this.y.getLayoutParams();
                measuredHeight = this.y.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) i2Var3).topMargin + ((ViewGroup.MarginLayoutParams) i2Var3).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zR2) {
                i2 i2Var4 = (i2) this.z.getLayoutParams();
                measuredHeight = this.z.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) i2Var4).topMargin + ((ViewGroup.MarginLayoutParams) i2Var4).bottomMargin + measuredHeight;
            }
            if (zR || zR2) {
                if (zR) {
                    l0Var = this.y;
                } else {
                    l0Var = this.z;
                }
                if (zR2) {
                    l0Var2 = this.z;
                } else {
                    l0Var2 = this.y;
                }
                i2Var = (i2) l0Var.getLayoutParams();
                i2Var2 = (i2) l0Var2.getLayoutParams();
                i5 = measuredHeight;
                z2 = (!zR && this.y.getMeasuredWidth() > 0) || (zR2 && this.z.getMeasuredWidth() > 0);
                i6 = this.T & Token.ASSIGN_MOD;
                i7 = iMax;
                if (i6 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) i2Var).topMargin + this.O;
                } else if (i6 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                    i14 = ((ViewGroup.MarginLayoutParams) i2Var).topMargin + this.O;
                    if (iMax2 < i14) {
                        iMax2 = i14;
                    } else {
                        i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                        i16 = ((ViewGroup.MarginLayoutParams) i2Var).bottomMargin;
                        i17 = this.P;
                        if (i15 < i16 + i17) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) i2Var2).bottomMargin + i17) - i15));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) i2Var2).bottomMargin) - this.P) - i5;
                }
                if (z3) {
                    if (z2) {
                        i11 = this.M;
                    } else {
                        i11 = 0;
                    }
                    int i27 = i11 - iArr[1];
                    iMin -= Math.max(0, i27);
                    iArr[1] = Math.max(0, -i27);
                    if (zR) {
                        i2 i2Var5 = (i2) this.y.getLayoutParams();
                        int measuredWidth2 = iMin - this.y.getMeasuredWidth();
                        int measuredHeight2 = this.y.getMeasuredHeight() + paddingTop;
                        this.y.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i12 = measuredWidth2 - this.N;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) i2Var5).bottomMargin;
                    } else {
                        i12 = iMin;
                    }
                    if (zR2) {
                        int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((i2) this.z.getLayoutParams())).topMargin;
                        this.z.layout(iMin - this.z.getMeasuredWidth(), i28, iMin, this.z.getMeasuredHeight() + i28);
                        i13 = iMin - this.N;
                    } else {
                        i13 = iMin;
                    }
                    if (z2) {
                        iMin = Math.min(i12, i13);
                    }
                    iMax = i7;
                } else {
                    if (z2) {
                        i8 = this.M;
                    } else {
                        i8 = 0;
                    }
                    int i29 = i8 - iArr[0];
                    iMax = Math.max(0, i29) + i7;
                    iArr[0] = Math.max(0, -i29);
                    if (zR) {
                        i2 i2Var6 = (i2) this.y.getLayoutParams();
                        int measuredWidth3 = this.y.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.y.getMeasuredHeight() + paddingTop;
                        this.y.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i9 = measuredWidth3 + this.N;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) i2Var6).bottomMargin;
                    } else {
                        i9 = iMax;
                    }
                    if (zR2) {
                        int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((i2) this.z.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.z.getMeasuredWidth() + iMax;
                        this.z.layout(iMax, i30, measuredWidth4, this.z.getMeasuredHeight() + i30);
                        i10 = measuredWidth4 + this.N;
                    } else {
                        i10 = iMax;
                    }
                    if (z2) {
                        iMax = Math.max(i9, i10);
                    }
                }
            }
            arrayList = this.d0;
            a(3, arrayList);
            size = arrayList.size();
            iN2 = iMax;
            for (i18 = 0; i18 < size; i18++) {
                iN2 = n((View) arrayList.get(i18), iN2, iMin2, iArr);
            }
            a(5, arrayList);
            size2 = arrayList.size();
            for (i19 = 0; i19 < size2; i19++) {
                iMin = o((View) arrayList.get(i19), iMin, iMin2, iArr);
            }
            a(1, arrayList);
            int i31 = iArr[0];
            i20 = iArr[1];
            size3 = arrayList.size();
            i21 = i31;
            i22 = 0;
            measuredWidth = 0;
            while (i22 < size3) {
                View view2 = (View) arrayList.get(i22);
                i2 i2Var7 = (i2) view2.getLayoutParams();
                int i32 = i20;
                int i33 = ((ViewGroup.MarginLayoutParams) i2Var7).leftMargin - i21;
                int i34 = ((ViewGroup.MarginLayoutParams) i2Var7).rightMargin - i32;
                int iMax3 = Math.max(0, i33);
                int iMax4 = Math.max(0, i34);
                int iMax5 = Math.max(0, -i33);
                int iMax6 = Math.max(0, -i34);
                measuredWidth += view2.getMeasuredWidth() + iMax3 + iMax4;
                i22++;
                i21 = iMax5;
                i20 = iMax6;
            }
            i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
            i25 = measuredWidth + i24;
            if (i24 >= iN2) {
                if (i25 > iMin) {
                    iN2 = i24 - (i25 - iMin);
                } else {
                    iN2 = i24;
                }
            }
            size4 = arrayList.size();
            for (i23 = 0; i23 < size4; i23++) {
                iN2 = n((View) arrayList.get(i23), iN2, iMin2, iArr);
            }
            arrayList.clear();
        }
        iN = paddingLeft;
        iO = i26;
        if (r(this.E)) {
            wVar = this.E;
            if (z3) {
                iO = o(wVar, iO, iMin2, iArr);
            } else {
                iN = n(wVar, iN, iMin2, iArr);
            }
        }
        if (r(this.e)) {
            actionMenuView = this.e;
            if (z3) {
                iN = n(actionMenuView, iN, iMin2, iArr);
            } else {
                iO = o(actionMenuView, iO, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iN);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i26 - iO));
        iMax = Math.max(iN, currentContentInsetLeft2);
        iMin = Math.min(iO, i26 - currentContentInsetRight2);
        if (r(this.F)) {
            view = this.F;
            if (z3) {
                iMin = o(view, iMin, iMin2, iArr);
            } else {
                iMax = n(view, iMax, iMin2, iArr);
            }
        }
        if (r(this.B)) {
            yVar = this.B;
            if (z3) {
                iMin = o(yVar, iMin, iMin2, iArr);
            } else {
                iMax = n(yVar, iMax, iMin2, iArr);
            }
        }
        zR = r(this.y);
        zR2 = r(this.z);
        if (zR) {
            i2 i2Var8 = (i2) this.y.getLayoutParams();
            measuredHeight = this.y.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) i2Var8).topMargin + ((ViewGroup.MarginLayoutParams) i2Var8).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zR2) {
            i2 i2Var9 = (i2) this.z.getLayoutParams();
            measuredHeight = this.z.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) i2Var9).topMargin + ((ViewGroup.MarginLayoutParams) i2Var9).bottomMargin + measuredHeight;
        }
        if (zR) {
            if (zR) {
                l0Var = this.y;
            } else {
                l0Var = this.z;
            }
            if (zR2) {
                l0Var2 = this.z;
            } else {
                l0Var2 = this.y;
            }
            i2Var = (i2) l0Var.getLayoutParams();
            i2Var2 = (i2) l0Var2.getLayoutParams();
            i5 = measuredHeight;
            if (zR) {
            }
            i6 = this.T & Token.ASSIGN_MOD;
            i7 = iMax;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) i2Var).topMargin + this.O;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) i2Var).topMargin + this.O;
                if (iMax2 < i14) {
                    iMax2 = i14;
                } else {
                    i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) i2Var).bottomMargin;
                    i17 = this.P;
                    if (i15 < i16 + i17) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) i2Var2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) i2Var2).bottomMargin) - this.P) - i5;
            }
            if (z3) {
                if (z2) {
                    i11 = this.M;
                } else {
                    i11 = 0;
                }
                int i210 = i11 - iArr[1];
                iMin -= Math.max(0, i210);
                iArr[1] = Math.max(0, -i210);
                if (zR) {
                    i2 i2Var10 = (i2) this.y.getLayoutParams();
                    int measuredWidth5 = iMin - this.y.getMeasuredWidth();
                    int measuredHeight4 = this.y.getMeasuredHeight() + paddingTop;
                    this.y.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i12 = measuredWidth5 - this.N;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) i2Var10).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zR2) {
                    int i211 = paddingTop + ((ViewGroup.MarginLayoutParams) ((i2) this.z.getLayoutParams())).topMargin;
                    this.z.layout(iMin - this.z.getMeasuredWidth(), i211, iMin, this.z.getMeasuredHeight() + i211);
                    i13 = iMin - this.N;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = i7;
            } else {
                if (z2) {
                    i8 = this.M;
                } else {
                    i8 = 0;
                }
                int i212 = i8 - iArr[0];
                iMax = Math.max(0, i212) + i7;
                iArr[0] = Math.max(0, -i212);
                if (zR) {
                    i2 i2Var11 = (i2) this.y.getLayoutParams();
                    int measuredWidth6 = this.y.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.y.getMeasuredHeight() + paddingTop;
                    this.y.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i9 = measuredWidth6 + this.N;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) i2Var11).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zR2) {
                    int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((i2) this.z.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.z.getMeasuredWidth() + iMax;
                    this.z.layout(iMax, i35, measuredWidth7, this.z.getMeasuredHeight() + i35);
                    i10 = measuredWidth7 + this.N;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        } else {
            if (zR) {
                l0Var = this.y;
            } else {
                l0Var = this.z;
            }
            if (zR2) {
                l0Var2 = this.z;
            } else {
                l0Var2 = this.y;
            }
            i2Var = (i2) l0Var.getLayoutParams();
            i2Var2 = (i2) l0Var2.getLayoutParams();
            i5 = measuredHeight;
            if (zR) {
            }
            i6 = this.T & Token.ASSIGN_MOD;
            i7 = iMax;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) i2Var).topMargin + this.O;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) i2Var).topMargin + this.O;
                if (iMax2 < i14) {
                    iMax2 = i14;
                } else {
                    i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) i2Var).bottomMargin;
                    i17 = this.P;
                    if (i15 < i16 + i17) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) i2Var2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) i2Var2).bottomMargin) - this.P) - i5;
            }
            if (z3) {
                if (z2) {
                    i11 = this.M;
                } else {
                    i11 = 0;
                }
                int i213 = i11 - iArr[1];
                iMin -= Math.max(0, i213);
                iArr[1] = Math.max(0, -i213);
                if (zR) {
                    i2 i2Var12 = (i2) this.y.getLayoutParams();
                    int measuredWidth8 = iMin - this.y.getMeasuredWidth();
                    int measuredHeight6 = this.y.getMeasuredHeight() + paddingTop;
                    this.y.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i12 = measuredWidth8 - this.N;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) i2Var12).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zR2) {
                    int i214 = paddingTop + ((ViewGroup.MarginLayoutParams) ((i2) this.z.getLayoutParams())).topMargin;
                    this.z.layout(iMin - this.z.getMeasuredWidth(), i214, iMin, this.z.getMeasuredHeight() + i214);
                    i13 = iMin - this.N;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = i7;
            } else {
                if (z2) {
                    i8 = this.M;
                } else {
                    i8 = 0;
                }
                int i215 = i8 - iArr[0];
                iMax = Math.max(0, i215) + i7;
                iArr[0] = Math.max(0, -i215);
                if (zR) {
                    i2 i2Var13 = (i2) this.y.getLayoutParams();
                    int measuredWidth9 = this.y.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.y.getMeasuredHeight() + paddingTop;
                    this.y.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i9 = measuredWidth9 + this.N;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) i2Var13).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zR2) {
                    int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((i2) this.z.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.z.getMeasuredWidth() + iMax;
                    this.z.layout(iMax, i36, measuredWidth10, this.z.getMeasuredHeight() + i36);
                    i10 = measuredWidth10 + this.N;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        }
        arrayList = this.d0;
        a(3, arrayList);
        size = arrayList.size();
        iN2 = iMax;
        while (i18 < size) {
            iN2 = n((View) arrayList.get(i18), iN2, iMin2, iArr);
        }
        a(5, arrayList);
        size2 = arrayList.size();
        while (i19 < size2) {
            iMin = o((View) arrayList.get(i19), iMin, iMin2, iArr);
        }
        a(1, arrayList);
        int i37 = iArr[0];
        i20 = iArr[1];
        size3 = arrayList.size();
        i21 = i37;
        i22 = 0;
        measuredWidth = 0;
        while (i22 < size3) {
            View view3 = (View) arrayList.get(i22);
            i2 i2Var14 = (i2) view3.getLayoutParams();
            int i38 = i20;
            int i39 = ((ViewGroup.MarginLayoutParams) i2Var14).leftMargin - i21;
            int i310 = ((ViewGroup.MarginLayoutParams) i2Var14).rightMargin - i38;
            int iMax7 = Math.max(0, i39);
            int iMax8 = Math.max(0, i310);
            int iMax9 = Math.max(0, -i39);
            int iMax10 = Math.max(0, -i310);
            measuredWidth += view3.getMeasuredWidth() + iMax7 + iMax8;
            i22++;
            i21 = iMax9;
            i20 = iMax10;
        }
        i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        i25 = measuredWidth + i24;
        if (i24 >= iN2) {
            if (i25 > iMin) {
                iN2 = i24 - (i25 - iMin);
            } else {
                iN2 = i24;
            }
        }
        size4 = arrayList.size();
        while (i23 < size4) {
            iN2 = n((View) arrayList.get(i23), iN2, iMin2, iArr);
        }
        arrayList.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        byte b;
        byte b2;
        int iJ;
        int iMax;
        int iCombineMeasuredStates;
        int iJ2;
        int iK;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z = t2.a;
        int i3 = 0;
        if (getLayoutDirection() == 1) {
            b2 = true;
            b = 0;
        } else {
            b = 1;
            b2 = false;
        }
        if (r(this.A)) {
            q(this.A, i, 0, i2, this.L);
            iJ = j(this.A) + this.A.getMeasuredWidth();
            iMax = Math.max(0, k(this.A) + this.A.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.A.getMeasuredState());
        } else {
            iJ = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (r(this.E)) {
            q(this.E, i, 0, i2, this.L);
            iJ = j(this.E) + this.E.getMeasuredWidth();
            iMax = Math.max(iMax, k(this.E) + this.E.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.E.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iJ);
        int iMax4 = Math.max(0, currentContentInsetStart - iJ);
        byte b3 = b2;
        int[] iArr = this.f0;
        iArr[b3 == true ? 1 : 0] = iMax4;
        if (r(this.e)) {
            q(this.e, i, iMax3, i2, this.L);
            iJ2 = j(this.e) + this.e.getMeasuredWidth();
            iMax = Math.max(iMax, k(this.e) + this.e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.e.getMeasuredState());
        } else {
            iJ2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iJ2);
        iArr[b] = Math.max(0, currentContentInsetEnd - iJ2);
        if (r(this.F)) {
            iMax5 += p(this.F, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, k(this.F) + this.F.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.F.getMeasuredState());
        }
        if (r(this.B)) {
            iMax5 += p(this.B, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, k(this.B) + this.B.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.B.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((i2) childAt.getLayoutParams()).b == 0 && r(childAt)) {
                iMax5 += p(childAt, i, iMax5, i2, 0, iArr);
                int iMax6 = Math.max(iMax, k(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i5 = iMax5;
        int i6 = this.O + this.P;
        int i7 = this.M + this.N;
        if (r(this.y)) {
            p(this.y, i, i5 + i7, i2, i6, iArr);
            int iJ3 = j(this.y) + this.y.getMeasuredWidth();
            iK = k(this.y) + this.y.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.y.getMeasuredState());
            iMax2 = iJ3;
        } else {
            iK = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (r(this.z)) {
            iMax2 = Math.max(iMax2, p(this.z, i, i5 + i7, i2, i6 + iK, iArr));
            iK += k(this.z) + this.z.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.z.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iK);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i5 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.l0) {
            i3 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i8 = 0; i8 < childCount2; i8++) {
            View childAt2 = getChildAt(i8);
            if (r(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i3 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i3);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof k2)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k2 k2Var = (k2) parcelable;
        super.onRestoreInstanceState(k2Var.e);
        ActionMenuView actionMenuView = this.e;
        androidx.appcompat.view.menu.j jVar = actionMenuView != null ? actionMenuView.M : null;
        int i = k2Var.z;
        if (i != 0 && this.k0 != null && jVar != null && (menuItemFindItem = jVar.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (k2Var.A) {
            z0 z0Var = this.p0;
            removeCallbacks(z0Var);
            post(z0Var);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        v1 v1Var = this.Q;
        boolean z = i == 1;
        if (z == v1Var.g) {
            return;
        }
        v1Var.g = z;
        if (!v1Var.h) {
            v1Var.a = v1Var.e;
            v1Var.b = v1Var.f;
            return;
        }
        if (z) {
            int i2 = v1Var.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = v1Var.e;
            }
            v1Var.a = i2;
            int i3 = v1Var.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = v1Var.f;
            }
            v1Var.b = i3;
            return;
        }
        int i4 = v1Var.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = v1Var.e;
        }
        v1Var.a = i4;
        int i5 = v1Var.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = v1Var.f;
        }
        v1Var.b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        j jVar;
        g gVar;
        androidx.appcompat.view.menu.k kVar;
        k2 k2Var = new k2(super.onSaveInstanceState());
        h2 h2Var = this.k0;
        if (h2Var != null && (kVar = h2Var.y) != null) {
            k2Var.z = kVar.a;
        }
        ActionMenuView actionMenuView = this.e;
        k2Var.A = (actionMenuView == null || (jVar = actionMenuView.P) == null || (gVar = jVar.O) == null || !gVar.b()) ? false : true;
        return k2Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.b0 = false;
        }
        if (!this.b0) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.b0 = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.b0 = false;
        return true;
    }

    public final int p(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void q(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean r(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final void s() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = g2.a(this);
            h2 h2Var = this.k0;
            boolean z = (h2Var == null || h2Var.y == null || onBackInvokedDispatcherA == null || !isAttachedToWindow() || !this.o0) ? false : true;
            if (z && this.n0 == null) {
                if (this.m0 == null) {
                    this.m0 = g2.b(new d2(this, 0));
                }
                g2.c(onBackInvokedDispatcherA, this.m0);
                this.n0 = onBackInvokedDispatcherA;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.n0) == null) {
                return;
            }
            g2.d(onBackInvokedDispatcher, this.m0);
            this.n0 = null;
        }
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.o0 != z) {
            this.o0 = z;
            s();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        w wVar = this.E;
        if (wVar != null) {
            wVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.E.setImageDrawable(drawable);
        } else {
            w wVar = this.E;
            if (wVar != null) {
                wVar.setImageDrawable(this.C);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.l0 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.S) {
            this.S = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.R) {
            this.R = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        y yVar = this.B;
        if (drawable != null) {
            if (yVar == null) {
                this.B = new y(getContext(), 0);
            }
            if (!m(this.B)) {
                b(this.B, true);
            }
        } else if (yVar != null && m(yVar)) {
            removeView(this.B);
            this.e0.remove(this.B);
        }
        y yVar2 = this.B;
        if (yVar2 != null) {
            yVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.B == null) {
            this.B = new y(getContext(), 0);
        }
        y yVar = this.B;
        if (yVar != null) {
            yVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        w wVar = this.A;
        if (wVar != null) {
            wVar.setContentDescription(charSequence);
            com.google.android.gms.dynamite.g.B(this.A, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!m(this.A)) {
                b(this.A, true);
            }
        } else {
            w wVar = this.A;
            if (wVar != null && m(wVar)) {
                removeView(this.A);
                this.e0.remove(this.A);
            }
        }
        w wVar2 = this.A;
        if (wVar2 != null) {
            wVar2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.A.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.e.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.H != i) {
            this.H = i;
            if (i == 0) {
                this.G = getContext();
            } else {
                this.G = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        l0 l0Var = this.z;
        if (!zIsEmpty) {
            if (l0Var == null) {
                Context context = getContext();
                l0 l0Var2 = new l0(context, null);
                this.z = l0Var2;
                l0Var2.setSingleLine();
                this.z.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.J;
                if (i != 0) {
                    this.z.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.a0;
                if (colorStateList != null) {
                    this.z.setTextColor(colorStateList);
                }
            }
            if (!m(this.z)) {
                b(this.z, true);
            }
        } else if (l0Var != null && m(l0Var)) {
            removeView(this.z);
            this.e0.remove(this.z);
        }
        l0 l0Var3 = this.z;
        if (l0Var3 != null) {
            l0Var3.setText(charSequence);
        }
        this.V = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.a0 = colorStateList;
        l0 l0Var = this.z;
        if (l0Var != null) {
            l0Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        l0 l0Var = this.y;
        if (!zIsEmpty) {
            if (l0Var == null) {
                Context context = getContext();
                l0 l0Var2 = new l0(context, null);
                this.y = l0Var2;
                l0Var2.setSingleLine();
                this.y.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.I;
                if (i != 0) {
                    this.y.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.W;
                if (colorStateList != null) {
                    this.y.setTextColor(colorStateList);
                }
            }
            if (!m(this.y)) {
                b(this.y, true);
            }
        } else if (l0Var != null && m(l0Var)) {
            removeView(this.y);
            this.e0.remove(this.y);
        }
        l0 l0Var3 = this.y;
        if (l0Var3 != null) {
            l0Var3.setText(charSequence);
        }
        this.U = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.P = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.N = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.M = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.O = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.W = colorStateList;
        l0 l0Var = this.y;
        if (l0Var != null) {
            l0Var.setTextColor(colorStateList);
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(coil3.network.g.p(getContext(), i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setOnMenuItemClickListener(j2 j2Var) {
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return h(layoutParams);
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(coil3.network.g.p(getContext(), i));
    }

    public void setLogo(int i) {
        setLogo(coil3.network.g.p(getContext(), i));
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
