package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.w0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public final androidx.media3.common.r A;
    public final int e;
    public final w0 y;
    public final int z;

    public m(int i, w0 w0Var, int i2) {
        this.e = i;
        this.y = w0Var;
        this.z = i2;
        this.A = w0Var.d[i2];
    }

    public abstract int a();

    public abstract boolean d(m mVar);
}
