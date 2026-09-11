package androidx.compose.foundation;

import android.widget.Magnifier;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class t1 implements r1 {
    public final Magnifier a;

    public t1(Magnifier magnifier) {
        this.a = magnifier;
    }

    @Override // androidx.compose.foundation.r1
    public void a(long j, long j2) {
        this.a.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public final void b() {
        this.a.dismiss();
    }

    public final long c() {
        return (((long) this.a.getHeight()) & 4294967295L) | (((long) this.a.getWidth()) << 32);
    }

    public final void d() {
        this.a.update();
    }
}
