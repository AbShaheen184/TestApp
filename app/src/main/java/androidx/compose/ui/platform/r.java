package androidx.compose.ui.platform;

import android.os.SystemClock;
import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.m implements kotlin.jvm.functions.a {
    public final /* synthetic */ int y;
    public final /* synthetic */ u z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(u uVar, int i) {
        super(0);
        this.y = i;
        this.z = uVar;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        int actionMasked;
        switch (this.y) {
            case 0:
                u uVar = this.z;
                MotionEvent motionEvent = uVar.R0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    uVar.S0 = SystemClock.uptimeMillis();
                    uVar.post(uVar.X0);
                }
                return kotlin.y.a;
            default:
                return this.z.get_viewTreeOwners();
        }
    }
}
