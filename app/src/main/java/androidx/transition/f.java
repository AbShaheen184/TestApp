package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.crashlytics.internal.model.t1;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends m {
    public static final String[] X = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final b Y = new b("topLeft", PointF.class, 0);
    public static final b Z = new b("bottomRight", PointF.class, 1);
    public static final b a0 = new b("bottomRight", PointF.class, 2);
    public static final b b0 = new b("topLeft", PointF.class, 3);
    public static final b c0 = new b("position", PointF.class, 4);

    public static void J(t tVar) {
        View view = tVar.b;
        HashMap map = tVar.a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    @Override // androidx.transition.m
    public final void c(t tVar) {
        J(tVar);
    }

    @Override // androidx.transition.m
    public final void f(t tVar) {
        J(tVar);
    }

    @Override // androidx.transition.m
    public final Animator j(ViewGroup viewGroup, t tVar, t tVar2) {
        int i;
        f fVar;
        Animator animatorOfObject;
        if (tVar != null) {
            HashMap map = tVar.a;
            if (tVar2 != null) {
                HashMap map2 = tVar2.a;
                ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = tVar2.b;
                    Rect rect = (Rect) map.get("android:changeBounds:bounds");
                    Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
                    int i2 = rect.left;
                    int i3 = rect2.left;
                    int i4 = rect.top;
                    int i5 = rect2.top;
                    int i6 = rect.right;
                    int i7 = rect2.right;
                    int i8 = rect.bottom;
                    int i9 = rect2.bottom;
                    int i10 = i6 - i2;
                    int i11 = i8 - i4;
                    int i12 = i7 - i3;
                    int i13 = i9 - i5;
                    Rect rect3 = (Rect) map.get("android:changeBounds:clip");
                    Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
                    if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
                        i = 0;
                    } else {
                        i = (i2 == i3 && i4 == i5) ? 0 : 1;
                        if (i6 != i7 || i8 != i9) {
                            i++;
                        }
                    }
                    if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                        i++;
                    }
                    int i14 = i;
                    if (i14 > 0) {
                        u.a(view, i2, i4, i6, i8);
                        if (i14 != 2) {
                            fVar = this;
                            if (i2 == i3 && i4 == i5) {
                                fVar.S.getClass();
                                animatorOfObject = ObjectAnimator.ofObject(view, a0, (TypeConverter) null, com.google.android.gms.common.internal.k.u(i6, i8, i7, i9));
                            } else {
                                fVar.S.getClass();
                                animatorOfObject = ObjectAnimator.ofObject(view, b0, (TypeConverter) null, com.google.android.gms.common.internal.k.u(i2, i4, i3, i5));
                            }
                        } else if (i10 == i12 && i11 == i13) {
                            fVar = this;
                            fVar.S.getClass();
                            animatorOfObject = ObjectAnimator.ofObject(view, c0, (TypeConverter) null, com.google.android.gms.common.internal.k.u(i2, i4, i3, i5));
                        } else {
                            fVar = this;
                            e eVar = new e(view);
                            fVar.S.getClass();
                            ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(eVar, Y, (TypeConverter) null, com.google.android.gms.common.internal.k.u(i2, i4, i3, i5));
                            fVar.S.getClass();
                            ObjectAnimator objectAnimatorOfObject2 = ObjectAnimator.ofObject(eVar, Z, (TypeConverter) null, com.google.android.gms.common.internal.k.u(i6, i8, i7, i9));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(objectAnimatorOfObject, objectAnimatorOfObject2);
                            animatorSet.addListener(new c(eVar));
                            animatorOfObject = animatorSet;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            t1.D(viewGroup4, true);
                            fVar.n().a(new d(viewGroup4));
                        }
                        return animatorOfObject;
                    }
                }
            }
        }
        return null;
    }

    @Override // androidx.transition.m
    public final String[] p() {
        return X;
    }
}
