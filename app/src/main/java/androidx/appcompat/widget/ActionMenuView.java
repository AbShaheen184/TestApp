package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends e1 implements androidx.appcompat.view.menu.i {
    public androidx.appcompat.view.menu.j M;
    public Context N;
    public int O;
    public j P;
    public com.app.mlounge.data.music.e Q;
    public boolean R;
    public int S;
    public final int T;
    public final int U;
    public m V;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.T = (int) (56.0f * f);
        this.U = (int) (f * 4.0f);
        this.N = context;
        this.O = 0;
    }

    public static l i() {
        l lVar = new l(-2, -2);
        lVar.a = false;
        ((LinearLayout.LayoutParams) lVar).gravity = 16;
        return lVar;
    }

    public static l j(ViewGroup.LayoutParams layoutParams) {
        l lVar;
        if (layoutParams == null) {
            return i();
        }
        if (layoutParams instanceof l) {
            l lVar2 = (l) layoutParams;
            lVar = new l(lVar2);
            lVar.a = lVar2.a;
        } else {
            lVar = new l(layoutParams);
        }
        if (((LinearLayout.LayoutParams) lVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) lVar).gravity = 16;
        }
        return lVar;
    }

    @Override // androidx.appcompat.view.menu.i
    public final boolean a(androidx.appcompat.view.menu.k kVar) {
        return this.M.p(kVar, null, 0);
    }

    @Override // androidx.appcompat.widget.e1, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof l;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.e1
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ d1 generateDefaultLayoutParams() {
        return i();
    }

    @Override // androidx.appcompat.widget.e1
    /* JADX INFO: renamed from: f */
    public final d1 generateLayoutParams(AttributeSet attributeSet) {
        return new l(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.e1
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ d1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    @Override // androidx.appcompat.widget.e1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return i();
    }

    @Override // androidx.appcompat.widget.e1, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new l(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.M == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.j jVar = new androidx.appcompat.view.menu.j(context);
            this.M = jVar;
            jVar.e = new com.google.firebase.platforminfo.c((Object) this);
            j jVar2 = new j(context);
            this.P = jVar2;
            jVar2.H = true;
            jVar2.I = true;
            jVar2.B = new com.google.android.gms.common.internal.k(1);
            this.M.b(jVar2, this.N);
            j jVar3 = this.P;
            jVar3.D = this;
            this.M = jVar3.z;
        }
        return this.M;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        j jVar = this.P;
        i iVar = jVar.E;
        if (iVar != null) {
            return iVar.getDrawable();
        }
        if (jVar.G) {
            return jVar.F;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.O;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean k(int i) {
        boolean zA = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof k)) {
            zA = ((k) childAt).a();
        }
        return (i <= 0 || !(childAt2 instanceof k)) ? zA : ((k) childAt2).b() | zA;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        j jVar = this.P;
        if (jVar != null) {
            jVar.h();
            g gVar = this.P.O;
            if (gVar == null || !gVar.b()) {
                return;
            }
            this.P.f();
            this.P.i();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.P;
        if (jVar != null) {
            jVar.f();
            g gVar = jVar.P;
            if (gVar == null || !gVar.b()) {
                return;
            }
            gVar.i.dismiss();
        }
    }

    @Override // androidx.appcompat.widget.e1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.R) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = t2.a;
        boolean z3 = getLayoutDirection() == 1;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                l lVar = (l) childAt.getLayoutParams();
                if (lVar.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z3) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) lVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) lVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) lVar).leftMargin) + ((LinearLayout.LayoutParams) lVar).rightMargin;
                    k(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (z3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                l lVar2 = (l) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !lVar2.a) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) lVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) lVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            l lVar3 = (l) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !lVar3.a) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) lVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) lVar3).rightMargin + iMax + i18;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // androidx.appcompat.widget.e1, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        androidx.appcompat.view.menu.j jVar;
        boolean z = this.R;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.R = z2;
        if (z != z2) {
            this.S = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.R && (jVar = this.M) != null && size != this.S) {
            this.S = size;
            jVar.o(true);
        }
        int childCount = getChildCount();
        if (!this.R || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                l lVar = (l) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) lVar).rightMargin = 0;
                ((LinearLayout.LayoutParams) lVar).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i8 = size2 - paddingRight;
        int i9 = this.T;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = (i11 / i10) + i9;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i13 = 0;
        int iMax2 = 0;
        int i14 = 0;
        boolean z3 = false;
        int i15 = 0;
        long j = 0;
        while (true) {
            i3 = this.U;
            if (i14 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i14);
            int i16 = size3;
            int i17 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i5 = i12;
            } else {
                boolean z4 = childAt instanceof ActionMenuItemView;
                i13++;
                if (z4) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                l lVar2 = (l) childAt.getLayoutParams();
                lVar2.f = false;
                lVar2.c = 0;
                lVar2.b = 0;
                lVar2.d = false;
                ((LinearLayout.LayoutParams) lVar2).leftMargin = 0;
                ((LinearLayout.LayoutParams) lVar2).rightMargin = 0;
                lVar2.e = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i18 = lVar2.a ? 1 : i10;
                l lVar3 = (l) childAt.getLayoutParams();
                int i19 = i10;
                i5 = i12;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i17, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z4 ? (ActionMenuItemView) childAt : null;
                boolean z5 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z6 = z5;
                if (i18 <= 0 || (z5 && i18 < 2)) {
                    i6 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i5 * i18, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i6 = measuredWidth / i5;
                    if (measuredWidth % i5 != 0) {
                        i6++;
                    }
                    if (z6 && i6 < 2) {
                        i6 = 2;
                    }
                }
                lVar3.d = !lVar3.a && z6;
                lVar3.b = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i6);
                if (lVar2.d) {
                    i15++;
                }
                if (lVar2.a) {
                    z3 = true;
                }
                i10 = i19 - i6;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i6 == 1) {
                    j |= (long) (1 << i14);
                }
            }
            i14++;
            size3 = i16;
            paddingBottom = i17;
            i12 = i5;
        }
        int i20 = size3;
        int i21 = i10;
        int i22 = i12;
        boolean z7 = z3 && i13 == 2;
        int i23 = i21;
        boolean z8 = false;
        while (true) {
            if (i15 <= 0 || i23 <= 0) {
                i4 = iMax;
                break;
            }
            int i24 = Integer.MAX_VALUE;
            long j2 = 0;
            int i25 = 0;
            int i26 = 0;
            while (i26 < childCount2) {
                int i27 = iMax;
                l lVar4 = (l) getChildAt(i26).getLayoutParams();
                boolean z9 = z7;
                if (lVar4.d) {
                    int i28 = lVar4.b;
                    if (i28 < i24) {
                        j2 = 1 << i26;
                        i24 = i28;
                        i25 = 1;
                    } else if (i28 == i24) {
                        j2 |= 1 << i26;
                        i25++;
                    }
                }
                i26++;
                z7 = z9;
                iMax = i27;
            }
            i4 = iMax;
            boolean z10 = z7;
            j |= j2;
            if (i25 > i23) {
                break;
            }
            int i29 = i24 + 1;
            int i30 = 0;
            while (i30 < childCount2) {
                View childAt2 = getChildAt(i30);
                l lVar5 = (l) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i30;
                if ((j2 & j3) != 0) {
                    if (z10 && lVar5.e) {
                        r11 = 1;
                        r11 = 1;
                        if (i23 == 1) {
                            childAt2.setPadding(i3 + i22, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    lVar5.b += r11;
                    lVar5.f = r11;
                    i23--;
                } else if (lVar5.b == i29) {
                    j |= j3;
                }
                i30++;
                z3 = z11;
            }
            z7 = z10;
            iMax = i4;
            z8 = true;
        }
        boolean z12 = !z3 && i13 == 1;
        if (i23 > 0 && j != 0 && (i23 < i13 - 1 || z12 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j);
            if (!z12) {
                if ((j & 1) != 0 && !((l) getChildAt(0).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
                int i31 = childCount2 - 1;
                if ((j & ((long) (1 << i31))) != 0 && !((l) getChildAt(i31).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
            }
            int i32 = fBitCount > 0.0f ? (int) ((i23 * i22) / fBitCount) : 0;
            boolean z13 = z8;
            for (int i33 = 0; i33 < childCount2; i33++) {
                if ((j & ((long) (1 << i33))) != 0) {
                    View childAt3 = getChildAt(i33);
                    l lVar6 = (l) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        lVar6.c = i32;
                        lVar6.f = true;
                        if (i33 == 0 && !lVar6.e) {
                            ((LinearLayout.LayoutParams) lVar6).leftMargin = (-i32) / 2;
                        }
                        z13 = true;
                    } else if (lVar6.a) {
                        lVar6.c = i32;
                        lVar6.f = true;
                        ((LinearLayout.LayoutParams) lVar6).rightMargin = (-i32) / 2;
                        z13 = true;
                    } else {
                        if (i33 != 0) {
                            ((LinearLayout.LayoutParams) lVar6).leftMargin = i32 / 2;
                        }
                        if (i33 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) lVar6).rightMargin = i32 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i34 = 0; i34 < childCount2; i34++) {
                View childAt4 = getChildAt(i34);
                l lVar7 = (l) childAt4.getLayoutParams();
                if (lVar7.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((lVar7.b * i22) + lVar7.c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i20);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.P.M = z;
    }

    public void setOnMenuItemClickListener(m mVar) {
        this.V = mVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        j jVar = this.P;
        i iVar = jVar.E;
        if (iVar != null) {
            iVar.setImageDrawable(drawable);
        } else {
            jVar.G = true;
            jVar.F = drawable;
        }
    }

    public void setPopupTheme(int i) {
        if (this.O != i) {
            this.O = i;
            if (i == 0) {
                this.N = getContext();
            } else {
                this.N = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(j jVar) {
        this.P = jVar;
        jVar.D = this;
        this.M = jVar.z;
    }

    @Override // androidx.appcompat.widget.e1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public void setOverflowReserved(boolean z) {
    }
}
