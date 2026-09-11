package androidx.dynamicanimation.animation;

import android.view.View;
import com.google.android.material.shape.y;
import com.google.firebase.crashlytics.internal.model.t1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends t1 {
    public final /* synthetic */ int o;

    public /* synthetic */ d(int i) {
        this.o = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.firebase.crashlytics.internal.model.t1
    public final void C(y yVar, float f) {
        switch (this.o) {
            case 0:
                ((View) yVar).setAlpha(f);
                break;
            case 1:
                ((View) yVar).setScaleX(f);
                break;
            case 2:
                ((View) yVar).setScaleY(f);
                break;
            case 3:
                ((View) yVar).setRotation(f);
                break;
            case 4:
                ((View) yVar).setRotationX(f);
                break;
            default:
                ((View) yVar).setRotationY(f);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.firebase.crashlytics.internal.model.t1
    public final float u(y yVar) {
        switch (this.o) {
            case 0:
                return ((View) yVar).getAlpha();
            case 1:
                return ((View) yVar).getScaleX();
            case 2:
                return ((View) yVar).getScaleY();
            case 3:
                return ((View) yVar).getRotation();
            case 4:
                return ((View) yVar).getRotationX();
            default:
                return ((View) yVar).getRotationY();
        }
    }
}
