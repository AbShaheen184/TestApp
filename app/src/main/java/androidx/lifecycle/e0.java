package androidx.lifecycle;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements v {
    public static final e0 F = new e0();
    public Handler B;
    public int e;
    public int y;
    public boolean z = true;
    public boolean A = true;
    public final x C = new x(this, true);
    public final androidx.activity.l D = new androidx.activity.l(this, 9);
    public final u0 E = new u0(this);

    public final void a() {
        int i = this.y + 1;
        this.y = i;
        if (i == 1) {
            if (this.z) {
                this.C.e(n.ON_RESUME);
                this.z = false;
            } else {
                Handler handler = this.B;
                handler.getClass();
                handler.removeCallbacks(this.D);
            }
        }
    }

    @Override // androidx.lifecycle.v
    public final p getLifecycle() {
        return this.C;
    }
}
