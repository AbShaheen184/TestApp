package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.foundation.text.selection.s0;
import androidx.core.view.t0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class j implements Menu {
    public static final int[] v = {1, 4, 5, 3, 2, 0};
    public final Context a;
    public final Resources b;
    public boolean c;
    public final boolean d;
    public com.google.firebase.platforminfo.c e;
    public final ArrayList f;
    public final ArrayList g;
    public boolean h;
    public final ArrayList i;
    public final ArrayList j;
    public boolean k;
    public CharSequence l;
    public View m;
    public k t;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean q = false;
    public final ArrayList r = new ArrayList();
    public final CopyOnWriteArrayList s = new CopyOnWriteArrayList();
    public boolean u = false;

    public j(Context context) {
        boolean zW;
        boolean z = false;
        this.a = context;
        Resources resources = context.getResources();
        this.b = resources;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = true;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = t0.a;
            if (Build.VERSION.SDK_INT >= 28) {
                zW = s0.w(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zW = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zW) {
                z = true;
            }
        }
        this.d = z;
    }

    public final k a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            net.luminis.tls.engine.impl.c.o("order does not contain a valid category.");
            return null;
        }
        int i6 = (v[i5] << 16) | (65535 & i3);
        k kVar = new k(this, i, i2, i3, i6, charSequence);
        ArrayList arrayList = this.f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((k) arrayList.get(size)).d <= i6) {
                i4 = size + 1;
                arrayList.add(i4, kVar);
                o(true);
                return kVar;
            }
        }
        i4 = 0;
        arrayList.add(i4, kVar);
        o(true);
        return kVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            k kVarA = a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            kVarA.setIcon(resolveInfo.loadIcon(packageManager));
            kVarA.g = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = kVarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        k kVarA = a(i, i2, i3, charSequence);
        t tVar = new t(this.a, this, kVarA);
        kVarA.o = tVar;
        tVar.setHeaderTitle(kVarA.e);
        return tVar;
    }

    public final void b(p pVar, Context context) {
        this.s.add(new WeakReference(pVar));
        pVar.g(context, this);
        this.k = true;
    }

    public final void c(boolean z) {
        if (this.q) {
            return;
        }
        this.q = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.s;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            p pVar = (p) weakReference.get();
            if (pVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                pVar.b(this, z);
            }
        }
        this.q = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        k kVar = this.t;
        if (kVar != null) {
            d(kVar);
        }
        this.f.clear();
        o(true);
    }

    public final void clearHeader() {
        this.l = null;
        o(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(k kVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.s;
        boolean zE = false;
        if (!copyOnWriteArrayList.isEmpty() && this.t == kVar) {
            s();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                p pVar = (p) weakReference.get();
                if (pVar != null) {
                    zE = pVar.e(kVar);
                    if (zE) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            r();
            if (zE) {
                this.t = null;
            }
        }
        return zE;
    }

    public boolean e(j jVar, MenuItem menuItem) {
        androidx.appcompat.widget.m mVar;
        com.google.firebase.platforminfo.c cVar = this.e;
        return (cVar == null || (mVar = ((ActionMenuView) cVar.e).V) == null || !((Toolbar) ((com.google.firebase.platforminfo.c) mVar).e).g0.a()) ? false : true;
    }

    public boolean f(k kVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.s;
        boolean zK = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        s();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            p pVar = (p) weakReference.get();
            if (pVar != null) {
                zK = pVar.k(kVar);
                if (zK) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        r();
        if (zK) {
            this.t = kVar;
        }
        return zK;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            k kVar = (k) arrayList.get(i2);
            if (kVar.a == i) {
                return kVar;
            }
            if (kVar.hasSubMenu() && (menuItemFindItem = kVar.o.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final k g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.r;
        arrayList.clear();
        h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (k) arrayList.get(0);
        }
        boolean zM = m();
        for (int i2 = 0; i2 < size; i2++) {
            k kVar = (k) arrayList.get(i2);
            char c = zM ? kVar.j : kVar.h;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zM && c == '\b' && i == 67))) {
                return kVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f.get(i);
    }

    public final void h(List list, int i, KeyEvent keyEvent) {
        boolean zM = m();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList = this.f;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                k kVar = (k) arrayList.get(i2);
                if (kVar.hasSubMenu()) {
                    kVar.o.h(list, i, keyEvent);
                }
                char c = zM ? kVar.j : kVar.h;
                if ((modifiers & 69647) == ((zM ? kVar.k : kVar.i) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (zM && c == '\b' && i == 67)) && kVar.isEnabled()) {
                        list.add(kVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((k) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListK = k();
        if (this.k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.s;
            boolean zA = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                p pVar = (p) weakReference.get();
                if (pVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zA |= pVar.a();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.j;
            if (zA) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListK.size();
                for (int i = 0; i < size; i++) {
                    k kVar = (k) arrayListK.get(i);
                    if ((kVar.x & 32) == 32) {
                        arrayList.add(kVar);
                    } else {
                        arrayList2.add(kVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(k());
            }
            this.k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public final ArrayList k() {
        boolean z = this.h;
        ArrayList arrayList = this.g;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            k kVar = (k) arrayList2.get(i);
            if (kVar.isVisible()) {
                arrayList.add(kVar);
            }
        }
        this.h = false;
        this.k = true;
        return arrayList;
    }

    public boolean l() {
        return this.u;
    }

    public boolean m() {
        return this.c;
    }

    public boolean n() {
        return this.d;
    }

    public final void o(boolean z) {
        if (this.n) {
            this.o = true;
            if (z) {
                this.p = true;
                return;
            }
            return;
        }
        if (z) {
            this.h = true;
            this.k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.s;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        s();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            p pVar = (p) weakReference.get();
            if (pVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                pVar.h();
            }
        }
        r();
    }

    public final boolean p(MenuItem menuItem, l lVar, int i) {
        boolean zExpandActionView;
        k kVar = (k) menuItem;
        boolean zJ = false;
        if (kVar == null || !kVar.isEnabled()) {
            return false;
        }
        j jVar = kVar.n;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = kVar.p;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(kVar)) && !jVar.e(jVar, kVar)) {
            Intent intent = kVar.g;
            if (intent != null) {
                try {
                    jVar.a.startActivity(intent);
                    zExpandActionView = true;
                } catch (ActivityNotFoundException e) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                    zExpandActionView = false;
                }
            }
            zExpandActionView = false;
        } else {
            zExpandActionView = true;
        }
        if ((kVar.y & 8) != 0 && kVar.z != null) {
            zExpandActionView |= kVar.expandActionView();
            if (zExpandActionView) {
                c(true);
            }
        } else if (kVar.hasSubMenu()) {
            if ((i & 4) == 0) {
                c(false);
            }
            if (!kVar.hasSubMenu()) {
                t tVar = new t(this.a, this, kVar);
                kVar.o = tVar;
                tVar.setHeaderTitle(kVar.e);
            }
            t tVar2 = kVar.o;
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.s;
            if (!copyOnWriteArrayList.isEmpty()) {
                zJ = lVar != null ? lVar.j(tVar2) : false;
                for (WeakReference weakReference : copyOnWriteArrayList) {
                    p pVar = (p) weakReference.get();
                    if (pVar == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zJ) {
                        zJ = pVar.j(tVar2);
                    }
                }
            }
            zExpandActionView |= zJ;
            if (!zExpandActionView) {
                c(true);
            }
        } else if ((i & 1) == 0) {
            c(true);
        }
        return zExpandActionView;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return p(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        k kVarG = g(i, keyEvent);
        boolean zP = kVarG != null ? p(kVarG, null, i2) : false;
        if ((i2 & 2) != 0) {
            c(true);
        }
        return zP;
    }

    public final void q(int i, CharSequence charSequence, int i2, View view) {
        if (view != null) {
            this.m = view;
            this.l = null;
        } else {
            if (i > 0) {
                this.l = this.b.getText(i);
            } else if (charSequence != null) {
                this.l = charSequence;
            }
            if (i2 > 0) {
                this.a.getDrawable(i2);
            }
        }
        o(false);
    }

    public final void r() {
        this.n = false;
        if (this.o) {
            this.o = false;
            o(this.p);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((k) arrayList.get(i3)).b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((k) arrayList.get(i3)).b != i) {
                    break;
                }
                if (i3 >= 0 && i3 < arrayList.size()) {
                    arrayList.remove(i3);
                }
                i2 = i4;
            }
            o(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((k) arrayList.get(i2)).a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i2);
        o(true);
    }

    public final void s() {
        if (this.n) {
            return;
        }
        this.n = true;
        this.o = false;
        this.p = false;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            k kVar = (k) arrayList.get(i2);
            if (kVar.b == i) {
                kVar.x = (kVar.x & (-5)) | (z2 ? 4 : 0);
                kVar.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.u = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            k kVar = (k) arrayList.get(i2);
            if (kVar.b == i) {
                kVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            k kVar = (k) arrayList.get(i2);
            if (kVar.b == i) {
                int i3 = kVar.x;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                kVar.x = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            o(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.c = z;
        o(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.b.getString(i4));
    }

    public j j() {
        return this;
    }
}
