package androidx.compose.ui.graphics.vector;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {
    public final boolean a;
    public final boolean b;

    public c0(int i) {
        boolean z = (i & 1) == 0;
        boolean z2 = (i & 2) == 0;
        this.a = z;
        this.b = z2;
    }
}
