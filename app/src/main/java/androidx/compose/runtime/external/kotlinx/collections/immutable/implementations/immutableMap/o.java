package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.collection.v;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends n {
    public final /* synthetic */ int A;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.A) {
            case 0:
                int i = this.z;
                this.z = i + 2;
                Object[] objArr = this.e;
                return new v(1, objArr[i], objArr[i + 1]);
            case 1:
                int i2 = this.z;
                this.z = i2 + 2;
                return this.e[i2];
            default:
                int i3 = this.z;
                this.z = i3 + 2;
                return this.e[i3 + 1];
        }
    }
}
