package androidx.compose.ui.platform;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s1 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ t1 e;

    public s1(t1 t1Var) {
        this.e = t1Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        t1 t1Var = this.e;
        p pVar = (p) t1Var.d;
        if (!t1Var.b) {
            int i = t1Var.c;
            if (i == 1) {
                if (Math.abs(f) > Math.abs(f2)) {
                    ((androidx.compose.ui.focus.p) pVar.z.getFocusOwner()).g(f > 0.0f ? 1 : 2, false);
                    return true;
                }
            } else if (i == 2 && Math.abs(f2) > Math.abs(f)) {
                ((androidx.compose.ui.focus.p) pVar.z.getFocusOwner()).g(f2 > 0.0f ? 1 : 2, false);
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
