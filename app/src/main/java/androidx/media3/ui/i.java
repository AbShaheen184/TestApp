package androidx.media3.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int height;
        int height2;
        switch (this.a) {
            case 0:
                v vVar = (v) this.b;
                int i9 = vVar.P;
                PopupWindow popupWindow = vVar.O;
                int i10 = i4 - i2;
                int i11 = i8 - i6;
                if ((i3 - i != i7 - i5 || i10 != i11) && popupWindow.isShowing()) {
                    vVar.u();
                    popupWindow.update(view, (vVar.getWidth() - popupWindow.getWidth()) - i9, (-popupWindow.getHeight()) - i9, -1, -1);
                }
                break;
            case 1:
                a0 a0Var = (a0) this.b;
                v vVar2 = a0Var.a;
                int width = (vVar2.getWidth() - vVar2.getPaddingLeft()) - vVar2.getPaddingRight();
                int height3 = (vVar2.getHeight() - vVar2.getPaddingBottom()) - vVar2.getPaddingTop();
                ViewGroup viewGroup = a0Var.d;
                int iC = a0.c(viewGroup) - (viewGroup != null ? viewGroup.getPaddingRight() + viewGroup.getPaddingLeft() : 0);
                if (viewGroup == null) {
                    height = 0;
                } else {
                    height = viewGroup.getHeight();
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    }
                }
                int paddingBottom = height - (viewGroup != null ? viewGroup.getPaddingBottom() + viewGroup.getPaddingTop() : 0);
                int iMax = Math.max(iC, a0.c(a0Var.l) + a0.c(a0Var.j));
                ViewGroup viewGroup2 = a0Var.e;
                if (viewGroup2 == null) {
                    height2 = 0;
                } else {
                    height2 = viewGroup2.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        height2 += marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                    }
                }
                boolean z = width <= iMax || height3 <= (height2 * 2) + paddingBottom;
                if (a0Var.B != z) {
                    a0Var.B = z;
                    view.post(new w(a0Var, 1));
                }
                boolean z2 = i3 - i != i7 - i5;
                if (!a0Var.B && z2) {
                    view.post(new w(a0Var, 2));
                    break;
                }
                break;
            default:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) this.b;
                if (i3 - i != i7 - i5 || i4 - i2 != i8 - i6) {
                    view.post(new com.google.android.datatransport.runtime.scheduling.jobscheduling.k(carouselLayoutManager, 2));
                }
                break;
        }
    }
}
