package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.q1;
import androidx.appcompat.widget.r1;
import androidx.appcompat.widget.z;
import com.app.mlounge.R;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends l implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final h A;
    public final boolean B;
    public final int C;
    public final int D;
    public final r1 E;
    public final c F;
    public final d G;
    public PopupWindow.OnDismissListener H;
    public View I;
    public View J;
    public o K;
    public ViewTreeObserver L;
    public boolean M;
    public boolean N;
    public int O;
    public int P = 0;
    public boolean Q;
    public final Context y;
    public final j z;

    public s(Context context, j jVar, View view, int i, boolean z) {
        int i2 = 1;
        this.F = new c(this, i2);
        this.G = new d(this, i2);
        this.y = context;
        this.z = jVar;
        this.B = z;
        this.A = new h(jVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.D = i;
        Resources resources = context.getResources();
        this.C = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.I = view;
        this.E = new r1(context, i);
        jVar.b(this, context);
    }

    @Override // androidx.appcompat.view.menu.p
    public final boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.p
    public final void b(j jVar, boolean z) {
        if (jVar != this.z) {
            return;
        }
        dismiss();
        o oVar = this.K;
        if (oVar != null) {
            oVar.b(jVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public final void c(o oVar) {
        this.K = oVar;
    }

    @Override // androidx.appcompat.view.menu.r
    public final boolean d() {
        return !this.M && this.E.S.isShowing();
    }

    @Override // androidx.appcompat.view.menu.r
    public final void dismiss() {
        if (d()) {
            this.E.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.r
    public final void f() {
        View view;
        if (d()) {
            return;
        }
        if (this.M || (view = this.I) == null) {
            net.luminis.tls.engine.impl.c.r("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.J = view;
        r1 r1Var = this.E;
        z zVar = r1Var.S;
        z zVar2 = r1Var.S;
        zVar.setOnDismissListener(this);
        r1Var.J = this;
        r1Var.R = true;
        zVar2.setFocusable(true);
        View view2 = this.J;
        boolean z = this.L == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.L = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.F);
        }
        view2.addOnAttachStateChangeListener(this.G);
        r1Var.I = view2;
        r1Var.G = this.P;
        boolean z2 = this.N;
        Context context = this.y;
        h hVar = this.A;
        if (!z2) {
            this.O = l.m(hVar, context, this.C);
            this.N = true;
        }
        int i = this.O;
        Rect rect = r1Var.P;
        Drawable background = zVar2.getBackground();
        if (background != null) {
            background.getPadding(rect);
            r1Var.A = rect.left + rect.right + i;
        } else {
            r1Var.A = i;
        }
        zVar2.setInputMethodMode(2);
        Rect rect2 = this.e;
        r1Var.Q = rect2 != null ? new Rect(rect2) : null;
        r1Var.f();
        q1 q1Var = r1Var.z;
        q1Var.setOnKeyListener(this);
        if (this.Q) {
            j jVar = this.z;
            if (jVar.l != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) q1Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(jVar.l);
                }
                frameLayout.setEnabled(false);
                q1Var.addHeaderView(frameLayout, null, false);
            }
        }
        r1Var.a(hVar);
        r1Var.f();
    }

    @Override // androidx.appcompat.view.menu.p
    public final void h() {
        this.N = false;
        h hVar = this.A;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.r
    public final ListView i() {
        return this.E.z;
    }

    @Override // androidx.appcompat.view.menu.p
    public final boolean j(t tVar) {
        boolean z;
        if (tVar.hasVisibleItems()) {
            n nVar = new n(this.y, tVar, this.J, this.B, this.D, 0);
            o oVar = this.K;
            nVar.h = oVar;
            l lVar = nVar.i;
            if (lVar != null) {
                lVar.c(oVar);
            }
            int size = tVar.f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = tVar.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            nVar.g = z;
            l lVar2 = nVar.i;
            if (lVar2 != null) {
                lVar2.o(z);
            }
            nVar.j = this.H;
            this.H = null;
            this.z.c(false);
            r1 r1Var = this.E;
            int width = r1Var.B;
            int i2 = !r1Var.D ? 0 : r1Var.C;
            if ((Gravity.getAbsoluteGravity(this.P, this.I.getLayoutDirection()) & 7) == 5) {
                width += this.I.getWidth();
            }
            if (!nVar.b()) {
                if (nVar.e != null) {
                    nVar.d(width, i2, true, true);
                }
            }
            o oVar2 = this.K;
            if (oVar2 != null) {
                oVar2.m(tVar);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.l
    public final void n(View view) {
        this.I = view;
    }

    @Override // androidx.appcompat.view.menu.l
    public final void o(boolean z) {
        this.A.c = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.M = true;
        this.z.c(true);
        ViewTreeObserver viewTreeObserver = this.L;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.L = this.J.getViewTreeObserver();
            }
            this.L.removeGlobalOnLayoutListener(this.F);
            this.L = null;
        }
        this.J.removeOnAttachStateChangeListener(this.G);
        PopupWindow.OnDismissListener onDismissListener = this.H;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.l
    public final void p(int i) {
        this.P = i;
    }

    @Override // androidx.appcompat.view.menu.l
    public final void q(int i) {
        this.E.B = i;
    }

    @Override // androidx.appcompat.view.menu.l
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.H = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.l
    public final void s(boolean z) {
        this.Q = z;
    }

    @Override // androidx.appcompat.view.menu.l
    public final void t(int i) {
        r1 r1Var = this.E;
        r1Var.C = i;
        r1Var.D = true;
    }

    @Override // androidx.appcompat.view.menu.l
    public final void l(j jVar) {
    }
}
