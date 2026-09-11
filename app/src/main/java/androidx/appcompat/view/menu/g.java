package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.o1;
import androidx.appcompat.widget.p1;
import androidx.appcompat.widget.q1;
import androidx.appcompat.widget.r1;
import androidx.appcompat.widget.z;
import com.app.mlounge.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends l implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public final int A;
    public final boolean B;
    public final Handler C;
    public final c F;
    public final d G;
    public View K;
    public View L;
    public int M;
    public boolean N;
    public boolean O;
    public int P;
    public int Q;
    public boolean S;
    public o T;
    public ViewTreeObserver U;
    public PopupWindow.OnDismissListener V;
    public boolean W;
    public final Context y;
    public final int z;
    public final ArrayList D = new ArrayList();
    public final ArrayList E = new ArrayList();
    public final com.google.firebase.platforminfo.c H = new com.google.firebase.platforminfo.c(this);
    public int I = 0;
    public int J = 0;
    public boolean R = false;

    public g(Context context, View view, int i, boolean z) {
        int i2 = 0;
        this.F = new c(this, i2);
        this.G = new d(this, i2);
        this.y = context;
        this.K = view;
        this.A = i;
        this.B = z;
        this.M = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.z = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.C = new Handler();
    }

    @Override // androidx.appcompat.view.menu.p
    public final boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.p
    public final void b(j jVar, boolean z) {
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (jVar == ((f) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((f) arrayList.get(i2)).b.c(false);
        }
        f fVar = (f) arrayList.remove(i);
        j jVar2 = fVar.b;
        r1 r1Var = fVar.a;
        z zVar = r1Var.S;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = jVar2.s;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            p pVar = (p) weakReference.get();
            if (pVar == null || pVar == this) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        if (this.W) {
            o1.b(zVar, null);
            zVar.setAnimationStyle(0);
        }
        r1Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.M = ((f) arrayList.get(size2 - 1)).c;
        } else {
            this.M = this.K.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((f) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        o oVar = this.T;
        if (oVar != null) {
            oVar.b(jVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.U;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.U.removeGlobalOnLayoutListener(this.F);
            }
            this.U = null;
        }
        this.L.removeOnAttachStateChangeListener(this.G);
        this.V.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.p
    public final void c(o oVar) {
        this.T = oVar;
    }

    @Override // androidx.appcompat.view.menu.r
    public final boolean d() {
        ArrayList arrayList = this.E;
        return arrayList.size() > 0 && ((f) arrayList.get(0)).a.S.isShowing();
    }

    @Override // androidx.appcompat.view.menu.r
    public final void dismiss() {
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        if (size > 0) {
            f[] fVarArr = (f[]) arrayList.toArray(new f[size]);
            for (int i = size - 1; i >= 0; i--) {
                f fVar = fVarArr[i];
                if (fVar.a.S.isShowing()) {
                    fVar.a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.r
    public final void f() {
        if (d()) {
            return;
        }
        ArrayList arrayList = this.D;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u((j) it.next());
        }
        arrayList.clear();
        View view = this.K;
        this.L = view;
        if (view != null) {
            boolean z = this.U == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.U = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.F);
            }
            this.L.addOnAttachStateChangeListener(this.G);
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public final void h() {
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((f) it.next()).a.z.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((h) adapter).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.r
    public final ListView i() {
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((f) androidx.privacysandbox.ads.adservices.java.internal.a.j(1, arrayList)).a.z;
    }

    @Override // androidx.appcompat.view.menu.p
    public final boolean j(t tVar) {
        for (f fVar : this.E) {
            if (tVar == fVar.b) {
                fVar.a.z.requestFocus();
                return true;
            }
        }
        if (!tVar.hasVisibleItems()) {
            return false;
        }
        l(tVar);
        o oVar = this.T;
        if (oVar != null) {
            oVar.m(tVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.l
    public final void l(j jVar) {
        jVar.b(this, this.y);
        if (d()) {
            u(jVar);
        } else {
            this.D.add(jVar);
        }
    }

    @Override // androidx.appcompat.view.menu.l
    public final void n(View view) {
        if (this.K != view) {
            this.K = view;
            this.J = Gravity.getAbsoluteGravity(this.I, view.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.l
    public final void o(boolean z) {
        this.R = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        f fVar;
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                fVar = null;
                break;
            }
            fVar = (f) arrayList.get(i);
            if (!fVar.a.S.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (fVar != null) {
            fVar.b.c(false);
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
        if (this.I != i) {
            this.I = i;
            this.J = Gravity.getAbsoluteGravity(i, this.K.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.l
    public final void q(int i) {
        this.N = true;
        this.P = i;
    }

    @Override // androidx.appcompat.view.menu.l
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.V = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.l
    public final void s(boolean z) {
        this.S = z;
    }

    @Override // androidx.appcompat.view.menu.l
    public final void t(int i) {
        this.O = true;
        this.Q = i;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:104:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:105:0x0204  */
    /* JADX WARN: Code duplicated, block: B:115:0x0123 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0117  */
    /* JADX WARN: Code duplicated, block: B:61:0x011f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0135  */
    /* JADX WARN: Code duplicated, block: B:69:0x0163  */
    /* JADX WARN: Code duplicated, block: B:71:0x0171  */
    /* JADX WARN: Code duplicated, block: B:72:0x0174  */
    /* JADX WARN: Code duplicated, block: B:73:0x0176  */
    /* JADX WARN: Code duplicated, block: B:76:0x017e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0181  */
    /* JADX WARN: Code duplicated, block: B:79:0x0183  */
    /* JADX WARN: Code duplicated, block: B:82:0x018d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0192  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:89:0x01cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d4 A[PHI: r5
  0x01d4: PHI (r5v17 int) = (r5v9 int), (r5v18 int) binds: [B:93:0x01d6, B:91:0x01d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x01d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ec  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void u(j jVar) {
        boolean z;
        char c;
        f fVar;
        View childAt;
        Rect rect;
        Rect rect2;
        int i;
        z zVar;
        q1 q1Var;
        int[] iArr;
        Rect rect3;
        int i2;
        boolean z2;
        int[] iArr2;
        int[] iArr3;
        int i3;
        int i4;
        int width;
        Method method;
        MenuItem item;
        h hVar;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.y;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        h hVar2 = new h(jVar, layoutInflaterFrom, this.B, R.layout.abc_cascading_menu_item_layout);
        if (!d() && this.R) {
            hVar2.c = true;
        } else if (d()) {
            int size = jVar.f.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    z = false;
                    break;
                }
                MenuItem item2 = jVar.getItem(i5);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z = true;
                    break;
                }
                i5++;
            }
            hVar2.c = z;
        }
        int iM = l.m(hVar2, context, this.z);
        r1 r1Var = new r1(context, this.A);
        r1Var.V = this.H;
        r1Var.J = this;
        r1Var.S.setOnDismissListener(this);
        r1Var.I = this.K;
        r1Var.G = this.J;
        r1Var.R = true;
        r1Var.S.setFocusable(true);
        r1Var.S.setInputMethodMode(2);
        r1Var.a(hVar2);
        Drawable background = r1Var.S.getBackground();
        if (background != null) {
            Rect rect4 = r1Var.P;
            background.getPadding(rect4);
            r1Var.A = rect4.left + rect4.right + iM;
        } else {
            r1Var.A = iM;
        }
        r1Var.G = this.J;
        ArrayList arrayList = this.E;
        if (arrayList.size() > 0) {
            fVar = (f) androidx.privacysandbox.ads.adservices.java.internal.a.j(1, arrayList);
            j jVar2 = fVar.b;
            int size2 = jVar2.f.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size2) {
                    item = null;
                    break;
                }
                item = jVar2.getItem(i6);
                if (item.hasSubMenu() && jVar == item.getSubMenu()) {
                    break;
                } else {
                    i6++;
                }
            }
            if (item == null) {
                childAt = null;
                c = 0;
            } else {
                q1 q1Var2 = fVar.a.z;
                ListAdapter adapter = q1Var2.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    hVar = (h) headerViewListAdapter.getWrappedAdapter();
                } else {
                    hVar = (h) adapter;
                    headersCount = 0;
                }
                int count = hVar.getCount();
                int i7 = 0;
                while (true) {
                    c = 0;
                    if (i7 >= count) {
                        i7 = -1;
                        break;
                    } else if (item == hVar.getItem(i7)) {
                        break;
                    } else {
                        i7++;
                    }
                }
                if (i7 != -1 && (firstVisiblePosition = (i7 + headersCount) - q1Var2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < q1Var2.getChildCount()) {
                    childAt = q1Var2.getChildAt(firstVisiblePosition);
                }
            }
            if (childAt != null) {
                i = Build.VERSION.SDK_INT;
                zVar = r1Var.S;
                if (i <= 28) {
                    method = r1.W;
                    if (method != null) {
                        try {
                            Object[] objArr = new Object[1];
                            objArr[c] = Boolean.FALSE;
                            method.invoke(zVar, objArr);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    p1.a(zVar, c);
                }
                o1.a(r1Var.S, null);
                q1Var = ((f) arrayList.get(arrayList.size() - 1)).a.z;
                iArr = new int[2];
                q1Var.getLocationOnScreen(iArr);
                rect3 = new Rect();
                this.L.getWindowVisibleDisplayFrame(rect3);
                if (this.M == 1) {
                    if (q1Var.getWidth() + iArr[0] + iM > rect3.right) {
                        i2 = 0;
                    } else {
                        i2 = 1;
                    }
                } else if (iArr[0] - iM < 0) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                if (i2 == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.M = i2;
                if (Build.VERSION.SDK_INT >= 26) {
                    r1Var.I = childAt;
                    i4 = 0;
                    i3 = 0;
                } else {
                    iArr2 = new int[2];
                    this.K.getLocationOnScreen(iArr2);
                    iArr3 = new int[2];
                    childAt.getLocationOnScreen(iArr3);
                    if ((this.J & 7) == 5) {
                        iArr2[0] = this.K.getWidth() + iArr2[0];
                        iArr3[0] = childAt.getWidth() + iArr3[0];
                    }
                    int i8 = iArr3[0] - iArr2[0];
                    i3 = iArr3[1] - iArr2[1];
                    i4 = i8;
                }
                if ((this.J & 5) == 5) {
                    if (z2) {
                        width = i4 + iM;
                    } else {
                        iM = childAt.getWidth();
                        width = i4 - iM;
                    }
                } else if (z2) {
                    width = i4 + childAt.getWidth();
                } else {
                    width = i4 - iM;
                }
                r1Var.B = width;
                r1Var.F = true;
                r1Var.E = true;
                r1Var.C = i3;
                r1Var.D = true;
            } else {
                if (this.N) {
                    r1Var.B = this.P;
                }
                if (this.O) {
                    r1Var.C = this.Q;
                    r1Var.D = true;
                }
                rect = this.e;
                if (rect != null) {
                    rect2 = new Rect(rect);
                } else {
                    rect2 = null;
                }
                r1Var.Q = rect2;
            }
            arrayList.add(new f(r1Var, jVar, this.M));
            r1Var.f();
            q1 q1Var3 = r1Var.z;
            q1Var3.setOnKeyListener(this);
            if (fVar == null || !this.S || jVar.l == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) q1Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(jVar.l);
            q1Var3.addHeaderView(frameLayout, null, false);
            r1Var.f();
            return;
        }
        c = 0;
        fVar = null;
        childAt = null;
        if (childAt != null) {
            i = Build.VERSION.SDK_INT;
            zVar = r1Var.S;
            if (i <= 28) {
                method = r1.W;
                if (method != null) {
                    Object[] objArr2 = new Object[1];
                    objArr2[c] = Boolean.FALSE;
                    method.invoke(zVar, objArr2);
                }
            } else {
                p1.a(zVar, c);
            }
            o1.a(r1Var.S, null);
            q1Var = ((f) arrayList.get(arrayList.size() - 1)).a.z;
            iArr = new int[2];
            q1Var.getLocationOnScreen(iArr);
            rect3 = new Rect();
            this.L.getWindowVisibleDisplayFrame(rect3);
            if (this.M == 1) {
                if (q1Var.getWidth() + iArr[0] + iM > rect3.right) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
            } else if (iArr[0] - iM < 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (i2 == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.M = i2;
            if (Build.VERSION.SDK_INT >= 26) {
                r1Var.I = childAt;
                i4 = 0;
                i3 = 0;
            } else {
                iArr2 = new int[2];
                this.K.getLocationOnScreen(iArr2);
                iArr3 = new int[2];
                childAt.getLocationOnScreen(iArr3);
                if ((this.J & 7) == 5) {
                    iArr2[0] = this.K.getWidth() + iArr2[0];
                    iArr3[0] = childAt.getWidth() + iArr3[0];
                }
                int i9 = iArr3[0] - iArr2[0];
                i3 = iArr3[1] - iArr2[1];
                i4 = i9;
            }
            if ((this.J & 5) == 5) {
                if (z2) {
                    width = i4 + iM;
                } else {
                    iM = childAt.getWidth();
                    width = i4 - iM;
                }
            } else if (z2) {
                width = i4 + childAt.getWidth();
            } else {
                width = i4 - iM;
            }
            r1Var.B = width;
            r1Var.F = true;
            r1Var.E = true;
            r1Var.C = i3;
            r1Var.D = true;
        } else {
            if (this.N) {
                r1Var.B = this.P;
            }
            if (this.O) {
                r1Var.C = this.Q;
                r1Var.D = true;
            }
            rect = this.e;
            if (rect != null) {
                rect2 = new Rect(rect);
            } else {
                rect2 = null;
            }
            r1Var.Q = rect2;
        }
        arrayList.add(new f(r1Var, jVar, this.M));
        r1Var.f();
        q1 q1Var4 = r1Var.z;
        q1Var4.setOnKeyListener(this);
        if (fVar == null) {
        }
    }
}
