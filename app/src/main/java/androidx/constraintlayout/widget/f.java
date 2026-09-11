package androidx.constraintlayout.widget;

import android.view.View;
import android.view.ViewGroup;
import com.app.mlounge.emulator.LibretroCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final /* synthetic */ ConstraintLayout h;

    public f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.a = constraintLayout2;
    }

    public static boolean a(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    public final void b(androidx.constraintlayout.core.widgets.d dVar, androidx.constraintlayout.core.widgets.analyzer.b bVar) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iMax;
        boolean z;
        int measuredWidth;
        int baseline;
        int i;
        if (dVar == null) {
            return;
        }
        androidx.constraintlayout.core.widgets.c cVar = dVar.J;
        androidx.constraintlayout.core.widgets.c cVar2 = dVar.H;
        if (dVar.f0 == 8) {
            bVar.e = 0;
            bVar.f = 0;
            bVar.g = 0;
            return;
        }
        if (dVar.S == null) {
            return;
        }
        int i2 = bVar.a;
        int i3 = bVar.b;
        int i4 = bVar.c;
        int i5 = bVar.d;
        int i6 = this.b + this.c;
        int i7 = this.d;
        View view = dVar.e0;
        int iE = androidx.constraintlayout.core.g.e(i2);
        if (iE == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        } else if (iE == 1) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i7, -2);
        } else if (iE == 2) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i7, -2);
            boolean z2 = dVar.q == 1;
            int i8 = bVar.j;
            if (i8 == 1 || i8 == 2) {
                boolean z3 = view.getMeasuredHeight() == dVar.k();
                if (bVar.j == 2 || !z2 || ((z2 && z3) || dVar.x())) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dVar.n(), 1073741824);
                }
            }
        } else if (iE != 3) {
            iMakeMeasureSpec = 0;
        } else {
            int i9 = this.f;
            int i10 = cVar2 != null ? cVar2.g : 0;
            if (cVar != null) {
                i10 += cVar.g;
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i9, i7 + i10, -1);
        }
        int iE2 = androidx.constraintlayout.core.g.e(i3);
        if (iE2 == 0) {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        } else if (iE2 == 1) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i6, -2);
        } else if (iE2 == 2) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i6, -2);
            boolean z4 = dVar.r == 1;
            int i11 = bVar.j;
            if (i11 == 1 || i11 == 2) {
                boolean z5 = view.getMeasuredWidth() == dVar.n();
                if (bVar.j == 2 || !z4 || ((z4 && z5) || dVar.y())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(dVar.k(), 1073741824);
                }
            }
        } else if (iE2 != 3) {
            iMakeMeasureSpec2 = 0;
        } else {
            int i12 = this.g;
            int i13 = cVar2 != null ? dVar.I.g : 0;
            if (cVar != null) {
                i13 += dVar.K.g;
            }
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, i6 + i13, -1);
        }
        androidx.constraintlayout.core.widgets.e eVar = (androidx.constraintlayout.core.widgets.e) dVar.S;
        ConstraintLayout constraintLayout = this.h;
        if (eVar != null && androidx.constraintlayout.core.widgets.j.c(constraintLayout.F, LibretroCore.SCREEN_WIDTH) && view.getMeasuredWidth() == dVar.n() && view.getMeasuredWidth() < eVar.n() && view.getMeasuredHeight() == dVar.k() && view.getMeasuredHeight() < eVar.k() && view.getBaseline() == dVar.Z && !dVar.w() && a(dVar.F, iMakeMeasureSpec, dVar.n()) && a(dVar.G, iMakeMeasureSpec2, dVar.k())) {
            bVar.e = dVar.n();
            bVar.f = dVar.k();
            bVar.g = dVar.Z;
            return;
        }
        boolean z6 = i2 == 3;
        boolean z7 = i3 == 3;
        boolean z8 = i3 == 4 || i3 == 1;
        boolean z9 = i2 == 4 || i2 == 1;
        boolean z10 = z6 && dVar.V > 0.0f;
        boolean z11 = z7 && dVar.V > 0.0f;
        if (view == null) {
            return;
        }
        e eVar2 = (e) view.getLayoutParams();
        int i14 = bVar.j;
        if (i14 != 1 && i14 != 2 && z6 && dVar.q == 0 && z7 && dVar.r == 0) {
            z = false;
            measuredWidth = 0;
            baseline = 0;
            i = -1;
            iMax = 0;
        } else {
            if ((view instanceof t) && (dVar instanceof androidx.constraintlayout.core.widgets.g)) {
                ((t) view).j((androidx.constraintlayout.core.widgets.g) dVar, iMakeMeasureSpec, iMakeMeasureSpec2);
            } else {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            dVar.F = iMakeMeasureSpec;
            dVar.G = iMakeMeasureSpec2;
            dVar.g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i15 = dVar.t;
            int iMax2 = i15 > 0 ? Math.max(i15, measuredWidth2) : measuredWidth2;
            int i16 = dVar.u;
            if (i16 > 0) {
                iMax2 = Math.min(i16, iMax2);
            }
            int i17 = dVar.w;
            iMax = i17 > 0 ? Math.max(i17, measuredHeight) : measuredHeight;
            int i18 = iMakeMeasureSpec2;
            int i19 = dVar.x;
            if (i19 > 0) {
                iMax = Math.min(i19, iMax);
            }
            if (!androidx.constraintlayout.core.widgets.j.c(constraintLayout.F, 1)) {
                if (z10 && z8) {
                    iMax2 = (int) ((iMax * dVar.V) + 0.5f);
                } else if (z11 && z9) {
                    iMax = (int) ((iMax2 / dVar.V) + 0.5f);
                }
            }
            if (measuredWidth2 == iMax2 && measuredHeight == iMax) {
                baseline = baseline2;
                measuredWidth = iMax2;
                z = false;
            } else {
                if (measuredWidth2 != iMax2) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                }
                int iMakeMeasureSpec3 = measuredHeight != iMax ? View.MeasureSpec.makeMeasureSpec(iMax, 1073741824) : i18;
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                dVar.F = iMakeMeasureSpec;
                dVar.G = iMakeMeasureSpec3;
                z = false;
                dVar.g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMax = measuredHeight2;
            }
            i = -1;
        }
        boolean z12 = baseline != i ? true : z;
        bVar.i = (measuredWidth == bVar.c && iMax == bVar.d) ? z : true;
        boolean z13 = eVar2.b0 ? true : z12;
        if (z13 && baseline != -1 && dVar.Z != baseline) {
            bVar.i = true;
        }
        bVar.e = measuredWidth;
        bVar.f = iMax;
        bVar.h = z13;
        bVar.g = baseline;
    }
}
