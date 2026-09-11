package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m1 implements androidx.appcompat.view.menu.r {
    public static final Method T;
    public static final Method U;
    public int B;
    public int C;
    public boolean D;
    public boolean E;
    public boolean F;
    public j1 H;
    public View I;
    public androidx.appcompat.view.menu.l J;
    public final Handler O;
    public Rect Q;
    public boolean R;
    public final z S;
    public final Context e;
    public ListAdapter y;
    public q1 z;
    public int A = -2;
    public int G = 0;
    public final i1 K = new i1(this, 1);
    public final l1 L = new l1(this);
    public final k1 M = new k1(this);
    public final i1 N = new i1(this, 0);
    public final Rect P = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                T = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                U = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public m1(Context context, int i) {
        int resourceId;
        this.e = context;
        this.O = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, androidx.appcompat.a.l, i, 0);
        this.B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.C = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.D = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        z zVar = new z(context, null, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(null, androidx.appcompat.a.p, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            zVar.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        zVar.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : coil3.network.g.p(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.S = zVar;
        zVar.setInputMethodMode(1);
    }

    public final void a(ListAdapter listAdapter) {
        j1 j1Var = this.H;
        if (j1Var == null) {
            this.H = new j1(this);
        } else {
            ListAdapter listAdapter2 = this.y;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(j1Var);
            }
        }
        this.y = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.H);
        }
        q1 q1Var = this.z;
        if (q1Var != null) {
            q1Var.setAdapter(this.y);
        }
    }

    @Override // androidx.appcompat.view.menu.r
    public final boolean d() {
        return this.S.isShowing();
    }

    @Override // androidx.appcompat.view.menu.r
    public final void dismiss() {
        z zVar = this.S;
        zVar.dismiss();
        zVar.setContentView(null);
        this.z = null;
        this.O.removeCallbacks(this.K);
    }

    @Override // androidx.appcompat.view.menu.r
    public final void f() {
        int i;
        int iMakeMeasureSpec;
        q1 q1Var;
        q1 q1Var2 = this.z;
        Context context = this.e;
        z zVar = this.S;
        if (q1Var2 == null) {
            q1 q1Var3 = new q1(context, !this.R);
            q1Var3.setHoverListener((r1) this);
            this.z = q1Var3;
            q1Var3.setAdapter(this.y);
            this.z.setOnItemClickListener(this.J);
            this.z.setFocusable(true);
            this.z.setFocusableInTouchMode(true);
            this.z.setOnItemSelectedListener(new f1(this));
            this.z.setOnScrollListener(this.M);
            zVar.setContentView(this.z);
        }
        Drawable background = zVar.getBackground();
        Rect rect = this.P;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.D) {
                this.C = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iA = g1.a(zVar, this.I, this.C, zVar.getInputMethodMode() == 2);
        int i3 = this.A;
        if (i3 != -2) {
            iMakeMeasureSpec = i3 != -1 ? View.MeasureSpec.makeMeasureSpec(i3, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
        }
        int iA2 = this.z.a(iMakeMeasureSpec, iA);
        int paddingBottom = iA2 + (iA2 > 0 ? this.z.getPaddingBottom() + this.z.getPaddingTop() + i : 0);
        zVar.getInputMethodMode();
        zVar.setWindowLayoutType(1002);
        if (zVar.isShowing()) {
            if (this.I.isAttachedToWindow()) {
                int width = this.A;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.I.getWidth();
                }
                zVar.setOutsideTouchable(true);
                zVar.update(this.I, this.B, this.C, width < 0 ? -1 : width, paddingBottom < 0 ? -1 : paddingBottom);
                return;
            }
            return;
        }
        int width2 = this.A;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.I.getWidth();
        }
        zVar.setWidth(width2);
        zVar.setHeight(paddingBottom);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = T;
            if (method != null) {
                try {
                    method.invoke(zVar, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            h1.b(zVar, true);
        }
        zVar.setOutsideTouchable(true);
        zVar.setTouchInterceptor(this.L);
        if (this.F) {
            zVar.setOverlapAnchor(this.E);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = U;
            if (method2 != null) {
                try {
                    method2.invoke(zVar, this.Q);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            h1.a(zVar, this.Q);
        }
        zVar.showAsDropDown(this.I, this.B, this.C, this.G);
        this.z.setSelection(-1);
        if ((!this.R || this.z.isInTouchMode()) && (q1Var = this.z) != null) {
            q1Var.setListSelectionHidden(true);
            q1Var.requestLayout();
        }
        if (this.R) {
            return;
        }
        this.O.post(this.N);
    }

    @Override // androidx.appcompat.view.menu.r
    public final ListView i() {
        return this.z;
    }
}
