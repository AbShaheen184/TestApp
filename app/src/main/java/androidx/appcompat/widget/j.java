package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import com.app.mlounge.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements androidx.appcompat.view.menu.p {
    public final LayoutInflater A;
    public androidx.appcompat.view.menu.o B;
    public ActionMenuView D;
    public i E;
    public Drawable F;
    public boolean G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public g O;
    public g P;
    public com.google.common.util.concurrent.l0 Q;
    public h R;
    public final Context e;
    public Context y;
    public androidx.appcompat.view.menu.j z;
    public final int C = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray N = new SparseBooleanArray();
    public final com.app.mlounge.data.music.e S = new com.app.mlounge.data.music.e(this, 2);

    public j(Context context) {
        this.e = context;
        this.A = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.p
    public final boolean a() {
        int size;
        ArrayList arrayListK;
        int i;
        boolean z;
        j jVar = this;
        androidx.appcompat.view.menu.j jVar2 = jVar.z;
        if (jVar2 != null) {
            arrayListK = jVar2.k();
            size = arrayListK.size();
        } else {
            size = 0;
            arrayListK = null;
        }
        int i2 = jVar.L;
        int i3 = jVar.K;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ActionMenuView actionMenuView = jVar.D;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            androidx.appcompat.view.menu.k kVar = (androidx.appcompat.view.menu.k) arrayListK.get(i4);
            int i7 = kVar.y;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (jVar.M && kVar.B) {
                i2 = 0;
            }
            i4++;
        }
        if (jVar.H && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = jVar.N;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            androidx.appcompat.view.menu.k kVar2 = (androidx.appcompat.view.menu.k) arrayListK.get(i9);
            int i11 = kVar2.y;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = kVar2.b;
            if (z3) {
                View viewD = jVar.d(kVar2, null, actionMenuView);
                viewD.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewD.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                kVar2.d(z);
            } else {
                if ((i11 & 1) == z) {
                    boolean z4 = sparseBooleanArray.get(i12);
                    boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                    if (z5) {
                        View viewD2 = jVar.d(kVar2, null, actionMenuView);
                        viewD2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewD2.getMeasuredWidth();
                        i3 -= measuredWidth2;
                        if (i10 == 0) {
                            i10 = measuredWidth2;
                        }
                        z5 &= i3 + i10 > 0;
                    }
                    if (z5 && i12 != 0) {
                        sparseBooleanArray.put(i12, true);
                    } else if (z4) {
                        sparseBooleanArray.put(i12, false);
                        for (int i13 = 0; i13 < i9; i13++) {
                            androidx.appcompat.view.menu.k kVar3 = (androidx.appcompat.view.menu.k) arrayListK.get(i13);
                            if (kVar3.b == i12) {
                                if ((kVar3.x & 32) == 32) {
                                    i8++;
                                }
                                kVar3.d(false);
                            }
                        }
                    }
                    if (z5) {
                        i8--;
                    }
                    kVar2.d(z5);
                } else {
                    kVar2.d(false);
                }
                i9++;
                i = 2;
                jVar = this;
                z = true;
            }
            i9++;
            i = 2;
            jVar = this;
            z = true;
        }
        return z;
    }

    @Override // androidx.appcompat.view.menu.p
    public final void b(androidx.appcompat.view.menu.j jVar, boolean z) {
        f();
        g gVar = this.P;
        if (gVar != null && gVar.b()) {
            gVar.i.dismiss();
        }
        androidx.appcompat.view.menu.o oVar = this.B;
        if (oVar != null) {
            oVar.b(jVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public final void c(androidx.appcompat.view.menu.o oVar) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View d(androidx.appcompat.view.menu.k kVar, View view, ActionMenuView actionMenuView) {
        View view2 = kVar.z;
        View view3 = view2 != null ? view2 : null;
        if (view3 == null || ((kVar.y & 8) != 0 && view2 != null)) {
            androidx.appcompat.view.menu.q qVar = view instanceof androidx.appcompat.view.menu.q ? (androidx.appcompat.view.menu.q) view : (androidx.appcompat.view.menu.q) this.A.inflate(this.C, (ViewGroup) actionMenuView, false);
            qVar.c(kVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) qVar;
            actionMenuItemView.setItemInvoker(this.D);
            if (this.R == null) {
                this.R = new h(this);
            }
            actionMenuItemView.setPopupCallback(this.R);
            view3 = (View) qVar;
        }
        view3.setVisibility(kVar.B ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        actionMenuView.getClass();
        if (!(layoutParams instanceof l)) {
            view3.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return view3;
    }

    @Override // androidx.appcompat.view.menu.p
    public final boolean e(androidx.appcompat.view.menu.k kVar) {
        return false;
    }

    public final boolean f() {
        ActionMenuView actionMenuView;
        com.google.common.util.concurrent.l0 l0Var = this.Q;
        if (l0Var != null && (actionMenuView = this.D) != null) {
            actionMenuView.removeCallbacks(l0Var);
            this.Q = null;
            return true;
        }
        g gVar = this.O;
        if (gVar == null) {
            return false;
        }
        if (gVar.b()) {
            gVar.i.dismiss();
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.p
    public final void g(Context context, androidx.appcompat.view.menu.j jVar) {
        this.y = context;
        LayoutInflater.from(context);
        this.z = jVar;
        Resources resources = context.getResources();
        if (!this.I) {
            this.H = true;
        }
        int i = 2;
        this.J = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.L = i;
        int measuredWidth = this.J;
        if (this.H) {
            if (this.E == null) {
                i iVar = new i(this, this.e);
                this.E = iVar;
                if (this.G) {
                    iVar.setImageDrawable(this.F);
                    this.F = null;
                    this.G = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.E.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.E.getMeasuredWidth();
        } else {
            this.E = null;
        }
        this.K = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.p
    public final void h() {
        int i;
        ActionMenuView actionMenuView = this.D;
        ArrayList arrayList = null;
        boolean z = false;
        if (actionMenuView != null) {
            androidx.appcompat.view.menu.j jVar = this.z;
            if (jVar != null) {
                jVar.i();
                ArrayList arrayListK = this.z.k();
                int size = arrayListK.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    androidx.appcompat.view.menu.k kVar = (androidx.appcompat.view.menu.k) arrayListK.get(i2);
                    if ((kVar.x & 32) == 32) {
                        View childAt = actionMenuView.getChildAt(i);
                        androidx.appcompat.view.menu.k itemData = childAt instanceof androidx.appcompat.view.menu.q ? ((androidx.appcompat.view.menu.q) childAt).getItemData() : null;
                        View viewD = d(kVar, childAt, actionMenuView);
                        if (kVar != itemData) {
                            viewD.setPressed(false);
                            viewD.jumpDrawablesToCurrentState();
                        }
                        if (viewD != childAt) {
                            ViewGroup viewGroup = (ViewGroup) viewD.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(viewD);
                            }
                            this.D.addView(viewD, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < actionMenuView.getChildCount()) {
                if (actionMenuView.getChildAt(i) == this.E) {
                    i++;
                } else {
                    actionMenuView.removeViewAt(i);
                }
            }
        }
        this.D.requestLayout();
        androidx.appcompat.view.menu.j jVar2 = this.z;
        if (jVar2 != null) {
            jVar2.i();
            ArrayList arrayList2 = jVar2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((androidx.appcompat.view.menu.k) arrayList2.get(i3)).getClass();
            }
        }
        androidx.appcompat.view.menu.j jVar3 = this.z;
        if (jVar3 != null) {
            jVar3.i();
            arrayList = jVar3.j;
        }
        if (this.H && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((androidx.appcompat.view.menu.k) arrayList.get(0)).B;
            } else if (size3 > 0) {
                z = true;
            }
        }
        i iVar = this.E;
        if (z) {
            if (iVar == null) {
                this.E = new i(this, this.e);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.E.getParent();
            if (viewGroup2 != this.D) {
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.E);
                }
                ActionMenuView actionMenuView2 = this.D;
                i iVar2 = this.E;
                actionMenuView2.getClass();
                l lVarI = ActionMenuView.i();
                lVarI.a = true;
                actionMenuView2.addView(iVar2, lVarI);
            }
        } else if (iVar != null) {
            ViewParent parent = iVar.getParent();
            ActionMenuView actionMenuView3 = this.D;
            if (parent == actionMenuView3) {
                actionMenuView3.removeView(this.E);
            }
        }
        this.D.setOverflowReserved(this.H);
    }

    public final boolean i() {
        androidx.appcompat.view.menu.j jVar;
        if (!this.H) {
            return false;
        }
        g gVar = this.O;
        if ((gVar != null && gVar.b()) || (jVar = this.z) == null || this.D == null || this.Q != null) {
            return false;
        }
        jVar.i();
        if (jVar.j.isEmpty()) {
            return false;
        }
        com.google.common.util.concurrent.l0 l0Var = new com.google.common.util.concurrent.l0(1, this, new g(this, this.y, this.z, this.E), false);
        this.Q = l0Var;
        this.D.post(l0Var);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.p
    public final boolean j(androidx.appcompat.view.menu.t tVar) {
        boolean z;
        if (tVar.hasVisibleItems()) {
            androidx.appcompat.view.menu.t tVar2 = tVar;
            while (true) {
                androidx.appcompat.view.menu.j jVar = tVar2.w;
                if (jVar == this.z) {
                    break;
                }
                tVar2 = (androidx.appcompat.view.menu.t) jVar;
            }
            androidx.appcompat.view.menu.k kVar = tVar2.x;
            ActionMenuView actionMenuView = this.D;
            View view = null;
            view = null;
            if (actionMenuView != null) {
                int childCount = actionMenuView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = actionMenuView.getChildAt(i);
                    if ((childAt instanceof androidx.appcompat.view.menu.q) && ((androidx.appcompat.view.menu.q) childAt).getItemData() == kVar) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                tVar.x.getClass();
                int size = tVar.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = tVar.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                g gVar = new g(this, this.y, tVar, view);
                this.P = gVar;
                gVar.g = z;
                androidx.appcompat.view.menu.l lVar = gVar.i;
                if (lVar != null) {
                    lVar.o(z);
                }
                g gVar2 = this.P;
                if (!gVar2.b()) {
                    if (gVar2.e == null) {
                        net.luminis.tls.engine.impl.c.r("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    gVar2.d(0, 0, false, false);
                }
                androidx.appcompat.view.menu.o oVar = this.B;
                if (oVar != null) {
                    oVar.m(tVar);
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.p
    public final boolean k(androidx.appcompat.view.menu.k kVar) {
        return false;
    }
}
