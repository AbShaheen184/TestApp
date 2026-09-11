package androidx.compose.ui.platform;

import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements p2 {
    public final ViewConfiguration a;

    public v0(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // androidx.compose.ui.platform.p2
    public final long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // androidx.compose.ui.platform.p2
    public final long b() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // androidx.compose.ui.platform.p2
    public final float c() {
        if (Build.VERSION.SDK_INT >= 34) {
            return w0.b(this.a);
        }
        return 2.0f;
    }

    @Override // androidx.compose.ui.platform.p2
    public final float e() {
        return this.a.getScaledMaximumFlingVelocity();
    }

    @Override // androidx.compose.ui.platform.p2
    public final float f() {
        return this.a.getScaledTouchSlop();
    }

    @Override // androidx.compose.ui.platform.p2
    public final float g() {
        if (Build.VERSION.SDK_INT >= 34) {
            return w0.a(this.a);
        }
        return 16.0f;
    }
}
