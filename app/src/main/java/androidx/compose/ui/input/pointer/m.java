package androidx.compose.ui.input.pointer;

import android.os.Build;
import android.view.MotionEvent;
import androidx.compose.foundation.text.selection.q0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    public final Object a;
    public final q0 b;
    public final int c;
    public final int d;
    public final int e;
    public int f;

    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    public m(List list, q0 q0Var) {
        MotionEvent motionEventA;
        this.a = list;
        this.b = q0Var;
        int i = 0;
        this.c = (Build.VERSION.SDK_INT < 29 || (motionEventA = a()) == null) ? 0 : motionEventA.getClassification();
        MotionEvent motionEventA2 = a();
        this.d = motionEventA2 != null ? motionEventA2.getButtonState() : 0;
        MotionEvent motionEventA3 = a();
        this.e = motionEventA3 != null ? motionEventA3.getMetaState() : 0;
        MotionEvent motionEventA4 = a();
        if (motionEventA4 != null) {
            int actionMasked = motionEventA4.getActionMasked();
            if (actionMasked == 0) {
                i = 1;
            } else if (actionMasked == 1) {
                i = 2;
            } else if (actionMasked != 2) {
                switch (actionMasked) {
                    case 5:
                        i = 1;
                        break;
                    case 6:
                        i = 2;
                        break;
                    case 7:
                        i = 3;
                        break;
                    case 8:
                        i = 6;
                        break;
                    case 9:
                        i = 4;
                        break;
                    case 10:
                        i = 5;
                        break;
                }
            } else {
                i = 3;
            }
        } else {
            int size = list.size();
            while (true) {
                if (i < size) {
                    v vVar = (v) list.get(i);
                    if (u.d(vVar)) {
                        i = 2;
                    } else if (u.b(vVar)) {
                        i = 1;
                    } else {
                        i++;
                    }
                } else {
                    i = 3;
                }
            }
        }
        this.f = i;
    }

    public final MotionEvent a() {
        q0 q0Var = this.b;
        if (q0Var != null) {
            return (MotionEvent) ((androidx.compose.foundation.text.input.internal.o) q0Var.A).z;
        }
        return null;
    }
}
