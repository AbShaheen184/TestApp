package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.w0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    public final w0 a;
    public final int[] b;

    public p(int i, w0 w0Var, int[] iArr) {
        if (iArr.length == 0) {
            androidx.media3.common.util.c.g("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = w0Var;
        this.b = iArr;
    }
}
