package androidx.core.view;

import android.os.Build;
import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 {
    public e1 a;

    public f1(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new d1(b1.b(i, interpolator, j));
        } else {
            this.a = new a1(i, interpolator, j);
        }
    }
}
