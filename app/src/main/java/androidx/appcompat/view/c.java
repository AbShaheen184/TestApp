package androidx.appcompat.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.k;
import java.lang.reflect.Constructor;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public CharSequence A;
    public final /* synthetic */ d D;
    public final Menu a;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public CharSequence z;
    public ColorStateList B = null;
    public PorterDuff.Mode C = null;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public boolean f = true;
    public boolean g = true;

    public c(d dVar, Menu menu) {
        this.D = dVar;
        this.a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.D.c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        d dVar = this.D;
        Context context = dVar.c;
        boolean z = false;
        menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
        int i = this.v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.y != null) {
            if (context.isRestricted()) {
                net.luminis.tls.engine.impl.c.r("The android:onClick attribute cannot be used within a restricted context");
                return;
            }
            if (dVar.d == null) {
                dVar.d = d.a(context);
            }
            Object obj = dVar.d;
            String str = this.y;
            b bVar = new b();
            bVar.a = obj;
            Class<?> cls = obj.getClass();
            try {
                bVar.b = cls.getMethod(str, b.c);
                menuItem.setOnMenuItemClickListener(bVar);
            } catch (Exception e) {
                StringBuilder sbX = androidx.privacysandbox.ads.adservices.java.internal.a.x("Couldn't resolve menu item onClick handler ", str, " in class ");
                sbX.append(cls.getName());
                InflateException inflateException = new InflateException(sbX.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.r >= 2 && (menuItem instanceof k)) {
            k kVar = (k) menuItem;
            kVar.x = (kVar.x & (-5)) | 4;
        }
        String str2 = this.x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, d.e, dVar.a));
            z = true;
        }
        int i2 = this.w;
        if (i2 > 0) {
            if (z) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        CharSequence charSequence = this.z;
        boolean z2 = menuItem instanceof k;
        if (z2) {
            ((k) menuItem).c(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            com.google.android.gms.common.wrappers.a.j(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.A;
        if (z2) {
            ((k) menuItem).e(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            com.google.android.gms.common.wrappers.a.o(menuItem, charSequence2);
        }
        char c = this.n;
        int i3 = this.o;
        if (z2) {
            ((k) menuItem).setAlphabeticShortcut(c, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            com.google.android.gms.common.wrappers.a.i(menuItem, c, i3);
        }
        char c2 = this.p;
        int i4 = this.q;
        if (z2) {
            ((k) menuItem).setNumericShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            com.google.android.gms.common.wrappers.a.n(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.C;
        if (mode != null) {
            if (z2) {
                ((k) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                com.google.android.gms.common.wrappers.a.l(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.B;
        if (colorStateList != null) {
            if (z2) {
                ((k) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                com.google.android.gms.common.wrappers.a.k(menuItem, colorStateList);
            }
        }
    }
}
