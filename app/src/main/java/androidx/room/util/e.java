package androidx.room.util;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Comparable {
    public final String A;
    public final int e;
    public final int y;
    public final String z;

    public e(String str, int i, String str2, int i2) {
        str.getClass();
        str2.getClass();
        this.e = i;
        this.y = i2;
        this.z = str;
        this.A = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        e eVar = (e) obj;
        eVar.getClass();
        int i = this.e - eVar.e;
        return i == 0 ? this.y - eVar.y : i;
    }
}
