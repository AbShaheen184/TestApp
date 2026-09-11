package androidx.transition;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.exoplayer.i1;
import com.app.mlounge.R;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends m {
    public static final String[] Y = {"android:visibility:visibility", "android:visibility:parent"};
    public final int X;

    public h() {
        this.X = 3;
    }

    public static void J(t tVar) {
        View view = tVar.b;
        int visibility = view.getVisibility();
        HashMap map = tVar.a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    public static float L(t tVar, float f) {
        Float f2;
        return (tVar == null || (f2 = (Float) tVar.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    public static i1 M(t tVar, t tVar2) {
        i1 i1Var = new i1();
        i1Var.a = false;
        i1Var.b = false;
        if (tVar != null) {
            HashMap map = tVar.a;
            if (map.containsKey("android:visibility:visibility")) {
                i1Var.c = ((Integer) map.get("android:visibility:visibility")).intValue();
                i1Var.e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                i1Var.c = -1;
                i1Var.e = null;
            }
        } else {
            i1Var.c = -1;
            i1Var.e = null;
        }
        if (tVar2 != null) {
            HashMap map2 = tVar2.a;
            if (map2.containsKey("android:visibility:visibility")) {
                i1Var.d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                i1Var.f = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                i1Var.d = -1;
                i1Var.f = null;
            }
        } else {
            i1Var.d = -1;
            i1Var.f = null;
        }
        if (tVar != null && tVar2 != null) {
            int i = i1Var.c;
            int i2 = i1Var.d;
            if (i != i2 || ((ViewGroup) i1Var.e) != ((ViewGroup) i1Var.f)) {
                if (i != i2) {
                    if (i == 0) {
                        i1Var.b = false;
                        i1Var.a = true;
                        return i1Var;
                    }
                    if (i2 == 0) {
                        i1Var.b = true;
                        i1Var.a = true;
                        return i1Var;
                    }
                } else {
                    if (((ViewGroup) i1Var.f) == null) {
                        i1Var.b = false;
                        i1Var.a = true;
                        return i1Var;
                    }
                    if (((ViewGroup) i1Var.e) == null) {
                        i1Var.b = true;
                        i1Var.a = true;
                        return i1Var;
                    }
                }
            }
        } else {
            if (tVar == null && i1Var.d == 0) {
                i1Var.b = true;
                i1Var.a = true;
                return i1Var;
            }
            if (tVar2 == null && i1Var.c == 0) {
                i1Var.b = false;
                i1Var.a = true;
            }
        }
        return i1Var;
    }

    public final ObjectAnimator K(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        u.a.I(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, u.b, f2);
        g gVar = new g(view);
        objectAnimatorOfFloat.addListener(gVar);
        n().a(gVar);
        return objectAnimatorOfFloat;
    }

    @Override // androidx.transition.m
    public final void c(t tVar) {
        J(tVar);
    }

    @Override // androidx.transition.m
    public final void f(t tVar) {
        J(tVar);
        View view = tVar.b;
        Float fValueOf = (Float) view.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(u.a.y(view)) : Float.valueOf(0.0f);
        }
        tVar.a.put("android:fade:transitionAlpha", fValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:58:0x0135  */
    /* JADX WARN: Code duplicated, block: B:61:0x013e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0142 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0144  */
    /* JADX WARN: Code duplicated, block: B:65:0x014c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0162  */
    /* JADX WARN: Code duplicated, block: B:69:0x017e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:83:0x020f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0216  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (M(m(r3, false), q(r3, false)).a != false) goto L9;
     */
    @Override // androidx.transition.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator j(android.view.ViewGroup r25, androidx.transition.t r26, androidx.transition.t r27) {
        /*
            Method dump skipped, instruction units count: 726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.h.j(android.view.ViewGroup, androidx.transition.t, androidx.transition.t):android.animation.Animator");
    }

    @Override // androidx.transition.m
    public final String[] p() {
        return Y;
    }

    @Override // androidx.transition.m
    public final boolean r(t tVar, t tVar2) {
        if (tVar == null && tVar2 == null) {
            return false;
        }
        if (tVar != null && tVar2 != null && tVar2.a.containsKey("android:visibility:visibility") != tVar.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        i1 i1VarM = M(tVar, tVar2);
        if (i1VarM.a) {
            return i1VarM.c == 0 || i1VarM.d == 0;
        }
        return false;
    }

    public h(int i) {
        this();
        this.X = i;
    }
}
