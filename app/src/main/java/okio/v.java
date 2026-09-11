package okio;

import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends kotlin.collections.e implements RandomAccess {
    public final i[] e;
    public final int[] y;

    public v(i[] iVarArr, int[] iArr) {
        this.e = iVarArr;
        this.y = iArr;
    }

    @Override // kotlin.collections.a
    public final int b() {
        return this.e.length;
    }

    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof i) {
            return super.contains((i) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.e[i];
    }

    @Override // kotlin.collections.e, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof i) {
            return super.indexOf((i) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.e, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof i) {
            return super.lastIndexOf((i) obj);
        }
        return -1;
    }
}
