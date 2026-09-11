package androidx.appcompat.view.menu;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.a1;
import androidx.appcompat.widget.c1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final View A;
    public c1 B;
    public c1 C;
    public boolean D;
    public int E;
    public final int[] F;
    public final /* synthetic */ int G;
    public final /* synthetic */ View H;
    public final float e;
    public final int y;
    public final int z;

    public a(View view) {
        this.F = new int[2];
        this.A = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.y = tapTimeout;
        this.z = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        c1 c1Var = this.C;
        View view = this.A;
        if (c1Var != null) {
            view.removeCallbacks(c1Var);
        }
        c1 c1Var2 = this.B;
        if (c1Var2 != null) {
            view.removeCallbacks(c1Var2);
        }
    }

    public final l b() {
        androidx.appcompat.widget.g gVar;
        switch (this.G) {
            case 0:
                b bVar = ((ActionMenuItemView) this.H).J;
                if (bVar == null || (gVar = ((androidx.appcompat.widget.h) bVar).a.P) == null) {
                    return null;
                }
                return gVar.a();
            default:
                androidx.appcompat.widget.g gVar2 = ((androidx.appcompat.widget.i) this.H).A.O;
                if (gVar2 == null) {
                    return null;
                }
                return gVar2.a();
        }
    }

    public final boolean c() {
        l lVarB;
        switch (this.G) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.H;
                i iVar = actionMenuItemView.H;
                return iVar != null && iVar.a(actionMenuItemView.E) && (lVarB = b()) != null && lVarB.d();
            default:
                ((androidx.appcompat.widget.i) this.H).A.i();
                return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    /* JADX WARN: Code duplicated, block: B:35:0x0086  */
    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ef  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        androidx.appcompat.widget.j jVar;
        boolean z2;
        l lVarB;
        a1 a1Var;
        boolean z3 = this.D;
        View view2 = this.A;
        if (z3) {
            l lVarB2 = b();
            if (lVarB2 == null || !lVarB2.d() || (a1Var = (a1) lVarB2.i()) == null || !a1Var.isShown()) {
                switch (this.G) {
                    case 1:
                        jVar = ((androidx.appcompat.widget.i) this.H).A;
                        if (jVar.Q != null) {
                            jVar.f();
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        break;
                    default:
                        lVarB = b();
                        if (lVarB != null && lVarB.d()) {
                            lVarB.dismiss();
                        }
                        z2 = true;
                        break;
                }
                if (z2) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.F;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                a1Var.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zB = a1Var.b(motionEventObtainNoHistory, this.E);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z4 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zB && z4) {
                    z = true;
                } else {
                    switch (this.G) {
                        case 1:
                            jVar = ((androidx.appcompat.widget.i) this.H).A;
                            if (jVar.Q != null) {
                                jVar.f();
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            break;
                        default:
                            lVarB = b();
                            if (lVarB != null) {
                                lVarB.dismiss();
                            }
                            z2 = true;
                            break;
                    }
                    if (z2) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.E = motionEvent.getPointerId(0);
                    if (this.B == null) {
                        this.B = new c1(this, 0);
                    }
                    view2.postDelayed(this.B, this.y);
                    if (this.C == null) {
                        this.C = new c1(this, 1);
                    }
                    view2.postDelayed(this.C, this.z);
                } else if (actionMasked2 == 1) {
                    a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.E);
                    if (iFindPointerIndex >= 0) {
                        float x = motionEvent.getX(iFindPointerIndex);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float f = this.e;
                        float f2 = -f;
                        if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
                            a();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            z = c();
                        }
                    }
                } else if (actionMasked2 == 3) {
                    a();
                }
            }
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.D = z;
        return z || z3;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.D = false;
        this.E = -1;
        c1 c1Var = this.B;
        if (c1Var != null) {
            this.A.removeCallbacks(c1Var);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(ActionMenuItemView actionMenuItemView) {
        this((View) actionMenuItemView);
        this.G = 0;
        this.H = actionMenuItemView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(androidx.appcompat.widget.i iVar, androidx.appcompat.widget.i iVar2) {
        this(iVar2);
        this.G = 1;
        this.H = iVar;
    }
}
