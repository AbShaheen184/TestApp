package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends b {
    public final /* synthetic */ int a;
    public final SideSheetBehavior b;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i) {
        this.a = i;
        this.b = sideSheetBehavior;
    }

    @Override // com.google.android.material.sidesheet.b
    public final void B(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        switch (this.a) {
            case 0:
                if (i <= this.b.m) {
                    marginLayoutParams.leftMargin = i2;
                }
                break;
            default:
                int i3 = this.b.m;
                if (i <= i3) {
                    marginLayoutParams.rightMargin = i3 - i;
                }
                break;
        }
    }

    @Override // com.google.android.material.sidesheet.b
    public final int e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.a) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // com.google.android.material.sidesheet.b
    public final float f(int i) {
        switch (this.a) {
            case 0:
                float fJ = j();
                return (i - fJ) / (i() - fJ);
            default:
                float f = this.b.m;
                return (f - i) / (f - i());
        }
    }

    @Override // com.google.android.material.sidesheet.b
    public final int i() {
        switch (this.a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.b;
                return Math.max(0, sideSheetBehavior.n + sideSheetBehavior.o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.b;
                return Math.max(0, (sideSheetBehavior2.m - sideSheetBehavior2.l) - sideSheetBehavior2.o);
        }
    }

    @Override // com.google.android.material.sidesheet.b
    public final int j() {
        switch (this.a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.b;
                return (-sideSheetBehavior.l) - sideSheetBehavior.o;
            default:
                return this.b.m;
        }
    }

    @Override // com.google.android.material.sidesheet.b
    public final int k() {
        switch (this.a) {
            case 0:
                return this.b.o;
            default:
                return this.b.m;
        }
    }

    @Override // com.google.android.material.sidesheet.b
    public final int l() {
        switch (this.a) {
            case 0:
                return -this.b.l;
            default:
                return i();
        }
    }

    @Override // com.google.android.material.sidesheet.b
    public final int n(View view) {
        switch (this.a) {
            case 0:
                return view.getRight() + this.b.o;
            default:
                return view.getLeft() - this.b.o;
        }
    }

    @Override // com.google.android.material.sidesheet.b
    public final int o(CoordinatorLayout coordinatorLayout) {
        switch (this.a) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // com.google.android.material.sidesheet.b
    public final int r() {
        switch (this.a) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // com.google.android.material.sidesheet.b
    public final boolean t(float f) {
        switch (this.a) {
            case 0:
                return f > 0.0f;
            default:
                return f < 0.0f;
        }
    }

    @Override // com.google.android.material.sidesheet.b
    public final boolean v(View view) {
        switch (this.a) {
            case 0:
                return view.getRight() < (i() - j()) / 2;
            default:
                return view.getLeft() > (i() + this.b.m) / 2;
        }
    }

    @Override // com.google.android.material.sidesheet.b
    public final boolean w(float f, float f2) {
        switch (this.a) {
            case 0:
                return Math.abs(f) > Math.abs(f2) && Math.abs(f) > ((float) 500);
            default:
                return Math.abs(f) > Math.abs(f2) && Math.abs(f) > ((float) 500);
        }
    }

    @Override // com.google.android.material.sidesheet.b
    public final boolean y(View view, float f) {
        switch (this.a) {
            case 0:
                return Math.abs((f * this.b.k) + ((float) view.getLeft())) > 0.5f;
            default:
                return Math.abs((f * this.b.k) + ((float) view.getRight())) > 0.5f;
        }
    }
}
