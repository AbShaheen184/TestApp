package androidx.media3.container;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends f {
    public final ArrayList A;
    public final ArrayList B;
    public final long z;

    public d(int i, long j) {
        super(i, 0);
        this.z = j;
        this.A = new ArrayList();
        this.B = new ArrayList();
    }

    public final d o(int i) {
        ArrayList arrayList = this.B;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = (d) arrayList.get(i2);
            if (dVar.y == i) {
                return dVar;
            }
        }
        return null;
    }

    public final e p(int i) {
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            e eVar = (e) arrayList.get(i2);
            if (eVar.y == i) {
                return eVar;
            }
        }
        return null;
    }

    @Override // androidx.media3.container.f
    public final String toString() {
        return f.d(this.y) + " leaves: " + Arrays.toString(this.A.toArray()) + " containers: " + Arrays.toString(this.B.toArray());
    }
}
