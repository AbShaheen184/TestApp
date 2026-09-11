package com.google.android.material.bottomsheet;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends com.google.firebase.b {
    public final /* synthetic */ int l;
    public final /* synthetic */ androidx.coordinatorlayout.widget.a m;

    public /* synthetic */ a(androidx.coordinatorlayout.widget.a aVar, int i) {
        this.l = i;
        this.m = aVar;
    }

    @Override // com.google.firebase.b
    public final void D(int i) {
        switch (this.l) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.m;
                    if (bottomSheetBehavior.K) {
                        bottomSheetBehavior.C(1);
                    }
                }
                break;
            default:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.m;
                    if (sideSheetBehavior.g) {
                        sideSheetBehavior.r(1);
                    }
                }
                break;
        }
    }

    @Override // com.google.firebase.b
    public final void E(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.l) {
            case 0:
                ((BottomSheetBehavior) this.m).u(i2);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.m;
                WeakReference weakReference = sideSheetBehavior.q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.a.B(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.a.f(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.b(it);
                }
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e6  */
    @Override // com.google.firebase.b
    public final void F(View view, float f, float f2) {
        int i;
        switch (this.l) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.m;
                int i2 = 6;
                if (f2 < 0.0f) {
                    if (bottomSheetBehavior.b) {
                        i2 = 3;
                    } else {
                        int top = view.getTop();
                        SystemClock.uptimeMillis();
                        if (top <= bottomSheetBehavior.E) {
                            i2 = 3;
                        }
                    }
                } else if (bottomSheetBehavior.I && bottomSheetBehavior.D(view, f2)) {
                    if (Math.abs(f) >= Math.abs(f2) || f2 <= bottomSheetBehavior.d) {
                        if (view.getTop() > (bottomSheetBehavior.x() + bottomSheetBehavior.V) / 2) {
                            i2 = 5;
                        } else if (bottomSheetBehavior.b || Math.abs(view.getTop() - bottomSheetBehavior.x()) < Math.abs(view.getTop() - bottomSheetBehavior.E)) {
                            i2 = 3;
                        }
                    } else {
                        i2 = 5;
                    }
                } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                    int top2 = view.getTop();
                    if (!bottomSheetBehavior.b) {
                        int i3 = bottomSheetBehavior.E;
                        if (top2 < i3) {
                            if (top2 < Math.abs(top2 - bottomSheetBehavior.G)) {
                                i2 = 3;
                            }
                        } else if (Math.abs(top2 - i3) >= Math.abs(top2 - bottomSheetBehavior.G)) {
                            i2 = 4;
                        }
                    } else if (Math.abs(top2 - bottomSheetBehavior.D) < Math.abs(top2 - bottomSheetBehavior.G)) {
                        i2 = 3;
                    } else {
                        i2 = 4;
                    }
                } else if (bottomSheetBehavior.b) {
                    i2 = 4;
                } else {
                    int top3 = view.getTop();
                    if (Math.abs(top3 - bottomSheetBehavior.E) >= Math.abs(top3 - bottomSheetBehavior.G)) {
                        i2 = 4;
                    }
                }
                bottomSheetBehavior.E(view, i2, true);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.m;
                if (!sideSheetBehavior.a.t(f)) {
                    if (!sideSheetBehavior.a.y(view, f)) {
                        if (f == 0.0f || Math.abs(f) <= Math.abs(f2)) {
                            int left = view.getLeft();
                            i = Math.abs(left - sideSheetBehavior.a.i()) < Math.abs(left - sideSheetBehavior.a.j()) ? 3 : 5;
                        }
                    } else if (sideSheetBehavior.a.w(f, f2) || sideSheetBehavior.a.v(view)) {
                    }
                }
                sideSheetBehavior.t(view, i, true);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0048  */
    @Override // com.google.firebase.b
    public final boolean J(View view, int i) {
        WeakReference weakReference;
        WeakReference weakReference2;
        switch (this.l) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.m;
                int i2 = bottomSheetBehavior.N;
                if (i2 != 1 && !bottomSheetBehavior.c0) {
                    if (i2 == 3 && bottomSheetBehavior.a0 == i) {
                        WeakReference weakReference3 = bottomSheetBehavior.X;
                        View view2 = weakReference3 != null ? (View) weakReference3.get() : null;
                        if (view2 == null || !view2.canScrollVertically(-1)) {
                            SystemClock.uptimeMillis();
                            weakReference = bottomSheetBehavior.W;
                            if (weakReference == null) {
                            }
                        }
                    } else {
                        SystemClock.uptimeMillis();
                        weakReference = bottomSheetBehavior.W;
                        if (weakReference == null && weakReference.get() == view) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.m;
                return (sideSheetBehavior.h == 1 || (weakReference2 = sideSheetBehavior.p) == null || weakReference2.get() != view) ? false : true;
        }
    }

    @Override // com.google.firebase.b
    public final int i(View view, int i) {
        switch (this.l) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.m;
                return android.support.v4.media.session.b.f(i, sideSheetBehavior.a.l(), sideSheetBehavior.a.k());
        }
    }

    @Override // com.google.firebase.b
    public final int j(View view, int i) {
        switch (this.l) {
            case 0:
                return android.support.v4.media.session.b.f(i, ((BottomSheetBehavior) this.m).x(), w());
            default:
                return view.getTop();
        }
    }

    @Override // com.google.firebase.b
    public int v(View view) {
        switch (this.l) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.m;
                return sideSheetBehavior.l + sideSheetBehavior.o;
            default:
                return super.v(view);
        }
    }

    @Override // com.google.firebase.b
    public int w() {
        switch (this.l) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.m;
                return bottomSheetBehavior.I ? bottomSheetBehavior.V : bottomSheetBehavior.G;
            default:
                return super.w();
        }
    }
}
