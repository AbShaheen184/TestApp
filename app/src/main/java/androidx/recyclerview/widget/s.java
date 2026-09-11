package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends androidx.emoji2.text.g {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(c0 c0Var, int i) {
        super(c0Var);
        this.d = i;
    }

    @Override // androidx.emoji2.text.g
    public final int g(View view) {
        int right;
        int i;
        switch (this.d) {
            case 0:
                d0 d0Var = (d0) view.getLayoutParams();
                ((c0) this.b).getClass();
                right = view.getRight() + ((d0) view.getLayoutParams()).b.right;
                i = ((ViewGroup.MarginLayoutParams) d0Var).rightMargin;
                break;
            default:
                d0 d0Var2 = (d0) view.getLayoutParams();
                ((c0) this.b).getClass();
                right = view.getBottom() + ((d0) view.getLayoutParams()).b.bottom;
                i = ((ViewGroup.MarginLayoutParams) d0Var2).bottomMargin;
                break;
        }
        return right + i;
    }

    @Override // androidx.emoji2.text.g
    public final int h(View view) {
        int iZ;
        int i;
        switch (this.d) {
            case 0:
                d0 d0Var = (d0) view.getLayoutParams();
                ((c0) this.b).getClass();
                iZ = c0.z(view) + ((ViewGroup.MarginLayoutParams) d0Var).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) d0Var).rightMargin;
                break;
            default:
                d0 d0Var2 = (d0) view.getLayoutParams();
                ((c0) this.b).getClass();
                iZ = c0.y(view) + ((ViewGroup.MarginLayoutParams) d0Var2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) d0Var2).bottomMargin;
                break;
        }
        return iZ + i;
    }

    @Override // androidx.emoji2.text.g
    public final int i(View view) {
        int iY;
        int i;
        switch (this.d) {
            case 0:
                d0 d0Var = (d0) view.getLayoutParams();
                ((c0) this.b).getClass();
                iY = c0.y(view) + ((ViewGroup.MarginLayoutParams) d0Var).topMargin;
                i = ((ViewGroup.MarginLayoutParams) d0Var).bottomMargin;
                break;
            default:
                d0 d0Var2 = (d0) view.getLayoutParams();
                ((c0) this.b).getClass();
                iY = c0.z(view) + ((ViewGroup.MarginLayoutParams) d0Var2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) d0Var2).rightMargin;
                break;
        }
        return iY + i;
    }

    @Override // androidx.emoji2.text.g
    public final int j(View view) {
        int left;
        int i;
        switch (this.d) {
            case 0:
                d0 d0Var = (d0) view.getLayoutParams();
                ((c0) this.b).getClass();
                left = view.getLeft() - ((d0) view.getLayoutParams()).b.left;
                i = ((ViewGroup.MarginLayoutParams) d0Var).leftMargin;
                break;
            default:
                d0 d0Var2 = (d0) view.getLayoutParams();
                ((c0) this.b).getClass();
                left = view.getTop() - ((d0) view.getLayoutParams()).b.top;
                i = ((ViewGroup.MarginLayoutParams) d0Var2).topMargin;
                break;
        }
        return left - i;
    }

    @Override // androidx.emoji2.text.g
    public final int k() {
        switch (this.d) {
            case 0:
                return ((c0) this.b).m;
            default:
                return ((c0) this.b).n;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int l() {
        int i;
        int iE;
        switch (this.d) {
            case 0:
                c0 c0Var = (c0) this.b;
                i = c0Var.m;
                iE = c0Var.E();
                break;
            default:
                c0 c0Var2 = (c0) this.b;
                i = c0Var2.n;
                iE = c0Var2.C();
                break;
        }
        return i - iE;
    }

    @Override // androidx.emoji2.text.g
    public final int m() {
        switch (this.d) {
            case 0:
                return ((c0) this.b).E();
            default:
                return ((c0) this.b).C();
        }
    }

    @Override // androidx.emoji2.text.g
    public final int o() {
        switch (this.d) {
            case 0:
                return ((c0) this.b).k;
            default:
                return ((c0) this.b).l;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int p() {
        switch (this.d) {
            case 0:
                return ((c0) this.b).l;
            default:
                return ((c0) this.b).k;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int q() {
        switch (this.d) {
            case 0:
                return ((c0) this.b).D();
            default:
                return ((c0) this.b).F();
        }
    }

    @Override // androidx.emoji2.text.g
    public final int r() {
        int iD;
        int iE;
        switch (this.d) {
            case 0:
                c0 c0Var = (c0) this.b;
                iD = c0Var.m - c0Var.D();
                iE = c0Var.E();
                break;
            default:
                c0 c0Var2 = (c0) this.b;
                iD = c0Var2.n - c0Var2.F();
                iE = c0Var2.C();
                break;
        }
        return iD - iE;
    }

    @Override // androidx.emoji2.text.g
    public final int s(View view) {
        switch (this.d) {
            case 0:
                c0 c0Var = (c0) this.b;
                Rect rect = (Rect) this.c;
                c0Var.J(view, rect);
                return rect.right;
            default:
                c0 c0Var2 = (c0) this.b;
                Rect rect2 = (Rect) this.c;
                c0Var2.J(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int t(View view) {
        switch (this.d) {
            case 0:
                c0 c0Var = (c0) this.b;
                Rect rect = (Rect) this.c;
                c0Var.J(view, rect);
                return rect.left;
            default:
                c0 c0Var2 = (c0) this.b;
                Rect rect2 = (Rect) this.c;
                c0Var2.J(view, rect2);
                return rect2.top;
        }
    }

    @Override // androidx.emoji2.text.g
    public final void u(int i) {
        switch (this.d) {
            case 0:
                ((c0) this.b).N(i);
                break;
            default:
                ((c0) this.b).O(i);
                break;
        }
    }
}
