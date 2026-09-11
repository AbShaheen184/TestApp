package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class o1 extends w1 {
    public static boolean n = false;
    public static Method o;
    public static Class p;
    public static Field q;
    public static Field r;
    public final WindowInsets c;
    public androidx.core.graphics.c[] d;
    public androidx.core.graphics.c e;
    public z1 f;
    public androidx.core.graphics.c g;
    public int h;
    public j i;
    public int j;
    public int k;
    public Rect[][] l;
    public Rect[][] m;

    public o1(z1 z1Var, WindowInsets windowInsets) {
        super(z1Var);
        this.e = null;
        this.l = new Rect[10][];
        this.m = new Rect[10][];
        this.c = windowInsets;
    }

    private j D(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.a.a.t()) {
            return j.a(point.x, point.y, true, 0, 0, 0, 0);
        }
        v vVarF = androidx.compose.ui.contentcapture.b.f(display, 0);
        v vVarF2 = androidx.compose.ui.contentcapture.b.f(display, 1);
        v vVarF3 = androidx.compose.ui.contentcapture.b.f(display, 2);
        v vVarF4 = androidx.compose.ui.contentcapture.b.f(display, 3);
        return j.a(point.x, point.y, false, vVarF != null ? vVarF.b : 0, vVarF2 != null ? vVarF2.b : 0, vVarF3 != null ? vVarF3.b : 0, vVarF4 != null ? vVarF4.b : 0);
    }

    private static List<Rect> E(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[okhttp3.internal.platform.android.g.x(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    private Rect[] F(androidx.core.graphics.c cVar) {
        ArrayList arrayList = new ArrayList();
        int i = cVar.a;
        int i2 = cVar.d;
        int i3 = cVar.c;
        int i4 = cVar.b;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, cVar.a, this.j));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.k, i4));
        }
        if (i3 != 0) {
            int i5 = this.k;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.j));
        }
        if (i2 != 0) {
            int i6 = this.j;
            arrayList.add(new Rect(0, i6 - i2, this.k, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    @SuppressLint({"WrongConstant"})
    private androidx.core.graphics.c G(int i, boolean z) {
        androidx.core.graphics.c cVarA = androidx.core.graphics.c.e;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                cVarA = androidx.core.graphics.c.a(cVarA, H(i2, z));
            }
        }
        return cVarA;
    }

    private androidx.core.graphics.c I() {
        z1 z1Var = this.f;
        return z1Var != null ? z1Var.a.l() : androidx.core.graphics.c.e;
    }

    private androidx.core.graphics.c J(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            com.google.gson.b.r("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            return null;
        }
        if (!n) {
            L();
        }
        Method method = o;
        if (method != null && p != null && q != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) q.get(r.get(objInvoke));
                if (rect != null) {
                    return androidx.core.graphics.c.b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static void L() {
        try {
            o = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            p = cls;
            q = cls.getDeclaredField("mVisibleInsets");
            r = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            q.setAccessible(true);
            r.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        n = true;
    }

    public static boolean M(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    @Override // androidx.core.view.w1
    public void A(int i) {
        this.h = i;
    }

    @Override // androidx.core.view.w1
    public void B(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.l = (Rect[][]) rectArr.clone();
    }

    @Override // androidx.core.view.w1
    public void C(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.m = (Rect[][]) rectArr.clone();
    }

    public androidx.core.graphics.c H(int i, boolean z) {
        androidx.core.graphics.c cVarL;
        int i2;
        androidx.core.graphics.c cVar = androidx.core.graphics.c.e;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    androidx.core.graphics.c[] cVarArr = this.d;
                    cVarL = cVarArr != null ? cVarArr[okhttp3.internal.platform.android.g.x(8)] : null;
                    if (cVarL != null) {
                        return cVarL;
                    }
                    androidx.core.graphics.c cVarN = n();
                    androidx.core.graphics.c cVarI = I();
                    int i3 = cVarN.d;
                    if (i3 > cVarI.d) {
                        return androidx.core.graphics.c.b(0, 0, 0, i3);
                    }
                    androidx.core.graphics.c cVar2 = this.g;
                    if (cVar2 != null && !cVar2.equals(cVar) && (i2 = this.g.d) > cVarI.d) {
                        return androidx.core.graphics.c.b(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return m();
                    }
                    if (i == 32) {
                        return k();
                    }
                    if (i == 64) {
                        return o();
                    }
                    if (i == 128) {
                        z1 z1Var = this.f;
                        h hVarH = z1Var != null ? z1Var.a.h() : h();
                        if (hVarH != null) {
                            int i4 = Build.VERSION.SDK_INT;
                            return androidx.core.graphics.c.b(i4 >= 28 ? androidx.compose.foundation.text.selection.s0.i(hVarH.a) : 0, i4 >= 28 ? androidx.compose.foundation.text.selection.s0.k(hVarH.a) : 0, i4 >= 28 ? androidx.compose.foundation.text.selection.s0.j(hVarH.a) : 0, i4 >= 28 ? androidx.compose.foundation.text.selection.s0.h(hVarH.a) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    androidx.core.graphics.c cVarI2 = I();
                    androidx.core.graphics.c cVarL2 = l();
                    return androidx.core.graphics.c.b(Math.max(cVarI2.a, cVarL2.a), 0, Math.max(cVarI2.c, cVarL2.c), Math.max(cVarI2.d, cVarL2.d));
                }
                if ((this.h & 2) == 0) {
                    androidx.core.graphics.c cVarN2 = n();
                    z1 z1Var2 = this.f;
                    cVarL = z1Var2 != null ? z1Var2.a.l() : null;
                    int iMin = cVarN2.d;
                    if (cVarL != null) {
                        iMin = Math.min(iMin, cVarL.d);
                    }
                    return androidx.core.graphics.c.b(cVarN2.a, 0, cVarN2.c, iMin);
                }
            }
        } else {
            if (z) {
                return androidx.core.graphics.c.b(0, Math.max(I().b, n().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return androidx.core.graphics.c.b(0, n().b, 0, 0);
            }
        }
        return cVar;
    }

    public boolean K(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !H(i, false).equals(androidx.core.graphics.c.e);
    }

    @Override // androidx.core.view.w1
    public void d(View view) {
        this.k = view.getWidth();
        this.j = view.getHeight();
        androidx.core.graphics.c cVarJ = J(view);
        if (cVarJ == null) {
            cVarJ = androidx.core.graphics.c.e;
        }
        x(cVarJ);
    }

    @Override // androidx.core.view.w1
    public void e(z1 z1Var) {
        z1Var.a.y(this.f);
        androidx.core.graphics.c cVar = this.g;
        w1 w1Var = z1Var.a;
        w1Var.x(cVar);
        w1Var.A(this.h);
        w1Var.v(this.i);
        w1Var.B(this.l);
        w1Var.C(this.m);
    }

    @Override // androidx.core.view.w1
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return Objects.equals(this.g, o1Var.g) && M(this.h, o1Var.h);
    }

    @Override // androidx.core.view.w1
    public List<Rect> f(int i) {
        return E(this.l, i);
    }

    @Override // androidx.core.view.w1
    public List<Rect> g(int i) {
        return E(this.m, i);
    }

    @Override // androidx.core.view.w1
    public androidx.core.graphics.c i(int i) {
        return G(i, false);
    }

    @Override // androidx.core.view.w1
    public androidx.core.graphics.c j(int i) {
        return G(i, true);
    }

    @Override // androidx.core.view.w1
    public final androidx.core.graphics.c n() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = androidx.core.graphics.c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // androidx.core.view.w1
    public void p(View view) {
        this.i = D(view);
    }

    @Override // androidx.core.view.w1
    @SuppressLint({"WrongConstant"})
    public void q() {
        for (int i = 1; i <= 512; i <<= 1) {
            int iX = okhttp3.internal.platform.android.g.x(i);
            this.l[iX] = F(i(i));
            if (i != 8) {
                this.m[iX] = F(j(i));
            }
        }
    }

    @Override // androidx.core.view.w1
    public z1 r(int i, int i2, int i3, int i4) {
        n1 h1Var;
        z1 z1VarD = z1.d(null, this.c);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 36) {
            h1Var = new m1(z1VarD);
        } else if (i5 >= 35) {
            h1Var = new l1(z1VarD);
        } else if (i5 >= 34) {
            h1Var = new k1(z1VarD);
        } else if (i5 >= 31) {
            h1Var = new j1(z1VarD);
        } else if (i5 >= 30) {
            h1Var = new i1(z1VarD);
        } else {
            h1Var = i5 >= 29 ? new h1(z1VarD) : new g1(z1VarD);
        }
        h1Var.h(z1.b(n(), i, i2, i3, i4));
        h1Var.f(z1.b(l(), i, i2, i3, i4));
        return h1Var.b();
    }

    @Override // androidx.core.view.w1
    public boolean t() {
        return this.c.isRound();
    }

    @Override // androidx.core.view.w1
    @SuppressLint({"WrongConstant"})
    public boolean u(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !K(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.core.view.w1
    public void v(j jVar) {
        this.i = jVar;
    }

    @Override // androidx.core.view.w1
    public void w(androidx.core.graphics.c[] cVarArr) {
        this.d = cVarArr;
    }

    @Override // androidx.core.view.w1
    public void x(androidx.core.graphics.c cVar) {
        this.g = cVar;
    }

    @Override // androidx.core.view.w1
    public void y(z1 z1Var) {
        this.f = z1Var;
    }

    public o1(z1 z1Var, o1 o1Var) {
        this(z1Var, new WindowInsets(o1Var.c));
    }
}
