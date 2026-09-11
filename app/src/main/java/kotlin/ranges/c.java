package kotlin.ranges;

import kotlin.collections.z;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends z {
    public int A;
    public final int e;
    public final int y;
    public boolean z;

    public c(int i, int i2, int i3) {
        this.e = i3;
        this.y = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.z = z;
        this.A = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.z;
    }

    @Override // kotlin.collections.z
    public final int nextInt() {
        int i = this.A;
        if (i != this.y) {
            this.A = this.e + i;
            return i;
        }
        if (this.z) {
            this.z = false;
            return i;
        }
        org.mozilla.javascript.typedarrays.c.a();
        return 0;
    }
}
