package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends j implements SubMenu {
    public final j w;
    public final k x;

    public t(Context context, j jVar, k kVar) {
        super(context);
        this.w = jVar;
        this.x = kVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean d(k kVar) {
        return this.w.d(kVar);
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean e(j jVar, MenuItem menuItem) {
        return super.e(jVar, menuItem) || this.w.e(jVar, menuItem);
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean f(k kVar) {
        return this.w.f(kVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.x;
    }

    @Override // androidx.appcompat.view.menu.j
    public final j j() {
        return this.w.j();
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean l() {
        return this.w.l();
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean m() {
        return this.w.m();
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean n() {
        return this.w.n();
    }

    @Override // androidx.appcompat.view.menu.j, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.w.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        q(0, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        q(0, charSequence, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        q(0, null, 0, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.x.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.j, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.w.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        q(0, null, i, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        q(i, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.x.setIcon(i);
        return this;
    }
}
