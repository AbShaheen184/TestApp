package androidx.media3.ui;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.app.mlounge.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ a0 y;

    public /* synthetic */ w(a0 a0Var, int i) {
        this.e = i;
        this.y = a0Var;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00be A[LOOP:3: B:37:0x00b8->B:39:0x00be, LOOP_END] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                this.y.k();
                break;
            case 1:
                a0 a0Var = this.y;
                View view = a0Var.k;
                ViewGroup viewGroup = a0Var.f;
                if (viewGroup != null) {
                    viewGroup.setVisibility(a0Var.B ? 0 : 4);
                }
                if (view != null) {
                    int dimensionPixelSize = a0Var.a.getResources().getDimensionPixelSize(R.dimen.exo_styled_progress_margin_bottom);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    if (marginLayoutParams != null) {
                        if (a0Var.B) {
                            dimensionPixelSize = 0;
                        }
                        marginLayoutParams.bottomMargin = dimensionPixelSize;
                        view.setLayoutParams(marginLayoutParams);
                    }
                    if (view instanceof g) {
                        g gVar = (g) view;
                        Rect rect = gVar.e;
                        ValueAnimator valueAnimator = gVar.e0;
                        if (a0Var.B) {
                            if (valueAnimator.isStarted()) {
                                valueAnimator.cancel();
                            }
                            gVar.g0 = true;
                            gVar.f0 = 0.0f;
                            gVar.invalidate(rect);
                        } else {
                            int i = a0Var.A;
                            if (i == 1) {
                                if (valueAnimator.isStarted()) {
                                    valueAnimator.cancel();
                                }
                                gVar.g0 = false;
                                gVar.f0 = 0.0f;
                                gVar.invalidate(rect);
                            } else if (i != 3) {
                                if (valueAnimator.isStarted()) {
                                    valueAnimator.cancel();
                                }
                                gVar.g0 = false;
                                gVar.f0 = 1.0f;
                                gVar.invalidate(rect);
                            }
                        }
                    }
                }
                for (View view2 : a0Var.z) {
                    view2.setVisibility((a0Var.B && a0.j(view2)) ? 4 : 0);
                }
                break;
            case 2:
                a0 a0Var2 = this.y;
                ValueAnimator valueAnimator2 = a0Var2.s;
                View view3 = a0Var2.l;
                v vVar = a0Var2.a;
                ViewGroup viewGroup2 = a0Var2.h;
                ViewGroup viewGroup3 = a0Var2.g;
                if (viewGroup3 != null && viewGroup2 != null) {
                    int width = (vVar.getWidth() - vVar.getPaddingLeft()) - vVar.getPaddingRight();
                    while (true) {
                        if (viewGroup2.getChildCount() <= 1) {
                            if (view3 != null) {
                                view3.setVisibility(8);
                            }
                            int iC = a0.c(a0Var2.j);
                            int childCount = viewGroup3.getChildCount() - 1;
                            for (int i2 = 0; i2 < childCount; i2++) {
                                iC += a0.c(viewGroup3.getChildAt(i2));
                            }
                            if (iC > width) {
                                if (view3 != null) {
                                    view3.setVisibility(0);
                                    iC += a0.c(view3);
                                }
                                ArrayList arrayList = new ArrayList();
                                for (int i3 = 0; i3 < childCount; i3++) {
                                    View childAt = viewGroup3.getChildAt(i3);
                                    iC -= a0.c(childAt);
                                    arrayList.add(childAt);
                                    if (iC <= width) {
                                        if (!arrayList.isEmpty()) {
                                            viewGroup3.removeViews(0, arrayList.size());
                                            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                                                viewGroup2.addView((View) arrayList.get(i4), viewGroup2.getChildCount() - 1);
                                            }
                                        }
                                    }
                                    break;
                                }
                                if (!arrayList.isEmpty()) {
                                    viewGroup3.removeViews(0, arrayList.size());
                                    while (i4 < arrayList.size()) {
                                        viewGroup2.addView((View) arrayList.get(i4), viewGroup2.getChildCount() - 1);
                                    }
                                }
                                break;
                            } else {
                                ViewGroup viewGroup4 = a0Var2.i;
                                if (viewGroup4 != null && viewGroup4.getVisibility() == 0 && !valueAnimator2.isStarted()) {
                                    a0Var2.r.cancel();
                                    valueAnimator2.start();
                                    break;
                                }
                            }
                        } else {
                            int childCount2 = viewGroup2.getChildCount() - 2;
                            View childAt2 = viewGroup2.getChildAt(childCount2);
                            viewGroup2.removeViewAt(childCount2);
                            viewGroup3.addView(childAt2, 0);
                        }
                    }
                }
                break;
            case 3:
                this.y.o.start();
                break;
            case 4:
                this.y.n.start();
                break;
            case 5:
                a0 a0Var3 = this.y;
                a0Var3.m.start();
                a0Var3.e(2000L, a0Var3.v);
                break;
            default:
                this.y.i(2);
                break;
        }
    }
}
