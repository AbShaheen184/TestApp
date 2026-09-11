package androidx.recyclerview.widget;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.lang.reflect.Field;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements Runnable {
    public Interpolator A;
    public boolean B;
    public boolean C;
    public final /* synthetic */ RecyclerView D;
    public int e;
    public int y;
    public OverScroller z;

    public o0(RecyclerView recyclerView) {
        this.D = recyclerView;
        androidx.customview.widget.c cVar = RecyclerView.Y0;
        this.A = cVar;
        this.B = false;
        this.C = false;
        this.z = new OverScroller(recyclerView.getContext(), cVar);
    }

    public final void a(int i, int i2) {
        RecyclerView recyclerView = this.D;
        recyclerView.setScrollState(2);
        this.y = 0;
        this.e = 0;
        Interpolator interpolator = this.A;
        androidx.customview.widget.c cVar = RecyclerView.Y0;
        if (interpolator != cVar) {
            this.A = cVar;
            this.z = new OverScroller(recyclerView.getContext(), cVar);
        }
        this.z.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.B) {
            this.C = true;
            return;
        }
        RecyclerView recyclerView = this.D;
        recyclerView.removeCallbacks(this);
        Field field = androidx.core.view.s0.a;
        recyclerView.postOnAnimation(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        RecyclerView recyclerView = this.D;
        int[] iArr = recyclerView.M0;
        if (recyclerView.J == null) {
            recyclerView.removeCallbacks(this);
            this.z.abortAnimation();
            return;
        }
        this.C = false;
        this.B = true;
        recyclerView.k();
        OverScroller overScroller = this.z;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i6 = currX - this.e;
            int i7 = currY - this.y;
            this.e = currX;
            this.y = currY;
            int iJ = RecyclerView.j(i6, recyclerView.f0, recyclerView.h0, recyclerView.getWidth());
            int iJ2 = RecyclerView.j(i7, recyclerView.g0, recyclerView.i0, recyclerView.getHeight());
            int[] iArr2 = recyclerView.M0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.p(iJ, iJ2, 1, iArr2, null)) {
                iJ -= iArr[0];
                iJ2 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.i(iJ, iJ2);
            }
            if (recyclerView.I != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.W(iArr, iJ, iJ2);
                int i8 = iArr[0];
                int i9 = iArr[1];
                recyclerView.J.getClass();
                i = iJ - i8;
                i3 = i8;
                i2 = iJ2 - i9;
                i4 = i9;
            } else {
                i = iJ;
                i2 = iJ2;
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.L.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.M0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.q(i3, i4, i, i2, null, 1, iArr3);
            int i10 = i - iArr[0];
            int i11 = i2 - iArr[1];
            if (i3 != 0 || i4 != 0) {
                recyclerView.r(i3, i4);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i10 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i11 != 0));
            recyclerView.J.getClass();
            if (z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i10 < 0) {
                        i5 = -currVelocity;
                    } else {
                        i5 = i10 > 0 ? currVelocity : 0;
                    }
                    if (i11 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i11 <= 0) {
                        currVelocity = 0;
                    }
                    if (i5 < 0) {
                        recyclerView.t();
                        if (recyclerView.f0.isFinished()) {
                            recyclerView.f0.onAbsorb(-i5);
                        }
                    } else if (i5 > 0) {
                        recyclerView.u();
                        if (recyclerView.h0.isFinished()) {
                            recyclerView.h0.onAbsorb(i5);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.v();
                        if (recyclerView.g0.isFinished()) {
                            recyclerView.g0.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.s();
                        if (recyclerView.i0.isFinished()) {
                            recyclerView.i0.onAbsorb(currVelocity);
                        }
                    }
                    if (i5 != 0 || currVelocity != 0) {
                        Field field = androidx.core.view.s0.a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.W0) {
                    androidx.media3.common.util.e eVar = recyclerView.z0;
                    int[] iArr4 = eVar.c;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    eVar.d = 0;
                }
            } else {
                b();
                n nVar = recyclerView.y0;
                if (nVar != null) {
                    nVar.a(recyclerView, i3, i4);
                }
            }
        }
        recyclerView.J.getClass();
        this.B = false;
        if (!this.C) {
            recyclerView.setScrollState(0);
            recyclerView.b0(1);
        } else {
            recyclerView.removeCallbacks(this);
            Field field2 = androidx.core.view.s0.a;
            recyclerView.postOnAnimation(this);
        }
    }
}
