package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h2 implements androidx.appcompat.view.menu.p {
    public androidx.appcompat.view.menu.j e;
    public androidx.appcompat.view.menu.k y;
    public final /* synthetic */ Toolbar z;

    public h2(Toolbar toolbar) {
        this.z = toolbar;
    }

    @Override // androidx.appcompat.view.menu.p
    public final boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.p
    public final boolean e(androidx.appcompat.view.menu.k kVar) {
        Toolbar toolbar = this.z;
        toolbar.removeView(toolbar.F);
        toolbar.removeView(toolbar.E);
        toolbar.F = null;
        ArrayList arrayList = toolbar.e0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.y = null;
        toolbar.requestLayout();
        kVar.B = false;
        kVar.n.o(false);
        toolbar.s();
        return true;
    }

    @Override // androidx.appcompat.view.menu.p
    public final void g(Context context, androidx.appcompat.view.menu.j jVar) {
        androidx.appcompat.view.menu.k kVar;
        androidx.appcompat.view.menu.j jVar2 = this.e;
        if (jVar2 != null && (kVar = this.y) != null) {
            jVar2.d(kVar);
        }
        this.e = jVar;
    }

    @Override // androidx.appcompat.view.menu.p
    public final void h() {
        if (this.y != null) {
            androidx.appcompat.view.menu.j jVar = this.e;
            if (jVar != null) {
                int size = jVar.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.e.getItem(i) == this.y) {
                        return;
                    }
                }
            }
            e(this.y);
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public final boolean j(androidx.appcompat.view.menu.t tVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.p
    public final boolean k(androidx.appcompat.view.menu.k kVar) {
        Toolbar toolbar = this.z;
        toolbar.c();
        ViewParent parent = toolbar.E.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.E);
            }
            toolbar.addView(toolbar.E);
        }
        View view = kVar.z;
        if (view == null) {
            view = null;
        }
        toolbar.F = view;
        this.y = kVar;
        ViewParent parent2 = view.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.F);
            }
            i2 i2VarG = Toolbar.g();
            i2VarG.a = (toolbar.K & Token.ASSIGN_MOD) | 8388611;
            i2VarG.b = 2;
            toolbar.F.setLayoutParams(i2VarG);
            toolbar.addView(toolbar.F);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((i2) childAt.getLayoutParams()).b != 2 && childAt != toolbar.e) {
                toolbar.removeViewAt(childCount);
                toolbar.e0.add(childAt);
            }
        }
        toolbar.requestLayout();
        kVar.B = true;
        kVar.n.o(false);
        toolbar.s();
        return true;
    }

    @Override // androidx.appcompat.view.menu.p
    public final void b(androidx.appcompat.view.menu.j jVar, boolean z) {
    }
}
